// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.sql.models.ManagedInstanceDtcSecuritySettings;
import com.azure.resourcemanager.sql.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The properties of managed instance DTC. */
@Fluent
public final class ManagedInstanceDtcProperties {
    /*
     * Active status of managed instance DTC.
     */
    @JsonProperty(value = "dtcEnabled")
    private Boolean dtcEnabled;

    /*
     * Security settings of managed instance DTC.
     */
    @JsonProperty(value = "securitySettings")
    private ManagedInstanceDtcSecuritySettings securitySettings;

    /*
     * External dns suffix search list of managed instance DTC.
     */
    @JsonProperty(value = "externalDnsSuffixSearchList")
    private List<String> externalDnsSuffixSearchList;

    /*
     * Host name dns suffix of managed instance DTC.
     */
    @JsonProperty(value = "dtcHostNameDnsSuffix", access = JsonProperty.Access.WRITE_ONLY)
    private String dtcHostnameDnsSuffix;

    /*
     * Provisioning state of managed instance DTC.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /** Creates an instance of ManagedInstanceDtcProperties class. */
    public ManagedInstanceDtcProperties() {
    }

    /**
     * Get the dtcEnabled property: Active status of managed instance DTC.
     *
     * @return the dtcEnabled value.
     */
    public Boolean dtcEnabled() {
        return this.dtcEnabled;
    }

    /**
     * Set the dtcEnabled property: Active status of managed instance DTC.
     *
     * @param dtcEnabled the dtcEnabled value to set.
     * @return the ManagedInstanceDtcProperties object itself.
     */
    public ManagedInstanceDtcProperties withDtcEnabled(Boolean dtcEnabled) {
        this.dtcEnabled = dtcEnabled;
        return this;
    }

    /**
     * Get the securitySettings property: Security settings of managed instance DTC.
     *
     * @return the securitySettings value.
     */
    public ManagedInstanceDtcSecuritySettings securitySettings() {
        return this.securitySettings;
    }

    /**
     * Set the securitySettings property: Security settings of managed instance DTC.
     *
     * @param securitySettings the securitySettings value to set.
     * @return the ManagedInstanceDtcProperties object itself.
     */
    public ManagedInstanceDtcProperties withSecuritySettings(ManagedInstanceDtcSecuritySettings securitySettings) {
        this.securitySettings = securitySettings;
        return this;
    }

    /**
     * Get the externalDnsSuffixSearchList property: External dns suffix search list of managed instance DTC.
     *
     * @return the externalDnsSuffixSearchList value.
     */
    public List<String> externalDnsSuffixSearchList() {
        return this.externalDnsSuffixSearchList;
    }

    /**
     * Set the externalDnsSuffixSearchList property: External dns suffix search list of managed instance DTC.
     *
     * @param externalDnsSuffixSearchList the externalDnsSuffixSearchList value to set.
     * @return the ManagedInstanceDtcProperties object itself.
     */
    public ManagedInstanceDtcProperties withExternalDnsSuffixSearchList(List<String> externalDnsSuffixSearchList) {
        this.externalDnsSuffixSearchList = externalDnsSuffixSearchList;
        return this;
    }

    /**
     * Get the dtcHostnameDnsSuffix property: Host name dns suffix of managed instance DTC.
     *
     * @return the dtcHostnameDnsSuffix value.
     */
    public String dtcHostnameDnsSuffix() {
        return this.dtcHostnameDnsSuffix;
    }

    /**
     * Get the provisioningState property: Provisioning state of managed instance DTC.
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
        if (securitySettings() != null) {
            securitySettings().validate();
        }
    }
}
