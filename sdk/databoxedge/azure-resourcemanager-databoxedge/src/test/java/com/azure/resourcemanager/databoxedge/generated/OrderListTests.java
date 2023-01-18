// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.databoxedge.models.OrderList;

public final class OrderListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OrderList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"orderHistory\":[],\"serialNumber\":\"crgvxpvgom\",\"deliveryTrackingInfo\":[],\"returnTrackingInfo\":[]},\"id\":\"misgwbnb\",\"name\":\"e\",\"type\":\"dawkzbali\"},{\"properties\":{\"orderHistory\":[],\"serialNumber\":\"akauha\",\"deliveryTrackingInfo\":[],\"returnTrackingInfo\":[]},\"id\":\"fwxosowzxcu\",\"name\":\"i\",\"type\":\"jooxdjebw\"},{\"properties\":{\"orderHistory\":[],\"serialNumber\":\"fvovbvmeuecivy\",\"deliveryTrackingInfo\":[],\"returnTrackingInfo\":[]},\"id\":\"euojgjrwju\",\"name\":\"iotwmcdytdxwit\",\"type\":\"nrjawgqwg\"},{\"properties\":{\"orderHistory\":[],\"serialNumber\":\"kxfbkpycgklwndn\",\"deliveryTrackingInfo\":[],\"returnTrackingInfo\":[]},\"id\":\"auwhvylwzbtdhx\",\"name\":\"jznb\",\"type\":\"pow\"}],\"nextLink\":\"przqlveu\"}")
                .toObject(OrderList.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OrderList model = new OrderList();
        model = BinaryData.fromObject(model).toObject(OrderList.class);
    }
}