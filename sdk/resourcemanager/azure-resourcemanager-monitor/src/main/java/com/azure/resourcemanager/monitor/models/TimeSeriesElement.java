// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.monitor.fluent.models.MetadataValueInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * A time series result type. The discriminator value is always TimeSeries in this case.
 */
@Fluent
public final class TimeSeriesElement {
    /*
     * the metadata values returned if $filter was specified in the call.
     */
    @JsonProperty(value = "metadatavalues")
    private List<MetadataValueInner> metadatavalues;

    /*
     * An array of data points representing the metric values.  This is only returned if a result type of data is
     * specified.
     */
    @JsonProperty(value = "data")
    private List<MetricValue> data;

    /**
     * Creates an instance of TimeSeriesElement class.
     */
    public TimeSeriesElement() {
    }

    /**
     * Get the metadatavalues property: the metadata values returned if $filter was specified in the call.
     *
     * @return the metadatavalues value.
     */
    public List<MetadataValueInner> metadatavalues() {
        return this.metadatavalues;
    }

    /**
     * Set the metadatavalues property: the metadata values returned if $filter was specified in the call.
     *
     * @param metadatavalues the metadatavalues value to set.
     * @return the TimeSeriesElement object itself.
     */
    public TimeSeriesElement withMetadatavalues(List<MetadataValueInner> metadatavalues) {
        this.metadatavalues = metadatavalues;
        return this;
    }

    /**
     * Get the data property: An array of data points representing the metric values.  This is only returned if a
     * result type of data is specified.
     *
     * @return the data value.
     */
    public List<MetricValue> data() {
        return this.data;
    }

    /**
     * Set the data property: An array of data points representing the metric values.  This is only returned if a
     * result type of data is specified.
     *
     * @param data the data value to set.
     * @return the TimeSeriesElement object itself.
     */
    public TimeSeriesElement withData(List<MetricValue> data) {
        this.data = data;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (metadatavalues() != null) {
            metadatavalues().forEach(e -> e.validate());
        }
        if (data() != null) {
            data().forEach(e -> e.validate());
        }
    }
}
