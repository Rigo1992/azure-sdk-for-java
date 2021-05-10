// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Payload for Add Users operation on a Lab. */
@Fluent
public final class AddUsersPayload {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AddUsersPayload.class);

    /*
     * List of user emails addresses to add to the lab.
     */
    @JsonProperty(value = "emailAddresses", required = true)
    private List<String> emailAddresses;

    /**
     * Get the emailAddresses property: List of user emails addresses to add to the lab.
     *
     * @return the emailAddresses value.
     */
    public List<String> emailAddresses() {
        return this.emailAddresses;
    }

    /**
     * Set the emailAddresses property: List of user emails addresses to add to the lab.
     *
     * @param emailAddresses the emailAddresses value to set.
     * @return the AddUsersPayload object itself.
     */
    public AddUsersPayload withEmailAddresses(List<String> emailAddresses) {
        this.emailAddresses = emailAddresses;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (emailAddresses() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property emailAddresses in model AddUsersPayload"));
        }
    }
}
