package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_86Activity extends AppCompatActivity {

    ArrayList<AltareqEx> altareqExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_86_adapter quran_explanation_86_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_86);

        altareqExes.add(new AltareqEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        altareqExes.add(new AltareqEx("وَالسَّمَاءِ وَالطَّارِقِ (1)"));
        altareqExes.add(new AltareqEx("أقسم الله سبحانه بالسماء والنجم الذي يطرق ليلا."));
        altareqExes.add(new AltareqEx("وَمَا أَدْرَاكَ مَا الطَّارِقُ (2)"));
        altareqExes.add(new AltareqEx("وما أدراك ما عِظَمُ هذا النجم؟"));
        altareqExes.add(new AltareqEx("النَّجْمُ الثَّاقِبُ (3)"));
        altareqExes.add(new AltareqEx("هو النجم المضيء المتوهِّج."));
        altareqExes.add(new AltareqEx("إِنْ كُلُّ نَفْسٍ لَمَّا عَلَيْهَا حَافِظٌ (4)"));
        altareqExes.add(new AltareqEx("ما كل نفس إلا أوكل بها مَلَك رقيب يحفظ عليها أعمالها؛ لتحاسب عليها يوم القيامة."));
        altareqExes.add(new AltareqEx("فَلْيَنْظُرِ الْإِنْسَانُ مِمَّ خُلِقَ (5)"));
        altareqExes.add(new AltareqEx("فلينظر الإنسان المنكر للبعث مِمَّ خُلِقَ؟"));
        altareqExes.add(new AltareqEx("خُلِقَ مِنْ مَاءٍ دَافِقٍ (6)"));
        altareqExes.add(new AltareqEx("ليعلم أن إعادة خلق الإنسان ليست أصعب من خلقه."));
        altareqExes.add(new AltareqEx("يَخْرُجُ مِنْ بَيْنِ الصُّلْبِ وَالتَّرَائِبِ (7)"));
        altareqExes.add(new AltareqEx("أوّلا خلق من منيٍّ منصبٍّ بسرعة في الرحم، يخرج من بين صلب الرجل وصدر المرأة."));
        altareqExes.add(new AltareqEx("إِنَّهُ عَلَى رَجْعِهِ لَقَادِرٌ (8)"));
        altareqExes.add(new AltareqEx("إن الذي خلق الإنسان من هذا الماء لَقادر على رجعه إلى الحياة بعد الموت."));
        altareqExes.add(new AltareqEx("يَوْمَ تُبْلَى السَّرَائِرُ (9)"));
        altareqExes.add(new AltareqEx("يوم تُخْتَبر السرائر فيما أخفته، ويُمَيَّز الصالح منها من الفاسد."));
        altareqExes.add(new AltareqEx("فَمَا لَهُ مِنْ قُوَّةٍ وَلَا نَاصِرٍ (10)"));
        altareqExes.add(new AltareqEx("فما للإنسان من قوة يدفع بها عن نفسه، وما له من ناصر يدفع عنه عذاب الله."));
        altareqExes.add(new AltareqEx("وَالسَّمَاءِ ذَاتِ الرَّجْعِ (11)"));
        altareqExes.add(new AltareqEx("والسماء ذات المطر المتكرر."));
        altareqExes.add(new AltareqEx("وَالْأَرْضِ ذَاتِ الصَّدْعِ (12)"));
        altareqExes.add(new AltareqEx("والأرض ذات التشقق بما يتخللها من نبات."));
        altareqExes.add(new AltareqEx("إِنَّهُ لَقَوْلٌ فَصْلٌ (13)"));
        altareqExes.add(new AltareqEx("إن القرآن لقول فصل بَيْنَ الحق والباطل."));
        altareqExes.add(new AltareqEx("وَمَا هُوَ بِالْهَزْلِ (14)"));
        altareqExes.add(new AltareqEx("وما هو بالهزل. ولا يجوز للمخلوق أن يقسم بغير الله، وإلا فقد أشرك."));
        altareqExes.add(new AltareqEx("إِنَّهُمْ يَكِيدُونَ كَيْدًا (15)"));
        altareqExes.add(new AltareqEx("إن المكذبين للرسول صلى الله عليه وسلم، وللقرآن، يكيدون ويدبرون؛ ليدفعوا بكيدهم الحق ويؤيدوا الباطل."));
        altareqExes.add(new AltareqEx("وَأَكِيدُ كَيْدًا (16)"));
        altareqExes.add(new AltareqEx("وأكيد كيدًا لإظهار الحق، ولو كره الكافرون."));
        altareqExes.add(new AltareqEx("فَمَهِّلِ الْكَافِرِينَ أَمْهِلْهُمْ رُوَيْدًا (17)"));
        altareqExes.add(new AltareqEx("فلا تستعجل لهم -أيها الرسول- بطلب إنزال العقاب بهم، بل أمهلهم وأنظرهم قليلا ولا تستعجل لهم، وسترى ما يحلُّ بهم من العذاب والنكال والعقوبة والهلاك."));


        quran_explanation_86_adapter = new quran_explanation_86_adapter(altareqExes ,QuranExplanation_86Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_86);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_86Activity.this));
        recyclerView.setAdapter(quran_explanation_86_adapter);


    }

}