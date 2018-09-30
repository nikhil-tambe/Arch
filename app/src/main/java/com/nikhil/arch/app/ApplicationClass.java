package com.nikhil.arch.app;

import android.app.Application;

import com.nikhil.arch.di.AppComponent;
import com.nikhil.arch.di.AppModule;
import com.nikhil.arch.di.DaggerAppComponent;
import com.nikhil.arch.di.RoomModule;

/**
 * Created by Mojo Jojo on 30-09-2018.
 */
public class ApplicationClass extends Application {

    AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComponent
                .builder()
                .appModule(new AppModule(this))
                .roomModule(new RoomModule(this))
                .build();
    }

    public AppComponent getComponent() {
        return component;
    }
}
