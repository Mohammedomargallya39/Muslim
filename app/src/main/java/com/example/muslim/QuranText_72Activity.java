package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_72Activity extends AppCompatActivity {

    ArrayList<Algen> algens = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_72_adapter quran_text_72_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_72);

        algens.add(new Algen("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        algens.add(new Algen("قُلْ أُوحِيَ إِلَيَّ أَنَّهُ اسْتَمَعَ نَفَرٌ مِنَ الْجِنِّ فَقَالُوا إِنَّا سَمِعْنَا قُرْآَنًا عَجَبًا (1)"));
        algens.add(new Algen("يَهْدِي إِلَى الرُّشْدِ فَآَمَنَّا بِهِ وَلَنْ نُشْرِكَ بِرَبِّنَا أَحَدًا (2)"));
        algens.add(new Algen("وَأَنَّهُ تَعَالَى جَدُّ رَبِّنَا مَا اتَّخَذَ صَاحِبَةً وَلَا وَلَدًا (3)"));
        algens.add(new Algen("وَأَنَّهُ كَانَ يَقُولُ سَفِيهُنَا عَلَى اللَّهِ شَطَطًا (4)"));
        algens.add(new Algen("وَأَنَّا ظَنَنَّا أَنْ لَنْ تَقُولَ الْإِنْسُ وَالْجِنُّ عَلَى اللَّهِ كَذِبًا (5)"));
        algens.add(new Algen("وَأَنَّهُ كَانَ رِجَالٌ مِنَ الْإِنْسِ يَعُوذُونَ بِرِجَالٍ مِنَ الْجِنِّ فَزَادُوهُمْ رَهَقًا (6)"));
        algens.add(new Algen("وَأَنَّهُمْ ظَنُّوا كَمَا ظَنَنْتُمْ أَنْ لَنْ يَبْعَثَ اللَّهُ أَحَدًا (7)"));
        algens.add(new Algen("وَأَنَّا لَمَسْنَا السَّمَاءَ فَوَجَدْنَاهَا مُلِئَتْ حَرَسًا شَدِيدًا وَشُهُبًا (8)"));
        algens.add(new Algen("وَأَنَّا كُنَّا نَقْعُدُ مِنْهَا مَقَاعِدَ لِلسَّمْعِ فَمَنْ يَسْتَمِعِ الْآَنَ يَجِدْ لَهُ شِهَابًا رَصَدًا (9)"));
        algens.add(new Algen("وَأَنَّا لَا نَدْرِي أَشَرٌّ أُرِيدَ بِمَنْ فِي الْأَرْضِ أَمْ أَرَادَ بِهِمْ رَبُّهُمْ رَشَدًا (10)"));
        algens.add(new Algen("وَأَنَّا مِنَّا الصَّالِحُونَ وَمِنَّا دُونَ ذَلِكَ كُنَّا طَرَائِقَ قِدَدًا (11)"));
        algens.add(new Algen("وَأَنَّا ظَنَنَّا أَنْ لَنْ نُعجِزَ اللَّهَ فِي الْأَرْضِ وَلَنْ نُعْجِزَهُ هَرَبًا (12)"));
        algens.add(new Algen("وَأَنَّا لَمَّا سَمِعْنَا الْهُدَى آَمَنَّا بِهِ فَمَنْ يُؤْمِنْ بِرَبِّهِ فَلَا يَخَافُ بَخْسًا وَلَا رَهَقًا (13)"));
        algens.add(new Algen("وَأَنَّا مِنَّا الْمُسْلِمُونَ وَمِنَّا الْقَاسِطُونَ فَمَنْ أَسْلَمَ فَأُولَئِكَ تَحَرَّوْا رَشَدًا (14)"));
        algens.add(new Algen("وَأَمَّا الْقَاسِطُونَ فَكَانُوا لِجَهَنَّمَ حَطَبًا (15)"));
        algens.add(new Algen("وَأَنْ لَوِ اسْتَقَامُوا عَلَى الطَّرِيقَةِ لَأَسْقَيْنَاهُمْ مَاءً غَدَقًا (16)"));
        algens.add(new Algen("لِنَفْتِنَهُمْ فِيهِ وَمَنْ يُعْرِضْ عَنْ ذِكْرِ رَبِّهِ يَسْلُكْهُ عَذَابًا صَعَدًا (17)"));
        algens.add(new Algen("وَأَنَّ الْمَسَاجِدَ لِلَّهِ فَلَا تَدْعُوا مَعَ اللَّهِ أَحَدًا (18)"));
        algens.add(new Algen("وَأَنَّهُ لَمَّا قَامَ عَبْدُ اللَّهِ يَدْعُوهُ كَادُوا يَكُونُونَ عَلَيْهِ لِبَدًا (19)"));
        algens.add(new Algen("قُلْ إِنَّمَا أَدْعُو رَبِّي وَلَا أُشْرِكُ بِهِ أَحَدًا (20)"));
        algens.add(new Algen("قُلْ إِنِّي لَا أَمْلِكُ لَكُمْ ضَرًّا وَلَا رَشَدًا (21)"));
        algens.add(new Algen("قُلْ إِنِّي لَنْ يُجِيرَنِي مِنَ اللَّهِ أَحَدٌ وَلَنْ أَجِدَ مِنْ دُونِهِ مُلْتَحَدًا (22)"));
        algens.add(new Algen("إِلَّا بَلَاغًا مِنَ اللَّهِ وَرِسَالَاتِهِ وَمَنْ يَعْصِ اللَّهَ وَرَسُولَهُ فَإِنَّ لَهُ نَارَ جَهَنَّمَ خَالِدِينَ فِيهَا أَبَدًا (23)"));
        algens.add(new Algen("حَتَّى إِذَا رَأَوْا مَا يُوعَدُونَ فَسَيَعْلَمُونَ مَنْ أَضْعَفُ نَاصِرًا وَأَقَلُّ عَدَدًا (24)"));
        algens.add(new Algen("قُلْ إِنْ أَدْرِي أَقَرِيبٌ مَا تُوعَدُونَ أَمْ يَجْعَلُ لَهُ رَبِّي أَمَدًا (25)"));
        algens.add(new Algen("عَالِمُ الْغَيْبِ فَلَا يُظْهِرُ عَلَى غَيْبِهِ أَحَدًا (26)"));
        algens.add(new Algen("إِلَّا مَنِ ارْتَضَى مِنْ رَسُولٍ فَإِنَّهُ يَسْلُكُ مِنْ بَيْنِ يَدَيْهِ وَمِنْ خَلْفِهِ رَصَدًا (27)"));
        algens.add(new Algen("لِيَعْلَمَ أَنْ قَدْ أَبْلَغُوا رِسَالَاتِ رَبِّهِمْ وَأَحَاطَ بِمَا لَدَيْهِمْ وَأَحْصَى كُلَّ شَيْءٍ عَدَدًا (28)"));


        quran_text_72_adapter = new quran_text_72_adapter(algens ,QuranText_72Activity.this);

        recyclerView = findViewById(R.id.rv_72);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_72Activity.this));
        recyclerView.setAdapter(quran_text_72_adapter);


    }

}