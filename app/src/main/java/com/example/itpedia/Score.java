package com.example.itpedia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Score extends AppCompatActivity {
    TextView mtvHasilAkhir;
    private Button home;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        mtvHasilAkhir = (TextView) findViewById(R.id.tvSkorAkhir);
        home = (Button) findViewById(R.id.home);

        setSkor();

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Score.this, Dashboard.class);
                startActivity(i);
            }
        });
    }

    //method untuk mengatur skor yang akan ditampilkan pada textview
    public void setSkor(){
        //hasil lemparan (putExtra) dari activity sebelumnya ditampung dalam variabel lokal
        String activity = getIntent().getStringExtra("activity");
        String skorPilGan = getIntent().getStringExtra("skorAkhir");
        mtvHasilAkhir.setText("SKOR : "+skorPilGan);
    }

    //ini adalah method bawaan dari Android Studio
    //fungsi : memberi aksi ketika tombol back pada hp diklik
    public void onBackPressed(){
        Toast.makeText(this, "Tidak bisa kembali, silahkan tekan menu", Toast.LENGTH_SHORT).show();
        //jadi yang awalnya klik tombol back maka akan kembali ke activity sebelumnya
        //kali ini ketika tombol back diklik maka
        //hanya muncul Toast

    }
}