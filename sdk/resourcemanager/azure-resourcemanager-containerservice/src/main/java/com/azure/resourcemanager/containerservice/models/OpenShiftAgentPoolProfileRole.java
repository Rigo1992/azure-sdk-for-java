// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** OpenShiftAgentPoolProfileRole represents the role of the AgentPoolProfile. */
public final class OpenShiftAgentPoolProfileRole extends ExpandableStringEnum<OpenShiftAgentPoolProfileRole> {
    /** Static value compute for OpenShiftAgentPoolProfileRole. */
    public static final OpenShiftAgentPoolProfileRole COMPUTE = fromString("compute");

    /** Static value infra for OpenShiftAgentPoolProfileRole. */
    public static final OpenShiftAgentPoolProfileRole INFRA = fromString("infra");

    /**
     * Creates a new instance of OpenShiftAgentPoolProfileRole value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public OpenShiftAgentPoolProfileRole() {
    }

    /**
     * Creates or finds a OpenShiftAgentPoolProfileRole from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OpenShiftAgentPoolProfileRole.
     */
    @JsonCreator
    public static OpenShiftAgentPoolProfileRole fromString(String name) {
        return fromString(name, OpenShiftAgentPoolProfileRole.class);
    }

    /**
     * Gets known OpenShiftAgentPoolProfileRole values.
     *
     * @return known OpenShiftAgentPoolProfileRole values.
     */
    public static Collection<OpenShiftAgentPoolProfileRole> values() {
        return values(OpenShiftAgentPoolProfileRole.class);
    }
}
