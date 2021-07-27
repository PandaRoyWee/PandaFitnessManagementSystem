package com.example.pandafitnessmanagementsystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class advanced extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced);
        /* VideoView videoView = findViewById(R.id.advance1);
        String videoPath = "android.resource://" + getPackageName() + "/" +R.raw.advanced;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView); */

        Button button1 = findViewById(R.id.previous5);
        Button button2 = findViewById(R.id.previous6);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.previous5:
                startActivity(new Intent(advanced.this, workout.class));
                break;
            case R.id.previous6:
                startActivity(new Intent(advanced.this, MainActivity.class));
                break;
        }
    }
}