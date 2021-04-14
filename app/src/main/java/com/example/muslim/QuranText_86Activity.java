package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_86Activity extends AppCompatActivity {

    ArrayList<Altarek> altareks = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_86_adapter quran_text_86_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_86);

        altareks.add(new Altarek("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        altareks.add(new Altarek("وَالسَّمَاءِ وَالطَّارِقِ (1)"));
        altareks.add(new Altarek("وَمَا أَدْرَاكَ مَا الطَّارِقُ (2)"));
        altareks.add(new Altarek("النَّجْمُ الثَّاقِبُ (3)"));
        altareks.add(new Altarek("إِنْ كُلُّ نَفْسٍ لَمَّا عَلَيْهَا حَافِظٌ (4)"));
        altareks.add(new Altarek("فَلْيَنْظُرِ الْإِنْسَانُ مِمَّ خُلِقَ (5)"));
        altareks.add(new Altarek("خُلِقَ مِنْ مَاءٍ دَافِقٍ (6)"));
        altareks.add(new Altarek("يَخْرُجُ مِنْ بَيْنِ الصُّلْبِ وَالتَّرَائِبِ (7)"));
        altareks.add(new Altarek("إِنَّهُ عَلَى رَجْعِهِ لَقَادِرٌ (8)"));
        altareks.add(new Altarek("يَوْمَ تُبْلَى السَّرَائِرُ (9)"));
        altareks.add(new Altarek("فَمَا لَهُ مِنْ قُوَّةٍ وَلَا نَاصِرٍ (10)"));
        altareks.add(new Altarek("وَالسَّمَاءِ ذَاتِ الرَّجْعِ (11)"));
        altareks.add(new Altarek("وَالْأَرْضِ ذَاتِ الصَّدْعِ (12)"));
        altareks.add(new Altarek("إِنَّهُ لَقَوْلٌ فَصْلٌ (13)"));
        altareks.add(new Altarek("وَمَا هُوَ بِالْهَزْلِ (14)"));
        altareks.add(new Altarek("إِنَّهُمْ يَكِيدُونَ كَيْدًا (15)"));
        altareks.add(new Altarek("وَأَكِيدُ كَيْدًا (16)"));
        altareks.add(new Altarek("فَمَهِّلِ الْكَافِرِينَ أَمْهِلْهُمْ رُوَيْدًا (17)"));


        quran_text_86_adapter = new quran_text_86_adapter(altareks ,QuranText_86Activity.this);

        recyclerView = findViewById(R.id.rv_86);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_86Activity.this));
        recyclerView.setAdapter(quran_text_86_adapter);


    }

}