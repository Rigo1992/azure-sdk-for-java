// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The type of the environment data. */
public final class EnvironmentType extends ExpandableStringEnum<EnvironmentType> {
    /** Static value AwsAccount for EnvironmentType. */
    public static final EnvironmentType AWS_ACCOUNT = fromString("AwsAccount");

    /** Static value GcpProject for EnvironmentType. */
    public static final EnvironmentType GCP_PROJECT = fromString("GcpProject");

    /** Static value GithubScope for EnvironmentType. */
    public static final EnvironmentType GITHUB_SCOPE = fromString("GithubScope");

    /** Static value AzureDevOpsScope for EnvironmentType. */
    public static final EnvironmentType AZURE_DEV_OPS_SCOPE = fromString("AzureDevOpsScope");

    /**
     * Creates a new instance of EnvironmentType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public EnvironmentType() {
    }

    /**
     * Creates or finds a EnvironmentType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EnvironmentType.
     */
    @JsonCreator
    public static EnvironmentType fromString(String name) {
        return fromString(name, EnvironmentType.class);
    }

    /**
     * Gets known EnvironmentType values.
     *
     * @return known EnvironmentType values.
     */
    public static Collection<EnvironmentType> values() {
        return values(EnvironmentType.class);
    }
}
