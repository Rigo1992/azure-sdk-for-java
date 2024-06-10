// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity SQL Data Warehouse sink. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SqlDWSink")
@Fluent
public final class SqlDWSink extends CopySink {
    /*
     * SQL pre-copy script. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "preCopyScript")
    private Object preCopyScript;

    /*
     * Indicates to use PolyBase to copy data into SQL Data Warehouse when applicable. Type: boolean (or Expression
     * with resultType boolean).
     */
    @JsonProperty(value = "allowPolyBase")
    private Object allowPolyBase;

    /*
     * Specifies PolyBase-related settings when allowPolyBase is true.
     */
    @JsonProperty(value = "polyBaseSettings")
    private PolybaseSettings polyBaseSettings;

    /*
     * Indicates to use Copy Command to copy data into SQL Data Warehouse. Type: boolean (or Expression with resultType
     * boolean).
     */
    @JsonProperty(value = "allowCopyCommand")
    private Object allowCopyCommand;

    /*
     * Specifies Copy Command related settings when allowCopyCommand is true.
     */
    @JsonProperty(value = "copyCommandSettings")
    private DWCopyCommandSettings copyCommandSettings;

    /*
     * The option to handle sink table, such as autoCreate. For now only 'autoCreate' value is supported. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "tableOption")
    private Object tableOption;

    /** Creates an instance of SqlDWSink class. */
    public SqlDWSink() {}

    /**
     * Get the preCopyScript property: SQL pre-copy script. Type: string (or Expression with resultType string).
     *
     * @return the preCopyScript value.
     */
    public Object getPreCopyScript() {
        return this.preCopyScript;
    }

    /**
     * Set the preCopyScript property: SQL pre-copy script. Type: string (or Expression with resultType string).
     *
     * @param preCopyScript the preCopyScript value to set.
     * @return the SqlDWSink object itself.
     */
    public SqlDWSink setPreCopyScript(Object preCopyScript) {
        this.preCopyScript = preCopyScript;
        return this;
    }

    /**
     * Get the allowPolyBase property: Indicates to use PolyBase to copy data into SQL Data Warehouse when applicable.
     * Type: boolean (or Expression with resultType boolean).
     *
     * @return the allowPolyBase value.
     */
    public Object getAllowPolyBase() {
        return this.allowPolyBase;
    }

    /**
     * Set the allowPolyBase property: Indicates to use PolyBase to copy data into SQL Data Warehouse when applicable.
     * Type: boolean (or Expression with resultType boolean).
     *
     * @param allowPolyBase the allowPolyBase value to set.
     * @return the SqlDWSink object itself.
     */
    public SqlDWSink setAllowPolyBase(Object allowPolyBase) {
        this.allowPolyBase = allowPolyBase;
        return this;
    }

    /**
     * Get the polyBaseSettings property: Specifies PolyBase-related settings when allowPolyBase is true.
     *
     * @return the polyBaseSettings value.
     */
    public PolybaseSettings getPolyBaseSettings() {
        return this.polyBaseSettings;
    }

    /**
     * Set the polyBaseSettings property: Specifies PolyBase-related settings when allowPolyBase is true.
     *
     * @param polyBaseSettings the polyBaseSettings value to set.
     * @return the SqlDWSink object itself.
     */
    public SqlDWSink setPolyBaseSettings(PolybaseSettings polyBaseSettings) {
        this.polyBaseSettings = polyBaseSettings;
        return this;
    }

    /**
     * Get the allowCopyCommand property: Indicates to use Copy Command to copy data into SQL Data Warehouse. Type:
     * boolean (or Expression with resultType boolean).
     *
     * @return the allowCopyCommand value.
     */
    public Object getAllowCopyCommand() {
        return this.allowCopyCommand;
    }

    /**
     * Set the allowCopyCommand property: Indicates to use Copy Command to copy data into SQL Data Warehouse. Type:
     * boolean (or Expression with resultType boolean).
     *
     * @param allowCopyCommand the allowCopyCommand value to set.
     * @return the SqlDWSink object itself.
     */
    public SqlDWSink setAllowCopyCommand(Object allowCopyCommand) {
        this.allowCopyCommand = allowCopyCommand;
        return this;
    }

    /**
     * Get the copyCommandSettings property: Specifies Copy Command related settings when allowCopyCommand is true.
     *
     * @return the copyCommandSettings value.
     */
    public DWCopyCommandSettings getCopyCommandSettings() {
        return this.copyCommandSettings;
    }

    /**
     * Set the copyCommandSettings property: Specifies Copy Command related settings when allowCopyCommand is true.
     *
     * @param copyCommandSettings the copyCommandSettings value to set.
     * @return the SqlDWSink object itself.
     */
    public SqlDWSink setCopyCommandSettings(DWCopyCommandSettings copyCommandSettings) {
        this.copyCommandSettings = copyCommandSettings;
        return this;
    }

    /**
     * Get the tableOption property: The option to handle sink table, such as autoCreate. For now only 'autoCreate'
     * value is supported. Type: string (or Expression with resultType string).
     *
     * @return the tableOption value.
     */
    public Object getTableOption() {
        return this.tableOption;
    }

    /**
     * Set the tableOption property: The option to handle sink table, such as autoCreate. For now only 'autoCreate'
     * value is supported. Type: string (or Expression with resultType string).
     *
     * @param tableOption the tableOption value to set.
     * @return the SqlDWSink object itself.
     */
    public SqlDWSink setTableOption(Object tableOption) {
        this.tableOption = tableOption;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlDWSink setWriteBatchSize(Object writeBatchSize) {
        super.setWriteBatchSize(writeBatchSize);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlDWSink setWriteBatchTimeout(Object writeBatchTimeout) {
        super.setWriteBatchTimeout(writeBatchTimeout);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlDWSink setSinkRetryCount(Object sinkRetryCount) {
        super.setSinkRetryCount(sinkRetryCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlDWSink setSinkRetryWait(Object sinkRetryWait) {
        super.setSinkRetryWait(sinkRetryWait);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlDWSink setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }
}
