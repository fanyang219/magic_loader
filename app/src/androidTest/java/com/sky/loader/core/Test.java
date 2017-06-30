package com.sky.loader.core;

import android.content.Context;
import android.support.test.InstrumentationRegistry;

import static org.junit.Assert.assertEquals;

public class Test {
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.sky.loader", appContext.getPackageName());
    }
}
