package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_87Activity extends AppCompatActivity {

    ArrayList<Alaala> alaalas = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_87_adapter quran_text_87_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_87);

        alaalas.add(new Alaala("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alaalas.add(new Alaala("سَبِّحِ اسْمَ رَبِّكَ الْأَعْلَى (1)"));
        alaalas.add(new Alaala("الَّذِي خَلَقَ فَسَوَّى (2)"));
        alaalas.add(new Alaala("وَالَّذِي قَدَّرَ فَهَدَى (3)"));
        alaalas.add(new Alaala("وَالَّذِي أَخْرَجَ الْمَرْعَى (4)"));
        alaalas.add(new Alaala("فَجَعَلَهُ غُثَاءً أَحْوَى (5)"));
        alaalas.add(new Alaala("سَنُقْرِئُكَ فَلَا تَنْسَى (6)"));
        alaalas.add(new Alaala("إِلَّا مَا شَاءَ اللَّهُ إِنَّهُ يَعْلَمُ الْجَهْرَ وَمَا يَخْفَى (7)"));
        alaalas.add(new Alaala("وَنُيَسِّرُكَ لِلْيُسْرَى (8)"));
        alaalas.add(new Alaala("فَذَكِّرْ إِنْ نَفَعَتِ الذِّكْرَى (9)"));
        alaalas.add(new Alaala("سَيَذَّكَّرُ مَنْ يَخْشَى (10)"));
        alaalas.add(new Alaala("وَيَتَجَنَّبُهَا الْأَشْقَى (11)"));
        alaalas.add(new Alaala("الَّذِي يَصْلَى النَّارَ الْكُبْرَى (12)"));
        alaalas.add(new Alaala("ثُمَّ لَا يَمُوتُ فِيهَا وَلَا يَحْيَا (13)"));
        alaalas.add(new Alaala("قَدْ أَفْلَحَ مَنْ تَزَكَّى (14)"));
        alaalas.add(new Alaala("وَذَكَرَ اسْمَ رَبِّهِ فَصَلَّى (15)"));
        alaalas.add(new Alaala("بَلْ تُؤْثِرُونَ الْحَيَاةَ الدُّنْيَا (16)"));
        alaalas.add(new Alaala("وَالْآَخِرَةُ خَيْرٌ وَأَبْقَى (17)"));
        alaalas.add(new Alaala("إِنَّ هَذَا لَفِي الصُّحُفِ الْأُولَى (18)"));
        alaalas.add(new Alaala("صُحُفِ إِبْرَاهِيمَ وَمُوسَى (19)"));


        quran_text_87_adapter = new quran_text_87_adapter(alaalas ,QuranText_87Activity.this);

        recyclerView = findViewById(R.id.rv_87);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_87Activity.this));
        recyclerView.setAdapter(quran_text_87_adapter);


    }

}