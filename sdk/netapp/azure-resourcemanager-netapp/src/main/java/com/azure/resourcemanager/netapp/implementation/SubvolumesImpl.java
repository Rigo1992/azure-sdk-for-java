// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.netapp.fluent.SubvolumesClient;
import com.azure.resourcemanager.netapp.fluent.models.SubvolumeInfoInner;
import com.azure.resourcemanager.netapp.fluent.models.SubvolumeModelInner;
import com.azure.resourcemanager.netapp.models.SubvolumeInfo;
import com.azure.resourcemanager.netapp.models.SubvolumeModel;
import com.azure.resourcemanager.netapp.models.Subvolumes;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class SubvolumesImpl implements Subvolumes {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SubvolumesImpl.class);

    private final SubvolumesClient innerClient;

    private final com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager;

    public SubvolumesImpl(
        SubvolumesClient innerClient, com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<SubvolumeInfo> listByVolume(
        String resourceGroupName, String accountName, String poolName, String volumeName) {
        PagedIterable<SubvolumeInfoInner> inner =
            this.serviceClient().listByVolume(resourceGroupName, accountName, poolName, volumeName);
        return Utils.mapPage(inner, inner1 -> new SubvolumeInfoImpl(inner1, this.manager()));
    }

    public PagedIterable<SubvolumeInfo> listByVolume(
        String resourceGroupName, String accountName, String poolName, String volumeName, Context context) {
        PagedIterable<SubvolumeInfoInner> inner =
            this.serviceClient().listByVolume(resourceGroupName, accountName, poolName, volumeName, context);
        return Utils.mapPage(inner, inner1 -> new SubvolumeInfoImpl(inner1, this.manager()));
    }

    public SubvolumeInfo get(
        String resourceGroupName, String accountName, String poolName, String volumeName, String subvolumeName) {
        SubvolumeInfoInner inner =
            this.serviceClient().get(resourceGroupName, accountName, poolName, volumeName, subvolumeName);
        if (inner != null) {
            return new SubvolumeInfoImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SubvolumeInfo> getWithResponse(
        String resourceGroupName,
        String accountName,
        String poolName,
        String volumeName,
        String subvolumeName,
        Context context) {
        Response<SubvolumeInfoInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, accountName, poolName, volumeName, subvolumeName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SubvolumeInfoImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(
        String resourceGroupName, String accountName, String poolName, String volumeName, String subvolumeName) {
        this.serviceClient().delete(resourceGroupName, accountName, poolName, volumeName, subvolumeName);
    }

    public void delete(
        String resourceGroupName,
        String accountName,
        String poolName,
        String volumeName,
        String subvolumeName,
        Context context) {
        this.serviceClient().delete(resourceGroupName, accountName, poolName, volumeName, subvolumeName, context);
    }

    public SubvolumeModel getMetadata(
        String resourceGroupName, String accountName, String poolName, String volumeName, String subvolumeName) {
        SubvolumeModelInner inner =
            this.serviceClient().getMetadata(resourceGroupName, accountName, poolName, volumeName, subvolumeName);
        if (inner != null) {
            return new SubvolumeModelImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public SubvolumeModel getMetadata(
        String resourceGroupName,
        String accountName,
        String poolName,
        String volumeName,
        String subvolumeName,
        Context context) {
        SubvolumeModelInner inner =
            this
                .serviceClient()
                .getMetadata(resourceGroupName, accountName, poolName, volumeName, subvolumeName, context);
        if (inner != null) {
            return new SubvolumeModelImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public SubvolumeInfo getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "netAppAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'netAppAccounts'.", id)));
        }
        String poolName = Utils.getValueFromIdByName(id, "capacityPools");
        if (poolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'capacityPools'.", id)));
        }
        String volumeName = Utils.getValueFromIdByName(id, "volumes");
        if (volumeName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'volumes'.", id)));
        }
        String subvolumeName = Utils.getValueFromIdByName(id, "subvolumes");
        if (subvolumeName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'subvolumes'.", id)));
        }
        return this
            .getWithResponse(resourceGroupName, accountName, poolName, volumeName, subvolumeName, Context.NONE)
            .getValue();
    }

    public Response<SubvolumeInfo> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "netAppAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'netAppAccounts'.", id)));
        }
        String poolName = Utils.getValueFromIdByName(id, "capacityPools");
        if (poolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'capacityPools'.", id)));
        }
        String volumeName = Utils.getValueFromIdByName(id, "volumes");
        if (volumeName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'volumes'.", id)));
        }
        String subvolumeName = Utils.getValueFromIdByName(id, "subvolumes");
        if (subvolumeName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'subvolumes'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, poolName, volumeName, subvolumeName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "netAppAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'netAppAccounts'.", id)));
        }
        String poolName = Utils.getValueFromIdByName(id, "capacityPools");
        if (poolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'capacityPools'.", id)));
        }
        String volumeName = Utils.getValueFromIdByName(id, "volumes");
        if (volumeName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'volumes'.", id)));
        }
        String subvolumeName = Utils.getValueFromIdByName(id, "subvolumes");
        if (subvolumeName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'subvolumes'.", id)));
        }
        this.delete(resourceGroupName, accountName, poolName, volumeName, subvolumeName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "netAppAccounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'netAppAccounts'.", id)));
        }
        String poolName = Utils.getValueFromIdByName(id, "capacityPools");
        if (poolName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'capacityPools'.", id)));
        }
        String volumeName = Utils.getValueFromIdByName(id, "volumes");
        if (volumeName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'volumes'.", id)));
        }
        String subvolumeName = Utils.getValueFromIdByName(id, "subvolumes");
        if (subvolumeName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'subvolumes'.", id)));
        }
        this.delete(resourceGroupName, accountName, poolName, volumeName, subvolumeName, context);
    }

    private SubvolumesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.netapp.NetAppFilesManager manager() {
        return this.serviceManager;
    }

    public SubvolumeInfoImpl define(String name) {
        return new SubvolumeInfoImpl(name, this.manager());
    }
}
