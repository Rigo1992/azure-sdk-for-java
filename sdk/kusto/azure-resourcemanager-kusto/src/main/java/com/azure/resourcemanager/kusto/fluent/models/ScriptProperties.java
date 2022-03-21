// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.kusto.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A class representing database script property. */
@Fluent
public final class ScriptProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ScriptProperties.class);

    /*
     * The url to the KQL script blob file. Must not be used together with
     * scriptContent property
     */
    @JsonProperty(value = "scriptUrl")
    private String scriptUrl;

    /*
     * The SaS token that provide read access to the file which contain the
     * script. Must be provided when using scriptUrl property.
     */
    @JsonProperty(value = "scriptUrlSasToken")
    private String scriptUrlSasToken;

    /*
     * The script content. This property should be used when the script is
     * provide inline and not through file in a SA. Must not be used together
     * with scriptUrl and scriptUrlSasToken properties.
     */
    @JsonProperty(value = "scriptContent")
    private String scriptContent;

    /*
     * A unique string. If changed the script will be applied again.
     */
    @JsonProperty(value = "forceUpdateTag")
    private String forceUpdateTag;

    /*
     * Flag that indicates whether to continue if one of the command fails.
     */
    @JsonProperty(value = "continueOnErrors")
    private Boolean continueOnErrors;

    /*
     * The provisioned state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the scriptUrl property: The url to the KQL script blob file. Must not be used together with scriptContent
     * property.
     *
     * @return the scriptUrl value.
     */
    public String scriptUrl() {
        return this.scriptUrl;
    }

    /**
     * Set the scriptUrl property: The url to the KQL script blob file. Must not be used together with scriptContent
     * property.
     *
     * @param scriptUrl the scriptUrl value to set.
     * @return the ScriptProperties object itself.
     */
    public ScriptProperties withScriptUrl(String scriptUrl) {
        this.scriptUrl = scriptUrl;
        return this;
    }

    /**
     * Get the scriptUrlSasToken property: The SaS token that provide read access to the file which contain the script.
     * Must be provided when using scriptUrl property.
     *
     * @return the scriptUrlSasToken value.
     */
    public String scriptUrlSasToken() {
        return this.scriptUrlSasToken;
    }

    /**
     * Set the scriptUrlSasToken property: The SaS token that provide read access to the file which contain the script.
     * Must be provided when using scriptUrl property.
     *
     * @param scriptUrlSasToken the scriptUrlSasToken value to set.
     * @return the ScriptProperties object itself.
     */
    public ScriptProperties withScriptUrlSasToken(String scriptUrlSasToken) {
        this.scriptUrlSasToken = scriptUrlSasToken;
        return this;
    }

    /**
     * Get the scriptContent property: The script content. This property should be used when the script is provide
     * inline and not through file in a SA. Must not be used together with scriptUrl and scriptUrlSasToken properties.
     *
     * @return the scriptContent value.
     */
    public String scriptContent() {
        return this.scriptContent;
    }

    /**
     * Set the scriptContent property: The script content. This property should be used when the script is provide
     * inline and not through file in a SA. Must not be used together with scriptUrl and scriptUrlSasToken properties.
     *
     * @param scriptContent the scriptContent value to set.
     * @return the ScriptProperties object itself.
     */
    public ScriptProperties withScriptContent(String scriptContent) {
        this.scriptContent = scriptContent;
        return this;
    }

    /**
     * Get the forceUpdateTag property: A unique string. If changed the script will be applied again.
     *
     * @return the forceUpdateTag value.
     */
    public String forceUpdateTag() {
        return this.forceUpdateTag;
    }

    /**
     * Set the forceUpdateTag property: A unique string. If changed the script will be applied again.
     *
     * @param forceUpdateTag the forceUpdateTag value to set.
     * @return the ScriptProperties object itself.
     */
    public ScriptProperties withForceUpdateTag(String forceUpdateTag) {
        this.forceUpdateTag = forceUpdateTag;
        return this;
    }

    /**
     * Get the continueOnErrors property: Flag that indicates whether to continue if one of the command fails.
     *
     * @return the continueOnErrors value.
     */
    public Boolean continueOnErrors() {
        return this.continueOnErrors;
    }

    /**
     * Set the continueOnErrors property: Flag that indicates whether to continue if one of the command fails.
     *
     * @param continueOnErrors the continueOnErrors value to set.
     * @return the ScriptProperties object itself.
     */
    public ScriptProperties withContinueOnErrors(Boolean continueOnErrors) {
        this.continueOnErrors = continueOnErrors;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioned state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
