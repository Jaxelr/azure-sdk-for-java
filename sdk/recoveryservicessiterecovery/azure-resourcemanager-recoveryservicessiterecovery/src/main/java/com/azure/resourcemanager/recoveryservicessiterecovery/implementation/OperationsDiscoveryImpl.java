// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.implementation;

import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.OperationsDiscoveryInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.Display;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.OperationsDiscovery;

public final class OperationsDiscoveryImpl implements OperationsDiscovery {
    private OperationsDiscoveryInner innerObject;

    private final com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager;

    OperationsDiscoveryImpl(
        OperationsDiscoveryInner innerObject,
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public Display display() {
        return this.innerModel().display();
    }

    public String origin() {
        return this.innerModel().origin();
    }

    public Object properties() {
        return this.innerModel().properties();
    }

    public OperationsDiscoveryInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager() {
        return this.serviceManager;
    }
}