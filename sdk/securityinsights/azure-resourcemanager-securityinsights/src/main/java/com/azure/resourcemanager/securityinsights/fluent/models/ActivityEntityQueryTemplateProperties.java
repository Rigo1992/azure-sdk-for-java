// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.models.ActivityEntityQueryTemplatePropertiesQueryDefinitions;
import com.azure.resourcemanager.securityinsights.models.DataTypeDefinitions;
import com.azure.resourcemanager.securityinsights.models.EntityType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Describes activity entity query properties. */
@Fluent
public final class ActivityEntityQueryTemplateProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ActivityEntityQueryTemplateProperties.class);

    /*
     * The entity query title
     */
    @JsonProperty(value = "title")
    private String title;

    /*
     * The entity query content to display in timeline
     */
    @JsonProperty(value = "content")
    private String content;

    /*
     * The entity query description
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The Activity query definitions
     */
    @JsonProperty(value = "queryDefinitions")
    private ActivityEntityQueryTemplatePropertiesQueryDefinitions queryDefinitions;

    /*
     * List of required data types for the given entity query template
     */
    @JsonProperty(value = "dataTypes")
    private List<DataTypeDefinitions> dataTypes;

    /*
     * The type of the query's source entity
     */
    @JsonProperty(value = "inputEntityType")
    private EntityType inputEntityType;

    /*
     * List of the fields of the source entity that are required to run the
     * query
     */
    @JsonProperty(value = "requiredInputFieldsSets")
    private List<List<String>> requiredInputFieldsSets;

    /*
     * The query applied only to entities matching to all filters
     */
    @JsonProperty(value = "entitiesFilter")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, List<String>> entitiesFilter;

    /**
     * Get the title property: The entity query title.
     *
     * @return the title value.
     */
    public String title() {
        return this.title;
    }

    /**
     * Set the title property: The entity query title.
     *
     * @param title the title value to set.
     * @return the ActivityEntityQueryTemplateProperties object itself.
     */
    public ActivityEntityQueryTemplateProperties withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get the content property: The entity query content to display in timeline.
     *
     * @return the content value.
     */
    public String content() {
        return this.content;
    }

    /**
     * Set the content property: The entity query content to display in timeline.
     *
     * @param content the content value to set.
     * @return the ActivityEntityQueryTemplateProperties object itself.
     */
    public ActivityEntityQueryTemplateProperties withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * Get the description property: The entity query description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The entity query description.
     *
     * @param description the description value to set.
     * @return the ActivityEntityQueryTemplateProperties object itself.
     */
    public ActivityEntityQueryTemplateProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the queryDefinitions property: The Activity query definitions.
     *
     * @return the queryDefinitions value.
     */
    public ActivityEntityQueryTemplatePropertiesQueryDefinitions queryDefinitions() {
        return this.queryDefinitions;
    }

    /**
     * Set the queryDefinitions property: The Activity query definitions.
     *
     * @param queryDefinitions the queryDefinitions value to set.
     * @return the ActivityEntityQueryTemplateProperties object itself.
     */
    public ActivityEntityQueryTemplateProperties withQueryDefinitions(
        ActivityEntityQueryTemplatePropertiesQueryDefinitions queryDefinitions) {
        this.queryDefinitions = queryDefinitions;
        return this;
    }

    /**
     * Get the dataTypes property: List of required data types for the given entity query template.
     *
     * @return the dataTypes value.
     */
    public List<DataTypeDefinitions> dataTypes() {
        return this.dataTypes;
    }

    /**
     * Set the dataTypes property: List of required data types for the given entity query template.
     *
     * @param dataTypes the dataTypes value to set.
     * @return the ActivityEntityQueryTemplateProperties object itself.
     */
    public ActivityEntityQueryTemplateProperties withDataTypes(List<DataTypeDefinitions> dataTypes) {
        this.dataTypes = dataTypes;
        return this;
    }

    /**
     * Get the inputEntityType property: The type of the query's source entity.
     *
     * @return the inputEntityType value.
     */
    public EntityType inputEntityType() {
        return this.inputEntityType;
    }

    /**
     * Set the inputEntityType property: The type of the query's source entity.
     *
     * @param inputEntityType the inputEntityType value to set.
     * @return the ActivityEntityQueryTemplateProperties object itself.
     */
    public ActivityEntityQueryTemplateProperties withInputEntityType(EntityType inputEntityType) {
        this.inputEntityType = inputEntityType;
        return this;
    }

    /**
     * Get the requiredInputFieldsSets property: List of the fields of the source entity that are required to run the
     * query.
     *
     * @return the requiredInputFieldsSets value.
     */
    public List<List<String>> requiredInputFieldsSets() {
        return this.requiredInputFieldsSets;
    }

    /**
     * Set the requiredInputFieldsSets property: List of the fields of the source entity that are required to run the
     * query.
     *
     * @param requiredInputFieldsSets the requiredInputFieldsSets value to set.
     * @return the ActivityEntityQueryTemplateProperties object itself.
     */
    public ActivityEntityQueryTemplateProperties withRequiredInputFieldsSets(
        List<List<String>> requiredInputFieldsSets) {
        this.requiredInputFieldsSets = requiredInputFieldsSets;
        return this;
    }

    /**
     * Get the entitiesFilter property: The query applied only to entities matching to all filters.
     *
     * @return the entitiesFilter value.
     */
    public Map<String, List<String>> entitiesFilter() {
        return this.entitiesFilter;
    }

    /**
     * Set the entitiesFilter property: The query applied only to entities matching to all filters.
     *
     * @param entitiesFilter the entitiesFilter value to set.
     * @return the ActivityEntityQueryTemplateProperties object itself.
     */
    public ActivityEntityQueryTemplateProperties withEntitiesFilter(Map<String, List<String>> entitiesFilter) {
        this.entitiesFilter = entitiesFilter;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (queryDefinitions() != null) {
            queryDefinitions().validate();
        }
        if (dataTypes() != null) {
            dataTypes().forEach(e -> e.validate());
        }
    }
}
