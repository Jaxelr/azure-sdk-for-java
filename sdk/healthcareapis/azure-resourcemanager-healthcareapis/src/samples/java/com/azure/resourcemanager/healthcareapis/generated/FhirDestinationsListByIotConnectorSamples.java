// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.generated;

/**
 * Samples for FhirDestinations ListByIotConnector.
 */
public final class FhirDestinationsListByIotConnectorSamples {
    /*
     * x-ms-original-file:
     * specification/healthcareapis/resource-manager/Microsoft.HealthcareApis/stable/2024-03-31/examples/iotconnectors/
     * iotconnector_fhirdestination_List.json
     */
    /**
     * Sample code: List IoT Connectors.
     * 
     * @param manager Entry point to HealthcareApisManager.
     */
    public static void listIoTConnectors(com.azure.resourcemanager.healthcareapis.HealthcareApisManager manager) {
        manager.fhirDestinations().listByIotConnector("testRG", "workspace1", "blue", com.azure.core.util.Context.NONE);
    }
}
