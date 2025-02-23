// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicefabric.fluent.models.ApplicationResourceInner;
import com.azure.resourcemanager.servicefabric.models.ApplicationMetricDescription;
import com.azure.resourcemanager.servicefabric.models.ApplicationUpgradePolicy;
import com.azure.resourcemanager.servicefabric.models.ApplicationUserAssignedIdentity;
import com.azure.resourcemanager.servicefabric.models.ArmApplicationHealthPolicy;
import com.azure.resourcemanager.servicefabric.models.ArmRollingUpgradeMonitoringPolicy;
import com.azure.resourcemanager.servicefabric.models.ArmServiceTypeHealthPolicy;
import com.azure.resourcemanager.servicefabric.models.ArmUpgradeFailureAction;
import com.azure.resourcemanager.servicefabric.models.ManagedIdentity;
import com.azure.resourcemanager.servicefabric.models.ManagedIdentityType;
import com.azure.resourcemanager.servicefabric.models.RollingUpgradeMode;
import com.azure.resourcemanager.servicefabric.models.UserAssignedIdentity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ApplicationResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApplicationResourceInner model = BinaryData.fromString(
            "{\"identity\":{\"principalId\":\"tsthsucocm\",\"tenantId\":\"yazttbtwwrqpue\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"zyoxaepdkzjan\":{\"principalId\":\"biexzfeyu\",\"clientId\":\"xibxujwbhqwalm\"},\"ytxhp\":{\"principalId\":\"xrhdwbavxbniwdjs\",\"clientId\":\"tsdbpgn\"},\"wtctyqi\":{\"principalId\":\"bzpfzab\",\"clientId\":\"cuh\"},\"kfplgmgsxnk\":{\"principalId\":\"bbovplwzbhvgyugu\",\"clientId\":\"vmkfssxqu\"}}},\"properties\":{\"provisioningState\":\"deslp\",\"typeName\":\"opwi\",\"typeVersion\":\"ghxpkdw\",\"parameters\":{\"upedeojnabckhs\":\"iuebbaumny\",\"ie\":\"txp\",\"jdhtldwkyzxu\":\"tfhvpesapskrdqmh\",\"svlxotogtwrup\":\"tkncwsc\"},\"upgradePolicy\":{\"upgradeReplicaSetCheckTimeout\":\"vnm\",\"forceRestart\":true,\"rollingUpgradeMonitoringPolicy\":{\"failureAction\":\"Manual\",\"healthCheckWaitDuration\":\"o\",\"healthCheckStableDuration\":\"ilovnot\",\"healthCheckRetryTimeout\":\"jfcn\",\"upgradeTimeout\":\"k\",\"upgradeDomainTimeout\":\"x\"},\"applicationHealthPolicy\":{\"considerWarningAsError\":true,\"maxPercentUnhealthyDeployedApplications\":657781919,\"defaultServiceTypeHealthPolicy\":{\"maxPercentUnhealthyServices\":1754671531,\"maxPercentUnhealthyPartitionsPerService\":1501927720,\"maxPercentUnhealthyReplicasPerPartition\":1284749235},\"serviceTypeHealthPolicyMap\":{\"clfp\":{\"maxPercentUnhealthyServices\":1633235296,\"maxPercentUnhealthyPartitionsPerService\":1979421186,\"maxPercentUnhealthyReplicasPerPartition\":1468269047}}},\"upgradeMode\":\"UnmonitoredAuto\",\"recreateApplication\":false},\"minimumNodes\":6303383872663340344,\"maximumNodes\":8770120849185576658,\"removeApplicationCapacity\":false,\"metrics\":[{\"name\":\"sbj\",\"maximumCapacity\":1292231161047660234,\"reservationCapacity\":8913573077828001292,\"totalApplicationCapacity\":8623440575477757964},{\"name\":\"ueefjzwfqkqu\",\"maximumCapacity\":3292485781669976103,\"reservationCapacity\":7570837536586623824,\"totalApplicationCapacity\":4310608753987324485},{\"name\":\"laocqxtccmg\",\"maximumCapacity\":4531156159452032810,\"reservationCapacity\":6928065700546189319,\"totalApplicationCapacity\":8937450445167889405}],\"managedIdentities\":[{\"name\":\"vwfudwpzntxhd\",\"principalId\":\"hl\"}]},\"location\":\"jbhckfrlhr\",\"tags\":{\"ycanuzbpzkafku\":\"kyv\",\"rnwb\":\"b\"},\"etag\":\"hhseyv\",\"id\":\"srtslhspkdeem\",\"name\":\"ofmxagkvtmelmqkr\",\"type\":\"ahvljuaha\"}")
            .toObject(ApplicationResourceInner.class);
        Assertions.assertEquals(ManagedIdentityType.USER_ASSIGNED, model.identity().type());
        Assertions.assertEquals("jbhckfrlhr", model.location());
        Assertions.assertEquals("kyv", model.tags().get("ycanuzbpzkafku"));
        Assertions.assertEquals("opwi", model.typeName());
        Assertions.assertEquals("ghxpkdw", model.typeVersion());
        Assertions.assertEquals("iuebbaumny", model.parameters().get("upedeojnabckhs"));
        Assertions.assertEquals("vnm", model.upgradePolicy().upgradeReplicaSetCheckTimeout());
        Assertions.assertEquals(true, model.upgradePolicy().forceRestart());
        Assertions.assertEquals(ArmUpgradeFailureAction.MANUAL,
            model.upgradePolicy().rollingUpgradeMonitoringPolicy().failureAction());
        Assertions.assertEquals("o", model.upgradePolicy().rollingUpgradeMonitoringPolicy().healthCheckWaitDuration());
        Assertions.assertEquals("ilovnot",
            model.upgradePolicy().rollingUpgradeMonitoringPolicy().healthCheckStableDuration());
        Assertions.assertEquals("jfcn",
            model.upgradePolicy().rollingUpgradeMonitoringPolicy().healthCheckRetryTimeout());
        Assertions.assertEquals("k", model.upgradePolicy().rollingUpgradeMonitoringPolicy().upgradeTimeout());
        Assertions.assertEquals("x", model.upgradePolicy().rollingUpgradeMonitoringPolicy().upgradeDomainTimeout());
        Assertions.assertEquals(true, model.upgradePolicy().applicationHealthPolicy().considerWarningAsError());
        Assertions.assertEquals(657781919,
            model.upgradePolicy().applicationHealthPolicy().maxPercentUnhealthyDeployedApplications());
        Assertions.assertEquals(1754671531,
            model.upgradePolicy()
                .applicationHealthPolicy()
                .defaultServiceTypeHealthPolicy()
                .maxPercentUnhealthyServices());
        Assertions.assertEquals(1501927720,
            model.upgradePolicy()
                .applicationHealthPolicy()
                .defaultServiceTypeHealthPolicy()
                .maxPercentUnhealthyPartitionsPerService());
        Assertions.assertEquals(1284749235,
            model.upgradePolicy()
                .applicationHealthPolicy()
                .defaultServiceTypeHealthPolicy()
                .maxPercentUnhealthyReplicasPerPartition());
        Assertions.assertEquals(1633235296,
            model.upgradePolicy()
                .applicationHealthPolicy()
                .serviceTypeHealthPolicyMap()
                .get("clfp")
                .maxPercentUnhealthyServices());
        Assertions.assertEquals(1979421186,
            model.upgradePolicy()
                .applicationHealthPolicy()
                .serviceTypeHealthPolicyMap()
                .get("clfp")
                .maxPercentUnhealthyPartitionsPerService());
        Assertions.assertEquals(1468269047,
            model.upgradePolicy()
                .applicationHealthPolicy()
                .serviceTypeHealthPolicyMap()
                .get("clfp")
                .maxPercentUnhealthyReplicasPerPartition());
        Assertions.assertEquals(RollingUpgradeMode.UNMONITORED_AUTO, model.upgradePolicy().upgradeMode());
        Assertions.assertEquals(false, model.upgradePolicy().recreateApplication());
        Assertions.assertEquals(6303383872663340344L, model.minimumNodes());
        Assertions.assertEquals(8770120849185576658L, model.maximumNodes());
        Assertions.assertEquals(false, model.removeApplicationCapacity());
        Assertions.assertEquals("sbj", model.metrics().get(0).name());
        Assertions.assertEquals(1292231161047660234L, model.metrics().get(0).maximumCapacity());
        Assertions.assertEquals(8913573077828001292L, model.metrics().get(0).reservationCapacity());
        Assertions.assertEquals(8623440575477757964L, model.metrics().get(0).totalApplicationCapacity());
        Assertions.assertEquals("vwfudwpzntxhd", model.managedIdentities().get(0).name());
        Assertions.assertEquals("hl", model.managedIdentities().get(0).principalId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApplicationResourceInner model = new ApplicationResourceInner()
            .withIdentity(new ManagedIdentity().withType(ManagedIdentityType.USER_ASSIGNED)
                .withUserAssignedIdentities(
                    mapOf("zyoxaepdkzjan", new UserAssignedIdentity(), "ytxhp", new UserAssignedIdentity(), "wtctyqi",
                        new UserAssignedIdentity(), "kfplgmgsxnk", new UserAssignedIdentity())))
            .withLocation("jbhckfrlhr")
            .withTags(mapOf("ycanuzbpzkafku", "kyv", "rnwb", "b"))
            .withTypeName("opwi")
            .withTypeVersion("ghxpkdw")
            .withParameters(mapOf("upedeojnabckhs", "iuebbaumny", "ie", "txp", "jdhtldwkyzxu", "tfhvpesapskrdqmh",
                "svlxotogtwrup", "tkncwsc"))
            .withUpgradePolicy(new ApplicationUpgradePolicy().withUpgradeReplicaSetCheckTimeout("vnm")
                .withForceRestart(true)
                .withRollingUpgradeMonitoringPolicy(
                    new ArmRollingUpgradeMonitoringPolicy().withFailureAction(ArmUpgradeFailureAction.MANUAL)
                        .withHealthCheckWaitDuration("o")
                        .withHealthCheckStableDuration("ilovnot")
                        .withHealthCheckRetryTimeout("jfcn")
                        .withUpgradeTimeout("k")
                        .withUpgradeDomainTimeout("x"))
                .withApplicationHealthPolicy(new ArmApplicationHealthPolicy().withConsiderWarningAsError(true)
                    .withMaxPercentUnhealthyDeployedApplications(657781919)
                    .withDefaultServiceTypeHealthPolicy(
                        new ArmServiceTypeHealthPolicy().withMaxPercentUnhealthyServices(1754671531)
                            .withMaxPercentUnhealthyPartitionsPerService(1501927720)
                            .withMaxPercentUnhealthyReplicasPerPartition(1284749235))
                    .withServiceTypeHealthPolicyMap(mapOf("clfp",
                        new ArmServiceTypeHealthPolicy().withMaxPercentUnhealthyServices(1633235296)
                            .withMaxPercentUnhealthyPartitionsPerService(1979421186)
                            .withMaxPercentUnhealthyReplicasPerPartition(1468269047))))
                .withUpgradeMode(RollingUpgradeMode.UNMONITORED_AUTO)
                .withRecreateApplication(false))
            .withMinimumNodes(6303383872663340344L)
            .withMaximumNodes(8770120849185576658L)
            .withRemoveApplicationCapacity(false)
            .withMetrics(Arrays.asList(
                new ApplicationMetricDescription().withName("sbj")
                    .withMaximumCapacity(1292231161047660234L)
                    .withReservationCapacity(8913573077828001292L)
                    .withTotalApplicationCapacity(8623440575477757964L),
                new ApplicationMetricDescription().withName("ueefjzwfqkqu")
                    .withMaximumCapacity(3292485781669976103L)
                    .withReservationCapacity(7570837536586623824L)
                    .withTotalApplicationCapacity(4310608753987324485L),
                new ApplicationMetricDescription().withName("laocqxtccmg")
                    .withMaximumCapacity(4531156159452032810L)
                    .withReservationCapacity(6928065700546189319L)
                    .withTotalApplicationCapacity(8937450445167889405L)))
            .withManagedIdentities(
                Arrays.asList(new ApplicationUserAssignedIdentity().withName("vwfudwpzntxhd").withPrincipalId("hl")));
        model = BinaryData.fromObject(model).toObject(ApplicationResourceInner.class);
        Assertions.assertEquals(ManagedIdentityType.USER_ASSIGNED, model.identity().type());
        Assertions.assertEquals("jbhckfrlhr", model.location());
        Assertions.assertEquals("kyv", model.tags().get("ycanuzbpzkafku"));
        Assertions.assertEquals("opwi", model.typeName());
        Assertions.assertEquals("ghxpkdw", model.typeVersion());
        Assertions.assertEquals("iuebbaumny", model.parameters().get("upedeojnabckhs"));
        Assertions.assertEquals("vnm", model.upgradePolicy().upgradeReplicaSetCheckTimeout());
        Assertions.assertEquals(true, model.upgradePolicy().forceRestart());
        Assertions.assertEquals(ArmUpgradeFailureAction.MANUAL,
            model.upgradePolicy().rollingUpgradeMonitoringPolicy().failureAction());
        Assertions.assertEquals("o", model.upgradePolicy().rollingUpgradeMonitoringPolicy().healthCheckWaitDuration());
        Assertions.assertEquals("ilovnot",
            model.upgradePolicy().rollingUpgradeMonitoringPolicy().healthCheckStableDuration());
        Assertions.assertEquals("jfcn",
            model.upgradePolicy().rollingUpgradeMonitoringPolicy().healthCheckRetryTimeout());
        Assertions.assertEquals("k", model.upgradePolicy().rollingUpgradeMonitoringPolicy().upgradeTimeout());
        Assertions.assertEquals("x", model.upgradePolicy().rollingUpgradeMonitoringPolicy().upgradeDomainTimeout());
        Assertions.assertEquals(true, model.upgradePolicy().applicationHealthPolicy().considerWarningAsError());
        Assertions.assertEquals(657781919,
            model.upgradePolicy().applicationHealthPolicy().maxPercentUnhealthyDeployedApplications());
        Assertions.assertEquals(1754671531,
            model.upgradePolicy()
                .applicationHealthPolicy()
                .defaultServiceTypeHealthPolicy()
                .maxPercentUnhealthyServices());
        Assertions.assertEquals(1501927720,
            model.upgradePolicy()
                .applicationHealthPolicy()
                .defaultServiceTypeHealthPolicy()
                .maxPercentUnhealthyPartitionsPerService());
        Assertions.assertEquals(1284749235,
            model.upgradePolicy()
                .applicationHealthPolicy()
                .defaultServiceTypeHealthPolicy()
                .maxPercentUnhealthyReplicasPerPartition());
        Assertions.assertEquals(1633235296,
            model.upgradePolicy()
                .applicationHealthPolicy()
                .serviceTypeHealthPolicyMap()
                .get("clfp")
                .maxPercentUnhealthyServices());
        Assertions.assertEquals(1979421186,
            model.upgradePolicy()
                .applicationHealthPolicy()
                .serviceTypeHealthPolicyMap()
                .get("clfp")
                .maxPercentUnhealthyPartitionsPerService());
        Assertions.assertEquals(1468269047,
            model.upgradePolicy()
                .applicationHealthPolicy()
                .serviceTypeHealthPolicyMap()
                .get("clfp")
                .maxPercentUnhealthyReplicasPerPartition());
        Assertions.assertEquals(RollingUpgradeMode.UNMONITORED_AUTO, model.upgradePolicy().upgradeMode());
        Assertions.assertEquals(false, model.upgradePolicy().recreateApplication());
        Assertions.assertEquals(6303383872663340344L, model.minimumNodes());
        Assertions.assertEquals(8770120849185576658L, model.maximumNodes());
        Assertions.assertEquals(false, model.removeApplicationCapacity());
        Assertions.assertEquals("sbj", model.metrics().get(0).name());
        Assertions.assertEquals(1292231161047660234L, model.metrics().get(0).maximumCapacity());
        Assertions.assertEquals(8913573077828001292L, model.metrics().get(0).reservationCapacity());
        Assertions.assertEquals(8623440575477757964L, model.metrics().get(0).totalApplicationCapacity());
        Assertions.assertEquals("vwfudwpzntxhd", model.managedIdentities().get(0).name());
        Assertions.assertEquals("hl", model.managedIdentities().get(0).principalId());
    }

    // Use "Map.of" if available
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
