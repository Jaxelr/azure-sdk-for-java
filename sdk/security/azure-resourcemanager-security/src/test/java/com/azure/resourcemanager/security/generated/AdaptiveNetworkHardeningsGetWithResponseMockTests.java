// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.security.SecurityManager;
import com.azure.resourcemanager.security.models.AdaptiveNetworkHardening;
import com.azure.resourcemanager.security.models.Direction;
import com.azure.resourcemanager.security.models.TransportProtocol;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class AdaptiveNetworkHardeningsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"rules\":[{\"name\":\"erohextiguk\",\"direction\":\"Inbound\",\"destinationPort\":550409376,\"protocols\":[\"UDP\"],\"ipAddresses\":[\"bnpeenl\",\"tqy\",\"lfbsavqdv\"]},{\"name\":\"dsqephtoshq\",\"direction\":\"Inbound\",\"destinationPort\":1658662495,\"protocols\":[\"TCP\",\"TCP\",\"UDP\",\"TCP\"],\"ipAddresses\":[\"a\",\"ypyqoizfyasydd\",\"bwscjwyye\"]},{\"name\":\"iflrvfeowctshw\",\"direction\":\"Inbound\",\"destinationPort\":1973280311,\"protocols\":[\"TCP\",\"TCP\",\"TCP\"],\"ipAddresses\":[\"nwwumkbpg\",\"ilbwtpwbjlpfwuq\"]},{\"name\":\"pdgitenyuksl\",\"direction\":\"Inbound\",\"destinationPort\":1691455719,\"protocols\":[\"TCP\",\"UDP\"],\"ipAddresses\":[\"plan\",\"hqotmmxlmx\",\"jwyvjzbjwvtuekb\"]}],\"rulesCalculationTime\":\"2021-05-31T10:11:28Z\",\"effectiveNetworkSecurityGroups\":[{\"networkInterface\":\"psbeqieiux\",\"networkSecurityGroups\":[\"wndalnjjh\",\"gkjjpcpi\"]},{\"networkInterface\":\"zyxvta\",\"networkSecurityGroups\":[\"atoidne\",\"urdgc\",\"zanaqvengnpuelr\",\"anbrpkocuxfbage\"]}]},\"id\":\"jt\",\"name\":\"ltckiwxggfagi\",\"type\":\"xmdboefnhx\"}";

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

        SecurityManager manager = SecurityManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        AdaptiveNetworkHardening response = manager.adaptiveNetworkHardenings().getWithResponse("fevtwllqy",
            "mjcoyvfwgkzuhksh", "jkckwbqwjyfmmk", "ahr", "oyzhobnvyu", com.azure.core.util.Context.NONE).getValue();

        Assertions.assertEquals("erohextiguk", response.rules().get(0).name());
        Assertions.assertEquals(Direction.INBOUND, response.rules().get(0).direction());
        Assertions.assertEquals(550409376, response.rules().get(0).destinationPort());
        Assertions.assertEquals(TransportProtocol.UDP, response.rules().get(0).protocols().get(0));
        Assertions.assertEquals("bnpeenl", response.rules().get(0).ipAddresses().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-31T10:11:28Z"), response.rulesCalculationTime());
        Assertions.assertEquals("psbeqieiux", response.effectiveNetworkSecurityGroups().get(0).networkInterface());
        Assertions.assertEquals("wndalnjjh",
            response.effectiveNetworkSecurityGroups().get(0).networkSecurityGroups().get(0));
    }
}
