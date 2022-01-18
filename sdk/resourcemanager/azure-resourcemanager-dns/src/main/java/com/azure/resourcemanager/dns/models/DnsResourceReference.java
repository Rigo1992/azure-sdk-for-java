// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dns.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Represents a single Azure resource and its referencing DNS records. */
@Fluent
public final class DnsResourceReference {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DnsResourceReference.class);

    /*
     * A list of dns Records
     */
    @JsonProperty(value = "dnsResources")
    private List<SubResource> dnsResources;

    /*
     * A reference to an azure resource from where the dns resource value is
     * taken.
     */
    @JsonProperty(value = "targetResource")
    private SubResource targetResource;

    /**
     * Get the dnsResources property: A list of dns Records.
     *
     * @return the dnsResources value.
     */
    public List<SubResource> dnsResources() {
        return this.dnsResources;
    }

    /**
     * Set the dnsResources property: A list of dns Records.
     *
     * @param dnsResources the dnsResources value to set.
     * @return the DnsResourceReference object itself.
     */
    public DnsResourceReference withDnsResources(List<SubResource> dnsResources) {
        this.dnsResources = dnsResources;
        return this;
    }

    /**
     * Get the targetResource property: A reference to an azure resource from where the dns resource value is taken.
     *
     * @return the targetResource value.
     */
    public SubResource targetResource() {
        return this.targetResource;
    }

    /**
     * Set the targetResource property: A reference to an azure resource from where the dns resource value is taken.
     *
     * @param targetResource the targetResource value to set.
     * @return the DnsResourceReference object itself.
     */
    public DnsResourceReference withTargetResource(SubResource targetResource) {
        this.targetResource = targetResource;
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
