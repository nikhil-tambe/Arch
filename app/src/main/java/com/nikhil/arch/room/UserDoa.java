package com.nikhil.arch.room;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import static com.nikhil.arch.constants.DBContants.TABLE_USER;

/**
 * Created by Mojo Jojo on 30-09-2018.
 */

@Dao
public interface UserDoa {

    @Insert
    void insert(UserEntity... entities);

    @Update
    void update(UserEntity... entities);

    @Delete
    void delete(UserEntity... entities);

    @Query("SELECT * FROM " + TABLE_USER)
    LiveData<List> getAllData();

}
