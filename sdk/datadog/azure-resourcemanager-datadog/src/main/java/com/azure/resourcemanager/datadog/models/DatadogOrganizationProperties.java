// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specify the Datadog organization name. In the case of linking to existing organizations, Id, ApiKey, and
 * Applicationkey is required as well.
 */
@Fluent
public final class DatadogOrganizationProperties {
    /*
     * Name of the Datadog organization.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Id of the Datadog organization.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The auth code used to linking to an existing Datadog organization.
     */
    @JsonProperty(value = "linkingAuthCode")
    private String linkingAuthCode;

    /*
     * The client_id from an existing in exchange for an auth token to link organization.
     */
    @JsonProperty(value = "linkingClientId")
    private String linkingClientId;

    /*
     * The redirect URI for linking.
     */
    @JsonProperty(value = "redirectUri")
    private String redirectUri;

    /*
     * Api key associated to the Datadog organization.
     */
    @JsonProperty(value = "apiKey")
    private String apiKey;

    /*
     * Application key associated to the Datadog organization.
     */
    @JsonProperty(value = "applicationKey")
    private String applicationKey;

    /*
     * The Id of the Enterprise App used for Single sign on.
     */
    @JsonProperty(value = "enterpriseAppId")
    private String enterpriseAppId;

    /*
     * The configuration which describes the state of cloud security posture management. This collects configuration
     * information for all resources in a subscription and track conformance to industry benchmarks.
     */
    @JsonProperty(value = "cspm")
    private Boolean cspm;

    /** Creates an instance of DatadogOrganizationProperties class. */
    public DatadogOrganizationProperties() {
    }

    /**
     * Get the name property: Name of the Datadog organization.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the Datadog organization.
     *
     * @param name the name value to set.
     * @return the DatadogOrganizationProperties object itself.
     */
    public DatadogOrganizationProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the id property: Id of the Datadog organization.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Id of the Datadog organization.
     *
     * @param id the id value to set.
     * @return the DatadogOrganizationProperties object itself.
     */
    public DatadogOrganizationProperties withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the linkingAuthCode property: The auth code used to linking to an existing Datadog organization.
     *
     * @return the linkingAuthCode value.
     */
    public String linkingAuthCode() {
        return this.linkingAuthCode;
    }

    /**
     * Set the linkingAuthCode property: The auth code used to linking to an existing Datadog organization.
     *
     * @param linkingAuthCode the linkingAuthCode value to set.
     * @return the DatadogOrganizationProperties object itself.
     */
    public DatadogOrganizationProperties withLinkingAuthCode(String linkingAuthCode) {
        this.linkingAuthCode = linkingAuthCode;
        return this;
    }

    /**
     * Get the linkingClientId property: The client_id from an existing in exchange for an auth token to link
     * organization.
     *
     * @return the linkingClientId value.
     */
    public String linkingClientId() {
        return this.linkingClientId;
    }

    /**
     * Set the linkingClientId property: The client_id from an existing in exchange for an auth token to link
     * organization.
     *
     * @param linkingClientId the linkingClientId value to set.
     * @return the DatadogOrganizationProperties object itself.
     */
    public DatadogOrganizationProperties withLinkingClientId(String linkingClientId) {
        this.linkingClientId = linkingClientId;
        return this;
    }

    /**
     * Get the redirectUri property: The redirect URI for linking.
     *
     * @return the redirectUri value.
     */
    public String redirectUri() {
        return this.redirectUri;
    }

    /**
     * Set the redirectUri property: The redirect URI for linking.
     *
     * @param redirectUri the redirectUri value to set.
     * @return the DatadogOrganizationProperties object itself.
     */
    public DatadogOrganizationProperties withRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
        return this;
    }

    /**
     * Get the apiKey property: Api key associated to the Datadog organization.
     *
     * @return the apiKey value.
     */
    public String apiKey() {
        return this.apiKey;
    }

    /**
     * Set the apiKey property: Api key associated to the Datadog organization.
     *
     * @param apiKey the apiKey value to set.
     * @return the DatadogOrganizationProperties object itself.
     */
    public DatadogOrganizationProperties withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Get the applicationKey property: Application key associated to the Datadog organization.
     *
     * @return the applicationKey value.
     */
    public String applicationKey() {
        return this.applicationKey;
    }

    /**
     * Set the applicationKey property: Application key associated to the Datadog organization.
     *
     * @param applicationKey the applicationKey value to set.
     * @return the DatadogOrganizationProperties object itself.
     */
    public DatadogOrganizationProperties withApplicationKey(String applicationKey) {
        this.applicationKey = applicationKey;
        return this;
    }

    /**
     * Get the enterpriseAppId property: The Id of the Enterprise App used for Single sign on.
     *
     * @return the enterpriseAppId value.
     */
    public String enterpriseAppId() {
        return this.enterpriseAppId;
    }

    /**
     * Set the enterpriseAppId property: The Id of the Enterprise App used for Single sign on.
     *
     * @param enterpriseAppId the enterpriseAppId value to set.
     * @return the DatadogOrganizationProperties object itself.
     */
    public DatadogOrganizationProperties withEnterpriseAppId(String enterpriseAppId) {
        this.enterpriseAppId = enterpriseAppId;
        return this;
    }

    /**
     * Get the cspm property: The configuration which describes the state of cloud security posture management. This
     * collects configuration information for all resources in a subscription and track conformance to industry
     * benchmarks.
     *
     * @return the cspm value.
     */
    public Boolean cspm() {
        return this.cspm;
    }

    /**
     * Set the cspm property: The configuration which describes the state of cloud security posture management. This
     * collects configuration information for all resources in a subscription and track conformance to industry
     * benchmarks.
     *
     * @param cspm the cspm value to set.
     * @return the DatadogOrganizationProperties object itself.
     */
    public DatadogOrganizationProperties withCspm(Boolean cspm) {
        this.cspm = cspm;
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
