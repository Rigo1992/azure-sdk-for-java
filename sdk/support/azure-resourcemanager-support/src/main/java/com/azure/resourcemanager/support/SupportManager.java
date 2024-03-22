// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support;

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
import com.azure.resourcemanager.support.fluent.MicrosoftSupport;
import com.azure.resourcemanager.support.implementation.ChatTranscriptsImpl;
import com.azure.resourcemanager.support.implementation.ChatTranscriptsNoSubscriptionsImpl;
import com.azure.resourcemanager.support.implementation.CommunicationsImpl;
import com.azure.resourcemanager.support.implementation.CommunicationsNoSubscriptionsImpl;
import com.azure.resourcemanager.support.implementation.FileWorkspacesImpl;
import com.azure.resourcemanager.support.implementation.FileWorkspacesNoSubscriptionsImpl;
import com.azure.resourcemanager.support.implementation.FilesImpl;
import com.azure.resourcemanager.support.implementation.FilesNoSubscriptionsImpl;
import com.azure.resourcemanager.support.implementation.LookUpResourceIdsImpl;
import com.azure.resourcemanager.support.implementation.MicrosoftSupportBuilder;
import com.azure.resourcemanager.support.implementation.OperationsImpl;
import com.azure.resourcemanager.support.implementation.ProblemClassificationsImpl;
import com.azure.resourcemanager.support.implementation.ProblemClassificationsNoSubscriptionsImpl;
import com.azure.resourcemanager.support.implementation.ServiceClassificationsImpl;
import com.azure.resourcemanager.support.implementation.ServiceClassificationsNoSubscriptionsImpl;
import com.azure.resourcemanager.support.implementation.ServicesImpl;
import com.azure.resourcemanager.support.implementation.SupportTicketsImpl;
import com.azure.resourcemanager.support.implementation.SupportTicketsNoSubscriptionsImpl;
import com.azure.resourcemanager.support.models.ChatTranscripts;
import com.azure.resourcemanager.support.models.ChatTranscriptsNoSubscriptions;
import com.azure.resourcemanager.support.models.Communications;
import com.azure.resourcemanager.support.models.CommunicationsNoSubscriptions;
import com.azure.resourcemanager.support.models.FileWorkspaces;
import com.azure.resourcemanager.support.models.FileWorkspacesNoSubscriptions;
import com.azure.resourcemanager.support.models.Files;
import com.azure.resourcemanager.support.models.FilesNoSubscriptions;
import com.azure.resourcemanager.support.models.LookUpResourceIds;
import com.azure.resourcemanager.support.models.Operations;
import com.azure.resourcemanager.support.models.ProblemClassifications;
import com.azure.resourcemanager.support.models.ProblemClassificationsNoSubscriptions;
import com.azure.resourcemanager.support.models.ServiceClassifications;
import com.azure.resourcemanager.support.models.ServiceClassificationsNoSubscriptions;
import com.azure.resourcemanager.support.models.Services;
import com.azure.resourcemanager.support.models.SupportTickets;
import com.azure.resourcemanager.support.models.SupportTicketsNoSubscriptions;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Entry point to SupportManager.
 * Microsoft Azure Support Resource Provider.
 */
public final class SupportManager {
    private Operations operations;

    private Services services;

    private ServiceClassificationsNoSubscriptions serviceClassificationsNoSubscriptions;

    private ServiceClassifications serviceClassifications;

    private ProblemClassificationsNoSubscriptions problemClassificationsNoSubscriptions;

    private ProblemClassifications problemClassifications;

    private SupportTickets supportTickets;

    private SupportTicketsNoSubscriptions supportTicketsNoSubscriptions;

    private Communications communications;

    private CommunicationsNoSubscriptions communicationsNoSubscriptions;

    private ChatTranscripts chatTranscripts;

    private ChatTranscriptsNoSubscriptions chatTranscriptsNoSubscriptions;

    private FileWorkspaces fileWorkspaces;

    private FileWorkspacesNoSubscriptions fileWorkspacesNoSubscriptions;

    private Files files;

    private FilesNoSubscriptions filesNoSubscriptions;

    private LookUpResourceIds lookUpResourceIds;

    private final MicrosoftSupport clientObject;

    private SupportManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject = new MicrosoftSupportBuilder().pipeline(httpPipeline)
            .endpoint(profile.getEnvironment().getResourceManagerEndpoint()).subscriptionId(profile.getSubscriptionId())
            .defaultPollInterval(defaultPollInterval).buildClient();
    }

    /**
     * Creates an instance of support service API entry point.
     * 
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the support service API instance.
     */
    public static SupportManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Creates an instance of support service API entry point.
     * 
     * @param httpPipeline the {@link HttpPipeline} configured with Azure authentication credential.
     * @param profile the Azure profile for client.
     * @return the support service API instance.
     */
    public static SupportManager authenticate(HttpPipeline httpPipeline, AzureProfile profile) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return new SupportManager(httpPipeline, profile, null);
    }

    /**
     * Gets a Configurable instance that can be used to create SupportManager with optional configuration.
     * 
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new SupportManager.Configurable();
    }

    /**
     * The Configurable allowing configurations to be set.
     */
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
         * <p>
         * This setting has no effect, if retry policy is set via {@link #withRetryPolicy(RetryPolicy)}.
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
            this.defaultPollInterval
                = Objects.requireNonNull(defaultPollInterval, "'defaultPollInterval' cannot be null.");
            if (this.defaultPollInterval.isNegative()) {
                throw LOGGER
                    .logExceptionAsError(new IllegalArgumentException("'defaultPollInterval' cannot be negative"));
            }
            return this;
        }

        /**
         * Creates an instance of support service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the support service API instance.
         */
        public SupportManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder.append("azsdk-java").append("-").append("com.azure.resourcemanager.support").append("/")
                .append("1.0.0-beta.4");
            if (!Configuration.getGlobalConfiguration().get("AZURE_TELEMETRY_DISABLED", false)) {
                userAgentBuilder.append(" (").append(Configuration.getGlobalConfiguration().get("java.version"))
                    .append("; ").append(Configuration.getGlobalConfiguration().get("os.name")).append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.version")).append("; auto-generated)");
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
            policies.addAll(this.policies.stream().filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_CALL)
                .collect(Collectors.toList()));
            HttpPolicyProviders.addBeforeRetryPolicies(policies);
            policies.add(retryPolicy);
            policies.add(new AddDatePolicy());
            policies.add(new ArmChallengeAuthenticationPolicy(credential, scopes.toArray(new String[0])));
            policies.addAll(this.policies.stream()
                .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_RETRY).collect(Collectors.toList()));
            HttpPolicyProviders.addAfterRetryPolicies(policies);
            policies.add(new HttpLoggingPolicy(httpLogOptions));
            HttpPipeline httpPipeline = new HttpPipelineBuilder().httpClient(httpClient)
                .policies(policies.toArray(new HttpPipelinePolicy[0])).build();
            return new SupportManager(httpPipeline, profile, defaultPollInterval);
        }
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
     * Gets the resource collection API of Services.
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
     * Gets the resource collection API of ServiceClassificationsNoSubscriptions.
     * 
     * @return Resource collection API of ServiceClassificationsNoSubscriptions.
     */
    public ServiceClassificationsNoSubscriptions serviceClassificationsNoSubscriptions() {
        if (this.serviceClassificationsNoSubscriptions == null) {
            this.serviceClassificationsNoSubscriptions = new ServiceClassificationsNoSubscriptionsImpl(
                clientObject.getServiceClassificationsNoSubscriptions(), this);
        }
        return serviceClassificationsNoSubscriptions;
    }

    /**
     * Gets the resource collection API of ServiceClassifications.
     * 
     * @return Resource collection API of ServiceClassifications.
     */
    public ServiceClassifications serviceClassifications() {
        if (this.serviceClassifications == null) {
            this.serviceClassifications
                = new ServiceClassificationsImpl(clientObject.getServiceClassifications(), this);
        }
        return serviceClassifications;
    }

    /**
     * Gets the resource collection API of ProblemClassificationsNoSubscriptions.
     * 
     * @return Resource collection API of ProblemClassificationsNoSubscriptions.
     */
    public ProblemClassificationsNoSubscriptions problemClassificationsNoSubscriptions() {
        if (this.problemClassificationsNoSubscriptions == null) {
            this.problemClassificationsNoSubscriptions = new ProblemClassificationsNoSubscriptionsImpl(
                clientObject.getProblemClassificationsNoSubscriptions(), this);
        }
        return problemClassificationsNoSubscriptions;
    }

    /**
     * Gets the resource collection API of ProblemClassifications.
     * 
     * @return Resource collection API of ProblemClassifications.
     */
    public ProblemClassifications problemClassifications() {
        if (this.problemClassifications == null) {
            this.problemClassifications
                = new ProblemClassificationsImpl(clientObject.getProblemClassifications(), this);
        }
        return problemClassifications;
    }

    /**
     * Gets the resource collection API of SupportTickets. It manages SupportTicketDetails.
     * 
     * @return Resource collection API of SupportTickets.
     */
    public SupportTickets supportTickets() {
        if (this.supportTickets == null) {
            this.supportTickets = new SupportTicketsImpl(clientObject.getSupportTickets(), this);
        }
        return supportTickets;
    }

    /**
     * Gets the resource collection API of SupportTicketsNoSubscriptions.
     * 
     * @return Resource collection API of SupportTicketsNoSubscriptions.
     */
    public SupportTicketsNoSubscriptions supportTicketsNoSubscriptions() {
        if (this.supportTicketsNoSubscriptions == null) {
            this.supportTicketsNoSubscriptions
                = new SupportTicketsNoSubscriptionsImpl(clientObject.getSupportTicketsNoSubscriptions(), this);
        }
        return supportTicketsNoSubscriptions;
    }

    /**
     * Gets the resource collection API of Communications. It manages CommunicationDetails.
     * 
     * @return Resource collection API of Communications.
     */
    public Communications communications() {
        if (this.communications == null) {
            this.communications = new CommunicationsImpl(clientObject.getCommunications(), this);
        }
        return communications;
    }

    /**
     * Gets the resource collection API of CommunicationsNoSubscriptions.
     * 
     * @return Resource collection API of CommunicationsNoSubscriptions.
     */
    public CommunicationsNoSubscriptions communicationsNoSubscriptions() {
        if (this.communicationsNoSubscriptions == null) {
            this.communicationsNoSubscriptions
                = new CommunicationsNoSubscriptionsImpl(clientObject.getCommunicationsNoSubscriptions(), this);
        }
        return communicationsNoSubscriptions;
    }

    /**
     * Gets the resource collection API of ChatTranscripts.
     * 
     * @return Resource collection API of ChatTranscripts.
     */
    public ChatTranscripts chatTranscripts() {
        if (this.chatTranscripts == null) {
            this.chatTranscripts = new ChatTranscriptsImpl(clientObject.getChatTranscripts(), this);
        }
        return chatTranscripts;
    }

    /**
     * Gets the resource collection API of ChatTranscriptsNoSubscriptions.
     * 
     * @return Resource collection API of ChatTranscriptsNoSubscriptions.
     */
    public ChatTranscriptsNoSubscriptions chatTranscriptsNoSubscriptions() {
        if (this.chatTranscriptsNoSubscriptions == null) {
            this.chatTranscriptsNoSubscriptions
                = new ChatTranscriptsNoSubscriptionsImpl(clientObject.getChatTranscriptsNoSubscriptions(), this);
        }
        return chatTranscriptsNoSubscriptions;
    }

    /**
     * Gets the resource collection API of FileWorkspaces.
     * 
     * @return Resource collection API of FileWorkspaces.
     */
    public FileWorkspaces fileWorkspaces() {
        if (this.fileWorkspaces == null) {
            this.fileWorkspaces = new FileWorkspacesImpl(clientObject.getFileWorkspaces(), this);
        }
        return fileWorkspaces;
    }

    /**
     * Gets the resource collection API of FileWorkspacesNoSubscriptions.
     * 
     * @return Resource collection API of FileWorkspacesNoSubscriptions.
     */
    public FileWorkspacesNoSubscriptions fileWorkspacesNoSubscriptions() {
        if (this.fileWorkspacesNoSubscriptions == null) {
            this.fileWorkspacesNoSubscriptions
                = new FileWorkspacesNoSubscriptionsImpl(clientObject.getFileWorkspacesNoSubscriptions(), this);
        }
        return fileWorkspacesNoSubscriptions;
    }

    /**
     * Gets the resource collection API of Files. It manages FileDetails.
     * 
     * @return Resource collection API of Files.
     */
    public Files files() {
        if (this.files == null) {
            this.files = new FilesImpl(clientObject.getFiles(), this);
        }
        return files;
    }

    /**
     * Gets the resource collection API of FilesNoSubscriptions.
     * 
     * @return Resource collection API of FilesNoSubscriptions.
     */
    public FilesNoSubscriptions filesNoSubscriptions() {
        if (this.filesNoSubscriptions == null) {
            this.filesNoSubscriptions = new FilesNoSubscriptionsImpl(clientObject.getFilesNoSubscriptions(), this);
        }
        return filesNoSubscriptions;
    }

    /**
     * Gets the resource collection API of LookUpResourceIds.
     * 
     * @return Resource collection API of LookUpResourceIds.
     */
    public LookUpResourceIds lookUpResourceIds() {
        if (this.lookUpResourceIds == null) {
            this.lookUpResourceIds = new LookUpResourceIdsImpl(clientObject.getLookUpResourceIds(), this);
        }
        return lookUpResourceIds;
    }

    /**
     * Gets wrapped service client MicrosoftSupport providing direct access to the underlying auto-generated API
     * implementation, based on Azure REST API.
     * 
     * @return Wrapped service client MicrosoftSupport.
     */
    public MicrosoftSupport serviceClient() {
        return this.clientObject;
    }
}
