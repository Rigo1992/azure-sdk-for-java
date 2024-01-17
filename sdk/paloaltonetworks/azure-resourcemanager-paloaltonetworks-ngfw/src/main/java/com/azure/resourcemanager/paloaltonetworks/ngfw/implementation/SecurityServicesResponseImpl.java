// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.implementation;

import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.SecurityServicesResponseInner;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.SecurityServicesResponse;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.SecurityServicesTypeList;

public final class SecurityServicesResponseImpl implements SecurityServicesResponse {
    private SecurityServicesResponseInner innerObject;

    private final com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager serviceManager;

    SecurityServicesResponseImpl(SecurityServicesResponseInner innerObject,
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public SecurityServicesTypeList value() {
        return this.innerModel().value();
    }

    public String nextLink() {
        return this.innerModel().nextLink();
    }

    public SecurityServicesResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager() {
        return this.serviceManager;
    }
}
