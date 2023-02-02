// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logz.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.logz.models.UserInfo;
import org.junit.jupiter.api.Assertions;

public final class UserInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UserInfo model =
            BinaryData
                .fromString(
                    "{\"firstName\":\"uht\",\"lastName\":\"wisdkft\",\"emailAddress\":\"xmnteiwaop\",\"phoneNumber\":\"mijcmmxdcufufs\"}")
                .toObject(UserInfo.class);
        Assertions.assertEquals("uht", model.firstName());
        Assertions.assertEquals("wisdkft", model.lastName());
        Assertions.assertEquals("xmnteiwaop", model.emailAddress());
        Assertions.assertEquals("mijcmmxdcufufs", model.phoneNumber());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UserInfo model =
            new UserInfo()
                .withFirstName("uht")
                .withLastName("wisdkft")
                .withEmailAddress("xmnteiwaop")
                .withPhoneNumber("mijcmmxdcufufs");
        model = BinaryData.fromObject(model).toObject(UserInfo.class);
        Assertions.assertEquals("uht", model.firstName());
        Assertions.assertEquals("wisdkft", model.lastName());
        Assertions.assertEquals("xmnteiwaop", model.emailAddress());
        Assertions.assertEquals("mijcmmxdcufufs", model.phoneNumber());
    }
}
