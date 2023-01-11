// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The location of ftp server dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("FtpServerLocation")
@Fluent
public final class FtpServerLocation extends DatasetLocation {
    /** Creates an instance of FtpServerLocation class. */
    public FtpServerLocation() {}

    /** {@inheritDoc} */
    @Override
    public FtpServerLocation setFolderPath(Object folderPath) {
        super.setFolderPath(folderPath);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FtpServerLocation setFileName(Object fileName) {
        super.setFileName(fileName);
        return this;
    }
}
