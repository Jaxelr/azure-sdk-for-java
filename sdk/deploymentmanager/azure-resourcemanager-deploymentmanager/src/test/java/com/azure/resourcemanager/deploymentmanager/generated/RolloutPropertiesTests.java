// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.deploymentmanager.fluent.models.RolloutProperties;
import com.azure.resourcemanager.deploymentmanager.models.StepGroup;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class RolloutPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RolloutProperties model =
            BinaryData
                .fromString(
                    "{\"status\":\"znorcj\",\"totalRetryAttempts\":745592995,\"operationInfo\":{\"retryAttempt\":1906799262,\"skipSucceededOnRetry\":false,\"startTime\":\"2021-05-01T16:18:20Z\",\"endTime\":\"2021-04-08T23:03:17Z\"},\"services\":[{\"name\":\"ysh\",\"serviceUnits\":[],\"targetLocation\":\"afbljjgpbtoqcjmk\",\"targetSubscriptionId\":\"javbqidtqajz\"},{\"name\":\"l\",\"serviceUnits\":[],\"targetLocation\":\"dj\",\"targetSubscriptionId\":\"rlkhbzhfepgzgq\"}],\"buildVersion\":\"xzlocxscp\",\"artifactSourceId\":\"erhhbcsglumm\",\"targetServiceTopologyId\":\"jtjaodxobnbdxkq\",\"stepGroups\":[{\"name\":\"okaj\",\"dependsOnStepGroups\":[\"pimexgstxgcpodg\",\"aajrm\"],\"preDeploymentSteps\":[],\"deploymentTargetId\":\"wzrlovmclwhij\",\"postDeploymentSteps\":[]}]}")
                .toObject(RolloutProperties.class);
        Assertions.assertEquals("xzlocxscp", model.buildVersion());
        Assertions.assertEquals("erhhbcsglumm", model.artifactSourceId());
        Assertions.assertEquals("jtjaodxobnbdxkq", model.targetServiceTopologyId());
        Assertions.assertEquals("okaj", model.stepGroups().get(0).name());
        Assertions.assertEquals("pimexgstxgcpodg", model.stepGroups().get(0).dependsOnStepGroups().get(0));
        Assertions.assertEquals("wzrlovmclwhij", model.stepGroups().get(0).deploymentTargetId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RolloutProperties model =
            new RolloutProperties()
                .withBuildVersion("xzlocxscp")
                .withArtifactSourceId("erhhbcsglumm")
                .withTargetServiceTopologyId("jtjaodxobnbdxkq")
                .withStepGroups(
                    Arrays
                        .asList(
                            new StepGroup()
                                .withName("okaj")
                                .withDependsOnStepGroups(Arrays.asList("pimexgstxgcpodg", "aajrm"))
                                .withPreDeploymentSteps(Arrays.asList())
                                .withDeploymentTargetId("wzrlovmclwhij")
                                .withPostDeploymentSteps(Arrays.asList())));
        model = BinaryData.fromObject(model).toObject(RolloutProperties.class);
        Assertions.assertEquals("xzlocxscp", model.buildVersion());
        Assertions.assertEquals("erhhbcsglumm", model.artifactSourceId());
        Assertions.assertEquals("jtjaodxobnbdxkq", model.targetServiceTopologyId());
        Assertions.assertEquals("okaj", model.stepGroups().get(0).name());
        Assertions.assertEquals("pimexgstxgcpodg", model.stepGroups().get(0).dependsOnStepGroups().get(0));
        Assertions.assertEquals("wzrlovmclwhij", model.stepGroups().get(0).deploymentTargetId());
    }
}