package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_31Activity extends AppCompatActivity {

    ArrayList<Loqman> loqmans = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_31_adapter quran_text_31_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_31);

        loqmans.add(new Loqman("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        loqmans.add(new Loqman("الم (1)"));
        loqmans.add(new Loqman("تِلْكَ آَيَاتُ الْكِتَابِ الْحَكِيمِ (2)"));
        loqmans.add(new Loqman("هُدًى وَرَحْمَةً لِلْمُحْسِنِينَ (3)"));
        loqmans.add(new Loqman("الَّذِينَ يُقِيمُونَ الصَّلَاةَ وَيُؤْتُونَ الزَّكَاةَ وَهُمْ بِالْآَخِرَةِ هُمْ يُوقِنُونَ (4)"));
        loqmans.add(new Loqman("أُولَئِكَ عَلَى هُدًى مِنْ رَبِّهِمْ وَأُولَئِكَ هُمُ الْمُفْلِحُونَ (5)"));
        loqmans.add(new Loqman("وَمِنَ النَّاسِ مَنْ يَشْتَرِي لَهْوَ الْحَدِيثِ لِيُضِلَّ عَنْ سَبِيلِ اللَّهِ بِغَيْرِ عِلْمٍ وَيَتَّخِذَهَا هُزُوًا أُولَئِكَ لَهُمْ عَذَابٌ مُهِينٌ (6)"));
        loqmans.add(new Loqman("وَإِذَا تُتْلَى عَلَيْهِ آَيَاتُنَا وَلَّى مُسْتَكْبِرًا كَأَنْ لَمْ يَسْمَعْهَا كَأَنَّ فِي أُذُنَيْهِ وَقْرًا فَبَشِّرْهُ بِعَذَابٍ أَلِيمٍ (7)"));
        loqmans.add(new Loqman("إِنَّ الَّذِينَ آَمَنُوا وَعَمِلُوا الصَّالِحَاتِ لَهُمْ جَنَّاتُ النَّعِيمِ (8)"));
        loqmans.add(new Loqman("خَالِدِينَ فِيهَا وَعْدَ اللَّهِ حَقًّا وَهُوَ الْعَزِيزُ الْحَكِيمُ (9)"));
        loqmans.add(new Loqman("خَلَقَ السَّمَاوَاتِ بِغَيْرِ عَمَدٍ تَرَوْنَهَا وَأَلْقَى فِي الْأَرْضِ رَوَاسِيَ أَنْ تَمِيدَ بِكُمْ وَبَثَّ فِيهَا مِنْ كُلِّ دَابَّةٍ وَأَنْزَلْنَا مِنَ السَّمَاءِ مَاءً فَأَنْبَتْنَا فِيهَا مِنْ كُلِّ زَوْجٍ كَرِيمٍ (10)"));
        loqmans.add(new Loqman("هَذَا خَلْقُ اللَّهِ فَأَرُونِي مَاذَا خَلَقَ الَّذِينَ مِنْ دُونِهِ بَلِ الظَّالِمُونَ فِي ضَلَالٍ مُبِينٍ (11)"));
        loqmans.add(new Loqman("وَلَقَدْ آَتَيْنَا لُقْمَانَ الْحِكْمَةَ أَنِ اشْكُرْ لِلَّهِ وَمَنْ يَشْكُرْ فَإِنَّمَا يَشْكُرُ لِنَفْسِهِ وَمَنْ كَفَرَ فَإِنَّ اللَّهَ غَنِيٌّ حَمِيدٌ (12)"));
        loqmans.add(new Loqman("وَإِذْ قَالَ لُقْمَانُ لِابْنِهِ وَهُوَ يَعِظُهُ يَا بُنَيَّ لَا تُشْرِكْ بِاللَّهِ إِنَّ الشِّرْكَ لَظُلْمٌ عَظِيمٌ (13)"));
        loqmans.add(new Loqman("وَوَصَّيْنَا الْإِنْسَانَ بِوَالِدَيْهِ حَمَلَتْهُ أُمُّهُ وَهْنًا عَلَى وَهْنٍ وَفِصَالُهُ فِي عَامَيْنِ أَنِ اشْكُرْ لِي وَلِوَالِدَيْكَ إِلَيَّ الْمَصِيرُ (14)"));
        loqmans.add(new Loqman("وَإِنْ جَاهَدَاكَ عَلى أَنْ تُشْرِكَ بِي مَا لَيْسَ لَكَ بِهِ عِلْمٌ فَلَا تُطِعْهُمَا وَصَاحِبْهُمَا فِي الدُّنْيَا مَعْرُوفًا وَاتَّبِعْ سَبِيلَ مَنْ أَنَابَ إِلَيَّ ثُمَّ إِلَيَّ مَرْجِعُكُمْ فَأُنَبِّئُكُمْ بِمَا كُنْتُمْ تَعْمَلُونَ (15)"));
        loqmans.add(new Loqman("يَا بُنَيَّ إِنَّهَا إِنْ تَكُ مِثْقَالَ حَبَّةٍ مِنْ خَرْدَلٍ فَتَكُنْ فِي صَخْرَةٍ أَوْ فِي السَّمَاوَاتِ أَوْ فِي الْأَرْضِ يَأْتِ بِهَا اللَّهُ إِنَّ اللَّهَ لَطِيفٌ خَبِيرٌ (16)"));
        loqmans.add(new Loqman("يَا بُنَيَّ أَقِمِ الصَّلَاةَ وَأْمُرْ بِالْمَعْرُوفِ وَانْهَ عَنِ الْمُنْكَرِ وَاصْبِرْ عَلَى مَا أَصَابَكَ إِنَّ ذَلِكَ مِنْ عَزْمِ الْأُمُورِ (17)"));
        loqmans.add(new Loqman("وَلَا تُصَعِّرْ خَدَّكَ لِلنَّاسِ وَلَا تَمْشِ فِي الْأَرْضِ مَرَحًا إِنَّ اللَّهَ لَا يُحِبُّ كُلَّ مُخْتَالٍ فَخُورٍ (18)"));
        loqmans.add(new Loqman("وَاقْصِدْ فِي مَشْيِكَ وَاغْضُضْ مِنْ صَوْتِكَ إِنَّ أَنْكَرَ الْأَصْوَاتِ لَصَوْتُ الْحَمِيرِ (19)"));
        loqmans.add(new Loqman("أَلَمْ تَرَوْا أَنَّ اللَّهَ سَخَّرَ لَكُمْ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ وَأَسْبَغَ عَلَيْكُمْ نِعَمَهُ ظَاهِرَةً وَبَاطِنَةً وَمِنَ النَّاسِ مَنْ يُجَادِلُ فِي اللَّهِ بِغَيْرِ عِلْمٍ وَلَا هُدًى وَلَا كِتَابٍ مُنِيرٍ (20)"));
        loqmans.add(new Loqman("وَإِذَا قِيلَ لَهُمُ اتَّبِعُوا مَا أَنْزَلَ اللَّهُ قَالُوا بَلْ نَتَّبِعُ مَا وَجَدْنَا عَلَيْهِ آَبَاءَنَا أَوَلَوْ كَانَ الشَّيْطَانُ يَدْعُوهُمْ إِلَى عَذَابِ السَّعِيرِ (21)"));
        loqmans.add(new Loqman("وَمَنْ يُسْلِمْ وَجْهَهُ إِلَى اللَّهِ وَهُوَ مُحْسِنٌ فَقَدِ اسْتَمْسَكَ بِالْعُرْوَةِ الْوُثْقَى وَإِلَى اللَّهِ عَاقِبَةُ الْأُمُورِ (22)"));
        loqmans.add(new Loqman("وَمَنْ كَفَرَ فَلَا يَحْزُنْكَ كُفْرُهُ إِلَيْنَا مَرْجِعُهُمْ فَنُنَبِّئُهُمْ بِمَا عَمِلُوا إِنَّ اللَّهَ عَلِيمٌ بِذَاتِ الصُّدُورِ (23)"));
        loqmans.add(new Loqman("نُمَتِّعُهُمْ قَلِيلًا ثُمَّ نَضْطَرُّهُمْ إِلَى عَذَابٍ غَلِيظٍ (24)"));
        loqmans.add(new Loqman("وَلَئِنْ سَأَلْتَهُمْ مَنْ خَلَقَ السَّمَاوَاتِ وَالْأَرْضَ لَيَقُولُنَّ اللَّهُ قُلِ الْحَمْدُ لِلَّهِ بَلْ أَكْثَرُهُمْ لَا يَعْلَمُونَ (25)"));
        loqmans.add(new Loqman("لِلَّهِ مَا فِي السَّمَاوَاتِ وَالْأَرْضِ إِنَّ اللَّهَ هُوَ الْغَنِيُّ الْحَمِيدُ (26)"));
        loqmans.add(new Loqman("وَلَوْ أَنَّمَا فِي الْأَرْضِ مِنْ شَجَرَةٍ أَقْلَامٌ وَالْبَحْرُ يَمُدُّهُ مِنْ بَعْدِهِ سَبْعَةُ أَبْحُرٍ مَا نَفِدَتْ كَلِمَاتُ اللَّهِ إِنَّ اللَّهَ عَزِيزٌ حَكِيمٌ (27)"));
        loqmans.add(new Loqman("مَا خَلْقُكُمْ وَلَا بَعْثُكُمْ إِلَّا كَنَفْسٍ وَاحِدَةٍ إِنَّ اللَّهَ سَمِيعٌ بَصِيرٌ (28)"));
        loqmans.add(new Loqman("أَلَمْ تَرَ أَنَّ اللَّهَ يُولِجُ اللَّيْلَ فِي النَّهَارِ وَيُولِجُ النَّهَارَ فِي اللَّيْلِ وَسَخَّرَ الشَّمْسَ وَالْقَمَرَ كُلٌّ يَجْرِي إِلَى أَجَلٍ مُسَمًّى وَأَنَّ اللَّهَ بِمَا تَعْمَلُونَ خَبِيرٌ (29)"));
        loqmans.add(new Loqman("ذَلِكَ بِأَنَّ اللَّهَ هُوَ الْحَقُّ وَأَنَّ مَا يَدْعُونَ مِنْ دُونِهِ الْبَاطِلُ وَأَنَّ اللَّهَ هُوَ الْعَلِيُّ الْكَبِيرُ (30)"));
        loqmans.add(new Loqman("أَلَمْ تَرَ أَنَّ الْفُلْكَ تَجْرِي فِي الْبَحْرِ بِنِعْمَةِ اللَّهِ لِيُرِيَكُمْ مِنْ آَيَاتِهِ إِنَّ فِي ذَلِكَ لَآَيَاتٍ لِكُلِّ صَبَّارٍ شَكُورٍ (31)"));
        loqmans.add(new Loqman("وَإِذَا غَشِيَهُمْ مَوْجٌ كَالظُّلَلِ دَعَوُا اللَّهَ مُخْلِصِينَ لَهُ الدِّينَ فَلَمَّا نَجَّاهُمْ إِلَى الْبَرِّ فَمِنْهُمْ مُقْتَصِدٌ وَمَا يَجْحَدُ بِآَيَاتِنَا إِلَّا كُلُّ خَتَّارٍ كَفُورٍ (32)"));
        loqmans.add(new Loqman("يَا أَيُّهَا النَّاسُ اتَّقُوا رَبَّكُمْ وَاخْشَوْا يَوْمًا لَا يَجْزِي وَالِدٌ عَنْ وَلَدِهِ وَلَا مَوْلُودٌ هُوَ جَازٍ عَنْ وَالِدِهِ شَيْئًا إِنَّ وَعْدَ اللَّهِ حَقٌّ فَلَا تَغُرَّنَّكُمُ الْحَيَاةُ الدُّنْيَا وَلَا يَغُرَّنَّكُمْ بِاللَّهِ الْغَرُورُ (33)"));
        loqmans.add(new Loqman("إِنَّ اللَّهَ عِنْدَهُ عِلْمُ السَّاعَةِ وَيُنَزِّلُ الْغَيْثَ وَيَعْلَمُ مَا فِي الْأَرْحَامِ وَمَا تَدْرِي نَفْسٌ مَاذَا تَكْسِبُ غَدًا وَمَا تَدْرِي نَفْسٌ بِأَيِّ أَرْضٍ تَمُوتُ إِنَّ اللَّهَ عَلِيمٌ خَبِيرٌ (34)"));


        quran_text_31_adapter = new quran_text_31_adapter(loqmans ,QuranText_31Activity.this);

        recyclerView = findViewById(R.id.rv_31);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_31Activity.this));
        recyclerView.setAdapter(quran_text_31_adapter);


    }

}