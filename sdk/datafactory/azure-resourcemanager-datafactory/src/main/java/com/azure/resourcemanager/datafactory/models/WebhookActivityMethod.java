// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The list of HTTP methods supported by a WebHook activity.
 */
public final class WebhookActivityMethod extends ExpandableStringEnum<WebhookActivityMethod> {
    /**
     * Static value POST for WebhookActivityMethod.
     */
    public static final WebhookActivityMethod POST = fromString("POST");

    /**
     * Creates a new instance of WebhookActivityMethod value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public WebhookActivityMethod() {
    }

    /**
     * Creates or finds a WebhookActivityMethod from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding WebhookActivityMethod.
     */
    @JsonCreator
    public static WebhookActivityMethod fromString(String name) {
        return fromString(name, WebhookActivityMethod.class);
    }

    /**
     * Gets known WebhookActivityMethod values.
     * 
     * @return known WebhookActivityMethod values.
     */
    public static Collection<WebhookActivityMethod> values() {
        return values(WebhookActivityMethod.class);
    }
}
