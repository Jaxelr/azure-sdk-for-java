// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityOnInactiveMarkAs;
import com.azure.resourcemanager.datafactory.models.ActivityPolicy;
import com.azure.resourcemanager.datafactory.models.ActivityState;
import com.azure.resourcemanager.datafactory.models.BigDataPoolParametrizationReference;
import com.azure.resourcemanager.datafactory.models.BigDataPoolReferenceType;
import com.azure.resourcemanager.datafactory.models.ConfigurationType;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.NotebookParameter;
import com.azure.resourcemanager.datafactory.models.NotebookParameterType;
import com.azure.resourcemanager.datafactory.models.NotebookReferenceType;
import com.azure.resourcemanager.datafactory.models.SparkConfigurationParametrizationReference;
import com.azure.resourcemanager.datafactory.models.SparkConfigurationReferenceType;
import com.azure.resourcemanager.datafactory.models.SynapseNotebookActivity;
import com.azure.resourcemanager.datafactory.models.SynapseNotebookReference;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SynapseNotebookActivityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SynapseNotebookActivity model = BinaryData.fromString(
            "{\"type\":\"uemotgkyfh\",\"typeProperties\":{\"notebook\":{\"type\":\"NotebookReference\",\"referenceName\":\"datallt\"},\"sparkPool\":{\"type\":\"BigDataPoolReference\",\"referenceName\":\"dataxxzhbfib\"},\"parameters\":{\"djrhxjawf\":{\"value\":\"datahzpjdbzhlchv\",\"type\":\"int\"},\"pucybtravel\":{\"value\":\"datavgvrpearooh\",\"type\":\"bool\"},\"ogxexeaexweei\":{\"value\":\"datam\",\"type\":\"float\"},\"ncnf\":{\"value\":\"datagvzmqdn\",\"type\":\"float\"}},\"executorSize\":\"dataggiomgv\",\"conf\":\"datarxlrtm\",\"driverSize\":\"datagnixkp\",\"numExecutors\":\"datajqjwlhqeibucm\",\"configurationType\":\"Artifact\",\"targetSparkConfiguration\":{\"type\":\"SparkConfigurationReference\",\"referenceName\":\"datajrs\"},\"sparkConfig\":{\"uzwy\":\"datamaezxldmzh\"}},\"linkedServiceName\":{\"referenceName\":\"omuapyskwi\",\"parameters\":{\"xfyqsfygafhbf\":\"datafqvulesqjdbcypvs\",\"vqlmzpckxlcslm\":\"dataz\"}},\"policy\":{\"timeout\":\"dataojqpjba\",\"retry\":\"datanxdizdfulv\",\"retryIntervalInSeconds\":1834458226,\"secureInput\":false,\"secureOutput\":true,\"\":{\"dht\":\"datasp\",\"hx\":\"dataopzfcexbtwic\",\"gkvmmkwa\":\"datae\"}},\"name\":\"xmwq\",\"description\":\"svzczisi\",\"state\":\"Inactive\",\"onInactiveMarkAs\":\"Skipped\",\"dependsOn\":[{\"activity\":\"fuhqbatdnufvz\",\"dependencyConditions\":[\"Failed\"],\"\":{\"vdtssa\":\"datat\",\"mfaagpjslrf\":\"databmdoj\"}}],\"userProperties\":[{\"name\":\"ut\",\"value\":\"databhs\"},{\"name\":\"nnf\",\"value\":\"databxtabxdkboyqes\"}],\"\":{\"uikqzdqkxjcqdnzh\":\"datavutarurfjppmi\",\"pjinjikxocf\":\"datalbdlhnkv\",\"r\":\"datakcnjzxezo\"}}")
            .toObject(SynapseNotebookActivity.class);
        Assertions.assertEquals("xmwq", model.name());
        Assertions.assertEquals("svzczisi", model.description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SKIPPED, model.onInactiveMarkAs());
        Assertions.assertEquals("fuhqbatdnufvz", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.FAILED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("ut", model.userProperties().get(0).name());
        Assertions.assertEquals("omuapyskwi", model.linkedServiceName().referenceName());
        Assertions.assertEquals(1834458226, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(false, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
        Assertions.assertEquals(NotebookReferenceType.NOTEBOOK_REFERENCE, model.notebook().type());
        Assertions.assertEquals(BigDataPoolReferenceType.BIG_DATA_POOL_REFERENCE, model.sparkPool().type());
        Assertions.assertEquals(NotebookParameterType.INT, model.parameters().get("djrhxjawf").type());
        Assertions.assertEquals(ConfigurationType.ARTIFACT, model.configurationType());
        Assertions.assertEquals(SparkConfigurationReferenceType.SPARK_CONFIGURATION_REFERENCE,
            model.targetSparkConfiguration().type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SynapseNotebookActivity model = new SynapseNotebookActivity().withName("xmwq")
            .withDescription("svzczisi")
            .withState(ActivityState.INACTIVE)
            .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SKIPPED)
            .withDependsOn(Arrays.asList(new ActivityDependency().withActivity("fuhqbatdnufvz")
                .withDependencyConditions(Arrays.asList(DependencyCondition.FAILED))
                .withAdditionalProperties(mapOf())))
            .withUserProperties(Arrays.asList(new UserProperty().withName("ut").withValue("databhs"),
                new UserProperty().withName("nnf").withValue("databxtabxdkboyqes")))
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("omuapyskwi")
                .withParameters(mapOf("xfyqsfygafhbf", "datafqvulesqjdbcypvs", "vqlmzpckxlcslm", "dataz")))
            .withPolicy(new ActivityPolicy().withTimeout("dataojqpjba")
                .withRetry("datanxdizdfulv")
                .withRetryIntervalInSeconds(1834458226)
                .withSecureInput(false)
                .withSecureOutput(true)
                .withAdditionalProperties(mapOf()))
            .withNotebook(new SynapseNotebookReference().withType(NotebookReferenceType.NOTEBOOK_REFERENCE)
                .withReferenceName("datallt"))
            .withSparkPool(
                new BigDataPoolParametrizationReference().withType(BigDataPoolReferenceType.BIG_DATA_POOL_REFERENCE)
                    .withReferenceName("dataxxzhbfib"))
            .withParameters(mapOf("djrhxjawf",
                new NotebookParameter().withValue("datahzpjdbzhlchv").withType(NotebookParameterType.INT),
                "pucybtravel",
                new NotebookParameter().withValue("datavgvrpearooh").withType(NotebookParameterType.BOOL),
                "ogxexeaexweei", new NotebookParameter().withValue("datam").withType(NotebookParameterType.FLOAT),
                "ncnf", new NotebookParameter().withValue("datagvzmqdn").withType(NotebookParameterType.FLOAT)))
            .withExecutorSize("dataggiomgv")
            .withConf("datarxlrtm")
            .withDriverSize("datagnixkp")
            .withNumExecutors("datajqjwlhqeibucm")
            .withConfigurationType(ConfigurationType.ARTIFACT)
            .withTargetSparkConfiguration(new SparkConfigurationParametrizationReference()
                .withType(SparkConfigurationReferenceType.SPARK_CONFIGURATION_REFERENCE)
                .withReferenceName("datajrs"))
            .withSparkConfig(mapOf("uzwy", "datamaezxldmzh"));
        model = BinaryData.fromObject(model).toObject(SynapseNotebookActivity.class);
        Assertions.assertEquals("xmwq", model.name());
        Assertions.assertEquals("svzczisi", model.description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SKIPPED, model.onInactiveMarkAs());
        Assertions.assertEquals("fuhqbatdnufvz", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.FAILED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("ut", model.userProperties().get(0).name());
        Assertions.assertEquals("omuapyskwi", model.linkedServiceName().referenceName());
        Assertions.assertEquals(1834458226, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(false, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
        Assertions.assertEquals(NotebookReferenceType.NOTEBOOK_REFERENCE, model.notebook().type());
        Assertions.assertEquals(BigDataPoolReferenceType.BIG_DATA_POOL_REFERENCE, model.sparkPool().type());
        Assertions.assertEquals(NotebookParameterType.INT, model.parameters().get("djrhxjawf").type());
        Assertions.assertEquals(ConfigurationType.ARTIFACT, model.configurationType());
        Assertions.assertEquals(SparkConfigurationReferenceType.SPARK_CONFIGURATION_REFERENCE,
            model.targetSparkConfiguration().type());
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
