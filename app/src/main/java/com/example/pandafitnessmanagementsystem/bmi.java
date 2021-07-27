package com.example.pandafitnessmanagementsystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class bmi extends AppCompatActivity implements View.OnClickListener{

    EditText height, weight;
    TextView result;
    Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        height = (EditText) findViewById(R.id.personheight);
        weight = (EditText) findViewById(R.id.personweight);
        result = (TextView) findViewById(R.id.result);
        calculate = (Button) findViewById(R.id.calculation);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { calculateBMI(); }
        });

        Button button1 = findViewById(R.id.menu3);

        button1.setOnClickListener(this);

    }

    private void calculateBMI() {
        String heightStr = height.getText().toString();
        String weightStr = weight.getText().toString();

        if(heightStr !=null && !"".equals(heightStr) && weightStr !=null && !"".equals(weightStr)) {
            float heightValue = Float.parseFloat(heightStr) / 100;
            float weightValue = Float.parseFloat(weightStr);

            float bmi = weightValue / (heightValue * heightValue);

            displayBMI(bmi);
        }
    }

    private void displayBMI(float bmi) {
        String bmiLabel = "";

        if(Float.compare(bmi, 15f) <=0) {
            bmiLabel = "Very Severely Underweight";
        } else if(Float.compare(bmi, 15f) > 0 && Float.compare(bmi, 16f) <=0) {
            bmiLabel = "Severely Underweight";
        } else if(Float.compare(bmi, 16f) > 0 && Float.compare(bmi, 18.5f) <=0) {
            bmiLabel = "Underweight";
        } else if(Float.compare(bmi, 18.5f) > 0 && Float.compare(bmi, 25f) <=0) {
            bmiLabel = "Normal";
        } else if(Float.compare(bmi, 25f) > 0 && Float.compare(bmi, 30f) <=0) {
            bmiLabel = "Overweight";
        } else if(Float.compare(bmi, 30f) > 0 && Float.compare(bmi, 35f) <=0) {
            bmiLabel = "Obese Class 1";
        } else if(Float.compare(bmi, 35f) > 0 && Float.compare(bmi, 40f) <=0) {
            bmiLabel = "Obese Class 2";
        } else {
            bmiLabel = "Obese Class 3";
        }

        bmiLabel = bmi + "\n" + bmiLabel;
        result.setText(bmiLabel);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.menu3:
                startActivity(new Intent(bmi.this, MainActivity.class));
                break;
        }
    }
}