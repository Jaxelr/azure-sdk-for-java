// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dnsresolver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dnsresolver.models.TargetDnsServer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class TargetDnsServerTests {
    @Test
    public void testDeserialize() {
        TargetDnsServer model =
            BinaryData
                .fromString("{\"ipAddress\":\"lbjnpgacftadehx\",\"port\":1194387790}")
                .toObject(TargetDnsServer.class);
        Assertions.assertEquals("lbjnpgacftadehx", model.ipAddress());
        Assertions.assertEquals(1194387790, model.port());
    }

    @Test
    public void testSerialize() {
        TargetDnsServer model = new TargetDnsServer().withIpAddress("lbjnpgacftadehx").withPort(1194387790);
        model = BinaryData.fromObject(model).toObject(TargetDnsServer.class);
        Assertions.assertEquals("lbjnpgacftadehx", model.ipAddress());
        Assertions.assertEquals(1194387790, model.port());
    }
}
