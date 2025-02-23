// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.loganalytics.models.LogAnalyticsQueryPackQueryPropertiesRelated;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class LogAnalyticsQueryPackQueryPropertiesRelatedTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LogAnalyticsQueryPackQueryPropertiesRelated model = BinaryData.fromString(
            "{\"categories\":[\"tthzrvqd\"],\"resourceTypes\":[\"hjybigehoqfbo\"],\"solutions\":[\"anyktzlcuiywg\",\"ywgndrv\",\"nhzgpphrcgyn\",\"ocpecfvmmco\"]}")
            .toObject(LogAnalyticsQueryPackQueryPropertiesRelated.class);
        Assertions.assertEquals("tthzrvqd", model.categories().get(0));
        Assertions.assertEquals("hjybigehoqfbo", model.resourceTypes().get(0));
        Assertions.assertEquals("anyktzlcuiywg", model.solutions().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LogAnalyticsQueryPackQueryPropertiesRelated model
            = new LogAnalyticsQueryPackQueryPropertiesRelated().withCategories(Arrays.asList("tthzrvqd"))
                .withResourceTypes(Arrays.asList("hjybigehoqfbo"))
                .withSolutions(Arrays.asList("anyktzlcuiywg", "ywgndrv", "nhzgpphrcgyn", "ocpecfvmmco"));
        model = BinaryData.fromObject(model).toObject(LogAnalyticsQueryPackQueryPropertiesRelated.class);
        Assertions.assertEquals("tthzrvqd", model.categories().get(0));
        Assertions.assertEquals("hjybigehoqfbo", model.resourceTypes().get(0));
        Assertions.assertEquals("anyktzlcuiywg", model.solutions().get(0));
    }
}
