package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_113Activity extends AppCompatActivity {

    ArrayList<AlfalaqEx> alfalaqExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_113_adapter quran_explanation_113_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_113);

        alfalaqExes.add(new AlfalaqEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alfalaqExes.add(new AlfalaqEx("قُلْ أَعُوذُ بِرَبِّ الْفَلَقِ (1)"));
        alfalaqExes.add(new AlfalaqEx("قل -أيها الرسول-: أعوذ وأعتصم برب الفلق، وهو الصبح."));
        alfalaqExes.add(new AlfalaqEx("مِنْ شَرِّ مَا خَلَقَ (2)"));
        alfalaqExes.add(new AlfalaqEx("من شر جميع المخلوقات وأذاها."));
        alfalaqExes.add(new AlfalaqEx("وَمِنْ شَرِّ غَاسِقٍ إِذَا وَقَبَ (3)"));
        alfalaqExes.add(new AlfalaqEx("ومن شر ليل شديد الظلمة إذا دخل وتغلغل، وما فيه من الشرور والمؤذيات."));
        alfalaqExes.add(new AlfalaqEx("وَمِنْ شَرِّ النَّفَّاثَاتِ فِي الْعُقَدِ (4)"));
        alfalaqExes.add(new AlfalaqEx("ومن شر الساحرات اللاتي ينفخن فيما يعقدن من عُقَد بقصد السحر."));
        alfalaqExes.add(new AlfalaqEx("وَمِنْ شَرِّ حَاسِدٍ إِذَا حَسَدَ (5)"));
        alfalaqExes.add(new AlfalaqEx("ومن شر حاسد مبغض للناس إذا حسدهم على ما وهبهم الله من نعم، وأراد زوالها عنهم، وإيقاع الأذى بهم."));


        quran_explanation_113_adapter = new quran_explanation_113_adapter(alfalaqExes ,QuranExplanation_113Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_113);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_113Activity.this));
        recyclerView.setAdapter(quran_explanation_113_adapter);


    }

}