// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Represents a repository. */
@Fluent
public final class RepoInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RepoInner.class);

    /*
     * The url to access the repository.
     */
    @JsonProperty(value = "url")
    private String url;

    /*
     * The name of the repository.
     */
    @JsonProperty(value = "fullName")
    private String fullName;

    /*
     * Array of branches.
     */
    @JsonProperty(value = "branches")
    private List<String> branches;

    /**
     * Get the url property: The url to access the repository.
     *
     * @return the url value.
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the url property: The url to access the repository.
     *
     * @param url the url value to set.
     * @return the RepoInner object itself.
     */
    public RepoInner withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the fullName property: The name of the repository.
     *
     * @return the fullName value.
     */
    public String fullName() {
        return this.fullName;
    }

    /**
     * Set the fullName property: The name of the repository.
     *
     * @param fullName the fullName value to set.
     * @return the RepoInner object itself.
     */
    public RepoInner withFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    /**
     * Get the branches property: Array of branches.
     *
     * @return the branches value.
     */
    public List<String> branches() {
        return this.branches;
    }

    /**
     * Set the branches property: Array of branches.
     *
     * @param branches the branches value to set.
     * @return the RepoInner object itself.
     */
    public RepoInner withBranches(List<String> branches) {
        this.branches = branches;
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
