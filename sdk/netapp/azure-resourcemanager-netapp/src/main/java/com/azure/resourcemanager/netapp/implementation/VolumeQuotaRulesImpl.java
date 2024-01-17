// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.netapp.fluent.VolumeQuotaRulesClient;
import com.azure.resourcemanager.netapp.fluent.models.VolumeQuotaRuleInner;
import com.azure.resourcemanager.netapp.models.VolumeQuotaRule;
import com.azure.resourcemanager.netapp.models.VolumeQuotaRules;

public final class VolumeQuotaRulesImpl implements VolumeQuotaRules {
    private static final ClientLogger LOGGER = new ClientLogger(VolumeQuotaRulesImpl.class);

    private final VolumeQuotaRulesClient innerClient;

    private final com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager;

    public VolumeQuotaRulesImpl(VolumeQuotaRulesClient innerClient,
        com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<VolumeQuotaRule> listByVolume(String resourceGroupName, String accountName, String poolName,
        String volumeName) {
        PagedIterable<VolumeQuotaRuleInner> inner
            = this.serviceClient().listByVolume(resourceGroupName, accountName, poolName, volumeName);
        return Utils.mapPage(inner, inner1 -> new VolumeQuotaRuleImpl(inner1, this.manager()));
    }

    public PagedIterable<VolumeQuotaRule> listByVolume(String resourceGroupName, String accountName, String poolName,
        String volumeName, Context context) {
        PagedIterable<VolumeQuotaRuleInner> inner
            = this.serviceClient().listByVolume(resourceGroupName, accountName, poolName, volumeName, context);
        return Utils.mapPage(inner, inner1 -> new VolumeQuotaRuleImpl(inner1, this.manager()));
    }

    public Response<VolumeQuotaRule> getWithResponse(String resourceGroupName, String accountName, String poolName,
        String volumeName, String volumeQuotaRuleName, Context context) {
        Response<VolumeQuotaRuleInner> inner = this.serviceClient().getWithResponse(resourceGroupName, accountName,
            poolName, volumeName, volumeQuotaRuleName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new VolumeQuotaRuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public VolumeQuotaRule get(String resourceGroupName, String accountName, String poolName, String volumeName,
        String volumeQuotaRuleName) {
        VolumeQuotaRuleInner inner
            = this.serviceClient().get(resourceGroupName, accountName, poolName, volumeName, volumeQuotaRuleName);
        if (inner != null) {
            return new VolumeQuotaRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String accountName, String poolName, String volumeName,
        String volumeQuotaRuleName) {
        this.serviceClient().delete(resourceGroupName, accountName, poolName, volumeName, volumeQuotaRuleName);
    }

    public void delete(String resourceGroupName, String accountName, String poolName, String volumeName,
        String volumeQuotaRuleName, Context context) {
        this.serviceClient().delete(resourceGroupName, accountName, poolName, volumeName, volumeQuotaRuleName, context);
    }

    public VolumeQuotaRule getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "netAppAccounts");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'netAppAccounts'.", id)));
        }
        String poolName = Utils.getValueFromIdByName(id, "capacityPools");
        if (poolName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'capacityPools'.", id)));
        }
        String volumeName = Utils.getValueFromIdByName(id, "volumes");
        if (volumeName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'volumes'.", id)));
        }
        String volumeQuotaRuleName = Utils.getValueFromIdByName(id, "volumeQuotaRules");
        if (volumeQuotaRuleName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'volumeQuotaRules'.", id)));
        }
        return this
            .getWithResponse(resourceGroupName, accountName, poolName, volumeName, volumeQuotaRuleName, Context.NONE)
            .getValue();
    }

    public Response<VolumeQuotaRule> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "netAppAccounts");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'netAppAccounts'.", id)));
        }
        String poolName = Utils.getValueFromIdByName(id, "capacityPools");
        if (poolName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'capacityPools'.", id)));
        }
        String volumeName = Utils.getValueFromIdByName(id, "volumes");
        if (volumeName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'volumes'.", id)));
        }
        String volumeQuotaRuleName = Utils.getValueFromIdByName(id, "volumeQuotaRules");
        if (volumeQuotaRuleName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'volumeQuotaRules'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, poolName, volumeName, volumeQuotaRuleName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "netAppAccounts");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'netAppAccounts'.", id)));
        }
        String poolName = Utils.getValueFromIdByName(id, "capacityPools");
        if (poolName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'capacityPools'.", id)));
        }
        String volumeName = Utils.getValueFromIdByName(id, "volumes");
        if (volumeName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'volumes'.", id)));
        }
        String volumeQuotaRuleName = Utils.getValueFromIdByName(id, "volumeQuotaRules");
        if (volumeQuotaRuleName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'volumeQuotaRules'.", id)));
        }
        this.delete(resourceGroupName, accountName, poolName, volumeName, volumeQuotaRuleName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "netAppAccounts");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'netAppAccounts'.", id)));
        }
        String poolName = Utils.getValueFromIdByName(id, "capacityPools");
        if (poolName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'capacityPools'.", id)));
        }
        String volumeName = Utils.getValueFromIdByName(id, "volumes");
        if (volumeName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'volumes'.", id)));
        }
        String volumeQuotaRuleName = Utils.getValueFromIdByName(id, "volumeQuotaRules");
        if (volumeQuotaRuleName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'volumeQuotaRules'.", id)));
        }
        this.delete(resourceGroupName, accountName, poolName, volumeName, volumeQuotaRuleName, context);
    }

    private VolumeQuotaRulesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.netapp.NetAppFilesManager manager() {
        return this.serviceManager;
    }

    public VolumeQuotaRuleImpl define(String name) {
        return new VolumeQuotaRuleImpl(name, this.manager());
    }
}
