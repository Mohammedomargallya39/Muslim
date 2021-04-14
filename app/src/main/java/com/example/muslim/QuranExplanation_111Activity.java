package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_111Activity extends AppCompatActivity {

    ArrayList<AlmasadEx> almasadExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_111_adapter quran_explanation_111_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_111);

        almasadExes.add(new AlmasadEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيم"));
        almasadExes.add(new AlmasadEx("تَبَّتْ يَدَا أَبِي لَهَبٍ وَتَبَّ (1)"));
        almasadExes.add(new AlmasadEx("خسرت يدا أبي لهب وشقي بإيذائه رسول الله محمدا صلى الله عليه وسلم، وقد تحقق خسران أبي لهب."));
        almasadExes.add(new AlmasadEx("مَا أَغْنَى عَنْهُ مَالُهُ وَمَا كَسَبَ (2)"));
        almasadExes.add(new AlmasadEx("ما أغنى عنه ماله وولده، فلن يَرُدَّا عنه شيئًا من عذاب الله إذا نزل به."));
        almasadExes.add(new AlmasadEx("سَيَصْلَى نَارًا ذَاتَ لَهَبٍ (3)"));
        almasadExes.add(new AlmasadEx("سيدخل نارًا جهنم ذات اللَّهب المشتعل."));
        almasadExes.add(new AlmasadEx("وَامْرَأَتُهُ حَمَّالَةَ الْحَطَبِ (4)"));
        almasadExes.add(new AlmasadEx("هو وامرأته التي كانت تحمل الشوك، فتطرحه في طريق النبي صلى الله عليه وسلم؛ لأذيَّته."));
        almasadExes.add(new AlmasadEx("فِي جِيدِهَا حَبْلٌ مِنْ مَسَدٍ (5)"));
        almasadExes.add(new AlmasadEx("في عنقها حبل محكم الفَتْلِ مِن ليف شديد خشن، تُرْفَع به في نار جهنم، ثم تُرْمى إلى أسفلها."));



        quran_explanation_111_adapter = new quran_explanation_111_adapter(almasadExes ,QuranExplanation_111Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_111);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_111Activity.this));
        recyclerView.setAdapter(quran_explanation_111_adapter);


    }

}