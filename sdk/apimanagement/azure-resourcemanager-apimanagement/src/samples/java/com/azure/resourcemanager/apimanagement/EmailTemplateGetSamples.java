// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.models.TemplateName;

/** Samples for EmailTemplate Get. */
public final class EmailTemplateGetSamples {
    /*
     * operationId: EmailTemplate_Get
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementGetTemplate
     */
    /**
     * Sample code: ApiManagementGetTemplate.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementGetTemplate(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .emailTemplates()
            .getWithResponse("rg1", "apimService1", TemplateName.NEW_ISSUE_NOTIFICATION_MESSAGE, Context.NONE);
    }
}
