// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.networktraversal.implementation;

import com.azure.communication.networktraversal.implementation.models.CommunicationErrorResponseException;
import com.azure.communication.networktraversal.implementation.models.CommunicationRelayConfigurationRequest;
import com.azure.communication.networktraversal.models.CommunicationRelayConfiguration;
import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in CommunicationNetworkTraversals. */
public final class CommunicationNetworkTraversalsImpl {
    /** The proxy service used to perform REST calls. */
    private final CommunicationNetworkTraversalsService service;

    /** The service client containing this operation class. */
    private final CommunicationNetworkTraversalClientImpl client;

    /**
     * Initializes an instance of CommunicationNetworkTraversalsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    CommunicationNetworkTraversalsImpl(CommunicationNetworkTraversalClientImpl client) {
        this.service =
                RestProxy.create(
                        CommunicationNetworkTraversalsService.class,
                        client.getHttpPipeline(),
                        client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for CommunicationNetworkTraversalClientCommunicationNetworkTraversals to
     * be used by the proxy service to perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "CommunicationNetwork")
    private interface CommunicationNetworkTraversalsService {
        @Post("/networkTraversal/:issueRelayConfiguration")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CommunicationErrorResponseException.class)
        Mono<Response<CommunicationRelayConfiguration>> issueRelayConfiguration(
                @HostParam("endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") CommunicationRelayConfigurationRequest body,
                @HeaderParam("Accept") String accept,
                Context context);
    }

    /**
     * Issue a configuration for an STUN/TURN server.
     *
     * @param body Optional request for providing the id and/or route type for the returned relay configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a relay configuration containing the STUN/TURN URLs and credentials.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CommunicationRelayConfiguration>> issueRelayConfigurationWithResponseAsync(
            CommunicationRelayConfigurationRequest body) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.issueRelayConfiguration(
                                this.client.getEndpoint(), this.client.getApiVersion(), body, accept, context));
    }

    /**
     * Issue a configuration for an STUN/TURN server.
     *
     * @param body Optional request for providing the id and/or route type for the returned relay configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a relay configuration containing the STUN/TURN URLs and credentials.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CommunicationRelayConfiguration>> issueRelayConfigurationWithResponseAsync(
            CommunicationRelayConfigurationRequest body, Context context) {
        final String accept = "application/json";
        return service.issueRelayConfiguration(
                this.client.getEndpoint(), this.client.getApiVersion(), body, accept, context);
    }

    /**
     * Issue a configuration for an STUN/TURN server.
     *
     * @param body Optional request for providing the id and/or route type for the returned relay configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a relay configuration containing the STUN/TURN URLs and credentials.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CommunicationRelayConfiguration> issueRelayConfigurationAsync(
            CommunicationRelayConfigurationRequest body) {
        return issueRelayConfigurationWithResponseAsync(body)
                .flatMap(
                        (Response<CommunicationRelayConfiguration> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Issue a configuration for an STUN/TURN server.
     *
     * @param body Optional request for providing the id and/or route type for the returned relay configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a relay configuration containing the STUN/TURN URLs and credentials.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CommunicationRelayConfiguration> issueRelayConfigurationAsync(
            CommunicationRelayConfigurationRequest body, Context context) {
        return issueRelayConfigurationWithResponseAsync(body, context)
                .flatMap(
                        (Response<CommunicationRelayConfiguration> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Issue a configuration for an STUN/TURN server.
     *
     * @param body Optional request for providing the id and/or route type for the returned relay configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a relay configuration containing the STUN/TURN URLs and credentials.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CommunicationRelayConfiguration issueRelayConfiguration(CommunicationRelayConfigurationRequest body) {
        return issueRelayConfigurationAsync(body).block();
    }

    /**
     * Issue a configuration for an STUN/TURN server.
     *
     * @param body Optional request for providing the id and/or route type for the returned relay configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CommunicationErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a relay configuration containing the STUN/TURN URLs and credentials.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CommunicationRelayConfiguration> issueRelayConfigurationWithResponse(
            CommunicationRelayConfigurationRequest body, Context context) {
        return issueRelayConfigurationWithResponseAsync(body, context).block();
    }
}
