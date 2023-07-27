// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.models;

import com.azure.resourcemanager.chaos.fluent.models.ExperimentStartOperationResultInner;

/** An immutable client-side representation of ExperimentStartOperationResult. */
public interface ExperimentStartOperationResult {
    /**
     * Gets the name property: String of the Experiment name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the statusUrl property: URL to retrieve the Experiment status.
     *
     * @return the statusUrl value.
     */
    String statusUrl();

    /**
     * Gets the inner com.azure.resourcemanager.chaos.fluent.models.ExperimentStartOperationResultInner object.
     *
     * @return the inner object.
     */
    ExperimentStartOperationResultInner innerModel();
}