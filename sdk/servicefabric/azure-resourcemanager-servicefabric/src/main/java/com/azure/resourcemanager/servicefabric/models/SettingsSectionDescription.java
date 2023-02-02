// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes a section in the fabric settings of the cluster. */
@Fluent
public final class SettingsSectionDescription {
    /*
     * The section name of the fabric settings.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The collection of parameters in the section.
     */
    @JsonProperty(value = "parameters", required = true)
    private List<SettingsParameterDescription> parameters;

    /** Creates an instance of SettingsSectionDescription class. */
    public SettingsSectionDescription() {
    }

    /**
     * Get the name property: The section name of the fabric settings.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The section name of the fabric settings.
     *
     * @param name the name value to set.
     * @return the SettingsSectionDescription object itself.
     */
    public SettingsSectionDescription withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the parameters property: The collection of parameters in the section.
     *
     * @return the parameters value.
     */
    public List<SettingsParameterDescription> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: The collection of parameters in the section.
     *
     * @param parameters the parameters value to set.
     * @return the SettingsSectionDescription object itself.
     */
    public SettingsSectionDescription withParameters(List<SettingsParameterDescription> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model SettingsSectionDescription"));
        }
        if (parameters() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property parameters in model SettingsSectionDescription"));
        } else {
            parameters().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SettingsSectionDescription.class);
}
