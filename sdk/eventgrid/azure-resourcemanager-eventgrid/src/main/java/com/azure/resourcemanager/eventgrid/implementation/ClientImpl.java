// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventgrid.fluent.models.ClientInner;
import com.azure.resourcemanager.eventgrid.models.Client;
import com.azure.resourcemanager.eventgrid.models.ClientCertificateAuthentication;
import com.azure.resourcemanager.eventgrid.models.ClientProvisioningState;
import com.azure.resourcemanager.eventgrid.models.ClientState;
import java.util.Collections;
import java.util.Map;

public final class ClientImpl implements Client, Client.Definition, Client.Update {
    private ClientInner innerObject;

    private final com.azure.resourcemanager.eventgrid.EventGridManager serviceManager;

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

    public String authenticationName() {
        return this.innerModel().authenticationName();
    }

    public ClientCertificateAuthentication clientCertificateAuthentication() {
        return this.innerModel().clientCertificateAuthentication();
    }

    public ClientState state() {
        return this.innerModel().state();
    }

    public Map<String, Object> attributes() {
        Map<String, Object> inner = this.innerModel().attributes();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ClientProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public ClientInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.eventgrid.EventGridManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String namespaceName;

    private String clientName;

    public ClientImpl withExistingNamespace(String resourceGroupName, String namespaceName) {
        this.resourceGroupName = resourceGroupName;
        this.namespaceName = namespaceName;
        return this;
    }

    public Client create() {
        this.innerObject = serviceManager.serviceClient().getClients().createOrUpdate(resourceGroupName, namespaceName,
            clientName, this.innerModel(), Context.NONE);
        return this;
    }

    public Client create(Context context) {
        this.innerObject = serviceManager.serviceClient().getClients().createOrUpdate(resourceGroupName, namespaceName,
            clientName, this.innerModel(), context);
        return this;
    }

    ClientImpl(String name, com.azure.resourcemanager.eventgrid.EventGridManager serviceManager) {
        this.innerObject = new ClientInner();
        this.serviceManager = serviceManager;
        this.clientName = name;
    }

    public ClientImpl update() {
        return this;
    }

    public Client apply() {
        this.innerObject = serviceManager.serviceClient().getClients().createOrUpdate(resourceGroupName, namespaceName,
            clientName, this.innerModel(), Context.NONE);
        return this;
    }

    public Client apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getClients().createOrUpdate(resourceGroupName, namespaceName,
            clientName, this.innerModel(), context);
        return this;
    }

    ClientImpl(ClientInner innerObject, com.azure.resourcemanager.eventgrid.EventGridManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.namespaceName = Utils.getValueFromIdByName(innerObject.id(), "namespaces");
        this.clientName = Utils.getValueFromIdByName(innerObject.id(), "clients");
    }

    public Client refresh() {
        this.innerObject = serviceManager.serviceClient().getClients()
            .getWithResponse(resourceGroupName, namespaceName, clientName, Context.NONE).getValue();
        return this;
    }

    public Client refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getClients()
            .getWithResponse(resourceGroupName, namespaceName, clientName, context).getValue();
        return this;
    }

    public ClientImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public ClientImpl withAuthenticationName(String authenticationName) {
        this.innerModel().withAuthenticationName(authenticationName);
        return this;
    }

    public ClientImpl
        withClientCertificateAuthentication(ClientCertificateAuthentication clientCertificateAuthentication) {
        this.innerModel().withClientCertificateAuthentication(clientCertificateAuthentication);
        return this;
    }

    public ClientImpl withState(ClientState state) {
        this.innerModel().withState(state);
        return this;
    }

    public ClientImpl withAttributes(Map<String, Object> attributes) {
        this.innerModel().withAttributes(attributes);
        return this;
    }
}
