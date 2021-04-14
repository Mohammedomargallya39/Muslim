package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_61Activity extends AppCompatActivity {

    ArrayList<Alsaf> alsafs = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_61_adapter quran_text_61_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_61);

        alsafs.add(new Alsaf("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alsafs.add(new Alsaf("سَبَّحَ لِلَّهِ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ وَهُوَ الْعَزِيزُ الْحَكِيمُ (1)"));
        alsafs.add(new Alsaf("يَا أَيُّهَا الَّذِينَ آَمَنُوا لِمَ تَقُولُونَ مَا لَا تَفْعَلُونَ (2)"));
        alsafs.add(new Alsaf("كَبُرَ مَقْتًا عِنْدَ اللَّهِ أَنْ تَقُولُوا مَا لَا تَفْعَلُونَ (3)"));
        alsafs.add(new Alsaf("إِنَّ اللَّهَ يُحِبُّ الَّذِينَ يُقَاتِلُونَ فِي سَبِيلِهِ صَفًّا كَأَنَّهُمْ بُنْيَانٌ مَرْصُوصٌ (4)"));
        alsafs.add(new Alsaf("وَإِذْ قَالَ مُوسَى لِقَوْمِهِ يَا قَوْمِ لِمَ تُؤْذُونَنِي وَقَدْ تَعْلَمُونَ أَنِّي رَسُولُ اللَّهِ إِلَيْكُمْ فَلَمَّا زَاغُوا أَزَاغَ اللَّهُ قُلُوبَهُمْ وَاللَّهُ لَا يَهْدِي الْقَوْمَ الْفَاسِقِينَ (5)"));
        alsafs.add(new Alsaf("وَإِذْ قَالَ عِيسَى ابْنُ مَرْيَمَ يَا بَنِي إِسْرَائِيلَ إِنِّي رَسُولُ اللَّهِ إِلَيْكُمْ مُصَدِّقًا لِمَا بَيْنَ يَدَيَّ مِنَ التَّوْرَاةِ وَمُبَشِّرًا بِرَسُولٍ يَأْتِي مِنْ بَعْدِي اسْمُهُ أَحْمَدُ فَلَمَّا جَاءَهُمْ بِالْبَيِّنَاتِ قَالُوا هَذَا سِحْرٌ مُبِينٌ (6)"));
        alsafs.add(new Alsaf("وَمَنْ أَظْلَمُ مِمَّنِ افْتَرَى عَلَى اللَّهِ الْكَذِبَ وَهُوَ يُدْعَى إِلَى الْإِسْلَامِ وَاللَّهُ لَا يَهْدِي الْقَوْمَ الظَّالِمِينَ (7)"));
        alsafs.add(new Alsaf("يُرِيدُونَ لِيُطْفِئُوا نُورَ اللَّهِ بِأَفْوَاهِهِمْ وَاللَّهُ مُتِمُّ نُورِهِ وَلَوْ كَرِهَ الْكَافِرُونَ (8)"));
        alsafs.add(new Alsaf("هُوَ الَّذِي أَرْسَلَ رَسُولَهُ بِالْهُدَى وَدِينِ الْحَقِّ لِيُظْهِرَهُ عَلَى الدِّينِ كُلِّهِ وَلَوْ كَرِهَ الْمُشْرِكُونَ (9)"));
        alsafs.add(new Alsaf("يَا أَيُّهَا الَّذِينَ آَمَنُوا هَلْ أَدُلُّكُمْ عَلَى تِجَارَةٍ تُنْجِيكُمْ مِنْ عَذَابٍ أَلِيمٍ (10)"));
        alsafs.add(new Alsaf("تُؤْمِنُونَ بِاللَّهِ وَرَسُولِهِ وَتُجَاهِدُونَ فِي سَبِيلِ اللَّهِ بِأَمْوَالِكُمْ وَأَنْفُسِكُمْ ذَلِكُمْ خَيْرٌ لَكُمْ إِنْ كُنْتُمْ تَعْلَمُونَ (11)"));
        alsafs.add(new Alsaf("يَغْفِرْ لَكُمْ ذُنُوبَكُمْ وَيُدْخِلْكُمْ جَنَّاتٍ تَجْرِي مِنْ تَحْتِهَا الْأَنْهَارُ وَمَسَاكِنَ طَيِّبَةً فِي جَنَّاتِ عَدْنٍ ذَلِكَ الْفَوْزُ الْعَظِيمُ (12)"));
        alsafs.add(new Alsaf("وَأُخْرَى تُحِبُّونَهَا نَصْرٌ مِنَ اللَّهِ وَفَتْحٌ قَرِيبٌ وَبَشِّرِ الْمُؤْمِنِينَ (13)"));
        alsafs.add(new Alsaf("يَا أَيُّهَا الَّذِينَ آَمَنُوا كُونُوا أَنْصَارَ اللَّهِ كَمَا قَالَ عِيسَى ابْنُ مَرْيَمَ لِلْحَوَارِيِّينَ مَنْ أَنْصَارِي إِلَى اللَّهِ قَالَ الْحَوَارِيُّونَ نَحْنُ أَنْصَارُ اللَّهِ فَآَمَنَتْ طَائِفَةٌ مِنْ بَنِي إِسْرَائِيلَ وَكَفَرَتْ طَائِفَةٌ فَأَيَّدْنَا الَّذِينَ آَمَنُوا عَلَى عَدُوِّهِمْ فَأَصْبَحُوا ظَاهِرِينَ (14)"));



        quran_text_61_adapter = new quran_text_61_adapter(alsafs ,QuranText_61Activity.this);

        recyclerView = findViewById(R.id.rv_61);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_61Activity.this));
        recyclerView.setAdapter(quran_text_61_adapter);


    }

}