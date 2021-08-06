// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of IotAlerts. */
public interface IotAlerts {
    /**
     * List IoT alerts.
     *
     * @param scope Scope of the query: Subscription (i.e. /subscriptions/{subscriptionId}) or IoT Hub (i.e.
     *     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Devices/iotHubs/{iotHubName}).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of IoT alerts.
     */
    PagedIterable<IotAlertModel> list(String scope);

    /**
     * List IoT alerts.
     *
     * @param scope Scope of the query: Subscription (i.e. /subscriptions/{subscriptionId}) or IoT Hub (i.e.
     *     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Devices/iotHubs/{iotHubName}).
     * @param minStartTimeUtc Filter by minimum startTimeUtc (ISO 8601 format).
     * @param maxStartTimeUtc Filter by maximum startTimeUtc (ISO 8601 format).
     * @param alertType Filter by alert type.
     * @param deviceManagementType Get devices only from specific type, Managed or Unmanaged.
     * @param compromisedEntity Filter by compromised device.
     * @param limit Limit the number of items returned in a single page.
     * @param skipToken Skip token used for pagination.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of IoT alerts.
     */
    PagedIterable<IotAlertModel> list(
        String scope,
        String minStartTimeUtc,
        String maxStartTimeUtc,
        String alertType,
        ManagementState deviceManagementType,
        String compromisedEntity,
        Integer limit,
        String skipToken,
        Context context);

    /**
     * Get IoT alert.
     *
     * @param scope Scope of the query: Subscription (i.e. /subscriptions/{subscriptionId}) or IoT Hub (i.e.
     *     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Devices/iotHubs/{iotHubName}).
     * @param iotAlertId Id of the alert.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ioT alert.
     */
    IotAlertModel get(String scope, String iotAlertId);

    /**
     * Get IoT alert.
     *
     * @param scope Scope of the query: Subscription (i.e. /subscriptions/{subscriptionId}) or IoT Hub (i.e.
     *     /subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Devices/iotHubs/{iotHubName}).
     * @param iotAlertId Id of the alert.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ioT alert.
     */
    Response<IotAlertModel> getWithResponse(String scope, String iotAlertId, Context context);
}
