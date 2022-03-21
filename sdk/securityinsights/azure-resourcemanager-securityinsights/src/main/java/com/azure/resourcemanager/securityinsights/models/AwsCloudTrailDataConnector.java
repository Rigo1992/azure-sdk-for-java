// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.fluent.models.AwsCloudTrailDataConnectorProperties;
import com.azure.resourcemanager.securityinsights.fluent.models.DataConnectorInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Represents Amazon Web Services CloudTrail data connector. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("AmazonWebServicesCloudTrail")
@Fluent
public final class AwsCloudTrailDataConnector extends DataConnectorInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AwsCloudTrailDataConnector.class);

    /*
     * Amazon Web Services CloudTrail data connector properties.
     */
    @JsonProperty(value = "properties")
    private AwsCloudTrailDataConnectorProperties innerProperties;

    /**
     * Get the innerProperties property: Amazon Web Services CloudTrail data connector properties.
     *
     * @return the innerProperties value.
     */
    private AwsCloudTrailDataConnectorProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public AwsCloudTrailDataConnector withEtag(String etag) {
        super.withEtag(etag);
        return this;
    }

    /**
     * Get the awsRoleArn property: The Aws Role Arn (with CloudTrailReadOnly policy) that is used to access the Aws
     * account.
     *
     * @return the awsRoleArn value.
     */
    public String awsRoleArn() {
        return this.innerProperties() == null ? null : this.innerProperties().awsRoleArn();
    }

    /**
     * Set the awsRoleArn property: The Aws Role Arn (with CloudTrailReadOnly policy) that is used to access the Aws
     * account.
     *
     * @param awsRoleArn the awsRoleArn value to set.
     * @return the AwsCloudTrailDataConnector object itself.
     */
    public AwsCloudTrailDataConnector withAwsRoleArn(String awsRoleArn) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AwsCloudTrailDataConnectorProperties();
        }
        this.innerProperties().withAwsRoleArn(awsRoleArn);
        return this;
    }

    /**
     * Get the dataTypes property: The available data types for the connector.
     *
     * @return the dataTypes value.
     */
    public AwsCloudTrailDataConnectorDataTypes dataTypes() {
        return this.innerProperties() == null ? null : this.innerProperties().dataTypes();
    }

    /**
     * Set the dataTypes property: The available data types for the connector.
     *
     * @param dataTypes the dataTypes value to set.
     * @return the AwsCloudTrailDataConnector object itself.
     */
    public AwsCloudTrailDataConnector withDataTypes(AwsCloudTrailDataConnectorDataTypes dataTypes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AwsCloudTrailDataConnectorProperties();
        }
        this.innerProperties().withDataTypes(dataTypes);
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
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
