package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_53Activity extends AppCompatActivity {

    ArrayList<Alnagm> alnagms = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_53_adapter quran_text_53_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_53);

        alnagms.add(new Alnagm("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alnagms.add(new Alnagm("وَالنَّجْمِ إِذَا هَوَى (1)"));
        alnagms.add(new Alnagm("مَا ضَلَّ صَاحِبُكُمْ وَمَا غَوَى (2)"));
        alnagms.add(new Alnagm("وَمَا يَنْطِقُ عَنِ الْهَوَى (3)"));
        alnagms.add(new Alnagm("إِنْ هُوَ إِلَّا وَحْيٌ يُوحَى (4)"));
        alnagms.add(new Alnagm("عَلَّمَهُ شَدِيدُ الْقُوَى (5)"));
        alnagms.add(new Alnagm("ذُو مِرَّةٍ فَاسْتَوَى (6)"));
        alnagms.add(new Alnagm("وَهُوَ بِالْأُفُقِ الْأَعْلَى (7)"));
        alnagms.add(new Alnagm("ثُمَّ دَنَا فَتَدَلَّى (8)"));
        alnagms.add(new Alnagm("فَكَانَ قَابَ قَوْسَيْنِ أَوْ أَدْنَى (9)"));
        alnagms.add(new Alnagm("فَأَوْحَى إِلَى عَبْدِهِ مَا أَوْحَى (10)"));
        alnagms.add(new Alnagm("مَا كَذَبَ الْفُؤَادُ مَا رَأَى (11)"));
        alnagms.add(new Alnagm("أَفَتُمَارُونَهُ عَلَى مَا يَرَى (12)"));
        alnagms.add(new Alnagm("وَلَقَدْ رَآَهُ نَزْلَةً أُخْرَى (13)"));
        alnagms.add(new Alnagm("عِنْدَ سِدْرَةِ الْمُنْتَهَى (14)"));
        alnagms.add(new Alnagm("عِنْدَهَا جَنَّةُ الْمَأْوَى (15)"));
        alnagms.add(new Alnagm("إِذْ يَغْشَى السِّدْرَةَ مَا يَغْشَى (16)"));
        alnagms.add(new Alnagm("مَا زَاغَ الْبَصَرُ وَمَا طَغَى (17)"));
        alnagms.add(new Alnagm("لَقَدْ رَأَى مِنْ آَيَاتِ رَبِّهِ الْكُبْرَى (18)"));
        alnagms.add(new Alnagm("أَفَرَأَيْتُمُ اللَّاتَ وَالْعُزَّى (19)"));
        alnagms.add(new Alnagm("وَمَنَاةَ الثَّالِثَةَ الْأُخْرَى (20)"));
        alnagms.add(new Alnagm("أَلَكُمُ الذَّكَرُ وَلَهُ الْأُنْثَى (21)"));
        alnagms.add(new Alnagm("تِلْكَ إِذًا قِسْمَةٌ ضِيزَى (22)"));
        alnagms.add(new Alnagm("إِنْ هِيَ إِلَّا أَسْمَاءٌ سَمَّيْتُمُوهَا أَنْتُمْ وَآَبَاؤُكُمْ مَا أَنْزَلَ اللَّهُ بِهَا مِنْ سُلْطَانٍ إِنْ يَتَّبِعُونَ إِلَّا الظَّنَّ وَمَا تَهْوَى الْأَنْفُسُ وَلَقَدْ جَاءَهُمْ مِنْ رَبِّهِمُ الْهُدَى (23)"));
        alnagms.add(new Alnagm("أَمْ لِلْإِنْسَانِ مَا تَمَنَّى (24)"));
        alnagms.add(new Alnagm("فَلِلَّهِ الْآَخِرَةُ وَالْأُولَى (25)"));
        alnagms.add(new Alnagm("وَكَمْ مِنْ مَلَكٍ فِي السَّمَاوَاتِ لَا تُغْنِي شَفَاعَتُهُمْ شَيْئًا إِلَّا مِنْ بَعْدِ أَنْ يَأْذَنَ اللَّهُ لِمَنْ يَشَاءُ وَيَرْضَى (26)"));
        alnagms.add(new Alnagm("إِنَّ الَّذِينَ لَا يُؤْمِنُونَ بِالْآَخِرَةِ لَيُسَمُّونَ الْمَلَائِكَةَ تَسْمِيَةَ الْأُنْثَى (27)"));
        alnagms.add(new Alnagm("وَمَا لَهُمْ بِهِ مِنْ عِلْمٍ إِنْ يَتَّبِعُونَ إِلَّا الظَّنَّ وَإِنَّ الظَّنَّ لَا يُغْنِي مِنَ الْحَقِّ شَيْئًا (28)"));
        alnagms.add(new Alnagm("فَأَعْرِضْ عَنْ مَنْ تَوَلَّى عَنْ ذِكْرِنَا وَلَمْ يُرِدْ إِلَّا الْحَيَاةَ الدُّنْيَا (29)"));
        alnagms.add(new Alnagm("ذَلِكَ مَبْلَغُهُمْ مِنَ الْعِلْمِ إِنَّ رَبَّكَ هُوَ أَعْلَمُ بِمَنْ ضَلَّ عَنْ سَبِيلِهِ وَهُوَ أَعْلَمُ بِمَنِ اهْتَدَى (30)"));
        alnagms.add(new Alnagm("وَلِلَّهِ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ لِيَجْزِيَ الَّذِينَ أَسَاءُوا بِمَا عَمِلُوا وَيَجْزِيَ الَّذِينَ أَحْسَنُوا بِالْحُسْنَى (31)"));
        alnagms.add(new Alnagm("الَّذِينَ يَجْتَنِبُونَ كَبَائِرَ الْإِثْمِ وَالْفَوَاحِشَ إِلَّا اللَّمَمَ إِنَّ رَبَّكَ وَاسِعُ الْمَغْفِرَةِ هُوَ أَعْلَمُ بِكُمْ إِذْ أَنْشَأَكُمْ مِنَ الْأَرْضِ وَإِذْ أَنْتُمْ أَجِنَّةٌ فِي بُطُونِ أُمَّهَاتِكُمْ فَلَا تُزَكُّوا أَنْفُسَكُمْ هُوَ أَعْلَمُ بِمَنِ اتَّقَى (32)"));
        alnagms.add(new Alnagm("أَفَرَأَيْتَ الَّذِي تَوَلَّى (33)"));
        alnagms.add(new Alnagm("وَأَعْطَى قَلِيلًا وَأَكْدَى (34)"));
        alnagms.add(new Alnagm("أَعِنْدَهُ عِلْمُ الْغَيْبِ فَهُوَ يَرَى (35)"));
        alnagms.add(new Alnagm("أَمْ لَمْ يُنَبَّأْ بِمَا فِي صُحُفِ مُوسَى (36)"));
        alnagms.add(new Alnagm("وَإِبْرَاهِيمَ الَّذِي وَفَّى (37)"));
        alnagms.add(new Alnagm("أَلَّا تَزِرُ وَازِرَةٌ وِزْرَ أُخْرَى (38)"));
        alnagms.add(new Alnagm("وَأَنْ لَيْسَ لِلْإِنْسَانِ إِلَّا مَا سَعَى (39)"));
        alnagms.add(new Alnagm("وَأَنَّ سَعْيَهُ سَوْفَ يُرَى (40)"));
        alnagms.add(new Alnagm("ثُمَّ يُجْزَاهُ الْجَزَاءَ الْأَوْفَى (41)"));
        alnagms.add(new Alnagm("وَأَنَّ إِلَى رَبِّكَ الْمُنْتَهَى (42)"));
        alnagms.add(new Alnagm("وَأَنَّهُ هُوَ أَضْحَكَ وَأَبْكَى (43)"));
        alnagms.add(new Alnagm("وَأَنَّهُ هُوَ أَمَاتَ وَأَحْيَا (44)"));
        alnagms.add(new Alnagm("وَأَنَّهُ خَلَقَ الزَّوْجَيْنِ الذَّكَرَ وَالْأُنْثَى (45)"));
        alnagms.add(new Alnagm("مِنْ نُطْفَةٍ إِذَا تُمْنَى (46)"));
        alnagms.add(new Alnagm("وَأَنَّ عَلَيْهِ النَّشْأَةَ الْأُخْرَى (47)"));
        alnagms.add(new Alnagm("وَأَنَّهُ هُوَ أَغْنَى وَأَقْنَى (48)"));
        alnagms.add(new Alnagm("وَأَنَّهُ هُوَ رَبُّ الشِّعْرَى (49)"));
        alnagms.add(new Alnagm("وَأَنَّهُ أَهْلَكَ عَادًا الْأُولَى (50)"));
        alnagms.add(new Alnagm("وَثَمُودَ فَمَا أَبْقَى (51)"));
        alnagms.add(new Alnagm("وَقَوْمَ نُوحٍ مِنْ قَبْلُ إِنَّهُمْ كَانُوا هُمْ أَظْلَمَ وَأَطْغَى (52)"));
        alnagms.add(new Alnagm("وَالْمُؤْتَفِكَةَ أَهْوَى (53)"));
        alnagms.add(new Alnagm("فَغَشَّاهَا مَا غَشَّى (54)"));
        alnagms.add(new Alnagm("فَبِأَيِّ آَلَاءِ رَبِّكَ تَتَمَارَى (55)"));
        alnagms.add(new Alnagm("هَذَا نَذِيرٌ مِنَ النُّذُرِ الْأُولَى (56)"));
        alnagms.add(new Alnagm("أَزِفَتِ الْآَزِفَةُ (57)"));
        alnagms.add(new Alnagm("لَيْسَ لَهَا مِنْ دُونِ اللَّهِ كَاشِفَةٌ (58)"));
        alnagms.add(new Alnagm("أَفَمِنْ هَذَا الْحَدِيثِ تَعْجَبُونَ (59)"));
        alnagms.add(new Alnagm("وَتَضْحَكُونَ وَلَا تَبْكُونَ (60)"));
        alnagms.add(new Alnagm("وَأَنْتُمْ سَامِدُونَ (61)"));
        alnagms.add(new Alnagm("فَاسْجُدُوا لِلَّهِ وَاعْبُدُوا (62)"));




        quran_text_53_adapter = new quran_text_53_adapter(alnagms ,QuranText_53Activity.this);

        recyclerView = findViewById(R.id.rv_53);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_53Activity.this));
        recyclerView.setAdapter(quran_text_53_adapter);


    }

}