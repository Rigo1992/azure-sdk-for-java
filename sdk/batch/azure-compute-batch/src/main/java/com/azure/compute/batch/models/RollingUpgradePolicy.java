// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.Duration;

/**
 * The configuration parameters used while performing a rolling upgrade.
 */
@Fluent
public final class RollingUpgradePolicy implements JsonSerializable<RollingUpgradePolicy> {

    /*
     * Allow VMSS to ignore AZ boundaries when constructing upgrade batches. Take into consideration the Update Domain
     * and maxBatchInstancePercent to determine the batch size. This field is able to be set to true or false only when
     * using NodePlacementConfiguration as Zonal.
     */
    @Generated
    private Boolean enableCrossZoneUpgrade;

    /*
     * The maximum percent of total virtual machine instances that will be upgraded simultaneously by the rolling
     * upgrade in one batch. As this is a maximum, unhealthy instances in previous or future batches can cause the
     * percentage of instances in a batch to decrease to ensure higher reliability. The value of this field should be
     * between 5 and 100, inclusive. If both maxBatchInstancePercent and maxUnhealthyInstancePercent are assigned with
     * value, the value of maxBatchInstancePercent should not be more than maxUnhealthyInstancePercent.
     */
    @Generated
    private Integer maxBatchInstancePercent;

    /*
     * The maximum percentage of the total virtual machine instances in the scale set that can be simultaneously
     * unhealthy, either as a result of being upgraded, or by being found in an unhealthy state by the virtual machine
     * health checks before the rolling upgrade aborts. This constraint will be checked prior to starting any batch. The
     * value of this field should be between 5 and 100, inclusive. If both maxBatchInstancePercent and
     * maxUnhealthyInstancePercent are assigned with value, the value of maxBatchInstancePercent should not be more than
     * maxUnhealthyInstancePercent.
     */
    @Generated
    private Integer maxUnhealthyInstancePercent;

    /*
     * The maximum percentage of upgraded virtual machine instances that can be found to be in an unhealthy state. This
     * check will happen after each batch is upgraded. If this percentage is ever exceeded, the rolling update aborts.
     * The value of this field should be between 0 and 100, inclusive.
     */
    @Generated
    private Integer maxUnhealthyUpgradedInstancePercent;

    /*
     * The wait time between completing the update for all virtual machines in one batch and starting the next batch.
     * The time duration should be specified in ISO 8601 format..
     */
    @Generated
    private Duration pauseTimeBetweenBatches;

    /*
     * Upgrade all unhealthy instances in a scale set before any healthy instances.
     */
    @Generated
    private Boolean prioritizeUnhealthyInstances;

    /*
     * Rollback failed instances to previous model if the Rolling Upgrade policy is violated.
     */
    @Generated
    private Boolean rollbackFailedInstancesOnPolicyBreach;

    /**
     * Creates an instance of RollingUpgradePolicy class.
     */
    @Generated
    public RollingUpgradePolicy() {
    }

    /**
     * Get the enableCrossZoneUpgrade property: Allow VMSS to ignore AZ boundaries when constructing upgrade batches.
     * Take into consideration the Update Domain and maxBatchInstancePercent to determine the batch size. This field is
     * able to be set to true or false only when using NodePlacementConfiguration as Zonal.
     *
     * @return the enableCrossZoneUpgrade value.
     */
    @Generated
    public Boolean isEnableCrossZoneUpgrade() {
        return this.enableCrossZoneUpgrade;
    }

    /**
     * Set the enableCrossZoneUpgrade property: Allow VMSS to ignore AZ boundaries when constructing upgrade batches.
     * Take into consideration the Update Domain and maxBatchInstancePercent to determine the batch size. This field is
     * able to be set to true or false only when using NodePlacementConfiguration as Zonal.
     *
     * @param enableCrossZoneUpgrade the enableCrossZoneUpgrade value to set.
     * @return the RollingUpgradePolicy object itself.
     */
    @Generated
    public RollingUpgradePolicy setEnableCrossZoneUpgrade(Boolean enableCrossZoneUpgrade) {
        this.enableCrossZoneUpgrade = enableCrossZoneUpgrade;
        return this;
    }

    /**
     * Get the maxBatchInstancePercent property: The maximum percent of total virtual machine instances that will be
     * upgraded simultaneously by the rolling upgrade in one batch. As this is a maximum, unhealthy instances in
     * previous or future batches can cause the percentage of instances in a batch to decrease to ensure higher
     * reliability. The value of this field should be between 5 and 100, inclusive. If both maxBatchInstancePercent and
     * maxUnhealthyInstancePercent are assigned with value, the value of maxBatchInstancePercent should not be more than
     * maxUnhealthyInstancePercent.
     *
     * @return the maxBatchInstancePercent value.
     */
    @Generated
    public Integer getMaxBatchInstancePercent() {
        return this.maxBatchInstancePercent;
    }

    /**
     * Set the maxBatchInstancePercent property: The maximum percent of total virtual machine instances that will be
     * upgraded simultaneously by the rolling upgrade in one batch. As this is a maximum, unhealthy instances in
     * previous or future batches can cause the percentage of instances in a batch to decrease to ensure higher
     * reliability. The value of this field should be between 5 and 100, inclusive. If both maxBatchInstancePercent and
     * maxUnhealthyInstancePercent are assigned with value, the value of maxBatchInstancePercent should not be more than
     * maxUnhealthyInstancePercent.
     *
     * @param maxBatchInstancePercent the maxBatchInstancePercent value to set.
     * @return the RollingUpgradePolicy object itself.
     */
    @Generated
    public RollingUpgradePolicy setMaxBatchInstancePercent(Integer maxBatchInstancePercent) {
        this.maxBatchInstancePercent = maxBatchInstancePercent;
        return this;
    }

    /**
     * Get the maxUnhealthyInstancePercent property: The maximum percentage of the total virtual machine instances in
     * the scale set that can be simultaneously unhealthy, either as a result of being upgraded, or by being found in an
     * unhealthy state by the virtual machine health checks before the rolling upgrade aborts. This constraint will be
     * checked prior to starting any batch. The value of this field should be between 5 and 100, inclusive. If both
     * maxBatchInstancePercent and maxUnhealthyInstancePercent are assigned with value, the value of
     * maxBatchInstancePercent should not be more than maxUnhealthyInstancePercent.
     *
     * @return the maxUnhealthyInstancePercent value.
     */
    @Generated
    public Integer getMaxUnhealthyInstancePercent() {
        return this.maxUnhealthyInstancePercent;
    }

    /**
     * Set the maxUnhealthyInstancePercent property: The maximum percentage of the total virtual machine instances in
     * the scale set that can be simultaneously unhealthy, either as a result of being upgraded, or by being found in an
     * unhealthy state by the virtual machine health checks before the rolling upgrade aborts. This constraint will be
     * checked prior to starting any batch. The value of this field should be between 5 and 100, inclusive. If both
     * maxBatchInstancePercent and maxUnhealthyInstancePercent are assigned with value, the value of
     * maxBatchInstancePercent should not be more than maxUnhealthyInstancePercent.
     *
     * @param maxUnhealthyInstancePercent the maxUnhealthyInstancePercent value to set.
     * @return the RollingUpgradePolicy object itself.
     */
    @Generated
    public RollingUpgradePolicy setMaxUnhealthyInstancePercent(Integer maxUnhealthyInstancePercent) {
        this.maxUnhealthyInstancePercent = maxUnhealthyInstancePercent;
        return this;
    }

    /**
     * Get the maxUnhealthyUpgradedInstancePercent property: The maximum percentage of upgraded virtual machine
     * instances that can be found to be in an unhealthy state. This check will happen after each batch is upgraded. If
     * this percentage is ever exceeded, the rolling update aborts. The value of this field should be between 0 and 100,
     * inclusive.
     *
     * @return the maxUnhealthyUpgradedInstancePercent value.
     */
    @Generated
    public Integer getMaxUnhealthyUpgradedInstancePercent() {
        return this.maxUnhealthyUpgradedInstancePercent;
    }

    /**
     * Set the maxUnhealthyUpgradedInstancePercent property: The maximum percentage of upgraded virtual machine
     * instances that can be found to be in an unhealthy state. This check will happen after each batch is upgraded. If
     * this percentage is ever exceeded, the rolling update aborts. The value of this field should be between 0 and 100,
     * inclusive.
     *
     * @param maxUnhealthyUpgradedInstancePercent the maxUnhealthyUpgradedInstancePercent value to set.
     * @return the RollingUpgradePolicy object itself.
     */
    @Generated
    public RollingUpgradePolicy setMaxUnhealthyUpgradedInstancePercent(Integer maxUnhealthyUpgradedInstancePercent) {
        this.maxUnhealthyUpgradedInstancePercent = maxUnhealthyUpgradedInstancePercent;
        return this;
    }

    /**
     * Get the pauseTimeBetweenBatches property: The wait time between completing the update for all virtual machines in
     * one batch and starting the next batch. The time duration should be specified in ISO 8601 format..
     *
     * @return the pauseTimeBetweenBatches value.
     */
    @Generated
    public Duration getPauseTimeBetweenBatches() {
        return this.pauseTimeBetweenBatches;
    }

    /**
     * Set the pauseTimeBetweenBatches property: The wait time between completing the update for all virtual machines in
     * one batch and starting the next batch. The time duration should be specified in ISO 8601 format..
     *
     * @param pauseTimeBetweenBatches the pauseTimeBetweenBatches value to set.
     * @return the RollingUpgradePolicy object itself.
     */
    @Generated
    public RollingUpgradePolicy setPauseTimeBetweenBatches(Duration pauseTimeBetweenBatches) {
        this.pauseTimeBetweenBatches = pauseTimeBetweenBatches;
        return this;
    }

    /**
     * Get the prioritizeUnhealthyInstances property: Upgrade all unhealthy instances in a scale set before any healthy
     * instances.
     *
     * @return the prioritizeUnhealthyInstances value.
     */
    @Generated
    public Boolean isPrioritizeUnhealthyInstances() {
        return this.prioritizeUnhealthyInstances;
    }

    /**
     * Set the prioritizeUnhealthyInstances property: Upgrade all unhealthy instances in a scale set before any healthy
     * instances.
     *
     * @param prioritizeUnhealthyInstances the prioritizeUnhealthyInstances value to set.
     * @return the RollingUpgradePolicy object itself.
     */
    @Generated
    public RollingUpgradePolicy setPrioritizeUnhealthyInstances(Boolean prioritizeUnhealthyInstances) {
        this.prioritizeUnhealthyInstances = prioritizeUnhealthyInstances;
        return this;
    }

    /**
     * Get the rollbackFailedInstancesOnPolicyBreach property: Rollback failed instances to previous model if the
     * Rolling Upgrade policy is violated.
     *
     * @return the rollbackFailedInstancesOnPolicyBreach value.
     */
    @Generated
    public Boolean isRollbackFailedInstancesOnPolicyBreach() {
        return this.rollbackFailedInstancesOnPolicyBreach;
    }

    /**
     * Set the rollbackFailedInstancesOnPolicyBreach property: Rollback failed instances to previous model if the
     * Rolling Upgrade policy is violated.
     *
     * @param rollbackFailedInstancesOnPolicyBreach the rollbackFailedInstancesOnPolicyBreach value to set.
     * @return the RollingUpgradePolicy object itself.
     */
    @Generated
    public RollingUpgradePolicy
        setRollbackFailedInstancesOnPolicyBreach(Boolean rollbackFailedInstancesOnPolicyBreach) {
        this.rollbackFailedInstancesOnPolicyBreach = rollbackFailedInstancesOnPolicyBreach;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("enableCrossZoneUpgrade", this.enableCrossZoneUpgrade);
        jsonWriter.writeNumberField("maxBatchInstancePercent", this.maxBatchInstancePercent);
        jsonWriter.writeNumberField("maxUnhealthyInstancePercent", this.maxUnhealthyInstancePercent);
        jsonWriter.writeNumberField("maxUnhealthyUpgradedInstancePercent", this.maxUnhealthyUpgradedInstancePercent);
        jsonWriter.writeStringField("pauseTimeBetweenBatches",
            CoreUtils.durationToStringWithDays(this.pauseTimeBetweenBatches));
        jsonWriter.writeBooleanField("prioritizeUnhealthyInstances", this.prioritizeUnhealthyInstances);
        jsonWriter.writeBooleanField("rollbackFailedInstancesOnPolicyBreach",
            this.rollbackFailedInstancesOnPolicyBreach);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RollingUpgradePolicy from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of RollingUpgradePolicy if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RollingUpgradePolicy.
     */
    @Generated
    public static RollingUpgradePolicy fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RollingUpgradePolicy deserializedRollingUpgradePolicy = new RollingUpgradePolicy();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("enableCrossZoneUpgrade".equals(fieldName)) {
                    deserializedRollingUpgradePolicy.enableCrossZoneUpgrade
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("maxBatchInstancePercent".equals(fieldName)) {
                    deserializedRollingUpgradePolicy.maxBatchInstancePercent = reader.getNullable(JsonReader::getInt);
                } else if ("maxUnhealthyInstancePercent".equals(fieldName)) {
                    deserializedRollingUpgradePolicy.maxUnhealthyInstancePercent
                        = reader.getNullable(JsonReader::getInt);
                } else if ("maxUnhealthyUpgradedInstancePercent".equals(fieldName)) {
                    deserializedRollingUpgradePolicy.maxUnhealthyUpgradedInstancePercent
                        = reader.getNullable(JsonReader::getInt);
                } else if ("pauseTimeBetweenBatches".equals(fieldName)) {
                    deserializedRollingUpgradePolicy.pauseTimeBetweenBatches
                        = reader.getNullable(nonNullReader -> Duration.parse(nonNullReader.getString()));
                } else if ("prioritizeUnhealthyInstances".equals(fieldName)) {
                    deserializedRollingUpgradePolicy.prioritizeUnhealthyInstances
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("rollbackFailedInstancesOnPolicyBreach".equals(fieldName)) {
                    deserializedRollingUpgradePolicy.rollbackFailedInstancesOnPolicyBreach
                        = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedRollingUpgradePolicy;
        });
    }
}
