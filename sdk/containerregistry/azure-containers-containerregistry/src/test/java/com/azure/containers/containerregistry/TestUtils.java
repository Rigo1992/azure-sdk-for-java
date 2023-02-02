// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry;

import com.azure.containers.containerregistry.models.ContainerRegistryAudience;
import com.azure.core.credential.AccessToken;
import com.azure.core.credential.TokenCredential;
import com.azure.core.credential.TokenRequestContext;
import com.azure.core.http.HttpRequest;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.TestMode;
import com.azure.core.util.Configuration;
import com.azure.core.util.Context;
import com.azure.identity.AzureAuthorityHosts;
import com.azure.identity.ClientSecretCredentialBuilder;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.resourcemanager.containerregistry.ContainerRegistryManager;
import com.azure.resourcemanager.containerregistry.models.ImportImageParameters;
import com.azure.resourcemanager.containerregistry.models.ImportMode;
import com.azure.resourcemanager.containerregistry.models.ImportSource;
import reactor.core.publisher.Mono;

import java.time.OffsetDateTime;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class TestUtils {
    public static final String DISPLAY_NAME_WITH_ARGUMENTS = "{displayName} with [{arguments}]";
    private static final Configuration CONFIGURATION;
    public static final String ALPINE_REPOSITORY_NAME;
    public static final String HELLO_WORLD_REPOSITORY_NAME;
    public static final String HELLO_WORLD_SEATTLE_REPOSITORY_NAME;
    public static final String MICROSOFT_HELLO_WORLD_REPOSITORY_NAME;
    public static final String LATEST_TAG_NAME;
    public static final String V1_TAG_NAME;
    public static final String V2_TAG_NAME;
    public static final String V4_TAG_NAME;
    public static final String V3_TAG_NAME;
    public static final String TAG_TO_DELETE;
    public static final String TAG_TO_UPDATE;
    public static final String TAG_UNKNOWN;
    public static final String DIGEST_UNKNOWN;
    public static final int  PAGESIZE_2;
    public static final int  PAGESIZE_1;
    public static final String ARM64_ARCHITECTURE;
    public static final String LINUX_OPERATING_SYSTEM;
    public static final String AMD64_ARCHITECTURE;
    public static final String WINDOWS_OPERATING_SYSTEM;
    public static final String REGISTRY_NAME;
    public static final String RESOURCE_GROUP;
    public static final String SUBSCRIPTION_ID;
    public static final String TENANT_ID;
    public static final String CLIENT_ID;
    public static final String REGISTRY_URI;
    public static final String REGISTRY_ENDPOINT;
    public static final String ANONYMOUS_REGISTRY_ENDPOINT;
    public static final long SLEEP_TIME_IN_MILLISECONDS;
    public static final String ANONYMOUS_REGISTRY_NAME;
    public static final String LOGIN_SERVER_SUFFIX;
    public static final String REGISTRY_ENDPOINT_PLAYBACK;
    public static final String REGISTRY_NAME_PLAYBACK;
    public static final String QUARANTINE_STATE;
    public static final String QUARANTINE_DETAILS;
    public static final int HTTP_STATUS_CODE_202;
    public static final String AZURE_GLOBAL_AUTHENTICATION_SCOPE;
    public static final String AZURE_GOV_AUTHENTICATION_SCOPE;
    public static final String CONTAINERREGISTRY_CLIENT_SECRET;
    public static final BiFunction<HttpRequest, Context, Boolean> SKIP_AUTH_TOKEN_REQUEST_FUNCTION;
    static {
        CONFIGURATION = Configuration.getGlobalConfiguration().clone();
        ALPINE_REPOSITORY_NAME = "library/alpine";
        HELLO_WORLD_REPOSITORY_NAME = "library/hello-world";
        HELLO_WORLD_SEATTLE_REPOSITORY_NAME = "library/hello-seattle";
        MICROSOFT_HELLO_WORLD_REPOSITORY_NAME = "library/mcr/hello-world";
        LATEST_TAG_NAME = "latest";
        V1_TAG_NAME = "v1";
        V2_TAG_NAME = "v2";
        V4_TAG_NAME = "v4";
        V3_TAG_NAME = "v3";
        TAG_TO_DELETE = "v4";
        TAG_TO_UPDATE = "test-update-properties";
        TAG_UNKNOWN = "unknowntag";
        DIGEST_UNKNOWN = "sha256:fffffffffffffffffffffffffffffff";
        PAGESIZE_2 = 2;
        PAGESIZE_1 = 1;
        ARM64_ARCHITECTURE = "arm64";
        LINUX_OPERATING_SYSTEM = "linux";
        AMD64_ARCHITECTURE = "amd64";
        WINDOWS_OPERATING_SYSTEM = "windows";
        RESOURCE_GROUP = CONFIGURATION.get("CONTAINERREGISTRY_RESOURCE_GROUP");
        SUBSCRIPTION_ID = CONFIGURATION.get("CONTAINERREGISTRY_SUBSCRIPTION_ID");
        TENANT_ID = CONFIGURATION.get("CONTAINERREGISTRY_TENANT_ID");
        CLIENT_ID = CONFIGURATION.get("CONTAINERREGISTRY_CLIENT_ID");
        REGISTRY_NAME = CONFIGURATION.get("CONTAINERREGISTRY_REGISTRY_NAME");
        REGISTRY_ENDPOINT = CONFIGURATION.get("CONTAINERREGISTRY_ENDPOINT");
        REGISTRY_URI = "registry.hub.docker.com";
        SLEEP_TIME_IN_MILLISECONDS = 5000;
        ANONYMOUS_REGISTRY_NAME = CONFIGURATION.get("CONTAINERREGISTRY_ANONREGISTRY_NAME");
        ANONYMOUS_REGISTRY_ENDPOINT = CONFIGURATION.get("CONTAINERREGISTRY_ANONREGISTRY_ENDPOINT");
        CONTAINERREGISTRY_CLIENT_SECRET = CONFIGURATION.get("CONTAINERREGISTRY_CLIENT_SECRET");
        LOGIN_SERVER_SUFFIX = "azurecr.io";
        REGISTRY_ENDPOINT_PLAYBACK = "https://pallavitcontainerregistry.azurecr.io";
        REGISTRY_NAME_PLAYBACK = "pallavitcontainerregistry";
        QUARANTINE_STATE = "quarantine_state";
        QUARANTINE_DETAILS = "quaratine_details";
        HTTP_STATUS_CODE_202 = 202;
        AZURE_GLOBAL_AUTHENTICATION_SCOPE = "https://management.azure.com/.default";
        AZURE_GOV_AUTHENTICATION_SCOPE = "https://management.usgovcloudapi.net/.default";
        SKIP_AUTH_TOKEN_REQUEST_FUNCTION = (request, context) -> request.getUrl().toString().contains("oauth2");
    }

    static class FakeCredentials implements TokenCredential {
        @Override
        public Mono<AccessToken> getToken(TokenRequestContext tokenRequestContext) {
            return Mono.just(new AccessToken("someFakeToken", OffsetDateTime.MAX));
        }
    }

    static <T extends Comparable<? super T>> boolean isSorted(Iterable<T> iterable) {
        Iterator<T> iter = iterable.iterator();
        if (!iter.hasNext()) {
            return true;
        }
        T t = iter.next();
        while (iter.hasNext()) {
            T t2 = iter.next();
            if (t.compareTo(t2) > 0) {
                return false;
            }
            t = t2;
        }
        return true;
    }

    static TokenCredential getCredentialsByEndpoint(TestMode testMode, String endpoint) {
        if (testMode == TestMode.PLAYBACK) {
            return new FakeCredentials();
        }

        String authority = getAuthority(endpoint);
        return getCredentialByAuthority(testMode, authority);
    }

    static TokenCredential getCredentialByAuthority(TestMode testMode, String authority) {
        if (testMode == TestMode.PLAYBACK) {
            return new FakeCredentials();
        }

        if (authority == AzureAuthorityHosts.AZURE_PUBLIC_CLOUD) {
            return new DefaultAzureCredentialBuilder().build();
        } else {
            return new ClientSecretCredentialBuilder()
                .tenantId(TENANT_ID)
                .clientId(CLIENT_ID)
                .clientSecret(CONTAINERREGISTRY_CLIENT_SECRET)
                .authorityHost(authority).build();
        }
    }

    static void importImage(TestMode mode, String repository, List<String> tags) {
        if (mode == TestMode.PLAYBACK) {
            return;
        }

        try {
            importImage(mode, REGISTRY_NAME, repository, tags, REGISTRY_ENDPOINT);
            Thread.sleep(SLEEP_TIME_IN_MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static String getAuthority(String endpoint) {
        if (endpoint == null) {
            return AzureAuthorityHosts.AZURE_PUBLIC_CLOUD;
        }

        if (endpoint.contains(".azurecr.io")) {
            return AzureAuthorityHosts.AZURE_PUBLIC_CLOUD;
        }

        if (endpoint.contains(".azurecr.cn")) {
            return AzureAuthorityHosts.AZURE_CHINA;
        }

        if (endpoint.contains(".azurecr.us")) {
            return AzureAuthorityHosts.AZURE_GOVERNMENT;
        }

        // By default we will assume that the authority is public
        return AzureAuthorityHosts.AZURE_PUBLIC_CLOUD;
    }

    public static ContainerRegistryAudience getAudience(String endpoint) {
        String authority = getAuthority(endpoint);
        switch (authority) {
            case AzureAuthorityHosts.AZURE_PUBLIC_CLOUD:
                return ContainerRegistryAudience.AZURE_RESOURCE_MANAGER_PUBLIC_CLOUD;

            case AzureAuthorityHosts.AZURE_CHINA:
                return ContainerRegistryAudience.AZURE_RESOURCE_MANAGER_CHINA;

            case AzureAuthorityHosts.AZURE_GOVERNMENT:
                return ContainerRegistryAudience.AZURE_RESOURCE_MANAGER_GOVERNMENT;

            default:
                return null;
        }
    }

    static AzureProfile getAzureProfile(String authority) {
        switch (authority) {
            case AzureAuthorityHosts.AZURE_PUBLIC_CLOUD: return new AzureProfile(TENANT_ID, SUBSCRIPTION_ID, AzureEnvironment.AZURE);
            case AzureAuthorityHosts.AZURE_CHINA: return new AzureProfile(TENANT_ID, SUBSCRIPTION_ID, AzureEnvironment.AZURE_CHINA);
            case AzureAuthorityHosts.AZURE_GOVERNMENT: return new AzureProfile(TENANT_ID, SUBSCRIPTION_ID, AzureEnvironment.AZURE_US_GOVERNMENT);
            default: return null;
        }
    }

    static void importImage(TestMode mode, String registryName, String repository, List<String> tags, String endpoint) throws InterruptedException {
        if (mode == TestMode.PLAYBACK) {
            return;
        }

        String authority = getAuthority(endpoint);

        TokenCredential credential = getCredentialByAuthority(mode, authority);
        tags = tags.stream().map(tag -> String.format("%1$s:%2$s", repository, tag)).collect(Collectors.toList());
        AzureProfile profile = getAzureProfile(authority);

        ContainerRegistryManager manager = ContainerRegistryManager.authenticate(credential, profile);

        int index = 0;
        do {

            try {
                manager.serviceClient().getRegistries().importImage(
                    RESOURCE_GROUP,
                    registryName,
                    new ImportImageParameters()
                        .withMode(ImportMode.FORCE)
                        .withSource(new ImportSource().withSourceImage(repository)
                            .withRegistryUri(REGISTRY_URI))
                        .withTargetTags(tags));
                return;
            } catch (Exception ex) {
                Thread.sleep(SLEEP_TIME_IN_MILLISECONDS);
            }
        } while (++index < 3);
    }
}
