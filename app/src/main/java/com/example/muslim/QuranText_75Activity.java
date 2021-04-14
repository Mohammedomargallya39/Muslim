package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_75Activity extends AppCompatActivity {

    ArrayList<Alqiama> alqiamas = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_75_adapter quran_text_75_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_75);

        alqiamas.add(new Alqiama("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alqiamas.add(new Alqiama("لَا أُقْسِمُ بِيَوْمِ الْقِيَامَةِ (1)"));
        alqiamas.add(new Alqiama("وَلَا أُقْسِمُ بِالنَّفْسِ اللَّوَّامَةِ (2)"));
        alqiamas.add(new Alqiama("أَيَحْسَبُ الْإِنْسَانُ أَلَّنْ نَجْمَعَ عِظَامَهُ (3)"));
        alqiamas.add(new Alqiama("بَلَى قَادِرِينَ عَلَى أَنْ نُسَوِّيَ بَنَانَهُ (4)"));
        alqiamas.add(new Alqiama("بَلْ يُرِيدُ الْإِنْسَانُ لِيَفْجُرَ أَمَامَهُ (5)"));
        alqiamas.add(new Alqiama("يَسْأَلُ أَيَّانَ يَوْمُ الْقِيَامَةِ (6)"));
        alqiamas.add(new Alqiama("فَإِذَا بَرِقَ الْبَصَرُ (7)"));
        alqiamas.add(new Alqiama("وَخَسَفَ الْقَمَرُ (8)"));
        alqiamas.add(new Alqiama("وَجُمِعَ الشَّمْسُ وَالْقَمَرُ (9)"));
        alqiamas.add(new Alqiama("يَقُولُ الْإِنْسَانُ يَوْمَئِذٍ أَيْنَ الْمَفَرُّ (10)"));
        alqiamas.add(new Alqiama("كَلَّا لَا وَزَرَ (11)"));
        alqiamas.add(new Alqiama("إِلَى رَبِّكَ يَوْمَئِذٍ الْمُسْتَقَرُّ (12)"));
        alqiamas.add(new Alqiama("يُنَبَّأُ الْإِنْسَانُ يَوْمَئِذٍ بِمَا قَدَّمَ وَأَخَّرَ (13)"));
        alqiamas.add(new Alqiama("بَلِ الْإِنْسَانُ عَلَى نَفْسِهِ بَصِيرَةٌ (14)"));
        alqiamas.add(new Alqiama("وَلَوْ أَلْقَى مَعَاذِيرَهُ (15)"));
        alqiamas.add(new Alqiama("لَا تُحَرِّكْ بِهِ لِسَانَكَ لِتَعْجَلَ بِهِ (16)"));
        alqiamas.add(new Alqiama("إِنَّ عَلَيْنَا جَمْعَهُ وَقُرْآَنَهُ (17)"));
        alqiamas.add(new Alqiama("فَإِذَا قَرَأْنَاهُ فَاتَّبِعْ قُرْآَنَهُ (18)"));
        alqiamas.add(new Alqiama("ثُمَّ إِنَّ عَلَيْنَا بَيَانَهُ (19)"));
        alqiamas.add(new Alqiama("كَلَّا بَلْ تُحِبُّونَ الْعَاجِلَةَ (20)"));
        alqiamas.add(new Alqiama("وَتَذَرُونَ الْآَخِرَةَ (21)"));
        alqiamas.add(new Alqiama("وُجُوهٌ يَوْمَئِذٍ نَاضِرَةٌ (22)"));
        alqiamas.add(new Alqiama("إِلَى رَبِّهَا نَاظِرَةٌ (23)"));
        alqiamas.add(new Alqiama("وَوُجُوهٌ يَوْمَئِذٍ بَاسِرَةٌ (24)"));
        alqiamas.add(new Alqiama("تَظُنُّ أَنْ يُفْعَلَ بِهَا فَاقِرَةٌ (25)"));
        alqiamas.add(new Alqiama("كَلَّا إِذَا بَلَغَتِ التَّرَاقِيَ (26)"));
        alqiamas.add(new Alqiama("وَقِيلَ مَنْ رَاقٍ (27)"));
        alqiamas.add(new Alqiama("وَظَنَّ أَنَّهُ الْفِرَاقُ (28)"));
        alqiamas.add(new Alqiama("وَالْتَفَّتِ السَّاقُ بِالسَّاقِ (29)"));
        alqiamas.add(new Alqiama("إِلَى رَبِّكَ يَوْمَئِذٍ الْمَسَاقُ (30)"));
        alqiamas.add(new Alqiama("فَلَا صَدَّقَ وَلَا صَلَّى (31)"));
        alqiamas.add(new Alqiama("وَلَكِنْ كَذَّبَ وَتَوَلَّى (32)"));
        alqiamas.add(new Alqiama("ثُمَّ ذَهَبَ إِلَى أَهْلِهِ يَتَمَطَّى (33)"));
        alqiamas.add(new Alqiama("أَوْلَى لَكَ فَأَوْلَى (34)"));
        alqiamas.add(new Alqiama("ثُمَّ أَوْلَى لَكَ فَأَوْلَى (35)"));
        alqiamas.add(new Alqiama("أَيَحْسَبُ الْإِنْسَانُ أَنْ يُتْرَكَ سُدًى (36)"));
        alqiamas.add(new Alqiama("أَلَمْ يَكُ نُطْفَةً مِنْ مَنِيٍّ يُمْنَى (37)"));
        alqiamas.add(new Alqiama("ثُمَّ كَانَ عَلَقَةً فَخَلَقَ فَسَوَّى (38)"));
        alqiamas.add(new Alqiama("فَجَعَلَ مِنْهُ الزَّوْجَيْنِ الذَّكَرَ وَالْأُنْثَى (39)"));
        alqiamas.add(new Alqiama("أَلَيْسَ ذَلِكَ بِقَادِرٍ عَلَى أَنْ يُحْيِيَ الْمَوْتَى (40)"));


        quran_text_75_adapter = new quran_text_75_adapter(alqiamas ,QuranText_75Activity.this);

        recyclerView = findViewById(R.id.rv_75);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_75Activity.this));
        recyclerView.setAdapter(quran_text_75_adapter);


    }

}