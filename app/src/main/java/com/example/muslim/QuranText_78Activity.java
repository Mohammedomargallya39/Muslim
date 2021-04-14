package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_78Activity extends AppCompatActivity {

    ArrayList<Alnabaa> alnabaas = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_78_adapter quran_text_78_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_78);

        alnabaas.add(new Alnabaa("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alnabaas.add(new Alnabaa("عَمَّ يَتَسَاءَلُونَ (1)"));
        alnabaas.add(new Alnabaa("عَنِ النَّبَإِ الْعَظِيمِ (2)"));
        alnabaas.add(new Alnabaa("الَّذِي هُمْ فِيهِ مُخْتَلِفُونَ (3)"));
        alnabaas.add(new Alnabaa("كَلَّا سَيَعْلَمُونَ (4)"));
        alnabaas.add(new Alnabaa("ثُمَّ كَلَّا سَيَعْلَمُونَ (5)"));
        alnabaas.add(new Alnabaa("أَلَمْ نَجْعَلِ الْأَرْضَ مِهَادًا (6)"));
        alnabaas.add(new Alnabaa("وَالْجِبَالَ أَوْتَادًا (7)"));
        alnabaas.add(new Alnabaa("وَخَلَقْنَاكُمْ أَزْوَاجًا (8)"));
        alnabaas.add(new Alnabaa("وَجَعَلْنَا نَوْمَكُمْ سُبَاتًا (9)"));
        alnabaas.add(new Alnabaa("وَجَعَلْنَا اللَّيْلَ لِبَاسًا (10)"));
        alnabaas.add(new Alnabaa("وَجَعَلْنَا النَّهَارَ مَعَاشًا (11)"));
        alnabaas.add(new Alnabaa("وَبَنَيْنَا فَوْقَكُمْ سَبْعًا شِدَادًا (12)"));
        alnabaas.add(new Alnabaa("وَجَعَلْنَا سِرَاجًا وَهَّاجًا (13)"));
        alnabaas.add(new Alnabaa("وَأَنْزَلْنَا مِنَ الْمُعْصِرَاتِ مَاءً ثَجَّاجًا (14)"));
        alnabaas.add(new Alnabaa("لِنُخْرِجَ بِهِ حَبًّا وَنَبَاتًا (15)"));
        alnabaas.add(new Alnabaa("وَجَنَّاتٍ أَلْفَافًا (16)"));
        alnabaas.add(new Alnabaa("إِنَّ يَوْمَ الْفَصْلِ كَانَ مِيقَاتًا (17)"));
        alnabaas.add(new Alnabaa("يَوْمَ يُنْفَخُ فِي الصُّورِ فَتَأْتُونَ أَفْوَاجًا (18)"));
        alnabaas.add(new Alnabaa("وَفُتِحَتِ السَّمَاءُ فَكَانَتْ أَبْوَابًا (19)"));
        alnabaas.add(new Alnabaa("وَسُيِّرَتِ الْجِبَالُ فَكَانَتْ سَرَابًا (20)"));
        alnabaas.add(new Alnabaa("إِنَّ جَهَنَّمَ كَانَتْ مِرْصَادًا (21)"));
        alnabaas.add(new Alnabaa("لِلطَّاغِينَ مَآَبًا (22)"));
        alnabaas.add(new Alnabaa("لَابِثِينَ فِيهَا أَحْقَابًا (23)"));
        alnabaas.add(new Alnabaa("لَا يَذُوقُونَ فِيهَا بَرْدًا وَلَا شَرَابًا (24)"));
        alnabaas.add(new Alnabaa("إِلَّا حَمِيمًا وَغَسَّاقًا (25)"));
        alnabaas.add(new Alnabaa("جَزَاءً وِفَاقًا (26)"));
        alnabaas.add(new Alnabaa("إِنَّهُمْ كَانُوا لَا يَرْجُونَ حِسَابًا (27)"));
        alnabaas.add(new Alnabaa("وَكَذَّبُوا بِآَيَاتِنَا كِذَّابًا (28)"));
        alnabaas.add(new Alnabaa("وَكُلَّ شَيْءٍ أَحْصَيْنَاهُ كِتَابًا (29)"));
        alnabaas.add(new Alnabaa("فَذُوقُوا فَلَنْ نَزِيدَكُمْ إِلَّا عَذَابًا (30)"));
        alnabaas.add(new Alnabaa("إِنَّ لِلْمُتَّقِينَ مَفَازًا (31)"));
        alnabaas.add(new Alnabaa("حَدَائِقَ وَأَعْنَابًا (32)"));
        alnabaas.add(new Alnabaa("وَكَوَاعِبَ أَتْرَابًا (33)"));
        alnabaas.add(new Alnabaa("وَكَأْسًا دِهَاقًا (34)"));
        alnabaas.add(new Alnabaa("لَا يَسْمَعُونَ فِيهَا لَغْوًا وَلَا كِذَّابًا (35)"));
        alnabaas.add(new Alnabaa("جَزَاءً مِنْ رَبِّكَ عَطَاءً حِسَابًا (36)"));
        alnabaas.add(new Alnabaa("رَبِّ السَّمَاوَاتِ وَالْأَرْضِ وَمَا بَيْنَهُمَا الرَّحْمَنِ لَا يَمْلِكُونَ مِنْهُ خِطَابًا (37)"));
        alnabaas.add(new Alnabaa("يَوْمَ يَقُومُ الرُّوحُ وَالْمَلَائِكَةُ صَفًّا لَا يَتَكَلَّمُونَ إِلَّا مَنْ أَذِنَ لَهُ الرَّحْمَنُ وَقَالَ صَوَابًا (38)"));
        alnabaas.add(new Alnabaa("ذَلِكَ الْيَوْمُ الْحَقُّ فَمَنْ شَاءَ اتَّخَذَ إِلَى رَبِّهِ مَآَبًا (39)"));
        alnabaas.add(new Alnabaa("إِنَّا أَنْذَرْنَاكُمْ عَذَابًا قَرِيبًا يَوْمَ يَنْظُرُ الْمَرْءُ مَا قَدَّمَتْ يَدَاهُ وَيَقُولُ الْكَافِرُ يَا لَيْتَنِي كُنْتُ تُرَابًا (40)"));


        quran_text_78_adapter = new quran_text_78_adapter(alnabaas ,QuranText_78Activity.this);

        recyclerView = findViewById(R.id.rv_78);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_78Activity.this));
        recyclerView.setAdapter(quran_text_78_adapter);


    }

}