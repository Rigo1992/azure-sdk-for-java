// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.support.models.PreferredContactMethod;
import com.azure.resourcemanager.support.models.UpdateContactProfile;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class UpdateContactProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UpdateContactProfile model =
            BinaryData
                .fromString(
                    "{\"firstName\":\"jugwdkcglhsl\",\"lastName\":\"jdyggdtji\",\"preferredContactMethod\":\"email\",\"primaryEmailAddress\":\"uofqwe\",\"additionalEmailAddresses\":[\"menevfyexfwh\",\"bcibvyvdcsitynn\",\"amdecte\",\"f\"],\"phoneNumber\":\"scjeypv\",\"preferredTimeZone\":\"zrkgqhcjrefovg\",\"country\":\"qsl\",\"preferredSupportLanguage\":\"yvxyqjp\"}")
                .toObject(UpdateContactProfile.class);
        Assertions.assertEquals("jugwdkcglhsl", model.firstName());
        Assertions.assertEquals("jdyggdtji", model.lastName());
        Assertions.assertEquals(PreferredContactMethod.EMAIL, model.preferredContactMethod());
        Assertions.assertEquals("uofqwe", model.primaryEmailAddress());
        Assertions.assertEquals("menevfyexfwh", model.additionalEmailAddresses().get(0));
        Assertions.assertEquals("scjeypv", model.phoneNumber());
        Assertions.assertEquals("zrkgqhcjrefovg", model.preferredTimeZone());
        Assertions.assertEquals("qsl", model.country());
        Assertions.assertEquals("yvxyqjp", model.preferredSupportLanguage());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UpdateContactProfile model =
            new UpdateContactProfile()
                .withFirstName("jugwdkcglhsl")
                .withLastName("jdyggdtji")
                .withPreferredContactMethod(PreferredContactMethod.EMAIL)
                .withPrimaryEmailAddress("uofqwe")
                .withAdditionalEmailAddresses(Arrays.asList("menevfyexfwh", "bcibvyvdcsitynn", "amdecte", "f"))
                .withPhoneNumber("scjeypv")
                .withPreferredTimeZone("zrkgqhcjrefovg")
                .withCountry("qsl")
                .withPreferredSupportLanguage("yvxyqjp");
        model = BinaryData.fromObject(model).toObject(UpdateContactProfile.class);
        Assertions.assertEquals("jugwdkcglhsl", model.firstName());
        Assertions.assertEquals("jdyggdtji", model.lastName());
        Assertions.assertEquals(PreferredContactMethod.EMAIL, model.preferredContactMethod());
        Assertions.assertEquals("uofqwe", model.primaryEmailAddress());
        Assertions.assertEquals("menevfyexfwh", model.additionalEmailAddresses().get(0));
        Assertions.assertEquals("scjeypv", model.phoneNumber());
        Assertions.assertEquals("zrkgqhcjrefovg", model.preferredTimeZone());
        Assertions.assertEquals("qsl", model.country());
        Assertions.assertEquals("yvxyqjp", model.preferredSupportLanguage());
    }
}
