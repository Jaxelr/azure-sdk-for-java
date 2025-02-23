// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The integration service environment access endpoint type.
 */
public final class IntegrationServiceEnvironmentAccessEndpointType
    extends ExpandableStringEnum<IntegrationServiceEnvironmentAccessEndpointType> {
    /**
     * Static value NotSpecified for IntegrationServiceEnvironmentAccessEndpointType.
     */
    public static final IntegrationServiceEnvironmentAccessEndpointType NOT_SPECIFIED = fromString("NotSpecified");

    /**
     * Static value External for IntegrationServiceEnvironmentAccessEndpointType.
     */
    public static final IntegrationServiceEnvironmentAccessEndpointType EXTERNAL = fromString("External");

    /**
     * Static value Internal for IntegrationServiceEnvironmentAccessEndpointType.
     */
    public static final IntegrationServiceEnvironmentAccessEndpointType INTERNAL = fromString("Internal");

    /**
     * Creates a new instance of IntegrationServiceEnvironmentAccessEndpointType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public IntegrationServiceEnvironmentAccessEndpointType() {
    }

    /**
     * Creates or finds a IntegrationServiceEnvironmentAccessEndpointType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding IntegrationServiceEnvironmentAccessEndpointType.
     */
    public static IntegrationServiceEnvironmentAccessEndpointType fromString(String name) {
        return fromString(name, IntegrationServiceEnvironmentAccessEndpointType.class);
    }

    /**
     * Gets known IntegrationServiceEnvironmentAccessEndpointType values.
     * 
     * @return known IntegrationServiceEnvironmentAccessEndpointType values.
     */
    public static Collection<IntegrationServiceEnvironmentAccessEndpointType> values() {
        return values(IntegrationServiceEnvironmentAccessEndpointType.class);
    }
}
