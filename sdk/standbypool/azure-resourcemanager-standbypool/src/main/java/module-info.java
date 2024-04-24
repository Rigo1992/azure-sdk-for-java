// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

module com.azure.resourcemanager.standbypool {
    requires transitive com.azure.core.management;
    exports com.azure.resourcemanager.standbypool;
    exports com.azure.resourcemanager.standbypool.fluent;
    exports com.azure.resourcemanager.standbypool.fluent.models;
    exports com.azure.resourcemanager.standbypool.models;
    opens com.azure.resourcemanager.standbypool.fluent.models to com.azure.core, com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.standbypool.models to com.azure.core, com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.standbypool.implementation.models to com.azure.core, com.fasterxml.jackson.databind;
}