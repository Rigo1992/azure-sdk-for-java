// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.ImageModelDistributionSettingsObjectDetection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ImageModelDistributionSettingsObjectDetectionTests {
    @Test
    public void testDeserialize() {
        ImageModelDistributionSettingsObjectDetection model =
            BinaryData
                .fromString(
                    "{\"boxDetectionsPerImage\":\"isubxbteog\",\"boxScoreThreshold\":\"fiijrykwlefksxqc\",\"imageSize\":\"zfpxgnmqvzvluy\",\"maxSize\":\"aiossscyvaifp\",\"minSize\":\"acvfyeowps\",\"modelSize\":\"tjdhsoymhpvtyq\",\"multiScale\":\"tehdpboujs\",\"nmsIouThreshold\":\"fvvdshxcdedsue\",\"tileGridSize\":\"gnxcgjtfrnquktr\",\"tileOverlapRatio\":\"s\",\"tilePredictionsNmsThreshold\":\"lr\",\"validationIouThreshold\":\"myltrwntfmtbg\",\"validationMetricType\":\"dxwnazkurrd\",\"amsGradient\":\"yzjwhsetwwjwzzq\",\"augmentations\":\"uzu\",\"beta1\":\"y\",\"beta2\":\"yqhyqqzzdcykey\",\"distributed\":\"ewfopazdazg\",\"earlyStopping\":\"qgpewqcfutmdpvoz\",\"earlyStoppingDelay\":\"qjbknl\",\"earlyStoppingPatience\":\"lctzeyowmndcovd\",\"enableOnnxNormalization\":\"qauxzan\",\"evaluationFrequency\":\"kvfruwkudr\",\"gradientAccumulationStep\":\"pftxudqyeme\",\"layersToFreeze\":\"naucmcirtnee\",\"learningRate\":\"jauwcgxefnohaitr\",\"learningRateScheduler\":\"izerw\",\"modelName\":\"dasmxu\",\"momentum\":\"fbngfcocef\",\"nesterov\":\"riylfmpztra\",\"numberOfEpochs\":\"svhl\",\"numberOfWorkers\":\"culregpqt\",\"optimizer\":\"jhvrztnvgyshqrdg\",\"randomSeed\":\"wmewjzlpyk\",\"stepLRGamma\":\"azzwjcay\",\"stepLRStepSize\":\"zrransyb\",\"trainingBatchSize\":\"polwzrghsrlei\",\"validationBatchSize\":\"fscjfn\",\"warmupCosineLRCycles\":\"wvuagfqwtl\",\"warmupCosineLRWarmupEpochs\":\"gvmreuptrklzmi\",\"weightDecay\":\"jwolxfsvaghmpynw\"}")
                .toObject(ImageModelDistributionSettingsObjectDetection.class);
        Assertions.assertEquals("yzjwhsetwwjwzzq", model.amsGradient());
        Assertions.assertEquals("uzu", model.augmentations());
        Assertions.assertEquals("y", model.beta1());
        Assertions.assertEquals("yqhyqqzzdcykey", model.beta2());
        Assertions.assertEquals("ewfopazdazg", model.distributed());
        Assertions.assertEquals("qgpewqcfutmdpvoz", model.earlyStopping());
        Assertions.assertEquals("qjbknl", model.earlyStoppingDelay());
        Assertions.assertEquals("lctzeyowmndcovd", model.earlyStoppingPatience());
        Assertions.assertEquals("qauxzan", model.enableOnnxNormalization());
        Assertions.assertEquals("kvfruwkudr", model.evaluationFrequency());
        Assertions.assertEquals("pftxudqyeme", model.gradientAccumulationStep());
        Assertions.assertEquals("naucmcirtnee", model.layersToFreeze());
        Assertions.assertEquals("jauwcgxefnohaitr", model.learningRate());
        Assertions.assertEquals("izerw", model.learningRateScheduler());
        Assertions.assertEquals("dasmxu", model.modelName());
        Assertions.assertEquals("fbngfcocef", model.momentum());
        Assertions.assertEquals("riylfmpztra", model.nesterov());
        Assertions.assertEquals("svhl", model.numberOfEpochs());
        Assertions.assertEquals("culregpqt", model.numberOfWorkers());
        Assertions.assertEquals("jhvrztnvgyshqrdg", model.optimizer());
        Assertions.assertEquals("wmewjzlpyk", model.randomSeed());
        Assertions.assertEquals("azzwjcay", model.stepLRGamma());
        Assertions.assertEquals("zrransyb", model.stepLRStepSize());
        Assertions.assertEquals("polwzrghsrlei", model.trainingBatchSize());
        Assertions.assertEquals("fscjfn", model.validationBatchSize());
        Assertions.assertEquals("wvuagfqwtl", model.warmupCosineLRCycles());
        Assertions.assertEquals("gvmreuptrklzmi", model.warmupCosineLRWarmupEpochs());
        Assertions.assertEquals("jwolxfsvaghmpynw", model.weightDecay());
        Assertions.assertEquals("isubxbteog", model.boxDetectionsPerImage());
        Assertions.assertEquals("fiijrykwlefksxqc", model.boxScoreThreshold());
        Assertions.assertEquals("zfpxgnmqvzvluy", model.imageSize());
        Assertions.assertEquals("aiossscyvaifp", model.maxSize());
        Assertions.assertEquals("acvfyeowps", model.minSize());
        Assertions.assertEquals("tjdhsoymhpvtyq", model.modelSize());
        Assertions.assertEquals("tehdpboujs", model.multiScale());
        Assertions.assertEquals("fvvdshxcdedsue", model.nmsIouThreshold());
        Assertions.assertEquals("gnxcgjtfrnquktr", model.tileGridSize());
        Assertions.assertEquals("s", model.tileOverlapRatio());
        Assertions.assertEquals("lr", model.tilePredictionsNmsThreshold());
        Assertions.assertEquals("myltrwntfmtbg", model.validationIouThreshold());
        Assertions.assertEquals("dxwnazkurrd", model.validationMetricType());
    }

    @Test
    public void testSerialize() {
        ImageModelDistributionSettingsObjectDetection model =
            new ImageModelDistributionSettingsObjectDetection()
                .withAmsGradient("yzjwhsetwwjwzzq")
                .withAugmentations("uzu")
                .withBeta1("y")
                .withBeta2("yqhyqqzzdcykey")
                .withDistributed("ewfopazdazg")
                .withEarlyStopping("qgpewqcfutmdpvoz")
                .withEarlyStoppingDelay("qjbknl")
                .withEarlyStoppingPatience("lctzeyowmndcovd")
                .withEnableOnnxNormalization("qauxzan")
                .withEvaluationFrequency("kvfruwkudr")
                .withGradientAccumulationStep("pftxudqyeme")
                .withLayersToFreeze("naucmcirtnee")
                .withLearningRate("jauwcgxefnohaitr")
                .withLearningRateScheduler("izerw")
                .withModelName("dasmxu")
                .withMomentum("fbngfcocef")
                .withNesterov("riylfmpztra")
                .withNumberOfEpochs("svhl")
                .withNumberOfWorkers("culregpqt")
                .withOptimizer("jhvrztnvgyshqrdg")
                .withRandomSeed("wmewjzlpyk")
                .withStepLRGamma("azzwjcay")
                .withStepLRStepSize("zrransyb")
                .withTrainingBatchSize("polwzrghsrlei")
                .withValidationBatchSize("fscjfn")
                .withWarmupCosineLRCycles("wvuagfqwtl")
                .withWarmupCosineLRWarmupEpochs("gvmreuptrklzmi")
                .withWeightDecay("jwolxfsvaghmpynw")
                .withBoxDetectionsPerImage("isubxbteog")
                .withBoxScoreThreshold("fiijrykwlefksxqc")
                .withImageSize("zfpxgnmqvzvluy")
                .withMaxSize("aiossscyvaifp")
                .withMinSize("acvfyeowps")
                .withModelSize("tjdhsoymhpvtyq")
                .withMultiScale("tehdpboujs")
                .withNmsIouThreshold("fvvdshxcdedsue")
                .withTileGridSize("gnxcgjtfrnquktr")
                .withTileOverlapRatio("s")
                .withTilePredictionsNmsThreshold("lr")
                .withValidationIouThreshold("myltrwntfmtbg")
                .withValidationMetricType("dxwnazkurrd");
        model = BinaryData.fromObject(model).toObject(ImageModelDistributionSettingsObjectDetection.class);
        Assertions.assertEquals("yzjwhsetwwjwzzq", model.amsGradient());
        Assertions.assertEquals("uzu", model.augmentations());
        Assertions.assertEquals("y", model.beta1());
        Assertions.assertEquals("yqhyqqzzdcykey", model.beta2());
        Assertions.assertEquals("ewfopazdazg", model.distributed());
        Assertions.assertEquals("qgpewqcfutmdpvoz", model.earlyStopping());
        Assertions.assertEquals("qjbknl", model.earlyStoppingDelay());
        Assertions.assertEquals("lctzeyowmndcovd", model.earlyStoppingPatience());
        Assertions.assertEquals("qauxzan", model.enableOnnxNormalization());
        Assertions.assertEquals("kvfruwkudr", model.evaluationFrequency());
        Assertions.assertEquals("pftxudqyeme", model.gradientAccumulationStep());
        Assertions.assertEquals("naucmcirtnee", model.layersToFreeze());
        Assertions.assertEquals("jauwcgxefnohaitr", model.learningRate());
        Assertions.assertEquals("izerw", model.learningRateScheduler());
        Assertions.assertEquals("dasmxu", model.modelName());
        Assertions.assertEquals("fbngfcocef", model.momentum());
        Assertions.assertEquals("riylfmpztra", model.nesterov());
        Assertions.assertEquals("svhl", model.numberOfEpochs());
        Assertions.assertEquals("culregpqt", model.numberOfWorkers());
        Assertions.assertEquals("jhvrztnvgyshqrdg", model.optimizer());
        Assertions.assertEquals("wmewjzlpyk", model.randomSeed());
        Assertions.assertEquals("azzwjcay", model.stepLRGamma());
        Assertions.assertEquals("zrransyb", model.stepLRStepSize());
        Assertions.assertEquals("polwzrghsrlei", model.trainingBatchSize());
        Assertions.assertEquals("fscjfn", model.validationBatchSize());
        Assertions.assertEquals("wvuagfqwtl", model.warmupCosineLRCycles());
        Assertions.assertEquals("gvmreuptrklzmi", model.warmupCosineLRWarmupEpochs());
        Assertions.assertEquals("jwolxfsvaghmpynw", model.weightDecay());
        Assertions.assertEquals("isubxbteog", model.boxDetectionsPerImage());
        Assertions.assertEquals("fiijrykwlefksxqc", model.boxScoreThreshold());
        Assertions.assertEquals("zfpxgnmqvzvluy", model.imageSize());
        Assertions.assertEquals("aiossscyvaifp", model.maxSize());
        Assertions.assertEquals("acvfyeowps", model.minSize());
        Assertions.assertEquals("tjdhsoymhpvtyq", model.modelSize());
        Assertions.assertEquals("tehdpboujs", model.multiScale());
        Assertions.assertEquals("fvvdshxcdedsue", model.nmsIouThreshold());
        Assertions.assertEquals("gnxcgjtfrnquktr", model.tileGridSize());
        Assertions.assertEquals("s", model.tileOverlapRatio());
        Assertions.assertEquals("lr", model.tilePredictionsNmsThreshold());
        Assertions.assertEquals("myltrwntfmtbg", model.validationIouThreshold());
        Assertions.assertEquals("dxwnazkurrd", model.validationMetricType());
    }
}
