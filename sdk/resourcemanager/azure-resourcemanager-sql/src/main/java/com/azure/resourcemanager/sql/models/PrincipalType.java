// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Principal Type of the sever administrator. */
public final class PrincipalType extends ExpandableStringEnum<PrincipalType> {
    /** Static value User for PrincipalType. */
    public static final PrincipalType USER = fromString("User");

    /** Static value Group for PrincipalType. */
    public static final PrincipalType GROUP = fromString("Group");

    /** Static value Application for PrincipalType. */
    public static final PrincipalType APPLICATION = fromString("Application");

    /**
     * Creates or finds a PrincipalType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PrincipalType.
     */
    @JsonCreator
    public static PrincipalType fromString(String name) {
        return fromString(name, PrincipalType.class);
    }

    /**
     * Gets known PrincipalType values.
     *
     * @return known PrincipalType values.
     */
    public static Collection<PrincipalType> values() {
        return values(PrincipalType.class);
    }
}