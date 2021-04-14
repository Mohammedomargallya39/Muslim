package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_29Activity extends AppCompatActivity {

    ArrayList<Alankabout> alankabouts = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_29_adapter quran_text_29_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_29);

        alankabouts.add(new Alankabout("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alankabouts.add(new Alankabout("الم (1)"));
        alankabouts.add(new Alankabout("أَحَسِبَ النَّاسُ أَنْ يُتْرَكُوا أَنْ يَقُولُوا آَمَنَّا وَهُمْ لَا يُفْتَنُونَ (2)"));
        alankabouts.add(new Alankabout("وَلَقَدْ فَتَنَّا الَّذِينَ مِنْ قَبْلِهِمْ فَلَيَعْلَمَنَّ اللَّهُ الَّذِينَ صَدَقُوا وَلَيَعْلَمَنَّ الْكَاذِبِينَ (3)"));
        alankabouts.add(new Alankabout("أَمْ حَسِبَ الَّذِينَ يَعْمَلُونَ السَّيِّئَاتِ أَنْ يَسْبِقُونَا سَاءَ مَا يَحْكُمُونَ (4)"));
        alankabouts.add(new Alankabout("مَنْ كَانَ يَرْجُو لِقَاءَ اللَّهِ فَإِنَّ أَجَلَ اللَّهِ لَآَتٍ وَهُوَ السَّمِيعُ الْعَلِيمُ (5)"));
        alankabouts.add(new Alankabout("وَمَنْ جَاهَدَ فَإِنَّمَا يُجَاهِدُ لِنَفْسِهِ إِنَّ اللَّهَ لَغَنِيٌّ عَنِ الْعَالَمِينَ (6)"));
        alankabouts.add(new Alankabout("وَالَّذِينَ آَمَنُوا وَعَمِلُوا الصَّالِحَاتِ لَنُكَفِّرَنَّ عَنْهُمْ سَيِّئَاتِهِمْ وَلَنَجْزِيَنَّهُمْ أَحْسَنَ الَّذِي كَانُوا يَعْمَلُونَ (7)"));
        alankabouts.add(new Alankabout("وَوَصَّيْنَا الْإِنْسَانَ بِوَالِدَيْهِ حُسْنًا وَإِنْ جَاهَدَاكَ لِتُشْرِكَ بِي مَا لَيْسَ لَكَ بِهِ عِلْمٌ فَلَا تُطِعْهُمَا إِلَيَّ مَرْجِعُكُمْ فَأُنَبِّئُكُمْ بِمَا كُنْتُمْ تَعْمَلُونَ (8)"));
        alankabouts.add(new Alankabout("وَالَّذِينَ آَمَنُوا وَعَمِلُوا الصَّالِحَاتِ لَنُدْخِلَنَّهُمْ فِي الصَّالِحِينَ (9)"));
        alankabouts.add(new Alankabout("وَمِنَ النَّاسِ مَنْ يَقُولُ آَمَنَّا بِاللَّهِ فَإِذَا أُوذِيَ فِي اللَّهِ جَعَلَ فِتْنَةَ النَّاسِ كَعَذَابِ اللَّهِ وَلَئِنْ جَاءَ نَصْرٌ مِنْ رَبِّكَ لَيَقُولُنَّ إِنَّا كُنَّا مَعَكُمْ أَوَلَيْسَ اللَّهُ بِأَعْلَمَ بِمَا فِي صُدُورِ الْعَالَمِينَ (10)"));
        alankabouts.add(new Alankabout("وَلَيَعْلَمَنَّ اللَّهُ الَّذِينَ آَمَنُوا وَلَيَعْلَمَنَّ الْمُنَافِقِينَ (11)"));
        alankabouts.add(new Alankabout("وَقَالَ الَّذِينَ كَفَرُوا لِلَّذِينَ آَمَنُوا اتَّبِعُوا سَبِيلَنَا وَلْنَحْمِلْ خَطَايَاكُمْ وَمَا هُمْ بِحَامِلِينَ مِنْ خَطَايَاهُمْ مِنْ شَيْءٍ إِنَّهُمْ لَكَاذِبُونَ (12)"));
        alankabouts.add(new Alankabout("وَلَيَحْمِلُنَّ أَثْقَالَهُمْ وَأَثْقَالًا مَعَ أَثْقَالِهِمْ وَلَيُسْأَلُنَّ يَوْمَ الْقِيَامَةِ عَمَّا كَانُوا يَفْتَرُونَ (13)"));
        alankabouts.add(new Alankabout("وَلَقَدْ أَرْسَلْنَا نُوحًا إِلَى قَوْمِهِ فَلَبِثَ فِيهِمْ أَلْفَ سَنَةٍ إِلَّا خَمْسِينَ عَامًا فَأَخَذَهُمُ الطُّوفَانُ وَهُمْ ظَالِمُونَ (14)"));
        alankabouts.add(new Alankabout("فَأَنْجَيْنَاهُ وَأَصْحَابَ السَّفِينَةِ وَجَعَلْنَاهَا آَيَةً لِلْعَالَمِينَ (15)"));
        alankabouts.add(new Alankabout("وَإِبْرَاهِيمَ إِذْ قَالَ لِقَوْمِهِ اعْبُدُوا اللَّهَ وَاتَّقُوهُ ذَلِكُمْ خَيْرٌ لَكُمْ إِنْ كُنْتُمْ تَعْلَمُونَ (16)"));
        alankabouts.add(new Alankabout("إِنَّمَا تَعْبُدُونَ مِنْ دُونِ اللَّهِ أَوْثَانًا وَتَخْلُقُونَ إِفْكًا إِنَّ الَّذِينَ تَعْبُدُونَ مِنْ دُونِ اللَّهِ لَا يَمْلِكُونَ لَكُمْ رِزْقًا فَابْتَغُوا عِنْدَ اللَّهِ الرِّزْقَ وَاعْبُدُوهُ وَاشْكُرُوا لَهُ إِلَيْهِ تُرْجَعُونَ (17)"));
        alankabouts.add(new Alankabout("وَإِنْ تُكَذِّبُوا فَقَدْ كَذَّبَ أُمَمٌ مِنْ قَبْلِكُمْ وَمَا عَلَى الرَّسُولِ إِلَّا الْبَلَاغُ الْمُبِينُ (18)"));
        alankabouts.add(new Alankabout("أَوَلَمْ يَرَوْا كَيْفَ يُبْدِئُ اللَّهُ الْخَلْقَ ثُمَّ يُعِيدُهُ إِنَّ ذَلِكَ عَلَى اللَّهِ يَسِيرٌ (19)"));
        alankabouts.add(new Alankabout("قُلْ سِيرُوا فِي الْأَرْضِ فَانْظُرُوا كَيْفَ بَدَأَ الْخَلْقَ ثُمَّ اللَّهُ يُنْشِئُ النَّشْأَةَ الْآَخِرَةَ إِنَّ اللَّهَ عَلَى كُلِّ شَيْءٍ قَدِيرٌ (20)"));
        alankabouts.add(new Alankabout("يُعَذِّبُ مَنْ يَشَاءُ وَيَرْحَمُ مَنْ يَشَاءُ وَإِلَيْهِ تُقْلَبُونَ (21)"));
        alankabouts.add(new Alankabout("وَمَا أَنْتُمْ بِمُعْجِزِينَ فِي الْأَرْضِ وَلَا فِي السَّمَاءِ وَمَا لَكُمْ مِنْ دُونِ اللَّهِ مِنْ وَلِيٍّ وَلَا نَصِيرٍ (22)"));
        alankabouts.add(new Alankabout("وَالَّذِينَ كَفَرُوا بِآَيَاتِ اللَّهِ وَلِقَائِهِ أُولَئِكَ يَئِسُوا مِنْ رَحْمَتِي وَأُولَئِكَ لَهُمْ عَذَابٌ أَلِيمٌ (23)"));
        alankabouts.add(new Alankabout("فَمَا كَانَ جَوَابَ قَوْمِهِ إِلَّا أَنْ قَالُوا اقْتُلُوهُ أَوْ حَرِّقُوهُ فَأَنْجَاهُ اللَّهُ مِنَ النَّارِ إِنَّ فِي ذَلِكَ لَآَيَاتٍ لِقَوْمٍ يُؤْمِنُونَ (24)"));
        alankabouts.add(new Alankabout("وَقَالَ إِنَّمَا اتَّخَذْتُمْ مِنْ دُونِ اللَّهِ أَوْثَانًا مَوَدَّةَ بَيْنِكُمْ فِي الْحَيَاةِ الدُّنْيَا ثُمَّ يَوْمَ الْقِيَامَةِ يَكْفُرُ بَعْضُكُمْ بِبَعْضٍ وَيَلْعَنُ بَعْضُكُمْ بَعْضًا وَمَأْوَاكُمُ النَّارُ وَمَا لَكُمْ مِنْ نَاصِرِينَ (25)"));
        alankabouts.add(new Alankabout("فَآَمَنَ لَهُ لُوطٌ وَقَالَ إِنِّي مُهَاجِرٌ إِلَى رَبِّي إِنَّهُ هُوَ الْعَزِيزُ الْحَكِيمُ (26)"));
        alankabouts.add(new Alankabout("وَوَهَبْنَا لَهُ إِسْحَاقَ وَيَعْقُوبَ وَجَعَلْنَا فِي ذُرِّيَّتِهِ النُّبُوَّةَ وَالْكِتَابَ وَآَتَيْنَاهُ أَجْرَهُ فِي الدُّنْيَا وَإِنَّهُ فِي الْآَخِرَةِ لَمِنَ الصَّالِحِينَ (27)"));
        alankabouts.add(new Alankabout("وَلُوطًا إِذْ قَالَ لِقَوْمِهِ إِنَّكُمْ لَتَأْتُونَ الْفَاحِشَةَ مَا سَبَقَكُمْ بِهَا مِنْ أَحَدٍ مِنَ الْعَالَمِينَ (28)"));
        alankabouts.add(new Alankabout("أَئِنَّكُمْ لَتَأْتُونَ الرِّجَالَ وَتَقْطَعُونَ السَّبِيلَ وَتَأْتُونَ فِي نَادِيكُمُ الْمُنْكَرَ فَمَا كَانَ جَوَابَ قَوْمِهِ إِلَّا أَنْ قَالُوا ائْتِنَا بِعَذَابِ اللَّهِ إِنْ كُنْتَ مِنَ الصَّادِقِينَ (29)"));
        alankabouts.add(new Alankabout("قَالَ رَبِّ انْصُرْنِي عَلَى الْقَوْمِ الْمُفْسِدِينَ (30)"));
        alankabouts.add(new Alankabout("وَلَمَّا جَاءَتْ رُسُلُنَا إِبْرَاهِيمَ بِالْبُشْرَى قَالُوا إِنَّا مُهْلِكُو أَهْلِ هَذِهِ الْقَرْيَةِ إِنَّ أَهْلَهَا كَانُوا ظَالِمِينَ (31)"));
        alankabouts.add(new Alankabout("قَالَ إِنَّ فِيهَا لُوطًا قَالُوا نَحْنُ أَعْلَمُ بِمَنْ فِيهَا لَنُنَجِّيَنَّهُ وَأَهْلَهُ إِلَّا امْرَأَتَهُ كَانَتْ مِنَ الْغَابِرِينَ (32)"));
        alankabouts.add(new Alankabout("وَلَمَّا أَنْ جَاءَتْ رُسُلُنَا لُوطًا سِيءَ بِهِمْ وَضَاقَ بِهِمْ ذَرْعًا وَقَالُوا لَا تَخَفْ وَلَا تَحْزَنْ إِنَّا مُنَجُّوكَ وَأَهْلَكَ إِلَّا امْرَأَتَكَ كَانَتْ مِنَ الْغَابِرِينَ (33)"));
        alankabouts.add(new Alankabout("إِنَّا مُنْزِلُونَ عَلَى أَهْلِ هَذِهِ الْقَرْيَةِ رِجْزًا مِنَ السَّمَاءِ بِمَا كَانُوا يَفْسُقُونَ (34)"));
        alankabouts.add(new Alankabout("وَلَقَدْ تَرَكْنَا مِنْهَا آَيَةً بَيِّنَةً لِقَوْمٍ يَعْقِلُونَ (35)"));
        alankabouts.add(new Alankabout("وَإِلَى مَدْيَنَ أَخَاهُمْ شُعَيْبًا فَقَالَ يَا قَوْمِ اعْبُدُوا اللَّهَ وَارْجُوا الْيَوْمَ الْآَخِرَ وَلَا تَعْثَوْا فِي الْأَرْضِ مُفْسِدِينَ (36)"));
        alankabouts.add(new Alankabout("فَكَذَّبُوهُ فَأَخَذَتْهُمُ الرَّجْفَةُ فَأَصْبَحُوا فِي دَارِهِمْ جَاثِمِينَ (37)"));
        alankabouts.add(new Alankabout("وَعَادًا وَثَمُودَ وَقَدْ تَبَيَّنَ لَكُمْ مِنْ مَسَاكِنِهِمْ وَزَيَّنَ لَهُمَ الشَّيْطَانُ أَعْمَالَهُمْ فَصَدَّهُمْ عَنِ السَّبِيلِ وَكَانُوا مُسْتَبْصِرِينَ (38)"));
        alankabouts.add(new Alankabout("وَقَارُونَ وَفِرْعَوْنَ وَهَامَانَ وَلَقَدْ جَاءَهُمْ مُوسَى بِالْبَيِّنَاتِ فَاسْتَكْبَرُوا فِي الْأَرْضِ وَمَا كَانُوا سَابِقِينَ (39)"));
        alankabouts.add(new Alankabout("فَكُلًّا أَخَذْنَا بِذَنْبِهِ فَمِنْهُمْ مَنْ أَرْسَلْنَا عَلَيْهِ حَاصِبًا وَمِنْهُمْ مَنْ أَخَذَتْهُ الصَّيْحَةُ وَمِنْهُمْ مَنْ خَسَفْنَا بِهِ الْأَرْضَ وَمِنْهُمْ مَنْ أَغْرَقْنَا وَمَا كَانَ اللَّهُ لِيَظْلِمَهُمْ وَلَكِنْ كَانُوا أَنْفُسَهُمْ يَظْلِمُونَ (40)"));
        alankabouts.add(new Alankabout("مَثَلُ الَّذِينَ اتَّخَذُوا مِنْ دُونِ اللَّهِ أَوْلِيَاءَ كَمَثَلِ الْعَنْكَبُوتِ اتَّخَذَتْ بَيْتًا وَإِنَّ أَوْهَنَ الْبُيُوتِ لَبَيْتُ الْعَنْكَبُوتِ لَوْ كَانُوا يَعْلَمُونَ (41)"));
        alankabouts.add(new Alankabout("إِنَّ اللَّهَ يَعْلَمُ مَا يَدْعُونَ مِنْ دُونِهِ مِنْ شَيْءٍ وَهُوَ الْعَزِيزُ الْحَكِيمُ (42)"));
        alankabouts.add(new Alankabout("وَتِلْكَ الْأَمْثَالُ نَضْرِبُهَا لِلنَّاسِ وَمَا يَعْقِلُهَا إِلَّا الْعَالِمُونَ (43)"));
        alankabouts.add(new Alankabout("خَلَقَ اللَّهُ السَّمَاوَاتِ وَالْأَرْضَ بِالْحَقِّ إِنَّ فِي ذَلِكَ لَآَيَةً لِلْمُؤْمِنِينَ (44)"));
        alankabouts.add(new Alankabout("اتْلُ مَا أُوحِيَ إِلَيْكَ مِنَ الْكِتَابِ وَأَقِمِ الصَّلَاةَ إِنَّ الصَّلَاةَ تَنْهَى عَنِ الْفَحْشَاءِ وَالْمُنْكَرِ وَلَذِكْرُ اللَّهِ أَكْبَرُ وَاللَّهُ يَعْلَمُ مَا تَصْنَعُونَ (45)"));
        alankabouts.add(new Alankabout("وَلَا تُجَادِلُوا أَهْلَ الْكِتَابِ إِلَّا بِالَّتِي هِيَ أَحْسَنُ إِلَّا الَّذِينَ ظَلَمُوا مِنْهُمْ وَقُولُوا آَمَنَّا بِالَّذِي أُنْزِلَ إِلَيْنَا وَأُنْزِلَ إِلَيْكُمْ وَإِلَهُنَا وَإِلَهُكُمْ وَاحِدٌ وَنَحْنُ لَهُ مُسْلِمُونَ (46)"));
        alankabouts.add(new Alankabout("وَكَذَلِكَ أَنْزَلْنَا إِلَيْكَ الْكِتَابَ فَالَّذِينَ آَتَيْنَاهُمُ الْكِتَابَ يُؤْمِنُونَ بِهِ وَمِنْ هَؤُلَاءِ مَنْ يُؤْمِنُ بِهِ وَمَا يَجْحَدُ بِآَيَاتِنَا إِلَّا الْكَافِرُونَ (47)"));
        alankabouts.add(new Alankabout("وَمَا كُنْتَ تَتْلُو مِنْ قَبْلِهِ مِنْ كِتَابٍ وَلَا تَخُطُّهُ بِيَمِينِكَ إِذًا لَارْتَابَ الْمُبْطِلُونَ (48)"));
        alankabouts.add(new Alankabout("بَلْ هُوَ آَيَاتٌ بَيِّنَاتٌ فِي صُدُورِ الَّذِينَ أُوتُوا الْعِلْمَ وَمَا يَجْحَدُ بِآَيَاتِنَا إِلَّا الظَّالِمُونَ (49)"));
        alankabouts.add(new Alankabout("وَقَالُوا لَوْلَا أُنْزِلَ عَلَيْهِ آَيَاتٌ مِنْ رَبِّهِ قُلْ إِنَّمَا الْآَيَاتُ عِنْدَ اللَّهِ وَإِنَّمَا أَنَا نَذِيرٌ مُبِينٌ (50)"));
        alankabouts.add(new Alankabout("أَوَلَمْ يَكْفِهِمْ أَنَّا أَنْزَلْنَا عَلَيْكَ الْكِتَابَ يُتْلَى عَلَيْهِمْ إِنَّ فِي ذَلِكَ لَرَحْمَةً وَذِكْرَى لِقَوْمٍ يُؤْمِنُونَ (51)"));
        alankabouts.add(new Alankabout("قُلْ كَفَى بِاللَّهِ بَيْنِي وَبَيْنَكُمْ شَهِيدًا يَعْلَمُ مَا فِي السَّمَاوَاتِ وَالْأَرْضِ وَالَّذِينَ آَمَنُوا بِالْبَاطِلِ وَكَفَرُوا بِاللَّهِ أُولَئِكَ هُمُ الْخَاسِرُونَ (52)"));
        alankabouts.add(new Alankabout("وَيَسْتَعْجِلُونَكَ بِالْعَذَابِ وَلَوْلَا أَجَلٌ مُسَمًّى لَجَاءَهُمُ الْعَذَابُ وَلَيَأْتِيَنَّهُمْ بَغْتَةً وَهُمْ لَا يَشْعُرُونَ (53)"));
        alankabouts.add(new Alankabout("يَسْتَعْجِلُونَكَ بِالْعَذَابِ وَإِنَّ جَهَنَّمَ لَمُحِيطَةٌ بِالْكَافِرِينَ (54)"));
        alankabouts.add(new Alankabout("يَوْمَ يَغْشَاهُمُ الْعَذَابُ مِنْ فَوْقِهِمْ وَمِنْ تَحْتِ أَرْجُلِهِمْ وَيَقُولُ ذُوقُوا مَا كُنْتُمْ تَعْمَلُونَ (55)"));
        alankabouts.add(new Alankabout("يَا عِبَادِيَ الَّذِينَ آَمَنُوا إِنَّ أَرْضِي وَاسِعَةٌ فَإِيَّايَ فَاعْبُدُونِ (56)"));
        alankabouts.add(new Alankabout("كُلُّ نَفْسٍ ذَائِقَةُ الْمَوْتِ ثُمَّ إِلَيْنَا تُرْجَعُونَ (57)"));
        alankabouts.add(new Alankabout("وَالَّذِينَ آَمَنُوا وَعَمِلُوا الصَّالِحَاتِ لَنُبَوِّئَنَّهُمْ مِنَ الْجَنَّةِ غُرَفًا تَجْرِي مِنْ تَحْتِهَا الْأَنْهَارُ خَالِدِينَ فِيهَا نِعْمَ أَجْرُ الْعَامِلِينَ (58)"));
        alankabouts.add(new Alankabout("الَّذِينَ صَبَرُوا وَعَلَى رَبِّهِمْ يَتَوَكَّلُونَ (59)"));
        alankabouts.add(new Alankabout("وَكَأَيِّنْ مِنْ دَابَّةٍ لَا تَحْمِلُ رِزْقَهَا اللَّهُ يَرْزُقُهَا وَإِيَّاكُمْ وَهُوَ السَّمِيعُ الْعَلِيمُ (60)"));
        alankabouts.add(new Alankabout("وَلَئِنْ سَأَلْتَهُمْ مَنْ خَلَقَ السَّمَاوَاتِ وَالْأَرْضَ وَسَخَّرَ الشَّمْسَ وَالْقَمَرَ لَيَقُولُنَّ اللَّهُ فَأَنَّى يُؤْفَكُونَ (61)"));
        alankabouts.add(new Alankabout("اللَّهُ يَبْسُطُ الرِّزْقَ لِمَنْ يَشَاءُ مِنْ عِبَادِهِ وَيَقْدِرُ لَهُ إِنَّ اللَّهَ بِكُلِّ شَيْءٍ عَلِيمٌ (62)"));
        alankabouts.add(new Alankabout("وَلَئِنْ سَأَلْتَهُمْ مَنْ نَزَّلَ مِنَ السَّمَاءِ مَاءً فَأَحْيَا بِهِ الْأَرْضَ مِنْ بَعْدِ مَوْتِهَا لَيَقُولُنَّ اللَّهُ قُلِ الْحَمْدُ لِلَّهِ بَلْ أَكْثَرُهُمْ لَا يَعْقِلُونَ (63)"));
        alankabouts.add(new Alankabout("وَمَا هَذِهِ الْحَيَاةُ الدُّنْيَا إِلَّا لَهْوٌ وَلَعِبٌ وَإِنَّ الدَّارَ الْآَخِرَةَ لَهِيَ الْحَيَوَانُ لَوْ كَانُوا يَعْلَمُونَ (64)"));
        alankabouts.add(new Alankabout("فَإِذَا رَكِبُوا فِي الْفُلْكِ دَعَوُا اللَّهَ مُخْلِصِينَ لَهُ الدِّينَ فَلَمَّا نَجَّاهُمْ إِلَى الْبَرِّ إِذَا هُمْ يُشْرِكُونَ (65)"));
        alankabouts.add(new Alankabout("لِيَكْفُرُوا بِمَا آَتَيْنَاهُمْ وَلِيَتَمَتَّعُوا فَسَوْفَ يَعْلَمُونَ (66)"));
        alankabouts.add(new Alankabout("أَوَلَمْ يَرَوْا أَنَّا جَعَلْنَا حَرَمًا آَمِنًا وَيُتَخَطَّفُ النَّاسُ مِنْ حَوْلِهِمْ أَفَبِالْبَاطِلِ يُؤْمِنُونَ وَبِنِعْمَةِ اللَّهِ يَكْفُرُونَ (67)"));
        alankabouts.add(new Alankabout("وَمَنْ أَظْلَمُ مِمَّنِ افْتَرَى عَلَى اللَّهِ كَذِبًا أَوْ كَذَّبَ بِالْحَقِّ لَمَّا جَاءَهُ أَلَيْسَ فِي جَهَنَّمَ مَثْوًى لِلْكَافِرِينَ (68)"));
        alankabouts.add(new Alankabout("وَالَّذِينَ جَاهَدُوا فِينَا لَنَهْدِيَنَّهُمْ سُبُلَنَا وَإِنَّ اللَّهَ لَمَعَ الْمُحْسِنِينَ (69)"));


        quran_text_29_adapter = new quran_text_29_adapter(alankabouts ,QuranText_29Activity.this);

        recyclerView = findViewById(R.id.rv_29);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_29Activity.this));
        recyclerView.setAdapter(quran_text_29_adapter);


    }

}