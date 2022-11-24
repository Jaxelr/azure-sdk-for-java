// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cognitiveservices.fluent.models.CommitmentTierInner;
import com.azure.resourcemanager.cognitiveservices.models.CommitmentCost;
import com.azure.resourcemanager.cognitiveservices.models.CommitmentQuota;
import com.azure.resourcemanager.cognitiveservices.models.HostingModel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class CommitmentTierInnerTests {
    @Test
    public void testDeserialize() {
        CommitmentTierInner model =
            BinaryData
                .fromString(
                    "{\"kind\":\"seyvj\",\"skuName\":\"rts\",\"hostingModel\":\"DisconnectedContainer\",\"planType\":\"kdeemaofmxagkvtm\",\"tier\":\"mqkrhahvljuahaqu\",\"maxCount\":1423191748,\"quota\":{\"quantity\":4716171323603349027,\"unit\":\"laexqp\"},\"cost\":{\"commitmentMeterId\":\"dmwsrcrgvxpvgomz\",\"overageMeterId\":\"misgwbnb\"}}")
                .toObject(CommitmentTierInner.class);
        Assertions.assertEquals("seyvj", model.kind());
        Assertions.assertEquals("rts", model.skuName());
        Assertions.assertEquals(HostingModel.DISCONNECTED_CONTAINER, model.hostingModel());
        Assertions.assertEquals("kdeemaofmxagkvtm", model.planType());
        Assertions.assertEquals("mqkrhahvljuahaqu", model.tier());
        Assertions.assertEquals(1423191748, model.maxCount());
        Assertions.assertEquals(4716171323603349027L, model.quota().quantity());
        Assertions.assertEquals("laexqp", model.quota().unit());
        Assertions.assertEquals("dmwsrcrgvxpvgomz", model.cost().commitmentMeterId());
        Assertions.assertEquals("misgwbnb", model.cost().overageMeterId());
    }

    @Test
    public void testSerialize() {
        CommitmentTierInner model =
            new CommitmentTierInner()
                .withKind("seyvj")
                .withSkuName("rts")
                .withHostingModel(HostingModel.DISCONNECTED_CONTAINER)
                .withPlanType("kdeemaofmxagkvtm")
                .withTier("mqkrhahvljuahaqu")
                .withMaxCount(1423191748)
                .withQuota(new CommitmentQuota().withQuantity(4716171323603349027L).withUnit("laexqp"))
                .withCost(
                    new CommitmentCost().withCommitmentMeterId("dmwsrcrgvxpvgomz").withOverageMeterId("misgwbnb"));
        model = BinaryData.fromObject(model).toObject(CommitmentTierInner.class);
        Assertions.assertEquals("seyvj", model.kind());
        Assertions.assertEquals("rts", model.skuName());
        Assertions.assertEquals(HostingModel.DISCONNECTED_CONTAINER, model.hostingModel());
        Assertions.assertEquals("kdeemaofmxagkvtm", model.planType());
        Assertions.assertEquals("mqkrhahvljuahaqu", model.tier());
        Assertions.assertEquals(1423191748, model.maxCount());
        Assertions.assertEquals(4716171323603349027L, model.quota().quantity());
        Assertions.assertEquals("laexqp", model.quota().unit());
        Assertions.assertEquals("dmwsrcrgvxpvgomz", model.cost().commitmentMeterId());
        Assertions.assertEquals("misgwbnb", model.cost().overageMeterId());
    }
}