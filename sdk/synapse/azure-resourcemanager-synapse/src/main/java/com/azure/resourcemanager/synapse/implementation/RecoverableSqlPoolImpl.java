// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.resourcemanager.synapse.fluent.models.RecoverableSqlPoolInner;
import com.azure.resourcemanager.synapse.models.RecoverableSqlPool;
import java.time.OffsetDateTime;

public final class RecoverableSqlPoolImpl implements RecoverableSqlPool {
    private RecoverableSqlPoolInner innerObject;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    RecoverableSqlPoolImpl(
        RecoverableSqlPoolInner innerObject, com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String edition() {
        return this.innerModel().edition();
    }

    public String serviceLevelObjective() {
        return this.innerModel().serviceLevelObjective();
    }

    public String elasticPoolName() {
        return this.innerModel().elasticPoolName();
    }

    public OffsetDateTime lastAvailableBackupDate() {
        return this.innerModel().lastAvailableBackupDate();
    }

    public RecoverableSqlPoolInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }
}
