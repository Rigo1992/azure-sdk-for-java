// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.monitor.models.MetricNamespaceName;
import com.azure.resourcemanager.monitor.models.NamespaceClassification;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Metric namespace class specifies the metadata for a metric namespace.
 */
@Fluent
public final class MetricNamespaceInner {
    /*
     * The ID of the metric namespace.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The type of the namespace.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * The escaped name of the namespace.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Kind of namespace
     */
    @JsonProperty(value = "classification")
    private NamespaceClassification classification;

    /*
     * Properties which include the fully qualified namespace name.
     */
    @JsonProperty(value = "properties")
    private MetricNamespaceName properties;

    /**
     * Creates an instance of MetricNamespaceInner class.
     */
    public MetricNamespaceInner() {
    }

    /**
     * Get the id property: The ID of the metric namespace.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The ID of the metric namespace.
     *
     * @param id the id value to set.
     * @return the MetricNamespaceInner object itself.
     */
    public MetricNamespaceInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the type property: The type of the namespace.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The type of the namespace.
     *
     * @param type the type value to set.
     * @return the MetricNamespaceInner object itself.
     */
    public MetricNamespaceInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the name property: The escaped name of the namespace.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The escaped name of the namespace.
     *
     * @param name the name value to set.
     * @return the MetricNamespaceInner object itself.
     */
    public MetricNamespaceInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the classification property: Kind of namespace.
     *
     * @return the classification value.
     */
    public NamespaceClassification classification() {
        return this.classification;
    }

    /**
     * Set the classification property: Kind of namespace.
     *
     * @param classification the classification value to set.
     * @return the MetricNamespaceInner object itself.
     */
    public MetricNamespaceInner withClassification(NamespaceClassification classification) {
        this.classification = classification;
        return this;
    }

    /**
     * Get the properties property: Properties which include the fully qualified namespace name.
     *
     * @return the properties value.
     */
    public MetricNamespaceName properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties which include the fully qualified namespace name.
     *
     * @param properties the properties value to set.
     * @return the MetricNamespaceInner object itself.
     */
    public MetricNamespaceInner withProperties(MetricNamespaceName properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
