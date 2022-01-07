// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry;

import com.azure.containers.containerregistry.implementation.ArtifactTagPropertiesHelper;
import com.azure.containers.containerregistry.implementation.ContainerRegistriesImpl;
import com.azure.containers.containerregistry.implementation.AzureContainerRegistryImpl;
import com.azure.containers.containerregistry.implementation.AzureContainerRegistryImplBuilder;
import com.azure.containers.containerregistry.implementation.models.ManifestWriteableProperties;
import com.azure.containers.containerregistry.implementation.models.TagAttributesBase;
import com.azure.containers.containerregistry.implementation.models.TagWriteableProperties;
import com.azure.containers.containerregistry.models.ArtifactManifestProperties;
import com.azure.containers.containerregistry.models.ArtifactTagOrder;
import com.azure.containers.containerregistry.models.ArtifactTagProperties;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import reactor.core.publisher.Mono;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static com.azure.containers.containerregistry.Utils.CONTAINER_REGISTRY_TRACING_NAMESPACE_VALUE;
import static com.azure.core.util.FluxUtil.monoError;
import static com.azure.core.util.FluxUtil.withContext;
import static com.azure.core.util.tracing.Tracer.AZ_TRACING_NAMESPACE_KEY;

/**
 * This class provides a helper type that contains all the operations for artifacts in a given repository.
 *
 * <p><strong>Instantiating an asynchronous RegistryArtifact helper.</strong></p>
 *
 * <!-- src_embed com.azure.containers.containerregistry.RegistryArtifactAsync.instantiation -->
 * <pre>
 * RegistryArtifactAsync registryArtifactAsync = new ContainerRegistryClientBuilder&#40;&#41;
 *     .endpoint&#40;endpoint&#41;
 *     .credential&#40;credential&#41;
 *     .audience&#40;ContainerRegistryAudience.AZURE_RESOURCE_MANAGER_PUBLIC_CLOUD&#41;
 *     .buildAsyncClient&#40;&#41;.getArtifact&#40;repository, digest&#41;;
 * </pre>
 * <!-- end com.azure.containers.containerregistry.RegistryArtifactAsync.instantiation -->
 *
 * <p>View {@link ContainerRegistryClientBuilder this} for additional ways to construct the client.</p>
 *
 * @see ContainerRegistryClientBuilder
 */
@ServiceClient(builder = ContainerRegistryClientBuilder.class, isAsync = true)
public final class RegistryArtifactAsync {
    private final ContainerRegistriesImpl serviceClient;
    private final String repositoryName;
    private final String fullyQualifiedReference;
    private final String endpoint;
    private final String apiVersion;
    private final String tagOrDigest;
    private String digest;

    private final ClientLogger logger = new ClientLogger(RegistryArtifactAsync.class);

    /**
     * Creates a RegistryArtifactAsync type that sends requests to the given repository in the container registry service at {@code endpoint}.
     * Each service call goes through the {@code pipeline}.
     * @param repositoryName The name of the repository on which the service operations are performed.
     * @param tagOrDigest The tag or digest associated with the given artifact.
     * @param endpoint The URL string for the Azure Container Registry service.
     * @param httpPipeline HttpPipeline that the HTTP requests and responses flow through.
     * @param version {@link ContainerRegistryServiceVersion} of the service to be used when making requests.
     */
    RegistryArtifactAsync(String repositoryName, String tagOrDigest, HttpPipeline httpPipeline, String endpoint, String version) {
        if (repositoryName == null) {
            throw logger.logExceptionAsError(new NullPointerException("'repositoryName' can't be null"));
        }

        if (repositoryName.isEmpty()) {
            throw logger.logExceptionAsError(new IllegalArgumentException("'repositoryName' can't be empty"));
        }

        if (tagOrDigest == null) {
            throw logger.logExceptionAsError(new NullPointerException("'digest' can't be null"));
        }

        if (tagOrDigest.isEmpty()) {
            throw logger.logExceptionAsError(new IllegalArgumentException("'digest' can't be empty"));
        }

        AzureContainerRegistryImpl registryImpl = new AzureContainerRegistryImplBuilder()
            .pipeline(httpPipeline)
            .url(endpoint)
            .apiVersion(version)
            .buildClient();

        this.endpoint = endpoint;
        this.repositoryName = repositoryName;
        this.tagOrDigest = tagOrDigest;

        try {
            URL endpointUrl = new URL(endpoint);
            this.fullyQualifiedReference = endpointUrl.getHost() + "/" + this.repositoryName + (isDigest(tagOrDigest) ? "@" : ":") + tagOrDigest;
        } catch (MalformedURLException ex) {
            // This will not happen.
            throw logger.logExceptionAsWarning(new IllegalArgumentException("'endpoint' must be a valid URL"));
        }

        this.serviceClient = registryImpl.getContainerRegistries();
        this.apiVersion = version;
    }

    /**
     * Gets the Azure Container Registry service endpoint for the current instance.
     * @return The service endpoint for the current instance.
     */
    public String getRegistryEndpoint() {
        return this.endpoint;
    }

    /**
     * Gets the fully qualified reference for the current instance.
     * The fully qualifiedName is of the form 'registryName/repositoryName@digest'
     * or 'registryName/repositoryName:tag' based on the docker naming convention and whether
     * tag or digest was supplied to the constructor.
     * @return Fully qualified reference of the current instance.
     * */
    public String getFullyQualifiedReference() {

        return this.fullyQualifiedReference;
    }

    /**
     * Gets the repository name for the current instance.
     * Gets the repository name for the current instance.
     * @return Name of the repository for the current instance.
     * */
    public String getRepositoryName() {
        return this.repositoryName;
    }

    private boolean isDigest(String tagOrDigest) {
        return tagOrDigest.contains(":");
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<String> getDigestMono() {
        if (this.digest != null) {
            return Mono.just(digest);
        }

        Mono<String> getTagMono = isDigest(tagOrDigest)
            ? Mono.just(tagOrDigest)
            : this.getTagProperties(tagOrDigest).map(a -> a.getDigest());

        return getTagMono.flatMap(res -> {
            this.digest = res;
            return Mono.just(res);
        });
    }

    /**
     * Deletes the registry artifact with the matching digest in the given {@link #getRepositoryName() respository.}
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Delete the registry artifact.</p>
     *
     * <!-- src_embed com.azure.containers.containerregistry.RegistryArtifactAsync.deleteWithResponse -->
     * <pre>
     * client.deleteWithResponse&#40;&#41;.subscribe&#40;&#41;;
     * </pre>
     * <!-- end com.azure.containers.containerregistry.RegistryArtifactAsync.deleteWithResponse -->
     *
     * @return A REST response with completion signal.
     * @throws ClientAuthenticationException thrown if the client does not have access to the repository.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponse() {
        return withContext(context -> this.deleteWithResponse(context));
    }

    Mono<Response<Void>> deleteWithResponse(Context context) {
        try {
            return this.getDigestMono()
                .flatMap(res -> this.serviceClient.deleteManifestWithResponseAsync(repositoryName, res, context.addData(AZ_TRACING_NAMESPACE_KEY, CONTAINER_REGISTRY_TRACING_NAMESPACE_VALUE)))
                .flatMap(Utils::deleteResponseToSuccess)
                .onErrorMap(Utils::mapException);
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Deletes the registry artifact with the matching digest in the given {@link #getRepositoryName() respository.}
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Delete the registry artifact.</p>
     *
     * <!-- src_embed com.azure.containers.containerregistry.RegistryArtifactAsync.delete -->
     * <pre>
     * client.delete&#40;&#41;.subscribe&#40;&#41;;
     * </pre>
     * <!-- end com.azure.containers.containerregistry.RegistryArtifactAsync.delete -->
     *
     * @return the completion.
     * @throws ClientAuthenticationException thrown if the client does not have access to the repository.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> delete() {
        return this.deleteWithResponse().flatMap(FluxUtil::toMono);
    }

    /**
     * Deletes the tag with the matching tag name for the given {@link #getRepositoryName() repository}.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Delete the tag for the given repository.</p>
     *
     * <!-- src_embed com.azure.containers.containerregistry.RegistryArtifactAsync.deleteTagWithResponse -->
     * <pre>
     * String tag = getTag&#40;&#41;;
     * client.deleteTagWithResponse&#40;tag&#41;.subscribe&#40;&#41;;
     * </pre>
     * <!-- end com.azure.containers.containerregistry.RegistryArtifactAsync.deleteTagWithResponse -->
     *
     * @param tag The name of the 'tag' that uniquely identifies the 'tag' that needs to be deleted.
     * @return A REST response with completion signal.
     * @throws ClientAuthenticationException thrown if the client does not have access to the repository.
     * @throws NullPointerException thrown if {@code tag} is null.
     * @throws IllegalArgumentException thrown if {@code tag} is empty.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteTagWithResponse(String tag) {
        return withContext(context -> this.deleteTagWithResponse(tag, context));
    }

    Mono<Response<Void>> deleteTagWithResponse(String tag, Context context) {
        try {
            if (tag == null) {
                return monoError(logger, new NullPointerException("'tag' cannot be null"));
            }
            if (tag.isEmpty()) {
                return monoError(logger, new IllegalArgumentException("'tag' cannot be empty."));
            }
            return this.serviceClient.deleteTagWithResponseAsync(repositoryName, tag, context.addData(AZ_TRACING_NAMESPACE_KEY, CONTAINER_REGISTRY_TRACING_NAMESPACE_VALUE))
                .flatMap(Utils::deleteResponseToSuccess)
                .onErrorMap(Utils::mapException);
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Deletes the tag with the matching tag name for the given {@link #getRepositoryName() repository}.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Delete the tag for the given repository.</p>
     *
     * <!-- src_embed com.azure.containers.containerregistry.RegistryArtifactAsync.deleteTag -->
     * <pre>
     * String tag = getTag&#40;&#41;;
     * client.deleteTag&#40;tag&#41;.subscribe&#40;&#41;;
     * </pre>
     * <!-- end com.azure.containers.containerregistry.RegistryArtifactAsync.deleteTag -->
     *
     * @param tag The name of the tag that uniquely identifies the tag that needs to be deleted.
     * @return The completion.
     * @throws ClientAuthenticationException thrown if the client does not have access to the repository.
     * @throws NullPointerException thrown if {@code tag} is null.
     * @throws IllegalArgumentException thrown if the {@code tag} is empty.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteTag(String tag) {
        return this.deleteTagWithResponse(tag).flatMap(FluxUtil::toMono);
    }

    /**
     * Gets the {@link ArtifactManifestProperties properties} associated with an artifact in given {@link #getRepositoryName() repository}.
     *
     * <p>This method can take in both a digest as well as a tag.<br>
     * In case a tag is provided it calls the service to get the digest associated with the given tag.</p>
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Get the properties for the given repository.</p>
     *
     * <!-- src_embed com.azure.containers.containerregistry.RegistryArtifactAsync.getManifestPropertiesWithResponse -->
     * <pre>
     * client.getManifestPropertiesWithResponse&#40;&#41;
     *     .subscribe&#40;response -&gt; &#123;
     *         final ArtifactManifestProperties properties = response.getValue&#40;&#41;;
     *         System.out.printf&#40;&quot;Digest:%s,&quot;, properties.getDigest&#40;&#41;&#41;;
     *     &#125;&#41;;
     * </pre>
     * <!-- end com.azure.containers.containerregistry.RegistryArtifactAsync.getManifestPropertiesWithResponse -->
     *
     * @return A REST response containing {@link ArtifactManifestProperties properties} associated with the given {@code Digest}.
     * @throws ClientAuthenticationException thrown if the client does not have access to the repository.
     * @throws ResourceNotFoundException thrown if the given digest was not found.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ArtifactManifestProperties>> getManifestPropertiesWithResponse() {
        return withContext(context -> this.getManifestPropertiesWithResponse(context));
    }

    Mono<Response<ArtifactManifestProperties>> getManifestPropertiesWithResponse(Context context) {
        try {
            return this.getDigestMono()
                .flatMap(res -> this.serviceClient.getManifestPropertiesWithResponseAsync(repositoryName, res, context.addData(AZ_TRACING_NAMESPACE_KEY, CONTAINER_REGISTRY_TRACING_NAMESPACE_VALUE)))
                .onErrorMap(Utils::mapException);
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Gets the {@link ArtifactManifestProperties properties} associated with an artifact in given {@link #getRepositoryName() repository}.
     *
     * <p>This method can take in both a digest as well as a tag.<br>
     * In case a tag is provided it calls the service to get the digest associated with the given tag.</p>
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Get the properties for the given repository.</p>
     *
     * <!-- src_embed com.azure.containers.containerregistry.RegistryArtifactAsync.getManifestProperties -->
     * <pre>
     * client.getManifestProperties&#40;&#41;
     *     .subscribe&#40;properties -&gt; &#123;
     *         System.out.printf&#40;&quot;Digest:%s,&quot;, properties.getDigest&#40;&#41;&#41;;
     *     &#125;&#41;;
     * </pre>
     * <!-- end com.azure.containers.containerregistry.RegistryArtifactAsync.getManifestProperties -->
     *
     * @return The {@link ArtifactManifestProperties properties} associated with the given {@code Digest}.
     * @throws ClientAuthenticationException thrown if the client does not have access to the repository.
     * @throws ResourceNotFoundException thrown if the given digest was not found.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ArtifactManifestProperties> getManifestProperties() {
        return this.getManifestPropertiesWithResponse().flatMap(FluxUtil::toMono);
    }

    /**
     * Gets the tag properties associated with a given tag in the {@link #getRepositoryName() repository}.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Retrieve the properties associated with the given tag.</p>
     *
     * <!-- src_embed com.azure.containers.containerregistry.RegistryArtifactAsync.getTagPropertiesWithResponse -->
     * <pre>
     * String tag = getTag&#40;&#41;;
     * client.getTagPropertiesWithResponse&#40;tag&#41;.subscribe&#40;response -&gt; &#123;
     *     final ArtifactTagProperties properties = response.getValue&#40;&#41;;
     *     System.out.printf&#40;&quot;Digest:%s,&quot;, properties.getDigest&#40;&#41;&#41;;
     * &#125;&#41;;
     * </pre>
     * <!-- end com.azure.containers.containerregistry.RegistryArtifactAsync.getTagPropertiesWithResponse -->
     *
     * @param tag name of the tag that uniquely identifies a given tag.
     * @return A REST response with the {@link ArtifactTagProperties properties} associated with the given tag.
     * @throws ClientAuthenticationException thrown if the client does not have access to the repository.
     * @throws ResourceNotFoundException thrown if the given tag was not found.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     * @throws NullPointerException thrown if the {@code tag} is null.
     * @throws IllegalArgumentException thrown if the {@code tag} is empty.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ArtifactTagProperties>> getTagPropertiesWithResponse(String tag) {
        return withContext(context -> getTagPropertiesWithResponse(tag, context));
    }

    Mono<Response<ArtifactTagProperties>> getTagPropertiesWithResponse(String tag, Context context) {
        try {
            if (tag == null) {
                return monoError(logger, new NullPointerException("'tag' cannot be null."));
            }
            if (tag.isEmpty()) {
                return monoError(logger, new IllegalArgumentException("'tag' cannot be empty."));
            }

            return this.serviceClient.getTagPropertiesWithResponseAsync(repositoryName, tag, context.addData(AZ_TRACING_NAMESPACE_KEY, CONTAINER_REGISTRY_TRACING_NAMESPACE_VALUE))
                .onErrorMap(Utils::mapException);
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * Gets the tag properties associated with a given tag in the {@link #getRepositoryName() repository}.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Retrieve the properties associated with the given tag.</p>
     *
     * <!-- src_embed com.azure.containers.containerregistry.RegistryArtifactAsync.getTagProperties -->
     * <pre>
     * String tag = getTag&#40;&#41;;
     * client.getTagProperties&#40;tag&#41;.subscribe&#40;properties -&gt; &#123;
     *     System.out.printf&#40;&quot;Digest:%s,&quot;, properties.getDigest&#40;&#41;&#41;;
     * &#125;&#41;;
     * </pre>
     * <!-- end com.azure.containers.containerregistry.RegistryArtifactAsync.getTagProperties -->
     *
     * @param tag name of the tag that uniquely identifies a given tag.
     * @return The {@link ArtifactTagProperties properties} associated with the given tag.
     * @throws ClientAuthenticationException thrown if the client does not have access to the repository.
     * @throws ResourceNotFoundException thrown if the given tag was not found.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     * @throws NullPointerException thrown if the {@code tag} is null.
     * @throws IllegalArgumentException thrown if the {@code tag} is empty.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ArtifactTagProperties> getTagProperties(String tag) {
        return this.getTagPropertiesWithResponse(tag).flatMap(FluxUtil::toMono);
    }

    /**
     * Fetches all the tags associated with the given {@link #getRepositoryName() repository}.
     *
     * <p> If you would like to specify the order in which the tags are returned please
     * use the overload that takes in the options parameter {@link #listTagProperties(ArtifactTagOrder)}  listTagProperties}
     * No assumptions on the order can be made if no options are provided to the service.
     * </p>
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Retrieve all the tags associated with the given repository.</p>
     *
     * <!-- src_embed com.azure.containers.containerregistry.RegistryArtifactAsync.listTagProperties -->
     * <pre>
     * client.listTagProperties&#40;&#41;.byPage&#40;10&#41;
     *     .subscribe&#40;tagPropertiesPagedResponse -&gt; &#123;
     *         tagPropertiesPagedResponse.getValue&#40;&#41;.stream&#40;&#41;.forEach&#40;
     *             tagProperties -&gt; System.out.println&#40;tagProperties.getDigest&#40;&#41;&#41;&#41;;
     *     &#125;&#41;;
     * </pre>
     * <!-- end com.azure.containers.containerregistry.RegistryArtifactAsync.listTagProperties -->
     *
     * @return {@link PagedFlux} of the artifacts for the given repository in the order specified by the options.
     * @throws ClientAuthenticationException thrown if the client does not have access to the repository.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ArtifactTagProperties> listTagProperties() {
        return listTagProperties(ArtifactTagOrder.NONE);
    }

    /**
     * Fetches all the tags associated with the given {@link #getRepositoryName() repository}.
     *
     * <p> The method supports options to select the order in which the tags are returned by the service.
     * Currently the service supports an ascending or descending order based on the last updated time of the tag.
     * No assumptions on the order can be made if no options are provided to the service.
     * </p>
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Retrieve all the tags associated with the given repository from the most recently updated to the last.</p>
     *
     * <!-- src_embed com.azure.containers.containerregistry.RegistryArtifactAsync.listTagPropertiesWithOptions -->
     * <pre>
     * client.listTagProperties&#40;ArtifactTagOrder.LAST_UPDATED_ON_DESCENDING&#41;
     *     .byPage&#40;10&#41;
     *     .subscribe&#40;tagPropertiesPagedResponse -&gt; &#123;
     *         tagPropertiesPagedResponse.getValue&#40;&#41;
     *             .stream&#40;&#41;
     *             .forEach&#40;tagProperties -&gt; System.out.println&#40;tagProperties.getDigest&#40;&#41;&#41;&#41;;
     *     &#125;&#41;;
     * </pre>
     * <!-- end com.azure.containers.containerregistry.RegistryArtifactAsync.listTagPropertiesWithOptions -->
     *
     * @param order The order in which the tags should be returned by the service.
     * @return {@link PagedFlux} of the artifacts for the given repository in the order specified by the options.
     * @throws ClientAuthenticationException thrown if the client does not have access to the repository.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ArtifactTagProperties> listTagProperties(ArtifactTagOrder order) {
        return new PagedFlux<>(
            (pageSize) -> withContext(context -> listTagPropertiesSinglePageAsync(pageSize, order, context)),
            (token, pageSize) -> withContext(context -> listTagPropertiesNextSinglePageAsync(token, context)));
    }

    PagedFlux<ArtifactTagProperties> listTagProperties(ArtifactTagOrder order, Context context) {
        return new PagedFlux<>(
            (pageSize) -> listTagPropertiesSinglePageAsync(pageSize, order, context),
            (token, pageSize) -> listTagPropertiesNextSinglePageAsync(token, context));
    }

    Mono<PagedResponse<ArtifactTagProperties>> listTagPropertiesSinglePageAsync(Integer pageSize, ArtifactTagOrder order, Context context) {
        try {
            if (pageSize != null && pageSize < 0) {
                return monoError(logger, new IllegalArgumentException("'pageSize' cannot be negative."));
            }

            final String orderString = order.equals(ArtifactTagOrder.NONE) ? null : order.toString();

            return this.getDigestMono()
                .flatMap(res -> this.serviceClient.getTagsSinglePageAsync(repositoryName, null, pageSize, orderString, res, context.addData(AZ_TRACING_NAMESPACE_KEY, CONTAINER_REGISTRY_TRACING_NAMESPACE_VALUE)))
                .map(res -> Utils.getPagedResponseWithContinuationToken(res, this::getTagProperties))
                .onErrorMap(Utils::mapException);
        } catch (RuntimeException e) {
            return monoError(logger, e);
        }
    }

    private List<ArtifactTagProperties> getTagProperties(List<TagAttributesBase> baseValues) {
        Objects.requireNonNull(baseValues);

        return baseValues.stream().map(value -> {
            ArtifactTagProperties tagProperties = new ArtifactTagProperties()
                .setDeleteEnabled(value.isDeleteEnabled())
                .setReadEnabled(value.isReadEnabled())
                .setListEnabled(value.isListEnabled())
                .setWriteEnabled(value.isWriteEnabled());

            ArtifactTagPropertiesHelper.setCreatedOn(tagProperties, value.getCreatedOn());
            ArtifactTagPropertiesHelper.setlastUpdatedOn(tagProperties, value.getLastUpdatedOn());
            ArtifactTagPropertiesHelper.setRepositoryName(tagProperties, repositoryName);
            ArtifactTagPropertiesHelper.setName(tagProperties, value.getName());
            ArtifactTagPropertiesHelper.setDigest(tagProperties, value.getDigest());
            return tagProperties;
        }).collect(Collectors.toList());
    }

    Mono<PagedResponse<ArtifactTagProperties>> listTagPropertiesNextSinglePageAsync(String nextLink, Context context) {
        try {
            return this.serviceClient.getTagsNextSinglePageAsync(nextLink, context.addData(AZ_TRACING_NAMESPACE_KEY, CONTAINER_REGISTRY_TRACING_NAMESPACE_VALUE))
                .map(res -> Utils.getPagedResponseWithContinuationToken(res, this::getTagProperties));
        } catch (RuntimeException e) {
            return monoError(logger, e);
        }
    }

    /**
     * Update the properties {@link ArtifactTagProperties} of the tag with the given name {@code tag}..
     * These properties set whether the given tag can be updated, deleted and retrieved.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Update the writeable properties of a given tag.</p>
     *
     * <!-- src_embed com.azure.containers.containerregistry.RegistryArtifactAsync.updateTagPropertiesWithResponse -->
     * <pre>
     * ArtifactTagProperties properties = getTagProperties&#40;&#41;;
     * String tag = getTag&#40;&#41;;
     * client.updateTagPropertiesWithResponse&#40;tag, properties&#41;.subscribe&#40;&#41;;
     * </pre>
     * <!-- end com.azure.containers.containerregistry.RegistryArtifactAsync.updateTagPropertiesWithResponse -->
     *
     * @param tag Name of the tag that uniquely identifies it.
     * @param tagProperties {@link ArtifactTagProperties value} to be set.
     * @return A REST response for completion.
     * @throws ClientAuthenticationException thrown if the client does not have access to repository.
     * @throws ResourceNotFoundException thrown if the given tag was not found.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     * @throws NullPointerException thrown if the {@code tag} is null.
     * @throws IllegalArgumentException thrown if the {@code tag} is empty.
     * @throws NullPointerException thrown if {@code tagProperties} is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ArtifactTagProperties>> updateTagPropertiesWithResponse(
            String tag, ArtifactTagProperties tagProperties) {
        return withContext(context -> this.updateTagPropertiesWithResponse(tag, tagProperties, context));
    }

    Mono<Response<ArtifactTagProperties>> updateTagPropertiesWithResponse(
        String tag, ArtifactTagProperties tagProperties, Context context) {
        try {
            if (tag == null) {
                return monoError(logger, new NullPointerException("'tag' cannot be null."));
            }

            if (tag.isEmpty()) {
                return monoError(logger, new IllegalArgumentException("'tag' cannot be empty."));
            }

            if (tagProperties == null) {
                return monoError(logger, new NullPointerException("'tagProperties' cannot be null."));
            }

            TagWriteableProperties writeableProperties = new TagWriteableProperties()
                .setDeleteEnabled(tagProperties.isDeleteEnabled())
                .setListEnabled(tagProperties.isListEnabled())
                .setReadEnabled(tagProperties.isReadEnabled())
                .setWriteEnabled(tagProperties.isWriteEnabled());

            return this.serviceClient.updateTagAttributesWithResponseAsync(repositoryName, tag, writeableProperties, context.addData(AZ_TRACING_NAMESPACE_KEY, CONTAINER_REGISTRY_TRACING_NAMESPACE_VALUE))
                .onErrorMap(Utils::mapException);
        } catch (RuntimeException e) {
            return monoError(logger, e);
        }
    }

    /**
     * Update the properties {@link ArtifactTagProperties} of the tag with the given name {@code tag}.
     * These properties set whether the given tag can be updated, deleted and retrieved.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Update the writeable properties of a given tag.</p>
     *
     * <!-- src_embed com.azure.containers.containerregistry.RegistryArtifactAsync.updateTagPropertiesWithResponse -->
     * <pre>
     * ArtifactTagProperties properties = getTagProperties&#40;&#41;;
     * String tag = getTag&#40;&#41;;
     * client.updateTagPropertiesWithResponse&#40;tag, properties&#41;.subscribe&#40;&#41;;
     * </pre>
     * <!-- end com.azure.containers.containerregistry.RegistryArtifactAsync.updateTagPropertiesWithResponse -->
     *
     * @param tag Name of the tag that uniquely identifies it.
     * @param tagProperties {@link ArtifactTagProperties tagProperties} to be set.
     * @return The completion.
     * @throws ClientAuthenticationException thrown if the client does not have access to repository.
     * @throws ResourceNotFoundException thrown if the given tag was not found.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     * @throws NullPointerException thrown if the {@code tag} is null.
     * @throws IllegalArgumentException thrown if the {@code tag} is empty.
     * @throws NullPointerException thrown if {@code tagProperties} is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ArtifactTagProperties> updateTagProperties(String tag, ArtifactTagProperties tagProperties) {
        return this.updateTagPropertiesWithResponse(tag, tagProperties).flatMap(FluxUtil::toMono);
    }

    /**
     * Update the properties {@link ArtifactManifestProperties} of the artifact with the given {@code digest}.
     * These properties set whether the given manifest can be updated, deleted and retrieved.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Update the writeable properties of a given manifest.</p>
     *
     * <!-- src_embed com.azure.containers.containerregistry.RegistryArtifactAsync.updateManifestPropertiesWithResponse -->
     * <pre>
     * ArtifactManifestProperties properties = getArtifactManifestProperties&#40;&#41;;
     * client.updateManifestPropertiesWithResponse&#40;properties&#41;.subscribe&#40;&#41;;
     * </pre>
     * <!-- end com.azure.containers.containerregistry.RegistryArtifactAsync.updateManifestPropertiesWithResponse -->
     *
     * @param manifestProperties {@link ArtifactManifestProperties manifestProperties} to be set.
     * @return A REST response for the completion.
     * @throws ClientAuthenticationException thrown if the client does not have access to repository.
     * @throws ResourceNotFoundException thrown if the given digest was not found.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     * @throws NullPointerException thrown if the {@code manifestProperties} is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ArtifactManifestProperties>> updateManifestPropertiesWithResponse(ArtifactManifestProperties manifestProperties) {
        return withContext(context -> this.updateManifestPropertiesWithResponse(manifestProperties, context));
    }

    Mono<Response<ArtifactManifestProperties>> updateManifestPropertiesWithResponse(ArtifactManifestProperties manifestProperties, Context context) {
        try {
            if (manifestProperties == null) {
                return monoError(logger, new NullPointerException("'value' cannot be null."));
            }

            ManifestWriteableProperties writeableProperties = new ManifestWriteableProperties()
                .setDeleteEnabled(manifestProperties.isDeleteEnabled())
                .setListEnabled(manifestProperties.isListEnabled())
                .setWriteEnabled(manifestProperties.isWriteEnabled())
                .setReadEnabled(manifestProperties.isReadEnabled());

            return getDigestMono()
                .flatMap(res -> this.serviceClient.updateManifestPropertiesWithResponseAsync(repositoryName, res, writeableProperties, context.addData(AZ_TRACING_NAMESPACE_KEY, CONTAINER_REGISTRY_TRACING_NAMESPACE_VALUE)))
                .onErrorMap(Utils::mapException);
        } catch (RuntimeException e) {
            return monoError(logger, e);
        }
    }

    /**
     * Update the properties {@link ArtifactManifestProperties} of the artifact with the given {@code digest}.
     * These properties set whether the given manifest can be updated, deleted and retrieved.
     *
     * <p><strong>Code Samples</strong></p>
     *
     * <p>Update the writeable properties of a given manifest.</p>
     *
     * <!-- src_embed com.azure.containers.containerregistry.RegistryArtifactAsync.updateManifestProperties -->
     * <pre>
     * ArtifactManifestProperties properties = getArtifactManifestProperties&#40;&#41;;
     * client.updateManifestProperties&#40;properties&#41;.subscribe&#40;&#41;;
     * </pre>
     * <!-- end com.azure.containers.containerregistry.RegistryArtifactAsync.updateManifestProperties -->
     *
     * @param manifestProperties {@link ArtifactManifestProperties manifestProperties} to be set.
     * @return The completion.
     * @throws ClientAuthenticationException thrown if the client does not have access to repository.
     * @throws ResourceNotFoundException thrown if the given digest was not found.
     * @throws HttpResponseException thrown if any other unexpected exception is returned by the service.
     * @throws NullPointerException thrown if the {@code manifestProperties} is null.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ArtifactManifestProperties> updateManifestProperties(ArtifactManifestProperties manifestProperties) {
        return this.updateManifestPropertiesWithResponse(manifestProperties).flatMap(FluxUtil::toMono);
    }
}
