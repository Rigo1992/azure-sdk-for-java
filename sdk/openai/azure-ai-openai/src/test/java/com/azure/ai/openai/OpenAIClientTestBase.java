// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.openai;

import com.azure.ai.openai.models.ChatChoice;
import com.azure.ai.openai.models.ChatCompletions;
import com.azure.ai.openai.models.ChatMessage;
import com.azure.ai.openai.models.ChatRole;
import com.azure.ai.openai.models.Choice;
import com.azure.ai.openai.models.Completions;
import com.azure.ai.openai.models.CompletionsFinishReason;
import com.azure.ai.openai.models.CompletionsLogProbabilityModel;
import com.azure.ai.openai.models.EmbeddingItem;
import com.azure.ai.openai.models.Embeddings;
import com.azure.ai.openai.models.EmbeddingsOptions;
import com.azure.ai.openai.models.StringInputModel;
import com.azure.core.credential.AzureKeyCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.test.TestBase;
import com.azure.core.test.TestMode;
import com.azure.core.util.Configuration;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

import static com.azure.ai.openai.TestUtils.FAKE_API_KEY;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public abstract class OpenAIClientTestBase extends TestBase {

    OpenAIClientBuilder getOpenAIClientBuilder(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        OpenAIClientBuilder builder = new OpenAIClientBuilder()
            .httpClient(httpClient)
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
            .serviceVersion(serviceVersion);

        if (getTestMode() == TestMode.PLAYBACK) {
            builder
                .endpoint("https://localhost:8080")
                .credential(new AzureKeyCredential(FAKE_API_KEY));
        } else if (getTestMode() == TestMode.RECORD) {
            builder
                .addPolicy(interceptorManager.getRecordPolicy())
                .endpoint(Configuration.getGlobalConfiguration().get("AZURE_OPENAI_ENDPOINT"))
                .credential(new AzureKeyCredential(Configuration.getGlobalConfiguration().get("AZURE_OPENAI_KEY")));
        } else {
            builder
                .endpoint(Configuration.getGlobalConfiguration().get("AZURE_OPENAI_ENDPOINT"))
                .credential(new AzureKeyCredential(Configuration.getGlobalConfiguration().get("AZURE_OPENAI_KEY")));
        }
        return builder;
    }

    @Test
    public abstract void getCompletions(HttpClient httpClient, OpenAIServiceVersion serviceVersion);

    @Test
    public abstract void getCompletionsWithResponse(HttpClient httpClient, OpenAIServiceVersion serviceVersion);

    void getCompletionsRunner(BiConsumer<String, List<String>> testRunner) {
        String deploymentId = "text-davinci-003";
        List<String> prompt = new ArrayList<>();
        prompt.add("Say this is a test");
        testRunner.accept(deploymentId, prompt);
    }

    static void assertCompletions(int[] index, CompletionsLogProbabilityModel[] logprobs,
        CompletionsFinishReason[] finishReason, Completions actual) {
        assertNotNull(actual.getId());
        assertChoices(index, logprobs, finishReason, actual.getChoices());
        assertNotNull(actual.getUsage());
    }

    static void assertChoices(int[] index, CompletionsLogProbabilityModel[] logprobs,
        CompletionsFinishReason[] finishReason, List<Choice> actual) {
        assertEquals(index.length, actual.size());

        for (int i = 0; i < actual.size(); i++) {
            assertChoice(index[i], null, null, actual.get(i));
        }
    }

    static void assertChoice(int index, CompletionsLogProbabilityModel logprobs,
                             CompletionsFinishReason finishReason, Choice actual) {
        assertNotNull(actual.getText());
        assertNotNull(actual.getFinishReason());
        assertEquals(index, actual.getIndex());

        // TODO: add more assertions for the additional properties
    }

    @Test
    public abstract void getChatCompletions(HttpClient httpClient, OpenAIServiceVersion serviceVersion);

    @Test
    public abstract void getChatCompletionsWithResponse(HttpClient httpClient, OpenAIServiceVersion serviceVersion);

    void getChatCompletionsRunner(BiConsumer<String, List<ChatMessage>> testRunner) {
        String deploymentId = "gpt-35-turbo";
        List<ChatMessage> chatMessages = new ArrayList<>();
        chatMessages.add(new ChatMessage(ChatRole.SYSTEM).setContent("You are a helpful assistant. You will talk like a pirate."));
        chatMessages.add(new ChatMessage(ChatRole.USER).setContent("Can you help me?"));
        chatMessages.add(new ChatMessage(ChatRole.ASSISTANT).setContent("Of course, me hearty! What can I do for ye?"));
        chatMessages.add(new ChatMessage(ChatRole.USER).setContent("What's the best way to train a parrot?"));
        testRunner.accept(deploymentId, chatMessages);
    }

    static void assertChatCompletions(int[] indexArray, ChatRole[] chatRoleArray, ChatCompletions actual) {
        List<ChatChoice> choices = actual.getChoices();
        assertNotNull(choices);
        assertTrue(choices.size() > 0);
        assertChatChoices(indexArray, chatRoleArray, choices);
        assertNotNull(actual.getUsage());
    }

    static void assertChatChoices(int[] indexArray, ChatRole[] chatRoleArray, List<ChatChoice> actual) {
        assertEquals(indexArray.length, actual.size());
        for (int i = 0; i < actual.size(); i++) {
            assertChatChoice(indexArray[i], chatRoleArray[i], actual.get(i));
        }
    }

    static void assertChatChoice(int index, ChatRole chatRole, ChatChoice actual) {
        assertEquals(index, actual.getIndex());
        assertEquals(chatRole, actual.getMessage().getRole());
        assertNotNull(actual.getMessage().getContent());
        // TODO: verify if the finish reason is "stop" or "stopped"
//        assertEquals(CompletionsFinishReason.STOPPED, actual.getFinishReason());
    }

    @Test
    public abstract void getEmbeddings(HttpClient httpClient, OpenAIServiceVersion serviceVersion);

    @Test
    public abstract void getEmbeddingsWithResponse(HttpClient httpClient, OpenAIServiceVersion serviceVersion);

    void getEmbeddingRunner(BiConsumer<String, EmbeddingsOptions> testRunner) {
        String deploymentId = "embedding";
        EmbeddingsOptions embeddingsOptions = new EmbeddingsOptions(new StringInputModel("Your text string goes here"));
        testRunner.accept(deploymentId, embeddingsOptions);
    }

    static void assertEmbeddings(Embeddings actual) {
        List<EmbeddingItem> data = actual.getData();
        assertNotNull(data);
        assertTrue(data.size() > 0);

        for (EmbeddingItem item : data) {
            List<Double> embedding = item.getEmbedding();
            assertNotNull(embedding);
            assertTrue(embedding.size() > 0);
        }
        assertNotNull(actual.getUsage());
    }
}
