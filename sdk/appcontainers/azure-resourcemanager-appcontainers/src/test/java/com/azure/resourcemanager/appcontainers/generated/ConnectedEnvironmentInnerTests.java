// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.fluent.models.ConnectedEnvironmentInner;
import com.azure.resourcemanager.appcontainers.models.CustomDomainConfiguration;
import com.azure.resourcemanager.appcontainers.models.ExtendedLocation;
import com.azure.resourcemanager.appcontainers.models.ExtendedLocationTypes;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ConnectedEnvironmentInnerTests {
    @Test
    public void testDeserialize() {
        ConnectedEnvironmentInner model =
            BinaryData
                .fromString(
                    "{\"extendedLocation\":{\"name\":\"ijaeukm\",\"type\":\"CustomLocation\"},\"properties\":{\"provisioningState\":\"Failed\",\"deploymentErrors\":\"ndzaapmudq\",\"defaultDomain\":\"qwigpibudqwyxe\",\"staticIp\":\"ybpmzznrtffyaq\",\"daprAIConnectionString\":\"mhh\",\"customDomainConfiguration\":{\"customDomainVerificationId\":\"qaqhvseufu\",\"dnsSuffix\":\"rxpdlcgqlsi\",\"expirationDate\":\"2021-05-24T18:35:38Z\",\"thumbprint\":\"ddgamquhiosr\",\"subjectName\":\"uivfcdis\"}},\"location\":\"rnxzh\",\"tags\":{\"qvwre\":\"xrxzbujrtr\",\"nzonzl\":\"khgn\",\"jtszcof\":\"piqywnc\",\"k\":\"zehtdhgb\"},\"id\":\"reljeamur\",\"name\":\"zmlovuanash\",\"type\":\"xlpm\"}")
                .toObject(ConnectedEnvironmentInner.class);
        Assertions.assertEquals("rnxzh", model.location());
        Assertions.assertEquals("xrxzbujrtr", model.tags().get("qvwre"));
        Assertions.assertEquals("ijaeukm", model.extendedLocation().name());
        Assertions.assertEquals(ExtendedLocationTypes.CUSTOM_LOCATION, model.extendedLocation().type());
        Assertions.assertEquals("ybpmzznrtffyaq", model.staticIp());
        Assertions.assertEquals("mhh", model.daprAIConnectionString());
        Assertions.assertEquals("rxpdlcgqlsi", model.customDomainConfiguration().dnsSuffix());
    }

    @Test
    public void testSerialize() {
        ConnectedEnvironmentInner model =
            new ConnectedEnvironmentInner()
                .withLocation("rnxzh")
                .withTags(mapOf("qvwre", "xrxzbujrtr", "nzonzl", "khgn", "jtszcof", "piqywnc", "k", "zehtdhgb"))
                .withExtendedLocation(
                    new ExtendedLocation().withName("ijaeukm").withType(ExtendedLocationTypes.CUSTOM_LOCATION))
                .withStaticIp("ybpmzznrtffyaq")
                .withDaprAIConnectionString("mhh")
                .withCustomDomainConfiguration(new CustomDomainConfiguration().withDnsSuffix("rxpdlcgqlsi"));
        model = BinaryData.fromObject(model).toObject(ConnectedEnvironmentInner.class);
        Assertions.assertEquals("rnxzh", model.location());
        Assertions.assertEquals("xrxzbujrtr", model.tags().get("qvwre"));
        Assertions.assertEquals("ijaeukm", model.extendedLocation().name());
        Assertions.assertEquals(ExtendedLocationTypes.CUSTOM_LOCATION, model.extendedLocation().type());
        Assertions.assertEquals("ybpmzznrtffyaq", model.staticIp());
        Assertions.assertEquals("mhh", model.daprAIConnectionString());
        Assertions.assertEquals("rxpdlcgqlsi", model.customDomainConfiguration().dnsSuffix());
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