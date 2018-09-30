package com.nikhil.arch.di;

import com.nikhil.arch.app.BaseActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Mojo Jojo on 30-09-2018.
 */
@Singleton
@Component(modules = {AppModule.class, RoomModule.class})
public interface AppComponent {

    void inject(BaseActivity baseActivity);

}
