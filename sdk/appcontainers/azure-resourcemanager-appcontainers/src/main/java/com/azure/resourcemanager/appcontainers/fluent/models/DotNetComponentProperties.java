// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appcontainers.models.DotNetComponentConfigurationProperty;
import com.azure.resourcemanager.appcontainers.models.DotNetComponentProvisioningState;
import com.azure.resourcemanager.appcontainers.models.DotNetComponentServiceBind;
import com.azure.resourcemanager.appcontainers.models.DotNetComponentType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * .NET Component resource specific properties.
 */
@Fluent
public final class DotNetComponentProperties {
    /*
     * Type of the .NET Component.
     */
    @JsonProperty(value = "componentType")
    private DotNetComponentType componentType;

    /*
     * Provisioning state of the .NET Component.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private DotNetComponentProvisioningState provisioningState;

    /*
     * List of .NET Components configuration properties
     */
    @JsonProperty(value = "configurations")
    private List<DotNetComponentConfigurationProperty> configurations;

    /*
     * List of .NET Components that are bound to the .NET component
     */
    @JsonProperty(value = "serviceBinds")
    private List<DotNetComponentServiceBind> serviceBinds;

    /**
     * Creates an instance of DotNetComponentProperties class.
     */
    public DotNetComponentProperties() {
    }

    /**
     * Get the componentType property: Type of the .NET Component.
     * 
     * @return the componentType value.
     */
    public DotNetComponentType componentType() {
        return this.componentType;
    }

    /**
     * Set the componentType property: Type of the .NET Component.
     * 
     * @param componentType the componentType value to set.
     * @return the DotNetComponentProperties object itself.
     */
    public DotNetComponentProperties withComponentType(DotNetComponentType componentType) {
        this.componentType = componentType;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the .NET Component.
     * 
     * @return the provisioningState value.
     */
    public DotNetComponentProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the configurations property: List of .NET Components configuration properties.
     * 
     * @return the configurations value.
     */
    public List<DotNetComponentConfigurationProperty> configurations() {
        return this.configurations;
    }

    /**
     * Set the configurations property: List of .NET Components configuration properties.
     * 
     * @param configurations the configurations value to set.
     * @return the DotNetComponentProperties object itself.
     */
    public DotNetComponentProperties withConfigurations(List<DotNetComponentConfigurationProperty> configurations) {
        this.configurations = configurations;
        return this;
    }

    /**
     * Get the serviceBinds property: List of .NET Components that are bound to the .NET component.
     * 
     * @return the serviceBinds value.
     */
    public List<DotNetComponentServiceBind> serviceBinds() {
        return this.serviceBinds;
    }

    /**
     * Set the serviceBinds property: List of .NET Components that are bound to the .NET component.
     * 
     * @param serviceBinds the serviceBinds value to set.
     * @return the DotNetComponentProperties object itself.
     */
    public DotNetComponentProperties withServiceBinds(List<DotNetComponentServiceBind> serviceBinds) {
        this.serviceBinds = serviceBinds;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (configurations() != null) {
            configurations().forEach(e -> e.validate());
        }
        if (serviceBinds() != null) {
            serviceBinds().forEach(e -> e.validate());
        }
    }
}
