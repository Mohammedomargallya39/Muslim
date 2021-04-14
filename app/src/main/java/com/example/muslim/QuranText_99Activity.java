package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_99Activity extends AppCompatActivity {

    ArrayList<Alzelzala> alzelzalas = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_99_adapter quran_text_99_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_99);

        alzelzalas.add(new Alzelzala("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alzelzalas.add(new Alzelzala("إِذَا زُلْزِلَتِ الْأَرْضُ زِلْزَالَهَا (1)"));
        alzelzalas.add(new Alzelzala("وَأَخْرَجَتِ الْأَرْضُ أَثْقَالَهَا (2)"));
        alzelzalas.add(new Alzelzala("وَقَالَ الْإِنْسَانُ مَا لَهَا (3)"));
        alzelzalas.add(new Alzelzala("يَوْمَئِذٍ تُحَدِّثُ أَخْبَارَهَا (4)"));
        alzelzalas.add(new Alzelzala("بِأَنَّ رَبَّكَ أَوْحَى لَهَا (5)"));
        alzelzalas.add(new Alzelzala("يَوْمَئِذٍ يَصْدُرُ النَّاسُ أَشْتَاتًا لِيُرَوْا أَعْمَالَهُمْ (6)"));
        alzelzalas.add(new Alzelzala("فَمَنْ يَعْمَلْ مِثْقَالَ ذَرَّةٍ خَيْرًا يَرَهُ (7)"));
        alzelzalas.add(new Alzelzala("وَمَنْ يَعْمَلْ مِثْقَالَ ذَرَّةٍ شَرًّا يَرَهُ (8)"));



        quran_text_99_adapter = new quran_text_99_adapter(alzelzalas ,QuranText_99Activity.this);

        recyclerView = findViewById(R.id.rv_99);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_99Activity.this));
        recyclerView.setAdapter(quran_text_99_adapter);


    }

}