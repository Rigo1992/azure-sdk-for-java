// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.CapabilityPropertiesInner;

public final class CapabilityPropertiesInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CapabilityPropertiesInner model = BinaryData.fromString(
            "{\"zone\":\"haaxdbabphl\",\"supportedHAMode\":[\"lfktsths\",\"cocmnyyaztt\",\"twwrqp\"],\"supportedGeoBackupRegions\":[\"ckzywbiexzfeyue\",\"xibxujwbhqwalm\",\"zyoxaepdkzjan\"],\"supportedFlexibleServerEditions\":[{\"name\":\"hdwbavxbniwdjs\",\"supportedStorageEditions\":[{\"name\":\"dbpgnxytxhp\",\"minStorageSize\":6965353138700786103,\"maxStorageSize\":4599278762686577783,\"minBackupRetentionDays\":1128579127863386058,\"maxBackupRetentionDays\":2954127494551014521,\"minBackupIntervalHours\":8884342571785633710,\"maxBackupIntervalHours\":6725346619350246793},{\"name\":\"qik\",\"minStorageSize\":4686720275139209939,\"maxStorageSize\":4066990735502965774,\"minBackupRetentionDays\":4482552076983589302,\"maxBackupRetentionDays\":9033085087546122027,\"minBackupIntervalHours\":151235075959718301,\"maxBackupIntervalHours\":4627558794387697712}],\"supportedServerVersions\":[{\"name\":\"fssxqukkfplg\",\"supportedSkus\":[{},{},{},{}]},{\"name\":\"nkjzkdeslpvlop\",\"supportedSkus\":[{},{}]},{\"name\":\"ghxpkdw\",\"supportedSkus\":[{},{},{},{}]},{\"name\":\"uebbaumnyqup\",\"supportedSkus\":[{},{}]}]},{\"name\":\"jn\",\"supportedStorageEditions\":[{\"name\":\"hsmtxpsiebtfhvp\",\"minStorageSize\":8197357733931810453,\"maxStorageSize\":6828337730937778205,\"minBackupRetentionDays\":1416784168319255792,\"maxBackupRetentionDays\":7005227375358827798,\"minBackupIntervalHours\":6206046747227637327,\"maxBackupIntervalHours\":8940546233492359275},{\"name\":\"yzxuutkncw\",\"minStorageSize\":8510740878740325389,\"maxStorageSize\":3553868760097746067,\"minBackupRetentionDays\":3730268985212494326,\"maxBackupRetentionDays\":3059942577979459990,\"minBackupIntervalHours\":5623641553510482328,\"maxBackupIntervalHours\":1377433518907384393},{\"name\":\"nmic\",\"minStorageSize\":2405613311223281971,\"maxStorageSize\":1106790726186797280,\"minBackupRetentionDays\":7472475859775012929,\"maxBackupRetentionDays\":2774525009575125279,\"minBackupIntervalHours\":9162698080324973367,\"maxBackupIntervalHours\":4609095733155720227}],\"supportedServerVersions\":[{\"name\":\"bkc\",\"supportedSkus\":[{}]},{\"name\":\"bttk\",\"supportedSkus\":[{},{}]},{\"name\":\"pnvjtoqnermclf\",\"supportedSkus\":[{},{}]},{\"name\":\"oxuscrpabgyepsbj\",\"supportedSkus\":[{}]}]},{\"name\":\"ugxywpmueef\",\"supportedStorageEditions\":[{\"name\":\"qkqujidsu\",\"minStorageSize\":722648832186407891,\"maxStorageSize\":5846205401797666469,\"minBackupRetentionDays\":255129733690814288,\"maxBackupRetentionDays\":6109729315906421159,\"minBackupIntervalHours\":6790686105962724617,\"maxBackupIntervalHours\":2268947559228407869},{\"name\":\"xy\",\"minStorageSize\":5579898580342682580,\"maxStorageSize\":2820167512194411958,\"minBackupRetentionDays\":7703197767912555921,\"maxBackupRetentionDays\":1731749490804613022,\"minBackupIntervalHours\":7047535531175801519,\"maxBackupIntervalHours\":6478150774243714531}],\"supportedServerVersions\":[{\"name\":\"lrqjbhckfr\",\"supportedSkus\":[{},{}]},{\"name\":\"sbkyvpycanuzbp\",\"supportedSkus\":[{},{}]}]},{\"name\":\"kuwbcrnwb\",\"supportedStorageEditions\":[{\"name\":\"seyvj\",\"minStorageSize\":2840663437896188419,\"maxStorageSize\":9185471581407404902,\"minBackupRetentionDays\":8368050396519703227,\"maxBackupRetentionDays\":7977565137373702188,\"minBackupIntervalHours\":3488305487791082872,\"maxBackupIntervalHours\":1437950505829489017},{\"name\":\"gkvtmelmqkrhah\",\"minStorageSize\":9144697658006681867,\"maxStorageSize\":8641218324516083606,\"minBackupRetentionDays\":6531016586304771464,\"maxBackupRetentionDays\":6112562014909407139,\"minBackupIntervalHours\":4716171323603349027,\"maxBackupIntervalHours\":5990210580748230219}],\"supportedServerVersions\":[{\"name\":\"pvfadmwsrcr\",\"supportedSkus\":[{},{}]},{\"name\":\"vgomz\",\"supportedSkus\":[{},{}]},{\"name\":\"sgwbnbbeld\",\"supportedSkus\":[{}]}]}]}")
            .toObject(CapabilityPropertiesInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CapabilityPropertiesInner model = new CapabilityPropertiesInner();
        model = BinaryData.fromObject(model).toObject(CapabilityPropertiesInner.class);
    }
}
