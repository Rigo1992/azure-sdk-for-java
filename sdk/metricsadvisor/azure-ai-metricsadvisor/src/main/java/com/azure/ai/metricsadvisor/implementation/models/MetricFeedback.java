// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

/**
 * The MetricFeedback model.
 */
@Fluent
public class MetricFeedback implements JsonSerializable<MetricFeedback> {
    /*
     * feedback unique id
     */
    private UUID feedbackId;

    /*
     * feedback created time
     */
    private OffsetDateTime createdTime;

    /*
     * user who gives this feedback
     */
    private String userPrincipal;

    /*
     * metric unique id
     */
    private UUID metricId;

    /*
     * The dimensionFilter property.
     */
    private FeedbackDimensionFilter dimensionFilter;

    /**
     * Creates an instance of MetricFeedback class.
     */
    public MetricFeedback() {
    }

    /**
     * Get the feedbackId property: feedback unique id.
     * 
     * @return the feedbackId value.
     */
    public UUID getFeedbackId() {
        return this.feedbackId;
    }

    /**
     * Set the feedbackId property: feedback unique id.
     * 
     * @param feedbackId the feedbackId value to set.
     * @return the MetricFeedback object itself.
     */
    MetricFeedback setFeedbackId(UUID feedbackId) {
        this.feedbackId = feedbackId;
        return this;
    }

    /**
     * Get the createdTime property: feedback created time.
     * 
     * @return the createdTime value.
     */
    public OffsetDateTime getCreatedTime() {
        return this.createdTime;
    }

    /**
     * Set the createdTime property: feedback created time.
     * 
     * @param createdTime the createdTime value to set.
     * @return the MetricFeedback object itself.
     */
    MetricFeedback setCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * Get the userPrincipal property: user who gives this feedback.
     * 
     * @return the userPrincipal value.
     */
    public String getUserPrincipal() {
        return this.userPrincipal;
    }

    /**
     * Set the userPrincipal property: user who gives this feedback.
     * 
     * @param userPrincipal the userPrincipal value to set.
     * @return the MetricFeedback object itself.
     */
    MetricFeedback setUserPrincipal(String userPrincipal) {
        this.userPrincipal = userPrincipal;
        return this;
    }

    /**
     * Get the metricId property: metric unique id.
     * 
     * @return the metricId value.
     */
    public UUID getMetricId() {
        return this.metricId;
    }

    /**
     * Set the metricId property: metric unique id.
     * 
     * @param metricId the metricId value to set.
     * @return the MetricFeedback object itself.
     */
    public MetricFeedback setMetricId(UUID metricId) {
        this.metricId = metricId;
        return this;
    }

    /**
     * Get the dimensionFilter property: The dimensionFilter property.
     * 
     * @return the dimensionFilter value.
     */
    public FeedbackDimensionFilter getDimensionFilter() {
        return this.dimensionFilter;
    }

    /**
     * Set the dimensionFilter property: The dimensionFilter property.
     * 
     * @param dimensionFilter the dimensionFilter value to set.
     * @return the MetricFeedback object itself.
     */
    public MetricFeedback setDimensionFilter(FeedbackDimensionFilter dimensionFilter) {
        this.dimensionFilter = dimensionFilter;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("metricId", Objects.toString(this.metricId, null));
        jsonWriter.writeJsonField("dimensionFilter", this.dimensionFilter);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MetricFeedback from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MetricFeedback if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     * polymorphic discriminator.
     * @throws IOException If an error occurs while reading the MetricFeedback.
     */
    public static MetricFeedback fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            JsonReader readerToUse = reader.bufferObject();

            readerToUse.nextToken(); // Prepare for reading
            while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = readerToUse.getFieldName();
                readerToUse.nextToken();
                if ("feedbackType".equals(fieldName)) {
                    discriminatorValue = readerToUse.getString();
                    break;
                } else {
                    readerToUse.skipChildren();
                }
            }

            if (discriminatorValue != null) {
                readerToUse = readerToUse.reset();
            }
            // Use the discriminator value to determine which subtype should be deserialized.
            if ("Anomaly".equals(discriminatorValue)) {
                return AnomalyFeedback.fromJson(readerToUse);
            } else if ("ChangePoint".equals(discriminatorValue)) {
                return ChangePointFeedback.fromJson(readerToUse);
            } else if ("Comment".equals(discriminatorValue)) {
                return CommentFeedback.fromJson(readerToUse);
            } else if ("Period".equals(discriminatorValue)) {
                return PeriodFeedback.fromJson(readerToUse);
            } else {
                throw new IllegalStateException(
                    "Discriminator field 'feedbackType' didn't match one of the expected values 'Anomaly', 'ChangePoint', 'Comment', or 'Period'. It was: '"
                        + discriminatorValue + "'.");
            }
        });
    }
}
