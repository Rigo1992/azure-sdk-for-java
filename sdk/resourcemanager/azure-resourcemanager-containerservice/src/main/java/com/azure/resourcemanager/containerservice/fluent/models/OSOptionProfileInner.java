// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerservice.models.OSOptionProperty;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The OS option profile.
 */
@Fluent
public final class OSOptionProfileInner {
    /*
     * The ID of the OS option resource.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The name of the OS option resource.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The type of the OS option resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * The list of OS options.
     */
    @JsonProperty(value = "properties", required = true)
    private OSOptionPropertyList innerProperties = new OSOptionPropertyList();

    /**
     * Creates an instance of OSOptionProfileInner class.
     */
    public OSOptionProfileInner() {
    }

    /**
     * Get the id property: The ID of the OS option resource.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The name of the OS option resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The type of the OS option resource.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the innerProperties property: The list of OS options.
     *
     * @return the innerProperties value.
     */
    private OSOptionPropertyList innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the osOptionPropertyList property: The list of OS options.
     *
     * @return the osOptionPropertyList value.
     */
    public List<OSOptionProperty> osOptionPropertyList() {
        return this.innerProperties() == null ? null : this.innerProperties().osOptionPropertyList();
    }

    /**
     * Set the osOptionPropertyList property: The list of OS options.
     *
     * @param osOptionPropertyList the osOptionPropertyList value to set.
     * @return the OSOptionProfileInner object itself.
     */
    public OSOptionProfileInner withOsOptionPropertyList(List<OSOptionProperty> osOptionPropertyList) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OSOptionPropertyList();
        }
        this.innerProperties().withOsOptionPropertyList(osOptionPropertyList);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property innerProperties in model OSOptionProfileInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(OSOptionProfileInner.class);
}
