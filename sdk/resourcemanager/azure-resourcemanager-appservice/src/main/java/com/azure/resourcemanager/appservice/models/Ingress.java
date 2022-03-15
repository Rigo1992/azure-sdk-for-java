// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Container App Ingress configuration. */
@Fluent
public final class Ingress {
    /*
     * Hostname.
     */
    @JsonProperty(value = "fqdn", access = JsonProperty.Access.WRITE_ONLY)
    private String fqdn;

    /*
     * Bool indicating if app exposes an external http endpoint
     */
    @JsonProperty(value = "external")
    private Boolean external;

    /*
     * Target Port in containers for traffic from ingress
     */
    @JsonProperty(value = "targetPort")
    private Integer targetPort;

    /*
     * Ingress transport protocol
     */
    @JsonProperty(value = "transport")
    private IngressTransportMethod transport;

    /*
     * The traffic property.
     */
    @JsonProperty(value = "traffic")
    private List<TrafficWeight> traffic;

    /*
     * Bool indicating if HTTP connections to is allowed. If set to false HTTP
     * connections are automatically redirected to HTTPS connections
     */
    @JsonProperty(value = "allowInsecure")
    private Boolean allowInsecure;

    /**
     * Get the fqdn property: Hostname.
     *
     * @return the fqdn value.
     */
    public String fqdn() {
        return this.fqdn;
    }

    /**
     * Get the external property: Bool indicating if app exposes an external http endpoint.
     *
     * @return the external value.
     */
    public Boolean external() {
        return this.external;
    }

    /**
     * Set the external property: Bool indicating if app exposes an external http endpoint.
     *
     * @param external the external value to set.
     * @return the Ingress object itself.
     */
    public Ingress withExternal(Boolean external) {
        this.external = external;
        return this;
    }

    /**
     * Get the targetPort property: Target Port in containers for traffic from ingress.
     *
     * @return the targetPort value.
     */
    public Integer targetPort() {
        return this.targetPort;
    }

    /**
     * Set the targetPort property: Target Port in containers for traffic from ingress.
     *
     * @param targetPort the targetPort value to set.
     * @return the Ingress object itself.
     */
    public Ingress withTargetPort(Integer targetPort) {
        this.targetPort = targetPort;
        return this;
    }

    /**
     * Get the transport property: Ingress transport protocol.
     *
     * @return the transport value.
     */
    public IngressTransportMethod transport() {
        return this.transport;
    }

    /**
     * Set the transport property: Ingress transport protocol.
     *
     * @param transport the transport value to set.
     * @return the Ingress object itself.
     */
    public Ingress withTransport(IngressTransportMethod transport) {
        this.transport = transport;
        return this;
    }

    /**
     * Get the traffic property: The traffic property.
     *
     * @return the traffic value.
     */
    public List<TrafficWeight> traffic() {
        return this.traffic;
    }

    /**
     * Set the traffic property: The traffic property.
     *
     * @param traffic the traffic value to set.
     * @return the Ingress object itself.
     */
    public Ingress withTraffic(List<TrafficWeight> traffic) {
        this.traffic = traffic;
        return this;
    }

    /**
     * Get the allowInsecure property: Bool indicating if HTTP connections to is allowed. If set to false HTTP
     * connections are automatically redirected to HTTPS connections.
     *
     * @return the allowInsecure value.
     */
    public Boolean allowInsecure() {
        return this.allowInsecure;
    }

    /**
     * Set the allowInsecure property: Bool indicating if HTTP connections to is allowed. If set to false HTTP
     * connections are automatically redirected to HTTPS connections.
     *
     * @param allowInsecure the allowInsecure value to set.
     * @return the Ingress object itself.
     */
    public Ingress withAllowInsecure(Boolean allowInsecure) {
        this.allowInsecure = allowInsecure;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (traffic() != null) {
            traffic().forEach(e -> e.validate());
        }
    }
}
