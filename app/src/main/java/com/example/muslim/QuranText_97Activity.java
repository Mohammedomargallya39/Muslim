package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_97Activity extends AppCompatActivity {

    ArrayList<Alqadr> alqadrs = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_97_adapter quran_text_97_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_97);

        alqadrs.add(new Alqadr("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alqadrs.add(new Alqadr("إِنَّا أَنْزَلْنَاهُ فِي لَيْلَةِ الْقَدْرِ (1)"));
        alqadrs.add(new Alqadr("وَمَا أَدْرَاكَ مَا لَيْلَةُ الْقَدْرِ (2)"));
        alqadrs.add(new Alqadr("لَيْلَةُ الْقَدْرِ خَيْرٌ مِنْ أَلْفِ شَهْرٍ (3)"));
        alqadrs.add(new Alqadr("تَنَزَّلُ الْمَلَائِكَةُ وَالرُّوحُ فِيهَا بِإِذْنِ رَبِّهِمْ مِنْ كُلِّ أَمْرٍ (4)"));
        alqadrs.add(new Alqadr("سَلَامٌ هِيَ حَتَّى مَطْلَعِ الْفَجْرِ (5)"));


        quran_text_97_adapter = new quran_text_97_adapter(alqadrs ,QuranText_97Activity.this);

        recyclerView = findViewById(R.id.rv_97);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_97Activity.this));
        recyclerView.setAdapter(quran_text_97_adapter);


    }

}