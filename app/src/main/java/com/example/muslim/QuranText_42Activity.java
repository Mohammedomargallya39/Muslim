package com.example.muslim;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_42Activity extends AppCompatActivity {

    ArrayList<Alshora> alshoras = new ArrayList<>();
    RecyclerView recyclerView;
    com.example.muslim.quran_text_42_adapter quran_text_42_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_42);

        alshoras.add(new Alshora("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alshoras.add(new Alshora("حم (1)"));
        alshoras.add(new Alshora("عسق (2)"));
        alshoras.add(new Alshora("كَذَلِكَ يُوحِي إِلَيْكَ وَإِلَى الَّذِينَ مِنْ قَبْلِكَ اللَّهُ الْعَزِيزُ الْحَكِيمُ (3)"));
        alshoras.add(new Alshora("لَهُ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ وَهُوَ الْعَلِيُّ الْعَظِيمُ (4)"));
        alshoras.add(new Alshora("تَكَادُ السَّمَاوَاتُ يَتَفَطَّرْنَ مِنْ فَوْقِهِنَّ وَالْمَلَائِكَةُ يُسَبِّحُونَ بِحَمْدِ رَبِّهِمْ وَيَسْتَغْفِرُونَ لِمَنْ فِي الْأَرْضِ أَلَا إِنَّ اللَّهَ هُوَ الْغَفُورُ الرَّحِيمُ (5)"));
        alshoras.add(new Alshora("وَالَّذِينَ اتَّخَذُوا مِنْ دُونِهِ أَولِيَاءَ اللَّهُ حَفِيظٌ عَلَيْهِمْ وَمَا أَنْتَ عَلَيْهِمْ بِوَكِيلٍ (6)"));
        alshoras.add(new Alshora("وَكَذَلِكَ أَوْحَيْنَا إِلَيْكَ قُرْآَنًا عَرَبِيًّا لِتُنْذِرَ أُمَّ الْقُرَى وَمَنْ حَوْلَهَا وَتُنْذِرَ يَوْمَ الْجَمْعِ لَا رَيْبَ فِيهِ فَرِيقٌ فِي الْجَنَّةِ وَفَرِيقٌ فِي السَّعِيرِ (7)"));
        alshoras.add(new Alshora("وَلَوْ شَاءَ اللَّهُ لَجَعَلَهُمْ أُمَّةً وَاحِدَةً وَلَكِنْ يُدْخِلُ مَنْ يَشَاءُ فِي رَحْمَتِهِ وَالظَّالِمُونَ مَا لَهُمْ مِنْ وَلِيٍّ وَلَا نَصِيرٍ (8)"));
        alshoras.add(new Alshora("أَمِ اتَّخَذُوا مِنْ دُونِهِ أَوْلِيَاءَ فَاللَّهُ هُوَ الْوَلِيُّ وَهُوَ يُحْيِي الْمَوْتَى وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيرٌ (9)"));
        alshoras.add(new Alshora("وَمَا اخْتَلَفْتُمْ فِيهِ مِنْ شَيْءٍ فَحُكْمُهُ إِلَى اللَّهِ ذَلِكُمُ اللَّهُ رَبِّي عَلَيْهِ تَوَكَّلْتُ وَإِلَيْهِ أُنِيبُ (10)"));
        alshoras.add(new Alshora("فَاطِرُ السَّمَاوَاتِ وَالْأَرْضِ جَعَلَ لَكُمْ مِنْ أَنْفُسِكُمْ أَزْوَاجًا وَمِنَ الْأَنْعَامِ أَزْوَاجًا يَذْرَؤُكُمْ فِيهِ لَيْسَ كَمِثْلِهِ شَيْءٌ وَهُوَ السَّمِيعُ الْبَصِيرُ (11)"));
        alshoras.add(new Alshora("لَهُ مَقَالِيدُ السَّمَاوَاتِ وَالْأَرْضِ يَبْسُطُ الرِّزْقَ لِمَنْ يَشَاءُ وَيَقْدِرُ إِنَّهُ بِكُلِّ شَيْءٍ عَلِيمٌ (12)"));
        alshoras.add(new Alshora("شَرَعَ لَكُمْ مِنَ الدِّينِ مَا وَصَّى بِهِ نُوحًا وَالَّذِي أَوْحَيْنَا إِلَيْكَ وَمَا وَصَّيْنَا بِهِ إِبْرَاهِيمَ وَمُوسَى وَعِيسَى أَنْ أَقِيمُوا الدِّينَ وَلَا تَتَفَرَّقُوا فِيهِ كَبُرَ عَلَى الْمُشْرِكِينَ مَا تَدْعُوهُمْ إِلَيْهِ اللَّهُ يَجْتَبِي إِلَيْهِ مَنْ يَشَاءُ وَيَهْدِي إِلَيْهِ مَنْ يُنِيبُ (13)"));
        alshoras.add(new Alshora("وَمَا تَفَرَّقُوا إِلَّا مِنْ بَعْدِ مَا جَاءَهُمُ الْعِلْمُ بَغْيًا بَيْنَهُمْ وَلَوْلَا كَلِمَةٌ سَبَقَتْ مِنْ رَبِّكَ إِلَى أَجَلٍ مُسَمًّى لَقُضِيَ بَيْنَهُمْ وَإِنَّ الَّذِينَ أُورِثُوا الْكِتَابَ مِنْ بَعْدِهِمْ لَفِي شَكٍّ مِنْهُ مُرِيبٍ (14)"));
        alshoras.add(new Alshora("فَلِذَلِكَ فَادْعُ وَاسْتَقِمْ كَمَا أُمِرْتَ وَلَا تَتَّبِعْ أَهْوَاءَهُمْ وَقُلْ آَمَنْتُ بِمَا أَنْزَلَ اللَّهُ مِنْ كِتَابٍ وَأُمِرْتُ لِأَعْدِلَ بَيْنَكُمُ اللَّهُ رَبُّنَا وَرَبُّكُمْ لَنَا أَعْمَالُنَا وَلَكُمْ أَعْمَالُكُمْ لَا حُجَّةَ بَيْنَنَا وَبَيْنَكُمُ اللَّهُ يَجْمَعُ بَيْنَنَا وَإِلَيْهِ الْمَصِيرُ (15)"));
        alshoras.add(new Alshora("وَالَّذِينَ يُحَاجُّونَ فِي اللَّهِ مِنْ بَعْدِ مَا اسْتُجِيبَ لَهُ حُجَّتُهُمْ دَاحِضَةٌ عِنْدَ رَبِّهِمْ وَعَلَيْهِمْ غَضَبٌ وَلَهُمْ عَذَابٌ شَدِيدٌ (16)"));
        alshoras.add(new Alshora("اللَّهُ الَّذِي أَنْزَلَ الْكِتَابَ بِالْحَقِّ وَالْمِيزَانَ وَمَا يُدْرِيكَ لَعَلَّ السَّاعَةَ قَرِيبٌ (17)"));
        alshoras.add(new Alshora("يَسْتَعْجِلُ بِهَا الَّذِينَ لَا يُؤْمِنُونَ بِهَا وَالَّذِينَ آَمَنُوا مُشْفِقُونَ مِنْهَا وَيَعْلَمُونَ أَنَّهَا الْحَقُّ أَلَا إِنَّ الَّذِينَ يُمَارُونَ فِي السَّاعَةِ لَفِي ضَلَالٍ بَعِيدٍ (18)"));
        alshoras.add(new Alshora("اللَّهُ لَطِيفٌ بِعِبَادِهِ يَرْزُقُ مَنْ يَشَاءُ وَهُوَ الْقَوِيُّ الْعَزِيزُ (19)"));
        alshoras.add(new Alshora("مَنْ كَانَ يُرِيدُ حَرْثَ الْآَخِرَةِ نَزِدْ لَهُ فِي حَرْثِهِ وَمَنْ كَانَ يُرِيدُ حَرْثَ الدُّنْيَا نُؤْتِهِ مِنْهَا وَمَا لَهُ فِي الْآَخِرَةِ مِنْ نَصِيبٍ (20)"));
        alshoras.add(new Alshora("أَمْ لَهُمْ شُرَكَاءُ شَرَعُوا لَهُمْ مِنَ الدِّينِ مَا لَمْ يَأْذَنْ بِهِ اللَّهُ وَلَوْلَا كَلِمَةُ الْفَصْلِ لَقُضِيَ بَيْنَهُمْ وَإِنَّ الظَّالِمِينَ لَهُمْ عَذَابٌ أَلِيمٌ (21)"));
        alshoras.add(new Alshora("تَرَى الظَّالِمِينَ مُشْفِقِينَ مِمَّا كَسَبُوا وَهُوَ وَاقِعٌ بِهِمْ وَالَّذِينَ آَمَنُوا وَعَمِلُوا الصَّالِحَاتِ فِي رَوْضَاتِ الْجَنَّاتِ لَهُمْ مَا يَشَاءُونَ عِنْدَ رَبِّهِمْ ذَلِكَ هُوَ الْفَضْلُ الْكَبِيرُ (22)"));
        alshoras.add(new Alshora("ذَلِكَ الَّذِي يُبَشِّرُ اللَّهُ عِبَادَهُ الَّذِينَ آَمَنُوا وَعَمِلُوا الصَّالِحَاتِ قُلْ لَا أَسْأَلُكُمْ عَلَيْهِ أَجْرًا إِلَّا الْمَوَدَّةَ فِي الْقُرْبَى وَمَنْ يَقْتَرِفْ حَسَنَةً نَزِدْ لَهُ فِيهَا حُسْنًا إِنَّ اللَّهَ غَفُورٌ شَكُورٌ (23)"));
        alshoras.add(new Alshora("أَمْ يَقُولُونَ افْتَرَى عَلَى اللَّهِ كَذِبًا فَإِنْ يَشَأِ اللَّهُ يَخْتِمْ عَلَى قَلْبِكَ وَيَمْحُ اللَّهُ الْبَاطِلَ وَيُحِقُّ الْحَقَّ بِكَلِمَاتِهِ إِنَّهُ عَلِيمٌ بِذَاتِ الصُّدُورِ (24)"));
        alshoras.add(new Alshora("وَهُوَ الَّذِي يَقْبَلُ التَّوْبَةَ عَنْ عِبَادِهِ وَيَعْفُو عَنِ السَّيِّئَاتِ وَيَعْلَمُ مَا تَفْعَلُونَ (25)"));
        alshoras.add(new Alshora("وَيَسْتَجِيبُ الَّذِينَ آَمَنُوا وَعَمِلُوا الصَّالِحَاتِ وَيَزِيدُهُمْ مِنْ فَضْلِهِ وَالْكَافِرُونَ لَهُمْ عَذَابٌ شَدِيدٌ (26)"));
        alshoras.add(new Alshora("وَلَوْ بَسَطَ اللَّهُ الرِّزْقَ لِعِبَادِهِ لَبَغَوْا فِي الْأَرْضِ وَلَكِنْ يُنَزِّلُ بِقَدَرٍ مَا يَشَاءُ إِنَّهُ بِعِبَادِهِ خَبِيرٌ بَصِيرٌ (27)"));
        alshoras.add(new Alshora("وَهُوَ الَّذِي يُنَزِّلُ الْغَيْثَ مِنْ بَعْدِ مَا قَنَطُوا وَيَنْشُرُ رَحْمَتَهُ وَهُوَ الْوَلِيُّ الْحَمِيدُ (28)"));
        alshoras.add(new Alshora("وَمِنْ آَيَاتِهِ خَلْقُ السَّمَاوَاتِ وَالْأَرْضِ وَمَا بَثَّ فِيهِمَا مِنْ دَابَّةٍ وَهُوَ عَلَى جَمْعِهِمْ إِذَا يَشَاءُ قَدِيرٌ (29)"));
        alshoras.add(new Alshora("وَمَا أَصَابَكُمْ مِنْ مُصِيبَةٍ فَبِمَا كَسَبَتْ أَيْدِيكُمْ وَيَعْفُو عَنْ كَثِيرٍ (30)"));
        alshoras.add(new Alshora("وَمَا أَنْتُمْ بِمُعْجِزِينَ فِي الْأَرْضِ وَمَا لَكُمْ مِنْ دُونِ اللَّهِ مِنْ وَلِيٍّ وَلَا نَصِيرٍ (31)"));
        alshoras.add(new Alshora("وَمِنْ آَيَاتِهِ الْجَوَارِ فِي الْبَحْرِ كَالْأَعْلَامِ (32)"));
        alshoras.add(new Alshora("إِنْ يَشَأْ يُسْكِنِ الرِّيحَ فَيَظْلَلْنَ رَوَاكِدَ عَلَى ظَهْرِهِ إِنَّ فِي ذَلِكَ لَآَيَاتٍ لِكُلِّ صَبَّارٍ شَكُورٍ (33)"));
        alshoras.add(new Alshora("أَوْ يُوبِقْهُنَّ بِمَا كَسَبُوا وَيَعْفُ عَنْ كَثِيرٍ (34)"));
        alshoras.add(new Alshora("وَيَعْلَمَ الَّذِينَ يُجَادِلُونَ فِي آَيَاتِنَا مَا لَهُمْ مِنْ مَحِيصٍ (35)"));
        alshoras.add(new Alshora("فَمَا أُوتِيتُمْ مِنْ شَيْءٍ فَمَتَاعُ الْحَيَاةِ الدُّنْيَا وَمَا عِنْدَ اللَّهِ خَيْرٌ وَأَبْقَى لِلَّذِينَ آَمَنُوا وَعَلَى رَبِّهِمْ يَتَوَكَّلُونَ (36)"));
        alshoras.add(new Alshora("وَالَّذِينَ يَجْتَنِبُونَ كَبَائِرَ الْإِثْمِ وَالْفَوَاحِشَ وَإِذَا مَا غَضِبُوا هُمْ يَغْفِرُونَ (37)"));
        alshoras.add(new Alshora("وَالَّذِينَ اسْتَجَابُوا لِرَبِّهِمْ وَأَقَامُوا الصَّلَاةَ وَأَمْرُهُمْ شُورَى بَيْنَهُمْ وَمِمَّا رَزَقْنَاهُمْ يُنْفِقُونَ (38)"));
        alshoras.add(new Alshora("وَالَّذِينَ إِذَا أَصَابَهُمُ الْبَغْيُ هُمْ يَنْتَصِرُونَ (39)"));
        alshoras.add(new Alshora("وَجَزَاءُ سَيِّئَةٍ سَيِّئَةٌ مِثْلُهَا فَمَنْ عَفَا وَأَصْلَحَ فَأَجْرُهُ عَلَى اللَّهِ إِنَّهُ لَا يُحِبُّ الظَّالِمِينَ (40)"));
        alshoras.add(new Alshora("وَلَمَنِ انْتَصَرَ بَعْدَ ظُلْمِهِ فَأُولَئِكَ مَا عَلَيْهِمْ مِنْ سَبِيلٍ (41)"));
        alshoras.add(new Alshora("إِنَّمَا السَّبِيلُ عَلَى الَّذِينَ يَظْلِمُونَ النَّاسَ وَيَبْغُونَ فِي الْأَرْضِ بِغَيْرِ الْحَقِّ أُولَئِكَ لَهُمْ عَذَابٌ أَلِيمٌ (42)"));
        alshoras.add(new Alshora("وَلَمَنْ صَبَرَ وَغَفَرَ إِنَّ ذَلِكَ لَمِنْ عَزْمِ الْأُمُورِ (43)"));
        alshoras.add(new Alshora("وَمَنْ يُضْلِلِ اللَّهُ فَمَا لَهُ مِنْ وَلِيٍّ مِنْ بَعْدِهِ وَتَرَى الظَّالِمِينَ لَمَّا رَأَوُا الْعَذَابَ يَقُولُونَ هَلْ إِلَى مَرَدٍّ مِنْ سَبِيلٍ (44)"));
        alshoras.add(new Alshora("وَتَرَاهُمْ يُعْرَضُونَ عَلَيْهَا خَاشِعِينَ مِنَ الذُّلِّ يَنْظُرُونَ مِنْ طَرْفٍ خَفِيٍّ وَقَالَ الَّذِينَ آَمَنُوا إِنَّ الْخَاسِرِينَ الَّذِينَ خَسِرُوا أَنْفُسَهُمْ وَأَهْلِيهِمْ يَوْمَ الْقِيَامَةِ أَلَا إِنَّ الظَّالِمِينَ فِي عَذَابٍ مُقِيمٍ (45)"));
        alshoras.add(new Alshora("وَمَا كَانَ لَهُمْ مِنْ أَوْلِيَاءَ يَنْصُرُونَهُمْ مِنْ دُونِ اللَّهِ وَمَنْ يُضْلِلِ اللَّهُ فَمَا لَهُ مِنْ سَبِيلٍ (46)"));
        alshoras.add(new Alshora("اسْتَجِيبُوا لِرَبِّكُمْ مِنْ قَبْلِ أَنْ يَأْتِيَ يَوْمٌ لَا مَرَدَّ لَهُ مِنَ اللَّهِ مَا لَكُمْ مِنْ مَلْجَأٍ يَوْمَئِذٍ وَمَا لَكُمْ مِنْ نَكِيرٍ (47)"));
        alshoras.add(new Alshora("فَإِنْ أَعْرَضُوا فَمَا أَرْسَلْنَاكَ عَلَيْهِمْ حَفِيظًا إِنْ عَلَيْكَ إِلَّا الْبَلَاغُ وَإِنَّا إِذَا أَذَقْنَا الْإِنْسَانَ مِنَّا رَحْمَةً فَرِحَ بِهَا وَإِنْ تُصِبْهُمْ سَيِّئَةٌ بِمَا قَدَّمَتْ أَيْدِيهِمْ فَإِنَّ الْإِنْسَانَ كَفُورٌ (48)"));
        alshoras.add(new Alshora("لِلَّهِ مُلْكُ السَّمَاوَاتِ وَالْأَرْضِ يَخْلُقُ مَا يَشَاءُ يَهَبُ لِمَنْ يَشَاءُ إِنَاثًا وَيَهَبُ لِمَنْ يَشَاءُ الذُّكُورَ (49)"));
        alshoras.add(new Alshora("أَوْ يُزَوِّجُهُمْ ذُكْرَانًا وَإِنَاثًا وَيَجْعَلُ مَنْ يَشَاءُ عَقِيمًا إِنَّهُ عَلِيمٌ قَدِيرٌ (50)"));
        alshoras.add(new Alshora("وَمَا كَانَ لِبَشَرٍ أَنْ يُكَلِّمَهُ اللَّهُ إِلَّا وَحْيًا أَوْ مِنْ وَرَاءِ حِجَابٍ أَوْ يُرْسِلَ رَسُولًا فَيُوحِيَ بِإِذْنِهِ مَا يَشَاءُ إِنَّهُ عَلِيٌّ حَكِيمٌ (51)"));
        alshoras.add(new Alshora("وَكَذَلِكَ أَوْحَيْنَا إِلَيْكَ رُوحًا مِنْ أَمْرِنَا مَا كُنْتَ تَدْرِي مَا الْكِتَابُ وَلَا الْإِيمَانُ وَلَكِنْ جَعَلْنَاهُ نُورًا نَهْدِي بِهِ مَنْ نَشَاءُ مِنْ عِبَادِنَا وَإِنَّكَ لَتَهْدِي إِلَى صِرَاطٍ مُسْتَقِيمٍ (52)"));
        alshoras.add(new Alshora("صِرَاطِ اللَّهِ الَّذِي لَهُ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ أَلَا إِلَى اللَّهِ تَصِيرُ الْأُمُورُ (53)"));



        quran_text_42_adapter = new quran_text_42_adapter(alshoras, com.example.muslim.QuranText_42Activity.this);

        recyclerView = findViewById(R.id.rv_42);
        recyclerView.setLayoutManager(new LinearLayoutManager(com.example.muslim.QuranText_42Activity.this));
        recyclerView.setAdapter(quran_text_42_adapter);


    }

}