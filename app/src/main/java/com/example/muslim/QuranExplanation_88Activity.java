package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_88Activity extends AppCompatActivity {

    ArrayList<AlghashiaEx> alghashiaExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_88_adapter quran_explanation_88_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_88);

        alghashiaExes.add(new AlghashiaEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alghashiaExes.add(new AlghashiaEx("هَلْ أَتَاكَ حَدِيثُ الْغَاشِيَةِ (1)"));
        alghashiaExes.add(new AlghashiaEx("هل أتاك -أيها الرسول- خبر القيامة التي تغشى الناس بأهوالها؟"));
        alghashiaExes.add(new AlghashiaEx("وُجُوهٌ يَوْمَئِذٍ خَاشِعَةٌ (2)"));
        alghashiaExes.add(new AlghashiaEx("وجوه الكفار يومئذ ذليلة بالعذاب."));
        alghashiaExes.add(new AlghashiaEx("عَامِلَةٌ نَاصِبَةٌ (3)"));
        alghashiaExes.add(new AlghashiaEx("مجهدة بالعمل متعبة."));
        alghashiaExes.add(new AlghashiaEx("تَصْلَى نَارًا حَامِيَةً (4)"));
        alghashiaExes.add(new AlghashiaEx("تصيبها نار شديدة التوهج."));
        alghashiaExes.add(new AlghashiaEx("تُسْقَى مِنْ عَيْنٍ آنِيَةٍ (5)"));
        alghashiaExes.add(new AlghashiaEx("تُسقى من عين بلغت منتهى الحرارة."));
        alghashiaExes.add(new AlghashiaEx("لَيْسَ لَهُمْ طَعَامٌ إِلَّا مِنْ ضَرِيعٍ (6)"));
        alghashiaExes.add(new AlghashiaEx("ليس لأصحاب النار طعام إلا من نبت ذي شوك لاصق بالأرض، وهو مِن شر الطعام وأخبثه."));
        alghashiaExes.add(new AlghashiaEx("لَا يُسْمِنُ وَلَا يُغْنِي مِنْ جُوعٍ (7)"));
        alghashiaExes.add(new AlghashiaEx("لا يُسْمن بدن صاحبه من الهُزال، ولا يسدُّ جوعه ورمقه."));
        alghashiaExes.add(new AlghashiaEx("وُجُوهٌ يَوْمَئِذٍ نَاعِمَةٌ (8)"));
        alghashiaExes.add(new AlghashiaEx("وجوه المؤمنين يوم القيامة ذات نعمة."));
        alghashiaExes.add(new AlghashiaEx("لِسَعْيِهَا رَاضِيَةٌ (9)."));
        alghashiaExes.add(new AlghashiaEx("لسعيها في الدنيا بالطاعات راضية في الآخرة."));
        alghashiaExes.add(new AlghashiaEx("فِي جَنَّةٍ عَالِيَةٍ (10)"));
        alghashiaExes.add(new AlghashiaEx("في جنة رفيعة المكان والمكانة."));
        alghashiaExes.add(new AlghashiaEx("لَا تَسْمَعُ فِيهَا لَاغِيَةً (11)"));
        alghashiaExes.add(new AlghashiaEx("لا تسمع فيها كلمة لغو واحدة."));
        alghashiaExes.add(new AlghashiaEx("فِيهَا عَيْنٌ جَارِيَةٌ (12)"));
        alghashiaExes.add(new AlghashiaEx("فيها عين تتدفق مياهها."));
        alghashiaExes.add(new AlghashiaEx("فِيهَا سُرُرٌ مَرْفُوعَةٌ (13)"));
        alghashiaExes.add(new AlghashiaEx("فيها سرر عالية."));
        alghashiaExes.add(new AlghashiaEx("وَأَكْوَابٌ مَوْضُوعَةٌ (14)"));
        alghashiaExes.add(new AlghashiaEx("اب معدة للشاربين."));
        alghashiaExes.add(new AlghashiaEx("وَنَمَارِقُ مَصْفُوفَةٌ (15)"));
        alghashiaExes.add(new AlghashiaEx("ووسائد مصفوفة، الواحدة جنب الأخرى."));
        alghashiaExes.add(new AlghashiaEx("وَزَرَابِيُّ مَبْثُوثَةٌ (16)"));
        alghashiaExes.add(new AlghashiaEx("وبُسُط كثيرة مفروشة."));
        alghashiaExes.add(new AlghashiaEx("أَفَلَا يَنْظُرُونَ إِلَى الْإِبِلِ كَيْفَ خُلِقَتْ (17)"));
        alghashiaExes.add(new AlghashiaEx("أفلا ينظر الكافرون المكذِّبون إلى الإبل: كيف خُلِقَت هذا الخلق العجيب؟"));
        alghashiaExes.add(new AlghashiaEx("وَإِلَى السَّمَاءِ كَيْفَ رُفِعَتْ (18)"));
        alghashiaExes.add(new AlghashiaEx("وإلى السماء كيف رُفِعَت هذا الرَّفع البديع؟"));
        alghashiaExes.add(new AlghashiaEx("وَإِلَى الْجِبَالِ كَيْفَ نُصِبَتْ (19)"));
        alghashiaExes.add(new AlghashiaEx("وإلى الجبال كيف نُصبت، فحصل بها الثبات للأرض والاستقرار؟"));
        alghashiaExes.add(new AlghashiaEx("وَإِلَى الْأَرْضِ كَيْفَ سُطِحَتْ (20)"));
        alghashiaExes.add(new AlghashiaEx("وإلى الأرض كيف بُسِطت ومُهِّدت؟"));
        alghashiaExes.add(new AlghashiaEx("فَذَكِّرْ إِنَّمَا أَنْتَ مُذَكِّرٌ (21)"));
        alghashiaExes.add(new AlghashiaEx("فعِظْ -أيها الرسول- المعرضين بما أُرْسِلْتَ به إليهم، ولا تحزن على إعراضهم، إنما أنت واعظ لهم."));
        alghashiaExes.add(new AlghashiaEx("لَسْتَ عَلَيْهِمْ بِمُصَيْطِرٍ (22)"));
        alghashiaExes.add(new AlghashiaEx("ليس عليك إكراههم على الإيمان."));
        alghashiaExes.add(new AlghashiaEx("إِلَّا مَنْ تَوَلَّى وَكَفَرَ (23)"));
        alghashiaExes.add(new AlghashiaEx("لكن الذي أعرض عن التذكير والموعظة وأصرَّ على كفره."));
        alghashiaExes.add(new AlghashiaEx("فَيُعَذِّبُهُ اللَّهُ الْعَذَابَ الْأَكْبَرَ (24)"));
        alghashiaExes.add(new AlghashiaEx("فيعذبه الله العذاب الشديد في النار."));
        alghashiaExes.add(new AlghashiaEx("إِنَّ إِلَيْنَا إِيَابَهُمْ (25)"));
        alghashiaExes.add(new AlghashiaEx("إنَّ إلينا مرجعهم بعد الموت."));
        alghashiaExes.add(new AlghashiaEx("ثُمَّ إِنَّ عَلَيْنَا حِسَابَهُمْ (26)"));
        alghashiaExes.add(new AlghashiaEx("ثم إن علينا جزاءهم على ما عملوا."));

        quran_explanation_88_adapter = new quran_explanation_88_adapter(alghashiaExes ,QuranExplanation_88Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_88);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_88Activity.this));
        recyclerView.setAdapter(quran_explanation_88_adapter);


    }

}