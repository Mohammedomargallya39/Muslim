package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranText_56Activity extends AppCompatActivity {

    ArrayList<Alwakeaa> alwakeaas = new ArrayList<>();
    RecyclerView recyclerView;
    quran_text_56_adapter quran_text_56_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text_56);

        alwakeaas.add(new Alwakeaa("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alwakeaas.add(new Alwakeaa("إِذَا وَقَعَتِ الْوَاقِعَةُ (1)"));
        alwakeaas.add(new Alwakeaa("لَيْسَ لِوَقْعَتِهَا كَاذِبَةٌ (2)"));
        alwakeaas.add(new Alwakeaa("خَافِضَةٌ رَافِعَةٌ (3)"));
        alwakeaas.add(new Alwakeaa("إِذَا رُجَّتِ الْأَرْضُ رَجًّا (4)"));
        alwakeaas.add(new Alwakeaa("وَبُسَّتِ الْجِبَالُ بَسًّا (5)"));
        alwakeaas.add(new Alwakeaa("فَكَانَتْ هَبَاءً مُنْبَثًّا (6)"));
        alwakeaas.add(new Alwakeaa("وَكُنْتُمْ أَزْوَاجًا ثَلَاثَةً (7)"));
        alwakeaas.add(new Alwakeaa("فَأَصْحَابُ الْمَيْمَنَةِ مَا أَصْحَابُ الْمَيْمَنَةِ (8)"));
        alwakeaas.add(new Alwakeaa("وَأَصْحَابُ الْمَشْأَمَةِ مَا أَصْحَابُ الْمَشْأَمَةِ (9)"));
        alwakeaas.add(new Alwakeaa("وَالسَّابِقُونَ السَّابِقُونَ (10)"));
        alwakeaas.add(new Alwakeaa("أُولَئِكَ الْمُقَرَّبُونَ (11)"));
        alwakeaas.add(new Alwakeaa("فِي جَنَّاتِ النَّعِيمِ (12)"));
        alwakeaas.add(new Alwakeaa("ثُلَّةٌ مِنَ الْأَوَّلِينَ (13)"));
        alwakeaas.add(new Alwakeaa("وَقَلِيلٌ مِنَ الْآَخِرِينَ (14)"));
        alwakeaas.add(new Alwakeaa("عَلَى سُرُرٍ مَوْضُونَةٍ (15)"));
        alwakeaas.add(new Alwakeaa("مُتَّكِئِينَ عَلَيْهَا مُتَقَابِلِينَ (16)"));
        alwakeaas.add(new Alwakeaa("يَطُوفُ عَلَيْهِمْ وِلْدَانٌ مُخَلَّدُونَ (17)"));
        alwakeaas.add(new Alwakeaa("بِأَكْوَابٍ وَأَبَارِيقَ وَكَأْسٍ مِنْ مَعِينٍ (18)"));
        alwakeaas.add(new Alwakeaa("لَا يُصَدَّعُونَ عَنْهَا وَلَا يُنْزِفُونَ (19)"));
        alwakeaas.add(new Alwakeaa("وَفَاكِهَةٍ مِمَّا يَتَخَيَّرُونَ (20)"));
        alwakeaas.add(new Alwakeaa("وَلَحْمِ طَيْرٍ مِمَّا يَشْتَهُونَ (21)"));
        alwakeaas.add(new Alwakeaa("وَحُورٌ عِينٌ (22)"));
        alwakeaas.add(new Alwakeaa("كَأَمْثَالِ اللُّؤْلُؤِ الْمَكْنُونِ (23)"));
        alwakeaas.add(new Alwakeaa("جَزَاءً بِمَا كَانُوا يَعْمَلُونَ (24)"));
        alwakeaas.add(new Alwakeaa("لَا يَسْمَعُونَ فِيهَا لَغْوًا وَلَا تَأْثِيمًا (25)"));
        alwakeaas.add(new Alwakeaa("إِلَّا قِيلًا سَلَامًا سَلَامًا (26)"));
        alwakeaas.add(new Alwakeaa("وَأَصْحَابُ الْيَمِينِ مَا أَصْحَابُ الْيَمِينِ (27)"));
        alwakeaas.add(new Alwakeaa("فِي سِدْرٍ مَخْضُودٍ (28)"));
        alwakeaas.add(new Alwakeaa("وَطَلْحٍ مَنْضُودٍ (29)"));
        alwakeaas.add(new Alwakeaa("وَظِلٍّ مَمْدُودٍ (30)"));
        alwakeaas.add(new Alwakeaa("وَمَاءٍ مَسْكُوبٍ (31)"));
        alwakeaas.add(new Alwakeaa("وَفَاكِهَةٍ كَثِيرَةٍ (32)"));
        alwakeaas.add(new Alwakeaa("لَا مَقْطُوعَةٍ وَلَا مَمْنُوعَةٍ (33)"));
        alwakeaas.add(new Alwakeaa("وَفُرُشٍ مَرْفُوعَةٍ (34)"));
        alwakeaas.add(new Alwakeaa("إِنَّا أَنْشَأْنَاهُنَّ إِنْشَاءً (35)"));
        alwakeaas.add(new Alwakeaa("فَجَعَلْنَاهُنَّ أَبْكَارًا (36)"));
        alwakeaas.add(new Alwakeaa("عُرُبًا أَتْرَابًا (37)"));
        alwakeaas.add(new Alwakeaa("لِأَصْحَابِ الْيَمِينِ (38)"));
        alwakeaas.add(new Alwakeaa("ثُلَّةٌ مِنَ الْأَوَّلِينَ (39)"));
        alwakeaas.add(new Alwakeaa("وَثُلَّةٌ مِنَ الْآَخِرِينَ (40)"));
        alwakeaas.add(new Alwakeaa("وَأَصْحَابُ الشِّمَالِ مَا أَصْحَابُ الشِّمَالِ (41)"));
        alwakeaas.add(new Alwakeaa("فِي سَمُومٍ وَحَمِيمٍ (42)"));
        alwakeaas.add(new Alwakeaa("وَظِلٍّ مِنْ يَحْمُومٍ (43)"));
        alwakeaas.add(new Alwakeaa("لَا بَارِدٍ وَلَا كَرِيمٍ (44)"));
        alwakeaas.add(new Alwakeaa("إِنَّهُمْ كَانُوا قَبْلَ ذَلِكَ مُتْرَفِينَ (45)"));
        alwakeaas.add(new Alwakeaa("وَكَانُوا يُصِرُّونَ عَلَى الْحِنْثِ الْعَظِيمِ (46)"));
        alwakeaas.add(new Alwakeaa("وَكَانُوا يَقُولُونَ أَئِذَا مِتْنَا وَكُنَّا تُرَابًا وَعِظَامًا أَئِنَّا لَمَبْعُوثُونَ (47)"));
        alwakeaas.add(new Alwakeaa("أَوَآَبَاؤُنَا الْأَوَّلُونَ (48)"));
        alwakeaas.add(new Alwakeaa("قُلْ إِنَّ الْأَوَّلِينَ وَالْآَخِرِينَ (49)"));
        alwakeaas.add(new Alwakeaa("لَمَجْمُوعُونَ إِلَى مِيقَاتِ يَوْمٍ مَعْلُومٍ (50)"));
        alwakeaas.add(new Alwakeaa("ثُمَّ إِنَّكُمْ أَيُّهَا الضَّالُّونَ الْمُكَذِّبُونَ (51)"));
        alwakeaas.add(new Alwakeaa("لَآَكِلُونَ مِنْ شَجَرٍ مِنْ زَقُّومٍ (52)"));
        alwakeaas.add(new Alwakeaa("فَمَالِئُونَ مِنْهَا الْبُطُونَ (53)"));
        alwakeaas.add(new Alwakeaa("فَشَارِبُونَ عَلَيْهِ مِنَ الْحَمِيمِ (54)"));
        alwakeaas.add(new Alwakeaa("فَشَارِبُونَ شُرْبَ الْهِيمِ (55)"));
        alwakeaas.add(new Alwakeaa("هَذَا نُزُلُهُمْ يَوْمَ الدِّينِ (56)"));
        alwakeaas.add(new Alwakeaa("نَحْنُ خَلَقْنَاكُمْ فَلَوْلَا تُصَدِّقُونَ (57)"));
        alwakeaas.add(new Alwakeaa("أَفَرَأَيْتُمْ مَا تُمْنُونَ (58)"));
        alwakeaas.add(new Alwakeaa("أَأَنْتُمْ تَخْلُقُونَهُ أَمْ نَحْنُ الْخَالِقُونَ (59)"));
        alwakeaas.add(new Alwakeaa("نَحْنُ قَدَّرْنَا بَيْنَكُمُ الْمَوْتَ وَمَا نَحْنُ بِمَسْبُوقِينَ (60)"));
        alwakeaas.add(new Alwakeaa("عَلَى أَنْ نُبَدِّلَ أَمْثَالَكُمْ وَنُنْشِئَكُمْ فِي مَا لَا تَعْلَمُونَ (61)"));
        alwakeaas.add(new Alwakeaa("وَلَقَدْ عَلِمْتُمُ النَّشْأَةَ الْأُولَى فَلَوْلَا تَذَكَّرُونَ (62)"));
        alwakeaas.add(new Alwakeaa("أَفَرَأَيْتُمْ مَا تَحْرُثُونَ (63)"));
        alwakeaas.add(new Alwakeaa("أَأَنْتُمْ تَزْرَعُونَهُ أَمْ نَحْنُ الزَّارِعُونَ (64)"));
        alwakeaas.add(new Alwakeaa("لَوْ نَشَاءُ لَجَعَلْنَاهُ حُطَامًا فَظَلْتُمْ تَفَكَّهُونَ (65)"));
        alwakeaas.add(new Alwakeaa("إِنَّا لَمُغْرَمُونَ (66)"));
        alwakeaas.add(new Alwakeaa("بَلْ نَحْنُ مَحْرُومُونَ (67)"));
        alwakeaas.add(new Alwakeaa("أَفَرَأَيْتُمُ الْمَاءَ الَّذِي تَشْرَبُونَ (68)"));
        alwakeaas.add(new Alwakeaa("أَأَنْتُمْ أَنْزَلْتُمُوهُ مِنَ الْمُزْنِ أَمْ نَحْنُ الْمُنْزِلُونَ (69)"));
        alwakeaas.add(new Alwakeaa("لَوْ نَشَاءُ جَعَلْنَاهُ أُجَاجًا فَلَوْلَا تَشْكُرُونَ (70)"));
        alwakeaas.add(new Alwakeaa("أَفَرَأَيْتُمُ النَّارَ الَّتِي تُورُونَ (71)"));
        alwakeaas.add(new Alwakeaa("أَأَنْتُمْ أَنْشَأْتُمْ شَجَرَتَهَا أَمْ نَحْنُ الْمُنْشِئُونَ (72)"));
        alwakeaas.add(new Alwakeaa("نَحْنُ جَعَلْنَاهَا تَذْكِرَةً وَمَتَاعًا لِلْمُقْوِينَ (73)"));
        alwakeaas.add(new Alwakeaa("فَسَبِّحْ بِاسْمِ رَبِّكَ الْعَظِيمِ (74)"));
        alwakeaas.add(new Alwakeaa("فَلَا أُقْسِمُ بِمَوَاقِعِ النُّجُومِ (75)"));
        alwakeaas.add(new Alwakeaa("وَإِنَّهُ لَقَسَمٌ لَوْ تَعْلَمُونَ عَظِيمٌ (76)"));
        alwakeaas.add(new Alwakeaa("إِنَّهُ لَقُرْآَنٌ كَرِيمٌ (77)"));
        alwakeaas.add(new Alwakeaa("فِي كِتَابٍ مَكْنُونٍ (78)"));
        alwakeaas.add(new Alwakeaa("لَا يَمَسُّهُ إِلَّا الْمُطَهَّرُونَ (79)"));
        alwakeaas.add(new Alwakeaa("تَنْزِيلٌ مِنْ رَبِّ الْعَالَمِينَ (80)"));
        alwakeaas.add(new Alwakeaa("أَفَبِهَذَا الْحَدِيثِ أَنْتُمْ مُدْهِنُونَ (81)"));
        alwakeaas.add(new Alwakeaa("وَتَجْعَلُونَ رِزْقَكُمْ أَنَّكُمْ تُكَذِّبُونَ (82)"));
        alwakeaas.add(new Alwakeaa("فَلَوْلَا إِذَا بَلَغَتِ الْحُلْقُومَ (83)"));
        alwakeaas.add(new Alwakeaa("وَأَنْتُمْ حِينَئِذٍ تَنْظُرُونَ (84)"));
        alwakeaas.add(new Alwakeaa("وَنَحْنُ أَقْرَبُ إِلَيْهِ مِنْكُمْ وَلَكِنْ لَا تُبْصِرُونَ (85)"));
        alwakeaas.add(new Alwakeaa("فَلَوْلَا إِنْ كُنْتُمْ غَيْرَ مَدِينِينَ (86)"));
        alwakeaas.add(new Alwakeaa("تَرْجِعُونَهَا إِنْ كُنْتُمْ صَادِقِينَ (87)"));
        alwakeaas.add(new Alwakeaa("فَأَمَّا إِنْ كَانَ مِنَ الْمُقَرَّبِينَ (88)"));
        alwakeaas.add(new Alwakeaa("فَرَوْحٌ وَرَيْحَانٌ وَجَنَّةُ نَعِيمٍ (89)"));
        alwakeaas.add(new Alwakeaa("وَأَمَّا إِنْ كَانَ مِنْ أَصْحَابِ الْيَمِينِ (90)"));
        alwakeaas.add(new Alwakeaa("فَسَلَامٌ لَكَ مِنْ أَصْحَابِ الْيَمِينِ (91)"));
        alwakeaas.add(new Alwakeaa("وَأَمَّا إِنْ كَانَ مِنَ الْمُكَذِّبِينَ الضَّالِّينَ (92)"));
        alwakeaas.add(new Alwakeaa("فَنُزُلٌ مِنْ حَمِيمٍ (93)"));
        alwakeaas.add(new Alwakeaa("وَتَصْلِيَةُ جَحِيمٍ (94)"));
        alwakeaas.add(new Alwakeaa("نَّ هَذَا لَهُوَ حَقُّ الْيَقِينِ (95)"));
        alwakeaas.add(new Alwakeaa("فَسَبِّحْ بِاسْمِ رَبِّكَ الْعَظِيمِ (96)"));



        quran_text_56_adapter = new quran_text_56_adapter(alwakeaas ,QuranText_56Activity.this);

        recyclerView = findViewById(R.id.rv_56);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranText_56Activity.this));
        recyclerView.setAdapter(quran_text_56_adapter);


    }

}