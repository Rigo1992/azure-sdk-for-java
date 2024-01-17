// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The KqlScript model.
 */
@Fluent
public final class KqlScript {
    /*
     * The content property.
     */
    @JsonProperty(value = "content")
    private KqlScriptContent content;

    /**
     * Creates an instance of KqlScript class.
     */
    public KqlScript() {
    }

    /**
     * Get the content property: The content property.
     * 
     * @return the content value.
     */
    public KqlScriptContent getContent() {
        return this.content;
    }

    /**
     * Set the content property: The content property.
     * 
     * @param content the content value to set.
     * @return the KqlScript object itself.
     */
    public KqlScript setContent(KqlScriptContent content) {
        this.content = content;
        return this;
    }
}
