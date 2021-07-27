package com.example.pandafitnessmanagementsystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class intermediate extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intermediate);

        Button button1 = findViewById(R.id.previous3);
        Button button2 = findViewById(R.id.previous4);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

        TextView planktext = (TextView) findViewById(R.id.textplank);
        TextView hangkneeraisetext = (TextView) findViewById(R.id.texthangkneeraise);

        planktext.setText("5 Sets Hang for 1 min each set \n Rest in intervals of 2 minute after each set");
        hangkneeraisetext.setText("5 sets of 15 \n Rest in intervals of 1 minutes after each set");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.previous3:
                startActivity(new Intent(intermediate.this, workout.class));
                break;
            case R.id.previous4:
                startActivity(new Intent(intermediate.this, MainActivity.class));
                break;
        }
    }
}