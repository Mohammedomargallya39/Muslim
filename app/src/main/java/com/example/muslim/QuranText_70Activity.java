package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_70Activity extends AppCompatActivity {

    ArrayList<Almaareg> almaaregs = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_70_adapter quran_text_70_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_70);

        almaaregs.add(new Almaareg("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        almaaregs.add(new Almaareg("سَأَلَ سَائِلٌ بِعَذَابٍ وَاقِعٍ (1)"));
        almaaregs.add(new Almaareg("لِلْكَافِرينَ لَيْسَ لَهُ دَافِعٌ (2)"));
        almaaregs.add(new Almaareg("مِنَ اللَّهِ ذِي الْمَعَارِجِ (3)"));
        almaaregs.add(new Almaareg("تَعْرُجُ الْمَلَائِكَةُ وَالرُّوحُ إِلَيْهِ فِي يَوْمٍ كَانَ مِقْدَارُهُ خَمْسِينَ أَلْفَ سَنَةٍ (4)"));
        almaaregs.add(new Almaareg("فَاصْبِرْ صَبْرًا جَمِيلًا (5)"));
        almaaregs.add(new Almaareg("إِنَّهُمْ يَرَوْنَهُ بَعِيدًا (6)"));
        almaaregs.add(new Almaareg("وَنَرَاهُ قَرِيبًا (7)"));
        almaaregs.add(new Almaareg("يَوْمَ تَكُونُ السَّمَاءُ كَالْمُهْلِ (8)"));
        almaaregs.add(new Almaareg("وَتَكُونُ الْجِبَالُ كَالْعِهْنِ (9)"));
        almaaregs.add(new Almaareg("وَلَا يَسْأَلُ حَمِيمٌ حَمِيمًا (10)"));
        almaaregs.add(new Almaareg("يُبَصَّرُونَهُمْ يَوَدُّ الْمُجْرِمُ لَوْ يَفْتَدِي مِنْ عَذَابِ يَوْمِئِذٍ بِبَنِيهِ (11)"));
        almaaregs.add(new Almaareg("وَصَاحِبَتِهِ وَأَخِيهِ (12)"));
        almaaregs.add(new Almaareg("وَفَصِيلَتِهِ الَّتِي تُؤْوِيهِ (13)"));
        almaaregs.add(new Almaareg("وَمَنْ فِي الْأَرْضِ جَمِيعًا ثُمَّ يُنْجِيهِ (14)"));
        almaaregs.add(new Almaareg("كَلَّا إِنَّهَا لَظَى (15)"));
        almaaregs.add(new Almaareg("نَزَّاعَةً لِلشَّوَى (16)"));
        almaaregs.add(new Almaareg("تَدْعُوا مَنْ أَدْبَرَ وَتَوَلَّى (17)"));
        almaaregs.add(new Almaareg("وَجَمَعَ فَأَوْعَى (18)"));
        almaaregs.add(new Almaareg("إِنَّ الْإِنْسَانَ خُلِقَ هَلُوعًا (19)"));
        almaaregs.add(new Almaareg("إِذَا مَسَّهُ الشَّرُّ جَزُوعًا (20)"));
        almaaregs.add(new Almaareg("وَإِذَا مَسَّهُ الْخَيْرُ مَنُوعًا (21)"));
        almaaregs.add(new Almaareg("إِلَّا الْمُصَلِّينَ (22)"));
        almaaregs.add(new Almaareg("الَّذِينَ هُمْ عَلَى صَلَاتِهِمْ دَائِمُونَ (23)"));
        almaaregs.add(new Almaareg("وَالَّذِينَ فِي أَمْوَالِهِمْ حَقٌّ مَعْلُومٌ (24)"));
        almaaregs.add(new Almaareg("لِلسَّائِلِ وَالْمَحْرُومِ (25)"));
        almaaregs.add(new Almaareg("وَالَّذِينَ يُصَدِّقُونَ بِيَوْمِ الدِّينِ (26)"));
        almaaregs.add(new Almaareg("وَالَّذِينَ هُمْ مِنْ عَذَابِ رَبِّهِمْ مُشْفِقُونَ (27)"));
        almaaregs.add(new Almaareg("إِنَّ عَذَابَ رَبِّهِمْ غَيْرُ مَأْمُونٍ (28)"));
        almaaregs.add(new Almaareg("وَالَّذِينَ هُمْ لِفُرُوجِهِمْ حَافِظُونَ (29)"));
        almaaregs.add(new Almaareg("إِلَّا عَلَى أَزْوَاجِهِمْ أَوْ مَا مَلَكَتْ أَيْمَانُهُمْ فَإِنَّهُمْ غَيْرُ مَلُومِينَ (30)"));
        almaaregs.add(new Almaareg("فَمَنِ ابْتَغَى وَرَاءَ ذَلِكَ فَأُولَئِكَ هُمُ الْعَادُونَ (31)"));
        almaaregs.add(new Almaareg("وَالَّذِينَ هُمْ لِأَمَانَاتِهِمْ وَعَهْدِهِمْ رَاعُونَ (32)"));
        almaaregs.add(new Almaareg("وَالَّذِينَ هُمْ بِشَهَادَاتِهِمْ قَائِمُونَ (33)"));
        almaaregs.add(new Almaareg("وَالَّذِينَ هُمْ عَلَى صَلَاتِهِمْ يُحَافِظُونَ (34)"));
        almaaregs.add(new Almaareg("أُولَئِكَ فِي جَنَّاتٍ مُكْرَمُونَ (35)"));
        almaaregs.add(new Almaareg("فَمَالِ الَّذِينَ كَفَرُوا قِبَلَكَ مُهْطِعِينَ (36)"));
        almaaregs.add(new Almaareg("عَنِ الْيَمِينِ وَعَنِ الشِّمَالِ عِزِينَ (37)"));
        almaaregs.add(new Almaareg("أَيَطْمَعُ كُلُّ امْرِئٍ مِنْهُمْ أَنْ يُدْخَلَ جَنَّةَ نَعِيمٍ (38)"));
        almaaregs.add(new Almaareg("كَلَّا إِنَّا خَلَقْنَاهُمْ مِمَّا يَعْلَمُونَ (39)"));
        almaaregs.add(new Almaareg("فَلَا أُقْسِمُ بِرَبِّ الْمَشَارِقِ وَالْمَغَارِبِ إِنَّا لَقَادِرُونَ (40)"));
        almaaregs.add(new Almaareg("عَلَى أَنْ نُبَدِّلَ خَيْرًا مِنْهُمْ وَمَا نَحْنُ بِمَسْبُوقِينَ (41)"));
        almaaregs.add(new Almaareg("فَذَرْهُمْ يَخُوضُوا وَيَلْعَبُوا حَتَّى يُلَاقُوا يَوْمَهُمُ الَّذِي يُوعَدُونَ (42)"));
        almaaregs.add(new Almaareg("يَوْمَ يَخْرُجُونَ مِنَ الْأَجْدَاثِ سِرَاعًا كَأَنَّهُمْ إِلَى نُصُبٍ يُوفِضُونَ (43)"));
        almaaregs.add(new Almaareg("خَاشِعَةً أَبْصَارُهُمْ تَرْهَقُهُمْ ذِلَّةٌ ذَلِكَ الْيَوْمُ الَّذِي كَانُوا يُوعَدُونَ (44)"));


        quran_text_70_adapter = new quran_text_70_adapter(almaaregs ,QuranText_70Activity.this);

        recyclerView = findViewById(R.id.rv_70);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_70Activity.this));
        recyclerView.setAdapter(quran_text_70_adapter);


    }

}