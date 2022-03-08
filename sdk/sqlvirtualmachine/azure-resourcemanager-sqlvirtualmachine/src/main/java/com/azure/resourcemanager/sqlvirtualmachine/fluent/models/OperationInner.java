// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sqlvirtualmachine.models.OperationDisplay;
import com.azure.resourcemanager.sqlvirtualmachine.models.OperationOrigin;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** SQL REST API operation definition. */
@Immutable
public final class OperationInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationInner.class);

    /*
     * The name of the operation being performed on this particular object.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The localized display information for this particular operation /
     * action.
     */
    @JsonProperty(value = "display", access = JsonProperty.Access.WRITE_ONLY)
    private OperationDisplay display;

    /*
     * The intended executor of the operation.
     */
    @JsonProperty(value = "origin", access = JsonProperty.Access.WRITE_ONLY)
    private OperationOrigin origin;

    /*
     * Additional descriptions for the operation.
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> properties;

    /**
     * Get the name property: The name of the operation being performed on this particular object.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the display property: The localized display information for this particular operation / action.
     *
     * @return the display value.
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Get the origin property: The intended executor of the operation.
     *
     * @return the origin value.
     */
    public OperationOrigin origin() {
        return this.origin;
    }

    /**
     * Get the properties property: Additional descriptions for the operation.
     *
     * @return the properties value.
     */
    public Map<String, Object> properties() {
        return this.properties;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (display() != null) {
            display().validate();
        }
    }
}
