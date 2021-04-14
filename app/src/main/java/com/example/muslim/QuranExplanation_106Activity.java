package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_106Activity extends AppCompatActivity {

    ArrayList<QoraishEx> qoraishExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_106_adapter quran_explanation_106_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_106);

        qoraishExes.add(new QoraishEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ (1)"));
        qoraishExes.add(new QoraishEx("لِإِيلَافِ قُرَيْشٍ (1)"));
        qoraishExes.add(new QoraishEx("اعْجَبوا لإلف قريش، وأمنهم، واستقامة مصالحهم."));
        qoraishExes.add(new QoraishEx("إِيلَافِهِمْ رِحْلَةَ الشِّتَاءِ وَالصَّيْفِ (2)"));
        qoraishExes.add(new QoraishEx("وانتظام رحلتيهم في الشتاء إلى «اليمن» ، وفي الصيف إلى «الشام» ، وتيسير ذلك; لجلب ما يحتاجون إليه."));
        qoraishExes.add(new QoraishEx("فَلْيَعْبُدُوا رَبَّ هَذَا الْبَيْتِ (3)"));
        qoraishExes.add(new QoraishEx("فليشكروا، وليعبدوا رب هذا البيت الذي يعتزون به -وهو الكعبة-، وبسببه نالوا الشرف والرفعة، وليوحدوه ويخلصوا له العبادة."));
        qoraishExes.add(new QoraishEx("الَّذِي أَطْعَمَهُمْ مِنْ جُوعٍ وَآمَنَهُمْ مِنْ خَوْفٍ (4)"));
        qoraishExes.add(new QoraishEx("الذي أطعمهم من جوع شديد، وآمنهم من فزع وخوف عظيم."));


        quran_explanation_106_adapter = new quran_explanation_106_adapter(qoraishExes ,QuranExplanation_106Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_106);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_106Activity.this));
        recyclerView.setAdapter(quran_explanation_106_adapter);


    }

}