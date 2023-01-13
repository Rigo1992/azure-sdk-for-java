// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.frontdoor.fluent.models.TimeseriesProperties;
import com.azure.resourcemanager.frontdoor.models.AggregationInterval;
import com.azure.resourcemanager.frontdoor.models.TimeseriesDataPoint;
import com.azure.resourcemanager.frontdoor.models.TimeseriesType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class TimeseriesPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TimeseriesProperties model =
            BinaryData
                .fromString(
                    "{\"endpoint\":\"kdvjsll\",\"startDateTimeUTC\":\"vvdfwatkpnpul\",\"endDateTimeUTC\":\"xbczwtruwiqz\",\"aggregationInterval\":\"Hourly\",\"timeseriesType\":\"LatencyP95\",\"country\":\"vmyokacspkwl\",\"timeseriesData\":[{\"dateTimeUTC\":\"bpxjmfl\",\"value\":54.163307},{\"dateTimeUTC\":\"chrkcciwwzjuqk\",\"value\":7.702547},{\"dateTimeUTC\":\"jiwkuofoskghsau\",\"value\":99.33306},{\"dateTimeUTC\":\"mvxi\",\"value\":69.20921}]}")
                .toObject(TimeseriesProperties.class);
        Assertions.assertEquals("kdvjsll", model.endpoint());
        Assertions.assertEquals("vvdfwatkpnpul", model.startDateTimeUtc());
        Assertions.assertEquals("xbczwtruwiqz", model.endDateTimeUtc());
        Assertions.assertEquals(AggregationInterval.HOURLY, model.aggregationInterval());
        Assertions.assertEquals(TimeseriesType.LATENCY_P95, model.timeseriesType());
        Assertions.assertEquals("vmyokacspkwl", model.country());
        Assertions.assertEquals("bpxjmfl", model.timeseriesData().get(0).dateTimeUtc());
        Assertions.assertEquals(54.163307F, model.timeseriesData().get(0).value());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TimeseriesProperties model =
            new TimeseriesProperties()
                .withEndpoint("kdvjsll")
                .withStartDateTimeUtc("vvdfwatkpnpul")
                .withEndDateTimeUtc("xbczwtruwiqz")
                .withAggregationInterval(AggregationInterval.HOURLY)
                .withTimeseriesType(TimeseriesType.LATENCY_P95)
                .withCountry("vmyokacspkwl")
                .withTimeseriesData(
                    Arrays
                        .asList(
                            new TimeseriesDataPoint().withDateTimeUtc("bpxjmfl").withValue(54.163307F),
                            new TimeseriesDataPoint().withDateTimeUtc("chrkcciwwzjuqk").withValue(7.702547F),
                            new TimeseriesDataPoint().withDateTimeUtc("jiwkuofoskghsau").withValue(99.33306F),
                            new TimeseriesDataPoint().withDateTimeUtc("mvxi").withValue(69.20921F)));
        model = BinaryData.fromObject(model).toObject(TimeseriesProperties.class);
        Assertions.assertEquals("kdvjsll", model.endpoint());
        Assertions.assertEquals("vvdfwatkpnpul", model.startDateTimeUtc());
        Assertions.assertEquals("xbczwtruwiqz", model.endDateTimeUtc());
        Assertions.assertEquals(AggregationInterval.HOURLY, model.aggregationInterval());
        Assertions.assertEquals(TimeseriesType.LATENCY_P95, model.timeseriesType());
        Assertions.assertEquals("vmyokacspkwl", model.country());
        Assertions.assertEquals("bpxjmfl", model.timeseriesData().get(0).dateTimeUtc());
        Assertions.assertEquals(54.163307F, model.timeseriesData().get(0).value());
    }
}
