package com.example.anton.pizzasapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        //Load User, open Login if user is for first time in app and start main activity
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);

        finish();

    }
}
