package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_82Activity extends AppCompatActivity {

    ArrayList<Alenfetar> alenfetars = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_82_adapter quran_text_82_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_82);

        alenfetars.add(new Alenfetar("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alenfetars.add(new Alenfetar("إِذَا السَّمَاءُ انْفَطَرَتْ (1)"));
        alenfetars.add(new Alenfetar("وَإِذَا الْكَوَاكِبُ انْتَثَرَتْ (2)"));
        alenfetars.add(new Alenfetar("وَإِذَا الْبِحَارُ فُجِّرَتْ (3)"));
        alenfetars.add(new Alenfetar("وَإِذَا الْقُبُورُ بُعْثِرَتْ (4)"));
        alenfetars.add(new Alenfetar("عَلِمَتْ نَفْسٌ مَا قَدَّمَتْ وَأَخَّرَتْ (5)"));
        alenfetars.add(new Alenfetar("يَا أَيُّهَا الْإِنْسَانُ مَا غَرَّكَ بِرَبِّكَ الْكَرِيمِ (6)"));
        alenfetars.add(new Alenfetar("الَّذِي خَلَقَكَ فَسَوَّاكَ فَعَدَلَكَ (7)"));
        alenfetars.add(new Alenfetar("فِي أَيِّ صُورَةٍ مَا شَاءَ رَكَّبَكَ (8)"));
        alenfetars.add(new Alenfetar("كَلَّا بَلْ تُكَذِّبُونَ بِالدِّينِ (9)"));
        alenfetars.add(new Alenfetar("وَإِنَّ عَلَيْكُمْ لَحَافِظِينَ (10)"));
        alenfetars.add(new Alenfetar("كِرَامًا كَاتِبِينَ (11)"));
        alenfetars.add(new Alenfetar("يَعْلَمُونَ مَا تَفْعَلُونَ (12)"));
        alenfetars.add(new Alenfetar("إِنَّ الْأَبْرَارَ لَفِي نَعِيمٍ (13)"));
        alenfetars.add(new Alenfetar("وَإِنَّ الْفُجَّارَ لَفِي جَحِيمٍ (14)"));
        alenfetars.add(new Alenfetar("يَصْلَوْنَهَا يَوْمَ الدِّينِ (15)"));
        alenfetars.add(new Alenfetar("وَمَا هُمْ عَنْهَا بِغَائِبِينَ (16)"));
        alenfetars.add(new Alenfetar("وَمَا أَدْرَاكَ مَا يَوْمُ الدِّينِ (17)"));
        alenfetars.add(new Alenfetar("ثُمَّ مَا أَدْرَاكَ مَا يَوْمُ الدِّينِ (18)"));
        alenfetars.add(new Alenfetar("يَوْمَ لَا تَمْلِكُ نَفْسٌ لِنَفْسٍ شَيْئًا وَالْأَمْرُ يَوْمَئِذٍ لِلَّهِ (19)"));


        quran_text_82_adapter = new quran_text_82_adapter(alenfetars ,QuranText_82Activity.this);

        recyclerView = findViewById(R.id.rv_82);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_82Activity.this));
        recyclerView.setAdapter(quran_text_82_adapter);


    }

}