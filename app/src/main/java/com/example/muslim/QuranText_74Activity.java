package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_74Activity extends AppCompatActivity {

    ArrayList<Almodather> almodathers = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_74_adapter quran_text_74_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_74);

        almodathers.add(new Almodather("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        almodathers.add(new Almodather("يَاأَيُّهَا الْمُدَّثِّرُ (1)"));
        almodathers.add(new Almodather("قُمْ فَأَنْذِرْ (2)"));
        almodathers.add(new Almodather("وَرَبَّكَ فَكَبِّرْ (3)"));
        almodathers.add(new Almodather("وَثِيَابَكَ فَطَهِّرْ (4)"));
        almodathers.add(new Almodather("وَالرُّجْزَ فَاهْجُرْ (5)"));
        almodathers.add(new Almodather("وَلَا تَمْنُنْ تَسْتَكْثِرُ (6)"));
        almodathers.add(new Almodather("وَلِرَبِّكَ فَاصْبِرْ (7)"));
        almodathers.add(new Almodather("فَإِذَا نُقِرَ فِي النَّاقُورِ (8)"));
        almodathers.add(new Almodather("فَذَلِكَ يَوْمَئِذٍ يَوْمٌ عَسِيرٌ (9)"));
        almodathers.add(new Almodather("عَلَى الْكَافِرِينَ غَيْرُ يَسِيرٍ (10)"));
        almodathers.add(new Almodather("ذَرْنِي وَمَنْ خَلَقْتُ وَحِيدًا (11)"));
        almodathers.add(new Almodather("وَجَعَلْتُ لَهُ مَالًا مَمْدُودًا (12)"));
        almodathers.add(new Almodather("وَبَنِينَ شُهُودًا (13)"));
        almodathers.add(new Almodather("وَمَهَّدْتُ لَهُ تَمْهِيدًا (14)"));
        almodathers.add(new Almodather("ثُمَّ يَطْمَعُ أَنْ أَزِيدَ (15)"));
        almodathers.add(new Almodather("كَلَّا إِنَّهُ كَانَ لِآَيَاتِنَا عَنِيدًا (16)"));
        almodathers.add(new Almodather("سَأُرْهِقُهُ صَعُودًا (17)"));
        almodathers.add(new Almodather("إِنَّهُ فَكَّرَ وَقَدَّرَ (18)"));
        almodathers.add(new Almodather("فَقُتِلَ كَيْفَ قَدَّرَ (19)"));
        almodathers.add(new Almodather("ثُمَّ قُتِلَ كَيْفَ قَدَّرَ (20)"));
        almodathers.add(new Almodather("ثُمَّ نَظَرَ (21)"));
        almodathers.add(new Almodather("ثُمَّ عَبَسَ وَبَسَرَ (22)"));
        almodathers.add(new Almodather("ثُمَّ أَدْبَرَ وَاسْتَكْبَرَ (23)"));
        almodathers.add(new Almodather("فَقَالَ إِنْ هَذَا إِلَّا سِحْرٌ يُؤْثَرُ (24)"));
        almodathers.add(new Almodather("إِنْ هَذَا إِلَّا قَوْلُ الْبَشَرِ (25)"));
        almodathers.add(new Almodather("سَأُصْلِيهِ سَقَرَ (26)"));
        almodathers.add(new Almodather("وَمَا أَدْرَاكَ مَا سَقَرُ (27)"));
        almodathers.add(new Almodather("لَا تُبْقِي وَلَا تَذَرُ (28)"));
        almodathers.add(new Almodather("لَوَّاحَةٌ لِلْبَشَرِ (29)"));
        almodathers.add(new Almodather("عَلَيْهَا تِسْعَةَ عَشَرَ (30)"));
        almodathers.add(new Almodather("وَمَا جَعَلْنَا أَصْحَابَ النَّارِ إِلَّا مَلَائِكَةً وَمَا جَعَلْنَا عِدَّتَهُمْ إِلَّا فِتْنَةً لِلَّذِينَ كَفَرُوا لِيَسْتَيْقِنَ الَّذِينَ أُوتُوا الْكِتَابَ وَيَزْدَادَ الَّذِينَ آَمَنُوا إِيمَانًا وَلَا يَرْتَابَ الَّذِينَ أُوتُوا الْكِتَابَ وَالْمُؤْمِنُونَ وَلِيَقُولَ الَّذِينَ فِي قُلُوبِهِمْ مَرَضٌ وَالْكَافِرُونَ مَاذَا أَرَادَ اللَّهُ بِهَذَا مَثَلًا كَذَلِكَ يُضِلُّ اللَّهُ مَنْ يَشَاءُ وَيَهْدِي مَنْ يَشَاءُ وَمَا يَعْلَمُ جُنُودَ رَبِّكَ إِلَّا هُوَ وَمَا هِيَ إِلَّا ذِكْرَى لِلْبَشَرِ (31)"));
        almodathers.add(new Almodather("كَلَّا وَالْقَمَرِ (32)"));
        almodathers.add(new Almodather("وَاللَّيْلِ إِذْ أَدْبَرَ (33)"));
        almodathers.add(new Almodather("وَالصُّبْحِ إِذَا أَسْفَرَ (34)"));
        almodathers.add(new Almodather("إِنَّهَا لَإِحْدَى الْكُبَرِ (35)"));
        almodathers.add(new Almodather("نَذِيرًا لِلْبَشَرِ (36)"));
        almodathers.add(new Almodather("لِمَنْ شَاءَ مِنْكُمْ أَنْ يَتَقَدَّمَ أَوْ يَتَأَخَّرَ (37)"));
        almodathers.add(new Almodather("كُلُّ نَفْسٍ بِمَا كَسَبَتْ رَهِينَةٌ (38)"));
        almodathers.add(new Almodather("إِلَّا أَصْحَابَ الْيَمِينِ (39)"));
        almodathers.add(new Almodather("فِي جَنَّاتٍ يَتَسَاءَلُونَ (40)"));
        almodathers.add(new Almodather("عَنِ الْمُجْرِمِينَ (41)"));
        almodathers.add(new Almodather("مَا سَلَكَكُمْ فِي سَقَرَ (42)"));
        almodathers.add(new Almodather("قَالُوا لَمْ نَكُ مِنَ الْمُصَلِّينَ (43)"));
        almodathers.add(new Almodather("وَلَمْ نَكُ نُطْعِمُ الْمِسْكِينَ (44)"));
        almodathers.add(new Almodather("وَكُنَّا نَخُوضُ مَعَ الْخَائِضِينَ (45)"));
        almodathers.add(new Almodather("وَكُنَّا نُكَذِّبُ بِيَوْمِ الدِّينِ (46)"));
        almodathers.add(new Almodather("حَتَّى أَتَانَا الْيَقِينُ (47)"));
        almodathers.add(new Almodather("فَمَا تَنْفَعُهُمْ شَفَاعَةُ الشَّافِعِينَ (48)"));
        almodathers.add(new Almodather("فَمَا لَهُمْ عَنِ التَّذْكِرَةِ مُعْرِضِينَ (49)"));
        almodathers.add(new Almodather("كَأَنَّهُمْ حُمُرٌ مُسْتَنْفِرَةٌ (50)"));
        almodathers.add(new Almodather("فَرَّتْ مِنْ قَسْوَرَةٍ (51)"));
        almodathers.add(new Almodather("بَلْ يُرِيدُ كُلُّ امْرِئٍ مِنْهُمْ أَنْ يُؤْتَى صُحُفًا مُنَشَّرَةً (52)"));
        almodathers.add(new Almodather("كَلَّا بَلْ لَا يَخَافُونَ الْآَخِرَةَ (53)"));
        almodathers.add(new Almodather("كَلَّا إِنَّهُ تَذْكِرَةٌ (54)"));
        almodathers.add(new Almodather("فَمَنْ شَاءَ ذَكَرَهُ (55)"));
        almodathers.add(new Almodather("وَمَا يَذْكُرُونَ إِلَّا أَنْ يَشَاءَ اللَّهُ هُوَ أَهْلُ التَّقْوَى وَأَهْلُ الْمَغْفِرَةِ (56)"));


        quran_text_74_adapter = new quran_text_74_adapter(almodathers ,QuranText_74Activity.this);

        recyclerView = findViewById(R.id.rv_74);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_74Activity.this));
        recyclerView.setAdapter(quran_text_74_adapter);


    }

}