// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureDatabricksDeltaLakeImportCommand;
import org.junit.jupiter.api.Test;

public final class AzureDatabricksDeltaLakeImportCommandTests {
    @Test
    public void testDeserialize() {
        AzureDatabricksDeltaLakeImportCommand model =
            BinaryData
                .fromString("{\"type\":\"AzureDatabricksDeltaLakeImportCommand\",\"\":{}}")
                .toObject(AzureDatabricksDeltaLakeImportCommand.class);
    }

    @Test
    public void testSerialize() {
        AzureDatabricksDeltaLakeImportCommand model = new AzureDatabricksDeltaLakeImportCommand();
        model = BinaryData.fromObject(model).toObject(AzureDatabricksDeltaLakeImportCommand.class);
    }
}