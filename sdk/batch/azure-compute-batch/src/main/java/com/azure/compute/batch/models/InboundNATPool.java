// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A inbound NAT Pool that can be used to address specific ports on Compute Nodes in a Batch Pool externally. */
@Fluent
public final class InboundNATPool {

    /*
     * The name of the endpoint. The name must be unique within a Batch Pool, can contain letters, numbers,
     * underscores, periods, and hyphens. Names must start with a letter or number, must end with a letter, number, or
     * underscore, and cannot exceed 77 characters.  If any invalid values are provided the request fails with HTTP
     * status code 400.
     */
    @Generated
    @JsonProperty(value = "name")
    private String name;

    /*
     * The protocol of the endpoint.
     */
    @Generated
    @JsonProperty(value = "protocol")
    private InboundEndpointProtocol protocol;

    /*
     * The port number on the Compute Node. This must be unique within a Batch Pool. Acceptable values are between 1
     * and 65535 except for 22, 3389, 29876 and 29877 as these are reserved. If any reserved values are provided the
     * request fails with HTTP status code 400.
     */
    @Generated
    @JsonProperty(value = "backendPort")
    private int backendPort;

    /*
     * The first port number in the range of external ports that will be used to provide inbound access to the
     * backendPort on individual Compute Nodes. Acceptable values range between 1 and 65534 except ports from 50000 to
     * 55000 which are reserved. All ranges within a Pool must be distinct and cannot overlap. Each range must contain
     * at least 40 ports. If any reserved or overlapping values are provided the request fails with HTTP status code
     * 400.
     */
    @Generated
    @JsonProperty(value = "frontendPortRangeStart")
    private int frontendPortRangeStart;

    /*
     * The last port number in the range of external ports that will be used to provide inbound access to the
     * backendPort on individual Compute Nodes. Acceptable values range between 1 and 65534 except ports from 50000 to
     * 55000 which are reserved by the Batch service. All ranges within a Pool must be distinct and cannot overlap.
     * Each range must contain at least 40 ports. If any reserved or overlapping values are provided the request fails
     * with HTTP status code 400.
     */
    @Generated
    @JsonProperty(value = "frontendPortRangeEnd")
    private int frontendPortRangeEnd;

    /*
     * A list of network security group rules that will be applied to the endpoint. The maximum number of rules that
     * can be specified across all the endpoints on a Batch Pool is 25. If no network security group rules are
     * specified, a default rule will be created to allow inbound access to the specified backendPort. If the maximum
     * number of network security group rules is exceeded the request fails with HTTP status code 400.
     */
    @Generated
    @JsonProperty(value = "networkSecurityGroupRules")
    private List<NetworkSecurityGroupRule> networkSecurityGroupRules;

    /**
     * Creates an instance of InboundNATPool class.
     *
     * @param name the name value to set.
     * @param protocol the protocol value to set.
     * @param backendPort the backendPort value to set.
     * @param frontendPortRangeStart the frontendPortRangeStart value to set.
     * @param frontendPortRangeEnd the frontendPortRangeEnd value to set.
     */
    @Generated
    @JsonCreator
    public InboundNATPool(
            @JsonProperty(value = "name") String name,
            @JsonProperty(value = "protocol") InboundEndpointProtocol protocol,
            @JsonProperty(value = "backendPort") int backendPort,
            @JsonProperty(value = "frontendPortRangeStart") int frontendPortRangeStart,
            @JsonProperty(value = "frontendPortRangeEnd") int frontendPortRangeEnd) {
        this.name = name;
        this.protocol = protocol;
        this.backendPort = backendPort;
        this.frontendPortRangeStart = frontendPortRangeStart;
        this.frontendPortRangeEnd = frontendPortRangeEnd;
    }

    /**
     * Get the name property: The name of the endpoint. The name must be unique within a Batch Pool, can contain
     * letters, numbers, underscores, periods, and hyphens. Names must start with a letter or number, must end with a
     * letter, number, or underscore, and cannot exceed 77 characters. If any invalid values are provided the request
     * fails with HTTP status code 400.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the protocol property: The protocol of the endpoint.
     *
     * @return the protocol value.
     */
    @Generated
    public InboundEndpointProtocol getProtocol() {
        return this.protocol;
    }

    /**
     * Get the backendPort property: The port number on the Compute Node. This must be unique within a Batch Pool.
     * Acceptable values are between 1 and 65535 except for 22, 3389, 29876 and 29877 as these are reserved. If any
     * reserved values are provided the request fails with HTTP status code 400.
     *
     * @return the backendPort value.
     */
    @Generated
    public int getBackendPort() {
        return this.backendPort;
    }

    /**
     * Get the frontendPortRangeStart property: The first port number in the range of external ports that will be used
     * to provide inbound access to the backendPort on individual Compute Nodes. Acceptable values range between 1 and
     * 65534 except ports from 50000 to 55000 which are reserved. All ranges within a Pool must be distinct and cannot
     * overlap. Each range must contain at least 40 ports. If any reserved or overlapping values are provided the
     * request fails with HTTP status code 400.
     *
     * @return the frontendPortRangeStart value.
     */
    @Generated
    public int getFrontendPortRangeStart() {
        return this.frontendPortRangeStart;
    }

    /**
     * Get the frontendPortRangeEnd property: The last port number in the range of external ports that will be used to
     * provide inbound access to the backendPort on individual Compute Nodes. Acceptable values range between 1 and
     * 65534 except ports from 50000 to 55000 which are reserved by the Batch service. All ranges within a Pool must be
     * distinct and cannot overlap. Each range must contain at least 40 ports. If any reserved or overlapping values are
     * provided the request fails with HTTP status code 400.
     *
     * @return the frontendPortRangeEnd value.
     */
    @Generated
    public int getFrontendPortRangeEnd() {
        return this.frontendPortRangeEnd;
    }

    /**
     * Get the networkSecurityGroupRules property: A list of network security group rules that will be applied to the
     * endpoint. The maximum number of rules that can be specified across all the endpoints on a Batch Pool is 25. If no
     * network security group rules are specified, a default rule will be created to allow inbound access to the
     * specified backendPort. If the maximum number of network security group rules is exceeded the request fails with
     * HTTP status code 400.
     *
     * @return the networkSecurityGroupRules value.
     */
    @Generated
    public List<NetworkSecurityGroupRule> getNetworkSecurityGroupRules() {
        return this.networkSecurityGroupRules;
    }

    /**
     * Set the networkSecurityGroupRules property: A list of network security group rules that will be applied to the
     * endpoint. The maximum number of rules that can be specified across all the endpoints on a Batch Pool is 25. If no
     * network security group rules are specified, a default rule will be created to allow inbound access to the
     * specified backendPort. If the maximum number of network security group rules is exceeded the request fails with
     * HTTP status code 400.
     *
     * @param networkSecurityGroupRules the networkSecurityGroupRules value to set.
     * @return the InboundNATPool object itself.
     */
    @Generated
    public InboundNATPool setNetworkSecurityGroupRules(List<NetworkSecurityGroupRule> networkSecurityGroupRules) {
        this.networkSecurityGroupRules = networkSecurityGroupRules;
        return this;
    }
}
