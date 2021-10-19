// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the policy for a monitored application upgrade. */
@Fluent
public final class ApplicationUpgradePolicy {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationUpgradePolicy.class);

    /*
     * The maximum amount of time to block processing of an upgrade domain and
     * prevent loss of availability when there are unexpected issues. When this
     * timeout expires, processing of the upgrade domain will proceed
     * regardless of availability loss issues. The timeout is reset at the
     * start of each upgrade domain. Valid values are between 0 and 42949672925
     * inclusive. (unsigned 32-bit integer).
     */
    @JsonProperty(value = "upgradeReplicaSetCheckTimeout")
    private String upgradeReplicaSetCheckTimeout;

    /*
     * If true, then processes are forcefully restarted during upgrade even
     * when the code version has not changed (the upgrade only changes
     * configuration or data).
     */
    @JsonProperty(value = "forceRestart")
    private Boolean forceRestart;

    /*
     * The policy used for monitoring the application upgrade
     */
    @JsonProperty(value = "rollingUpgradeMonitoringPolicy")
    private ArmRollingUpgradeMonitoringPolicy rollingUpgradeMonitoringPolicy;

    /*
     * Defines a health policy used to evaluate the health of an application or
     * one of its children entities.
     *
     */
    @JsonProperty(value = "applicationHealthPolicy")
    private ArmApplicationHealthPolicy applicationHealthPolicy;

    /*
     * The mode used to monitor health during a rolling upgrade. The values are
     * UnmonitoredAuto, UnmonitoredManual, and Monitored.
     */
    @JsonProperty(value = "upgradeMode")
    private RollingUpgradeMode upgradeMode;

    /*
     * Determines whether the application should be recreated on update. If
     * value=true, the rest of the upgrade policy parameters are not allowed
     * and it will result in availability loss.
     */
    @JsonProperty(value = "recreateApplication")
    private Boolean recreateApplication;

    /**
     * Get the upgradeReplicaSetCheckTimeout property: The maximum amount of time to block processing of an upgrade
     * domain and prevent loss of availability when there are unexpected issues. When this timeout expires, processing
     * of the upgrade domain will proceed regardless of availability loss issues. The timeout is reset at the start of
     * each upgrade domain. Valid values are between 0 and 42949672925 inclusive. (unsigned 32-bit integer).
     *
     * @return the upgradeReplicaSetCheckTimeout value.
     */
    public String upgradeReplicaSetCheckTimeout() {
        return this.upgradeReplicaSetCheckTimeout;
    }

    /**
     * Set the upgradeReplicaSetCheckTimeout property: The maximum amount of time to block processing of an upgrade
     * domain and prevent loss of availability when there are unexpected issues. When this timeout expires, processing
     * of the upgrade domain will proceed regardless of availability loss issues. The timeout is reset at the start of
     * each upgrade domain. Valid values are between 0 and 42949672925 inclusive. (unsigned 32-bit integer).
     *
     * @param upgradeReplicaSetCheckTimeout the upgradeReplicaSetCheckTimeout value to set.
     * @return the ApplicationUpgradePolicy object itself.
     */
    public ApplicationUpgradePolicy withUpgradeReplicaSetCheckTimeout(String upgradeReplicaSetCheckTimeout) {
        this.upgradeReplicaSetCheckTimeout = upgradeReplicaSetCheckTimeout;
        return this;
    }

    /**
     * Get the forceRestart property: If true, then processes are forcefully restarted during upgrade even when the code
     * version has not changed (the upgrade only changes configuration or data).
     *
     * @return the forceRestart value.
     */
    public Boolean forceRestart() {
        return this.forceRestart;
    }

    /**
     * Set the forceRestart property: If true, then processes are forcefully restarted during upgrade even when the code
     * version has not changed (the upgrade only changes configuration or data).
     *
     * @param forceRestart the forceRestart value to set.
     * @return the ApplicationUpgradePolicy object itself.
     */
    public ApplicationUpgradePolicy withForceRestart(Boolean forceRestart) {
        this.forceRestart = forceRestart;
        return this;
    }

    /**
     * Get the rollingUpgradeMonitoringPolicy property: The policy used for monitoring the application upgrade.
     *
     * @return the rollingUpgradeMonitoringPolicy value.
     */
    public ArmRollingUpgradeMonitoringPolicy rollingUpgradeMonitoringPolicy() {
        return this.rollingUpgradeMonitoringPolicy;
    }

    /**
     * Set the rollingUpgradeMonitoringPolicy property: The policy used for monitoring the application upgrade.
     *
     * @param rollingUpgradeMonitoringPolicy the rollingUpgradeMonitoringPolicy value to set.
     * @return the ApplicationUpgradePolicy object itself.
     */
    public ApplicationUpgradePolicy withRollingUpgradeMonitoringPolicy(
        ArmRollingUpgradeMonitoringPolicy rollingUpgradeMonitoringPolicy) {
        this.rollingUpgradeMonitoringPolicy = rollingUpgradeMonitoringPolicy;
        return this;
    }

    /**
     * Get the applicationHealthPolicy property: Defines a health policy used to evaluate the health of an application
     * or one of its children entities.
     *
     * @return the applicationHealthPolicy value.
     */
    public ArmApplicationHealthPolicy applicationHealthPolicy() {
        return this.applicationHealthPolicy;
    }

    /**
     * Set the applicationHealthPolicy property: Defines a health policy used to evaluate the health of an application
     * or one of its children entities.
     *
     * @param applicationHealthPolicy the applicationHealthPolicy value to set.
     * @return the ApplicationUpgradePolicy object itself.
     */
    public ApplicationUpgradePolicy withApplicationHealthPolicy(ArmApplicationHealthPolicy applicationHealthPolicy) {
        this.applicationHealthPolicy = applicationHealthPolicy;
        return this;
    }

    /**
     * Get the upgradeMode property: The mode used to monitor health during a rolling upgrade. The values are
     * UnmonitoredAuto, UnmonitoredManual, and Monitored.
     *
     * @return the upgradeMode value.
     */
    public RollingUpgradeMode upgradeMode() {
        return this.upgradeMode;
    }

    /**
     * Set the upgradeMode property: The mode used to monitor health during a rolling upgrade. The values are
     * UnmonitoredAuto, UnmonitoredManual, and Monitored.
     *
     * @param upgradeMode the upgradeMode value to set.
     * @return the ApplicationUpgradePolicy object itself.
     */
    public ApplicationUpgradePolicy withUpgradeMode(RollingUpgradeMode upgradeMode) {
        this.upgradeMode = upgradeMode;
        return this;
    }

    /**
     * Get the recreateApplication property: Determines whether the application should be recreated on update. If
     * value=true, the rest of the upgrade policy parameters are not allowed and it will result in availability loss.
     *
     * @return the recreateApplication value.
     */
    public Boolean recreateApplication() {
        return this.recreateApplication;
    }

    /**
     * Set the recreateApplication property: Determines whether the application should be recreated on update. If
     * value=true, the rest of the upgrade policy parameters are not allowed and it will result in availability loss.
     *
     * @param recreateApplication the recreateApplication value to set.
     * @return the ApplicationUpgradePolicy object itself.
     */
    public ApplicationUpgradePolicy withRecreateApplication(Boolean recreateApplication) {
        this.recreateApplication = recreateApplication;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (rollingUpgradeMonitoringPolicy() != null) {
            rollingUpgradeMonitoringPolicy().validate();
        }
        if (applicationHealthPolicy() != null) {
            applicationHealthPolicy().validate();
        }
    }
}
