// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.peering.fluent.models.PeeringRegisteredAsnInner;
import com.azure.resourcemanager.peering.models.PeeringRegisteredAsn;
import com.azure.resourcemanager.peering.models.ProvisioningState;

public final class PeeringRegisteredAsnImpl
    implements PeeringRegisteredAsn, PeeringRegisteredAsn.Definition, PeeringRegisteredAsn.Update {
    private PeeringRegisteredAsnInner innerObject;

    private final com.azure.resourcemanager.peering.PeeringManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public Integer asn() {
        return this.innerModel().asn();
    }

    public String peeringServicePrefixKey() {
        return this.innerModel().peeringServicePrefixKey();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public PeeringRegisteredAsnInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.peering.PeeringManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String peeringName;

    private String registeredAsnName;

    public PeeringRegisteredAsnImpl withExistingPeering(String resourceGroupName, String peeringName) {
        this.resourceGroupName = resourceGroupName;
        this.peeringName = peeringName;
        return this;
    }

    public PeeringRegisteredAsn create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRegisteredAsns()
                .createOrUpdateWithResponse(
                    resourceGroupName, peeringName, registeredAsnName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public PeeringRegisteredAsn create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRegisteredAsns()
                .createOrUpdateWithResponse(
                    resourceGroupName, peeringName, registeredAsnName, this.innerModel(), context)
                .getValue();
        return this;
    }

    PeeringRegisteredAsnImpl(String name, com.azure.resourcemanager.peering.PeeringManager serviceManager) {
        this.innerObject = new PeeringRegisteredAsnInner();
        this.serviceManager = serviceManager;
        this.registeredAsnName = name;
    }

    public PeeringRegisteredAsnImpl update() {
        return this;
    }

    public PeeringRegisteredAsn apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRegisteredAsns()
                .createOrUpdateWithResponse(
                    resourceGroupName, peeringName, registeredAsnName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public PeeringRegisteredAsn apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRegisteredAsns()
                .createOrUpdateWithResponse(
                    resourceGroupName, peeringName, registeredAsnName, this.innerModel(), context)
                .getValue();
        return this;
    }

    PeeringRegisteredAsnImpl(
        PeeringRegisteredAsnInner innerObject, com.azure.resourcemanager.peering.PeeringManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.peeringName = Utils.getValueFromIdByName(innerObject.id(), "peerings");
        this.registeredAsnName = Utils.getValueFromIdByName(innerObject.id(), "registeredAsns");
    }

    public PeeringRegisteredAsn refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRegisteredAsns()
                .getWithResponse(resourceGroupName, peeringName, registeredAsnName, Context.NONE)
                .getValue();
        return this;
    }

    public PeeringRegisteredAsn refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRegisteredAsns()
                .getWithResponse(resourceGroupName, peeringName, registeredAsnName, context)
                .getValue();
        return this;
    }

    public PeeringRegisteredAsnImpl withAsn(Integer asn) {
        this.innerModel().withAsn(asn);
        return this;
    }
}
