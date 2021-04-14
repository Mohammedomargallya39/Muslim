package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_88Activity extends AppCompatActivity {

    ArrayList<Alghashia> alghashias = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_88_adapter quran_text_88_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_88);

        alghashias.add(new Alghashia("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alghashias.add(new Alghashia("هَلْ أَتَاكَ حَدِيثُ الْغَاشِيَةِ (1)"));
        alghashias.add(new Alghashia("وُجُوهٌ يَوْمَئِذٍ خَاشِعَةٌ (2)"));
        alghashias.add(new Alghashia("عَامِلَةٌ نَاصِبَةٌ (3)"));
        alghashias.add(new Alghashia("تَصْلَى نَارًا حَامِيَةً (4)"));
        alghashias.add(new Alghashia("تُسْقَى مِنْ عَيْنٍ آَنِيَةٍ (5)"));
        alghashias.add(new Alghashia("لَيْسَ لَهُمْ طَعَامٌ إِلَّا مِنْ ضَرِيعٍ (6)"));
        alghashias.add(new Alghashia("لَا يُسْمِنُ وَلَا يُغْنِي مِنْ جُوعٍ (7)"));
        alghashias.add(new Alghashia("وُجُوهٌ يَوْمَئِذٍ نَاعِمَةٌ (8)"));
        alghashias.add(new Alghashia("لِسَعْيِهَا رَاضِيَةٌ (9)"));
        alghashias.add(new Alghashia("فِي جَنَّةٍ عَالِيَةٍ (10)"));
        alghashias.add(new Alghashia("لَا تَسْمَعُ فِيهَا لَاغِيَةً (11)"));
        alghashias.add(new Alghashia("فِيهَا عَيْنٌ جَارِيَةٌ (12)"));
        alghashias.add(new Alghashia("فِيهَا سُرُرٌ مَرْفُوعَةٌ (13)"));
        alghashias.add(new Alghashia("وَأَكْوَابٌ مَوْضُوعَةٌ (14)"));
        alghashias.add(new Alghashia("وَنَمَارِقُ مَصْفُوفَةٌ (15)"));
        alghashias.add(new Alghashia("وَزَرَابِيُّ مَبْثُوثَةٌ (16)"));
        alghashias.add(new Alghashia("أَفَلَا يَنْظُرُونَ إِلَى الْإِبِلِ كَيْفَ خُلِقَتْ (17)"));
        alghashias.add(new Alghashia("وَإِلَى السَّمَاءِ كَيْفَ رُفِعَتْ (18)"));
        alghashias.add(new Alghashia("وَإِلَى الْجِبَالِ كَيْفَ نُصِبَتْ (19)"));
        alghashias.add(new Alghashia("وَإِلَى الْأَرْضِ كَيْفَ سُطِحَتْ (20)"));
        alghashias.add(new Alghashia("فَذَكِّرْ إِنَّمَا أَنْتَ مُذَكِّرٌ (21)"));
        alghashias.add(new Alghashia("لَسْتَ عَلَيْهِمْ بِمُسَيْطِرٍ (22)"));
        alghashias.add(new Alghashia("إِلَّا مَنْ تَوَلَّى وَكَفَرَ (23)"));
        alghashias.add(new Alghashia("فَيُعَذِّبُهُ اللَّهُ الْعَذَابَ الْأَكْبَرَ (24)"));
        alghashias.add(new Alghashia("إِنَّ إِلَيْنَا إِيَابَهُمْ (25)"));
        alghashias.add(new Alghashia("ثُمَّ إِنَّ عَلَيْنَا حِسَابَهُمْ (26)"));

        quran_text_88_adapter = new quran_text_88_adapter(alghashias ,QuranText_88Activity.this);

        recyclerView = findViewById(R.id.rv_88);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_88Activity.this));
        recyclerView.setAdapter(quran_text_88_adapter);


    }

}