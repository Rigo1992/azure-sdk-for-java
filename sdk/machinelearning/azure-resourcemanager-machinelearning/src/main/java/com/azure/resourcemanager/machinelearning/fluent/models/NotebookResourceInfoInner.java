// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.machinelearning.models.NotebookPreparationError;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The NotebookResourceInfo model. */
@Fluent
public final class NotebookResourceInfoInner {
    /*
     * The fqdn property.
     */
    @JsonProperty(value = "fqdn")
    private String fqdn;

    /*
     * the data plane resourceId that used to initialize notebook component
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /*
     * The error that occurs when preparing notebook.
     */
    @JsonProperty(value = "notebookPreparationError")
    private NotebookPreparationError notebookPreparationError;

    /** Creates an instance of NotebookResourceInfoInner class. */
    public NotebookResourceInfoInner() {
    }

    /**
     * Get the fqdn property: The fqdn property.
     *
     * @return the fqdn value.
     */
    public String fqdn() {
        return this.fqdn;
    }

    /**
     * Set the fqdn property: The fqdn property.
     *
     * @param fqdn the fqdn value to set.
     * @return the NotebookResourceInfoInner object itself.
     */
    public NotebookResourceInfoInner withFqdn(String fqdn) {
        this.fqdn = fqdn;
        return this;
    }

    /**
     * Get the resourceId property: the data plane resourceId that used to initialize notebook component.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: the data plane resourceId that used to initialize notebook component.
     *
     * @param resourceId the resourceId value to set.
     * @return the NotebookResourceInfoInner object itself.
     */
    public NotebookResourceInfoInner withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the notebookPreparationError property: The error that occurs when preparing notebook.
     *
     * @return the notebookPreparationError value.
     */
    public NotebookPreparationError notebookPreparationError() {
        return this.notebookPreparationError;
    }

    /**
     * Set the notebookPreparationError property: The error that occurs when preparing notebook.
     *
     * @param notebookPreparationError the notebookPreparationError value to set.
     * @return the NotebookResourceInfoInner object itself.
     */
    public NotebookResourceInfoInner withNotebookPreparationError(NotebookPreparationError notebookPreparationError) {
        this.notebookPreparationError = notebookPreparationError;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (notebookPreparationError() != null) {
            notebookPreparationError().validate();
        }
    }
}
