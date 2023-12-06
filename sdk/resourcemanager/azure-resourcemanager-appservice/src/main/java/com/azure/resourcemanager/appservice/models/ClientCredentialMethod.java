// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The method that should be used to authenticate the user.
 */
public enum ClientCredentialMethod {
    /**
     * Enum value ClientSecretPost.
     */
    CLIENT_SECRET_POST("ClientSecretPost");

    /**
     * The actual serialized value for a ClientCredentialMethod instance.
     */
    private final String value;

    ClientCredentialMethod(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ClientCredentialMethod instance.
     * 
     * @param value the serialized value to parse.
     * @return the parsed ClientCredentialMethod object, or null if unable to parse.
     */
    @JsonCreator
    public static ClientCredentialMethod fromString(String value) {
        if (value == null) {
            return null;
        }
        ClientCredentialMethod[] items = ClientCredentialMethod.values();
        for (ClientCredentialMethod item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
