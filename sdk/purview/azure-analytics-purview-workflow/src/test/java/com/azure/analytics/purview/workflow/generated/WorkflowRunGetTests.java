// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.workflow.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public final class WorkflowRunGetTests extends PurviewWorkflowClientTestBase {
    @Test
    @Disabled
    public void testWorkflowRunGetTests() {
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                workflowRunClient.getWithResponse("04334a74-3400-11ed-a261-0242ac120002", requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
        Assertions.assertEquals(
                BinaryData.fromString(
                                "{\"actionDag\":{\"actions\":{\"Condition\":{\"type\":\"If\",\"actions\":{\"Create glossary term\":{\"type\":\"CreateTerm\",\"runAfter\":{}},\"Send email notification\":{\"type\":\"EmailNotification\",\"inputs\":{\"parameters\":{\"emailMessage\":\"Your request for Glossary Term @{triggerBody()['request']['term']['name']} is approved.\",\"emailRecipients\":[\"@{triggerBody()['request']['requestor']}\"],\"emailSubject\":\"Glossary Term Create - APPROVED\"}},\"runAfter\":{\"Create glossary term\":[\"Succeeded\"]},\"runtimeConfiguration\":{\"secureInput\":false,\"secureOutput\":false}}},\"else\":{\"actions\":{\"Send reject email notification\":{\"type\":\"EmailNotification\",\"inputs\":{\"parameters\":{\"emailMessage\":\"Your request for Glossary Term @{triggerBody()['request']['term']['name']} is rejected.\",\"emailRecipients\":[\"@{triggerBody()['request']['requestor']}\"],\"emailSubject\":\"Glossary Term Create - REJECTED\"}},\"runAfter\":{},\"runtimeConfiguration\":{\"secureInput\":false,\"secureOutput\":false}}}},\"expression\":{\"and\":[{\"equals\":[\"@outputs('Start and wait for an approval')['body/outcome']\",\"Approved\"]}]},\"runAfter\":{\"Start and wait for an approval\":[\"Succeeded\"]}},\"Start and wait for an approval\":{\"type\":\"Approval\",\"inputs\":{\"parameters\":{\"approvalType\":\"PendingOnAll\",\"assignedTo\":[\"eece94d9-0619-4669-bb8a-d6ecec5220bc\"],\"expirySettings\":{\"expireAfter\":\"1 month\",\"notifyOnExpiration\":[]},\"reminderSettings\":{\"interval\":\"1 day\"},\"title\":\"Approval Request for Create Glossary Term\"}},\"runAfter\":{}}}},\"detail\":{\"actions\":{\"Start and wait for an approval\":{\"input\":{\"type\":\"inlined\",\"parameters\":{\"approvalType\":\"PendingOnAll\",\"assignedTo\":[\"eece94d9-0619-4669-bb8a-d6ecec5220bc\"],\"expirySettings\":{\"expireAfter\":\"1 month\",\"notifyOnExpiration\":[]},\"reminderSettings\":{\"interval\":\"1 day\"},\"title\":\"Approval Request for Create Glossary Term\"}},\"startTime\":\"2023-01-12T09:36:12.347229300Z\",\"status\":\"Running\"}},\"runInput\":{\"request\":{\"requestor\":\"eece94d9-0619-4669-bb8a-d6ecec5220bc\",\"term\":{\"name\":\"term123\",\"definition\":null,\"experts\":[],\"formalName\":\"term123\",\"parent\":null,\"stewards\":[]}}}},\"id\":\"4f8d70c3-c09b-4e56-bfd1-8b86c79bd4d9\",\"requestor\":\"eece94d9-0619-4669-bb8a-d6ecec5220bc\",\"runPayload\":{\"type\":\"CreateTerm\",\"payload\":{\"glossaryTerm\":{\"name\":\"term123\",\"anchor\":{\"glossaryGuid\":\"20031e20-b4df-4a66-a61d-1b0716f3fa48\"},\"attributes\":{},\"nickName\":\"term123\",\"status\":\"Approved\"}},\"targetValue\":\"term123\"},\"startTime\":\"2023-01-12T09:36:11.533263721Z\",\"status\":\"InProgress\",\"workflowId\":\"3fb9ba13-bf35-4f29-ab63-70b5234923c2\"}")
                        .toObject(Object.class),
                response.getValue().toObject(Object.class));
    }
}
