// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The configuration for container-enabled Pools. */
@Fluent
public final class ContainerConfiguration {
    /*
     * The container technology to be used.
     */
    @JsonProperty(value = "type", required = true)
    private ContainerType type;

    /*
     * This is the full Image reference, as would be specified to "docker pull". An
     * Image will be sourced from the default Docker registry unless the Image is
     * fully qualified with an alternative registry.
     */
    @JsonProperty(value = "containerImageNames")
    private List<String> containerImageNames;

    /*
     * If any Images must be downloaded from a private registry which requires
     * credentials, then those credentials must be provided here.
     */
    @JsonProperty(value = "containerRegistries")
    private List<ContainerRegistry> containerRegistries;

    /**
     * Creates an instance of ContainerConfiguration class.
     *
     * @param type the type value to set.
     */
    @JsonCreator
    public ContainerConfiguration(@JsonProperty(value = "type", required = true) ContainerType type) {
        this.type = type;
    }

    /**
     * Get the type property: The container technology to be used.
     *
     * @return the type value.
     */
    public ContainerType getType() {
        return this.type;
    }

    /**
     * Get the containerImageNames property: This is the full Image reference, as would be specified to "docker pull".
     * An Image will be sourced from the default Docker registry unless the Image is fully qualified with an alternative
     * registry.
     *
     * @return the containerImageNames value.
     */
    public List<String> getContainerImageNames() {
        return this.containerImageNames;
    }

    /**
     * Set the containerImageNames property: This is the full Image reference, as would be specified to "docker pull".
     * An Image will be sourced from the default Docker registry unless the Image is fully qualified with an alternative
     * registry.
     *
     * @param containerImageNames the containerImageNames value to set.
     * @return the ContainerConfiguration object itself.
     */
    public ContainerConfiguration setContainerImageNames(List<String> containerImageNames) {
        this.containerImageNames = containerImageNames;
        return this;
    }

    /**
     * Get the containerRegistries property: If any Images must be downloaded from a private registry which requires
     * credentials, then those credentials must be provided here.
     *
     * @return the containerRegistries value.
     */
    public List<ContainerRegistry> getContainerRegistries() {
        return this.containerRegistries;
    }

    /**
     * Set the containerRegistries property: If any Images must be downloaded from a private registry which requires
     * credentials, then those credentials must be provided here.
     *
     * @param containerRegistries the containerRegistries value to set.
     * @return the ContainerConfiguration object itself.
     */
    public ContainerConfiguration setContainerRegistries(List<ContainerRegistry> containerRegistries) {
        this.containerRegistries = containerRegistries;
        return this;
    }
}
