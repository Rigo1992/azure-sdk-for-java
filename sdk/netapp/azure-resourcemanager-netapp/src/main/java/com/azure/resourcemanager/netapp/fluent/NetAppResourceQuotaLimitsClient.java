// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.netapp.fluent.models.SubscriptionQuotaItemInner;

/** An instance of this class provides access to all the operations defined in NetAppResourceQuotaLimitsClient. */
public interface NetAppResourceQuotaLimitsClient {
    /**
     * Get the default and current limits for quotas.
     *
     * @param location The location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default and current limits for quotas as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SubscriptionQuotaItemInner> list(String location);

    /**
     * Get the default and current limits for quotas.
     *
     * @param location The location.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default and current limits for quotas as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SubscriptionQuotaItemInner> list(String location, Context context);

    /**
     * Get the default and current subscription quota limit.
     *
     * @param location The location.
     * @param quotaLimitName The name of the Quota Limit.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default and current subscription quota limit.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SubscriptionQuotaItemInner get(String location, String quotaLimitName);

    /**
     * Get the default and current subscription quota limit.
     *
     * @param location The location.
     * @param quotaLimitName The name of the Quota Limit.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default and current subscription quota limit along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SubscriptionQuotaItemInner> getWithResponse(String location, String quotaLimitName, Context context);
}
