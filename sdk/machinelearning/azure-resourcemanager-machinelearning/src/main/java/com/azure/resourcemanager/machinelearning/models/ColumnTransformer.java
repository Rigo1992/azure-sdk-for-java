// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Column transformer parameters. */
@Fluent
public final class ColumnTransformer {
    /*
     * Fields to apply transformer logic on.
     */
    @JsonProperty(value = "fields")
    private List<String> fields;

    /*
     * Different properties to be passed to transformer.
     * Input expected is dictionary of key,value pairs in JSON format.
     */
    @JsonProperty(value = "parameters")
    private Object parameters;

    /** Creates an instance of ColumnTransformer class. */
    public ColumnTransformer() {
    }

    /**
     * Get the fields property: Fields to apply transformer logic on.
     *
     * @return the fields value.
     */
    public List<String> fields() {
        return this.fields;
    }

    /**
     * Set the fields property: Fields to apply transformer logic on.
     *
     * @param fields the fields value to set.
     * @return the ColumnTransformer object itself.
     */
    public ColumnTransformer withFields(List<String> fields) {
        this.fields = fields;
        return this;
    }

    /**
     * Get the parameters property: Different properties to be passed to transformer. Input expected is dictionary of
     * key,value pairs in JSON format.
     *
     * @return the parameters value.
     */
    public Object parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Different properties to be passed to transformer. Input expected is dictionary of
     * key,value pairs in JSON format.
     *
     * @param parameters the parameters value to set.
     * @return the ColumnTransformer object itself.
     */
    public ColumnTransformer withParameters(Object parameters) {
        this.parameters = parameters;
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
