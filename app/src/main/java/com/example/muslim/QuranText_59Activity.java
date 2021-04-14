package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_59Activity extends AppCompatActivity {

    ArrayList<Alhashr> alhashrs = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_59_adapter quran_text_59_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_59);

        alhashrs.add(new Alhashr("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alhashrs.add(new Alhashr("سَبَّحَ لِلَّهِ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ وَهُوَ الْعَزِيزُ الْحَكِيمُ (1)"));
        alhashrs.add(new Alhashr("هُوَ الَّذِي أَخْرَجَ الَّذِينَ كَفَرُوا مِنْ أَهْلِ الْكِتَابِ مِنْ دِيَارِهِمْ لِأَوَّلِ الْحَشْرِ مَا ظَنَنْتُمْ أَنْ يَخْرُجُوا وَظَنُّوا أَنَّهُمْ مَانِعَتُهُمْ حُصُونُهُمْ مِنَ اللَّهِ فَأَتَاهُمُ اللَّهُ مِنْ حَيْثُ لَمْ يَحْتَسِبُوا وَقَذَفَ فِي قُلُوبِهِمُ الرُّعْبَ يُخْرِبُونَ بُيُوتَهُمْ بِأَيْدِيهِمْ وَأَيْدِي الْمُؤْمِنِينَ فَاعْتَبِرُوا يَا أُولِي الْأَبْصَارِ (2)"));
        alhashrs.add(new Alhashr("وَلَوْلَا أَنْ كَتَبَ اللَّهُ عَلَيْهِمُ الْجَلَاءَ لَعَذَّبَهُمْ فِي الدُّنْيَا وَلَهُمْ فِي الْآَخِرَةِ عَذَابُ النَّارِ (3)"));
        alhashrs.add(new Alhashr("ذَلِكَ بِأَنَّهُمْ شَاقُّوا اللَّهَ وَرَسُولَهُ وَمَنْ يُشَاقِّ اللَّهَ فَإِنَّ اللَّهَ شَدِيدُ الْعِقَابِ (4)"));
        alhashrs.add(new Alhashr("مَا قَطَعْتُمْ مِنْ لِينَةٍ أَوْ تَرَكْتُمُوهَا قَائِمَةً عَلَى أُصُولِهَا فَبِإِذْنِ اللَّهِ وَلِيُخْزِيَ الْفَاسِقِينَ (5)"));
        alhashrs.add(new Alhashr("وَمَا أَفَاءَ اللَّهُ عَلَى رَسُولِهِ مِنْهُمْ فَمَا أَوْجَفْتُمْ عَلَيْهِ مِنْ خَيْلٍ وَلَا رِكَابٍ وَلَكِنَّ اللَّهَ يُسَلِّطُ رُسُلَهُ عَلَى مَنْ يَشَاءُ وَاللَّهُ عَلَى كُلِّ شَيْءٍ قَدِيرٌ (6)"));
        alhashrs.add(new Alhashr("مَا أَفَاءَ اللَّهُ عَلَى رَسُولِهِ مِنْ أَهْلِ الْقُرَى فَلِلَّهِ وَلِلرَّسُولِ وَلِذِي الْقُرْبَى وَالْيَتَامَى وَالْمَسَاكِينِ وَابْنِ السَّبِيلِ كَيْ لَا يَكُونَ دُولَةً بَيْنَ الْأَغْنِيَاءِ مِنْكُمْ وَمَا آَتَاكُمُ الرَّسُولُ فَخُذُوهُ وَمَا نَهَاكُمْ عَنْهُ فَانْتَهُوا وَاتَّقُوا اللَّهَ إِنَّ اللَّهَ شَدِيدُ الْعِقَابِ (7)"));
        alhashrs.add(new Alhashr("لِلْفُقَرَاءِ الْمُهَاجِرِينَ الَّذِينَ أُخْرِجُوا مِنْ دِيارِهِمْ وَأَمْوَالِهِمْ يَبْتَغُونَ فَضْلًا مِنَ اللَّهِ وَرِضْوَانًا وَيَنْصُرُونَ اللَّهَ وَرَسُولَهُ أُولَئِكَ هُمُ الصَّادِقُونَ (8)"));
        alhashrs.add(new Alhashr("وَالَّذِينَ تَبَوَّءُوا الدَّارَ وَالْإِيمَانَ مِنْ قَبْلِهِمْ يُحِبُّونَ مَنْ هَاجَرَ إِلَيْهِمْ وَلَا يَجِدُونَ فِي صُدُورِهِمْ حَاجَةً مِمَّا أُوتُوا وَيُؤْثِرُونَ عَلَى أَنْفُسِهِمْ وَلَوْ كَانَ بِهِمْ خَصَاصَةٌ وَمَنْ يُوقَ شُحَّ نَفْسِهِ فَأُولَئِكَ هُمُ الْمُفْلِحُونَ (9)"));
        alhashrs.add(new Alhashr("وَالَّذِينَ جَاءُوا مِنْ بَعْدِهِمْ يَقُولُونَ رَبَّنَا اغْفِرْ لَنَا وَلِإِخْوَانِنَا الَّذِينَ سَبَقُونَا بِالْإِيمَانِ وَلَا تَجْعَلْ فِي قُلُوبِنَا غِلًّا لِلَّذِينَ آَمَنُوا رَبَّنَا إِنَّكَ رَءُوفٌ رَحِيمٌ (10)"));
        alhashrs.add(new Alhashr("أَلَمْ تَر إِلَى الَّذِينَ نَافَقُوا يَقُولُونَ لِإِخْوَانِهِمُ الَّذِينَ كَفَرُوا مِنْ أَهْلِ الْكِتَابِ لَئِنْ أُخْرِجْتُمْ لَنَخْرُجَنَّ مَعَكُمْ وَلَا نُطِيعُ فِيكُمْ أَحَدًا أَبَدًا وَإِنْ قُوتِلْتُمْ لَنَنْصُرَنَّكُمْ وَاللَّهُ يَشْهَدُ إِنَّهُمْ لَكَاذِبُونَ (11)"));
        alhashrs.add(new Alhashr("لَئِنْ أُخْرِجُوا لَا يَخْرُجُونَ مَعَهُمْ وَلَئِنْ قُوتِلُوا لَا يَنْصُرُونَهُمْ وَلَئِنْ نَصَرُوهُمْ لَيُوَلُّنَّ الْأَدْبَارَ ثُمَّ لَا يُنْصَرُونَ (12)"));
        alhashrs.add(new Alhashr("لَأَنْتُمْ أَشَدُّ رَهْبَةً فِي صُدُورِهِمْ مِنَ اللَّهِ ذَلِكَ بِأَنَّهُمْ قَوْمٌ لَا يَفْقَهُونَ (13)"));
        alhashrs.add(new Alhashr("لَا يُقَاتِلُونَكُمْ جَمِيعًا إِلَّا فِي قُرًى مُحَصَّنَةٍ أَوْ مِنْ وَرَاءِ جُدُرٍ بَأْسُهُمْ بَيْنَهُمْ شَدِيدٌ تَحْسَبُهُمْ جَمِيعًا وَقُلُوبُهُمْ شَتَّى ذَلِكَ بِأَنَّهُمْ قَوْمٌ لَا يَعْقِلُونَ (14)"));
        alhashrs.add(new Alhashr("كَمَثَلِ الَّذِينَ مِنْ قَبْلِهِمْ قَرِيبًا ذَاقُوا وَبَالَ أَمْرِهِمْ وَلَهُمْ عَذَابٌ أَلِيمٌ (15)"));
        alhashrs.add(new Alhashr("كَمَثَلِ الشَّيْطَانِ إِذْ قَالَ لِلْإِنْسَانِ اكْفُرْ فَلَمَّا كَفَرَ قَالَ إِنِّي بَرِيءٌ مِنْكَ إِنِّي أَخَافُ اللَّهَ رَبَّ الْعَالَمِينَ (16)"));
        alhashrs.add(new Alhashr("فَكَانَ عَاقِبَتَهُمَا أَنَّهُمَا فِي النَّارِ خَالِدَيْنِ فِيهَا وَذَلِكَ جَزَاءُ الظَّالِمِينَ (17)"));
        alhashrs.add(new Alhashr("يَا أَيُّهَا الَّذِينَ آَمَنُوا اتَّقُوا اللَّهَ وَلْتَنْظُرْ نَفْسٌ مَا قَدَّمَتْ لِغَدٍ وَاتَّقُوا اللَّهَ إِنَّ اللَّهَ خَبِيرٌ بِمَا تَعْمَلُونَ (18)"));
        alhashrs.add(new Alhashr("وَلَا تَكُونُوا كَالَّذِينَ نَسُوا اللَّهَ فَأَنْسَاهُمْ أَنْفُسَهُمْ أُولَئِكَ هُمُ الْفَاسِقُونَ (19)"));
        alhashrs.add(new Alhashr("لَا يَسْتَوِي أَصْحَابُ النَّارِ وَأَصْحَابُ الْجَنَّةِ أَصْحَابُ الْجَنَّةِ هُمُ الْفَائِزُونَ (20)"));
        alhashrs.add(new Alhashr("لَوْ أَنْزَلْنَا هَذَا الْقُرْآَنَ عَلَى جَبَلٍ لَرَأَيْتَهُ خَاشِعًا مُتَصَدِّعًا مِنْ خَشْيَةِ اللَّهِ وَتِلْكَ الْأَمْثَالُ نَضْرِبُهَا لِلنَّاسِ لَعَلَّهُمْ يَتَفَكَّرُونَ (21)"));
        alhashrs.add(new Alhashr("هُوَ اللَّهُ الَّذِي لَا إِلَهَ إِلَّا هُوَ عَالِمُ الْغَيْبِ وَالشَّهَادَةِ هُوَ الرَّحْمَنُ الرَّحِيمُ (22)"));
        alhashrs.add(new Alhashr("هُوَ اللَّهُ الَّذِي لَا إِلَهَ إِلَّا هُوَ الْمَلِكُ الْقُدُّوسُ السَّلَامُ الْمُؤْمِنُ الْمُهَيْمِنُ الْعَزِيزُ الْجَبَّارُ الْمُتَكَبِّرُ سُبْحَانَ اللَّهِ عَمَّا يُشْرِكُونَ (23)"));
        alhashrs.add(new Alhashr("هُوَ اللَّهُ الْخَالِقُ الْبَارِئُ الْمُصَوِّرُ لَهُ الْأَسْمَاءُ الْحُسْنَى يُسَبِّحُ لَهُ مَا فِي السَّمَاوَاتِ وَالْأَرْضِ وَهُوَ الْعَزِيزُ الْحَكِيمُ (24)"));



        quran_text_59_adapter = new quran_text_59_adapter(alhashrs ,QuranText_59Activity.this);

        recyclerView = findViewById(R.id.rv_59);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_59Activity.this));
        recyclerView.setAdapter(quran_text_59_adapter);


    }

}