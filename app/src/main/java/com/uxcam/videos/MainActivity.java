package com.uxcam.videos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.uxcam.OnVerificationListener;
import com.uxcam.UXCam;
import com.uxcam.datamodel.UXConfig;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.uxcam.videos.MESSAGE";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



//        UXConfig config = new UXConfig.Builder("hyglikxvm5sozzv")
        UXConfig config = new UXConfig.Builder("hyglikxvm5sozzv")
//        UXConfig config = new UXConfig.Builder("91pv7ecadxyk3jp") // staging
                .enableAutomaticScreenNameTagging(true)
                .enableImprovedScreenCapture(true)
                .build();

        UXCam.startWithConfiguration(config);
//        UXCam.cancelCurrentSession();
//        new java.util.Timer().schedule(
//                new java.util.TimerTask() {
//                    @Override
//                    public void run() {
//                        UXCam.optOutOverall();
//                    }
//                },
//                3000
//        );


        UXCam.addVerificationListener(new OnVerificationListener() {
            @Override
            public void onVerificationSuccess() {
               UXCam.logEvent("UXCam.urlForCurrentSession()");
            }

            @Override
            public void onVerificationFailed(String errorMessage) {
            }

        });



    }



    @Override
    protected void onResume() {
        super.onResume();
        // tag the screen here
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = findViewById(R.id.editTextTextPersonName);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }


    public void goToScreen(View view) {
        Intent intent = new Intent(this, NewActivity.class);
        startActivity(intent);
    }

    public void gotToWebview(View view) {
        Intent intent = new Intent(this,WebViewActivity.class);
        startActivity(intent);
    }
}