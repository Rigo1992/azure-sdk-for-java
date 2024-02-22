// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.elasticsan.fluent.models.ElasticSanInner;
import com.azure.resourcemanager.elasticsan.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.elasticsan.models.ElasticSan;
import com.azure.resourcemanager.elasticsan.models.ElasticSanUpdate;
import com.azure.resourcemanager.elasticsan.models.PrivateEndpointConnection;
import com.azure.resourcemanager.elasticsan.models.ProvisioningStates;
import com.azure.resourcemanager.elasticsan.models.PublicNetworkAccess;
import com.azure.resourcemanager.elasticsan.models.Sku;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class ElasticSanImpl implements ElasticSan, ElasticSan.Definition, ElasticSan.Update {
    private ElasticSanInner innerObject;

    private final com.azure.resourcemanager.elasticsan.ElasticSanManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public Sku sku() {
        return this.innerModel().sku();
    }

    public List<String> availabilityZones() {
        List<String> inner = this.innerModel().availabilityZones();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ProvisioningStates provisioningState() {
        return this.innerModel().provisioningState();
    }

    public long baseSizeTiB() {
        return this.innerModel().baseSizeTiB();
    }

    public long extendedCapacitySizeTiB() {
        return this.innerModel().extendedCapacitySizeTiB();
    }

    public Long totalVolumeSizeGiB() {
        return this.innerModel().totalVolumeSizeGiB();
    }

    public Long volumeGroupCount() {
        return this.innerModel().volumeGroupCount();
    }

    public Long totalIops() {
        return this.innerModel().totalIops();
    }

    public Long totalMBps() {
        return this.innerModel().totalMBps();
    }

    public Long totalSizeTiB() {
        return this.innerModel().totalSizeTiB();
    }

    public List<PrivateEndpointConnection> privateEndpointConnections() {
        List<PrivateEndpointConnectionInner> inner = this.innerModel().privateEndpointConnections();
        if (inner != null) {
            return Collections.unmodifiableList(inner.stream()
                .map(inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager())).collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerModel().publicNetworkAccess();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public ElasticSanInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.elasticsan.ElasticSanManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String elasticSanName;

    private ElasticSanUpdate updateParameters;

    public ElasticSanImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public ElasticSan create() {
        this.innerObject = serviceManager.serviceClient().getElasticSans().create(resourceGroupName, elasticSanName,
            this.innerModel(), Context.NONE);
        return this;
    }

    public ElasticSan create(Context context) {
        this.innerObject = serviceManager.serviceClient().getElasticSans().create(resourceGroupName, elasticSanName,
            this.innerModel(), context);
        return this;
    }

    ElasticSanImpl(String name, com.azure.resourcemanager.elasticsan.ElasticSanManager serviceManager) {
        this.innerObject = new ElasticSanInner();
        this.serviceManager = serviceManager;
        this.elasticSanName = name;
    }

    public ElasticSanImpl update() {
        this.updateParameters = new ElasticSanUpdate();
        return this;
    }

    public ElasticSan apply() {
        this.innerObject = serviceManager.serviceClient().getElasticSans().update(resourceGroupName, elasticSanName,
            updateParameters, Context.NONE);
        return this;
    }

    public ElasticSan apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getElasticSans().update(resourceGroupName, elasticSanName,
            updateParameters, context);
        return this;
    }

    ElasticSanImpl(ElasticSanInner innerObject, com.azure.resourcemanager.elasticsan.ElasticSanManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.elasticSanName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "elasticSans");
    }

    public ElasticSan refresh() {
        this.innerObject = serviceManager.serviceClient().getElasticSans()
            .getByResourceGroupWithResponse(resourceGroupName, elasticSanName, Context.NONE).getValue();
        return this;
    }

    public ElasticSan refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getElasticSans()
            .getByResourceGroupWithResponse(resourceGroupName, elasticSanName, context).getValue();
        return this;
    }

    public ElasticSanImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ElasticSanImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ElasticSanImpl withSku(Sku sku) {
        this.innerModel().withSku(sku);
        return this;
    }

    public ElasticSanImpl withBaseSizeTiB(long baseSizeTiB) {
        this.innerModel().withBaseSizeTiB(baseSizeTiB);
        return this;
    }

    public ElasticSanImpl withExtendedCapacitySizeTiB(long extendedCapacitySizeTiB) {
        this.innerModel().withExtendedCapacitySizeTiB(extendedCapacitySizeTiB);
        return this;
    }

    public ElasticSanImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public ElasticSanImpl withAvailabilityZones(List<String> availabilityZones) {
        this.innerModel().withAvailabilityZones(availabilityZones);
        return this;
    }

    public ElasticSanImpl withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (isInCreateMode()) {
            this.innerModel().withPublicNetworkAccess(publicNetworkAccess);
            return this;
        } else {
            this.updateParameters.withPublicNetworkAccess(publicNetworkAccess);
            return this;
        }
    }

    public ElasticSanImpl withBaseSizeTiB(Long baseSizeTiB) {
        this.updateParameters.withBaseSizeTiB(baseSizeTiB);
        return this;
    }

    public ElasticSanImpl withExtendedCapacitySizeTiB(Long extendedCapacitySizeTiB) {
        this.updateParameters.withExtendedCapacitySizeTiB(extendedCapacitySizeTiB);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
