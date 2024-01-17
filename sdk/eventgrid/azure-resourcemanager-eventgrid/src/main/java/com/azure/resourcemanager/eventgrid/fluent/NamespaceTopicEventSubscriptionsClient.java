// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.eventgrid.fluent.models.DeliveryAttributeListResultInner;
import com.azure.resourcemanager.eventgrid.fluent.models.SubscriptionInner;
import com.azure.resourcemanager.eventgrid.models.SubscriptionUpdateParameters;

/**
 * An instance of this class provides access to all the operations defined in NamespaceTopicEventSubscriptionsClient.
 */
public interface NamespaceTopicEventSubscriptionsClient {
    /**
     * Get an event subscription of a namespace topic.
     * 
     * Get properties of an event subscription of a namespace topic.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the namespace topic.
     * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be
     * between 3 and 100 characters in length and use alphanumeric letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of an event subscription of a namespace topic along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SubscriptionInner> getWithResponse(String resourceGroupName, String namespaceName, String topicName,
        String eventSubscriptionName, Context context);

    /**
     * Get an event subscription of a namespace topic.
     * 
     * Get properties of an event subscription of a namespace topic.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the namespace topic.
     * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be
     * between 3 and 100 characters in length and use alphanumeric letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of an event subscription of a namespace topic.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SubscriptionInner get(String resourceGroupName, String namespaceName, String topicName,
        String eventSubscriptionName);

    /**
     * Create or update an event subscription of a namespace topic.
     * 
     * Asynchronously creates or updates an event subscription of a namespace topic with the specified parameters.
     * Existing event subscriptions will be updated with this API.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the namespace topic.
     * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be
     * between 3 and 100 characters in length and use alphanumeric letters only.
     * @param eventSubscriptionInfo Event subscription properties containing the delivery mode, filter information, and
     * others.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of event Subscription.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SubscriptionInner>, SubscriptionInner> beginCreateOrUpdate(String resourceGroupName,
        String namespaceName, String topicName, String eventSubscriptionName, SubscriptionInner eventSubscriptionInfo);

    /**
     * Create or update an event subscription of a namespace topic.
     * 
     * Asynchronously creates or updates an event subscription of a namespace topic with the specified parameters.
     * Existing event subscriptions will be updated with this API.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the namespace topic.
     * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be
     * between 3 and 100 characters in length and use alphanumeric letters only.
     * @param eventSubscriptionInfo Event subscription properties containing the delivery mode, filter information, and
     * others.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of event Subscription.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SubscriptionInner>, SubscriptionInner> beginCreateOrUpdate(String resourceGroupName,
        String namespaceName, String topicName, String eventSubscriptionName, SubscriptionInner eventSubscriptionInfo,
        Context context);

    /**
     * Create or update an event subscription of a namespace topic.
     * 
     * Asynchronously creates or updates an event subscription of a namespace topic with the specified parameters.
     * Existing event subscriptions will be updated with this API.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the namespace topic.
     * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be
     * between 3 and 100 characters in length and use alphanumeric letters only.
     * @param eventSubscriptionInfo Event subscription properties containing the delivery mode, filter information, and
     * others.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return event Subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SubscriptionInner createOrUpdate(String resourceGroupName, String namespaceName, String topicName,
        String eventSubscriptionName, SubscriptionInner eventSubscriptionInfo);

    /**
     * Create or update an event subscription of a namespace topic.
     * 
     * Asynchronously creates or updates an event subscription of a namespace topic with the specified parameters.
     * Existing event subscriptions will be updated with this API.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the namespace topic.
     * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be
     * between 3 and 100 characters in length and use alphanumeric letters only.
     * @param eventSubscriptionInfo Event subscription properties containing the delivery mode, filter information, and
     * others.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return event Subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SubscriptionInner createOrUpdate(String resourceGroupName, String namespaceName, String topicName,
        String eventSubscriptionName, SubscriptionInner eventSubscriptionInfo, Context context);

    /**
     * Delete an event subscription of a namespace topic.
     * 
     * Delete an existing event subscription of a namespace topic.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the namespace topic.
     * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be
     * between 3 and 100 characters in length and use alphanumeric letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String namespaceName, String topicName,
        String eventSubscriptionName);

    /**
     * Delete an event subscription of a namespace topic.
     * 
     * Delete an existing event subscription of a namespace topic.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the namespace topic.
     * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be
     * between 3 and 100 characters in length and use alphanumeric letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String namespaceName, String topicName,
        String eventSubscriptionName, Context context);

    /**
     * Delete an event subscription of a namespace topic.
     * 
     * Delete an existing event subscription of a namespace topic.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the namespace topic.
     * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be
     * between 3 and 100 characters in length and use alphanumeric letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String namespaceName, String topicName, String eventSubscriptionName);

    /**
     * Delete an event subscription of a namespace topic.
     * 
     * Delete an existing event subscription of a namespace topic.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the namespace topic.
     * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be
     * between 3 and 100 characters in length and use alphanumeric letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String namespaceName, String topicName, String eventSubscriptionName,
        Context context);

    /**
     * Update event subscription of a namespace topic.
     * 
     * Update an existing event subscription of a namespace topic.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the namespace topic.
     * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be
     * between 3 and 100 characters in length and use alphanumeric letters only.
     * @param eventSubscriptionUpdateParameters Updated event subscription information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of event Subscription.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SubscriptionInner>, SubscriptionInner> beginUpdate(String resourceGroupName,
        String namespaceName, String topicName, String eventSubscriptionName,
        SubscriptionUpdateParameters eventSubscriptionUpdateParameters);

    /**
     * Update event subscription of a namespace topic.
     * 
     * Update an existing event subscription of a namespace topic.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the namespace topic.
     * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be
     * between 3 and 100 characters in length and use alphanumeric letters only.
     * @param eventSubscriptionUpdateParameters Updated event subscription information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of event Subscription.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SubscriptionInner>, SubscriptionInner> beginUpdate(String resourceGroupName,
        String namespaceName, String topicName, String eventSubscriptionName,
        SubscriptionUpdateParameters eventSubscriptionUpdateParameters, Context context);

    /**
     * Update event subscription of a namespace topic.
     * 
     * Update an existing event subscription of a namespace topic.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the namespace topic.
     * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be
     * between 3 and 100 characters in length and use alphanumeric letters only.
     * @param eventSubscriptionUpdateParameters Updated event subscription information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return event Subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SubscriptionInner update(String resourceGroupName, String namespaceName, String topicName,
        String eventSubscriptionName, SubscriptionUpdateParameters eventSubscriptionUpdateParameters);

    /**
     * Update event subscription of a namespace topic.
     * 
     * Update an existing event subscription of a namespace topic.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the namespace topic.
     * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be
     * between 3 and 100 characters in length and use alphanumeric letters only.
     * @param eventSubscriptionUpdateParameters Updated event subscription information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return event Subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SubscriptionInner update(String resourceGroupName, String namespaceName, String topicName,
        String eventSubscriptionName, SubscriptionUpdateParameters eventSubscriptionUpdateParameters, Context context);

    /**
     * List event subscriptions of a namespace topic.
     * 
     * List event subscriptions that belong to a specific namespace topic.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the namespace topic.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List event subscriptions operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SubscriptionInner> listByNamespaceTopic(String resourceGroupName, String namespaceName,
        String topicName);

    /**
     * List event subscriptions of a namespace topic.
     * 
     * List event subscriptions that belong to a specific namespace topic.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the namespace topic.
     * @param filter The query used to filter the search results using OData syntax. Filtering is permitted on the
     * 'name' property only and with limited number of OData operations. These operations are: the 'contains' function
     * as well as the following logical operations: not, and, or, eq (for equal), and ne (for not equal). No arithmetic
     * operations are supported. The following is a valid filter example: $filter=contains(namE, 'PATTERN') and name ne
     * 'PATTERN-1'. The following is not a valid filter example: $filter=location eq 'westus'.
     * @param top The number of results to return per page for the list operation. Valid range for top parameter is 1 to
     * 100. If not specified, the default number of results to be returned is 20 items per page.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List event subscriptions operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SubscriptionInner> listByNamespaceTopic(String resourceGroupName, String namespaceName,
        String topicName, String filter, Integer top, Context context);

    /**
     * Get delivery attributes for an event subscription of a namespace topic.
     * 
     * Get all delivery attributes for an event subscription of a namespace topic.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the namespace topic.
     * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be
     * between 3 and 100 characters in length and use alphanumeric letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all delivery attributes for an event subscription of a namespace topic along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DeliveryAttributeListResultInner> getDeliveryAttributesWithResponse(String resourceGroupName,
        String namespaceName, String topicName, String eventSubscriptionName, Context context);

    /**
     * Get delivery attributes for an event subscription of a namespace topic.
     * 
     * Get all delivery attributes for an event subscription of a namespace topic.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param topicName Name of the namespace topic.
     * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be
     * between 3 and 100 characters in length and use alphanumeric letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all delivery attributes for an event subscription of a namespace topic.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DeliveryAttributeListResultInner getDeliveryAttributes(String resourceGroupName, String namespaceName,
        String topicName, String eventSubscriptionName);
}
