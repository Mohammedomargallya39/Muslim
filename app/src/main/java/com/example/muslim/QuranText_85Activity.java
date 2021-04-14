package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_85Activity extends AppCompatActivity {

    ArrayList<Alborog> alborogs = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_85_adapter quran_text_85_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_85);

        alborogs.add(new Alborog("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alborogs.add(new Alborog("وَالسَّمَاءِ ذَاتِ الْبُرُوجِ (1)"));
        alborogs.add(new Alborog("وَالْيَوْمِ الْمَوْعُودِ (2)"));
        alborogs.add(new Alborog("وَشَاهِدٍ وَمَشْهُودٍ (3)"));
        alborogs.add(new Alborog("قُتِلَ أَصْحَابُ الْأُخْدُودِ (4)"));
        alborogs.add(new Alborog("النَّارِ ذَاتِ الْوَقُودِ (5)"));
        alborogs.add(new Alborog("إِذْ هُمْ عَلَيْهَا قُعُودٌ (6)"));
        alborogs.add(new Alborog("وَهُمْ عَلَى مَا يَفْعَلُونَ بِالْمُؤْمِنِينَ شُهُودٌ (7)"));
        alborogs.add(new Alborog("وَمَا نَقَمُوا مِنْهُمْ إِلَّا أَنْ يُؤْمِنُوا بِاللَّهِ الْعَزِيزِ الْحَمِيدِ (8)"));
        alborogs.add(new Alborog("الَّذِي لَهُ مُلْكُ السَّمَاوَاتِ وَالْأَرْضِ وَاللَّهُ عَلَى كُلِّ شَيْءٍ شَهِيدٌ (9)"));
        alborogs.add(new Alborog("إِنَّ الَّذِينَ فَتَنُوا الْمُؤْمِنِينَ وَالْمُؤْمِنَاتِ ثُمَّ لَمْ يَتُوبُوا فَلَهُمْ عَذَابُ جَهَنَّمَ وَلَهُمْ عَذَابُ الْحَرِيقِ (10)"));
        alborogs.add(new Alborog("إِنَّ الَّذِينَ آَمَنُوا وَعَمِلُوا الصَّالِحَاتِ لَهُمْ جَنَّاتٌ تَجْرِي مِنْ تَحْتِهَا الْأَنْهَارُ ذَلِكَ الْفَوْزُ الْكَبِيرُ (11)"));
        alborogs.add(new Alborog("إِنَّ بَطْشَ رَبِّكَ لَشَدِيدٌ (12)"));
        alborogs.add(new Alborog("إِنَّهُ هُوَ يُبْدِئُ وَيُعِيدُ (13)"));
        alborogs.add(new Alborog("وَهُوَ الْغَفُورُ الْوَدُودُ (14)"));
        alborogs.add(new Alborog("ذُو الْعَرْشِ الْمَجِيدُ (15)"));
        alborogs.add(new Alborog("فَعَّالٌ لِمَا يُرِيدُ (16)"));
        alborogs.add(new Alborog("هَلْ أَتَاكَ حَدِيثُ الْجُنُودِ (17)"));
        alborogs.add(new Alborog("فِرْعَوْنَ وَثَمُودَ (18)"));
        alborogs.add(new Alborog("بَلِ الَّذِينَ كَفَرُوا فِي تَكْذِيبٍ (19)"));
        alborogs.add(new Alborog("وَاللَّهُ مِنْ وَرَائِهِمْ مُحِيطٌ (20)"));
        alborogs.add(new Alborog("بَلْ هُوَ قُرْآَنٌ مَجِيدٌ (21)"));
        alborogs.add(new Alborog("فِي لَوْحٍ مَحْفُوظٍ (22)"));

        quran_text_85_adapter = new quran_text_85_adapter(alborogs ,QuranText_85Activity.this);

        recyclerView = findViewById(R.id.rv_85);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_85Activity.this));
        recyclerView.setAdapter(quran_text_85_adapter);


    }

}