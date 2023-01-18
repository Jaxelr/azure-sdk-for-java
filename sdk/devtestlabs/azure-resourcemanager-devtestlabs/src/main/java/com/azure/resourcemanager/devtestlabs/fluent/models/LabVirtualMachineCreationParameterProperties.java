// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.devtestlabs.models.ArtifactInstallProperties;
import com.azure.resourcemanager.devtestlabs.models.BulkCreationParameters;
import com.azure.resourcemanager.devtestlabs.models.DataDiskProperties;
import com.azure.resourcemanager.devtestlabs.models.GalleryImageReference;
import com.azure.resourcemanager.devtestlabs.models.NetworkInterfaceProperties;
import com.azure.resourcemanager.devtestlabs.models.ScheduleCreationParameter;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Properties for virtual machine creation. */
@Fluent
public final class LabVirtualMachineCreationParameterProperties {
    /*
     * The number of virtual machine instances to create.
     */
    @JsonProperty(value = "bulkCreationParameters")
    private BulkCreationParameters bulkCreationParameters;

    /*
     * The notes of the virtual machine.
     */
    @JsonProperty(value = "notes")
    private String notes;

    /*
     * The object identifier of the owner of the virtual machine.
     */
    @JsonProperty(value = "ownerObjectId")
    private String ownerObjectId;

    /*
     * The user principal name of the virtual machine owner.
     */
    @JsonProperty(value = "ownerUserPrincipalName")
    private String ownerUserPrincipalName;

    /*
     * The creation date of the virtual machine.
     */
    @JsonProperty(value = "createdDate")
    private OffsetDateTime createdDate;

    /*
     * The custom image identifier of the virtual machine.
     */
    @JsonProperty(value = "customImageId")
    private String customImageId;

    /*
     * The size of the virtual machine.
     */
    @JsonProperty(value = "size")
    private String size;

    /*
     * The user name of the virtual machine.
     */
    @JsonProperty(value = "userName")
    private String username;

    /*
     * The password of the virtual machine administrator.
     */
    @JsonProperty(value = "password")
    private String password;

    /*
     * The SSH key of the virtual machine administrator.
     */
    @JsonProperty(value = "sshKey")
    private String sshKey;

    /*
     * Indicates whether this virtual machine uses an SSH key for authentication.
     */
    @JsonProperty(value = "isAuthenticationWithSshKey")
    private Boolean isAuthenticationWithSshKey;

    /*
     * The lab subnet name of the virtual machine.
     */
    @JsonProperty(value = "labSubnetName")
    private String labSubnetName;

    /*
     * The lab virtual network identifier of the virtual machine.
     */
    @JsonProperty(value = "labVirtualNetworkId")
    private String labVirtualNetworkId;

    /*
     * Indicates whether the virtual machine is to be created without a public IP address.
     */
    @JsonProperty(value = "disallowPublicIpAddress")
    private Boolean disallowPublicIpAddress;

    /*
     * The artifacts to be installed on the virtual machine.
     */
    @JsonProperty(value = "artifacts")
    private List<ArtifactInstallProperties> artifacts;

    /*
     * The Microsoft Azure Marketplace image reference of the virtual machine.
     */
    @JsonProperty(value = "galleryImageReference")
    private GalleryImageReference galleryImageReference;

    /*
     * The id of the plan associated with the virtual machine image
     */
    @JsonProperty(value = "planId")
    private String planId;

    /*
     * The network interface properties.
     */
    @JsonProperty(value = "networkInterface")
    private NetworkInterfaceProperties networkInterface;

    /*
     * The expiration date for VM.
     */
    @JsonProperty(value = "expirationDate")
    private OffsetDateTime expirationDate;

    /*
     * Indicates whether another user can take ownership of the virtual machine
     */
    @JsonProperty(value = "allowClaim")
    private Boolean allowClaim;

    /*
     * Storage type to use for virtual machine (i.e. Standard, Premium).
     */
    @JsonProperty(value = "storageType")
    private String storageType;

    /*
     * The resource ID of the environment that contains this virtual machine, if any.
     */
    @JsonProperty(value = "environmentId")
    private String environmentId;

    /*
     * New or existing data disks to attach to the virtual machine after creation
     */
    @JsonProperty(value = "dataDiskParameters")
    private List<DataDiskProperties> dataDiskParameters;

    /*
     * Virtual Machine schedules to be created
     */
    @JsonProperty(value = "scheduleParameters")
    private List<ScheduleCreationParameter> scheduleParameters;

    /** Creates an instance of LabVirtualMachineCreationParameterProperties class. */
    public LabVirtualMachineCreationParameterProperties() {
    }

    /**
     * Get the bulkCreationParameters property: The number of virtual machine instances to create.
     *
     * @return the bulkCreationParameters value.
     */
    public BulkCreationParameters bulkCreationParameters() {
        return this.bulkCreationParameters;
    }

    /**
     * Set the bulkCreationParameters property: The number of virtual machine instances to create.
     *
     * @param bulkCreationParameters the bulkCreationParameters value to set.
     * @return the LabVirtualMachineCreationParameterProperties object itself.
     */
    public LabVirtualMachineCreationParameterProperties withBulkCreationParameters(
        BulkCreationParameters bulkCreationParameters) {
        this.bulkCreationParameters = bulkCreationParameters;
        return this;
    }

    /**
     * Get the notes property: The notes of the virtual machine.
     *
     * @return the notes value.
     */
    public String notes() {
        return this.notes;
    }

    /**
     * Set the notes property: The notes of the virtual machine.
     *
     * @param notes the notes value to set.
     * @return the LabVirtualMachineCreationParameterProperties object itself.
     */
    public LabVirtualMachineCreationParameterProperties withNotes(String notes) {
        this.notes = notes;
        return this;
    }

    /**
     * Get the ownerObjectId property: The object identifier of the owner of the virtual machine.
     *
     * @return the ownerObjectId value.
     */
    public String ownerObjectId() {
        return this.ownerObjectId;
    }

    /**
     * Set the ownerObjectId property: The object identifier of the owner of the virtual machine.
     *
     * @param ownerObjectId the ownerObjectId value to set.
     * @return the LabVirtualMachineCreationParameterProperties object itself.
     */
    public LabVirtualMachineCreationParameterProperties withOwnerObjectId(String ownerObjectId) {
        this.ownerObjectId = ownerObjectId;
        return this;
    }

    /**
     * Get the ownerUserPrincipalName property: The user principal name of the virtual machine owner.
     *
     * @return the ownerUserPrincipalName value.
     */
    public String ownerUserPrincipalName() {
        return this.ownerUserPrincipalName;
    }

    /**
     * Set the ownerUserPrincipalName property: The user principal name of the virtual machine owner.
     *
     * @param ownerUserPrincipalName the ownerUserPrincipalName value to set.
     * @return the LabVirtualMachineCreationParameterProperties object itself.
     */
    public LabVirtualMachineCreationParameterProperties withOwnerUserPrincipalName(String ownerUserPrincipalName) {
        this.ownerUserPrincipalName = ownerUserPrincipalName;
        return this;
    }

    /**
     * Get the createdDate property: The creation date of the virtual machine.
     *
     * @return the createdDate value.
     */
    public OffsetDateTime createdDate() {
        return this.createdDate;
    }

    /**
     * Set the createdDate property: The creation date of the virtual machine.
     *
     * @param createdDate the createdDate value to set.
     * @return the LabVirtualMachineCreationParameterProperties object itself.
     */
    public LabVirtualMachineCreationParameterProperties withCreatedDate(OffsetDateTime createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * Get the customImageId property: The custom image identifier of the virtual machine.
     *
     * @return the customImageId value.
     */
    public String customImageId() {
        return this.customImageId;
    }

    /**
     * Set the customImageId property: The custom image identifier of the virtual machine.
     *
     * @param customImageId the customImageId value to set.
     * @return the LabVirtualMachineCreationParameterProperties object itself.
     */
    public LabVirtualMachineCreationParameterProperties withCustomImageId(String customImageId) {
        this.customImageId = customImageId;
        return this;
    }

    /**
     * Get the size property: The size of the virtual machine.
     *
     * @return the size value.
     */
    public String size() {
        return this.size;
    }

    /**
     * Set the size property: The size of the virtual machine.
     *
     * @param size the size value to set.
     * @return the LabVirtualMachineCreationParameterProperties object itself.
     */
    public LabVirtualMachineCreationParameterProperties withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * Get the username property: The user name of the virtual machine.
     *
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: The user name of the virtual machine.
     *
     * @param username the username value to set.
     * @return the LabVirtualMachineCreationParameterProperties object itself.
     */
    public LabVirtualMachineCreationParameterProperties withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: The password of the virtual machine administrator.
     *
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: The password of the virtual machine administrator.
     *
     * @param password the password value to set.
     * @return the LabVirtualMachineCreationParameterProperties object itself.
     */
    public LabVirtualMachineCreationParameterProperties withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the sshKey property: The SSH key of the virtual machine administrator.
     *
     * @return the sshKey value.
     */
    public String sshKey() {
        return this.sshKey;
    }

    /**
     * Set the sshKey property: The SSH key of the virtual machine administrator.
     *
     * @param sshKey the sshKey value to set.
     * @return the LabVirtualMachineCreationParameterProperties object itself.
     */
    public LabVirtualMachineCreationParameterProperties withSshKey(String sshKey) {
        this.sshKey = sshKey;
        return this;
    }

    /**
     * Get the isAuthenticationWithSshKey property: Indicates whether this virtual machine uses an SSH key for
     * authentication.
     *
     * @return the isAuthenticationWithSshKey value.
     */
    public Boolean isAuthenticationWithSshKey() {
        return this.isAuthenticationWithSshKey;
    }

    /**
     * Set the isAuthenticationWithSshKey property: Indicates whether this virtual machine uses an SSH key for
     * authentication.
     *
     * @param isAuthenticationWithSshKey the isAuthenticationWithSshKey value to set.
     * @return the LabVirtualMachineCreationParameterProperties object itself.
     */
    public LabVirtualMachineCreationParameterProperties withIsAuthenticationWithSshKey(
        Boolean isAuthenticationWithSshKey) {
        this.isAuthenticationWithSshKey = isAuthenticationWithSshKey;
        return this;
    }

    /**
     * Get the labSubnetName property: The lab subnet name of the virtual machine.
     *
     * @return the labSubnetName value.
     */
    public String labSubnetName() {
        return this.labSubnetName;
    }

    /**
     * Set the labSubnetName property: The lab subnet name of the virtual machine.
     *
     * @param labSubnetName the labSubnetName value to set.
     * @return the LabVirtualMachineCreationParameterProperties object itself.
     */
    public LabVirtualMachineCreationParameterProperties withLabSubnetName(String labSubnetName) {
        this.labSubnetName = labSubnetName;
        return this;
    }

    /**
     * Get the labVirtualNetworkId property: The lab virtual network identifier of the virtual machine.
     *
     * @return the labVirtualNetworkId value.
     */
    public String labVirtualNetworkId() {
        return this.labVirtualNetworkId;
    }

    /**
     * Set the labVirtualNetworkId property: The lab virtual network identifier of the virtual machine.
     *
     * @param labVirtualNetworkId the labVirtualNetworkId value to set.
     * @return the LabVirtualMachineCreationParameterProperties object itself.
     */
    public LabVirtualMachineCreationParameterProperties withLabVirtualNetworkId(String labVirtualNetworkId) {
        this.labVirtualNetworkId = labVirtualNetworkId;
        return this;
    }

    /**
     * Get the disallowPublicIpAddress property: Indicates whether the virtual machine is to be created without a public
     * IP address.
     *
     * @return the disallowPublicIpAddress value.
     */
    public Boolean disallowPublicIpAddress() {
        return this.disallowPublicIpAddress;
    }

    /**
     * Set the disallowPublicIpAddress property: Indicates whether the virtual machine is to be created without a public
     * IP address.
     *
     * @param disallowPublicIpAddress the disallowPublicIpAddress value to set.
     * @return the LabVirtualMachineCreationParameterProperties object itself.
     */
    public LabVirtualMachineCreationParameterProperties withDisallowPublicIpAddress(Boolean disallowPublicIpAddress) {
        this.disallowPublicIpAddress = disallowPublicIpAddress;
        return this;
    }

    /**
     * Get the artifacts property: The artifacts to be installed on the virtual machine.
     *
     * @return the artifacts value.
     */
    public List<ArtifactInstallProperties> artifacts() {
        return this.artifacts;
    }

    /**
     * Set the artifacts property: The artifacts to be installed on the virtual machine.
     *
     * @param artifacts the artifacts value to set.
     * @return the LabVirtualMachineCreationParameterProperties object itself.
     */
    public LabVirtualMachineCreationParameterProperties withArtifacts(List<ArtifactInstallProperties> artifacts) {
        this.artifacts = artifacts;
        return this;
    }

    /**
     * Get the galleryImageReference property: The Microsoft Azure Marketplace image reference of the virtual machine.
     *
     * @return the galleryImageReference value.
     */
    public GalleryImageReference galleryImageReference() {
        return this.galleryImageReference;
    }

    /**
     * Set the galleryImageReference property: The Microsoft Azure Marketplace image reference of the virtual machine.
     *
     * @param galleryImageReference the galleryImageReference value to set.
     * @return the LabVirtualMachineCreationParameterProperties object itself.
     */
    public LabVirtualMachineCreationParameterProperties withGalleryImageReference(
        GalleryImageReference galleryImageReference) {
        this.galleryImageReference = galleryImageReference;
        return this;
    }

    /**
     * Get the planId property: The id of the plan associated with the virtual machine image.
     *
     * @return the planId value.
     */
    public String planId() {
        return this.planId;
    }

    /**
     * Set the planId property: The id of the plan associated with the virtual machine image.
     *
     * @param planId the planId value to set.
     * @return the LabVirtualMachineCreationParameterProperties object itself.
     */
    public LabVirtualMachineCreationParameterProperties withPlanId(String planId) {
        this.planId = planId;
        return this;
    }

    /**
     * Get the networkInterface property: The network interface properties.
     *
     * @return the networkInterface value.
     */
    public NetworkInterfaceProperties networkInterface() {
        return this.networkInterface;
    }

    /**
     * Set the networkInterface property: The network interface properties.
     *
     * @param networkInterface the networkInterface value to set.
     * @return the LabVirtualMachineCreationParameterProperties object itself.
     */
    public LabVirtualMachineCreationParameterProperties withNetworkInterface(
        NetworkInterfaceProperties networkInterface) {
        this.networkInterface = networkInterface;
        return this;
    }

    /**
     * Get the expirationDate property: The expiration date for VM.
     *
     * @return the expirationDate value.
     */
    public OffsetDateTime expirationDate() {
        return this.expirationDate;
    }

    /**
     * Set the expirationDate property: The expiration date for VM.
     *
     * @param expirationDate the expirationDate value to set.
     * @return the LabVirtualMachineCreationParameterProperties object itself.
     */
    public LabVirtualMachineCreationParameterProperties withExpirationDate(OffsetDateTime expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    /**
     * Get the allowClaim property: Indicates whether another user can take ownership of the virtual machine.
     *
     * @return the allowClaim value.
     */
    public Boolean allowClaim() {
        return this.allowClaim;
    }

    /**
     * Set the allowClaim property: Indicates whether another user can take ownership of the virtual machine.
     *
     * @param allowClaim the allowClaim value to set.
     * @return the LabVirtualMachineCreationParameterProperties object itself.
     */
    public LabVirtualMachineCreationParameterProperties withAllowClaim(Boolean allowClaim) {
        this.allowClaim = allowClaim;
        return this;
    }

    /**
     * Get the storageType property: Storage type to use for virtual machine (i.e. Standard, Premium).
     *
     * @return the storageType value.
     */
    public String storageType() {
        return this.storageType;
    }

    /**
     * Set the storageType property: Storage type to use for virtual machine (i.e. Standard, Premium).
     *
     * @param storageType the storageType value to set.
     * @return the LabVirtualMachineCreationParameterProperties object itself.
     */
    public LabVirtualMachineCreationParameterProperties withStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * Get the environmentId property: The resource ID of the environment that contains this virtual machine, if any.
     *
     * @return the environmentId value.
     */
    public String environmentId() {
        return this.environmentId;
    }

    /**
     * Set the environmentId property: The resource ID of the environment that contains this virtual machine, if any.
     *
     * @param environmentId the environmentId value to set.
     * @return the LabVirtualMachineCreationParameterProperties object itself.
     */
    public LabVirtualMachineCreationParameterProperties withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    /**
     * Get the dataDiskParameters property: New or existing data disks to attach to the virtual machine after creation.
     *
     * @return the dataDiskParameters value.
     */
    public List<DataDiskProperties> dataDiskParameters() {
        return this.dataDiskParameters;
    }

    /**
     * Set the dataDiskParameters property: New or existing data disks to attach to the virtual machine after creation.
     *
     * @param dataDiskParameters the dataDiskParameters value to set.
     * @return the LabVirtualMachineCreationParameterProperties object itself.
     */
    public LabVirtualMachineCreationParameterProperties withDataDiskParameters(
        List<DataDiskProperties> dataDiskParameters) {
        this.dataDiskParameters = dataDiskParameters;
        return this;
    }

    /**
     * Get the scheduleParameters property: Virtual Machine schedules to be created.
     *
     * @return the scheduleParameters value.
     */
    public List<ScheduleCreationParameter> scheduleParameters() {
        return this.scheduleParameters;
    }

    /**
     * Set the scheduleParameters property: Virtual Machine schedules to be created.
     *
     * @param scheduleParameters the scheduleParameters value to set.
     * @return the LabVirtualMachineCreationParameterProperties object itself.
     */
    public LabVirtualMachineCreationParameterProperties withScheduleParameters(
        List<ScheduleCreationParameter> scheduleParameters) {
        this.scheduleParameters = scheduleParameters;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (bulkCreationParameters() != null) {
            bulkCreationParameters().validate();
        }
        if (artifacts() != null) {
            artifacts().forEach(e -> e.validate());
        }
        if (galleryImageReference() != null) {
            galleryImageReference().validate();
        }
        if (networkInterface() != null) {
            networkInterface().validate();
        }
        if (dataDiskParameters() != null) {
            dataDiskParameters().forEach(e -> e.validate());
        }
        if (scheduleParameters() != null) {
            scheduleParameters().forEach(e -> e.validate());
        }
    }
}