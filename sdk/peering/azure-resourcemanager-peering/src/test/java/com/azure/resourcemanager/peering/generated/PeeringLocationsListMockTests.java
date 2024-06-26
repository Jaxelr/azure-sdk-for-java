// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.peering.PeeringManager;
import com.azure.resourcemanager.peering.models.Kind;
import com.azure.resourcemanager.peering.models.PeeringLocation;
import com.azure.resourcemanager.peering.models.PeeringLocationsDirectPeeringType;
import com.azure.resourcemanager.peering.models.PeeringLocationsKind;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class PeeringLocationsListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"kind\":\"Direct\",\"properties\":{\"direct\":{\"peeringFacilities\":[],\"bandwidthOffers\":[]},\"exchange\":{\"peeringFacilities\":[]},\"peeringLocation\":\"wggxkallat\",\"country\":\"lwuip\",\"azureRegion\":\"cjzkzivgvvcna\"},\"id\":\"rhyrnxxmueed\",\"name\":\"drd\",\"type\":\"stkwqqtch\"}]}";

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

        PeeringManager manager =
            PeeringManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<PeeringLocation> response =
            manager
                .peeringLocations()
                .list(
                    PeeringLocationsKind.EXCHANGE,
                    PeeringLocationsDirectPeeringType.IX,
                    com.azure.core.util.Context.NONE);

        Assertions.assertEquals(Kind.DIRECT, response.iterator().next().kind());
        Assertions.assertEquals("wggxkallat", response.iterator().next().peeringLocation());
        Assertions.assertEquals("lwuip", response.iterator().next().country());
        Assertions.assertEquals("cjzkzivgvvcna", response.iterator().next().azureRegion());
    }
}
