// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.fluent.models.ApplicationStackResourceInner;
import com.azure.resourcemanager.appservice.fluent.models.CsmOperationDescriptionInner;
import com.azure.resourcemanager.appservice.fluent.models.FunctionAppStackInner;
import com.azure.resourcemanager.appservice.fluent.models.WebAppStackInner;
import com.azure.resourcemanager.appservice.models.ProviderOsTypeSelected;
import com.azure.resourcemanager.appservice.models.ProviderStackOsType;

/** An instance of this class provides access to all the operations defined in ProvidersClient. */
public interface ProvidersClient {
    /**
     * Description for Get available application frameworks and their versions.
     *
     * @param osTypeSelected The osTypeSelected parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Application Stacks as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ApplicationStackResourceInner> getAvailableStacksAsync(ProviderOsTypeSelected osTypeSelected);

    /**
     * Description for Get available application frameworks and their versions.
     *
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Application Stacks as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ApplicationStackResourceInner> getAvailableStacksAsync();

    /**
     * Description for Get available application frameworks and their versions.
     *
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Application Stacks as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApplicationStackResourceInner> getAvailableStacks();

    /**
     * Description for Get available application frameworks and their versions.
     *
     * @param osTypeSelected The osTypeSelected parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Application Stacks as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApplicationStackResourceInner> getAvailableStacks(
        ProviderOsTypeSelected osTypeSelected, Context context);

    /**
     * Description for Get available Function app frameworks and their versions.
     *
     * @param stackOsType Stack OS Type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Function app Stacks as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<FunctionAppStackInner> getFunctionAppStacksAsync(ProviderStackOsType stackOsType);

    /**
     * Description for Get available Function app frameworks and their versions.
     *
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Function app Stacks as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<FunctionAppStackInner> getFunctionAppStacksAsync();

    /**
     * Description for Get available Function app frameworks and their versions.
     *
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Function app Stacks as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FunctionAppStackInner> getFunctionAppStacks();

    /**
     * Description for Get available Function app frameworks and their versions.
     *
     * @param stackOsType Stack OS Type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Function app Stacks as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FunctionAppStackInner> getFunctionAppStacks(ProviderStackOsType stackOsType, Context context);

    /**
     * Description for Get available Function app frameworks and their versions for location.
     *
     * @param location Function App stack location.
     * @param stackOsType Stack OS Type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Function app Stacks as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<FunctionAppStackInner> getFunctionAppStacksForLocationAsync(
        String location, ProviderStackOsType stackOsType);

    /**
     * Description for Get available Function app frameworks and their versions for location.
     *
     * @param location Function App stack location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Function app Stacks as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<FunctionAppStackInner> getFunctionAppStacksForLocationAsync(String location);

    /**
     * Description for Get available Function app frameworks and their versions for location.
     *
     * @param location Function App stack location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Function app Stacks as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FunctionAppStackInner> getFunctionAppStacksForLocation(String location);

    /**
     * Description for Get available Function app frameworks and their versions for location.
     *
     * @param location Function App stack location.
     * @param stackOsType Stack OS Type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Function app Stacks as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FunctionAppStackInner> getFunctionAppStacksForLocation(
        String location, ProviderStackOsType stackOsType, Context context);

    /**
     * Description for Get available Web app frameworks and their versions for location.
     *
     * @param location Web App stack location.
     * @param stackOsType Stack OS Type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Web app Stacks as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<WebAppStackInner> getWebAppStacksForLocationAsync(String location, ProviderStackOsType stackOsType);

    /**
     * Description for Get available Web app frameworks and their versions for location.
     *
     * @param location Web App stack location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Web app Stacks as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<WebAppStackInner> getWebAppStacksForLocationAsync(String location);

    /**
     * Description for Get available Web app frameworks and their versions for location.
     *
     * @param location Web App stack location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Web app Stacks as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WebAppStackInner> getWebAppStacksForLocation(String location);

    /**
     * Description for Get available Web app frameworks and their versions for location.
     *
     * @param location Web App stack location.
     * @param stackOsType Stack OS Type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Web app Stacks as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WebAppStackInner> getWebAppStacksForLocation(
        String location, ProviderStackOsType stackOsType, Context context);

    /**
     * Description for Gets all available operations for the Microsoft.Web resource provider. Also exposes resource
     * metric definitions.
     *
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Azure resource manager operation metadata as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<CsmOperationDescriptionInner> listOperationsAsync();

    /**
     * Description for Gets all available operations for the Microsoft.Web resource provider. Also exposes resource
     * metric definitions.
     *
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Azure resource manager operation metadata as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CsmOperationDescriptionInner> listOperations();

    /**
     * Description for Gets all available operations for the Microsoft.Web resource provider. Also exposes resource
     * metric definitions.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Azure resource manager operation metadata as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CsmOperationDescriptionInner> listOperations(Context context);

    /**
     * Description for Get available Web app frameworks and their versions.
     *
     * @param stackOsType Stack OS Type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Web app Stacks as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<WebAppStackInner> getWebAppStacksAsync(ProviderStackOsType stackOsType);

    /**
     * Description for Get available Web app frameworks and their versions.
     *
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Web app Stacks as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<WebAppStackInner> getWebAppStacksAsync();

    /**
     * Description for Get available Web app frameworks and their versions.
     *
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Web app Stacks as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WebAppStackInner> getWebAppStacks();

    /**
     * Description for Get available Web app frameworks and their versions.
     *
     * @param stackOsType Stack OS Type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Web app Stacks as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<WebAppStackInner> getWebAppStacks(ProviderStackOsType stackOsType, Context context);

    /**
     * Description for Get available application frameworks and their versions.
     *
     * @param osTypeSelected The osTypeSelected parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Application Stacks as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ApplicationStackResourceInner> listAsync(ProviderOsTypeSelected osTypeSelected);

    /**
     * Description for Get available application frameworks and their versions.
     *
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Application Stacks as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ApplicationStackResourceInner> listAsync();

    /**
     * Description for Get available application frameworks and their versions.
     *
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Application Stacks as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApplicationStackResourceInner> list();

    /**
     * Description for Get available application frameworks and their versions.
     *
     * @param osTypeSelected The osTypeSelected parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Application Stacks as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApplicationStackResourceInner> list(ProviderOsTypeSelected osTypeSelected, Context context);
}
