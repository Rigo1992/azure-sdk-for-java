// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.selfhelp.models.SolutionProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Simplified Solutions response.
 */
@Fluent
public final class SimplifiedSolutionsResourceInner extends ProxyResource {
    /*
     * Simplified Solutions result
     */
    @JsonProperty(value = "properties")
    private SimplifiedSolutionsResourceProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of SimplifiedSolutionsResourceInner class.
     */
    public SimplifiedSolutionsResourceInner() {
    }

    /**
     * Get the innerProperties property: Simplified Solutions result.
     * 
     * @return the innerProperties value.
     */
    private SimplifiedSolutionsResourceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the solutionId property: Solution Id to identify single Simplified Solution.
     * 
     * @return the solutionId value.
     */
    public String solutionId() {
        return this.innerProperties() == null ? null : this.innerProperties().solutionId();
    }

    /**
     * Set the solutionId property: Solution Id to identify single Simplified Solution.
     * 
     * @param solutionId the solutionId value to set.
     * @return the SimplifiedSolutionsResourceInner object itself.
     */
    public SimplifiedSolutionsResourceInner withSolutionId(String solutionId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SimplifiedSolutionsResourceProperties();
        }
        this.innerProperties().withSolutionId(solutionId);
        return this;
    }

    /**
     * Get the parameters property: Client input parameters to run Simplified Solutions.
     * 
     * @return the parameters value.
     */
    public Map<String, String> parameters() {
        return this.innerProperties() == null ? null : this.innerProperties().parameters();
    }

    /**
     * Set the parameters property: Client input parameters to run Simplified Solutions.
     * 
     * @param parameters the parameters value to set.
     * @return the SimplifiedSolutionsResourceInner object itself.
     */
    public SimplifiedSolutionsResourceInner withParameters(Map<String, String> parameters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SimplifiedSolutionsResourceProperties();
        }
        this.innerProperties().withParameters(parameters);
        return this;
    }

    /**
     * Get the title property: The title.
     * 
     * @return the title value.
     */
    public String title() {
        return this.innerProperties() == null ? null : this.innerProperties().title();
    }

    /**
     * Get the appendix property: Additional parameter response for Simplified Solutions.
     * 
     * @return the appendix value.
     */
    public Map<String, String> appendix() {
        return this.innerProperties() == null ? null : this.innerProperties().appendix();
    }

    /**
     * Get the content property: The HTML content that needs to be rendered and shown to customer.
     * 
     * @return the content value.
     */
    public String content() {
        return this.innerProperties() == null ? null : this.innerProperties().content();
    }

    /**
     * Get the provisioningState property: Status of Simplified Solution provisioning.
     * 
     * @return the provisioningState value.
     */
    public SolutionProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
