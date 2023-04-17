// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Application Live View properties payload. */
@Immutable
public final class ApplicationLiveViewComponent {
    /*
     * Name of the component.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private Object name;

    /*
     * The requested resource quantity for required CPU and Memory.
     */
    @JsonProperty(value = "resourceRequests", access = JsonProperty.Access.WRITE_ONLY)
    private ApplicationLiveViewResourceRequests resourceRequests;

    /*
     * Collection of instances belong to Application Live View.
     */
    @JsonProperty(value = "instances", access = JsonProperty.Access.WRITE_ONLY)
    private List<ApplicationLiveViewInstance> instances;

    /** Creates an instance of ApplicationLiveViewComponent class. */
    public ApplicationLiveViewComponent() {
    }

    /**
     * Get the name property: Name of the component.
     *
     * @return the name value.
     */
    public Object name() {
        return this.name;
    }

    /**
     * Get the resourceRequests property: The requested resource quantity for required CPU and Memory.
     *
     * @return the resourceRequests value.
     */
    public ApplicationLiveViewResourceRequests resourceRequests() {
        return this.resourceRequests;
    }

    /**
     * Get the instances property: Collection of instances belong to Application Live View.
     *
     * @return the instances value.
     */
    public List<ApplicationLiveViewInstance> instances() {
        return this.instances;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resourceRequests() != null) {
            resourceRequests().validate();
        }
        if (instances() != null) {
            instances().forEach(e -> e.validate());
        }
    }
}
