// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Shared access keys of the Namespace. */
@Fluent
public final class NamespaceSharedAccessKeysInner {
    /*
     * Shared access key1 for the namespace.
     */
    @JsonProperty(value = "key1")
    private String key1;

    /*
     * Shared access key2 for the namespace.
     */
    @JsonProperty(value = "key2")
    private String key2;

    /** Creates an instance of NamespaceSharedAccessKeysInner class. */
    public NamespaceSharedAccessKeysInner() {
    }

    /**
     * Get the key1 property: Shared access key1 for the namespace.
     *
     * @return the key1 value.
     */
    public String key1() {
        return this.key1;
    }

    /**
     * Set the key1 property: Shared access key1 for the namespace.
     *
     * @param key1 the key1 value to set.
     * @return the NamespaceSharedAccessKeysInner object itself.
     */
    public NamespaceSharedAccessKeysInner withKey1(String key1) {
        this.key1 = key1;
        return this;
    }

    /**
     * Get the key2 property: Shared access key2 for the namespace.
     *
     * @return the key2 value.
     */
    public String key2() {
        return this.key2;
    }

    /**
     * Set the key2 property: Shared access key2 for the namespace.
     *
     * @param key2 the key2 value to set.
     * @return the NamespaceSharedAccessKeysInner object itself.
     */
    public NamespaceSharedAccessKeysInner withKey2(String key2) {
        this.key2 = key2;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
