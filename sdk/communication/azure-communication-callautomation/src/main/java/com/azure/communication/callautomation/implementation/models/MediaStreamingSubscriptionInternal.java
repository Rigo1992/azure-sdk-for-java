// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Media streaming Subscription Object.
 */
@Fluent
public final class MediaStreamingSubscriptionInternal {
    /*
     * Subscription Id.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Media streaming subscription state.
     */
    @JsonProperty(value = "state")
    private MediaStreamingSubscriptionStateInternal state;

    /*
     * Subscribed media streaming content types.
     */
    @JsonProperty(value = "subscribedContentTypes")
    private List<MediaStreamingContentTypeInternal> subscribedContentTypes;

    /**
     * Creates an instance of MediaStreamingSubscriptionInternal class.
     */
    public MediaStreamingSubscriptionInternal() {
    }

    /**
     * Get the id property: Subscription Id.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Subscription Id.
     * 
     * @param id the id value to set.
     * @return the MediaStreamingSubscriptionInternal object itself.
     */
    public MediaStreamingSubscriptionInternal setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the state property: Media streaming subscription state.
     * 
     * @return the state value.
     */
    public MediaStreamingSubscriptionStateInternal getState() {
        return this.state;
    }

    /**
     * Set the state property: Media streaming subscription state.
     * 
     * @param state the state value to set.
     * @return the MediaStreamingSubscriptionInternal object itself.
     */
    public MediaStreamingSubscriptionInternal setState(MediaStreamingSubscriptionStateInternal state) {
        this.state = state;
        return this;
    }

    /**
     * Get the subscribedContentTypes property: Subscribed media streaming content types.
     * 
     * @return the subscribedContentTypes value.
     */
    public List<MediaStreamingContentTypeInternal> getSubscribedContentTypes() {
        return this.subscribedContentTypes;
    }

    /**
     * Set the subscribedContentTypes property: Subscribed media streaming content types.
     * 
     * @param subscribedContentTypes the subscribedContentTypes value to set.
     * @return the MediaStreamingSubscriptionInternal object itself.
     */
    public MediaStreamingSubscriptionInternal
        setSubscribedContentTypes(List<MediaStreamingContentTypeInternal> subscribedContentTypes) {
        this.subscribedContentTypes = subscribedContentTypes;
        return this;
    }
}
