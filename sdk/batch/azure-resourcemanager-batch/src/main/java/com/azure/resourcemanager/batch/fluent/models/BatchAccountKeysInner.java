// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A set of Azure Batch account keys. */
@Immutable
public final class BatchAccountKeysInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BatchAccountKeysInner.class);

    /*
     * The Batch account name.
     */
    @JsonProperty(value = "accountName", access = JsonProperty.Access.WRITE_ONLY)
    private String accountName;

    /*
     * The primary key associated with the account.
     */
    @JsonProperty(value = "primary", access = JsonProperty.Access.WRITE_ONLY)
    private String primary;

    /*
     * The secondary key associated with the account.
     */
    @JsonProperty(value = "secondary", access = JsonProperty.Access.WRITE_ONLY)
    private String secondary;

    /**
     * Get the accountName property: The Batch account name.
     *
     * @return the accountName value.
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Get the primary property: The primary key associated with the account.
     *
     * @return the primary value.
     */
    public String primary() {
        return this.primary;
    }

    /**
     * Get the secondary property: The secondary key associated with the account.
     *
     * @return the secondary value.
     */
    public String secondary() {
        return this.secondary;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
