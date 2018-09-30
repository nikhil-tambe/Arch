package com.nikhil.arch.di;

import android.content.Context;

import com.nikhil.arch.app.ApplicationClass;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Mojo Jojo on 30-09-2018.
 */
@Module
public class AppModule {

    private final ApplicationClass applicationClass;

    public AppModule(ApplicationClass applicationClass) {
        this.applicationClass = applicationClass;
    }

    @Provides
    Context provideContext() {
        return applicationClass.getApplicationContext();
    }

    @Provides
    ApplicationClass provideAppClass() {
        return applicationClass;
    }
}
