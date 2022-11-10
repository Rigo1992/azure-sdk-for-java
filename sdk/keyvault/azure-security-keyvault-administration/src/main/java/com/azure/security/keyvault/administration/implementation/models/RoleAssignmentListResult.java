// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.administration.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Role assignment list operation result. */
@Fluent
public final class RoleAssignmentListResult {
    /*
     * Role assignment list.
     */
    @JsonProperty(value = "value")
    private List<RoleAssignment> value;

    /*
     * The URL to use for getting the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of RoleAssignmentListResult class. */
    public RoleAssignmentListResult() {}

    /**
     * Get the value property: Role assignment list.
     *
     * @return the value value.
     */
    public List<RoleAssignment> getValue() {
        return this.value;
    }

    /**
     * Set the value property: Role assignment list.
     *
     * @param value the value value to set.
     * @return the RoleAssignmentListResult object itself.
     */
    public RoleAssignmentListResult setValue(List<RoleAssignment> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to use for getting the next set of results.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to use for getting the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the RoleAssignmentListResult object itself.
     */
    public RoleAssignmentListResult setNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}
