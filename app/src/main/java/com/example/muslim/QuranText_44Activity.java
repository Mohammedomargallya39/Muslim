package com.example.muslim;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_44Activity extends AppCompatActivity {

    ArrayList<Aldokhan> aldokhans = new ArrayList<>();
    RecyclerView recyclerView;
    com.example.muslim.quran_text_44_adapter quran_text_44_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_44);

        aldokhans.add(new Aldokhan("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        aldokhans.add(new Aldokhan("حم (1)"));
        aldokhans.add(new Aldokhan("وَالْكِتَابِ الْمُبِينِ (2)"));
        aldokhans.add(new Aldokhan("إِنَّا أَنْزَلْنَاهُ فِي لَيْلَةٍ مُبَارَكَةٍ إِنَّا كُنَّا مُنْذِرِينَ (3)"));
        aldokhans.add(new Aldokhan("فِيهَا يُفْرَقُ كُلُّ أَمْرٍ حَكِيمٍ (4)"));
        aldokhans.add(new Aldokhan("أَمْرًا مِنْ عِنْدِنَا إِنَّا كُنَّا مُرْسِلِينَ (5)"));
        aldokhans.add(new Aldokhan("رَحْمَةً مِنْ رَبِّكَ إِنَّهُ هُوَ السَّمِيعُ الْعَلِيمُ (6)"));
        aldokhans.add(new Aldokhan("رَبِّ السَّمَاوَاتِ وَالْأَرْضِ وَمَا بَيْنَهُمَا إِنْ كُنْتُمْ مُوقِنِينَ (7)"));
        aldokhans.add(new Aldokhan("لَا إِلَهَ إِلَّا هُوَ يُحْيِي وَيُمِيتُ رَبُّكُمْ وَرَبُّ آَبَائِكُمُ الْأَوَّلِينَ (8)"));
        aldokhans.add(new Aldokhan("بَلْ هُمْ فِي شَكٍّ يَلْعَبُونَ (9)"));
        aldokhans.add(new Aldokhan("فَارْتَقِبْ يَوْمَ تَأْتِي السَّمَاءُ بِدُخَانٍ مُبِينٍ (10)"));
        aldokhans.add(new Aldokhan("يَغْشَى النَّاسَ هَذَا عَذَابٌ أَلِيمٌ (11)"));
        aldokhans.add(new Aldokhan("رَبَّنَا اكْشِفْ عَنَّا الْعَذَابَ إِنَّا مُؤْمِنُونَ (12)"));
        aldokhans.add(new Aldokhan("أَنَّى لَهُمُ الذِّكْرَى وَقَدْ جَاءَهُمْ رَسُولٌ مُبِينٌ (13)"));
        aldokhans.add(new Aldokhan("ثُمَّ تَوَلَّوْا عَنْهُ وَقَالُوا مُعَلَّمٌ مَجْنُونٌ (14)"));
        aldokhans.add(new Aldokhan("إِنَّا كَاشِفُوا الْعَذَابِ قَلِيلًا إِنَّكُمْ عَائِدُونَ (15)"));
        aldokhans.add(new Aldokhan("يَوْمَ نَبْطِشُ الْبَطْشَةَ الْكُبْرَى إِنَّا مُنْتَقِمُونَ (16)"));
        aldokhans.add(new Aldokhan("وَلَقَدْ فَتَنَّا قَبْلَهُمْ قَوْمَ فِرْعَوْنَ وَجَاءَهُمْ رَسُولٌ كَرِيمٌ (17)"));
        aldokhans.add(new Aldokhan("أَنْ أَدُّوا إِلَيَّ عِبَادَ اللَّهِ إِنِّي لَكُمْ رَسُولٌ أَمِينٌ (18)"));
        aldokhans.add(new Aldokhan("وَأَنْ لَا تَعْلُوا عَلَى اللَّهِ إِنِّي آَتِيكُمْ بِسُلْطَانٍ مُبِينٍ (19)"));
        aldokhans.add(new Aldokhan("وَإِنِّي عُذْتُ بِرَبِّي وَرَبِّكُمْ أَنْ تَرْجُمُونِ (20)"));
        aldokhans.add(new Aldokhan("وَإِنْ لَمْ تُؤْمِنُوا لِي فَاعْتَزِلُونِ (21)"));
        aldokhans.add(new Aldokhan("فَدَعَا رَبَّهُ أَنَّ هَؤُلَاءِ قَوْمٌ مُجْرِمُونَ (22)"));
        aldokhans.add(new Aldokhan("فَأَسْرِ بِعِبَادِي لَيْلًا إِنَّكُمْ مُتَّبَعُونَ (23)"));
        aldokhans.add(new Aldokhan("وَاتْرُكِ الْبَحْرَ رَهْوًا إِنَّهُمْ جُنْدٌ مُغْرَقُونَ (24)"));
        aldokhans.add(new Aldokhan("كَمْ تَرَكُوا مِنْ جَنَّاتٍ وَعُيُونٍ (25)"));
        aldokhans.add(new Aldokhan("وَزُرُوعٍ وَمَقَامٍ كَرِيمٍ (26)"));
        aldokhans.add(new Aldokhan("وَنَعْمَةٍ كَانُوا فِيهَا فَاكِهِينَ (27)"));
        aldokhans.add(new Aldokhan("كَذَلِكَ وَأَوْرَثْنَاهَا قَوْمًا آَخَرِينَ (28)"));
        aldokhans.add(new Aldokhan("فَمَا بَكَتْ عَلَيْهِمُ السَّمَاءُ وَالْأَرْضُ وَمَا كَانُوا مُنْظَرِينَ (29)"));
        aldokhans.add(new Aldokhan("وَلَقَدْ نَجَّيْنَا بَنِي إِسْرَائِيلَ مِنَ الْعَذَابِ الْمُهِينِ (30)"));
        aldokhans.add(new Aldokhan("مِنْ فِرْعَوْنَ إِنَّهُ كَانَ عَالِيًا مِنَ الْمُسْرِفِينَ (31)"));
        aldokhans.add(new Aldokhan("وَلَقَدِ اخْتَرْنَاهُمْ عَلَى عِلْمٍ عَلَى الْعَالَمِينَ (32)"));
        aldokhans.add(new Aldokhan("وَآَتَيْنَاهُمْ مِنَ الْآَيَاتِ مَا فِيهِ بَلَاءٌ مُبِينٌ (33)"));
        aldokhans.add(new Aldokhan("إِنَّ هَؤُلَاءِ لَيَقُولُونَ (34)"));
        aldokhans.add(new Aldokhan("إِنْ هِيَ إِلَّا مَوْتَتُنَا الْأُولَى وَمَا نَحْنُ بِمُنْشَرِينَ (35)"));
        aldokhans.add(new Aldokhan("فَأْتُوا بِآَبَائِنَا إِنْ كُنْتُمْ صَادِقِينَ (36)"));
        aldokhans.add(new Aldokhan("أَهُمْ خَيْرٌ أَمْ قَوْمُ تُبَّعٍ وَالَّذِينَ مِنْ قَبْلِهِمْ أَهْلَكْنَاهُمْ إِنَّهُمْ كَانُوا مُجْرِمِينَ (37)"));
        aldokhans.add(new Aldokhan("وَمَا خَلَقْنَا السَّمَاوَاتِ وَالْأَرْضَ وَمَا بَيْنَهُمَا لَاعِبِينَ (38)"));
        aldokhans.add(new Aldokhan("مَا خَلَقْنَاهُمَا إِلَّا بِالْحَقِّ وَلَكِنَّ أَكْثَرَهُمْ لَا يَعْلَمُونَ (39)"));
        aldokhans.add(new Aldokhan("إِنَّ يَوْمَ الْفَصْلِ مِيقَاتُهُمْ أَجْمَعِينَ (40)"));
        aldokhans.add(new Aldokhan("يَوْمَ لَا يُغْنِي مَوْلًى عَنْ مَوْلًى شَيْئًا وَلَا هُمْ يُنْصَرُونَ (41)"));
        aldokhans.add(new Aldokhan("إِلَّا مَنْ رَحِمَ اللَّهُ إِنَّهُ هُوَ الْعَزِيزُ الرَّحِيمُ (42)"));
        aldokhans.add(new Aldokhan("إِنَّ شَجَرَةَ الزَّقُّومِ (43)"));
        aldokhans.add(new Aldokhan("طَعَامُ الْأَثِيمِ (44)"));
        aldokhans.add(new Aldokhan("كَالْمُهْلِ يَغْلِي فِي الْبُطُونِ (45)"));
        aldokhans.add(new Aldokhan("كَغَلْيِ الْحَمِيمِ (46)"));
        aldokhans.add(new Aldokhan("خُذُوهُ فَاعْتِلُوهُ إِلَى سَوَاءِ الْجَحِيمِ (47)"));
        aldokhans.add(new Aldokhan("ثُمَّ صُبُّوا فَوْقَ رَأْسِهِ مِنْ عَذَابِ الْحَمِيمِ (48)"));
        aldokhans.add(new Aldokhan("ذُقْ إِنَّكَ أَنْتَ الْعَزِيزُ الْكَرِيمُ (49)"));
        aldokhans.add(new Aldokhan("إِنَّ هَذَا مَا كُنْتُمْ بِهِ تَمْتَرُونَ (50)"));
        aldokhans.add(new Aldokhan("إِنَّ الْمُتَّقِينَ فِي مَقَامٍ أَمِينٍ (51)"));
        aldokhans.add(new Aldokhan("فِي جَنَّاتٍ وَعُيُونٍ (52)"));
        aldokhans.add(new Aldokhan("يَلْبَسُونَ مِنْ سُنْدُسٍ وَإِسْتَبْرَقٍ مُتَقَابِلِينَ (53)"));
        aldokhans.add(new Aldokhan("كَذَلِكَ وَزَوَّجْنَاهُمْ بِحُورٍ عِينٍ (54)"));
        aldokhans.add(new Aldokhan("يَدْعُونَ فِيهَا بِكُلِّ فَاكِهَةٍ آَمِنِينَ (55)"));
        aldokhans.add(new Aldokhan("لَا يَذُوقُونَ فِيهَا الْمَوْتَ إِلَّا الْمَوْتَةَ الْأُولَى وَوَقَاهُمْ عَذَابَ الْجَحِيمِ (56)"));
        aldokhans.add(new Aldokhan("فَضْلًا مِنْ رَبِّكَ ذَلِكَ هُوَ الْفَوْزُ الْعَظِيمُ (57)"));
        aldokhans.add(new Aldokhan("فَإِنَّمَا يَسَّرْنَاهُ بِلِسَانِكَ لَعَلَّهُمْ يَتَذَكَّرُونَ (58)"));
        aldokhans.add(new Aldokhan("فَارْتَقِبْ إِنَّهُمْ مُرْتَقِبُونَ (59)"));



        quran_text_44_adapter = new quran_text_44_adapter(aldokhans, com.example.muslim.QuranText_44Activity.this);

        recyclerView = findViewById(R.id.rv_44);
        recyclerView.setLayoutManager(new LinearLayoutManager(com.example.muslim.QuranText_44Activity.this));
        recyclerView.setAdapter(quran_text_44_adapter);


    }

}