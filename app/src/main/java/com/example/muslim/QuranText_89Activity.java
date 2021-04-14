package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_89Activity extends AppCompatActivity {

    ArrayList<Alfagr> alfagrs = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_89_adapter quran_text_89_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_89);

        alfagrs.add(new Alfagr("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alfagrs.add(new Alfagr("وَالْفَجْرِ (1)"));
        alfagrs.add(new Alfagr("وَلَيَالٍ عَشْرٍ (2)"));
        alfagrs.add(new Alfagr("وَالشَّفْعِ وَالْوَتْرِ (3)"));
        alfagrs.add(new Alfagr("وَاللَّيْلِ إِذَا يَسْرِ (4)"));
        alfagrs.add(new Alfagr("هَلْ فِي ذَلِكَ قَسَمٌ لِذِي حِجْرٍ (5)"));
        alfagrs.add(new Alfagr("أَلَمْ تَرَ كَيْفَ فَعَلَ رَبُّكَ بِعَادٍ (6)"));
        alfagrs.add(new Alfagr("إِرَمَ ذَاتِ الْعِمَادِ (7)"));
        alfagrs.add(new Alfagr("الَّتِي لَمْ يُخْلَقْ مِثْلُهَا فِي الْبِلَادِ (8)"));
        alfagrs.add(new Alfagr("وَثَمُودَ الَّذِينَ جَابُوا الصَّخْرَ بِالْوَادِ (9)"));
        alfagrs.add(new Alfagr("وَفِرْعَوْنَ ذِي الْأَوْتَادِ (10)"));
        alfagrs.add(new Alfagr("الَّذِينَ طَغَوْا فِي الْبِلَادِ (11)"));
        alfagrs.add(new Alfagr("فَأَكْثَرُوا فِيهَا الْفَسَادَ (12)"));
        alfagrs.add(new Alfagr("فَصَبَّ عَلَيْهِمْ رَبُّكَ سَوْطَ عَذَابٍ (13)"));
        alfagrs.add(new Alfagr("إِنَّ رَبَّكَ لَبِالْمِرْصَادِ (14)"));
        alfagrs.add(new Alfagr("فَأَمَّا الْإِنْسَانُ إِذَا مَا ابْتَلَاهُ رَبُّهُ فَأَكْرَمَهُ وَنَعَّمَهُ فَيَقُولُ رَبِّي أَكْرَمَنِ (15)"));
        alfagrs.add(new Alfagr("وَأَمَّا إِذَا مَا ابْتَلَاهُ فَقَدَرَ عَلَيْهِ رِزْقَهُ فَيَقُولُ رَبِّي أَهَانَنِ (16)"));
        alfagrs.add(new Alfagr("كَلَّا بَل لَا تُكْرِمُونَ الْيَتِيمَ (17)"));
        alfagrs.add(new Alfagr("وَلَا تَحَاضُّونَ عَلَى طَعَامِ الْمِسْكِينِ (18)"));
        alfagrs.add(new Alfagr("وَتَأْكُلُونَ التُّرَاثَ أَكْلًا لَمًّا (19)"));
        alfagrs.add(new Alfagr("وَتُحِبُّونَ الْمَالَ حُبًّا جَمًّا (20)"));
        alfagrs.add(new Alfagr("كَلَّا إِذَا دُكَّتِ الْأَرْضُ دَكًّا دَكًّا (21)"));
        alfagrs.add(new Alfagr("وَجَاءَ رَبُّكَ وَالْمَلَكُ صَفًّا صَفًّا (22)"));
        alfagrs.add(new Alfagr("وَجِيءَ يَوْمَئِذٍ بِجَهَنَّمَ يَوْمَئِذٍ يَتَذَكَّرُ الْإِنْسَانُ وَأَنَّى لَهُ الذِّكْرَى (23)"));
        alfagrs.add(new Alfagr("يَقُولُ يَا لَيْتَنِي قَدَّمْتُ لِحَيَاتِي (24)"));
        alfagrs.add(new Alfagr("فَيَوْمَئِذٍ لَا يُعَذِّبُ عَذَابَهُ أَحَدٌ (25)"));
        alfagrs.add(new Alfagr("وَلَا يُوثِقُ وَثَاقَهُ أَحَدٌ (26)"));
        alfagrs.add(new Alfagr("يَا أَيَّتُهَا النَّفْسُ الْمُطْمَئِنَّةُ (27)"));
        alfagrs.add(new Alfagr("ارْجِعِي إِلَى رَبِّكِ رَاضِيَةً مَرْضِيَّةً (28)"));
        alfagrs.add(new Alfagr("فَادْخُلِي فِي عِبَادِي (29)"));
        alfagrs.add(new Alfagr("وَادْخُلِي جَنَّتِي (30)"));

        quran_text_89_adapter = new quran_text_89_adapter(alfagrs ,QuranText_89Activity.this);

        recyclerView = findViewById(R.id.rv_89);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_89Activity.this));
        recyclerView.setAdapter(quran_text_89_adapter);


    }

}