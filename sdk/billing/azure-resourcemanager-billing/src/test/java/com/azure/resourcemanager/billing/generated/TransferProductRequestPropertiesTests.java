// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billing.models.TransferProductRequestProperties;
import org.junit.jupiter.api.Assertions;

public final class TransferProductRequestPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TransferProductRequestProperties model =
            BinaryData
                .fromString("{\"destinationInvoiceSectionId\":\"rfdwoyu\"}")
                .toObject(TransferProductRequestProperties.class);
        Assertions.assertEquals("rfdwoyu", model.destinationInvoiceSectionId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TransferProductRequestProperties model =
            new TransferProductRequestProperties().withDestinationInvoiceSectionId("rfdwoyu");
        model = BinaryData.fromObject(model).toObject(TransferProductRequestProperties.class);
        Assertions.assertEquals("rfdwoyu", model.destinationInvoiceSectionId());
    }
}