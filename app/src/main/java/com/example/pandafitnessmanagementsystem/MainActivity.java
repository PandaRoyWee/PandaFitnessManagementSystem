package com.example.pandafitnessmanagementsystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.workouts);
        Button button2 = findViewById(R.id.recipe);
        Button button3 = findViewById(R.id.BMI);
        Button button4 = findViewById(R.id.calorie);
        Button button5 = findViewById(R.id.gps);
        Button button6 = findViewById(R.id.login);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.workouts:
                startActivity(new Intent(MainActivity.this, workout.class));
                break;
            case R.id.recipe:
                startActivity(new Intent(MainActivity.this, RecipeActivity.class));
                break;
            case R.id.BMI:
                startActivity(new Intent(MainActivity.this, bmi.class));
                break;
            case R.id.calorie:
                startActivity(new Intent(MainActivity.this, calories.class));
                break;
            case R.id.gps:
                startActivity(new Intent(MainActivity.this, MapsActivity.class));
                break;
            case R.id.login:
                startActivity(new Intent(MainActivity.this,LoginActivity.class));
                break;
        }
    }
}