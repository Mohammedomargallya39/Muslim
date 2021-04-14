package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_80Activity extends AppCompatActivity {

    ArrayList<Abasa> abasas = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_80_adapter quran_text_80_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_80);

        abasas.add(new Abasa("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        abasas.add(new Abasa("عَبَسَ وَتَوَلَّى (1)"));
        abasas.add(new Abasa("أَنْ جَاءَهُ الْأَعْمَى (2)"));
        abasas.add(new Abasa("وَمَا يُدْرِيكَ لَعَلَّهُ يَزَّكَّى (3)"));
        abasas.add(new Abasa("أَوْ يَذَّكَّرُ فَتَنْفَعَهُ الذِّكْرَى (4)"));
        abasas.add(new Abasa("أَمَّا مَنِ اسْتَغْنَى (5)"));
        abasas.add(new Abasa("فَأَنْتَ لَهُ تَصَدَّى (6)"));
        abasas.add(new Abasa("وَمَا عَلَيْكَ أَلَّا يَزَّكَّى (7)"));
        abasas.add(new Abasa("وَأَمَّا مَنْ جَاءَكَ يَسْعَى (8)"));
        abasas.add(new Abasa("وَهُوَ يَخْشَى (9)"));
        abasas.add(new Abasa("فَأَنْتَ عَنْهُ تَلَهَّى (10)"));
        abasas.add(new Abasa("كَلَّا إِنَّهَا تَذْكِرَةٌ (11)"));
        abasas.add(new Abasa("فَمَنْ شَاءَ ذَكَرَهُ (12)"));
        abasas.add(new Abasa("فِي صُحُفٍ مُكَرَّمَةٍ (13)"));
        abasas.add(new Abasa("مَرْفُوعَةٍ مُطَهَّرَةٍ (14)"));
        abasas.add(new Abasa("بِأَيْدِي سَفَرَةٍ (15)"));
        abasas.add(new Abasa("كِرَامٍ بَرَرَةٍ (16)"));
        abasas.add(new Abasa("قُتِلَ الْإِنْسَانُ مَا أَكْفَرَهُ (17)"));
        abasas.add(new Abasa("مِنْ أَيِّ شَيْءٍ خَلَقَهُ (18)"));
        abasas.add(new Abasa("مِنْ نُطْفَةٍ خَلَقَهُ فَقَدَّرَهُ (19)"));
        abasas.add(new Abasa("ثُمَّ السَّبِيلَ يَسَّرَهُ (20)"));
        abasas.add(new Abasa("ثُمَّ أَمَاتَهُ فَأَقْبَرَهُ (21)"));
        abasas.add(new Abasa("ثُمَّ إِذَا شَاءَ أَنْشَرَهُ (22)"));
        abasas.add(new Abasa("كَلَّا لَمَّا يَقْضِ مَا أَمَرَهُ (23)"));
        abasas.add(new Abasa("فَلْيَنْظُرِ الْإِنْسَانُ إِلَى طَعَامِهِ (24)"));
        abasas.add(new Abasa("أَنَّا صَبَبْنَا الْمَاءَ صَبًّا (25)"));
        abasas.add(new Abasa("ثُمَّ شَقَقْنَا الْأَرْضَ شَقًّا (26)"));
        abasas.add(new Abasa("فَأَنْبَتْنَا فِيهَا حَبًّا (27)"));
        abasas.add(new Abasa("وَعِنَبًا وَقَضْبًا (28)"));
        abasas.add(new Abasa("وَزَيْتُونًا وَنَخْلًا (29)"));
        abasas.add(new Abasa("وَحَدَائِقَ غُلْبًا (30)"));
        abasas.add(new Abasa("وَفَاكِهَةً وَأَبًّا (31)"));
        abasas.add(new Abasa("مَتَاعًا لَكُمْ وَلِأَنْعَامِكُمْ (32)"));
        abasas.add(new Abasa("فَإِذَا جَاءَتِ الصَّاخَّةُ (33)"));
        abasas.add(new Abasa("يَوْمَ يَفِرُّ الْمَرْءُ مِنْ أَخِيهِ (34)"));
        abasas.add(new Abasa("وَأُمِّهِ وَأَبِيهِ (35)"));
        abasas.add(new Abasa("وَصَاحِبَتِهِ وَبَنِيهِ (36)"));
        abasas.add(new Abasa("لِكُلِّ امْرِئٍ مِنْهُمْ يَوْمَئِذٍ شَأْنٌ يُغْنِيهِ (37)"));
        abasas.add(new Abasa("وُجُوهٌ يَوْمَئِذٍ مُسْفِرَةٌ (38)"));
        abasas.add(new Abasa("ضَاحِكَةٌ مُسْتَبْشِرَةٌ (39)"));
        abasas.add(new Abasa("وَوُجُوهٌ يَوْمَئِذٍ عَلَيْهَا غَبَرَةٌ (40)"));
        abasas.add(new Abasa("تَرْهَقُهَا قَتَرَةٌ (41)"));
        abasas.add(new Abasa("أُولَئِكَ هُمُ الْكَفَرَةُ الْفَجَرَةُ (42)"));

        quran_text_80_adapter = new quran_text_80_adapter(abasas ,QuranText_80Activity.this);

        recyclerView = findViewById(R.id.rv_80);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_80Activity.this));
        recyclerView.setAdapter(quran_text_80_adapter);


    }

}