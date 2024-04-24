// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.quota.fluent.GroupQuotasClient;
import com.azure.resourcemanager.quota.fluent.models.GroupQuotasEntityInner;
import com.azure.resourcemanager.quota.models.GroupQuotas;
import com.azure.resourcemanager.quota.models.GroupQuotasEntity;
import com.azure.resourcemanager.quota.models.GroupQuotasEntityPatch;

public final class GroupQuotasImpl implements GroupQuotas {
    private static final ClientLogger LOGGER = new ClientLogger(GroupQuotasImpl.class);

    private final GroupQuotasClient innerClient;

    private final com.azure.resourcemanager.quota.QuotaManager serviceManager;

    public GroupQuotasImpl(GroupQuotasClient innerClient, com.azure.resourcemanager.quota.QuotaManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ProxyResource createOrUpdate(String managementGroupId, String groupQuotaName) {
        return this.serviceClient().createOrUpdate(managementGroupId, groupQuotaName);
    }

    public ProxyResource createOrUpdate(String managementGroupId, String groupQuotaName,
        GroupQuotasEntityInner groupQuotaPutRequestBody, Context context) {
        return this.serviceClient()
            .createOrUpdate(managementGroupId, groupQuotaName, groupQuotaPutRequestBody, context);
    }

    public GroupQuotasEntity update(String managementGroupId, String groupQuotaName) {
        GroupQuotasEntityInner inner = this.serviceClient().update(managementGroupId, groupQuotaName);
        if (inner != null) {
            return new GroupQuotasEntityImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public GroupQuotasEntity update(String managementGroupId, String groupQuotaName,
        GroupQuotasEntityPatch groupQuotasPatchRequestBody, Context context) {
        GroupQuotasEntityInner inner
            = this.serviceClient().update(managementGroupId, groupQuotaName, groupQuotasPatchRequestBody, context);
        if (inner != null) {
            return new GroupQuotasEntityImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<GroupQuotasEntity> getWithResponse(String managementGroupId, String groupQuotaName,
        Context context) {
        Response<GroupQuotasEntityInner> inner
            = this.serviceClient().getWithResponse(managementGroupId, groupQuotaName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new GroupQuotasEntityImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public GroupQuotasEntity get(String managementGroupId, String groupQuotaName) {
        GroupQuotasEntityInner inner = this.serviceClient().get(managementGroupId, groupQuotaName);
        if (inner != null) {
            return new GroupQuotasEntityImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String managementGroupId, String groupQuotaName) {
        this.serviceClient().delete(managementGroupId, groupQuotaName);
    }

    public void delete(String managementGroupId, String groupQuotaName, Context context) {
        this.serviceClient().delete(managementGroupId, groupQuotaName, context);
    }

    public PagedIterable<GroupQuotasEntity> list(String managementGroupId) {
        PagedIterable<GroupQuotasEntityInner> inner = this.serviceClient().list(managementGroupId);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new GroupQuotasEntityImpl(inner1, this.manager()));
    }

    public PagedIterable<GroupQuotasEntity> list(String managementGroupId, Context context) {
        PagedIterable<GroupQuotasEntityInner> inner = this.serviceClient().list(managementGroupId, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new GroupQuotasEntityImpl(inner1, this.manager()));
    }

    private GroupQuotasClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.quota.QuotaManager manager() {
        return this.serviceManager;
    }
}
