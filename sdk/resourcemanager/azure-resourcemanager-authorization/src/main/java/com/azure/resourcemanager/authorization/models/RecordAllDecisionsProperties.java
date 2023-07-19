// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Record All Decisions payload. */
@Fluent
public final class RecordAllDecisionsProperties {
    /*
     * The id of principal which needs to be approved/denied.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private String principalId;

    /*
     * The id of resource which needs to be approved/denied.
     */
    @JsonProperty(value = "resourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceId;

    /*
     * The decision to make. Approvers can take action of Approve/Deny
     */
    @JsonProperty(value = "decision")
    private RecordAllDecisionsResult decision;

    /*
     * Justification provided by approvers for their action
     */
    @JsonProperty(value = "justification")
    private String justification;

    /** Creates an instance of RecordAllDecisionsProperties class. */
    public RecordAllDecisionsProperties() {
    }

    /**
     * Get the principalId property: The id of principal which needs to be approved/denied.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the resourceId property: The id of resource which needs to be approved/denied.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Get the decision property: The decision to make. Approvers can take action of Approve/Deny.
     *
     * @return the decision value.
     */
    public RecordAllDecisionsResult decision() {
        return this.decision;
    }

    /**
     * Set the decision property: The decision to make. Approvers can take action of Approve/Deny.
     *
     * @param decision the decision value to set.
     * @return the RecordAllDecisionsProperties object itself.
     */
    public RecordAllDecisionsProperties withDecision(RecordAllDecisionsResult decision) {
        this.decision = decision;
        return this;
    }

    /**
     * Get the justification property: Justification provided by approvers for their action.
     *
     * @return the justification value.
     */
    public String justification() {
        return this.justification;
    }

    /**
     * Set the justification property: Justification provided by approvers for their action.
     *
     * @param justification the justification value to set.
     * @return the RecordAllDecisionsProperties object itself.
     */
    public RecordAllDecisionsProperties withJustification(String justification) {
        this.justification = justification;
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
