package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_51Activity extends AppCompatActivity {

    ArrayList<Alzoriat> alzoriats = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_51_adapter quran_text_51_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_51);

        alzoriats.add(new Alzoriat("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alzoriats.add(new Alzoriat("وَالذَّارِيَاتِ ذَرْوًا (1)"));
        alzoriats.add(new Alzoriat("فَالْحَامِلَاتِ وِقْرًا (2)"));
        alzoriats.add(new Alzoriat("فَالْجَارِيَاتِ يُسْرًا (3)"));
        alzoriats.add(new Alzoriat("فَالْمُقَسِّمَاتِ أَمْرًا (4)"));
        alzoriats.add(new Alzoriat("إِنَّمَا تُوعَدُونَ لَصَادِقٌ (5)"));
        alzoriats.add(new Alzoriat("وَإِنَّ الدِّينَ لَوَاقِعٌ (6)"));
        alzoriats.add(new Alzoriat("وَالسَّمَاءِ ذَاتِ الْحُبُكِ (7)"));
        alzoriats.add(new Alzoriat("إِنَّكُمْ لَفِي قَوْلٍ مُخْتَلِفٍ (8)"));
        alzoriats.add(new Alzoriat("يُؤْفَكُ عَنْهُ مَنْ أُفِكَ (9)"));
        alzoriats.add(new Alzoriat("قُتِلَ الْخَرَّاصُونَ (10)"));
        alzoriats.add(new Alzoriat("الَّذِينَ هُمْ فِي غَمْرَةٍ سَاهُونَ (11)"));
        alzoriats.add(new Alzoriat("يَسْأَلُونَ أَيَّانَ يَوْمُ الدِّينِ (12)"));
        alzoriats.add(new Alzoriat("يَوْمَ هُمْ عَلَى النَّارِ يُفْتَنُونَ (13)"));
        alzoriats.add(new Alzoriat("ذُوقُوا فِتْنَتَكُمْ هَذَا الَّذِي كُنْتُمْ بِهِ تَسْتَعْجِلُونَ (14)"));
        alzoriats.add(new Alzoriat("إِنَّ الْمُتَّقِينَ فِي جَنَّاتٍ وَعُيُونٍ (15)"));
        alzoriats.add(new Alzoriat("آَخِذِينَ مَا آَتَاهُمْ رَبُّهُمْ إِنَّهُمْ كَانُوا قَبْلَ ذَلِكَ مُحْسِنِينَ (16)"));
        alzoriats.add(new Alzoriat("كَانُوا قَلِيلًا مِنَ اللَّيْلِ مَا يَهْجَعُونَ (17)"));
        alzoriats.add(new Alzoriat("وَبِالْأَسْحَارِ هُمْ يَسْتَغْفِرُونَ (18)"));
        alzoriats.add(new Alzoriat("وَفِي أَمْوَالِهِمْ حَقٌّ لِلسَّائِلِ وَالْمَحْرُومِ (19)"));
        alzoriats.add(new Alzoriat("وَفِي الْأَرْضِ آَيَاتٌ لِلْمُوقِنِينَ (20)"));
        alzoriats.add(new Alzoriat("وَفِي أَنْفُسِكُمْ أَفَلَا تُبْصِرُونَ (21)"));
        alzoriats.add(new Alzoriat("وَفِي السَّمَاءِ رِزْقُكُمْ وَمَا تُوعَدُونَ (22)"));
        alzoriats.add(new Alzoriat("فَوَرَبِّ السَّمَاءِ وَالْأَرْضِ إِنَّهُ لَحَقٌّ مِثْلَ مَا أَنَّكُمْ تَنْطِقُونَ (23)"));
        alzoriats.add(new Alzoriat("هَلْ أَتَاكَ حَدِيثُ ضَيْفِ إِبْرَاهِيمَ الْمُكْرَمِينَ (24)"));
        alzoriats.add(new Alzoriat("إِذْ دَخَلُوا عَلَيْهِ فَقَالُوا سَلَامًا قَالَ سَلَامٌ قَوْمٌ مُنْكَرُونَ (25)"));
        alzoriats.add(new Alzoriat("فَرَاغَ إِلَى أَهْلِهِ فَجَاءَ بِعِجْلٍ سَمِينٍ (26)"));
        alzoriats.add(new Alzoriat("فَقَرَّبَهُ إِلَيْهِمْ قَالَ أَلَا تَأْكُلُونَ (27)"));
        alzoriats.add(new Alzoriat("فَأَوْجَسَ مِنْهُمْ خِيفَةً قَالُوا لَا تَخَفْ وَبَشَّرُوهُ بِغُلَامٍ عَلِيمٍ (28)"));
        alzoriats.add(new Alzoriat("فَأَقْبَلَتِ امْرَأَتُهُ فِي صَرَّةٍ فَصَكَّتْ وَجْهَهَا وَقَالَتْ عَجُوزٌ عَقِيمٌ (29)"));
        alzoriats.add(new Alzoriat("قَالُوا كَذَلِكَ قَالَ رَبُّكِ إِنَّهُ هُوَ الْحَكِيمُ الْعَلِيمُ (30)"));
        alzoriats.add(new Alzoriat("قَالَ فَمَا خَطْبُكُمْ أَيُّهَا الْمُرْسَلُونَ (31)"));
        alzoriats.add(new Alzoriat("قَالُوا إِنَّا أُرْسِلْنَا إِلَى قَوْمٍ مُجْرِمِينَ (32)"));
        alzoriats.add(new Alzoriat("لِنُرْسِلَ عَلَيْهِمْ حِجَارَةً مِنْ طِينٍ (33)"));
        alzoriats.add(new Alzoriat("مُسَوَّمَةً عِنْدَ رَبِّكَ لِلْمُسْرِفِينَ (34)"));
        alzoriats.add(new Alzoriat("فَأَخْرَجْنَا مَنْ كَانَ فِيهَا مِنَ الْمُؤْمِنِينَ (35)"));
        alzoriats.add(new Alzoriat("فَمَا وَجَدْنَا فِيهَا غَيْرَ بَيْتٍ مِنَ الْمُسْلِمِينَ (36)"));
        alzoriats.add(new Alzoriat("وَتَرَكْنَا فِيهَا آَيَةً لِلَّذِينَ يَخَافُونَ الْعَذَابَ الْأَلِيمَ (37)"));
        alzoriats.add(new Alzoriat("وَفِي مُوسَى إِذْ أَرْسَلْنَاهُ إِلَى فِرْعَوْنَ بِسُلْطَانٍ مُبِينٍ (38)"));
        alzoriats.add(new Alzoriat("فَتَوَلَّى بِرُكْنِهِ وَقَالَ سَاحِرٌ أَوْ مَجْنُونٌ (39)"));
        alzoriats.add(new Alzoriat("فَأَخَذْنَاهُ وَجُنُودَهُ فَنَبَذْنَاهُمْ فِي الْيَمِّ وَهُوَ مُلِيمٌ (40)"));
        alzoriats.add(new Alzoriat("وَفِي عَادٍ إِذْ أَرْسَلْنَا عَلَيْهِمُ الرِّيحَ الْعَقِيمَ (41)"));
        alzoriats.add(new Alzoriat("مَا تَذَرُ مِنْ شَيْءٍ أَتَتْ عَلَيْهِ إِلَّا جَعَلَتْهُ كَالرَّمِيمِ (42)"));
        alzoriats.add(new Alzoriat("وَفِي ثَمُودَ إِذْ قِيلَ لَهُمْ تَمَتَّعُوا حَتَّى حِينٍ (43)"));
        alzoriats.add(new Alzoriat("فَعَتَوْا عَنْ أَمْرِ رَبِّهِمْ فَأَخَذَتْهُمُ الصَّاعِقَةُ وَهُمْ يَنْظُرُونَ (44)"));
        alzoriats.add(new Alzoriat("فَمَا اسْتَطَاعُوا مِنْ قِيَامٍ وَمَا كَانُوا مُنْتَصِرِينَ (45)"));
        alzoriats.add(new Alzoriat("وَقَوْمَ نُوحٍ مِنْ قَبْلُ إِنَّهُمْ كَانُوا قَوْمًا فَاسِقِينَ (46)"));
        alzoriats.add(new Alzoriat("وَالسَّمَاءَ بَنَيْنَاهَا بِأَيْدٍ وَإِنَّا لَمُوسِعُونَ (47)"));
        alzoriats.add(new Alzoriat("وَالْأَرْضَ فَرَشْنَاهَا فَنِعْمَ الْمَاهِدُونَ (48)"));
        alzoriats.add(new Alzoriat("وَمِنْ كُلِّ شَيْءٍ خَلَقْنَا زَوْجَيْنِ لَعَلَّكُمْ تَذَكَّرُونَ (49)"));
        alzoriats.add(new Alzoriat("فَفِرُّوا إِلَى اللَّهِ إِنِّي لَكُمْ مِنْهُ نَذِيرٌ مُبِينٌ (50)"));
        alzoriats.add(new Alzoriat("وَلَا تَجْعَلُوا مَعَ اللَّهِ إِلَهًا آَخَرَ إِنِّي لَكُمْ مِنْهُ نَذِيرٌ مُبِينٌ (51)"));
        alzoriats.add(new Alzoriat("كَذَلِكَ مَا أَتَى الَّذِينَ مِنْ قَبْلِهِمْ مِنْ رَسُولٍ إِلَّا قَالُوا سَاحِرٌ أَوْ مَجْنُونٌ (52)"));
        alzoriats.add(new Alzoriat("أَتَوَاصَوْا بِهِ بَلْ هُمْ قَوْمٌ طَاغُونَ (53)"));
        alzoriats.add(new Alzoriat("فَتَوَلَّ عَنْهُمْ فَمَا أَنْتَ بِمَلُومٍ (54)"));
        alzoriats.add(new Alzoriat("وَذَكِّرْ فَإِنَّ الذِّكْرَى تَنْفَعُ الْمُؤْمِنِينَ (55)"));
        alzoriats.add(new Alzoriat("وَمَا خَلَقْتُ الْجِنَّ وَالْإِنْسَ إِلَّا لِيَعْبُدُونِ (56)"));
        alzoriats.add(new Alzoriat("مَا أُرِيدُ مِنْهُمْ مِنْ رِزْقٍ وَمَا أُرِيدُ أَنْ يُطْعِمُونِ (57)"));
        alzoriats.add(new Alzoriat("إِنَّ اللَّهَ هُوَ الرَّزَّاقُ ذُو الْقُوَّةِ الْمَتِينُ (58)"));
        alzoriats.add(new Alzoriat("فَإِنَّ لِلَّذِينَ ظَلَمُوا ذَنُوبًا مِثْلَ ذَنُوبِ أَصْحَابِهِمْ فَلَا يَسْتَعْجِلُونِ (59)"));
        alzoriats.add(new Alzoriat("فَوَيْلٌ لِلَّذِينَ كَفَرُوا مِنْ يَوْمِهِمُ الَّذِي يُوعَدُونَ (60)"));



        quran_text_51_adapter = new quran_text_51_adapter(alzoriats ,QuranText_51Activity.this);

        recyclerView = findViewById(R.id.rv_51);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_51Activity.this));
        recyclerView.setAdapter(quran_text_51_adapter);


    }

}