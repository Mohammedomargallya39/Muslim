package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_92Activity extends AppCompatActivity {

    ArrayList<AllailEx> allailExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_92_adapter quran_explanation_92_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_92);


        allailExes.add(new AllailEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        allailExes.add(new AllailEx("وَاللَّيْلِ إِذَا يَغْشَى (1)"));
        allailExes.add(new AllailEx("أقسم الله سبحانه بالليل عندما يغطي بظلامه الأرض وما عليها."));
        allailExes.add(new AllailEx("وَالنَّهَارِ إِذَا تَجَلَّى (2)"));
        allailExes.add(new AllailEx("وبالنهار إذا انكشف عن ظلام الليل بضيائه."));
        allailExes.add(new AllailEx("وَمَا خَلَقَ الذَّكَرَ وَالْأُنْثَى (3)"));
        allailExes.add(new AllailEx("وبخلق الزوجين: الذكر والأنثى."));
        allailExes.add(new AllailEx("إِنَّ سَعْيَكُمْ لَشَتَّى (4)"));
        allailExes.add(new AllailEx("إن عملكم لمختلف بين عامل للدنيا وعامل للآخرة."));
        allailExes.add(new AllailEx("فَأَمَّا مَنْ أَعْطَى وَاتَّقَى (5)"));
        allailExes.add(new AllailEx("فأمَّا من بذل من ماله واتقى الله في ذلك."));
        allailExes.add(new AllailEx("وَصَدَّقَ بِالْحُسْنَى (6)"));
        allailExes.add(new AllailEx("دَّق بـ «لا إله إلا الله» وما دلت عليه، وما ترتب عليها من الجزاء."));
        allailExes.add(new AllailEx("فَسَنُيَسِّرُهُ لِلْيُسْرَى (7)"));
        allailExes.add(new AllailEx("فسنرشده ونوفقه إلى أسباب الخير والصلاح ونيسِّر له أموره."));
        allailExes.add(new AllailEx("وَأَمَّا مَنْ بَخِلَ وَاسْتَغْنَى (8)"));
        allailExes.add(new AllailEx("وأما مَن بخل بماله واستغنى عن جزاء ربه."));
        allailExes.add(new AllailEx("وَكَذَّبَ بِالْحُسْنَى (9)"));
        allailExes.add(new AllailEx("وكذَّب بـ «لا إله إلا الله» وما دلت عليه، وما ترتب عليها من الجزاء."));
        allailExes.add(new AllailEx("فَسَنُيَسِّرُهُ لِلْعُسْرَى (10)"));
        allailExes.add(new AllailEx("فسنُيَسِّر له أسباب الشقاء."));
        allailExes.add(new AllailEx("وَمَا يُغْنِي عَنْهُ مَالُهُ إِذَا تَرَدَّى (11)"));
        allailExes.add(new AllailEx("ولا ينفعه ماله الذي بخل به إذا وقع في النار."));
        allailExes.add(new AllailEx("إِنَّ عَلَيْنَا لَلْهُدَى (12)"));
        allailExes.add(new AllailEx("إن علينا بفضلنا وحكمتنا أن نبيِّن طريق الهدى الموصل إلى الله وجنته من طريق الضلال."));
        allailExes.add(new AllailEx("وَإِنَّ لَنَا لَلْآخِرَةَ وَالْأُولَى (13)"));
        allailExes.add(new AllailEx("وإن لنا ملك الحياة الآخرة والحياة الدنيا."));
        allailExes.add(new AllailEx("فَأَنْذَرْتُكُمْ نَارًا تَلَظَّى (14)"));
        allailExes.add(new AllailEx("فحذَّرتكم -أيها الناس- وخوَّفتكم نارًا تتوهج، وهي نار جهنم."));
        allailExes.add(new AllailEx("لَا يَصْلَاهَا إِلَّا الْأَشْقَى (15)"));
        allailExes.add(new AllailEx("لا يدخلها إلا مَن كان شديد الشقاء."));
        allailExes.add(new AllailEx("الَّذِي كَذَّبَ وَتَوَلَّى (16)"));
        allailExes.add(new AllailEx("الذي كذَّب نبي الله محمدًا صلى الله عليه وسلم، وأعرض عن الإيمان بالله ورسوله، وطاعتهما."));
        allailExes.add(new AllailEx("وَسَيُجَنَّبُهَا الْأَتْقَى (17)"));
        allailExes.add(new AllailEx("وسيُزحزَح عنها شديد التقوى."));
        allailExes.add(new AllailEx("الَّذِي يُؤْتِي مَالَهُ يَتَزَكَّى (18)"));
        allailExes.add(new AllailEx("الذي يبذل ماله ابتغاء المزيد من الخير."));
        allailExes.add(new AllailEx("وَمَا لِأَحَدٍ عِنْدَهُ مِنْ نِعْمَةٍ تُجْزَى (19)"));
        allailExes.add(new AllailEx("وليس إنفاقه ذاك مكافأة لمن أسدى إليه معروفا."));
        allailExes.add(new AllailEx("إِلَّا ابْتِغَاءَ وَجْهِ رَبِّهِ الْأَعْلَى (20)"));
        allailExes.add(new AllailEx("لكنه يبتغي بذلك وجه ربه الأعلى ورضاه."));
        allailExes.add(new AllailEx("وَلَسَوْفَ يَرْضَى (21)"));
        allailExes.add(new AllailEx("ولسوف يعطيه الله في الجنة ما يرضى به."));




        quran_explanation_92_adapter = new quran_explanation_92_adapter(allailExes ,QuranExplanation_92Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_92);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_92Activity.this));
        recyclerView.setAdapter(quran_explanation_92_adapter);


    }

}