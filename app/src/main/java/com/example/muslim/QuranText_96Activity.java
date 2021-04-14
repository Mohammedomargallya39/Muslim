package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_96Activity extends AppCompatActivity {

    ArrayList<Alalaq> alalaqs = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_96_adapter quran_text_96_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_96);

        alalaqs.add(new Alalaq("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alalaqs.add(new Alalaq("اقْرَأْ بِاسْمِ رَبِّكَ الَّذِي خَلَقَ (1)"));
        alalaqs.add(new Alalaq("خَلَقَ الْإِنْسَانَ مِنْ عَلَقٍ (2)"));
        alalaqs.add(new Alalaq("اقْرَأْ وَرَبُّكَ الْأَكْرَمُ (3)"));
        alalaqs.add(new Alalaq("الَّذِي عَلَّمَ بِالْقَلَمِ (4)"));
        alalaqs.add(new Alalaq("عَلَّمَ الْإِنْسَانَ مَا لَمْ يَعْلَمْ (5)"));
        alalaqs.add(new Alalaq("كَلَّا إِنَّ الْإِنْسَانَ لَيَطْغَى (6)"));
        alalaqs.add(new Alalaq("أَنْ رَآَهُ اسْتَغْنَى (7)"));
        alalaqs.add(new Alalaq("إِنَّ إِلَى رَبِّكَ الرُّجْعَى (8)"));
        alalaqs.add(new Alalaq("أَرَأَيْتَ الَّذِي يَنْهَى (9)"));
        alalaqs.add(new Alalaq("عَبْدًا إِذَا صَلَّى (10)"));
        alalaqs.add(new Alalaq("أَرَأَيْتَ إِنْ كَانَ عَلَى الْهُدَى (11)"));
        alalaqs.add(new Alalaq("أَوْ أَمَرَ بِالتَّقْوَى (12)"));
        alalaqs.add(new Alalaq("أَرَأَيْتَ إِنْ كَذَّبَ وَتَوَلَّى (13)"));
        alalaqs.add(new Alalaq("أَلَمْ يَعْلَمْ بِأَنَّ اللَّهَ يَرَى (14)"));
        alalaqs.add(new Alalaq("كَلَّا لَئِنْ لَمْ يَنْتَهِ لَنَسْفَعَنْ بِالنَّاصِيَةِ (15)"));
        alalaqs.add(new Alalaq("نَاصِيَةٍ كَاذِبَةٍ خَاطِئَةٍ (16)"));
        alalaqs.add(new Alalaq("فَلْيَدْعُ نَادِيَهُ (17)"));
        alalaqs.add(new Alalaq("سَنَدْعُ الزَّبَانِيَةَ (18)"));
        alalaqs.add(new Alalaq("كَلَّا لَا تُطِعْهُ وَاسْجُدْ وَاقْتَرِبْ (19)"));


        quran_text_96_adapter = new quran_text_96_adapter(alalaqs ,QuranText_96Activity.this);

        recyclerView = findViewById(R.id.rv_96);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_96Activity.this));
        recyclerView.setAdapter(quran_text_96_adapter);


    }

}