// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Data flow flowlet.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Flowlet")
@JsonFlatten
@Fluent
public class Flowlet extends DataFlow {
    /*
     * List of sources in Flowlet.
     */
    @JsonProperty(value = "typeProperties.sources")
    private List<DataFlowSource> sources;

    /*
     * List of sinks in Flowlet.
     */
    @JsonProperty(value = "typeProperties.sinks")
    private List<DataFlowSink> sinks;

    /*
     * List of transformations in Flowlet.
     */
    @JsonProperty(value = "typeProperties.transformations")
    private List<Transformation> transformations;

    /*
     * Flowlet script.
     */
    @JsonProperty(value = "typeProperties.script")
    private String script;

    /*
     * Flowlet script lines.
     */
    @JsonProperty(value = "typeProperties.scriptLines")
    private List<String> scriptLines;

    /**
     * Creates an instance of Flowlet class.
     */
    public Flowlet() {
    }

    /**
     * Get the sources property: List of sources in Flowlet.
     * 
     * @return the sources value.
     */
    public List<DataFlowSource> getSources() {
        return this.sources;
    }

    /**
     * Set the sources property: List of sources in Flowlet.
     * 
     * @param sources the sources value to set.
     * @return the Flowlet object itself.
     */
    public Flowlet setSources(List<DataFlowSource> sources) {
        this.sources = sources;
        return this;
    }

    /**
     * Get the sinks property: List of sinks in Flowlet.
     * 
     * @return the sinks value.
     */
    public List<DataFlowSink> getSinks() {
        return this.sinks;
    }

    /**
     * Set the sinks property: List of sinks in Flowlet.
     * 
     * @param sinks the sinks value to set.
     * @return the Flowlet object itself.
     */
    public Flowlet setSinks(List<DataFlowSink> sinks) {
        this.sinks = sinks;
        return this;
    }

    /**
     * Get the transformations property: List of transformations in Flowlet.
     * 
     * @return the transformations value.
     */
    public List<Transformation> getTransformations() {
        return this.transformations;
    }

    /**
     * Set the transformations property: List of transformations in Flowlet.
     * 
     * @param transformations the transformations value to set.
     * @return the Flowlet object itself.
     */
    public Flowlet setTransformations(List<Transformation> transformations) {
        this.transformations = transformations;
        return this;
    }

    /**
     * Get the script property: Flowlet script.
     * 
     * @return the script value.
     */
    public String getScript() {
        return this.script;
    }

    /**
     * Set the script property: Flowlet script.
     * 
     * @param script the script value to set.
     * @return the Flowlet object itself.
     */
    public Flowlet setScript(String script) {
        this.script = script;
        return this;
    }

    /**
     * Get the scriptLines property: Flowlet script lines.
     * 
     * @return the scriptLines value.
     */
    public List<String> getScriptLines() {
        return this.scriptLines;
    }

    /**
     * Set the scriptLines property: Flowlet script lines.
     * 
     * @param scriptLines the scriptLines value to set.
     * @return the Flowlet object itself.
     */
    public Flowlet setScriptLines(List<String> scriptLines) {
        this.scriptLines = scriptLines;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Flowlet setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Flowlet setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Flowlet setFolder(DataFlowFolder folder) {
        super.setFolder(folder);
        return this;
    }
}
