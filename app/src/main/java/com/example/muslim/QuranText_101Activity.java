package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_101Activity extends AppCompatActivity {

    ArrayList<Alkareaa> alkareaas = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_101_adapter quran_text_101_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_101);

        alkareaas.add(new Alkareaa("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alkareaas.add(new Alkareaa("الْقَارِعَةُ (1)"));
        alkareaas.add(new Alkareaa("مَا الْقَارِعَةُ (2)"));
        alkareaas.add(new Alkareaa("وَمَا أَدْرَاكَ مَا الْقَارِعَةُ (3)"));
        alkareaas.add(new Alkareaa("يَوْمَ يَكُونُ النَّاسُ كَالْفَرَاشِ الْمَبْثُوثِ (4)"));
        alkareaas.add(new Alkareaa("وَتَكُونُ الْجِبَالُ كَالْعِهْنِ الْمَنْفُوشِ (5)"));
        alkareaas.add(new Alkareaa("فَأَمَّا مَنْ ثَقُلَتْ مَوَازِينُهُ (6)"));
        alkareaas.add(new Alkareaa("فَهُوَ فِي عِيشَةٍ رَاضِيَةٍ (7)"));
        alkareaas.add(new Alkareaa("وَأَمَّا مَنْ خَفَّتْ مَوَازِينُهُ (8)"));
        alkareaas.add(new Alkareaa("فَأُمُّهُ هَاوِيَةٌ (9)"));
        alkareaas.add(new Alkareaa("وَمَا أَدْرَاكَ مَا هِيَهْ (10)"));
        alkareaas.add(new Alkareaa("نَارٌ حَامِيَةٌ (11)"));

        quran_text_101_adapter = new quran_text_101_adapter(alkareaas ,QuranText_101Activity.this);

        recyclerView = findViewById(R.id.rv_101);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_101Activity.this));
        recyclerView.setAdapter(quran_text_101_adapter);


    }

}