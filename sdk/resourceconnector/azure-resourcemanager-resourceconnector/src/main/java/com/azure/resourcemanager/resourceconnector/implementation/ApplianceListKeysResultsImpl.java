// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourceconnector.implementation;

import com.azure.resourcemanager.resourceconnector.fluent.models.ApplianceListKeysResultsInner;
import com.azure.resourcemanager.resourceconnector.models.ApplianceCredentialKubeconfig;
import com.azure.resourcemanager.resourceconnector.models.ApplianceListKeysResults;
import com.azure.resourcemanager.resourceconnector.models.ArtifactProfile;
import com.azure.resourcemanager.resourceconnector.models.SshKey;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class ApplianceListKeysResultsImpl implements ApplianceListKeysResults {
    private ApplianceListKeysResultsInner innerObject;

    private final com.azure.resourcemanager.resourceconnector.ResourceConnectorManager serviceManager;

    ApplianceListKeysResultsImpl(
        ApplianceListKeysResultsInner innerObject,
        com.azure.resourcemanager.resourceconnector.ResourceConnectorManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Map<String, ArtifactProfile> artifactProfiles() {
        Map<String, ArtifactProfile> inner = this.innerModel().artifactProfiles();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public List<ApplianceCredentialKubeconfig> kubeconfigs() {
        List<ApplianceCredentialKubeconfig> inner = this.innerModel().kubeconfigs();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Map<String, SshKey> sshKeys() {
        Map<String, SshKey> inner = this.innerModel().sshKeys();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ApplianceListKeysResultsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.resourceconnector.ResourceConnectorManager manager() {
        return this.serviceManager;
    }
}
