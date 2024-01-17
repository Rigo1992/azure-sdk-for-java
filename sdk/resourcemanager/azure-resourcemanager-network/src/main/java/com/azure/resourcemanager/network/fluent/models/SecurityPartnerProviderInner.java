// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.SecurityPartnerProviderConnectionStatus;
import com.azure.resourcemanager.network.models.SecurityProviderName;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Security Partner Provider resource.
 */
@Fluent
public final class SecurityPartnerProviderInner extends Resource {
    /*
     * Properties of the Security Partner Provider.
     */
    @JsonProperty(value = "properties")
    private SecurityPartnerProviderPropertiesFormat innerProperties;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Creates an instance of SecurityPartnerProviderInner class.
     */
    public SecurityPartnerProviderInner() {
    }

    /**
     * Get the innerProperties property: Properties of the Security Partner Provider.
     * 
     * @return the innerProperties value.
     */
    private SecurityPartnerProviderPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the id property: Resource ID.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     * 
     * @param id the id value to set.
     * @return the SecurityPartnerProviderInner object itself.
     */
    public SecurityPartnerProviderInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecurityPartnerProviderInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SecurityPartnerProviderInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the Security Partner Provider resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the securityProviderName property: The security provider name.
     * 
     * @return the securityProviderName value.
     */
    public SecurityProviderName securityProviderName() {
        return this.innerProperties() == null ? null : this.innerProperties().securityProviderName();
    }

    /**
     * Set the securityProviderName property: The security provider name.
     * 
     * @param securityProviderName the securityProviderName value to set.
     * @return the SecurityPartnerProviderInner object itself.
     */
    public SecurityPartnerProviderInner withSecurityProviderName(SecurityProviderName securityProviderName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SecurityPartnerProviderPropertiesFormat();
        }
        this.innerProperties().withSecurityProviderName(securityProviderName);
        return this;
    }

    /**
     * Get the connectionStatus property: The connection status with the Security Partner Provider.
     * 
     * @return the connectionStatus value.
     */
    public SecurityPartnerProviderConnectionStatus connectionStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().connectionStatus();
    }

    /**
     * Get the virtualHub property: The virtualHub to which the Security Partner Provider belongs.
     * 
     * @return the virtualHub value.
     */
    public SubResource virtualHub() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualHub();
    }

    /**
     * Set the virtualHub property: The virtualHub to which the Security Partner Provider belongs.
     * 
     * @param virtualHub the virtualHub value to set.
     * @return the SecurityPartnerProviderInner object itself.
     */
    public SecurityPartnerProviderInner withVirtualHub(SubResource virtualHub) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SecurityPartnerProviderPropertiesFormat();
        }
        this.innerProperties().withVirtualHub(virtualHub);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
