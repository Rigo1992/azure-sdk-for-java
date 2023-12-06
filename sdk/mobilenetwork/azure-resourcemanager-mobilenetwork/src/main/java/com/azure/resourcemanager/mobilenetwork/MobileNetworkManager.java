// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.HttpPipelinePosition;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.AddHeadersFromContextPolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryOptions;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.http.policy.ArmChallengeAuthenticationPolicy;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Configuration;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mobilenetwork.fluent.MobileNetworkManagementClient;
import com.azure.resourcemanager.mobilenetwork.implementation.AttachedDataNetworksImpl;
import com.azure.resourcemanager.mobilenetwork.implementation.DataNetworksImpl;
import com.azure.resourcemanager.mobilenetwork.implementation.DiagnosticsPackagesImpl;
import com.azure.resourcemanager.mobilenetwork.implementation.MobileNetworkManagementClientBuilder;
import com.azure.resourcemanager.mobilenetwork.implementation.MobileNetworksImpl;
import com.azure.resourcemanager.mobilenetwork.implementation.OperationsImpl;
import com.azure.resourcemanager.mobilenetwork.implementation.PacketCapturesImpl;
import com.azure.resourcemanager.mobilenetwork.implementation.PacketCoreControlPlaneVersionsImpl;
import com.azure.resourcemanager.mobilenetwork.implementation.PacketCoreControlPlanesImpl;
import com.azure.resourcemanager.mobilenetwork.implementation.PacketCoreDataPlanesImpl;
import com.azure.resourcemanager.mobilenetwork.implementation.ServicesImpl;
import com.azure.resourcemanager.mobilenetwork.implementation.SimGroupsImpl;
import com.azure.resourcemanager.mobilenetwork.implementation.SimPoliciesImpl;
import com.azure.resourcemanager.mobilenetwork.implementation.SimsImpl;
import com.azure.resourcemanager.mobilenetwork.implementation.SitesImpl;
import com.azure.resourcemanager.mobilenetwork.implementation.SlicesImpl;
import com.azure.resourcemanager.mobilenetwork.models.AttachedDataNetworks;
import com.azure.resourcemanager.mobilenetwork.models.DataNetworks;
import com.azure.resourcemanager.mobilenetwork.models.DiagnosticsPackages;
import com.azure.resourcemanager.mobilenetwork.models.MobileNetworks;
import com.azure.resourcemanager.mobilenetwork.models.Operations;
import com.azure.resourcemanager.mobilenetwork.models.PacketCaptures;
import com.azure.resourcemanager.mobilenetwork.models.PacketCoreControlPlaneVersions;
import com.azure.resourcemanager.mobilenetwork.models.PacketCoreControlPlanes;
import com.azure.resourcemanager.mobilenetwork.models.PacketCoreDataPlanes;
import com.azure.resourcemanager.mobilenetwork.models.Services;
import com.azure.resourcemanager.mobilenetwork.models.SimGroups;
import com.azure.resourcemanager.mobilenetwork.models.SimPolicies;
import com.azure.resourcemanager.mobilenetwork.models.Sims;
import com.azure.resourcemanager.mobilenetwork.models.Sites;
import com.azure.resourcemanager.mobilenetwork.models.Slices;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Entry point to MobileNetworkManager. The resources in this API specification will be used to manage attached data
 * network resources in mobile network attached to a particular packet core instance.
 */
public final class MobileNetworkManager {
    private AttachedDataNetworks attachedDataNetworks;

    private DataNetworks dataNetworks;

    private DiagnosticsPackages diagnosticsPackages;

    private MobileNetworks mobileNetworks;

    private Operations operations;

    private PacketCaptures packetCaptures;

    private PacketCoreControlPlanes packetCoreControlPlanes;

    private PacketCoreControlPlaneVersions packetCoreControlPlaneVersions;

    private PacketCoreDataPlanes packetCoreDataPlanes;

    private Services services;

    private Sims sims;

    private SimGroups simGroups;

    private SimPolicies simPolicies;

    private Sites sites;

    private Slices slices;

    private final MobileNetworkManagementClient clientObject;

    private MobileNetworkManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new MobileNetworkManagementClientBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of MobileNetwork service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the MobileNetwork service API instance.
     */
    public static MobileNetworkManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Creates an instance of MobileNetwork service API entry point.
     *
     * @param httpPipeline the {@link HttpPipeline} configured with Azure authentication credential.
     * @param profile the Azure profile for client.
     * @return the MobileNetwork service API instance.
     */
    public static MobileNetworkManager authenticate(HttpPipeline httpPipeline, AzureProfile profile) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return new MobileNetworkManager(httpPipeline, profile, null);
    }

    /**
     * Gets a Configurable instance that can be used to create MobileNetworkManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new MobileNetworkManager.Configurable();
    }

    /** The Configurable allowing configurations to be set. */
    public static final class Configurable {
        private static final ClientLogger LOGGER = new ClientLogger(Configurable.class);

        private HttpClient httpClient;
        private HttpLogOptions httpLogOptions;
        private final List<HttpPipelinePolicy> policies = new ArrayList<>();
        private final List<String> scopes = new ArrayList<>();
        private RetryPolicy retryPolicy;
        private RetryOptions retryOptions;
        private Duration defaultPollInterval;

        private Configurable() {
        }

        /**
         * Sets the http client.
         *
         * @param httpClient the HTTP client.
         * @return the configurable object itself.
         */
        public Configurable withHttpClient(HttpClient httpClient) {
            this.httpClient = Objects.requireNonNull(httpClient, "'httpClient' cannot be null.");
            return this;
        }

        /**
         * Sets the logging options to the HTTP pipeline.
         *
         * @param httpLogOptions the HTTP log options.
         * @return the configurable object itself.
         */
        public Configurable withLogOptions(HttpLogOptions httpLogOptions) {
            this.httpLogOptions = Objects.requireNonNull(httpLogOptions, "'httpLogOptions' cannot be null.");
            return this;
        }

        /**
         * Adds the pipeline policy to the HTTP pipeline.
         *
         * @param policy the HTTP pipeline policy.
         * @return the configurable object itself.
         */
        public Configurable withPolicy(HttpPipelinePolicy policy) {
            this.policies.add(Objects.requireNonNull(policy, "'policy' cannot be null."));
            return this;
        }

        /**
         * Adds the scope to permission sets.
         *
         * @param scope the scope.
         * @return the configurable object itself.
         */
        public Configurable withScope(String scope) {
            this.scopes.add(Objects.requireNonNull(scope, "'scope' cannot be null."));
            return this;
        }

        /**
         * Sets the retry policy to the HTTP pipeline.
         *
         * @param retryPolicy the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryPolicy(RetryPolicy retryPolicy) {
            this.retryPolicy = Objects.requireNonNull(retryPolicy, "'retryPolicy' cannot be null.");
            return this;
        }

        /**
         * Sets the retry options for the HTTP pipeline retry policy.
         *
         * <p>This setting has no effect, if retry policy is set via {@link #withRetryPolicy(RetryPolicy)}.
         *
         * @param retryOptions the retry options for the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryOptions(RetryOptions retryOptions) {
            this.retryOptions = Objects.requireNonNull(retryOptions, "'retryOptions' cannot be null.");
            return this;
        }

        /**
         * Sets the default poll interval, used when service does not provide "Retry-After" header.
         *
         * @param defaultPollInterval the default poll interval.
         * @return the configurable object itself.
         */
        public Configurable withDefaultPollInterval(Duration defaultPollInterval) {
            this.defaultPollInterval =
                Objects.requireNonNull(defaultPollInterval, "'defaultPollInterval' cannot be null.");
            if (this.defaultPollInterval.isNegative()) {
                throw LOGGER
                    .logExceptionAsError(new IllegalArgumentException("'defaultPollInterval' cannot be negative"));
            }
            return this;
        }

        /**
         * Creates an instance of MobileNetwork service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the MobileNetwork service API instance.
         */
        public MobileNetworkManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.mobilenetwork")
                .append("/")
                .append("1.0.0");
            if (!Configuration.getGlobalConfiguration().get("AZURE_TELEMETRY_DISABLED", false)) {
                userAgentBuilder
                    .append(" (")
                    .append(Configuration.getGlobalConfiguration().get("java.version"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.name"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.version"))
                    .append("; auto-generated)");
            } else {
                userAgentBuilder.append(" (auto-generated)");
            }

            if (scopes.isEmpty()) {
                scopes.add(profile.getEnvironment().getManagementEndpoint() + "/.default");
            }
            if (retryPolicy == null) {
                if (retryOptions != null) {
                    retryPolicy = new RetryPolicy(retryOptions);
                } else {
                    retryPolicy = new RetryPolicy("Retry-After", ChronoUnit.SECONDS);
                }
            }
            List<HttpPipelinePolicy> policies = new ArrayList<>();
            policies.add(new UserAgentPolicy(userAgentBuilder.toString()));
            policies.add(new AddHeadersFromContextPolicy());
            policies.add(new RequestIdPolicy());
            policies
                .addAll(
                    this
                        .policies
                        .stream()
                        .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_CALL)
                        .collect(Collectors.toList()));
            HttpPolicyProviders.addBeforeRetryPolicies(policies);
            policies.add(retryPolicy);
            policies.add(new AddDatePolicy());
            policies.add(new ArmChallengeAuthenticationPolicy(credential, scopes.toArray(new String[0])));
            policies
                .addAll(
                    this
                        .policies
                        .stream()
                        .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_RETRY)
                        .collect(Collectors.toList()));
            HttpPolicyProviders.addAfterRetryPolicies(policies);
            policies.add(new HttpLoggingPolicy(httpLogOptions));
            HttpPipeline httpPipeline =
                new HttpPipelineBuilder()
                    .httpClient(httpClient)
                    .policies(policies.toArray(new HttpPipelinePolicy[0]))
                    .build();
            return new MobileNetworkManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /**
     * Gets the resource collection API of AttachedDataNetworks. It manages AttachedDataNetwork.
     *
     * @return Resource collection API of AttachedDataNetworks.
     */
    public AttachedDataNetworks attachedDataNetworks() {
        if (this.attachedDataNetworks == null) {
            this.attachedDataNetworks = new AttachedDataNetworksImpl(clientObject.getAttachedDataNetworks(), this);
        }
        return attachedDataNetworks;
    }

    /**
     * Gets the resource collection API of DataNetworks. It manages DataNetwork.
     *
     * @return Resource collection API of DataNetworks.
     */
    public DataNetworks dataNetworks() {
        if (this.dataNetworks == null) {
            this.dataNetworks = new DataNetworksImpl(clientObject.getDataNetworks(), this);
        }
        return dataNetworks;
    }

    /**
     * Gets the resource collection API of DiagnosticsPackages.
     *
     * @return Resource collection API of DiagnosticsPackages.
     */
    public DiagnosticsPackages diagnosticsPackages() {
        if (this.diagnosticsPackages == null) {
            this.diagnosticsPackages = new DiagnosticsPackagesImpl(clientObject.getDiagnosticsPackages(), this);
        }
        return diagnosticsPackages;
    }

    /**
     * Gets the resource collection API of MobileNetworks. It manages MobileNetwork.
     *
     * @return Resource collection API of MobileNetworks.
     */
    public MobileNetworks mobileNetworks() {
        if (this.mobileNetworks == null) {
            this.mobileNetworks = new MobileNetworksImpl(clientObject.getMobileNetworks(), this);
        }
        return mobileNetworks;
    }

    /**
     * Gets the resource collection API of Operations.
     *
     * @return Resource collection API of Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /**
     * Gets the resource collection API of PacketCaptures. It manages PacketCapture.
     *
     * @return Resource collection API of PacketCaptures.
     */
    public PacketCaptures packetCaptures() {
        if (this.packetCaptures == null) {
            this.packetCaptures = new PacketCapturesImpl(clientObject.getPacketCaptures(), this);
        }
        return packetCaptures;
    }

    /**
     * Gets the resource collection API of PacketCoreControlPlanes. It manages PacketCoreControlPlane.
     *
     * @return Resource collection API of PacketCoreControlPlanes.
     */
    public PacketCoreControlPlanes packetCoreControlPlanes() {
        if (this.packetCoreControlPlanes == null) {
            this.packetCoreControlPlanes =
                new PacketCoreControlPlanesImpl(clientObject.getPacketCoreControlPlanes(), this);
        }
        return packetCoreControlPlanes;
    }

    /**
     * Gets the resource collection API of PacketCoreControlPlaneVersions.
     *
     * @return Resource collection API of PacketCoreControlPlaneVersions.
     */
    public PacketCoreControlPlaneVersions packetCoreControlPlaneVersions() {
        if (this.packetCoreControlPlaneVersions == null) {
            this.packetCoreControlPlaneVersions =
                new PacketCoreControlPlaneVersionsImpl(clientObject.getPacketCoreControlPlaneVersions(), this);
        }
        return packetCoreControlPlaneVersions;
    }

    /**
     * Gets the resource collection API of PacketCoreDataPlanes. It manages PacketCoreDataPlane.
     *
     * @return Resource collection API of PacketCoreDataPlanes.
     */
    public PacketCoreDataPlanes packetCoreDataPlanes() {
        if (this.packetCoreDataPlanes == null) {
            this.packetCoreDataPlanes = new PacketCoreDataPlanesImpl(clientObject.getPacketCoreDataPlanes(), this);
        }
        return packetCoreDataPlanes;
    }

    /**
     * Gets the resource collection API of Services. It manages Service.
     *
     * @return Resource collection API of Services.
     */
    public Services services() {
        if (this.services == null) {
            this.services = new ServicesImpl(clientObject.getServices(), this);
        }
        return services;
    }

    /**
     * Gets the resource collection API of Sims. It manages Sim.
     *
     * @return Resource collection API of Sims.
     */
    public Sims sims() {
        if (this.sims == null) {
            this.sims = new SimsImpl(clientObject.getSims(), this);
        }
        return sims;
    }

    /**
     * Gets the resource collection API of SimGroups. It manages SimGroup.
     *
     * @return Resource collection API of SimGroups.
     */
    public SimGroups simGroups() {
        if (this.simGroups == null) {
            this.simGroups = new SimGroupsImpl(clientObject.getSimGroups(), this);
        }
        return simGroups;
    }

    /**
     * Gets the resource collection API of SimPolicies. It manages SimPolicy.
     *
     * @return Resource collection API of SimPolicies.
     */
    public SimPolicies simPolicies() {
        if (this.simPolicies == null) {
            this.simPolicies = new SimPoliciesImpl(clientObject.getSimPolicies(), this);
        }
        return simPolicies;
    }

    /**
     * Gets the resource collection API of Sites. It manages Site.
     *
     * @return Resource collection API of Sites.
     */
    public Sites sites() {
        if (this.sites == null) {
            this.sites = new SitesImpl(clientObject.getSites(), this);
        }
        return sites;
    }

    /**
     * Gets the resource collection API of Slices. It manages Slice.
     *
     * @return Resource collection API of Slices.
     */
    public Slices slices() {
        if (this.slices == null) {
            this.slices = new SlicesImpl(clientObject.getSlices(), this);
        }
        return slices;
    }

    /**
     * Gets wrapped service client MobileNetworkManagementClient providing direct access to the underlying
     * auto-generated API implementation, based on Azure REST API.
     *
     * @return Wrapped service client MobileNetworkManagementClient.
     */
    public MobileNetworkManagementClient serviceClient() {
        return this.clientObject;
    }
}
