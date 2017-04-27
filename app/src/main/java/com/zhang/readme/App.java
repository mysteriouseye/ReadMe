package com.zhang.readme;

import android.app.Application;
import android.support.annotation.NonNull;

import com.zhang.readme.dao.DatabaseOpen;

/**
 * Created by zhang on 2017/3/31.
 *
 */

public class App extends Application {

    private static App instance;
    private static DatabaseOpen databaseOpen;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static App getInstance() {
        return instance;
    }

    public DatabaseOpen getDatabaseOpen() {
        if (databaseOpen == null) {
            databaseOpen = new DatabaseOpen(getApplicationContext());
        }
        return databaseOpen;
    }
}
