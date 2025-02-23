// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.quantum {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.quantum;
    exports com.azure.resourcemanager.quantum.fluent;
    exports com.azure.resourcemanager.quantum.fluent.models;
    exports com.azure.resourcemanager.quantum.models;

    opens com.azure.resourcemanager.quantum.fluent.models to com.azure.core;
    opens com.azure.resourcemanager.quantum.models to com.azure.core;
}
