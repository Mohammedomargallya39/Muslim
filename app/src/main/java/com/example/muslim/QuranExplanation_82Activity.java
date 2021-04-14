package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_82Activity extends AppCompatActivity {

    ArrayList<AlenfetarEx> alenfetarExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_82_adapter quran_explanation_82_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_82);

        alenfetarExes.add(new AlenfetarEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alenfetarExes.add(new AlenfetarEx("إِذَا السَّمَاءُ انْفَطَرَتْ (1)"));
        alenfetarExes.add(new AlenfetarEx("إذا السماء انشقت، واختلَّ نظامها."));
        alenfetarExes.add(new AlenfetarEx("وَإِذَا الْكَوَاكِبُ انْتَثَرَتْ (2)"));
        alenfetarExes.add(new AlenfetarEx("وإذا الكواكب تساقطت."));
        alenfetarExes.add(new AlenfetarEx("وَإِذَا الْبِحَارُ فُجِّرَتْ (3)"));
        alenfetarExes.add(new AlenfetarEx("وإذا البحار فجَّر الله بعضها في بعض، فذهب ماؤها."));
        alenfetarExes.add(new AlenfetarEx("وَإِذَا الْقُبُورُ بُعْثِرَتْ (4)"));
        alenfetarExes.add(new AlenfetarEx("وإذا القبور قُلِبت ببعث مَن كان فيها."));
        alenfetarExes.add(new AlenfetarEx("عَلِمَتْ نَفْسٌ مَا قَدَّمَتْ وَأَخَّرَتْ (5)"));
        alenfetarExes.add(new AlenfetarEx("حينئذ تعلم كلُّ نفس جميع أعمالها، ما تقدَّم منها، وما تأخر، وجوزيت بها."));
        alenfetarExes.add(new AlenfetarEx("يَاأَيُّهَا الْإِنْسَانُ مَا غَرَّكَ بِرَبِّكَ الْكَرِيمِ (6)"));
        alenfetarExes.add(new AlenfetarEx("يا أيها الإنسان المنكر للبعث، ما الذي جعلك تغتَرُّ بربك الجواد كثير الخير الحقيق بالشكر والطاعة."));
        alenfetarExes.add(new AlenfetarEx("الَّذِي خَلَقَكَ فَسَوَّاكَ فَعَدَلَكَ (7)"));
        alenfetarExes.add(new AlenfetarEx("أليس هو الذي خلقك فسوَّى خلقك فعَدَلك، وركَّبك لأداء وظائفك."));
        alenfetarExes.add(new AlenfetarEx("فِي أَيِّ صُورَةٍ مَا شَاءَ رَكَّبَكَ (8)"));
        alenfetarExes.add(new AlenfetarEx("في أيِّ صورة شاءها خلقك؟"));
        alenfetarExes.add(new AlenfetarEx("كَلَّا بَلْ تُكَذِّبُونَ بِالدِّينِ (9)"));
        alenfetarExes.add(new AlenfetarEx("ليس الأمر كما تقولون من أنكم في عبادتكم غير الله مُحِقون، بل تكذِّبون بيوم الحساب والجزاء."));
        alenfetarExes.add(new AlenfetarEx("وَإِنَّ عَلَيْكُمْ لَحَافِظِينَ (10)"));
        alenfetarExes.add(new AlenfetarEx("وإن عليكم لملائكة رقباء."));
        alenfetarExes.add(new AlenfetarEx("كِرَامًا كَاتِبِينَ (11)"));
        alenfetarExes.add(new AlenfetarEx("كراما على الله كاتبين لما وُكِّلوا بإحصائه، لا يفوتهم من أعمالكم شيء."));
        alenfetarExes.add(new AlenfetarEx("يَعْلَمُونَ مَا تَفْعَلُونَ (12)"));
        alenfetarExes.add(new AlenfetarEx("يعلمون ما تفعلون من خير أو شر."));
        alenfetarExes.add(new AlenfetarEx("إِنَّ الْأَبْرَارَ لَفِي نَعِيمٍ (13)"));
        alenfetarExes.add(new AlenfetarEx("إن الأتقياء القائمين بحقوق الله وحقوق عباده لفي نعيم."));
        alenfetarExes.add(new AlenfetarEx("وَإِنَّ الْفُجَّارَ لَفِي جَحِيمٍ (14)"));
        alenfetarExes.add(new AlenfetarEx("وإن الفُجَّار الذين قَصَّروا في حقوق الله وحقوق عباده لفي جحيم."));
        alenfetarExes.add(new AlenfetarEx("يَصْلَوْنَهَا يَوْمَ الدِّينِ (15)"));
        alenfetarExes.add(new AlenfetarEx("يصيبهم لهبها يوم الجزاء."));
        alenfetarExes.add(new AlenfetarEx("وَمَا هُمْ عَنْهَا بِغَائِبِينَ (16)"));
        alenfetarExes.add(new AlenfetarEx("وما هم عن عذاب جهنم بغائبين لا بخروج ولا بموت."));
        alenfetarExes.add(new AlenfetarEx("وَمَا أَدْرَاكَ مَا يَوْمُ الدِّينِ (17)"));
        alenfetarExes.add(new AlenfetarEx("وما أدراك ما عظمة يوم الحساب."));
        alenfetarExes.add(new AlenfetarEx("ثُمَّ مَا أَدْرَاكَ مَا يَوْمُ الدِّينِ (18)"));
        alenfetarExes.add(new AlenfetarEx("ثم ما أدراك ما عظمةُ يوم الحساب؟"));
        alenfetarExes.add(new AlenfetarEx("يَوْمَ لَا تَمْلِكُ نَفْسٌ لِنَفْسٍ شَيْئًا وَالْأَمْرُ يَوْمَئِذٍ لِلَّهِ (19)"));
        alenfetarExes.add(new AlenfetarEx("يوم الحساب لا يقدر أحد على نفع أحد، والأمر في ذلك اليوم لله وحده الذي لا يغلبه غالب، ولا يقهره قاهر، ولا ينازعه أحد."));


        quran_explanation_82_adapter = new quran_explanation_82_adapter(alenfetarExes ,QuranExplanation_82Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_82);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_82Activity.this));
        recyclerView.setAdapter(quran_explanation_82_adapter);


    }

}