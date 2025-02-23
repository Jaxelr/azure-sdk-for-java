// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Provisioning state of the resource.
 */
public final class EmailServicesProvisioningState extends ExpandableStringEnum<EmailServicesProvisioningState> {
    /**
     * Static value Unknown for EmailServicesProvisioningState.
     */
    public static final EmailServicesProvisioningState UNKNOWN = fromString("Unknown");

    /**
     * Static value Succeeded for EmailServicesProvisioningState.
     */
    public static final EmailServicesProvisioningState SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Failed for EmailServicesProvisioningState.
     */
    public static final EmailServicesProvisioningState FAILED = fromString("Failed");

    /**
     * Static value Canceled for EmailServicesProvisioningState.
     */
    public static final EmailServicesProvisioningState CANCELED = fromString("Canceled");

    /**
     * Static value Running for EmailServicesProvisioningState.
     */
    public static final EmailServicesProvisioningState RUNNING = fromString("Running");

    /**
     * Static value Creating for EmailServicesProvisioningState.
     */
    public static final EmailServicesProvisioningState CREATING = fromString("Creating");

    /**
     * Static value Updating for EmailServicesProvisioningState.
     */
    public static final EmailServicesProvisioningState UPDATING = fromString("Updating");

    /**
     * Static value Deleting for EmailServicesProvisioningState.
     */
    public static final EmailServicesProvisioningState DELETING = fromString("Deleting");

    /**
     * Static value Moving for EmailServicesProvisioningState.
     */
    public static final EmailServicesProvisioningState MOVING = fromString("Moving");

    /**
     * Creates a new instance of EmailServicesProvisioningState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public EmailServicesProvisioningState() {
    }

    /**
     * Creates or finds a EmailServicesProvisioningState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding EmailServicesProvisioningState.
     */
    public static EmailServicesProvisioningState fromString(String name) {
        return fromString(name, EmailServicesProvisioningState.class);
    }

    /**
     * Gets known EmailServicesProvisioningState values.
     * 
     * @return known EmailServicesProvisioningState values.
     */
    public static Collection<EmailServicesProvisioningState> values() {
        return values(EmailServicesProvisioningState.class);
    }
}
