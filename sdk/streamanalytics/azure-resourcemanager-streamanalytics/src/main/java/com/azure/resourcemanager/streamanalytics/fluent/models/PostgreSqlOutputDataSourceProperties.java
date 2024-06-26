// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.streamanalytics.models.AuthenticationMode;
import com.azure.resourcemanager.streamanalytics.models.PostgreSqlDataSourceProperties;

/**
 * The properties that are associated with a PostgreSQL output.
 */
@Fluent
public final class PostgreSqlOutputDataSourceProperties extends PostgreSqlDataSourceProperties {
    /**
     * Creates an instance of PostgreSqlOutputDataSourceProperties class.
     */
    public PostgreSqlOutputDataSourceProperties() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostgreSqlOutputDataSourceProperties withServer(String server) {
        super.withServer(server);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostgreSqlOutputDataSourceProperties withDatabase(String database) {
        super.withDatabase(database);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostgreSqlOutputDataSourceProperties withTable(String table) {
        super.withTable(table);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostgreSqlOutputDataSourceProperties withUser(String user) {
        super.withUser(user);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostgreSqlOutputDataSourceProperties withPassword(String password) {
        super.withPassword(password);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostgreSqlOutputDataSourceProperties withMaxWriterCount(Float maxWriterCount) {
        super.withMaxWriterCount(maxWriterCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PostgreSqlOutputDataSourceProperties withAuthenticationMode(AuthenticationMode authenticationMode) {
        super.withAuthenticationMode(authenticationMode);
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
    }
}
