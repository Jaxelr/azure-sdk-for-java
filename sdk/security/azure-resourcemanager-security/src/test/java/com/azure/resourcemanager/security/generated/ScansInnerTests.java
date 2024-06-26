// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.ScanInner;
import com.azure.resourcemanager.security.fluent.models.ScansInner;
import com.azure.resourcemanager.security.models.ScanProperties;
import com.azure.resourcemanager.security.models.ScanState;
import com.azure.resourcemanager.security.models.ScanTriggerType;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ScansInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScansInner model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"triggerType\":\"Recurring\",\"state\":\"Failed\",\"server\":\"jkmnwq\",\"database\":\"obaiyhddviaceg\",\"sqlVersion\":\"m\",\"startTime\":\"2021-11-29T21:16:31Z\",\"endTime\":\"2021-04-14T18:02:53Z\",\"highSeverityFailedRulesCount\":2049535402,\"mediumSeverityFailedRulesCount\":1476553113,\"lowSeverityFailedRulesCount\":1649759602,\"totalPassedRulesCount\":325051200,\"totalFailedRulesCount\":880683863,\"totalRulesCount\":97692731,\"isBaselineApplied\":true,\"lastScanTime\":\"2021-07-06T10:06:19Z\"},\"id\":\"lllchpodb\",\"name\":\"evwrdnhfuk\",\"type\":\"vsjcswsmystuluqy\"},{\"properties\":{\"triggerType\":\"Recurring\",\"state\":\"Failed\",\"server\":\"chpqbmfpjba\",\"database\":\"idfcxsspuunnoxyh\",\"sqlVersion\":\"g\",\"startTime\":\"2021-07-24T05:54:49Z\",\"endTime\":\"2020-12-28T12:46:28Z\",\"highSeverityFailedRulesCount\":1351999302,\"mediumSeverityFailedRulesCount\":1321194567,\"lowSeverityFailedRulesCount\":1962921409,\"totalPassedRulesCount\":235411748,\"totalFailedRulesCount\":2104625260,\"totalRulesCount\":631291214,\"isBaselineApplied\":false,\"lastScanTime\":\"2021-09-24T19:50:59Z\"},\"id\":\"vlp\",\"name\":\"x\",\"type\":\"kzbrmsgeivsiy\"},{\"properties\":{\"triggerType\":\"OnDemand\",\"state\":\"Failed\",\"server\":\"dxonbzoggculap\",\"database\":\"y\",\"sqlVersion\":\"gogtqxepnylbf\",\"startTime\":\"2021-07-07T20:12:10Z\",\"endTime\":\"2021-08-25T02:45:25Z\",\"highSeverityFailedRulesCount\":1430433647,\"mediumSeverityFailedRulesCount\":21548435,\"lowSeverityFailedRulesCount\":1326013393,\"totalPassedRulesCount\":1633052469,\"totalFailedRulesCount\":811442311,\"totalRulesCount\":541182731,\"isBaselineApplied\":true,\"lastScanTime\":\"2021-02-20T03:13:08Z\"},\"id\":\"mowuxrk\",\"name\":\"pvdwxf\",\"type\":\"wiivwzjbhyzsx\"}]}")
            .toObject(ScansInner.class);
        Assertions.assertEquals(ScanTriggerType.RECURRING, model.value().get(0).properties().triggerType());
        Assertions.assertEquals(ScanState.FAILED, model.value().get(0).properties().state());
        Assertions.assertEquals("jkmnwq", model.value().get(0).properties().server());
        Assertions.assertEquals("obaiyhddviaceg", model.value().get(0).properties().database());
        Assertions.assertEquals("m", model.value().get(0).properties().sqlVersion());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-29T21:16:31Z"),
            model.value().get(0).properties().startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-14T18:02:53Z"),
            model.value().get(0).properties().endTime());
        Assertions.assertEquals(2049535402, model.value().get(0).properties().highSeverityFailedRulesCount());
        Assertions.assertEquals(1476553113, model.value().get(0).properties().mediumSeverityFailedRulesCount());
        Assertions.assertEquals(1649759602, model.value().get(0).properties().lowSeverityFailedRulesCount());
        Assertions.assertEquals(325051200, model.value().get(0).properties().totalPassedRulesCount());
        Assertions.assertEquals(880683863, model.value().get(0).properties().totalFailedRulesCount());
        Assertions.assertEquals(97692731, model.value().get(0).properties().totalRulesCount());
        Assertions.assertEquals(true, model.value().get(0).properties().isBaselineApplied());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-06T10:06:19Z"),
            model.value().get(0).properties().lastScanTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScansInner model = new ScansInner().withValue(Arrays.asList(
            new ScanInner().withProperties(new ScanProperties().withTriggerType(ScanTriggerType.RECURRING)
                .withState(ScanState.FAILED).withServer("jkmnwq").withDatabase("obaiyhddviaceg").withSqlVersion("m")
                .withStartTime(OffsetDateTime.parse("2021-11-29T21:16:31Z"))
                .withEndTime(OffsetDateTime.parse("2021-04-14T18:02:53Z")).withHighSeverityFailedRulesCount(2049535402)
                .withMediumSeverityFailedRulesCount(1476553113).withLowSeverityFailedRulesCount(1649759602)
                .withTotalPassedRulesCount(325051200).withTotalFailedRulesCount(880683863).withTotalRulesCount(97692731)
                .withIsBaselineApplied(true).withLastScanTime(OffsetDateTime.parse("2021-07-06T10:06:19Z"))),
            new ScanInner().withProperties(new ScanProperties().withTriggerType(ScanTriggerType.RECURRING)
                .withState(ScanState.FAILED).withServer("chpqbmfpjba").withDatabase("idfcxsspuunnoxyh")
                .withSqlVersion("g").withStartTime(OffsetDateTime.parse("2021-07-24T05:54:49Z"))
                .withEndTime(OffsetDateTime.parse("2020-12-28T12:46:28Z")).withHighSeverityFailedRulesCount(1351999302)
                .withMediumSeverityFailedRulesCount(1321194567).withLowSeverityFailedRulesCount(1962921409)
                .withTotalPassedRulesCount(235411748).withTotalFailedRulesCount(2104625260)
                .withTotalRulesCount(631291214).withIsBaselineApplied(false)
                .withLastScanTime(OffsetDateTime.parse("2021-09-24T19:50:59Z"))),
            new ScanInner().withProperties(new ScanProperties().withTriggerType(ScanTriggerType.ON_DEMAND)
                .withState(ScanState.FAILED).withServer("dxonbzoggculap").withDatabase("y")
                .withSqlVersion("gogtqxepnylbf").withStartTime(OffsetDateTime.parse("2021-07-07T20:12:10Z"))
                .withEndTime(OffsetDateTime.parse("2021-08-25T02:45:25Z")).withHighSeverityFailedRulesCount(1430433647)
                .withMediumSeverityFailedRulesCount(21548435).withLowSeverityFailedRulesCount(1326013393)
                .withTotalPassedRulesCount(1633052469).withTotalFailedRulesCount(811442311)
                .withTotalRulesCount(541182731).withIsBaselineApplied(true)
                .withLastScanTime(OffsetDateTime.parse("2021-02-20T03:13:08Z")))));
        model = BinaryData.fromObject(model).toObject(ScansInner.class);
        Assertions.assertEquals(ScanTriggerType.RECURRING, model.value().get(0).properties().triggerType());
        Assertions.assertEquals(ScanState.FAILED, model.value().get(0).properties().state());
        Assertions.assertEquals("jkmnwq", model.value().get(0).properties().server());
        Assertions.assertEquals("obaiyhddviaceg", model.value().get(0).properties().database());
        Assertions.assertEquals("m", model.value().get(0).properties().sqlVersion());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-29T21:16:31Z"),
            model.value().get(0).properties().startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-14T18:02:53Z"),
            model.value().get(0).properties().endTime());
        Assertions.assertEquals(2049535402, model.value().get(0).properties().highSeverityFailedRulesCount());
        Assertions.assertEquals(1476553113, model.value().get(0).properties().mediumSeverityFailedRulesCount());
        Assertions.assertEquals(1649759602, model.value().get(0).properties().lowSeverityFailedRulesCount());
        Assertions.assertEquals(325051200, model.value().get(0).properties().totalPassedRulesCount());
        Assertions.assertEquals(880683863, model.value().get(0).properties().totalFailedRulesCount());
        Assertions.assertEquals(97692731, model.value().get(0).properties().totalRulesCount());
        Assertions.assertEquals(true, model.value().get(0).properties().isBaselineApplied());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-06T10:06:19Z"),
            model.value().get(0).properties().lastScanTime());
    }
}
