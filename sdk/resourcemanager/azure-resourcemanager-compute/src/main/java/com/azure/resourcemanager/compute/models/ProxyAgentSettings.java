// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies ProxyAgent settings while creating the virtual machine. Minimum api-version: 2024-03-01.
 */
@Fluent
public final class ProxyAgentSettings {
    /*
     * Specifies whether ProxyAgent feature should be enabled on the virtual machine or virtual machine scale set.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * Specifies the mode that ProxyAgent will execute on if the feature is enabled. ProxyAgent will start to audit or
     * monitor but not enforce access control over requests to host endpoints in Audit mode, while in Enforce mode it
     * will enforce access control. The default value is Enforce mode.
     */
    @JsonProperty(value = "mode")
    private Mode mode;

    /*
     * Increase the value of this property allows user to reset the key used for securing communication channel between
     * guest and host.
     */
    @JsonProperty(value = "keyIncarnationId")
    private Integer keyIncarnationId;

    /**
     * Creates an instance of ProxyAgentSettings class.
     */
    public ProxyAgentSettings() {
    }

    /**
     * Get the enabled property: Specifies whether ProxyAgent feature should be enabled on the virtual machine or
     * virtual machine scale set.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Specifies whether ProxyAgent feature should be enabled on the virtual machine or
     * virtual machine scale set.
     * 
     * @param enabled the enabled value to set.
     * @return the ProxyAgentSettings object itself.
     */
    public ProxyAgentSettings withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the mode property: Specifies the mode that ProxyAgent will execute on if the feature is enabled. ProxyAgent
     * will start to audit or monitor but not enforce access control over requests to host endpoints in Audit mode,
     * while in Enforce mode it will enforce access control. The default value is Enforce mode.
     * 
     * @return the mode value.
     */
    public Mode mode() {
        return this.mode;
    }

    /**
     * Set the mode property: Specifies the mode that ProxyAgent will execute on if the feature is enabled. ProxyAgent
     * will start to audit or monitor but not enforce access control over requests to host endpoints in Audit mode,
     * while in Enforce mode it will enforce access control. The default value is Enforce mode.
     * 
     * @param mode the mode value to set.
     * @return the ProxyAgentSettings object itself.
     */
    public ProxyAgentSettings withMode(Mode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get the keyIncarnationId property: Increase the value of this property allows user to reset the key used for
     * securing communication channel between guest and host.
     * 
     * @return the keyIncarnationId value.
     */
    public Integer keyIncarnationId() {
        return this.keyIncarnationId;
    }

    /**
     * Set the keyIncarnationId property: Increase the value of this property allows user to reset the key used for
     * securing communication channel between guest and host.
     * 
     * @param keyIncarnationId the keyIncarnationId value to set.
     * @return the ProxyAgentSettings object itself.
     */
    public ProxyAgentSettings withKeyIncarnationId(Integer keyIncarnationId) {
        this.keyIncarnationId = keyIncarnationId;
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
