// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.FqdnListLocalRulestackResourceInner;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.FqdnListLocalRulestackResource;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.ProvisioningState;
import java.util.Collections;
import java.util.List;

public final class FqdnListLocalRulestackResourceImpl implements FqdnListLocalRulestackResource,
    FqdnListLocalRulestackResource.Definition, FqdnListLocalRulestackResource.Update {
    private FqdnListLocalRulestackResourceInner innerObject;

    private final com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String description() {
        return this.innerModel().description();
    }

    public List<String> fqdnList() {
        List<String> inner = this.innerModel().fqdnList();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String auditComment() {
        return this.innerModel().auditComment();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public FqdnListLocalRulestackResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String localRulestackName;

    private String name;

    public FqdnListLocalRulestackResourceImpl withExistingLocalRulestack(String resourceGroupName,
        String localRulestackName) {
        this.resourceGroupName = resourceGroupName;
        this.localRulestackName = localRulestackName;
        return this;
    }

    public FqdnListLocalRulestackResource create() {
        this.innerObject = serviceManager.serviceClient().getFqdnListLocalRulestacks().createOrUpdate(resourceGroupName,
            localRulestackName, name, this.innerModel(), Context.NONE);
        return this;
    }

    public FqdnListLocalRulestackResource create(Context context) {
        this.innerObject = serviceManager.serviceClient().getFqdnListLocalRulestacks().createOrUpdate(resourceGroupName,
            localRulestackName, name, this.innerModel(), context);
        return this;
    }

    FqdnListLocalRulestackResourceImpl(String name,
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager serviceManager) {
        this.innerObject = new FqdnListLocalRulestackResourceInner();
        this.serviceManager = serviceManager;
        this.name = name;
    }

    public FqdnListLocalRulestackResourceImpl update() {
        return this;
    }

    public FqdnListLocalRulestackResource apply() {
        this.innerObject = serviceManager.serviceClient().getFqdnListLocalRulestacks().createOrUpdate(resourceGroupName,
            localRulestackName, name, this.innerModel(), Context.NONE);
        return this;
    }

    public FqdnListLocalRulestackResource apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getFqdnListLocalRulestacks().createOrUpdate(resourceGroupName,
            localRulestackName, name, this.innerModel(), context);
        return this;
    }

    FqdnListLocalRulestackResourceImpl(FqdnListLocalRulestackResourceInner innerObject,
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.localRulestackName = Utils.getValueFromIdByName(innerObject.id(), "localRulestacks");
        this.name = Utils.getValueFromIdByName(innerObject.id(), "fqdnlists");
    }

    public FqdnListLocalRulestackResource refresh() {
        this.innerObject = serviceManager.serviceClient().getFqdnListLocalRulestacks()
            .getWithResponse(resourceGroupName, localRulestackName, name, Context.NONE).getValue();
        return this;
    }

    public FqdnListLocalRulestackResource refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getFqdnListLocalRulestacks()
            .getWithResponse(resourceGroupName, localRulestackName, name, context).getValue();
        return this;
    }

    public FqdnListLocalRulestackResourceImpl withFqdnList(List<String> fqdnList) {
        this.innerModel().withFqdnList(fqdnList);
        return this;
    }

    public FqdnListLocalRulestackResourceImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public FqdnListLocalRulestackResourceImpl withEtag(String etag) {
        this.innerModel().withEtag(etag);
        return this;
    }

    public FqdnListLocalRulestackResourceImpl withAuditComment(String auditComment) {
        this.innerModel().withAuditComment(auditComment);
        return this;
    }
}
