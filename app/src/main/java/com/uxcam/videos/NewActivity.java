package com.uxcam.videos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
    }

    @Override
    protected void onResume() {
        super.onResume();
        // tag the screen here
    }
}