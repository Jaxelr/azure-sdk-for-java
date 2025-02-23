// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.orbital.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.orbital.models.ContactParameters;
import com.azure.resourcemanager.orbital.models.ContactParametersContactProfile;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class ContactParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ContactParameters model = BinaryData.fromString(
            "{\"contactProfile\":{\"id\":\"prwzwbnguitnwui\"},\"groundStationName\":\"gazxuf\",\"startTime\":\"2020-12-27T04:43:40Z\",\"endTime\":\"2021-07-01T16:43:11Z\"}")
            .toObject(ContactParameters.class);
        Assertions.assertEquals("prwzwbnguitnwui", model.contactProfile().id());
        Assertions.assertEquals("gazxuf", model.groundStationName());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-27T04:43:40Z"), model.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-01T16:43:11Z"), model.endTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ContactParameters model = new ContactParameters()
            .withContactProfile(new ContactParametersContactProfile().withId("prwzwbnguitnwui"))
            .withGroundStationName("gazxuf")
            .withStartTime(OffsetDateTime.parse("2020-12-27T04:43:40Z"))
            .withEndTime(OffsetDateTime.parse("2021-07-01T16:43:11Z"));
        model = BinaryData.fromObject(model).toObject(ContactParameters.class);
        Assertions.assertEquals("prwzwbnguitnwui", model.contactProfile().id());
        Assertions.assertEquals("gazxuf", model.groundStationName());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-27T04:43:40Z"), model.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-01T16:43:11Z"), model.endTime());
    }
}
