# Release History

## 1.1.0-beta.1 (Unreleased)

### Features Added

### Breaking Changes

### Bugs Fixed

### Other Changes

## 1.0.0 (2024-12-23)

- Azure Resource Manager AzureStack client library for Java. This package contains Microsoft Azure SDK for AzureStack Management SDK. Azure Stack. Package tag package-2022-06. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Other Changes

- Release for Azure Resource Manager AzureStack client library for Java.

## 1.0.0-beta.3 (2024-10-17)

- Azure Resource Manager AzureStack client library for Java. This package contains Microsoft Azure SDK for AzureStack Management SDK. Azure Stack. Package tag package-2022-06. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Features Added

#### `models.ProductLink` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DeviceConfiguration` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.VirtualMachineExtensionProductProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.OperationList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.CloudManifestFileProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.CloudManifestFileDeploymentData` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.RegistrationList` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.MarketplaceProductLogUpdate` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.Compatibility` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.ProductProperties` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.DeploymentLicenseRequest` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.OsDiskImage` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.Display` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.VirtualMachineProductProperties` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.DataDiskImage` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.RegistrationParameter` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

#### `models.IconUris` was modified

* `fromJson(com.azure.json.JsonReader)` was added
* `toJson(com.azure.json.JsonWriter)` was added

#### `models.CustomerSubscriptionList` was modified

* `toJson(com.azure.json.JsonWriter)` was added
* `fromJson(com.azure.json.JsonReader)` was added

## 1.0.0-beta.2 (2023-01-12)

- Azure Resource Manager AzureStack client library for Java. This package contains Microsoft Azure SDK for AzureStack Management SDK. Azure Stack. Package tag package-2022-06. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

* `models.LinkedSubscription$DefinitionStages` was removed

* `models.LinkedSubscriptionParameter` was removed

* `models.LinkedSubscription$Definition` was removed

* `models.LinkedSubscription$UpdateStages` was removed

* `models.LinkedSubscriptionsList` was removed

* `models.LinkedSubscription$Update` was removed

* `models.LinkedSubscription` was removed

* `models.LinkedSubscriptions` was removed

* `models.ExtendedProductProperties` was removed

#### `models.ExtendedProduct` was modified

* `versionPropertiesVersion()` was removed

#### `models.Product` was modified

* `systemData()` was removed

#### `models.Registration` was modified

* `systemData()` was removed
* `kind()` was removed

#### `models.CustomerSubscription` was modified

* `systemData()` was removed

#### `models.Registrations` was modified

* `deleteWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed

#### `AzureStackManager` was modified

* `linkedSubscriptions()` was removed

### Features Added

* `models.DeploymentLicenseResponse` was added

* `models.DeploymentLicenses` was added

* `models.DeploymentLicenseRequest` was added

#### `AzureStackManager$Configurable` was modified

* `withRetryOptions(com.azure.core.http.policy.RetryOptions)` was added
* `withScope(java.lang.String)` was added

#### `models.Registration` was modified

* `resourceGroupName()` was added

#### `models.Registrations` was modified

* `deleteByResourceGroupWithResponse(java.lang.String,java.lang.String,com.azure.core.util.Context)` was added
* `list(com.azure.core.util.Context)` was added
* `list()` was added

#### `models.Products` was modified

* `listProductsWithResponse(java.lang.String,java.lang.String,java.lang.String,models.DeviceConfiguration,com.azure.core.util.Context)` was added
* `listProducts(java.lang.String,java.lang.String,java.lang.String)` was added

#### `AzureStackManager` was modified

* `authenticate(com.azure.core.http.HttpPipeline,com.azure.core.management.profile.AzureProfile)` was added
* `deploymentLicenses()` was added

## 1.0.0-beta.1 (2021-04-12)

- Azure Resource Manager AzureStack client library for Java. This package contains Microsoft Azure SDK for AzureStack Management SDK. Azure Stack. Package tag package-preview-2020-06. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).
