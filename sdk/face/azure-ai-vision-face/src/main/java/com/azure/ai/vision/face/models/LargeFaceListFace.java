// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.vision.face.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Face resource for large face list.
 */
@Immutable
public final class LargeFaceListFace {

    /*
     * Face ID of the face.
     */
    @Generated
    @JsonProperty(value = "persistedFaceId", access = JsonProperty.Access.WRITE_ONLY)
    private String persistedFaceId;

    /*
     * User-provided data attached to the face. The length limit is 1K.
     */
    @Generated
    @JsonProperty(value = "userData")
    private String userData;

    /**
     * Creates an instance of LargeFaceListFace class.
     */
    @Generated
    private LargeFaceListFace() {
    }

    /**
     * Get the persistedFaceId property: Face ID of the face.
     *
     * @return the persistedFaceId value.
     */
    @Generated
    public String getPersistedFaceId() {
        return this.persistedFaceId;
    }

    /**
     * Get the userData property: User-provided data attached to the face. The length limit is 1K.
     *
     * @return the userData value.
     */
    @Generated
    public String getUserData() {
        return this.userData;
    }
}
