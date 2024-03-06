// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.networkanalytics {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.networkanalytics;
    exports com.azure.resourcemanager.networkanalytics.fluent;
    exports com.azure.resourcemanager.networkanalytics.fluent.models;
    exports com.azure.resourcemanager.networkanalytics.models;

    opens com.azure.resourcemanager.networkanalytics.fluent.models to com.azure.core, com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.networkanalytics.models to com.azure.core, com.fasterxml.jackson.databind;
}
