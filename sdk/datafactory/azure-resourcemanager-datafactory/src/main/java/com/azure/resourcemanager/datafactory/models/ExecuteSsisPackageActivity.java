// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.ExecuteSsisPackageActivityTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/**
 * Execute SSIS package activity.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("ExecuteSSISPackage")
@Fluent
public final class ExecuteSsisPackageActivity extends ExecutionActivity {
    /*
     * Execute SSIS package activity properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private ExecuteSsisPackageActivityTypeProperties innerTypeProperties
        = new ExecuteSsisPackageActivityTypeProperties();

    /**
     * Creates an instance of ExecuteSsisPackageActivity class.
     */
    public ExecuteSsisPackageActivity() {
    }

    /**
     * Get the innerTypeProperties property: Execute SSIS package activity properties.
     * 
     * @return the innerTypeProperties value.
     */
    private ExecuteSsisPackageActivityTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExecuteSsisPackageActivity withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExecuteSsisPackageActivity withPolicy(ActivityPolicy policy) {
        super.withPolicy(policy);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExecuteSsisPackageActivity withName(String name) {
        super.withName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExecuteSsisPackageActivity withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExecuteSsisPackageActivity withState(ActivityState state) {
        super.withState(state);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExecuteSsisPackageActivity withOnInactiveMarkAs(ActivityOnInactiveMarkAs onInactiveMarkAs) {
        super.withOnInactiveMarkAs(onInactiveMarkAs);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExecuteSsisPackageActivity withDependsOn(List<ActivityDependency> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExecuteSsisPackageActivity withUserProperties(List<UserProperty> userProperties) {
        super.withUserProperties(userProperties);
        return this;
    }

    /**
     * Get the packageLocation property: SSIS package location.
     * 
     * @return the packageLocation value.
     */
    public SsisPackageLocation packageLocation() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().packageLocation();
    }

    /**
     * Set the packageLocation property: SSIS package location.
     * 
     * @param packageLocation the packageLocation value to set.
     * @return the ExecuteSsisPackageActivity object itself.
     */
    public ExecuteSsisPackageActivity withPackageLocation(SsisPackageLocation packageLocation) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ExecuteSsisPackageActivityTypeProperties();
        }
        this.innerTypeProperties().withPackageLocation(packageLocation);
        return this;
    }

    /**
     * Get the runtime property: Specifies the runtime to execute SSIS package. The value should be "x86" or "x64".
     * Type: string (or Expression with resultType string).
     * 
     * @return the runtime value.
     */
    public Object runtime() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().runtime();
    }

    /**
     * Set the runtime property: Specifies the runtime to execute SSIS package. The value should be "x86" or "x64".
     * Type: string (or Expression with resultType string).
     * 
     * @param runtime the runtime value to set.
     * @return the ExecuteSsisPackageActivity object itself.
     */
    public ExecuteSsisPackageActivity withRuntime(Object runtime) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ExecuteSsisPackageActivityTypeProperties();
        }
        this.innerTypeProperties().withRuntime(runtime);
        return this;
    }

    /**
     * Get the loggingLevel property: The logging level of SSIS package execution. Type: string (or Expression with
     * resultType string).
     * 
     * @return the loggingLevel value.
     */
    public Object loggingLevel() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().loggingLevel();
    }

    /**
     * Set the loggingLevel property: The logging level of SSIS package execution. Type: string (or Expression with
     * resultType string).
     * 
     * @param loggingLevel the loggingLevel value to set.
     * @return the ExecuteSsisPackageActivity object itself.
     */
    public ExecuteSsisPackageActivity withLoggingLevel(Object loggingLevel) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ExecuteSsisPackageActivityTypeProperties();
        }
        this.innerTypeProperties().withLoggingLevel(loggingLevel);
        return this;
    }

    /**
     * Get the environmentPath property: The environment path to execute the SSIS package. Type: string (or Expression
     * with resultType string).
     * 
     * @return the environmentPath value.
     */
    public Object environmentPath() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().environmentPath();
    }

    /**
     * Set the environmentPath property: The environment path to execute the SSIS package. Type: string (or Expression
     * with resultType string).
     * 
     * @param environmentPath the environmentPath value to set.
     * @return the ExecuteSsisPackageActivity object itself.
     */
    public ExecuteSsisPackageActivity withEnvironmentPath(Object environmentPath) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ExecuteSsisPackageActivityTypeProperties();
        }
        this.innerTypeProperties().withEnvironmentPath(environmentPath);
        return this;
    }

    /**
     * Get the executionCredential property: The package execution credential.
     * 
     * @return the executionCredential value.
     */
    public SsisExecutionCredential executionCredential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().executionCredential();
    }

    /**
     * Set the executionCredential property: The package execution credential.
     * 
     * @param executionCredential the executionCredential value to set.
     * @return the ExecuteSsisPackageActivity object itself.
     */
    public ExecuteSsisPackageActivity withExecutionCredential(SsisExecutionCredential executionCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ExecuteSsisPackageActivityTypeProperties();
        }
        this.innerTypeProperties().withExecutionCredential(executionCredential);
        return this;
    }

    /**
     * Get the connectVia property: The integration runtime reference.
     * 
     * @return the connectVia value.
     */
    public IntegrationRuntimeReference connectVia() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().connectVia();
    }

    /**
     * Set the connectVia property: The integration runtime reference.
     * 
     * @param connectVia the connectVia value to set.
     * @return the ExecuteSsisPackageActivity object itself.
     */
    public ExecuteSsisPackageActivity withConnectVia(IntegrationRuntimeReference connectVia) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ExecuteSsisPackageActivityTypeProperties();
        }
        this.innerTypeProperties().withConnectVia(connectVia);
        return this;
    }

    /**
     * Get the projectParameters property: The project level parameters to execute the SSIS package.
     * 
     * @return the projectParameters value.
     */
    public Map<String, SsisExecutionParameter> projectParameters() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().projectParameters();
    }

    /**
     * Set the projectParameters property: The project level parameters to execute the SSIS package.
     * 
     * @param projectParameters the projectParameters value to set.
     * @return the ExecuteSsisPackageActivity object itself.
     */
    public ExecuteSsisPackageActivity withProjectParameters(Map<String, SsisExecutionParameter> projectParameters) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ExecuteSsisPackageActivityTypeProperties();
        }
        this.innerTypeProperties().withProjectParameters(projectParameters);
        return this;
    }

    /**
     * Get the packageParameters property: The package level parameters to execute the SSIS package.
     * 
     * @return the packageParameters value.
     */
    public Map<String, SsisExecutionParameter> packageParameters() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().packageParameters();
    }

    /**
     * Set the packageParameters property: The package level parameters to execute the SSIS package.
     * 
     * @param packageParameters the packageParameters value to set.
     * @return the ExecuteSsisPackageActivity object itself.
     */
    public ExecuteSsisPackageActivity withPackageParameters(Map<String, SsisExecutionParameter> packageParameters) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ExecuteSsisPackageActivityTypeProperties();
        }
        this.innerTypeProperties().withPackageParameters(packageParameters);
        return this;
    }

    /**
     * Get the projectConnectionManagers property: The project level connection managers to execute the SSIS package.
     * 
     * @return the projectConnectionManagers value.
     */
    public Map<String, Map<String, SsisExecutionParameter>> projectConnectionManagers() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().projectConnectionManagers();
    }

    /**
     * Set the projectConnectionManagers property: The project level connection managers to execute the SSIS package.
     * 
     * @param projectConnectionManagers the projectConnectionManagers value to set.
     * @return the ExecuteSsisPackageActivity object itself.
     */
    public ExecuteSsisPackageActivity
        withProjectConnectionManagers(Map<String, Map<String, SsisExecutionParameter>> projectConnectionManagers) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ExecuteSsisPackageActivityTypeProperties();
        }
        this.innerTypeProperties().withProjectConnectionManagers(projectConnectionManagers);
        return this;
    }

    /**
     * Get the packageConnectionManagers property: The package level connection managers to execute the SSIS package.
     * 
     * @return the packageConnectionManagers value.
     */
    public Map<String, Map<String, SsisExecutionParameter>> packageConnectionManagers() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().packageConnectionManagers();
    }

    /**
     * Set the packageConnectionManagers property: The package level connection managers to execute the SSIS package.
     * 
     * @param packageConnectionManagers the packageConnectionManagers value to set.
     * @return the ExecuteSsisPackageActivity object itself.
     */
    public ExecuteSsisPackageActivity
        withPackageConnectionManagers(Map<String, Map<String, SsisExecutionParameter>> packageConnectionManagers) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ExecuteSsisPackageActivityTypeProperties();
        }
        this.innerTypeProperties().withPackageConnectionManagers(packageConnectionManagers);
        return this;
    }

    /**
     * Get the propertyOverrides property: The property overrides to execute the SSIS package.
     * 
     * @return the propertyOverrides value.
     */
    public Map<String, SsisPropertyOverride> propertyOverrides() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().propertyOverrides();
    }

    /**
     * Set the propertyOverrides property: The property overrides to execute the SSIS package.
     * 
     * @param propertyOverrides the propertyOverrides value to set.
     * @return the ExecuteSsisPackageActivity object itself.
     */
    public ExecuteSsisPackageActivity withPropertyOverrides(Map<String, SsisPropertyOverride> propertyOverrides) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ExecuteSsisPackageActivityTypeProperties();
        }
        this.innerTypeProperties().withPropertyOverrides(propertyOverrides);
        return this;
    }

    /**
     * Get the logLocation property: SSIS package execution log location.
     * 
     * @return the logLocation value.
     */
    public SsisLogLocation logLocation() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().logLocation();
    }

    /**
     * Set the logLocation property: SSIS package execution log location.
     * 
     * @param logLocation the logLocation value to set.
     * @return the ExecuteSsisPackageActivity object itself.
     */
    public ExecuteSsisPackageActivity withLogLocation(SsisLogLocation logLocation) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new ExecuteSsisPackageActivityTypeProperties();
        }
        this.innerTypeProperties().withLogLocation(logLocation);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerTypeProperties() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property innerTypeProperties in model ExecuteSsisPackageActivity"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ExecuteSsisPackageActivity.class);
}
