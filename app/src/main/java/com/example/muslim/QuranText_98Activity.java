package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_98Activity extends AppCompatActivity {

    ArrayList<Albaiena> albaienas = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_98_adapter quran_text_98_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_98);

        albaienas.add(new Albaiena("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        albaienas.add(new Albaiena("لَمْ يَكُنِ الَّذِينَ كَفَرُوا مِنْ أَهْلِ الْكِتَابِ وَالْمُشْرِكِينَ مُنْفَكِّينَ حَتَّى تَأْتِيَهُمُ الْبَيِّنَةُ (1)"));
        albaienas.add(new Albaiena("رَسُولٌ مِنَ اللَّهِ يَتْلُو صُحُفًا مُطَهَّرَةً (2)"));
        albaienas.add(new Albaiena("فِيهَا كُتُبٌ قَيِّمَةٌ (3)"));
        albaienas.add(new Albaiena("وَمَا تَفَرَّقَ الَّذِينَ أُوتُوا الْكِتَابَ إِلَّا مِنْ بَعْدِ مَا جَاءَتْهُمُ الْبَيِّنَةُ (4)"));
        albaienas.add(new Albaiena("وَمَا أُمِرُوا إِلَّا لِيَعْبُدُوا اللَّهَ مُخْلِصِينَ لَهُ الدِّينَ حُنَفَاءَ وَيُقِيمُوا الصَّلَاةَ وَيُؤْتُوا الزَّكَاةَ وَذَلِكَ دِينُ الْقَيِّمَةِ (5)"));
        albaienas.add(new Albaiena("إِنَّ الَّذِينَ كَفَرُوا مِنْ أَهْلِ الْكِتَابِ وَالْمُشْرِكِينَ فِي نَارِ جَهَنَّمَ خَالِدِينَ فِيهَا أُولَئِكَ هُمْ شَرُّ الْبَرِيَّةِ (6)"));
        albaienas.add(new Albaiena("إِنَّ الَّذِينَ آَمَنُوا وَعَمِلُوا الصَّالِحَاتِ أُولَئِكَ هُمْ خَيْرُ الْبَرِيَّةِ (7)"));
        albaienas.add(new Albaiena("جَزَاؤُهُمْ عِنْدَ رَبِّهِمْ جَنَّاتُ عَدْنٍ تَجْرِي مِنْ تَحْتِهَا الْأَنْهَارُ خَالِدِينَ فِيهَا أَبَدًا رَضِيَ اللَّهُ عَنْهُمْ وَرَضُوا عَنْهُ ذَلِكَ لِمَنْ خَشِيَ رَبَّهُ (8)"));


        quran_text_98_adapter = new quran_text_98_adapter(albaienas ,QuranText_98Activity.this);

        recyclerView = findViewById(R.id.rv_98);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_98Activity.this));
        recyclerView.setAdapter(quran_text_98_adapter);


    }

}