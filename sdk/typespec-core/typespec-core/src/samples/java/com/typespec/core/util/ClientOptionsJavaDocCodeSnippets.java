// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.typespec.core.util;

import java.util.Collections;

/**
 * Codesnippets for {@link ClientOptions}.
 */
public class ClientOptionsJavaDocCodeSnippets {
    /**
     * Codesnippets for {@link ClientOptions#setApplicationId(String)}.
     */
    public void setApplicationId() {
        // BEGIN: com.typespec.core.util.ClientOptions.setApplicationId#String
        ClientOptions clientOptions = new ClientOptions()
            .setApplicationId("myApplicationId");
        // END: com.typespec.core.util.ClientOptions.setApplicationId#String
    }

    /**
     * Codesnippets for {@link ClientOptions#setHeaders(Iterable)}.
     */
    public void setHeaders() {
        // BEGIN: com.typespec.core.util.ClientOptions.setHeaders#Iterable
        ClientOptions clientOptions = new ClientOptions()
            .setHeaders(Collections.singletonList(new Header("myCustomHeader", "myStaticValue")));
        // END: com.typespec.core.util.ClientOptions.setHeaders#Iterable
    }
}
