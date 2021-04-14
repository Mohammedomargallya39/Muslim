package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_63Activity extends AppCompatActivity {

    ArrayList<Almonafeqon> almonafeqons = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_63_adapter quran_text_63_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_63);

        almonafeqons.add(new Almonafeqon("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        almonafeqons.add(new Almonafeqon("إِذَا جَاءَكَ الْمُنَافِقُونَ قَالُوا نَشْهَدُ إِنَّكَ لَرَسُولُ اللَّهِ وَاللَّهُ يَعْلَمُ إِنَّكَ لَرَسُولُهُ وَاللَّهُ يَشْهَدُ إِنَّ الْمُنَافِقِينَ لَكَاذِبُونَ (1)"));
        almonafeqons.add(new Almonafeqon("اتَّخَذُوا أَيْمَانَهُمْ جُنَّةً فَصَدُّوا عَنْ سَبِيلِ اللَّهِ إِنَّهُمْ سَاءَ مَا كَانُوا يَعْمَلُونَ (2)"));
        almonafeqons.add(new Almonafeqon("ذَلِكَ بِأَنَّهُمْ آَمَنُوا ثُمَّ كَفَرُوا فَطُبِعَ عَلَى قُلُوبِهِمْ فَهُمْ لَا يَفْقَهُونَ (3)"));
        almonafeqons.add(new Almonafeqon("وَإِذَا رَأَيْتَهُمْ تُعْجِبُكَ أَجْسَامُهُمْ وَإِنْ يَقُولُوا تَسْمَعْ لِقَوْلِهِمْ كَأَنَّهُمْ خُشُبٌ مُسَنَّدَةٌ يَحْسَبُونَ كُلَّ صَيْحَةٍ عَلَيْهِمْ هُمُ الْعَدُوُّ فَاحْذَرْهُمْ قَاتَلَهُمُ اللَّهُ أَنَّى يُؤْفَكُونَ (4)"));
        almonafeqons.add(new Almonafeqon("وَإِذَا قِيلَ لَهُمْ تَعَالَوْا يَسْتَغْفِرْ لَكُمْ رَسُولُ اللَّهِ لَوَّوْا رُءُوسَهُمْ وَرَأَيْتَهُمْ يَصُدُّونَ وَهُمْ مُسْتَكْبِرُونَ (5)"));
        almonafeqons.add(new Almonafeqon("سَوَاءٌ عَلَيْهِمْ أَسْتَغْفَرْتَ لَهُمْ أَمْ لَمْ تَسْتَغْفِرْ لَهُمْ لَنْ يَغْفِرَ اللَّهُ لَهُمْ إِنَّ اللَّهَ لَا يَهْدِي الْقَوْمَ الْفَاسِقِينَ (6)"));
        almonafeqons.add(new Almonafeqon("هُمُ الَّذِينَ يَقُولُونَ لَا تُنْفِقُوا عَلَى مَنْ عِنْدَ رَسُولِ اللَّهِ حَتَّى يَنْفَضُّوا وَلِلَّهِ خَزَائِنُ السَّمَاوَاتِ وَالْأَرْضِ وَلَكِنَّ الْمُنَافِقِينَ لَا يَفْقَهُونَ (7)"));
        almonafeqons.add(new Almonafeqon("يَقُولُونَ لَئِنْ رَجَعْنَا إِلَى الْمَدِينَةِ لَيُخْرِجَنَّ الْأَعَزُّ مِنْهَا الْأَذَلَّ وَلِلَّهِ الْعِزَّةُ وَلِرَسُولِهِ وَلِلْمُؤْمِنِينَ وَلَكِنَّ الْمُنَافِقِينَ لَا يَعْلَمُونَ (8)"));
        almonafeqons.add(new Almonafeqon("يَا أَيُّهَا الَّذِينَ آَمَنُوا لَا تُلْهِكُمْ أَمْوَالُكُمْ وَلَا أَوْلَادُكُمْ عَنْ ذِكْرِ اللَّهِ وَمَنْ يَفْعَلْ ذَلِكَ فَأُولَئِكَ هُمُ الْخَاسِرُونَ (9)"));
        almonafeqons.add(new Almonafeqon("وَأَنْفِقُوا مِنْ مَا رَزَقْنَاكُمْ مِنْ قَبْلِ أَنْ يَأْتِيَ أَحَدَكُمُ الْمَوْتُ فَيَقُولَ رَبِّ لَوْلَا أَخَّرْتَنِي إِلَى أَجَلٍ قَرِيبٍ فَأَصَّدَّقَ وَأَكُنْ مِنَ الصَّالِحِينَ (10)"));
        almonafeqons.add(new Almonafeqon("وَلَنْ يُؤَخِّرَ اللَّهُ نَفْسًا إِذَا جَاءَ أَجَلُهَا وَاللَّهُ خَبِيرٌ بِمَا تَعْمَلُونَ (11)"));



        quran_text_63_adapter = new quran_text_63_adapter(almonafeqons ,QuranText_63Activity.this);

        recyclerView = findViewById(R.id.rv_63);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_63Activity.this));
        recyclerView.setAdapter(quran_text_63_adapter);


    }

}