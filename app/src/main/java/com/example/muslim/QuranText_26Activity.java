package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_26Activity extends AppCompatActivity {

    ArrayList<Alshoaraa> alshoaraas = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_26_adapter quran_text_26_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_26);

        alshoaraas.add(new Alshoaraa("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alshoaraas.add(new Alshoaraa("طسم (1)"));
        alshoaraas.add(new Alshoaraa("تِلْكَ آَيَاتُ الْكِتَابِ الْمُبِينِ (2)"));
        alshoaraas.add(new Alshoaraa("لَعَلَّكَ بَاخِعٌ نَفْسَكَ أَلَّا يَكُونُوا مُؤْمِنِينَ (3)"));
        alshoaraas.add(new Alshoaraa("إِنْ نَشَأْ نُنَزِّلْ عَلَيْهِمْ مِنَ السَّمَاءِ آَيَةً فَظَلَّتْ أَعْنَاقُهُمْ لَهَا خَاضِعِينَ (4)"));
        alshoaraas.add(new Alshoaraa("وَمَا يَأْتِيهِمْ مِنْ ذِكْرٍ مِنَ الرَّحْمَنِ مُحْدَثٍ إِلَّا كَانُوا عَنْهُ مُعْرِضِينَ (5)"));
        alshoaraas.add(new Alshoaraa("فَقَدْ كَذَّبُوا فَسَيَأْتِيهِمْ أَنْبَاءُ مَا كَانُوا بِهِ يَسْتَهْزِئُونَ (6)"));
        alshoaraas.add(new Alshoaraa("أَوَلَمْ يَرَوْا إِلَى الْأَرْضِ كَمْ أَنْبَتْنَا فِيهَا مِنْ كُلِّ زَوْجٍ كَرِيمٍ (7)"));
        alshoaraas.add(new Alshoaraa("إِنَّ فِي ذَلِكَ لَآَيَةً وَمَا كَانَ أَكْثَرُهُمْ مُؤْمِنِينَ (8)"));
        alshoaraas.add(new Alshoaraa("وَإِنَّ رَبَّكَ لَهُوَ الْعَزِيزُ الرَّحِيمُ (9)"));
        alshoaraas.add(new Alshoaraa("وَإِذْ نَادَى رَبُّكَ مُوسَى أَنِ ائْتِ الْقَوْمَ الظَّالِمِينَ (10)"));
        alshoaraas.add(new Alshoaraa("قَوْمَ فِرْعَوْنَ أَلَا يَتَّقُونَ (11)"));
        alshoaraas.add(new Alshoaraa("قَالَ رَبِّ إِنِّي أَخَافُ أَنْ يُكَذِّبُونِ (12)"));
        alshoaraas.add(new Alshoaraa("وَيَضِيقُ صَدْرِي وَلَا يَنْطَلِقُ لِسَانِي فَأَرْسِلْ إِلَى هَارُونَ (13)"));
        alshoaraas.add(new Alshoaraa("وَلَهُمْ عَلَيَّ ذَنْبٌ فَأَخَافُ أَنْ يَقْتُلُونِ (14)"));
        alshoaraas.add(new Alshoaraa("قَالَ كَلَّا فَاذْهَبَا بِآَيَاتِنَا إِنَّا مَعَكُمْ مُسْتَمِعُونَ (15)"));
        alshoaraas.add(new Alshoaraa("فَأْتِيَا فِرْعَوْنَ فَقُولَا إِنَّا رَسُولُ رَبِّ الْعَالَمِينَ (16)"));
        alshoaraas.add(new Alshoaraa("أَنْ أَرْسِلْ مَعَنَا بَنِي إِسْرَائِيلَ (17)"));
        alshoaraas.add(new Alshoaraa("قَالَ أَلَمْ نُرَبِّكَ فِينَا وَلِيدًا وَلَبِثْتَ فِينَا مِنْ عُمُرِكَ سِنِينَ (18)"));
        alshoaraas.add(new Alshoaraa("وَفَعَلْتَ فَعْلَتَكَ الَّتِي فَعَلْتَ وَأَنْتَ مِنَ الْكَافِرِينَ (19)"));
        alshoaraas.add(new Alshoaraa("قَالَ فَعَلْتُهَا إِذًا وَأَنَا مِنَ الضَّالِّينَ (20)"));
        alshoaraas.add(new Alshoaraa("فَفَرَرْتُ مِنْكُمْ لَمَّا خِفْتُكُمْ فَوَهَبَ لِي رَبِّي حُكْمًا وَجَعَلَنِي مِنَ الْمُرْسَلِينَ (21)"));
        alshoaraas.add(new Alshoaraa("وَتِلْكَ نِعْمَةٌ تَمُنُّهَا عَلَيَّ أَنْ عَبَّدْتَ بَنِي إِسْرَائِيلَ (22)"));
        alshoaraas.add(new Alshoaraa("قَالَ فِرْعَوْنُ وَمَا رَبُّ الْعَالَمِينَ (23)"));
        alshoaraas.add(new Alshoaraa("قَالَ رَبُّ السَّمَاوَاتِ وَالْأَرْضِ وَمَا بَيْنَهُمَا إِنْ كُنْتُمْ مُوقِنِينَ (24)"));
        alshoaraas.add(new Alshoaraa("قَالَ لِمَنْ حَوْلَهُ أَلَا تَسْتَمِعُونَ (25)"));
        alshoaraas.add(new Alshoaraa("قَالَ رَبُّكُمْ وَرَبُّ آَبَائِكُمُ الْأَوَّلِينَ (26)"));
        alshoaraas.add(new Alshoaraa("قَالَ إِنَّ رَسُولَكُمُ الَّذِي أُرْسِلَ إِلَيْكُمْ لَمَجْنُونٌ (27)"));
        alshoaraas.add(new Alshoaraa("قَالَ رَبُّ الْمَشْرِقِ وَالْمَغْرِبِ وَمَا بَيْنَهُمَا إِنْ كُنْتُمْ تَعْقِلُونَ (28)"));
        alshoaraas.add(new Alshoaraa("قَالَ لَئِنِ اتَّخَذْتَ إِلَهًا غَيْرِي لَأَجْعَلَنَّكَ مِنَ الْمَسْجُونِينَ (29)"));
        alshoaraas.add(new Alshoaraa("قَالَ أَوَلَوْ جِئْتُكَ بِشَيْءٍ مُبِينٍ (30)"));
        alshoaraas.add(new Alshoaraa("قَالَ فَأْتِ بِهِ إِنْ كُنْتَ مِنَ الصَّادِقِينَ (31)"));
        alshoaraas.add(new Alshoaraa("فَأَلْقَى عَصَاهُ فَإِذَا هِيَ ثُعْبَانٌ مُبِينٌ (32)"));
        alshoaraas.add(new Alshoaraa("وَنَزَعَ يَدَهُ فَإِذَا هِيَ بَيْضَاءُ لِلنَّاظِرِينَ (33)"));
        alshoaraas.add(new Alshoaraa("قَالَ لِلْمَلَإِ حَوْلَهُ إِنَّ هَذَا لَسَاحِرٌ عَلِيمٌ (34)"));
        alshoaraas.add(new Alshoaraa("يُرِيدُ أَنْ يُخْرِجَكُمْ مِنْ أَرْضِكُمْ بِسِحْرِهِ فَمَاذَا تَأْمُرُونَ (35)"));
        alshoaraas.add(new Alshoaraa("قَالُوا أَرْجِهْ وَأَخَاهُ وَابْعَثْ فِي الْمَدَائِنِ حَاشِرِينَ (36)"));
        alshoaraas.add(new Alshoaraa("يَأْتُوكَ بِكُلِّ سَحَّارٍ عَلِيمٍ (37)"));
        alshoaraas.add(new Alshoaraa("فَجُمِعَ السَّحَرَةُ لِمِيقَاتِ يَوْمٍ مَعْلُومٍ (38)"));
        alshoaraas.add(new Alshoaraa("وَقِيلَ لِلنَّاسِ هَلْ أَنْتُمْ مُجْتَمِعُونَ (39)"));
        alshoaraas.add(new Alshoaraa("لَعَلَّنَا نَتَّبِعُ السَّحَرَةَ إِنْ كَانُوا هُمُ الْغَالِبِينَ (40)"));
        alshoaraas.add(new Alshoaraa("فَلَمَّا جَاءَ السَّحَرَةُ قَالُوا لِفِرْعَوْنَ أَئِنَّ لَنَا لَأَجْرًا إِنْ كُنَّا نَحْنُ الْغَالِبِينَ (41)"));
        alshoaraas.add(new Alshoaraa("قَالَ نَعَمْ وَإِنَّكُمْ إِذًا لَمِنَ الْمُقَرَّبِينَ (42)"));
        alshoaraas.add(new Alshoaraa("قَالَ لَهُمْ مُوسَى أَلْقُوا مَا أَنْتُمْ مُلْقُونَ (43)"));
        alshoaraas.add(new Alshoaraa("فَأَلْقَوْا حِبَالَهُمْ وَعِصِيَّهُمْ وَقَالُوا بِعِزَّةِ فِرْعَوْنَ إِنَّا لَنَحْنُ الْغَالِبُونَ (44)"));
        alshoaraas.add(new Alshoaraa("فَأَلْقَى مُوسَى عَصَاهُ فَإِذَا هِيَ تَلْقَفُ مَا يَأْفِكُونَ (45)"));
        alshoaraas.add(new Alshoaraa("فَأُلْقِيَ السَّحَرَةُ سَاجِدِينَ (46)"));
        alshoaraas.add(new Alshoaraa("قَالُوا آَمَنَّا بِرَبِّ الْعَالَمِينَ (47)"));
        alshoaraas.add(new Alshoaraa("رَبِّ مُوسَى وَهَارُونَ (48)"));
        alshoaraas.add(new Alshoaraa("قَالَ آَمَنْتُمْ لَهُ قَبْلَ أَنْ آَذَنَ لَكُمْ إِنَّهُ لَكَبِيرُكُمُ الَّذِي عَلَّمَكُمُ السِّحْرَ فَلَسَوْفَ تَعْلَمُونَ لَأُقَطِّعَنَّ أَيْدِيَكُمْ وَأَرْجُلَكُمْ مِنْ خِلَافٍ وَلَأُصَلِّبَنَّكُمْ أَجْمَعِينَ (49)"));
        alshoaraas.add(new Alshoaraa("قَالُوا لَا ضَيْرَ إِنَّا إِلَى رَبِّنَا مُنْقَلِبُونَ (50)"));
        alshoaraas.add(new Alshoaraa("إِنَّا نَطْمَعُ أَنْ يَغْفِرَ لَنَا رَبُّنَا خَطَايَانَا أَنْ كُنَّا أَوَّلَ الْمُؤْمِنِينَ (51)"));
        alshoaraas.add(new Alshoaraa("وَأَوْحَيْنَا إِلَى مُوسَى أَنْ أَسْرِ بِعِبَادِي إِنَّكُمْ مُتَّبَعُونَ (52)"));
        alshoaraas.add(new Alshoaraa("فَأَرْسَلَ فِرْعَوْنُ فِي الْمَدَائِنِ حَاشِرِينَ (53)"));
        alshoaraas.add(new Alshoaraa("إِنَّ هَؤُلَاءِ لَشِرْذِمَةٌ قَلِيلُونَ (54)"));
        alshoaraas.add(new Alshoaraa("وَإِنَّهُمْ لَنَا لَغَائِظُونَ (55)"));
        alshoaraas.add(new Alshoaraa("وَإِنَّا لَجَمِيعٌ حَاذِرُونَ (56)"));
        alshoaraas.add(new Alshoaraa("فَأَخْرَجْنَاهُمْ مِنْ جَنَّاتٍ وَعُيُونٍ (57)"));
        alshoaraas.add(new Alshoaraa("وَكُنُوزٍ وَمَقَامٍ كَرِيمٍ (58)"));
        alshoaraas.add(new Alshoaraa("كَذَلِكَ وَأَوْرَثْنَاهَا بَنِي إِسْرَائِيلَ (59)"));
        alshoaraas.add(new Alshoaraa("فَأَتْبَعُوهُمْ مُشْرِقِينَ (60)"));
        alshoaraas.add(new Alshoaraa("فَلَمَّا تَرَاءَى الْجَمْعَانِ قَالَ أَصْحَابُ مُوسَى إِنَّا لَمُدْرَكُونَ (61)"));
        alshoaraas.add(new Alshoaraa("قَالَ كَلَّا إِنَّ مَعِيَ رَبِّي سَيَهْدِينِ (62)"));
        alshoaraas.add(new Alshoaraa("فَأَوْحَيْنَا إِلَى مُوسَى أَنِ اضْرِبْ بِعَصَاكَ الْبَحْرَ فَانْفَلَقَ فَكَانَ كُلُّ فِرْقٍ كَالطَّوْدِ الْعَظِيمِ (63)"));
        alshoaraas.add(new Alshoaraa("وَأَزْلَفْنَا ثَمَّ الْآَخَرِينَ (64)"));
        alshoaraas.add(new Alshoaraa("وَأَنْجَيْنَا مُوسَى وَمَنْ مَعَهُ أَجْمَعِينَ (65)"));
        alshoaraas.add(new Alshoaraa("ثُمَّ أَغْرَقْنَا الْآَخَرِينَ (66)"));
        alshoaraas.add(new Alshoaraa("إِنَّ فِي ذَلِكَ لَآَيَةً وَمَا كَانَ أَكْثَرُهُمْ مُؤْمِنِينَ (67)"));
        alshoaraas.add(new Alshoaraa("وَإِنَّ رَبَّكَ لَهُوَ الْعَزِيزُ الرَّحِيمُ (68)"));
        alshoaraas.add(new Alshoaraa("وَاتْلُ عَلَيْهِمْ نَبَأَ إِبْرَاهِيمَ (69)"));
        alshoaraas.add(new Alshoaraa("إِذْ قَالَ لِأَبِيهِ وَقَوْمِهِ مَا تَعْبُدُونَ (70)"));
        alshoaraas.add(new Alshoaraa("قَالُوا نَعْبُدُ أَصْنَامًا فَنَظَلُّ لَهَا عَاكِفِينَ (71)"));
        alshoaraas.add(new Alshoaraa("قَالَ هَلْ يَسْمَعُونَكُمْ إِذْ تَدْعُونَ (72)"));
        alshoaraas.add(new Alshoaraa("أَوْ يَنْفَعُونَكُمْ أَوْ يَضُرُّونَ (73)"));
        alshoaraas.add(new Alshoaraa("قَالُوا بَلْ وَجَدْنَا آَبَاءَنَا كَذَلِكَ يَفْعَلُونَ (74)"));
        alshoaraas.add(new Alshoaraa("قَالَ أَفَرَأَيْتُمْ مَا كُنْتُمْ تَعْبُدُونَ (75)"));
        alshoaraas.add(new Alshoaraa("أَنْتُمْ وَآَبَاؤُكُمُ الْأَقْدَمُونَ (76)"));
        alshoaraas.add(new Alshoaraa("فَإِنَّهُمْ عَدُوٌّ لِي إِلَّا رَبَّ الْعَالَمِينَ (77)"));
        alshoaraas.add(new Alshoaraa("الَّذِي خَلَقَنِي فَهُوَ يَهْدِينِ (78)"));
        alshoaraas.add(new Alshoaraa("وَالَّذِي هُوَ يُطْعِمُنِي وَيَسْقِينِ (79)"));
        alshoaraas.add(new Alshoaraa("وَإِذَا مَرِضْتُ فَهُوَ يَشْفِينِ (80)"));
        alshoaraas.add(new Alshoaraa("وَالَّذِي يُمِيتُنِي ثُمَّ يُحْيِينِ (81)"));
        alshoaraas.add(new Alshoaraa("وَالَّذِي أَطْمَعُ أَنْ يَغْفِرَ لِي خَطِيئَتِي يَوْمَ الدِّينِ (82)"));
        alshoaraas.add(new Alshoaraa("رَبِّ هَبْ لِي حُكْمًا وَأَلْحِقْنِي بِالصَّالِحِينَ (83)"));
        alshoaraas.add(new Alshoaraa("وَاجْعَلْ لِي لِسَانَ صِدْقٍ فِي الْآَخِرِينَ (84)"));
        alshoaraas.add(new Alshoaraa("وَاجْعَلْنِي مِنْ وَرَثَةِ جَنَّةِ النَّعِيمِ (85)"));
        alshoaraas.add(new Alshoaraa("وَاغْفِرْ لِأَبِي إِنَّهُ كَانَ مِنَ الضَّالِّينَ (86)"));
        alshoaraas.add(new Alshoaraa("وَلَا تُخْزِنِي يَوْمَ يُبْعَثُونَ (87)"));
        alshoaraas.add(new Alshoaraa("يَوْمَ لَا يَنْفَعُ مَالٌ وَلَا بَنُونَ (88)"));
        alshoaraas.add(new Alshoaraa("إِلَّا مَنْ أَتَى اللَّهَ بِقَلْبٍ سَلِيمٍ (89)"));
        alshoaraas.add(new Alshoaraa("وَأُزْلِفَتِ الْجَنَّةُ لِلْمُتَّقِينَ (90)"));
        alshoaraas.add(new Alshoaraa("وَبُرِّزَتِ الْجَحِيمُ لِلْغَاوِينَ (91)"));
        alshoaraas.add(new Alshoaraa("وَقِيلَ لَهُمْ أَيْنَ مَا كُنْتُمْ تَعْبُدُونَ (92)"));
        alshoaraas.add(new Alshoaraa("مِنْ دُونِ اللَّهِ هَلْ يَنْصُرُونَكُمْ أَوْ يَنْتَصِرُونَ (93)"));
        alshoaraas.add(new Alshoaraa("فَكُبْكِبُوا فِيهَا هُمْ وَالْغَاوُونَ (94)"));
        alshoaraas.add(new Alshoaraa("وَجُنُودُ إِبْلِيسَ أَجْمَعُونَ (95)"));
        alshoaraas.add(new Alshoaraa("قَالُوا وَهُمْ فِيهَا يَخْتَصِمُونَ (96)"));
        alshoaraas.add(new Alshoaraa("تَاللَّهِ إِنْ كُنَّا لَفِي ضَلَالٍ مُبِينٍ (97)"));
        alshoaraas.add(new Alshoaraa("إِذْ نُسَوِّيكُمْ بِرَبِّ الْعَالَمِينَ (98)"));
        alshoaraas.add(new Alshoaraa("وَمَا أَضَلَّنَا إِلَّا الْمُجْرِمُونَ (99)"));
        alshoaraas.add(new Alshoaraa("فَمَا لَنَا مِنْ شَافِعِينَ (100)"));
        alshoaraas.add(new Alshoaraa("وَلَا صَدِيقٍ حَمِيمٍ (101)"));
        alshoaraas.add(new Alshoaraa("فَلَوْ أَنَّ لَنَا كَرَّةً فَنَكُونَ مِنَ الْمُؤْمِنِينَ (102)"));
        alshoaraas.add(new Alshoaraa("إِنَّ فِي ذَلِكَ لَآَيَةً وَمَا كَانَ أَكْثَرُهُمْ مُؤْمِنِينَ (103)"));
        alshoaraas.add(new Alshoaraa("وَإِنَّ رَبَّكَ لَهُوَ الْعَزِيزُ الرَّحِيمُ (104)"));
        alshoaraas.add(new Alshoaraa("كَذَّبَتْ قَوْمُ نُوحٍ الْمُرْسَلِينَ (105)"));
        alshoaraas.add(new Alshoaraa("إِذْ قَالَ لَهُمْ أَخُوهُمْ نُوحٌ أَلَا تَتَّقُونَ (106)"));
        alshoaraas.add(new Alshoaraa("إِنِّي لَكُمْ رَسُولٌ أَمِينٌ (107)"));
        alshoaraas.add(new Alshoaraa("فَاتَّقُوا اللَّهَ وَأَطِيعُونِ (108)"));
        alshoaraas.add(new Alshoaraa("وَمَا أَسْأَلُكُمْ عَلَيْهِ مِنْ أَجْرٍ إِنْ أَجْرِيَ إِلَّا عَلَى رَبِّ الْعَالَمِينَ (109)"));
        alshoaraas.add(new Alshoaraa("فَاتَّقُوا اللَّهَ وَأَطِيعُونِ (110)"));
        alshoaraas.add(new Alshoaraa("قَالُوا أَنُؤْمِنُ لَكَ وَاتَّبَعَكَ الْأَرْذَلُونَ (111)"));
        alshoaraas.add(new Alshoaraa("قَالَ وَمَا عِلْمِي بِمَا كَانُوا يَعْمَلُونَ (112)"));
        alshoaraas.add(new Alshoaraa("إِنْ حِسَابُهُمْ إِلَّا عَلَى رَبِّي لَوْ تَشْعُرُونَ (113)"));
        alshoaraas.add(new Alshoaraa("وَمَا أَنَا بِطَارِدِ الْمُؤْمِنِينَ (114)"));
        alshoaraas.add(new Alshoaraa("إِنْ أَنَا إِلَّا نَذِيرٌ مُبِينٌ (115)"));
        alshoaraas.add(new Alshoaraa("قَالُوا لَئِنْ لَمْ تَنْتَهِ يَا نُوحُ لَتَكُونَنَّ مِنَ الْمَرْجُومِينَ (116)"));
        alshoaraas.add(new Alshoaraa("قَالَ رَبِّ إِنَّ قَوْمِي كَذَّبُونِ (117)"));
        alshoaraas.add(new Alshoaraa("فَافْتَحْ بَيْنِي وَبَيْنَهُمْ فَتْحًا وَنَجِّنِي وَمَنْ مَعِيَ مِنَ الْمُؤْمِنِينَ (118)"));
        alshoaraas.add(new Alshoaraa("فَأَنْجَيْنَاهُ وَمَنْ مَعَهُ فِي الْفُلْكِ الْمَشْحُونِ (119)"));
        alshoaraas.add(new Alshoaraa("ثُمَّ أَغْرَقْنَا بَعْدُ الْبَاقِينَ (120)"));
        alshoaraas.add(new Alshoaraa("إِنَّ فِي ذَلِكَ لَآَيَةً وَمَا كَانَ أَكْثَرُهُمْ مُؤْمِنِينَ (121)"));
        alshoaraas.add(new Alshoaraa("وَإِنَّ رَبَّكَ لَهُوَ الْعَزِيزُ الرَّحِيمُ (122)"));
        alshoaraas.add(new Alshoaraa("كَذَّبَتْ عَادٌ الْمُرْسَلِينَ (123)"));
        alshoaraas.add(new Alshoaraa("إِذْ قَالَ لَهُمْ أَخُوهُمْ هُودٌ أَلَا تَتَّقُونَ (124)"));
        alshoaraas.add(new Alshoaraa("إِنِّي لَكُمْ رَسُولٌ أَمِينٌ (125)"));
        alshoaraas.add(new Alshoaraa("فَاتَّقُوا اللَّهَ وَأَطِيعُونِ (126)"));
        alshoaraas.add(new Alshoaraa("وَمَا أَسْأَلُكُمْ عَلَيْهِ مِنْ أَجْرٍ إِنْ أَجْرِيَ إِلَّا عَلَى رَبِّ الْعَالَمِينَ (127)"));
        alshoaraas.add(new Alshoaraa("أَتَبْنُونَ بِكُلِّ رِيعٍ آَيَةً تَعْبَثُونَ (128)"));
        alshoaraas.add(new Alshoaraa("وَتَتَّخِذُونَ مَصَانِعَ لَعَلَّكُمْ تَخْلُدُونَ (129)"));
        alshoaraas.add(new Alshoaraa("وَإِذَا بَطَشْتُمْ بَطَشْتُمْ جَبَّارِينَ (130)"));
        alshoaraas.add(new Alshoaraa("فَاتَّقُوا اللَّهَ وَأَطِيعُونِ (131)"));
        alshoaraas.add(new Alshoaraa("وَاتَّقُوا الَّذِي أَمَدَّكُمْ بِمَا تَعْلَمُونَ (132)"));
        alshoaraas.add(new Alshoaraa("أَمَدَّكُمْ بِأَنْعَامٍ وَبَنِينَ (133)"));
        alshoaraas.add(new Alshoaraa("وَجَنَّاتٍ وَعُيُونٍ (134)"));
        alshoaraas.add(new Alshoaraa("إِنِّي أَخَافُ عَلَيْكُمْ عَذَابَ يَوْمٍ عَظِيمٍ (135)"));
        alshoaraas.add(new Alshoaraa("قَالُوا سَوَاءٌ عَلَيْنَا أَوَعَظْتَ أَمْ لَمْ تَكُنْ مِنَ الْوَاعِظِينَ (136)"));
        alshoaraas.add(new Alshoaraa("إِنْ هَذَا إِلَّا خُلُقُ الْأَوَّلِينَ (137)"));
        alshoaraas.add(new Alshoaraa("وَمَا نَحْنُ بِمُعَذَّبِينَ (138)"));
        alshoaraas.add(new Alshoaraa("فَكَذَّبُوهُ فَأَهْلَكْنَاهُمْ إِنَّ فِي ذَلِكَ لَآَيَةً وَمَا كَانَ أَكْثَرُهُمْ مُؤْمِنِينَ (139)"));
        alshoaraas.add(new Alshoaraa("وَإِنَّ رَبَّكَ لَهُوَ الْعَزِيزُ الرَّحِيمُ (140)"));
        alshoaraas.add(new Alshoaraa("كَذَّبَتْ ثَمُودُ الْمُرْسَلِينَ (141)"));
        alshoaraas.add(new Alshoaraa("إِذْ قَالَ لَهُمْ أَخُوهُمْ صَالِحٌ أَلَا تَتَّقُونَ (142)"));
        alshoaraas.add(new Alshoaraa("إِنِّي لَكُمْ رَسُولٌ أَمِينٌ (143)"));
        alshoaraas.add(new Alshoaraa("فَاتَّقُوا اللَّهَ وَأَطِيعُونِ (144)"));
        alshoaraas.add(new Alshoaraa("وَمَا أَسْأَلُكُمْ عَلَيْهِ مِنْ أَجْرٍ إِنْ أَجْرِيَ إِلَّا عَلَى رَبِّ الْعَالَمِينَ (145)"));
        alshoaraas.add(new Alshoaraa("أَتُتْرَكُونَ فِي مَا هَاهُنَا آَمِنِينَ (146)"));
        alshoaraas.add(new Alshoaraa("فِي جَنَّاتٍ وَعُيُونٍ (147)"));
        alshoaraas.add(new Alshoaraa("وَزُرُوعٍ وَنَخْلٍ طَلْعُهَا هَضِيمٌ (148)"));
        alshoaraas.add(new Alshoaraa("وَتَنْحِتُونَ مِنَ الْجِبَالِ بُيُوتًا فَارِهِينَ (149)"));
        alshoaraas.add(new Alshoaraa("فَاتَّقُوا اللَّهَ وَأَطِيعُونِ (150)"));
        alshoaraas.add(new Alshoaraa("وَلَا تُطِيعُوا أَمْرَ الْمُسْرِفِينَ (151)"));
        alshoaraas.add(new Alshoaraa("الَّذِينَ يُفْسِدُونَ فِي الْأَرْضِ وَلَا يُصْلِحُونَ (152)"));
        alshoaraas.add(new Alshoaraa("قَالُوا إِنَّمَا أَنْتَ مِنَ الْمُسَحَّرِينَ (153)"));
        alshoaraas.add(new Alshoaraa("مَا أَنْتَ إِلَّا بَشَرٌ مِثْلُنَا فَأْتِ بِآَيَةٍ إِنْ كُنْتَ مِنَ الصَّادِقِينَ (154)"));
        alshoaraas.add(new Alshoaraa("قَالَ هَذِهِ نَاقَةٌ لَهَا شِرْبٌ وَلَكُمْ شِرْبُ يَوْمٍ مَعْلُومٍ (155)"));
        alshoaraas.add(new Alshoaraa("وَلَا تَمَسُّوهَا بِسُوءٍ فَيَأْخُذَكُمْ عَذَابُ يَوْمٍ عَظِيمٍ (156)"));
        alshoaraas.add(new Alshoaraa("فَعَقَرُوهَا فَأَصْبَحُوا نَادِمِينَ (157)"));
        alshoaraas.add(new Alshoaraa("فَأَخَذَهُمُ الْعَذَابُ إِنَّ فِي ذَلِكَ لَآَيَةً وَمَا كَانَ أَكْثَرُهُمْ مُؤْمِنِينَ (158)"));
        alshoaraas.add(new Alshoaraa("وَإِنَّ رَبَّكَ لَهُوَ الْعَزِيزُ الرَّحِيمُ (159)"));
        alshoaraas.add(new Alshoaraa("كَذَّبَتْ قَوْمُ لُوطٍ الْمُرْسَلِينَ (160)"));
        alshoaraas.add(new Alshoaraa("إِذْ قَالَ لَهُمْ أَخُوهُمْ لُوطٌ أَلَا تَتَّقُونَ (161)"));
        alshoaraas.add(new Alshoaraa("إِنِّي لَكُمْ رَسُولٌ أَمِينٌ (162)"));
        alshoaraas.add(new Alshoaraa("فَاتَّقُوا اللَّهَ وَأَطِيعُونِ (163)"));
        alshoaraas.add(new Alshoaraa("وَمَا أَسْأَلُكُمْ عَلَيْهِ مِنْ أَجْرٍ إِنْ أَجْرِيَ إِلَّا عَلَى رَبِّ الْعَالَمِينَ (164)"));
        alshoaraas.add(new Alshoaraa("أَتَأْتُونَ الذُّكْرَانَ مِنَ الْعَالَمِينَ (165)"));
        alshoaraas.add(new Alshoaraa("وَتَذَرُونَ مَا خَلَقَ لَكُمْ رَبُّكُمْ مِنْ أَزْوَاجِكُمْ بَلْ أَنْتُمْ قَوْمٌ عَادُونَ (166)"));
        alshoaraas.add(new Alshoaraa("قَالُوا لَئِنْ لَمْ تَنْتَهِ يَا لُوطُ لَتَكُونَنَّ مِنَ الْمُخْرَجِينَ (167)"));
        alshoaraas.add(new Alshoaraa("قَالَ إِنِّي لِعَمَلِكُمْ مِنَ الْقَالِينَ (168)"));
        alshoaraas.add(new Alshoaraa("رَبِّ نَجِّنِي وَأَهْلِي مِمَّا يَعْمَلُونَ (169)"));
        alshoaraas.add(new Alshoaraa("فَنَجَّيْنَاهُ وَأَهْلَهُ أَجْمَعِينَ (170)"));
        alshoaraas.add(new Alshoaraa("إِلَّا عَجُوزًا فِي الْغَابِرِينَ (171)"));
        alshoaraas.add(new Alshoaraa("ثُمَّ دَمَّرْنَا الْآَخَرِينَ (172)"));
        alshoaraas.add(new Alshoaraa("وَأَمْطَرْنَا عَلَيْهِمْ مَطَرًا فَسَاءَ مَطَرُ الْمُنْذَرِينَ (173)"));
        alshoaraas.add(new Alshoaraa("إِنَّ فِي ذَلِكَ لَآَيَةً وَمَا كَانَ أَكْثَرُهُمْ مُؤْمِنِينَ (174)"));
        alshoaraas.add(new Alshoaraa("وَإِنَّ رَبَّكَ لَهُوَ الْعَزِيزُ الرَّحِيمُ (175)"));
        alshoaraas.add(new Alshoaraa("كَذَّبَ أَصْحَابُ الْأَيْكَةِ الْمُرْسَلِينَ (176)"));
        alshoaraas.add(new Alshoaraa("إِذْ قَالَ لَهُمْ شُعَيْبٌ أَلَا تَتَّقُونَ (177)"));
        alshoaraas.add(new Alshoaraa("إِنِّي لَكُمْ رَسُولٌ أَمِينٌ (178)"));
        alshoaraas.add(new Alshoaraa("فَاتَّقُوا اللَّهَ وَأَطِيعُونِ (179)"));
        alshoaraas.add(new Alshoaraa("وَمَا أَسْأَلُكُمْ عَلَيْهِ مِنْ أَجْرٍ إِنْ أَجْرِيَ إِلَّا عَلَى رَبِّ الْعَالَمِينَ (180)"));
        alshoaraas.add(new Alshoaraa("أَوْفُوا الْكَيْلَ وَلَا تَكُونُوا مِنَ الْمُخْسِرِينَ (181)"));
        alshoaraas.add(new Alshoaraa("وَزِنُوا بِالْقِسْطَاسِ الْمُسْتَقِيمِ (182)"));
        alshoaraas.add(new Alshoaraa("وَلَا تَبْخَسُوا النَّاسَ أَشْيَاءَهُمْ وَلَا تَعْثَوْا فِي الْأَرْضِ مُفْسِدِينَ (183)"));
        alshoaraas.add(new Alshoaraa("وَاتَّقُوا الَّذِي خَلَقَكُمْ وَالْجِبِلَّةَ الْأَوَّلِينَ (184)"));
        alshoaraas.add(new Alshoaraa("قَالُوا إِنَّمَا أَنْتَ مِنَ الْمُسَحَّرِينَ (185)"));
        alshoaraas.add(new Alshoaraa("وَمَا أَنْتَ إِلَّا بَشَرٌ مِثْلُنَا وَإِنْ نَظُنُّكَ لَمِنَ الْكَاذِبِينَ (186)"));
        alshoaraas.add(new Alshoaraa("فَأَسْقِطْ عَلَيْنَا كِسَفًا مِنَ السَّمَاءِ إِنْ كُنْتَ مِنَ الصَّادِقِينَ (187)"));
        alshoaraas.add(new Alshoaraa("قَالَ رَبِّي أَعْلَمُ بِمَا تَعْمَلُونَ (188)"));
        alshoaraas.add(new Alshoaraa("فَكَذَّبُوهُ فَأَخَذَهُمْ عَذَابُ يَوْمِ الظُّلَّةِ إِنَّهُ كَانَ عَذَابَ يَوْمٍ عَظِيمٍ (189)"));
        alshoaraas.add(new Alshoaraa("إِنَّ فِي ذَلِكَ لَآَيَةً وَمَا كَانَ أَكْثَرُهُمْ مُؤْمِنِينَ (190)"));
        alshoaraas.add(new Alshoaraa("وَإِنَّ رَبَّكَ لَهُوَ الْعَزِيزُ الرَّحِيمُ (191)"));
        alshoaraas.add(new Alshoaraa("وَإِنَّهُ لَتَنْزِيلُ رَبِّ الْعَالَمِينَ (192)"));
        alshoaraas.add(new Alshoaraa("نَزَلَ بِهِ الرُّوحُ الْأَمِينُ (193)"));
        alshoaraas.add(new Alshoaraa("عَلَى قَلْبِكَ لِتَكُونَ مِنَ الْمُنْذِرِينَ (194)"));
        alshoaraas.add(new Alshoaraa("بِلِسَانٍ عَرَبِيٍّ مُبِينٍ (195)"));
        alshoaraas.add(new Alshoaraa("وَإِنَّهُ لَفِي زُبُرِ الْأَوَّلِينَ (196)"));
        alshoaraas.add(new Alshoaraa("أَوَلَمْ يَكُنْ لَهُمْ آَيَةً أَنْ يَعْلَمَهُ عُلَمَاءُ بَنِي إِسْرَائِيلَ (197)"));
        alshoaraas.add(new Alshoaraa("وَلَوْ نَزَّلْنَاهُ عَلَى بَعْضِ الْأَعْجَمِينَ (198)"));
        alshoaraas.add(new Alshoaraa("فَقَرَأَهُ عَلَيْهِمْ مَا كَانُوا بِهِ مُؤْمِنِينَ (199)"));
        alshoaraas.add(new Alshoaraa("كَذَلِكَ سَلَكْنَاهُ فِي قُلُوبِ الْمُجْرِمِينَ (200)"));
        alshoaraas.add(new Alshoaraa("لَا يُؤْمِنُونَ بِهِ حَتَّى يَرَوُا الْعَذَابَ الْأَلِيمَ (201)"));
        alshoaraas.add(new Alshoaraa("فَيَأْتِيَهُمْ بَغْتَةً وَهُمْ لَا يَشْعُرُونَ (202)"));
        alshoaraas.add(new Alshoaraa("فَيَقُولُوا هَلْ نَحْنُ مُنْظَرُونَ (203)"));
        alshoaraas.add(new Alshoaraa("أَفَبِعَذَابِنَا يَسْتَعْجِلُونَ (204)"));
        alshoaraas.add(new Alshoaraa("أَفَرَأَيْتَ إِنْ مَتَّعْنَاهُمْ سِنِينَ (205)"));
        alshoaraas.add(new Alshoaraa("ثُمَّ جَاءَهُمْ مَا كَانُوا يُوعَدُونَ (206)"));
        alshoaraas.add(new Alshoaraa("مَا أَغْنَى عَنْهُمْ مَا كَانُوا يُمَتَّعُونَ (207"));
        alshoaraas.add(new Alshoaraa("وَمَا أَهْلَكْنَا مِنْ قَرْيَةٍ إِلَّا لَهَا مُنْذِرُونَ (208)"));
        alshoaraas.add(new Alshoaraa("ذِكْرَى وَمَا كُنَّا ظَالِمِينَ (209)"));
        alshoaraas.add(new Alshoaraa("وَمَا تَنَزَّلَتْ بِهِ الشَّيَاطِينُ (210)"));
        alshoaraas.add(new Alshoaraa("وَمَا يَنْبَغِي لَهُمْ وَمَا يَسْتَطِيعُونَ (211)"));
        alshoaraas.add(new Alshoaraa("إِنَّهُمْ عَنِ السَّمْعِ لَمَعْزُولُونَ (212)"));
        alshoaraas.add(new Alshoaraa("فَلَا تَدْعُ مَعَ اللَّهِ إِلَهًا آَخَرَ فَتَكُونَ مِنَ الْمُعَذَّبِينَ (213)"));
        alshoaraas.add(new Alshoaraa("وَأَنْذِرْ عَشِيرَتَكَ الْأَقْرَبِينَ (214)"));
        alshoaraas.add(new Alshoaraa("وَاخْفِضْ جَنَاحَكَ لِمَنِ اتَّبَعَكَ مِنَ الْمُؤْمِنِينَ (215)"));
        alshoaraas.add(new Alshoaraa("فَإِنْ عَصَوْكَ فَقُلْ إِنِّي بَرِيءٌ مِمَّا تَعْمَلُونَ (216)"));
        alshoaraas.add(new Alshoaraa("وَتَوَكَّلْ عَلَى الْعَزِيزِ الرَّحِيمِ (217)"));
        alshoaraas.add(new Alshoaraa("الَّذِي يَرَاكَ حِينَ تَقُومُ (218)"));
        alshoaraas.add(new Alshoaraa("وَتَقَلُّبَكَ فِي السَّاجِدِينَ (219)"));
        alshoaraas.add(new Alshoaraa("إِنَّهُ هُوَ السَّمِيعُ الْعَلِيمُ (220)"));
        alshoaraas.add(new Alshoaraa("هَلْ أُنَبِّئُكُمْ عَلَى مَنْ تَنَزَّلُ الشَّيَاطِينُ (221)"));
        alshoaraas.add(new Alshoaraa("تَنَزَّلُ عَلَى كُلِّ أَفَّاكٍ أَثِيمٍ (222)"));
        alshoaraas.add(new Alshoaraa("يُلْقُونَ السَّمْعَ وَأَكْثَرُهُمْ كَاذِبُونَ (223)"));
        alshoaraas.add(new Alshoaraa("وَالشُّعَرَاءُ يَتَّبِعُهُمُ الْغَاوُونَ (224)"));
        alshoaraas.add(new Alshoaraa("أَلَمْ تَرَ أَنَّهُمْ فِي كُلِّ وَادٍ يَهِيمُونَ (225)"));
        alshoaraas.add(new Alshoaraa("وَأَنَّهُمْ يَقُولُونَ مَا لَا يَفْعَلُونَ (226)"));
        alshoaraas.add(new Alshoaraa("إِلَّا الَّذِينَ آَمَنُوا وَعَمِلُوا الصَّالِحَاتِ وَذَكَرُوا اللَّهَ كَثِيرًا وَانْتَصَرُوا مِنْ بَعْدِ مَا ظُلِمُوا وَسَيَعْلَمُ الَّذِينَ ظَلَمُوا أَيَّ مُنْقَلَبٍ يَنْقَلِبُونَ (227)"));

        quran_text_26_adapter = new quran_text_26_adapter(alshoaraas ,QuranText_26Activity.this);

        recyclerView = findViewById(R.id.rv_26);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_26Activity.this));
        recyclerView.setAdapter(quran_text_26_adapter);


    }

}