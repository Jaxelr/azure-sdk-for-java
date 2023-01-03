// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.digitaltwins.models.CheckNameRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class CheckNameRequestTests {
    @Test
    public void testDeserialize() {
        CheckNameRequest model = BinaryData.fromString("{\"name\":\"t\"}").toObject(CheckNameRequest.class);
        Assertions.assertEquals("t", model.name());
    }

    @Test
    public void testSerialize() {
        CheckNameRequest model = new CheckNameRequest().withName("t");
        model = BinaryData.fromObject(model).toObject(CheckNameRequest.class);
        Assertions.assertEquals("t", model.name());
    }
}