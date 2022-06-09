// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies information about the image to use. You can specify information about platform images, marketplace images,
 * or virtual machine images. This element is required when you want to use a platform image, marketplace image, or
 * virtual machine image, but is not used in other creation operations. NOTE: Image reference publisher and offer can
 * only be set when you create the scale set.
 */
@Fluent
public final class ImageReference {
    /*
     * The image publisher.
     */
    @JsonProperty(value = "publisher")
    private String publisher;

    /*
     * Specifies the offer of the platform image or marketplace image used to
     * create the virtual machine.
     */
    @JsonProperty(value = "offer")
    private String offer;

    /*
     * The image SKU.
     */
    @JsonProperty(value = "sku")
    private String sku;

    /*
     * Specifies the version of the platform image or marketplace image used to
     * create the virtual machine. The allowed formats are Major.Minor.Build or
     * 'latest'. Major, Minor, and Build are decimal numbers. Specify 'latest'
     * to use the latest version of an image available at deploy time. Even if
     * you use 'latest', the VM image will not automatically update after
     * deploy time even if a new version becomes available.
     */
    @JsonProperty(value = "version")
    private String version;

    /*
     * Specifies in decimal numbers, the version of platform image or
     * marketplace image used to create the virtual machine. This readonly
     * field differs from 'version', only if the value specified in 'version'
     * field is 'latest'.
     */
    @JsonProperty(value = "exactVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String exactVersion;

    /*
     * Specified the shared gallery image unique id for vm deployment. This can
     * be fetched from shared gallery image GET call.
     */
    @JsonProperty(value = "sharedGalleryImageId")
    private String sharedGalleryImageId;

    /**
     * Get the publisher property: The image publisher.
     *
     * @return the publisher value.
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set the publisher property: The image publisher.
     *
     * @param publisher the publisher value to set.
     * @return the ImageReference object itself.
     */
    public ImageReference withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get the offer property: Specifies the offer of the platform image or marketplace image used to create the virtual
     * machine.
     *
     * @return the offer value.
     */
    public String offer() {
        return this.offer;
    }

    /**
     * Set the offer property: Specifies the offer of the platform image or marketplace image used to create the virtual
     * machine.
     *
     * @param offer the offer value to set.
     * @return the ImageReference object itself.
     */
    public ImageReference withOffer(String offer) {
        this.offer = offer;
        return this;
    }

    /**
     * Get the sku property: The image SKU.
     *
     * @return the sku value.
     */
    public String sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The image SKU.
     *
     * @param sku the sku value to set.
     * @return the ImageReference object itself.
     */
    public ImageReference withSku(String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the version property: Specifies the version of the platform image or marketplace image used to create the
     * virtual machine. The allowed formats are Major.Minor.Build or 'latest'. Major, Minor, and Build are decimal
     * numbers. Specify 'latest' to use the latest version of an image available at deploy time. Even if you use
     * 'latest', the VM image will not automatically update after deploy time even if a new version becomes available.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: Specifies the version of the platform image or marketplace image used to create the
     * virtual machine. The allowed formats are Major.Minor.Build or 'latest'. Major, Minor, and Build are decimal
     * numbers. Specify 'latest' to use the latest version of an image available at deploy time. Even if you use
     * 'latest', the VM image will not automatically update after deploy time even if a new version becomes available.
     *
     * @param version the version value to set.
     * @return the ImageReference object itself.
     */
    public ImageReference withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the exactVersion property: Specifies in decimal numbers, the version of platform image or marketplace image
     * used to create the virtual machine. This readonly field differs from 'version', only if the value specified in
     * 'version' field is 'latest'.
     *
     * @return the exactVersion value.
     */
    public String exactVersion() {
        return this.exactVersion;
    }

    /**
     * Get the sharedGalleryImageId property: Specified the shared gallery image unique id for vm deployment. This can
     * be fetched from shared gallery image GET call.
     *
     * @return the sharedGalleryImageId value.
     */
    public String sharedGalleryImageId() {
        return this.sharedGalleryImageId;
    }

    /**
     * Set the sharedGalleryImageId property: Specified the shared gallery image unique id for vm deployment. This can
     * be fetched from shared gallery image GET call.
     *
     * @param sharedGalleryImageId the sharedGalleryImageId value to set.
     * @return the ImageReference object itself.
     */
    public ImageReference withSharedGalleryImageId(String sharedGalleryImageId) {
        this.sharedGalleryImageId = sharedGalleryImageId;
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
