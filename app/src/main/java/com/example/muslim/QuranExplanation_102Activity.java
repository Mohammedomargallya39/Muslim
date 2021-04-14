package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_102Activity extends AppCompatActivity {

    ArrayList<AltkathorEx> altkathorExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_102_adapter quran_explanation_102_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_102);

        altkathorExes.add(new AltkathorEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        altkathorExes.add(new AltkathorEx("أَلْهَاكُمُ التَّكَاثُرُ (1)"));
        altkathorExes.add(new AltkathorEx("شغلكم عن طاعة الله التفاخر بكثرة الأموال والأولاد."));
        altkathorExes.add(new AltkathorEx("حَتَّى زُرْتُمُ الْمَقَابِرَ (2)"));
        altkathorExes.add(new AltkathorEx("واستمر اشتغالكم بذلك إلى أن صرتم إلى المقابر، ودُفنتم فيها."));
        altkathorExes.add(new AltkathorEx("كَلَّا سَوْفَ تَعْلَمُونَ (3)"));
        altkathorExes.add(new AltkathorEx("ما هكذا ينبغي أن يُلْهيكم التكاثر بالأموال، سوف تتبيَّنون أن الدار الآخرة خير لكم."));
        altkathorExes.add(new AltkathorEx("ثُمَّ كَلَّا سَوْفَ تَعْلَمُونَ (4)"));
        altkathorExes.add(new AltkathorEx("ثم احذروا سوف تعلمون سوء عاقبة انشغالكم عنها."));
        altkathorExes.add(new AltkathorEx("كَلَّا لَوْ تَعْلَمُونَ عِلْمَ الْيَقِينِ (5)"));
        altkathorExes.add(new AltkathorEx("ما هكذا ينبغي أن يلهيكم التكاثر بالأموال، لو تعلمون حق العلم لانزجرتم، ولبادرتم إلى إنقاذ أنفسكم من الهلاك."));
        altkathorExes.add(new AltkathorEx("لَتَرَوُنَّ الْجَحِيمَ (6)"));
        altkathorExes.add(new AltkathorEx("لتبصرُنَّ الجحيم."));
        altkathorExes.add(new AltkathorEx("ثُمَّ لَتَرَوُنَّهَا عَيْنَ الْيَقِينِ (7)"));
        altkathorExes.add(new AltkathorEx("ثم لتبصرُنَّها دون ريب."));
        altkathorExes.add(new AltkathorEx("ثُمَّ لَتُسْأَلُنَّ يَوْمَئِذٍ عَنِ النَّعِيمِ (8)"));
        altkathorExes.add(new AltkathorEx("ثم لتسألُنَّ يوم القيامة عن كل أنواع النعيم."));


        quran_explanation_102_adapter = new quran_explanation_102_adapter(altkathorExes ,QuranExplanation_102Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_102);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_102Activity.this));
        recyclerView.setAdapter(quran_explanation_102_adapter);


    }

}