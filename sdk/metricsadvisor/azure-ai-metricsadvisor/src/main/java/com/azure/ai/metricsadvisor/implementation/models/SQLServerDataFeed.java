// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.UUID;

/**
 * The SQLServerDataFeed model.
 */
@Fluent
public final class SQLServerDataFeed extends DataFeedDetail {
    /*
     * The dataSourceParameter property.
     */
    private SqlSourceParameter dataSourceParameter;

    /**
     * Creates an instance of SQLServerDataFeed class.
     */
    public SQLServerDataFeed() {
    }

    /**
     * Get the dataSourceParameter property: The dataSourceParameter property.
     * 
     * @return the dataSourceParameter value.
     */
    public SqlSourceParameter getDataSourceParameter() {
        return this.dataSourceParameter;
    }

    /**
     * Set the dataSourceParameter property: The dataSourceParameter property.
     * 
     * @param dataSourceParameter the dataSourceParameter value to set.
     * @return the SQLServerDataFeed object itself.
     */
    public SQLServerDataFeed setDataSourceParameter(SqlSourceParameter dataSourceParameter) {
        this.dataSourceParameter = dataSourceParameter;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SQLServerDataFeed setDataFeedName(String dataFeedName) {
        super.setDataFeedName(dataFeedName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SQLServerDataFeed setDataFeedDescription(String dataFeedDescription) {
        super.setDataFeedDescription(dataFeedDescription);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SQLServerDataFeed setGranularityName(Granularity granularityName) {
        super.setGranularityName(granularityName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SQLServerDataFeed setGranularityAmount(Integer granularityAmount) {
        super.setGranularityAmount(granularityAmount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SQLServerDataFeed setMetrics(List<DataFeedMetric> metrics) {
        super.setMetrics(metrics);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SQLServerDataFeed setDimension(List<DataFeedDimension> dimension) {
        super.setDimension(dimension);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SQLServerDataFeed setTimestampColumn(String timestampColumn) {
        super.setTimestampColumn(timestampColumn);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SQLServerDataFeed setDataStartFrom(OffsetDateTime dataStartFrom) {
        super.setDataStartFrom(dataStartFrom);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SQLServerDataFeed setStartOffsetInSeconds(Long startOffsetInSeconds) {
        super.setStartOffsetInSeconds(startOffsetInSeconds);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SQLServerDataFeed setMaxConcurrency(Integer maxConcurrency) {
        super.setMaxConcurrency(maxConcurrency);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SQLServerDataFeed setMinRetryIntervalInSeconds(Long minRetryIntervalInSeconds) {
        super.setMinRetryIntervalInSeconds(minRetryIntervalInSeconds);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SQLServerDataFeed setStopRetryAfterInSeconds(Long stopRetryAfterInSeconds) {
        super.setStopRetryAfterInSeconds(stopRetryAfterInSeconds);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SQLServerDataFeed setNeedRollup(NeedRollupEnum needRollup) {
        super.setNeedRollup(needRollup);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SQLServerDataFeed setRollUpMethod(RollUpMethod rollUpMethod) {
        super.setRollUpMethod(rollUpMethod);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SQLServerDataFeed setRollUpColumns(List<String> rollUpColumns) {
        super.setRollUpColumns(rollUpColumns);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SQLServerDataFeed setAllUpIdentification(String allUpIdentification) {
        super.setAllUpIdentification(allUpIdentification);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SQLServerDataFeed setFillMissingPointType(FillMissingPointType fillMissingPointType) {
        super.setFillMissingPointType(fillMissingPointType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SQLServerDataFeed setFillMissingPointValue(Double fillMissingPointValue) {
        super.setFillMissingPointValue(fillMissingPointValue);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SQLServerDataFeed setViewMode(ViewMode viewMode) {
        super.setViewMode(viewMode);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SQLServerDataFeed setAdmins(List<String> admins) {
        super.setAdmins(admins);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SQLServerDataFeed setViewers(List<String> viewers) {
        super.setViewers(viewers);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SQLServerDataFeed setActionLinkTemplate(String actionLinkTemplate) {
        super.setActionLinkTemplate(actionLinkTemplate);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SQLServerDataFeed setAuthenticationType(AuthenticationTypeEnum authenticationType) {
        super.setAuthenticationType(authenticationType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SQLServerDataFeed setCredentialId(String credentialId) {
        super.setCredentialId(credentialId);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("dataSourceType",
            DataSourceType.SQL_SERVER == null ? null : DataSourceType.SQL_SERVER.toString());
        jsonWriter.writeStringField("dataFeedName", getDataFeedName());
        jsonWriter.writeStringField("granularityName",
            getGranularityName() == null ? null : getGranularityName().toString());
        jsonWriter.writeArrayField("metrics", getMetrics(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("dataStartFrom",
            getDataStartFrom() == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(getDataStartFrom()));
        jsonWriter.writeStringField("dataFeedDescription", getDataFeedDescription());
        jsonWriter.writeNumberField("granularityAmount", getGranularityAmount());
        jsonWriter.writeArrayField("dimension", getDimension(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("timestampColumn", getTimestampColumn());
        jsonWriter.writeNumberField("startOffsetInSeconds", getStartOffsetInSeconds());
        jsonWriter.writeNumberField("maxConcurrency", getMaxConcurrency());
        jsonWriter.writeNumberField("minRetryIntervalInSeconds", getMinRetryIntervalInSeconds());
        jsonWriter.writeNumberField("stopRetryAfterInSeconds", getStopRetryAfterInSeconds());
        jsonWriter.writeStringField("needRollup", getNeedRollup() == null ? null : getNeedRollup().toString());
        jsonWriter.writeStringField("rollUpMethod", getRollUpMethod() == null ? null : getRollUpMethod().toString());
        jsonWriter.writeArrayField("rollUpColumns", getRollUpColumns(),
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("allUpIdentification", getAllUpIdentification());
        jsonWriter.writeStringField("fillMissingPointType",
            getFillMissingPointType() == null ? null : getFillMissingPointType().toString());
        jsonWriter.writeNumberField("fillMissingPointValue", getFillMissingPointValue());
        jsonWriter.writeStringField("viewMode", getViewMode() == null ? null : getViewMode().toString());
        jsonWriter.writeArrayField("admins", getAdmins(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("viewers", getViewers(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("actionLinkTemplate", getActionLinkTemplate());
        jsonWriter.writeStringField("authenticationType",
            getAuthenticationType() == null ? null : getAuthenticationType().toString());
        jsonWriter.writeStringField("credentialId", getCredentialId());
        jsonWriter.writeJsonField("dataSourceParameter", this.dataSourceParameter);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SQLServerDataFeed from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SQLServerDataFeed if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     * polymorphic discriminator.
     * @throws IOException If an error occurs while reading the SQLServerDataFeed.
     */
    public static SQLServerDataFeed fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SQLServerDataFeed deserializedSQLServerDataFeed = new SQLServerDataFeed();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("dataSourceType".equals(fieldName)) {
                    String dataSourceType = reader.getString();
                    if (!"SqlServer".equals(dataSourceType)) {
                        throw new IllegalStateException(
                            "'dataSourceType' was expected to be non-null and equal to 'SqlServer'. The found 'dataSourceType' was '"
                                + dataSourceType + "'.");
                    }
                } else if ("dataFeedName".equals(fieldName)) {
                    deserializedSQLServerDataFeed.setDataFeedName(reader.getString());
                } else if ("granularityName".equals(fieldName)) {
                    deserializedSQLServerDataFeed.setGranularityName(Granularity.fromString(reader.getString()));
                } else if ("metrics".equals(fieldName)) {
                    List<DataFeedMetric> metrics = reader.readArray(reader1 -> DataFeedMetric.fromJson(reader1));
                    deserializedSQLServerDataFeed.setMetrics(metrics);
                } else if ("dataStartFrom".equals(fieldName)) {
                    deserializedSQLServerDataFeed.setDataStartFrom(
                        reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString())));
                } else if ("dataFeedId".equals(fieldName)) {
                    deserializedSQLServerDataFeed
                        .setDataFeedId(reader.getNullable(nonNullReader -> UUID.fromString(nonNullReader.getString())));
                } else if ("dataFeedDescription".equals(fieldName)) {
                    deserializedSQLServerDataFeed.setDataFeedDescription(reader.getString());
                } else if ("granularityAmount".equals(fieldName)) {
                    deserializedSQLServerDataFeed.setGranularityAmount(reader.getNullable(JsonReader::getInt));
                } else if ("dimension".equals(fieldName)) {
                    List<DataFeedDimension> dimension
                        = reader.readArray(reader1 -> DataFeedDimension.fromJson(reader1));
                    deserializedSQLServerDataFeed.setDimension(dimension);
                } else if ("timestampColumn".equals(fieldName)) {
                    deserializedSQLServerDataFeed.setTimestampColumn(reader.getString());
                } else if ("startOffsetInSeconds".equals(fieldName)) {
                    deserializedSQLServerDataFeed.setStartOffsetInSeconds(reader.getNullable(JsonReader::getLong));
                } else if ("maxConcurrency".equals(fieldName)) {
                    deserializedSQLServerDataFeed.setMaxConcurrency(reader.getNullable(JsonReader::getInt));
                } else if ("minRetryIntervalInSeconds".equals(fieldName)) {
                    deserializedSQLServerDataFeed.setMinRetryIntervalInSeconds(reader.getNullable(JsonReader::getLong));
                } else if ("stopRetryAfterInSeconds".equals(fieldName)) {
                    deserializedSQLServerDataFeed.setStopRetryAfterInSeconds(reader.getNullable(JsonReader::getLong));
                } else if ("needRollup".equals(fieldName)) {
                    deserializedSQLServerDataFeed.setNeedRollup(NeedRollupEnum.fromString(reader.getString()));
                } else if ("rollUpMethod".equals(fieldName)) {
                    deserializedSQLServerDataFeed.setRollUpMethod(RollUpMethod.fromString(reader.getString()));
                } else if ("rollUpColumns".equals(fieldName)) {
                    List<String> rollUpColumns = reader.readArray(reader1 -> reader1.getString());
                    deserializedSQLServerDataFeed.setRollUpColumns(rollUpColumns);
                } else if ("allUpIdentification".equals(fieldName)) {
                    deserializedSQLServerDataFeed.setAllUpIdentification(reader.getString());
                } else if ("fillMissingPointType".equals(fieldName)) {
                    deserializedSQLServerDataFeed
                        .setFillMissingPointType(FillMissingPointType.fromString(reader.getString()));
                } else if ("fillMissingPointValue".equals(fieldName)) {
                    deserializedSQLServerDataFeed.setFillMissingPointValue(reader.getNullable(JsonReader::getDouble));
                } else if ("viewMode".equals(fieldName)) {
                    deserializedSQLServerDataFeed.setViewMode(ViewMode.fromString(reader.getString()));
                } else if ("admins".equals(fieldName)) {
                    List<String> admins = reader.readArray(reader1 -> reader1.getString());
                    deserializedSQLServerDataFeed.setAdmins(admins);
                } else if ("viewers".equals(fieldName)) {
                    List<String> viewers = reader.readArray(reader1 -> reader1.getString());
                    deserializedSQLServerDataFeed.setViewers(viewers);
                } else if ("isAdmin".equals(fieldName)) {
                    deserializedSQLServerDataFeed.setIsAdmin(reader.getNullable(JsonReader::getBoolean));
                } else if ("creator".equals(fieldName)) {
                    deserializedSQLServerDataFeed.setCreator(reader.getString());
                } else if ("status".equals(fieldName)) {
                    deserializedSQLServerDataFeed.setStatus(EntityStatus.fromString(reader.getString()));
                } else if ("createdTime".equals(fieldName)) {
                    deserializedSQLServerDataFeed.setCreatedTime(
                        reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString())));
                } else if ("actionLinkTemplate".equals(fieldName)) {
                    deserializedSQLServerDataFeed.setActionLinkTemplate(reader.getString());
                } else if ("authenticationType".equals(fieldName)) {
                    deserializedSQLServerDataFeed
                        .setAuthenticationType(AuthenticationTypeEnum.fromString(reader.getString()));
                } else if ("credentialId".equals(fieldName)) {
                    deserializedSQLServerDataFeed.setCredentialId(reader.getString());
                } else if ("dataSourceParameter".equals(fieldName)) {
                    deserializedSQLServerDataFeed.dataSourceParameter = SqlSourceParameter.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSQLServerDataFeed;
        });
    }
}
