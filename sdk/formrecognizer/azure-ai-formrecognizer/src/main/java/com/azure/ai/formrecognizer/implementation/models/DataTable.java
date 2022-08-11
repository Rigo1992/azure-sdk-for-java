// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Information about the extracted table contained in a page. */
@Fluent
public final class DataTable {
    /*
     * Number of rows.
     */
    @JsonProperty(value = "rows", required = true)
    private int rows;

    /*
     * Number of columns.
     */
    @JsonProperty(value = "columns", required = true)
    private int columns;

    /*
     * List of cells contained in the table.
     */
    @JsonProperty(value = "cells", required = true)
    private List<DataTableCell> cells;

    /*
     * Bounding box of the table.
     */
    @JsonProperty(value = "boundingBox", required = true)
    private List<Float> boundingBox;

    /**
     * Get the rows property: Number of rows.
     *
     * @return the rows value.
     */
    public int getRows() {
        return this.rows;
    }

    /**
     * Set the rows property: Number of rows.
     *
     * @param rows the rows value to set.
     * @return the DataTable object itself.
     */
    public DataTable setRows(int rows) {
        this.rows = rows;
        return this;
    }

    /**
     * Get the columns property: Number of columns.
     *
     * @return the columns value.
     */
    public int getColumns() {
        return this.columns;
    }

    /**
     * Set the columns property: Number of columns.
     *
     * @param columns the columns value to set.
     * @return the DataTable object itself.
     */
    public DataTable setColumns(int columns) {
        this.columns = columns;
        return this;
    }

    /**
     * Get the cells property: List of cells contained in the table.
     *
     * @return the cells value.
     */
    public List<DataTableCell> getCells() {
        return this.cells;
    }

    /**
     * Set the cells property: List of cells contained in the table.
     *
     * @param cells the cells value to set.
     * @return the DataTable object itself.
     */
    public DataTable setCells(List<DataTableCell> cells) {
        this.cells = cells;
        return this;
    }

    /**
     * Get the boundingBox property: Bounding box of the table.
     *
     * @return the boundingBox value.
     */
    public List<Float> getBoundingBox() {
        return this.boundingBox;
    }

    /**
     * Set the boundingBox property: Bounding box of the table.
     *
     * @param boundingBox the boundingBox value to set.
     * @return the DataTable object itself.
     */
    public DataTable setBoundingBox(List<Float> boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }
}
