package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_109Activity extends AppCompatActivity {

    ArrayList<AlkaferonEx> alkaferonExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_109_adapter quran_explanation_109_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_109);

        alkaferonExes.add(new AlkaferonEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيم"));
        alkaferonExes.add(new AlkaferonEx("قُلْ يَاأَيُّهَا الْكَافِرُونَ (1)"));
        alkaferonExes.add(new AlkaferonEx("قل -أيها الرسول- للذين كفروا بالله ورسوله: يا أيها الكافرون بالله."));
        alkaferonExes.add(new AlkaferonEx("لَا أَعْبُدُ مَا تَعْبُدُونَ (2)"));
        alkaferonExes.add(new AlkaferonEx("لا أعبد ما تعبدون من الأصنام والآلهة الزائفة."));
        alkaferonExes.add(new AlkaferonEx("وَلَا أَنْتُمْ عَابِدُونَ مَا أَعْبُدُ (3)"));
        alkaferonExes.add(new AlkaferonEx("ولا أنتم عابدون ما أعبد من إله واحد، هو الله رب العالمين المستحق وحده للعبادة."));
        alkaferonExes.add(new AlkaferonEx("وَلَا أَنَا عَابِدٌ مَا عَبَدْتُمْ (4)"));
        alkaferonExes.add(new AlkaferonEx("ولا أنا عابد ما عبدتم من الأصنام والآلهة الباطلة."));
        alkaferonExes.add(new AlkaferonEx("وَلَا أَنْتُمْ عَابِدُونَ مَا أَعْبُدُ (5)"));
        alkaferonExes.add(new AlkaferonEx("ولا أنتم عابدون مستقبلا ما أعبد.\n" +
                "وهذه الآية نزلت في أشخاص بأعيانهم من المشركين، قد علم الله أنهم لا يؤمنون أبدًا.\n"));
        alkaferonExes.add(new AlkaferonEx("لَكُمْ دِينُكُمْ وَلِيَ دِينِ (6)"));
        alkaferonExes.add(new AlkaferonEx("لكم دينكم الذي أصررتم على اتباعه، ولي ديني الذي لا أبغي غيره."));


        quran_explanation_109_adapter = new quran_explanation_109_adapter(alkaferonExes ,QuranExplanation_109Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_109);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_109Activity.this));
        recyclerView.setAdapter(quran_explanation_109_adapter);


    }

}