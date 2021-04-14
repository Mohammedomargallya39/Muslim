package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_99Activity extends AppCompatActivity {

    ArrayList<AlzalzalahEx> alzalzalahExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_99_adapter quran_explanation_99_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_99);



        alzalzalahExes.add(new AlzalzalahEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alzalzalahExes.add(new AlzalzalahEx("إِذَا زُلْزِلَتِ الْأَرْضُ زِلْزَالَهَا (1)"));
        alzalzalahExes.add(new AlzalzalahEx("إذا رُجَّت الأرض رجًّا شديدًا."));
        alzalzalahExes.add(new AlzalzalahEx("وَأَخْرَجَتِ الْأَرْضُ أَثْقَالَهَا (2)"));
        alzalzalahExes.add(new AlzalzalahEx("وأخرجت ما في بطنها من موتى وكنوز."));
        alzalzalahExes.add(new AlzalzalahEx("وَقَالَ الْإِنْسَانُ مَا لَهَا (3)"));
        alzalzalahExes.add(new AlzalzalahEx("وتساءل الإنسان فزعًا: ما الذي حدث لها؟"));
        alzalzalahExes.add(new AlzalzalahEx("يَوْمَئِذٍ تُحَدِّثُ أَخْبَارَهَا (4)"));
        alzalzalahExes.add(new AlzalzalahEx("يوم القيامة تخبر الأرض بما عُمل عليها من خير أو شر."));
        alzalzalahExes.add(new AlzalzalahEx("بِأَنَّ رَبَّكَ أَوْحَى لَهَا (5)"));
        alzalzalahExes.add(new AlzalzalahEx("وبأن الله سبحانه وتعالى أمرها بأن تخبر بما عُمل عليها."));
        alzalzalahExes.add(new AlzalzalahEx("يَوْمَئِذٍ يَصْدُرُ النَّاسُ أَشْتَاتًا لِيُرَوْا أَعْمَالَهُمْ (6)"));
        alzalzalahExes.add(new AlzalzalahEx("يومئذ يرجع الناس عن موقف الحساب أصنافًا متفرقين؛ ليريهم الله ما عملوا من السيئات والحسنات، ويجازيهم عليها."));
        alzalzalahExes.add(new AlzalzalahEx("فَمَنْ يَعْمَلْ مِثْقَالَ ذَرَّةٍ خَيْرًا يَرَهُ (7)"));
        alzalzalahExes.add(new AlzalzalahEx("فمن يعمل وزن نملة صغيرة خيرًا، ير ثوابه في الآخرة."));
        alzalzalahExes.add(new AlzalzalahEx("وَمَنْ يَعْمَلْ مِثْقَالَ ذَرَّةٍ شَرًّا يَرَهُ (8)"));
        alzalzalahExes.add(new AlzalzalahEx("ومن يعمل وزن نملة صغيرة شرًا، ير عقابه في الآخرة."));



        quran_explanation_99_adapter = new quran_explanation_99_adapter(alzalzalahExes ,QuranExplanation_99Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_99);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_99Activity.this));
        recyclerView.setAdapter(quran_explanation_99_adapter);


    }

}