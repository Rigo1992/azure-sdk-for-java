// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;

/** The properties of the feedback queue for cloud-to-device messages. */
@Fluent
public final class FeedbackProperties {
    /*
     * The lock duration for the feedback queue. See:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#cloud-to-device-messages.
     */
    @JsonProperty(value = "lockDurationAsIso8601")
    private Duration lockDurationAsIso8601;

    /*
     * The period of time for which a message is available to consume before it is expired by the IoT hub. See:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#cloud-to-device-messages.
     */
    @JsonProperty(value = "ttlAsIso8601")
    private Duration ttlAsIso8601;

    /*
     * The number of times the IoT hub attempts to deliver a message on the feedback queue. See:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#cloud-to-device-messages.
     */
    @JsonProperty(value = "maxDeliveryCount")
    private Integer maxDeliveryCount;

    /** Creates an instance of FeedbackProperties class. */
    public FeedbackProperties() {
    }

    /**
     * Get the lockDurationAsIso8601 property: The lock duration for the feedback queue. See:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#cloud-to-device-messages.
     *
     * @return the lockDurationAsIso8601 value.
     */
    public Duration lockDurationAsIso8601() {
        return this.lockDurationAsIso8601;
    }

    /**
     * Set the lockDurationAsIso8601 property: The lock duration for the feedback queue. See:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#cloud-to-device-messages.
     *
     * @param lockDurationAsIso8601 the lockDurationAsIso8601 value to set.
     * @return the FeedbackProperties object itself.
     */
    public FeedbackProperties withLockDurationAsIso8601(Duration lockDurationAsIso8601) {
        this.lockDurationAsIso8601 = lockDurationAsIso8601;
        return this;
    }

    /**
     * Get the ttlAsIso8601 property: The period of time for which a message is available to consume before it is
     * expired by the IoT hub. See:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#cloud-to-device-messages.
     *
     * @return the ttlAsIso8601 value.
     */
    public Duration ttlAsIso8601() {
        return this.ttlAsIso8601;
    }

    /**
     * Set the ttlAsIso8601 property: The period of time for which a message is available to consume before it is
     * expired by the IoT hub. See:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#cloud-to-device-messages.
     *
     * @param ttlAsIso8601 the ttlAsIso8601 value to set.
     * @return the FeedbackProperties object itself.
     */
    public FeedbackProperties withTtlAsIso8601(Duration ttlAsIso8601) {
        this.ttlAsIso8601 = ttlAsIso8601;
        return this;
    }

    /**
     * Get the maxDeliveryCount property: The number of times the IoT hub attempts to deliver a message on the feedback
     * queue. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#cloud-to-device-messages.
     *
     * @return the maxDeliveryCount value.
     */
    public Integer maxDeliveryCount() {
        return this.maxDeliveryCount;
    }

    /**
     * Set the maxDeliveryCount property: The number of times the IoT hub attempts to deliver a message on the feedback
     * queue. See: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-messaging#cloud-to-device-messages.
     *
     * @param maxDeliveryCount the maxDeliveryCount value to set.
     * @return the FeedbackProperties object itself.
     */
    public FeedbackProperties withMaxDeliveryCount(Integer maxDeliveryCount) {
        this.maxDeliveryCount = maxDeliveryCount;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
