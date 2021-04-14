package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_114Activity extends AppCompatActivity {

    ArrayList<AlnasEx> alnasExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_114_adapter quran_explanation_114_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_114);

        alnasExes.add(new AlnasEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيم"));
        alnasExes.add(new AlnasEx("قُلْ أَعُوذُ بِرَبِّ النَّاسِ (1)"));
        alnasExes.add(new AlnasEx("قل -أيها الرسول-: أعوذ وأعتصم برب الناس، القادر وحده على ردِّ شر الوسواس."));
        alnasExes.add(new AlnasEx("مَلِكِ النَّاسِ (2)"));
        alnasExes.add(new AlnasEx("ملك الناس المتصرف في كل شؤونهم، الغنيِّ عنهم."));
        alnasExes.add(new AlnasEx("إِلَهِ النَّاسِ (3)"));
        alnasExes.add(new AlnasEx("إله الناس الذي لا معبود بحق سواه."));
        alnasExes.add(new AlnasEx("مِنْ شَرِّ الْوَسْوَاسِ الْخَنَّاسِ (4)"));
        alnasExes.add(new AlnasEx("من أذى الشيطان الذي يوسوس عند الغفلة، ويختفي عند ذكر الله."));
        alnasExes.add(new AlnasEx("الَّذِي يُوَسْوِسُ فِي صُدُورِ النَّاسِ (5)"));
        alnasExes.add(new AlnasEx("الذي يبثُّ الشر والشكوك في صدور الناس."));
        alnasExes.add(new AlnasEx("مِنَ الْجِنَّةِ وَالنَّاسِ (6)"));
        alnasExes.add(new AlnasEx("من شياطين الجن والإنس."));

        quran_explanation_114_adapter = new quran_explanation_114_adapter(alnasExes ,QuranExplanation_114Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_114);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_114Activity.this));
        recyclerView.setAdapter(quran_explanation_114_adapter);


    }

}