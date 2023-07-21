// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quantum.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.quantum.fluent.models.ProviderDescriptionInner;
import com.azure.resourcemanager.quantum.models.PricingDetail;
import com.azure.resourcemanager.quantum.models.PricingDimension;
import com.azure.resourcemanager.quantum.models.ProviderProperties;
import com.azure.resourcemanager.quantum.models.ProviderPropertiesAad;
import com.azure.resourcemanager.quantum.models.ProviderPropertiesManagedApplication;
import com.azure.resourcemanager.quantum.models.QuotaDimension;
import com.azure.resourcemanager.quantum.models.SkuDescription;
import com.azure.resourcemanager.quantum.models.TargetDescription;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ProviderDescriptionInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProviderDescriptionInner model =
            BinaryData
                .fromString(
                    "{\"id\":\"rkcciwwzjuqk\",\"name\":\"sa\",\"properties\":{\"description\":\"ku\",\"providerType\":\"oskg\",\"company\":\"auu\",\"defaultEndpoint\":\"jmvxie\",\"aad\":{\"applicationId\":\"gidyjrrf\",\"tenantId\":\"aos\"},\"managedApplication\":{\"publisherId\":\"csonpclhoco\",\"offerId\":\"lkevle\"},\"targets\":[{\"id\":\"buhfmvfaxkffeiit\",\"name\":\"vmezy\",\"description\":\"hxmzsbbzoggig\",\"acceptedDataFormats\":[\"burvjxxjnspy\",\"ptkoenkoukn\",\"udwtiukbl\",\"ngkpocipazy\"],\"acceptedContentEncodings\":[\"gukgjnpiucgygevq\",\"ntypmrbpizcdrqj\",\"dpydn\"]},{\"id\":\"hxdeoejz\",\"name\":\"w\",\"description\":\"sjttgzfbish\",\"acceptedDataFormats\":[\"hajdeyeamdpha\"],\"acceptedContentEncodings\":[\"pbuxwgipwhon\",\"wkgshwa\",\"kix\",\"bin\"]}],\"skus\":[{\"id\":\"ttmrywnuzoqf\",\"name\":\"yqzrnkcqvyxlw\",\"version\":\"lsicohoqqnwv\",\"description\":\"yav\",\"restrictedAccessUri\":\"heun\",\"autoAdd\":true,\"targets\":[\"yxzk\",\"noc\"],\"quotaDimensions\":[{\"id\":\"lyaxuc\",\"scope\":\"uqszfk\",\"period\":\"ypewrmjmwvvjekt\",\"quota\":49.062435,\"name\":\"nhwlrsffrzpwvl\",\"description\":\"q\",\"unit\":\"iqylihkaetck\",\"unitPlural\":\"fcivfsnkym\"},{\"id\":\"tqhjfbebrjcx\",\"scope\":\"fuwutttxf\",\"period\":\"rbirphxe\",\"quota\":12.502766,\"name\":\"ahfn\",\"description\":\"kyqxjvuujqgidokg\",\"unit\":\"jyoxgvclt\",\"unitPlural\":\"sncghkjeszz\"},{\"id\":\"ijhtxf\",\"scope\":\"xbf\",\"period\":\"xnehmpvec\",\"quota\":79.49234,\"name\":\"ebfqkkrbm\",\"description\":\"kgriwflzlfbx\",\"unit\":\"uzycispnqza\",\"unitPlural\":\"gkbrpyyd\"}],\"pricingDetails\":[{\"id\":\"uqqkpik\",\"value\":\"rgvtqag\"},{\"id\":\"uynhijg\",\"value\":\"ebf\"},{\"id\":\"arbu\",\"value\":\"cvpnazzmhjrunmpx\"}]}],\"quotaDimensions\":[{\"id\":\"hrbnlankxmyskpbh\",\"scope\":\"btkcxywnytnrsyn\",\"period\":\"idybyxczf\",\"quota\":67.49647,\"name\":\"axdbabph\",\"description\":\"rqlfktsthsucocmn\",\"unit\":\"azt\",\"unitPlural\":\"twwrqp\"},{\"id\":\"dckzywbiexz\",\"scope\":\"yueaxibxujwb\",\"period\":\"walm\",\"quota\":22.792763,\"name\":\"xaepdkzjancuxr\",\"description\":\"wbavxbniwdj\",\"unit\":\"zt\",\"unitPlural\":\"bpg\"},{\"id\":\"ytxhp\",\"scope\":\"bzpfzab\",\"period\":\"cuh\",\"quota\":24.924797,\"name\":\"tyq\",\"description\":\"lbbovplw\",\"unit\":\"hvgyuguosvmk\",\"unitPlural\":\"sxqu\"}],\"pricingDimensions\":[{\"id\":\"l\",\"name\":\"gsxnkjzkdeslpv\"}]}}")
                .toObject(ProviderDescriptionInner.class);
        Assertions.assertEquals("rkcciwwzjuqk", model.id());
        Assertions.assertEquals("buhfmvfaxkffeiit", model.properties().targets().get(0).id());
        Assertions.assertEquals("vmezy", model.properties().targets().get(0).name());
        Assertions.assertEquals("hxmzsbbzoggig", model.properties().targets().get(0).description());
        Assertions.assertEquals("burvjxxjnspy", model.properties().targets().get(0).acceptedDataFormats().get(0));
        Assertions
            .assertEquals("gukgjnpiucgygevq", model.properties().targets().get(0).acceptedContentEncodings().get(0));
        Assertions.assertEquals("ttmrywnuzoqf", model.properties().skus().get(0).id());
        Assertions.assertEquals("yqzrnkcqvyxlw", model.properties().skus().get(0).name());
        Assertions.assertEquals("lsicohoqqnwv", model.properties().skus().get(0).version());
        Assertions.assertEquals("yav", model.properties().skus().get(0).description());
        Assertions.assertEquals("heun", model.properties().skus().get(0).restrictedAccessUri());
        Assertions.assertEquals(true, model.properties().skus().get(0).autoAdd());
        Assertions.assertEquals("yxzk", model.properties().skus().get(0).targets().get(0));
        Assertions.assertEquals("lyaxuc", model.properties().skus().get(0).quotaDimensions().get(0).id());
        Assertions.assertEquals("uqszfk", model.properties().skus().get(0).quotaDimensions().get(0).scope());
        Assertions.assertEquals("ypewrmjmwvvjekt", model.properties().skus().get(0).quotaDimensions().get(0).period());
        Assertions.assertEquals(49.062435F, model.properties().skus().get(0).quotaDimensions().get(0).quota());
        Assertions.assertEquals("nhwlrsffrzpwvl", model.properties().skus().get(0).quotaDimensions().get(0).name());
        Assertions.assertEquals("q", model.properties().skus().get(0).quotaDimensions().get(0).description());
        Assertions.assertEquals("iqylihkaetck", model.properties().skus().get(0).quotaDimensions().get(0).unit());
        Assertions.assertEquals("fcivfsnkym", model.properties().skus().get(0).quotaDimensions().get(0).unitPlural());
        Assertions.assertEquals("uqqkpik", model.properties().skus().get(0).pricingDetails().get(0).id());
        Assertions.assertEquals("rgvtqag", model.properties().skus().get(0).pricingDetails().get(0).value());
        Assertions.assertEquals("hrbnlankxmyskpbh", model.properties().quotaDimensions().get(0).id());
        Assertions.assertEquals("btkcxywnytnrsyn", model.properties().quotaDimensions().get(0).scope());
        Assertions.assertEquals("idybyxczf", model.properties().quotaDimensions().get(0).period());
        Assertions.assertEquals(67.49647F, model.properties().quotaDimensions().get(0).quota());
        Assertions.assertEquals("axdbabph", model.properties().quotaDimensions().get(0).name());
        Assertions.assertEquals("rqlfktsthsucocmn", model.properties().quotaDimensions().get(0).description());
        Assertions.assertEquals("azt", model.properties().quotaDimensions().get(0).unit());
        Assertions.assertEquals("twwrqp", model.properties().quotaDimensions().get(0).unitPlural());
        Assertions.assertEquals("l", model.properties().pricingDimensions().get(0).id());
        Assertions.assertEquals("gsxnkjzkdeslpv", model.properties().pricingDimensions().get(0).name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ProviderDescriptionInner model =
            new ProviderDescriptionInner()
                .withId("rkcciwwzjuqk")
                .withProperties(
                    new ProviderProperties()
                        .withAad(new ProviderPropertiesAad())
                        .withManagedApplication(new ProviderPropertiesManagedApplication())
                        .withTargets(
                            Arrays
                                .asList(
                                    new TargetDescription()
                                        .withId("buhfmvfaxkffeiit")
                                        .withName("vmezy")
                                        .withDescription("hxmzsbbzoggig")
                                        .withAcceptedDataFormats(
                                            Arrays.asList("burvjxxjnspy", "ptkoenkoukn", "udwtiukbl", "ngkpocipazy"))
                                        .withAcceptedContentEncodings(
                                            Arrays.asList("gukgjnpiucgygevq", "ntypmrbpizcdrqj", "dpydn")),
                                    new TargetDescription()
                                        .withId("hxdeoejz")
                                        .withName("w")
                                        .withDescription("sjttgzfbish")
                                        .withAcceptedDataFormats(Arrays.asList("hajdeyeamdpha"))
                                        .withAcceptedContentEncodings(
                                            Arrays.asList("pbuxwgipwhon", "wkgshwa", "kix", "bin"))))
                        .withSkus(
                            Arrays
                                .asList(
                                    new SkuDescription()
                                        .withId("ttmrywnuzoqf")
                                        .withName("yqzrnkcqvyxlw")
                                        .withVersion("lsicohoqqnwv")
                                        .withDescription("yav")
                                        .withRestrictedAccessUri("heun")
                                        .withAutoAdd(true)
                                        .withTargets(Arrays.asList("yxzk", "noc"))
                                        .withQuotaDimensions(
                                            Arrays
                                                .asList(
                                                    new QuotaDimension()
                                                        .withId("lyaxuc")
                                                        .withScope("uqszfk")
                                                        .withPeriod("ypewrmjmwvvjekt")
                                                        .withQuota(49.062435F)
                                                        .withName("nhwlrsffrzpwvl")
                                                        .withDescription("q")
                                                        .withUnit("iqylihkaetck")
                                                        .withUnitPlural("fcivfsnkym"),
                                                    new QuotaDimension()
                                                        .withId("tqhjfbebrjcx")
                                                        .withScope("fuwutttxf")
                                                        .withPeriod("rbirphxe")
                                                        .withQuota(12.502766F)
                                                        .withName("ahfn")
                                                        .withDescription("kyqxjvuujqgidokg")
                                                        .withUnit("jyoxgvclt")
                                                        .withUnitPlural("sncghkjeszz"),
                                                    new QuotaDimension()
                                                        .withId("ijhtxf")
                                                        .withScope("xbf")
                                                        .withPeriod("xnehmpvec")
                                                        .withQuota(79.49234F)
                                                        .withName("ebfqkkrbm")
                                                        .withDescription("kgriwflzlfbx")
                                                        .withUnit("uzycispnqza")
                                                        .withUnitPlural("gkbrpyyd")))
                                        .withPricingDetails(
                                            Arrays
                                                .asList(
                                                    new PricingDetail().withId("uqqkpik").withValue("rgvtqag"),
                                                    new PricingDetail().withId("uynhijg").withValue("ebf"),
                                                    new PricingDetail().withId("arbu").withValue("cvpnazzmhjrunmpx")))))
                        .withQuotaDimensions(
                            Arrays
                                .asList(
                                    new QuotaDimension()
                                        .withId("hrbnlankxmyskpbh")
                                        .withScope("btkcxywnytnrsyn")
                                        .withPeriod("idybyxczf")
                                        .withQuota(67.49647F)
                                        .withName("axdbabph")
                                        .withDescription("rqlfktsthsucocmn")
                                        .withUnit("azt")
                                        .withUnitPlural("twwrqp"),
                                    new QuotaDimension()
                                        .withId("dckzywbiexz")
                                        .withScope("yueaxibxujwb")
                                        .withPeriod("walm")
                                        .withQuota(22.792763F)
                                        .withName("xaepdkzjancuxr")
                                        .withDescription("wbavxbniwdj")
                                        .withUnit("zt")
                                        .withUnitPlural("bpg"),
                                    new QuotaDimension()
                                        .withId("ytxhp")
                                        .withScope("bzpfzab")
                                        .withPeriod("cuh")
                                        .withQuota(24.924797F)
                                        .withName("tyq")
                                        .withDescription("lbbovplw")
                                        .withUnit("hvgyuguosvmk")
                                        .withUnitPlural("sxqu")))
                        .withPricingDimensions(
                            Arrays.asList(new PricingDimension().withId("l").withName("gsxnkjzkdeslpv"))));
        model = BinaryData.fromObject(model).toObject(ProviderDescriptionInner.class);
        Assertions.assertEquals("rkcciwwzjuqk", model.id());
        Assertions.assertEquals("buhfmvfaxkffeiit", model.properties().targets().get(0).id());
        Assertions.assertEquals("vmezy", model.properties().targets().get(0).name());
        Assertions.assertEquals("hxmzsbbzoggig", model.properties().targets().get(0).description());
        Assertions.assertEquals("burvjxxjnspy", model.properties().targets().get(0).acceptedDataFormats().get(0));
        Assertions
            .assertEquals("gukgjnpiucgygevq", model.properties().targets().get(0).acceptedContentEncodings().get(0));
        Assertions.assertEquals("ttmrywnuzoqf", model.properties().skus().get(0).id());
        Assertions.assertEquals("yqzrnkcqvyxlw", model.properties().skus().get(0).name());
        Assertions.assertEquals("lsicohoqqnwv", model.properties().skus().get(0).version());
        Assertions.assertEquals("yav", model.properties().skus().get(0).description());
        Assertions.assertEquals("heun", model.properties().skus().get(0).restrictedAccessUri());
        Assertions.assertEquals(true, model.properties().skus().get(0).autoAdd());
        Assertions.assertEquals("yxzk", model.properties().skus().get(0).targets().get(0));
        Assertions.assertEquals("lyaxuc", model.properties().skus().get(0).quotaDimensions().get(0).id());
        Assertions.assertEquals("uqszfk", model.properties().skus().get(0).quotaDimensions().get(0).scope());
        Assertions.assertEquals("ypewrmjmwvvjekt", model.properties().skus().get(0).quotaDimensions().get(0).period());
        Assertions.assertEquals(49.062435F, model.properties().skus().get(0).quotaDimensions().get(0).quota());
        Assertions.assertEquals("nhwlrsffrzpwvl", model.properties().skus().get(0).quotaDimensions().get(0).name());
        Assertions.assertEquals("q", model.properties().skus().get(0).quotaDimensions().get(0).description());
        Assertions.assertEquals("iqylihkaetck", model.properties().skus().get(0).quotaDimensions().get(0).unit());
        Assertions.assertEquals("fcivfsnkym", model.properties().skus().get(0).quotaDimensions().get(0).unitPlural());
        Assertions.assertEquals("uqqkpik", model.properties().skus().get(0).pricingDetails().get(0).id());
        Assertions.assertEquals("rgvtqag", model.properties().skus().get(0).pricingDetails().get(0).value());
        Assertions.assertEquals("hrbnlankxmyskpbh", model.properties().quotaDimensions().get(0).id());
        Assertions.assertEquals("btkcxywnytnrsyn", model.properties().quotaDimensions().get(0).scope());
        Assertions.assertEquals("idybyxczf", model.properties().quotaDimensions().get(0).period());
        Assertions.assertEquals(67.49647F, model.properties().quotaDimensions().get(0).quota());
        Assertions.assertEquals("axdbabph", model.properties().quotaDimensions().get(0).name());
        Assertions.assertEquals("rqlfktsthsucocmn", model.properties().quotaDimensions().get(0).description());
        Assertions.assertEquals("azt", model.properties().quotaDimensions().get(0).unit());
        Assertions.assertEquals("twwrqp", model.properties().quotaDimensions().get(0).unitPlural());
        Assertions.assertEquals("l", model.properties().pricingDimensions().get(0).id());
        Assertions.assertEquals("gsxnkjzkdeslpv", model.properties().pricingDimensions().get(0).name());
    }
}