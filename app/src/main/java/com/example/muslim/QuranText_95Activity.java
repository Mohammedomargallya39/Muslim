package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_95Activity extends AppCompatActivity {

    ArrayList<Alten> altens = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_95_adapter quran_text_95_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_95);

        altens.add(new Alten("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        altens.add(new Alten("وَالتِّينِ وَالزَّيْتُونِ (1)"));
        altens.add(new Alten("وَطُورِ سِينِينَ (2)"));
        altens.add(new Alten("وَهَذَا الْبَلَدِ الْأَمِينِ (3)"));
        altens.add(new Alten("لَقَدْ خَلَقْنَا الْإِنْسَانَ فِي أَحْسَنِ تَقْوِيمٍ (4)"));
        altens.add(new Alten("ثُمَّ رَدَدْنَاهُ أَسْفَلَ سَافِلِينَ (5)"));
        altens.add(new Alten("إِلَّا الَّذِينَ آَمَنُوا وَعَمِلُوا الصَّالِحَاتِ فَلَهُمْ أَجْرٌ غَيْرُ مَمْنُونٍ (6)"));
        altens.add(new Alten("فَمَا يُكَذِّبُكَ بَعْدُ بِالدِّينِ (7)"));
        altens.add(new Alten("أَلَيْسَ اللَّهُ بِأَحْكَمِ الْحَاكِمِينَ (8)"));


        quran_text_95_adapter = new quran_text_95_adapter(altens ,QuranText_95Activity.this);

        recyclerView = findViewById(R.id.rv_95);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_95Activity.this));
        recyclerView.setAdapter(quran_text_95_adapter);


    }

}