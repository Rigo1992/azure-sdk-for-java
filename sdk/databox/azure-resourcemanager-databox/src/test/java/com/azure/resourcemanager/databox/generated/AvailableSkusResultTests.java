// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databox.models.AvailableSkusResult;
import org.junit.jupiter.api.Assertions;

public final class AvailableSkusResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AvailableSkusResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"sku\":{\"name\":\"DataBox\",\"displayName\":\"qrvkdv\",\"family\":\"llr\"},\"enabled\":true,\"properties\":{\"dataLocationToServiceLocationMap\":[],\"costs\":[],\"apiVersions\":[],\"disabledReason\":\"Region\",\"disabledReasonMessage\":\"pulexxbczw\",\"requiredFeature\":\"uwiqzb\"}},{\"sku\":{\"name\":\"DataBox\",\"displayName\":\"ovm\",\"family\":\"kacspkw\"},\"enabled\":true,\"properties\":{\"dataLocationToServiceLocationMap\":[],\"costs\":[],\"apiVersions\":[],\"disabledReason\":\"Feature\",\"disabledReasonMessage\":\"lb\",\"requiredFeature\":\"nchrkcciww\"}},{\"sku\":{\"name\":\"DataBoxHeavy\",\"displayName\":\"khrs\",\"family\":\"iwkuofos\"},\"enabled\":true,\"properties\":{\"dataLocationToServiceLocationMap\":[],\"costs\":[],\"apiVersions\":[],\"disabledReason\":\"Region\",\"disabledReasonMessage\":\"vxieduugidyj\",\"requiredFeature\":\"f\"}},{\"sku\":{\"name\":\"DataBoxHeavy\",\"displayName\":\"svexcsonpclhoco\",\"family\":\"lkevle\"},\"enabled\":false,\"properties\":{\"dataLocationToServiceLocationMap\":[],\"costs\":[],\"apiVersions\":[],\"disabledReason\":\"Region\",\"disabledReasonMessage\":\"axkffei\",\"requiredFeature\":\"hl\"}}],\"nextLink\":\"ez\"}")
                .toObject(AvailableSkusResult.class);
        Assertions.assertEquals("ez", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AvailableSkusResult model = new AvailableSkusResult().withNextLink("ez");
        model = BinaryData.fromObject(model).toObject(AvailableSkusResult.class);
        Assertions.assertEquals("ez", model.nextLink());
    }
}
