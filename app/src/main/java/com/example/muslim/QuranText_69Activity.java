package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_69Activity extends AppCompatActivity {

    ArrayList<Alhaqah> alhaqahs = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_69_adapter quran_text_69_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_69);

        alhaqahs.add(new Alhaqah("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alhaqahs.add(new Alhaqah("الْحَاقَّةُ (1)"));
        alhaqahs.add(new Alhaqah("مَا الْحَاقَّةُ (2)"));
        alhaqahs.add(new Alhaqah("وَمَا أَدْرَاكَ مَا الْحَاقَّةُ (3)"));
        alhaqahs.add(new Alhaqah("كَذَّبَتْ ثَمُودُ وَعَادٌ بِالْقَارِعَةِ (4)"));
        alhaqahs.add(new Alhaqah("فَأَمَّا ثَمُودُ فَأُهْلِكُوا بِالطَّاغِيَةِ (5)"));
        alhaqahs.add(new Alhaqah("وَأَمَّا عَادٌ فَأُهْلِكُوا بِرِيحٍ صَرْصَرٍ عَاتِيَةٍ (6)"));
        alhaqahs.add(new Alhaqah("سَخَّرَهَا عَلَيْهِمْ سَبْعَ لَيَالٍ وَثَمَانِيَةَ أَيَّامٍ حُسُومًا فَتَرَى الْقَوْمَ فِيهَا صَرْعَى كَأَنَّهُمْ أَعْجَازُ نَخْلٍ خَاوِيَةٍ (7)"));
        alhaqahs.add(new Alhaqah("فَهَلْ تَرَى لَهُمْ مِنْ بَاقِيَةٍ (8)"));
        alhaqahs.add(new Alhaqah("وَجَاءَ فِرْعَوْنُ وَمَنْ قَبْلَهُ وَالْمُؤْتَفِكَاتُ بِالْخَاطِئَةِ (9)"));
        alhaqahs.add(new Alhaqah("فَعَصَوْا رَسُولَ رَبِّهِمْ فَأَخَذَهُمْ أَخْذَةً رَابِيَةً (10)"));
        alhaqahs.add(new Alhaqah("إِنَّا لَمَّا طَغَى الْمَاءُ حَمَلْنَاكُمْ فِي الْجَارِيَةِ (11)"));
        alhaqahs.add(new Alhaqah("لِنَجْعَلَهَا لَكُمْ تَذْكِرَةً وَتَعِيَهَا أُذُنٌ وَاعِيَةٌ (12)"));
        alhaqahs.add(new Alhaqah("فَإِذَا نُفِخَ فِي الصُّورِ نَفْخَةٌ وَاحِدَةٌ (13)"));
        alhaqahs.add(new Alhaqah("وَحُمِلَتِ الْأَرْضُ وَالْجِبَالُ فَدُكَّتَا دَكَّةً وَاحِدَةً (14)"));
        alhaqahs.add(new Alhaqah("فَيَوْمَئِذٍ وَقَعَتِ الْوَاقِعَةُ (15)"));
        alhaqahs.add(new Alhaqah("وَانْشَقَّتِ السَّمَاءُ فَهِيَ يَوْمَئِذٍ وَاهِيَةٌ (16)"));
        alhaqahs.add(new Alhaqah("وَالْمَلَكُ عَلَى أَرْجَائِهَا وَيَحْمِلُ عَرْشَ رَبِّكَ فَوْقَهُمْ يَوْمَئِذٍ ثَمَانِيَةٌ (17)"));
        alhaqahs.add(new Alhaqah("يَوْمَئِذٍ تُعْرَضُونَ لَا تَخْفَى مِنْكُمْ خَافِيَةٌ (18)"));
        alhaqahs.add(new Alhaqah("فَأَمَّا مَنْ أُوتِيَ كِتَابَهُ بِيَمِينِهِ فَيَقُولُ هَاؤُمُ اقْرَءُوا كِتَابِيَهْ (19)"));
        alhaqahs.add(new Alhaqah("إِنِّي ظَنَنْتُ أَنِّي مُلَاقٍ حِسَابِيَهْ (20)"));
        alhaqahs.add(new Alhaqah("فَهُوَ فِي عِيشَةٍ رَاضِيَةٍ (21)"));
        alhaqahs.add(new Alhaqah("فِي جَنَّةٍ عَالِيَةٍ (22)"));
        alhaqahs.add(new Alhaqah("قُطُوفُهَا دَانِيَةٌ (23)"));
        alhaqahs.add(new Alhaqah("كُلُوا وَاشْرَبُوا هَنِيئًا بِمَا أَسْلَفْتُمْ فِي الْأَيَّامِ الْخَالِيَةِ (24)"));
        alhaqahs.add(new Alhaqah("وَأَمَّا مَنْ أُوتِيَ كِتَابَهُ بِشِمَالِهِ فَيَقُولُ يَا لَيْتَنِي لَمْ أُوتَ كِتَابِيَهْ (25)"));
        alhaqahs.add(new Alhaqah("وَلَمْ أَدْرِ مَا حِسَابِيَهْ (26)"));
        alhaqahs.add(new Alhaqah("يَا \u200Eلَيْتَهَا كَانَتِ الْقَاضِيَةَ (27)"));
        alhaqahs.add(new Alhaqah("مَا أَغْنَى عَنِّي مَالِيَهْ (28)"));
        alhaqahs.add(new Alhaqah("هَلَكَ عَنِّي سُلْطَانِيَهْ (29)"));
        alhaqahs.add(new Alhaqah("خُذُوهُ فَغُلُّوهُ (30)"));
        alhaqahs.add(new Alhaqah("ثُمَّ الْجَحِيمَ صَلُّوهُ (31)"));
        alhaqahs.add(new Alhaqah("ثُمَّ فِي سِلْسِلَةٍ ذَرْعُهَا سَبْعُونَ ذِرَاعًا فَاسْلُكُوهُ (32)"));
        alhaqahs.add(new Alhaqah("إِنّهُ كَانَ لَا يُؤْمِنُ بِاللَّهِ الْعَظِيمِ (33) وَلَا يَحُضُّ عَلَى طَعَامِ الْمِسْكِينِ (34)"));
        alhaqahs.add(new Alhaqah("فَلَيْسَ لَهُ الْيَوْمَ هَاهُنَا حَمِيمٌ (35)"));
        alhaqahs.add(new Alhaqah("وَلَا طَعَامٌ إِلَّا مِنْ غِسْلِينٍ (36)"));
        alhaqahs.add(new Alhaqah("لَا يَأْكُلُهُ إِلَّا الْخَاطِئُونَ (37)"));
        alhaqahs.add(new Alhaqah("فَلَا أُقْسِمُ بِمَا تُبْصِرُونَ (38)"));
        alhaqahs.add(new Alhaqah("وَمَا لَا تُبْصِرُونَ (39)"));
        alhaqahs.add(new Alhaqah("إِنَّهُ لَقَوْلُ رَسُولٍ كَرِيمٍ (40)"));
        alhaqahs.add(new Alhaqah("وَمَا هُوَ بِقَوْلِ شَاعِرٍ قَلِيلًا مَا تُؤْمِنُونَ (41)"));
        alhaqahs.add(new Alhaqah("وَلَا بِقَوْلِ كَاهِنٍ قَلِيلًا مَا تَذَكَّرُونَ (42)"));
        alhaqahs.add(new Alhaqah("تَنْزِيلٌ مِنْ رَبِّ الْعَالَمِينَ (43)"));
        alhaqahs.add(new Alhaqah("وَلَوْ تَقَوَّلَ عَلَيْنَا بَعْضَ الْأَقَاوِيلِ (44)"));
        alhaqahs.add(new Alhaqah("لَأَخَذْنَا مِنْهُ بِالْيَمِينِ (45)"));
        alhaqahs.add(new Alhaqah("ثُمَّ لَقَطَعْنَا مِنْهُ الْوَتِينَ (46)"));
        alhaqahs.add(new Alhaqah("فَمَا مِنْكُمْ مِنْ أَحَدٍ عَنْهُ حَاجِزِينَ (47)"));
        alhaqahs.add(new Alhaqah("وَإِنَّهُ لَتَذْكِرَةٌ لِلْمُتَّقِينَ (48)"));
        alhaqahs.add(new Alhaqah("وَإِنَّا لَنَعْلَمُ أَنَّ مِنْكُمْ مُكَذِّبِينَ (49)"));
        alhaqahs.add(new Alhaqah("وَإِنَّهُ لَحَسْرَةٌ عَلَى الْكَافِرِينَ (50)"));
        alhaqahs.add(new Alhaqah("وَإِنَّهُ لَحَقُّ الْيَقِينِ (51)"));
        alhaqahs.add(new Alhaqah("فَسَبِّحْ بِاسْمِ رَبِّكَ الْعَظِيمِ (52)"));




        quran_text_69_adapter = new quran_text_69_adapter(alhaqahs ,QuranText_69Activity.this);

        recyclerView = findViewById(R.id.rv_69);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_69Activity.this));
        recyclerView.setAdapter(quran_text_69_adapter);


    }

}