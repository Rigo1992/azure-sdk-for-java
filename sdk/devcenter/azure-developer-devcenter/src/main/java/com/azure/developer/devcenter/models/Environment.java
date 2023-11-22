// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.developer.devcenter.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.core.models.ResponseError;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of an environment.
 */
@Fluent
public final class Environment {
    /*
     * Parameters object for the environment.
     */
    @Generated
    @JsonProperty(value = "parameters")
    private Object parameters;

    /*
     * Environment name.
     */
    @Generated
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Environment type.
     */
    @Generated
    @JsonProperty(value = "environmentType")
    private String environmentType;

    /*
     * The AAD object id of the owner of this Environment.
     */
    @Generated
    @JsonProperty(value = "user", access = JsonProperty.Access.WRITE_ONLY)
    private String user;

    /*
     * The provisioning state of the environment.
     */
    @Generated
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The identifier of the resource group containing the environment's resources.
     */
    @Generated
    @JsonProperty(value = "resourceGroupId", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGroupId;

    /*
     * Name of the catalog.
     */
    @Generated
    @JsonProperty(value = "catalogName")
    private String catalogName;

    /*
     * Name of the environment definition.
     */
    @Generated
    @JsonProperty(value = "environmentDefinitionName")
    private String environmentDefinitionName;

    /*
     * Provisioning error details. Populated only for error states.
     */
    @Generated
    @JsonProperty(value = "error", access = JsonProperty.Access.WRITE_ONLY)
    private ResponseError error;

    /**
     * Creates an instance of Environment class.
     * 
     * @param environmentType the environmentType value to set.
     * @param catalogName the catalogName value to set.
     * @param environmentDefinitionName the environmentDefinitionName value to set.
     */
    @Generated
    @JsonCreator
    public Environment(@JsonProperty(value = "environmentType") String environmentType,
        @JsonProperty(value = "catalogName") String catalogName,
        @JsonProperty(value = "environmentDefinitionName") String environmentDefinitionName) {
        this.environmentType = environmentType;
        this.catalogName = catalogName;
        this.environmentDefinitionName = environmentDefinitionName;
    }

    /**
     * Get the parameters property: Parameters object for the environment.
     * 
     * @return the parameters value.
     */
    @Generated
    public Object getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Parameters object for the environment.
     * 
     * @param parameters the parameters value to set.
     * @return the Environment object itself.
     */
    @Generated
    public Environment setParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the name property: Environment name.
     * 
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the environmentType property: Environment type.
     * 
     * @return the environmentType value.
     */
    @Generated
    public String getEnvironmentType() {
        return this.environmentType;
    }

    /**
     * Get the user property: The AAD object id of the owner of this Environment.
     * 
     * @return the user value.
     */
    @Generated
    public String getUser() {
        return this.user;
    }

    /**
     * Get the provisioningState property: The provisioning state of the environment.
     * 
     * @return the provisioningState value.
     */
    @Generated
    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the resourceGroupId property: The identifier of the resource group containing the environment's resources.
     * 
     * @return the resourceGroupId value.
     */
    @Generated
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * Get the catalogName property: Name of the catalog.
     * 
     * @return the catalogName value.
     */
    @Generated
    public String getCatalogName() {
        return this.catalogName;
    }

    /**
     * Get the environmentDefinitionName property: Name of the environment definition.
     * 
     * @return the environmentDefinitionName value.
     */
    @Generated
    public String getEnvironmentDefinitionName() {
        return this.environmentDefinitionName;
    }

    /**
     * Get the error property: Provisioning error details. Populated only for error states.
     * 
     * @return the error value.
     */
    @Generated
    public ResponseError getError() {
        return this.error;
    }
}
