// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.storagemover {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.storagemover;
    exports com.azure.resourcemanager.storagemover.fluent;
    exports com.azure.resourcemanager.storagemover.fluent.models;
    exports com.azure.resourcemanager.storagemover.models;

    opens com.azure.resourcemanager.storagemover.fluent.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.storagemover.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
}
