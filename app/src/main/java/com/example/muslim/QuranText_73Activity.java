package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_73Activity extends AppCompatActivity {

    ArrayList<Almozamel> almozamels = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_73_adapter quran_text_73_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_73);

        almozamels.add(new Almozamel("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        almozamels.add(new Almozamel("يَا أَيُّهَا الْمُزَّمِّلُ (1)"));
        almozamels.add(new Almozamel("قُمِ اللَّيْلَ إِلَّا قَلِيلًا (2)"));
        almozamels.add(new Almozamel("نِصْفَهُ أَوِ انْقُصْ مِنْهُ قَلِيلًا (3)"));
        almozamels.add(new Almozamel("أَوْ زِدْ عَلَيْهِ وَرَتِّلِ الْقُرْآَنَ تَرْتِيلًا (4)"));
        almozamels.add(new Almozamel("إِنَّا سَنُلْقِي عَلَيْكَ قَوْلًا ثَقِيلًا (5)"));
        almozamels.add(new Almozamel("إِنَّ نَاشِئَةَ اللَّيْلِ هِيَ أَشَدُّ وَطْئًا وَأَقْوَمُ قِيلًا (6)"));
        almozamels.add(new Almozamel("إِنَّ لَكَ فِي اَلنَّهَارِ سَبْحًا طَوِيلًا (7)"));
        almozamels.add(new Almozamel("وَاذْكُرِ اسْمَ رَبِّكَ وَتَبَتَّلْ إِلَيْهِ تَبْتِيلًا (8)"));
        almozamels.add(new Almozamel("رَبُّ الْمَشْرِقِ وَالْمَغْرِبِ لَا إِلَهَ إِلَّا هُوَ فَاتَّخِذْهُ وَكِيلًا (9)"));
        almozamels.add(new Almozamel("وَاصْبِرْ عَلَى مَا يَقُولُونَ وَاهْجُرْهُمْ هَجْرًا جَمِيلًا (10)"));
        almozamels.add(new Almozamel("وَذَرْنِي وَالْمُكَذِّبِينَ أُولِي النَّعْمَةِ وَمَهِّلْهُمْ قَلِيلًا (11)"));
        almozamels.add(new Almozamel("إِنَّ لَدَيْنَا أَنْكَالًا وَجَحِيمًا (12)"));
        almozamels.add(new Almozamel("وَطَعَامًا ذَا غُصَّةٍ وَعَذَابًا أَلِيمًا (13)"));
        almozamels.add(new Almozamel("يَوْمَ تَرْجُفُ الْأَرْضُ وَالْجِبَالُ وَكَانَتِ الْجِبَالُ كَثِيبًا مَهِيلًا (14)"));
        almozamels.add(new Almozamel("إِنَّا أَرْسَلْنَا إِلَيْكُمْ رَسُولًا شَاهِدًا عَلَيْكُمْ كَمَا أَرْسَلْنَا إِلَى فِرْعَوْنَ رَسُولًا (15)"));
        almozamels.add(new Almozamel("فَعَصَى فِرْعَوْنُ الرَّسُولَ فَأَخَذْنَاهُ أَخْذًا وَبِيلًا (16)"));
        almozamels.add(new Almozamel("فَكَيْفَ تَتَّقُونَ إِنْ كَفَرْتُمْ يَوْمًا يَجْعَلُ الْوِلْدَانَ شِيبًا (17)"));
        almozamels.add(new Almozamel("السَّمَاءُ مُنْفَطِرٌ بِهِ كَانَ وَعْدُهُ مَفْعُولًا (18)"));
        almozamels.add(new Almozamel("إِنَّ هَذِهِ تَذْكِرَةٌ فَمَنْ شَاءَ اتَّخَذَ إِلَى رَبِّهِ سَبِيلًا (19)"));
        almozamels.add(new Almozamel("إِنَّ رَبَّكَ يَعْلَمُ أَنَّكَ تَقُومُ أَدْنَى مِنْ ثُلُثَيِ اللَّيْلِ وَنِصْفَهُ وَثُلُثَهُ وَطَائِفَةٌ مِنَ الَّذِينَ مَعَكَ وَاللَّهُ يُقَدِّرُ اللَّيْلَ وَالنَّهَارَ عَلِمَ أَنْ لَنْ تُحْصُوهُ فَتَابَ عَلَيْكُمْ فَاقْرَءُوا مَا تَيَسَّرَ مِنَ الْقُرْآَنِ عَلِمَ أَنْ سَيَكُونُ مِنْكُمْ مَرْضَى وَآَخَرُونَ يَضْرِبُونَ فِي الْأَرْضِ يَبْتَغُونَ مِنْ فَضْلِ اللَّهِ وَآَخَرُونَ يُقَاتِلُونَ فِي سَبِيلِ اللَّهِ فَاقْرَءُوا مَا تَيَسَّرَ مِنْهُ وَأَقِيمُوا الصَّلَاةَ وَآَتُوا الزَّكَاةَ وَأَقْرِضُوا اللَّهَ قَرْضًا حَسَنًا وَمَا تُقَدِّمُوا لِأَنْفُسِكُمْ مِنْ خَيْرٍ تَجِدُوهُ عِنْدَ اللَّهِ هُوَ خَيْرًا وَأَعْظَمَ أَجْرًا وَاسْتَغْفِرُوا اللَّهَ إِنَّ اللَّهَ غَفُورٌ رَحِيمٌ (20)"));


        quran_text_73_adapter = new quran_text_73_adapter(almozamels ,QuranText_73Activity.this);

        recyclerView = findViewById(R.id.rv_73);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_73Activity.this));
        recyclerView.setAdapter(quran_text_73_adapter);


    }

}