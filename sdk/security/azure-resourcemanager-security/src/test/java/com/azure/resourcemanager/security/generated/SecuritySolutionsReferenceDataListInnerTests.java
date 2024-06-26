// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.SecuritySolutionsReferenceDataListInner;
import com.azure.resourcemanager.security.models.SecurityFamily;
import com.azure.resourcemanager.security.models.SecuritySolutionsReferenceData;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SecuritySolutionsReferenceDataListInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SecuritySolutionsReferenceDataListInner model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"securityFamily\":\"Ngfw\",\"alertVendorName\":\"wgofmhx\",\"packageInfoUrl\":\"rjlvzklkvbgi\",\"productName\":\"yjtkakvlb\",\"publisher\":\"shjvpzaptuoskaoi\",\"publisherDisplayName\":\"jixwfgc\",\"template\":\"i\"},\"location\":\"kcxwnujvqynvavi\",\"id\":\"mdmuqoh\",\"name\":\"ihraxqudd\",\"type\":\"wjc\"}]}")
            .toObject(SecuritySolutionsReferenceDataListInner.class);
        Assertions.assertEquals(SecurityFamily.NGFW, model.value().get(0).securityFamily());
        Assertions.assertEquals("wgofmhx", model.value().get(0).alertVendorName());
        Assertions.assertEquals("rjlvzklkvbgi", model.value().get(0).packageInfoUrl());
        Assertions.assertEquals("yjtkakvlb", model.value().get(0).productName());
        Assertions.assertEquals("shjvpzaptuoskaoi", model.value().get(0).publisher());
        Assertions.assertEquals("jixwfgc", model.value().get(0).publisherDisplayName());
        Assertions.assertEquals("i", model.value().get(0).template());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SecuritySolutionsReferenceDataListInner model = new SecuritySolutionsReferenceDataListInner()
            .withValue(Arrays.asList(new SecuritySolutionsReferenceData().withSecurityFamily(SecurityFamily.NGFW)
                .withAlertVendorName("wgofmhx").withPackageInfoUrl("rjlvzklkvbgi").withProductName("yjtkakvlb")
                .withPublisher("shjvpzaptuoskaoi").withPublisherDisplayName("jixwfgc").withTemplate("i")));
        model = BinaryData.fromObject(model).toObject(SecuritySolutionsReferenceDataListInner.class);
        Assertions.assertEquals(SecurityFamily.NGFW, model.value().get(0).securityFamily());
        Assertions.assertEquals("wgofmhx", model.value().get(0).alertVendorName());
        Assertions.assertEquals("rjlvzklkvbgi", model.value().get(0).packageInfoUrl());
        Assertions.assertEquals("yjtkakvlb", model.value().get(0).productName());
        Assertions.assertEquals("shjvpzaptuoskaoi", model.value().get(0).publisher());
        Assertions.assertEquals("jixwfgc", model.value().get(0).publisherDisplayName());
        Assertions.assertEquals("i", model.value().get(0).template());
    }
}
