package com.example.itpedia;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Register extends AppCompatActivity {
    Button register;
    EditText editTextemail, editTextpassword;
    FirebaseAuth mAuth;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mAuth = FirebaseAuth.getInstance();
        setContentView(R.layout.activity_register);
        editTextemail = findViewById(R.id.inputemail);
        editTextpassword = findViewById(R.id.inputpassword);
        register = findViewById(R.id.BtnRegister);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email, password;
                email = String.valueOf(editTextemail.getText());
                password = String.valueOf(editTextpassword.getText());

                if (TextUtils.isEmpty(email)){
                    Toast.makeText(Register.this, "Enter Email", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(password)){
                    Toast.makeText(Register.this, "Enter Password", Toast.LENGTH_SHORT).show();
                    return;
                }
                mAuth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if(task.isSuccessful()){
                                    Toast.makeText(Register.this, "Account Created", Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(Register.this, Dashboard.class);
                                    startActivity(intent);
                                } else{
                                    Toast.makeText(Register.this, "Authentication Failed", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        });
    }
}