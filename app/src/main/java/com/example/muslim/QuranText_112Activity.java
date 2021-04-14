package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_112Activity extends AppCompatActivity {

    ArrayList<Alekhlas> alekhlas = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_112_adapter quran_text_112_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_112);

        alekhlas.add(new Alekhlas("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alekhlas.add(new Alekhlas("قُلْ هُوَ اللَّهُ أَحَدٌ (1)"));
        alekhlas.add(new Alekhlas("اللَّهُ الصَّمَدُ (2)"));
        alekhlas.add(new Alekhlas("لَمْ يَلِدْ وَلَمْ يُولَدْ (3)"));
        alekhlas.add(new Alekhlas("وَلَمْ يَكُنْ لَهُ كُفُوًا أَحَدٌ (4)"));


        quran_text_112_adapter = new quran_text_112_adapter(alekhlas ,QuranText_112Activity.this);

        recyclerView = findViewById(R.id.rv_112);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_112Activity.this));
        recyclerView.setAdapter(quran_text_112_adapter);


    }

}