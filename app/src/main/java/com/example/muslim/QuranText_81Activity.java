package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_81Activity extends AppCompatActivity {

    ArrayList<Altakwer> altakwers = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_81_adapter quran_text_81_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_81);

        altakwers.add(new Altakwer("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        altakwers.add(new Altakwer("إِذَا الشَّمْسُ كُوِّرَتْ (1)"));
        altakwers.add(new Altakwer("وَإِذَا النُّجُومُ انْكَدَرَتْ (2)"));
        altakwers.add(new Altakwer("وَإِذَا الْجِبَالُ سُيِّرَتْ (3)"));
        altakwers.add(new Altakwer("وَإِذَا الْعِشَارُ عُطِّلَتْ (4)"));
        altakwers.add(new Altakwer("وَإِذَا الْوُحُوشُ حُشِرَتْ (5)"));
        altakwers.add(new Altakwer("وَإِذَا الْبِحَارُ سُجِّرَتْ (6)"));
        altakwers.add(new Altakwer("وَإِذَا النُّفُوسُ زُوِّجَتْ (7)"));
        altakwers.add(new Altakwer("وَإِذَا الْمَوْءُودَةُ سُئِلَتْ (8)"));
        altakwers.add(new Altakwer("بِأَيِّ ذَنْبٍ قُتِلَتْ (9)"));
        altakwers.add(new Altakwer("وَإِذَا الصُّحُفُ نُشِرَتْ (10)"));
        altakwers.add(new Altakwer("وَإِذَا السَّمَاءُ كُشِطَتْ (11)"));
        altakwers.add(new Altakwer("وَإِذَا الْجَحِيمُ سُعِّرَتْ (12)"));
        altakwers.add(new Altakwer("وَإِذَا الْجَنَّةُ أُزْلِفَتْ (13)"));
        altakwers.add(new Altakwer("عَلِمَتْ نَفْسٌ مَا أَحْضَرَتْ (14)"));
        altakwers.add(new Altakwer("فَلَا أُقْسِمُ بِالْخُنَّسِ (15)"));
        altakwers.add(new Altakwer("الْجَوَارِ الْكُنَّسِ (16)"));
        altakwers.add(new Altakwer("وَاللَّيْلِ إِذَا عَسْعَسَ (17)"));
        altakwers.add(new Altakwer("وَالصُّبْحِ إِذَا تَنَفَّسَ (18)"));
        altakwers.add(new Altakwer("إِنَّهُ لَقَوْلُ رَسُولٍ كَرِيمٍ (19)"));
        altakwers.add(new Altakwer("ذِي قُوَّةٍ عِنْدَ ذِي الْعَرْشِ مَكِينٍ (20)"));
        altakwers.add(new Altakwer("مُطَاعٍ ثَمَّ أَمِينٍ (21)"));
        altakwers.add(new Altakwer("وَمَا صَاحِبُكُمْ بِمَجْنُونٍ (22)"));
        altakwers.add(new Altakwer("وَلَقَدْ رَآَهُ بِالْأُفُقِ الْمُبِينِ (23)"));
        altakwers.add(new Altakwer("وَمَا هُوَ عَلَى الْغَيْبِ بِضَنِينٍ (24)"));
        altakwers.add(new Altakwer("وَمَا هُوَ بِقَوْلِ شَيْطَانٍ رَجِيمٍ (25)"));
        altakwers.add(new Altakwer("فَأَيْنَ تَذْهَبُونَ (26)"));
        altakwers.add(new Altakwer("إِنْ هُوَ إِلَّا ذِكْرٌ لِلْعَالَمِينَ (27)"));
        altakwers.add(new Altakwer("لِمَنْ شَاءَ مِنْكُمْ أَنْ يَسْتَقِيمَ (28)"));
        altakwers.add(new Altakwer("وَمَا تَشَاءُونَ إِلَّا أَنْ يَشَاءَ اللَّهُ رَبُّ الْعَالَمِينَ (29)"));

        quran_text_81_adapter = new quran_text_81_adapter(altakwers ,QuranText_81Activity.this);

        recyclerView = findViewById(R.id.rv_81);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_81Activity.this));
        recyclerView.setAdapter(quran_text_81_adapter);


    }

}