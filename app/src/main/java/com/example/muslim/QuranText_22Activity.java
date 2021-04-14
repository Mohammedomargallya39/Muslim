package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_22Activity extends AppCompatActivity {

    ArrayList<Alhag> alhags = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_22_adapter quran_text_22_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_22);

        alhags.add(new Alhag("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alhags.add(new Alhag("يَا أَيُّهَا النَّاسُ اتَّقُوا رَبَّكُمْ إِنَّ زَلْزَلَةَ السَّاعَةِ شَيْءٌ عَظِيمٌ (1)"));
        alhags.add(new Alhag("يَوْمَ تَرَوْنَهَا تَذْهَلُ كُلُّ مُرْضِعَةٍ عَمَّا أَرْضَعَتْ وَتَضَعُ كُلُّ ذَاتِ حَمْلٍ حَمْلَهَا وَتَرَى النَّاسَ سُكَارَى وَمَا هُمْ بِسُكَارَى وَلَكِنَّ عَذَابَ اللَّهِ شَدِيدٌ (2)"));
        alhags.add(new Alhag("وَمِنَ النَّاسِ مَنْ يُجَادِلُ فِي اللَّهِ بِغَيْرِ عِلْمٍ وَيَتَّبِعُ كُلَّ شَيْطَانٍ مَرِيدٍ (3)"));
        alhags.add(new Alhag("كُتِبَ عَلَيْهِ أَنَّهُ مَنْ تَوَلَّاهُ فَأَنَّهُ يُضِلُّهُ وَيَهْدِيهِ إِلَى عَذَابِ السَّعِيرِ (4)"));
        alhags.add(new Alhag("يَا أَيُّهَا النَّاسُ إِنْ كُنْتُمْ فِي رَيْبٍ مِنَ الْبَعْثِ فَإِنَّا خَلَقْنَاكُمْ مِنْ تُرَابٍ ثُمَّ مِنْ نُطْفَةٍ ثُمَّ مِنْ عَلَقَةٍ ثُمَّ مِنْ مُضْغَةٍ مُخَلَّقَةٍ وَغَيْرِ مُخَلَّقَةٍ لِنُبَيِّنَ لَكُمْ وَنُقِرُّ فِي الْأَرْحَامِ مَا نَشَاءُ إِلَى أَجَلٍ مُسَمًّى ثُمَّ نُخْرِجُكُمْ طِفْلًا ثُمَّ لِتَبْلُغُوا أَشُدَّكُمْ وَمِنْكُمْ مَنْ يُتَوَفَّى وَمِنْكُمْ مَنْ يُرَدُّ إِلَى أَرْذَلِ الْعُمُرِ لِكَيْلَا يَعْلَمَ مِنْ بَعْدِ عِلْمٍ شَيْئًا وَتَرَى الْأَرْضَ هَامِدَةً فَإِذَا أَنْزَلْنَا عَلَيْهَا الْمَاءَ اهْتَزَّتْ وَرَبَتْ وَأَنْبَتَتْ مِنْ كُلِّ زَوْجٍ بَهِيجٍ (5)"));
        alhags.add(new Alhag("ذَلِكَ بِأَنَّ اللَّهَ هُوَ الْحَقُّ وَأَنَّهُ يُحْيِي الْمَوْتَى وَأَنَّهُ عَلَى كُلِّ شَيْءٍ قَدِيرٌ (6)"));
        alhags.add(new Alhag("وَأَنَّ السَّاعَةَ آَتِيَةٌ لَا رَيْبَ فِيهَا وَأَنَّ اللَّهَ يَبْعَثُ مَنْ فِي الْقُبُورِ (7)"));
        alhags.add(new Alhag("النَّاسِ مَنْ يُجَادِلُ فِي اللَّهِ بِغَيْرِ عِلْمٍ وَلَا هُدًى وَلَا كِتَابٍ مُنِيرٍ (8)"));
        alhags.add(new Alhag("ثَانِيَ عِطْفِهِ لِيُضِلَّ عَنْ سَبِيلِ اللَّهِ لَهُ فِي الدُّنْيَا خِزْيٌ وَنُذِيقُهُ يَوْمَ الْقِيَامَةِ عَذَابَ الْحَرِيقِ (9)"));
        alhags.add(new Alhag("ذَلِكَ بِمَا قَدَّمَتْ يَدَاكَ وَأَنَّ اللَّهَ لَيْسَ بِظَلَّامٍ لِلْعَبِيدِ (10)"));
        alhags.add(new Alhag("وَمِنَ النَّاسِ مَنْ يَعْبُدُ اللَّهَ عَلَى حَرْفٍ فَإِنْ أَصَابَهُ خَيْرٌ اطْمَأَنَّ بِهِ وَإِنْ أَصَابَتْهُ فِتْنَةٌ انْقَلَبَ عَلَى وَجْهِهِ خَسِرَ الدُّنْيَا وَالْآَخِرَةَ ذَلِكَ هُوَ الْخُسْرَانُ الْمُبِينُ (11)"));
        alhags.add(new Alhag("يَدْعُو مِنْ دُونِ اللَّهِ مَا لَا يَضُرُّهُ وَمَا لَا يَنْفَعُهُ ذَلِكَ هُوَ الضَّلَالُ الْبَعِيدُ (12)"));
        alhags.add(new Alhag("يَدْعُو لَمَنْ ضَرُّهُ أَقْرَبُ مِنْ نَفْعِهِ لَبِئْسَ الْمَوْلَى وَلَبِئْسَ الْعَشِيرُ (13)"));
        alhags.add(new Alhag("إِنَّ اللَّهَ يُدْخِلُ الَّذِينَ آَمَنُوا وَعَمِلُوا الصَّالِحَاتِ جَنَّاتٍ تَجْرِي مِنْ تَحْتِهَا الْأَنْهَارُ إِنَّ اللَّهَ يَفْعَلُ مَا يُرِيدُ (14)"));
        alhags.add(new Alhag(") مَنْ كَانَ يَظُنُّ أَنْ لَنْ يَنْصُرَهُ اللَّهُ فِي الدُّنْيَا وَالْآَخِرَةِ فَلْيَمْدُدْ بِسَبَبٍ إِلَى السَّمَاءِ ثُمَّ لِيَقْطَعْ فَلْيَنْظُرْ هَلْ يُذْهِبَنَّ كَيْدُهُ مَا يَغِيظُ (15)"));
        alhags.add(new Alhag("وَكَذَلِكَ أَنْزَلْنَاهُ آَيَاتٍ بَيِّنَاتٍ وَأَنَّ اللَّهَ يَهْدِي مَنْ يُرِيدُ (16)"));
        alhags.add(new Alhag("إِنَّ الَّذِينَ آَمَنُوا وَالَّذِينَ هَادُوا وَالصَّابِئِينَ وَالنَّصَارَى وَالْمَجُوسَ وَالَّذِينَ أَشْرَكُوا إِنَّ اللَّهَ يَفْصِلُ بَيْنَهُمْ يَوْمَ الْقِيَامَةِ إِنَّ اللَّهَ عَلَى كُلِّ شَيْءٍ شَهِيدٌ (17)"));
        alhags.add(new Alhag("أَلَمْ تَرَ أَنَّ اللَّهَ يَسْجُدُ لَهُ مَنْ فِي السَّمَاوَاتِ وَمَنْ فِي الْأَرْضِ وَالشَّمْسُ وَالْقَمَرُ وَالنُّجُومُ وَالْجِبَالُ وَالشَّجَرُ وَالدَّوَابُّ وَكَثِيرٌ مِنَ النَّاسِ وَكَثِيرٌ حَقَّ عَلَيْهِ الْعَذَابُ وَمَنْ يُهِنِ اللَّهُ فَمَا لَهُ مِنْ مُكْرِمٍ إِنَّ اللَّهَ يَفْعَلُ مَا يَشَاءُ (18)"));
        alhags.add(new Alhag("هَذَانِ خَصْمَانِ اخْتَصَمُوا فِي رَبِّهِمْ فَالَّذِينَ كَفَرُوا قُطِّعَتْ لَهُمْ ثِيَابٌ مِنْ نَارٍ يُصَبُّ مِنْ فَوْقِ رُءُوسِهِمُ الْحَمِيمُ (19)"));
        alhags.add(new Alhag("يُصْهَرُ بِهِ مَا فِي بُطُونِهِمْ وَالْجُلُودُ (20)"));
        alhags.add(new Alhag("وَلَهُمْ مَقَامِعُ مِنْ حَدِيدٍ (21)"));
        alhags.add(new Alhag("كُلَّمَا أَرَادُوا أَنْ يَخْرُجُوا مِنْهَا مِنْ غَمٍّ أُعِيدُوا فِيهَا وَذُوقُوا عَذَابَ الْحَرِيقِ (22)"));
        alhags.add(new Alhag("إِنَّ اللَّهَ يُدْخِلُ الَّذِينَ آَمَنُوا وَعَمِلُوا الصَّالِحَاتِ جَنَّاتٍ تَجْرِي مِنْ تَحْتِهَا الْأَنْهَارُ يُحَلَّوْنَ فِيهَا مِنْ أَسَاوِرَ مِنْ ذَهَبٍ وَلُؤْلُؤًا وَلِبَاسُهُمْ فِيهَا حَرِيرٌ (23)"));
        alhags.add(new Alhag("وَهُدُوا إِلَى الطَّيِّبِ مِنَ الْقَوْلِ وَهُدُوا إِلَى صِرَاطِ الْحَمِيدِ (24)"));
        alhags.add(new Alhag("إِنَّ الَّذِينَ كَفَرُوا وَيَصُدُّونَ عَنْ سَبِيلِ اللَّهِ وَالْمَسْجِدِ الْحَرَامِ الَّذِي جَعَلْنَاهُ لِلنَّاسِ سَوَاءً الْعَاكِفُ فِيهِ وَالْبَادِ وَمَنْ يُرِدْ فِيهِ بِإِلْحَادٍ بِظُلْمٍ نُذِقْهُ مِنْ عَذَابٍ أَلِيمٍ (25)"));
        alhags.add(new Alhag("وَإِذْ بَوَّأْنَا لِإِبْرَاهِيمَ مَكَانَ الْبَيْتِ أَنْ لَا تُشْرِكْ بِي شَيْئًا وَطَهِّرْ بَيْتِيَ لِلطَّائِفِينَ وَالْقَائِمِينَ وَالرُّكَّعِ السُّجُودِ (26)"));
        alhags.add(new Alhag("وَأَذِّنْ فِي النَّاسِ بِالْحَجِّ يَأْتُوكَ رِجَالًا وَعَلَى كُلِّ ضَامِرٍ يَأْتِينَ مِنْ كُلِّ فَجٍّ عَمِيقٍ (27)"));
        alhags.add(new Alhag("لِيَشْهَدُوا مَنَافِعَ لَهُمْ وَيَذْكُرُوا اسْمَ اللَّهِ فِي أَيَّامٍ مَعْلُومَاتٍ عَلَى مَا رَزَقَهُمْ مِنْ بَهِيمَةِ الْأَنْعَامِ فَكُلُوا مِنْهَا وَأَطْعِمُوا الْبَائِسَ الْفَقِيرَ (28)"));
        alhags.add(new Alhag("ثُمَّ لْيَقْضُوا تَفَثَهُمْ وَلْيُوفُوا نُذُورَهُمْ وَلْيَطَّوَّفُوا بِالْبَيْتِ الْعَتِيقِ (29)"));
        alhags.add(new Alhag("ذَلِكَ وَمَنْ يُعَظِّمْ حُرُمَاتِ اللَّهِ فَهُوَ خَيْرٌ لَهُ عِنْدَ رَبِّهِ وَأُحِلَّتْ لَكُمُ الْأَنْعَامُ إِلَّا مَا يُتْلَى عَلَيْكُمْ فَاجْتَنِبُوا الرِّجْسَ مِنَ الْأَوْثَانِ وَاجْتَنِبُوا قَوْلَ الزُّورِ (30)"));
        alhags.add(new Alhag("حُنَفَاءَ لِلَّهِ غَيْرَ مُشْرِكِينَ بِهِ وَمَنْ يُشْرِكْ بِاللَّهِ فَكَأَنَّمَا خَرَّ مِنَ السَّمَاءِ فَتَخْطَفُهُ الطَّيْرُ أَوْ تَهْوِي بِهِ الرِّيحُ فِي مَكَانٍ سَحِيقٍ (31)"));
        alhags.add(new Alhag("ذَلِكَ وَمَنْ يُعَظِّمْ شَعَائِرَ اللَّهِ فَإِنَّهَا مِنْ تَقْوَى الْقُلُوبِ (32)"));
        alhags.add(new Alhag("لَكُمْ فِيهَا مَنَافِعُ إِلَى أَجَلٍ مُسَمًّى ثُمَّ مَحِلُّهَا إِلَى الْبَيْتِ الْعَتِيقِ (33)"));
        alhags.add(new Alhag("وَلِكُلِّ أُمَّةٍ جَعَلْنَا مَنْسَكًا لِيَذْكُرُوا اسْمَ اللَّهِ عَلَى مَا رَزَقَهُمْ مِنْ بَهِيمَةِ الْأَنْعَامِ فَإِلَهُكُمْ إِلَهٌ وَاحِدٌ فَلَهُ أَسْلِمُوا وَبَشِّرِ الْمُخْبِتِينَ (34)"));
        alhags.add(new Alhag("الَّذِينَ إِذَا ذُكِرَ اللَّهُ وَجِلَتْ قُلُوبُهُمْ وَالصَّابِرِينَ عَلَى مَا أَصَابَهُمْ وَالْمُقِيمِي الصَّلَاةِ وَمِمَّا رَزَقْنَاهُمْ يُنْفِقُونَ (35)"));
        alhags.add(new Alhag("وَالْبُدْنَ جَعَلْنَاهَا لَكُمْ مِنْ شَعَائِرِ اللَّهِ لَكُمْ فِيهَا خَيْرٌ فَاذْكُرُوا اسْمَ اللَّهِ عَلَيْهَا صَوَافَّ فَإِذَا وَجَبَتْ جُنُوبُهَا فَكُلُوا مِنْهَا وَأَطْعِمُوا الْقَانِعَ وَالْمُعْتَرَّ كَذَلِكَ سَخَّرْنَاهَا لَكُمْ لَعَلَّكُمْ تَشْكُرُونَ (36)"));
        alhags.add(new Alhag("لَنْ يَنَالَ اللَّهَ لُحُومُهَا وَلَا دِمَاؤُهَا وَلَكِنْ يَنَالُهُ التَّقْوَى مِنْكُمْ كَذَلِكَ سَخَّرَهَا لَكُمْ لِتُكَبِّرُوا اللَّهَ عَلَى مَا هَدَاكُمْ وَبَشِّرِ الْمُحْسِنِينَ (37)"));
        alhags.add(new Alhag("إِنَّ اللَّهَ يُدَافِعُ عَنِ الَّذِينَ آَمَنُوا إِنَّ اللَّهَ لَا يُحِبُّ كُلَّ خَوَّانٍ كَفُورٍ (38)"));
        alhags.add(new Alhag("أُذِنَ لِلَّذِينَ يُقَاتَلُونَ بِأَنَّهُمْ ظُلِمُوا وَإِنَّ اللَّهَ عَلَى نَصْرِهِمْ لَقَدِيرٌ (39)"));
        alhags.add(new Alhag("الَّذِينَ أُخْرِجُوا مِنْ دِيَارِهِمْ بِغَيْرِ حَقٍّ إِلَّا أَنْ يَقُولُوا رَبُّنَا اللَّهُ وَلَوْلَا دَفْعُ اللَّهِ النَّاسَ بَعْضَهُمْ بِبَعْضٍ لَهُدِّمَتْ صَوَامِعُ وَبِيَعٌ وَصَلَوَاتٌ وَمَسَاجِدُ يُذْكَرُ فِيهَا اسْمُ اللَّهِ كَثِيرًا وَلَيَنْصُرَنَّ اللَّهُ مَنْ يَنْصُرُهُ إِنَّ اللَّهَ لَقَوِيٌّ عَزِيزٌ (40)"));
        alhags.add(new Alhag("الَّذِينَ إِنْ مَكَّنَّاهُمْ فِي الْأَرْضِ أَقَامُوا الصَّلَاةَ وَآَتَوُا الزَّكَاةَ وَأَمَرُوا بِالْمَعْرُوفِ وَنَهَوْا عَنِ الْمُنْكَرِ وَلِلَّهِ عَاقِبَةُ الْأُمُورِ (41)"));
        alhags.add(new Alhag("وَإِنْ يُكَذِّبُوكَ فَقَدْ كَذَّبَتْ قَبْلَهُمْ قَوْمُ نُوحٍ وَعَادٌ وَثَمُودُ (42)"));
        alhags.add(new Alhag("وَقَوْمُ إِبْرَاهِيمَ وَقَوْمُ لُوطٍ (43)"));
        alhags.add(new Alhag("وَأَصْحَابُ مَدْيَنَ وَكُذِّبَ مُوسَى فَأَمْلَيْتُ لِلْكَافِرِينَ ثُمَّ أَخَذْتُهُمْ فَكَيْفَ كَانَ نَكِيرِ (44)"));
        alhags.add(new Alhag("فَكَأَيِّنْ مِنْ قَرْيَةٍ أَهْلَكْنَاهَا وَهِيَ ظَالِمَةٌ فَهِيَ خَاوِيَةٌ عَلَى عُرُوشِهَا وَبِئْرٍ مُعَطَّلَةٍ وَقَصْرٍ مَشِيدٍ (45)"));
        alhags.add(new Alhag("أَفَلَمْ يَسِيرُوا فِي الْأَرْضِ فَتَكُونَ لَهُمْ قُلُوبٌ يَعْقِلُونَ بِهَا أَوْ آَذَانٌ يَسْمَعُونَ بِهَا فَإِنَّهَا لَا تَعْمَى الْأَبْصَارُ وَلَكِنْ تَعْمَى الْقُلُوبُ الَّتِي فِي الصُّدُورِ (46)"));
        alhags.add(new Alhag("وَيَسْتَعْجِلُونَكَ بِالْعَذَابِ وَلَنْ يُخْلِفَ اللَّهُ وَعْدَهُ وَإِنَّ يَوْمًا عِنْدَ رَبِّكَ كَأَلْفِ سَنَةٍ مِمَّا تَعُدُّونَ (47)"));
        alhags.add(new Alhag("وَكَأَيِّنْ مِنْ قَرْيَةٍ أَمْلَيْتُ لَهَا وَهِيَ ظَالِمَةٌ ثُمَّ أَخَذْتُهَا وَإِلَيَّ الْمَصِيرُ (48)"));
        alhags.add(new Alhag("قُلْ يَا أَيُّهَا النَّاسُ إِنَّمَا أَنَا لَكُمْ نَذِيرٌ مُبِينٌ (49)"));
        alhags.add(new Alhag("فَالَّذِينَ آَمَنُوا وَعَمِلُوا الصَّالِحَاتِ لَهُمْ مَغْفِرَةٌ وَرِزْقٌ كَرِيمٌ (50)"));
        alhags.add(new Alhag("وَالَّذِينَ سَعَوْا فِي آَيَاتِنَا مُعَاجِزِينَ أُولَئِكَ أَصْحَابُ الْجَحِيمِ (51)"));
        alhags.add(new Alhag("وَمَا أَرْسَلْنَا مِنْ قَبْلِكَ مِنْ رَسُولٍ وَلَا نَبِيٍّ إِلَّا إِذَا تَمَنَّى أَلْقَى الشَّيْطَانُ فِي أُمْنِيَّتِهِ فَيَنْسَخُ اللَّهُ مَا يُلْقِي الشَّيْطَانُ ثُمَّ يُحْكِمُ اللَّهُ آَيَاتِهِ وَاللَّهُ عَلِيمٌ حَكِيمٌ (52)"));
        alhags.add(new Alhag("لِيَجْعَلَ مَا يُلْقِي الشَّيْطَانُ فِتْنَةً لِلَّذِينَ فِي قُلُوبِهِمْ مَرَضٌ وَالْقَاسِيَةِ قُلُوبُهُمْ وَإِنَّ الظَّالِمِينَ لَفِي شِقَاقٍ بَعِيدٍ (53)"));
        alhags.add(new Alhag("وَلِيَعْلَمَ الَّذِينَ أُوتُوا الْعِلْمَ أَنَّهُ الْحَقُّ مِنْ رَبِّكَ فَيُؤْمِنُوا بِهِ فَتُخْبِتَ لَهُ قُلُوبُهُمْ وَإِنَّ اللَّهَ لَهَادِ الَّذِينَ آَمَنُوا إِلَى صِرَاطٍ مُسْتَقِيمٍ (54)"));
        alhags.add(new Alhag("وَلَا يَزَالُ الَّذِينَ كَفَرُوا فِي مِرْيَةٍ مِنْهُ حَتَّى تَأْتِيَهُمُ السَّاعَةُ بَغْتَةً أَوْ يَأْتِيَهُمْ عَذَابُ يَوْمٍ عَقِيمٍ (55)"));
        alhags.add(new Alhag("لْمُلْكُ يَوْمَئِذٍ لِلَّهِ يَحْكُمُ بَيْنَهُمْ فَالَّذِينَ آَمَنُوا وَعَمِلُوا الصَّالِحَاتِ فِي جَنَّاتِ النَّعِيمِ (56)"));
        alhags.add(new Alhag("وَالَّذِينَ كَفَرُوا وَكَذَّبُوا بِآَيَاتِنَا فَأُولَئِكَ لَهُمْ عَذَابٌ مُهِينٌ (57)"));
        alhags.add(new Alhag("وَالَّذِينَ هَاجَرُوا فِي سَبِيلِ اللَّهِ ثُمَّ قُتِلُوا أَوْ مَاتُوا لَيَرْزُقَنَّهُمُ اللَّهُ رِزْقًا حَسَنًا وَإِنَّ اللَّهَ لَهُوَ خَيْرُ الرَّازِقِينَ (58)"));
        alhags.add(new Alhag("لَيُدْخِلَنَّهُمْ مُدْخَلًا يَرْضَوْنَهُ وَإِنَّ اللَّهَ لَعَلِيمٌ حَلِيمٌ (59)"));
        alhags.add(new Alhag("ذَلِكَ وَمَنْ عَاقَبَ بِمِثْلِ مَا عُوقِبَ بِهِ ثُمَّ بُغِيَ عَلَيْهِ لَيَنْصُرَنَّهُ اللَّهُ إِنَّ اللَّهَ لَعَفُوٌّ غَفُورٌ (60)"));
        alhags.add(new Alhag("ذَلِكَ بِأَنَّ اللَّهَ يُولِجُ اللَّيْلَ فِي النَّهَارِ وَيُولِجُ النَّهَارَ فِي اللَّيْلِ وَأَنَّ اللَّهَ سَمِيعٌ بَصِيرٌ (61)"));
        alhags.add(new Alhag("ذَلِكَ بِأَنَّ اللَّهَ هُوَ الْحَقُّ وَأَنَّ مَا يَدْعُونَ مِنْ دُونِهِ هُوَ الْبَاطِلُ وَأَنَّ اللَّهَ هُوَ الْعَلِيُّ الْكَبِيرُ (62)"));
        alhags.add(new Alhag("أَلَمْ تَرَ أَنَّ اللَّهَ أَنْزَلَ مِنَ السَّمَاءِ مَاءً فَتُصْبِحُ الْأَرْضُ مُخْضَرَّةً إِنَّ اللَّهَ لَطِيفٌ خَبِيرٌ (63)"));
        alhags.add(new Alhag("لَهُ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ وَإِنَّ اللَّهَ لَهُوَ الْغَنِيُّ الْحَمِيدُ (64)"));
        alhags.add(new Alhag("أَلَمْ تَرَ أَنَّ اللَّهَ سَخَّرَ لَكُمْ مَا فِي الْأَرْضِ وَالْفُلْكَ تَجْرِي فِي الْبَحْرِ بِأَمْرِهِ وَيُمْسِكُ السَّمَاءَ أَنْ تَقَعَ عَلَى الْأَرْضِ إِلَّا بِإِذْنِهِ إِنَّ اللَّهَ بِالنَّاسِ لَرَءُوفٌ رَحِيمٌ (65)"));
        alhags.add(new Alhag("وَهُوَ الَّذِي أَحْيَاكُمْ ثُمَّ يُمِيتُكُمْ ثُمَّ يُحْيِيكُمْ إِنَّ الْإِنْسَانَ لَكَفُورٌ (66)"));
        alhags.add(new Alhag("لِكُلِّ أُمَّةٍ جَعَلْنَا مَنْسَكًا هُمْ نَاسِكُوهُ فَلَا يُنَازِعُنَّكَ فِي الْأَمْرِ وَادْعُ إِلَى رَبِّكَ إِنَّكَ لَعَلَى هُدًى مُسْتَقِيمٍ (67)"));
        alhags.add(new Alhag("وَإِنْ جَادَلُوكَ فَقُلِ اللَّهُ أَعْلَمُ بِمَا تَعْمَلُونَ (68)"));
        alhags.add(new Alhag("اللَّهُ يَحْكُمُ بَيْنَكُمْ يَوْمَ الْقِيَامَةِ فِيمَا كُنْتُمْ فِيهِ تَخْتَلِفُونَ (69)"));
        alhags.add(new Alhag("أَلَمْ تَعْلَمْ أَنَّ اللَّهَ يَعْلَمُ مَا فِي السَّمَاءِ وَالْأَرْضِ إِنَّ ذَلِكَ فِي كِتَابٍ إِنَّ ذَلِكَ عَلَى اللَّهِ يَسِيرٌ (70)"));
        alhags.add(new Alhag("وَيَعْبُدُونَ مِنْ دُونِ اللَّهِ مَا لَمْ يُنَزِّلْ بِهِ سُلْطَانًا وَمَا لَيْسَ لَهُمْ بِهِ عِلْمٌ وَمَا لِلظَّالِمِينَ مِنْ نَصِيرٍ (71)"));
        alhags.add(new Alhag("وَإِذَا تُتْلَى عَلَيْهِمْ آَيَاتُنَا بَيِّنَاتٍ تَعْرِفُ فِي وُجُوهِ الَّذِينَ كَفَرُوا الْمُنْكَرَ يَكَادُونَ يَسْطُونَ بِالَّذِينَ يَتْلُونَ عَلَيْهِمْ آَيَاتِنَا قُلْ أَفَأُنَبِّئُكُمْ بِشَرٍّ مِنْ ذَلِكُمُ النَّارُ وَعَدَهَا اللَّهُ الَّذِينَ كَفَرُوا وَبِئْسَ الْمَصِيرُ (72)"));
        alhags.add(new Alhag("يَا أَيُّهَا النَّاسُ ضُرِبَ مَثَلٌ فَاسْتَمِعُوا لَهُ إِنَّ الَّذِينَ تَدْعُونَ مِنْ دُونِ اللَّهِ لَنْ يَخْلُقُوا ذُبَابًا وَلَوِ اجْتَمَعُوا لَهُ وَإِنْ يَسْلُبْهُمُ الذُّبَابُ شَيْئًا لَا يَسْتَنْقِذُوهُ مِنْهُ ضَعُفَ الطَّالِبُ وَالْمَطْلُوبُ (73)"));
        alhags.add(new Alhag("مَا قَدَرُوا اللَّهَ حَقَّ قَدْرِهِ إِنَّ اللَّهَ لَقَوِيٌّ عَزِيزٌ (74)"));
        alhags.add(new Alhag("اللَّهُ يَصْطَفِي مِنَ الْمَلَائِكَةِ رُسُلًا وَمِنَ النَّاسِ إِنَّ اللَّهَ سَمِيعٌ بَصِيرٌ (75)"));
        alhags.add(new Alhag("يَعْلَمُ مَا بَيْنَ أَيْدِيهِمْ وَمَا خَلْفَهُمْ وَإِلَى اللَّهِ تُرْجَعُ الْأُمُورُ (76)"));
        alhags.add(new Alhag("يَا أَيُّهَا الَّذِينَ آَمَنُوا ارْكَعُوا وَاسْجُدُوا وَاعْبُدُوا رَبَّكُمْ وَافْعَلُوا الْخَيْرَ لَعَلَّكُمْ تُفْلِحُونَ (77)"));
        alhags.add(new Alhag("وَجَاهِدُوا فِي اللَّهِ حَقَّ جِهَادِهِ هُوَ اجْتَبَاكُمْ وَمَا جَعَلَ عَلَيْكُمْ فِي الدِّينِ مِنْ حَرَجٍ مِلَّةَ أَبِيكُمْ إِبْرَاهِيمَ هُوَ سَمَّاكُمُ الْمُسْلِمِينَ مِنْ قَبْلُ وَفِي هَذَا لِيَكُونَ الرَّسُولُ شَهِيدًا عَلَيْكُمْ وَتَكُونُوا شُهَدَاءَ عَلَى النَّاسِ فَأَقِيمُوا الصَّلَاةَ وَآَتُوا الزَّكَاةَ وَاعْتَصِمُوا بِاللَّهِ هُوَ مَوْلَاكُمْ فَنِعْمَ الْمَوْلَى وَنِعْمَ النَّصِيرُ (78)"));


        quran_text_22_adapter = new quran_text_22_adapter(alhags ,QuranText_22Activity.this);

        recyclerView = findViewById(R.id.rv_22);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_22Activity.this));
        recyclerView.setAdapter(quran_text_22_adapter);


    }

}