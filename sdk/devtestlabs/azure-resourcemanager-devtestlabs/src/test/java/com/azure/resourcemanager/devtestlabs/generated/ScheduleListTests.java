// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.fluent.models.ScheduleInner;
import com.azure.resourcemanager.devtestlabs.models.EnableStatus;
import com.azure.resourcemanager.devtestlabs.models.ScheduleList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ScheduleListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScheduleList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"status\":\"Disabled\",\"taskType\":\"vhkhixu\",\"timeZoneId\":\"pbobjo\",\"createdDate\":\"2021-03-07T19:37:36Z\",\"targetResourceId\":\"u\",\"provisioningState\":\"a\",\"uniqueIdentifier\":\"rzayv\"},\"location\":\"t\",\"tags\":{\"ftutqxlngxlefgu\":\"dfgiot\",\"qmi\":\"nxkrx\"},\"id\":\"tthzrvqd\",\"name\":\"abhjybi\",\"type\":\"ehoqfbowskan\"},{\"properties\":{\"status\":\"Disabled\",\"taskType\":\"lcuiywgqywgndr\",\"timeZoneId\":\"gpphrcgyn\",\"createdDate\":\"2021-10-26T02:35:50Z\",\"targetResourceId\":\"cfvmmco\",\"provisioningState\":\"sxlzevgbmqj\",\"uniqueIdentifier\":\"bcypmi\"},\"location\":\"kwlzuvccfwnfn\",\"tags\":{\"bxetqgtzxdpn\":\"fionl\",\"eallnwsubisnj\":\"bqqwxrj\"},\"id\":\"mpmngnzscxaqwoo\",\"name\":\"hcbonqvpkvlr\",\"type\":\"njeaseipheofloke\"}],\"nextLink\":\"ienjbdlwtgr\"}")
                .toObject(ScheduleList.class);
        Assertions.assertEquals("t", model.value().get(0).location());
        Assertions.assertEquals("dfgiot", model.value().get(0).tags().get("ftutqxlngxlefgu"));
        Assertions.assertEquals(EnableStatus.DISABLED, model.value().get(0).status());
        Assertions.assertEquals("vhkhixu", model.value().get(0).taskType());
        Assertions.assertEquals("pbobjo", model.value().get(0).timeZoneId());
        Assertions.assertEquals("u", model.value().get(0).targetResourceId());
        Assertions.assertEquals("ienjbdlwtgr", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScheduleList model =
            new ScheduleList()
                .withValue(
                    Arrays
                        .asList(
                            new ScheduleInner()
                                .withLocation("t")
                                .withTags(mapOf("ftutqxlngxlefgu", "dfgiot", "qmi", "nxkrx"))
                                .withStatus(EnableStatus.DISABLED)
                                .withTaskType("vhkhixu")
                                .withTimeZoneId("pbobjo")
                                .withTargetResourceId("u"),
                            new ScheduleInner()
                                .withLocation("kwlzuvccfwnfn")
                                .withTags(mapOf("bxetqgtzxdpn", "fionl", "eallnwsubisnj", "bqqwxrj"))
                                .withStatus(EnableStatus.DISABLED)
                                .withTaskType("lcuiywgqywgndr")
                                .withTimeZoneId("gpphrcgyn")
                                .withTargetResourceId("cfvmmco")))
                .withNextLink("ienjbdlwtgr");
        model = BinaryData.fromObject(model).toObject(ScheduleList.class);
        Assertions.assertEquals("t", model.value().get(0).location());
        Assertions.assertEquals("dfgiot", model.value().get(0).tags().get("ftutqxlngxlefgu"));
        Assertions.assertEquals(EnableStatus.DISABLED, model.value().get(0).status());
        Assertions.assertEquals("vhkhixu", model.value().get(0).taskType());
        Assertions.assertEquals("pbobjo", model.value().get(0).timeZoneId());
        Assertions.assertEquals("u", model.value().get(0).targetResourceId());
        Assertions.assertEquals("ienjbdlwtgr", model.nextLink());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}