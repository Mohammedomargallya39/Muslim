package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_52Activity extends AppCompatActivity {

    ArrayList<Altor> altors = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_52_adapter quran_text_52_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_52);

        altors.add(new Altor("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        altors.add(new Altor("وَالطُّورِ (1)"));
        altors.add(new Altor("وَكِتَابٍ مَسْطُورٍ (2)"));
        altors.add(new Altor("فِي رَقٍّ مَنْشُورٍ (3)"));
        altors.add(new Altor("وَالْبَيْتِ الْمَعْمُورِ (4)"));
        altors.add(new Altor("وَالسَّقْفِ الْمَرْفُوعِ (5)"));
        altors.add(new Altor("وَالْبَحْرِ الْمَسْجُورِ (6)"));
        altors.add(new Altor("إِنَّ عَذَابَ رَبِّكَ لَوَاقِعٌ (7)"));
        altors.add(new Altor("مَا لَهُ مِنْ دَافِعٍ (8)"));
        altors.add(new Altor("يَوْمَ تَمُورُ السَّمَاءُ مَوْرًا (9)"));
        altors.add(new Altor("وَتَسِيرُ الْجِبَالُ سَيْرًا (10)"));
        altors.add(new Altor("فَوَيْلٌ يَوْمَئِذٍ لِلْمُكَذِّبِينَ (11)"));
        altors.add(new Altor("الَّذِينَ هُمْ فِي خَوْضٍ يَلْعَبُونَ (12)"));
        altors.add(new Altor("يَوْمَ يُدَعُّونَ إِلَى نَارِ جَهَنَّمَ دَعًّا (13)"));
        altors.add(new Altor("هَذِهِ النَّارُ الَّتِي كُنْتُمْ بِهَا تُكَذِّبُونَ (14)"));
        altors.add(new Altor("أَفَسِحْرٌ هَذَا أَمْ أَنْتُمْ لَا تُبْصِرُونَ (15)"));
        altors.add(new Altor("اصْلَوْهَا فَاصْبِرُوا أَوْ لَا تَصْبِرُوا سَوَاءٌ عَلَيْكُمْ إِنَّمَا تُجْزَوْنَ مَا كُنْتُمْ تَعْمَلُونَ (16)"));
        altors.add(new Altor("إِنَّ الْمُتَّقِينَ فِي جَنَّاتٍ وَنَعِيمٍ (17)"));
        altors.add(new Altor("فَاكِهِينَ بِمَا آَتَاهُمْ رَبُّهُمْ وَوَقَاهُمْ رَبُّهُمْ عَذَابَ الْجَحِيمِ (18)"));
        altors.add(new Altor("كُلُوا وَاشْرَبُوا هَنِيئًا بِمَا كُنْتُمْ تَعْمَلُونَ (19)"));
        altors.add(new Altor("مُتَّكِئِينَ عَلَى سُرُرٍ مَصْفُوفَةٍ وَزَوَّجْنَاهُمْ بِحُورٍ عِينٍ (20)"));
        altors.add(new Altor("وَالَّذِينَ آَمَنُوا وَاتَّبَعَتْهُمْ ذُرِّيَّتُهُمْ بِإِيمَانٍ أَلْحَقْنَا بِهِمْ ذُرِّيَّتَهُمْ وَمَا أَلَتْنَاهُمْ مِنْ عَمَلِهِمْ مِنْ شَيْءٍ كُلُّ امْرِئٍ بِمَا كَسَبَ رَهِينٌ (21)"));
        altors.add(new Altor("وَأَمْدَدْنَاهُمْ بِفَاكِهَةٍ وَلَحْمٍ مِمَّا يَشْتَهُونَ (22)"));
        altors.add(new Altor("يَتَنَازَعُونَ فِيهَا كَأْسًا لَا لَغْوٌ فِيهَا وَلَا تَأْثِيمٌ (23)"));
        altors.add(new Altor("وَيَطُوفُ عَلَيْهِمْ غِلْمَانٌ لَهُمْ كَأَنَّهُمْ لُؤْلُؤٌ مَكْنُونٌ (24)"));
        altors.add(new Altor("وَأَقْبَلَ بَعْضُهُمْ عَلَى بَعْضٍ يَتَسَاءَلُونَ (25)"));
        altors.add(new Altor("قَالُوا إِنَّا كُنَّا قَبْلُ فِي أَهْلِنَا مُشْفِقِينَ (26)"));
        altors.add(new Altor("فَمَنَّ اللَّهُ عَلَيْنَا وَوَقَانَا عَذَابَ السَّمُومِ (27)"));
        altors.add(new Altor("إِنَّا كُنَّا مِنْ قَبْلُ نَدْعُوهُ إِنَّهُ هُوَ الْبَرُّ الرَّحِيمُ (28)"));
        altors.add(new Altor("فَذَكِّرْ فَمَا أَنْتَ بِنِعْمَةِ رَبِّكَ بِكَاهِنٍ وَلَا مَجْنُونٍ (29)"));
        altors.add(new Altor("أَمْ يَقُولُونَ شَاعِرٌ نَتَرَبَّصُ بِهِ رَيْبَ الْمَنُونِ (30)"));
        altors.add(new Altor("قُلْ تَرَبَّصُوا فَإِنِّي مَعَكُمْ مِنَ الْمُتَرَبِّصِينَ (31)"));
        altors.add(new Altor("أَمْ تَأْمُرُهُمْ أَحْلَامُهُمْ بِهَذَا أَمْ هُمْ قَوْمٌ طَاغُونَ (32)"));
        altors.add(new Altor("أَمْ يَقُولُونَ تَقَوَّلَهُ بَلْ لَا يُؤْمِنُونَ (33)"));
        altors.add(new Altor("فَلْيَأْتُوا بِحَدِيثٍ مِثْلِهِ إِنْ كَانُوا صَادِقِينَ (34)"));
        altors.add(new Altor("أَمْ خُلِقُوا مِنْ غَيْرِ شَيْءٍ أَمْ هُمُ الْخَالِقُونَ (35)"));
        altors.add(new Altor("أَمْ خَلَقُوا السَّمَاوَاتِ وَالْأَرْضَ بَل لَا يُوقِنُونَ (36)"));
        altors.add(new Altor("أَمْ عِنْدَهُمْ خَزَائِنُ رَبِّكَ أَمْ هُمُ الْمُسَيْطِرُونَ (37)"));
        altors.add(new Altor("أَمْ لَهُمْ سُلَّمٌ يَسْتَمِعُونَ فِيهِ فَلْيَأْتِ مُسْتَمِعُهُمْ بِسُلْطَانٍ مُبِينٍ (38)"));
        altors.add(new Altor("أَمْ لَهُ الْبَنَاتُ وَلَكُمُ الْبَنُونَ (39)"));
        altors.add(new Altor("أَمْ تَسْأَلُهُمْ أَجْرًا فَهُمْ مِنْ مَغْرَمٍ مُثْقَلُونَ (40)"));
        altors.add(new Altor("أَمْ عِنْدَهُمُ الْغَيْبُ فَهُمْ يَكْتُبُونَ (41)"));
        altors.add(new Altor("أَمْ يُرِيدُونَ كَيْدًا فَالَّذِينَ كَفَرُوا هُمُ الْمَكِيدُونَ (42)"));
        altors.add(new Altor("أَمْ لَهُمْ إِلَهٌ غَيْرُ اللَّهِ سُبْحَانَ اللَّهِ عَمَّا يُشْرِكُونَ (43)"));
        altors.add(new Altor("وَإِنْ يَرَوْا كِسْفًا مِنَ السَّمَاءِ سَاقِطًا يَقُولُوا سَحَابٌ مَرْكُومٌ (44)"));
        altors.add(new Altor("فَذَرْهُمْ حَتَّى يُلَاقُوا يَوْمَهُمُ الَّذِي فِيهِ يُصْعَقُونَ (45)"));
        altors.add(new Altor("يَوْمَ لَا يُغْنِي عَنْهُمْ كَيْدُهُمْ شَيْئًا وَلَا هُمْ يُنْصَرُونَ (46)"));
        altors.add(new Altor("وَإِنَّ لِلَّذِينَ ظَلَمُوا عَذَابًا دُونَ ذَلِكَ وَلَكِنَّ أَكْثَرَهُمْ لَا يَعْلَمُونَ (47)"));
        altors.add(new Altor("وَاصْبِرْ لِحُكْمِ رَبِّكَ فَإِنَّكَ بِأَعْيُنِنَا وَسَبِّحْ بِحَمْدِ رَبِّكَ حِينَ تَقُومُ (48)"));
        altors.add(new Altor("وَمِنَ اللَّيْلِ فَسَبِّحْهُ وَإِدْبَارَ النُّجُومِ (49)"));


        quran_text_52_adapter = new quran_text_52_adapter(altors ,QuranText_52Activity.this);

        recyclerView = findViewById(R.id.rv_52);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_52Activity.this));
        recyclerView.setAdapter(quran_text_52_adapter);


    }

}