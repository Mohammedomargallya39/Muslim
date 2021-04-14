package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_105Activity extends AppCompatActivity {

    ArrayList<Alfel> alfels = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_105_adapter quran_text_105_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_105);

        alfels.add(new Alfel("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alfels.add(new Alfel("أَلَمْ تَرَ كَيْفَ فَعَلَ رَبُّكَ بِأَصْحَابِ الْفِيلِ (1)"));
        alfels.add(new Alfel("أَلَمْ يَجْعَلْ كَيْدَهُمْ فِي تَضْلِيلٍ (2)"));
        alfels.add(new Alfel("وَأَرْسَلَ عَلَيْهِمْ طَيْرًا أَبَابِيلَ (3)"));
        alfels.add(new Alfel("تَرْمِيهِمْ بِحِجَارَةٍ مِنْ سِجِّيلٍ (4)"));
        alfels.add(new Alfel("فَجَعَلَهُمْ كَعَصْفٍ مَأْكُولٍ (5)"));


        quran_text_105_adapter = new quran_text_105_adapter(alfels ,QuranText_105Activity.this);

        recyclerView = findViewById(R.id.rv_105);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_105Activity.this));
        recyclerView.setAdapter(quran_text_105_adapter);


    }

}