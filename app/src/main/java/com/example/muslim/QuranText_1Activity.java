package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_1Activity extends AppCompatActivity {

    ArrayList<Elfateha> elfatehas = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_1_adapter quran_text_1_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_1);

        elfatehas.add(new Elfateha("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ (1)"));
        elfatehas.add(new Elfateha("الْحَمْدُ لِلَّهِ رَبِّ الْعَالَمِينَ (2)"));
        elfatehas.add(new Elfateha("الرَّحْمَنِ الرَّحِيمِ (3)"));
        elfatehas.add(new Elfateha("مَالِكِ يَوْمِ الدِّينِ (4)"));
        elfatehas.add(new Elfateha("إِيَّاكَ نَعْبُدُ وَإِيَّاكَ نَسْتَعِينُ (5)"));
        elfatehas.add(new Elfateha("اهْدِنَا الصِّرَاطَ الْمُسْتَقِيمَ (6)"));
        elfatehas.add(new Elfateha("صِرَاطَ الَّذِينَ أَنْعَمْتَ عَلَيْهِمْ غَيْرِ الْمَغْضُوبِ عَلَيْهِمْ وَلَا الضَّالِّينَ (7)"));

        quran_text_1_adapter = new quran_text_1_adapter(elfatehas ,QuranText_1Activity.this);

        recyclerView = findViewById(R.id.rv_1);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_1Activity.this));
        recyclerView.setAdapter(quran_text_1_adapter);


    }

}