// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.cdn.models.AfdProvisioningState;
import com.azure.resourcemanager.cdn.models.DeploymentStatus;
import com.azure.resourcemanager.cdn.models.EnabledState;
import com.azure.resourcemanager.cdn.models.ResourceReference;
import com.azure.resourcemanager.cdn.models.SharedPrivateLinkResourceProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CDN origin is the source of the content being delivered via CDN. When the edge nodes represented by an endpoint do
 * not have the requested content cached, they attempt to fetch it from one or more of the configured origins.
 */
@Fluent
public final class AfdOriginInner extends ProxyResource {
    /*
     * The JSON object that contains the properties of the origin.
     */
    @JsonProperty(value = "properties")
    private AfdOriginProperties innerProperties;

    /*
     * Read only system data
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the innerProperties property: The JSON object that contains the properties of the origin.
     *
     * @return the innerProperties value.
     */
    private AfdOriginProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Read only system data.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the provisioningState property: Provisioning status.
     *
     * @return the provisioningState value.
     */
    public AfdProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the deploymentStatus property: The deploymentStatus property.
     *
     * @return the deploymentStatus value.
     */
    public DeploymentStatus deploymentStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().deploymentStatus();
    }

    /**
     * Get the originGroupName property: The name of the origin group which contains this origin.
     *
     * @return the originGroupName value.
     */
    public String originGroupName() {
        return this.innerProperties() == null ? null : this.innerProperties().originGroupName();
    }

    /**
     * Get the azureOrigin property: Resource reference to the Azure origin resource.
     *
     * @return the azureOrigin value.
     */
    public ResourceReference azureOrigin() {
        return this.innerProperties() == null ? null : this.innerProperties().azureOrigin();
    }

    /**
     * Set the azureOrigin property: Resource reference to the Azure origin resource.
     *
     * @param azureOrigin the azureOrigin value to set.
     * @return the AfdOriginInner object itself.
     */
    public AfdOriginInner withAzureOrigin(ResourceReference azureOrigin) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AfdOriginProperties();
        }
        this.innerProperties().withAzureOrigin(azureOrigin);
        return this;
    }

    /**
     * Get the hostname property: The address of the origin. Domain names, IPv4 addresses, and IPv6 addresses are
     * supported.This should be unique across all origins in an endpoint.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.innerProperties() == null ? null : this.innerProperties().hostname();
    }

    /**
     * Set the hostname property: The address of the origin. Domain names, IPv4 addresses, and IPv6 addresses are
     * supported.This should be unique across all origins in an endpoint.
     *
     * @param hostname the hostname value to set.
     * @return the AfdOriginInner object itself.
     */
    public AfdOriginInner withHostname(String hostname) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AfdOriginProperties();
        }
        this.innerProperties().withHostname(hostname);
        return this;
    }

    /**
     * Get the httpPort property: The value of the HTTP port. Must be between 1 and 65535.
     *
     * @return the httpPort value.
     */
    public Integer httpPort() {
        return this.innerProperties() == null ? null : this.innerProperties().httpPort();
    }

    /**
     * Set the httpPort property: The value of the HTTP port. Must be between 1 and 65535.
     *
     * @param httpPort the httpPort value to set.
     * @return the AfdOriginInner object itself.
     */
    public AfdOriginInner withHttpPort(Integer httpPort) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AfdOriginProperties();
        }
        this.innerProperties().withHttpPort(httpPort);
        return this;
    }

    /**
     * Get the httpsPort property: The value of the HTTPS port. Must be between 1 and 65535.
     *
     * @return the httpsPort value.
     */
    public Integer httpsPort() {
        return this.innerProperties() == null ? null : this.innerProperties().httpsPort();
    }

    /**
     * Set the httpsPort property: The value of the HTTPS port. Must be between 1 and 65535.
     *
     * @param httpsPort the httpsPort value to set.
     * @return the AfdOriginInner object itself.
     */
    public AfdOriginInner withHttpsPort(Integer httpsPort) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AfdOriginProperties();
        }
        this.innerProperties().withHttpsPort(httpsPort);
        return this;
    }

    /**
     * Get the originHostHeader property: The host header value sent to the origin with each request. If you leave this
     * blank, the request hostname determines this value. Azure CDN origins, such as Web Apps, Blob Storage, and Cloud
     * Services require this host header value to match the origin hostname by default. This overrides the host header
     * defined at Endpoint.
     *
     * @return the originHostHeader value.
     */
    public String originHostHeader() {
        return this.innerProperties() == null ? null : this.innerProperties().originHostHeader();
    }

    /**
     * Set the originHostHeader property: The host header value sent to the origin with each request. If you leave this
     * blank, the request hostname determines this value. Azure CDN origins, such as Web Apps, Blob Storage, and Cloud
     * Services require this host header value to match the origin hostname by default. This overrides the host header
     * defined at Endpoint.
     *
     * @param originHostHeader the originHostHeader value to set.
     * @return the AfdOriginInner object itself.
     */
    public AfdOriginInner withOriginHostHeader(String originHostHeader) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AfdOriginProperties();
        }
        this.innerProperties().withOriginHostHeader(originHostHeader);
        return this;
    }

    /**
     * Get the priority property: Priority of origin in given origin group for load balancing. Higher priorities will
     * not be used for load balancing if any lower priority origin is healthy.Must be between 1 and 5.
     *
     * @return the priority value.
     */
    public Integer priority() {
        return this.innerProperties() == null ? null : this.innerProperties().priority();
    }

    /**
     * Set the priority property: Priority of origin in given origin group for load balancing. Higher priorities will
     * not be used for load balancing if any lower priority origin is healthy.Must be between 1 and 5.
     *
     * @param priority the priority value to set.
     * @return the AfdOriginInner object itself.
     */
    public AfdOriginInner withPriority(Integer priority) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AfdOriginProperties();
        }
        this.innerProperties().withPriority(priority);
        return this;
    }

    /**
     * Get the weight property: Weight of the origin in given origin group for load balancing. Must be between 1 and
     * 1000.
     *
     * @return the weight value.
     */
    public Integer weight() {
        return this.innerProperties() == null ? null : this.innerProperties().weight();
    }

    /**
     * Set the weight property: Weight of the origin in given origin group for load balancing. Must be between 1 and
     * 1000.
     *
     * @param weight the weight value to set.
     * @return the AfdOriginInner object itself.
     */
    public AfdOriginInner withWeight(Integer weight) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AfdOriginProperties();
        }
        this.innerProperties().withWeight(weight);
        return this;
    }

    /**
     * Get the sharedPrivateLinkResource property: The properties of the private link resource for private origin.
     *
     * @return the sharedPrivateLinkResource value.
     */
    public SharedPrivateLinkResourceProperties sharedPrivateLinkResource() {
        return this.innerProperties() == null ? null : this.innerProperties().sharedPrivateLinkResource();
    }

    /**
     * Set the sharedPrivateLinkResource property: The properties of the private link resource for private origin.
     *
     * @param sharedPrivateLinkResource the sharedPrivateLinkResource value to set.
     * @return the AfdOriginInner object itself.
     */
    public AfdOriginInner withSharedPrivateLinkResource(SharedPrivateLinkResourceProperties sharedPrivateLinkResource) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AfdOriginProperties();
        }
        this.innerProperties().withSharedPrivateLinkResource(sharedPrivateLinkResource);
        return this;
    }

    /**
     * Get the enabledState property: Whether to enable health probes to be made against backends defined under
     * backendPools. Health probes can only be disabled if there is a single enabled backend in single enabled backend
     * pool.
     *
     * @return the enabledState value.
     */
    public EnabledState enabledState() {
        return this.innerProperties() == null ? null : this.innerProperties().enabledState();
    }

    /**
     * Set the enabledState property: Whether to enable health probes to be made against backends defined under
     * backendPools. Health probes can only be disabled if there is a single enabled backend in single enabled backend
     * pool.
     *
     * @param enabledState the enabledState value to set.
     * @return the AfdOriginInner object itself.
     */
    public AfdOriginInner withEnabledState(EnabledState enabledState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AfdOriginProperties();
        }
        this.innerProperties().withEnabledState(enabledState);
        return this;
    }

    /**
     * Get the enforceCertificateNameCheck property: Whether to enable certificate name check at origin level.
     *
     * @return the enforceCertificateNameCheck value.
     */
    public Boolean enforceCertificateNameCheck() {
        return this.innerProperties() == null ? null : this.innerProperties().enforceCertificateNameCheck();
    }

    /**
     * Set the enforceCertificateNameCheck property: Whether to enable certificate name check at origin level.
     *
     * @param enforceCertificateNameCheck the enforceCertificateNameCheck value to set.
     * @return the AfdOriginInner object itself.
     */
    public AfdOriginInner withEnforceCertificateNameCheck(Boolean enforceCertificateNameCheck) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AfdOriginProperties();
        }
        this.innerProperties().withEnforceCertificateNameCheck(enforceCertificateNameCheck);
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
