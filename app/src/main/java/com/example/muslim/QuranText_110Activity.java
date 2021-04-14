package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_110Activity extends AppCompatActivity {

    ArrayList<Alnasr> alnasrs = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_110_adapter quran_text_110_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_110);

        alnasrs.add(new Alnasr("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alnasrs.add(new Alnasr("إِذَا جَاءَ نَصْرُ اللَّهِ وَالْفَتْحُ (1)"));
        alnasrs.add(new Alnasr("وَرَأَيْتَ النَّاسَ يَدْخُلُونَ فِي دِينِ اللَّهِ أَفْوَاجًا (2)"));
        alnasrs.add(new Alnasr("فَسَبِّحْ بِحَمْدِ رَبِّكَ وَاسْتَغْفِرْهُ إِنَّهُ كَانَ تَوَّابًا (3)"));


        quran_text_110_adapter = new quran_text_110_adapter(alnasrs ,QuranText_110Activity.this);

        recyclerView = findViewById(R.id.rv_110);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_110Activity.this));
        recyclerView.setAdapter(quran_text_110_adapter);


    }

}