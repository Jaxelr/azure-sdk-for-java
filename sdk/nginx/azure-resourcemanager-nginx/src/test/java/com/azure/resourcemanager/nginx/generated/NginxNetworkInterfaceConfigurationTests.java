// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.nginx.models.NginxNetworkInterfaceConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class NginxNetworkInterfaceConfigurationTests {
    @Test
    public void testDeserialize() {
        NginxNetworkInterfaceConfiguration model =
            BinaryData.fromString("{\"subnetId\":\"dj\"}").toObject(NginxNetworkInterfaceConfiguration.class);
        Assertions.assertEquals("dj", model.subnetId());
    }

    @Test
    public void testSerialize() {
        NginxNetworkInterfaceConfiguration model = new NginxNetworkInterfaceConfiguration().withSubnetId("dj");
        model = BinaryData.fromObject(model).toObject(NginxNetworkInterfaceConfiguration.class);
        Assertions.assertEquals("dj", model.subnetId());
    }
}