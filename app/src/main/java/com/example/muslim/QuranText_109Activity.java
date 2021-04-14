package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_109Activity extends AppCompatActivity {

    ArrayList<Alkaferon> alkaferons = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_109_adapter quran_text_109_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_109);

        alkaferons.add(new Alkaferon("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alkaferons.add(new Alkaferon("قُلْ يَا أَيُّهَا الْكَافِرُونَ (1)"));
        alkaferons.add(new Alkaferon("لَا أَعْبُدُ مَا تَعْبُدُونَ (2)"));
        alkaferons.add(new Alkaferon("وَلَا أَنْتُمْ عَابِدُونَ مَا أَعْبُدُ (3)"));
        alkaferons.add(new Alkaferon("وَلَا أَنَا عَابِدٌ مَا عَبَدْتُمْ (4)"));
        alkaferons.add(new Alkaferon("وَلَا أَنْتُمْ عَابِدُونَ مَا أَعْبُدُ (5)"));
        alkaferons.add(new Alkaferon("لَكُمْ دِينُكُمْ وَلِيَ دِينِ (6)"));

        quran_text_109_adapter = new quran_text_109_adapter(alkaferons ,QuranText_109Activity.this);

        recyclerView = findViewById(R.id.rv_109);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_109Activity.this));
        recyclerView.setAdapter(quran_text_109_adapter);


    }

}