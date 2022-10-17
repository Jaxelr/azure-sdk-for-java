// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hybridcontainerservice.fluent.models.AgentPoolInner;
import com.azure.resourcemanager.hybridcontainerservice.models.AgentPool;
import com.azure.resourcemanager.hybridcontainerservice.models.AgentPoolExtendedLocation;
import com.azure.resourcemanager.hybridcontainerservice.models.AgentPoolProvisioningState;
import com.azure.resourcemanager.hybridcontainerservice.models.AgentPoolProvisioningStatusStatus;
import com.azure.resourcemanager.hybridcontainerservice.models.CloudProviderProfile;
import com.azure.resourcemanager.hybridcontainerservice.models.Mode;
import com.azure.resourcemanager.hybridcontainerservice.models.OsType;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class AgentPoolImpl implements AgentPool, AgentPool.Definition, AgentPool.Update {
    private AgentPoolInner innerObject;

    private final com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public AgentPoolExtendedLocation extendedLocation() {
        return this.innerModel().extendedLocation();
    }

    public AgentPoolProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public AgentPoolProvisioningStatusStatus status() {
        return this.innerModel().status();
    }

    public Integer count() {
        return this.innerModel().count();
    }

    public List<String> availabilityZones() {
        List<String> inner = this.innerModel().availabilityZones();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Integer maxCount() {
        return this.innerModel().maxCount();
    }

    public Integer maxPods() {
        return this.innerModel().maxPods();
    }

    public Integer minCount() {
        return this.innerModel().minCount();
    }

    public Mode mode() {
        return this.innerModel().mode();
    }

    public Map<String, String> nodeLabels() {
        Map<String, String> inner = this.innerModel().nodeLabels();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public List<String> nodeTaints() {
        List<String> inner = this.innerModel().nodeTaints();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public OsType osType() {
        return this.innerModel().osType();
    }

    public String nodeImageVersion() {
        return this.innerModel().nodeImageVersion();
    }

    public String vmSize() {
        return this.innerModel().vmSize();
    }

    public CloudProviderProfile cloudProviderProfile() {
        return this.innerModel().cloudProviderProfile();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public AgentPoolInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String provisionedClustersName;

    private String agentPoolName;

    public AgentPoolImpl withExistingProvisionedCluster(String resourceGroupName, String provisionedClustersName) {
        this.resourceGroupName = resourceGroupName;
        this.provisionedClustersName = provisionedClustersName;
        return this;
    }

    public AgentPool create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAgentPools()
                .createOrUpdate(
                    resourceGroupName, provisionedClustersName, agentPoolName, this.innerModel(), Context.NONE);
        return this;
    }

    public AgentPool create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAgentPools()
                .createOrUpdate(resourceGroupName, provisionedClustersName, agentPoolName, this.innerModel(), context);
        return this;
    }

    AgentPoolImpl(
        String name, com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager serviceManager) {
        this.innerObject = new AgentPoolInner();
        this.serviceManager = serviceManager;
        this.agentPoolName = name;
    }

    public AgentPoolImpl update() {
        return this;
    }

    public AgentPool apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAgentPools()
                .updateWithResponse(
                    resourceGroupName, provisionedClustersName, agentPoolName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public AgentPool apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAgentPools()
                .updateWithResponse(
                    resourceGroupName, provisionedClustersName, agentPoolName, this.innerModel(), context)
                .getValue();
        return this;
    }

    AgentPoolImpl(
        AgentPoolInner innerObject,
        com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.provisionedClustersName = Utils.getValueFromIdByName(innerObject.id(), "provisionedClusters");
        this.agentPoolName = Utils.getValueFromIdByName(innerObject.id(), "agentPools");
    }

    public AgentPool refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAgentPools()
                .getWithResponse(resourceGroupName, provisionedClustersName, agentPoolName, Context.NONE)
                .getValue();
        return this;
    }

    public AgentPool refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAgentPools()
                .getWithResponse(resourceGroupName, provisionedClustersName, agentPoolName, context)
                .getValue();
        return this;
    }

    public AgentPoolImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public AgentPoolImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public AgentPoolImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public AgentPoolImpl withExtendedLocation(AgentPoolExtendedLocation extendedLocation) {
        this.innerModel().withExtendedLocation(extendedLocation);
        return this;
    }

    public AgentPoolImpl withStatus(AgentPoolProvisioningStatusStatus status) {
        this.innerModel().withStatus(status);
        return this;
    }

    public AgentPoolImpl withCount(Integer count) {
        this.innerModel().withCount(count);
        return this;
    }

    public AgentPoolImpl withAvailabilityZones(List<String> availabilityZones) {
        this.innerModel().withAvailabilityZones(availabilityZones);
        return this;
    }

    public AgentPoolImpl withMaxCount(Integer maxCount) {
        this.innerModel().withMaxCount(maxCount);
        return this;
    }

    public AgentPoolImpl withMaxPods(Integer maxPods) {
        this.innerModel().withMaxPods(maxPods);
        return this;
    }

    public AgentPoolImpl withMinCount(Integer minCount) {
        this.innerModel().withMinCount(minCount);
        return this;
    }

    public AgentPoolImpl withMode(Mode mode) {
        this.innerModel().withMode(mode);
        return this;
    }

    public AgentPoolImpl withNodeLabels(Map<String, String> nodeLabels) {
        this.innerModel().withNodeLabels(nodeLabels);
        return this;
    }

    public AgentPoolImpl withNodeTaints(List<String> nodeTaints) {
        this.innerModel().withNodeTaints(nodeTaints);
        return this;
    }

    public AgentPoolImpl withOsType(OsType osType) {
        this.innerModel().withOsType(osType);
        return this;
    }

    public AgentPoolImpl withNodeImageVersion(String nodeImageVersion) {
        this.innerModel().withNodeImageVersion(nodeImageVersion);
        return this;
    }

    public AgentPoolImpl withVmSize(String vmSize) {
        this.innerModel().withVmSize(vmSize);
        return this;
    }

    public AgentPoolImpl withCloudProviderProfile(CloudProviderProfile cloudProviderProfile) {
        this.innerModel().withCloudProviderProfile(cloudProviderProfile);
        return this;
    }
}