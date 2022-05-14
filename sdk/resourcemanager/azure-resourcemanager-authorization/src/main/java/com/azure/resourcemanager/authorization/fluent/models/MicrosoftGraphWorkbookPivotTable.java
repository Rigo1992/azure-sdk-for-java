// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** workbookPivotTable. */
@Fluent
public final class MicrosoftGraphWorkbookPivotTable extends MicrosoftGraphEntity {
    /*
     * Name of the PivotTable.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * workbookWorksheet
     */
    @JsonProperty(value = "worksheet")
    private MicrosoftGraphWorkbookWorksheet worksheet;

    /*
     * workbookPivotTable
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the name property: Name of the PivotTable.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the PivotTable.
     *
     * @param name the name value to set.
     * @return the MicrosoftGraphWorkbookPivotTable object itself.
     */
    public MicrosoftGraphWorkbookPivotTable withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the worksheet property: workbookWorksheet.
     *
     * @return the worksheet value.
     */
    public MicrosoftGraphWorkbookWorksheet worksheet() {
        return this.worksheet;
    }

    /**
     * Set the worksheet property: workbookWorksheet.
     *
     * @param worksheet the worksheet value to set.
     * @return the MicrosoftGraphWorkbookPivotTable object itself.
     */
    public MicrosoftGraphWorkbookPivotTable withWorksheet(MicrosoftGraphWorkbookWorksheet worksheet) {
        this.worksheet = worksheet;
        return this;
    }

    /**
     * Get the additionalProperties property: workbookPivotTable.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: workbookPivotTable.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphWorkbookPivotTable object itself.
     */
    public MicrosoftGraphWorkbookPivotTable withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphWorkbookPivotTable withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (worksheet() != null) {
            worksheet().validate();
        }
    }
}
