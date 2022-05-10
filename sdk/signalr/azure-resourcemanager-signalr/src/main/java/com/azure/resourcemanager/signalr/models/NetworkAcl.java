// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Network ACL. */
@Fluent
public class NetworkAcl {
    /*
     * Allowed request types. The value can be one or more of:
     * ClientConnection, ServerConnection, RESTAPI.
     */
    @JsonProperty(value = "allow")
    private List<SignalRRequestType> allow;

    /*
     * Denied request types. The value can be one or more of: ClientConnection,
     * ServerConnection, RESTAPI.
     */
    @JsonProperty(value = "deny")
    private List<SignalRRequestType> deny;

    /**
     * Get the allow property: Allowed request types. The value can be one or more of: ClientConnection,
     * ServerConnection, RESTAPI.
     *
     * @return the allow value.
     */
    public List<SignalRRequestType> allow() {
        return this.allow;
    }

    /**
     * Set the allow property: Allowed request types. The value can be one or more of: ClientConnection,
     * ServerConnection, RESTAPI.
     *
     * @param allow the allow value to set.
     * @return the NetworkAcl object itself.
     */
    public NetworkAcl withAllow(List<SignalRRequestType> allow) {
        this.allow = allow;
        return this;
    }

    /**
     * Get the deny property: Denied request types. The value can be one or more of: ClientConnection, ServerConnection,
     * RESTAPI.
     *
     * @return the deny value.
     */
    public List<SignalRRequestType> deny() {
        return this.deny;
    }

    /**
     * Set the deny property: Denied request types. The value can be one or more of: ClientConnection, ServerConnection,
     * RESTAPI.
     *
     * @param deny the deny value to set.
     * @return the NetworkAcl object itself.
     */
    public NetworkAcl withDeny(List<SignalRRequestType> deny) {
        this.deny = deny;
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
