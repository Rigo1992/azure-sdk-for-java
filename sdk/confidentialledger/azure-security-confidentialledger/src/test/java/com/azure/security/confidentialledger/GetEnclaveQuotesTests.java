// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.confidentialledger;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.netty.NettyAsyncHttpClientBuilder;
import com.azure.core.http.rest.Response;
import com.azure.core.test.TestMode;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Configuration;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import reactor.core.publisher.Mono;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class GetEnclaveQuotesTests extends ConfidentialLedgerClientTestBase {

    @Test
    public void testGetEnclaveQuotes() throws Exception {
       
        String ledgerId = Configuration.getGlobalConfiguration().get("LEDGERID", "emily-java-sdk-tests");
        // this is a built in test of getLedgerIdentity
        Response<BinaryData> ledgerIdentityWithResponse = confidentialLedgerIdentityClient
                .getLedgerIdentityWithResponse(ledgerId, null);

        BinaryData identityResponse = ledgerIdentityWithResponse.getValue();
        ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(identityResponse.toBytes());
        String ledgerTslCertificate = jsonNode.get("ledgerTlsCertificate").asText();


        SslContext sslContext = SslContextBuilder.forClient()
                .trustManager(new ByteArrayInputStream(ledgerTslCertificate.getBytes(StandardCharsets.UTF_8))).build();
        reactor.netty.http.client.HttpClient reactorClient = reactor.netty.http.client.HttpClient.create()
                .secure(sslContextSpec -> sslContextSpec.sslContext(sslContext));
        HttpClient httpClient = new NettyAsyncHttpClientBuilder(reactorClient).wiretap(true).build();

        if (getTestMode() == TestMode.PLAYBACK) {
            confidentialLedgerClientBuilder
                .httpClient(interceptorManager.getPlaybackClient())
                .credential(request -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)));
        } else if (getTestMode() == TestMode.RECORD) {
            confidentialLedgerClientBuilder
                .addPolicy(interceptorManager.getRecordPolicy())
                .httpClient(httpClient)
                .credential(new DefaultAzureCredentialBuilder().build());
        } else if (getTestMode() == TestMode.LIVE) {
            confidentialLedgerClientBuilder
                .credential(new DefaultAzureCredentialBuilder().build())
                .httpClient(httpClient);
        }
        
        ConfidentialLedgerClient client = confidentialLedgerClientBuilder.buildClient();
        Response<BinaryData> enclaveQuotesWithResponse = client.getEnclaveQuotesWithResponse(null);
        Assertions.assertEquals(enclaveQuotesWithResponse.getStatusCode(), 200);
        BinaryData parsedResponse = enclaveQuotesWithResponse.getValue();

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode responseBodyJson = objectMapper.readTree(parsedResponse.toBytes());
        JsonNode enclaveQuotes = responseBodyJson.get("enclaveQuotes");
        String enclaveQuotesKey = enclaveQuotes.fields().next().getKey();
        Assertions.assertEquals(enclaveQuotes.get(enclaveQuotesKey).get("quoteVersion").asText(), "OE_SGX_v1");


    }
}
