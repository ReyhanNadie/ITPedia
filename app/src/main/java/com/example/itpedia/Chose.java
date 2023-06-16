package com.example.itpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Chose extends AppCompatActivity {
    Button login, register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chose);
        login = findViewById(R.id.btnLogin);
        register = findViewById(R.id.btnRegister);


        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent dashboard1 = new Intent(Chose.this, Login.class);
                startActivity(dashboard1);
                Toast.makeText(Chose.this, "Silahkan Login", Toast.LENGTH_SHORT).show();
            }
        });
        register.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent dashboard2 = new Intent(Chose.this, Register.class);
                startActivity(dashboard2);
                Toast.makeText(Chose.this, "Silahkan SignUp", Toast.LENGTH_SHORT).show();
            }
        });

    }
}