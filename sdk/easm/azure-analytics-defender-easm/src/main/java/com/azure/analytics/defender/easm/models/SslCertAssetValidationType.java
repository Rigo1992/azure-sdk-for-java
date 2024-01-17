// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for SslCertAssetValidationType.
 */
public final class SslCertAssetValidationType extends ExpandableStringEnum<SslCertAssetValidationType> {

    /**
     * Static value domainValidation for SslCertAssetValidationType.
     */
    @Generated
    public static final SslCertAssetValidationType DOMAIN_VALIDATION = fromString("domainValidation");

    /**
     * Static value organizationValidation for SslCertAssetValidationType.
     */
    @Generated
    public static final SslCertAssetValidationType ORGANIZATION_VALIDATION = fromString("organizationValidation");

    /**
     * Static value extendedValidation for SslCertAssetValidationType.
     */
    @Generated
    public static final SslCertAssetValidationType EXTENDED_VALIDATION = fromString("extendedValidation");

    /**
     * Creates a new instance of SslCertAssetValidationType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public SslCertAssetValidationType() {
    }

    /**
     * Creates or finds a SslCertAssetValidationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SslCertAssetValidationType.
     */
    @Generated
    @JsonCreator
    public static SslCertAssetValidationType fromString(String name) {
        return fromString(name, SslCertAssetValidationType.class);
    }

    /**
     * Gets known SslCertAssetValidationType values.
     *
     * @return known SslCertAssetValidationType values.
     */
    @Generated
    public static Collection<SslCertAssetValidationType> values() {
        return values(SslCertAssetValidationType.class);
    }
}
