// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.implementation.directconnectivity;

import com.azure.cosmos.AvailabilityStrategy;
import com.azure.cosmos.ConsistencyLevel;
import com.azure.cosmos.CosmosContainerProactiveInitConfig;
import com.azure.cosmos.CosmosEndToEndOperationLatencyPolicyConfig;
import com.azure.cosmos.CosmosException;
import com.azure.cosmos.SessionRetryOptions;
import com.azure.cosmos.ThresholdBasedAvailabilityStrategy;
import com.azure.cosmos.implementation.BackoffRetryUtility;
import com.azure.cosmos.implementation.Configs;
import com.azure.cosmos.implementation.DiagnosticsClientContext;
import com.azure.cosmos.implementation.HttpConstants;
import com.azure.cosmos.implementation.IAuthorizationTokenProvider;
import com.azure.cosmos.implementation.ISessionContainer;
import com.azure.cosmos.implementation.OperationType;
import com.azure.cosmos.implementation.Quadruple;
import com.azure.cosmos.implementation.ReplicatedResourceClientUtils;
import com.azure.cosmos.implementation.ResourceType;
import com.azure.cosmos.implementation.RxDocumentServiceRequest;
import com.azure.cosmos.implementation.Utils;
import com.azure.cosmos.implementation.faultinjection.IFaultInjectorProvider;
import com.azure.cosmos.implementation.throughputControl.ThroughputControlStore;
import com.azure.cosmos.models.CosmosContainerIdentity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.Exceptions;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * ReplicatedResourceClient uses the ConsistencyReader to make requests to
 * backend
 */
public class ReplicatedResourceClient {
    private final Logger logger = LoggerFactory.getLogger(ReplicatedResourceClient.class);
    private static final int GONE_AND_RETRY_WITH_TIMEOUT_IN_SECONDS = 30;
    private static final int STRONG_GONE_AND_RETRY_WITH_RETRY_TIMEOUT_SECONDS = 60;
    private static final int MIN_BACKOFF_FOR_FAILING_BACK_TO_OTHER_REGIONS_FOR_READ_REQUESTS_IN_SECONDS = 1;

    private final AddressSelector addressSelector;
    private final ConsistencyReader consistencyReader;
    private final ConsistencyWriter consistencyWriter;
    private final TransportClient transportClient;
    private final GatewayServiceConfigurationReader serviceConfigReader;

    public ReplicatedResourceClient(
            DiagnosticsClientContext diagnosticsClientContext,
            Configs configs,
            AddressSelector addressSelector,
            ISessionContainer sessionContainer,
            TransportClient transportClient,
            GatewayServiceConfigurationReader serviceConfigReader,
            IAuthorizationTokenProvider authorizationTokenProvider,
            boolean useMultipleWriteLocations,
            SessionRetryOptions sessionRetryOptions) {
        Protocol protocol = configs.getProtocol();
        this.addressSelector = addressSelector;
        if (protocol != Protocol.HTTPS && protocol != Protocol.TCP) {
            throw new IllegalArgumentException("protocol");
        }

        this.transportClient = transportClient;
        this.serviceConfigReader = serviceConfigReader;

        this.consistencyReader = new ConsistencyReader(diagnosticsClientContext,
            configs,
            this.addressSelector,
            sessionContainer,
            transportClient,
            serviceConfigReader,
            authorizationTokenProvider,
            sessionRetryOptions);
        this.consistencyWriter = new ConsistencyWriter(diagnosticsClientContext,
            this.addressSelector,
            sessionContainer,
            transportClient,
            authorizationTokenProvider,
            serviceConfigReader,
            useMultipleWriteLocations,
            sessionRetryOptions);
    }

    public void enableThroughputControl(ThroughputControlStore throughputControlStore) {
        this.transportClient.enableThroughputControl(throughputControlStore);
    }

    public static boolean isReadingFromMaster(ResourceType resourceType, OperationType operationType) {
        return ReplicatedResourceClientUtils.isReadingFromMaster(resourceType, operationType);
    }

    public static boolean isMasterResource(ResourceType resourceType) {
        return ReplicatedResourceClientUtils.isMasterResource(resourceType);
    }

    public static boolean isGlobalStrongEnabled() {
        return true;
    }

    public Mono<StoreResponse> invokeAsync(RxDocumentServiceRequest request,
                                           Function<RxDocumentServiceRequest, Mono<RxDocumentServiceRequest>> prepareRequestAsyncDelegate) {
        BiFunction<Quadruple<Boolean, Boolean, Duration, Integer>, RxDocumentServiceRequest, Mono<StoreResponse>> mainFuncDelegate = (
                Quadruple<Boolean, Boolean, Duration, Integer> forceRefreshAndTimeout,
                RxDocumentServiceRequest documentServiceRequest) -> {
            documentServiceRequest.getHeaders().put(HttpConstants.HttpHeaders.CLIENT_RETRY_ATTEMPT_COUNT,
                    forceRefreshAndTimeout.getValue3().toString());
            documentServiceRequest.getHeaders().put(HttpConstants.HttpHeaders.REMAINING_TIME_IN_MS_ON_CLIENT_REQUEST,
                    Long.toString(forceRefreshAndTimeout.getValue2().toMillis()));

            if (shouldSpeculate(request)){
                logger.debug("Speculating request {}", request.getOperationType());
                return getStoreResponseMonoWithSpeculation(request, forceRefreshAndTimeout);
            }

            return getStoreResponseMono(request, forceRefreshAndTimeout);
        };
        Function<Quadruple<Boolean, Boolean, Duration, Integer>, Mono<StoreResponse>> funcDelegate = (
                Quadruple<Boolean, Boolean, Duration, Integer> forceRefreshAndTimeout) -> {
            if (prepareRequestAsyncDelegate != null) {
                return prepareRequestAsyncDelegate.apply(request).flatMap(responseReq -> mainFuncDelegate.apply(forceRefreshAndTimeout, responseReq));
            } else {
                return mainFuncDelegate.apply(forceRefreshAndTimeout, request);
            }
        };

        int retryTimeout = this.serviceConfigReader.getDefaultConsistencyLevel() == ConsistencyLevel.STRONG ?
                ReplicatedResourceClient.STRONG_GONE_AND_RETRY_WITH_RETRY_TIMEOUT_SECONDS :
                ReplicatedResourceClient.GONE_AND_RETRY_WITH_TIMEOUT_IN_SECONDS;

        return BackoffRetryUtility.executeAsync(
            funcDelegate,
            new GoneAndRetryWithRetryPolicy(request, retryTimeout),
            null,
            Duration.ofSeconds(
                ReplicatedResourceClient.MIN_BACKOFF_FOR_FAILING_BACK_TO_OTHER_REGIONS_FOR_READ_REQUESTS_IN_SECONDS),
            request,
            addressSelector);
    }

    private Mono<StoreResponse> getStoreResponseMonoWithSpeculation(
        RxDocumentServiceRequest request,
        Quadruple<Boolean, Boolean, Duration, Integer> forceRefreshAndTimeout) {

        CosmosEndToEndOperationLatencyPolicyConfig config = request
            .requestContext
            .getEndToEndOperationLatencyPolicyConfig();

        AvailabilityStrategy strategy = config.getAvailabilityStrategy();

        if (!(strategy instanceof ThresholdBasedAvailabilityStrategy)) {
            // If no threshold based availability strategy is defined just return original Mono
            return getStoreResponseMono(request, forceRefreshAndTimeout);
        }

        List<Mono<StoreResponse>> monoList = new ArrayList<>();
        List<URI> requestLocationsList = new ArrayList<>();
        final List<URI> orderedEffectiveEndpointsList = getApplicableEndPoints(request);
        if (orderedEffectiveEndpointsList != null) {
            int i = 0;
            while (i < orderedEffectiveEndpointsList.size()) {
                if (orderedEffectiveEndpointsList.get(i) == null) {
                    orderedEffectiveEndpointsList.remove(i);
                } else {
                    i++;
                }
            }
        }

        if (orderedEffectiveEndpointsList == null || orderedEffectiveEndpointsList.size() == 0) {
            // If no endpoints are available just return original Mono
            return getStoreResponseMono(request, forceRefreshAndTimeout);
        }

        orderedEffectiveEndpointsList
            .forEach(locationURI -> {
                RxDocumentServiceRequest newRequest = request.clone();
                newRequest.requestContext.routeToLocation(locationURI);
                requestLocationsList.add(locationURI);
                if (monoList.isEmpty()) {
                    monoList.add(getStoreResponseMono(newRequest, forceRefreshAndTimeout));
                } else {
                    monoList
                        .add(
                            getStoreResponseMono(newRequest, forceRefreshAndTimeout)
                                .delaySubscription(((ThresholdBasedAvailabilityStrategy) strategy)
                                    .getThreshold()
                                    .plus(((ThresholdBasedAvailabilityStrategy) strategy)
                                        .getThresholdStep()
                                        .multipliedBy(monoList.size() - 1))
                                ));
                }
            });

        return Mono
            .firstWithValue(monoList)
            .onErrorMap(throwable -> {
                Throwable exception = Exceptions.unwrap(throwable);

                if (exception instanceof NoSuchElementException) {

                    List<Throwable> innerThrowables = Exceptions
                        .unwrapMultiple(exception.getCause());

                    int index = 0;
                    for (Throwable innerThrowable : innerThrowables) {
                        Throwable innerException = Exceptions.unwrap(innerThrowable);

                        // collect latest CosmosException instance bubbling up for a region
                        if (innerException instanceof CosmosException) {
                            return Utils.as(innerException, CosmosException.class);
                        } else if (innerException instanceof NoSuchElementException) {
                            logger.trace(
                                "Operation in {} completed with empty result because it was cancelled.",
                                requestLocationsList.get(index));
                        } else if (logger.isWarnEnabled()) {
                            String message = "Unexpected Non-CosmosException when processing operation in '"
                                + requestLocationsList.get(index)
                                + "'.";
                            logger.warn(
                                message,
                                innerException
                            );
                        }

                        index++;
                    }
                }

                return exception;
            });
    }

    /**
     * Returns the applicable endpoints ordered by preference list if any
     * @param request - the request context (to provide exclude regions)
     * @return the applicable endpoints ordered by preference list if any
     */
    private List<URI> getApplicableEndPoints(RxDocumentServiceRequest request) {
        if (request.isReadOnlyRequest()) {
            return this.transportClient.getGlobalEndpointManager().getApplicableReadEndpoints(request);
        } else if (request.getOperationType().isWriteOperation()) {
            return this.transportClient.getGlobalEndpointManager().getApplicableWriteEndpoints(request);
        }
        return null;
    }

    private boolean shouldSpeculate(RxDocumentServiceRequest request) {
        if (request.requestContext.getEndToEndOperationLatencyPolicyConfig() == null) {
            return false;
        }
        if (request.getResourceType() != ResourceType.Document) {
            return false;
        }

        if (request.getOperationType().isWriteOperation() && !request.getNonIdempotentWriteRetriesEnabled()) {
            return false;
        }

        CosmosEndToEndOperationLatencyPolicyConfig config = request.requestContext.getEndToEndOperationLatencyPolicyConfig();

        if (config == null || !config.isEnabled()) {
            return false;
        }

        return config.getAvailabilityStrategy() != null;
    }

    private Mono<StoreResponse> getStoreResponseMono(RxDocumentServiceRequest request, Quadruple<Boolean, Boolean, Duration, Integer> forceRefreshAndTimeout) {
        return invokeAsync(request, new TimeoutHelper(forceRefreshAndTimeout.getValue2()),
            forceRefreshAndTimeout.getValue1(), forceRefreshAndTimeout.getValue0());
    }

    public void recordOpenConnectionsAndInitCachesCompleted(List<CosmosContainerIdentity> cosmosContainerIdentities) {
        this.transportClient.recordOpenConnectionsAndInitCachesCompleted(cosmosContainerIdentities);
    }

    public void recordOpenConnectionsAndInitCachesStarted(List<CosmosContainerIdentity> cosmosContainerIdentities) {
        this.transportClient.recordOpenConnectionsAndInitCachesStarted(cosmosContainerIdentities);
    }

    private Mono<StoreResponse> invokeAsync(RxDocumentServiceRequest request, TimeoutHelper timeout,
            boolean isInRetry, boolean forceRefresh) {

        if (request.getOperationType().equals(OperationType.ExecuteJavaScript)) {
            if (request.isReadOnlyScript()) {
                return this.consistencyReader.readAsync(request, timeout, isInRetry, forceRefresh);
            } else {
                return this.consistencyWriter.writeAsync(request, timeout, forceRefresh);
            }
        } else if (request.getOperationType().isWriteOperation()) {
            return this.consistencyWriter.writeAsync(request, timeout, forceRefresh);
        } else if (request.isReadOnlyRequest()) {
            return this.consistencyReader.readAsync(request, timeout, isInRetry, forceRefresh);
        } else {
            throw new IllegalArgumentException(
                    String.format("Unexpected operation type %s", request.getOperationType()));
        }
    }

    public Flux<Void> submitOpenConnectionTasksAndInitCaches(CosmosContainerProactiveInitConfig proactiveContainerInitConfig) {
        return this.addressSelector.submitOpenConnectionTasksAndInitCaches(proactiveContainerInitConfig);
    }

    public void configureFaultInjectorProvider(IFaultInjectorProvider injectorProvider) {
        this.transportClient.configureFaultInjectorProvider(injectorProvider);
    }
}
