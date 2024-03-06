// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.netapp.fluent.AccountsClient;
import com.azure.resourcemanager.netapp.fluent.models.NetAppAccountInner;
import com.azure.resourcemanager.netapp.models.Accounts;
import com.azure.resourcemanager.netapp.models.EncryptionMigrationRequest;
import com.azure.resourcemanager.netapp.models.NetAppAccount;

public final class AccountsImpl implements Accounts {
    private static final ClientLogger LOGGER = new ClientLogger(AccountsImpl.class);

    private final AccountsClient innerClient;

    private final com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager;

    public AccountsImpl(AccountsClient innerClient,
        com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<NetAppAccount> list() {
        PagedIterable<NetAppAccountInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new NetAppAccountImpl(inner1, this.manager()));
    }

    public PagedIterable<NetAppAccount> list(Context context) {
        PagedIterable<NetAppAccountInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new NetAppAccountImpl(inner1, this.manager()));
    }

    public PagedIterable<NetAppAccount> listByResourceGroup(String resourceGroupName) {
        PagedIterable<NetAppAccountInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new NetAppAccountImpl(inner1, this.manager()));
    }

    public PagedIterable<NetAppAccount> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<NetAppAccountInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new NetAppAccountImpl(inner1, this.manager()));
    }

    public Response<NetAppAccount> getByResourceGroupWithResponse(String resourceGroupName, String accountName,
        Context context) {
        Response<NetAppAccountInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, accountName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new NetAppAccountImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public NetAppAccount getByResourceGroup(String resourceGroupName, String accountName) {
        NetAppAccountInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, accountName);
        if (inner != null) {
            return new NetAppAccountImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String accountName) {
        this.serviceClient().delete(resourceGroupName, accountName);
    }

    public void delete(String resourceGroupName, String accountName, Context context) {
        this.serviceClient().delete(resourceGroupName, accountName, context);
    }

    public void renewCredentials(String resourceGroupName, String accountName) {
        this.serviceClient().renewCredentials(resourceGroupName, accountName);
    }

    public void renewCredentials(String resourceGroupName, String accountName, Context context) {
        this.serviceClient().renewCredentials(resourceGroupName, accountName, context);
    }

    public void migrateEncryptionKey(String resourceGroupName, String accountName) {
        this.serviceClient().migrateEncryptionKey(resourceGroupName, accountName);
    }

    public void migrateEncryptionKey(String resourceGroupName, String accountName, EncryptionMigrationRequest body,
        Context context) {
        this.serviceClient().migrateEncryptionKey(resourceGroupName, accountName, body, context);
    }

    public NetAppAccount getById(String id) {
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
        return this.getByResourceGroupWithResponse(resourceGroupName, accountName, Context.NONE).getValue();
    }

    public Response<NetAppAccount> getByIdWithResponse(String id, Context context) {
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
        return this.getByResourceGroupWithResponse(resourceGroupName, accountName, context);
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
        this.delete(resourceGroupName, accountName, Context.NONE);
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
        this.delete(resourceGroupName, accountName, context);
    }

    private AccountsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.netapp.NetAppFilesManager manager() {
        return this.serviceManager;
    }

    public NetAppAccountImpl define(String name) {
        return new NetAppAccountImpl(name, this.manager());
    }
}
