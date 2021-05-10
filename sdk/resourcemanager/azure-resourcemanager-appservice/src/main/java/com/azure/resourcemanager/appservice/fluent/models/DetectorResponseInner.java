// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.models.DataProviderMetadata;
import com.azure.resourcemanager.appservice.models.DetectorInfo;
import com.azure.resourcemanager.appservice.models.DiagnosticData;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.azure.resourcemanager.appservice.models.QueryUtterancesResults;
import com.azure.resourcemanager.appservice.models.Status;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Class representing Response from Detector. */
@JsonFlatten
@Fluent
public class DetectorResponseInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DetectorResponseInner.class);

    /*
     * metadata for the detector
     */
    @JsonProperty(value = "properties.metadata")
    private DetectorInfo metadata;

    /*
     * Data Set
     */
    @JsonProperty(value = "properties.dataset")
    private List<DiagnosticData> dataset;

    /*
     * Indicates status of the most severe insight.
     */
    @JsonProperty(value = "properties.status")
    private Status status;

    /*
     * Additional configuration for different data providers to be used by the
     * UI
     */
    @JsonProperty(value = "properties.dataProvidersMetadata")
    private List<DataProviderMetadata> dataProvidersMetadata;

    /*
     * Suggested utterances where the detector can be applicable.
     */
    @JsonProperty(value = "properties.suggestedUtterances")
    private QueryUtterancesResults suggestedUtterances;

    /**
     * Get the metadata property: metadata for the detector.
     *
     * @return the metadata value.
     */
    public DetectorInfo metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: metadata for the detector.
     *
     * @param metadata the metadata value to set.
     * @return the DetectorResponseInner object itself.
     */
    public DetectorResponseInner withMetadata(DetectorInfo metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the dataset property: Data Set.
     *
     * @return the dataset value.
     */
    public List<DiagnosticData> dataset() {
        return this.dataset;
    }

    /**
     * Set the dataset property: Data Set.
     *
     * @param dataset the dataset value to set.
     * @return the DetectorResponseInner object itself.
     */
    public DetectorResponseInner withDataset(List<DiagnosticData> dataset) {
        this.dataset = dataset;
        return this;
    }

    /**
     * Get the status property: Indicates status of the most severe insight.
     *
     * @return the status value.
     */
    public Status status() {
        return this.status;
    }

    /**
     * Set the status property: Indicates status of the most severe insight.
     *
     * @param status the status value to set.
     * @return the DetectorResponseInner object itself.
     */
    public DetectorResponseInner withStatus(Status status) {
        this.status = status;
        return this;
    }

    /**
     * Get the dataProvidersMetadata property: Additional configuration for different data providers to be used by the
     * UI.
     *
     * @return the dataProvidersMetadata value.
     */
    public List<DataProviderMetadata> dataProvidersMetadata() {
        return this.dataProvidersMetadata;
    }

    /**
     * Set the dataProvidersMetadata property: Additional configuration for different data providers to be used by the
     * UI.
     *
     * @param dataProvidersMetadata the dataProvidersMetadata value to set.
     * @return the DetectorResponseInner object itself.
     */
    public DetectorResponseInner withDataProvidersMetadata(List<DataProviderMetadata> dataProvidersMetadata) {
        this.dataProvidersMetadata = dataProvidersMetadata;
        return this;
    }

    /**
     * Get the suggestedUtterances property: Suggested utterances where the detector can be applicable.
     *
     * @return the suggestedUtterances value.
     */
    public QueryUtterancesResults suggestedUtterances() {
        return this.suggestedUtterances;
    }

    /**
     * Set the suggestedUtterances property: Suggested utterances where the detector can be applicable.
     *
     * @param suggestedUtterances the suggestedUtterances value to set.
     * @return the DetectorResponseInner object itself.
     */
    public DetectorResponseInner withSuggestedUtterances(QueryUtterancesResults suggestedUtterances) {
        this.suggestedUtterances = suggestedUtterances;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DetectorResponseInner withKind(String kind) {
        super.withKind(kind);
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
        if (metadata() != null) {
            metadata().validate();
        }
        if (dataset() != null) {
            dataset().forEach(e -> e.validate());
        }
        if (status() != null) {
            status().validate();
        }
        if (dataProvidersMetadata() != null) {
            dataProvidersMetadata().forEach(e -> e.validate());
        }
        if (suggestedUtterances() != null) {
            suggestedUtterances().validate();
        }
    }
}
