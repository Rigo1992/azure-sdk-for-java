// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.documentintelligence.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Description of the field semantic schema using a JSON Schema style syntax.
 */
@Immutable
public final class DocumentFieldSchema {
    /*
     * Semantic data type of the field value.
     */
    @Generated
    @JsonProperty(value = "type")
    private DocumentFieldType type;

    /*
     * Field description.
     */
    @Generated
    @JsonProperty(value = "description")
    private String description;

    /*
     * Example field content.
     */
    @Generated
    @JsonProperty(value = "example")
    private String example;

    /*
     * Field type schema of each array element.
     */
    @Generated
    @JsonProperty(value = "items")
    private DocumentFieldSchema items;

    /*
     * Named sub-fields of the object field.
     */
    @Generated
    @JsonProperty(value = "properties")
    private Map<String, DocumentFieldSchema> properties;

    /**
     * Creates an instance of DocumentFieldSchema class.
     * 
     * @param type the type value to set.
     */
    @Generated
    @JsonCreator
    private DocumentFieldSchema(@JsonProperty(value = "type") DocumentFieldType type) {
        this.type = type;
    }

    /**
     * Get the type property: Semantic data type of the field value.
     * 
     * @return the type value.
     */
    @Generated
    public DocumentFieldType getType() {
        return this.type;
    }

    /**
     * Get the description property: Field description.
     * 
     * @return the description value.
     */
    @Generated
    public String getDescription() {
        return this.description;
    }

    /**
     * Get the example property: Example field content.
     * 
     * @return the example value.
     */
    @Generated
    public String getExample() {
        return this.example;
    }

    /**
     * Get the items property: Field type schema of each array element.
     * 
     * @return the items value.
     */
    @Generated
    public DocumentFieldSchema getItems() {
        return this.items;
    }

    /**
     * Get the properties property: Named sub-fields of the object field.
     * 
     * @return the properties value.
     */
    @Generated
    public Map<String, DocumentFieldSchema> getProperties() {
        return this.properties;
    }
}
