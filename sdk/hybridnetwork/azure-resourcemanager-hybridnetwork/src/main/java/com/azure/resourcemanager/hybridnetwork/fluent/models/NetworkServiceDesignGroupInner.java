// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.hybridnetwork.models.NetworkServiceDesignGroupPropertiesFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * network service design group resource.
 */
@Fluent
public final class NetworkServiceDesignGroupInner extends Resource {
    /*
     * network service design group properties.
     */
    @JsonProperty(value = "properties")
    private NetworkServiceDesignGroupPropertiesFormat properties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of NetworkServiceDesignGroupInner class.
     */
    public NetworkServiceDesignGroupInner() {
    }

    /**
     * Get the properties property: network service design group properties.
     * 
     * @return the properties value.
     */
    public NetworkServiceDesignGroupPropertiesFormat properties() {
        return this.properties;
    }

    /**
     * Set the properties property: network service design group properties.
     * 
     * @param properties the properties value to set.
     * @return the NetworkServiceDesignGroupInner object itself.
     */
    public NetworkServiceDesignGroupInner withProperties(NetworkServiceDesignGroupPropertiesFormat properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetworkServiceDesignGroupInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetworkServiceDesignGroupInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
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
