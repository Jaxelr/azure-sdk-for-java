// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcontainerservice.fluent.models.VirtualNetworksInner;
import com.azure.resourcemanager.hybridcontainerservice.models.VirtualNetworksExtendedLocation;
import com.azure.resourcemanager.hybridcontainerservice.models.VirtualNetworksProperties;
import com.azure.resourcemanager.hybridcontainerservice.models.VirtualNetworksPropertiesInfraVnetProfile;
import com.azure.resourcemanager.hybridcontainerservice.models.VirtualNetworksPropertiesVipPoolItem;
import com.azure.resourcemanager.hybridcontainerservice.models.VirtualNetworksPropertiesVmipPoolItem;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VirtualNetworksInnerTests {
    @Test
    public void testDeserialize() {
        VirtualNetworksInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"infraVnetProfile\":{},\"vipPool\":[{\"endIP\":\"jrvxaglrv\",\"startIP\":\"jwosytxitcskfck\"}],\"vmipPool\":[{\"endIP\":\"iekkezz\",\"startIP\":\"hlyfjhdgqgg\"},{\"endIP\":\"dunyg\",\"startIP\":\"qidbqfatpxllrxcy\"},{\"endIP\":\"oadsuvar\",\"startIP\":\"wdmjsjqbjhhyx\"}],\"dhcpServers\":[\"lyc\",\"duhpk\",\"kgymareqnajxqug\",\"hky\"],\"dnsServers\":[\"eddgssofw\",\"mzqa\",\"krmnjijpxacqqud\"],\"gateway\":\"byxbaaabjy\",\"ipAddressPrefix\":\"yffimrzrtuzqogs\",\"vlanID\":\"nevfdnw\",\"provisioningState\":\"InProgress\",\"status\":{}},\"extendedLocation\":{\"type\":\"yceuzsoib\",\"name\":\"dpfrxtrthzvaytdw\"},\"location\":\"qbrqubpaxhexiili\",\"tags\":{\"oruzfgsquyfxrxx\":\"tiirqtdqoa\",\"xje\":\"eptra\"},\"id\":\"wlwnwxuqlcv\",\"name\":\"dy\",\"type\":\"atdooaojkniod\"}")
                .toObject(VirtualNetworksInner.class);
        Assertions.assertEquals("qbrqubpaxhexiili", model.location());
        Assertions.assertEquals("tiirqtdqoa", model.tags().get("oruzfgsquyfxrxx"));
        Assertions.assertEquals("jrvxaglrv", model.properties().vipPool().get(0).endIp());
        Assertions.assertEquals("jwosytxitcskfck", model.properties().vipPool().get(0).startIp());
        Assertions.assertEquals("iekkezz", model.properties().vmipPool().get(0).endIp());
        Assertions.assertEquals("hlyfjhdgqgg", model.properties().vmipPool().get(0).startIp());
        Assertions.assertEquals("yceuzsoib", model.extendedLocation().type());
        Assertions.assertEquals("dpfrxtrthzvaytdw", model.extendedLocation().name());
    }

    @Test
    public void testSerialize() {
        VirtualNetworksInner model =
            new VirtualNetworksInner()
                .withLocation("qbrqubpaxhexiili")
                .withTags(mapOf("oruzfgsquyfxrxx", "tiirqtdqoa", "xje", "eptra"))
                .withProperties(
                    new VirtualNetworksProperties()
                        .withInfraVnetProfile(new VirtualNetworksPropertiesInfraVnetProfile())
                        .withVipPool(
                            Arrays
                                .asList(
                                    new VirtualNetworksPropertiesVipPoolItem()
                                        .withEndIp("jrvxaglrv")
                                        .withStartIp("jwosytxitcskfck")))
                        .withVmipPool(
                            Arrays
                                .asList(
                                    new VirtualNetworksPropertiesVmipPoolItem()
                                        .withEndIp("iekkezz")
                                        .withStartIp("hlyfjhdgqgg"),
                                    new VirtualNetworksPropertiesVmipPoolItem()
                                        .withEndIp("dunyg")
                                        .withStartIp("qidbqfatpxllrxcy"),
                                    new VirtualNetworksPropertiesVmipPoolItem()
                                        .withEndIp("oadsuvar")
                                        .withStartIp("wdmjsjqbjhhyx"))))
                .withExtendedLocation(
                    new VirtualNetworksExtendedLocation().withType("yceuzsoib").withName("dpfrxtrthzvaytdw"));
        model = BinaryData.fromObject(model).toObject(VirtualNetworksInner.class);
        Assertions.assertEquals("qbrqubpaxhexiili", model.location());
        Assertions.assertEquals("tiirqtdqoa", model.tags().get("oruzfgsquyfxrxx"));
        Assertions.assertEquals("jrvxaglrv", model.properties().vipPool().get(0).endIp());
        Assertions.assertEquals("jwosytxitcskfck", model.properties().vipPool().get(0).startIp());
        Assertions.assertEquals("iekkezz", model.properties().vmipPool().get(0).endIp());
        Assertions.assertEquals("hlyfjhdgqgg", model.properties().vmipPool().get(0).startIp());
        Assertions.assertEquals("yceuzsoib", model.extendedLocation().type());
        Assertions.assertEquals("dpfrxtrthzvaytdw", model.extendedLocation().name());
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