// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ConnectionStateProperties;
import com.azure.resourcemanager.datafactory.models.ManagedPrivateEndpoint;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ManagedPrivateEndpointTests {
    @Test
    public void testDeserialize() {
        ManagedPrivateEndpoint model =
            BinaryData
                .fromString(
                    "{\"connectionState\":{\"actionsRequired\":\"nepttwqmsni\",\"description\":\"cdm\",\"status\":\"r\"},\"fqdns\":[\"pij\",\"k\",\"xfrdd\"],\"groupId\":\"ratiz\",\"isReserved\":true,\"privateLinkResourceId\":\"asxifto\",\"provisioningState\":\"yzhftwesgogczh\",\"\":{}}")
                .toObject(ManagedPrivateEndpoint.class);
        Assertions.assertEquals("pij", model.fqdns().get(0));
        Assertions.assertEquals("ratiz", model.groupId());
        Assertions.assertEquals("asxifto", model.privateLinkResourceId());
    }

    @Test
    public void testSerialize() {
        ManagedPrivateEndpoint model =
            new ManagedPrivateEndpoint()
                .withConnectionState(new ConnectionStateProperties())
                .withFqdns(Arrays.asList("pij", "k", "xfrdd"))
                .withGroupId("ratiz")
                .withPrivateLinkResourceId("asxifto")
                .withAdditionalProperties(mapOf("isReserved", true, "provisioningState", "yzhftwesgogczh"));
        model = BinaryData.fromObject(model).toObject(ManagedPrivateEndpoint.class);
        Assertions.assertEquals("pij", model.fqdns().get(0));
        Assertions.assertEquals("ratiz", model.groupId());
        Assertions.assertEquals("asxifto", model.privateLinkResourceId());
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