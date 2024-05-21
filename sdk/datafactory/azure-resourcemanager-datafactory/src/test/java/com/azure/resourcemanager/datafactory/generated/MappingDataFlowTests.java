// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DataFlowFolder;
import com.azure.resourcemanager.datafactory.models.DataFlowReference;
import com.azure.resourcemanager.datafactory.models.DataFlowReferenceType;
import com.azure.resourcemanager.datafactory.models.DataFlowSink;
import com.azure.resourcemanager.datafactory.models.DataFlowSource;
import com.azure.resourcemanager.datafactory.models.DatasetReference;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.MappingDataFlow;
import com.azure.resourcemanager.datafactory.models.Transformation;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class MappingDataFlowTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MappingDataFlow model = BinaryData.fromString(
            "{\"type\":\"qncjubkhjozfymcw\",\"typeProperties\":{\"sources\":[{\"schemaLinkedService\":{\"referenceName\":\"zipbwxgoooxzp\",\"parameters\":{\"gzigjsugswhgsaod\":\"datamskxknp\",\"aquvwsxbgnvkervq\":\"datawwnbafoctohz\",\"pabdsrg\":\"datahoadhrsxqvzv\",\"hjnlt\":\"dataajglzrsubklr\"}},\"name\":\"etjdvqydieqqkwa\",\"description\":\"wdxvqzxoebwg\",\"dataset\":{\"referenceName\":\"bibanbau\",\"parameters\":{\"lssan\":\"datazvpaklozkxbzrpej\"}},\"linkedService\":{\"referenceName\":\"ttkgsux\",\"parameters\":{\"hkslgwlokhueoij\":\"dataswgkpjhboyikebh\",\"jyvdwtfxptpqayam\":\"datazcqypzqzufgsyf\",\"ullojk\":\"datancfgybmxsnxoc\",\"g\":\"dataoy\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"j\",\"datasetParameters\":\"datadbdljz\",\"parameters\":{\"nq\":\"datarcvuqbsgzlrqhb\",\"jlf\":\"datagdxwbsfpyxx\",\"ilz\":\"dataecominxojjluxxd\",\"za\":\"datadzzqjmu\"},\"\":{\"vwta\":\"dataribqlotokh\",\"nkbtlwljss\":\"datankcqwwxwjyofgw\",\"isubxbteog\":\"datactsnldkpwol\"}}}],\"sinks\":[{\"schemaLinkedService\":{\"referenceName\":\"ij\",\"parameters\":{\"m\":\"datawlefksxqceazfpxg\"}},\"rejectedDataLinkedService\":{\"referenceName\":\"zvluyqqaiosss\",\"parameters\":{\"fxtjdhsoym\":\"dataaifppuacvfyeowp\",\"tkfvvdshx\":\"datapvtyqfttehdpbouj\",\"nquktrfnslnlrxs\":\"datadedsuenygnxcgjtf\"}},\"name\":\"ylt\",\"description\":\"ntf\",\"dataset\":{\"referenceName\":\"bgwjdxwnaz\",\"parameters\":{\"jwzzqseuzu\":\"datardreyzjwhsetw\",\"c\":\"datakykcyqhyqqzz\",\"ewfopazdazg\":\"datakeys\",\"mdpv\":\"datasqgpewqcfu\"}},\"linkedService\":{\"referenceName\":\"glq\",\"parameters\":{\"yowmndcovdw\":\"datanlzclctz\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"uxza\",\"datasetParameters\":\"datamk\",\"parameters\":{\"txudqyeme\":\"datauwkudrbcp\"},\"\":{\"mjauwcgx\":\"dataaucmcirtnee\",\"zerwgudas\":\"datafnohaitran\",\"ngfcocefhpriyl\":\"dataxubvf\"}}},{\"schemaLinkedService\":{\"referenceName\":\"pztraudsvhl\",\"parameters\":{\"egpqtmo\":\"dataul\",\"shqrdgrt\":\"datahvrztnvg\",\"fa\":\"datamewjzlpyk\"}},\"rejectedDataLinkedService\":{\"referenceName\":\"wjcayerzrr\",\"parameters\":{\"zrghsrleink\":\"dataybylpol\"}},\"name\":\"scjfncjwvuagf\",\"description\":\"tltng\",\"dataset\":{\"referenceName\":\"reuptrk\",\"parameters\":{\"s\":\"dataijajwolx\"}},\"linkedService\":{\"referenceName\":\"ghmp\",\"parameters\":{\"bxqla\":\"datalslrcigtzjc\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"ssov\",\"datasetParameters\":\"datapavidnievwffc\",\"parameters\":{\"xgcbdsvalpnpt\":\"dataezslp\",\"x\":\"datatrkxgpazwu\"},\"\":{\"zz\":\"datanjobfelhldiu\",\"iudjp\":\"dataqlmfaewz\",\"qhnmhk\":\"datapqht\",\"gcruxspinym\":\"dataezsdsuxheq\"}}},{\"schemaLinkedService\":{\"referenceName\":\"gwokmikpazfbmjxu\",\"parameters\":{\"zaehpphthd\":\"datapfdvhaxdv\",\"tatlakfqoi\":\"datalmv\",\"rpogwphchg\":\"datawgiksbbvtoo\",\"htukfac\":\"datat\"}},\"rejectedDataLinkedService\":{\"referenceName\":\"mbf\",\"parameters\":{\"wcgasgom\":\"datameezbxvqxbnu\",\"qgo\":\"datamjzwx\",\"gfredmlscg\":\"datasxpwwztjfmkkh\"}},\"name\":\"ll\",\"description\":\"na\",\"dataset\":{\"referenceName\":\"jowazhpab\",\"parameters\":{\"wsxnsrqor\":\"datamlyotg\"}},\"linkedService\":{\"referenceName\":\"enmvcebxeetq\",\"parameters\":{\"jkedwqurcgojmrv\":\"datacxxqndc\",\"qqrsil\":\"dataxwjongzse\",\"sbvr\":\"datachskxxka\",\"rulfuct\":\"dataaqgvto\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"thcfj\",\"datasetParameters\":\"dataxlyubqjrostv\",\"parameters\":{\"qrztrxal\":\"dataqmtzzb\",\"rsnrhp\":\"datardhabsr\",\"iwkkvya\":\"dataa\"},\"\":{\"qmmlivrjjxnwx\":\"datavvcsemsvuvdjkqxe\",\"jxlehzlx\":\"datachp\",\"w\":\"datagfquwz\",\"pjxljtxb\":\"dataibelwcerwkw\"}}},{\"schemaLinkedService\":{\"referenceName\":\"qtbxxniuisdzh\",\"parameters\":{\"cnadbuwqrgxf\":\"datagzpags\"}},\"rejectedDataLinkedService\":{\"referenceName\":\"mqiyn\",\"parameters\":{\"vmtumxpym\":\"dataellnkkii\",\"canlduwzorxs\":\"datajfuaxroqvqpilrgu\",\"kqv\":\"datamxaqklxym\",\"ltuubw\":\"dataqepdx\"}},\"name\":\"vpjbowcpjqduq\",\"description\":\"xe\",\"dataset\":{\"referenceName\":\"ydfbwlj\",\"parameters\":{\"iegftc\":\"datauerkjddvrg\",\"fgmwd\":\"databiiftksdwgdnk\",\"buvczldbglzoutb\":\"datac\",\"orbjg\":\"dataaqgzekajclyzgs\"}},\"linkedService\":{\"referenceName\":\"zjotvmrxkhlo\",\"parameters\":{\"yu\":\"datajbhvhdiqayflu\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"uudtelv\",\"datasetParameters\":\"dataibdrqrswhbuubpyr\",\"parameters\":{\"nnctagfyvrt\":\"datajoxztfwfqchvczev\",\"cgkrepdqhqy\":\"dataqpemh\"},\"\":{\"xin\":\"datawemvxqabckmze\",\"eezn\":\"datagreohtwhlpuzjp\",\"bfaxyxzlbc\":\"dataangp\",\"ndktxfv\":\"dataphmsexroq\"}}}],\"transformations\":[{\"name\":\"eeqgpkri\",\"description\":\"bgnixxoww\",\"dataset\":{\"referenceName\":\"yfwnw\",\"parameters\":{\"icrmpepkldmaxxi\":\"dataxe\",\"ws\":\"datavs\",\"wrasekw\":\"datagkjgya\"}},\"linkedService\":{\"referenceName\":\"cvo\",\"parameters\":{\"wyxqiclad\":\"dataoqar\",\"ob\":\"dataatdavuqmcbyms\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"uvjezcjumvps\",\"datasetParameters\":\"dataioyoiglkmiq\",\"parameters\":{\"ydgnha\":\"dataraclibbfqpspkla\",\"gpmnmabe\":\"datatwukex\"},\"\":{\"gq\":\"datailwgdfpfqfpcvstc\",\"jj\":\"datavwerfwxbsmtb\",\"ci\":\"datah\",\"ekqhs\":\"datakwdvbtb\"}}},{\"name\":\"htfpwpqb\",\"description\":\"j\",\"dataset\":{\"referenceName\":\"yqwdqi\",\"parameters\":{\"nztxlujkh\":\"datahg\"}},\"linkedService\":{\"referenceName\":\"cmrnkfmkhcq\",\"parameters\":{\"eahjedv\":\"datalmhjnqt\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"pok\",\"datasetParameters\":\"dataxejhh\",\"parameters\":{\"tbkewkqynspg\":\"datauavt\",\"qokmyrljial\":\"datavoffbkkwvdxae\"},\"\":{\"cjtrpzu\":\"dataobrqlp\",\"lwgdhuruz\":\"dataudivbxnhsqeaeonq\"}}},{\"name\":\"tzarogatmoljiy\",\"description\":\"pinm\",\"dataset\":{\"referenceName\":\"fkneerzztrkn\",\"parameters\":{\"hkeizcp\":\"datalugdybnhrxlelf\",\"wjekptycaydbj\":\"datahtdm\",\"ymlcfnzhmhsurlg\":\"datac\",\"lawiubmomsgvvjhv\":\"dataqkpmmzpstau\"}},\"linkedService\":{\"referenceName\":\"rlohe\",\"parameters\":{\"lqionswaeqk\":\"datamajnkd\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"qxjoshohtotryeg\",\"datasetParameters\":\"datah\",\"parameters\":{\"erufgjblcdrmy\":\"dataexznlwkbfokxkhup\",\"ekdfqnhttwd\":\"datacemftzgyykyalu\",\"mhmnulwemp\":\"datawrczfjjnnuxxrk\"},\"\":{\"lusnawmhhgzotfr\":\"datafrhjulrsulwzp\",\"wxxyxhighctx\":\"datayrgkoekv\",\"skiczd\":\"dataxmolpcqydeyk\"}}},{\"name\":\"rjeizik\",\"description\":\"aboohxbmsgyc\",\"dataset\":{\"referenceName\":\"xrmdvewuyqaeohpj\",\"parameters\":{\"xaex\":\"datajkbvhhdaurgho\",\"xjxjoe\":\"datak\",\"dknkobe\":\"datalqxr\",\"cdgzseznux\":\"datatmbozomtzamicbig\"}},\"linkedService\":{\"referenceName\":\"uairaabmdlqjb\",\"parameters\":{\"xlhupmomihzbdnp\":\"dataf\",\"cghf\":\"datapkcdpreyxely\",\"sfxrkbhammgm\":\"datarufssjyg\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"efgvqcp\",\"datasetParameters\":\"datajgquxweysland\",\"parameters\":{\"nquoxsotireimse\":\"datadjhunhghcgawnr\",\"tcyilbvz\":\"databfsx\"},\"\":{\"b\":\"datacjzlquzexokjxebj\",\"v\":\"datainzabwmvoglj\",\"ehaqidoyzltgio\":\"datapgidnw\"}}}],\"script\":\"oqpe\",\"scriptLines\":[\"eapfse\",\"gdtpe\",\"nacyheqwb\"]},\"description\":\"upyvqyvliq\",\"annotations\":[\"datasejb\",\"datavsi\",\"dataieswhddzydisn\",\"dataepywyjlnldpxottd\"],\"folder\":{\"name\":\"ocqibz\"}}")
            .toObject(MappingDataFlow.class);
        Assertions.assertEquals("upyvqyvliq", model.description());
        Assertions.assertEquals("ocqibz", model.folder().name());
        Assertions.assertEquals("etjdvqydieqqkwa", model.sources().get(0).name());
        Assertions.assertEquals("wdxvqzxoebwg", model.sources().get(0).description());
        Assertions.assertEquals("bibanbau", model.sources().get(0).dataset().referenceName());
        Assertions.assertEquals("ttkgsux", model.sources().get(0).linkedService().referenceName());
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE, model.sources().get(0).flowlet().type());
        Assertions.assertEquals("j", model.sources().get(0).flowlet().referenceName());
        Assertions.assertEquals("zipbwxgoooxzp", model.sources().get(0).schemaLinkedService().referenceName());
        Assertions.assertEquals("ylt", model.sinks().get(0).name());
        Assertions.assertEquals("ntf", model.sinks().get(0).description());
        Assertions.assertEquals("bgwjdxwnaz", model.sinks().get(0).dataset().referenceName());
        Assertions.assertEquals("glq", model.sinks().get(0).linkedService().referenceName());
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE, model.sinks().get(0).flowlet().type());
        Assertions.assertEquals("uxza", model.sinks().get(0).flowlet().referenceName());
        Assertions.assertEquals("ij", model.sinks().get(0).schemaLinkedService().referenceName());
        Assertions.assertEquals("zvluyqqaiosss", model.sinks().get(0).rejectedDataLinkedService().referenceName());
        Assertions.assertEquals("eeqgpkri", model.transformations().get(0).name());
        Assertions.assertEquals("bgnixxoww", model.transformations().get(0).description());
        Assertions.assertEquals("yfwnw", model.transformations().get(0).dataset().referenceName());
        Assertions.assertEquals("cvo", model.transformations().get(0).linkedService().referenceName());
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE,
            model.transformations().get(0).flowlet().type());
        Assertions.assertEquals("uvjezcjumvps", model.transformations().get(0).flowlet().referenceName());
        Assertions.assertEquals("oqpe", model.script());
        Assertions.assertEquals("eapfse", model.scriptLines().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MappingDataFlow model = new MappingDataFlow().withDescription("upyvqyvliq")
            .withAnnotations(Arrays.asList("datasejb", "datavsi", "dataieswhddzydisn", "dataepywyjlnldpxottd"))
            .withFolder(new DataFlowFolder().withName("ocqibz"))
            .withSources(Arrays.asList(new DataFlowSource().withName("etjdvqydieqqkwa")
                .withDescription("wdxvqzxoebwg")
                .withDataset(new DatasetReference().withReferenceName("bibanbau")
                    .withParameters(mapOf("lssan", "datazvpaklozkxbzrpej")))
                .withLinkedService(new LinkedServiceReference().withReferenceName("ttkgsux")
                    .withParameters(mapOf("hkslgwlokhueoij", "dataswgkpjhboyikebh", "jyvdwtfxptpqayam",
                        "datazcqypzqzufgsyf", "ullojk", "datancfgybmxsnxoc", "g", "dataoy")))
                .withFlowlet(new DataFlowReference().withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                    .withReferenceName("j")
                    .withDatasetParameters("datadbdljz")
                    .withParameters(mapOf("nq", "datarcvuqbsgzlrqhb", "jlf", "datagdxwbsfpyxx", "ilz",
                        "dataecominxojjluxxd", "za", "datadzzqjmu"))
                    .withAdditionalProperties(mapOf()))
                .withSchemaLinkedService(new LinkedServiceReference().withReferenceName("zipbwxgoooxzp")
                    .withParameters(mapOf("gzigjsugswhgsaod", "datamskxknp", "aquvwsxbgnvkervq", "datawwnbafoctohz",
                        "pabdsrg", "datahoadhrsxqvzv", "hjnlt", "dataajglzrsubklr")))))
            .withSinks(Arrays.asList(
                new DataFlowSink().withName("ylt")
                    .withDescription("ntf")
                    .withDataset(new DatasetReference().withReferenceName("bgwjdxwnaz")
                        .withParameters(mapOf("jwzzqseuzu", "datardreyzjwhsetw", "c", "datakykcyqhyqqzz", "ewfopazdazg",
                            "datakeys", "mdpv", "datasqgpewqcfu")))
                    .withLinkedService(new LinkedServiceReference().withReferenceName("glq")
                        .withParameters(mapOf("yowmndcovdw", "datanlzclctz")))
                    .withFlowlet(new DataFlowReference().withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                        .withReferenceName("uxza")
                        .withDatasetParameters("datamk")
                        .withParameters(mapOf("txudqyeme", "datauwkudrbcp"))
                        .withAdditionalProperties(mapOf()))
                    .withSchemaLinkedService(new LinkedServiceReference().withReferenceName("ij")
                        .withParameters(mapOf("m", "datawlefksxqceazfpxg")))
                    .withRejectedDataLinkedService(new LinkedServiceReference().withReferenceName("zvluyqqaiosss")
                        .withParameters(mapOf("fxtjdhsoym", "dataaifppuacvfyeowp", "tkfvvdshx", "datapvtyqfttehdpbouj",
                            "nquktrfnslnlrxs", "datadedsuenygnxcgjtf"))),
                new DataFlowSink().withName("scjfncjwvuagf")
                    .withDescription("tltng")
                    .withDataset(
                        new DatasetReference().withReferenceName("reuptrk").withParameters(mapOf("s", "dataijajwolx")))
                    .withLinkedService(new LinkedServiceReference().withReferenceName("ghmp")
                        .withParameters(mapOf("bxqla", "datalslrcigtzjc")))
                    .withFlowlet(new DataFlowReference().withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                        .withReferenceName("ssov")
                        .withDatasetParameters("datapavidnievwffc")
                        .withParameters(mapOf("xgcbdsvalpnpt", "dataezslp", "x", "datatrkxgpazwu"))
                        .withAdditionalProperties(mapOf()))
                    .withSchemaLinkedService(new LinkedServiceReference().withReferenceName("pztraudsvhl")
                        .withParameters(mapOf("egpqtmo", "dataul", "shqrdgrt", "datahvrztnvg", "fa", "datamewjzlpyk")))
                    .withRejectedDataLinkedService(new LinkedServiceReference().withReferenceName("wjcayerzrr")
                        .withParameters(mapOf("zrghsrleink", "dataybylpol"))),
                new DataFlowSink().withName("ll")
                    .withDescription("na")
                    .withDataset(new DatasetReference().withReferenceName("jowazhpab")
                        .withParameters(mapOf("wsxnsrqor", "datamlyotg")))
                    .withLinkedService(new LinkedServiceReference().withReferenceName("enmvcebxeetq")
                        .withParameters(mapOf("jkedwqurcgojmrv", "datacxxqndc", "qqrsil", "dataxwjongzse", "sbvr",
                            "datachskxxka", "rulfuct", "dataaqgvto")))
                    .withFlowlet(new DataFlowReference().withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                        .withReferenceName("thcfj")
                        .withDatasetParameters("dataxlyubqjrostv")
                        .withParameters(mapOf("qrztrxal", "dataqmtzzb", "rsnrhp", "datardhabsr", "iwkkvya", "dataa"))
                        .withAdditionalProperties(mapOf()))
                    .withSchemaLinkedService(new LinkedServiceReference().withReferenceName("gwokmikpazfbmjxu")
                        .withParameters(mapOf("zaehpphthd", "datapfdvhaxdv", "tatlakfqoi", "datalmv", "rpogwphchg",
                            "datawgiksbbvtoo", "htukfac", "datat")))
                    .withRejectedDataLinkedService(new LinkedServiceReference().withReferenceName("mbf")
                        .withParameters(mapOf("wcgasgom", "datameezbxvqxbnu", "qgo", "datamjzwx", "gfredmlscg",
                            "datasxpwwztjfmkkh"))),
                new DataFlowSink().withName("vpjbowcpjqduq")
                    .withDescription("xe")
                    .withDataset(new DatasetReference().withReferenceName("ydfbwlj")
                        .withParameters(mapOf("iegftc", "datauerkjddvrg", "fgmwd", "databiiftksdwgdnk",
                            "buvczldbglzoutb", "datac", "orbjg", "dataaqgzekajclyzgs")))
                    .withLinkedService(new LinkedServiceReference().withReferenceName("zjotvmrxkhlo")
                        .withParameters(mapOf("yu", "datajbhvhdiqayflu")))
                    .withFlowlet(new DataFlowReference().withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                        .withReferenceName("uudtelv")
                        .withDatasetParameters("dataibdrqrswhbuubpyr")
                        .withParameters(mapOf("nnctagfyvrt", "datajoxztfwfqchvczev", "cgkrepdqhqy", "dataqpemh"))
                        .withAdditionalProperties(mapOf()))
                    .withSchemaLinkedService(new LinkedServiceReference().withReferenceName("qtbxxniuisdzh")
                        .withParameters(mapOf("cnadbuwqrgxf", "datagzpags")))
                    .withRejectedDataLinkedService(new LinkedServiceReference().withReferenceName("mqiyn")
                        .withParameters(mapOf("vmtumxpym", "dataellnkkii", "canlduwzorxs", "datajfuaxroqvqpilrgu",
                            "kqv", "datamxaqklxym", "ltuubw", "dataqepdx")))))
            .withTransformations(Arrays.asList(
                new Transformation().withName("eeqgpkri")
                    .withDescription("bgnixxoww")
                    .withDataset(new DatasetReference().withReferenceName("yfwnw")
                        .withParameters(mapOf("icrmpepkldmaxxi", "dataxe", "ws", "datavs", "wrasekw", "datagkjgya")))
                    .withLinkedService(new LinkedServiceReference().withReferenceName("cvo")
                        .withParameters(mapOf("wyxqiclad", "dataoqar", "ob", "dataatdavuqmcbyms")))
                    .withFlowlet(new DataFlowReference().withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                        .withReferenceName("uvjezcjumvps")
                        .withDatasetParameters("dataioyoiglkmiq")
                        .withParameters(mapOf("ydgnha", "dataraclibbfqpspkla", "gpmnmabe", "datatwukex"))
                        .withAdditionalProperties(mapOf())),
                new Transformation().withName("htfpwpqb")
                    .withDescription("j")
                    .withDataset(
                        new DatasetReference().withReferenceName("yqwdqi").withParameters(mapOf("nztxlujkh", "datahg")))
                    .withLinkedService(new LinkedServiceReference().withReferenceName("cmrnkfmkhcq")
                        .withParameters(mapOf("eahjedv", "datalmhjnqt")))
                    .withFlowlet(new DataFlowReference().withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                        .withReferenceName("pok")
                        .withDatasetParameters("dataxejhh")
                        .withParameters(mapOf("tbkewkqynspg", "datauavt", "qokmyrljial", "datavoffbkkwvdxae"))
                        .withAdditionalProperties(mapOf())),
                new Transformation().withName("tzarogatmoljiy")
                    .withDescription("pinm")
                    .withDataset(new DatasetReference().withReferenceName("fkneerzztrkn")
                        .withParameters(mapOf("hkeizcp", "datalugdybnhrxlelf", "wjekptycaydbj", "datahtdm",
                            "ymlcfnzhmhsurlg", "datac", "lawiubmomsgvvjhv", "dataqkpmmzpstau")))
                    .withLinkedService(new LinkedServiceReference().withReferenceName("rlohe")
                        .withParameters(mapOf("lqionswaeqk", "datamajnkd")))
                    .withFlowlet(new DataFlowReference().withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                        .withReferenceName("qxjoshohtotryeg")
                        .withDatasetParameters("datah")
                        .withParameters(mapOf("erufgjblcdrmy", "dataexznlwkbfokxkhup", "ekdfqnhttwd",
                            "datacemftzgyykyalu", "mhmnulwemp", "datawrczfjjnnuxxrk"))
                        .withAdditionalProperties(mapOf())),
                new Transformation().withName("rjeizik")
                    .withDescription("aboohxbmsgyc")
                    .withDataset(new DatasetReference().withReferenceName("xrmdvewuyqaeohpj")
                        .withParameters(mapOf("xaex", "datajkbvhhdaurgho", "xjxjoe", "datak", "dknkobe", "datalqxr",
                            "cdgzseznux", "datatmbozomtzamicbig")))
                    .withLinkedService(new LinkedServiceReference().withReferenceName("uairaabmdlqjb")
                        .withParameters(mapOf("xlhupmomihzbdnp", "dataf", "cghf", "datapkcdpreyxely", "sfxrkbhammgm",
                            "datarufssjyg")))
                    .withFlowlet(new DataFlowReference().withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                        .withReferenceName("efgvqcp")
                        .withDatasetParameters("datajgquxweysland")
                        .withParameters(mapOf("nquoxsotireimse", "datadjhunhghcgawnr", "tcyilbvz", "databfsx"))
                        .withAdditionalProperties(mapOf()))))
            .withScript("oqpe")
            .withScriptLines(Arrays.asList("eapfse", "gdtpe", "nacyheqwb"));
        model = BinaryData.fromObject(model).toObject(MappingDataFlow.class);
        Assertions.assertEquals("upyvqyvliq", model.description());
        Assertions.assertEquals("ocqibz", model.folder().name());
        Assertions.assertEquals("etjdvqydieqqkwa", model.sources().get(0).name());
        Assertions.assertEquals("wdxvqzxoebwg", model.sources().get(0).description());
        Assertions.assertEquals("bibanbau", model.sources().get(0).dataset().referenceName());
        Assertions.assertEquals("ttkgsux", model.sources().get(0).linkedService().referenceName());
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE, model.sources().get(0).flowlet().type());
        Assertions.assertEquals("j", model.sources().get(0).flowlet().referenceName());
        Assertions.assertEquals("zipbwxgoooxzp", model.sources().get(0).schemaLinkedService().referenceName());
        Assertions.assertEquals("ylt", model.sinks().get(0).name());
        Assertions.assertEquals("ntf", model.sinks().get(0).description());
        Assertions.assertEquals("bgwjdxwnaz", model.sinks().get(0).dataset().referenceName());
        Assertions.assertEquals("glq", model.sinks().get(0).linkedService().referenceName());
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE, model.sinks().get(0).flowlet().type());
        Assertions.assertEquals("uxza", model.sinks().get(0).flowlet().referenceName());
        Assertions.assertEquals("ij", model.sinks().get(0).schemaLinkedService().referenceName());
        Assertions.assertEquals("zvluyqqaiosss", model.sinks().get(0).rejectedDataLinkedService().referenceName());
        Assertions.assertEquals("eeqgpkri", model.transformations().get(0).name());
        Assertions.assertEquals("bgnixxoww", model.transformations().get(0).description());
        Assertions.assertEquals("yfwnw", model.transformations().get(0).dataset().referenceName());
        Assertions.assertEquals("cvo", model.transformations().get(0).linkedService().referenceName());
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE,
            model.transformations().get(0).flowlet().type());
        Assertions.assertEquals("uvjezcjumvps", model.transformations().get(0).flowlet().referenceName());
        Assertions.assertEquals("oqpe", model.script());
        Assertions.assertEquals("eapfse", model.scriptLines().get(0));
    }

    // Use "Map.of" if available
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
