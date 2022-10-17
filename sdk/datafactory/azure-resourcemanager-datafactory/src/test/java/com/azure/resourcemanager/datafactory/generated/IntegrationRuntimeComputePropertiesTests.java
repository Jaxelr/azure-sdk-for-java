// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DataFlowComputeType;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeComputeProperties;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeDataFlowProperties;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeVNetProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class IntegrationRuntimeComputePropertiesTests {
    @Test
    public void testDeserialize() {
        IntegrationRuntimeComputeProperties model =
            BinaryData
                .fromString(
                    "{\"location\":\"xxahmrnadzyqegxy\",\"nodeSize\":\"pinbmhwbjijkgqxn\",\"numberOfNodes\":1269742784,\"maxParallelExecutionsPerNode\":2095777913,\"dataFlowProperties\":{\"computeType\":\"General\",\"coreCount\":379901265,\"timeToLive\":1089331926,\"cleanup\":false,\"\":{}},\"vNetProperties\":{\"vNetId\":\"iycwkdta\",\"subnet\":\"xw\",\"publicIPs\":[\"aumrrqmbzmqkrat\"],\"subnetId\":\"xwbjs\",\"\":{}},\"\":{}}")
                .toObject(IntegrationRuntimeComputeProperties.class);
        Assertions.assertEquals("xxahmrnadzyqegxy", model.location());
        Assertions.assertEquals("pinbmhwbjijkgqxn", model.nodeSize());
        Assertions.assertEquals(1269742784, model.numberOfNodes());
        Assertions.assertEquals(2095777913, model.maxParallelExecutionsPerNode());
        Assertions.assertEquals(DataFlowComputeType.GENERAL, model.dataFlowProperties().computeType());
        Assertions.assertEquals(379901265, model.dataFlowProperties().coreCount());
        Assertions.assertEquals(1089331926, model.dataFlowProperties().timeToLive());
        Assertions.assertEquals(false, model.dataFlowProperties().cleanup());
        Assertions.assertEquals("iycwkdta", model.vNetProperties().vNetId());
        Assertions.assertEquals("xw", model.vNetProperties().subnet());
        Assertions.assertEquals("aumrrqmbzmqkrat", model.vNetProperties().publicIPs().get(0));
        Assertions.assertEquals("xwbjs", model.vNetProperties().subnetId());
    }

    @Test
    public void testSerialize() {
        IntegrationRuntimeComputeProperties model =
            new IntegrationRuntimeComputeProperties()
                .withLocation("xxahmrnadzyqegxy")
                .withNodeSize("pinbmhwbjijkgqxn")
                .withNumberOfNodes(1269742784)
                .withMaxParallelExecutionsPerNode(2095777913)
                .withDataFlowProperties(
                    new IntegrationRuntimeDataFlowProperties()
                        .withComputeType(DataFlowComputeType.GENERAL)
                        .withCoreCount(379901265)
                        .withTimeToLive(1089331926)
                        .withCleanup(false)
                        .withAdditionalProperties(mapOf()))
                .withVNetProperties(
                    new IntegrationRuntimeVNetProperties()
                        .withVNetId("iycwkdta")
                        .withSubnet("xw")
                        .withPublicIPs(Arrays.asList("aumrrqmbzmqkrat"))
                        .withSubnetId("xwbjs")
                        .withAdditionalProperties(mapOf()))
                .withAdditionalProperties(mapOf());
        model = BinaryData.fromObject(model).toObject(IntegrationRuntimeComputeProperties.class);
        Assertions.assertEquals("xxahmrnadzyqegxy", model.location());
        Assertions.assertEquals("pinbmhwbjijkgqxn", model.nodeSize());
        Assertions.assertEquals(1269742784, model.numberOfNodes());
        Assertions.assertEquals(2095777913, model.maxParallelExecutionsPerNode());
        Assertions.assertEquals(DataFlowComputeType.GENERAL, model.dataFlowProperties().computeType());
        Assertions.assertEquals(379901265, model.dataFlowProperties().coreCount());
        Assertions.assertEquals(1089331926, model.dataFlowProperties().timeToLive());
        Assertions.assertEquals(false, model.dataFlowProperties().cleanup());
        Assertions.assertEquals("iycwkdta", model.vNetProperties().vNetId());
        Assertions.assertEquals("xw", model.vNetProperties().subnet());
        Assertions.assertEquals("aumrrqmbzmqkrat", model.vNetProperties().publicIPs().get(0));
        Assertions.assertEquals("xwbjs", model.vNetProperties().subnetId());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}