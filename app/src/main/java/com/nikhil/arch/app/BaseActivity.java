package com.nikhil.arch.app;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

public class BaseActivity extends AppCompatActivity {

    @Inject
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ((ApplicationClass)getApplication()).getComponent().inject(this);
    }
}
