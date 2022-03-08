// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Defines the parameters for RequestHeader match conditions. */
@Fluent
public final class RequestHeaderMatchConditionParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RequestHeaderMatchConditionParameters.class);

    /*
     * The typeName property.
     */
    @JsonProperty(value = "typeName", required = true)
    private String typeName = "DeliveryRuleRequestHeaderConditionParameters";

    /*
     * Name of Header to be matched
     */
    @JsonProperty(value = "selector")
    private String selector;

    /*
     * Describes operator to be matched
     */
    @JsonProperty(value = "operator", required = true)
    private RequestHeaderOperator operator;

    /*
     * Describes if this is negate condition or not
     */
    @JsonProperty(value = "negateCondition")
    private Boolean negateCondition;

    /*
     * The match value for the condition of the delivery rule
     */
    @JsonProperty(value = "matchValues")
    private List<String> matchValues;

    /*
     * List of transforms
     */
    @JsonProperty(value = "transforms")
    private List<Transform> transforms;

    /** Creates an instance of RequestHeaderMatchConditionParameters class. */
    public RequestHeaderMatchConditionParameters() {
        typeName = "DeliveryRuleRequestHeaderConditionParameters";
    }

    /**
     * Get the typeName property: The typeName property.
     *
     * @return the typeName value.
     */
    public String typeName() {
        return this.typeName;
    }

    /**
     * Set the typeName property: The typeName property.
     *
     * @param typeName the typeName value to set.
     * @return the RequestHeaderMatchConditionParameters object itself.
     */
    public RequestHeaderMatchConditionParameters withTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * Get the selector property: Name of Header to be matched.
     *
     * @return the selector value.
     */
    public String selector() {
        return this.selector;
    }

    /**
     * Set the selector property: Name of Header to be matched.
     *
     * @param selector the selector value to set.
     * @return the RequestHeaderMatchConditionParameters object itself.
     */
    public RequestHeaderMatchConditionParameters withSelector(String selector) {
        this.selector = selector;
        return this;
    }

    /**
     * Get the operator property: Describes operator to be matched.
     *
     * @return the operator value.
     */
    public RequestHeaderOperator operator() {
        return this.operator;
    }

    /**
     * Set the operator property: Describes operator to be matched.
     *
     * @param operator the operator value to set.
     * @return the RequestHeaderMatchConditionParameters object itself.
     */
    public RequestHeaderMatchConditionParameters withOperator(RequestHeaderOperator operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get the negateCondition property: Describes if this is negate condition or not.
     *
     * @return the negateCondition value.
     */
    public Boolean negateCondition() {
        return this.negateCondition;
    }

    /**
     * Set the negateCondition property: Describes if this is negate condition or not.
     *
     * @param negateCondition the negateCondition value to set.
     * @return the RequestHeaderMatchConditionParameters object itself.
     */
    public RequestHeaderMatchConditionParameters withNegateCondition(Boolean negateCondition) {
        this.negateCondition = negateCondition;
        return this;
    }

    /**
     * Get the matchValues property: The match value for the condition of the delivery rule.
     *
     * @return the matchValues value.
     */
    public List<String> matchValues() {
        return this.matchValues;
    }

    /**
     * Set the matchValues property: The match value for the condition of the delivery rule.
     *
     * @param matchValues the matchValues value to set.
     * @return the RequestHeaderMatchConditionParameters object itself.
     */
    public RequestHeaderMatchConditionParameters withMatchValues(List<String> matchValues) {
        this.matchValues = matchValues;
        return this;
    }

    /**
     * Get the transforms property: List of transforms.
     *
     * @return the transforms value.
     */
    public List<Transform> transforms() {
        return this.transforms;
    }

    /**
     * Set the transforms property: List of transforms.
     *
     * @param transforms the transforms value to set.
     * @return the RequestHeaderMatchConditionParameters object itself.
     */
    public RequestHeaderMatchConditionParameters withTransforms(List<Transform> transforms) {
        this.transforms = transforms;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (operator() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property operator in model RequestHeaderMatchConditionParameters"));
        }
    }
}
