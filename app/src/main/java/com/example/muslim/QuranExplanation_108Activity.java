package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_108Activity extends AppCompatActivity {

    ArrayList<AlkautharEx> alkautharExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_108_adapter quran_explanation_108_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_108);

        alkautharExes.add(new AlkautharEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alkautharExes.add(new AlkautharEx("إِنَّا أَعْطَيْنَاكَ الْكَوْثَرَ (1)"));
        alkautharExes.add(new AlkautharEx("إنا أعطيناك -أيها النبي- الخير الكثير في الدنيا والآخرة، ومن ذلك نهر الكوثر في الجنة الذي حافتاه خيام اللؤلؤ المجوَّف، وطينه المسك."));
        alkautharExes.add(new AlkautharEx("فَصَلِّ لِرَبِّكَ وَانْحَرْ (2)"));
        alkautharExes.add(new AlkautharEx("فأخلص لربك صلاتك كلها، واذبح ذبيحتك له وعلى اسمه وحده."));
        alkautharExes.add(new AlkautharEx("إِنَّ شَانِئَكَ هُوَ الْأَبْتَرُ (3)"));
        alkautharExes.add(new AlkautharEx("إن مبغضك ومبغض ما جئت به من الهدى والنور، هو المنقطع أثره، المقطوع من كل خير."));



        quran_explanation_108_adapter = new quran_explanation_108_adapter(alkautharExes ,QuranExplanation_108Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_108);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_108Activity.this));
        recyclerView.setAdapter(quran_explanation_108_adapter);


    }

}