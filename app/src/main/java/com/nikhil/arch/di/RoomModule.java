package com.nikhil.arch.di;

import android.arch.persistence.room.Room;

import com.nikhil.arch.app.ApplicationClass;
import com.nikhil.arch.room.RoomDB;
import com.nikhil.arch.room.UserDoa;

import dagger.Module;
import dagger.Provides;

import static com.nikhil.arch.constants.DBContants.DB_NAME;

/**
 * Created by Mojo Jojo on 30-09-2018.
 */
@Module
public class RoomModule {

    private final RoomDB roomDB;

    public RoomModule(ApplicationClass applicationClass) {
        roomDB = Room.databaseBuilder(applicationClass, RoomDB.class, DB_NAME)
                .build();
    }

    @Provides
    UserDoa provideUserDao(){
        return roomDB.userDoa();
    }
}
