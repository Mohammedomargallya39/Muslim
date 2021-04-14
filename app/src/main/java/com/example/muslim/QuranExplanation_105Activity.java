package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_105Activity extends AppCompatActivity {

    ArrayList<AlfelEx> alfelExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_105_adapter quran_explanation_105_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_105);

        alfelExes.add(new AlfelEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيم"));
        alfelExes.add(new AlfelEx("أَلَمْ تَرَ كَيْفَ فَعَلَ رَبُّكَ بِأَصْحَابِ الْفِيلِ (1)"));
        alfelExes.add(new AlfelEx("ألم تعلم -أيها الرسول- كيف فعل ربك بأصحاب الفيل: أبرهة الحبشي وجيشه الذين أرادوا تدمير الكعبة المباركة؟"));
        alfelExes.add(new AlfelEx("أَلَمْ يَجْعَلْ كَيْدَهُمْ فِي تَضْلِيلٍ (2)"));
        alfelExes.add(new AlfelEx("ألم يجعل ما دبَّروه من شر في إبطال وتضييع؟"));
        alfelExes.add(new AlfelEx("وَأَرْسَلَ عَلَيْهِمْ طَيْرًا أَبَابِيلَ (3)"));
        alfelExes.add(new AlfelEx("وبعث عليهم طيرًا في جماعات متتابعة."));
        alfelExes.add(new AlfelEx("تَرْمِيهِمْ بِحِجَارَةٍ مِنْ سِجِّيلٍ (4)"));
        alfelExes.add(new AlfelEx("تقذفهم بحجارة من طين متحجِّر."));
        alfelExes.add(new AlfelEx("فَجَعَلَهُمْ كَعَصْفٍ مَأْكُولٍ (5)"));
        alfelExes.add(new AlfelEx("فجعلهم به محطمين كأوراق الزرع اليابسة التي أكلتها البهائم ثم رمت بها."));


        quran_explanation_105_adapter = new quran_explanation_105_adapter(alfelExes ,QuranExplanation_105Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_105);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_105Activity.this));
        recyclerView.setAdapter(quran_explanation_105_adapter);


    }

}