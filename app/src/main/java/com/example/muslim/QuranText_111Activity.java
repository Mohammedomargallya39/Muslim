package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_111Activity extends AppCompatActivity {

    ArrayList<Almasad> almasads = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_111_adapter quran_text_111_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_111);

        almasads.add(new Almasad("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        almasads.add(new Almasad("تَبَّتْ يَدَا أَبِي لَهَبٍ وَتَبَّ (1)"));
        almasads.add(new Almasad("مَا أَغْنَى عَنْهُ مَالُهُ وَمَا كَسَبَ (2)"));
        almasads.add(new Almasad("سَيَصْلَى نَارًا ذَاتَ لَهَبٍ (3)"));
        almasads.add(new Almasad("وَامْرَأَتُهُ حَمَّالَةَ الْحَطَبِ (4)"));
        almasads.add(new Almasad("فِي جِيدِهَا حَبْلٌ مِنْ مَسَدٍ (5)"));

        quran_text_111_adapter = new quran_text_111_adapter(almasads ,QuranText_111Activity.this);

        recyclerView = findViewById(R.id.rv_111);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_111Activity.this));
        recyclerView.setAdapter(quran_text_111_adapter);


    }

}