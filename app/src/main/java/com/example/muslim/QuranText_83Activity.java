package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_83Activity extends AppCompatActivity {

    ArrayList<Almotafefen> almotafefens = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_83_adapter quran_text_83_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_83);

        almotafefens.add(new Almotafefen("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        almotafefens.add(new Almotafefen("وَيْلٌ لِلْمُطَفِّفِينَ (1)"));
        almotafefens.add(new Almotafefen("الَّذِينَ إِذَا اكْتَالُوا عَلَى النَّاسِ يَسْتَوْفُونَ (2)"));
        almotafefens.add(new Almotafefen("وَإِذَا كَالُوهُمْ أَوْ وَزَنُوهُمْ يُخْسِرُونَ (3)"));
        almotafefens.add(new Almotafefen("أَلَا يَظُنُّ أُولَئِكَ أَنَّهُمْ مَبْعُوثُونَ (4)"));
        almotafefens.add(new Almotafefen("لِيَوْمٍ عَظِيمٍ (5)"));
        almotafefens.add(new Almotafefen("يَوْمَ يَقُومُ النَّاسُ لِرَبِّ الْعَالَمِينَ (6)"));
        almotafefens.add(new Almotafefen("كَلَّا إِنَّ كِتَابَ الْفُجَّارِ لَفِي سِجِّينٍ (7)"));
        almotafefens.add(new Almotafefen("وَمَا أَدْرَاكَ مَا سِجِّينٌ (8)"));
        almotafefens.add(new Almotafefen("كِتَابٌ مَرْقُومٌ (9)"));
        almotafefens.add(new Almotafefen("وَيْلٌ يَوْمَئِذٍ لِلْمُكَذِّبِينَ (10)"));
        almotafefens.add(new Almotafefen("الَّذِينَ يُكَذِّبُونَ بِيَوْمِ الدِّينِ (11)"));
        almotafefens.add(new Almotafefen("وَمَا يُكَذِّبُ بِهِ إِلَّا كُلُّ مُعْتَدٍ أَثِيمٍ (12)"));
        almotafefens.add(new Almotafefen("إِذَا تُتْلَى عَلَيْهِ آَيَاتُنَا قَالَ أَسَاطِيرُ الْأَوَّلِينَ (13)"));
        almotafefens.add(new Almotafefen("كَلَّا بَلْ رَانَ عَلَى قُلُوبِهِمْ مَا كَانُوا يَكْسِبُونَ (14)"));
        almotafefens.add(new Almotafefen("كَلَّا إِنَّهُمْ عَنْ رَبِّهِمْ يَوْمَئِذٍ لَمَحْجُوبُونَ (15)"));
        almotafefens.add(new Almotafefen("ثُمَّ إِنَّهُمْ لَصَالُو الْجَحِيمِ (16)"));
        almotafefens.add(new Almotafefen("ثُمَّ يُقَالُ هَذَا الَّذِي كُنْتُمْ بِهِ تُكَذِّبُونَ (17)"));
        almotafefens.add(new Almotafefen("كَلَّا إِنَّ كِتَابَ الْأَبْرَارِ لَفِي عِلِّيِّينَ (18)"));
        almotafefens.add(new Almotafefen("وَمَا أَدْرَاكَ مَا عِلِّيُّونَ (19)"));
        almotafefens.add(new Almotafefen("كِتَابٌ مَرْقُومٌ (20)"));
        almotafefens.add(new Almotafefen("يَشْهَدُهُ الْمُقَرَّبُونَ (21)"));
        almotafefens.add(new Almotafefen("إِنَّ الْأَبْرَارَ لَفِي نَعِيمٍ (22)"));
        almotafefens.add(new Almotafefen("عَلَى الْأَرَائِكِ يَنْظُرُونَ (23)"));
        almotafefens.add(new Almotafefen("تَعْرِفُ فِي وُجُوهِهِمْ نَضْرَةَ النَّعِيمِ (24)"));
        almotafefens.add(new Almotafefen("يُسْقَوْنَ مِنْ رَحِيقٍ مَخْتُومٍ (25)"));
        almotafefens.add(new Almotafefen("خِتَامُهُ مِسْكٌ وَفِي ذَلِكَ فَلْيَتَنَافَسِ الْمُتَنَافِسُونَ (26)"));
        almotafefens.add(new Almotafefen("وَمِزَاجُهُ مِنْ تَسْنِيمٍ (27)"));
        almotafefens.add(new Almotafefen("عَيْنًا يَشْرَبُ بِهَا الْمُقَرَّبُونَ (28)"));
        almotafefens.add(new Almotafefen("إِنَّ الَّذِينَ أَجْرَمُوا كَانُوا مِنَ الَّذِينَ آَمَنُوا يَضْحَكُونَ (29)"));
        almotafefens.add(new Almotafefen("وَإِذَا مَرُّوا بِهِمْ يَتَغَامَزُونَ (30)"));
        almotafefens.add(new Almotafefen("وَإِذَا انْقَلَبُوا إِلَى أَهْلِهِمُ انْقَلَبُوا فَكِهِينَ (31)"));
        almotafefens.add(new Almotafefen("وَإِذَا رَأَوْهُمْ قَالُوا إِنَّ هَؤُلَاءِ لَضَالُّونَ (32)"));
        almotafefens.add(new Almotafefen("وَمَا أُرْسِلُوا عَلَيْهِمْ حَافِظِينَ (33)"));
        almotafefens.add(new Almotafefen("فَالْيَوْمَ الَّذِينَ آَمَنُوا مِنَ الْكُفَّارِ يَضْحَكُونَ (34)"));
        almotafefens.add(new Almotafefen("عَلَى الْأَرَائِكِ يَنْظُرُونَ (35)"));
        almotafefens.add(new Almotafefen("هَلْ ثُوِّبَ الْكُفَّارُ مَا كَانُوا يَفْعَلُونَ (36)"));

        quran_text_83_adapter = new quran_text_83_adapter(almotafefens ,QuranText_83Activity.this);

        recyclerView = findViewById(R.id.rv_83);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_83Activity.this));
        recyclerView.setAdapter(quran_text_83_adapter);


    }

}