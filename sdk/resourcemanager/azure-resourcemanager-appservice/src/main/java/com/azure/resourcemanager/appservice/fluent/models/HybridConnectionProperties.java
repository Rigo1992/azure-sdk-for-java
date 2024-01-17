// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * HybridConnection resource specific properties.
 */
@Fluent
public final class HybridConnectionProperties {
    /*
     * The name of the Service Bus namespace.
     */
    @JsonProperty(value = "serviceBusNamespace")
    private String serviceBusNamespace;

    /*
     * The name of the Service Bus relay.
     */
    @JsonProperty(value = "relayName")
    private String relayName;

    /*
     * The ARM URI to the Service Bus relay.
     */
    @JsonProperty(value = "relayArmUri")
    private String relayArmUri;

    /*
     * The hostname of the endpoint.
     */
    @JsonProperty(value = "hostname")
    private String hostname;

    /*
     * The port of the endpoint.
     */
    @JsonProperty(value = "port")
    private Integer port;

    /*
     * The name of the Service Bus key which has Send permissions. This is used to authenticate to Service Bus.
     */
    @JsonProperty(value = "sendKeyName")
    private String sendKeyName;

    /*
     * The value of the Service Bus key. This is used to authenticate to Service Bus. In ARM this key will not be
     * returned
     * normally, use the POST /listKeys API instead.
     */
    @JsonProperty(value = "sendKeyValue")
    private String sendKeyValue;

    /*
     * The suffix for the service bus endpoint. By default this is .servicebus.windows.net
     */
    @JsonProperty(value = "serviceBusSuffix")
    private String serviceBusSuffix;

    /**
     * Creates an instance of HybridConnectionProperties class.
     */
    public HybridConnectionProperties() {
    }

    /**
     * Get the serviceBusNamespace property: The name of the Service Bus namespace.
     * 
     * @return the serviceBusNamespace value.
     */
    public String serviceBusNamespace() {
        return this.serviceBusNamespace;
    }

    /**
     * Set the serviceBusNamespace property: The name of the Service Bus namespace.
     * 
     * @param serviceBusNamespace the serviceBusNamespace value to set.
     * @return the HybridConnectionProperties object itself.
     */
    public HybridConnectionProperties withServiceBusNamespace(String serviceBusNamespace) {
        this.serviceBusNamespace = serviceBusNamespace;
        return this;
    }

    /**
     * Get the relayName property: The name of the Service Bus relay.
     * 
     * @return the relayName value.
     */
    public String relayName() {
        return this.relayName;
    }

    /**
     * Set the relayName property: The name of the Service Bus relay.
     * 
     * @param relayName the relayName value to set.
     * @return the HybridConnectionProperties object itself.
     */
    public HybridConnectionProperties withRelayName(String relayName) {
        this.relayName = relayName;
        return this;
    }

    /**
     * Get the relayArmUri property: The ARM URI to the Service Bus relay.
     * 
     * @return the relayArmUri value.
     */
    public String relayArmUri() {
        return this.relayArmUri;
    }

    /**
     * Set the relayArmUri property: The ARM URI to the Service Bus relay.
     * 
     * @param relayArmUri the relayArmUri value to set.
     * @return the HybridConnectionProperties object itself.
     */
    public HybridConnectionProperties withRelayArmUri(String relayArmUri) {
        this.relayArmUri = relayArmUri;
        return this;
    }

    /**
     * Get the hostname property: The hostname of the endpoint.
     * 
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Set the hostname property: The hostname of the endpoint.
     * 
     * @param hostname the hostname value to set.
     * @return the HybridConnectionProperties object itself.
     */
    public HybridConnectionProperties withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get the port property: The port of the endpoint.
     * 
     * @return the port value.
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port property: The port of the endpoint.
     * 
     * @param port the port value to set.
     * @return the HybridConnectionProperties object itself.
     */
    public HybridConnectionProperties withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Get the sendKeyName property: The name of the Service Bus key which has Send permissions. This is used to
     * authenticate to Service Bus.
     * 
     * @return the sendKeyName value.
     */
    public String sendKeyName() {
        return this.sendKeyName;
    }

    /**
     * Set the sendKeyName property: The name of the Service Bus key which has Send permissions. This is used to
     * authenticate to Service Bus.
     * 
     * @param sendKeyName the sendKeyName value to set.
     * @return the HybridConnectionProperties object itself.
     */
    public HybridConnectionProperties withSendKeyName(String sendKeyName) {
        this.sendKeyName = sendKeyName;
        return this;
    }

    /**
     * Get the sendKeyValue property: The value of the Service Bus key. This is used to authenticate to Service Bus. In
     * ARM this key will not be returned
     * normally, use the POST /listKeys API instead.
     * 
     * @return the sendKeyValue value.
     */
    public String sendKeyValue() {
        return this.sendKeyValue;
    }

    /**
     * Set the sendKeyValue property: The value of the Service Bus key. This is used to authenticate to Service Bus. In
     * ARM this key will not be returned
     * normally, use the POST /listKeys API instead.
     * 
     * @param sendKeyValue the sendKeyValue value to set.
     * @return the HybridConnectionProperties object itself.
     */
    public HybridConnectionProperties withSendKeyValue(String sendKeyValue) {
        this.sendKeyValue = sendKeyValue;
        return this;
    }

    /**
     * Get the serviceBusSuffix property: The suffix for the service bus endpoint. By default this is
     * .servicebus.windows.net.
     * 
     * @return the serviceBusSuffix value.
     */
    public String serviceBusSuffix() {
        return this.serviceBusSuffix;
    }

    /**
     * Set the serviceBusSuffix property: The suffix for the service bus endpoint. By default this is
     * .servicebus.windows.net.
     * 
     * @param serviceBusSuffix the serviceBusSuffix value to set.
     * @return the HybridConnectionProperties object itself.
     */
    public HybridConnectionProperties withServiceBusSuffix(String serviceBusSuffix) {
        this.serviceBusSuffix = serviceBusSuffix;
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
