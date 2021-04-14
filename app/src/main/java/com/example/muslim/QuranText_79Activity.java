package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_79Activity extends AppCompatActivity {

    ArrayList<Alnazeat> alnazeats = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_79_adapter quran_text_79_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_79);

        alnazeats.add(new Alnazeat("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alnazeats.add(new Alnazeat("وَالنَّازِعَاتِ غَرْقًا (1)"));
        alnazeats.add(new Alnazeat("وَالنَّاشِطَاتِ نَشْطًا (2)"));
        alnazeats.add(new Alnazeat("وَالسَّابِحَاتِ سَبْحًا (3)"));
        alnazeats.add(new Alnazeat("فَالسَّابِقَاتِ سَبْقًا (4)"));
        alnazeats.add(new Alnazeat("فَالْمُدَبِّرَاتِ أَمْرًا (5)"));
        alnazeats.add(new Alnazeat("يَوْمَ تَرْجُفُ الرَّاجِفَةُ (6)"));
        alnazeats.add(new Alnazeat("تَتْبَعُهَا الرَّادِفَةُ (7)"));
        alnazeats.add(new Alnazeat("قُلُوبٌ يَوْمَئِذٍ وَاجِفَةٌ (8)"));
        alnazeats.add(new Alnazeat("أَبْصَارُهَا خَاشِعَةٌ (9)"));
        alnazeats.add(new Alnazeat("يَقُولُونَ أَئِنَّا لَمَرْدُودُونَ فِي الْحَافِرَةِ (10)"));
        alnazeats.add(new Alnazeat("أَئِذَا كُنَّا عِظَامًا نَخِرَةً (11)"));
        alnazeats.add(new Alnazeat("قَالُوا تِلْكَ إِذًا كَرَّةٌ خَاسِرَةٌ (12)"));
        alnazeats.add(new Alnazeat("فَإِنَّمَا هِيَ زَجْرَةٌ وَاحِدَةٌ (13)"));
        alnazeats.add(new Alnazeat("فَإِذَا هُمْ بِالسَّاهِرَةِ (14)"));
        alnazeats.add(new Alnazeat("هَلْ أتَاكَ حَدِيثُ مُوسَى (15)"));
        alnazeats.add(new Alnazeat("إِذْ نَادَاهُ رَبُّهُ بِالْوَادِ الْمُقَدَّسِ طُوًى (16)"));
        alnazeats.add(new Alnazeat("اذْهَبْ إِلَى فِرْعَوْنَ إِنَّهُ طَغَى (17)"));
        alnazeats.add(new Alnazeat("فَقُلْ هَلْ لَكَ إِلَى أَنْ تَزَكَّى (18)"));
        alnazeats.add(new Alnazeat("وَأَهْدِيَكَ إِلَى رَبِّكَ فَتَخْشَى (19)"));
        alnazeats.add(new Alnazeat("فَأَرَاهُ الْآَيَةَ الْكُبْرَى (20)"));
        alnazeats.add(new Alnazeat("فَكَذَّبَ وَعَصَى (21)"));
        alnazeats.add(new Alnazeat("ثُمَّ أَدْبَرَ يَسْعَى (22)"));
        alnazeats.add(new Alnazeat("فَحَشَرَ فَنَادَى (23)"));
        alnazeats.add(new Alnazeat("فَقَالَ أَنَا رَبُّكُمُ الْأَعْلَى (24)"));
        alnazeats.add(new Alnazeat("فَأَخَذَهُ اللَّهُ نَكَالَ الْآَخِرَةِ وَالْأُولَى (25)"));
        alnazeats.add(new Alnazeat("إِنَّ فِي ذَلِكَ لَعِبْرَةً لِمَنْ يَخْشَى (26)"));
        alnazeats.add(new Alnazeat("أَأَنْتُمْ أَشَدُّ خَلْقًا أَمِ السَّمَاءُ بَنَاهَا (27)"));
        alnazeats.add(new Alnazeat("رَفَعَ سَمْكَهَا فَسَوَّاهَا (28)"));
        alnazeats.add(new Alnazeat("وَأَغْطَشَ لَيْلَهَا وَأَخْرَجَ ضُحَاهَا (29)"));
        alnazeats.add(new Alnazeat("وَالْأَرْضَ بَعْدَ ذَلِكَ دَحَاهَا (30)"));
        alnazeats.add(new Alnazeat("أَخْرَجَ مِنْهَا مَاءَهَا وَمَرْعَاهَا (31)"));
        alnazeats.add(new Alnazeat("وَالْجِبَالَ أَرْسَاهَا (32)"));
        alnazeats.add(new Alnazeat("مَتَاعًا لَكُمْ وَلِأَنْعَامِكُمْ (33)"));
        alnazeats.add(new Alnazeat("فَإِذَا جَاءَتِ الطَّامَّةُ الْكُبْرَى (34)"));
        alnazeats.add(new Alnazeat("يَوْمَ يَتَذَكَّرُ الْإِنْسَانُ مَا سَعَى (35)"));
        alnazeats.add(new Alnazeat("وَبُرِّزَتِ الْجَحِيمُ لِمَنْ يَرَى (36)"));
        alnazeats.add(new Alnazeat("فَأَمَّا مَنْ طَغَى (37)"));
        alnazeats.add(new Alnazeat("وَآَثَرَ الْحَيَاةَ الدُّنْيَا (38)"));
        alnazeats.add(new Alnazeat("فَإِنَّ الْجَحِيمَ هِيَ الْمَأْوَى (39)"));
        alnazeats.add(new Alnazeat("وَأَمَّا مَنْ خَافَ مَقَامَ رَبِّهِ وَنَهَى النَّفْسَ عَنِ الْهَوَى (40)"));
        alnazeats.add(new Alnazeat("فَإِنَّ الْجَنَّةَ هِيَ الْمَأْوَى (41)"));
        alnazeats.add(new Alnazeat("يَسْأَلُونَكَ عَنِ السَّاعَةِ أَيَّانَ مُرْسَاهَا (42)"));
        alnazeats.add(new Alnazeat("فِيمَ أَنْتَ مِنْ ذِكْرَاهَا (43)"));
        alnazeats.add(new Alnazeat("إِلَى رَبِّكَ مُنْتَهَاهَا (44)"));
        alnazeats.add(new Alnazeat("إِنَّمَا أَنْتَ مُنْذِرُ مَنْ يَخْشَاهَا (45)"));
        alnazeats.add(new Alnazeat("كَأَنَّهُمْ يَوْمَ يَرَوْنَهَا لَمْ يَلْبَثُوا إِلَّا عَشِيَّةً أَوْ ضُحَاهَا (46)"));


        quran_text_79_adapter = new quran_text_79_adapter(alnazeats ,QuranText_79Activity.this);

        recyclerView = findViewById(R.id.rv_79);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_79Activity.this));
        recyclerView.setAdapter(quran_text_79_adapter);


    }

}