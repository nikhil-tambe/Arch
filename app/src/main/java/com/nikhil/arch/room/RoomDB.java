package com.nikhil.arch.room;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import static com.nikhil.arch.constants.DBContants.DB_VERSION;

/**
 * Created by Mojo Jojo on 30-09-2018.
 */
@Database(entities = {UserEntity.class}, version = DB_VERSION)
public abstract class RoomDB extends RoomDatabase {

    public abstract UserDoa userDoa();

}
