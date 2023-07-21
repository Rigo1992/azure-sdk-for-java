// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sphere.fluent.models.ImageInner;
import com.azure.resourcemanager.sphere.models.Image;
import com.azure.resourcemanager.sphere.models.ImageType;
import com.azure.resourcemanager.sphere.models.ProvisioningState;
import com.azure.resourcemanager.sphere.models.RegionalDataBoundary;

public final class ImageImpl implements Image, Image.Definition, Image.Update {
    private ImageInner innerObject;

    private final com.azure.resourcemanager.sphere.AzureSphereManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String image() {
        return this.innerModel().image();
    }

    public String imageId() {
        return this.innerModel().imageId();
    }

    public String imageName() {
        return this.innerModel().imageName();
    }

    public RegionalDataBoundary regionalDataBoundary() {
        return this.innerModel().regionalDataBoundary();
    }

    public String uri() {
        return this.innerModel().uri();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String componentId() {
        return this.innerModel().componentId();
    }

    public ImageType imageType() {
        return this.innerModel().imageType();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public ImageInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.sphere.AzureSphereManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String catalogName;

    private String imageName;

    public ImageImpl withExistingCatalog(String resourceGroupName, String catalogName) {
        this.resourceGroupName = resourceGroupName;
        this.catalogName = catalogName;
        return this;
    }

    public Image create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getImages()
                .createOrUpdate(resourceGroupName, catalogName, imageName, this.innerModel(), Context.NONE);
        return this;
    }

    public Image create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getImages()
                .createOrUpdate(resourceGroupName, catalogName, imageName, this.innerModel(), context);
        return this;
    }

    ImageImpl(String name, com.azure.resourcemanager.sphere.AzureSphereManager serviceManager) {
        this.innerObject = new ImageInner();
        this.serviceManager = serviceManager;
        this.imageName = name;
    }

    public ImageImpl update() {
        return this;
    }

    public Image apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getImages()
                .createOrUpdate(resourceGroupName, catalogName, imageName, this.innerModel(), Context.NONE);
        return this;
    }

    public Image apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getImages()
                .createOrUpdate(resourceGroupName, catalogName, imageName, this.innerModel(), context);
        return this;
    }

    ImageImpl(ImageInner innerObject, com.azure.resourcemanager.sphere.AzureSphereManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.catalogName = Utils.getValueFromIdByName(innerObject.id(), "catalogs");
        this.imageName = Utils.getValueFromIdByName(innerObject.id(), "images");
    }

    public Image refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getImages()
                .getWithResponse(resourceGroupName, catalogName, imageName, Context.NONE)
                .getValue();
        return this;
    }

    public Image refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getImages()
                .getWithResponse(resourceGroupName, catalogName, imageName, context)
                .getValue();
        return this;
    }

    public ImageImpl withImage(String image) {
        this.innerModel().withImage(image);
        return this;
    }

    public ImageImpl withImageId(String imageId) {
        this.innerModel().withImageId(imageId);
        return this;
    }

    public ImageImpl withRegionalDataBoundary(RegionalDataBoundary regionalDataBoundary) {
        this.innerModel().withRegionalDataBoundary(regionalDataBoundary);
        return this;
    }
}