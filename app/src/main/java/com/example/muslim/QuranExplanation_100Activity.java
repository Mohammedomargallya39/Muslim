package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_100Activity extends AppCompatActivity {

    ArrayList<AladiatEx> aladiatExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_100_adapter quran_explanation_100_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_100);

        aladiatExes.add(new AladiatEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        aladiatExes.add(new AladiatEx("وَالْعَادِيَاتِ ضَبْحًا (1)"));
        aladiatExes.add(new AladiatEx("أقسم الله تعالى بالخيل الجاريات في سبيله نحو العدوِّ، حين يظهر صوتها من سرعة عَدْوِها. ولا يجوز للمخلوق أن يقسم إلا بالله، فإن القسم بغير الله شرك."));
        aladiatExes.add(new AladiatEx("فَالْمُورِيَاتِ قَدْحًا (2)"));
        aladiatExes.add(new AladiatEx("فالخيل اللاتي تنقدح النار من صلابة حوافرها؛ من شدَّة عَدْوها."));
        aladiatExes.add(new AladiatEx("فَالْمُغِيرَاتِ صُبْحًا (3)"));
        aladiatExes.add(new AladiatEx("فالخيل التي تغير بركبانها على الأعداء عند الصبح."));
        aladiatExes.add(new AladiatEx("فَأَثَرْنَ بِهِ نَقْعًا (4)"));
        aladiatExes.add(new AladiatEx("فهيَّجْنَ بهذا العَدْو غبارًا."));
        aladiatExes.add(new AladiatEx("فَوَسَطْنَ بِهِ جَمْعًا (5)"));
        aladiatExes.add(new AladiatEx("فتوسَّطن بركبانهن جموع الأعداء."));
        aladiatExes.add(new AladiatEx("إِنَّ الْإِنْسَانَ لِرَبِّهِ لَكَنُودٌ (6)"));
        aladiatExes.add(new AladiatEx("إن الإنسان لِنعم ربه لَجحود."));
        aladiatExes.add(new AladiatEx("وَإِنَّهُ عَلَى ذَلِكَ لَشَهِيدٌ (7)"));
        aladiatExes.add(new AladiatEx("وإنه بجحوده ذلك لمقر."));
        aladiatExes.add(new AladiatEx("وَإِنَّهُ لِحُبِّ الْخَيْرِ لَشَدِيدٌ (8)"));
        aladiatExes.add(new AladiatEx("وإنه لحب المال لشديد."));
        aladiatExes.add(new AladiatEx("أَفَلَا يَعْلَمُ إِذَا بُعْثِرَ مَا فِي الْقُبُورِ (9)"));
        aladiatExes.add(new AladiatEx("أفلا يعلم الإنسان ما ينتظره إذا أخرج الله الأموات من القبور للحساب والجزاء؟"));
        aladiatExes.add(new AladiatEx("وَحُصِّلَ مَا فِي الصُّدُورِ (10)"));
        aladiatExes.add(new AladiatEx("واستُخرج ما استتر في الصدور من خير أو شر."));
        aladiatExes.add(new AladiatEx("إِنَّ رَبَّهُمْ بِهِمْ يَوْمَئِذٍ لَخَبِيرٌ (11)"));
        aladiatExes.add(new AladiatEx("إن ربهم بهم وبأعمالهم يومئذ لخبير، لا يخفى عليه شيء من ذلك."));



        quran_explanation_100_adapter = new quran_explanation_100_adapter(aladiatExes ,QuranExplanation_100Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_100);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_100Activity.this));
        recyclerView.setAdapter(quran_explanation_100_adapter);


    }

}