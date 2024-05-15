// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/** The BaseDialog model. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "kind",
        defaultImpl = BaseDialog.class)
@JsonTypeName("BaseDialog")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "azureOpenAI", value = AzureOpenAIDialog.class),
    @JsonSubTypes.Type(name = "powerVirtualAgents", value = PowerVirtualAgentsDialog.class)
})
@Fluent
public class BaseDialog {
    /*
     * Dialog context.
     */
    @JsonProperty(value = "context", required = true)
    private Map<String, Object> context;

    /**
     * Get the context property: Dialog context.
     *
     * @return the context value.
     */
    public Map<String, Object> getContext() {
        return this.context;
    }

    /**
     * Set the context property: Dialog context.
     *
     * @param context the context value to set.
     * @return the BaseDialog object itself.
     */
    public BaseDialog setContext(Map<String, Object> context) {
        this.context = context;
        return this;
    }
}
