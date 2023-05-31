// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import java.time.OffsetDateTime;

/** Parameters to indicate the information about the restore. */
@Fluent
public final class ResourceRestoreParameters extends RestoreParametersBase {
    /** Creates an instance of ResourceRestoreParameters class. */
    public ResourceRestoreParameters() {
    }

    /** {@inheritDoc} */
    @Override
    public ResourceRestoreParameters withRestoreSource(String restoreSource) {
        super.withRestoreSource(restoreSource);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ResourceRestoreParameters withRestoreTimestampInUtc(OffsetDateTime restoreTimestampInUtc) {
        super.withRestoreTimestampInUtc(restoreTimestampInUtc);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
