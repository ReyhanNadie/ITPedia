package com.example.itpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InstruksiKuis extends AppCompatActivity {
    Button quizz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instruksi_kuis);
        quizz = findViewById(R.id.QuizStart);
        quizz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent open = new Intent(InstruksiKuis.this, Kuis2.class );
                startActivity(open);
            }
        });

    }
}