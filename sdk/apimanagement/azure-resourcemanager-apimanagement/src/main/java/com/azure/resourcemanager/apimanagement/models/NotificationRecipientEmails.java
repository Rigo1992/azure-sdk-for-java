// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of NotificationRecipientEmails. */
public interface NotificationRecipientEmails {
    /**
     * Gets the list of the Notification Recipient Emails subscribed to a notification.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param notificationName Notification Name Identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of the Notification Recipient Emails subscribed to a notification.
     */
    RecipientEmailCollection listByNotification(
        String resourceGroupName, String serviceName, NotificationName notificationName);

    /**
     * Gets the list of the Notification Recipient Emails subscribed to a notification.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param notificationName Notification Name Identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of the Notification Recipient Emails subscribed to a notification.
     */
    Response<RecipientEmailCollection> listByNotificationWithResponse(
        String resourceGroupName, String serviceName, NotificationName notificationName, Context context);

    /**
     * Determine if Notification Recipient Email subscribed to the notification.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param notificationName Notification Name Identifier.
     * @param email Email identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return whether resource exists.
     */
    boolean checkEntityExists(
        String resourceGroupName, String serviceName, NotificationName notificationName, String email);

    /**
     * Determine if Notification Recipient Email subscribed to the notification.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param notificationName Notification Name Identifier.
     * @param email Email identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Boolean> checkEntityExistsWithResponse(
        String resourceGroupName, String serviceName, NotificationName notificationName, String email, Context context);

    /**
     * Adds the Email address to the list of Recipients for the Notification.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param notificationName Notification Name Identifier.
     * @param email Email identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return recipient Email details.
     */
    RecipientEmailContract createOrUpdate(
        String resourceGroupName, String serviceName, NotificationName notificationName, String email);

    /**
     * Adds the Email address to the list of Recipients for the Notification.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param notificationName Notification Name Identifier.
     * @param email Email identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return recipient Email details.
     */
    Response<RecipientEmailContract> createOrUpdateWithResponse(
        String resourceGroupName, String serviceName, NotificationName notificationName, String email, Context context);

    /**
     * Removes the email from the list of Notification.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param notificationName Notification Name Identifier.
     * @param email Email identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String serviceName, NotificationName notificationName, String email);

    /**
     * Removes the email from the list of Notification.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param notificationName Notification Name Identifier.
     * @param email Email identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String serviceName, NotificationName notificationName, String email, Context context);
}
