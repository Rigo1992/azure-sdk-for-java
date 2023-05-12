// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.FirewallStatusResourceInner;

public final class FirewallStatusResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FirewallStatusResourceInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"isPanoramaManaged\":\"TRUE\",\"healthStatus\":\"RED\",\"healthReason\":\"ebjvewzcjzn\",\"panoramaStatus\":{\"panoramaServerStatus\":\"DOWN\",\"panoramaServer2Status\":\"DOWN\"},\"provisioningState\":\"Failed\"},\"id\":\"draufactkah\",\"name\":\"ovajjziuxxps\",\"type\":\"neekulfg\"}")
                .toObject(FirewallStatusResourceInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FirewallStatusResourceInner model = new FirewallStatusResourceInner();
        model = BinaryData.fromObject(model).toObject(FirewallStatusResourceInner.class);
    }
}
