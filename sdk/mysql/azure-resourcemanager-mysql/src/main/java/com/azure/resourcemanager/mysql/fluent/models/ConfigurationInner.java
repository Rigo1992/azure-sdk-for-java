// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents a Configuration. */
@Fluent
public final class ConfigurationInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConfigurationInner.class);

    /*
     * The properties of a configuration.
     */
    @JsonProperty(value = "properties")
    private ConfigurationProperties innerProperties;

    /**
     * Get the innerProperties property: The properties of a configuration.
     *
     * @return the innerProperties value.
     */
    private ConfigurationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the value property: Value of the configuration.
     *
     * @return the value value.
     */
    public String value() {
        return this.innerProperties() == null ? null : this.innerProperties().value();
    }

    /**
     * Set the value property: Value of the configuration.
     *
     * @param value the value value to set.
     * @return the ConfigurationInner object itself.
     */
    public ConfigurationInner withValue(String value) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConfigurationProperties();
        }
        this.innerProperties().withValue(value);
        return this;
    }

    /**
     * Get the description property: Description of the configuration.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Get the defaultValue property: Default value of the configuration.
     *
     * @return the defaultValue value.
     */
    public String defaultValue() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultValue();
    }

    /**
     * Get the dataType property: Data type of the configuration.
     *
     * @return the dataType value.
     */
    public String dataType() {
        return this.innerProperties() == null ? null : this.innerProperties().dataType();
    }

    /**
     * Get the allowedValues property: Allowed values of the configuration.
     *
     * @return the allowedValues value.
     */
    public String allowedValues() {
        return this.innerProperties() == null ? null : this.innerProperties().allowedValues();
    }

    /**
     * Get the source property: Source of the configuration.
     *
     * @return the source value.
     */
    public String source() {
        return this.innerProperties() == null ? null : this.innerProperties().source();
    }

    /**
     * Set the source property: Source of the configuration.
     *
     * @param source the source value to set.
     * @return the ConfigurationInner object itself.
     */
    public ConfigurationInner withSource(String source) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConfigurationProperties();
        }
        this.innerProperties().withSource(source);
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
