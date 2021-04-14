package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_55Activity extends AppCompatActivity {

    ArrayList<Alrahman> alrahmans = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_55_adapter quran_text_55_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_55);

        alrahmans.add(new Alrahman("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alrahmans.add(new Alrahman("الرَّحْمَنُ (1)"));
        alrahmans.add(new Alrahman("عَلَّمَ الْقُرْآَنَ (2)"));
        alrahmans.add(new Alrahman("خَلَقَ الْإِنْسَانَ (3)"));
        alrahmans.add(new Alrahman("عَلَّمَهُ الْبَيَانَ (4)"));
        alrahmans.add(new Alrahman("الشَّمْسُ وَالْقَمَرُ بِحُسْبَانٍ (5)"));
        alrahmans.add(new Alrahman("وَالنَّجْمُ وَالشَّجَرُ يَسْجُدَانِ (6)"));
        alrahmans.add(new Alrahman("وَالسَّمَاءَ رَفَعَهَا وَوَضَعَ الْمِيزَانَ (7)"));
        alrahmans.add(new Alrahman("أَلَّا تَطْغَوْا فِي الْمِيزَانِ (8)"));
        alrahmans.add(new Alrahman("وَأَقِيمُوا الْوَزْنَ بِالْقِسْطِ وَلَا تُخْسِرُوا الْمِيزَانَ (9)"));
        alrahmans.add(new Alrahman("الْأَرْضَ وَضَعَهَا لِلْأَنَامِ (10)"));
        alrahmans.add(new Alrahman("فِيهَا فَاكِهَةٌ وَالنَّخْلُ ذَاتُ الْأَكْمَامِ (11)"));
        alrahmans.add(new Alrahman("وَالْحَبُّ ذُو الْعَصْفِ وَالرَّيْحَانُ (12)"));
        alrahmans.add(new Alrahman("فَبِأَيِّ آَلَاءِ رَبِّكُمَا تُكَذِّبَانِ (13)"));
        alrahmans.add(new Alrahman("خَلَقَ الْإِنْسَانَ مِنْ صَلْصَالٍ كَالْفَخَّارِ (14)"));
        alrahmans.add(new Alrahman("وَخَلَقَ الْجَانَّ مِنْ مَارِجٍ مِنْ نَارٍ (15)"));
        alrahmans.add(new Alrahman("فَبِأَيِّ آَلَاءِ رَبِّكُمَا تُكَذِّبَانِ (16)"));
        alrahmans.add(new Alrahman("رَبُّ الْمَشْرِقَيْنِ وَرَبُّ الْمَغْرِبَيْنِ (17)"));
        alrahmans.add(new Alrahman("فَبِأَيِّ آَلَاءِ رَبِّكُمَا تُكَذِّبَانِ (18)"));
        alrahmans.add(new Alrahman("مَرَجَ الْبَحْرَيْنِ يَلْتَقِيَانِ (19)"));
        alrahmans.add(new Alrahman("بَيْنَهُمَا بَرْزَخٌ لَا يَبْغِيَانِ (20)"));
        alrahmans.add(new Alrahman("فَبِأَيِّ آَلَاءِ رَبِّكُمَا تُكَذِّبَانِ (21)"));
        alrahmans.add(new Alrahman("يَخْرُجُ مِنْهُمَا اللُّؤْلُؤُ وَالْمَرْجَانُ (22)"));
        alrahmans.add(new Alrahman("فَبِأَيِّ آَلَاءِ رَبِّكُمَا تُكَذِّبَانِ (23)"));
        alrahmans.add(new Alrahman("وَلَهُ الْجَوَارِ الْمُنْشَآَتُ فِي الْبَحْرِ كَالْأَعْلَامِ (24)"));
        alrahmans.add(new Alrahman("فَبِأَيِّ آَلَاءِ رَبِّكُمَا تُكَذِّبَانِ (25)"));
        alrahmans.add(new Alrahman("كُلُّ مَنْ عَلَيْهَا فَانٍ (26)"));
        alrahmans.add(new Alrahman("وَيَبْقَى وَجْهُ رَبِّكَ ذُو الْجَلَالِ وَالْإِكْرَامِ (27)"));
        alrahmans.add(new Alrahman("فَبِأَيِّ آَلَاءِ رَبِّكُمَا تُكَذِّبَانِ (28)"));
        alrahmans.add(new Alrahman("يَسْأَلُهُ مَنْ فِي السَّمَاوَاتِ وَالْأَرْضِ كُلَّ يَوْمٍ هُوَ فِي شَأْنٍ (29)"));
        alrahmans.add(new Alrahman("فَبِأَيِّ آَلَاءِ رَبِّكُمَا تُكَذِّبَانِ (30)"));
        alrahmans.add(new Alrahman("سَنَفْرُغُ لَكُمْ أَيُّهَا الثَّقَلَانِ (31)"));
        alrahmans.add(new Alrahman("فَبِأَيِّ آَلَاءِ رَبِّكُمَا تُكَذِّبَانِ (32)"));
        alrahmans.add(new Alrahman("يَا مَعْشَرَ الْجِنِّ وَالْإِنْسِ إِنِ اسْتَطَعْتُمْ أَنْ تَنْفُذُوا مِنْ أَقْطَارِ السَّمَاوَاتِ وَالْأَرْضِ فَانْفُذُوا لَا تَنْفُذُونَ إِلَّا بِسُلْطَانٍ (33)"));
        alrahmans.add(new Alrahman("فَبِأَيِّ آَلَاءِ رَبِّكُمَا تُكَذِّبَانِ (34)"));
        alrahmans.add(new Alrahman("يُرْسَلُ عَلَيْكُمَا شُوَاظٌ مِنْ نَارٍ وَنُحَاسٌ فَلَا تَنْتَصِرَانِ (35)"));
        alrahmans.add(new Alrahman("فَبِأَيِّ آَلَاءِ رَبِّكُمَا تُكَذِّبَانِ (36)"));
        alrahmans.add(new Alrahman("فَإِذَا انْشَقَّتِ السَّمَاءُ فَكَانَتْ وَرْدَةً كَالدِّهَانِ (37)"));
        alrahmans.add(new Alrahman("فَبِأَيِّ آَلَاءِ رَبِّكُمَا تُكَذِّبَانِ (38)"));
        alrahmans.add(new Alrahman("فَيَوْمَئِذٍ لَا يُسْأَلُ عَنْ ذَنْبِهِ إِنْسٌ وَلَا جَانٌّ (39)"));
        alrahmans.add(new Alrahman("فَبِأَيِّ آَلَاءِ رَبِّكُمَا تُكَذِّبَانِ (40)"));
        alrahmans.add(new Alrahman("يُعْرَفُ الْمُجْرِمُونَ بِسِيمَاهُمْ فَيُؤْخَذُ بِالنَّوَاصِي وَالْأَقْدَامِ (41)"));
        alrahmans.add(new Alrahman("فَبِأَيِّ آَلَاءِ رَبِّكُمَا تُكَذِّبَانِ (42)"));
        alrahmans.add(new Alrahman("هَذِهِ جَهَنَّمُ الَّتِي يُكَذِّبُ بِهَا الْمُجْرِمُونَ (43)"));
        alrahmans.add(new Alrahman("يَطُوفُونَ بَيْنَهَا وَبَيْنَ حَمِيمٍ آَنٍ (44)"));
        alrahmans.add(new Alrahman("فَبِأَيِّ آَلَاءِ رَبِّكُمَا تُكَذِّبَانِ (45)"));
        alrahmans.add(new Alrahman("وَلِمَنْ خَافَ مَقَامَ رَبِّهِ جَنَّتَانِ (46)"));
        alrahmans.add(new Alrahman("فَبِأَيِّ آَلَاءِ رَبِّكُمَا تُكَذِّبَانِ (47)"));
        alrahmans.add(new Alrahman("ذَوَاتَا أَفْنَانٍ (48)"));
        alrahmans.add(new Alrahman("فَبِأَيِّ آَلَاءِ رَبِّكُمَا تُكَذِّبَانِ (49)"));
        alrahmans.add(new Alrahman("فِيهِمَا عَيْنَانِ تَجْرِيَانِ (50)"));
        alrahmans.add(new Alrahman("فَبِأَيِّ آَلَاءِ رَبِّكُمَا تُكَذِّبَانِ (51)"));
        alrahmans.add(new Alrahman("فِيهِمَا مِنْ كُلِّ فَاكِهَةٍ زَوْجَانِ (52)"));
        alrahmans.add(new Alrahman("فَبِأَيِّ آَلَاءِ رَبِّكُمَا تُكَذِّبَانِ (53)"));
        alrahmans.add(new Alrahman("مُتَّكِئِينَ عَلَى فُرُشٍ بَطَائِنُهَا مِنْ إِسْتَبْرَقٍ وَجَنَى الْجَنَّتَيْنِ دَانٍ (54)"));
        alrahmans.add(new Alrahman("فَبِأَيِّ آَلَاءِ رَبِّكُمَا تُكَذِّبَانِ (55)"));
        alrahmans.add(new Alrahman("فِيهِنَّ قَاصِرَاتُ الطَّرْفِ لَمْ يَطْمِثْهُنَّ إِنْسٌ قَبْلَهُمْ وَلَا جَانٌّ (56)"));
        alrahmans.add(new Alrahman("فَبِأَيِّ آَلَاءِ رَبِّكُمَا تُكَذِّبَانِ (57)"));
        alrahmans.add(new Alrahman("كَأَنَّهُنَّ الْيَاقُوتُ وَالْمَرْجَانُ (58)"));
        alrahmans.add(new Alrahman("فَبِأَيِّ آَلَاءِ رَبِّكُمَا تُكَذِّبَانِ (59)"));
        alrahmans.add(new Alrahman("هَلْ جَزَاءُ الْإِحْسَانِ إِلَّا الْإِحْسَانُ (60)"));
        alrahmans.add(new Alrahman("فَبِأَيِّ آَلَاءِ رَبِّكُمَا تُكَذِّبَانِ (61)"));
        alrahmans.add(new Alrahman("وَمِنْ دُونِهِمَا جَنَّتَانِ (62)"));
        alrahmans.add(new Alrahman("فَبِأَيِّ آَلَاءِ رَبِّكُمَا تُكَذِّبَانِ (63)"));
        alrahmans.add(new Alrahman("مُدْهَامَّتَانِ (64)"));
        alrahmans.add(new Alrahman("فَبِأَيِّ آَلَاءِ رَبِّكُمَا تُكَذِّبَانِ (65)"));
        alrahmans.add(new Alrahman("فِيهِمَا عَيْنَانِ نَضَّاخَتَانِ (66)"));
        alrahmans.add(new Alrahman("فَبِأَيِّ آَلَاءِ رَبِّكُمَا تُكَذِّبَانِ (67)"));
        alrahmans.add(new Alrahman("فِيهِمَا فَاكِهَةٌ وَنَخْلٌ وَرُمَّانٌ (68)"));
        alrahmans.add(new Alrahman("فَبِأَيِّ آَلَاءِ رَبِّكُمَا تُكَذِّبَانِ (69)"));
        alrahmans.add(new Alrahman("فِيهِنَّ خَيْرَاتٌ حِسَانٌ (70)"));
        alrahmans.add(new Alrahman("فَبِأَيِّ آَلَاءِ رَبِّكُمَا تُكَذِّبَانِ (71)"));
        alrahmans.add(new Alrahman("حُورٌ مَقْصُورَاتٌ فِي الْخِيَامِ (72)"));
        alrahmans.add(new Alrahman("فَبِأَيِّ آَلَاءِ رَبِّكُمَا تُكَذِّبَانِ (73)"));
        alrahmans.add(new Alrahman("لَمْ يَطْمِثْهُنَّ إِنْسٌ قَبْلَهُمْ وَلَا جَانٌّ (74)"));
        alrahmans.add(new Alrahman("فَبِأَيِّ آَلَاءِ رَبِّكُمَا تُكَذِّبَانِ (75)"));
        alrahmans.add(new Alrahman("مُتَّكِئِينَ عَلَى رَفْرَفٍ خُضْرٍ وَعَبْقَرِيٍّ حِسَانٍ (76)"));
        alrahmans.add(new Alrahman("فَبِأَيِّ آَلَاءِ رَبِّكُمَا تُكَذِّبَانِ (77)"));
        alrahmans.add(new Alrahman("تَبَارَكَ اسْمُ رَبِّكَ ذِي الْجَلَالِ وَالْإِكْرَامِ (78)"));


        quran_text_55_adapter = new quran_text_55_adapter(alrahmans ,QuranText_55Activity.this);

        recyclerView = findViewById(R.id.rv_55);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_55Activity.this));
        recyclerView.setAdapter(quran_text_55_adapter);


    }

}