// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloadssapvirtualinstance.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The resource name object where the specified values will be full resource names of the corresponding resources in a
 * single server SAP system.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "namingPatternType")
@JsonTypeName("FullResourceName")
@Fluent
public final class SingleServerFullResourceNames extends SingleServerCustomResourceNames {
    /*
     * The resource names object for virtual machine and related resources.
     */
    @JsonProperty(value = "virtualMachine")
    private VirtualMachineResourceNames virtualMachine;

    /**
     * Creates an instance of SingleServerFullResourceNames class.
     */
    public SingleServerFullResourceNames() {
    }

    /**
     * Get the virtualMachine property: The resource names object for virtual machine and related resources.
     * 
     * @return the virtualMachine value.
     */
    public VirtualMachineResourceNames virtualMachine() {
        return this.virtualMachine;
    }

    /**
     * Set the virtualMachine property: The resource names object for virtual machine and related resources.
     * 
     * @param virtualMachine the virtualMachine value to set.
     * @return the SingleServerFullResourceNames object itself.
     */
    public SingleServerFullResourceNames withVirtualMachine(VirtualMachineResourceNames virtualMachine) {
        this.virtualMachine = virtualMachine;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (virtualMachine() != null) {
            virtualMachine().validate();
        }
    }
}
