// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.rx;

import com.azure.cosmos.BridgeInternal;
import com.azure.cosmos.ConsistencyLevel;
import com.azure.cosmos.CosmosAsyncClient;
import com.azure.cosmos.CosmosAsyncContainer;
import com.azure.cosmos.CosmosAsyncDatabase;
import com.azure.cosmos.CosmosClientBuilder;
import com.azure.cosmos.CosmosDatabaseForTest;
import com.azure.cosmos.DirectConnectionConfig;
import com.azure.cosmos.implementation.AsyncDocumentClient;
import com.azure.cosmos.implementation.PartitionKeyRange;
import com.azure.cosmos.implementation.TestConfigurations;
import com.azure.cosmos.models.CosmosContainerProperties;
import com.azure.cosmos.models.CosmosQueryRequestOptions;
import com.azure.cosmos.models.CosmosVectorDataType;
import com.azure.cosmos.models.CosmosVectorDistanceFunction;
import com.azure.cosmos.models.CosmosVectorEmbedding;
import com.azure.cosmos.models.CosmosVectorEmbeddingPolicy;
import com.azure.cosmos.models.CosmosVectorIndexSpec;
import com.azure.cosmos.models.CosmosVectorIndexType;
import com.azure.cosmos.models.FeedResponse;
import com.azure.cosmos.models.IncludedPath;
import com.azure.cosmos.models.IndexingMode;
import com.azure.cosmos.models.IndexingPolicy;
import com.azure.cosmos.models.PartitionKeyDefinition;
import com.azure.cosmos.models.ThroughputProperties;
import com.azure.cosmos.models.ThroughputResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

import static com.azure.cosmos.rx.TestSuiteBase.createDatabase;
import static com.azure.cosmos.rx.TestSuiteBase.safeClose;
import static com.azure.cosmos.rx.TestSuiteBase.safeDeleteDatabase;
import static org.assertj.core.api.Assertions.assertThat;

public class NonStreamingOrderByQueryVectorSearchTest {
    protected static final int TIMEOUT = 30000;
    protected static final int SETUP_TIMEOUT = 20000;
    protected static final int SHUTDOWN_TIMEOUT = 20000;

    protected static Logger logger = LoggerFactory.getLogger(NonStreamingOrderByQueryVectorSearchTest.class.getSimpleName());

    private final String databaseId = CosmosDatabaseForTest.generateId();
    private final String flatContainerId = "flat_" + UUID.randomUUID();
    private final String quantizedContainerId = "quantized_" + UUID.randomUUID();
    private final String largeDataContainerId = "large_data_" + UUID.randomUUID();
    private CosmosAsyncClient client;
    private CosmosAsyncDatabase database;
    private CosmosAsyncContainer flatIndexContainer;
    private CosmosAsyncContainer quantizedIndexContainer;
    private CosmosAsyncContainer largeDataContainer;

    @BeforeClass(groups = {"query", "split"}, timeOut = SETUP_TIMEOUT)
    public void before_NonStreamingOrderByQueryVectorSearchTest() {
        // set up the client
        client = new CosmosClientBuilder()
            .endpoint(TestConfigurations.HOST)
            .key(TestConfigurations.MASTER_KEY)
            .directMode(DirectConnectionConfig.getDefaultConfig())
            .consistencyLevel(ConsistencyLevel.SESSION)
            .contentResponseOnWriteEnabled(true)
            .buildAsyncClient();

        database = createDatabase(client, databaseId);

        PartitionKeyDefinition partitionKeyDef = new PartitionKeyDefinition();
        ArrayList<String> paths = new ArrayList<String>();
        paths.add("/pk");
        partitionKeyDef.setPaths(paths);

        CosmosContainerProperties containerProperties = new CosmosContainerProperties(flatContainerId, partitionKeyDef);
        containerProperties.setIndexingPolicy(populateIndexingPolicy(CosmosVectorIndexType.FLAT));
        containerProperties.setVectorEmbeddingPolicy(populateVectorEmbeddingPolicy(128L));
        database.createContainer(containerProperties).block();
        flatIndexContainer = database.getContainer(flatContainerId);

        containerProperties = new CosmosContainerProperties(quantizedContainerId, partitionKeyDef);
        containerProperties.setIndexingPolicy(populateIndexingPolicy(CosmosVectorIndexType.QUANTIZED_FLAT));
        containerProperties.setVectorEmbeddingPolicy(populateVectorEmbeddingPolicy(128L));
        database.createContainer(containerProperties, ThroughputProperties.createManualThroughput(20000)).block();
        quantizedIndexContainer = database.getContainer(quantizedContainerId);

        containerProperties = new CosmosContainerProperties(largeDataContainerId, partitionKeyDef);
        containerProperties.setIndexingPolicy(populateIndexingPolicy(CosmosVectorIndexType.QUANTIZED_FLAT));
        containerProperties.setVectorEmbeddingPolicy(populateVectorEmbeddingPolicy(2L));
        database.createContainer(containerProperties).block();
        largeDataContainer = database.getContainer(largeDataContainerId);

        for (Document doc : getVectorDocs()) {
            flatIndexContainer.createItem(doc).block();
            quantizedIndexContainer.createItem(doc).block();
        }
    }

    @AfterClass(groups = {"query"}, timeOut = SHUTDOWN_TIMEOUT, alwaysRun = true)
    public void afterClass() {
        safeDeleteDatabase(database);
        safeClose(client);
    }

    @Test(groups = {"query"}, timeOut = TIMEOUT)
    public void flatIndexVectorSearch() {
        String queryVector = getQueryVector();

        String vanilla_query = String.format("SELECT DISTINCT TOP 6 c.text, VectorDistance(c.embedding, [%s]) AS " +
            "score FROM c ORDER BY VectorDistance(c.embedding, [%s])", queryVector, queryVector);
        List<Document> resultDocs = flatIndexContainer.queryItems(vanilla_query, new CosmosQueryRequestOptions(), Document.class).byPage()
            .flatMap(feedResponse -> Flux.fromIterable(feedResponse.getResults()))
            .collectList().block();
        validateOrdering(6, resultDocs, false);

        String euclideanSpecsQuery = String.format("SELECT DISTINCT TOP 6 c.text, VectorDistance(c.embedding, [%s], {'distanceFunction': 'euclidean'}) AS " +
            "score FROM c ORDER BY VectorDistance(c.embedding, [%s], false, {'distanceFunction': 'euclidean'})", queryVector, queryVector);
        resultDocs = flatIndexContainer.queryItems(euclideanSpecsQuery, new CosmosQueryRequestOptions(), Document.class).byPage()
            .flatMap(feedResponse -> Flux.fromIterable(feedResponse.getResults()))
            .collectList().block();
        validateOrdering(6, resultDocs, false);

        String dotproductSpecsQuery = String.format("SELECT DISTINCT TOP 6 c.text, VectorDistance(c.embedding, [%s], {'distanceFunction': 'dotproduct'}) AS " +
            "score FROM c ORDER BY VectorDistance(c.embedding, [%s], false, {'distanceFunction': 'dotproduct'})", queryVector, queryVector);
        resultDocs = flatIndexContainer.queryItems(dotproductSpecsQuery, new CosmosQueryRequestOptions(), Document.class).byPage()
            .flatMap(feedResponse -> Flux.fromIterable(feedResponse.getResults()))
            .collectList().block();
        validateOrdering(6, resultDocs, false);
    }

    @Test(groups = {"query"}, timeOut = TIMEOUT)
    public void quantizedIndexVectorSearch() {
        String queryVector = getQueryVector();

        String vanillaQuery = String.format("SELECT DISTINCT TOP 6 c.text, VectorDistance(c.embedding, [%s]) AS " +
            "score FROM c ORDER BY VectorDistance(c.embedding, [%s])", queryVector, queryVector);
        List<Document> resultDocs = quantizedIndexContainer.queryItems(vanillaQuery, new CosmosQueryRequestOptions(), Document.class).byPage()
            .flatMap(feedResponse -> Flux.fromIterable(feedResponse.getResults()))
            .collectList().block();
        validateOrdering(6, resultDocs, false);

        String euclideanSpecsQuery = String.format("SELECT DISTINCT TOP 6 c.text, VectorDistance(c.embedding, [%s], false, {'distanceFunction': 'euclidean'}) AS " +
            "score FROM c ORDER BY VectorDistance(c.embedding, [%s], false, {'distanceFunction': 'euclidean'})", queryVector, queryVector);
        resultDocs = quantizedIndexContainer.queryItems(euclideanSpecsQuery, new CosmosQueryRequestOptions(), Document.class).byPage()
            .flatMap(feedResponse -> Flux.fromIterable(feedResponse.getResults()))
            .collectList().block();
        validateOrdering(6, resultDocs, true);

        String dotproduct_specs_query = String.format("SELECT DISTINCT TOP 6 c.text, VectorDistance(c.embedding, [%s], {'distanceFunction': 'dotproduct'}) AS " +
            "score FROM c ORDER BY VectorDistance(c.embedding, [%s], false, {'distanceFunction': 'dotproduct'})", queryVector, queryVector);
        resultDocs = quantizedIndexContainer.queryItems(dotproduct_specs_query, new CosmosQueryRequestOptions(), Document.class).byPage()
            .flatMap(feedResponse -> Flux.fromIterable(feedResponse.getResults()))
            .collectList().block();
        validateOrdering(6, resultDocs, false);
    }

    @Test(groups = {"query"}, timeOut = TIMEOUT * 40)
    public void largeDataVectorSearch() {
        double embeddingValue = 0.0001;
        for (int i = 1; i <= 2000; i++) {
            Document doc = new Document(String.valueOf(i), String.valueOf(i % 2), "text" + i, new double[]{embeddingValue, embeddingValue});
            largeDataContainer.createItem(doc).block();
            embeddingValue = 0.0001 * (i + 1);
        }

        String query = "SELECT c.id, VectorDistance(c.embedding, [0.0001, 0.0001]) AS score FROM c ORDER BY" +
            " VectorDistance(c.embedding, [0.0001, 0.0001]) OFFSET 0 LIMIT 1000";
        List<Document> resultDocs = largeDataContainer.queryItems(query, new CosmosQueryRequestOptions(), Document.class).byPage()
            .flatMap(feedResponse -> Flux.fromIterable(feedResponse.getResults()))
            .collectList().block();
        validateOrdering(1000, resultDocs, false);

        query = "SELECT DISTINCT c.id, VectorDistance(c.embedding, [0.0001, 0.0001]) AS score FROM c ORDER BY" +
            " VectorDistance(c.embedding, [0.0001, 0.0001]) OFFSET 0 LIMIT 1000";
        resultDocs = largeDataContainer.queryItems(query, new CosmosQueryRequestOptions(), Document.class).byPage()
            .flatMap(feedResponse -> Flux.fromIterable(feedResponse.getResults()))
            .collectList().block();
        validateOrdering(1000, resultDocs, false);

        query = "SELECT c.id, VectorDistance(c.embedding, [0.0001, 0.0001]) AS score FROM c ORDER BY" +
            " VectorDistance(c.embedding, [0.0001, 0.0001]) OFFSET 1000 LIMIT 500";
        resultDocs = largeDataContainer.queryItems(query, new CosmosQueryRequestOptions(), Document.class).byPage()
            .flatMap(feedResponse -> Flux.fromIterable(feedResponse.getResults()))
            .collectList().block();
        validateOrdering(500, resultDocs, false);

        query = "SELECT DISTINCT c.id, VectorDistance(c.embedding, [0.0001, 0.0001]) AS score FROM c ORDER BY" +
            " VectorDistance(c.embedding, [0.0001, 0.0001]) OFFSET 1000 LIMIT 500";
        resultDocs = largeDataContainer.queryItems(query, new CosmosQueryRequestOptions(), Document.class).byPage()
            .flatMap(feedResponse -> Flux.fromIterable(feedResponse.getResults()))
            .collectList().block();
        validateOrdering(500, resultDocs, false);

        query = "SELECT TOP 1000 c.id, VectorDistance(c.embedding, [0.0001, 0.0001]) AS score FROM c ORDER BY" +
            " VectorDistance(c.embedding, [0.0001, 0.0001])";
        resultDocs = largeDataContainer.queryItems(query, new CosmosQueryRequestOptions(), Document.class).byPage()
            .flatMap(feedResponse -> Flux.fromIterable(feedResponse.getResults()))
            .collectList().block();
        validateOrdering(1000, resultDocs, false);

        query = "SELECT DISTINCT TOP 1000 c.id, VectorDistance(c.embedding, [0.0001, 0.0001]) AS score FROM c ORDER BY" +
            " VectorDistance(c.embedding, [0.0001, 0.0001])";
        resultDocs = largeDataContainer.queryItems(query, new CosmosQueryRequestOptions(), Document.class).byPage()
            .flatMap(feedResponse -> Flux.fromIterable(feedResponse.getResults()))
            .collectList().block();
        validateOrdering(1000, resultDocs, false);
    }

    @Test(groups = {"split"}, timeOut = TIMEOUT * 40)
    public void splitHandlingVectorSearch() throws Exception {
        AsyncDocumentClient asyncDocumentClient = BridgeInternal.getContextClient(this.client);
        List<PartitionKeyRange> partitionKeyRanges = getPartitionKeyRanges(flatContainerId, asyncDocumentClient);
        String queryVector = getQueryVector();

        String vanillaQuery = String.format("SELECT DISTINCT TOP 6 c.text, VectorDistance(c.embedding, [%s]) AS " +
            "score FROM c ORDER BY VectorDistance(c.embedding, [%s])", queryVector, queryVector);
        List<Document> resultDocs = flatIndexContainer.queryItems(vanillaQuery, new CosmosQueryRequestOptions(), Document.class).byPage()
            .flatMap(feedResponse -> Flux.fromIterable(feedResponse.getResults()))
            .collectList().block();
        validateOrdering(6, resultDocs, false);

        // Scale up the throughput for a split
        logger.info("Scaling up throughput for split");
        ThroughputProperties throughputProperties = ThroughputProperties.createManualThroughput(16000);
        ThroughputResponse throughputResponse = flatIndexContainer.replaceThroughput(throughputProperties).block();
        logger.info("Throughput replace request submitted for {} ",
            throughputResponse.getProperties().getManualThroughput());
        throughputResponse = flatIndexContainer.readThroughput().block();

        // Wait for the throughput update to complete so that we get the partition split
        while (true) {
            assert throughputResponse != null;
            if (!throughputResponse.isReplacePending()) {
                break;
            }
            logger.info("Waiting for split to complete");
            Thread.sleep(10 * 1000);
            throughputResponse = flatIndexContainer.readThroughput().block();
        }

        List<PartitionKeyRange> partitionKeyRangesAfterSplit = getPartitionKeyRanges(flatContainerId, asyncDocumentClient);
        assertThat(partitionKeyRangesAfterSplit.size()).isGreaterThan(partitionKeyRanges.size())
            .as("Partition ranges should increase after split");
        logger.info("After split num partitions = {}", partitionKeyRangesAfterSplit.size());

        resultDocs = flatIndexContainer.queryItems(vanillaQuery, new CosmosQueryRequestOptions(), Document.class).byPage()
            .flatMap(feedResponse -> Flux.fromIterable(feedResponse.getResults()))
            .collectList().block();
        validateOrdering(6, resultDocs, false);
    }

    private List<PartitionKeyRange> getPartitionKeyRanges(
        String containerId, AsyncDocumentClient asyncDocumentClient) {
        List<PartitionKeyRange> partitionKeyRanges = new ArrayList<>();
        List<FeedResponse<PartitionKeyRange>> partitionFeedResponseList = asyncDocumentClient
            .readPartitionKeyRanges("/dbs/" + database.getId()
                    + "/colls/" + containerId,
                new CosmosQueryRequestOptions())
            .collectList().block();
        partitionFeedResponseList.forEach(f -> partitionKeyRanges.addAll(f.getResults()));
        return partitionKeyRanges;
    }

    private void validateOrdering(int top, List<Document> docs, boolean isEucledian) {
        assertThat(docs.size()).isEqualTo(top);
        if (isEucledian) {
            for (int i = 0; i < docs.size() - 1; i++) {
                assertThat(docs.get(i).getScore()).isLessThanOrEqualTo(docs.get(i + 1).getScore());
            }
        } else {
            for (int i = 0; i < docs.size() - 1; i++) {
                assertThat(docs.get(i).getScore()).isGreaterThanOrEqualTo(docs.get(i + 1).getScore());
            }
        }
    }

    private CosmosVectorEmbeddingPolicy populateVectorEmbeddingPolicy(Long dimensions) {
        CosmosVectorEmbeddingPolicy policy = new CosmosVectorEmbeddingPolicy();
        CosmosVectorEmbedding embedding = new CosmosVectorEmbedding();
        embedding.setPath("/embedding");
        embedding.setDataType(CosmosVectorDataType.FLOAT32);
        embedding.setDimensions(dimensions);
        embedding.setDistanceFunction(CosmosVectorDistanceFunction.COSINE);
        policy.setCosmosVectorEmbeddings(Collections.singletonList(embedding));
        return policy;
    }

    private IndexingPolicy populateIndexingPolicy(CosmosVectorIndexType vectorIndexType) {
        IndexingPolicy indexingPolicy = new IndexingPolicy();
        indexingPolicy.setIndexingMode(IndexingMode.CONSISTENT);
        IncludedPath includedPath1 = new IncludedPath("/*");
        indexingPolicy.setIncludedPaths(Collections.singletonList(includedPath1));
        CosmosVectorIndexSpec cosmosVectorIndexSpec = new CosmosVectorIndexSpec();
        cosmosVectorIndexSpec.setPath("/embedding");
        cosmosVectorIndexSpec.setType(vectorIndexType.toString());
        indexingPolicy.setVectorIndexes(Collections.singletonList(cosmosVectorIndexSpec));
        return indexingPolicy;
    }

    public List<Document> getVectorDocs() {
        List<Document> docs = new ArrayList<>();
        docs.add(new Document("item0", "1", "Good morning!", new double[]{-0.008334724, -0.05993167, -0.0903545, -0.04791922, -0.01825805, -0.053011455, 0.120733805, 0.017714009, 0.07346743, 0.11559805, 0.03262076, 0.074512, 0.015864266, 0.01981401, 0.007850527, 0.076296456, -0.08539284, 0.016593281, -0.05423011, 0.07520837, 0.074250855, 0.056754466, -0.022098986, 0.03155444, 0.04334927, 0.024655985, -0.02109795, 0.044023883, -0.027550288, -0.11350893, -0.022806242, 0.08608921, 0.009221513, 0.06659074, 0.09087678, 0.024830079, 0.0075513036, 0.036472578, 0.015418151, 0.060497474, 0.010940685, -0.059365865, 0.043566886, 0.00427073, -0.023546139, 0.030357545, -0.03403527, 0.1182965, 0.1115939, -0.018954424, 0.0032452107, 0.10297628, 0.15328929, -0.016952349, -0.04530782, 0.04674409, -8.351895e-05, -0.19376601, -0.025091218, -0.03664667, -0.011860116, -0.10454312, -0.13109237, -0.049268447, 0.17557324, 0.044872586, 0.046787616, 0.15337633, -0.019509347, 0.0077743605, 0.04556896, -0.08413066, -0.028681897, 0.1209079, 0.1357929, -0.09314, 0.12534729, -0.065546185, 0.12212656, 0.04892026, 0.07394619, -0.08134516, -0.004493787, 0.08138869, 0.028573086, 0.12290998, -0.16477945, -0.29839617, -0.08090993, 0.12256179, 0.16591106, -0.08173688, -0.034383457, -0.1076768, -0.043022845, -0.07655759, 0.2021225, 0.03923631, 0.07703635, -0.08587159, 0.06498038, -0.08330371, 0.16486649, -0.14040637, 0.02070624, -0.069855, 0.052880887, 0.016136287, 0.00024294876, -0.19968519, 0.06933272, 0.013241983, 0.0004002109, 0.14998151, 0.07516485, 0.18610589, -0.07895138, -0.108982496, -0.03494926, -0.027637335, -0.032925423, -0.009509855, 0.1182965, -0.075513035, -0.08665501, 0.019629037, 0.2583547, 0.00983084}));
        docs.add(new Document("item1", "2", "Good afternoon!", new double[]{-0.04136167, -0.047741424, -0.08737179, -3.0502639e-05, 0.054595508, -0.11298566, 0.0906921, 0.108052626, 0.04729081, 0.21287979, -0.06588459, -0.052793052, -0.05568647, 0.017384235, -0.02518698, 0.021665072, -0.19238868, 0.03379609, 0.0075359354, -0.04989963, 0.055449303, 0.03282371, 0.026064493, 0.042096883, -0.007192045, 0.0786441, -0.09012291, 0.094012424, -0.0031483725, -0.0318039, -0.034721036, 0.10255038, 0.08851018, 0.11327027, 0.031614166, 0.006035863, 0.021321183, 0.0703433, 0.14201473, 0.058674756, -0.007986549, 0.03329804, 0.08884221, -0.09505595, -0.015522485, -0.068161376, 0.072572656, 0.049235567, 0.2263508, 0.029574543, -0.050563693, 0.050516263, 0.04660303, 0.08376687, 0.017514676, 0.0706279, 0.007921329, -0.1353741, -0.054358345, -0.1628853, -0.097617336, -0.123326086, -0.0489984, -0.0693472, 0.15396787, 0.027368903, 0.06042978, 0.22862759, -0.016293272, 0.033582643, 0.06697555, -0.10302471, -0.12104929, 0.18034068, 0.068303674, 0.003468546, 0.07480201, -0.1204801, 0.06787678, -0.042926963, 0.15785739, -0.034531303, -0.028934196, 0.022933908, -0.012012435, 0.004248228, -0.19172463, -0.31837103, -0.099230066, 0.02071641, 0.18546346, 0.06299117, -0.047053643, -0.09206767, 0.049472734, -0.046365865, 0.18214314, 0.0051079527, 0.105680965, -0.026443958, 0.072714955, -0.08073115, 0.09429702, -0.113744594, 0.02092986, -0.013625161, -0.07390078, 0.020550394, 0.011787128, -0.13499463, 0.015107445, -0.0015223064, 0.040104695, 0.094961084, 0.13404597, 0.082486175, -0.07428025, -0.026847139, -0.025163265, -0.09818654, 0.010043961, 0.013601444, 0.077932596, 0.016056107, -0.026965722, 0.045606934, 0.085047565, -0.005878741}));
        docs.add(new Document("item2", "1", "Great weather today!", new double[]{0.07557184, -0.047335204, -0.054325826, 0.011354052, 0.07698824, -0.025358144, -0.07927276, 0.1510523, 0.022251202, 0.026249107, -0.021725763, 0.062047496, 0.14556946, -0.0006071819, -0.107098185, 0.021394506, -0.13771072, -0.10527057, 0.115048304, -0.048842985, -0.059443146, 0.060585406, -0.014940745, 0.18075103, 0.053777542, -0.022057017, 0.08493836, 0.1198001, 0.041555375, -0.066525154, 0.054280136, 0.107646465, 0.023359193, -0.0046632714, -0.1017981, 0.04105278, 0.11376897, 0.016437104, 0.067393266, 0.0961325, -0.017727856, -0.03333111, -0.020492123, -0.041943744, 0.0031040881, -0.028053876, 0.053640474, -0.02215982, 0.08205987, 0.015100661, -0.17133881, -0.05843796, 0.0895074, -0.04064157, -0.10225501, 0.11367759, -0.03593546, -0.010999952, -0.14273666, -0.010383132, 0.026112035, -0.14200561, -0.0634639, -0.04029889, 0.07383561, 0.116784535, 0.0805064, 0.13241065, -0.100884296, -0.10216363, -0.030384084, -0.07657703, -0.06323545, -0.013101708, 0.15233164, -0.009880538, 0.16448526, -0.11148446, -0.05606206, -0.11587073, 0.084892675, -0.1397211, -0.04948265, 0.006470896, 0.015637523, 0.09051259, -0.12665366, -0.28583884, -0.16046451, 0.055833608, 0.100244634, 0.013535767, -0.07155109, -0.10051877, 0.08662891, -0.0729218, 0.15818, 0.025449526, 0.05053353, -0.015740326, -0.0767141, -0.056381892, 0.091517776, -0.075114936, -0.04621579, -0.040458806, 0.03947646, 0.10901718, 0.0076417113, -0.34487078, 0.024375802, -0.072419204, 0.053000808, 0.04057303, -0.08434439, 0.027185759, 0.03403931, -0.06332683, 0.051858548, 0.011993717, 0.10728095, -0.09887392, 0.07593736, -0.0025172527, 0.1089258, -0.048934367, 0.051264573, 0.017008234}));
        docs.add(new Document("item3", "2", "Hope you're doing well.", new double[]{-0.016385807, 0.16914073, -0.062722616, 0.009645036, 0.06367876, -0.10871283, -0.034588274, 0.0038275379, 0.107661076, 0.069654614, 0.036404934, -0.037910853, 0.08872956, 0.14571536, -0.082227826, 0.034731694, -0.07405285, 0.050340638, -0.16569862, -0.20671692, -0.0834708, 0.0043175584, -0.017234378, 0.052683175, 0.013863994, 0.12142946, -0.002630872, 0.069702424, 0.095804974, -0.10020321, 0.0793116, 0.028970966, 0.13940485, 0.15814514, 0.11597948, -0.03795866, -0.018178564, 0.14753202, -0.10670494, -0.055455975, 0.058037546, -0.04457991, -0.0046014115, -0.018704439, 0.07902476, -0.07902476, 0.031026661, -0.017855868, 0.098769, 0.118847884, -0.051488005, 0.009017572, 0.15068726, 0.044962365, 0.18233542, -0.0006853563, 0.11205931, -0.2602606, 0.09848216, 0.08681728, -0.077638365, -0.008664995, 0.010314333, -0.0361659, 0.047185384, 0.09202823, 0.004359389, -0.008545479, -0.08815587, 0.0765388, 0.012262463, 0.0542608, -0.10813915, 0.11722245, 0.013744476, -0.08265808, 0.008055458, 0.12085578, 0.056364305, -0.12907855, -0.05311344, -0.060666922, 0.117031224, 0.029233903, -0.148775, 0.017879771, -0.081558526, -0.26332027, -0.22029407, -0.07410065, 0.0059340284, -0.11234615, -0.06898532, 0.046516087, 0.06798138, -0.049193274, -0.04687464, -0.049002044, -0.03145692, 0.0065614935, -0.021274058, -0.060188852, -0.04584679, -0.015979448, 0.08949447, -0.050197218, -0.051440194, -0.1341461, 0.08557431, -0.08261028, -0.104314595, -0.016134819, 0.057320442, -0.022421423, 0.012501498, 0.055503782, 0.020568907, -0.095183484, 0.0049450235, -0.03525757, 0.17688543, -0.06888971, -0.005694994, 0.05622088, -0.04250031, 0.050053798, 0.16063109, 0.06353533}));
        docs.add(new Document("item4", "1", "Excuse me please.", new double[]{-0.19188246, 0.018719073, -0.032395326, 0.09734556, 0.021671357, -0.11751684, -0.078514785, 0.16507255, -0.0012956136, 0.117006175, -0.065492816, 0.106282204, -0.009750514, -0.006008296, 0.021799022, 0.04643862, -0.046023704, -0.023442727, 0.12868765, -0.1466886, -0.085089594, -0.046885453, -0.0067742937, 0.048162118, -0.04739612, 0.021687314, -0.025581138, 0.04841745, -0.10519704, -0.039129723, -0.09747323, 0.10532471, 0.04375763, 0.09536674, 0.0145938555, -0.0060681393, 0.26171595, 0.1815415, -0.03833181, 0.012487361, -0.027192924, -0.12281499, 0.017937116, -0.02173519, 0.07308897, -0.06913131, 0.07417413, -0.01884674, 0.049023863, -0.049949445, 0.081068106, 0.22060739, -0.031645287, -0.024735348, -0.041108552, 0.1823075, -0.06230116, -0.119048834, -0.07813178, -0.0841321, -0.007711843, 0.039576557, -0.07589762, 0.028198296, 0.003087929, 0.047970615, 0.0845151, 0.08208944, 0.07423796, 0.01259907, 0.00046179298, 0.024671515, 0.10302671, 0.12160216, 0.1353263, -0.16251922, 0.069195144, -0.09160058, 0.033320908, -0.06341824, -0.06402466, -0.048864283, -0.10053722, -0.019341446, 0.027033342, -0.19354212, -0.011146865, -0.31329313, 0.054513514, -0.0098861605, 0.10277138, 0.059237167, 0.021495815, -0.0704718, 0.14285861, 0.042672466, 0.057769008, 0.054353934, -0.041363884, 0.07819562, 0.1085802, -0.0047874865, 0.0035626881, 0.025405597, 0.0032953867, 0.13430496, -0.084451266, -0.10883553, 0.115601845, -0.072259136, -0.06976964, -0.1081972, 0.08515343, 0.044715125, 0.05725834, -0.06759931, -0.0421618, -0.06185433, -0.068939805, -0.13673063, -0.032874074, -0.121538326, -0.010157451, -0.048608948, 0.049949445, 0.031310163, 0.13238996, 0.06855681}));
        docs.add(new Document("item5", "2", "Is this the right place?", new double[]{-0.05695127, 0.07729321, -0.07253956, 0.054049686, -0.084886715, -0.1677979, -0.020681491, -0.010765179, -0.05312365, 0.10964277, -0.1724898, -0.0139754405, -0.019446775, -0.009877727, 0.10902541, 0.06599557, -0.20224646, -0.008658445, -0.11698933, -0.00034678154, 0.059760246, 0.023660243, 0.014523345, 0.058340326, -0.116927594, -0.0011546522, 0.035991967, 0.017857078, -0.21261807, -0.07568809, -0.007250097, 0.09525833, 0.073033445, -0.078157514, -0.14816591, -0.089578636, -0.006030815, 0.08519539, 0.059852853, 0.12328638, 0.08544234, -0.017656436, -0.03901702, 0.036238912, -0.09482618, 0.007215371, 0.15742627, 0.014183799, 0.107914165, 0.014245534, -0.011907292, 0.025188204, 0.057630364, -0.057321683, 0.0024366346, 0.034695517, 0.11766842, -0.16520499, 0.065193, 0.10822285, -0.06834152, -0.048925616, -0.078836605, 0.05161112, 0.07235435, 0.07636718, -0.075996764, 0.13902901, 0.023860885, 0.07846619, 0.02665443, -0.026870504, -0.0084115015, 0.07550287, 0.07500899, -0.07395948, 0.05062335, 0.05621044, -0.031531557, -0.001280053, 0.06908235, 0.078280985, -0.060068928, 0.14236274, 0.14236274, 0.06358787, -0.042474225, -0.38053942, 0.062785305, 0.050870296, 0.038677476, -0.078157514, 0.029309068, -0.07809578, 0.07439163, -0.06772417, 0.11896487, 0.073589064, 0.05238282, 0.018196626, 0.116371974, 0.0033067234, -0.020264775, -0.006304768, -0.10686466, 0.08408415, -0.04386328, -0.0068681072, 0.08994905, -0.059513304, 0.021823604, 0.049419504, -0.012817894, -0.093221046, 0.02802805, 0.089578636, 0.07124311, -0.26694557, 0.024833223, -0.03802925, -0.18483697, -0.1103836, 0.11877967, 0.07000839, -0.018860284, -0.044974525, -0.034016423, 0.022780508}));
        docs.add(new Document("item6", "1", "Awful weather today.", new double[]{0.002305239, -0.02629875, 0.009952777, 0.026884208, -0.0067561795, -0.1118458, 0.07432968, 0.0999493, 0.02177902, -0.047726493, 0.042059265, 0.1583077, 0.11175212, 0.07685886, -0.14060347, 0.005084698, -0.19277944, -0.05606341, 0.082619764, -0.04241054, 0.09620237, 0.011832096, -0.023301208, 0.28214368, 0.02451896, 0.02793803, 0.03358184, 0.044424515, 0.11006601, 0.038101573, 0.0077982936, 0.045572013, 0.075922124, 0.016369391, -0.0039986745, 0.22781321, 0.062854715, 0.048054352, 0.010251361, 0.07170683, -0.018816603, 0.027329156, -0.08482108, -0.079481706, 0.042785235, 0.024120849, 0.17413847, 0.035431888, 0.12439801, 0.10641275, -0.14828467, -0.024425287, 0.083415985, 0.1184966, 0.0026799317, 0.15399873, -0.010304051, 0.009742012, -0.10781785, -0.019472316, 0.061777476, -0.09798217, 0.028804509, -0.023371464, 0.015491205, 0.07521958, 0.024003757, 0.013465522, -0.089692086, -0.097794816, 0.021193562, -0.0592483, -0.056438103, -0.10987866, 0.11802823, -0.06440032, 0.07704621, -0.040138967, -0.13891736, -0.16027485, 0.08631986, -0.16786237, -0.085757814, 0.015491205, -0.013243048, 0.09133137, -0.16196096, -0.2313728, -0.083134964, 0.12308659, 0.07559427, 0.09723278, 0.048663225, -0.13339064, 0.016345974, -0.13189186, 0.11025336, 0.03346475, -0.00688498, -0.059435643, 0.0056877197, 0.014999421, 0.063650936, -0.15053283, -0.017481761, 0.05194179, 0.061402783, 0.0077924393, 0.19971126, -0.07713988, 0.06425981, 0.0021369199, 0.12158781, -0.024331613, -0.008571098, 0.03264511, -0.0020242194, -0.05507984, -0.00805004, -0.03304322, 0.050630365, -0.1475353, -0.003735219, -0.0202217, 0.16271034, -0.059435643, 0.06023187, 0.06660164}));
        docs.add(new Document("item7", "2", "Dinosaurs were huge.", new double[]{0.09842033, -0.025395654, -0.03831241, 0.037825905, 0.17008278, -0.022269849, -0.05935383, 0.032668933, -0.022148222, 0.08178179, -0.062710725, 0.164342, -0.024021273, -0.052640036, 0.027366007, 0.18098053, -0.18487258, -0.008903074, 0.16346629, 0.009407825, 0.110339746, -0.046315446, 0.08046822, 0.12512955, -0.06635953, 0.0070239417, 0.055753678, -0.0005336371, -0.012326866, 0.1578228, -0.023668556, -0.035904203, 0.05988899, -0.08032227, -0.11520481, 0.08499274, 0.05093726, -0.09248494, -0.011128843, -0.07064079, 0.01466818, 0.082073696, -0.040574666, -0.07292737, 0.03539337, 0.05025615, -0.1145237, 0.09584184, 0.04186391, -0.034833886, -0.18234275, -0.090441614, -0.09194978, -0.031331036, -0.13106494, 0.068208255, 0.03220675, -0.031233737, -0.04337208, 0.1289243, 0.1363192, 0.052494083, 0.03074723, -0.000113359885, 0.07681943, 0.03962598, 0.016529068, -0.04191256, -0.03612313, 0.023084749, 0.10917213, 0.09477153, -0.09652295, -0.0999285, 0.11685894, -0.012649177, 0.043688312, -0.10333405, -0.060521446, -0.042034186, 0.0483831, 0.0028141378, -0.17270991, 0.05424551, 0.25570798, 0.09511208, -0.08504139, -0.1570444, -0.084262975, -0.13291366, -0.023741532, -0.14857918, 0.09190113, -0.08041958, -0.019837314, 0.09569589, -0.053029243, -0.030722905, -0.05239678, -0.15091442, -0.05872137, -0.056045584, 0.11831845, -0.1145237, -0.08761988, -0.0035727844, -0.05570503, 0.19285129, 0.011761302, 0.087717175, 0.107712604, -0.11277228, -0.042423394, 0.13048112, -0.03356897, 0.056775343, 0.08640361, -0.11831845, -0.10868562, 0.0410855, 0.12036178, -0.09477153, -0.017611546, 0.0075043673, -0.12668636, -0.006391483, 0.0012185475, -0.05161837}));
        docs.add(new Document("item8", "1", "The hero saves the day again.", new double[]{0.11208976, 0.058739875, -0.017022463, 0.15080968, -0.0031057745, -0.048069898, -0.059069872, 0.09861479, 0.11626975, 0.12935972, 0.008882481, 0.08766981, -0.00940498, -0.077164836, 0.0015795279, 0.06297486, -0.06313986, 0.0931698, -0.17247963, -0.12077974, -0.044797402, -0.1404697, -0.050077394, 0.020432455, 0.07897983, 0.022632452, -0.046914898, 0.0031212433, -0.059399873, 0.03321993, -0.07237984, 0.10119978, 0.19612958, -0.086349815, 0.038252417, 0.084094815, 0.16257966, 0.15520966, 0.063304864, -0.08761481, 0.06132487, -0.08486482, -0.09789979, 0.06935485, -0.04160741, 0.05585238, -0.13485971, 0.105544776, -0.08084983, 0.103344776, 0.053817384, -0.0923998, -0.052607387, 0.015537467, 0.025299946, -0.05961987, 0.08090483, -0.25453946, 0.01894746, -0.026344944, -0.14552969, 0.014341219, 0.14409968, 0.12264974, -0.0456224, -0.13529971, -0.0466674, 0.006166862, 0.02776119, -0.020184956, 0.093939796, 0.054779883, -0.09635979, -0.016334964, -0.029177437, -0.06863985, 0.19139959, -0.08794481, -0.08464482, -0.013413096, 0.022109952, -0.122099735, -0.0458149, -0.019676207, 0.10785477, -0.109119765, -0.09690979, -0.28423938, 0.050709892, 0.12803972, 0.10620477, 0.12110974, -0.006658423, -0.052304886, -0.07798983, -0.035667423, -0.07507484, 0.02745869, 0.07237984, -0.0230862, -0.03684992, -0.067539856, -0.052387387, -0.05202989, 0.14244969, 0.080684826, -0.038472418, 0.112639755, 0.03242243, -0.07501984, 0.10631477, -0.024076197, -0.07754983, 0.06610986, -0.12671973, -0.044082403, 0.006001862, 0.037454918, 0.054504883, -0.03679492, 0.076669835, 0.02271495, 0.14794968, 0.06440486, -0.006850923, -0.06984985, 0.035639923, -0.009143731}));
        docs.add(new Document("item9", "2", "Don't worry about it.", new double[]{-0.051598575, 0.22204931, -0.017881807, 0.11678282, 0.18426134, -0.03713568, -0.016847137, 0.06549915, 0.057626653, 0.032569632, 0.00076827104, -0.04489571, -0.07530603, 0.10778569, 0.030477798, 0.050338972, -0.21053298, -0.04341118, -0.097708896, -0.13432723, 0.1438642, 0.059606023, -0.12299085, -0.036820777, -0.026699001, 0.18381149, -0.02861089, 0.08259371, -0.14962237, -0.07373153, 0.02321261, 0.085607745, -0.13810603, 0.065139264, -0.12685962, 0.14098512, 0.17112552, -0.035921063, -0.008536032, -0.09680918, 0.04435588, -0.16086878, -0.035718627, 0.09689915, -0.0007956842, 0.034256592, -0.00234769, 0.04577293, 0.06725359, 0.015958669, -0.06486935, 0.124160476, 0.09887852, -0.050518915, -0.07080746, -0.078859895, 0.17013584, -0.22078972, -0.10103783, 0.06873812, 0.0370682, 0.04563797, -0.060235824, -0.056816913, -0.064689405, 0.11273411, 0.16572724, 0.108415484, 0.07921978, 0.05569227, -0.11210431, -0.05848138, -0.008361713, 0.07458626, -0.08992637, -0.07557594, -0.0020102975, -0.07080746, -0.0092614265, 0.06626391, -0.05848138, -0.078545, 0.08362838, -0.031737395, -0.047549862, -0.15367107, 0.093930095, -0.087182246, 0.06401462, 0.09006133, 0.10886534, 0.013338254, 0.025551865, -0.027553728, 0.14206477, -0.09060115, -0.07818511, -0.001209693, 0.017893054, -0.069367915, 0.0709874, 0.050249003, -0.13396735, -0.056681953, -0.022166694, -0.02170559, 0.08277365, -0.101667635, 0.09096104, 0.049529232, -0.095819496, -0.08974643, 0.054477658, -0.037967913, -0.08682236, 0.077690266, 0.03828281, -0.04136433, -0.14431405, -0.060505737, 0.025619343, -0.019400073, 0.11075474, 0.066893704, 0.07494614, 0.03684327, 0.03929499, -0.017353225}));
        return docs;
    }

    public String getQueryVector() {
        return "0.13481648, 0.022579897, -0.038054377, 0.035029914, 0.15404047, -0.012947189, 0.013434003, 0.0328755,0.0859279, 0.090071, 0.07391291, 0.10896354, 0.04085097, 0.019876525, 0.013806882, 0.03799223,-0.097528584, -0.10324606, -0.07863604, -0.01846787, -0.0018139011, 0.09686569, 0.0065512774,0.014107257, 0.0004389097, 0.07432722, 0.012698603, 0.09404838, 0.11592395, -0.08290344, -0.023802113,0.0771031, 0.15578057, 0.17152436, 0.06732538, 0.04408259, 0.04163816, 0.03196402, 0.08451925,0.05365315, -0.10473758, 0.054730356, -0.0686926, 0.12412729, 0.1910798, -0.048971448, -0.007649199,-0.059122045, -0.005241022, 0.021440545, -0.1014231, 0.08282058, -0.057671957, -0.024755025, -0.07619162,0.0966171, 0.047272775, -0.20384054, -0.024319999, -0.014739079, 0.03681145, -0.03331053, 0.09172824,-0.09744572, 0.08584504, 0.13440217, -0.019234344, 0.19605151, 0.030389642, -0.0646738, 0.08447782,-0.107969195, -0.19058262, -0.05369458, 0.071675636, -0.095871344, 0.030141056, 0.025107188, 0.06309942,-0.09951727, 0.031446133, -0.07888463, -0.08182623, -0.063762315, -0.0955399, -0.03948375, -0.031073254,-0.29979473, -0.06711823, 0.07743455, 0.0074161496, 0.01248109, -0.0812462, -0.0676154, 3.0668652e-05,-0.17931339, 0.2008575, 0.026950868, 0.11111795, 0.07507298, -0.00898017, 0.038800135, -0.015267325,-0.13788238, -0.010740988, -0.00870569, -0.037743647, -0.12445874, 0.014676933, -0.27344462, -0.05738194,0.07101274, -0.023615673, 0.0040369336, -0.039028008, 0.06546099, -0.072421394, -0.17119291,-0.019358637, -0.05489608, 0.006199114, 0.0515816, 0.050048653, -0.034843475, 0.07847032, -0.13315925,0.025335059, -0.0432954";
    }

    static class Document {
        @JsonProperty("id")
        String id;
        @JsonProperty("pk")
        String pk;
        @JsonProperty("text")
        String text;
        @JsonProperty("embedding")
        double[] embedding;
        @JsonProperty("score")
        double score;

        public Document(String id, String pk, String text, double[] embedding) {
            this.id = id;
            this.pk = pk;
            this.text = text;
            this.embedding = embedding;
        }

        public Document() {
        }

        public String getId() {
            return id;
        }

        public double getScore() {
            return score;
        }
    }

}
