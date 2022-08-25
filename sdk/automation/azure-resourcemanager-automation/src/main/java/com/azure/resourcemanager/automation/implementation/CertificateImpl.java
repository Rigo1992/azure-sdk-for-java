// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.automation.fluent.models.CertificateInner;
import com.azure.resourcemanager.automation.models.Certificate;
import com.azure.resourcemanager.automation.models.CertificateCreateOrUpdateParameters;
import com.azure.resourcemanager.automation.models.CertificateUpdateParameters;
import java.time.OffsetDateTime;

public final class CertificateImpl implements Certificate, Certificate.Definition, Certificate.Update {
    private CertificateInner innerObject;

    private final com.azure.resourcemanager.automation.AutomationManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String thumbprint() {
        return this.innerModel().thumbprint();
    }

    public OffsetDateTime expiryTime() {
        return this.innerModel().expiryTime();
    }

    public Boolean isExportable() {
        return this.innerModel().isExportable();
    }

    public OffsetDateTime creationTime() {
        return this.innerModel().creationTime();
    }

    public OffsetDateTime lastModifiedTime() {
        return this.innerModel().lastModifiedTime();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public CertificateInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.automation.AutomationManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String automationAccountName;

    private String certificateName;

    private CertificateCreateOrUpdateParameters createParameters;

    private CertificateUpdateParameters updateParameters;

    public CertificateImpl withExistingAutomationAccount(String resourceGroupName, String automationAccountName) {
        this.resourceGroupName = resourceGroupName;
        this.automationAccountName = automationAccountName;
        return this;
    }

    public Certificate create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCertificates()
                .createOrUpdateWithResponse(
                    resourceGroupName, automationAccountName, certificateName, createParameters, Context.NONE)
                .getValue();
        return this;
    }

    public Certificate create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCertificates()
                .createOrUpdateWithResponse(
                    resourceGroupName, automationAccountName, certificateName, createParameters, context)
                .getValue();
        return this;
    }

    CertificateImpl(String name, com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerObject = new CertificateInner();
        this.serviceManager = serviceManager;
        this.certificateName = name;
        this.createParameters = new CertificateCreateOrUpdateParameters();
    }

    public CertificateImpl update() {
        this.updateParameters = new CertificateUpdateParameters();
        return this;
    }

    public Certificate apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCertificates()
                .updateWithResponse(
                    resourceGroupName, automationAccountName, certificateName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public Certificate apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCertificates()
                .updateWithResponse(
                    resourceGroupName, automationAccountName, certificateName, updateParameters, context)
                .getValue();
        return this;
    }

    CertificateImpl(
        CertificateInner innerObject, com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.automationAccountName = Utils.getValueFromIdByName(innerObject.id(), "automationAccounts");
        this.certificateName = Utils.getValueFromIdByName(innerObject.id(), "certificates");
    }

    public Certificate refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCertificates()
                .getWithResponse(resourceGroupName, automationAccountName, certificateName, Context.NONE)
                .getValue();
        return this;
    }

    public Certificate refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCertificates()
                .getWithResponse(resourceGroupName, automationAccountName, certificateName, context)
                .getValue();
        return this;
    }

    public CertificateImpl withName(String name) {
        if (isInCreateMode()) {
            this.createParameters.withName(name);
            return this;
        } else {
            this.updateParameters.withName(name);
            return this;
        }
    }

    public CertificateImpl withBase64Value(String base64Value) {
        this.createParameters.withBase64Value(base64Value);
        return this;
    }

    public CertificateImpl withDescription(String description) {
        if (isInCreateMode()) {
            this.createParameters.withDescription(description);
            return this;
        } else {
            this.updateParameters.withDescription(description);
            return this;
        }
    }

    public CertificateImpl withThumbprint(String thumbprint) {
        this.createParameters.withThumbprint(thumbprint);
        return this;
    }

    public CertificateImpl withIsExportable(Boolean isExportable) {
        this.createParameters.withIsExportable(isExportable);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
