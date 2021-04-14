package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_106Activity extends AppCompatActivity {

    ArrayList<Qoraish> qoraishes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_106_adapter quran_text_106_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_106);

        qoraishes.add(new Qoraish("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        qoraishes.add(new Qoraish("لِإِيلَافِ قُرَيْشٍ (1)"));
        qoraishes.add(new Qoraish("إِيلَافِهِمْ رِحْلَةَ الشِّتَاءِ وَالصَّيْفِ (2)"));
        qoraishes.add(new Qoraish("فَلْيَعْبُدُوا رَبَّ هَذَا الْبَيْتِ (3)"));
        qoraishes.add(new Qoraish("الَّذِي أَطْعَمَهُمْ مِنْ جُوعٍ وَآَمَنَهُمْ مِنْ خَوْفٍ (4)"));

        quran_text_106_adapter = new quran_text_106_adapter(qoraishes ,QuranText_106Activity.this);

        recyclerView = findViewById(R.id.rv_106);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_106Activity.this));
        recyclerView.setAdapter(quran_text_106_adapter);


    }

}