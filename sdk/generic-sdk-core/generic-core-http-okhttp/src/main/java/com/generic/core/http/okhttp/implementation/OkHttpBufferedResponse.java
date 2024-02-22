// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.generic.core.http.okhttp.implementation;

import com.generic.core.http.models.HttpRequest;
import com.generic.core.models.BinaryData;
import okhttp3.Response;

/**
 * An OkHttp response where the response body has been buffered into memory.
 */
public final class OkHttpBufferedResponse extends OkHttpResponseBase {
    public OkHttpBufferedResponse(Response response, HttpRequest request, byte[] body, boolean eagerlyConvertHeaders) {
        super(response, request, eagerlyConvertHeaders, body == null ? null : BinaryData.fromBytes(body));
    }
}
