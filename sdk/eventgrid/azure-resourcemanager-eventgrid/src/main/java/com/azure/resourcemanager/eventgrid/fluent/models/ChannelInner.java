// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.eventgrid.models.ChannelProvisioningState;
import com.azure.resourcemanager.eventgrid.models.ChannelType;
import com.azure.resourcemanager.eventgrid.models.PartnerDestinationInfo;
import com.azure.resourcemanager.eventgrid.models.PartnerTopicInfo;
import com.azure.resourcemanager.eventgrid.models.ReadinessState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Channel info.
 */
@Fluent
public final class ChannelInner extends ProxyResource {
    /*
     * Properties of the Channel.
     */
    @JsonProperty(value = "properties")
    private ChannelProperties innerProperties;

    /*
     * The system metadata relating to Channel resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of ChannelInner class.
     */
    public ChannelInner() {
    }

    /**
     * Get the innerProperties property: Properties of the Channel.
     * 
     * @return the innerProperties value.
     */
    private ChannelProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system metadata relating to Channel resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the channelType property: The type of the event channel which represents the direction flow of events.
     * 
     * @return the channelType value.
     */
    public ChannelType channelType() {
        return this.innerProperties() == null ? null : this.innerProperties().channelType();
    }

    /**
     * Set the channelType property: The type of the event channel which represents the direction flow of events.
     * 
     * @param channelType the channelType value to set.
     * @return the ChannelInner object itself.
     */
    public ChannelInner withChannelType(ChannelType channelType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ChannelProperties();
        }
        this.innerProperties().withChannelType(channelType);
        return this;
    }

    /**
     * Get the partnerTopicInfo property: This property should be populated when channelType is PartnerTopic and
     * represents information about the partner topic resource corresponding to the channel.
     * 
     * @return the partnerTopicInfo value.
     */
    public PartnerTopicInfo partnerTopicInfo() {
        return this.innerProperties() == null ? null : this.innerProperties().partnerTopicInfo();
    }

    /**
     * Set the partnerTopicInfo property: This property should be populated when channelType is PartnerTopic and
     * represents information about the partner topic resource corresponding to the channel.
     * 
     * @param partnerTopicInfo the partnerTopicInfo value to set.
     * @return the ChannelInner object itself.
     */
    public ChannelInner withPartnerTopicInfo(PartnerTopicInfo partnerTopicInfo) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ChannelProperties();
        }
        this.innerProperties().withPartnerTopicInfo(partnerTopicInfo);
        return this;
    }

    /**
     * Get the partnerDestinationInfo property: This property should be populated when channelType is
     * PartnerDestination and represents information about the partner destination resource corresponding to the
     * channel.
     * 
     * @return the partnerDestinationInfo value.
     */
    public PartnerDestinationInfo partnerDestinationInfo() {
        return this.innerProperties() == null ? null : this.innerProperties().partnerDestinationInfo();
    }

    /**
     * Set the partnerDestinationInfo property: This property should be populated when channelType is
     * PartnerDestination and represents information about the partner destination resource corresponding to the
     * channel.
     * 
     * @param partnerDestinationInfo the partnerDestinationInfo value to set.
     * @return the ChannelInner object itself.
     */
    public ChannelInner withPartnerDestinationInfo(PartnerDestinationInfo partnerDestinationInfo) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ChannelProperties();
        }
        this.innerProperties().withPartnerDestinationInfo(partnerDestinationInfo);
        return this;
    }

    /**
     * Get the messageForActivation property: Context or helpful message that can be used during the approval process
     * by the subscriber.
     * 
     * @return the messageForActivation value.
     */
    public String messageForActivation() {
        return this.innerProperties() == null ? null : this.innerProperties().messageForActivation();
    }

    /**
     * Set the messageForActivation property: Context or helpful message that can be used during the approval process
     * by the subscriber.
     * 
     * @param messageForActivation the messageForActivation value to set.
     * @return the ChannelInner object itself.
     */
    public ChannelInner withMessageForActivation(String messageForActivation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ChannelProperties();
        }
        this.innerProperties().withMessageForActivation(messageForActivation);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the channel.
     * 
     * @return the provisioningState value.
     */
    public ChannelProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Set the provisioningState property: Provisioning state of the channel.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the ChannelInner object itself.
     */
    public ChannelInner withProvisioningState(ChannelProvisioningState provisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ChannelProperties();
        }
        this.innerProperties().withProvisioningState(provisioningState);
        return this;
    }

    /**
     * Get the readinessState property: The readiness state of the corresponding partner topic.
     * 
     * @return the readinessState value.
     */
    public ReadinessState readinessState() {
        return this.innerProperties() == null ? null : this.innerProperties().readinessState();
    }

    /**
     * Set the readinessState property: The readiness state of the corresponding partner topic.
     * 
     * @param readinessState the readinessState value to set.
     * @return the ChannelInner object itself.
     */
    public ChannelInner withReadinessState(ReadinessState readinessState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ChannelProperties();
        }
        this.innerProperties().withReadinessState(readinessState);
        return this;
    }

    /**
     * Get the expirationTimeIfNotActivatedUtc property: Expiration time of the channel. If this timer expires while
     * the corresponding partner topic is never activated,
     * the channel and corresponding partner topic are deleted.
     * 
     * @return the expirationTimeIfNotActivatedUtc value.
     */
    public OffsetDateTime expirationTimeIfNotActivatedUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().expirationTimeIfNotActivatedUtc();
    }

    /**
     * Set the expirationTimeIfNotActivatedUtc property: Expiration time of the channel. If this timer expires while
     * the corresponding partner topic is never activated,
     * the channel and corresponding partner topic are deleted.
     * 
     * @param expirationTimeIfNotActivatedUtc the expirationTimeIfNotActivatedUtc value to set.
     * @return the ChannelInner object itself.
     */
    public ChannelInner withExpirationTimeIfNotActivatedUtc(OffsetDateTime expirationTimeIfNotActivatedUtc) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ChannelProperties();
        }
        this.innerProperties().withExpirationTimeIfNotActivatedUtc(expirationTimeIfNotActivatedUtc);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
