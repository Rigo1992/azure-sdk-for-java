// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.ProtectedItemOperationResultsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.ProtectedItemResourceInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ProtectedItemOperationResultsClient. */
public final class ProtectedItemOperationResultsClientImpl implements ProtectedItemOperationResultsClient {
    private final ClientLogger logger = new ClientLogger(ProtectedItemOperationResultsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final ProtectedItemOperationResultsService service;

    /** The service client containing this operation class. */
    private final RecoveryServicesBackupClientImpl client;

    /**
     * Initializes an instance of ProtectedItemOperationResultsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ProtectedItemOperationResultsClientImpl(RecoveryServicesBackupClientImpl client) {
        this.service =
            RestProxy
                .create(
                    ProtectedItemOperationResultsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for RecoveryServicesBackupClientProtectedItemOperationResults to be used
     * by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "RecoveryServicesBack")
    private interface ProtectedItemOperationResultsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices"
                + "/vaults/{vaultName}/backupFabrics/{fabricName}/protectionContainers/{containerName}/protectedItems"
                + "/{protectedItemName}/operationResults/{operationId}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ProtectedItemResourceInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("vaultName") String vaultName,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("fabricName") String fabricName,
            @PathParam("containerName") String containerName,
            @PathParam("protectedItemName") String protectedItemName,
            @PathParam("operationId") String operationId,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Fetches the result of any operation on the backup item.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backup item.
     * @param containerName Container name associated with the backup item.
     * @param protectedItemName Backup item name whose details are to be fetched.
     * @param operationId OperationID which represents the operation whose result needs to be fetched.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return base class for backup items along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ProtectedItemResourceInner>> getWithResponseAsync(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        String operationId) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (vaultName == null) {
            return Mono.error(new IllegalArgumentException("Parameter vaultName is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (fabricName == null) {
            return Mono.error(new IllegalArgumentException("Parameter fabricName is required and cannot be null."));
        }
        if (containerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter containerName is required and cannot be null."));
        }
        if (protectedItemName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter protectedItemName is required and cannot be null."));
        }
        if (operationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter operationId is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            vaultName,
                            resourceGroupName,
                            this.client.getSubscriptionId(),
                            fabricName,
                            containerName,
                            protectedItemName,
                            operationId,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Fetches the result of any operation on the backup item.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backup item.
     * @param containerName Container name associated with the backup item.
     * @param protectedItemName Backup item name whose details are to be fetched.
     * @param operationId OperationID which represents the operation whose result needs to be fetched.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return base class for backup items along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ProtectedItemResourceInner>> getWithResponseAsync(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        String operationId,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (vaultName == null) {
            return Mono.error(new IllegalArgumentException("Parameter vaultName is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (fabricName == null) {
            return Mono.error(new IllegalArgumentException("Parameter fabricName is required and cannot be null."));
        }
        if (containerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter containerName is required and cannot be null."));
        }
        if (protectedItemName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter protectedItemName is required and cannot be null."));
        }
        if (operationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter operationId is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                vaultName,
                resourceGroupName,
                this.client.getSubscriptionId(),
                fabricName,
                containerName,
                protectedItemName,
                operationId,
                accept,
                context);
    }

    /**
     * Fetches the result of any operation on the backup item.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backup item.
     * @param containerName Container name associated with the backup item.
     * @param protectedItemName Backup item name whose details are to be fetched.
     * @param operationId OperationID which represents the operation whose result needs to be fetched.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return base class for backup items on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ProtectedItemResourceInner> getAsync(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        String operationId) {
        return getWithResponseAsync(
                vaultName, resourceGroupName, fabricName, containerName, protectedItemName, operationId)
            .flatMap(
                (Response<ProtectedItemResourceInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Fetches the result of any operation on the backup item.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backup item.
     * @param containerName Container name associated with the backup item.
     * @param protectedItemName Backup item name whose details are to be fetched.
     * @param operationId OperationID which represents the operation whose result needs to be fetched.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return base class for backup items.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ProtectedItemResourceInner get(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        String operationId) {
        return getAsync(vaultName, resourceGroupName, fabricName, containerName, protectedItemName, operationId)
            .block();
    }

    /**
     * Fetches the result of any operation on the backup item.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backup item.
     * @param containerName Container name associated with the backup item.
     * @param protectedItemName Backup item name whose details are to be fetched.
     * @param operationId OperationID which represents the operation whose result needs to be fetched.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return base class for backup items along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ProtectedItemResourceInner> getWithResponse(
        String vaultName,
        String resourceGroupName,
        String fabricName,
        String containerName,
        String protectedItemName,
        String operationId,
        Context context) {
        return getWithResponseAsync(
                vaultName, resourceGroupName, fabricName, containerName, protectedItemName, operationId, context)
            .block();
    }
}
