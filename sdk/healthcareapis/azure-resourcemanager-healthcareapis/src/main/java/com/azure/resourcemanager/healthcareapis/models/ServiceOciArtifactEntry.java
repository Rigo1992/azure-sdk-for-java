// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An Open Container Initiative (OCI) artifact. */
@Fluent
public final class ServiceOciArtifactEntry {
    /*
     * The Azure Container Registry login server.
     */
    @JsonProperty(value = "loginServer")
    private String loginServer;

    /*
     * The artifact name.
     */
    @JsonProperty(value = "imageName")
    private String imageName;

    /*
     * The artifact digest.
     */
    @JsonProperty(value = "digest")
    private String digest;

    /**
     * Get the loginServer property: The Azure Container Registry login server.
     *
     * @return the loginServer value.
     */
    public String loginServer() {
        return this.loginServer;
    }

    /**
     * Set the loginServer property: The Azure Container Registry login server.
     *
     * @param loginServer the loginServer value to set.
     * @return the ServiceOciArtifactEntry object itself.
     */
    public ServiceOciArtifactEntry withLoginServer(String loginServer) {
        this.loginServer = loginServer;
        return this;
    }

    /**
     * Get the imageName property: The artifact name.
     *
     * @return the imageName value.
     */
    public String imageName() {
        return this.imageName;
    }

    /**
     * Set the imageName property: The artifact name.
     *
     * @param imageName the imageName value to set.
     * @return the ServiceOciArtifactEntry object itself.
     */
    public ServiceOciArtifactEntry withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * Get the digest property: The artifact digest.
     *
     * @return the digest value.
     */
    public String digest() {
        return this.digest;
    }

    /**
     * Set the digest property: The artifact digest.
     *
     * @param digest the digest value to set.
     * @return the ServiceOciArtifactEntry object itself.
     */
    public ServiceOciArtifactEntry withDigest(String digest) {
        this.digest = digest;
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
