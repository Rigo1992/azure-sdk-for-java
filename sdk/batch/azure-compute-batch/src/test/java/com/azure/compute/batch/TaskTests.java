package com.azure.compute.batch;

import com.azure.core.credential.AzureNamedKeyCredential;
import com.azure.compute.batch.models.*;
import com.azure.compute.batch.models.BatchClientParallelOptions;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Configuration;
import com.azure.storage.blob.BlobContainerClient;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import com.azure.core.test.TestMode;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TaskTests extends BatchServiceClientTestBase {
	private static String livePoolId;
    private static String liveIaasPoolId;

	@Override
    protected void beforeTest() {
	   	super.beforeTest();
	   	livePoolId = getStringIdWithUserNamePrefix("-testpool");
        liveIaasPoolId = getStringIdWithUserNamePrefix("-testIaaSpool");
	    if(getTestMode() == TestMode.RECORD) {
            try {
                createIfNotExistIaaSPool(livePoolId);
                createIfNotExistIaaSPool(liveIaasPoolId);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
       }
   }

    /*
     * Test TypeSpec Shared model among GET-PUT Roundtrip operation
     * */
   @Test
    public void testTaskUnifiedModel() throws Exception {
       String taskId = "task-canPut";
       String jobId = getStringIdWithUserNamePrefix("-SampleJob");
       try {
        //CREATE JOB
        PoolInformation poolInfo = new PoolInformation();
        poolInfo.setPoolId(livePoolId);
        BatchJobCreateOptions jobCreateOptions = new BatchJobCreateOptions(jobId, poolInfo);
        batchClient.createJob(jobCreateOptions);

        //CREATE TASK
        BatchTaskCreateOptions taskCreateOptions = new BatchTaskCreateOptions(taskId, "echo hello world");
        batchClient.createTask(jobId, taskCreateOptions);

        // GET
        BatchTask task = batchClient.getTask(jobId, taskId);

        //UPDATE
        Integer maxRetrycount = 5;
        Duration retentionPeriod = Duration.ofDays(5);
        task.setConstraints(new TaskConstraints().setMaxTaskRetryCount(maxRetrycount).setRetentionTime(retentionPeriod));
        batchClient.replaceTask(jobId, taskId, task);

        //GET After UPDATE
        task = batchClient.getTask(jobId, taskId);
        Assertions.assertEquals(maxRetrycount, task.getConstraints().getMaxTaskRetryCount());
        Assertions.assertEquals(retentionPeriod, task.getConstraints().getRetentionTime());
        }
        finally {
            batchClient.deleteTask(jobId, taskId);
            batchClient.deleteJob(jobId);
        }
    }

	@Test
    public void testJobUser() throws Exception {
        String jobId = getStringIdWithUserNamePrefix("-testJobUser");
        String taskId = "mytask";

        PoolInformation poolInfo = new PoolInformation();
        poolInfo.setPoolId(livePoolId);
        BatchJobCreateOptions jobCreateOptions = new BatchJobCreateOptions(jobId, poolInfo);

        batchClient.createJob(jobCreateOptions);

        try {
            // CREATE
            List<ApplicationPackageReference> apps = new ArrayList<>();
            apps.add(new ApplicationPackageReference("MSMPI"));
            BatchTaskCreateOptions taskCreateOptions = new BatchTaskCreateOptions(taskId, "cmd /c echo hello\"")
                     .setUserIdentity(new UserIdentity().setUsername("test-user"))
            		 .setApplicationPackageReferences(apps);

            batchClient.createTask(jobId, taskCreateOptions);

            // GET
            BatchTask task = batchClient.getTask(jobId, taskId);
            Assertions.assertNotNull(task);
            Assertions.assertEquals(taskId, task.getId());
            Assertions.assertEquals("test-user", task.getUserIdentity().getUsername());

            //Recording file automatically sanitizes Application Id - Only verify App Id in Record Mode
            if (getTestMode() == TestMode.RECORD) {
                Assertions.assertEquals("msmpi", task.getApplicationPackageReferences().get(0).getApplicationId());
            }


        } finally {
            try {
                batchClient.deleteJob(jobId);
            } catch (Exception e) {
                // Ignore here
            }
        }
    }

	@Test
    public void canCRUDTest() throws Exception {
        int TASK_COMPLETE_TIMEOUT_IN_SECONDS = 60; // 60 seconds timeout
        String STANDARD_CONSOLE_OUTPUT_FILENAME = "stdout.txt";
        String BLOB_FILE_NAME = "test.txt";
        String taskId = "mytask";
        File temp = File.createTempFile("tempFile", ".tmp");
        BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
        bw.write("This is an example");
        bw.close();
        temp.deleteOnExit();
        String jobId = getStringIdWithUserNamePrefix("-canCRUDTest");

        PoolInformation poolInfo = new PoolInformation();
        poolInfo.setPoolId(liveIaasPoolId);
        batchClient.createJob(new BatchJobCreateOptions(jobId, poolInfo));

        String storageAccountName = Configuration.getGlobalConfiguration().get("STORAGE_ACCOUNT_NAME");
        String storageAccountKey = Configuration.getGlobalConfiguration().get("STORAGE_ACCOUNT_KEY");
        BlobContainerClient container = null;

        try {
            String sas = "";

            //The Storage operations run only in Record mode.
            // Playback mode is configured to test Batch operations only.
            if (getTestMode() != TestMode.PLAYBACK) {
                // Create storage container
                container = createBlobContainer(storageAccountName, storageAccountKey, "testingtaskcreate");
                sas = uploadFileToCloud(container, BLOB_FILE_NAME, temp.getAbsolutePath());
            }
            else {
                sas = REDACTED;
            }

            // Associate resource file with task
            ResourceFile file = new ResourceFile();
            file.setFilePath(BLOB_FILE_NAME);
            file.setHttpUrl(sas);
            List<ResourceFile> files = new ArrayList<>();
            files.add(file);

            // CREATE
            BatchTaskCreateOptions taskCreateOptions = new BatchTaskCreateOptions(taskId, String.format("/bin/bash -c 'set -e; set -o pipefail; cat %s'", BLOB_FILE_NAME)).setResourceFiles(files);
            batchClient.createTask(jobId, taskCreateOptions);

            // GET
            BatchTask task = batchClient.getTask(jobId, taskId);
            Assertions.assertNotNull(task);
            Assertions.assertEquals(taskId, task.getId());

            // Verify default retention time
            Assertions.assertEquals(Duration.ofDays(7), task.getConstraints().getRetentionTime());

            // TODO UPDATE - modifying taskToAdd vs creating new BatchTask instance
            task.setConstraints(new TaskConstraints().setMaxTaskRetryCount(5));
            batchClient.replaceTask(jobId, taskId, task);

            task = batchClient.getTask(jobId, taskId);
            Assertions.assertEquals((Integer) 5, task.getConstraints().getMaxTaskRetryCount());

            // LIST
            PagedIterable<BatchTask> tasks = batchClient.listTasks(jobId);
            Assertions.assertNotNull(tasks);

            boolean found = false;
            for (BatchTask t : tasks) {
                if (t.getId().equals(taskId)) {
                    found = true;
                    break;
                }
            }

            Assertions.assertTrue(found);

            if (waitForTasksToComplete(batchClient, jobId, TASK_COMPLETE_TIMEOUT_IN_SECONDS)) {
                // Get the task command output file
                task = batchClient.getTask(jobId, taskId);

                BinaryData binaryData = batchClient.getTaskFile(jobId, taskId, STANDARD_CONSOLE_OUTPUT_FILENAME);

                String fileContent = new String(binaryData.toBytes(), StandardCharsets.UTF_8);
                Assertions.assertEquals("This is an example", fileContent);

                String outputSas = "";

                //The Storage operations run only in Record mode.
                // Playback mode is configured to test Batch operations only.
                if (getTestMode() != TestMode.PLAYBACK) {
                    outputSas = generateContainerSasToken(container);
                }
                else {
                    outputSas = REDACTED;
                }
                // UPLOAD LOG
                UploadBatchServiceLogsOptions logsOptions = new UploadBatchServiceLogsOptions(outputSas, OffsetDateTime.now().minusMinutes(-10));
                UploadBatchServiceLogsResult uploadBatchServiceLogsResult = batchClient.uploadNodeLogs(liveIaasPoolId, task.getNodeInfo().getNodeId(), logsOptions);

                Assertions.assertNotNull(uploadBatchServiceLogsResult);
                Assertions.assertTrue(uploadBatchServiceLogsResult.getNumberOfFilesUploaded() > 0);
                Assertions.assertTrue(uploadBatchServiceLogsResult.getVirtualDirectoryName().toLowerCase().contains(liveIaasPoolId.toLowerCase()));
            }

            // DELETE
            batchClient.deleteTask(jobId, taskId);
            try {
                batchClient.getTask(jobId, taskId);
                Assertions.assertTrue(true, "Shouldn't be here, the job should be deleted");
            }   //TODO Integrate BatchErrorException
            catch (Exception e) {
                if (!e.getMessage().contains("Status code 404")) {
                    throw e;
                }
                }
            }
        catch (Exception e) {
            throw e;
        }
        finally {
                try {
                    batchClient.deleteJob(jobId);
                    container.deleteIfExists();
                    batchClient.deletePool(liveIaasPoolId);
                } catch (Exception e) {
                    // Ignore here
                }
            }
    }

    @Test
    public void testAddMultiTasks() throws Exception {
        String jobId = getStringIdWithUserNamePrefix("-testAddMultiTasks");

        PoolInformation poolInfo = new PoolInformation();
        poolInfo.setPoolId(livePoolId);
        batchClient.createJob(new BatchJobCreateOptions(jobId, poolInfo));

        int TASK_COUNT=1000;

        try {
            // CREATE
            List<BatchTaskCreateOptions> tasksToAdd = new ArrayList<>();
            for (int i=0; i<TASK_COUNT; i++)
            {
                BatchTaskCreateOptions addOption = new BatchTaskCreateOptions(String.format("mytask%d", i), String.format("cmd /c echo hello %d",i));
                tasksToAdd.add(addOption);
            }
            BatchClientParallelOptions option = new BatchClientParallelOptions(10);
            batchClient.createTasks(jobId, tasksToAdd, option);

            // LIST
            PagedIterable<BatchTask> tasks = batchClient.listTasks(jobId);
            Assert.assertNotNull(tasks);
            int taskListCount = 0;
            for (BatchTask task: tasks) {
                ++taskListCount;
            }
            Assert.assertTrue(taskListCount == TASK_COUNT);
        } finally {
            try {
                batchClient.deleteJob(jobId);
            } catch (Exception e) {
                // Ignore here
            }
        }
    }

    @Test
    public void testAddMultiTasksWithError() throws Exception {
        String accessKey = Configuration.getGlobalConfiguration().get("AZURE_BATCH_ACCESS_KEY");
        accessKey = (accessKey == null || accessKey.length() == 0) ? "RANDOM_KEY" : accessKey;

        AzureNamedKeyCredential noExistCredentials1 = new AzureNamedKeyCredential(
                "noexistaccount", accessKey
        );
        batchClientBuilder.credential(noExistCredentials1);

        String jobId = getStringIdWithUserNamePrefix("-testAddMultiTasksWithError");
        int TASK_COUNT=1000;

        try {
            // CREATE
            List<BatchTaskCreateOptions> tasksToAdd = new ArrayList<>();
            for (int i=0; i<TASK_COUNT; i++)
            {
                BatchTaskCreateOptions addOption = new BatchTaskCreateOptions(String.format("mytask%d", i), String.format("cmd /c echo hello %d",i));
                tasksToAdd.add(addOption);
            }
            BatchClientParallelOptions option = new BatchClientParallelOptions(10);
            batchClient.createTasks(jobId, tasksToAdd, option);
            // batchClient.createTaskCollection(jobId, new BatchTaskCollection(tasksToAdd));
            Assert.assertTrue("Should not here", true);
        } catch (RuntimeException ex) {
            System.out.printf("Expect exception %s", ex.toString());
        }
    }

    @Test
    public void failIfPoisonTaskTooLarge() throws Exception {
        //This test will temporarily only run in Live/Record mode. It runs fine in Playback mode too on Mac and Windows machines.
        // Linux machines are causing issues. This issue is under investigation.
        Assume.assumeFalse("This Test only runs in Live/Record mode", getTestMode() == TestMode.PLAYBACK);

        String jobId = getStringIdWithUserNamePrefix("-failIfPoisonTaskTooLarge");
        String taskId = "mytask";

        PoolInformation poolInfo = new PoolInformation();
        poolInfo.setPoolId(liveIaasPoolId);
        batchClient.createJob(new BatchJobCreateOptions(jobId, poolInfo));

        List<BatchTaskCreateOptions> tasksToAdd = new ArrayList<BatchTaskCreateOptions>();
        BatchTaskCreateOptions taskToAdd = new BatchTaskCreateOptions(taskId, "sleep 1");
        List<ResourceFile> resourceFiles = new ArrayList<ResourceFile>();
        ResourceFile resourceFile;

        // If this test fails try increasing the size of the Task in case maximum size increase
        for(int i = 0; i < 10000; i++) {
            resourceFile = new ResourceFile().setHttpUrl("https://mystorageaccount.blob.core.windows.net/files/resourceFile"+i).setFilePath("resourceFile"+i);
            resourceFiles.add(resourceFile);
        }
        taskToAdd.setResourceFiles(resourceFiles);
        tasksToAdd.add(taskToAdd);

        try
        {
            batchClient.createTasks(jobId, tasksToAdd);
            try {
                batchClient.deleteJob(jobId);
            } catch (Exception e) {
                // Ignore here
            }
            Assert.fail("Expected RequestBodyTooLarge error");
        }
        catch (HttpResponseException err) {
            try {
                batchClient.deleteJob(jobId);
            } catch (Exception e) {
                // Ignore here
            }
            Assert.assertEquals(err.getResponse().getStatusCode(), 413);
        }
        catch (Exception err) {
            try {
                batchClient.deleteJob(jobId);
            } catch (Exception e) {
                // Ignore here
            }
            Assert.fail("Expected RequestBodyTooLarge error");
        }
    }

    @Test
    public void succeedWithRetry() throws Exception {
        //This test does not run in Playback mode. It only runs in Record/Live mode.
        // This test uses multi threading. Playing back the test doesn't match its recorded sequence always.
        // Hence Playback of this test is disabled.
        Assume.assumeFalse("This Test only runs in Live/Record mode", getTestMode() == TestMode.PLAYBACK);

        String jobId = getStringIdWithUserNamePrefix("-succeedWithRetry");
        String taskId = "mytask";

        PoolInformation poolInfo = new PoolInformation();
        poolInfo.setPoolId(liveIaasPoolId);
        batchClient.createJob(new BatchJobCreateOptions(jobId, poolInfo));

        List<BatchTaskCreateOptions> tasksToAdd = new ArrayList<BatchTaskCreateOptions>();
        BatchTaskCreateOptions taskToAdd;
        List<ResourceFile> resourceFiles = new ArrayList<ResourceFile>();
        ResourceFile resourceFile;

        BatchClientParallelOptions option = new BatchClientParallelOptions(10);

        // Num Resource Files * Max Chunk Size should be greater than or equal to the limit which triggers the PoisonTask test to ensure we encounter the error in the initial chunk.
        for(int i = 0; i < 100; i++) {
            resourceFile = new ResourceFile().setHttpUrl("https://mystorageaccount.blob.core.windows.net/files/resourceFile"+i).setFilePath("resourceFile" + i);
            resourceFiles.add(resourceFile);
        }
        // Num tasks to add
        for(int i = 0; i < 1500; i++) {
            taskToAdd = new BatchTaskCreateOptions(taskId + i, "sleep 1");
            taskToAdd.setResourceFiles(resourceFiles);
            tasksToAdd.add(taskToAdd);
        }

        try
        {
            batchClient.createTasks(jobId, tasksToAdd, option);
            try {
                batchClient.deleteJob(jobId);
            } catch (Exception e) {
                // Ignore here
            }
        }
        catch (Exception err) {
            try {
                batchClient.deleteJob(jobId);
            } catch (Exception e) {
                // Ignore here
            }
            Assert.fail("Expected Success");
        }
    }

    @Test
    public void testGetTaskCounts() throws Exception {
        String jobId = getStringIdWithUserNamePrefix("-testGetTaskCounts");

        PoolInformation poolInfo = new PoolInformation();
        poolInfo.setPoolId(livePoolId);
        batchClient.createJob(new BatchJobCreateOptions(jobId, poolInfo));

        int TASK_COUNT=1000;

        try {
            // Test Job count
            TaskCountsResult countResult = batchClient.getJobTaskCounts(jobId);

            TaskCounts counts = countResult.getTaskCounts();
            int all = counts.getActive() + counts.getCompleted() + counts.getRunning();
            Assert.assertEquals(0, all);

            TaskSlotCounts slotCounts = countResult.getTaskSlotCounts();
            int allSlots = slotCounts.getActive() + slotCounts.getCompleted() + slotCounts.getRunning();
            Assert.assertEquals(0, allSlots);

            // CREATE
            List<BatchTaskCreateOptions> tasksToAdd = new ArrayList<>();
            for (int i=0; i<TASK_COUNT; i++)
            {
                BatchTaskCreateOptions addOption = new BatchTaskCreateOptions(String.format("mytask%d", i), String.format("cmd /c echo hello %d",i));
                tasksToAdd.add(addOption);
            }
            BatchClientParallelOptions option = new BatchClientParallelOptions(10);
            batchClient.createTasks(jobId, tasksToAdd, option);

            //The Waiting period is only needed in record mode.
            threadSleepInRecordMode(30 * 1000);

            // Test Job count
            countResult = batchClient.getJobTaskCounts(jobId);
            counts = countResult.getTaskCounts();
            all = counts.getActive() + counts.getCompleted() + counts.getRunning();
            Assert.assertEquals(TASK_COUNT, all);

            slotCounts = countResult.getTaskSlotCounts();
            allSlots = slotCounts.getActive() + slotCounts.getCompleted() + slotCounts.getRunning();
            // One slot per task
            Assert.assertEquals(TASK_COUNT, allSlots);
        } finally {
            try {
                batchClient.deleteJob(jobId);
            } catch (Exception e) {
                // Ignore here
            }
        }
    }

    @Test
    public void testOutputFiles() throws Exception {
        int TASK_COMPLETE_TIMEOUT_IN_SECONDS = 60; // 60 seconds timeout
        String jobId = getStringIdWithUserNamePrefix("-testOutputFiles");
        String taskId = "mytask";
        String badTaskId = "mytask1";
        String storageAccountName = System.getenv("STORAGE_ACCOUNT_NAME");
        String storageAccountKey = System.getenv("STORAGE_ACCOUNT_KEY");

        PoolInformation poolInfo = new PoolInformation();
        poolInfo.setPoolId(liveIaasPoolId);
        batchClient.createJob(new BatchJobCreateOptions(jobId, poolInfo));
        BlobContainerClient containerClient = null;
        String containerUrl = "";

        //The Storage operations run only in Record mode.
        // Playback mode is configured to test Batch operations only.
        if(getTestMode() == TestMode.RECORD) {
            containerClient = createBlobContainer(storageAccountName, storageAccountKey, "output");
            containerUrl = generateContainerSasToken(containerClient);
        }

        try {
            // CREATE
            List<OutputFile> outputs = new ArrayList<>();
            OutputFileBlobContainerDestination fileBlobContainerDestination = new OutputFileBlobContainerDestination(containerUrl);
            fileBlobContainerDestination.setPath("taskLogs/output.txt");

            OutputFileDestination fileDestination = new OutputFileDestination();
            fileDestination.setContainer(fileBlobContainerDestination);

            outputs.add(new OutputFile("../stdout.txt", fileDestination, new OutputFileUploadOptions(OutputFileUploadCondition.TASK_COMPLETION)));

            OutputFileBlobContainerDestination fileBlobErrContainerDestination = new OutputFileBlobContainerDestination(containerUrl);
            fileBlobErrContainerDestination.setPath("taskLogs/err.txt");

            outputs.add(new OutputFile("../stderr.txt", new OutputFileDestination().setContainer(fileBlobErrContainerDestination), new OutputFileUploadOptions(OutputFileUploadCondition.TASK_FAILURE)));

            BatchTaskCreateOptions taskToCreate = new BatchTaskCreateOptions(taskId, "bash -c \"echo hello\"");
            taskToCreate.setOutputFiles(outputs);

            batchClient.createTask(jobId, taskToCreate);

            if (waitForTasksToComplete(batchClient, jobId, TASK_COMPLETE_TIMEOUT_IN_SECONDS)) {
                BatchTask task = batchClient.getTask(jobId, taskId);
                Assert.assertNotNull(task);
                Assert.assertEquals(TaskExecutionResult.SUCCESS, task.getExecutionInfo().getResult());
                Assert.assertNull(task.getExecutionInfo().getFailureInfo());

                if(getTestMode() == TestMode.RECORD) {
                    // Get the task command output file
                    String result = getContentFromContainer(containerClient, "taskLogs/output.txt");
                    Assert.assertEquals("hello\n", result);
                }
            }

            taskToCreate = new BatchTaskCreateOptions(badTaskId, "bash -c \"bad command\"")
                    .setOutputFiles(outputs);

            batchClient.createTask(jobId, taskToCreate);

            if (waitForTasksToComplete(batchClient, jobId, TASK_COMPLETE_TIMEOUT_IN_SECONDS)) {
                BatchTask task = batchClient.getTask(jobId, badTaskId);
                Assert.assertNotNull(task);
                Assert.assertEquals(TaskExecutionResult.FAILURE, task.getExecutionInfo().getResult());
                Assert.assertNotNull(task.getExecutionInfo().getFailureInfo());
                Assert.assertEquals(ErrorCategory.USER_ERROR.toString().toLowerCase(), task.getExecutionInfo().getFailureInfo().getCategory().toString().toLowerCase());
                Assert.assertEquals("FailureExitCode", task.getExecutionInfo().getFailureInfo().getCode());

                //The Storage operations run only in Record mode.
                // Playback mode is configured to test Batch operations only.
                if(getTestMode() == TestMode.RECORD) {
                    // Get the task command output file
                    String result = getContentFromContainer(containerClient, "taskLogs/err.txt");
                    Assert.assertEquals("bash: bad: command not found\n", result);
                }
            }

        } finally {
            try {
                if (getTestMode() == TestMode.RECORD) {
                    containerClient.delete();
                }
                batchClient.deleteJob(jobId);
            } catch (Exception e) {
                // Ignore here
            }
        }
    }

}
