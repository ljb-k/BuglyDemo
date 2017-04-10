package com.example.buglydemo;

import android.app.Application;

import com.tencent.bugly.crashreport.CrashReport;

/**
 * Created by 日不落 on 2017/4/10.
 */

public class MyApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        CrashReport.initCrashReport(getApplicationContext(), "80b1685c22", false);



    }
}
