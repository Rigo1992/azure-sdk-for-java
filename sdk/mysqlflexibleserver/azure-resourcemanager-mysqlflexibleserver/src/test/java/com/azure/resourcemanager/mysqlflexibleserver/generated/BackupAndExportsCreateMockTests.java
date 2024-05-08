// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.mysqlflexibleserver.MySqlManager;
import com.azure.resourcemanager.mysqlflexibleserver.models.BackupAndExportRequest;
import com.azure.resourcemanager.mysqlflexibleserver.models.BackupAndExportResponse;
import com.azure.resourcemanager.mysqlflexibleserver.models.BackupFormat;
import com.azure.resourcemanager.mysqlflexibleserver.models.BackupSettings;
import com.azure.resourcemanager.mysqlflexibleserver.models.BackupStoreDetails;
import com.azure.resourcemanager.mysqlflexibleserver.models.OperationStatus;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class BackupAndExportsCreateMockTests {
    @Test
    public void testCreate() throws Exception {
        String responseStr
            = "{\"status\":\"Succeeded\",\"startTime\":\"2021-03-25T23:54:59Z\",\"endTime\":\"2021-08-09T20:51:46Z\",\"percentComplete\":80.53391473097852,\"properties\":{\"datasourceSizeInBytes\":7194165159471944548,\"dataTransferredInBytes\":6966224071626794024,\"backupMetadata\":\"jeknizshq\"},\"id\":\"m\",\"name\":\"ev\",\"type\":\"gmblrri\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        MySqlManager manager = MySqlManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        BackupAndExportResponse response = manager.backupAndExports()
            .create("xmsivfomiloxggdu", "iqndieuzaofj",
                new BackupAndExportRequest()
                    .withBackupSettings(
                        new BackupSettings().withBackupName("hvcyyysfg").withBackupFormat(BackupFormat.RAW))
                    .withTargetDetails(new BackupStoreDetails()),
                com.azure.core.util.Context.NONE);

        Assertions.assertEquals(OperationStatus.SUCCEEDED, response.status());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-25T23:54:59Z"), response.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-09T20:51:46Z"), response.endTime());
        Assertions.assertEquals(80.53391473097852D, response.percentComplete());
        Assertions.assertEquals(7194165159471944548L, response.datasourceSizeInBytes());
        Assertions.assertEquals(6966224071626794024L, response.dataTransferredInBytes());
        Assertions.assertEquals("jeknizshq", response.backupMetadata());
    }
}
