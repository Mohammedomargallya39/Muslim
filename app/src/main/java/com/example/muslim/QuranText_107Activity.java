package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_107Activity extends AppCompatActivity {

    ArrayList<Almaaon> almaaons = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_107_adapter quran_text_107_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_107);

        almaaons.add(new Almaaon("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        almaaons.add(new Almaaon("أَرَأَيْتَ الَّذِي يُكَذِّبُ بِالدِّينِ (1)"));
        almaaons.add(new Almaaon("فَذَلِكَ الَّذِي يَدُعُّ الْيَتِيمَ (2)"));
        almaaons.add(new Almaaon("وَلَا يَحُضُّ عَلَى طَعَامِ الْمِسْكِينِ (3)"));
        almaaons.add(new Almaaon("فَوَيْلٌ لِلْمُصَلِّينَ (4)"));
        almaaons.add(new Almaaon("الَّذِينَ هُمْ عَنْ صَلَاتِهِمْ سَاهُونَ (5)"));
        almaaons.add(new Almaaon("الَّذِينَ هُمْ يُرَاءُونَ (6)"));
        almaaons.add(new Almaaon("وَيَمْنَعُونَ الْمَاعُونَ (7)"));

        quran_text_107_adapter = new quran_text_107_adapter(almaaons ,QuranText_107Activity.this);

        recyclerView = findViewById(R.id.rv_107);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_107Activity.this));
        recyclerView.setAdapter(quran_text_107_adapter);


    }

}