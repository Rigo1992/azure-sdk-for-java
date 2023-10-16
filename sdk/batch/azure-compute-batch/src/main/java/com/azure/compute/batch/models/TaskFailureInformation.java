// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Information about a Task failure. */
@Immutable
public final class TaskFailureInformation {

    /*
     * The category of the Task error.
     */
    @Generated
    @JsonProperty(value = "category")
    private ErrorCategory category;

    /*
     * An identifier for the Task error. Codes are invariant and are intended to be consumed programmatically.
     */
    @Generated
    @JsonProperty(value = "code")
    private String code;

    /*
     * A message describing the Task error, intended to be suitable for display in a user interface.
     */
    @Generated
    @JsonProperty(value = "message")
    private String message;

    /*
     * A list of additional details related to the error.
     */
    @Generated
    @JsonProperty(value = "details")
    private List<NameValuePair> details;

    /**
     * Creates an instance of TaskFailureInformation class.
     *
     * @param category the category value to set.
     */
    @Generated
    @JsonCreator
    private TaskFailureInformation(@JsonProperty(value = "category") ErrorCategory category) {
        this.category = category;
    }

    /**
     * Get the category property: The category of the Task error.
     *
     * @return the category value.
     */
    @Generated
    public ErrorCategory getCategory() {
        return this.category;
    }

    /**
     * Get the code property: An identifier for the Task error. Codes are invariant and are intended to be consumed
     * programmatically.
     *
     * @return the code value.
     */
    @Generated
    public String getCode() {
        return this.code;
    }

    /**
     * Get the message property: A message describing the Task error, intended to be suitable for display in a user
     * interface.
     *
     * @return the message value.
     */
    @Generated
    public String getMessage() {
        return this.message;
    }

    /**
     * Get the details property: A list of additional details related to the error.
     *
     * @return the details value.
     */
    @Generated
    public List<NameValuePair> getDetails() {
        return this.details;
    }
}
