// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.models.IssueCommentCollection;
import org.junit.jupiter.api.Assertions;

public final class IssueCommentCollectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IssueCommentCollection model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"text\":\"aedorvvmqf\",\"createdDate\":\"2021-07-17T03:29:04Z\",\"userId\":\"gbdg\"},\"id\":\"umgxdgdhpab\",\"name\":\"dexjddvjs\",\"type\":\"qwotmmwllcol\"},{\"properties\":{\"text\":\"sxap\",\"createdDate\":\"2021-05-30T01:29:06Z\",\"userId\":\"hexcgjokj\"},\"id\":\"jnhvlqjbekpeeks\",\"name\":\"bksdqhjvyklxesl\",\"type\":\"hhus\"},{\"properties\":{\"text\":\"poq\",\"createdDate\":\"2021-07-15T20:43:24Z\",\"userId\":\"nwqjwgokn\"},\"id\":\"ejjjkxybwfdb\",\"name\":\"jbzten\",\"type\":\"vkzykjtjknsxf\"}],\"count\":5476162260043387200,\"nextLink\":\"dpkupnqrmgjf\"}")
                .toObject(IssueCommentCollection.class);
        Assertions.assertEquals(5476162260043387200L, model.count());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IssueCommentCollection model = new IssueCommentCollection().withCount(5476162260043387200L);
        model = BinaryData.fromObject(model).toObject(IssueCommentCollection.class);
        Assertions.assertEquals(5476162260043387200L, model.count());
    }
}
