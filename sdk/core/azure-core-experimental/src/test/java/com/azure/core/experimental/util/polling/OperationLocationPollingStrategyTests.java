// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.experimental.util.polling;

import com.azure.core.exception.AzureException;
import com.azure.core.experimental.http.MockHttpResponse;
import com.azure.core.experimental.models.PollResult;
import com.azure.core.experimental.util.polling.implementation.TestActionResult;
import com.azure.core.experimental.util.polling.implementation.TestResource;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaderName;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpMethod;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.BinaryData;
import com.azure.core.util.polling.AsyncPollResponse;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.PollingStrategyOptions;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.core.util.serializer.TypeReference;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class OperationLocationPollingStrategyTests {

    private static final TypeReference<TestResource> RESOURCE_TYPE_REFERENCE
        = TypeReference.createInstance(TestResource.class);
    private static final TypeReference<PollResult> RESOURCE_POLL_RESULT_TYPE_REFERENCE
        = TypeReference.createInstance(PollResult.class);
    private static final TypeReference<TestActionResult> ACTION_RESULT_TYPE_REFERENCE
        = TypeReference.createInstance(TestActionResult.class);

    @Test
    public void operationLocationPollingStrategyPutSucceedsOnPoll() {
        // https://github.com/microsoft/api-guidelines/blob/vNext/azure/ConsiderationsForServiceDesign.md#put-with-additional-long-running-processing

        String putUrl = "http://localhost/resource";
        String pollUrl = "http://localhost/operation";
        int[] pollCount = new int[] {0};

        String resourceName = "resource1";
        String operationId = "operation1";

        Supplier<Mono<Response<TestResource>>> activationOperation = () -> Mono.fromCallable(() -> {
            return new SimpleResponse<>(new HttpRequest(HttpMethod.PUT, putUrl), 200,
                new HttpHeaders().set(HttpHeaderName.fromString("operation-location"), pollUrl),
                new TestResource(resourceName));
        });

        HttpRequest pollRequest = new HttpRequest(HttpMethod.GET, pollUrl);

        HttpClient httpClient = request -> {
            if (pollUrl.equals(request.getUrl().toString())) {
                boolean succeeded = ++pollCount[0] > 1;
                Map<String, String> pollResponse = new HashMap<>();
                pollResponse.put("id", operationId);
                pollResponse.put("status", succeeded ? "Succeeded" : "InProgress");
                return Mono.just(new MockHttpResponse(pollRequest, 200,
                    BinaryData.fromObject(pollResponse).toBytes(), SerializerEncoding.JSON));
            } else {
                return Mono.error(new IllegalArgumentException("Unknown request URL " + request.getUrl()));
            }
        };

        PollerFlux<PollResult, TestResource> pollerFlux = PollerFlux.create(Duration.ofMillis(1),
            activationOperation::get, new OperationLocationPollingStrategy<>(
                new PollingStrategyOptions(createPipeline(httpClient))),
            RESOURCE_POLL_RESULT_TYPE_REFERENCE, RESOURCE_TYPE_REFERENCE);

        // verify poll result
        StepVerifier.create(pollerFlux)
            .expectSubscription()
            .expectNextMatches(asyncPollResponse ->
                asyncPollResponse.getStatus() == LongRunningOperationStatus.IN_PROGRESS
                    && operationId.equals(asyncPollResponse.getValue().getOperationId()))
            .expectNextMatches(asyncPollResponse ->
                asyncPollResponse.getStatus() == LongRunningOperationStatus.SUCCESSFULLY_COMPLETED
                    && operationId.equals(asyncPollResponse.getValue().getOperationId()))
            .verifyComplete();

        pollCount[0] = 0;

        // verify final result
        StepVerifier.create(pollerFlux.takeUntil(apr -> apr.getStatus().isComplete())
                .last()
                .flatMap(AsyncPollResponse::getFinalResult))
            .expectNextMatches(resource -> resourceName.equals(resource.getName()))
            .verifyComplete();
    }

    @Test
    public void operationLocationPollingStrategyPutFailsOnPoll() {
        String putUrl = "http://localhost/resource";
        String pollUrl = "http://localhost/operation";
        int[] pollCount = new int[] {0};

        String resourceName = "resource1";
        String operationId = "operation1";

        Supplier<Mono<Response<TestResource>>> activationOperation = () -> Mono.fromCallable(() -> {
            return new SimpleResponse<>(new HttpRequest(HttpMethod.PUT, putUrl), 200,
                new HttpHeaders().set(HttpHeaderName.fromString("operation-location"), pollUrl),
                new TestResource(resourceName));
        });

        HttpRequest pollRequest = new HttpRequest(HttpMethod.GET, pollUrl);

        HttpClient httpClient = request -> {
            if (pollUrl.equals(request.getUrl().toString())) {
                boolean fails = ++pollCount[0] > 1;
                Map<String, Object> pollResponse = new HashMap<>();
                pollResponse.put("id", operationId);
                pollResponse.put("status", fails ? "Failed" : "InProgress");
                if (fails) {
                    Map<String, String> responseError = new HashMap<>();
                    responseError.put("code", "mock-error");
                    responseError.put("message", "mock error message");
                    pollResponse.put("error", responseError);
                }
                return Mono.just(new MockHttpResponse(pollRequest, 200,
                    BinaryData.fromObject(pollResponse).toBytes(), SerializerEncoding.JSON));
            } else {
                return Mono.error(new IllegalArgumentException("Unknown request URL " + request.getUrl()));
            }
        };

        PollerFlux<PollResult, TestResource> pollerFlux = PollerFlux.create(Duration.ofMillis(1),
            activationOperation::get, new OperationLocationPollingStrategy<>(
                new PollingStrategyOptions(createPipeline(httpClient))),
            RESOURCE_POLL_RESULT_TYPE_REFERENCE, RESOURCE_TYPE_REFERENCE);

        // verify poll result
        StepVerifier.create(pollerFlux)
            .expectSubscription()
            .expectNextMatches(asyncPollResponse ->
                asyncPollResponse.getStatus() == LongRunningOperationStatus.IN_PROGRESS
                    && operationId.equals(asyncPollResponse.getValue().getOperationId())
                    && asyncPollResponse.getValue().getError() == null)
            .expectNextMatches(asyncPollResponse ->
                asyncPollResponse.getStatus() == LongRunningOperationStatus.FAILED
                    && operationId.equals(asyncPollResponse.getValue().getOperationId())
                    && "mock-error".equals(asyncPollResponse.getValue().getError().getCode())
                    && "mock error message".equals(asyncPollResponse.getValue().getError().getMessage()))
            .verifyComplete();
    }

    @Test
    public void operationLocationPollingStrategyPostSucceedsOnPoll() {
        // https://github.com/microsoft/api-guidelines/blob/vNext/azure/ConsiderationsForServiceDesign.md#long-running-action-operations

        String putUrl = "http://localhost/resource";
        String pollUrl = "http://localhost/operation";
        int[] pollCount = new int[] {0};

        String actionResultName = "result1";
        String operationId = "operation1";

        Supplier<Mono<Response<PollResult>>> activationOperation = () -> Mono.fromCallable(() -> {
            Map<String, String> pollResponse = new HashMap<>();
            pollResponse.put("id", operationId);
            pollResponse.put("status", "InProgress");
            return new SimpleResponse<>(new HttpRequest(HttpMethod.POST, putUrl), 200,
                new HttpHeaders().set(HttpHeaderName.fromString("operation-location"), pollUrl),
                BinaryData.fromObject(pollResponse).toObject(PollResult.class));
        });

        HttpRequest pollRequest = new HttpRequest(HttpMethod.GET, pollUrl);

        HttpClient httpClient = request -> {
            if (pollUrl.equals(request.getUrl().toString())) {
                boolean succeeded = ++pollCount[0] > 1;
                Map<String, Object> pollResponse = new HashMap<>();
                pollResponse.put("id", operationId);
                pollResponse.put("status", succeeded ? "Succeeded" : "InProgress");
                if (succeeded) {
                    pollResponse.put("result", new TestActionResult(actionResultName));
                }
                return Mono.just(new MockHttpResponse(pollRequest, 200,
                    BinaryData.fromObject(pollResponse).toBytes(), SerializerEncoding.JSON));
            } else {
                return Mono.error(new IllegalArgumentException("Unknown request URL " + request.getUrl()));
            }
        };

        PollerFlux<PollResult, TestActionResult> pollerFlux = PollerFlux.create(Duration.ofMillis(1),
            activationOperation::get, new OperationLocationPollingStrategy<>(
                new PollingStrategyOptions(createPipeline(httpClient))),
            RESOURCE_POLL_RESULT_TYPE_REFERENCE, ACTION_RESULT_TYPE_REFERENCE);

        // verify poll result
        StepVerifier.create(pollerFlux)
            .expectSubscription()
            .expectNextMatches(asyncPollResponse ->
                asyncPollResponse.getStatus() == LongRunningOperationStatus.IN_PROGRESS
                    && operationId.equals(asyncPollResponse.getValue().getOperationId()))
            .expectNextMatches(asyncPollResponse ->
                asyncPollResponse.getStatus() == LongRunningOperationStatus.SUCCESSFULLY_COMPLETED
                    && operationId.equals(asyncPollResponse.getValue().getOperationId()))
            .verifyComplete();

        pollCount[0] = 0;

        // verify final result
        StepVerifier.create(pollerFlux.takeUntil(apr -> apr.getStatus().isComplete())
                .last()
                .flatMap(AsyncPollResponse::getFinalResult))
            .expectNextMatches(actionResult -> actionResultName.equals(actionResult.getName()))
            .verifyComplete();
    }

    @Test
    public void operationLocationPollingStrategyPostSucceedsOnPollButNoResult() {
        // this case would be bug on service
        // test in client that getFinalResult would fail with error

        String putUrl = "http://localhost/resource";
        String pollUrl = "http://localhost/operation";
        int[] pollCount = new int[] {0};

        String operationId = "operation1";

        Supplier<Mono<Response<PollResult>>> activationOperation = () -> Mono.fromCallable(() -> {
            Map<String, String> pollResponse = new HashMap<>();
            pollResponse.put("id", operationId);
            pollResponse.put("status", "InProgress");
            return new SimpleResponse<>(new HttpRequest(HttpMethod.POST, putUrl), 200,
                new HttpHeaders().set(HttpHeaderName.fromString("operation-location"), pollUrl),
                BinaryData.fromObject(pollResponse).toObject(PollResult.class));
        });

        HttpRequest pollRequest = new HttpRequest(HttpMethod.GET, pollUrl);

        HttpClient httpClient = request -> {
            if (pollUrl.equals(request.getUrl().toString())) {
                boolean succeeded = ++pollCount[0] > 1;
                Map<String, Object> pollResponse = new HashMap<>();
                pollResponse.put("id", operationId);
                pollResponse.put("status", succeeded ? "Succeeded" : "InProgress");
                return Mono.just(new MockHttpResponse(pollRequest, 200,
                    BinaryData.fromObject(pollResponse).toBytes(), SerializerEncoding.JSON));
            } else {
                return Mono.error(new IllegalArgumentException("Unknown request URL " + request.getUrl()));
            }
        };

        PollerFlux<PollResult, TestActionResult> pollerFlux = PollerFlux.create(Duration.ofMillis(1),
            activationOperation::get, new OperationLocationPollingStrategy<>(
                new PollingStrategyOptions(createPipeline(httpClient))),
            RESOURCE_POLL_RESULT_TYPE_REFERENCE, ACTION_RESULT_TYPE_REFERENCE);

        // verify poll result
        StepVerifier.create(pollerFlux)
            .expectSubscription()
            .expectNextMatches(asyncPollResponse ->
                asyncPollResponse.getStatus() == LongRunningOperationStatus.IN_PROGRESS
                    && operationId.equals(asyncPollResponse.getValue().getOperationId()))
            .expectNextMatches(asyncPollResponse ->
                asyncPollResponse.getStatus() == LongRunningOperationStatus.SUCCESSFULLY_COMPLETED
                    && operationId.equals(asyncPollResponse.getValue().getOperationId()))
            .verifyComplete();

        pollCount[0] = 0;

        // verify final result as error, as "result" is not populated
        StepVerifier.create(pollerFlux.takeUntil(apr -> apr.getStatus().isComplete())
                .last()
                .flatMap(AsyncPollResponse::getFinalResult))
            .verifyError(AzureException.class);
    }

    private static HttpPipeline createPipeline(HttpClient httpClient) {
        return new HttpPipelineBuilder().httpClient(httpClient).build();
    }
}
