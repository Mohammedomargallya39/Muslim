package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_84Activity extends AppCompatActivity {

    ArrayList<Alensheqaq> alensheqaqs = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_84_adapter quran_text_84_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_84);

        alensheqaqs.add(new Alensheqaq("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alensheqaqs.add(new Alensheqaq("إِذَا السَّمَاءُ انْشَقَّتْ (1)"));
        alensheqaqs.add(new Alensheqaq("وَأَذِنَتْ لِرَبِّهَا وَحُقَّتْ (2)"));
        alensheqaqs.add(new Alensheqaq("وَإِذَا الْأَرْضُ مُدَّتْ (3)"));
        alensheqaqs.add(new Alensheqaq("وَأَلْقَتْ مَا فِيهَا وَتَخَلَّتْ (4)"));
        alensheqaqs.add(new Alensheqaq("وَأَذِنَتْ لِرَبِّهَا وَحُقَّتْ (5)"));
        alensheqaqs.add(new Alensheqaq("يَا أَيُّهَا الْإِنْسَانُ إِنَّكَ كَادِحٌ إِلَى رَبِّكَ كَدْحًا فَمُلَاقِيهِ (6)"));
        alensheqaqs.add(new Alensheqaq("فَأَمَّا مَنْ أُوتِيَ كِتَابَهُ بِيَمِينِهِ (7)"));
        alensheqaqs.add(new Alensheqaq("فَسَوْفَ يُحَاسَبُ حِسَابًا يَسِيرًا (8)"));
        alensheqaqs.add(new Alensheqaq("وَيَنْقَلِبُ إِلَى أَهْلِهِ مَسْرُورًا (9)"));
        alensheqaqs.add(new Alensheqaq("وَأَمَّا مَنْ أُوتِيَ كِتَابَهُ وَرَاءَ ظَهْرِهِ (10)"));
        alensheqaqs.add(new Alensheqaq("فَسَوْفَ يَدْعُو ثُبُورًا (11)"));
        alensheqaqs.add(new Alensheqaq("وَيَصْلَى سَعِيرًا (12)"));
        alensheqaqs.add(new Alensheqaq("إِنَّهُ كَانَ فِي أَهْلِهِ مَسْرُورًا (13)"));
        alensheqaqs.add(new Alensheqaq("إِنَّهُ ظَنَّ أَنْ لَنْ يَحُورَ (14)"));
        alensheqaqs.add(new Alensheqaq("بَلَى إِنَّ رَبَّهُ كَانَ بِهِ بَصِيرًا (15)"));
        alensheqaqs.add(new Alensheqaq("فَلَا أُقْسِمُ بِالشَّفَقِ (16)"));
        alensheqaqs.add(new Alensheqaq("وَاللَّيْلِ وَمَا وَسَقَ (17)"));
        alensheqaqs.add(new Alensheqaq("وَالْقَمَرِ إِذَا اتَّسَقَ (18)"));
        alensheqaqs.add(new Alensheqaq("لَتَرْكَبُنَّ طَبَقًا عَنْ طَبَقٍ (19)"));
        alensheqaqs.add(new Alensheqaq("فَمَا لَهُمْ لَا يُؤْمِنُونَ (20)"));
        alensheqaqs.add(new Alensheqaq("وَإِذَا قُرِئَ عَلَيْهِمُ الْقُرْآَنُ لَا يَسْجُدُونَ (21)"));
        alensheqaqs.add(new Alensheqaq("بَلِ الَّذِينَ كَفَرُوا يُكَذِّبُونَ (22)"));
        alensheqaqs.add(new Alensheqaq("وَاللَّهُ أَعْلَمُ بِمَا يُوعُونَ (23)"));
        alensheqaqs.add(new Alensheqaq("فَبَشِّرْهُمْ بِعَذَابٍ أَلِيمٍ (24)"));
        alensheqaqs.add(new Alensheqaq("إِلَّا الَّذِينَ آَمَنُوا وَعَمِلُوا الصَّالِحَاتِ لَهُمْ أَجْرٌ غَيْرُ مَمْنُونٍ (25)"));

        quran_text_84_adapter = new quran_text_84_adapter(alensheqaqs ,QuranText_84Activity.this);

        recyclerView = findViewById(R.id.rv_84);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_84Activity.this));
        recyclerView.setAdapter(quran_text_84_adapter);


    }

}