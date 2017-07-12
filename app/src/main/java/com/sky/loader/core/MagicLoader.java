package com.sky.loader.core;

import com.sky.loader.util.MLog;

/**
 * 图片加载器
 * 1 初始化图片加载器配置
 * 2 加载图片
 * Created by xufan on 17/6/30.
 */
public class MagicLoader {
    private static final String TAG = MagicLoader.class.getSimpleName();

    private MagicLoaderConfig config = null;
    private MagicScheduler scheduler = null;

    private MagicLoader() {}

    public static MagicLoader getInstance() {
        return MagicLoaderHolder.instance;
    }

    // 初始化图片加载器配置
    public void init(MagicLoaderConfig config) {
        if(config==null) {
            throw new IllegalArgumentException("MagicLoader config can not be null.");
        }

        this.config = config;
    }

    // 通过url加载图片
    public void loadImage(String url) {
        MLog.log(TAG, "Start to load image.", "load_image");
    }

    /******************辅助接口*****************/
    private MagicLoaderConfig getConfig() {
        return config;
    }

    private MagicScheduler getScheduler() {
        if(scheduler==null) {
            scheduler = new MagicScheduler();
        }
        return scheduler;
    }

    private static class MagicLoaderHolder {
        private static final MagicLoader instance = new MagicLoader();
    }
}
