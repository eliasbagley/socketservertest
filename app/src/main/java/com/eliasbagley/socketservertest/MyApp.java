package com.eliasbagley.socketservertest;

import android.app.Application;

import timber.log.Timber;

/**
 * Created by eliasbagley on 3/3/16.
 */
public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Timber.plant(new Timber.DebugTree());

        registerActivityLifecycleCallbacks(new SocketActivityHierarchyServer());
    }
}
