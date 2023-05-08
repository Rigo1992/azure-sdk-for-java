// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.http.netty;

import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeader;
import com.azure.core.http.HttpHeaderName;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpMethod;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.ProxyOptions;
import com.azure.core.http.netty.implementation.MockProxyServer;
import com.azure.core.http.netty.implementation.NettyAsyncHttpResponse;
import com.azure.core.http.policy.FixedDelay;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.Contexts;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.ProgressReporter;
import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import com.github.tomakehurst.wiremock.http.Fault;
import io.netty.handler.proxy.ProxyConnectException;
import io.netty.resolver.DefaultAddressResolverGroup;
import io.netty.resolver.NoopAddressResolverGroup;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;
import reactor.netty.resources.ConnectionProvider;
import reactor.test.StepVerifier;
import reactor.test.StepVerifierOptions;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.binaryEqualTo;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import static com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertLinesMatch;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NettyAsyncHttpClientTests {
    private static final String SHORT_BODY_PATH = "/short";
    private static final String LONG_BODY_PATH = "/long";
    private static final String ERROR_BODY_PATH = "/error";
    private static final String SHORT_POST_BODY_PATH = "/shortPost";
    static final String HTTP_HEADERS_PATH = "/httpHeaders";
    private static final String IO_EXCEPTION_PATH = "/ioException";

    static final String NO_DOUBLE_UA_PATH = "/noDoubleUA";
    static final String EXPECTED_HEADER = "userAgent";
    static final String RETURN_HEADERS_AS_IS_PATH = "/returnHeadersAsIs";

    private static final String PROXY_TO_ADDRESS = "/proxyToAddress";

    private static final byte[] SHORT_BODY = "hi there".getBytes(StandardCharsets.UTF_8);
    private static final byte[] LONG_BODY = createLongBody();

    static final HttpHeaderName TEST_HEADER = HttpHeaderName.fromString("testHeader");

    private static final StepVerifierOptions EMPTY_INITIAL_REQUEST_OPTIONS = StepVerifierOptions.create()
        .initialRequest(0);

    private static WireMockServer server;

    @BeforeAll
    public static void beforeClass() {
        server = new WireMockServer(wireMockConfig()
            .extensions(new NettyAsyncHttpClientResponseTransformer())
            .dynamicPort()
            .disableRequestJournal()
            .gzipDisabled(true));

        server.stubFor(get(SHORT_BODY_PATH).willReturn(aResponse().withBody(SHORT_BODY)));
        server.stubFor(get(LONG_BODY_PATH).willReturn(aResponse().withBody(LONG_BODY)));
        server.stubFor(get(ERROR_BODY_PATH).willReturn(aResponse().withBody("error").withStatus(500)));
        server.stubFor(post(SHORT_POST_BODY_PATH).willReturn(aResponse().withBody(SHORT_BODY)));
        server.stubFor(post(HTTP_HEADERS_PATH).willReturn(aResponse()
            .withTransformers(NettyAsyncHttpClientResponseTransformer.NAME)));
        server.stubFor(get(NO_DOUBLE_UA_PATH).willReturn(aResponse()
            .withTransformers(NettyAsyncHttpClientResponseTransformer.NAME)));
        server.stubFor(get(IO_EXCEPTION_PATH).willReturn(aResponse().withStatus(200).but()
            .withFault(Fault.RANDOM_DATA_THEN_CLOSE)));
        server.stubFor(get(RETURN_HEADERS_AS_IS_PATH).willReturn(aResponse()
            .withTransformers(NettyAsyncHttpClientResponseTransformer.NAME)));

        server.stubFor(get(PROXY_TO_ADDRESS).willReturn(aResponse().withStatus(418).withBody("I'm a teapot")));

        server.start();
        // ResourceLeakDetector.setLevel(Level.PARANOID);
    }

    @AfterAll
    public static void afterClass() {
        if (server != null) {
            server.shutdown();
        }
    }

    @Test
    public void testFlowableResponseShortBodyAsByteArrayAsync() {
        checkBodyReceived(SHORT_BODY, SHORT_BODY_PATH);
    }

    @Test
    public void testFlowableResponseLongBodyAsByteArrayAsync() {
        checkBodyReceived(LONG_BODY, LONG_BODY_PATH);
    }

    @Test
    @Disabled
    public void testMultipleSubscriptionsEmitsError() {
        /*
         * This test is being disabled as there is a possible race condition on what is being tested.
         *
         * Reactor Netty will throw an exception when multiple subscriptions are made to the same network response at
         * the same time. An exception won't be thrown if the first subscription has already been completed and cleaned
         * up when the second subscription is made. In addition to that potential race scenario, there is additional
         * complexity added when dealing with the response in an EventLoop. When in the EventLoop the subscription isn't
         * cleaned up synchronously but instead is added as an execution for the EventLoop to trigger some time in the
         * future. Given that this test will be disabled.
         */
        HttpResponse response = getResponse(SHORT_BODY_PATH);
        // Subscription:1
        StepVerifier.create(response.getBodyAsByteArray())
            .assertNext(bytes -> assertArrayEquals(SHORT_BODY, bytes))
            .verifyComplete();
        // Subscription:2
        StepVerifier.create(response.getBodyAsByteArray())
            .expectNextCount(0)
            // Reactor netty 0.9.0.RELEASE behavior changed - second subscription returns onComplete() instead
            // of throwing an error
            // Reactor netty 0.9.7.RELEASE again changed the behavior to return an error on second subscription.
            .verifyError(IllegalStateException.class);
        // .verifyComplete();
    }

    @Test
    public void testDispose() {
        NettyAsyncHttpResponse response = getResponse(LONG_BODY_PATH);
        StepVerifier.create(response.getBody())
            .thenCancel()
            .verify();
        Assertions.assertTrue(response.internConnection().isDisposed());
    }

    @Test
    public void testCancel() {
        NettyAsyncHttpResponse response = getResponse(LONG_BODY_PATH);
        //
        StepVerifier.create(response.getBody(), EMPTY_INITIAL_REQUEST_OPTIONS)
            .expectNextCount(0)
            .thenRequest(1)
            .expectNextCount(1)
            .thenCancel()
            .verify();
        Assertions.assertTrue(response.internConnection().isDisposed());
    }

    @Test
    public void testFlowableWhenServerReturnsBodyAndNoErrorsWhenHttp500Returned() {
        HttpResponse response = getResponse(ERROR_BODY_PATH);
        StepVerifier.create(response.getBodyAsString())
            .expectNext("error")
            .expectComplete()
            .verify(Duration.ofSeconds(20));
        Assertions.assertEquals(500, response.getStatusCode());
    }

    @Test
    public void testFlowableBackpressure() {
        HttpResponse response = getResponse(LONG_BODY_PATH);
        //
        StepVerifier.create(response.getBody(), EMPTY_INITIAL_REQUEST_OPTIONS)
            .expectNextCount(0)
            .thenRequest(1)
            .expectNextCount(1)
            .thenRequest(3)
            .expectNextCount(3)
            .thenRequest(Integer.MAX_VALUE)
            .thenConsumeWhile(Objects::nonNull)
            .verifyComplete();
    }

    @Test
    public void testRequestBodyIsErrorShouldPropagateToResponse() {
        HttpClient client = new NettyAsyncHttpClientProvider().createInstance();
        HttpRequest request = new HttpRequest(HttpMethod.POST, url(server, SHORT_POST_BODY_PATH))
            .setHeader(HttpHeaderName.CONTENT_LENGTH, "132")
            .setBody(Flux.error(new RuntimeException("boo")));

        StepVerifier.create(client.send(request))
            .expectErrorMessage("boo")
            .verify();
    }

    @Test
    public void testRequestBodyEndsInErrorShouldPropagateToResponse() {
        HttpClient client = new NettyAsyncHttpClientProvider().createInstance();
        String contentChunk = "abcdefgh";
        int repetitions = 1000;

        HttpRequest request = new HttpRequest(HttpMethod.POST, url(server, SHORT_POST_BODY_PATH))
            .setHeader(HttpHeaderName.CONTENT_LENGTH, String.valueOf(contentChunk.length() * (repetitions + 1)))
            .setBody(Flux.just(contentChunk)
                .repeat(repetitions)
                .map(s -> ByteBuffer.wrap(s.getBytes(StandardCharsets.UTF_8)))
                .concatWith(Flux.error(new RuntimeException("boo"))));

        StepVerifier.create(client.send(request))
            .expectErrorMessage("boo")
            .verify(Duration.ofSeconds(10));
    }

    @Test
    public void testServerShutsDownSocketShouldPushErrorToContentFlowable() {
        HttpClient client = new NettyAsyncHttpClientProvider().createInstance();
        HttpRequest request = new HttpRequest(HttpMethod.GET, url(server, IO_EXCEPTION_PATH));

        StepVerifier.create(client.send(request)
                .flatMap(response -> {
                    assertEquals(200, response.getStatusCode());
                    return response.getBodyAsByteArray();
                }))
            .expectError(IOException.class)
            .verify();
    }

    @Test
    public void testConcurrentRequests() {
        HttpClient httpClient = new NettyAsyncHttpClientProvider().createInstance();

        int numberOfRequests = 100; // 100 = 100MB of data
        Mono<Long> numberOfBytesMono = Flux.range(1, numberOfRequests)
            .parallel(25)
            .runOn(Schedulers.boundedElastic())
            .flatMap(ignored -> httpClient.send(new HttpRequest(HttpMethod.GET, url(server, LONG_BODY_PATH)))
                .flatMap(HttpResponse::getBodyAsByteArray)
                .doOnNext(bytes -> assertArrayEquals(LONG_BODY, bytes)))
            .sequential()
            .map(bytes -> (long) bytes.length)
            .reduce(0L, Long::sum);

        StepVerifier.create(numberOfBytesMono)
            .expectNext((long) numberOfRequests * LONG_BODY.length)
            .expectComplete()
            .verify(Duration.ofSeconds(60));
    }

    /**
     * Tests that deep copying the buffers returned by Netty will make the stream returned to the customer resilient to
     * Netty reclaiming them once the 'onNext' operator chain has completed.
     */
    @Test
    public void deepCopyBufferConfiguredInBuilder() {
        HttpClient client = new NettyAsyncHttpClientBuilder().disableBufferCopy(false).build();

        HttpResponse response = client.send(new HttpRequest(HttpMethod.GET, url(server, LONG_BODY_PATH))).block();
        assertNotNull(response);
        assertEquals(200, response.getStatusCode());

        DelayWriteStream delayWriteStream = new DelayWriteStream();
        response.getBody().doOnNext(delayWriteStream::write).blockLast();
        assertArrayEquals(LONG_BODY, delayWriteStream.aggregateBuffers());
    }

    /**
     * Tests that preventing deep copying the buffers returned by Netty won't make the stream returned to the customer
     * resilient to Netty reclaiming them once the 'onNext' operator chain has completed.
     */
    @Test
    public void ignoreDeepCopyBufferConfiguredInBuilder() {
        HttpClient client = new NettyAsyncHttpClientBuilder().disableBufferCopy(true).build();

        HttpResponse response = client.send(new HttpRequest(HttpMethod.GET, url(server, LONG_BODY_PATH))).block();
        assertNotNull(response);
        assertEquals(200, response.getStatusCode());

        DelayWriteStream delayWriteStream = new DelayWriteStream();
        response.getBody().doOnNext(delayWriteStream::write).blockLast();
        assertFalse(Arrays.equals(LONG_BODY, delayWriteStream.aggregateBuffers()));
    }

    /**
     * Tests that deep copying of buffers is able to be configured via {@link Context}.
     */
    @Test
    public void deepCopyBufferConfiguredByContext() {
        HttpClient client = new NettyAsyncHttpClientProvider().createInstance();

        HttpResponse response = client.send(new HttpRequest(HttpMethod.GET, url(server, LONG_BODY_PATH))).block();
        assertNotNull(response);
        assertEquals(200, response.getStatusCode());

        DelayWriteStream delayWriteStream = new DelayWriteStream();
        response.getBody().doOnNext(delayWriteStream::write).blockLast();
        assertArrayEquals(LONG_BODY, delayWriteStream.aggregateBuffers());
    }

    @Test
    public void testFlowableResponseShortBodyAsByteArraySync() throws IOException {
        checkBodyReceivedSync(SHORT_BODY, SHORT_BODY_PATH);
    }

    @Test
    public void testResponseLongBodyAsByteArraySync() throws IOException {
        checkBodyReceivedSync(LONG_BODY, LONG_BODY_PATH);
    }

    @Test
    public void testBufferedResponseSync() {
        HttpClient client = new NettyAsyncHttpClientProvider().createInstance();
        HttpRequest request = new HttpRequest(HttpMethod.GET, url(server, LONG_BODY_PATH));
        try (HttpResponse response = client.sendSync(request, new Context("azure-eagerly-read-response", true))) {
            Assertions.assertArrayEquals(LONG_BODY, response.getBodyAsBinaryData().toBytes());
        }
    }

    @Test
    public void testProgressReporterSync() {
        HttpClient client = new NettyAsyncHttpClientProvider().createInstance();

        ConcurrentLinkedDeque<Long> progress = new ConcurrentLinkedDeque<>();
        HttpRequest request = new HttpRequest(HttpMethod.POST, url(server, SHORT_POST_BODY_PATH))
            .setHeader(HttpHeaderName.CONTENT_LENGTH, String.valueOf(SHORT_BODY.length + LONG_BODY.length))
            .setBody(Flux.just(ByteBuffer.wrap(LONG_BODY))
                .concatWith(Flux.just(ByteBuffer.wrap(SHORT_BODY))));

        Contexts contexts = Contexts.with(Context.NONE)
            .setHttpRequestProgressReporter(ProgressReporter.withProgressListener(progress::add));
        try (HttpResponse response = client.sendSync(request, contexts.getContext())) {
            assertEquals(200, response.getStatusCode());
            List<Long> progressList = progress.stream().collect(Collectors.toList());
            assertEquals(LONG_BODY.length, progressList.get(0));
            assertEquals(SHORT_BODY.length + LONG_BODY.length, progressList.get(1));
        }
    }

    @Test
    public void testFileUploadSync() throws IOException {
        WireMockServer local = new WireMockServer(WireMockConfiguration.options()
            .dynamicPort()
            .maxRequestJournalEntries(1)
            .gzipDisabled(true));

        local.stubFor(post(SHORT_POST_BODY_PATH).willReturn(aResponse().withStatus(200).withBody(SHORT_BODY)));
        local.start();

        Path tempFile = writeToTempFile(LONG_BODY);
        tempFile.toFile().deleteOnExit();
        BinaryData body = BinaryData.fromFile(tempFile, 1L, 42L);

        HttpClient client = new NettyAsyncHttpClientProvider().createInstance();
        HttpRequest request = new HttpRequest(HttpMethod.POST, url(local, SHORT_POST_BODY_PATH))
            .setBody(body);

        try (HttpResponse response = client.sendSync(request, Context.NONE)) {
            assertEquals(200, response.getStatusCode());
        }

        local.verify(postRequestedFor(urlEqualTo(SHORT_POST_BODY_PATH)).withRequestBody(binaryEqualTo(body.toBytes())));
        local.shutdown();
    }

    @Test
    public void testRequestBodyIsErrorShouldPropagateToResponseSync() {
        HttpClient client = new NettyAsyncHttpClientProvider().createInstance();
        HttpRequest request = new HttpRequest(HttpMethod.POST, url(server, SHORT_POST_BODY_PATH))
            .setHeader(HttpHeaderName.CONTENT_LENGTH, "132")
            .setBody(Flux.error(new RuntimeException("boo")));

        RuntimeException thrown = assertThrows(RuntimeException.class, () -> client.sendSync(request, Context.NONE));
        assertEquals("boo", thrown.getMessage());
    }

    @Test
    public void testRequestBodyIsErrorShouldPropagateToResponseSyncInGetMethod() {
        HttpClient client = new NettyAsyncHttpClientProvider().createInstance();

        HttpResponse response = client.sendSync(new HttpRequest(HttpMethod.GET,
            url(server, LONG_BODY_PATH)), Context.NONE);
        assertNotNull(response);
        assertEquals(200, response.getStatusCode());
        assertArrayEquals(LONG_BODY, response.getBodyAsBinaryData().toBytes());
    }

    @Test
    public void testRequestBodyEndsInErrorShouldPropagateToResponseSync() {
        HttpClient client = new NettyAsyncHttpClientProvider().createInstance();
        String contentChunk = "abcdefgh";
        int repetitions = 1000;
        HttpRequest request = new HttpRequest(HttpMethod.POST, url(server, SHORT_POST_BODY_PATH))
            .setHeader(HttpHeaderName.CONTENT_LENGTH, String.valueOf(contentChunk.length() * (repetitions + 1)))
            .setBody(Flux.just(contentChunk)
                .repeat(repetitions)
                .map(s -> ByteBuffer.wrap(s.getBytes(StandardCharsets.UTF_8)))
                .concatWith(Flux.error(new RuntimeException("boo"))));

        RuntimeException thrown = assertThrows(RuntimeException.class,
            () -> client.sendSync(request, Context.NONE));
        assertEquals("boo", thrown.getMessage());
    }

    @Test
    public void testBufferResponseSync() {
        HttpClient client = new NettyAsyncHttpClientProvider().createInstance();
        try (HttpResponse response = doRequestSync(client, LONG_BODY_PATH).buffer()) {
            Assertions.assertArrayEquals(LONG_BODY, response.getBodyAsBinaryData().toBytes());
        }
    }

    @Test
    @Timeout(20)
    public void testFlowableWhenServerReturnsBodyAndNoErrorsWhenHttp500ReturnedSync() {
        HttpClient client = new NettyAsyncHttpClientProvider().createInstance();
        try (HttpResponse response = doRequestSync(client, "/error")) {
            assertEquals(500, response.getStatusCode());
            assertEquals("error", response.getBodyAsString().block());
        }
    }

    @Test
    public void testConcurrentRequestsSync() {
        int numRequests = 100; // 100 = 1GB of data read
        HttpClient client = new NettyAsyncHttpClientProvider().createInstance();

        Mono<Long> numBytesMono = Flux.range(1, numRequests)
            .parallel(25)
            .runOn(Schedulers.boundedElastic())
            .flatMap(ignored -> {
                try (HttpResponse response = doRequestSync(client, "/long")) {
                    byte[] body = response.getBodyAsBinaryData().toBytes();
                    assertArrayEquals(LONG_BODY, body);
                    return Flux.just((long) body.length);
                }
            })
            .sequential()
            .reduce(0L, Long::sum);

        StepVerifier.create(numBytesMono)
            .expectNext((long) numRequests * LONG_BODY.length)
            .expectComplete()
            .verify(Duration.ofSeconds(60));
    }

    @ParameterizedTest
    @MethodSource("requestHeaderSupplier")
    public void requestHeader(String headerValue, String expectedValue) {
        HttpClient client = new NettyAsyncHttpClientProvider().createInstance();

        HttpHeaders headers = new HttpHeaders().set(TEST_HEADER, headerValue);
        HttpRequest request = new HttpRequest(HttpMethod.POST, url(server, HTTP_HEADERS_PATH), headers, Flux.empty());

        StepVerifier.create(client.send(request))
            .assertNext(response -> assertEquals(expectedValue, response.getHeaderValue(TEST_HEADER)))
            .verifyComplete();
    }

    @Test
    public void validateRequestHasOneUserAgentHeader() {
        HttpClient httpClient = new NettyAsyncHttpClientProvider().createInstance();

        StepVerifier.create(httpClient.send(new HttpRequest(HttpMethod.GET, url(server, NO_DOUBLE_UA_PATH),
                new HttpHeaders().set(HttpHeaderName.USER_AGENT, EXPECTED_HEADER), Flux.empty())))
            .assertNext(response -> assertEquals(200, response.getStatusCode()))
            .verifyComplete();
    }

    @Test
    public void validateHeadersReturnAsIs() {
        HttpClient client = new NettyAsyncHttpClientProvider().createInstance();

        HttpHeaderName singleValueHeaderName = HttpHeaderName.fromString("singleValue");
        final String singleValueHeaderValue = "value";

        HttpHeaderName multiValueHeaderName = HttpHeaderName.fromString("Multi-value");
        final List<String> multiValueHeaderValue = Arrays.asList("value1", "value2");

        HttpHeaders headers = new HttpHeaders()
            .set(singleValueHeaderName, singleValueHeaderValue)
            .set(multiValueHeaderName, multiValueHeaderValue);

        StepVerifier.create(client.send(new HttpRequest(HttpMethod.GET, url(server, RETURN_HEADERS_AS_IS_PATH),
                headers, Flux.empty())))
            .assertNext(response -> {
                assertEquals(200, response.getStatusCode());

                HttpHeaders responseHeaders = response.getHeaders();
                HttpHeader singleValueHeader = responseHeaders.get(singleValueHeaderName);
                assertEquals(singleValueHeaderName.getCaseSensitiveName(), singleValueHeader.getName());
                assertEquals(singleValueHeaderValue, singleValueHeader.getValue());

                HttpHeader multiValueHeader = responseHeaders.get(multiValueHeaderName);
                assertEquals(multiValueHeaderName.getCaseSensitiveName(), multiValueHeader.getName());
                assertLinesMatch(multiValueHeaderValue, multiValueHeader.getValuesList());
            })
            .expectComplete()
            .verify(Duration.ofSeconds(10));
    }

    /**
     * This test validates that the eager retrying of Proxy Authentication (407) responses doesn't return to the
     * HttpPipeline before connecting.
     */
    @Test
    public void proxyAuthenticationErrorEagerlyRetries() {
        // Create a Netty HttpClient to share backing resources that are warmed up before making a time based call.
        reactor.netty.http.client.HttpClient warmedUpClient = reactor.netty.http.client.HttpClient.create();
        StepVerifier.create(new NettyAsyncHttpClientBuilder(warmedUpClient).build()
                .send(new HttpRequest(HttpMethod.GET, url(server, SHORT_BODY_PATH))))
            .assertNext(response -> assertEquals(200, response.getStatusCode()))
            .verifyComplete();

        try (MockProxyServer mockProxyServer = new MockProxyServer("1", "1")) {
            AtomicInteger responseHandleCount = new AtomicInteger();
            RetryPolicy retryPolicy = new RetryPolicy(new FixedDelay(3, Duration.ofSeconds(1)));
            ProxyOptions proxyOptions = new ProxyOptions(ProxyOptions.Type.HTTP, mockProxyServer.socketAddress())
                .setCredentials("1", "1");

            // Create an HttpPipeline where any exception has a retry delay of 10 seconds.
            HttpPipeline httpPipeline = new HttpPipelineBuilder()
                .policies(retryPolicy, (context, next) -> next.process()
                    .doOnNext(ignored -> responseHandleCount.incrementAndGet()))
                .httpClient(new NettyAsyncHttpClientBuilder(warmedUpClient).proxy(proxyOptions).build())
                .build();

            StepVerifier.create(httpPipeline.send(new HttpRequest(HttpMethod.GET, url(server, PROXY_TO_ADDRESS)),
                    new Context("azure-eagerly-read-response", true)))
                .assertNext(response -> assertEquals(418, response.getStatusCode()))
                .expectComplete()
                .verify();

            assertEquals(1, responseHandleCount.get());
        }
    }

    /**
     * This test validates that if the eager retrying of Proxy Authentication (407) responses uses all retries returns
     * the correct error.
     */
    @Test
    public void failedProxyAuthenticationReturnsCorrectError() {
        try (MockProxyServer mockProxyServer = new MockProxyServer("1", "1")) {
            HttpPipeline httpPipeline = new HttpPipelineBuilder()
                .httpClient(new NettyAsyncHttpClientBuilder()
                    .proxy(new ProxyOptions(ProxyOptions.Type.HTTP, mockProxyServer.socketAddress())
                        .setCredentials("2", "2"))
                    .build())
                .build();

            StepVerifier.create(httpPipeline.send(new HttpRequest(HttpMethod.GET, url(server, PROXY_TO_ADDRESS))))
                .verifyErrorMatches(exception -> exception instanceof ProxyConnectException
                    && exception.getMessage().contains("Failed to connect to proxy. Status: "));
        }
    }

    @Test
    public void httpClientWithDefaultResolverUsesNoopResolverWithProxy() {
        try (MockProxyServer mockProxyServer = new MockProxyServer()) {
            NettyAsyncHttpClient httpClient =
                (NettyAsyncHttpClient) new NettyAsyncHttpClientBuilder()
                    .proxy(new ProxyOptions(
                        ProxyOptions.Type.HTTP, mockProxyServer.socketAddress()))
                    .build();

            assertEquals(NoopAddressResolverGroup.INSTANCE, httpClient.nettyClient.configuration().resolver());
        }
    }

    @Test
    public void httpClientWithConnectionProviderUsesNoopResolverWithProxy() {
        try (MockProxyServer mockProxyServer = new MockProxyServer()) {
            NettyAsyncHttpClient httpClient =
                (NettyAsyncHttpClient) new NettyAsyncHttpClientBuilder()
                    .connectionProvider(ConnectionProvider.newConnection())
                    .proxy(new ProxyOptions(
                        ProxyOptions.Type.HTTP, mockProxyServer.socketAddress()))
                    .build();

            assertEquals(NoopAddressResolverGroup.INSTANCE, httpClient.nettyClient.configuration().resolver());
        }
    }

    @Test
    public void httpClientWithResolverUsesConfiguredResolverWithProxy() {
        try (MockProxyServer mockProxyServer = new MockProxyServer()) {
            NettyAsyncHttpClient httpClient =
                (NettyAsyncHttpClient) new NettyAsyncHttpClientBuilder(
                    reactor.netty.http.client.HttpClient.create().resolver(DefaultAddressResolverGroup.INSTANCE))
                    .proxy(new ProxyOptions(
                        ProxyOptions.Type.HTTP, mockProxyServer.socketAddress()))
                    .build();
            assertNotEquals(NoopAddressResolverGroup.INSTANCE, httpClient.nettyClient.configuration().resolver());
        }
    }

    private static Stream<Arguments> requestHeaderSupplier() {
        return Stream.of(
            Arguments.of(null, NettyAsyncHttpClientResponseTransformer.NULL_REPLACEMENT),
            Arguments.of("", ""),
            Arguments.of("aValue", "aValue")
        );
    }

    private static NettyAsyncHttpResponse getResponse(String path) {
        HttpClient client = new NettyAsyncHttpClientProvider().createInstance();
        return getResponse(client, path);
    }

    private static NettyAsyncHttpResponse getResponse(HttpClient client, String path) {
        HttpRequest request = new HttpRequest(HttpMethod.GET, url(server, path));
        return (NettyAsyncHttpResponse) client.send(request).block();
    }

    private static URL url(WireMockServer server, String path) {
        try {
            return new URI("http://localhost:" + server.port() + path).toURL();
        } catch (URISyntaxException | MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    private static byte[] createLongBody() {
        byte[] duplicateBytes = "abcdefghijk".getBytes(StandardCharsets.UTF_8);
        byte[] longBody = new byte[duplicateBytes.length * 100000];

        for (int i = 0; i < 100000; i++) {
            System.arraycopy(duplicateBytes, 0, longBody, i * duplicateBytes.length, duplicateBytes.length);
        }

        return longBody;
    }

    private void checkBodyReceived(byte[] expectedBody, String path) {
        HttpClient httpClient = new NettyAsyncHttpClientProvider().createInstance();
        StepVerifier.create(httpClient.send(new HttpRequest(HttpMethod.GET, url(server, path)))
                .flatMap(HttpResponse::getBodyAsByteArray))
            .assertNext(bytes -> assertArrayEquals(expectedBody, bytes))
            .verifyComplete();
    }

    private static final class DelayWriteStream {
        private final List<ByteBuffer> internalBuffers = new ArrayList<>();
        private final AtomicInteger totalStreamSize = new AtomicInteger();

        public void write(ByteBuffer buffer) {

            internalBuffers.add(buffer);
            totalStreamSize.getAndAdd(buffer.remaining());
        }

        public byte[] aggregateBuffers() {
            return FluxUtil.collectBytesInByteBufferStream(Flux.fromIterable(internalBuffers), totalStreamSize.get())
                .block();
        }
    }

    private void checkBodyReceivedSync(byte[] expectedBody, String path) throws IOException {
        HttpClient client = new NettyAsyncHttpClientProvider().createInstance();
        try (HttpResponse response = doRequestSync(client, path)) {
            ByteArrayOutputStream outStream = new ByteArrayOutputStream();
            WritableByteChannel body = Channels.newChannel(outStream);
            response.writeBodyTo(body);
            Assertions.assertArrayEquals(expectedBody, outStream.toByteArray());
        }
    }

    private HttpResponse doRequestSync(HttpClient client, String path) {
        HttpRequest request = new HttpRequest(HttpMethod.GET, url(server, path));
        return client.sendSync(request, Context.NONE);
    }

    private static Path writeToTempFile(byte[] body) throws IOException {
        Path tempFile = Files.createTempFile("data", null);
        tempFile.toFile().deleteOnExit();
        String tempFilePath = tempFile.toString();
        FileOutputStream outputStream = new FileOutputStream(tempFilePath);
        outputStream.write(body);
        outputStream.close();
        return tempFile;
    }
}
