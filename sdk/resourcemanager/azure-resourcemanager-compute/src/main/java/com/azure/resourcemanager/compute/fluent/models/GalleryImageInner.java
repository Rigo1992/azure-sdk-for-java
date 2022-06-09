// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.compute.models.Architecture;
import com.azure.resourcemanager.compute.models.Disallowed;
import com.azure.resourcemanager.compute.models.GalleryImageFeature;
import com.azure.resourcemanager.compute.models.GalleryImageIdentifier;
import com.azure.resourcemanager.compute.models.GalleryProvisioningState;
import com.azure.resourcemanager.compute.models.HyperVGeneration;
import com.azure.resourcemanager.compute.models.ImagePurchasePlan;
import com.azure.resourcemanager.compute.models.OperatingSystemStateTypes;
import com.azure.resourcemanager.compute.models.OperatingSystemTypes;
import com.azure.resourcemanager.compute.models.RecommendedMachineConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** Specifies information about the gallery image definition that you want to create or update. */
@Fluent
public final class GalleryImageInner extends Resource {
    /*
     * Describes the properties of a gallery image definition.
     */
    @JsonProperty(value = "properties")
    private GalleryImageProperties innerProperties;

    /**
     * Get the innerProperties property: Describes the properties of a gallery image definition.
     *
     * @return the innerProperties value.
     */
    private GalleryImageProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public GalleryImageInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GalleryImageInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the description property: The description of this gallery image definition resource. This property is
     * updatable.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: The description of this gallery image definition resource. This property is
     * updatable.
     *
     * @param description the description value to set.
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GalleryImageProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the eula property: The Eula agreement for the gallery image definition.
     *
     * @return the eula value.
     */
    public String eula() {
        return this.innerProperties() == null ? null : this.innerProperties().eula();
    }

    /**
     * Set the eula property: The Eula agreement for the gallery image definition.
     *
     * @param eula the eula value to set.
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withEula(String eula) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GalleryImageProperties();
        }
        this.innerProperties().withEula(eula);
        return this;
    }

    /**
     * Get the privacyStatementUri property: The privacy statement uri.
     *
     * @return the privacyStatementUri value.
     */
    public String privacyStatementUri() {
        return this.innerProperties() == null ? null : this.innerProperties().privacyStatementUri();
    }

    /**
     * Set the privacyStatementUri property: The privacy statement uri.
     *
     * @param privacyStatementUri the privacyStatementUri value to set.
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withPrivacyStatementUri(String privacyStatementUri) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GalleryImageProperties();
        }
        this.innerProperties().withPrivacyStatementUri(privacyStatementUri);
        return this;
    }

    /**
     * Get the releaseNoteUri property: The release note uri.
     *
     * @return the releaseNoteUri value.
     */
    public String releaseNoteUri() {
        return this.innerProperties() == null ? null : this.innerProperties().releaseNoteUri();
    }

    /**
     * Set the releaseNoteUri property: The release note uri.
     *
     * @param releaseNoteUri the releaseNoteUri value to set.
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withReleaseNoteUri(String releaseNoteUri) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GalleryImageProperties();
        }
        this.innerProperties().withReleaseNoteUri(releaseNoteUri);
        return this;
    }

    /**
     * Get the osType property: This property allows you to specify the type of the OS that is included in the disk when
     * creating a VM from a managed image. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Windows**
     * &lt;br&gt;&lt;br&gt; **Linux**.
     *
     * @return the osType value.
     */
    public OperatingSystemTypes osType() {
        return this.innerProperties() == null ? null : this.innerProperties().osType();
    }

    /**
     * Set the osType property: This property allows you to specify the type of the OS that is included in the disk when
     * creating a VM from a managed image. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt; **Windows**
     * &lt;br&gt;&lt;br&gt; **Linux**.
     *
     * @param osType the osType value to set.
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withOsType(OperatingSystemTypes osType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GalleryImageProperties();
        }
        this.innerProperties().withOsType(osType);
        return this;
    }

    /**
     * Get the osState property: This property allows the user to specify whether the virtual machines created under
     * this image are 'Generalized' or 'Specialized'.
     *
     * @return the osState value.
     */
    public OperatingSystemStateTypes osState() {
        return this.innerProperties() == null ? null : this.innerProperties().osState();
    }

    /**
     * Set the osState property: This property allows the user to specify whether the virtual machines created under
     * this image are 'Generalized' or 'Specialized'.
     *
     * @param osState the osState value to set.
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withOsState(OperatingSystemStateTypes osState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GalleryImageProperties();
        }
        this.innerProperties().withOsState(osState);
        return this;
    }

    /**
     * Get the hyperVGeneration property: The hypervisor generation of the Virtual Machine. Applicable to OS disks only.
     *
     * @return the hyperVGeneration value.
     */
    public HyperVGeneration hyperVGeneration() {
        return this.innerProperties() == null ? null : this.innerProperties().hyperVGeneration();
    }

    /**
     * Set the hyperVGeneration property: The hypervisor generation of the Virtual Machine. Applicable to OS disks only.
     *
     * @param hyperVGeneration the hyperVGeneration value to set.
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withHyperVGeneration(HyperVGeneration hyperVGeneration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GalleryImageProperties();
        }
        this.innerProperties().withHyperVGeneration(hyperVGeneration);
        return this;
    }

    /**
     * Get the endOfLifeDate property: The end of life date of the gallery image definition. This property can be used
     * for decommissioning purposes. This property is updatable.
     *
     * @return the endOfLifeDate value.
     */
    public OffsetDateTime endOfLifeDate() {
        return this.innerProperties() == null ? null : this.innerProperties().endOfLifeDate();
    }

    /**
     * Set the endOfLifeDate property: The end of life date of the gallery image definition. This property can be used
     * for decommissioning purposes. This property is updatable.
     *
     * @param endOfLifeDate the endOfLifeDate value to set.
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withEndOfLifeDate(OffsetDateTime endOfLifeDate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GalleryImageProperties();
        }
        this.innerProperties().withEndOfLifeDate(endOfLifeDate);
        return this;
    }

    /**
     * Get the identifier property: This is the gallery image definition identifier.
     *
     * @return the identifier value.
     */
    public GalleryImageIdentifier identifier() {
        return this.innerProperties() == null ? null : this.innerProperties().identifier();
    }

    /**
     * Set the identifier property: This is the gallery image definition identifier.
     *
     * @param identifier the identifier value to set.
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withIdentifier(GalleryImageIdentifier identifier) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GalleryImageProperties();
        }
        this.innerProperties().withIdentifier(identifier);
        return this;
    }

    /**
     * Get the recommended property: The properties describe the recommended machine configuration for this Image
     * Definition. These properties are updatable.
     *
     * @return the recommended value.
     */
    public RecommendedMachineConfiguration recommended() {
        return this.innerProperties() == null ? null : this.innerProperties().recommended();
    }

    /**
     * Set the recommended property: The properties describe the recommended machine configuration for this Image
     * Definition. These properties are updatable.
     *
     * @param recommended the recommended value to set.
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withRecommended(RecommendedMachineConfiguration recommended) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GalleryImageProperties();
        }
        this.innerProperties().withRecommended(recommended);
        return this;
    }

    /**
     * Get the disallowed property: Describes the disallowed disk types.
     *
     * @return the disallowed value.
     */
    public Disallowed disallowed() {
        return this.innerProperties() == null ? null : this.innerProperties().disallowed();
    }

    /**
     * Set the disallowed property: Describes the disallowed disk types.
     *
     * @param disallowed the disallowed value to set.
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withDisallowed(Disallowed disallowed) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GalleryImageProperties();
        }
        this.innerProperties().withDisallowed(disallowed);
        return this;
    }

    /**
     * Get the purchasePlan property: Describes the gallery image definition purchase plan. This is used by marketplace
     * images.
     *
     * @return the purchasePlan value.
     */
    public ImagePurchasePlan purchasePlan() {
        return this.innerProperties() == null ? null : this.innerProperties().purchasePlan();
    }

    /**
     * Set the purchasePlan property: Describes the gallery image definition purchase plan. This is used by marketplace
     * images.
     *
     * @param purchasePlan the purchasePlan value to set.
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withPurchasePlan(ImagePurchasePlan purchasePlan) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GalleryImageProperties();
        }
        this.innerProperties().withPurchasePlan(purchasePlan);
        return this;
    }

    /**
     * Get the provisioningState property: The current state of the gallery or gallery artifact. The provisioning state,
     * which only appears in the response.
     *
     * @return the provisioningState value.
     */
    public GalleryProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the features property: A list of gallery image features.
     *
     * @return the features value.
     */
    public List<GalleryImageFeature> features() {
        return this.innerProperties() == null ? null : this.innerProperties().features();
    }

    /**
     * Set the features property: A list of gallery image features.
     *
     * @param features the features value to set.
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withFeatures(List<GalleryImageFeature> features) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GalleryImageProperties();
        }
        this.innerProperties().withFeatures(features);
        return this;
    }

    /**
     * Get the architecture property: The architecture of the image. Applicable to OS disks only.
     *
     * @return the architecture value.
     */
    public Architecture architecture() {
        return this.innerProperties() == null ? null : this.innerProperties().architecture();
    }

    /**
     * Set the architecture property: The architecture of the image. Applicable to OS disks only.
     *
     * @param architecture the architecture value to set.
     * @return the GalleryImageInner object itself.
     */
    public GalleryImageInner withArchitecture(Architecture architecture) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GalleryImageProperties();
        }
        this.innerProperties().withArchitecture(architecture);
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
