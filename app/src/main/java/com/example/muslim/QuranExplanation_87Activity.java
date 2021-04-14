package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_87Activity extends AppCompatActivity {

    ArrayList<AlaalaEx> alaalaExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_87_adapter quran_explanation_87_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_87);

        alaalaExes.add(new AlaalaEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alaalaExes.add(new AlaalaEx("سَبِّحِ اسْمَ رَبِّكَ الْأَعْلَى (1)"));
        alaalaExes.add(new AlaalaEx("نَزِّه اسم ربك الأعلى عن الشريك والنقائص تنزيهًا يليق بعظمته سبحانه."));
        alaalaExes.add(new AlaalaEx("الَّذِي خَلَقَ فَسَوَّى (2)"));
        alaalaExes.add(new AlaalaEx("الذي خلق المخلوقات، فأتقن خلقها، وأحسنه."));
        alaalaExes.add(new AlaalaEx("وَالَّذِي قَدَّرَ فَهَدَى (3)"));
        alaalaExes.add(new AlaalaEx("والذي قدَّر جميع المقدرات، فهدى كل خلق إلى ما يناسبه."));
        alaalaExes.add(new AlaalaEx("وَالَّذِي أَخْرَجَ الْمَرْعَى (4)"));
        alaalaExes.add(new AlaalaEx("والذي أنبت الكلأ الأخضر."));
        alaalaExes.add(new AlaalaEx("فَجَعَلَهُ غُثَاءً أَحْوَى (5)"));
        alaalaExes.add(new AlaalaEx("فجعله بعد ذلك هشيمًا جافًا متغيرًا إلى السَّواد بعد اخضراره."));
        alaalaExes.add(new AlaalaEx("سَنُقْرِئُكَ فَلَا تَنْسَى (6)"));
        alaalaExes.add(new AlaalaEx("سنقرئك -أيها الرسول- هذا القرآن قراءة لا تنساها."));
        alaalaExes.add(new AlaalaEx("إِلَّا مَا شَاءَ اللَّهُ إِنَّهُ يَعْلَمُ الْجَهْرَ وَمَا يَخْفَى (7)"));
        alaalaExes.add(new AlaalaEx("إلا ما شاء الله مما اقتضت حكمته أن ينسيه لمصلحة يعلمها. إنه -سبحانه- يعلم الجهر من القول والعمل، وما يخفى منهما."));
        alaalaExes.add(new AlaalaEx("وَنُيَسِّرُكَ لِلْيُسْرَى (8)"));
        alaalaExes.add(new AlaalaEx("ونيسرك لليسرى في جميع أمورك، ومن ذلك تسهيل تَلَقِّي أعباء الرسالة، وجعل دينك يسرًا لا عسر فيه."));
        alaalaExes.add(new AlaalaEx("فَذَكِّرْ إِنْ نَفَعَتِ الذِّكْرَى (9)"));
        alaalaExes.add(new AlaalaEx("فعظ قومك -أيها الرسول- حسبما يسرناه لك بما يوحى إليك، واهدهم إلى ما فيه خيرهم. وخُصَّ بالتذكير من يرجى منه التذكُّر."));
        alaalaExes.add(new AlaalaEx("سَيَذَّكَّرُ مَنْ يَخْشَى (10)"));
        alaalaExes.add(new AlaalaEx("ولا تتعب نفسك في تذكير من لا يورثه التذكر إلا عتوًّا ونفورًا. سيتعظ الذي يخاف ربه."));
        alaalaExes.add(new AlaalaEx("وَيَتَجَنَّبُهَا الْأَشْقَى (11)"));
        alaalaExes.add(new AlaalaEx("ويبتعد عن الذكرى الأشقى الذي لا يخشى ربه."));
        alaalaExes.add(new AlaalaEx("الَّذِي يَصْلَى النَّارَ الْكُبْرَى (12)"));
        alaalaExes.add(new AlaalaEx("الذي سيدخل نار جهنم العظمى يقاسي حرَّها."));
        alaalaExes.add(new AlaalaEx("ثُمَّ لَا يَمُوتُ فِيهَا وَلَا يَحْيَى (13)"));
        alaalaExes.add(new AlaalaEx("ثم لا يموت فيها فيستريح، ولا يحيا حياة تنفعه."));
        alaalaExes.add(new AlaalaEx("قَدْ أَفْلَحَ مَنْ تَزَكَّى (14)"));
        alaalaExes.add(new AlaalaEx("قد فاز مَن طهر نفسه من الأخلاق السيئة."));
        alaalaExes.add(new AlaalaEx("وَذَكَرَ اسْمَ رَبِّهِ فَصَلَّى (15)"));
        alaalaExes.add(new AlaalaEx("وذكر الله، فوحَّده ودعاه وعمل بما يرضيه، وأقام الصلاة في أوقاتها؛ ابتغاء رضوان الله وامتثالا لشرعه."));
        alaalaExes.add(new AlaalaEx("بَلْ تُؤْثِرُونَ الْحَيَاةَ الدُّنْيَا (16)"));
        alaalaExes.add(new AlaalaEx("إنكم -أيها الناس- تفضِّلون زينة الحياة الدنيا على نعيم الآخرة."));
        alaalaExes.add(new AlaalaEx("وَالْآخِرَةُ خَيْرٌ وَأَبْقَى (17)"));
        alaalaExes.add(new AlaalaEx("والدار الآخرة بما فيها من النعيم المقيم، خير من الدنيا وأبقى."));
        alaalaExes.add(new AlaalaEx("إِنَّ هَذَا لَفِي الصُّحُفِ الْأُولَى (18)"));
        alaalaExes.add(new AlaalaEx("إن ما أخبرتم به في هذه السورة هو مما ثبت معناه في الصُّحف التي أنزلت قبل القرآن."));
        alaalaExes.add(new AlaalaEx("صُحُفِ إِبْرَاهِيمَ وَمُوسَى (19)"));
        alaalaExes.add(new AlaalaEx("وهي صُحف إبراهيم وموسى عليهما السلام."));


        quran_explanation_87_adapter = new quran_explanation_87_adapter(alaalaExes ,QuranExplanation_87Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_87);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_87Activity.this));
        recyclerView.setAdapter(quran_explanation_87_adapter);


    }

}