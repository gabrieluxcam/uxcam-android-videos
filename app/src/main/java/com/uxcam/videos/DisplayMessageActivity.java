package com.uxcam.videos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.uxcam.UXCam;

public class DisplayMessageActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

//        String userID = "gabrielTest";
//        String academyId = "testProperty";
//
//        UXCam.setUserIdentity(String.valueOf(userID));
//        UXCam.setUserProperty("academy", academyId);
//        UXCam.optInOverall();
//
//        if (!UXCam.isRecording()) {
//            UXCam.startNewSession();
//        }

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }

    @Override
    protected void onResume() {
        super.onResume();
        // tag the screen here
//        UXCam.tagScreenName("test");
    }

    public void goToFragment(View view) {

        getSupportFragmentManager().beginTransaction().add(R.id.container, new BlankFragment()).commit();
    }
}