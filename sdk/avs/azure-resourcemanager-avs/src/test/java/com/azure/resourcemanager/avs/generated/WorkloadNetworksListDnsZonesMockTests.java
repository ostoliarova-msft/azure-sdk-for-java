// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.avs.AvsManager;
import com.azure.resourcemanager.avs.models.WorkloadNetworkDnsZone;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class WorkloadNetworksListDnsZonesMockTests {
    @Test
    public void testListDnsZones() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"displayName\":\"dnjzh\",\"domain\":[\"ylhjlm\",\"oyxprimr\",\"opteecj\",\"eislstvasylwx\"],\"dnsServerIps\":[\"umweoohguufuzboy\",\"athwt\",\"olbaemwmdx\",\"ebwjscjpahlxvea\"],\"sourceIp\":\"qxnmwmqt\",\"dnsServices\":3284652238021656307,\"provisioningState\":\"Building\",\"revision\":1985596769029107559},\"id\":\"vqcttadija\",\"name\":\"ukm\",\"type\":\"sieekpndzaapm\"}]}";

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

        AvsManager manager =
            AvsManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<WorkloadNetworkDnsZone> response =
            manager.workloadNetworks().listDnsZones("llibphbqzmizak", "kan", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("dnjzh", response.iterator().next().displayName());
        Assertions.assertEquals("ylhjlm", response.iterator().next().domain().get(0));
        Assertions.assertEquals("umweoohguufuzboy", response.iterator().next().dnsServerIps().get(0));
        Assertions.assertEquals("qxnmwmqt", response.iterator().next().sourceIp());
        Assertions.assertEquals(3284652238021656307L, response.iterator().next().dnsServices());
        Assertions.assertEquals(1985596769029107559L, response.iterator().next().revision());
    }
}
