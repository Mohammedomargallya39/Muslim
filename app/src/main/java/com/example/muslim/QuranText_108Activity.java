package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_108Activity extends AppCompatActivity {

    ArrayList<Alkaouther> alkaouthers = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_108_adapter quran_text_108_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_108);

        alkaouthers.add(new Alkaouther("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alkaouthers.add(new Alkaouther("إِنَّا أَعْطَيْنَاكَ الْكَوْثَرَ (1)"));
        alkaouthers.add(new Alkaouther("فَصَلِّ لِرَبِّكَ وَانْحَرْ (2)"));
        alkaouthers.add(new Alkaouther("إِنَّ شَانِئَكَ هُوَ الْأَبْتَرُ (3)"));


        quran_text_108_adapter = new quran_text_108_adapter(alkaouthers ,QuranText_108Activity.this);

        recyclerView = findViewById(R.id.rv_108);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_108Activity.this));
        recyclerView.setAdapter(quran_text_108_adapter);


    }

}