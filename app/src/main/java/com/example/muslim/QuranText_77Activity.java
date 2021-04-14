package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_77Activity extends AppCompatActivity {

    ArrayList<Almorsalat> almorsalats = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_77_adapter quran_text_77_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_77);

        almorsalats.add(new Almorsalat("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        almorsalats.add(new Almorsalat("وَالْمُرْسَلَاتِ عُرْفًا (1)"));
        almorsalats.add(new Almorsalat("فَالْعَاصِفَاتِ عَصْفًا (2)"));
        almorsalats.add(new Almorsalat("وَالنَّاشِرَاتِ نَشْرًا (3)"));
        almorsalats.add(new Almorsalat("فَالْفَارِقَاتِ فَرْقًا (4)"));
        almorsalats.add(new Almorsalat("فَالْمُلْقِيَاتِ ذِكْرًا (5)"));
        almorsalats.add(new Almorsalat("عُذْرًا أَوْ نُذْرًا (6)"));
        almorsalats.add(new Almorsalat("إِنَّمَا تُوعَدُونَ لَوَاقِعٌ (7)"));
        almorsalats.add(new Almorsalat("فَإِذَا النُّجُومُ طُمِسَتْ (8)"));
        almorsalats.add(new Almorsalat("وَإِذَا السَّمَاءُ فُرِجَتْ (9)"));
        almorsalats.add(new Almorsalat("وَإِذَا الْجِبَالُ نُسِفَتْ (10)"));
        almorsalats.add(new Almorsalat("وَإِذَا الرُّسُلُ أُقِّتَتْ (11)"));
        almorsalats.add(new Almorsalat("لِأَيِّ يَوْمٍ أُجِّلَتْ (12)"));
        almorsalats.add(new Almorsalat("لِيَوْمِ الْفَصْلِ (13)"));
        almorsalats.add(new Almorsalat("وَمَا أَدْرَاكَ مَا يَوْمُ الْفَصْلِ (14)"));
        almorsalats.add(new Almorsalat("وَيْلٌ يَوْمَئِذٍ لِلْمُكَذِّبِينَ (15)"));
        almorsalats.add(new Almorsalat("أَلَمْ نُهْلِكِ الْأَوَّلِينَ (16)"));
        almorsalats.add(new Almorsalat("ثُمَّ نُتْبِعُهُمُ الْآَخِرِينَ (17)"));
        almorsalats.add(new Almorsalat("كَذَلِكَ نَفْعَلُ بِالْمُجْرِمِينَ (18)"));
        almorsalats.add(new Almorsalat("وَيْلٌ يَوْمَئِذٍ لِلْمُكَذِّبِينَ (19)"));
        almorsalats.add(new Almorsalat("أَلَمْ نَخْلُقْكُمْ مِنْ مَاءٍ مَهِينٍ (20)"));
        almorsalats.add(new Almorsalat("فَجَعَلْنَاهُ فِي قَرَارٍ مَكِينٍ (21)"));
        almorsalats.add(new Almorsalat("إِلَى قَدَرٍ مَعْلُومٍ (22)"));
        almorsalats.add(new Almorsalat("فَقَدَرْنَا فَنِعْمَ الْقَادِرُونَ (23)"));
        almorsalats.add(new Almorsalat("وَيْلٌ يَوْمَئِذٍ لِلْمُكَذِّبِينَ (24)"));
        almorsalats.add(new Almorsalat("أَلَمْ نَجْعَلِ الْأَرْضَ كِفَاتًا (25)"));
        almorsalats.add(new Almorsalat("أَحْيَاءً \u200Eوَأَمْوَاتًا (26)"));
        almorsalats.add(new Almorsalat("وَجَعَلْنَا فِيهَا رَوَاسِيَ شَامِخَاتٍ وَأَسْقَيْنَاكُمْ مَاءً فُرَاتًا (27)"));
        almorsalats.add(new Almorsalat("وَيْلٌ يَوْمَئِذٍ لِلْمُكَذِّبِينَ (28)"));
        almorsalats.add(new Almorsalat("انْطَلِقُوا إِلَى مَا كُنْتُمْ بِهِ تُكَذِّبُونَ (29)"));
        almorsalats.add(new Almorsalat("انْطَلِقُوا إِلَى ظِلٍّ ذِي ثَلَاثِ شُعَبٍ (30)"));
        almorsalats.add(new Almorsalat("لَا ظَلِيلٍ وَلَا يُغْنِي مِنَ اللَّهَبِ (31)"));
        almorsalats.add(new Almorsalat("إِنَّهَا تَرْمِي بِشَرَرٍ كَالْقَصْرِ (32)"));
        almorsalats.add(new Almorsalat("كَأَنَّهُ جِمَالَةٌ صُفْرٌ (33)"));
        almorsalats.add(new Almorsalat("وَيْلٌ يَوْمَئِذٍ لِلْمُكَذِّبِينَ (34)"));
        almorsalats.add(new Almorsalat("هَذَا يَوْمُ لَا يَنْطِقُونَ (35)"));
        almorsalats.add(new Almorsalat("وَلَا يُؤْذَنُ لَهُمْ فَيَعْتَذِرُونَ (36)"));
        almorsalats.add(new Almorsalat("وَيْلٌ يَوْمَئِذٍ لِلْمُكَذِّبِينَ (37)"));
        almorsalats.add(new Almorsalat("هَذَا يَوْمُ الْفَصْلِ جَمَعْنَاكُمْ وَالْأَوَّلِينَ (38)"));
        almorsalats.add(new Almorsalat("فَإِنْ كَانَ لَكُمْ كَيْدٌ فَكِيدُونِ (39)"));
        almorsalats.add(new Almorsalat("وَيْلٌ يَوْمَئِذٍ لِلْمُكَذِّبِينَ (40)"));
        almorsalats.add(new Almorsalat("إِنَّ الْمُتَّقِينَ فِي ظِلَالٍ وَعُيُونٍ (41)"));
        almorsalats.add(new Almorsalat("وَفَوَاكِهَ مِمَّا يَشْتَهُونَ (42)"));
        almorsalats.add(new Almorsalat("كُلُوا وَاشْرَبُوا هَنِيئًا بِمَا كُنْتُمْ تَعْمَلُونَ (43)"));
        almorsalats.add(new Almorsalat("إِنَّا كَذَلِكَ نَجْزِي الْمُحْسِنِينَ (44)"));
        almorsalats.add(new Almorsalat("وَيْلٌ يَوْمَئِذٍ لِلْمُكَذِّبِينَ (45)"));
        almorsalats.add(new Almorsalat("كُلُوا وَتَمَتَّعُوا قَلِيلًا إِنَّكُمْ مُجْرِمُونَ (46)"));
        almorsalats.add(new Almorsalat("وَيْلٌ يَوْمَئِذٍ لِلْمُكَذِّبِينَ (47)"));
        almorsalats.add(new Almorsalat("وَإِذَا قِيلَ لَهُمُ ارْكَعُوا لَا يَرْكَعُونَ (48)"));
        almorsalats.add(new Almorsalat("وَيْلٌ يَوْمَئِذٍ لِلْمُكَذِّبِينَ (49)"));
        almorsalats.add(new Almorsalat("فَبِأَيِّ حَدِيثٍ بَعْدَهُ يُؤْمِنُونَ (50)"));

        quran_text_77_adapter = new quran_text_77_adapter(almorsalats ,QuranText_77Activity.this);

        recyclerView = findViewById(R.id.rv_77);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_77Activity.this));
        recyclerView.setAdapter(quran_text_77_adapter);


    }

}