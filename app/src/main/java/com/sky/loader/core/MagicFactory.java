package com.sky.loader.core;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by xufan on 17/6/30.
 */
public class MagicFactory {
    private static final int POOL_SIZE = 5;
    private static final int MAX_POOL_SIZE = 8;
    private static final int TIME_OUT = 30;

    // 创建图片加载线程池
    public static Executor createTaskExecutor() {
        return new ThreadPoolExecutor(POOL_SIZE, MAX_POOL_SIZE, TIME_OUT,
                TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(POOL_SIZE));
    }
}
