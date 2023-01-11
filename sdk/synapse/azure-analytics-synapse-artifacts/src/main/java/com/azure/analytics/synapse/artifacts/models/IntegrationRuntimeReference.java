// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Integration runtime reference type. */
@Fluent
public final class IntegrationRuntimeReference {
    /*
     * Type of integration runtime.
     */
    @JsonProperty(value = "type", required = true)
    private IntegrationRuntimeReferenceType type;

    /*
     * Reference integration runtime name.
     */
    @JsonProperty(value = "referenceName", required = true)
    private String referenceName;

    /*
     * Arguments for integration runtime.
     */
    @JsonProperty(value = "parameters")
    private Map<String, Object> parameters;

    /** Creates an instance of IntegrationRuntimeReference class. */
    public IntegrationRuntimeReference() {}

    /**
     * Get the type property: Type of integration runtime.
     *
     * @return the type value.
     */
    public IntegrationRuntimeReferenceType getType() {
        return this.type;
    }

    /**
     * Set the type property: Type of integration runtime.
     *
     * @param type the type value to set.
     * @return the IntegrationRuntimeReference object itself.
     */
    public IntegrationRuntimeReference setType(IntegrationRuntimeReferenceType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the referenceName property: Reference integration runtime name.
     *
     * @return the referenceName value.
     */
    public String getReferenceName() {
        return this.referenceName;
    }

    /**
     * Set the referenceName property: Reference integration runtime name.
     *
     * @param referenceName the referenceName value to set.
     * @return the IntegrationRuntimeReference object itself.
     */
    public IntegrationRuntimeReference setReferenceName(String referenceName) {
        this.referenceName = referenceName;
        return this;
    }

    /**
     * Get the parameters property: Arguments for integration runtime.
     *
     * @return the parameters value.
     */
    public Map<String, Object> getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Arguments for integration runtime.
     *
     * @param parameters the parameters value to set.
     * @return the IntegrationRuntimeReference object itself.
     */
    public IntegrationRuntimeReference setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
        return this;
    }
}
