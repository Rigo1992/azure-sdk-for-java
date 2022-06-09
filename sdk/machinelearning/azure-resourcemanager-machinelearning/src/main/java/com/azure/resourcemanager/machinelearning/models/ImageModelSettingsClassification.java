// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Settings used for training the model. For more information on the available settings please visit the official
 * documentation: https://docs.microsoft.com/en-us/azure/machine-learning/how-to-auto-train-image-models.
 */
@Fluent
public final class ImageModelSettingsClassification extends ImageModelSettings {
    /*
     * Image crop size that is input to the neural network for the training
     * dataset. Must be a positive integer.
     */
    @JsonProperty(value = "trainingCropSize")
    private Integer trainingCropSize;

    /*
     * Image crop size that is input to the neural network for the validation
     * dataset. Must be a positive integer.
     */
    @JsonProperty(value = "validationCropSize")
    private Integer validationCropSize;

    /*
     * Image size to which to resize before cropping for validation dataset.
     * Must be a positive integer.
     */
    @JsonProperty(value = "validationResizeSize")
    private Integer validationResizeSize;

    /*
     * Weighted loss. The accepted values are 0 for no weighted loss.
     * 1 for weighted loss with sqrt.(class_weights). 2 for weighted loss with
     * class_weights. Must be 0 or 1 or 2.
     */
    @JsonProperty(value = "weightedLoss")
    private Integer weightedLoss;

    /**
     * Get the trainingCropSize property: Image crop size that is input to the neural network for the training dataset.
     * Must be a positive integer.
     *
     * @return the trainingCropSize value.
     */
    public Integer trainingCropSize() {
        return this.trainingCropSize;
    }

    /**
     * Set the trainingCropSize property: Image crop size that is input to the neural network for the training dataset.
     * Must be a positive integer.
     *
     * @param trainingCropSize the trainingCropSize value to set.
     * @return the ImageModelSettingsClassification object itself.
     */
    public ImageModelSettingsClassification withTrainingCropSize(Integer trainingCropSize) {
        this.trainingCropSize = trainingCropSize;
        return this;
    }

    /**
     * Get the validationCropSize property: Image crop size that is input to the neural network for the validation
     * dataset. Must be a positive integer.
     *
     * @return the validationCropSize value.
     */
    public Integer validationCropSize() {
        return this.validationCropSize;
    }

    /**
     * Set the validationCropSize property: Image crop size that is input to the neural network for the validation
     * dataset. Must be a positive integer.
     *
     * @param validationCropSize the validationCropSize value to set.
     * @return the ImageModelSettingsClassification object itself.
     */
    public ImageModelSettingsClassification withValidationCropSize(Integer validationCropSize) {
        this.validationCropSize = validationCropSize;
        return this;
    }

    /**
     * Get the validationResizeSize property: Image size to which to resize before cropping for validation dataset. Must
     * be a positive integer.
     *
     * @return the validationResizeSize value.
     */
    public Integer validationResizeSize() {
        return this.validationResizeSize;
    }

    /**
     * Set the validationResizeSize property: Image size to which to resize before cropping for validation dataset. Must
     * be a positive integer.
     *
     * @param validationResizeSize the validationResizeSize value to set.
     * @return the ImageModelSettingsClassification object itself.
     */
    public ImageModelSettingsClassification withValidationResizeSize(Integer validationResizeSize) {
        this.validationResizeSize = validationResizeSize;
        return this;
    }

    /**
     * Get the weightedLoss property: Weighted loss. The accepted values are 0 for no weighted loss. 1 for weighted loss
     * with sqrt.(class_weights). 2 for weighted loss with class_weights. Must be 0 or 1 or 2.
     *
     * @return the weightedLoss value.
     */
    public Integer weightedLoss() {
        return this.weightedLoss;
    }

    /**
     * Set the weightedLoss property: Weighted loss. The accepted values are 0 for no weighted loss. 1 for weighted loss
     * with sqrt.(class_weights). 2 for weighted loss with class_weights. Must be 0 or 1 or 2.
     *
     * @param weightedLoss the weightedLoss value to set.
     * @return the ImageModelSettingsClassification object itself.
     */
    public ImageModelSettingsClassification withWeightedLoss(Integer weightedLoss) {
        this.weightedLoss = weightedLoss;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageModelSettingsClassification withAdvancedSettings(String advancedSettings) {
        super.withAdvancedSettings(advancedSettings);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageModelSettingsClassification withAmsGradient(Boolean amsGradient) {
        super.withAmsGradient(amsGradient);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageModelSettingsClassification withAugmentations(String augmentations) {
        super.withAugmentations(augmentations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageModelSettingsClassification withBeta1(Float beta1) {
        super.withBeta1(beta1);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageModelSettingsClassification withBeta2(Float beta2) {
        super.withBeta2(beta2);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageModelSettingsClassification withCheckpointDatasetId(String checkpointDatasetId) {
        super.withCheckpointDatasetId(checkpointDatasetId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageModelSettingsClassification withCheckpointFilename(String checkpointFilename) {
        super.withCheckpointFilename(checkpointFilename);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageModelSettingsClassification withCheckpointFrequency(Integer checkpointFrequency) {
        super.withCheckpointFrequency(checkpointFrequency);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageModelSettingsClassification withCheckpointRunId(String checkpointRunId) {
        super.withCheckpointRunId(checkpointRunId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageModelSettingsClassification withDistributed(Boolean distributed) {
        super.withDistributed(distributed);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageModelSettingsClassification withEarlyStopping(Boolean earlyStopping) {
        super.withEarlyStopping(earlyStopping);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageModelSettingsClassification withEarlyStoppingDelay(Integer earlyStoppingDelay) {
        super.withEarlyStoppingDelay(earlyStoppingDelay);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageModelSettingsClassification withEarlyStoppingPatience(Integer earlyStoppingPatience) {
        super.withEarlyStoppingPatience(earlyStoppingPatience);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageModelSettingsClassification withEnableOnnxNormalization(Boolean enableOnnxNormalization) {
        super.withEnableOnnxNormalization(enableOnnxNormalization);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageModelSettingsClassification withEvaluationFrequency(Integer evaluationFrequency) {
        super.withEvaluationFrequency(evaluationFrequency);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageModelSettingsClassification withGradientAccumulationStep(Integer gradientAccumulationStep) {
        super.withGradientAccumulationStep(gradientAccumulationStep);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageModelSettingsClassification withLayersToFreeze(Integer layersToFreeze) {
        super.withLayersToFreeze(layersToFreeze);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageModelSettingsClassification withLearningRate(Float learningRate) {
        super.withLearningRate(learningRate);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageModelSettingsClassification withLearningRateScheduler(LearningRateScheduler learningRateScheduler) {
        super.withLearningRateScheduler(learningRateScheduler);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageModelSettingsClassification withModelName(String modelName) {
        super.withModelName(modelName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageModelSettingsClassification withMomentum(Float momentum) {
        super.withMomentum(momentum);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageModelSettingsClassification withNesterov(Boolean nesterov) {
        super.withNesterov(nesterov);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageModelSettingsClassification withNumberOfEpochs(Integer numberOfEpochs) {
        super.withNumberOfEpochs(numberOfEpochs);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageModelSettingsClassification withNumberOfWorkers(Integer numberOfWorkers) {
        super.withNumberOfWorkers(numberOfWorkers);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageModelSettingsClassification withOptimizer(StochasticOptimizer optimizer) {
        super.withOptimizer(optimizer);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageModelSettingsClassification withRandomSeed(Integer randomSeed) {
        super.withRandomSeed(randomSeed);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageModelSettingsClassification withSplitRatio(Float splitRatio) {
        super.withSplitRatio(splitRatio);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageModelSettingsClassification withStepLRGamma(Float stepLRGamma) {
        super.withStepLRGamma(stepLRGamma);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageModelSettingsClassification withStepLRStepSize(Integer stepLRStepSize) {
        super.withStepLRStepSize(stepLRStepSize);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageModelSettingsClassification withTrainingBatchSize(Integer trainingBatchSize) {
        super.withTrainingBatchSize(trainingBatchSize);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageModelSettingsClassification withValidationBatchSize(Integer validationBatchSize) {
        super.withValidationBatchSize(validationBatchSize);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageModelSettingsClassification withWarmupCosineLRCycles(Float warmupCosineLRCycles) {
        super.withWarmupCosineLRCycles(warmupCosineLRCycles);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageModelSettingsClassification withWarmupCosineLRWarmupEpochs(Integer warmupCosineLRWarmupEpochs) {
        super.withWarmupCosineLRWarmupEpochs(warmupCosineLRWarmupEpochs);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ImageModelSettingsClassification withWeightDecay(Float weightDecay) {
        super.withWeightDecay(weightDecay);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
