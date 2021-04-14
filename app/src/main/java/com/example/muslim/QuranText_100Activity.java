package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_100Activity extends AppCompatActivity {

    ArrayList<Aladiat> aladiats = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_100_adapter quran_text_100_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_100);

        aladiats.add(new Aladiat("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        aladiats.add(new Aladiat("وَالْعَادِيَاتِ ضَبْحًا (1)"));
        aladiats.add(new Aladiat("فَالْمُورِيَاتِ قَدْحًا (2)"));
        aladiats.add(new Aladiat("فَالْمُغِيرَاتِ صُبْحًا (3)"));
        aladiats.add(new Aladiat("فَأَثَرْنَ بِهِ نَقْعًا (4)"));
        aladiats.add(new Aladiat("فَوَسَطْنَ بِهِ جَمْعًا (5)"));
        aladiats.add(new Aladiat("إِنَّ الْإِنْسَانَ لِرَبِّهِ لَكَنُودٌ (6)"));
        aladiats.add(new Aladiat("وَإِنَّهُ عَلَى ذَلِكَ لَشَهِيدٌ (7)"));
        aladiats.add(new Aladiat("وَإِنَّهُ لِحُبِّ الْخَيْرِ لَشَدِيدٌ (8)"));
        aladiats.add(new Aladiat("أَفَلَا يَعْلَمُ إِذَا بُعْثِرَ مَا فِي الْقُبُورِ (9)"));
        aladiats.add(new Aladiat("وَحُصِّلَ مَا فِي الصُّدُورِ (10)"));
        aladiats.add(new Aladiat("إِنَّ رَبَّهُمْ بِهِمْ يَوْمَئِذٍ لَخَبِيرٌ (11)"));

        quran_text_100_adapter = new quran_text_100_adapter(aladiats ,QuranText_100Activity.this);

        recyclerView = findViewById(R.id.rv_100);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_100Activity.this));
        recyclerView.setAdapter(quran_text_100_adapter);


    }

}