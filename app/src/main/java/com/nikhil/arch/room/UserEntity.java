package com.nikhil.arch.room;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import static com.nikhil.arch.constants.DBContants.COLUMN_CONTACT;
import static com.nikhil.arch.constants.DBContants.COLUMN_EMAIL;
import static com.nikhil.arch.constants.DBContants.COLUMN_FIRST_NAME;
import static com.nikhil.arch.constants.DBContants.COLUMN_GENDER;
import static com.nikhil.arch.constants.DBContants.COLUMN_ID;
import static com.nikhil.arch.constants.DBContants.COLUMN_LAST_NAME;
import static com.nikhil.arch.constants.DBContants.TABLE_USER;

/**
 * Created by Mojo Jojo on 30-09-2018.
 */
@Entity(tableName = TABLE_USER)
public class UserEntity {

    @NonNull
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = COLUMN_ID)
    long id;

    @ColumnInfo(name = COLUMN_FIRST_NAME)
    String f_name;

    @ColumnInfo(name = COLUMN_LAST_NAME)
    String l_name;

    @ColumnInfo(name = COLUMN_EMAIL)
    String email;

    @ColumnInfo(name = COLUMN_CONTACT)
    String contact;

    @ColumnInfo(name = COLUMN_GENDER)
    String gender;

    public UserEntity() {
    }

    public UserEntity(String f_name, String l_name, String email, String contact, String gender) {
        this.f_name = f_name;
        this.l_name = l_name;
        this.email = email;
        this.contact = contact;
        this.gender = gender;
    }

    //
    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", f_name='" + f_name + '\'' +
                ", l_name='" + l_name + '\'' +
                ", email='" + email + '\'' +
                ", contact='" + contact + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
    //

    @NonNull
    public long getId() {
        return id;
    }

    public void setId(@NonNull long id) {
        this.id = id;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
