// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.resourcemanager.workloads.fluent.models.SapSupportedResourceSkusResultInner;
import java.util.List;

/** An immutable client-side representation of SapSupportedResourceSkusResult. */
public interface SapSupportedResourceSkusResult {
    /**
     * Gets the supportedSkus property: Gets the list of SAP supported SKUs.
     *
     * @return the supportedSkus value.
     */
    List<SapSupportedSku> supportedSkus();

    /**
     * Gets the inner com.azure.resourcemanager.workloads.fluent.models.SapSupportedResourceSkusResultInner object.
     *
     * @return the inner object.
     */
    SapSupportedResourceSkusResultInner innerModel();
}
