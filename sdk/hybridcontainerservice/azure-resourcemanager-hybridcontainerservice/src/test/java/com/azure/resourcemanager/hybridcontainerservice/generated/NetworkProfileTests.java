// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcontainerservice.models.CloudProviderProfile;
import com.azure.resourcemanager.hybridcontainerservice.models.LinuxProfileProperties;
import com.azure.resourcemanager.hybridcontainerservice.models.LoadBalancerProfile;
import com.azure.resourcemanager.hybridcontainerservice.models.LoadBalancerSku;
import com.azure.resourcemanager.hybridcontainerservice.models.Mode;
import com.azure.resourcemanager.hybridcontainerservice.models.NetworkPolicy;
import com.azure.resourcemanager.hybridcontainerservice.models.NetworkProfile;
import com.azure.resourcemanager.hybridcontainerservice.models.OsType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class NetworkProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkProfile model =
            BinaryData
                .fromString(
                    "{\"loadBalancerProfile\":{\"linuxProfile\":{\"adminUsername\":\"xkrxdqmi\"},\"name\":\"hzrvqd\",\"count\":552309473,\"availabilityZones\":[\"yb\",\"gehoqfbowskany\"],\"maxCount\":1937589018,\"maxPods\":159488471,\"minCount\":1785723021,\"mode\":\"User\",\"nodeLabels\":{\"nhzgpphrcgyn\":\"ywgndrv\"},\"nodeTaints\":[\"pec\",\"vmmcoofs\",\"lzevgbmqjqab\",\"y\"],\"osType\":\"Windows\",\"nodeImageVersion\":\"kwlzuvccfwnfn\",\"vmSize\":\"cfionl\",\"cloudProviderProfile\":{}},\"loadBalancerSku\":\"unstacked-haproxy\",\"dnsServiceIP\":\"tzxdpnqbqqwx\",\"networkPolicy\":\"flannel\",\"podCidr\":\"al\",\"podCidrs\":[\"sub\",\"snjampmng\",\"zscxaqwo\"],\"serviceCidr\":\"hcbonqvpkvlr\",\"serviceCidrs\":[\"ea\",\"eipheoflokeyy\"]}")
                .toObject(NetworkProfile.class);
        Assertions.assertEquals(552309473, model.loadBalancerProfile().count());
        Assertions.assertEquals("yb", model.loadBalancerProfile().availabilityZones().get(0));
        Assertions.assertEquals(1937589018, model.loadBalancerProfile().maxCount());
        Assertions.assertEquals(159488471, model.loadBalancerProfile().maxPods());
        Assertions.assertEquals(1785723021, model.loadBalancerProfile().minCount());
        Assertions.assertEquals(Mode.USER, model.loadBalancerProfile().mode());
        Assertions.assertEquals("ywgndrv", model.loadBalancerProfile().nodeLabels().get("nhzgpphrcgyn"));
        Assertions.assertEquals("pec", model.loadBalancerProfile().nodeTaints().get(0));
        Assertions.assertEquals(OsType.WINDOWS, model.loadBalancerProfile().osType());
        Assertions.assertEquals("kwlzuvccfwnfn", model.loadBalancerProfile().nodeImageVersion());
        Assertions.assertEquals("cfionl", model.loadBalancerProfile().vmSize());
        Assertions.assertEquals("hzrvqd", model.loadBalancerProfile().name());
        Assertions.assertEquals("xkrxdqmi", model.loadBalancerProfile().linuxProfile().adminUsername());
        Assertions.assertEquals(LoadBalancerSku.UNSTACKED_HAPROXY, model.loadBalancerSku());
        Assertions.assertEquals("tzxdpnqbqqwx", model.dnsServiceIp());
        Assertions.assertEquals(NetworkPolicy.FLANNEL, model.networkPolicy());
        Assertions.assertEquals("al", model.podCidr());
        Assertions.assertEquals("sub", model.podCidrs().get(0));
        Assertions.assertEquals("hcbonqvpkvlr", model.serviceCidr());
        Assertions.assertEquals("ea", model.serviceCidrs().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkProfile model =
            new NetworkProfile()
                .withLoadBalancerProfile(
                    new LoadBalancerProfile()
                        .withCount(552309473)
                        .withAvailabilityZones(Arrays.asList("yb", "gehoqfbowskany"))
                        .withMaxCount(1937589018)
                        .withMaxPods(159488471)
                        .withMinCount(1785723021)
                        .withMode(Mode.USER)
                        .withNodeLabels(mapOf("nhzgpphrcgyn", "ywgndrv"))
                        .withNodeTaints(Arrays.asList("pec", "vmmcoofs", "lzevgbmqjqab", "y"))
                        .withOsType(OsType.WINDOWS)
                        .withNodeImageVersion("kwlzuvccfwnfn")
                        .withVmSize("cfionl")
                        .withCloudProviderProfile(new CloudProviderProfile())
                        .withName("hzrvqd")
                        .withLinuxProfile(new LinuxProfileProperties().withAdminUsername("xkrxdqmi")))
                .withLoadBalancerSku(LoadBalancerSku.UNSTACKED_HAPROXY)
                .withDnsServiceIp("tzxdpnqbqqwx")
                .withNetworkPolicy(NetworkPolicy.FLANNEL)
                .withPodCidr("al")
                .withPodCidrs(Arrays.asList("sub", "snjampmng", "zscxaqwo"))
                .withServiceCidr("hcbonqvpkvlr")
                .withServiceCidrs(Arrays.asList("ea", "eipheoflokeyy"));
        model = BinaryData.fromObject(model).toObject(NetworkProfile.class);
        Assertions.assertEquals(552309473, model.loadBalancerProfile().count());
        Assertions.assertEquals("yb", model.loadBalancerProfile().availabilityZones().get(0));
        Assertions.assertEquals(1937589018, model.loadBalancerProfile().maxCount());
        Assertions.assertEquals(159488471, model.loadBalancerProfile().maxPods());
        Assertions.assertEquals(1785723021, model.loadBalancerProfile().minCount());
        Assertions.assertEquals(Mode.USER, model.loadBalancerProfile().mode());
        Assertions.assertEquals("ywgndrv", model.loadBalancerProfile().nodeLabels().get("nhzgpphrcgyn"));
        Assertions.assertEquals("pec", model.loadBalancerProfile().nodeTaints().get(0));
        Assertions.assertEquals(OsType.WINDOWS, model.loadBalancerProfile().osType());
        Assertions.assertEquals("kwlzuvccfwnfn", model.loadBalancerProfile().nodeImageVersion());
        Assertions.assertEquals("cfionl", model.loadBalancerProfile().vmSize());
        Assertions.assertEquals("hzrvqd", model.loadBalancerProfile().name());
        Assertions.assertEquals("xkrxdqmi", model.loadBalancerProfile().linuxProfile().adminUsername());
        Assertions.assertEquals(LoadBalancerSku.UNSTACKED_HAPROXY, model.loadBalancerSku());
        Assertions.assertEquals("tzxdpnqbqqwx", model.dnsServiceIp());
        Assertions.assertEquals(NetworkPolicy.FLANNEL, model.networkPolicy());
        Assertions.assertEquals("al", model.podCidr());
        Assertions.assertEquals("sub", model.podCidrs().get(0));
        Assertions.assertEquals("hcbonqvpkvlr", model.serviceCidr());
        Assertions.assertEquals("ea", model.serviceCidrs().get(0));
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
