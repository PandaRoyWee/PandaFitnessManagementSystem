package com.example.pandafitnessmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class workout extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);

        Button button1 = findViewById(R.id.menu1);
        Button button2 = findViewById(R.id.beginner);
        Button button3 = findViewById(R.id.intermediate);
        Button button4 = findViewById(R.id.advanced);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.menu1:
                startActivity(new Intent(workout.this, MainActivity.class));
                break;
            case R.id.beginner:
                startActivity(new Intent(workout.this, beginner.class));
                break;
            case R.id.intermediate:
                startActivity(new Intent(workout.this, intermediate.class));
                break;
            case R.id.advanced:
                startActivity(new Intent(workout.this, advanced.class));
                break;
        }
    }
}