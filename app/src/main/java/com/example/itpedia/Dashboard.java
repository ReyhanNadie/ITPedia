package com.example.itpedia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dashboard extends AppCompatActivity {
    CardView pengertian, komponen, jenis, quizz;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
       pengertian = findViewById(R.id.cdMenu1);
        pengertian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent open = new Intent(Dashboard.this, SejarahKomputer.class );
                startActivity(open);
            }
        });
        komponen = findViewById(R.id.cdMenu2);
        komponen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent open = new Intent(Dashboard.this, KomponenKomputer.class );
                startActivity(open);
            }
        });
        jenis = findViewById(R.id.cdMenu3);
        jenis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent open = new Intent(Dashboard.this, JenisKomputer.class );
                startActivity(open);
            }
        });
        quizz = findViewById(R.id.cdMenu4);
        quizz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent open = new Intent(Dashboard.this,Kuis2.class );
                startActivity(open);
            }
        });
    }
}