// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.FtpReadSettings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class FtpReadSettingsTests {
    @Test
    public void testDeserialize() {
        FtpReadSettings model =
            BinaryData
                .fromString(
                    "{\"type\":\"FtpReadSettings\",\"enablePartitionDiscovery\":true,\"useBinaryTransfer\":false,\"\":{}}")
                .toObject(FtpReadSettings.class);
        Assertions.assertEquals(true, model.enablePartitionDiscovery());
        Assertions.assertEquals(false, model.useBinaryTransfer());
    }

    @Test
    public void testSerialize() {
        FtpReadSettings model = new FtpReadSettings().withEnablePartitionDiscovery(true).withUseBinaryTransfer(false);
        model = BinaryData.fromObject(model).toObject(FtpReadSettings.class);
        Assertions.assertEquals(true, model.enablePartitionDiscovery());
        Assertions.assertEquals(false, model.useBinaryTransfer());
    }
}