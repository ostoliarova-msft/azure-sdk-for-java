// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.ComplianceInner;
import com.azure.resourcemanager.security.models.ComplianceList;
import java.util.Arrays;

public final class ComplianceListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ComplianceList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"assessmentTimestampUtcDate\":\"2021-08-25T09:33:34Z\",\"resourceCount\":624778524,\"assessmentResult\":[]},\"id\":\"bqfatpxllrxcyjmo\",\"name\":\"dsuvarmywdmjsjqb\",\"type\":\"hhyxxrw\"},{\"properties\":{\"assessmentTimestampUtcDate\":\"2021-02-04T08:50:40Z\",\"resourceCount\":803302222,\"assessmentResult\":[]},\"id\":\"p\",\"name\":\"xkgymareqnajxqu\",\"type\":\"jhkycub\"},{\"properties\":{\"assessmentTimestampUtcDate\":\"2021-03-22T14:35:21Z\",\"resourceCount\":2056337569,\"assessmentResult\":[]},\"id\":\"fwqmzqalkrmn\",\"name\":\"i\",\"type\":\"pxacqqudfn\"},{\"properties\":{\"assessmentTimestampUtcDate\":\"2021-06-13T18:20:41Z\",\"resourceCount\":1365725065,\"assessmentResult\":[]},\"id\":\"bjyvay\",\"name\":\"fimrzrtuzqogse\",\"type\":\"nevfdnw\"}],\"nextLink\":\"mewzsyyc\"}")
                .toObject(ComplianceList.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ComplianceList model =
            new ComplianceList()
                .withValue(
                    Arrays
                        .asList(
                            new ComplianceInner(),
                            new ComplianceInner(),
                            new ComplianceInner(),
                            new ComplianceInner()));
        model = BinaryData.fromObject(model).toObject(ComplianceList.class);
    }
}
