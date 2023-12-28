// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.models;

import com.azure.cosmos.implementation.ImplementationBridgeHelpers;
import com.azure.cosmos.implementation.apachecommons.lang.StringUtils;
import com.azure.cosmos.implementation.patch.PatchOperation;
import com.azure.cosmos.implementation.patch.PatchOperationCore;
import com.azure.cosmos.implementation.patch.PatchOperationType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.azure.cosmos.implementation.guava25.base.Preconditions.checkArgument;

/**
 * Grammar is a super set of this RFC: https://tools.ietf.org/html/rfc6902#section-4.1
 *
 * Contains a list of Patch operations to be applied on an item. It is applied in an atomic manner and we support all
 * the operation in above RFC and more.
 *
 * This can be executed in 3 ways:
 *  1. Passing this to container in container.patchItem() which requires the id of the item to be patched, partition
 *      key, the CosmosPatchOperations instance, any CosmosItemRequestOptions and the class type for which response will be parsed.
 *  2. Add CosmosPatchOperations instance in TransactionalBatch using batch.patchItemOperation() which requires the id of the item
 *      to be patched, cosmos patch instance and TransactionalBatchItemRequestOptions(if-any) and follow remaining
 *      steps for batch for it's execution.
 *  3. Create a bulk item using {@link CosmosBulkOperations#getPatchItemOperation(String, PartitionKey, CosmosPatchOperations)} which requires the id of the item to be patched,
 *      cosmos patch instance, partition key and {@link CosmosBulkItemRequestOptions}(if-any) and follow remaining steps to
 *      execute bulk operations.
 *
 *  Let's assume this is the JSON for which we want to run patch operation.
 *  <code>
 *      {
 *          a : "xyz"
 *          b : {
 *              c : "efg:
 *              d : 4
 *              e : [0, 1, 2 , 3]
 *          }
 *      }
 *  </code>
 *
 */
public final class CosmosPatchOperations {

    private final List<PatchOperation> patchOperations;

    private CosmosPatchOperations() {
        this.patchOperations = Collections.synchronizedList(new ArrayList<>());
    }

    /**
     * Initializes a new instance of {@link CosmosPatchOperations} that will contain operations to be performed on a item atomically.
     *
     * @return A new instance of {@link CosmosPatchOperations}.
     */
    public static CosmosPatchOperations create() {
        return new CosmosPatchOperations();
    }

    /**
     * This performs one of the following functions, depending upon what the target location references:
     *  1. Target location specifies an array index, a new value is inserted into the array at the specified index.
     *  2. Target location specifies an object member that does not already exist, a new member is added to the object.
     *  3. Target location specifies an object member that does exist, that member's value is replaced.
     *
     * For the above JSON, we can have something like this:
     * <code>
     *     CosmosPatchOperations cosmosPatch = CosmosPatchOperations.create();
     *     cosmosPatch.add("/b/e", 15); // will add a value to the array, so /b/e array will become [0, 1, 2, 3, 15]
     *     cosmosPatch.add("/a", "new value"); // will replace the value
     *     cosmosPatch.add("/b/e/1", 10); // will change value of the /b/e array to [0, 10, 2, 3]
     * </code>
     *
     * This operation is not idempotent for scenario 1 and 2. For 3rd it is as the final value will be the value
     * provided here.
     *
     * @param <T> The type of item to be added.
     *
     * @param path the operation path.
     * @param value the value which will be added.
     *
     * @return same instance of {@link CosmosPatchOperations}
     */
    public <T> CosmosPatchOperations add(String path, T value) {
        checkArgument(StringUtils.isNotEmpty(path), "path empty %s", path);

        this.patchOperations.add(
            new PatchOperationCore<>(
                PatchOperationType.ADD,
                path,
                value));

        return this;
    }

    /**
     * This removes the value at the target location.
     *
     * For the above JSON, we can have something like this:
     * <code>
     *     CosmosPatchOperations cosmosPatch = CosmosPatchOperations.create();
     *     cosmosPatch.remove("/a");
     *     cosmosPatch.remove("/b/e/3"); // will remove 4th element of /b/e array
     * </code>
     *
     * This operation is not idempotent. Since once applied, next time it will return bad request due to path not found.
     *
     * @param path the operation path.
     *
     * @return same instance of {@link CosmosPatchOperations}
     */
    public CosmosPatchOperations remove(String path) {

        checkArgument(StringUtils.isNotEmpty(path), "path empty %s", path);

        this.patchOperations.add(
            new PatchOperationCore<>(
                PatchOperationType.REMOVE,
                path,
                null));

        return this;
    }

    /**
     * This replaces the value at the target location with a new value.
     *
     * For the above JSON, we can have something like this:
     * <code>
     *     CosmosPatchOperations cosmosPatch = CosmosPatchOperations.create();
     *     cosmosPatch.replace("/a", "new value"); // will replace "xyz" to "new value"
     *     cosmosPatch.replace("/b/e/1", 2); // will replace 2nd element of /b/e array to 2
     * </code>
     *
     * This operation is idempotent as multiple call execution replace to the same value.
     *
     * @param <T> The type of item to be replaced.
     *
     * @param path the operation path.
     * @param value the value which will be replaced.
     *
     * @return same instance of {@link CosmosPatchOperations}
     */
    public <T> CosmosPatchOperations replace(String path, T value) {

        checkArgument(StringUtils.isNotEmpty(path), "path empty %s", path);

        this.patchOperations.add(
            new PatchOperationCore<>(
                PatchOperationType.REPLACE,
                path,
                value));

        return this;
    }

    /**
     * This moves the value of an object from the source to a destination.
     *
     * This performs the following based on different cases:
     * 1. Source location points to an object as value, moves the entire object to the target location.
     * 2. Target location specifies an object member that does not already exist, a new member is added to the object.
     *    Its value is set to the value of the source location.
     *
     * For the above JSON, we can have something like this:
     * <code>
     *     CosmosPatchOperations cosmosPatch = CosmosPatchOperations.create();
     *     cosmosPatch.move("/a", "/c/d"); // will move the value of "/a" to "/c/d"
     *     cosmosPatch.move("/b/e/1", "/d"); // will move the object at the 2nd element of the array and set it as the
     *                                          value of "/d".
     *     cosmosPatch.move("/b", "/c"); //It can also be used as a rename operation since now all values of "/b" will
     *                                     set as values of "/c".
     * </code>
     *
     * @param fromPath the source path for the operation.
     * @param toPath the destination path for the operation.
     *
     * @return same instance of {@link CosmosPatchOperations}
     */
    public CosmosPatchOperations move(String fromPath, String toPath) {

        checkArgument(StringUtils.isNotEmpty(fromPath), "Source path empty %s", fromPath);
        checkArgument(StringUtils.isNotEmpty(toPath), "Destination path empty %s", toPath);

        this.patchOperations.add(
            new PatchOperationCore<>(
                PatchOperationType.MOVE,
                toPath,
                fromPath));

        return this;
    }
    /**
     * This sets the value at the target location with a new value.
     *
     * For the above JSON, we can have something like this:
     * <code>
     *     CosmosPatchOperations cosmosPatch = CosmosPatchOperations.create();
     *     cosmosPatch.set("/f", "new value"); // will add a new path "/f" and set it's value as "new value".
     *     cosmosPatch.set("/b/e", "bar"); // will set "/b/e" path to be "bar".
     * </code>
     *
     * This operation is idempotent as multiple execution will set the same value. If a new path is added, next time
     * same value will be set.
     *
     * @param <T> The type of item to be set.
     *
     * @param path the operation path.
     * @param value the value which will be set.
     *
     * @return same instance of {@link CosmosPatchOperations}
     */
    public <T> CosmosPatchOperations set(String path, T value) {

        checkArgument(StringUtils.isNotEmpty(path), "path empty %s", path);

        this.patchOperations.add(
            new PatchOperationCore<>(
                PatchOperationType.SET,
                path,
                value));

        return this;
    }

    /**
     * This increment the value at the target location. It's a CRDT operator and won't cause any conflict.
     *
     * For the above JSON, we can have something like this:
     * <code>
     *     CosmosPatchOperations cosmosPatch = CosmosPatchOperations.create();
     *     cosmosPatch.increment("/b/d", 1); // will add 1 to "/b/d" resulting in 5.
     * </code>
     *
     * This is not idempotent as multiple execution will increase the value by the given increment. For multi-region
     * we do support concurrent increment on different regions and the final value is a merged value combining
     * all increments value.
     * However if multiple increments are on the same region, it can lead to concurrency issue which can be retried.
     *
     * @param path the operation path.
     * @param value the value which will be incremented.
     *
     * @return same instance of {@link CosmosPatchOperations}
     */
    public CosmosPatchOperations increment(String path, long value) {

        checkArgument(StringUtils.isNotEmpty(path), "path empty %s", path);

        this.patchOperations.add(
            new PatchOperationCore<>(
                PatchOperationType.INCREMENT,
                path,
                value));

        return this;
    }

    /**
     * This increment the value at the target location.
     *
     * For the above JSON, we can have something like this:
     * <code>
     *     CosmosPatchOperations cosmosPatch = CosmosPatchOperations.create();
     *     cosmosPatch.increment("/b/d", 3.5); // will add 3.5 to "/b/d" resulting in 7.5.
     * </code>
     *
     * This is not idempotent as multiple execution will increase the value by the given increment. For multi-region
     * we do support concurrent increment on different regions and the final value is a merged value combining
     * all increments values.
     * However if multiple increments are on the same region, it can lead to concurrency issue which can be retried.
     *
     * @param path the operation path.
     * @param value the value which will be incremented.
     *
     * @return same instance of {@link CosmosPatchOperations}
     */
    public CosmosPatchOperations increment(String path, double value) {

        checkArgument(StringUtils.isNotEmpty(path), "path empty %s", path);

        this.patchOperations.add(
            new PatchOperationCore<>(
                PatchOperationType.INCREMENT,
                path,
                value));

        return this;
    }

    /**
     * The operator will first check if all the segments in the path provided (in the request) exist in the document.
     * In case they do not, the operator will create them and set the provided value at the leaf segment of the provided path.
     * In case the path already exists, the operator will not perform any modifications to the existing document at all.
     *
     * For the above JSON, we can have something like this:
     * <code>
     *     CosmosPatchOperations cosmosPatch = CosmosPatchOperations.create();
     *     cosmosPatch.createIfNotExists("/a/x/y", 15); // will add the path /a/x/y and set the value to 15
     *     cosmosPatch.createIfNotExists("/a/b/c", "new value"); // will not perform any modification as the path already exists
     * </code>
     *
     * To add or update an optional field, use createIfNotExists followed by add/set
     * <code>
     *     CosmosPatchOperations cosmosPatch = CosmosPatchOperations.create();
     *     cosmosPatch.createIfNotExists("/g", []); // will add the path /g if it doesn't exist and initialize it with []. Will be a no-op if /g already exists
     *     cosmosPatch.set("/g", [0,1,2]); // will set /g with the desired content
     * </code>
     *
     * Note: When the path already exists, createIfNotExists operation would return a 304 Not Modified response.
     * This operation is idempotent as it will add the path and set the value if the path does not exist and does
     * no modification if the path exists.
     *
     * @param <T> The type of item to be added.
     *
     * @param path the operation path.
     * @param value the value which will be added.
     *
     * @return same instance of {@link CosmosPatchOperations}
     */
    public <T> CosmosPatchOperations createIfNotExists(String path, T value) {
        checkArgument(StringUtils.isNotEmpty(path), "path empty %s", path);

        this.patchOperations.add(
            new PatchOperationCore<>(
                PatchOperationType.CREATE_IF_NOT_EXISTS,
                path,
                value));

        return this;
    }

    // NOTE returning this patchOperations means any
    // modifications - like adding new entries is still
    // thread-safe - but enumerating over the collection is not
    // unless synchronized
    List<PatchOperation> getPatchOperations() {
        return this.patchOperations;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    // the following helper/accessor only helps to access this class outside of this package.//
    ///////////////////////////////////////////////////////////////////////////////////////////
    static void initialize() {
        ImplementationBridgeHelpers.CosmosPatchOperationsHelper.setCosmosPatchOperationsAccessor(
            cosmosPatchOperations -> cosmosPatchOperations.getPatchOperations()
        );
    }

    static { initialize(); }
}
