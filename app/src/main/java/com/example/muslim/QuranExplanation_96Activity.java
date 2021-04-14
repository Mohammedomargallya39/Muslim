package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_96Activity extends AppCompatActivity {

    ArrayList<AlalaqEx> alalaqExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_96_adapter quran_explanation_96_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_96);



        alalaqExes.add(new AlalaqEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alalaqExes.add(new AlalaqEx("اقْرَأْ بِاسْمِ رَبِّكَ الَّذِي خَلَقَ (1)"));
        alalaqExes.add(new AlalaqEx("اقرأ -أيها النبي- ما أُنزل إليك من القرآن مُفْتَتِحًا باسم ربك المتفرد بالخلق."));
        alalaqExes.add(new AlalaqEx("خَلَقَ الْإِنْسَانَ مِنْ عَلَقٍ (2)"));
        alalaqExes.add(new AlalaqEx("الذي خلق كل إنسان من قطعة دم غليظ أحمر."));
        alalaqExes.add(new AlalaqEx("اقْرَأْ وَرَبُّكَ الْأَكْرَمُ (3)"));
        alalaqExes.add(new AlalaqEx("اقرأ -أيها النبي- ما أُنزل إليك، وإن ربك لكثير الإحسان واسع الجود."));
        alalaqExes.add(new AlalaqEx("الَّذِي عَلَّمَ بِالْقَلَمِ (4)"));
        alalaqExes.add(new AlalaqEx("الذي علَّم خلقه الكتابة بالقلم."));
        alalaqExes.add(new AlalaqEx("عَلَّمَ الْإِنْسَانَ مَا لَمْ يَعْلَمْ (5)"));
        alalaqExes.add(new AlalaqEx("الذي علَّم خلقه الكتابة بالقلم، علَّم الإنسان ما لم يكن يعلم، ونقله من ظلمة الجهل إلى نور العلم."));
        alalaqExes.add(new AlalaqEx("كَلَّا إِنَّ الْإِنْسَانَ لَيَطْغَى (6)"));
        alalaqExes.add(new AlalaqEx("حقًا أن الإنسان ليتجاوز حدود الله إذا أبطره الغنى."));
        alalaqExes.add(new AlalaqEx("أَنْ رَآهُ اسْتَغْنَى (7)"));
        alalaqExes.add(new AlalaqEx("فليعلم كل طاغية أن المصير إلى الله."));
        alalaqExes.add(new AlalaqEx("إِنَّ إِلَى رَبِّكَ الرُّجْعَى (8)"));
        alalaqExes.add(new AlalaqEx("فيجازي كلَّ إنسان بعمله."));
        alalaqExes.add(new AlalaqEx("أَرَأَيْتَ الَّذِي يَنْهَى (9)"));
        alalaqExes.add(new AlalaqEx("أرأيت أعجب مِن طغيان هذا الرجل وهو أبو جهل، الذي ينهى."));
        alalaqExes.add(new AlalaqEx("عَبْدًا إِذَا صَلَّى (10)"));
        alalaqExes.add(new AlalaqEx("لذي ينهى عبدًا لنا إذا صلَّى لربه وهو محمد صلى الله عليه وسلم؟"));
        alalaqExes.add(new AlalaqEx("أَرَأَيْتَ إِنْ كَانَ عَلَى الْهُدَى (11)"));
        alalaqExes.add(new AlalaqEx("أرأيت إن كان المنهي عن الصلاة على الهدى فكيف ينهاه؟"));
        alalaqExes.add(new AlalaqEx("أَوْ أَمَرَ بِالتَّقْوَى (12)"));
        alalaqExes.add(new AlalaqEx("أو إن كان آمرًا غيره بالتقوى أينهاه عن ذلك؟"));
        alalaqExes.add(new AlalaqEx("أَرَأَيْتَ إِنْ كَذَّبَ وَتَوَلَّى (13)"));
        alalaqExes.add(new AlalaqEx("أرأيت إن كذَّب هذا الناهي بما يُدعى إليه، وأعرض عنه."));
        alalaqExes.add(new AlalaqEx("أَلَمْ يَعْلَمْ بِأَنَّ اللَّهَ يَرَى (14)"));
        alalaqExes.add(new AlalaqEx("م يعلم بأن الله يرى كل ما يفعل؟ ليس الأمر كما يزعم أبو جهل."));
        alalaqExes.add(new AlalaqEx("كَلَّا لَئِنْ لَمْ يَنْتَهِ لَنَسْفَعًا بِالنَّاصِيَةِ (15)"));
        alalaqExes.add(new AlalaqEx("لئن لم يرجع هذا عن شقاقه وأذاه لنأخذنَّ بمقدَّم رأسه أخذًا عنيفًا، ويُطرح في النار، ناصيته ناصية كاذبة في مقالها."));
        alalaqExes.add(new AlalaqEx("نَاصِيَةٍ كَاذِبَةٍ خَاطِئَةٍ (16)"));
        alalaqExes.add(new AlalaqEx("ناصيته ناصية كاذبة في مقالها، خاطئة في أفعالها، فكأن الكذب والخطأ باديان منها."));
        alalaqExes.add(new AlalaqEx("فَلْيَدْعُ نَادِيَهُ (17)"));
        alalaqExes.add(new AlalaqEx("فليُحْضِر هذا الطاغية أهل ناديه الذين يستنصر بهم."));
        alalaqExes.add(new AlalaqEx("سَنَدْعُ الزَّبَانِيَةَ (18)"));
        alalaqExes.add(new AlalaqEx("سندعو ملائكة العذاب. ليس الأمر على ما يظن أبو جهل، إنه لن ينالك -أيها الرسول- بسوء."));
        alalaqExes.add(new AlalaqEx("كَلَّا لَا تُطِعْهُ وَاسْجُدْ وَاقْتَرِبْ (19)"));
        alalaqExes.add(new AlalaqEx("فلا تطعه فيما دعاك إليه مِن تَرْك الصلاة، واسجد لربك واقترب منه بالتحبب إليه بطاعته."));



        quran_explanation_96_adapter = new quran_explanation_96_adapter(alalaqExes ,QuranExplanation_96Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_96);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_96Activity.this));
        recyclerView.setAdapter(quran_explanation_96_adapter);


    }

}