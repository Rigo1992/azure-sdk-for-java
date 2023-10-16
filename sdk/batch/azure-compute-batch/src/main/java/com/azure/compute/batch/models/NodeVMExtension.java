// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The configuration for virtual machine extension instance view. */
@Immutable
public final class NodeVMExtension {

    /*
     * The provisioning state of the virtual machine extension.
     */
    @Generated
    @JsonProperty(value = "provisioningState")
    private String provisioningState;

    /*
     * The virtual machine extension.
     */
    @Generated
    @JsonProperty(value = "vmExtension")
    private VMExtension vmExtension;

    /*
     * The vm extension instance view.
     */
    @Generated
    @JsonProperty(value = "instanceView")
    private VMExtensionInstanceView instanceView;

    /** Creates an instance of NodeVMExtension class. */
    @Generated
    private NodeVMExtension() {}

    /**
     * Get the provisioningState property: The provisioning state of the virtual machine extension.
     *
     * @return the provisioningState value.
     */
    @Generated
    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the vmExtension property: The virtual machine extension.
     *
     * @return the vmExtension value.
     */
    @Generated
    public VMExtension getVmExtension() {
        return this.vmExtension;
    }

    /**
     * Get the instanceView property: The vm extension instance view.
     *
     * @return the instanceView value.
     */
    @Generated
    public VMExtensionInstanceView getInstanceView() {
        return this.instanceView;
    }
}
