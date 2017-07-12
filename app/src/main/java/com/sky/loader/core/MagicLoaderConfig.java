package com.sky.loader.core;

/**
 * Created by xufan on 17/6/30.
 */
public class MagicLoaderConfig {
    private int memoryCacheSize = 0;
    private int diskCacheSize = 0;

    public MagicLoaderConfig(Builder builder) {
        this.memoryCacheSize = builder.memoryCacheSize;
        this.diskCacheSize = builder.diskCacheSize;
    }

    public static class Builder {
        private int memoryCacheSize;
        private int diskCacheSize;

        public Builder memoryCacheSize(int memoryCacheSize) {
            this.memoryCacheSize = memoryCacheSize;
            return this;
        }

        public Builder diskCacheSize(int diskCacheSize) {
            this.diskCacheSize = diskCacheSize;
            return this;
        }

        public MagicLoaderConfig build() {
            return new MagicLoaderConfig(this);
        }
    }
}
