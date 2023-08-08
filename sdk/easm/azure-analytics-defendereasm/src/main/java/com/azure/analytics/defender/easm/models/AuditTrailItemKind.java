// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.defender.easm.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The kind of asset. */
public final class AuditTrailItemKind extends ExpandableStringEnum<AuditTrailItemKind> {
    /** Static value as for AuditTrailItemKind. */
    @Generated public static final AuditTrailItemKind AS = fromString("as");

    /** Static value contact for AuditTrailItemKind. */
    @Generated public static final AuditTrailItemKind CONTACT = fromString("contact");

    /** Static value domain for AuditTrailItemKind. */
    @Generated public static final AuditTrailItemKind DOMAIN = fromString("domain");

    /** Static value host for AuditTrailItemKind. */
    @Generated public static final AuditTrailItemKind HOST = fromString("host");

    /** Static value ipAddress for AuditTrailItemKind. */
    @Generated public static final AuditTrailItemKind IP_ADDRESS = fromString("ipAddress");

    /** Static value ipBlock for AuditTrailItemKind. */
    @Generated public static final AuditTrailItemKind IP_BLOCK = fromString("ipBlock");

    /** Static value page for AuditTrailItemKind. */
    @Generated public static final AuditTrailItemKind PAGE = fromString("page");

    /** Static value sslCert for AuditTrailItemKind. */
    @Generated public static final AuditTrailItemKind SSL_CERT = fromString("sslCert");

    /**
     * Creates a new instance of AuditTrailItemKind value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public AuditTrailItemKind() {}

    /**
     * Creates or finds a AuditTrailItemKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AuditTrailItemKind.
     */
    @Generated
    @JsonCreator
    public static AuditTrailItemKind fromString(String name) {
        return fromString(name, AuditTrailItemKind.class);
    }

    /**
     * Gets known AuditTrailItemKind values.
     *
     * @return known AuditTrailItemKind values.
     */
    @Generated
    public static Collection<AuditTrailItemKind> values() {
        return values(AuditTrailItemKind.class);
    }
}
