package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_110Activity extends AppCompatActivity {

    ArrayList<AlnasrEx> alnasrExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_110_adapter quran_explanation_110_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_110);

        alnasrExes.add(new AlnasrEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيم"));
        alnasrExes.add(new AlnasrEx("إِذَا جَاءَ نَصْرُ اللَّهِ وَالْفَتْحُ (1)"));
        alnasrExes.add(new AlnasrEx("إذا تمَّ لك -أيها الرسول- النصر على كفار قريش، وتم لك فتح «مكة» ."));
        alnasrExes.add(new AlnasrEx("وَرَأَيْتَ النَّاسَ يَدْخُلُونَ فِي دِينِ اللَّهِ أَفْوَاجًا (2)"));
        alnasrExes.add(new AlnasrEx("ورأيت الكثير من الناس يدخلون في الإسلام جماعات جماعات."));
        alnasrExes.add(new AlnasrEx("فَسَبِّحْ بِحَمْدِ رَبِّكَ وَاسْتَغْفِرْهُ إِنَّهُ كَانَ تَوَّابًا (3)"));
        alnasrExes.add(new AlnasrEx("إذا وقع ذلك فتهيأ للقاء ربك بالإكثار من التسبيح بحمده والإكثار من استغفاره، إنه كان كثير التوبة على المسبحين والمستغفرين، يتوب عليهم ويرحمهم ويقبل توبتهم."));


        quran_explanation_110_adapter = new quran_explanation_110_adapter(alnasrExes ,QuranExplanation_110Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_110);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_110Activity.this));
        recyclerView.setAdapter(quran_explanation_110_adapter);


    }

}