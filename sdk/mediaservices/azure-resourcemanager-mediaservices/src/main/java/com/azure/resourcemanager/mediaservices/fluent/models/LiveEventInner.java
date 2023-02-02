// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.mediaservices.models.CrossSiteAccessPolicies;
import com.azure.resourcemanager.mediaservices.models.LiveEventEncoding;
import com.azure.resourcemanager.mediaservices.models.LiveEventInput;
import com.azure.resourcemanager.mediaservices.models.LiveEventPreview;
import com.azure.resourcemanager.mediaservices.models.LiveEventResourceState;
import com.azure.resourcemanager.mediaservices.models.LiveEventTranscription;
import com.azure.resourcemanager.mediaservices.models.StreamOptionsFlag;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** The live event. */
@Fluent
public final class LiveEventInner extends Resource {
    /*
     * The live event properties.
     */
    @JsonProperty(value = "properties")
    private LiveEventProperties innerProperties;

    /*
     * The system metadata relating to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of LiveEventInner class. */
    public LiveEventInner() {
    }

    /**
     * Get the innerProperties property: The live event properties.
     *
     * @return the innerProperties value.
     */
    private LiveEventProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system metadata relating to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public LiveEventInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LiveEventInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the description property: A description for the live event.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: A description for the live event.
     *
     * @param description the description value to set.
     * @return the LiveEventInner object itself.
     */
    public LiveEventInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LiveEventProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the input property: Live event input settings. It defines how the live event receives input from a
     * contribution encoder.
     *
     * @return the input value.
     */
    public LiveEventInput input() {
        return this.innerProperties() == null ? null : this.innerProperties().input();
    }

    /**
     * Set the input property: Live event input settings. It defines how the live event receives input from a
     * contribution encoder.
     *
     * @param input the input value to set.
     * @return the LiveEventInner object itself.
     */
    public LiveEventInner withInput(LiveEventInput input) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LiveEventProperties();
        }
        this.innerProperties().withInput(input);
        return this;
    }

    /**
     * Get the preview property: Live event preview settings. Preview allows live event producers to preview the live
     * streaming content without creating any live output.
     *
     * @return the preview value.
     */
    public LiveEventPreview preview() {
        return this.innerProperties() == null ? null : this.innerProperties().preview();
    }

    /**
     * Set the preview property: Live event preview settings. Preview allows live event producers to preview the live
     * streaming content without creating any live output.
     *
     * @param preview the preview value to set.
     * @return the LiveEventInner object itself.
     */
    public LiveEventInner withPreview(LiveEventPreview preview) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LiveEventProperties();
        }
        this.innerProperties().withPreview(preview);
        return this;
    }

    /**
     * Get the encoding property: Encoding settings for the live event. It configures whether a live encoder is used for
     * the live event and settings for the live encoder if it is used.
     *
     * @return the encoding value.
     */
    public LiveEventEncoding encoding() {
        return this.innerProperties() == null ? null : this.innerProperties().encoding();
    }

    /**
     * Set the encoding property: Encoding settings for the live event. It configures whether a live encoder is used for
     * the live event and settings for the live encoder if it is used.
     *
     * @param encoding the encoding value to set.
     * @return the LiveEventInner object itself.
     */
    public LiveEventInner withEncoding(LiveEventEncoding encoding) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LiveEventProperties();
        }
        this.innerProperties().withEncoding(encoding);
        return this;
    }

    /**
     * Get the transcriptions property: Live transcription settings for the live event. See
     * https://go.microsoft.com/fwlink/?linkid=2133742 for more information about the live transcription feature.
     *
     * @return the transcriptions value.
     */
    public List<LiveEventTranscription> transcriptions() {
        return this.innerProperties() == null ? null : this.innerProperties().transcriptions();
    }

    /**
     * Set the transcriptions property: Live transcription settings for the live event. See
     * https://go.microsoft.com/fwlink/?linkid=2133742 for more information about the live transcription feature.
     *
     * @param transcriptions the transcriptions value to set.
     * @return the LiveEventInner object itself.
     */
    public LiveEventInner withTranscriptions(List<LiveEventTranscription> transcriptions) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LiveEventProperties();
        }
        this.innerProperties().withTranscriptions(transcriptions);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the live event.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the resourceState property: The resource state of the live event. See
     * https://go.microsoft.com/fwlink/?linkid=2139012 for more information.
     *
     * @return the resourceState value.
     */
    public LiveEventResourceState resourceState() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceState();
    }

    /**
     * Get the crossSiteAccessPolicies property: Live event cross site access policies.
     *
     * @return the crossSiteAccessPolicies value.
     */
    public CrossSiteAccessPolicies crossSiteAccessPolicies() {
        return this.innerProperties() == null ? null : this.innerProperties().crossSiteAccessPolicies();
    }

    /**
     * Set the crossSiteAccessPolicies property: Live event cross site access policies.
     *
     * @param crossSiteAccessPolicies the crossSiteAccessPolicies value to set.
     * @return the LiveEventInner object itself.
     */
    public LiveEventInner withCrossSiteAccessPolicies(CrossSiteAccessPolicies crossSiteAccessPolicies) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LiveEventProperties();
        }
        this.innerProperties().withCrossSiteAccessPolicies(crossSiteAccessPolicies);
        return this;
    }

    /**
     * Get the useStaticHostname property: Specifies whether a static hostname would be assigned to the live event
     * preview and ingest endpoints. This value can only be updated if the live event is in Standby state.
     *
     * @return the useStaticHostname value.
     */
    public Boolean useStaticHostname() {
        return this.innerProperties() == null ? null : this.innerProperties().useStaticHostname();
    }

    /**
     * Set the useStaticHostname property: Specifies whether a static hostname would be assigned to the live event
     * preview and ingest endpoints. This value can only be updated if the live event is in Standby state.
     *
     * @param useStaticHostname the useStaticHostname value to set.
     * @return the LiveEventInner object itself.
     */
    public LiveEventInner withUseStaticHostname(Boolean useStaticHostname) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LiveEventProperties();
        }
        this.innerProperties().withUseStaticHostname(useStaticHostname);
        return this;
    }

    /**
     * Get the hostnamePrefix property: When useStaticHostname is set to true, the hostnamePrefix specifies the first
     * part of the hostname assigned to the live event preview and ingest endpoints. The final hostname would be a
     * combination of this prefix, the media service account name and a short code for the Azure Media Services data
     * center.
     *
     * @return the hostnamePrefix value.
     */
    public String hostnamePrefix() {
        return this.innerProperties() == null ? null : this.innerProperties().hostnamePrefix();
    }

    /**
     * Set the hostnamePrefix property: When useStaticHostname is set to true, the hostnamePrefix specifies the first
     * part of the hostname assigned to the live event preview and ingest endpoints. The final hostname would be a
     * combination of this prefix, the media service account name and a short code for the Azure Media Services data
     * center.
     *
     * @param hostnamePrefix the hostnamePrefix value to set.
     * @return the LiveEventInner object itself.
     */
    public LiveEventInner withHostnamePrefix(String hostnamePrefix) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LiveEventProperties();
        }
        this.innerProperties().withHostnamePrefix(hostnamePrefix);
        return this;
    }

    /**
     * Get the streamOptions property: The options to use for the LiveEvent. This value is specified at creation time
     * and cannot be updated. The valid values for the array entry values are 'Default' and 'LowLatency'.
     *
     * @return the streamOptions value.
     */
    public List<StreamOptionsFlag> streamOptions() {
        return this.innerProperties() == null ? null : this.innerProperties().streamOptions();
    }

    /**
     * Set the streamOptions property: The options to use for the LiveEvent. This value is specified at creation time
     * and cannot be updated. The valid values for the array entry values are 'Default' and 'LowLatency'.
     *
     * @param streamOptions the streamOptions value to set.
     * @return the LiveEventInner object itself.
     */
    public LiveEventInner withStreamOptions(List<StreamOptionsFlag> streamOptions) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LiveEventProperties();
        }
        this.innerProperties().withStreamOptions(streamOptions);
        return this;
    }

    /**
     * Get the created property: The creation time for the live event.
     *
     * @return the created value.
     */
    public OffsetDateTime created() {
        return this.innerProperties() == null ? null : this.innerProperties().created();
    }

    /**
     * Get the lastModified property: The last modified time of the live event.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime lastModified() {
        return this.innerProperties() == null ? null : this.innerProperties().lastModified();
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
