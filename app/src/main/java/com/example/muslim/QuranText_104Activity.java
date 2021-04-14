package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_104Activity extends AppCompatActivity {

    ArrayList<Alhomza> alhomzas = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_104_adapter quran_text_104_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_104);

        alhomzas.add(new Alhomza("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alhomzas.add(new Alhomza("وَيْلٌ لِكُلِّ هُمَزَةٍ لُمَزَةٍ (1)"));
        alhomzas.add(new Alhomza("الَّذِي جَمَعَ مَالًا وَعَدَّدَهُ (2)"));
        alhomzas.add(new Alhomza("يَحْسَبُ أَنَّ مَالَهُ أَخْلَدَهُ (3)"));
        alhomzas.add(new Alhomza("كَلَّا لَيُنْبَذَنَّ فِي الْحُطَمَةِ (4)"));
        alhomzas.add(new Alhomza("وَمَا أَدْرَاكَ مَا الْحُطَمَةُ (5)"));
        alhomzas.add(new Alhomza("نَارُ اللَّهِ الْمُوقَدَةُ (6)"));
        alhomzas.add(new Alhomza("الَّتِي تَطَّلِعُ عَلَى الْأَفْئِدَةِ (7)"));
        alhomzas.add(new Alhomza("إِنَّهَا عَلَيْهِمْ مُؤْصَدَةٌ (8)"));
        alhomzas.add(new Alhomza("فِي عَمَدٍ مُمَدَّدَةٍ (9)"));

        quran_text_104_adapter = new quran_text_104_adapter(alhomzas ,QuranText_104Activity.this);

        recyclerView = findViewById(R.id.rv_104);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_104Activity.this));
        recyclerView.setAdapter(quran_text_104_adapter);


    }

}