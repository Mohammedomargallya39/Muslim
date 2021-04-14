package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_91Activity extends AppCompatActivity {

    ArrayList<Alshams> alshams = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_91_adapter quran_text_91_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_91);

        alshams.add(new Alshams("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alshams.add(new Alshams("وَالشَّمْسِ وَضُحَاهَا (1)"));
        alshams.add(new Alshams("وَالْقَمَرِ إِذَا تَلَاهَا (2)"));
        alshams.add(new Alshams("وَالنَّهَارِ إِذَا جَلَّاهَا (3)"));
        alshams.add(new Alshams("وَاللَّيْلِ إِذَا يَغْشَاهَا (4)"));
        alshams.add(new Alshams("وَالسَّمَاءِ وَمَا بَنَاهَا (5)"));
        alshams.add(new Alshams("وَالْأَرْضِ وَمَا طَحَاهَا (6)"));
        alshams.add(new Alshams("وَنَفْسٍ وَمَا سَوَّاهَا (7)"));
        alshams.add(new Alshams("فَأَلْهَمَهَا فُجُورَهَا وَتَقْوَاهَا (8)"));
        alshams.add(new Alshams("قَدْ أَفْلَحَ مَنْ زَكَّاهَا (9)"));
        alshams.add(new Alshams("وَقَدْ خَابَ مَنْ دَسَّاهَا (10)"));
        alshams.add(new Alshams("كَذَّبَتْ ثَمُودُ بِطَغْوَاهَا (11)"));
        alshams.add(new Alshams("إِذِ انْبَعَثَ أَشْقَاهَا (12)"));
        alshams.add(new Alshams("فَقَالَ لَهُمْ رَسُولُ اللَّهِ نَاقَةَ اللَّهِ وَسُقْيَاهَا (13)"));
        alshams.add(new Alshams("فَكَذَّبُوهُ فَعَقَرُوهَا فَدَمْدَمَ عَلَيْهِمْ رَبُّهُمْ بِذَنْبِهِمْ فَسَوَّاهَا (14)"));
        alshams.add(new Alshams("وَلَا يَخَافُ عُقْبَاهَا (15)"));


        quran_text_91_adapter = new quran_text_91_adapter(alshams ,QuranText_91Activity.this);

        recyclerView = findViewById(R.id.rv_91);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_91Activity.this));
        recyclerView.setAdapter(quran_text_91_adapter);


    }

}