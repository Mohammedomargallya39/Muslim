package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_92Activity extends AppCompatActivity {

    ArrayList<Allail> allails = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_92_adapter quran_text_92_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_92);

        allails.add(new Allail("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        allails.add(new Allail("وَاللَّيْلِ إِذَا يَغْشَى (1)"));
        allails.add(new Allail("وَالنَّهَارِ إِذَا تَجَلَّى (2)"));
        allails.add(new Allail("وَمَا خَلَقَ الذَّكَرَ وَالْأُنْثَى (3)"));
        allails.add(new Allail("إِنَّ سَعْيَكُمْ لَشَتَّى (4)"));
        allails.add(new Allail("فَأَمَّا مَنْ أَعْطَى وَاتَّقَى (5)"));
        allails.add(new Allail("وَصَدَّقَ بِالْحُسْنَى (6)"));
        allails.add(new Allail("فَسَنُيَسِّرُهُ لِلْيُسْرَى (7)"));
        allails.add(new Allail("وَأَمَّا مَنْ بَخِلَ وَاسْتَغْنَى (8)"));
        allails.add(new Allail("وَكَذَّبَ بِالْحُسْنَى (9)"));
        allails.add(new Allail("فَسَنُيَسِّرُهُ لِلْعُسْرَى (10)"));
        allails.add(new Allail("وَمَا يُغْنِي عَنْهُ مَالُهُ إِذَا تَرَدَّى (11)"));
        allails.add(new Allail("إِنَّ عَلَيْنَا لَلْهُدَى (12)"));
        allails.add(new Allail("وَإِنَّ لَنَا لَلْآَخِرَةَ وَالْأُولَى (13)"));
        allails.add(new Allail("فَأَنْذَرْتُكُمْ نَارًا تَلَظَّى (14)"));
        allails.add(new Allail("لَا يَصْلَاهَا إِلَّا الْأَشْقَى (15)"));
        allails.add(new Allail("الَّذِي كَذَّبَ وَتَوَلَّى (16)"));
        allails.add(new Allail("وَسَيُجَنَّبُهَا الْأَتْقَى (17)"));
        allails.add(new Allail("الَّذِي يُؤْتِي مَالَهُ يَتَزَكَّى (18)"));
        allails.add(new Allail("وَمَا لِأَحَدٍ عِنْدَهُ مِنْ نِعْمَةٍ تُجْزَى (19)"));
        allails.add(new Allail("إِلَّا ابْتِغَاءَ وَجْهِ رَبِّهِ الْأَعْلَى (20)"));
        allails.add(new Allail("وَلَسَوْفَ يَرْضَى (21)"));

        quran_text_92_adapter = new quran_text_92_adapter(allails ,QuranText_92Activity.this);

        recyclerView = findViewById(R.id.rv_92);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_92Activity.this));
        recyclerView.setAdapter(quran_text_92_adapter);


    }

}