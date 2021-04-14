package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_64Activity extends AppCompatActivity {

    ArrayList<Altghabon> altghabons = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_64_adapter quran_text_64_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_64);

        altghabons.add(new Altghabon("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        altghabons.add(new Altghabon("يُسَبِّحُ لِلَّهِ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيرٌ (1)"));
        altghabons.add(new Altghabon("هُوَ الَّذِي خَلَقَكُمْ فَمِنْكُمْ كَافِرٌ وَمِنْكُمْ مُؤْمِنٌ وَاللَّهُ بِمَا تَعْمَلُونَ بَصِيرٌ (2)"));
        altghabons.add(new Altghabon("خَلَقَ السَّمَاوَاتِ وَالْأَرْضَ بِالْحَقِّ وَصَوَّرَكُمْ فَأَحْسَنَ صُوَرَكُمْ وَإِلَيْهِ الْمَصِيرُ (3)"));
        altghabons.add(new Altghabon("يَعْلَمُ مَا فِي السَّمَاوَاتِ وَالْأَرْضِ وَيَعْلَمُ مَا تُسِرُّونَ وَمَا تُعْلِنُونَ وَاللَّهُ عَلِيمٌ بِذَاتِ الصُّدُورِ (4)"));
        altghabons.add(new Altghabon("أَلَمْ يَأْتِكُمْ نَبَأُ الَّذِينَ كَفَرُوا مِنْ قَبْلُ فَذَاقُوا وَبَالَ أَمْرِهِمْ وَلَهُمْ عَذَابٌ أَلِيمٌ (5)"));
        altghabons.add(new Altghabon("ذَلِكَ بِأَنَّهُ كَانَتْ تَأْتِيهِمْ رُسُلُهُمْ بِالْبَيِّنَاتِ فَقَالُوا أَبَشَرٌ يَهْدُونَنَا فَكَفَرُوا وَتَوَلَّوْا وَاسْتَغْنَى اللَّهُ وَاللَّهُ غَنِيٌّ حَمِيدٌ (6)"));
        altghabons.add(new Altghabon("زَعَمَ الَّذِينَ كَفَرُوا أَنْ لَنْ يُبْعَثُوا قُلْ بَلَى وَرَبِّي لَتُبْعَثُنَّ ثُمَّ لَتُنَبَّؤُنَّ بِمَا عَمِلْتُمْ وَذَلِكَ عَلَى اللَّهِ يَسِيرٌ (7)"));
        altghabons.add(new Altghabon("فَآَمِنُوا بِاللَّهِ وَرَسُولِهِ وَالنُّورِ الَّذِي أَنْزَلْنَا وَاللَّهُ بِمَا تَعْمَلُونَ خَبِيرٌ (8)"));
        altghabons.add(new Altghabon("يَوْمَ يَجْمَعُكُمْ لِيَوْمِ الْجَمْعِ ذَلِكَ يَوْمُ التَّغَابُنِ وَمَنْ يُؤْمِنْ بِاللَّهِ وَيَعْمَلْ صَالِحًا يُكَفِّرْ عَنْهُ سَيِّئَاتِهِ وَيُدْخِلْهُ جَنَّاتٍ تَجْرِي مِنْ تَحْتِهَا الْأَنْهَارُ خَالِدِينَ فِيهَا أَبَدًا ذَلِكَ الْفَوْزُ الْعَظِيمُ (9)"));
        altghabons.add(new Altghabon("وَالَّذِينَ كَفَرُوا وَكَذَّبُوا بِآَيَاتِنَا أُولَئِكَ أَصْحَابُ النَّارِ خَالِدِينَ فِيهَا وَبِئْسَ الْمَصِيرُ (10)"));
        altghabons.add(new Altghabon("مَا أَصَابَ مِنْ مُصِيبَةٍ إِلَّا بِإِذْنِ اللَّهِ وَمَنْ يُؤْمِنْ بِاللَّهِ يَهْدِ قَلْبَهُ وَاللَّهُ بِكُلِّ شَيْءٍ عَلِيمٌ (11)"));
        altghabons.add(new Altghabon("وَأَطِيعُوا اللَّهَ وَأَطِيعُوا الرَّسُولَ فَإِنْ تَوَلَّيْتُمْ فَإِنَّمَا عَلَى رَسُولِنَا الْبَلَاغُ الْمُبِينُ (12)"));
        altghabons.add(new Altghabon("اللَّهُ لَا إِلَهَ إِلَّا هُوَ وَعَلَى اللَّهِ فَلْيَتَوَكَّلِ الْمُؤْمِنُونَ (13)"));
        altghabons.add(new Altghabon(") يَا أَيُّهَا الَّذِينَ آَمَنُوا إِنَّ مِنْ أَزْوَاجِكُمْ وَأَوْلَادِكُمْ عَدُوًّا لَكُمْ فَاحْذَرُوهُمْ وَإِنْ تَعْفُوا وَتَصْفَحُوا وَتَغْفِرُوا فَإِنَّ اللَّهَ غَفُورٌ رَحِيمٌ (14)"));
        altghabons.add(new Altghabon("إِنَّمَا أَمْوَالُكُمْ وَأَوْلَادُكُمْ فِتْنَةٌ وَاللَّهُ عِنْدَهُ أَجْرٌ عَظِيمٌ (15)"));
        altghabons.add(new Altghabon("فَاتَّقُوا اللَّهَ مَا اسْتَطَعْتُمْ وَاسْمَعُوا وَأَطِيعُوا وَأَنْفِقُوا خَيْرًا لِأَنْفُسِكُمْ وَمَنْ يُوقَ شُحَّ نَفْسِهِ فَأُولَئِكَ هُمُ الْمُفْلِحُونَ (16)"));
        altghabons.add(new Altghabon("إِنْ تُقْرِضُوا اللَّهَ قَرْضًا حَسَنًا يُضَاعِفْهُ لَكُمْ وَيَغْفِرْ لَكُمْ وَاللَّهُ شَكُورٌ حَلِيمٌ (17)"));
        altghabons.add(new Altghabon("عَالِمُ الْغَيْبِ وَالشَّهَادَةِ الْعَزِيزُ الْحَكِيمُ (18)"));



        quran_text_64_adapter = new quran_text_64_adapter(altghabons ,QuranText_64Activity.this);

        recyclerView = findViewById(R.id.rv_64);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_64Activity.this));
        recyclerView.setAdapter(quran_text_64_adapter);


    }

}