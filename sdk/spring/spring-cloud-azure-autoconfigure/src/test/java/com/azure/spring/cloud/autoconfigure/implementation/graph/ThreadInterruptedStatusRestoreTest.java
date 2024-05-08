// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.cloud.autoconfigure.implementation.graph;

import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.logging.LogLevel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class ThreadInterruptedStatusRestoreTest {
    private static final ClientLogger LOGGER = new ClientLogger(ThreadInterruptedStatusRestoreTest.class);

    @Test
    void testThreadInterruptedRestoreFromAnotherThread() throws InterruptedException {
        CountDownLatch latchForInWhile = new CountDownLatch(1);
        CountDownLatch latchForInCatch = new CountDownLatch(1);
        TestThread testThread = new TestThread(latchForInWhile, latchForInCatch, true);
        testThread.setDaemon(true);
        testThread.start();
        latchForInWhile.await();
        testThread.interrupt();
        latchForInCatch.await();

        LOGGER.log(LogLevel.VERBOSE, () -> Thread.currentThread().getName() + ": begin assertion");
        Assertions.assertTrue((testThread).getIsInterrupted());
        LOGGER.log(LogLevel.VERBOSE, () -> Thread.currentThread().getName() + ": end assertion");
    }

    @Test
    void testThreadInterruptedNotRestoreFromAnotherThread() throws InterruptedException {
        CountDownLatch latchForInWhile = new CountDownLatch(1);
        CountDownLatch latchForInCatch = new CountDownLatch(1);
        TestThread testThread = new TestThread(latchForInWhile, latchForInCatch, false);
        testThread.setDaemon(true);
        testThread.start();
        latchForInWhile.await();
        testThread.interrupt();
        latchForInCatch.await();

        LOGGER.log(LogLevel.VERBOSE, () -> Thread.currentThread().getName() + ": begin assertion");
        Assertions.assertFalse(testThread.getIsInterrupted());
        LOGGER.log(LogLevel.VERBOSE, () -> Thread.currentThread().getName() + ": end assertion");
    }


    static class TestThread extends Thread {
        private final CountDownLatch latchForInWhile;
        private final CountDownLatch latchForInCatch;

        private final boolean restore;
        boolean isInterrupted = false;

        TestThread(CountDownLatch latchForInWhile, CountDownLatch latchForInCatch, boolean restore) {
            this.latchForInWhile = latchForInWhile;
            this.latchForInCatch = latchForInCatch;
            this.restore = restore;
        }

        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    latchForInWhile.countDown();
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException ex) {
                    LOGGER.log(LogLevel.VERBOSE,
                        () -> Thread.currentThread().getName() + ": current thread was interrupted!");
                    if (restore) {
                        Thread.currentThread().interrupt();
                    }

                    this.isInterrupted = Thread.currentThread().isInterrupted();
                    latchForInCatch.countDown();
                }
            }
        }

        boolean getIsInterrupted() {
            return this.isInterrupted;
        }
    }
}
