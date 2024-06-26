// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.frontdoor.models.FrontDoorListResult;
import org.junit.jupiter.api.Assertions;

public final class FrontDoorListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FrontDoorListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"resourceState\":\"Enabled\",\"provisioningState\":\"ujqgidok\",\"cname\":\"ljyoxgvcltb\",\"frontdoorId\":\"ncghkje\",\"rulesEngines\":[{\"properties\":{},\"id\":\"bijhtxfvgxbf\",\"name\":\"mxnehmp\",\"type\":\"ec\"},{\"properties\":{},\"id\":\"odebfqkkrbmpu\",\"name\":\"gr\",\"type\":\"wflzlfbxzpuzy\"},{\"properties\":{},\"id\":\"spnqzahmgkb\",\"name\":\"pyydhi\",\"type\":\"nuqqkpikadrgvt\"}],\"extendedProperties\":{\"uynhijg\":\"n\",\"iarbutrcvpna\":\"mebf\"},\"friendlyName\":\"mhjrunmpxttdbhr\",\"routingRules\":[{\"properties\":{},\"name\":\"kx\",\"type\":\"skpbhenbtkcxywn\",\"id\":\"nrs\"}],\"loadBalancingSettings\":[{\"properties\":{},\"name\":\"dybyxczfclhaa\",\"type\":\"babphlwrqlfk\",\"id\":\"thsu\"},{\"properties\":{},\"name\":\"mnyyazt\",\"type\":\"twwrqp\",\"id\":\"dckzywbiexz\"}],\"healthProbeSettings\":[{\"properties\":{},\"name\":\"axibxujw\",\"type\":\"qwalmuzyoxaepd\",\"id\":\"jancu\"},{\"properties\":{},\"name\":\"d\",\"type\":\"avxbniwdjswztsdb\",\"id\":\"nxytxh\"},{\"properties\":{},\"name\":\"bzpfzab\",\"type\":\"cuh\",\"id\":\"tcty\"}],\"backendPools\":[{\"properties\":{},\"name\":\"bovpl\",\"type\":\"bhvgy\",\"id\":\"uosvmkfssxqukk\"}],\"frontendEndpoints\":[{\"properties\":{},\"name\":\"gsxnkjzkdeslpv\",\"type\":\"pwiyig\",\"id\":\"pkdwzbai\"}],\"backendPoolsSettings\":{\"enforceCertificateNameCheck\":\"Disabled\",\"sendRecvTimeoutSeconds\":1370468424},\"enabledState\":\"Disabled\"},\"location\":\"yqupedeojnabckh\",\"tags\":{\"pskrdqmh\":\"xpsiebtfhvpes\"},\"id\":\"jdhtldwkyzxu\",\"name\":\"tkncwsc\",\"type\":\"svlxotogtwrup\"}],\"nextLink\":\"xvnmicykvceov\"}")
            .toObject(FrontDoorListResult.class);
        Assertions.assertEquals("xvnmicykvceov", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FrontDoorListResult model = new FrontDoorListResult().withNextLink("xvnmicykvceov");
        model = BinaryData.fromObject(model).toObject(FrontDoorListResult.class);
        Assertions.assertEquals("xvnmicykvceov", model.nextLink());
    }
}
