// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.quota.fluent.GroupQuotaSubscriptionRequestsClient;
import com.azure.resourcemanager.quota.fluent.models.GroupQuotaSubscriptionRequestStatusInner;
import com.azure.resourcemanager.quota.models.GroupQuotaSubscriptionRequests;
import com.azure.resourcemanager.quota.models.GroupQuotaSubscriptionRequestStatus;

public final class GroupQuotaSubscriptionRequestsImpl implements GroupQuotaSubscriptionRequests {
    private static final ClientLogger LOGGER = new ClientLogger(GroupQuotaSubscriptionRequestsImpl.class);

    private final GroupQuotaSubscriptionRequestsClient innerClient;

    private final com.azure.resourcemanager.quota.QuotaManager serviceManager;

    public GroupQuotaSubscriptionRequestsImpl(GroupQuotaSubscriptionRequestsClient innerClient,
        com.azure.resourcemanager.quota.QuotaManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<GroupQuotaSubscriptionRequestStatus> list(String managementGroupId, String groupQuotaName) {
        PagedIterable<GroupQuotaSubscriptionRequestStatusInner> inner
            = this.serviceClient().list(managementGroupId, groupQuotaName);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new GroupQuotaSubscriptionRequestStatusImpl(inner1, this.manager()));
    }

    public PagedIterable<GroupQuotaSubscriptionRequestStatus> list(String managementGroupId, String groupQuotaName,
        Context context) {
        PagedIterable<GroupQuotaSubscriptionRequestStatusInner> inner
            = this.serviceClient().list(managementGroupId, groupQuotaName, context);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new GroupQuotaSubscriptionRequestStatusImpl(inner1, this.manager()));
    }

    public Response<GroupQuotaSubscriptionRequestStatus> getWithResponse(String managementGroupId,
        String groupQuotaName, String requestId, Context context) {
        Response<GroupQuotaSubscriptionRequestStatusInner> inner
            = this.serviceClient().getWithResponse(managementGroupId, groupQuotaName, requestId, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new GroupQuotaSubscriptionRequestStatusImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public GroupQuotaSubscriptionRequestStatus get(String managementGroupId, String groupQuotaName, String requestId) {
        GroupQuotaSubscriptionRequestStatusInner inner
            = this.serviceClient().get(managementGroupId, groupQuotaName, requestId);
        if (inner != null) {
            return new GroupQuotaSubscriptionRequestStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private GroupQuotaSubscriptionRequestsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.quota.QuotaManager manager() {
        return this.serviceManager;
    }
}
