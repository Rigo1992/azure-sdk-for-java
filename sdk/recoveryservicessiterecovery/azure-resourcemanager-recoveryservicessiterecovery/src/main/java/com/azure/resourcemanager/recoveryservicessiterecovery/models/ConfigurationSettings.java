// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Replication provider specific settings.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "instanceType",
    defaultImpl = ConfigurationSettings.class)
@JsonTypeName("ConfigurationSettings")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "HyperVVirtualMachine", value = HyperVVirtualMachineDetails.class),
    @JsonSubTypes.Type(name = "ReplicationGroupDetails", value = ReplicationGroupDetails.class),
    @JsonSubTypes.Type(name = "VMwareVirtualMachine", value = VMwareVirtualMachineDetails.class) })
@Immutable
public class ConfigurationSettings {
    /**
     * Creates an instance of ConfigurationSettings class.
     */
    public ConfigurationSettings() {
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
