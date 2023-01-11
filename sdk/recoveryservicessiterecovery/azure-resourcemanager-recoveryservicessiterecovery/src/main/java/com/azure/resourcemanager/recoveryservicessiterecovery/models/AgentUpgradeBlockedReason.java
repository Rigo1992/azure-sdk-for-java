// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AgentUpgradeBlockedReason. */
public final class AgentUpgradeBlockedReason extends ExpandableStringEnum<AgentUpgradeBlockedReason> {
    /** Static value AlreadyOnLatestVersion for AgentUpgradeBlockedReason. */
    public static final AgentUpgradeBlockedReason ALREADY_ON_LATEST_VERSION = fromString("AlreadyOnLatestVersion");

    /** Static value RebootRequired for AgentUpgradeBlockedReason. */
    public static final AgentUpgradeBlockedReason REBOOT_REQUIRED = fromString("RebootRequired");

    /** Static value AgentNoHeartbeat for AgentUpgradeBlockedReason. */
    public static final AgentUpgradeBlockedReason AGENT_NO_HEARTBEAT = fromString("AgentNoHeartbeat");

    /** Static value RcmProxyNoHeartbeat for AgentUpgradeBlockedReason. */
    public static final AgentUpgradeBlockedReason RCM_PROXY_NO_HEARTBEAT = fromString("RcmProxyNoHeartbeat");

    /** Static value ProcessServerNoHeartbeat for AgentUpgradeBlockedReason. */
    public static final AgentUpgradeBlockedReason PROCESS_SERVER_NO_HEARTBEAT = fromString("ProcessServerNoHeartbeat");

    /** Static value IncompatibleApplianceVersion for AgentUpgradeBlockedReason. */
    public static final AgentUpgradeBlockedReason INCOMPATIBLE_APPLIANCE_VERSION =
        fromString("IncompatibleApplianceVersion");

    /** Static value NotProtected for AgentUpgradeBlockedReason. */
    public static final AgentUpgradeBlockedReason NOT_PROTECTED = fromString("NotProtected");

    /** Static value UnsupportedProtectionScenario for AgentUpgradeBlockedReason. */
    public static final AgentUpgradeBlockedReason UNSUPPORTED_PROTECTION_SCENARIO =
        fromString("UnsupportedProtectionScenario");

    /** Static value DistroIsNotReported for AgentUpgradeBlockedReason. */
    public static final AgentUpgradeBlockedReason DISTRO_IS_NOT_REPORTED = fromString("DistroIsNotReported");

    /** Static value DistroNotSupportedForUpgrade for AgentUpgradeBlockedReason. */
    public static final AgentUpgradeBlockedReason DISTRO_NOT_SUPPORTED_FOR_UPGRADE =
        fromString("DistroNotSupportedForUpgrade");

    /** Static value MissingUpgradePath for AgentUpgradeBlockedReason. */
    public static final AgentUpgradeBlockedReason MISSING_UPGRADE_PATH = fromString("MissingUpgradePath");

    /** Static value InvalidAgentVersion for AgentUpgradeBlockedReason. */
    public static final AgentUpgradeBlockedReason INVALID_AGENT_VERSION = fromString("InvalidAgentVersion");

    /** Static value InvalidDriverVersion for AgentUpgradeBlockedReason. */
    public static final AgentUpgradeBlockedReason INVALID_DRIVER_VERSION = fromString("InvalidDriverVersion");

    /** Static value Unknown for AgentUpgradeBlockedReason. */
    public static final AgentUpgradeBlockedReason UNKNOWN = fromString("Unknown");

    /**
     * Creates or finds a AgentUpgradeBlockedReason from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AgentUpgradeBlockedReason.
     */
    @JsonCreator
    public static AgentUpgradeBlockedReason fromString(String name) {
        return fromString(name, AgentUpgradeBlockedReason.class);
    }

    /**
     * Gets known AgentUpgradeBlockedReason values.
     *
     * @return known AgentUpgradeBlockedReason values.
     */
    public static Collection<AgentUpgradeBlockedReason> values() {
        return values(AgentUpgradeBlockedReason.class);
    }
}
