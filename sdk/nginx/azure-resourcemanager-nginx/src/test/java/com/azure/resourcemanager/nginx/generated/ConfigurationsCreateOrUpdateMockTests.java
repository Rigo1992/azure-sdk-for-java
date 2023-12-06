// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.nginx.NginxManager;
import com.azure.resourcemanager.nginx.models.NginxConfiguration;
import com.azure.resourcemanager.nginx.models.NginxConfigurationFile;
import com.azure.resourcemanager.nginx.models.NginxConfigurationPackage;
import com.azure.resourcemanager.nginx.models.NginxConfigurationProperties;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ConfigurationsCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Succeeded\",\"files\":[{\"content\":\"yriwwroyqb\",\"virtualPath\":\"rmcqiby\"},{\"content\":\"ojvknmefqsgzvaha\",\"virtualPath\":\"y\"},{\"content\":\"pvgqzcjrvxdjzlm\",\"virtualPath\":\"xkvugfhzov\"},{\"content\":\"jvzunluthnnp\",\"virtualPath\":\"xipeilpjzuaejx\"}],\"protectedFiles\":[{\"content\":\"skzbb\",\"virtualPath\":\"zumveekgpwo\"},{\"content\":\"hkfpbs\",\"virtualPath\":\"ofd\"},{\"content\":\"uusdttouwa\",\"virtualPath\":\"ekqvkeln\"}],\"package\":{\"data\":\"bxwyjsflhhcaa\",\"protectedFiles\":[\"ixisxyawjoy\",\"qcslyjpkiid\",\"yexz\",\"eli\"]},\"rootFile\":\"nr\"},\"location\":\"folhbnxknal\",\"id\":\"lp\",\"name\":\"ggdtpnapnyiro\",\"type\":\"uhpigvp\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        NginxManager manager = NginxManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        NginxConfiguration response
            = manager
                .configurations().define("ovbvmeueciv").withExistingNginxDeployment("xcug",
                    "cjooxdjebwpucwwf")
                .withRegion("zmh")
                .withProperties(new NginxConfigurationProperties()
                    .withFiles(Arrays.asList(
                        new NginxConfigurationFile().withContent("jgjrwjueiotwm").withVirtualPath("ytdxwit"),
                        new NginxConfigurationFile().withContent("rjaw").withVirtualPath("wgxhn")))
                    .withProtectedFiles(
                        Arrays.asList(new NginxConfigurationFile().withContent("fbkp").withVirtualPath("gklwn"),
                            new NginxConfigurationFile().withContent("hjdauwhvylwz").withVirtualPath("dhxujznbmpo"),
                            new NginxConfigurationFile().withContent("wpr").withVirtualPath("lve"),
                            new NginxConfigurationFile().withContent("lupj").withVirtualPath("hfxobbcswsrtj")))
                    .withPackageProperty(new NginxConfigurationPackage().withData("lrbpbewtghfgbl")
                        .withProtectedFiles(Arrays.asList("xzvlvqhjkbegib", "nmxiebwwaloayqc", "wrtz")))
                    .withRootFile("zg"))
                .create();

        Assertions.assertEquals("yriwwroyqb", response.properties().files().get(0).content());
        Assertions.assertEquals("rmcqiby", response.properties().files().get(0).virtualPath());
        Assertions.assertEquals("skzbb", response.properties().protectedFiles().get(0).content());
        Assertions.assertEquals("zumveekgpwo", response.properties().protectedFiles().get(0).virtualPath());
        Assertions.assertEquals("bxwyjsflhhcaa", response.properties().packageProperty().data());
        Assertions.assertEquals("ixisxyawjoy", response.properties().packageProperty().protectedFiles().get(0));
        Assertions.assertEquals("nr", response.properties().rootFile());
        Assertions.assertEquals("folhbnxknal", response.location());
    }
}
