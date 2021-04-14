package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_90Activity extends AppCompatActivity {

    ArrayList<Albalad> albalads = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_90_adapter quran_text_90_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_90);

        albalads.add(new Albalad("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        albalads.add(new Albalad("لَا أُقْسِمُ بِهَذَا الْبَلَدِ (1)"));
        albalads.add(new Albalad("وَأَنْتَ حِلٌّ بِهَذَا الْبَلَدِ (2)"));
        albalads.add(new Albalad("وَوَالِدٍ وَمَا وَلَدَ (3)"));
        albalads.add(new Albalad("لَقَدْ خَلَقْنَا الْإِنْسَانَ فِي كَبَدٍ (4)"));
        albalads.add(new Albalad("أَيَحْسَبُ أَنْ لَنْ يَقْدِرَ عَلَيْهِ أَحَدٌ (5)"));
        albalads.add(new Albalad("يَقُولُ أَهْلَكْتُ مَالًا لُبَدًا (6)"));
        albalads.add(new Albalad("أَيَحْسَبُ أَنْ لَمْ يَرَهُ أَحَدٌ (7)"));
        albalads.add(new Albalad("أَلَمْ نَجْعَلْ لَهُ عَيْنَيْنِ (8)"));
        albalads.add(new Albalad("وَلِسَانًا وَشَفَتَيْنِ (9)"));
        albalads.add(new Albalad("وَهَدَيْنَاهُ النَّجْدَيْنِ (10)"));
        albalads.add(new Albalad("فَلَا اقْتَحَمَ الْعَقَبَةَ (11)"));
        albalads.add(new Albalad("وَمَا أَدْرَاكَ مَا الْعَقَبَةُ (12)"));
        albalads.add(new Albalad("فَكُّ رَقَبَةٍ (13)"));
        albalads.add(new Albalad("أَوْ إِطْعَامٌ فِي يَوْمٍ ذِي مَسْغَبَةٍ (14)"));
        albalads.add(new Albalad("يَتِيمًا ذَا مَقْرَبَةٍ (15)"));
        albalads.add(new Albalad("أَوْ مِسْكِينًا ذَا مَتْرَبَةٍ (16)"));
        albalads.add(new Albalad("ثُمَّ كَانَ مِنَ الَّذِينَ آَمَنُوا وَتَوَاصَوْا بِالصَّبْرِ وَتَوَاصَوْا بِالْمَرْحَمَةِ (17)"));
        albalads.add(new Albalad("أُولَئِكَ أَصْحَابُ الْمَيْمَنَةِ (18)"));
        albalads.add(new Albalad("وَالَّذِينَ كَفَرُوا بِآَيَاتِنَا هُمْ أَصْحَابُ الْمَشْأَمَةِ (19)"));
        albalads.add(new Albalad("عَلَيْهِمْ نَارٌ مُؤْصَدَةٌ (20)"));



        quran_text_90_adapter = new quran_text_90_adapter(albalads ,QuranText_90Activity.this);

        recyclerView = findViewById(R.id.rv_90);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_90Activity.this));
        recyclerView.setAdapter(quran_text_90_adapter);


    }

}