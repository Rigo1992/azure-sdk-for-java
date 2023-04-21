// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.SnapshotInner;
import com.azure.resourcemanager.netapp.models.SnapshotsList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SnapshotsListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SnapshotsList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"location\":\"gjrwjueiotwmcdyt\",\"properties\":{\"snapshotId\":\"it\",\"created\":\"2021-05-14T21:36:27Z\",\"provisioningState\":\"awgqwgxhni\"},\"id\":\"x\",\"name\":\"bkpyc\",\"type\":\"klwndnhjdauwhv\"},{\"location\":\"l\",\"properties\":{\"snapshotId\":\"tdhxujznbmpowuwp\",\"created\":\"2021-07-21T15:39:33Z\",\"provisioningState\":\"veual\"},\"id\":\"j\",\"name\":\"khfxobbcswsrt\",\"type\":\"riplrbpbewtg\"},{\"location\":\"fgb\",\"properties\":{\"snapshotId\":\"wxzvlvqhjkb\",\"created\":\"2021-11-14T02:33:08Z\",\"provisioningState\":\"nmxiebwwaloayqc\"},\"id\":\"rtzju\",\"name\":\"gwyzm\",\"type\":\"txon\"},{\"location\":\"mtsavjcbpwxqp\",\"properties\":{\"snapshotId\":\"nftguvriuhpr\",\"created\":\"2021-02-04T08:02:16Z\",\"provisioningState\":\"vxqtayriwwroyqbe\"},\"id\":\"mcqibycnojv\",\"name\":\"nmefqsgzvahapj\",\"type\":\"zhpvgqzcjrvxd\"}]}")
                .toObject(SnapshotsList.class);
        Assertions.assertEquals("gjrwjueiotwmcdyt", model.value().get(0).location());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SnapshotsList model =
            new SnapshotsList()
                .withValue(
                    Arrays
                        .asList(
                            new SnapshotInner().withLocation("gjrwjueiotwmcdyt"),
                            new SnapshotInner().withLocation("l"),
                            new SnapshotInner().withLocation("fgb"),
                            new SnapshotInner().withLocation("mtsavjcbpwxqp")));
        model = BinaryData.fromObject(model).toObject(SnapshotsList.class);
        Assertions.assertEquals("gjrwjueiotwmcdyt", model.value().get(0).location());
    }
}
