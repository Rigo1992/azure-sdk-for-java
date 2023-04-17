// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.health.insights.cancerprofiling {
    requires transitive com.azure.core;

    exports com.azure.health.insights.cancerprofiling;
    exports com.azure.health.insights.cancerprofiling.models;

    opens com.azure.health.insights.cancerprofiling.models to
            com.azure.core,
            com.fasterxml.jackson.databind;
}
