// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.administration.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The type specifier of the value.
 */
public final class KeyVaultSettingType extends ExpandableStringEnum<KeyVaultSettingType> {
    /**
     * Static value boolean for KeyVaultSettingType.
     */
    public static final KeyVaultSettingType BOOLEAN = fromString("boolean");

    /**
     * Creates a new instance of KeyVaultSettingType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public KeyVaultSettingType() {
    }

    /**
     * Creates or finds a KeyVaultSettingType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding KeyVaultSettingType.
     */
    public static KeyVaultSettingType fromString(String name) {
        return fromString(name, KeyVaultSettingType.class);
    }

    /**
     * Gets known KeyVaultSettingType values.
     * 
     * @return known KeyVaultSettingType values.
     */
    public static Collection<KeyVaultSettingType> values() {
        return values(KeyVaultSettingType.class);
    }
}
