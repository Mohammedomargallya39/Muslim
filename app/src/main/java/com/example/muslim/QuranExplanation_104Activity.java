package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_104Activity extends AppCompatActivity {

    ArrayList<AlhomazaEx> alhomazaExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_104_adapter quran_explanation_104_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_104);

        alhomazaExes.add(new AlhomazaEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alhomazaExes.add(new AlhomazaEx("وَيْلٌ لِكُلِّ هُمَزَةٍ لُمَزَةٍ (1)"));
        alhomazaExes.add(new AlhomazaEx("شر وهلاك لكل مغتاب للناس، طعان فيهم."));
        alhomazaExes.add(new AlhomazaEx("الَّذِي جَمَعَ مَالًا وَعَدَّدَهُ (2)"));
        alhomazaExes.add(new AlhomazaEx("الذي كان همُّه جمع المال وتعداده."));
        alhomazaExes.add(new AlhomazaEx("يَحْسَبُ أَنَّ مَالَهُ أَخْلَدَهُ (3)"));
        alhomazaExes.add(new AlhomazaEx("يظن أنه ضَمِنَ لنفسه بهذا المال الذي جمعه، الخلود في الدنيا والإفلات من الحساب."));
        alhomazaExes.add(new AlhomazaEx("كَلَّا لَيُنْبَذَنَّ فِي الْحُطَمَةِ (4)"));
        alhomazaExes.add(new AlhomazaEx("ليس الأمر كما ظن، ليُطرحنَّ في النار التي تهشم كل ما يُلْقى فيها."));
        alhomazaExes.add(new AlhomazaEx("وَمَا أَدْرَاكَ مَا الْحُطَمَةُ (5)"));
        alhomazaExes.add(new AlhomazaEx("وما أدراك -أيها الرسول- ما حقيقة النار؟"));
        alhomazaExes.add(new AlhomazaEx("نَارُ اللَّهِ الْمُوقَدَةُ (6)"));
        alhomazaExes.add(new AlhomazaEx("إنها نار الله المشتعلة الشديدة اللهب."));
        alhomazaExes.add(new AlhomazaEx("الَّتِي تَطَّلِعُ عَلَى الْأَفْئِدَةِ (7)"));
        alhomazaExes.add(new AlhomazaEx("التي من شدة حرها تنفُذ من الأجسام إلى القلوب."));
        alhomazaExes.add(new AlhomazaEx("إِنَّهَا عَلَيْهِمْ مُؤْصَدَةٌ (8)"));
        alhomazaExes.add(new AlhomazaEx("إنها عليهم مطبَقة."));
        alhomazaExes.add(new AlhomazaEx("فِي عَمَدٍ مُمَدَّدَةٍ (9)"));
        alhomazaExes.add(new AlhomazaEx("لئلا يخرجوا منها."));


        quran_explanation_104_adapter = new quran_explanation_104_adapter(alhomazaExes ,QuranExplanation_104Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_104);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_104Activity.this));
        recyclerView.setAdapter(quran_explanation_104_adapter);


    }

}