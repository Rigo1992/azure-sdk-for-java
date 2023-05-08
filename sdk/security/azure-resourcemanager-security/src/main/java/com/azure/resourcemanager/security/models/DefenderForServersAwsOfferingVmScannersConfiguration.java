// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** configuration for Microsoft Defender for Server VM scanning. */
@Fluent
public final class DefenderForServersAwsOfferingVmScannersConfiguration {
    /*
     * The cloud role ARN in AWS for this feature
     */
    @JsonProperty(value = "cloudRoleArn")
    private String cloudRoleArn;

    /*
     * The scanning mode for the VM scan.
     */
    @JsonProperty(value = "scanningMode")
    private ScanningMode scanningMode;

    /*
     * VM tags that indicates that VM should not be scanned
     */
    @JsonProperty(value = "exclusionTags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> exclusionTags;

    /** Creates an instance of DefenderForServersAwsOfferingVmScannersConfiguration class. */
    public DefenderForServersAwsOfferingVmScannersConfiguration() {
    }

    /**
     * Get the cloudRoleArn property: The cloud role ARN in AWS for this feature.
     *
     * @return the cloudRoleArn value.
     */
    public String cloudRoleArn() {
        return this.cloudRoleArn;
    }

    /**
     * Set the cloudRoleArn property: The cloud role ARN in AWS for this feature.
     *
     * @param cloudRoleArn the cloudRoleArn value to set.
     * @return the DefenderForServersAwsOfferingVmScannersConfiguration object itself.
     */
    public DefenderForServersAwsOfferingVmScannersConfiguration withCloudRoleArn(String cloudRoleArn) {
        this.cloudRoleArn = cloudRoleArn;
        return this;
    }

    /**
     * Get the scanningMode property: The scanning mode for the VM scan.
     *
     * @return the scanningMode value.
     */
    public ScanningMode scanningMode() {
        return this.scanningMode;
    }

    /**
     * Set the scanningMode property: The scanning mode for the VM scan.
     *
     * @param scanningMode the scanningMode value to set.
     * @return the DefenderForServersAwsOfferingVmScannersConfiguration object itself.
     */
    public DefenderForServersAwsOfferingVmScannersConfiguration withScanningMode(ScanningMode scanningMode) {
        this.scanningMode = scanningMode;
        return this;
    }

    /**
     * Get the exclusionTags property: VM tags that indicates that VM should not be scanned.
     *
     * @return the exclusionTags value.
     */
    public Map<String, String> exclusionTags() {
        return this.exclusionTags;
    }

    /**
     * Set the exclusionTags property: VM tags that indicates that VM should not be scanned.
     *
     * @param exclusionTags the exclusionTags value to set.
     * @return the DefenderForServersAwsOfferingVmScannersConfiguration object itself.
     */
    public DefenderForServersAwsOfferingVmScannersConfiguration withExclusionTags(Map<String, String> exclusionTags) {
        this.exclusionTags = exclusionTags;
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
