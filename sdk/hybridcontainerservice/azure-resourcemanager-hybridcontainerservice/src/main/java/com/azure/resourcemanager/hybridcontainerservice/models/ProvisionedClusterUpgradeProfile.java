// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.hybridcontainerservice.fluent.models.ProvisionedClusterUpgradeProfileInner;
import java.util.List;

/**
 * An immutable client-side representation of ProvisionedClusterUpgradeProfile.
 */
public interface ProvisionedClusterUpgradeProfile {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the provisioningState property: Provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    ResourceProvisioningState provisioningState();

    /**
     * Gets the controlPlaneProfile property: The list of available upgrade versions for the control plane.
     * 
     * @return the controlPlaneProfile value.
     */
    ProvisionedClusterPoolUpgradeProfile controlPlaneProfile();

    /**
     * Gets the agentPoolProfiles property: The list of available upgrade versions for agent pools.
     * 
     * @return the agentPoolProfiles value.
     */
    List<ProvisionedClusterPoolUpgradeProfile> agentPoolProfiles();

    /**
     * Gets the inner
     * com.azure.resourcemanager.hybridcontainerservice.fluent.models.ProvisionedClusterUpgradeProfileInner object.
     * 
     * @return the inner object.
     */
    ProvisionedClusterUpgradeProfileInner innerModel();
}
