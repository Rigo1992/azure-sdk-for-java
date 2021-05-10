// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SKU that defines the tier and kind of the peering. */
@Fluent
public final class PeeringSku {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PeeringSku.class);

    /*
     * The name of the peering SKU.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The tier of the peering SKU.
     */
    @JsonProperty(value = "tier")
    private Tier tier;

    /*
     * The family of the peering SKU.
     */
    @JsonProperty(value = "family")
    private Family family;

    /*
     * The size of the peering SKU.
     */
    @JsonProperty(value = "size")
    private Size size;

    /**
     * Get the name property: The name of the peering SKU.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the peering SKU.
     *
     * @param name the name value to set.
     * @return the PeeringSku object itself.
     */
    public PeeringSku withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier property: The tier of the peering SKU.
     *
     * @return the tier value.
     */
    public Tier tier() {
        return this.tier;
    }

    /**
     * Set the tier property: The tier of the peering SKU.
     *
     * @param tier the tier value to set.
     * @return the PeeringSku object itself.
     */
    public PeeringSku withTier(Tier tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the family property: The family of the peering SKU.
     *
     * @return the family value.
     */
    public Family family() {
        return this.family;
    }

    /**
     * Set the family property: The family of the peering SKU.
     *
     * @param family the family value to set.
     * @return the PeeringSku object itself.
     */
    public PeeringSku withFamily(Family family) {
        this.family = family;
        return this;
    }

    /**
     * Get the size property: The size of the peering SKU.
     *
     * @return the size value.
     */
    public Size size() {
        return this.size;
    }

    /**
     * Set the size property: The size of the peering SKU.
     *
     * @param size the size value to set.
     * @return the PeeringSku object itself.
     */
    public PeeringSku withSize(Size size) {
        this.size = size;
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
