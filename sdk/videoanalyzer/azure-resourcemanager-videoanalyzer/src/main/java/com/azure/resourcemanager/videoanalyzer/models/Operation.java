// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An operation. */
@Fluent
public final class Operation {
    /*
     * The operation name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The operation display name.
     */
    @JsonProperty(value = "display")
    private OperationDisplay display;

    /*
     * Origin of the operation.
     */
    @JsonProperty(value = "origin")
    private String origin;

    /*
     * Operation properties format.
     */
    @JsonProperty(value = "properties")
    private Properties properties;

    /*
     * Whether the operation applies to data-plane.
     */
    @JsonProperty(value = "isDataAction")
    private Boolean isDataAction;

    /*
     * Indicates the action type.
     */
    @JsonProperty(value = "actionType")
    private ActionType actionType;

    /**
     * Get the name property: The operation name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The operation name.
     *
     * @param name the name value to set.
     * @return the Operation object itself.
     */
    public Operation withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the display property: The operation display name.
     *
     * @return the display value.
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Set the display property: The operation display name.
     *
     * @param display the display value to set.
     * @return the Operation object itself.
     */
    public Operation withDisplay(OperationDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Get the origin property: Origin of the operation.
     *
     * @return the origin value.
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Set the origin property: Origin of the operation.
     *
     * @param origin the origin value to set.
     * @return the Operation object itself.
     */
    public Operation withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Get the properties property: Operation properties format.
     *
     * @return the properties value.
     */
    public Properties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Operation properties format.
     *
     * @param properties the properties value to set.
     * @return the Operation object itself.
     */
    public Operation withProperties(Properties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the isDataAction property: Whether the operation applies to data-plane.
     *
     * @return the isDataAction value.
     */
    public Boolean isDataAction() {
        return this.isDataAction;
    }

    /**
     * Set the isDataAction property: Whether the operation applies to data-plane.
     *
     * @param isDataAction the isDataAction value to set.
     * @return the Operation object itself.
     */
    public Operation withIsDataAction(Boolean isDataAction) {
        this.isDataAction = isDataAction;
        return this;
    }

    /**
     * Get the actionType property: Indicates the action type.
     *
     * @return the actionType value.
     */
    public ActionType actionType() {
        return this.actionType;
    }

    /**
     * Set the actionType property: Indicates the action type.
     *
     * @param actionType the actionType value to set.
     * @return the Operation object itself.
     */
    public Operation withActionType(ActionType actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(new IllegalArgumentException("Missing required property name in model Operation"));
        }
        if (display() != null) {
            display().validate();
        }
        if (properties() != null) {
            properties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(Operation.class);
}
