// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The base definition of a secret type.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", defaultImpl = SecretBase.class, visible = true)
@JsonTypeName("SecretBase")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "SecureString", value = SecureString.class),
    @JsonSubTypes.Type(name = "AzureKeyVaultSecret", value = AzureKeyVaultSecretReference.class) })
@Immutable
public class SecretBase {
    /*
     * Type of the secret.
     */
    @JsonTypeId
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * Creates an instance of SecretBase class.
     */
    public SecretBase() {
        this.type = "SecretBase";
    }

    /**
     * Get the type property: Type of the secret.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
