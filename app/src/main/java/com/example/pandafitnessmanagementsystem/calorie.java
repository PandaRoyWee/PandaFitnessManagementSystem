package com.example.pandafitnessmanagementsystem;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pandafitnessmanagementsystem.caloriesdata.DatabaseHelper;

import java.util.ArrayList;

public class calorie extends AppCompatActivity {

    EditText etText;
    Button btAdd;
    ListView listView;

    DatabaseHelper databaseHelper;
    ArrayList arrayList;
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(null);
        setContentView(R.layout.activity_calorie);

        etText = findViewById(R.id.et_text);
        btAdd = findViewById(R.id.bt_add);
        listView = findViewById(R.id.list_view);

        databaseHelper = new DatabaseHelper(calorie.this);

        arrayList = databaseHelper.getAllText();

        arrayAdapter = new ArrayAdapter(calorie.this, android.R.layout.simple_list_item_1, arrayList);

        listView.setAdapter(arrayAdapter);

        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = etText.getText().toString();
                if (!text.isEmpty()) {
                    if (databaseHelper.addText(text)) {
                        etText.setText("");
                        Toast.makeText(getApplicationContext(),"Data Inserted...",Toast.LENGTH_SHORT).show();
                        arrayList.clear();;
                        arrayList.addAll(databaseHelper.getAllText());
                        arrayAdapter.notifyDataSetChanged();
                        listView.invalidateViews();
                        listView.refreshDrawableState();
                    }
                }
            }
        });
    }
}