// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.frontdoor.FrontDoorManager;
import com.azure.resourcemanager.frontdoor.models.FrontendEndpoint;
import com.azure.resourcemanager.frontdoor.models.SessionAffinityEnabledState;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class FrontendEndpointsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"resourceState\":\"Disabling\",\"customHttpsProvisioningState\":\"Enabled\",\"customHttpsProvisioningSubstate\":\"SubmittingDomainControlValidationRequest\",\"customHttpsConfiguration\":{\"certificateSource\":\"AzureKeyVault\",\"protocolType\":\"ServerNameIndication\",\"minimumTlsVersion\":\"1.0\"},\"hostName\":\"kdlpa\",\"sessionAffinityEnabledState\":\"Disabled\",\"sessionAffinityTtlSeconds\":79841741,\"webApplicationFirewallPolicyLink\":{\"id\":\"ilcfxwmdboxd\"}},\"name\":\"sftufqobrjlna\",\"type\":\"cc\",\"id\":\"nhxk\"}";

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

        FrontDoorManager manager =
            FrontDoorManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        FrontendEndpoint response =
            manager
                .frontendEndpoints()
                .getWithResponse("pqtgsfjac", "slhhxudbxv", "d", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("nhxk", response.id());
        Assertions.assertEquals("sftufqobrjlna", response.name());
        Assertions.assertEquals("kdlpa", response.hostname());
        Assertions.assertEquals(SessionAffinityEnabledState.DISABLED, response.sessionAffinityEnabledState());
        Assertions.assertEquals(79841741, response.sessionAffinityTtlSeconds());
        Assertions.assertEquals("ilcfxwmdboxd", response.webApplicationFirewallPolicyLink().id());
    }
}