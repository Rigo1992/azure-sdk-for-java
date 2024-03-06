// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.largeinstance.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Enum of available model types (each of which have their own storage / memory sizes) for an Azure Large Instance type.
 * See https://docs.microsoft.com/azure/sap/large-instances/hana-available-skus.
 */
public final class AzureLargeInstanceSizeNamesEnum extends ExpandableStringEnum<AzureLargeInstanceSizeNamesEnum> {
    /**
     * Static value S72m for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S72M = fromString("S72m");

    /**
     * Static value S144m for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S144M = fromString("S144m");

    /**
     * Static value S72 for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S72 = fromString("S72");

    /**
     * Static value S144 for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S144 = fromString("S144");

    /**
     * Static value S192 for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S192 = fromString("S192");

    /**
     * Static value S192m for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S192M = fromString("S192m");

    /**
     * Static value S192xm for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S192XM = fromString("S192xm");

    /**
     * Static value S96 for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S96 = fromString("S96");

    /**
     * Static value S112 for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S112 = fromString("S112");

    /**
     * Static value S224 for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S224 = fromString("S224");

    /**
     * Static value S224m for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S224M = fromString("S224m");

    /**
     * Static value S224om for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S224OM = fromString("S224om");

    /**
     * Static value S224oo for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S224OO = fromString("S224oo");

    /**
     * Static value S224oom for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S224OOM = fromString("S224oom");

    /**
     * Static value S224ooo for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S224OOO = fromString("S224ooo");

    /**
     * Static value S224se for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S224SE = fromString("S224se");

    /**
     * Static value S384 for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S384 = fromString("S384");

    /**
     * Static value S384m for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S384M = fromString("S384m");

    /**
     * Static value S384xm for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S384XM = fromString("S384xm");

    /**
     * Static value S384xxm for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S384XXM = fromString("S384xxm");

    /**
     * Static value S448 for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S448 = fromString("S448");

    /**
     * Static value S448m for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S448M = fromString("S448m");

    /**
     * Static value S448om for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S448OM = fromString("S448om");

    /**
     * Static value S448oo for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S448OO = fromString("S448oo");

    /**
     * Static value S448oom for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S448OOM = fromString("S448oom");

    /**
     * Static value S448ooo for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S448OOO = fromString("S448ooo");

    /**
     * Static value S448se for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S448SE = fromString("S448se");

    /**
     * Static value S576m for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S576M = fromString("S576m");

    /**
     * Static value S576xm for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S576XM = fromString("S576xm");

    /**
     * Static value S672 for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S672 = fromString("S672");

    /**
     * Static value S672m for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S672M = fromString("S672m");

    /**
     * Static value S672om for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S672OM = fromString("S672om");

    /**
     * Static value S672oo for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S672OO = fromString("S672oo");

    /**
     * Static value S672oom for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S672OOM = fromString("S672oom");

    /**
     * Static value S672ooo for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S672OOO = fromString("S672ooo");

    /**
     * Static value S768 for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S768 = fromString("S768");

    /**
     * Static value S768m for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S768M = fromString("S768m");

    /**
     * Static value S768xm for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S768XM = fromString("S768xm");

    /**
     * Static value S896 for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S896 = fromString("S896");

    /**
     * Static value S896m for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S896M = fromString("S896m");

    /**
     * Static value S896om for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S896OM = fromString("S896om");

    /**
     * Static value S896oo for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S896OO = fromString("S896oo");

    /**
     * Static value S896oom for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S896OOM = fromString("S896oom");

    /**
     * Static value S896ooo for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S896OOO = fromString("S896ooo");

    /**
     * Static value S960m for AzureLargeInstanceSizeNamesEnum.
     */
    public static final AzureLargeInstanceSizeNamesEnum S960M = fromString("S960m");

    /**
     * Creates a new instance of AzureLargeInstanceSizeNamesEnum value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AzureLargeInstanceSizeNamesEnum() {
    }

    /**
     * Creates or finds a AzureLargeInstanceSizeNamesEnum from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AzureLargeInstanceSizeNamesEnum.
     */
    @JsonCreator
    public static AzureLargeInstanceSizeNamesEnum fromString(String name) {
        return fromString(name, AzureLargeInstanceSizeNamesEnum.class);
    }

    /**
     * Gets known AzureLargeInstanceSizeNamesEnum values.
     * 
     * @return known AzureLargeInstanceSizeNamesEnum values.
     */
    public static Collection<AzureLargeInstanceSizeNamesEnum> values() {
        return values(AzureLargeInstanceSizeNamesEnum.class);
    }
}
