package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_113Activity extends AppCompatActivity {

    ArrayList<Alfalq> alfalqs = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_113_adapter quran_text_113_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_113);

        alfalqs.add(new Alfalq("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alfalqs.add(new Alfalq("قُلْ أَعُوذُ بِرَبِّ الْفَلَقِ (1)"));
        alfalqs.add(new Alfalq("مِنْ شَرِّ مَا خَلَقَ (2)"));
        alfalqs.add(new Alfalq("وَمِنْ شَرِّ غَاسِقٍ إِذَا وَقَبَ (3)"));
        alfalqs.add(new Alfalq("وَمِنْ شَرِّ النَّفَّاثَاتِ فِي الْعُقَدِ (4)"));
        alfalqs.add(new Alfalq("وَمِنْ شَرِّ حَاسِدٍ إِذَا حَسَدَ (5)"));


        quran_text_113_adapter = new quran_text_113_adapter(alfalqs ,QuranText_113Activity.this);

        recyclerView = findViewById(R.id.rv_113);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_113Activity.this));
        recyclerView.setAdapter(quran_text_113_adapter);


    }

}