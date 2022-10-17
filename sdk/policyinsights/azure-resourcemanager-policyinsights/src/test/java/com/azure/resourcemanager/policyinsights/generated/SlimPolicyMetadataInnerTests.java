// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.policyinsights.fluent.models.SlimPolicyMetadataInner;
import org.junit.jupiter.api.Test;

public final class SlimPolicyMetadataInnerTests {
    @Test
    public void testDeserialize() {
        SlimPolicyMetadataInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"metadataId\":\"pcdpumnz\",\"category\":\"wznm\",\"title\":\"iknsorgjh\",\"owner\":\"ldtlwwr\",\"additionalContentUrl\":\"dmtnc\"},\"id\":\"otllxdyhgsyo\",\"type\":\"gjltdtbnnhado\",\"name\":\"rkvcikhnvpa\"}")
                .toObject(SlimPolicyMetadataInner.class);
    }

    @Test
    public void testSerialize() {
        SlimPolicyMetadataInner model = new SlimPolicyMetadataInner();
        model = BinaryData.fromObject(model).toObject(SlimPolicyMetadataInner.class);
    }
}