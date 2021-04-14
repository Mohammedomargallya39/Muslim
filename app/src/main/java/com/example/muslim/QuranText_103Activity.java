package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_103Activity extends AppCompatActivity {

    ArrayList<Alaser> alasers = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_103_adapter quran_text_103_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_103);

        alasers.add(new Alaser("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alasers.add(new Alaser("وَالْعَصْرِ (1)"));
        alasers.add(new Alaser("إِنَّ الْإِنْسَانَ لَفِي خُسْرٍ (2)"));
        alasers.add(new Alaser("إِلَّا الَّذِينَ آَمَنُوا وَعَمِلُوا الصَّالِحَاتِ وَتَوَاصَوْا بِالْحَقِّ وَتَوَاصَوْا بِالصَّبْرِ (3)"));



        quran_text_103_adapter = new quran_text_103_adapter(alasers ,QuranText_103Activity.this);

        recyclerView = findViewById(R.id.rv_103);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_103Activity.this));
        recyclerView.setAdapter(quran_text_103_adapter);


    }

}