// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Tactic of the assessment. */
public final class Tactics extends ExpandableStringEnum<Tactics> {
    /** Static value Reconnaissance for Tactics. */
    public static final Tactics RECONNAISSANCE = fromString("Reconnaissance");

    /** Static value Resource Development for Tactics. */
    public static final Tactics RESOURCE_DEVELOPMENT = fromString("Resource Development");

    /** Static value Initial Access for Tactics. */
    public static final Tactics INITIAL_ACCESS = fromString("Initial Access");

    /** Static value Execution for Tactics. */
    public static final Tactics EXECUTION = fromString("Execution");

    /** Static value Persistence for Tactics. */
    public static final Tactics PERSISTENCE = fromString("Persistence");

    /** Static value Privilege Escalation for Tactics. */
    public static final Tactics PRIVILEGE_ESCALATION = fromString("Privilege Escalation");

    /** Static value Defense Evasion for Tactics. */
    public static final Tactics DEFENSE_EVASION = fromString("Defense Evasion");

    /** Static value Credential Access for Tactics. */
    public static final Tactics CREDENTIAL_ACCESS = fromString("Credential Access");

    /** Static value Discovery for Tactics. */
    public static final Tactics DISCOVERY = fromString("Discovery");

    /** Static value Lateral Movement for Tactics. */
    public static final Tactics LATERAL_MOVEMENT = fromString("Lateral Movement");

    /** Static value Collection for Tactics. */
    public static final Tactics COLLECTION = fromString("Collection");

    /** Static value Command and Control for Tactics. */
    public static final Tactics COMMAND_AND_CONTROL = fromString("Command and Control");

    /** Static value Exfiltration for Tactics. */
    public static final Tactics EXFILTRATION = fromString("Exfiltration");

    /** Static value Impact for Tactics. */
    public static final Tactics IMPACT = fromString("Impact");

    /**
     * Creates a new instance of Tactics value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public Tactics() {
    }

    /**
     * Creates or finds a Tactics from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Tactics.
     */
    @JsonCreator
    public static Tactics fromString(String name) {
        return fromString(name, Tactics.class);
    }

    /**
     * Gets known Tactics values.
     *
     * @return known Tactics values.
     */
    public static Collection<Tactics> values() {
        return values(Tactics.class);
    }
}
