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
import com.google.firebase.auth.FirebaseUser;

public class Login extends AppCompatActivity {
    Button login1;
    EditText email1, password1;
    FirebaseAuth mAuth;
    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null){
            Toast.makeText(getApplicationContext(), "Authentication Succesfull.", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(), Dashboard.class);
            startActivity(intent);
            finish();
        }
    }
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email1 = findViewById(R.id.edtEmail);
        password1 = findViewById(R.id.edtPassword);
        mAuth = FirebaseAuth.getInstance();
        login1 = findViewById(R.id.btnLogin1);
        login1.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          String emailS, passwordS;
                                          emailS = String.valueOf(email1.getText());
                                          passwordS = String.valueOf(password1.getText());
                                          if (TextUtils.isEmpty(emailS)) {
                                              Toast.makeText(Login.this, "Enter Email", Toast.LENGTH_SHORT).show();
                                              return;
                                          }
                                          if (TextUtils.isEmpty(passwordS)) {
                                              Toast.makeText(Login.this, "Enter Password", Toast.LENGTH_SHORT).show();
                                              return;
                                          }
                                          mAuth.signInWithEmailAndPassword(emailS, passwordS)
                                                  .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                                      @Override
                                                      public void onComplete(@NonNull Task<AuthResult> task) {
                                                          if (task.isSuccessful()) {
                                                              Toast.makeText(getApplicationContext(), "Login Succesfull", Toast.LENGTH_SHORT).show();
                                                              Intent intent = new Intent(getApplicationContext(), Dashboard.class);
                                                              startActivity(intent);
                                                              finish();

                                                          } else {
                                                              Toast.makeText(Login.this, "Authentication failed", Toast.LENGTH_SHORT).show();
                                                          }
                                                      }
                                                  });
                                      }
                                  }
        );
    }
}