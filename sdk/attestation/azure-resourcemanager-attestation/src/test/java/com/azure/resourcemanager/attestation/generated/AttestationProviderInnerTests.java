// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.attestation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.attestation.fluent.models.AttestationProviderInner;
import com.azure.resourcemanager.attestation.models.AttestationServiceStatus;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AttestationProviderInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AttestationProviderInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"trustModel\":\"siznto\",\"status\":\"Error\",\"attestUri\":\"ouajpsqucmpoyf\",\"privateEndpointConnections\":[{\"id\":\"gknygjofjddeqs\",\"name\":\"deupewnwrei\",\"type\":\"jzyflu\"},{\"id\":\"rh\",\"name\":\"ofcqhsm\",\"type\":\"urkdtmlx\"},{\"id\":\"kuksjtxukcdm\",\"name\":\"arcryuanzwuxzdxt\",\"type\":\"yrlhmwhfpmrqobm\"},{\"id\":\"kknryrtihf\",\"name\":\"tijbpzvgnwzsymgl\",\"type\":\"uf\"}]},\"location\":\"yzkohdbihanuf\",\"tags\":{\"s\":\"bj\"},\"id\":\"git\",\"name\":\"xqhabi\",\"type\":\"pikxwczbyscnpqxu\"}")
                .toObject(AttestationProviderInner.class);
        Assertions.assertEquals("yzkohdbihanuf", model.location());
        Assertions.assertEquals("bj", model.tags().get("s"));
        Assertions.assertEquals("siznto", model.trustModel());
        Assertions.assertEquals(AttestationServiceStatus.ERROR, model.status());
        Assertions.assertEquals("ouajpsqucmpoyf", model.attestUri());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AttestationProviderInner model =
            new AttestationProviderInner()
                .withLocation("yzkohdbihanuf")
                .withTags(mapOf("s", "bj"))
                .withTrustModel("siznto")
                .withStatus(AttestationServiceStatus.ERROR)
                .withAttestUri("ouajpsqucmpoyf");
        model = BinaryData.fromObject(model).toObject(AttestationProviderInner.class);
        Assertions.assertEquals("yzkohdbihanuf", model.location());
        Assertions.assertEquals("bj", model.tags().get("s"));
        Assertions.assertEquals("siznto", model.trustModel());
        Assertions.assertEquals(AttestationServiceStatus.ERROR, model.status());
        Assertions.assertEquals("ouajpsqucmpoyf", model.attestUri());
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