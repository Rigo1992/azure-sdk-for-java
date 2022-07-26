// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * A pod identity exception, which allows pods with certain labels to access the Azure Instance Metadata Service (IMDS)
 * endpoint without being intercepted by the node-managed identity (NMI) server.
 *
 * <p>See [disable AAD Pod Identity for a specific
 * Pod/Application](https://azure.github.io/aad-pod-identity/docs/configure/application_exception/) for more details.
 */
@Fluent
public final class ManagedClusterPodIdentityException {
    /*
     * The name of the pod identity exception.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The namespace of the pod identity exception.
     */
    @JsonProperty(value = "namespace", required = true)
    private String namespace;

    /*
     * The pod labels to match.
     */
    @JsonProperty(value = "podLabels", required = true)
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> podLabels;

    /**
     * Get the name property: The name of the pod identity exception.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the pod identity exception.
     *
     * @param name the name value to set.
     * @return the ManagedClusterPodIdentityException object itself.
     */
    public ManagedClusterPodIdentityException withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the namespace property: The namespace of the pod identity exception.
     *
     * @return the namespace value.
     */
    public String namespace() {
        return this.namespace;
    }

    /**
     * Set the namespace property: The namespace of the pod identity exception.
     *
     * @param namespace the namespace value to set.
     * @return the ManagedClusterPodIdentityException object itself.
     */
    public ManagedClusterPodIdentityException withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * Get the podLabels property: The pod labels to match.
     *
     * @return the podLabels value.
     */
    public Map<String, String> podLabels() {
        return this.podLabels;
    }

    /**
     * Set the podLabels property: The pod labels to match.
     *
     * @param podLabels the podLabels value to set.
     * @return the ManagedClusterPodIdentityException object itself.
     */
    public ManagedClusterPodIdentityException withPodLabels(Map<String, String> podLabels) {
        this.podLabels = podLabels;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property name in model ManagedClusterPodIdentityException"));
        }
        if (namespace() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property namespace in model ManagedClusterPodIdentityException"));
        }
        if (podLabels() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property podLabels in model ManagedClusterPodIdentityException"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ManagedClusterPodIdentityException.class);
}
