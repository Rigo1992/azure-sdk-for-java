// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.messages;

import com.azure.communication.messages.implementation.MessageTemplateClientImpl;
import com.azure.communication.messages.models.MessageTemplateItem;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;

/**
 * Initializes a new instance of the synchronous MessageTemplateClient type.
 */
@ServiceClient(builder = MessageTemplateClientBuilder.class)
public final class MessageTemplateClient {

    @Generated
    private final MessageTemplateClientImpl serviceClient;

    /**
     * Initializes an instance of MessageTemplateClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    MessageTemplateClient(MessageTemplateClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * List all templates for given Azure Communication Services channel.
     * <p><strong>Query Parameters</strong></p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     * <tr><td>maxpagesize</td><td>Integer</td><td>No</td><td>Number of objects to return per page.</td></tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     kind: String(whatsApp) (Required)
     *     name: String (Required)
     *     language: String (Required)
     *     status: String(approved/rejected/pending/paused) (Required)
     * }
     * }</pre>
     *
     * @param channelId The registration ID of the channel.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return paged collection of MessageTemplateItem items as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> listTemplates(String channelId, RequestOptions requestOptions) {
        return this.serviceClient.listTemplates(channelId, requestOptions);
    }

    /**
     * List all templates for given Azure Communication Services channel.
     *
     * @param channelId The registration ID of the channel.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged collection of MessageTemplateItem items as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<MessageTemplateItem> listTemplates(String channelId) {
        // Generated convenience method for listTemplates
        RequestOptions requestOptions = new RequestOptions();
        return serviceClient.listTemplates(channelId, requestOptions)
            .mapPage(bodyItemValue -> bodyItemValue.toObject(MessageTemplateItem.class));
    }
}
