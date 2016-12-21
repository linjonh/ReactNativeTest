package com.jaysen.reactnativetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.facebook.react.LifecycleState;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactRootView;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.react.uimanager.AppRegistry;

public class MainActivity extends AppCompatActivity implements DefaultHardwareBackBtnHandler {
    private ReactRootView mReactRootView;
    private ReactInstanceManager mReactInstanceManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mReactRootView = new ReactRootView(this);
        mReactInstanceManager = ReactInstanceManager.builder()
                                                    .setApplication(getApplication())
                                                    .setBundleAssetName("index.android.bundle")
                                                    .setJSMainModuleName("index.android")
                                                    .addPackage(new MainReactPackage())
                                                    .setUseDeveloperSupport(BuildConfig.DEBUG)
                                                    .setInitialLifecycleState(LifecycleState.RESUMED)
                                                    .build();
        mReactRootView.startReactApplication(mReactInstanceManager, "HelloWorld", null);

        setContentView(mReactRootView);
    }

    @Override
    public void invokeDefaultOnBackPressed() {
        super.onBackPressed();
    }
}
