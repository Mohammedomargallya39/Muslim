package com.example.muslim;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_45Activity extends AppCompatActivity {

    ArrayList<Algatheya> algatheyas = new ArrayList<>();
    RecyclerView recyclerView;
    com.example.muslim.quran_text_45_adapter quran_text_45_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_45);

        algatheyas.add(new Algatheya("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        algatheyas.add(new Algatheya("حم (1)"));
        algatheyas.add(new Algatheya("تَنْزِيلُ الْكِتَابِ مِنَ اللَّهِ الْعَزِيزِ الْحَكِيمِ (2)"));
        algatheyas.add(new Algatheya("إِنَّ فِي السَّمَاوَاتِ وَالْأَرْضِ لَآَيَاتٍ لِلْمُؤْمِنِينَ (3)"));
        algatheyas.add(new Algatheya("وَفِي خَلْقِكُمْ وَمَا يَبُثُّ مِنْ دَابَّةٍ آَيَاتٌ لِقَوْمٍ يُوقِنُونَ (4)"));
        algatheyas.add(new Algatheya("وَاخْتِلَافِ اللَّيْلِ وَالنَّهَارِ وَمَا أَنْزَلَ اللَّهُ مِنَ السَّمَاءِ مِنْ رِزْقٍ فَأَحْيَا بِهِ الْأَرْضَ بَعْدَ مَوْتِهَا وَتَصْرِيفِ الرِّيَاحِ آَيَاتٌ لِقَوْمٍ يَعْقِلُونَ (5)"));
        algatheyas.add(new Algatheya("تِلْكَ آَيَاتُ اللَّهِ نَتْلُوهَا عَلَيْكَ بِالْحَقِّ فَبِأَيِّ حَدِيثٍ بَعْدَ اللَّهِ وَآَيَاتِهِ يُؤْمِنُونَ (6)"));
        algatheyas.add(new Algatheya("وَيْلٌ لِكُلِّ أَفَّاكٍ أَثِيمٍ (7)"));
        algatheyas.add(new Algatheya("يَسْمَعُ آَيَاتِ اللَّهِ تُتْلَى عَلَيْهِ ثُمَّ يُصِرُّ مُسْتَكْبِرًا كَأَنْ لَمْ يَسْمَعْهَا فَبَشِّرْهُ بِعَذَابٍ أَلِيمٍ (8)"));
        algatheyas.add(new Algatheya("وَإِذَا عَلِمَ مِنْ آَيَاتِنَا شَيْئًا اتَّخَذَهَا هُزُوًا أُولَئِكَ لَهُمْ عَذَابٌ مُهِينٌ (9)"));
        algatheyas.add(new Algatheya("مِنْ وَرَائِهِمْ جَهَنَّمُ وَلَا يُغْنِي عَنْهُمْ مَا كَسَبُوا شَيْئًا وَلَا مَا اتَّخَذُوا مِنْ دُونِ اللَّهِ أَوْلِيَاءَ وَلَهُمْ عَذَابٌ عَظِيمٌ (10)"));
        algatheyas.add(new Algatheya("هَذَا هُدًى وَالَّذِينَ كَفَرُوا بِآَيَاتِ رَبِّهِمْ لَهُمْ عَذَابٌ مِنْ رِجْزٍ أَلِيمٌ (11)"));
        algatheyas.add(new Algatheya("اللَّهُ الَّذِي سَخَّرَ لَكُمُ الْبَحْرَ لِتَجْرِيَ الْفُلْكُ فِيهِ بِأَمْرِهِ وَلِتَبْتَغُوا مِنْ فَضْلِهِ وَلَعَلَّكُمْ تَشْكُرُونَ (12)"));
        algatheyas.add(new Algatheya("وَسَخَّرَ لَكُمْ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ جَمِيعًا مِنْهُ إِنَّ فِي ذَلِكَ لَآَيَاتٍ لِقَوْمٍ يَتَفَكَّرُونَ (13)"));
        algatheyas.add(new Algatheya("قُلْ لِلَّذِينَ آَمَنُوا يَغْفِرُوا لِلَّذِينَ لَا يَرْجُونَ أَيَّامَ اللَّهِ لِيَجْزِيَ قَوْمًا بِمَا كَانُوا يَكْسِبُونَ (14)"));
        algatheyas.add(new Algatheya("مَنْ عَمِلَ صَالِحًا فَلِنَفْسِهِ وَمَنْ أَسَاءَ فَعَلَيْهَا ثُمَّ إِلَى رَبِّكُمْ تُرْجَعُونَ (15)"));
        algatheyas.add(new Algatheya("وَلَقَدْ آَتَيْنَا بَنِي إِسْرَائِيلَ الْكِتَابَ وَالْحُكْمَ وَالنُّبُوَّةَ وَرَزَقْنَاهُمْ مِنَ الطَّيِّبَاتِ وَفَضَّلْنَاهُمْ عَلَى الْعَالَمِينَ (16)"));
        algatheyas.add(new Algatheya("وَآَتَيْنَاهُمْ بَيِّنَاتٍ مِنَ الْأَمْرِ فَمَا اخْتَلَفُوا إِلَّا مِنْ بَعْدِ مَا جَاءَهُمُ الْعِلْمُ بَغْيًا بَيْنَهُمْ إِنَّ رَبَّكَ يَقْضِي بَيْنَهُمْ يَوْمَ الْقِيَامَةِ فِيمَا كَانُوا فِيهِ يَخْتَلِفُونَ (17)"));
        algatheyas.add(new Algatheya("ثُمَّ جَعَلْنَاكَ عَلَى شَرِيعَةٍ مِنَ الْأَمْرِ فَاتَّبِعْهَا وَلَا تَتَّبِعْ أَهْوَاءَ الَّذِينَ لَا يَعْلَمُونَ (18)"));
        algatheyas.add(new Algatheya("إِنَّهُمْ لَنْ يُغْنُوا عَنْكَ مِنَ اللَّهِ شَيْئًا وَإِنَّ الظَّالِمِينَ بَعْضُهُمْ أَوْلِيَاءُ بَعْضٍ وَاللَّهُ وَلِيُّ الْمُتَّقِينَ (19)"));
        algatheyas.add(new Algatheya("هَذَا بَصَائِرُ لِلنَّاسِ وَهُدًى وَرَحْمَةٌ لِقَوْمٍ يُوقِنُونَ (20)"));
        algatheyas.add(new Algatheya("أَمْ حَسِبَ الَّذِينَ اجْتَرَحُوا السَّيِّئَاتِ أَنْ نَجْعَلَهُمْ كَالَّذِينَ آَمَنُوا وَعَمِلُوا الصَّالِحَاتِ سَوَاءً مَحْيَاهُمْ وَمَمَاتُهُمْ سَاءَ مَا يَحْكُمُونَ (21)"));
        algatheyas.add(new Algatheya("وَخَلَقَ اللَّهُ السَّمَاوَاتِ وَالْأَرْضَ بِالْحَقِّ وَلِتُجْزَى كُلُّ نَفْسٍ بِمَا كَسَبَتْ وَهُمْ لَا يُظْلَمُونَ (22)"));
        algatheyas.add(new Algatheya("أَفَرَأَيْتَ مَنِ اتَّخَذَ إِلَهَهُ هَوَاهُ وَأَضَلَّهُ اللَّهُ عَلَى عِلْمٍ وَخَتَمَ عَلَى سَمْعِهِ وَقَلْبِهِ وَجَعَلَ عَلَى بَصَرِهِ غِشَاوَةً فَمَنْ يَهْدِيهِ مِنْ بَعْدِ اللَّهِ أَفَلَا تَذَكَّرُونَ (23)"));
        algatheyas.add(new Algatheya("وَقَالُوا مَا هِيَ إِلَّا حَيَاتُنَا الدُّنْيَا نَمُوتُ وَنَحْيَا وَمَا يُهْلِكُنَا إِلَّا الدَّهْرُ وَمَا لَهُمْ بِذَلِكَ مِنْ عِلْمٍ إِنْ هُمْ إِلَّا يَظُنُّونَ (24)"));
        algatheyas.add(new Algatheya("وَإِذَا تُتْلَى عَلَيْهِمْ آَيَاتُنَا بَيِّنَاتٍ مَا كَانَ حُجَّتَهُمْ إِلَّا أَنْ قَالُوا ائْتُوا بِآَبَائِنَا إِنْ كُنْتُمْ صَادِقِينَ (25)"));
        algatheyas.add(new Algatheya("قُلِ اللَّهُ يُحْيِيكُمْ ثُمَّ يُمِيتُكُمْ ثُمَّ يَجْمَعُكُمْ إِلَى يَوْمِ الْقِيَامَةِ لَا رَيْبَ فِيهِ وَلَكِنَّ أَكْثَرَ النَّاسِ لَا يَعْلَمُونَ (26)"));
        algatheyas.add(new Algatheya("وَلِلَّهِ مُلْكُ السَّمَاوَاتِ وَالْأَرْضِ وَيَوْمَ تَقُومُ السَّاعَةُ يَوْمَئِذٍ يَخْسَرُ الْمُبْطِلُونَ (27)"));
        algatheyas.add(new Algatheya("وَتَرَى كُلَّ أُمَّةٍ جَاثِيَةً كُلُّ أُمَّةٍ تُدْعَى إِلَى كِتَابِهَا الْيَوْمَ تُجْزَوْنَ مَا كُنْتُمْ تَعْمَلُونَ (28)"));
        algatheyas.add(new Algatheya("هَذَا كِتَابُنَا يَنْطِقُ عَلَيْكُمْ بِالْحَقِّ إِنَّا كُنَّا نَسْتَنْسِخُ مَا كُنْتُمْ تَعْمَلُونَ (29)"));
        algatheyas.add(new Algatheya("فَأَمَّا الَّذِينَ آَمَنُوا وَعَمِلُوا الصَّالِحَاتِ فَيُدْخِلُهُمْ رَبُّهُمْ فِي رَحْمَتِهِ ذَلِكَ هُوَ الْفَوْزُ الْمُبِينُ (30)"));
        algatheyas.add(new Algatheya("وَأَمَّا الَّذِينَ كَفَرُوا أَفَلَمْ تَكُنْ آَيَاتِي تُتْلَى عَلَيْكُمْ فَاسْتَكْبَرْتُمْ وَكُنْتُمْ قَوْمًا مُجْرِمِينَ (31)"));
        algatheyas.add(new Algatheya("وَإِذَا قِيلَ إِنَّ وَعْدَ اللَّهِ حَقٌّ وَالسَّاعَةُ لَا رَيْبَ فِيهَا قُلْتُمْ مَا نَدْرِي مَا السَّاعَةُ إِنْ نَظُنُّ إِلَّا ظَنًّا وَمَا نَحْنُ بِمُسْتَيْقِنِينَ (32)"));
        algatheyas.add(new Algatheya("وَبَدَا لَهُمْ سَيِّئَاتُ مَا عَمِلُوا وَحَاقَ بِهِمْ مَا كَانُوا بِهِ يَسْتَهْزِئُونَ (33)"));
        algatheyas.add(new Algatheya("وَقِيلَ الْيَوْمَ نَنْسَاكُمْ كَمَا نَسِيتُمْ لِقَاءَ يَوْمِكُمْ هَذَا وَمَأْوَاكُمُ النَّارُ وَمَا لَكُمْ مِنْ نَاصِرِينَ (34)"));
        algatheyas.add(new Algatheya("ذَلِكُمْ بِأَنَّكُمُ اتَّخَذْتُمْ آَيَاتِ اللَّهِ هُزُوًا وَغَرَّتْكُمُ الْحَيَاةُ الدُّنْيَا فَالْيَوْمَ لَا يُخْرَجُونَ مِنْهَا وَلَا هُمْ يُسْتَعْتَبُونَ (35)"));
        algatheyas.add(new Algatheya("فَلِلَّهِ الْحَمْدُ رَبِّ السَّمَاوَاتِ وَرَبِّ الْأَرْضِ رَبِّ الْعَالَمِينَ (36)"));
        algatheyas.add(new Algatheya("وَلَهُ الْكِبْرِيَاءُ فِي السَّمَاوَاتِ وَالْأَرْضِ وَهُوَ الْعَزِيزُ الْحَكِيمُ (37)"));


        quran_text_45_adapter = new quran_text_45_adapter(algatheyas, com.example.muslim.QuranText_45Activity.this);

        recyclerView = findViewById(R.id.rv_45);
        recyclerView.setLayoutManager(new LinearLayoutManager(com.example.muslim.QuranText_45Activity.this));
        recyclerView.setAdapter(quran_text_45_adapter);


    }

}