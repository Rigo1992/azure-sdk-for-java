// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes a script action on a running cluster. */
@Fluent
public class RuntimeScriptAction {
    /*
     * The name of the script action.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The URI to the script.
     */
    @JsonProperty(value = "uri", required = true)
    private String uri;

    /*
     * The parameters for the script
     */
    @JsonProperty(value = "parameters")
    private String parameters;

    /*
     * The list of roles where script will be executed.
     */
    @JsonProperty(value = "roles", required = true)
    private List<String> roles;

    /*
     * The application name of the script action, if any.
     */
    @JsonProperty(value = "applicationName", access = JsonProperty.Access.WRITE_ONLY)
    private String applicationName;

    /** Creates an instance of RuntimeScriptAction class. */
    public RuntimeScriptAction() {
    }

    /**
     * Get the name property: The name of the script action.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the script action.
     *
     * @param name the name value to set.
     * @return the RuntimeScriptAction object itself.
     */
    public RuntimeScriptAction withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the uri property: The URI to the script.
     *
     * @return the uri value.
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the uri property: The URI to the script.
     *
     * @param uri the uri value to set.
     * @return the RuntimeScriptAction object itself.
     */
    public RuntimeScriptAction withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Get the parameters property: The parameters for the script.
     *
     * @return the parameters value.
     */
    public String parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: The parameters for the script.
     *
     * @param parameters the parameters value to set.
     * @return the RuntimeScriptAction object itself.
     */
    public RuntimeScriptAction withParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the roles property: The list of roles where script will be executed.
     *
     * @return the roles value.
     */
    public List<String> roles() {
        return this.roles;
    }

    /**
     * Set the roles property: The list of roles where script will be executed.
     *
     * @param roles the roles value to set.
     * @return the RuntimeScriptAction object itself.
     */
    public RuntimeScriptAction withRoles(List<String> roles) {
        this.roles = roles;
        return this;
    }

    /**
     * Get the applicationName property: The application name of the script action, if any.
     *
     * @return the applicationName value.
     */
    public String applicationName() {
        return this.applicationName;
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
                    new IllegalArgumentException("Missing required property name in model RuntimeScriptAction"));
        }
        if (uri() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property uri in model RuntimeScriptAction"));
        }
        if (roles() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property roles in model RuntimeScriptAction"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RuntimeScriptAction.class);
}
