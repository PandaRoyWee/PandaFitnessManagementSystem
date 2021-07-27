package com.example.pandafitnessmanagementsystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class beginner extends AppCompatActivity implements View.OnClickListener {

    Button previous1, previous2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner);

        previous1 = findViewById(R.id.previous1);
        previous2 = findViewById(R.id.previous2);

        previous1.setOnClickListener(this);
        previous2.setOnClickListener(this);

        TextView pushuptext = (TextView) findViewById(R.id.textpushup);
        TextView squatstext = (TextView) findViewById(R.id.textsquats);

        pushuptext.setText("3 Sets of 10 \n Rest in intervals of 1 minute after each set");
        squatstext.setText("3 sets of 15 \n Rest in intervals of 1 minutes after each set");

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.previous1:
                startActivity(new Intent(beginner.this, workout.class));
                break;
            case R.id.previous2:
                startActivity(new Intent(beginner.this, MainActivity.class));
                break;
        }
    }
}