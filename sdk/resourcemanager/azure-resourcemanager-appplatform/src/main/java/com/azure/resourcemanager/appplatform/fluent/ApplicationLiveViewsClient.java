// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.appplatform.fluent.models.ApplicationLiveViewResourceInner;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in ApplicationLiveViewsClient.
 */
public interface ApplicationLiveViewsClient {
    /**
     * Handles requests to list all resources in a Service.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes an array of Application Live View resources and a possible link for next set as
     * paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ApplicationLiveViewResourceInner> listAsync(String resourceGroupName, String serviceName);

    /**
     * Handles requests to list all resources in a Service.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes an array of Application Live View resources and a possible link for next set as
     * paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApplicationLiveViewResourceInner> list(String resourceGroupName, String serviceName);

    /**
     * Handles requests to list all resources in a Service.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that includes an array of Application Live View resources and a possible link for next set as
     * paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApplicationLiveViewResourceInner> list(String resourceGroupName, String serviceName, Context context);

    /**
     * Get the Application Live and its properties.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationLiveViewName The name of Application Live View.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Application Live and its properties along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ApplicationLiveViewResourceInner>> getWithResponseAsync(String resourceGroupName, String serviceName,
        String applicationLiveViewName);

    /**
     * Get the Application Live and its properties.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationLiveViewName The name of Application Live View.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Application Live and its properties on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ApplicationLiveViewResourceInner> getAsync(String resourceGroupName, String serviceName,
        String applicationLiveViewName);

    /**
     * Get the Application Live and its properties.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationLiveViewName The name of Application Live View.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Application Live and its properties along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApplicationLiveViewResourceInner> getWithResponse(String resourceGroupName, String serviceName,
        String applicationLiveViewName, Context context);

    /**
     * Get the Application Live and its properties.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationLiveViewName The name of Application Live View.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Application Live and its properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationLiveViewResourceInner get(String resourceGroupName, String serviceName, String applicationLiveViewName);

    /**
     * Create the default Application Live View or update the existing Application Live View.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationLiveViewName The name of Application Live View.
     * @param applicationLiveViewResource Parameters for the update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return application Live View resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String serviceName,
        String applicationLiveViewName, ApplicationLiveViewResourceInner applicationLiveViewResource);

    /**
     * Create the default Application Live View or update the existing Application Live View.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationLiveViewName The name of Application Live View.
     * @param applicationLiveViewResource Parameters for the update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of application Live View resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<ApplicationLiveViewResourceInner>, ApplicationLiveViewResourceInner> beginCreateOrUpdateAsync(
        String resourceGroupName, String serviceName, String applicationLiveViewName,
        ApplicationLiveViewResourceInner applicationLiveViewResource);

    /**
     * Create the default Application Live View or update the existing Application Live View.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationLiveViewName The name of Application Live View.
     * @param applicationLiveViewResource Parameters for the update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of application Live View resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ApplicationLiveViewResourceInner>, ApplicationLiveViewResourceInner> beginCreateOrUpdate(
        String resourceGroupName, String serviceName, String applicationLiveViewName,
        ApplicationLiveViewResourceInner applicationLiveViewResource);

    /**
     * Create the default Application Live View or update the existing Application Live View.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationLiveViewName The name of Application Live View.
     * @param applicationLiveViewResource Parameters for the update operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of application Live View resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ApplicationLiveViewResourceInner>, ApplicationLiveViewResourceInner> beginCreateOrUpdate(
        String resourceGroupName, String serviceName, String applicationLiveViewName,
        ApplicationLiveViewResourceInner applicationLiveViewResource, Context context);

    /**
     * Create the default Application Live View or update the existing Application Live View.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationLiveViewName The name of Application Live View.
     * @param applicationLiveViewResource Parameters for the update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return application Live View resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ApplicationLiveViewResourceInner> createOrUpdateAsync(String resourceGroupName, String serviceName,
        String applicationLiveViewName, ApplicationLiveViewResourceInner applicationLiveViewResource);

    /**
     * Create the default Application Live View or update the existing Application Live View.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationLiveViewName The name of Application Live View.
     * @param applicationLiveViewResource Parameters for the update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return application Live View resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationLiveViewResourceInner createOrUpdate(String resourceGroupName, String serviceName,
        String applicationLiveViewName, ApplicationLiveViewResourceInner applicationLiveViewResource);

    /**
     * Create the default Application Live View or update the existing Application Live View.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationLiveViewName The name of Application Live View.
     * @param applicationLiveViewResource Parameters for the update operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return application Live View resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationLiveViewResourceInner createOrUpdate(String resourceGroupName, String serviceName,
        String applicationLiveViewName, ApplicationLiveViewResourceInner applicationLiveViewResource, Context context);

    /**
     * Disable the default Application Live View.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationLiveViewName The name of Application Live View.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String serviceName,
        String applicationLiveViewName);

    /**
     * Disable the default Application Live View.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationLiveViewName The name of Application Live View.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(String resourceGroupName, String serviceName,
        String applicationLiveViewName);

    /**
     * Disable the default Application Live View.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationLiveViewName The name of Application Live View.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String serviceName,
        String applicationLiveViewName);

    /**
     * Disable the default Application Live View.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationLiveViewName The name of Application Live View.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String serviceName,
        String applicationLiveViewName, Context context);

    /**
     * Disable the default Application Live View.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationLiveViewName The name of Application Live View.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String serviceName, String applicationLiveViewName);

    /**
     * Disable the default Application Live View.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationLiveViewName The name of Application Live View.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serviceName, String applicationLiveViewName);

    /**
     * Disable the default Application Live View.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param applicationLiveViewName The name of Application Live View.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serviceName, String applicationLiveViewName, Context context);
}
