// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.InternetGatewayRuleInner;
import com.azure.resourcemanager.managednetworkfabric.models.InternetGatewayRule;
import com.azure.resourcemanager.managednetworkfabric.models.InternetGatewayRulePatch;
import com.azure.resourcemanager.managednetworkfabric.models.ProvisioningState;
import com.azure.resourcemanager.managednetworkfabric.models.RuleProperties;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class InternetGatewayRuleImpl
    implements InternetGatewayRule, InternetGatewayRule.Definition, InternetGatewayRule.Update {
    private InternetGatewayRuleInner innerObject;

    private final com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager;

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

    public RuleProperties ruleProperties() {
        return this.innerModel().ruleProperties();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public List<String> internetGatewayIds() {
        List<String> inner = this.innerModel().internetGatewayIds();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String annotation() {
        return this.innerModel().annotation();
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

    public InternetGatewayRuleInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String internetGatewayRuleName;

    private InternetGatewayRulePatch updateBody;

    public InternetGatewayRuleImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public InternetGatewayRule create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getInternetGatewayRules()
                .create(resourceGroupName, internetGatewayRuleName, this.innerModel(), Context.NONE);
        return this;
    }

    public InternetGatewayRule create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getInternetGatewayRules()
                .create(resourceGroupName, internetGatewayRuleName, this.innerModel(), context);
        return this;
    }

    InternetGatewayRuleImpl(
        String name, com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager) {
        this.innerObject = new InternetGatewayRuleInner();
        this.serviceManager = serviceManager;
        this.internetGatewayRuleName = name;
    }

    public InternetGatewayRuleImpl update() {
        this.updateBody = new InternetGatewayRulePatch();
        return this;
    }

    public InternetGatewayRule apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getInternetGatewayRules()
                .update(resourceGroupName, internetGatewayRuleName, updateBody, Context.NONE);
        return this;
    }

    public InternetGatewayRule apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getInternetGatewayRules()
                .update(resourceGroupName, internetGatewayRuleName, updateBody, context);
        return this;
    }

    InternetGatewayRuleImpl(
        InternetGatewayRuleInner innerObject,
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.internetGatewayRuleName = Utils.getValueFromIdByName(innerObject.id(), "internetGatewayRules");
    }

    public InternetGatewayRule refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getInternetGatewayRules()
                .getByResourceGroupWithResponse(resourceGroupName, internetGatewayRuleName, Context.NONE)
                .getValue();
        return this;
    }

    public InternetGatewayRule refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getInternetGatewayRules()
                .getByResourceGroupWithResponse(resourceGroupName, internetGatewayRuleName, context)
                .getValue();
        return this;
    }

    public InternetGatewayRuleImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public InternetGatewayRuleImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public InternetGatewayRuleImpl withRuleProperties(RuleProperties ruleProperties) {
        this.innerModel().withRuleProperties(ruleProperties);
        return this;
    }

    public InternetGatewayRuleImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateBody.withTags(tags);
            return this;
        }
    }

    public InternetGatewayRuleImpl withAnnotation(String annotation) {
        this.innerModel().withAnnotation(annotation);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}