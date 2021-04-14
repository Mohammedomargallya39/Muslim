package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_93Activity extends AppCompatActivity {

    ArrayList<Aldoha> aldohas = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_93_adapter quran_text_93_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_93);

        aldohas.add(new Aldoha("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        aldohas.add(new Aldoha("وَالضُّحَى (1)"));
        aldohas.add(new Aldoha("وَاللَّيْلِ إِذَا سَجَى (2)"));
        aldohas.add(new Aldoha("مَا وَدَّعَكَ رَبُّكَ وَمَا قَلَى (3)"));
        aldohas.add(new Aldoha("وَلَلْآَخِرَةُ خَيْرٌ لَكَ مِنَ الْأُولَى (4)"));
        aldohas.add(new Aldoha("وَلَسَوْفَ يُعْطِيكَ رَبُّكَ فَتَرْضَى (5)"));
        aldohas.add(new Aldoha("أَلَمْ يَجِدْكَ يَتِيمًا فَآَوَى (6)"));
        aldohas.add(new Aldoha("وَوَجَدَكَ ضَالًّا فَهَدَى (7)"));
        aldohas.add(new Aldoha("وَوَجَدَكَ عَائِلًا فَأَغْنَى (8)"));
        aldohas.add(new Aldoha("فَأَمَّا الْيَتِيمَ فَلَا تَقْهَرْ (9)"));
        aldohas.add(new Aldoha("وَأَمَّا السَّائِلَ فَلَا تَنْهَرْ (10)"));
        aldohas.add(new Aldoha("وَأَمَّا بِنِعْمَةِ رَبِّكَ فَحَدِّثْ (11)"));

        quran_text_93_adapter = new quran_text_93_adapter(aldohas ,QuranText_93Activity.this);

        recyclerView = findViewById(R.id.rv_93);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_93Activity.this));
        recyclerView.setAdapter(quran_text_93_adapter);


    }

}