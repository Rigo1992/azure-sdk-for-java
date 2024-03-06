// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.fluent.models.VpnConnectionInner;
import com.azure.resourcemanager.network.models.VpnConnectionPacketCaptureStartParameters;
import com.azure.resourcemanager.network.models.VpnConnectionPacketCaptureStopParameters;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in VpnConnectionsClient.
 */
public interface VpnConnectionsClient {
    /**
     * Retrieves the details of a vpn connection.
     * 
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnConnection Resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<VpnConnectionInner>> getWithResponseAsync(String resourceGroupName, String gatewayName,
        String connectionName);

    /**
     * Retrieves the details of a vpn connection.
     * 
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnConnection Resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VpnConnectionInner> getAsync(String resourceGroupName, String gatewayName, String connectionName);

    /**
     * Retrieves the details of a vpn connection.
     * 
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnConnection Resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VpnConnectionInner> getWithResponse(String resourceGroupName, String gatewayName, String connectionName,
        Context context);

    /**
     * Retrieves the details of a vpn connection.
     * 
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnConnection Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VpnConnectionInner get(String resourceGroupName, String gatewayName, String connectionName);

    /**
     * Creates a vpn connection to a scalable vpn gateway if it doesn't exist else updates the existing connection.
     * 
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the connection.
     * @param vpnConnectionParameters Parameters supplied to create or Update a VPN Connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnConnection Resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String gatewayName,
        String connectionName, VpnConnectionInner vpnConnectionParameters);

    /**
     * Creates a vpn connection to a scalable vpn gateway if it doesn't exist else updates the existing connection.
     * 
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the connection.
     * @param vpnConnectionParameters Parameters supplied to create or Update a VPN Connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of vpnConnection Resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<VpnConnectionInner>, VpnConnectionInner> beginCreateOrUpdateAsync(String resourceGroupName,
        String gatewayName, String connectionName, VpnConnectionInner vpnConnectionParameters);

    /**
     * Creates a vpn connection to a scalable vpn gateway if it doesn't exist else updates the existing connection.
     * 
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the connection.
     * @param vpnConnectionParameters Parameters supplied to create or Update a VPN Connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of vpnConnection Resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VpnConnectionInner>, VpnConnectionInner> beginCreateOrUpdate(String resourceGroupName,
        String gatewayName, String connectionName, VpnConnectionInner vpnConnectionParameters);

    /**
     * Creates a vpn connection to a scalable vpn gateway if it doesn't exist else updates the existing connection.
     * 
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the connection.
     * @param vpnConnectionParameters Parameters supplied to create or Update a VPN Connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of vpnConnection Resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VpnConnectionInner>, VpnConnectionInner> beginCreateOrUpdate(String resourceGroupName,
        String gatewayName, String connectionName, VpnConnectionInner vpnConnectionParameters, Context context);

    /**
     * Creates a vpn connection to a scalable vpn gateway if it doesn't exist else updates the existing connection.
     * 
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the connection.
     * @param vpnConnectionParameters Parameters supplied to create or Update a VPN Connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnConnection Resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<VpnConnectionInner> createOrUpdateAsync(String resourceGroupName, String gatewayName, String connectionName,
        VpnConnectionInner vpnConnectionParameters);

    /**
     * Creates a vpn connection to a scalable vpn gateway if it doesn't exist else updates the existing connection.
     * 
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the connection.
     * @param vpnConnectionParameters Parameters supplied to create or Update a VPN Connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnConnection Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VpnConnectionInner createOrUpdate(String resourceGroupName, String gatewayName, String connectionName,
        VpnConnectionInner vpnConnectionParameters);

    /**
     * Creates a vpn connection to a scalable vpn gateway if it doesn't exist else updates the existing connection.
     * 
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the connection.
     * @param vpnConnectionParameters Parameters supplied to create or Update a VPN Connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnConnection Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VpnConnectionInner createOrUpdate(String resourceGroupName, String gatewayName, String connectionName,
        VpnConnectionInner vpnConnectionParameters, Context context);

    /**
     * Deletes a vpn connection.
     * 
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String gatewayName,
        String connectionName);

    /**
     * Deletes a vpn connection.
     * 
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(String resourceGroupName, String gatewayName,
        String connectionName);

    /**
     * Deletes a vpn connection.
     * 
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String gatewayName, String connectionName);

    /**
     * Deletes a vpn connection.
     * 
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String gatewayName, String connectionName,
        Context context);

    /**
     * Deletes a vpn connection.
     * 
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String gatewayName, String connectionName);

    /**
     * Deletes a vpn connection.
     * 
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String gatewayName, String connectionName);

    /**
     * Deletes a vpn connection.
     * 
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String gatewayName, String connectionName, Context context);

    /**
     * Starts packet capture on Vpn connection in the specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param gatewayName The name of the gateway.
     * @param vpnConnectionName The name of the vpn connection.
     * @param parameters Vpn Connection packet capture parameters supplied to start packet capture on gateway
     * connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> startPacketCaptureWithResponseAsync(String resourceGroupName, String gatewayName,
        String vpnConnectionName, VpnConnectionPacketCaptureStartParameters parameters);

    /**
     * Starts packet capture on Vpn connection in the specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param gatewayName The name of the gateway.
     * @param vpnConnectionName The name of the vpn connection.
     * @param parameters Vpn Connection packet capture parameters supplied to start packet capture on gateway
     * connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<String>, String> beginStartPacketCaptureAsync(String resourceGroupName, String gatewayName,
        String vpnConnectionName, VpnConnectionPacketCaptureStartParameters parameters);

    /**
     * Starts packet capture on Vpn connection in the specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param gatewayName The name of the gateway.
     * @param vpnConnectionName The name of the vpn connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<String>, String> beginStartPacketCaptureAsync(String resourceGroupName, String gatewayName,
        String vpnConnectionName);

    /**
     * Starts packet capture on Vpn connection in the specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param gatewayName The name of the gateway.
     * @param vpnConnectionName The name of the vpn connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<String>, String> beginStartPacketCapture(String resourceGroupName, String gatewayName,
        String vpnConnectionName);

    /**
     * Starts packet capture on Vpn connection in the specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param gatewayName The name of the gateway.
     * @param vpnConnectionName The name of the vpn connection.
     * @param parameters Vpn Connection packet capture parameters supplied to start packet capture on gateway
     * connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<String>, String> beginStartPacketCapture(String resourceGroupName, String gatewayName,
        String vpnConnectionName, VpnConnectionPacketCaptureStartParameters parameters, Context context);

    /**
     * Starts packet capture on Vpn connection in the specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param gatewayName The name of the gateway.
     * @param vpnConnectionName The name of the vpn connection.
     * @param parameters Vpn Connection packet capture parameters supplied to start packet capture on gateway
     * connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<String> startPacketCaptureAsync(String resourceGroupName, String gatewayName, String vpnConnectionName,
        VpnConnectionPacketCaptureStartParameters parameters);

    /**
     * Starts packet capture on Vpn connection in the specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param gatewayName The name of the gateway.
     * @param vpnConnectionName The name of the vpn connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<String> startPacketCaptureAsync(String resourceGroupName, String gatewayName, String vpnConnectionName);

    /**
     * Starts packet capture on Vpn connection in the specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param gatewayName The name of the gateway.
     * @param vpnConnectionName The name of the vpn connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    String startPacketCapture(String resourceGroupName, String gatewayName, String vpnConnectionName);

    /**
     * Starts packet capture on Vpn connection in the specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param gatewayName The name of the gateway.
     * @param vpnConnectionName The name of the vpn connection.
     * @param parameters Vpn Connection packet capture parameters supplied to start packet capture on gateway
     * connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    String startPacketCapture(String resourceGroupName, String gatewayName, String vpnConnectionName,
        VpnConnectionPacketCaptureStartParameters parameters, Context context);

    /**
     * Stops packet capture on Vpn connection in the specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param gatewayName The name of the gateway.
     * @param vpnConnectionName The name of the vpn connection.
     * @param parameters Vpn Connection packet capture parameters supplied to stop packet capture on gateway connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> stopPacketCaptureWithResponseAsync(String resourceGroupName, String gatewayName,
        String vpnConnectionName, VpnConnectionPacketCaptureStopParameters parameters);

    /**
     * Stops packet capture on Vpn connection in the specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param gatewayName The name of the gateway.
     * @param vpnConnectionName The name of the vpn connection.
     * @param parameters Vpn Connection packet capture parameters supplied to stop packet capture on gateway connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<String>, String> beginStopPacketCaptureAsync(String resourceGroupName, String gatewayName,
        String vpnConnectionName, VpnConnectionPacketCaptureStopParameters parameters);

    /**
     * Stops packet capture on Vpn connection in the specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param gatewayName The name of the gateway.
     * @param vpnConnectionName The name of the vpn connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<String>, String> beginStopPacketCaptureAsync(String resourceGroupName, String gatewayName,
        String vpnConnectionName);

    /**
     * Stops packet capture on Vpn connection in the specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param gatewayName The name of the gateway.
     * @param vpnConnectionName The name of the vpn connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<String>, String> beginStopPacketCapture(String resourceGroupName, String gatewayName,
        String vpnConnectionName);

    /**
     * Stops packet capture on Vpn connection in the specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param gatewayName The name of the gateway.
     * @param vpnConnectionName The name of the vpn connection.
     * @param parameters Vpn Connection packet capture parameters supplied to stop packet capture on gateway connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<String>, String> beginStopPacketCapture(String resourceGroupName, String gatewayName,
        String vpnConnectionName, VpnConnectionPacketCaptureStopParameters parameters, Context context);

    /**
     * Stops packet capture on Vpn connection in the specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param gatewayName The name of the gateway.
     * @param vpnConnectionName The name of the vpn connection.
     * @param parameters Vpn Connection packet capture parameters supplied to stop packet capture on gateway connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<String> stopPacketCaptureAsync(String resourceGroupName, String gatewayName, String vpnConnectionName,
        VpnConnectionPacketCaptureStopParameters parameters);

    /**
     * Stops packet capture on Vpn connection in the specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param gatewayName The name of the gateway.
     * @param vpnConnectionName The name of the vpn connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<String> stopPacketCaptureAsync(String resourceGroupName, String gatewayName, String vpnConnectionName);

    /**
     * Stops packet capture on Vpn connection in the specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param gatewayName The name of the gateway.
     * @param vpnConnectionName The name of the vpn connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    String stopPacketCapture(String resourceGroupName, String gatewayName, String vpnConnectionName);

    /**
     * Stops packet capture on Vpn connection in the specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param gatewayName The name of the gateway.
     * @param vpnConnectionName The name of the vpn connection.
     * @param parameters Vpn Connection packet capture parameters supplied to stop packet capture on gateway connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    String stopPacketCapture(String resourceGroupName, String gatewayName, String vpnConnectionName,
        VpnConnectionPacketCaptureStopParameters parameters, Context context);

    /**
     * Retrieves all vpn connections for a particular virtual wan vpn gateway.
     * 
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list all vpn connections to a virtual wan vpn gateway as paginated response with
     * {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<VpnConnectionInner> listByVpnGatewayAsync(String resourceGroupName, String gatewayName);

    /**
     * Retrieves all vpn connections for a particular virtual wan vpn gateway.
     * 
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list all vpn connections to a virtual wan vpn gateway as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VpnConnectionInner> listByVpnGateway(String resourceGroupName, String gatewayName);

    /**
     * Retrieves all vpn connections for a particular virtual wan vpn gateway.
     * 
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list all vpn connections to a virtual wan vpn gateway as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VpnConnectionInner> listByVpnGateway(String resourceGroupName, String gatewayName, Context context);
}
