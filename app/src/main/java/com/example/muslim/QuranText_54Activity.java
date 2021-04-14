package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_54Activity extends AppCompatActivity {

    ArrayList<Alqamr> alqamrs = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_54_adapter quran_text_54_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_54);

        alqamrs.add(new Alqamr("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alqamrs.add(new Alqamr("اقْتَرَبَتِ السَّاعَةُ وَانْشَقَّ الْقَمَرُ (1)"));
        alqamrs.add(new Alqamr("وَإِنْ يَرَوْا آَيَةً يُعْرِضُوا وَيَقُولُوا سِحْرٌ مُسْتَمِرٌّ (2)"));
        alqamrs.add(new Alqamr("وَكَذَّبُوا وَاتَّبَعُوا أَهْوَاءَهُمْ وَكُلُّ أَمْرٍ مُسْتَقِرٌّ (3)"));
        alqamrs.add(new Alqamr("وَلَقَدْ جَاءَهُمْ مِنَ الْأَنْبَاءِ مَا فِيهِ مُزْدَجَرٌ (4)"));
        alqamrs.add(new Alqamr("حِكْمَةٌ بَالِغَةٌ فَمَا تُغْنِ النُّذُرُ (5)"));
        alqamrs.add(new Alqamr("فَتَوَلَّ عَنْهُمْ يَوْمَ يَدْعُ الدَّاعِ إِلَى شَيْءٍ نُكُرٍ (6)"));
        alqamrs.add(new Alqamr("خُشَّعًا أَبْصَارُهُمْ يَخْرُجُونَ مِنَ الْأَجْدَاثِ كَأَنَّهُمْ جَرَادٌ مُنْتَشِرٌ (7)"));
        alqamrs.add(new Alqamr("مُهْطِعِينَ إِلَى الدَّاعِ يَقُولُ الْكَافِرُونَ هَذَا يَوْمٌ عَسِرٌ (8)"));
        alqamrs.add(new Alqamr("كَذَّبَتْ قَبْلَهُمْ قَوْمُ نُوحٍ فَكَذَّبُوا عَبْدَنَا وَقَالُوا مَجْنُونٌ وَازْدُجِرَ (9)"));
        alqamrs.add(new Alqamr("فَدَعَا رَبَّهُ أَنِّي مَغْلُوبٌ فَانْتَصِرْ (10)"));
        alqamrs.add(new Alqamr("فَفَتَحْنَا أَبْوَابَ السَّمَاءِ بِمَاءٍ مُنْهَمِرٍ (11)"));
        alqamrs.add(new Alqamr("وَفَجَّرْنَا الْأَرْضَ عُيُونًا فَالْتَقَى الْمَاءُ عَلَى أَمْرٍ قَدْ قُدِرَ (12)"));
        alqamrs.add(new Alqamr("وَحَمَلْنَاهُ عَلَى ذَاتِ أَلْوَاحٍ وَدُسُرٍ (13)"));
        alqamrs.add(new Alqamr("تَجْرِي بِأَعْيُنِنَا جَزَاءً لِمَنْ كَانَ كُفِرَ (14)"));
        alqamrs.add(new Alqamr("وَلَقَدْ تَرَكْنَاهَا آَيَةً فَهَلْ مِنْ مُدَّكِرٍ (15)"));
        alqamrs.add(new Alqamr("فَكَيْفَ كَانَ عَذَابِي وَنُذُرِ (16)"));
        alqamrs.add(new Alqamr("وَلَقَدْ يَسَّرْنَا الْقُرْآَنَ لِلذِّكْرِ فَهَلْ مِنْ مُدَّكِرٍ (17)"));
        alqamrs.add(new Alqamr("كَذَّبَتْ عَادٌ فَكَيْفَ كَانَ عَذَابِي وَنُذُرِ (18)"));
        alqamrs.add(new Alqamr("إِنَّا أَرْسَلْنَا عَلَيْهِمْ رِيحًا صَرْصَرًا فِي يَوْمِ نَحْسٍ مُسْتَمِرٍّ (19)"));
        alqamrs.add(new Alqamr("تَنْزِعُ النَّاسَ كَأَنَّهُمْ أَعْجَازُ نَخْلٍ مُنْقَعِرٍ (20)"));
        alqamrs.add(new Alqamr("فَكَيْفَ كَانَ عَذَابِي وَنُذُرِ (21)"));
        alqamrs.add(new Alqamr("وَلَقَدْ يَسَّرْنَا الْقُرْآَنَ لِلذِّكْرِ فَهَلْ مِنْ مُدَّكِرٍ (22)"));
        alqamrs.add(new Alqamr("كَذَّبَتْ ثَمُودُ بِالنُّذُرِ (23)"));
        alqamrs.add(new Alqamr("فَقَالُوا أَبَشَرًا مِنَّا وَاحِدًا نَتَّبِعُهُ إِنَّا إِذًا لَفِي ضَلَالٍ وَسُعُرٍ (24)"));
        alqamrs.add(new Alqamr("أَؤُلْقِيَ الذِّكْرُ عَلَيْهِ مِنْ بَيْنِنَا بَلْ هُوَ كَذَّابٌ أَشِرٌ (25)"));
        alqamrs.add(new Alqamr("سَيَعْلَمُونَ غَدًا مَنِ الْكَذَّابُ الْأَشِرُ (26)"));
        alqamrs.add(new Alqamr("إِنَّا مُرْسِلُو النَّاقَةِ فِتْنَةً لَهُمْ فَارْتَقِبْهُمْ وَاصْطَبِرْ (27)"));
        alqamrs.add(new Alqamr("وَنَبِّئْهُمْ أَنَّ الْمَاءَ قِسْمَةٌ بَيْنَهُمْ كُلُّ شِرْبٍ مُحْتَضَرٌ (28)"));
        alqamrs.add(new Alqamr("فَنَادَوْا صَاحِبَهُمْ فَتَعَاطَى فَعَقَرَ (29)"));
        alqamrs.add(new Alqamr("فَكَيْفَ كَانَ عَذَابِي وَنُذُرِ (30)"));
        alqamrs.add(new Alqamr("إِنَّا أَرْسَلْنَا عَلَيْهِمْ صَيْحَةً وَاحِدَةً فَكَانُوا كَهَشِيمِ الْمُحْتَظِرِ (31)"));
        alqamrs.add(new Alqamr("وَلَقَدْ يَسَّرْنَا الْقُرْآَنَ لِلذِّكْرِ فَهَلْ مِنْ مُدَّكِرٍ (32)"));
        alqamrs.add(new Alqamr("كَذَّبَتْ قَوْمُ لُوطٍ بِالنُّذُرِ (33)"));
        alqamrs.add(new Alqamr("إِنَّا أَرْسَلْنَا عَلَيْهِمْ حَاصِبًا إِلَّا آَلَ لُوطٍ نَجَّيْنَاهُمْ بِسَحَرٍ (34)"));
        alqamrs.add(new Alqamr("نِعْمَةً مِنْ عِنْدِنَا كَذَلِكَ نَجْزِي مَنْ شَكَرَ (35)"));
        alqamrs.add(new Alqamr("وَلَقَدْ أَنْذَرَهُمْ بَطْشَتَنَا فَتَمَارَوْا بِالنُّذُرِ (36)"));
        alqamrs.add(new Alqamr("وَلَقَدْ رَاوَدُوهُ عَنْ ضَيْفِهِ فَطَمَسْنَا أَعْيُنَهُمْ فَذُوقُوا عَذَابِي وَنُذُرِ (37)"));
        alqamrs.add(new Alqamr("وَلَقَدْ صَبَّحَهُمْ بُكْرَةً عَذَابٌ مُسْتَقِرٌّ (38)"));
        alqamrs.add(new Alqamr("فَذُوقُوا عَذَابِي وَنُذُرِ (39)"));
        alqamrs.add(new Alqamr("وَلَقَدْ يَسَّرْنَا الْقُرْآَنَ لِلذِّكْرِ فَهَلْ مِنْ مُدَّكِرٍ (40)"));
        alqamrs.add(new Alqamr("وَلَقَدْ جَاءَ آَلَ فِرْعَوْنَ النُّذُرُ (41)"));
        alqamrs.add(new Alqamr("كَذَّبُوا بِآَيَاتِنَا كُلِّهَا فَأَخَذْنَاهُمْ أَخْذَ عَزِيزٍ مُقْتَدِرٍ (42)"));
        alqamrs.add(new Alqamr("أَكُفَّارُكُمْ خَيْرٌ مِنْ أُولَئِكُمْ أَمْ لَكُمْ بَرَاءَةٌ فِي الزُّبُرِ (43)"));
        alqamrs.add(new Alqamr("أَمْ يَقُولُونَ نَحْنُ جَمِيعٌ مُنْتَصِرٌ (44)"));
        alqamrs.add(new Alqamr("سَيُهْزَمُ الْجَمْعُ وَيُوَلُّونَ الدُّبُرَ (45)"));
        alqamrs.add(new Alqamr("بَلِ السَّاعَةُ مَوْعِدُهُمْ وَالسَّاعَةُ أَدْهَى وَأَمَرُّ (46)"));
        alqamrs.add(new Alqamr("إِنَّ الْمُجْرِمِينَ فِي ضَلَالٍ وَسُعُرٍ (47)"));
        alqamrs.add(new Alqamr("يَوْمَ يُسْحَبُونَ فِي النَّارِ عَلَى وُجُوهِهِمْ ذُوقُوا مَسَّ سَقَرَ (48)"));
        alqamrs.add(new Alqamr("إِنَّا كُلَّ شَيْءٍ خَلَقْنَاهُ بِقَدَرٍ (49)"));
        alqamrs.add(new Alqamr("وَمَا أَمْرُنَا إِلَّا وَاحِدَةٌ كَلَمْحٍ بِالْبَصَرِ (50)"));
        alqamrs.add(new Alqamr("وَلَقَدْ أَهْلَكْنَا أَشْيَاعَكُمْ فَهَلْ مِنْ مُدَّكِرٍ (51)"));
        alqamrs.add(new Alqamr("وَكُلُّ شَيْءٍ فَعَلُوهُ فِي الزُّبُرِ (52)"));
        alqamrs.add(new Alqamr("وَكُلُّ صَغِيرٍ وَكَبِيرٍ مُسْتَطَرٌ (53)"));
        alqamrs.add(new Alqamr("إِنَّ الْمُتَّقِينَ فِي جَنَّاتٍ وَنَهَرٍ (54)"));
        alqamrs.add(new Alqamr("فِي مَقْعَدِ صِدْقٍ عِنْدَ مَلِيكٍ مُقْتَدِرٍ (55)"));



        quran_text_54_adapter = new quran_text_54_adapter(alqamrs ,QuranText_54Activity.this);

        recyclerView = findViewById(R.id.rv_54);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_54Activity.this));
        recyclerView.setAdapter(quran_text_54_adapter);


    }

}