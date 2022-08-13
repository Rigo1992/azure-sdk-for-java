// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The CreateCallRequestInternal model. */
@Fluent
public final class CreateCallRequestInternal {
    /*
     * The targets of the call.
     */
    @JsonProperty(value = "targets", required = true)
    private List<CommunicationIdentifierModel> targets;

    /*
     * The source of the call.
     */
    @JsonProperty(value = "source", required = true)
    private CallSourceInternal source;

    /*
     * The subject.
     */
    @JsonProperty(value = "subject")
    private String subject;

    /*
     * The callback URI.
     */
    @JsonProperty(value = "callbackUri", required = true)
    private String callbackUri;

    /**
     * Get the targets property: The targets of the call.
     *
     * @return the targets value.
     */
    public List<CommunicationIdentifierModel> getTargets() {
        return this.targets;
    }

    /**
     * Set the targets property: The targets of the call.
     *
     * @param targets the targets value to set.
     * @return the CreateCallRequestInternal object itself.
     */
    public CreateCallRequestInternal setTargets(List<CommunicationIdentifierModel> targets) {
        this.targets = targets;
        return this;
    }

    /**
     * Get the source property: The source of the call.
     *
     * @return the source value.
     */
    public CallSourceInternal getSource() {
        return this.source;
    }

    /**
     * Set the source property: The source of the call.
     *
     * @param source the source value to set.
     * @return the CreateCallRequestInternal object itself.
     */
    public CreateCallRequestInternal setSource(CallSourceInternal source) {
        this.source = source;
        return this;
    }

    /**
     * Get the subject property: The subject.
     *
     * @return the subject value.
     */
    public String getSubject() {
        return this.subject;
    }

    /**
     * Set the subject property: The subject.
     *
     * @param subject the subject value to set.
     * @return the CreateCallRequestInternal object itself.
     */
    public CreateCallRequestInternal setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Get the callbackUri property: The callback URI.
     *
     * @return the callbackUri value.
     */
    public String getCallbackUri() {
        return this.callbackUri;
    }

    /**
     * Set the callbackUri property: The callback URI.
     *
     * @param callbackUri the callbackUri value to set.
     * @return the CreateCallRequestInternal object itself.
     */
    public CreateCallRequestInternal setCallbackUri(String callbackUri) {
        this.callbackUri = callbackUri;
        return this;
    }
}
