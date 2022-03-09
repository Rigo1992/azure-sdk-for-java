// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Specifies the boot diagnostic settings state. &lt;br&gt;&lt;br&gt;Minimum api-version: 2015-06-15. */
@Fluent
public final class DiagnosticsProfile {
    /*
     * Boot Diagnostics is a debugging feature which allows you to view Console
     * Output and Screenshot to diagnose VM status. <br>**NOTE**: If storageUri
     * is being specified then ensure that the storage account is in the same
     * region and subscription as the VM. <br><br> You can easily view the
     * output of your console log. <br><br> Azure also enables you to see a
     * screenshot of the VM from the hypervisor.
     */
    @JsonProperty(value = "bootDiagnostics")
    private BootDiagnostics bootDiagnostics;

    /**
     * Get the bootDiagnostics property: Boot Diagnostics is a debugging feature which allows you to view Console Output
     * and Screenshot to diagnose VM status. &lt;br&gt;**NOTE**: If storageUri is being specified then ensure that the
     * storage account is in the same region and subscription as the VM. &lt;br&gt;&lt;br&gt; You can easily view the
     * output of your console log. &lt;br&gt;&lt;br&gt; Azure also enables you to see a screenshot of the VM from the
     * hypervisor.
     *
     * @return the bootDiagnostics value.
     */
    public BootDiagnostics bootDiagnostics() {
        return this.bootDiagnostics;
    }

    /**
     * Set the bootDiagnostics property: Boot Diagnostics is a debugging feature which allows you to view Console Output
     * and Screenshot to diagnose VM status. &lt;br&gt;**NOTE**: If storageUri is being specified then ensure that the
     * storage account is in the same region and subscription as the VM. &lt;br&gt;&lt;br&gt; You can easily view the
     * output of your console log. &lt;br&gt;&lt;br&gt; Azure also enables you to see a screenshot of the VM from the
     * hypervisor.
     *
     * @param bootDiagnostics the bootDiagnostics value to set.
     * @return the DiagnosticsProfile object itself.
     */
    public DiagnosticsProfile withBootDiagnostics(BootDiagnostics bootDiagnostics) {
        this.bootDiagnostics = bootDiagnostics;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (bootDiagnostics() != null) {
            bootDiagnostics().validate();
        }
    }
}
