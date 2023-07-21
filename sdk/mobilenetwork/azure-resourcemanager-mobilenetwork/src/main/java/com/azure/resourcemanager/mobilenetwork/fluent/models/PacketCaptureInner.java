// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mobilenetwork.models.PacketCaptureStatus;
import com.azure.resourcemanager.mobilenetwork.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Packet capture session resource. */
@Fluent
public final class PacketCaptureInner extends ProxyResource {
    /*
     * Packet capture session properties. Packet capture file(s) derived from the name of this session will be uploaded
     * to the Storage Account Container URL in the packet core control plane properties
     */
    @JsonProperty(value = "properties", required = true)
    private PacketCapturePropertiesFormat innerProperties = new PacketCapturePropertiesFormat();

    /** Creates an instance of PacketCaptureInner class. */
    public PacketCaptureInner() {
    }

    /**
     * Get the innerProperties property: Packet capture session properties. Packet capture file(s) derived from the name
     * of this session will be uploaded to the Storage Account Container URL in the packet core control plane
     * properties.
     *
     * @return the innerProperties value.
     */
    private PacketCapturePropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the provisioningState property: The provisioning state of the packet capture session resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the status property: The status of the packet capture session.
     *
     * @return the status value.
     */
    public PacketCaptureStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Get the reason property: The reason the current packet capture session state.
     *
     * @return the reason value.
     */
    public String reason() {
        return this.innerProperties() == null ? null : this.innerProperties().reason();
    }

    /**
     * Get the captureStartTime property: The start time of the packet capture session.
     *
     * @return the captureStartTime value.
     */
    public OffsetDateTime captureStartTime() {
        return this.innerProperties() == null ? null : this.innerProperties().captureStartTime();
    }

    /**
     * Get the networkInterfaces property: List of network interfaces to capture on.
     *
     * @return the networkInterfaces value.
     */
    public List<String> networkInterfaces() {
        return this.innerProperties() == null ? null : this.innerProperties().networkInterfaces();
    }

    /**
     * Set the networkInterfaces property: List of network interfaces to capture on.
     *
     * @param networkInterfaces the networkInterfaces value to set.
     * @return the PacketCaptureInner object itself.
     */
    public PacketCaptureInner withNetworkInterfaces(List<String> networkInterfaces) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PacketCapturePropertiesFormat();
        }
        this.innerProperties().withNetworkInterfaces(networkInterfaces);
        return this;
    }

    /**
     * Get the bytesToCapturePerPacket property: Number of bytes captured per packet, the remaining bytes are truncated.
     * The default "0" means the entire packet is captured.
     *
     * @return the bytesToCapturePerPacket value.
     */
    public Long bytesToCapturePerPacket() {
        return this.innerProperties() == null ? null : this.innerProperties().bytesToCapturePerPacket();
    }

    /**
     * Set the bytesToCapturePerPacket property: Number of bytes captured per packet, the remaining bytes are truncated.
     * The default "0" means the entire packet is captured.
     *
     * @param bytesToCapturePerPacket the bytesToCapturePerPacket value to set.
     * @return the PacketCaptureInner object itself.
     */
    public PacketCaptureInner withBytesToCapturePerPacket(Long bytesToCapturePerPacket) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PacketCapturePropertiesFormat();
        }
        this.innerProperties().withBytesToCapturePerPacket(bytesToCapturePerPacket);
        return this;
    }

    /**
     * Get the totalBytesPerSession property: Maximum size of the capture output.
     *
     * @return the totalBytesPerSession value.
     */
    public Long totalBytesPerSession() {
        return this.innerProperties() == null ? null : this.innerProperties().totalBytesPerSession();
    }

    /**
     * Set the totalBytesPerSession property: Maximum size of the capture output.
     *
     * @param totalBytesPerSession the totalBytesPerSession value to set.
     * @return the PacketCaptureInner object itself.
     */
    public PacketCaptureInner withTotalBytesPerSession(Long totalBytesPerSession) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PacketCapturePropertiesFormat();
        }
        this.innerProperties().withTotalBytesPerSession(totalBytesPerSession);
        return this;
    }

    /**
     * Get the timeLimitInSeconds property: Maximum duration of the capture session in seconds.
     *
     * @return the timeLimitInSeconds value.
     */
    public Integer timeLimitInSeconds() {
        return this.innerProperties() == null ? null : this.innerProperties().timeLimitInSeconds();
    }

    /**
     * Set the timeLimitInSeconds property: Maximum duration of the capture session in seconds.
     *
     * @param timeLimitInSeconds the timeLimitInSeconds value to set.
     * @return the PacketCaptureInner object itself.
     */
    public PacketCaptureInner withTimeLimitInSeconds(Integer timeLimitInSeconds) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PacketCapturePropertiesFormat();
        }
        this.innerProperties().withTimeLimitInSeconds(timeLimitInSeconds);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model PacketCaptureInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PacketCaptureInner.class);
}