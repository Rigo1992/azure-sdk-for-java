// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Error code of the provisioning failure.
 */
public final class ProvisioningErrorCode extends ExpandableStringEnum<ProvisioningErrorCode> {
    /**
     * Static value BadSourceType for ProvisioningErrorCode.
     */
    public static final ProvisioningErrorCode BAD_SOURCE_TYPE = fromString("BadSourceType");

    /**
     * Static value BadPIRSource for ProvisioningErrorCode.
     */
    public static final ProvisioningErrorCode BAD_PIRSOURCE = fromString("BadPIRSource");

    /**
     * Static value BadManagedImageSource for ProvisioningErrorCode.
     */
    public static final ProvisioningErrorCode BAD_MANAGED_IMAGE_SOURCE = fromString("BadManagedImageSource");

    /**
     * Static value BadSharedImageVersionSource for ProvisioningErrorCode.
     */
    public static final ProvisioningErrorCode BAD_SHARED_IMAGE_VERSION_SOURCE
        = fromString("BadSharedImageVersionSource");

    /**
     * Static value BadCustomizerType for ProvisioningErrorCode.
     */
    public static final ProvisioningErrorCode BAD_CUSTOMIZER_TYPE = fromString("BadCustomizerType");

    /**
     * Static value UnsupportedCustomizerType for ProvisioningErrorCode.
     */
    public static final ProvisioningErrorCode UNSUPPORTED_CUSTOMIZER_TYPE = fromString("UnsupportedCustomizerType");

    /**
     * Static value NoCustomizerScript for ProvisioningErrorCode.
     */
    public static final ProvisioningErrorCode NO_CUSTOMIZER_SCRIPT = fromString("NoCustomizerScript");

    /**
     * Static value BadValidatorType for ProvisioningErrorCode.
     */
    public static final ProvisioningErrorCode BAD_VALIDATOR_TYPE = fromString("BadValidatorType");

    /**
     * Static value UnsupportedValidatorType for ProvisioningErrorCode.
     */
    public static final ProvisioningErrorCode UNSUPPORTED_VALIDATOR_TYPE = fromString("UnsupportedValidatorType");

    /**
     * Static value NoValidatorScript for ProvisioningErrorCode.
     */
    public static final ProvisioningErrorCode NO_VALIDATOR_SCRIPT = fromString("NoValidatorScript");

    /**
     * Static value BadDistributeType for ProvisioningErrorCode.
     */
    public static final ProvisioningErrorCode BAD_DISTRIBUTE_TYPE = fromString("BadDistributeType");

    /**
     * Static value BadSharedImageDistribute for ProvisioningErrorCode.
     */
    public static final ProvisioningErrorCode BAD_SHARED_IMAGE_DISTRIBUTE = fromString("BadSharedImageDistribute");

    /**
     * Static value BadStagingResourceGroup for ProvisioningErrorCode.
     */
    public static final ProvisioningErrorCode BAD_STAGING_RESOURCE_GROUP = fromString("BadStagingResourceGroup");

    /**
     * Static value ServerError for ProvisioningErrorCode.
     */
    public static final ProvisioningErrorCode SERVER_ERROR = fromString("ServerError");

    /**
     * Static value Other for ProvisioningErrorCode.
     */
    public static final ProvisioningErrorCode OTHER = fromString("Other");

    /**
     * Creates a new instance of ProvisioningErrorCode value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ProvisioningErrorCode() {
    }

    /**
     * Creates or finds a ProvisioningErrorCode from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ProvisioningErrorCode.
     */
    @JsonCreator
    public static ProvisioningErrorCode fromString(String name) {
        return fromString(name, ProvisioningErrorCode.class);
    }

    /**
     * Gets known ProvisioningErrorCode values.
     * 
     * @return known ProvisioningErrorCode values.
     */
    public static Collection<ProvisioningErrorCode> values() {
        return values(ProvisioningErrorCode.class);
    }
}
