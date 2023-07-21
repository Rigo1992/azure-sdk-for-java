// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.sql.fluent.models.ServerCommunicationLinkInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A list of server communication links. */
@Fluent
public final class ServerCommunicationLinkListResult {
    /*
     * The list of server communication links.
     */
    @JsonProperty(value = "value")
    private List<ServerCommunicationLinkInner> value;

    /** Creates an instance of ServerCommunicationLinkListResult class. */
    public ServerCommunicationLinkListResult() {
    }

    /**
     * Get the value property: The list of server communication links.
     *
     * @return the value value.
     */
    public List<ServerCommunicationLinkInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of server communication links.
     *
     * @param value the value value to set.
     * @return the ServerCommunicationLinkListResult object itself.
     */
    public ServerCommunicationLinkListResult withValue(List<ServerCommunicationLinkInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
