// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Database level key used for encryption at rest. */
@Immutable
public final class DatabaseKey {
    /*
     * The database key type. Only supported value is 'AzureKeyVault'.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private DatabaseKeyType type;

    /*
     * Thumbprint of the database key.
     */
    @JsonProperty(value = "thumbprint", access = JsonProperty.Access.WRITE_ONLY)
    private String thumbprint;

    /*
     * The database key creation date.
     */
    @JsonProperty(value = "creationDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationDate;

    /*
     * Subregion of the server key.
     */
    @JsonProperty(value = "subregion", access = JsonProperty.Access.WRITE_ONLY)
    private String subregion;

    /** Creates an instance of DatabaseKey class. */
    public DatabaseKey() {
    }

    /**
     * Get the type property: The database key type. Only supported value is 'AzureKeyVault'.
     *
     * @return the type value.
     */
    public DatabaseKeyType type() {
        return this.type;
    }

    /**
     * Get the thumbprint property: Thumbprint of the database key.
     *
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Get the creationDate property: The database key creation date.
     *
     * @return the creationDate value.
     */
    public OffsetDateTime creationDate() {
        return this.creationDate;
    }

    /**
     * Get the subregion property: Subregion of the server key.
     *
     * @return the subregion value.
     */
    public String subregion() {
        return this.subregion;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
