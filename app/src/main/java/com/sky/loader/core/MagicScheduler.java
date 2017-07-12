package com.sky.loader.core;

import com.sky.loader.core.task.SyncTask;
import com.sky.loader.core.task.Task;

import java.util.concurrent.Executor;

/**
 * 任务调度器
 * 1 同步、异步任务
 * 2 线程池分类
 * Created by xufan on 17/6/30.
 */
public class MagicScheduler {
    private Executor taskExecutor = null;

    public MagicScheduler() {}

    public void execute(Task task) {
        if(task instanceof SyncTask) { // 直接运行
            task.run();
        } else { // 异步运行
            taskExecutor.execute(task);
        }
    }

    private Executor getTaskExecutor() {
        if(taskExecutor==null) {
            taskExecutor = MagicFactory.createTaskExecutor();
        }
        return taskExecutor;
    }
}
