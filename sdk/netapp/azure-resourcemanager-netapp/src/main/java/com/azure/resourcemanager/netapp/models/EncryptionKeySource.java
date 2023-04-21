// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Source of key used to encrypt data in volume. Applicable if NetApp account has encryption.keySource =
 * 'Microsoft.KeyVault'. Possible values (case-insensitive) are: 'Microsoft.NetApp, Microsoft.KeyVault'.
 */
public final class EncryptionKeySource extends ExpandableStringEnum<EncryptionKeySource> {
    /** Static value Microsoft.NetApp for EncryptionKeySource. */
    public static final EncryptionKeySource MICROSOFT_NET_APP = fromString("Microsoft.NetApp");

    /** Static value Microsoft.KeyVault for EncryptionKeySource. */
    public static final EncryptionKeySource MICROSOFT_KEY_VAULT = fromString("Microsoft.KeyVault");

    /**
     * Creates a new instance of EncryptionKeySource value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public EncryptionKeySource() {
    }

    /**
     * Creates or finds a EncryptionKeySource from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EncryptionKeySource.
     */
    @JsonCreator
    public static EncryptionKeySource fromString(String name) {
        return fromString(name, EncryptionKeySource.class);
    }

    /**
     * Gets known EncryptionKeySource values.
     *
     * @return known EncryptionKeySource values.
     */
    public static Collection<EncryptionKeySource> values() {
        return values(EncryptionKeySource.class);
    }
}
