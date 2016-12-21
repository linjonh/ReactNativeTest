package com.jaysen.reactnativetest;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

/**
 * Created by jaysen.lin@foxmail.com on 2016/12/21.
 */

public class TestReactModule extends ReactContextBaseJavaModule {

    public TestReactModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return null;
    }
}
