package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_19Activity extends AppCompatActivity {

    ArrayList<Mariam> mariams = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_19_adapter quran_text_19_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_19);

        mariams.add(new Mariam("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        mariams.add(new Mariam("كهيعص (1)"));
        mariams.add(new Mariam("ذِكْرُ رَحْمَةِ رَبِّكَ عَبْدَهُ زَكَرِيَّا (2)"));
        mariams.add(new Mariam("إِذْ نَادَى رَبَّهُ نِدَاءً خَفِيًّا (3)"));
        mariams.add(new Mariam("قَالَ رَبِّ إِنِّي وَهَنَ الْعَظْمُ مِنِّي وَاشْتَعَلَ الرَّأْسُ شَيْبًا وَلَمْ أَكُنْ بِدُعَائِكَ رَبِّ شَقِيًّا (4)"));
        mariams.add(new Mariam("َإِنِّي خِفْتُ الْمَوَالِيَ مِنْ وَرَائِي وَكَانَتِ امْرَأَتِي عَاقِرًا فَهَبْ لِي مِنْ لَدُنْكَ وَلِيًّا (5)"));
        mariams.add(new Mariam("يَرِثُنِي وَيَرِثُ مِنْ آَلِ يَعْقُوبَ وَاجْعَلْهُ رَبِّ رَضِيًّا (6)"));
        mariams.add(new Mariam("يَا زَكَرِيَّا إِنَّا نُبَشِّرُكَ بِغُلَامٍ اسْمُهُ يَحْيَى لَمْ نَجْعَلْ لَهُ مِنْ قَبْلُ سَمِيًّا (7)"));
        mariams.add(new Mariam("قَالَ رَبِّ أَنَّى يَكُونُ لِي غُلَامٌ وَكَانَتِ امْرَأَتِي عَاقِرًا وَقَدْ بَلَغْتُ مِنَ الْكِبَرِ عِتِيًّا (8)"));
        mariams.add(new Mariam("قَالَ كَذَلِكَ قَالَ رَبُّكَ هُوَ عَلَيَّ هَيِّنٌ وَقَدْ خَلَقْتُكَ مِنْ قَبْلُ وَلَمْ تَكُ شَيْئًا (9)"));
        mariams.add(new Mariam("قَالَ رَبِّ اجْعَلْ لِي آَيَةً قَالَ آَيَتُكَ أَلَّا تُكَلِّمَ النَّاسَ ثَلَاثَ لَيَالٍ سَوِيًّا (10)"));
        mariams.add(new Mariam("فَخَرَجَ عَلَى قَوْمِهِ مِنَ الْمِحْرَابِ فَأَوْحَى إِلَيْهِمْ أَنْ سَبِّحُوا بُكْرَةً وَعَشِيًّا (11)"));
        mariams.add(new Mariam("يَا يَحْيَى خُذِ الْكِتَابَ بِقُوَّةٍ وَآَتَيْنَاهُ الْحُكْمَ صَبِيًّا (12)"));
        mariams.add(new Mariam("وَحَنَانًا مِنْ لَدُنَّا وَزَكَاةً وَكَانَ تَقِيًّا (13)"));
        mariams.add(new Mariam("وَبَرًّا بِوَالِدَيْهِ وَلَمْ يَكُنْ جَبَّارًا عَصِيًّا (14)"));
        mariams.add(new Mariam("وَسَلَامٌ عَلَيْهِ يَوْمَ وُلِدَ وَيَوْمَ يَمُوتُ وَيَوْمَ يُبْعَثُ حَيًّا (15)"));
        mariams.add(new Mariam("وَاذْكُرْ فِي الْكِتَابِ مَرْيَمَ إِذِ انْتَبَذَتْ مِنْ أَهْلِهَا مَكَانًا شَرْقِيًّا (16)"));
        mariams.add(new Mariam("فَاتَّخَذَتْ مِنْ دُونِهِمْ حِجَابًا فَأَرْسَلْنَا إِلَيْهَا رُوحَنَا فَتَمَثَّلَ لَهَا بَشَرًا سَوِيًّا (17)"));
        mariams.add(new Mariam("قَالَتْ إِنِّي أَعُوذُ بِالرَّحْمَنِ مِنْكَ إِنْ كُنْتَ تَقِيًّا (18)"));
        mariams.add(new Mariam("قَالَ إِنَّمَا أَنَا رَسُولُ رَبِّكِ لِأَهَبَ لَكِ غُلَامًا زَكِيًّا (19)"));
        mariams.add(new Mariam("قَالَتْ أَنَّى يَكُونُ لِي غُلَامٌ وَلَمْ يَمْسَسْنِي بَشَرٌ وَلَمْ أَكُ بَغِيًّا (20)"));
        mariams.add(new Mariam("قَالَ كَذَلِكِ قَالَ رَبُّكِ هُوَ عَلَيَّ هَيِّنٌ وَلِنَجْعَلَهُ آَيَةً لِلنَّاسِ وَرَحْمَةً مِنَّا وَكَانَ أَمْرًا مَقْضِيًّا (21)"));
        mariams.add(new Mariam("فَحَمَلَتْهُ فَانْتَبَذَتْ بِهِ مَكَانًا قَصِيًّا (22)"));
        mariams.add(new Mariam("فَأَجَاءَهَا الْمَخَاضُ إِلَى جِذْعِ النَّخْلَةِ قَالَتْ يَا لَيْتَنِي مِتُّ قَبْلَ هَذَا وَكُنْتُ نَسْيًا مَنْسِيًّا (23)"));
        mariams.add(new Mariam("فَنَادَاهَا مِنْ تَحْتِهَا أَلَّا تَحْزَنِي قَدْ جَعَلَ رَبُّكِ تَحْتَكِ سَرِيًّا (24)"));
        mariams.add(new Mariam("وَهُزِّي إِلَيْكِ بِجِذْعِ النَّخْلَةِ تُسَاقِطْ عَلَيْكِ رُطَبًا جَنِيًّا (25)"));
        mariams.add(new Mariam("فَكُلِي وَاشْرَبِي وَقَرِّي عَيْنًا فَإِمَّا تَرَيِنَّ مِنَ الْبَشَرِ أَحَدًا فَقُولِي إِنِّي نَذَرْتُ لِلرَّحْمَنِ صَوْمًا فَلَنْ أُكَلِّمَ الْيَوْمَ إِنْسِيًّا (26)"));
        mariams.add(new Mariam("فَأَتَتْ بِهِ قَوْمَهَا تَحْمِلُهُ قَالُوا يَا مَرْيَمُ لَقَدْ جِئْتِ شَيْئًا فَرِيًّا (27)"));
        mariams.add(new Mariam("يَا أُخْتَ هَارُونَ مَا كَانَ أَبُوكِ امْرَأَ سَوْءٍ وَمَا كَانَتْ أُمُّكِ بَغِيًّا (28)"));
        mariams.add(new Mariam("فَأَشَارَتْ إِلَيْهِ قَالُوا كَيْفَ نُكَلِّمُ مَنْ كَانَ فِي الْمَهْدِ صَبِيًّا (29)"));
        mariams.add(new Mariam("قَالَ إِنِّي عَبْدُ اللَّهِ آَتَانِيَ الْكِتَابَ وَجَعَلَنِي نَبِيًّا (30)"));
        mariams.add(new Mariam("وَجَعَلَنِي مُبَارَكًا أَيْنَ مَا كُنْتُ \u200Eوَأَوْصَانِي بِالصَّلَاةِ وَالزَّكَاةِ مَا دُمْتُ حَيًّا (31)"));
        mariams.add(new Mariam("وَبَرًّا بِوَالِدَتِي وَلَمْ يَجْعَلْنِي جَبَّارًا شَقِيًّا (32)"));
        mariams.add(new Mariam("وَالسَّلَامُ عَلَيَّ يَوْمَ وُلِدْتُ وَيَوْمَ أَمُوتُ وَيَوْمَ أُبْعَثُ حَيًّا (33)"));
        mariams.add(new Mariam("ذَلِكَ عيسَى ابْنُ مَرْيَمَ قَوْلَ الْحَقِّ الَّذِي فِيهِ يَمْتَرُونَ (34)"));
        mariams.add(new Mariam("مَا كَانَ لِلَّهِ أَنْ يَتَّخِذَ مِنْ وَلَدٍ سُبْحَانَهُ إِذَا قَضَى أَمْرًا فَإِنَّمَا يَقُولُ لَهُ كُنْ فَيَكُونُ (35)"));
        mariams.add(new Mariam("وَإِنَّ اللَّهَ رَبِّي وَرَبُّكُمْ فَاعْبُدُوهُ هَذَا صِرَاطٌ مُسْتَقِيمٌ (36)"));
        mariams.add(new Mariam("فَاخْتَلَفَ الْأَحْزَابُ مِنْ بَيْنِهِمِْ فَوَيْلٌ لِلَّذِينَ كَفَرُوا مِنْ مَشْهَدِ يَوْمٍ عَظِيمٍ (37)"));
        mariams.add(new Mariam("َسْمِعْ بِهِمْ وَأَبْصِرْ يَوْمَ يَأْتُونَنَا لَكِنِ الظَّالِمُونَ الْيَوْمَ فِي ضَلَالٍ مُبِينٍ (38)"));
        mariams.add(new Mariam("وَأَنْذِرْهُمْ يَوْمَ الْحَسْرَةِ إِذْ قُضِيَ الْأَمْرُ وَهُمْ فِي غَفْلَةٍ وَهُمْ لَا يُؤْمِنُونَ (39)"));
        mariams.add(new Mariam("إِنَّا نَحْنُ نَرِثُ الْأَرْضَ وَمَنْ عَلَيْهَا وَإِلَيْنَا يُرْجَعُونَ (40)"));
        mariams.add(new Mariam("وَاذْكُرْ فِي الْكِتَابِ إِبْرَاهِيمَ إِنَّهُ كَانَ صِدِّيقًا نَبِيًّا (41)"));
        mariams.add(new Mariam("إِذْ قَالَ لِأَبِيهِ يَا أَبَتِ لِمَ تَعْبُدُ مَا لَا يَسْمَعُ وَلَا يُبْصِرُ وَلَا يُغْنِي عَنْكَ شَيْئًا (42)"));
        mariams.add(new Mariam("يَا أَبَتِ إِنِّي قَدْ جَاءَنِي مِنَ الْعِلْمِ مَا لَمْ يَأْتِكَ فَاتَّبِعْنِي أَهْدِكَ صِرَاطًا سَوِيًّا (43)"));
        mariams.add(new Mariam("يَا أَبَتِ لَا تَعْبُدِ الشَّيْطَانَ إِنَّ الشَّيْطَانَ كَانَ لِلرَّحْمَنِ عَصِيًّا (44)"));
        mariams.add(new Mariam("يَا أَبَتِ إِنِّي أَخَافُ أَنْ يَمَسَّكَ عَذَابٌ مِنَ الرَّحْمَنِ فَتَكُونَ لِلشَّيْطَانِ وَلِيًّا (45)"));
        mariams.add(new Mariam("قَالَ أَرَاغِبٌ أَنْتَ عَنْ آَلِهَتِي يَا إِبْرَاهِيمُ لَئِنْ لَمْ تَنْتَهِ لَأَرْجُمَنَّكَ وَاهْجُرْنِي مَلِيًّا (46)"));
        mariams.add(new Mariam("قَالَ سَلَامٌ عَلَيْكَ سَأَسْتَغْفِرُ لَكَ رَبِّي إِنَّهُ كَانَ بِي حَفِيًّا (47)"));
        mariams.add(new Mariam("وَأَعْتَزِلُكُمْ وَمَا تَدْعُونَ مِنْ دُونِ اللَّهِ وَأَدْعُو رَبِّي عَسَى أَلَّا أَكُونَ بِدُعَاءِ رَبِّي شَقِيًّا (48)"));
        mariams.add(new Mariam("فَلَمَّا اعْتَزَلَهُمْ وَمَا يَعْبُدُونَ مِنْ دُونِ اللَّهِ وَهَبْنَا لَهُ إِسْحَاقَ وَيَعْقُوبَ وَكُلًّا جَعَلْنَا نَبِيًّا (49)"));
        mariams.add(new Mariam("وَوَهَبْنَا لَهُمْ مِنْ رَحْمَتِنَا وَجَعَلْنَا لَهُمْ لِسَانَ صِدْقٍ عَلِيًّا (50)"));
        mariams.add(new Mariam("وَاذْكُرْ فِي الْكِتَابِ مُوسَى إِنَّهُ كَانَ مُخْلَصًا وَكَانَ رَسُولًا نَبِيًّا (51)"));
        mariams.add(new Mariam("وَنَادَيْنَاهُ مِنْ جَانِبِ الطُّورِ الْأَيْمَنِ وَقَرَّبْنَاهُ نَجِيًّا (52)"));
        mariams.add(new Mariam("وَوَهَبْنَا لَهُ مِنْ رَحْمَتِنَا أَخَاهُ هَارُونَ نَبِيًّا (53)"));
        mariams.add(new Mariam("وَاذْكُرْ فِي الْكِتَابِ إِسْمَاعِيلَ إِنَّهُ كَانَ صَادِقَ الْوَعْدِ وَكَانَ رَسُولًا نَبِيًّا (54)"));
        mariams.add(new Mariam("وَكَانَ يَأْمُرُ أَهْلَهُ بِالصَّلَاةِ وَالزَّكَاةِ وَكَانَ عِنْدَ رَبِّهِ مَرْضِيًّا (55)"));
        mariams.add(new Mariam("وَاذْكُرْ فِي الْكِتَابِ إِدْرِيسَ إِنَّهُ كَانَ صِدِّيقًا نَبِيًّا (56)"));
        mariams.add(new Mariam("وَرَفَعْنَاهُ مَكَانًا عَلِيًّا (57)"));
        mariams.add(new Mariam("أُولَئِكَ الَّذِينَ أَنْعَمَ اللَّهُ عَلَيْهِمْ مِنَ النَّبِيِّينَ مِنْ ذُرِّيَّةِ آَدَمَ وَمِمَّنْ حَمَلْنَا مَعَ نُوحٍ وَمِنْ ذُرِّيَّةِ إِبْرَاهِيمَ وَإِسْرَائِيلَ وَمِمَّنْ هَدَيْنَا وَاجْتَبَيْنَا إِذَا تُتْلَى عَلَيْهِمْ آَيَاتُ الرَّحْمَنِ خَرُّوا سُجَّدًا وَبُكِيًّا (58)"));
        mariams.add(new Mariam("فَخَلَفَ مِنْ بَعْدِهِمْ خَلْفٌ أَضَاعُوا الصَّلَاةَ وَاتَّبَعُوا الشَّهَوَاتِ فَسَوْفَ يَلْقَوْنَ غَيًّا (59)"));
        mariams.add(new Mariam("إِلَّا مَنْ تَابَ وَآَمَنَ وَعَمِلَ صَالِحًا فَأُولَئِكَ يَدْخُلُونَ الْجَنَّةَ وَلَا يُظْلَمُونَ شَيْئًا (60)"));
        mariams.add(new Mariam("جَنَّاتِ عَدْنٍ الَّتِي وَعَدَ الرَّحْمَنُ عِبَادَهُ بِالْغَيْبِ إِنَّهُ كَانَ وَعْدُهُ مَأْتِيًّا (61)"));
        mariams.add(new Mariam("لَا يَسْمَعُونَ فِيهَا لَغْوًا إِلَّا سَلَامًا وَلَهُمْ رِزْقُهُمْ فِيهَا بُكْرَةً وَعَشِيًّا (62)"));
        mariams.add(new Mariam("تِلْكَ الْجَنَّةُ الَّتِي نُورِثُ مِنْ عِبَادِنَا مَنْ كَانَ تَقِيًّا (63)"));
        mariams.add(new Mariam("وَمَا نَتَنَزَّلُ إِلَّا بِأَمْرِ رَبِّكَ لَهُ مَا بَيْنَ أَيْدِينَا وَمَا خَلْفَنَا وَمَا بَيْنَ ذَلِكَ وَمَا كَانَ رَبُّكَ نَسِيًّا (64)"));
        mariams.add(new Mariam("رَبُّ السَّمَاوَاتِ وَالْأَرْضِ وَمَا بَيْنَهُمَا فَاعْبُدْهُ وَاصْطَبِرْ لِعِبَادَتِهِ هَلْ تَعْلَمُ لَهُ سَمِيًّا (65)"));
        mariams.add(new Mariam("وَيَقُولُ الْإِنْسَانُ أَئِذَا مَا مِتُّ لَسَوْفَ أُخْرَجُ حَيًّا (66)"));
        mariams.add(new Mariam("أَوَلَا يَذْكُرُ الْإِنْسَانُ أَنَّا خَلَقْنَاهُ مِنْ قَبْلُ وَلَمْ يَكُ شَيْئًا (67)"));
        mariams.add(new Mariam("فَوَرَبِّكَ لَنَحْشُرَنَّهُمْ وَالشَّيَاطِينَ ثُمَّ لَنُحْضِرَنَّهُمْ حَوْلَ جَهَنَّمَ جِثِيًّا (68)"));
        mariams.add(new Mariam("ثُمَّ لَنَنْزِعَنَّ مِنْ كُلِّ شِيعَةٍ أَيُّهُمْ أَشَدُّ عَلَى الرَّحْمَنِ عِتِيًّا (69)"));
        mariams.add(new Mariam("ثُمَّ لَنَحْنُ أَعْلَمُ بِالَّذِينَ هُمْ أَوْلَى بِهَا صِلِيًّا (70)"));
        mariams.add(new Mariam("وَإِنْ مِنْكُمْ إِلَّا وَارِدُهَا كَانَ عَلَى رَبِّكَ حَتْمًا مَقْضِيًّا (71)"));
        mariams.add(new Mariam("ثُمَّ نُنَجِّي الَّذِينَ اتَّقَوْا وَنَذَرُ الظَّالِمِينَ فِيهَا جِثِيًّا (72)"));
        mariams.add(new Mariam("وَإِذَا تُتْلَى عَلَيْهِمْ آَيَاتُنَا بَيِّنَاتٍ قَالَ الَّذِينَ كَفَرُوا لِلَّذِينَ آَمَنُوا أَيُّ الْفَرِيقَيْنِ خَيْرٌ مَقَامًا وَأَحْسَنُ نَدِيًّا (73)"));
        mariams.add(new Mariam("وَكَمْ أَهْلَكْنَا قَبْلَهُمْ مِنْ قَرْنٍ هُمْ أَحْسَنُ أَثَاثًا وَرِئْيًا (74)"));
        mariams.add(new Mariam("قُلْ مَنْ كَانَ فِي الضَّلَالَةِ فَلْيَمْدُدْ لَهُ الرَّحْمَنُ مَدًّا حَتَّى إِذَا رَأَوْا مَا يُوعَدُونَ إِمَّا الْعَذَابَ وَإِمَّا السَّاعَةَ فَسَيَعْلَمُونَ مَنْ هُوَ شَرٌّ مَكَانًا وَأَضْعَفُ جُنْدًا (75)"));
        mariams.add(new Mariam("وَيَزِيدُ اللَّهُ الَّذِينَ اهْتَدَوْا هُدًى وَالْبَاقِيَاتُ الصَّالِحَاتُ خَيْرٌ عِنْدَ رَبِّكَ ثَوَابًا وَخَيْرٌ مَرَدًّا (76)"));
        mariams.add(new Mariam("أَفَرَأَيْتَ الَّذِي كَفَرَ بِآَيَاتِنَا وَقَالَ لَأُوتَيَنَّ مَالًا وَوَلَدًا (77)"));
        mariams.add(new Mariam("أَطَّلَعَ الْغَيْبَ أَمِ اتَّخَذَ عِنْدَ الرَّحْمَنِ عَهْدًا (78)"));
        mariams.add(new Mariam("كَلَّا سَنَكْتُبُ مَا يَقُولُ وَنَمُدُّ لَهُ مِنَ الْعَذَابِ مَدًّا (79)"));
        mariams.add(new Mariam("وَنَرِثُهُ مَا يَقُولُ وَيَأْتِينَا فَرْدًا (80)"));
        mariams.add(new Mariam("وَاتَّخَذُوا مِنْ دُونِ اللَّهِ آَلِهَةً لِيَكُونُوا لَهُمْ عِزًّا (81)"));
        mariams.add(new Mariam("كَلَّا سَيَكْفُرُونَ بِعِبَادَتِهِمْ وَيَكُونُونَ عَلَيْهِمْ ضِدًّا (82)"));
        mariams.add(new Mariam("أَلَمْ تَرَ أَنَّا أَرْسَلْنَا الشَّيَاطِينَ عَلَى الْكَافِرِينَ تَؤُزُّهُمْ أَزًّا (83)"));
        mariams.add(new Mariam("فَلَا تَعْجَلْ عَلَيْهِمْ إِنَّمَا نَعُدُّ لَهُمْ عَدًّا (84)"));
        mariams.add(new Mariam("يَوْمَ نَحْشُرُ الْمُتَّقِينَ إِلَى الرَّحْمَنِ وَفْدًا (85)"));
        mariams.add(new Mariam("وَنَسُوقُ الْمُجْرِمِينَ إِلَى جَهَنَّمَ وِرْدًا (86)"));
        mariams.add(new Mariam("لَا يَمْلِكُونَ الشَّفَاعَةَ إِلَّا مَنِ اتَّخَذَ عِنْدَ الرَّحْمَنِ عَهْدًا (87)"));
        mariams.add(new Mariam("وَقَالُوا اتَّخَذَ الرَّحْمَنُ وَلَدًا (88)"));
        mariams.add(new Mariam("لَقَدْ جِئْتُمْ شَيْئًا إِدًّا (89)"));
        mariams.add(new Mariam("تَكَادُ السَّمَاوَاتُ يَتَفَطَّرْنَ مِنْهُ وَتَنْشَقُّ الْأَرْضُ وَتَخِرُّ الْجِبَالُ هَدًّا (90)"));
        mariams.add(new Mariam("أَنْ دَعَوْا لِلرَّحْمَنِ وَلَدًا (91)"));
        mariams.add(new Mariam("وَمَا يَنْبَغِي لِلرَّحْمَنِ أَنْ يَتَّخِذَ وَلَدًا (92)"));
        mariams.add(new Mariam("إِنْ كُلُّ مَنْ فِي السَّمَاوَاتِ وَالْأَرْضِ إِلَّا آَتِي الرَّحْمَنِ عَبْدًا (93)"));
        mariams.add(new Mariam("لَقَدْ أَحْصَاهُمْ وَعَدَّهُمْ عَدًّا (94)"));
        mariams.add(new Mariam("وَكُلُّهُمْ آَتِيهِ يَوْمَ الْقِيَامَةِ فَرْدًا (95)"));
        mariams.add(new Mariam("إِنَّ الَّذِينَ آَمَنُوا وَعَمِلُوا الصَّالِحَاتِ سَيَجْعَلُ لَهُمُ الرَّحْمَنُ وُدًّا (96)"));
        mariams.add(new Mariam("فَإِنَّمَا يَسَّرْنَاهُ بِلِسَانِكَ لِتُبَشِّرَ بِهِ الْمُتَّقِينَ وَتُنْذِرَ بِهِ قَوْمًا لُدًّا (97)"));
        mariams.add(new Mariam("وَكَمْ أَهْلَكْنَا قَبْلَهُمْ مِنْ قَرْنٍ هَلْ تُحِسُّ مِنْهُمْ مِنْ أَحَدٍ أَوْ تَسْمَعُ لَهُمْ رِكْزًا (98)"));



        quran_text_19_adapter = new quran_text_19_adapter(mariams ,QuranText_19Activity.this);

        recyclerView = findViewById(R.id.rv_19);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_19Activity.this));
        recyclerView.setAdapter(quran_text_19_adapter);


    }

}