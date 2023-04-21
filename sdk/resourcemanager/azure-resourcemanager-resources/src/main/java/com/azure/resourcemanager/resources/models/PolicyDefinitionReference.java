// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The policy definition reference. */
@Fluent
public final class PolicyDefinitionReference {
    /*
     * The ID of the policy definition or policy set definition.
     */
    @JsonProperty(value = "policyDefinitionId", required = true)
    private String policyDefinitionId;

    /*
     * The parameter values for the referenced policy rule. The keys are the parameter names.
     */
    @JsonProperty(value = "parameters")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, ParameterValuesValue> parameters;

    /*
     * A unique id (within the policy set definition) for this policy definition reference.
     */
    @JsonProperty(value = "policyDefinitionReferenceId")
    private String policyDefinitionReferenceId;

    /*
     * The name of the groups that this policy definition reference belongs to.
     */
    @JsonProperty(value = "groupNames")
    private List<String> groupNames;

    /** Creates an instance of PolicyDefinitionReference class. */
    public PolicyDefinitionReference() {
    }

    /**
     * Get the policyDefinitionId property: The ID of the policy definition or policy set definition.
     *
     * @return the policyDefinitionId value.
     */
    public String policyDefinitionId() {
        return this.policyDefinitionId;
    }

    /**
     * Set the policyDefinitionId property: The ID of the policy definition or policy set definition.
     *
     * @param policyDefinitionId the policyDefinitionId value to set.
     * @return the PolicyDefinitionReference object itself.
     */
    public PolicyDefinitionReference withPolicyDefinitionId(String policyDefinitionId) {
        this.policyDefinitionId = policyDefinitionId;
        return this;
    }

    /**
     * Get the parameters property: The parameter values for the referenced policy rule. The keys are the parameter
     * names.
     *
     * @return the parameters value.
     */
    public Map<String, ParameterValuesValue> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: The parameter values for the referenced policy rule. The keys are the parameter
     * names.
     *
     * @param parameters the parameters value to set.
     * @return the PolicyDefinitionReference object itself.
     */
    public PolicyDefinitionReference withParameters(Map<String, ParameterValuesValue> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the policyDefinitionReferenceId property: A unique id (within the policy set definition) for this policy
     * definition reference.
     *
     * @return the policyDefinitionReferenceId value.
     */
    public String policyDefinitionReferenceId() {
        return this.policyDefinitionReferenceId;
    }

    /**
     * Set the policyDefinitionReferenceId property: A unique id (within the policy set definition) for this policy
     * definition reference.
     *
     * @param policyDefinitionReferenceId the policyDefinitionReferenceId value to set.
     * @return the PolicyDefinitionReference object itself.
     */
    public PolicyDefinitionReference withPolicyDefinitionReferenceId(String policyDefinitionReferenceId) {
        this.policyDefinitionReferenceId = policyDefinitionReferenceId;
        return this;
    }

    /**
     * Get the groupNames property: The name of the groups that this policy definition reference belongs to.
     *
     * @return the groupNames value.
     */
    public List<String> groupNames() {
        return this.groupNames;
    }

    /**
     * Set the groupNames property: The name of the groups that this policy definition reference belongs to.
     *
     * @param groupNames the groupNames value to set.
     * @return the PolicyDefinitionReference object itself.
     */
    public PolicyDefinitionReference withGroupNames(List<String> groupNames) {
        this.groupNames = groupNames;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (policyDefinitionId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property policyDefinitionId in model PolicyDefinitionReference"));
        }
        if (parameters() != null) {
            parameters()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PolicyDefinitionReference.class);
}
