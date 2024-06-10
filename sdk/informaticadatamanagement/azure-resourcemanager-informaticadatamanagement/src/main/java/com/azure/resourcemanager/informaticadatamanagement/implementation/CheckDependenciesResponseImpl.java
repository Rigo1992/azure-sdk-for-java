// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.informaticadatamanagement.implementation;

import com.azure.resourcemanager.informaticadatamanagement.fluent.models.CheckDependenciesResponseInner;
import com.azure.resourcemanager.informaticadatamanagement.models.CheckDependenciesResponse;
import com.azure.resourcemanager.informaticadatamanagement.models.ServerlessRuntimeDependency;
import java.util.Collections;
import java.util.List;

public final class CheckDependenciesResponseImpl implements CheckDependenciesResponse {
    private CheckDependenciesResponseInner innerObject;

    private final com.azure.resourcemanager.informaticadatamanagement.InformaticaDataManagementManager serviceManager;

    CheckDependenciesResponseImpl(CheckDependenciesResponseInner innerObject,
        com.azure.resourcemanager.informaticadatamanagement.InformaticaDataManagementManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public int count() {
        return this.innerModel().count();
    }

    public String id() {
        return this.innerModel().id();
    }

    public List<ServerlessRuntimeDependency> references() {
        List<ServerlessRuntimeDependency> inner = this.innerModel().references();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public CheckDependenciesResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.informaticadatamanagement.InformaticaDataManagementManager manager() {
        return this.serviceManager;
    }
}
