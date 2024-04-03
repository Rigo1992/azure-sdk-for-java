// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.regex.Pattern;

/**
 * The response payload for getting participants of the call.
 */
@Fluent
public final class GetParticipantsResponseInternal {
    /*
     * List of the current participants in the call.
     */
    @JsonProperty(value = "value", required = true)
    private List<CallParticipantInternal> value;

    /*
     * Continue of the list of participants
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of GetParticipantsResponseInternal class.
     */
    public GetParticipantsResponseInternal() {
    }

    /**
     * Get the value property: List of the current participants in the call.
     * 
     * @return the value value.
     */
    public List<CallParticipantInternal> getValue() {
        return this.value;
    }

    /**
     * Set the value property: List of the current participants in the call.
     * 
     * @param value the value value to set.
     * @return the GetParticipantsResponseInternal object itself.
     */
    public GetParticipantsResponseInternal setValue(List<CallParticipantInternal> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Continue of the list of participants.
     * 
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Continue of the list of participants.
     * 
     * @param nextLink the nextLink value to set.
     * @return the GetParticipantsResponseInternal object itself.
     */
    public GetParticipantsResponseInternal setNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}
