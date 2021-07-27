package com.example.pandafitnessmanagementsystem;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity {

    EditText e1,e2,e4,e5;
    Button b1;

    FirebaseAuth auth;

    ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        e1=(EditText)findViewById(R.id.email);
        e2=(EditText)findViewById(R.id.pass);
        e4=(EditText)findViewById(R.id.height);
        e5=(EditText)findViewById(R.id.weight);
        b1=(Button)findViewById(R.id.register);

        auth = FirebaseAuth.getInstance();

        dialog = new ProgressDialog(this);
        dialog.setMessage("Account Created!");
        dialog.setCancelable(false);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s1, s2, s4, s5;

                s1 = e1.getText().toString();
                s2 = e2.getText().toString();
                s4 = e4.getText().toString();
                s5 = e5.getText().toString();

                if(s1.isEmpty()){

                    e1.setError("Please enter your Name");
                    e1.requestFocus();

                } else if (s2.isEmpty()){

                    e2.setError("Please enter your Password");
                    e2.requestFocus();

                } else if (s4.isEmpty()){

                    e4.setError("Please enter your Height");
                    e4.requestFocus();

                } else if (s5.isEmpty()){

                    e5.setError("Please enter your Weight");
                    e5.requestFocus();

                } else {
                    dialog.show();
                    auth.createUserWithEmailAndPassword(s1, s2).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {

                            if (task.isSuccessful()){
                                dialog.dismiss();
                                startActivity(new Intent(RegisterActivity.this, MainActivity.class));
                                finish();
                            } else {
                                dialog.dismiss();
                                Toast.makeText(RegisterActivity.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }

            }
        });
    }
}