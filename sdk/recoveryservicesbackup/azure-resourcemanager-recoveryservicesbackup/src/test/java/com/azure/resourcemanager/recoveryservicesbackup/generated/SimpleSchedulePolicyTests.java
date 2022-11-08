// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.DayOfWeek;
import com.azure.resourcemanager.recoveryservicesbackup.models.HourlySchedule;
import com.azure.resourcemanager.recoveryservicesbackup.models.ScheduleRunType;
import com.azure.resourcemanager.recoveryservicesbackup.models.SimpleSchedulePolicy;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SimpleSchedulePolicyTests {
    @Test
    public void testDeserialize() {
        SimpleSchedulePolicy model =
            BinaryData
                .fromString(
                    "{\"schedulePolicyType\":\"SimpleSchedulePolicy\",\"scheduleRunFrequency\":\"Weekly\",\"scheduleRunDays\":[\"Tuesday\",\"Tuesday\"],\"scheduleRunTimes\":[\"2021-06-25T01:17:09Z\",\"2021-11-22T17:29:03Z\",\"2021-07-27T15:44:21Z\",\"2021-09-20T20:46:09Z\"],\"hourlySchedule\":{\"interval\":963389591,\"scheduleWindowStartTime\":\"2021-03-21T04:45:07Z\",\"scheduleWindowDuration\":1700362881},\"scheduleWeeklyFrequency\":1766557067}")
                .toObject(SimpleSchedulePolicy.class);
        Assertions.assertEquals(ScheduleRunType.WEEKLY, model.scheduleRunFrequency());
        Assertions.assertEquals(DayOfWeek.TUESDAY, model.scheduleRunDays().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-25T01:17:09Z"), model.scheduleRunTimes().get(0));
        Assertions.assertEquals(963389591, model.hourlySchedule().interval());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-03-21T04:45:07Z"), model.hourlySchedule().scheduleWindowStartTime());
        Assertions.assertEquals(1700362881, model.hourlySchedule().scheduleWindowDuration());
        Assertions.assertEquals(1766557067, model.scheduleWeeklyFrequency());
    }

    @Test
    public void testSerialize() {
        SimpleSchedulePolicy model =
            new SimpleSchedulePolicy()
                .withScheduleRunFrequency(ScheduleRunType.WEEKLY)
                .withScheduleRunDays(Arrays.asList(DayOfWeek.TUESDAY, DayOfWeek.TUESDAY))
                .withScheduleRunTimes(
                    Arrays
                        .asList(
                            OffsetDateTime.parse("2021-06-25T01:17:09Z"),
                            OffsetDateTime.parse("2021-11-22T17:29:03Z"),
                            OffsetDateTime.parse("2021-07-27T15:44:21Z"),
                            OffsetDateTime.parse("2021-09-20T20:46:09Z")))
                .withHourlySchedule(
                    new HourlySchedule()
                        .withInterval(963389591)
                        .withScheduleWindowStartTime(OffsetDateTime.parse("2021-03-21T04:45:07Z"))
                        .withScheduleWindowDuration(1700362881))
                .withScheduleWeeklyFrequency(1766557067);
        model = BinaryData.fromObject(model).toObject(SimpleSchedulePolicy.class);
        Assertions.assertEquals(ScheduleRunType.WEEKLY, model.scheduleRunFrequency());
        Assertions.assertEquals(DayOfWeek.TUESDAY, model.scheduleRunDays().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-25T01:17:09Z"), model.scheduleRunTimes().get(0));
        Assertions.assertEquals(963389591, model.hourlySchedule().interval());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-03-21T04:45:07Z"), model.hourlySchedule().scheduleWindowStartTime());
        Assertions.assertEquals(1700362881, model.hourlySchedule().scheduleWindowDuration());
        Assertions.assertEquals(1766557067, model.scheduleWeeklyFrequency());
    }
}