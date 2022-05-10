// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.appplatform.models.GatewayRouteConfigProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Spring Cloud Gateway route config resource. */
@Fluent
public final class GatewayRouteConfigResourceInner extends ProxyResource {
    /*
     * API route config of the Spring Cloud Gateway
     */
    @JsonProperty(value = "properties")
    private GatewayRouteConfigProperties properties;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the properties property: API route config of the Spring Cloud Gateway.
     *
     * @return the properties value.
     */
    public GatewayRouteConfigProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: API route config of the Spring Cloud Gateway.
     *
     * @param properties the properties value to set.
     * @return the GatewayRouteConfigResourceInner object itself.
     */
    public GatewayRouteConfigResourceInner withProperties(GatewayRouteConfigProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
