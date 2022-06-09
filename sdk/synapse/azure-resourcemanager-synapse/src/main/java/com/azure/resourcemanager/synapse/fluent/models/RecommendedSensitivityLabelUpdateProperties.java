// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.models.RecommendedSensitivityLabelUpdateKind;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of an operation executed on a recommended sensitivity label. */
@Fluent
public final class RecommendedSensitivityLabelUpdateProperties {
    /*
     * The op property.
     */
    @JsonProperty(value = "op", required = true)
    private RecommendedSensitivityLabelUpdateKind op;

    /*
     * Schema name of the column to update.
     */
    @JsonProperty(value = "schema", required = true)
    private String schema;

    /*
     * Table name of the column to update.
     */
    @JsonProperty(value = "table", required = true)
    private String table;

    /*
     * Column name to update.
     */
    @JsonProperty(value = "column", required = true)
    private String column;

    /**
     * Get the op property: The op property.
     *
     * @return the op value.
     */
    public RecommendedSensitivityLabelUpdateKind op() {
        return this.op;
    }

    /**
     * Set the op property: The op property.
     *
     * @param op the op value to set.
     * @return the RecommendedSensitivityLabelUpdateProperties object itself.
     */
    public RecommendedSensitivityLabelUpdateProperties withOp(RecommendedSensitivityLabelUpdateKind op) {
        this.op = op;
        return this;
    }

    /**
     * Get the schema property: Schema name of the column to update.
     *
     * @return the schema value.
     */
    public String schema() {
        return this.schema;
    }

    /**
     * Set the schema property: Schema name of the column to update.
     *
     * @param schema the schema value to set.
     * @return the RecommendedSensitivityLabelUpdateProperties object itself.
     */
    public RecommendedSensitivityLabelUpdateProperties withSchema(String schema) {
        this.schema = schema;
        return this;
    }

    /**
     * Get the table property: Table name of the column to update.
     *
     * @return the table value.
     */
    public String table() {
        return this.table;
    }

    /**
     * Set the table property: Table name of the column to update.
     *
     * @param table the table value to set.
     * @return the RecommendedSensitivityLabelUpdateProperties object itself.
     */
    public RecommendedSensitivityLabelUpdateProperties withTable(String table) {
        this.table = table;
        return this;
    }

    /**
     * Get the column property: Column name to update.
     *
     * @return the column value.
     */
    public String column() {
        return this.column;
    }

    /**
     * Set the column property: Column name to update.
     *
     * @param column the column value to set.
     * @return the RecommendedSensitivityLabelUpdateProperties object itself.
     */
    public RecommendedSensitivityLabelUpdateProperties withColumn(String column) {
        this.column = column;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (op() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property op in model RecommendedSensitivityLabelUpdateProperties"));
        }
        if (schema() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property schema in model RecommendedSensitivityLabelUpdateProperties"));
        }
        if (table() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property table in model RecommendedSensitivityLabelUpdateProperties"));
        }
        if (column() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property column in model RecommendedSensitivityLabelUpdateProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RecommendedSensitivityLabelUpdateProperties.class);
}
