package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_71Activity extends AppCompatActivity {

    ArrayList<Nouh> nouhs = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_71_adapter quran_text_71_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_71);

        nouhs.add(new Nouh("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        nouhs.add(new Nouh("إِنَّا أَرْسَلْنَا نُوحًا إِلَى قَوْمِهِ أَنْ أَنْذِرْ قَوْمَكَ مِنْ قَبْلِ أَنْ يَأْتِيَهُمْ عَذَابٌ أَلِيمٌ (1)"));
        nouhs.add(new Nouh("قَالَ يَا قَوْمِ إِنِّي لَكُمْ نَذِيرٌ مُبِينٌ (2)"));
        nouhs.add(new Nouh("أَنِ اعْبُدُوا اللَّهَ وَاتَّقُوهُ وَأَطِيعُونِ (3)"));
        nouhs.add(new Nouh("يَغْفِرْ لَكُمْ مِنْ ذُنُوبِكُمْ وَيُؤَخِّرْكُمْ إِلَى أَجَلٍ مُسَمًّى إِنَّ أَجَلَ اللَّهِ إِذَا جَاءَ لَا يُؤَخَّرُ لَوْ كُنْتُمْ تَعْلَمُونَ (4)"));
        nouhs.add(new Nouh("قَالَ رَبِّ إِنِّي دَعَوْتُ قَوْمِي لَيْلًا وَنَهَارًا (5)"));
        nouhs.add(new Nouh("فَلَمْ يَزِدْهُمْ دُعَائِي إِلَّا فِرَارًا (6)"));
        nouhs.add(new Nouh("وَإِنِّي كُلَّمَا دَعَوْتُهُمْ لِتَغْفِرَ لَهُمْ جَعَلُوا أَصَابِعَهُمْ فِي آَذَانِهِمْ وَاسْتَغْشَوْا ثِيَابَهُمْ وَأَصَرُّوا وَاسْتَكْبَرُوا اسْتِكْبَارًا (7)"));
        nouhs.add(new Nouh("ثُمَّ إِنِّي دَعَوْتُهُمْ جِهَارًا (8)"));
        nouhs.add(new Nouh("ثُمَّ إِنِّي أَعْلَنْتُ لَهُمْ وَأَسْرَرْتُ لَهُمْ إِسْرَارًا (9)"));
        nouhs.add(new Nouh("فَقُلْتُ اسْتَغْفِرُوا رَبَّكُمْ إِنَّهُ كَانَ غَفَّارًا (10)"));
        nouhs.add(new Nouh("يُرْسِلِ السَّمَاءَ عَلَيْكُمْ مِدْرَارًا (11)"));
        nouhs.add(new Nouh("وَيُمْدِدْكُمْ بِأَمْوَالٍ وَبَنِينَ وَيَجْعَلْ لَكُمْ جَنَّاتٍ وَيَجْعَلْ لَكُمْ أَنْهَارًا (12)"));
        nouhs.add(new Nouh("مَا لَكُمْ لَا تَرْجُونَ لِلَّهِ وَقَارًا (13)"));
        nouhs.add(new Nouh("وَقَدْ خَلَقَكُمْ أَطْوَارًا (14)"));
        nouhs.add(new Nouh("أَلَمْ تَرَوْا كَيْفَ خَلَقَ اللَّهُ سَبْعَ سَمَاوَاتٍ طِبَاقًا (15)"));
        nouhs.add(new Nouh("وَجَعَلَ الْقَمَرَ فِيهِنَّ نُورًا وَجَعَلَ الشَّمْسَ سِرَاجًا (16)"));
        nouhs.add(new Nouh("وَاللَّهُ أَنْبَتَكُمْ مِنَ الْأَرْضِ نَبَاتًا (17)"));
        nouhs.add(new Nouh("ثُمَّ يُعِيدُكُمْ فِيهَا وَيُخْرِجُكُمْ إِخْرَاجًا (18)"));
        nouhs.add(new Nouh("وَاللَّهُ جَعَلَ لَكُمُ الْأَرْضَ بِسَاطًا (19)"));
        nouhs.add(new Nouh("لِتَسْلُكُوا مِنْهَا سُبُلًا فِجَاجًا (20)"));
        nouhs.add(new Nouh("قَالَ نُوحٌ رَبِّ إِنَّهُمْ عَصَوْنِي وَاتَّبَعُوا مَنْ لَمْ يَزِدْهُ مَالُهُ وَوَلَدُهُ إِلَّا خَسَارًا (21)"));
        nouhs.add(new Nouh("وَمَكَرُوا مَكْرًا كُبَّارًا (22)"));
        nouhs.add(new Nouh("وَقَالُوا لَا تَذَرُنَّ آَلِهَتَكُمْ وَلَا تَذَرُنَّ وَدًّا وَلَا سُوَاعًا وَلَا يَغُوثَ وَيَعُوقَ وَنَسْرًا (23)"));
        nouhs.add(new Nouh("وَقَدْ أَضَلُّوا كَثِيرًا وَلَا تَزِدِ الظَّالِمِينَ إِلَّا ضَلَالًا (24)"));
        nouhs.add(new Nouh("مِمَّا خَطِيئَاتِهِمْ أُغْرِقُوا فَأُدْخِلُوا نَارًا فَلَمْ يَجِدُوا لَهُمْ مِنْ دُونِ اللَّهِ أَنْصَارًا (25)"));
        nouhs.add(new Nouh("وَقَالَ نُوحٌ رَبِّ لَا تَذَرْ عَلَى الْأَرْضِ مِنَ الْكَافِرِينَ دَيَّارًا (26)"));
        nouhs.add(new Nouh("إِنَّكَ إِنْ تَذَرْهُمْ يُضِلُّوا عِبَادَكَ وَلَا يَلِدُوا إِلَّا فَاجِرًا كَفَّارًا (27)"));
        nouhs.add(new Nouh("رَبِّ اغْفِرْ لِي وَلِوَالِدَيَّ وَلِمَنْ دَخَلَ بَيْتِيَ مُؤْمِنًا وَلِلْمُؤْمِنِينَ وَالْمُؤْمِنَاتِ وَلَا تَزِدِ الظَّالِمِينَ إِلَّا تَبَارًا (28)"));



        quran_text_71_adapter = new quran_text_71_adapter(nouhs ,QuranText_71Activity.this);

        recyclerView = findViewById(R.id.rv_71);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_71Activity.this));
        recyclerView.setAdapter(quran_text_71_adapter);


    }

}