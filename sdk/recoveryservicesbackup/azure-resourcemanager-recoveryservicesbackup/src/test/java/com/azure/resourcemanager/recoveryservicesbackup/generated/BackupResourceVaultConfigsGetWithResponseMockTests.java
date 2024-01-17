// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupResourceVaultConfigResource;
import com.azure.resourcemanager.recoveryservicesbackup.models.EnhancedSecurityState;
import com.azure.resourcemanager.recoveryservicesbackup.models.SoftDeleteFeatureState;
import com.azure.resourcemanager.recoveryservicesbackup.models.StorageType;
import com.azure.resourcemanager.recoveryservicesbackup.models.StorageTypeState;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class BackupResourceVaultConfigsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"storageModelType\":\"LocallyRedundant\",\"storageType\":\"Invalid\",\"storageTypeState\":\"Invalid\",\"enhancedSecurityState\":\"Invalid\",\"softDeleteFeatureState\":\"Invalid\",\"softDeleteRetentionPeriodInDays\":1300257862,\"resourceGuardOperationRequests\":[\"p\",\"dpmiljpn\"],\"isSoftDeleteFeatureStateEditable\":false},\"eTag\":\"dqllzsauzpjlxeeh\",\"location\":\"xiqhzlraymezxlsk\",\"tags\":{\"nw\":\"xrfdsajre\",\"afpwzyifrkgwl\":\"yshtuwgmev\"},\"id\":\"xeqipx\",\"name\":\"zdyi\",\"type\":\"sfayorpravkjoges\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        RecoveryServicesBackupManager manager =
            RecoveryServicesBackupManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        BackupResourceVaultConfigResource response =
            manager
                .backupResourceVaultConfigs()
                .getWithResponse("weryekzk", "hmeott", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("xiqhzlraymezxlsk", response.location());
        Assertions.assertEquals("xrfdsajre", response.tags().get("nw"));
        Assertions.assertEquals(StorageType.LOCALLY_REDUNDANT, response.properties().storageModelType());
        Assertions.assertEquals(StorageType.INVALID, response.properties().storageType());
        Assertions.assertEquals(StorageTypeState.INVALID, response.properties().storageTypeState());
        Assertions.assertEquals(EnhancedSecurityState.INVALID, response.properties().enhancedSecurityState());
        Assertions.assertEquals(SoftDeleteFeatureState.INVALID, response.properties().softDeleteFeatureState());
        Assertions.assertEquals(1300257862, response.properties().softDeleteRetentionPeriodInDays());
        Assertions.assertEquals("p", response.properties().resourceGuardOperationRequests().get(0));
        Assertions.assertEquals(false, response.properties().isSoftDeleteFeatureStateEditable());
        Assertions.assertEquals("dqllzsauzpjlxeeh", response.etag());
    }
}
