// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Provider specific input for update pairing operations. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "instanceType",
    defaultImpl = ReplicationProviderSpecificUpdateContainerMappingInput.class)
@JsonTypeName("ReplicationProviderSpecificUpdateContainerMappingInput")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "A2A", value = A2AUpdateContainerMappingInput.class),
    @JsonSubTypes.Type(name = "InMageRcm", value = InMageRcmUpdateContainerMappingInput.class)
})
@Immutable
public class ReplicationProviderSpecificUpdateContainerMappingInput {
    /** Creates an instance of ReplicationProviderSpecificUpdateContainerMappingInput class. */
    public ReplicationProviderSpecificUpdateContainerMappingInput() {
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
