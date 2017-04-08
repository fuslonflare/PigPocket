package com.kmitl.meeserclenote.pigpocket;

import android.app.Application;
import android.content.Context;

import com.kmitl.meeserclenote.pigpocket.manager.Contextor;

/**
 * Created by MeesercleNote on 8/4/2560.
 */

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Contextor.getInstance().init(getApplicationContext());
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
