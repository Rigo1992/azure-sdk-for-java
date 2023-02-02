// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.vmwarecloudsimple.models.CustomizationPolicyPropertiesType;
import com.azure.resourcemanager.vmwarecloudsimple.models.CustomizationSpecification;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The virtual machine customization policy. */
@Fluent
public final class CustomizationPolicyInner {
    /*
     * Customization policy azure id
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Azure region
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * Customization policy name
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Customization Policy properties
     */
    @JsonProperty(value = "properties")
    private CustomizationPolicyProperties innerProperties;

    /*
     * The type property.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /** Creates an instance of CustomizationPolicyInner class. */
    public CustomizationPolicyInner() {
    }

    /**
     * Get the id property: Customization policy azure id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Customization policy azure id.
     *
     * @param id the id value to set.
     * @return the CustomizationPolicyInner object itself.
     */
    public CustomizationPolicyInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the location property: Azure region.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Azure region.
     *
     * @param location the location value to set.
     * @return the CustomizationPolicyInner object itself.
     */
    public CustomizationPolicyInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the name property: Customization policy name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the innerProperties property: Customization Policy properties.
     *
     * @return the innerProperties value.
     */
    private CustomizationPolicyProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the type property: The type property.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the description property: Policy description.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Policy description.
     *
     * @param description the description value to set.
     * @return the CustomizationPolicyInner object itself.
     */
    public CustomizationPolicyInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomizationPolicyProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the privateCloudId property: The Private cloud id.
     *
     * @return the privateCloudId value.
     */
    public String privateCloudId() {
        return this.innerProperties() == null ? null : this.innerProperties().privateCloudId();
    }

    /**
     * Set the privateCloudId property: The Private cloud id.
     *
     * @param privateCloudId the privateCloudId value to set.
     * @return the CustomizationPolicyInner object itself.
     */
    public CustomizationPolicyInner withPrivateCloudId(String privateCloudId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomizationPolicyProperties();
        }
        this.innerProperties().withPrivateCloudId(privateCloudId);
        return this;
    }

    /**
     * Get the specification property: Detailed customization policy specification.
     *
     * @return the specification value.
     */
    public CustomizationSpecification specification() {
        return this.innerProperties() == null ? null : this.innerProperties().specification();
    }

    /**
     * Set the specification property: Detailed customization policy specification.
     *
     * @param specification the specification value to set.
     * @return the CustomizationPolicyInner object itself.
     */
    public CustomizationPolicyInner withSpecification(CustomizationSpecification specification) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomizationPolicyProperties();
        }
        this.innerProperties().withSpecification(specification);
        return this;
    }

    /**
     * Get the type property: The type of customization (Linux or Windows).
     *
     * @return the type value.
     */
    public CustomizationPolicyPropertiesType typePropertiesType() {
        return this.innerProperties() == null ? null : this.innerProperties().type();
    }

    /**
     * Set the type property: The type of customization (Linux or Windows).
     *
     * @param type the type value to set.
     * @return the CustomizationPolicyInner object itself.
     */
    public CustomizationPolicyInner withTypePropertiesType(CustomizationPolicyPropertiesType type) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomizationPolicyProperties();
        }
        this.innerProperties().withType(type);
        return this;
    }

    /**
     * Get the version property: Policy version.
     *
     * @return the version value.
     */
    public String version() {
        return this.innerProperties() == null ? null : this.innerProperties().version();
    }

    /**
     * Set the version property: Policy version.
     *
     * @param version the version value to set.
     * @return the CustomizationPolicyInner object itself.
     */
    public CustomizationPolicyInner withVersion(String version) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CustomizationPolicyProperties();
        }
        this.innerProperties().withVersion(version);
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
