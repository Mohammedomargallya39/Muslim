package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_114Activity extends AppCompatActivity {

    ArrayList<Elnas> elnass = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_114_adapter quran_text_114_adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_114);

        elnass.add(new Elnas("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ "));
        elnass.add(new Elnas("قُلْ أَعُوذُ بِرَبِّ النَّاسِ (1)"));
        elnass.add(new Elnas("مَلِكِ النَّاسِ (2)"));
        elnass.add(new Elnas("إِلَهِ النَّاسِ (3)"));
        elnass.add(new Elnas("مِنْ شَرِّ الْوَسْوَاسِ الْخَنَّاسِ (4)"));
        elnass.add(new Elnas("الَّذِي يُوَسْوِسُ فِي صُدُورِ النَّاسِ (5)"));
        elnass.add(new Elnas("مِنَ الْجِنَّةِ وَالنَّاسِ (6)"));
        quran_text_114_adapter = new quran_text_114_adapter(elnass,QuranText_114Activity.this);

        recyclerView = findViewById(R.id.rv_114);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_114Activity.this));
        recyclerView.setAdapter(quran_text_114_adapter);
    }
}