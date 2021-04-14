package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_68Activity extends AppCompatActivity {

    ArrayList<Alqalm> alqalms = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_68_adapter quran_text_68_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_68);

        alqalms.add(new Alqalm("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alqalms.add(new Alqalm("ن وَالْقَلَمِ وَمَا يَسْطُرُونَ (1)"));
        alqalms.add(new Alqalm("مَا أَنْتَ بِنِعْمَةِ رَبِّكَ بِمَجْنُونٍ (2)"));
        alqalms.add(new Alqalm("وَإِنَّ لَكَ لَأَجْرًا غَيْرَ مَمْنُونٍ (3)"));
        alqalms.add(new Alqalm("وَإِنَّكَ لَعَلى خُلُقٍ عَظِيمٍ (4)"));
        alqalms.add(new Alqalm("فَسَتُبْصِرُ وَيُبْصِرُونَ (5)"));
        alqalms.add(new Alqalm("بِأَيِّيكُمُ الْمَفْتُونُ (6)"));
        alqalms.add(new Alqalm("إِنَّ رَبَّكَ هُوَ أَعْلَمُ بِمَنْ ضَلَّ عَنْ سَبِيلِهِ وَهُوَ أَعْلَمُ بِالْمُهْتَدِينَ (7)"));
        alqalms.add(new Alqalm("فَلَا تُطِعِ الْمُكَذِّبِينَ (8)"));
        alqalms.add(new Alqalm("وَدُّوا لَوْ تُدْهِنُ فَيُدْهِنُونَ (9)"));
        alqalms.add(new Alqalm("وَلَا تُطِعْ كُلَّ حَلَّافٍ مَهِينٍ (10)"));
        alqalms.add(new Alqalm("هَمَّازٍ مَشَّاءٍ بِنَمِيمٍ (11)"));
        alqalms.add(new Alqalm("مَنَّاعٍ لِلْخَيْرِ مُعْتَدٍ أَثِيمٍ (12)"));
        alqalms.add(new Alqalm("عُتُلٍّ بَعْدَ ذَلِكَ زَنِيمٍ (13)"));
        alqalms.add(new Alqalm("أَنْ كَانَ ذَا مَالٍ وَبَنِينَ (14)"));
        alqalms.add(new Alqalm("إِذَا تُتْلَى عَلَيْهِ آَيَاتُنَا قَالَ أَسَاطِيرُ الْأَوَّلِينَ (15)"));
        alqalms.add(new Alqalm("سَنَسِمُهُ عَلَى الْخُرْطُومِ (16)"));
        alqalms.add(new Alqalm("إِنَّا بَلَوْنَاهُمْ كَمَا بَلَوْنَا أَصْحَابَ الْجَنَّةِ إِذْ أَقْسَمُوا لَيَصْرِمُنَّهَا مُصْبِحِينَ (17)"));
        alqalms.add(new Alqalm("وَلَا يَسْتَثْنُونَ (18)"));
        alqalms.add(new Alqalm("فَطَافَ عَلَيْهَا طَائِفٌ مِنْ رَبِّكَ وَهُمْ نَائِمُونَ (19)"));
        alqalms.add(new Alqalm("فَأَصْبَحَتْ كَالصَّرِيمِ (20)"));
        alqalms.add(new Alqalm("فَتَنَادَوْا مُصْبِحِينَ (21)"));
        alqalms.add(new Alqalm("أَنِ اغْدُوا عَلَى حَرْثِكُمْ إِنْ كُنْتُمْ صَارِمِينَ (22)"));
        alqalms.add(new Alqalm("فَانْطَلَقُوا وَهُمْ يَتَخَافَتُونَ (23)"));
        alqalms.add(new Alqalm("أَنْ لَا يَدْخُلَنَّهَا الْيَوْمَ عَلَيْكُمْ مِسْكِينٌ (24)"));
        alqalms.add(new Alqalm("وَغَدَوْا عَلَى حَرْدٍ قَادِرِينَ (25)"));
        alqalms.add(new Alqalm("فَلَمَّا رَأَوْهَا قَالُوا إِنَّا لَضَالُّونَ (26)"));
        alqalms.add(new Alqalm("بَلْ نَحْنُ مَحْرُومُونَ (27)"));
        alqalms.add(new Alqalm("قَالَ أَوْسَطُهُمْ أَلَمْ أَقُلْ لَكُمْ لَوْلَا تُسَبِّحُونَ (28)"));
        alqalms.add(new Alqalm("قَالُوا سُبْحَانَ رَبِّنَا إِنَّا كُنَّا ظَالِمِينَ (29)"));
        alqalms.add(new Alqalm("فَأَقْبَلَ بَعْضُهُمْ عَلَى بَعْضٍ يَتَلَاوَمُونَ (30)"));
        alqalms.add(new Alqalm("قَالُوا يَا وَيْلَنَا إِنَّا كُنَّا طَاغِينَ (31)"));
        alqalms.add(new Alqalm("عَسَى رَبُّنَا أَنْ يُبْدِلَنَا خَيْرًا مِنْهَا إِنَّا إِلَى رَبِّنَا رَاغِبُونَ (32)"));
        alqalms.add(new Alqalm("كَذَلِكَ الْعَذَابُ وَلَعَذَابُ الْآَخِرَةِ أَكْبَرُ لَوْ كَانُوا يَعْلَمُونَ (33)"));
        alqalms.add(new Alqalm("إِنَّ لِلْمُتَّقِينَ عِنْدَ رَبِّهِمْ جَنَّاتِ النَّعِيمِ (34)"));
        alqalms.add(new Alqalm("أَفَنَجْعَلُ الْمُسْلِمِينَ كَالْمُجْرِمِينَ (35)"));
        alqalms.add(new Alqalm("مَا لَكُمْ كَيْفَ تَحْكُمُونَ (36)"));
        alqalms.add(new Alqalm("أَمْ لَكُمْ كِتَابٌ فِيهِ تَدْرُسُونَ (37)"));
        alqalms.add(new Alqalm("إِنَّ لَكُمْ فِيهِ لَمَا تَخَيَّرُونَ (38)"));
        alqalms.add(new Alqalm("أَمْ لَكُمْ أَيْمَانٌ عَلَيْنَا بَالِغَةٌ إِلَى يَوْمِ الْقِيَامَةِ إِنَّ لَكُمْ لَمَا تَحْكُمُونَ (39)"));
        alqalms.add(new Alqalm("سَلْهُمْ أَيُّهُمْ بِذَلِكَ زَعِيمٌ (40)"));
        alqalms.add(new Alqalm("أَمْ لَهُمْ شُرَكَاءُ فَلْيَأْتُوا بِشُرَكَائِهِمْ إِنْ كَانُوا صَادِقِينَ (41)"));
        alqalms.add(new Alqalm("يَوْمَ يُكْشَفُ عَنْ سَاقٍ وَيُدْعَوْنَ إِلَى السُّجُودِ فَلَا يَسْتَطِيعُونَ (42)"));
        alqalms.add(new Alqalm("خَاشِعَةً أَبْصَارُهُمْ تَرْهَقُهُمْ ذِلَّةٌ وَقَدْ كَانُوا يُدْعَوْنَ إِلَى السُّجُودِ وَهُمْ سَالِمُونَ (43)"));
        alqalms.add(new Alqalm("فَذَرْنِي وَمَنْ يُكَذِّبُ بِهَذَا الْحَدِيثِ سَنَسْتَدْرِجُهُمْ مِنْ حَيْثُ لَا يَعْلَمُونَ (44)"));
        alqalms.add(new Alqalm("وَأُمْلِي لَهُمْ إِنَّ كَيْدِي مَتِينٌ (45)"));
        alqalms.add(new Alqalm("أَمْ تَسْأَلُهُمْ أَجْرًا فَهُمْ مِنْ مَغْرَمٍ مُثْقَلُونَ (46)"));
        alqalms.add(new Alqalm("أَمْ عِنْدَهُمُ الْغَيْبُ فَهُمْ يَكْتُبُونَ (47)"));
        alqalms.add(new Alqalm("فَاصْبِرْ لِحُكْمِ رَبِّكَ وَلَا تَكُنْ كَصَاحِبِ الْحُوتِ إِذْ نَادَى وَهُوَ مَكْظُومٌ (48)"));
        alqalms.add(new Alqalm("لَوْلَا أَنْ تَدَارَكَهُ نِعْمَةٌ مِنْ رَبِّهِ لَنُبِذَ بِالْعَرَاءِ وَهُوَ مَذْمُومٌ (49)"));
        alqalms.add(new Alqalm("فَاجْتَبَاهُ رَبُّهُ فَجَعَلَهُ مِنَ الصَّالِحِينَ (50)"));
        alqalms.add(new Alqalm("وَإِنْ يَكَادُ الَّذِينَ كَفَرُوا لَيُزْلِقُونَكَ بِأَبْصَارِهِمْ لَمَّا سَمِعُوا الذِّكْرَ وَيَقُولُونَ إِنَّهُ لَمَجْنُونٌ (51)"));
        alqalms.add(new Alqalm("وَمَا هُوَ إِلَّا ذِكْرٌ لِلْعَالَمِينَ (52)"));

        quran_text_68_adapter = new quran_text_68_adapter(alqalms ,QuranText_68Activity.this);

        recyclerView = findViewById(R.id.rv_68);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_68Activity.this));
        recyclerView.setAdapter(quran_text_68_adapter);


    }

}