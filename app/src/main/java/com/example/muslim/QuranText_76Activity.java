package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_76Activity extends AppCompatActivity {

    ArrayList<Alensan> alensans = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_76_adapter quran_text_76_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_76);

        alensans.add(new Alensan("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alensans.add(new Alensan("هَلْ أَتَى عَلَى الْإِنْسَانِ حِينٌ مِنَ الدَّهْرِ لَمْ يَكُنْ شَيْئًا مَذْكُورًا (1)"));
        alensans.add(new Alensan("إِنَّا خَلَقْنَا الْإِنْسَانَ مِنْ نُطْفَةٍ أَمْشَاجٍ نَبْتَلِيهِ فَجَعَلْنَاهُ سَمِيعًا بَصِيرًا (2)"));
        alensans.add(new Alensan("إِنَّا هَدَيْنَاهُ السَّبِيلَ إِمَّا شَاكِرًا وَإِمَّا كَفُورًا (3)"));
        alensans.add(new Alensan("إِنَّا أَعْتَدْنَا لِلْكَافِرِينَ سَلَاسِلَ وَأَغْلَالًا وَسَعِيرًا (4)"));
        alensans.add(new Alensan("إِنَّ الْأَبْرَارَ يَشْرَبُونَ مِنْ كَأْسٍ كَانَ مِزَاجُهَا كَافُورًا (5)"));
        alensans.add(new Alensan("عَيْنًا يَشْرَبُ بِهَا عِبَادُ اللَّهِ يُفَجِّرُونَهَا تَفْجِيرًا (6)"));
        alensans.add(new Alensan("يُوفُونَ بِالنَّذْرِ وَيَخَافُونَ يَوْمًا كَانَ شَرُّهُ مُسْتَطِيرًا (7)"));
        alensans.add(new Alensan("وَيُطْعِمُونَ الطَّعَامَ عَلَى حُبِّهِ مِسْكِينًا وَيَتِيمًا وَأَسِيرًا (8)"));
        alensans.add(new Alensan("إِنَّمَا نُطْعِمُكُمْ لِوَجْهِ اللَّهِ لَا نُرِيدُ مِنْكُمْ جَزَاءً وَلَا شُكُورًا (9)"));
        alensans.add(new Alensan("إِنَّا نَخَافُ مِنْ رَبِّنَا يَوْمًا عَبُوسًا قَمْطَرِيرًا (10)"));
        alensans.add(new Alensan("فَوَقَاهُمُ اللَّهُ شَرَّ ذَلِكَ الْيَوْمِ وَلَقَّاهُمْ نَضْرَةً وَسُرُورًا (11)"));
        alensans.add(new Alensan("وَجَزَاهُمْ بِمَا صَبَرُوا جَنَّةً وَحَرِيرًا (12)"));
        alensans.add(new Alensan("مُتَّكِئِينَ فِيهَا عَلَى الْأَرَائِكِ لَا يَرَوْنَ فِيهَا شَمْسًا وَلَا زَمْهَرِيرًا (13)"));
        alensans.add(new Alensan("وَدَانِيَةً عَلَيْهِمْ ظِلَالُهَا وَذُلِّلَتْ قُطُوفُهَا تَذْلِيلًا (14)"));
        alensans.add(new Alensan("وَيُطَافُ عَلَيْهِمْ بِآَنِيَةٍ مِنْ فِضَّةٍ وَأَكْوَابٍ كَانَتْ قَوَارِيرَ (15)"));
        alensans.add(new Alensan("قَوَارِيرَ مِنْ فِضَّةٍ قَدَّرُوهَا تَقْدِيرًا (16)"));
        alensans.add(new Alensan("وَيُسْقَوْنَ فِيهَا كَأْسًا كَانَ مِزَاجُهَا زَنْجَبِيلًا (17)"));
        alensans.add(new Alensan("عَيْنًا فِيهَا تُسَمَّى سَلْسَبِيلًا (18)"));
        alensans.add(new Alensan("وَيَطُوفُ عَلَيْهِمْ وِلْدَانٌ مُخَلَّدُونَ إِذَا رَأَيْتَهُمْ حَسِبْتَهُمْ لُؤْلُؤًا مَنْثُورًا (19)"));
        alensans.add(new Alensan("وَإِذَا رَأَيْتَ ثَمَّ رَأَيْتَ نَعِيمًا وَمُلْكًا كَبِيرًا (20)"));
        alensans.add(new Alensan("عَالِيَهُمْ ثِيَابُ سُنْدُسٍ خُضْرٌ وَإِسْتَبْرَقٌ وَحُلُّوا أَسَاوِرَ مِنْ فِضَّةٍ وَسَقَاهُمْ رَبُّهُمْ شَرَابًا طَهُورًا (21)"));
        alensans.add(new Alensan("إِنَّ هَذَا كَانَ لَكُمْ جَزَاءً وَكَانَ سَعْيُكُمْ مَشْكُورًا (22)"));
        alensans.add(new Alensan("إِنَّا نَحْنُ نَزَّلْنَا عَلَيْكَ الْقُرْآَنَ تَنْزِيلًا (23)"));
        alensans.add(new Alensan("فَاصْبِرْ لِحُكْمِ رَبِّكَ وَلَا تُطِعْ مِنْهُمْ آَثِمًا أَوْ كَفُورًا (24)"));
        alensans.add(new Alensan("وَاذْكُرِ اسْمَ رَبِّكَ بُكْرَةً وَأَصِيلًا (25)"));
        alensans.add(new Alensan("وَمِنَ اللَّيْلِ فَاسْجُدْ لَهُ وَسَبِّحْهُ لَيْلًا طَوِيلًا (26)"));
        alensans.add(new Alensan("إِنَّ هَؤُلَاءِ يُحِبُّونَ الْعَاجِلَةَ وَيَذَرُونَ وَرَاءَهُمْ يَوْمًا ثَقِيلًا (27)"));
        alensans.add(new Alensan("نَحْنُ خَلَقْنَاهُمْ وَشَدَدْنَا أَسْرَهُمْ وَإِذَا شِئْنَا بَدَّلْنَا أَمْثَالَهُمْ تَبْدِيلًا (28)"));
        alensans.add(new Alensan("إِنَّ هَذِهِ تَذْكِرَةٌ فَمَنْ شَاءَ اتَّخَذَ إِلَى رَبِّهِ سَبِيلًا (29)"));
        alensans.add(new Alensan("وَمَا تَشَاءُونَ إِلَّا أَنْ يَشَاءَ اللَّهُ إِنَّ اللَّهَ كَانَ عَلِيمًا حَكِيمًا (30)"));
        alensans.add(new Alensan("يُدْخِلُ مَنْ يَشَاءُ فِي رَحْمَتِهِ وَالظَّالِمِينَ أَعَدَّ لَهُمْ عَذَابًا أَلِيمًا (31)"));


        quran_text_76_adapter = new quran_text_76_adapter(alensans ,QuranText_76Activity.this);

        recyclerView = findViewById(R.id.rv_76);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_76Activity.this));
        recyclerView.setAdapter(quran_text_76_adapter);


    }

}