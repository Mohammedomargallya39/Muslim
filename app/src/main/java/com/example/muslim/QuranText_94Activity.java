package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_94Activity extends AppCompatActivity {

    ArrayList<Alsharh> alsharhs = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_94_adapter quran_text_94_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_94);

        alsharhs.add(new Alsharh("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alsharhs.add(new Alsharh("أَلَمْ نَشْرَحْ لَكَ صَدْرَكَ (1)"));
        alsharhs.add(new Alsharh("وَوَضَعْنَا عَنْكَ وِزْرَكَ (2)"));
        alsharhs.add(new Alsharh("الَّذِي أَنْقَضَ ظَهْرَكَ (3)"));
        alsharhs.add(new Alsharh("وَرَفَعْنَا لَكَ ذِكْرَكَ (4)"));
        alsharhs.add(new Alsharh("فَإِنَّ مَعَ الْعُسْرِ يُسْرًا (5)"));
        alsharhs.add(new Alsharh("إِنَّ مَعَ الْعُسْرِ يُسْرًا (6)"));
        alsharhs.add(new Alsharh("فَإِذَا فَرَغْتَ فَانْصَبْ (7)"));
        alsharhs.add(new Alsharh("وَإِلَى رَبِّكَ فَارْغَبْ (8)"));


        quran_text_94_adapter = new quran_text_94_adapter(alsharhs ,QuranText_94Activity.this);

        recyclerView = findViewById(R.id.rv_94);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_94Activity.this));
        recyclerView.setAdapter(quran_text_94_adapter);


    }

}