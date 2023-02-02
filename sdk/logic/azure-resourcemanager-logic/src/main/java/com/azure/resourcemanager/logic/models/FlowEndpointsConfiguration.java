// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The endpoints configuration. */
@Fluent
public final class FlowEndpointsConfiguration {
    /*
     * The workflow endpoints.
     */
    @JsonProperty(value = "workflow")
    private FlowEndpoints workflow;

    /*
     * The connector endpoints.
     */
    @JsonProperty(value = "connector")
    private FlowEndpoints connector;

    /** Creates an instance of FlowEndpointsConfiguration class. */
    public FlowEndpointsConfiguration() {
    }

    /**
     * Get the workflow property: The workflow endpoints.
     *
     * @return the workflow value.
     */
    public FlowEndpoints workflow() {
        return this.workflow;
    }

    /**
     * Set the workflow property: The workflow endpoints.
     *
     * @param workflow the workflow value to set.
     * @return the FlowEndpointsConfiguration object itself.
     */
    public FlowEndpointsConfiguration withWorkflow(FlowEndpoints workflow) {
        this.workflow = workflow;
        return this;
    }

    /**
     * Get the connector property: The connector endpoints.
     *
     * @return the connector value.
     */
    public FlowEndpoints connector() {
        return this.connector;
    }

    /**
     * Set the connector property: The connector endpoints.
     *
     * @param connector the connector value to set.
     * @return the FlowEndpointsConfiguration object itself.
     */
    public FlowEndpointsConfiguration withConnector(FlowEndpoints connector) {
        this.connector = connector;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (workflow() != null) {
            workflow().validate();
        }
        if (connector() != null) {
            connector().validate();
        }
    }
}
