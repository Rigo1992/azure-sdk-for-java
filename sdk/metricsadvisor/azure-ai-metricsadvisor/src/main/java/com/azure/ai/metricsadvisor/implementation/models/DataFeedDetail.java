// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.UUID;

/**
 * The DataFeedDetail model.
 */
@Fluent
public class DataFeedDetail implements JsonSerializable<DataFeedDetail> {
    /*
     * data feed unique id
     */
    private UUID dataFeedId;

    /*
     * data feed name
     */
    private String dataFeedName;

    /*
     * data feed description
     */
    private String dataFeedDescription;

    /*
     * granularity of the time series
     */
    private Granularity granularityName;

    /*
     * if granularity is custom,it is required.
     */
    private Integer granularityAmount;

    /*
     * measure list
     */
    private List<DataFeedMetric> metrics;

    /*
     * dimension list
     */
    private List<DataFeedDimension> dimension;

    /*
     * user-defined timestamp column. if timestampColumn is null, start time of every time slice will be used as
     * default value.
     */
    private String timestampColumn;

    /*
     * ingestion start time
     */
    private OffsetDateTime dataStartFrom;

    /*
     * the time that the beginning of data ingestion task will delay for every data slice according to this offset.
     */
    private Long startOffsetInSeconds;

    /*
     * the max concurrency of data ingestion queries against user data source. 0 means no limitation.
     */
    private Integer maxConcurrency;

    /*
     * the min retry interval for failed data ingestion tasks.
     */
    private Long minRetryIntervalInSeconds;

    /*
     * stop retry data ingestion after the data slice first schedule time in seconds.
     */
    private Long stopRetryAfterInSeconds;

    /*
     * mark if the data feed need rollup
     */
    private NeedRollupEnum needRollup;

    /*
     * roll up method
     */
    private RollUpMethod rollUpMethod;

    /*
     * roll up columns
     */
    private List<String> rollUpColumns;

    /*
     * the identification value for the row of calculated all-up value.
     */
    private String allUpIdentification;

    /*
     * the type of fill missing point for anomaly detection
     */
    private FillMissingPointType fillMissingPointType;

    /*
     * the value of fill missing point for anomaly detection
     */
    private Double fillMissingPointValue;

    /*
     * data feed access mode, default is Private
     */
    private ViewMode viewMode;

    /*
     * data feed administrator
     */
    private List<String> admins;

    /*
     * data feed viewer
     */
    private List<String> viewers;

    /*
     * the query user is one of data feed administrator or not
     */
    private Boolean isAdmin;

    /*
     * data feed creator
     */
    private String creator;

    /*
     * data feed status
     */
    private EntityStatus status;

    /*
     * data feed created time
     */
    private OffsetDateTime createdTime;

    /*
     * action link for alert
     */
    private String actionLinkTemplate;

    /*
     * authentication type for corresponding data source
     */
    private AuthenticationTypeEnum authenticationType;

    /*
     * The credential entity id
     */
    private String credentialId;

    /**
     * Creates an instance of DataFeedDetail class.
     */
    public DataFeedDetail() {
    }

    /**
     * Get the dataFeedId property: data feed unique id.
     * 
     * @return the dataFeedId value.
     */
    public UUID getDataFeedId() {
        return this.dataFeedId;
    }

    /**
     * Set the dataFeedId property: data feed unique id.
     * 
     * @param dataFeedId the dataFeedId value to set.
     * @return the DataFeedDetail object itself.
     */
    DataFeedDetail setDataFeedId(UUID dataFeedId) {
        this.dataFeedId = dataFeedId;
        return this;
    }

    /**
     * Get the dataFeedName property: data feed name.
     * 
     * @return the dataFeedName value.
     */
    public String getDataFeedName() {
        return this.dataFeedName;
    }

    /**
     * Set the dataFeedName property: data feed name.
     * 
     * @param dataFeedName the dataFeedName value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setDataFeedName(String dataFeedName) {
        this.dataFeedName = dataFeedName;
        return this;
    }

    /**
     * Get the dataFeedDescription property: data feed description.
     * 
     * @return the dataFeedDescription value.
     */
    public String getDataFeedDescription() {
        return this.dataFeedDescription;
    }

    /**
     * Set the dataFeedDescription property: data feed description.
     * 
     * @param dataFeedDescription the dataFeedDescription value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setDataFeedDescription(String dataFeedDescription) {
        this.dataFeedDescription = dataFeedDescription;
        return this;
    }

    /**
     * Get the granularityName property: granularity of the time series.
     * 
     * @return the granularityName value.
     */
    public Granularity getGranularityName() {
        return this.granularityName;
    }

    /**
     * Set the granularityName property: granularity of the time series.
     * 
     * @param granularityName the granularityName value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setGranularityName(Granularity granularityName) {
        this.granularityName = granularityName;
        return this;
    }

    /**
     * Get the granularityAmount property: if granularity is custom,it is required.
     * 
     * @return the granularityAmount value.
     */
    public Integer getGranularityAmount() {
        return this.granularityAmount;
    }

    /**
     * Set the granularityAmount property: if granularity is custom,it is required.
     * 
     * @param granularityAmount the granularityAmount value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setGranularityAmount(Integer granularityAmount) {
        this.granularityAmount = granularityAmount;
        return this;
    }

    /**
     * Get the metrics property: measure list.
     * 
     * @return the metrics value.
     */
    public List<DataFeedMetric> getMetrics() {
        return this.metrics;
    }

    /**
     * Set the metrics property: measure list.
     * 
     * @param metrics the metrics value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setMetrics(List<DataFeedMetric> metrics) {
        this.metrics = metrics;
        return this;
    }

    /**
     * Get the dimension property: dimension list.
     * 
     * @return the dimension value.
     */
    public List<DataFeedDimension> getDimension() {
        return this.dimension;
    }

    /**
     * Set the dimension property: dimension list.
     * 
     * @param dimension the dimension value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setDimension(List<DataFeedDimension> dimension) {
        this.dimension = dimension;
        return this;
    }

    /**
     * Get the timestampColumn property: user-defined timestamp column. if timestampColumn is null, start time of every
     * time slice will be used as default value.
     * 
     * @return the timestampColumn value.
     */
    public String getTimestampColumn() {
        return this.timestampColumn;
    }

    /**
     * Set the timestampColumn property: user-defined timestamp column. if timestampColumn is null, start time of every
     * time slice will be used as default value.
     * 
     * @param timestampColumn the timestampColumn value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setTimestampColumn(String timestampColumn) {
        this.timestampColumn = timestampColumn;
        return this;
    }

    /**
     * Get the dataStartFrom property: ingestion start time.
     * 
     * @return the dataStartFrom value.
     */
    public OffsetDateTime getDataStartFrom() {
        return this.dataStartFrom;
    }

    /**
     * Set the dataStartFrom property: ingestion start time.
     * 
     * @param dataStartFrom the dataStartFrom value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setDataStartFrom(OffsetDateTime dataStartFrom) {
        this.dataStartFrom = dataStartFrom;
        return this;
    }

    /**
     * Get the startOffsetInSeconds property: the time that the beginning of data ingestion task will delay for every
     * data slice according to this offset.
     * 
     * @return the startOffsetInSeconds value.
     */
    public Long getStartOffsetInSeconds() {
        return this.startOffsetInSeconds;
    }

    /**
     * Set the startOffsetInSeconds property: the time that the beginning of data ingestion task will delay for every
     * data slice according to this offset.
     * 
     * @param startOffsetInSeconds the startOffsetInSeconds value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setStartOffsetInSeconds(Long startOffsetInSeconds) {
        this.startOffsetInSeconds = startOffsetInSeconds;
        return this;
    }

    /**
     * Get the maxConcurrency property: the max concurrency of data ingestion queries against user data source. 0 means
     * no limitation.
     * 
     * @return the maxConcurrency value.
     */
    public Integer getMaxConcurrency() {
        return this.maxConcurrency;
    }

    /**
     * Set the maxConcurrency property: the max concurrency of data ingestion queries against user data source. 0 means
     * no limitation.
     * 
     * @param maxConcurrency the maxConcurrency value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setMaxConcurrency(Integer maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }

    /**
     * Get the minRetryIntervalInSeconds property: the min retry interval for failed data ingestion tasks.
     * 
     * @return the minRetryIntervalInSeconds value.
     */
    public Long getMinRetryIntervalInSeconds() {
        return this.minRetryIntervalInSeconds;
    }

    /**
     * Set the minRetryIntervalInSeconds property: the min retry interval for failed data ingestion tasks.
     * 
     * @param minRetryIntervalInSeconds the minRetryIntervalInSeconds value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setMinRetryIntervalInSeconds(Long minRetryIntervalInSeconds) {
        this.minRetryIntervalInSeconds = minRetryIntervalInSeconds;
        return this;
    }

    /**
     * Get the stopRetryAfterInSeconds property: stop retry data ingestion after the data slice first schedule time in
     * seconds.
     * 
     * @return the stopRetryAfterInSeconds value.
     */
    public Long getStopRetryAfterInSeconds() {
        return this.stopRetryAfterInSeconds;
    }

    /**
     * Set the stopRetryAfterInSeconds property: stop retry data ingestion after the data slice first schedule time in
     * seconds.
     * 
     * @param stopRetryAfterInSeconds the stopRetryAfterInSeconds value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setStopRetryAfterInSeconds(Long stopRetryAfterInSeconds) {
        this.stopRetryAfterInSeconds = stopRetryAfterInSeconds;
        return this;
    }

    /**
     * Get the needRollup property: mark if the data feed need rollup.
     * 
     * @return the needRollup value.
     */
    public NeedRollupEnum getNeedRollup() {
        return this.needRollup;
    }

    /**
     * Set the needRollup property: mark if the data feed need rollup.
     * 
     * @param needRollup the needRollup value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setNeedRollup(NeedRollupEnum needRollup) {
        this.needRollup = needRollup;
        return this;
    }

    /**
     * Get the rollUpMethod property: roll up method.
     * 
     * @return the rollUpMethod value.
     */
    public RollUpMethod getRollUpMethod() {
        return this.rollUpMethod;
    }

    /**
     * Set the rollUpMethod property: roll up method.
     * 
     * @param rollUpMethod the rollUpMethod value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setRollUpMethod(RollUpMethod rollUpMethod) {
        this.rollUpMethod = rollUpMethod;
        return this;
    }

    /**
     * Get the rollUpColumns property: roll up columns.
     * 
     * @return the rollUpColumns value.
     */
    public List<String> getRollUpColumns() {
        return this.rollUpColumns;
    }

    /**
     * Set the rollUpColumns property: roll up columns.
     * 
     * @param rollUpColumns the rollUpColumns value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setRollUpColumns(List<String> rollUpColumns) {
        this.rollUpColumns = rollUpColumns;
        return this;
    }

    /**
     * Get the allUpIdentification property: the identification value for the row of calculated all-up value.
     * 
     * @return the allUpIdentification value.
     */
    public String getAllUpIdentification() {
        return this.allUpIdentification;
    }

    /**
     * Set the allUpIdentification property: the identification value for the row of calculated all-up value.
     * 
     * @param allUpIdentification the allUpIdentification value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setAllUpIdentification(String allUpIdentification) {
        this.allUpIdentification = allUpIdentification;
        return this;
    }

    /**
     * Get the fillMissingPointType property: the type of fill missing point for anomaly detection.
     * 
     * @return the fillMissingPointType value.
     */
    public FillMissingPointType getFillMissingPointType() {
        return this.fillMissingPointType;
    }

    /**
     * Set the fillMissingPointType property: the type of fill missing point for anomaly detection.
     * 
     * @param fillMissingPointType the fillMissingPointType value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setFillMissingPointType(FillMissingPointType fillMissingPointType) {
        this.fillMissingPointType = fillMissingPointType;
        return this;
    }

    /**
     * Get the fillMissingPointValue property: the value of fill missing point for anomaly detection.
     * 
     * @return the fillMissingPointValue value.
     */
    public Double getFillMissingPointValue() {
        return this.fillMissingPointValue;
    }

    /**
     * Set the fillMissingPointValue property: the value of fill missing point for anomaly detection.
     * 
     * @param fillMissingPointValue the fillMissingPointValue value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setFillMissingPointValue(Double fillMissingPointValue) {
        this.fillMissingPointValue = fillMissingPointValue;
        return this;
    }

    /**
     * Get the viewMode property: data feed access mode, default is Private.
     * 
     * @return the viewMode value.
     */
    public ViewMode getViewMode() {
        return this.viewMode;
    }

    /**
     * Set the viewMode property: data feed access mode, default is Private.
     * 
     * @param viewMode the viewMode value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setViewMode(ViewMode viewMode) {
        this.viewMode = viewMode;
        return this;
    }

    /**
     * Get the admins property: data feed administrator.
     * 
     * @return the admins value.
     */
    public List<String> getAdmins() {
        return this.admins;
    }

    /**
     * Set the admins property: data feed administrator.
     * 
     * @param admins the admins value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setAdmins(List<String> admins) {
        this.admins = admins;
        return this;
    }

    /**
     * Get the viewers property: data feed viewer.
     * 
     * @return the viewers value.
     */
    public List<String> getViewers() {
        return this.viewers;
    }

    /**
     * Set the viewers property: data feed viewer.
     * 
     * @param viewers the viewers value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setViewers(List<String> viewers) {
        this.viewers = viewers;
        return this;
    }

    /**
     * Get the isAdmin property: the query user is one of data feed administrator or not.
     * 
     * @return the isAdmin value.
     */
    public Boolean isAdmin() {
        return this.isAdmin;
    }

    /**
     * Set the isAdmin property: the query user is one of data feed administrator or not.
     * 
     * @param isAdmin the isAdmin value to set.
     * @return the DataFeedDetail object itself.
     */
    DataFeedDetail setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
        return this;
    }

    /**
     * Get the creator property: data feed creator.
     * 
     * @return the creator value.
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * Set the creator property: data feed creator.
     * 
     * @param creator the creator value to set.
     * @return the DataFeedDetail object itself.
     */
    DataFeedDetail setCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * Get the status property: data feed status.
     * 
     * @return the status value.
     */
    public EntityStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: data feed status.
     * 
     * @param status the status value to set.
     * @return the DataFeedDetail object itself.
     */
    DataFeedDetail setStatus(EntityStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the createdTime property: data feed created time.
     * 
     * @return the createdTime value.
     */
    public OffsetDateTime getCreatedTime() {
        return this.createdTime;
    }

    /**
     * Set the createdTime property: data feed created time.
     * 
     * @param createdTime the createdTime value to set.
     * @return the DataFeedDetail object itself.
     */
    DataFeedDetail setCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * Get the actionLinkTemplate property: action link for alert.
     * 
     * @return the actionLinkTemplate value.
     */
    public String getActionLinkTemplate() {
        return this.actionLinkTemplate;
    }

    /**
     * Set the actionLinkTemplate property: action link for alert.
     * 
     * @param actionLinkTemplate the actionLinkTemplate value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setActionLinkTemplate(String actionLinkTemplate) {
        this.actionLinkTemplate = actionLinkTemplate;
        return this;
    }

    /**
     * Get the authenticationType property: authentication type for corresponding data source.
     * 
     * @return the authenticationType value.
     */
    public AuthenticationTypeEnum getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: authentication type for corresponding data source.
     * 
     * @param authenticationType the authenticationType value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setAuthenticationType(AuthenticationTypeEnum authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the credentialId property: The credential entity id.
     * 
     * @return the credentialId value.
     */
    public String getCredentialId() {
        return this.credentialId;
    }

    /**
     * Set the credentialId property: The credential entity id.
     * 
     * @param credentialId the credentialId value to set.
     * @return the DataFeedDetail object itself.
     */
    public DataFeedDetail setCredentialId(String credentialId) {
        this.credentialId = credentialId;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("dataFeedName", this.dataFeedName);
        jsonWriter.writeStringField("granularityName",
            this.granularityName == null ? null : this.granularityName.toString());
        jsonWriter.writeArrayField("metrics", this.metrics, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("dataStartFrom",
            this.dataStartFrom == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.dataStartFrom));
        jsonWriter.writeStringField("dataFeedDescription", this.dataFeedDescription);
        jsonWriter.writeNumberField("granularityAmount", this.granularityAmount);
        jsonWriter.writeArrayField("dimension", this.dimension, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("timestampColumn", this.timestampColumn);
        jsonWriter.writeNumberField("startOffsetInSeconds", this.startOffsetInSeconds);
        jsonWriter.writeNumberField("maxConcurrency", this.maxConcurrency);
        jsonWriter.writeNumberField("minRetryIntervalInSeconds", this.minRetryIntervalInSeconds);
        jsonWriter.writeNumberField("stopRetryAfterInSeconds", this.stopRetryAfterInSeconds);
        jsonWriter.writeStringField("needRollup", this.needRollup == null ? null : this.needRollup.toString());
        jsonWriter.writeStringField("rollUpMethod", this.rollUpMethod == null ? null : this.rollUpMethod.toString());
        jsonWriter.writeArrayField("rollUpColumns", this.rollUpColumns,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("allUpIdentification", this.allUpIdentification);
        jsonWriter.writeStringField("fillMissingPointType",
            this.fillMissingPointType == null ? null : this.fillMissingPointType.toString());
        jsonWriter.writeNumberField("fillMissingPointValue", this.fillMissingPointValue);
        jsonWriter.writeStringField("viewMode", this.viewMode == null ? null : this.viewMode.toString());
        jsonWriter.writeArrayField("admins", this.admins, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("viewers", this.viewers, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("actionLinkTemplate", this.actionLinkTemplate);
        jsonWriter.writeStringField("authenticationType",
            this.authenticationType == null ? null : this.authenticationType.toString());
        jsonWriter.writeStringField("credentialId", this.credentialId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DataFeedDetail from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DataFeedDetail if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     * polymorphic discriminator.
     * @throws IOException If an error occurs while reading the DataFeedDetail.
     */
    public static DataFeedDetail fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            JsonReader readerToUse = reader.bufferObject();

            readerToUse.nextToken(); // Prepare for reading
            while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = readerToUse.getFieldName();
                readerToUse.nextToken();
                if ("dataSourceType".equals(fieldName)) {
                    discriminatorValue = readerToUse.getString();
                    break;
                } else {
                    readerToUse.skipChildren();
                }
            }
            // Use the discriminator value to determine which subtype should be deserialized.
            if ("AzureApplicationInsights".equals(discriminatorValue)) {
                return AzureApplicationInsightsDataFeed.fromJson(readerToUse.reset());
            } else if ("AzureBlob".equals(discriminatorValue)) {
                return AzureBlobDataFeed.fromJson(readerToUse.reset());
            } else if ("AzureCosmosDB".equals(discriminatorValue)) {
                return AzureCosmosDBDataFeed.fromJson(readerToUse.reset());
            } else if ("AzureDataExplorer".equals(discriminatorValue)) {
                return AzureDataExplorerDataFeed.fromJson(readerToUse.reset());
            } else if ("AzureDataLakeStorageGen2".equals(discriminatorValue)) {
                return AzureDataLakeStorageGen2DataFeed.fromJson(readerToUse.reset());
            } else if ("AzureEventHubs".equals(discriminatorValue)) {
                return AzureEventHubsDataFeed.fromJson(readerToUse.reset());
            } else if ("AzureLogAnalytics".equals(discriminatorValue)) {
                return AzureLogAnalyticsDataFeed.fromJson(readerToUse.reset());
            } else if ("AzureTable".equals(discriminatorValue)) {
                return AzureTableDataFeed.fromJson(readerToUse.reset());
            } else if ("InfluxDB".equals(discriminatorValue)) {
                return InfluxDBDataFeed.fromJson(readerToUse.reset());
            } else if ("MySql".equals(discriminatorValue)) {
                return MySqlDataFeed.fromJson(readerToUse.reset());
            } else if ("PostgreSql".equals(discriminatorValue)) {
                return PostgreSqlDataFeed.fromJson(readerToUse.reset());
            } else if ("SqlServer".equals(discriminatorValue)) {
                return SQLServerDataFeed.fromJson(readerToUse.reset());
            } else if ("MongoDB".equals(discriminatorValue)) {
                return MongoDBDataFeed.fromJson(readerToUse.reset());
            } else {
                return fromJsonKnownDiscriminator(readerToUse.reset());
            }
        });
    }

    static DataFeedDetail fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DataFeedDetail deserializedDataFeedDetail = new DataFeedDetail();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("dataFeedName".equals(fieldName)) {
                    deserializedDataFeedDetail.dataFeedName = reader.getString();
                } else if ("granularityName".equals(fieldName)) {
                    deserializedDataFeedDetail.granularityName = Granularity.fromString(reader.getString());
                } else if ("metrics".equals(fieldName)) {
                    List<DataFeedMetric> metrics = reader.readArray(reader1 -> DataFeedMetric.fromJson(reader1));
                    deserializedDataFeedDetail.metrics = metrics;
                } else if ("dataStartFrom".equals(fieldName)) {
                    deserializedDataFeedDetail.dataStartFrom
                        = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("dataFeedId".equals(fieldName)) {
                    deserializedDataFeedDetail.dataFeedId
                        = reader.getNullable(nonNullReader -> UUID.fromString(nonNullReader.getString()));
                } else if ("dataFeedDescription".equals(fieldName)) {
                    deserializedDataFeedDetail.dataFeedDescription = reader.getString();
                } else if ("granularityAmount".equals(fieldName)) {
                    deserializedDataFeedDetail.granularityAmount = reader.getNullable(JsonReader::getInt);
                } else if ("dimension".equals(fieldName)) {
                    List<DataFeedDimension> dimension
                        = reader.readArray(reader1 -> DataFeedDimension.fromJson(reader1));
                    deserializedDataFeedDetail.dimension = dimension;
                } else if ("timestampColumn".equals(fieldName)) {
                    deserializedDataFeedDetail.timestampColumn = reader.getString();
                } else if ("startOffsetInSeconds".equals(fieldName)) {
                    deserializedDataFeedDetail.startOffsetInSeconds = reader.getNullable(JsonReader::getLong);
                } else if ("maxConcurrency".equals(fieldName)) {
                    deserializedDataFeedDetail.maxConcurrency = reader.getNullable(JsonReader::getInt);
                } else if ("minRetryIntervalInSeconds".equals(fieldName)) {
                    deserializedDataFeedDetail.minRetryIntervalInSeconds = reader.getNullable(JsonReader::getLong);
                } else if ("stopRetryAfterInSeconds".equals(fieldName)) {
                    deserializedDataFeedDetail.stopRetryAfterInSeconds = reader.getNullable(JsonReader::getLong);
                } else if ("needRollup".equals(fieldName)) {
                    deserializedDataFeedDetail.needRollup = NeedRollupEnum.fromString(reader.getString());
                } else if ("rollUpMethod".equals(fieldName)) {
                    deserializedDataFeedDetail.rollUpMethod = RollUpMethod.fromString(reader.getString());
                } else if ("rollUpColumns".equals(fieldName)) {
                    List<String> rollUpColumns = reader.readArray(reader1 -> reader1.getString());
                    deserializedDataFeedDetail.rollUpColumns = rollUpColumns;
                } else if ("allUpIdentification".equals(fieldName)) {
                    deserializedDataFeedDetail.allUpIdentification = reader.getString();
                } else if ("fillMissingPointType".equals(fieldName)) {
                    deserializedDataFeedDetail.fillMissingPointType
                        = FillMissingPointType.fromString(reader.getString());
                } else if ("fillMissingPointValue".equals(fieldName)) {
                    deserializedDataFeedDetail.fillMissingPointValue = reader.getNullable(JsonReader::getDouble);
                } else if ("viewMode".equals(fieldName)) {
                    deserializedDataFeedDetail.viewMode = ViewMode.fromString(reader.getString());
                } else if ("admins".equals(fieldName)) {
                    List<String> admins = reader.readArray(reader1 -> reader1.getString());
                    deserializedDataFeedDetail.admins = admins;
                } else if ("viewers".equals(fieldName)) {
                    List<String> viewers = reader.readArray(reader1 -> reader1.getString());
                    deserializedDataFeedDetail.viewers = viewers;
                } else if ("isAdmin".equals(fieldName)) {
                    deserializedDataFeedDetail.isAdmin = reader.getNullable(JsonReader::getBoolean);
                } else if ("creator".equals(fieldName)) {
                    deserializedDataFeedDetail.creator = reader.getString();
                } else if ("status".equals(fieldName)) {
                    deserializedDataFeedDetail.status = EntityStatus.fromString(reader.getString());
                } else if ("createdTime".equals(fieldName)) {
                    deserializedDataFeedDetail.createdTime
                        = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("actionLinkTemplate".equals(fieldName)) {
                    deserializedDataFeedDetail.actionLinkTemplate = reader.getString();
                } else if ("authenticationType".equals(fieldName)) {
                    deserializedDataFeedDetail.authenticationType
                        = AuthenticationTypeEnum.fromString(reader.getString());
                } else if ("credentialId".equals(fieldName)) {
                    deserializedDataFeedDetail.credentialId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDataFeedDetail;
        });
    }
}
