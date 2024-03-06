// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.implementation;

import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.FlexibleServerCapabilityInner;
import com.azure.resourcemanager.postgresqlflexibleserver.models.CapabilityStatus;
import com.azure.resourcemanager.postgresqlflexibleserver.models.FastProvisioningEditionCapability;
import com.azure.resourcemanager.postgresqlflexibleserver.models.FastProvisioningSupportedEnum;
import com.azure.resourcemanager.postgresqlflexibleserver.models.FlexibleServerCapability;
import com.azure.resourcemanager.postgresqlflexibleserver.models.FlexibleServerEditionCapability;
import com.azure.resourcemanager.postgresqlflexibleserver.models.GeoBackupSupportedEnum;
import com.azure.resourcemanager.postgresqlflexibleserver.models.OnlineResizeSupportedEnum;
import com.azure.resourcemanager.postgresqlflexibleserver.models.RestrictedEnum;
import com.azure.resourcemanager.postgresqlflexibleserver.models.ServerVersionCapability;
import com.azure.resourcemanager.postgresqlflexibleserver.models.StorageAutoGrowthSupportedEnum;
import com.azure.resourcemanager.postgresqlflexibleserver.models.ZoneRedundantHaAndGeoBackupSupportedEnum;
import com.azure.resourcemanager.postgresqlflexibleserver.models.ZoneRedundantHaSupportedEnum;
import java.util.Collections;
import java.util.List;

public final class FlexibleServerCapabilityImpl implements FlexibleServerCapability {
    private FlexibleServerCapabilityInner innerObject;

    private final com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager serviceManager;

    FlexibleServerCapabilityImpl(FlexibleServerCapabilityInner innerObject,
        com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public CapabilityStatus status() {
        return this.innerModel().status();
    }

    public String reason() {
        return this.innerModel().reason();
    }

    public String name() {
        return this.innerModel().name();
    }

    public List<FlexibleServerEditionCapability> supportedServerEditions() {
        List<FlexibleServerEditionCapability> inner = this.innerModel().supportedServerEditions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ServerVersionCapability> supportedServerVersions() {
        List<ServerVersionCapability> inner = this.innerModel().supportedServerVersions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public FastProvisioningSupportedEnum fastProvisioningSupported() {
        return this.innerModel().fastProvisioningSupported();
    }

    public List<FastProvisioningEditionCapability> supportedFastProvisioningEditions() {
        List<FastProvisioningEditionCapability> inner = this.innerModel().supportedFastProvisioningEditions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public GeoBackupSupportedEnum geoBackupSupported() {
        return this.innerModel().geoBackupSupported();
    }

    public ZoneRedundantHaSupportedEnum zoneRedundantHaSupported() {
        return this.innerModel().zoneRedundantHaSupported();
    }

    public ZoneRedundantHaAndGeoBackupSupportedEnum zoneRedundantHaAndGeoBackupSupported() {
        return this.innerModel().zoneRedundantHaAndGeoBackupSupported();
    }

    public StorageAutoGrowthSupportedEnum storageAutoGrowthSupported() {
        return this.innerModel().storageAutoGrowthSupported();
    }

    public OnlineResizeSupportedEnum onlineResizeSupported() {
        return this.innerModel().onlineResizeSupported();
    }

    public RestrictedEnum restricted() {
        return this.innerModel().restricted();
    }

    public FlexibleServerCapabilityInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager manager() {
        return this.serviceManager;
    }
}
