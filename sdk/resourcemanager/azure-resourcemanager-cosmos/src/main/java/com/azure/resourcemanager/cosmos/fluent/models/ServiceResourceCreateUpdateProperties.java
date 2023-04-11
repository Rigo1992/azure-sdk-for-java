// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.cosmos.models.ServiceSize;
import com.azure.resourcemanager.cosmos.models.ServiceType;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties in ServiceResourceCreateUpdateParameters. */
@Fluent
public final class ServiceResourceCreateUpdateProperties {
    /*
     * Instance type for the service.
     */
    @JsonProperty(value = "instanceSize")
    private ServiceSize instanceSize;

    /*
     * Instance count for the service.
     */
    @JsonProperty(value = "instanceCount")
    private Integer instanceCount;

    /*
     * ServiceType for the service.
     */
    @JsonProperty(value = "serviceType")
    private ServiceType serviceType;

    /** Creates an instance of ServiceResourceCreateUpdateProperties class. */
    public ServiceResourceCreateUpdateProperties() {
    }

    /**
     * Get the instanceSize property: Instance type for the service.
     *
     * @return the instanceSize value.
     */
    public ServiceSize instanceSize() {
        return this.instanceSize;
    }

    /**
     * Set the instanceSize property: Instance type for the service.
     *
     * @param instanceSize the instanceSize value to set.
     * @return the ServiceResourceCreateUpdateProperties object itself.
     */
    public ServiceResourceCreateUpdateProperties withInstanceSize(ServiceSize instanceSize) {
        this.instanceSize = instanceSize;
        return this;
    }

    /**
     * Get the instanceCount property: Instance count for the service.
     *
     * @return the instanceCount value.
     */
    public Integer instanceCount() {
        return this.instanceCount;
    }

    /**
     * Set the instanceCount property: Instance count for the service.
     *
     * @param instanceCount the instanceCount value to set.
     * @return the ServiceResourceCreateUpdateProperties object itself.
     */
    public ServiceResourceCreateUpdateProperties withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * Get the serviceType property: ServiceType for the service.
     *
     * @return the serviceType value.
     */
    public ServiceType serviceType() {
        return this.serviceType;
    }

    /**
     * Set the serviceType property: ServiceType for the service.
     *
     * @param serviceType the serviceType value to set.
     * @return the ServiceResourceCreateUpdateProperties object itself.
     */
    public ServiceResourceCreateUpdateProperties withServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
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
