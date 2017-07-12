package com.sky.loader.core.task;

import com.sky.loader.core.MagicScheduler;
import com.sky.loader.util.MLog;

import junit.framework.TestCase;

/**
 * Created by xufan on 17/7/12.
 */
public class TaskSchedulerTest extends TestCase {
    private static final String TAG = TaskSchedulerTest.class.getSimpleName();

    private MagicScheduler scheduler = null;
    private int asyncValue = 0;
    private int asyncValue1 = 0;
    private int syncValue = 0;

    public void setUp() throws Exception {
        super.setUp();
    }

    public void testAsyncTask() {
        Task asyncTask = new Task() {
            @Override
            public void run() {
                MLog.log(TAG, "async task execute ok.");
                asyncValue+=3;
            }
        };
        getScheduler().execute(asyncTask);
        assertTrue(asyncValue != 0);
    }

    public void testAsyncTask1() {
        Task asyncTask = new Task() {
            @Override
            public void run() {
                MLog.log(TAG, "async1 task execute ok.");
                asyncValue1+=3;
            }
        };
        getScheduler().execute(asyncTask);
        // 在任务执行完毕之后判断
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertTrue(asyncValue1 == 3);
    }

    public void testSyncTask() {
        Task syncTask = new SyncTask() {
            @Override
            public void run() {
                MLog.log(TAG, "sync task execute ok.");
                asyncValue+=3;
            }
        };
        getScheduler().execute(syncTask);
        assertTrue(asyncValue == 3);
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    private MagicScheduler getScheduler() {
        if(scheduler==null) {
            scheduler = new MagicScheduler();
        }
        return scheduler;
    }
}
