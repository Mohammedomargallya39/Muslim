package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_102Activity extends AppCompatActivity {

    ArrayList<Altakathor> altakathors = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_102_adapter quran_text_102_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_102);

        altakathors.add(new Altakathor("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        altakathors.add(new Altakathor("أَلْهَاكُمُ التَّكَاثُرُ (1)"));
        altakathors.add(new Altakathor("حَتَّى زُرْتُمُ الْمَقَابِرَ (2)"));
        altakathors.add(new Altakathor("كَلَّا سَوْفَ تَعْلَمُونَ (3)"));
        altakathors.add(new Altakathor("ثُمَّ كَلَّا سَوْفَ تَعْلَمُونَ (4)"));
        altakathors.add(new Altakathor("كَلَّا لَوْ تَعْلَمُونَ عِلْمَ الْيَقِينِ (5)"));
        altakathors.add(new Altakathor("لَتَرَوُنَّ الْجَحِيمَ (6)"));
        altakathors.add(new Altakathor("ثُمَّ لَتَرَوُنَّهَا عَيْنَ الْيَقِينِ (7)"));
        altakathors.add(new Altakathor(" ثُمَّ لَتُسْأَلُنَّ يَوْمَئِذٍ عَنِ النَّعِيمِ (8)"));


        quran_text_102_adapter = new quran_text_102_adapter(altakathors ,QuranText_102Activity.this);

        recyclerView = findViewById(R.id.rv_102);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_102Activity.this));
        recyclerView.setAdapter(quran_text_102_adapter);


    }

}