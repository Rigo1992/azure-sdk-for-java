// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The authentication types supported with Azure OpenAI On Your Data vector search.
 */
public final class OnYourDataVectorSearchAuthenticationType
    extends ExpandableStringEnum<OnYourDataVectorSearchAuthenticationType> {

    /**
     * Authentication via API key.
     */
    @Generated
    public static final OnYourDataVectorSearchAuthenticationType API_KEY = fromString("api_key");

    /**
     * Authentication via access token.
     */
    @Generated
    public static final OnYourDataVectorSearchAuthenticationType ACCESS_TOKEN = fromString("access_token");

    /**
     * Creates a new instance of OnYourDataVectorSearchAuthenticationType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public OnYourDataVectorSearchAuthenticationType() {
    }

    /**
     * Creates or finds a OnYourDataVectorSearchAuthenticationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OnYourDataVectorSearchAuthenticationType.
     */
    @Generated
    public static OnYourDataVectorSearchAuthenticationType fromString(String name) {
        return fromString(name, OnYourDataVectorSearchAuthenticationType.class);
    }

    /**
     * Gets known OnYourDataVectorSearchAuthenticationType values.
     *
     * @return known OnYourDataVectorSearchAuthenticationType values.
     */
    @Generated
    public static Collection<OnYourDataVectorSearchAuthenticationType> values() {
        return values(OnYourDataVectorSearchAuthenticationType.class);
    }
}
