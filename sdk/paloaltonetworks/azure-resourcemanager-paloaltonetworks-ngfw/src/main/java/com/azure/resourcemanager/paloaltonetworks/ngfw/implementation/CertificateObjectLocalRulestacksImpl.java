// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.CertificateObjectLocalRulestacksClient;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.CertificateObjectLocalRulestackResourceInner;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.CertificateObjectLocalRulestackResource;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.CertificateObjectLocalRulestacks;

public final class CertificateObjectLocalRulestacksImpl implements CertificateObjectLocalRulestacks {
    private static final ClientLogger LOGGER = new ClientLogger(CertificateObjectLocalRulestacksImpl.class);

    private final CertificateObjectLocalRulestacksClient innerClient;

    private final com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager serviceManager;

    public CertificateObjectLocalRulestacksImpl(
        CertificateObjectLocalRulestacksClient innerClient,
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<CertificateObjectLocalRulestackResource> listByLocalRulestacks(
        String resourceGroupName, String localRulestackName) {
        PagedIterable<CertificateObjectLocalRulestackResourceInner> inner =
            this.serviceClient().listByLocalRulestacks(resourceGroupName, localRulestackName);
        return Utils.mapPage(inner, inner1 -> new CertificateObjectLocalRulestackResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<CertificateObjectLocalRulestackResource> listByLocalRulestacks(
        String resourceGroupName, String localRulestackName, Context context) {
        PagedIterable<CertificateObjectLocalRulestackResourceInner> inner =
            this.serviceClient().listByLocalRulestacks(resourceGroupName, localRulestackName, context);
        return Utils.mapPage(inner, inner1 -> new CertificateObjectLocalRulestackResourceImpl(inner1, this.manager()));
    }

    public Response<CertificateObjectLocalRulestackResource> getWithResponse(
        String resourceGroupName, String localRulestackName, String name, Context context) {
        Response<CertificateObjectLocalRulestackResourceInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, localRulestackName, name, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CertificateObjectLocalRulestackResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CertificateObjectLocalRulestackResource get(
        String resourceGroupName, String localRulestackName, String name) {
        CertificateObjectLocalRulestackResourceInner inner =
            this.serviceClient().get(resourceGroupName, localRulestackName, name);
        if (inner != null) {
            return new CertificateObjectLocalRulestackResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String localRulestackName, String name) {
        this.serviceClient().delete(resourceGroupName, localRulestackName, name);
    }

    public void delete(String resourceGroupName, String localRulestackName, String name, Context context) {
        this.serviceClient().delete(resourceGroupName, localRulestackName, name, context);
    }

    public CertificateObjectLocalRulestackResource getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String localRulestackName = Utils.getValueFromIdByName(id, "localRulestacks");
        if (localRulestackName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'localRulestacks'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "certificates");
        if (name == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'certificates'.", id)));
        }
        return this.getWithResponse(resourceGroupName, localRulestackName, name, Context.NONE).getValue();
    }

    public Response<CertificateObjectLocalRulestackResource> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String localRulestackName = Utils.getValueFromIdByName(id, "localRulestacks");
        if (localRulestackName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'localRulestacks'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "certificates");
        if (name == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'certificates'.", id)));
        }
        return this.getWithResponse(resourceGroupName, localRulestackName, name, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String localRulestackName = Utils.getValueFromIdByName(id, "localRulestacks");
        if (localRulestackName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'localRulestacks'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "certificates");
        if (name == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'certificates'.", id)));
        }
        this.delete(resourceGroupName, localRulestackName, name, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String localRulestackName = Utils.getValueFromIdByName(id, "localRulestacks");
        if (localRulestackName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'localRulestacks'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "certificates");
        if (name == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'certificates'.", id)));
        }
        this.delete(resourceGroupName, localRulestackName, name, context);
    }

    private CertificateObjectLocalRulestacksClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager() {
        return this.serviceManager;
    }

    public CertificateObjectLocalRulestackResourceImpl define(String name) {
        return new CertificateObjectLocalRulestackResourceImpl(name, this.manager());
    }
}
