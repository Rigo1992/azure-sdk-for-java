// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Base class for different types of authentication credentials. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "objectType",
    defaultImpl = AuthCredentials.class)
@JsonTypeName("AuthCredentials")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "SecretStoreBasedAuthCredentials", value = SecretStoreBasedAuthCredentials.class)
})
@Immutable
public class AuthCredentials {
    /** Creates an instance of AuthCredentials class. */
    public AuthCredentials() {
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
