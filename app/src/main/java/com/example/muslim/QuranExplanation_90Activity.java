package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_90Activity extends AppCompatActivity {

    ArrayList<AlbaladEx> albaladExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_90_adapter quran_explanation_90_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_90);

        albaladExes.add(new AlbaladEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));

        albaladExes.add(new AlbaladEx("لَا أُقْسِمُ بِهَذَا الْبَلَدِ (1)"));
        albaladExes.add(new AlbaladEx("أقسم الله بهذا البلد الحرام، وهو «مكة»."));
        albaladExes.add(new AlbaladEx("وَأَنْتَ حِلٌّ بِهَذَا الْبَلَدِ (2)"));
        albaladExes.add(new AlbaladEx("أنت -أيها النبي- حلال في هذا «البلد الحرام» تصنع فيه ما شئت، ولم يحل له إلا ساعة من نهار. وفي الآية بشارة للنبي - صلى الله عليه وسلم - بفتح «مكة» على يده، وحلِّها له في القتال."));
        albaladExes.add(new AlbaladEx("وَوَالِدٍ وَمَا وَلَدَ (3)"));
        albaladExes.add(new AlbaladEx("وأقسم بوالد البشرية -وهو آدم عليه السلام- وما تناسل منه من ولد."));
        albaladExes.add(new AlbaladEx("لَقَدْ خَلَقْنَا الْإِنْسَانَ فِي كَبَدٍ (4)"));
        albaladExes.add(new AlbaladEx("لقد خلقنا الإنسان في شدة وعناء من مكابدة الدنيا."));
        albaladExes.add(new AlbaladEx("أَيَحْسَبُ أَنْ لَنْ يَقْدِرَ عَلَيْهِ أَحَدٌ (5)"));
        albaladExes.add(new AlbaladEx("أيظنُّ بما جمعه من مال أن الله لن يقدر عليه؟"));
        albaladExes.add(new AlbaladEx("يَقُولُ أَهْلَكْتُ مَالًا لُبَدًا (6)"));
        albaladExes.add(new AlbaladEx("يقول -متباهيًا-: أنفقت مالا كثيرًا."));
        albaladExes.add(new AlbaladEx("أَيَحْسَبُ أَنْ لَمْ يَرَهُ أَحَدٌ (7)"));
        albaladExes.add(new AlbaladEx("أيظنُّ في فعله هذا أن الله عز وجل لا يراه، ولا يحاسبه على الصغير والكبير؟"));
        albaladExes.add(new AlbaladEx("أَلَمْ نَجْعَلْ لَهُ عَيْنَيْنِ (8)"));
        albaladExes.add(new AlbaladEx("ألم نجعل له عينين يبصر بهما."));
        albaladExes.add(new AlbaladEx("وَلِسَانًا وَشَفَتَيْنِ (9)"));
        albaladExes.add(new AlbaladEx("ولسانًا وشفتين ينطق بها."));
        albaladExes.add(new AlbaladEx("وَهَدَيْنَاهُ النَّجْدَيْنِ (10)"));
        albaladExes.add(new AlbaladEx("وبينَّا له سبيلَي الخير والشر؟"));
        albaladExes.add(new AlbaladEx("فَلَا اقْتَحَمَ الْعَقَبَةَ (11)"));
        albaladExes.add(new AlbaladEx("فهلا تجاوز مشقة الآخرة بإنفاق ماله، فيأمن."));
        albaladExes.add(new AlbaladEx("وَمَا أَدْرَاكَ مَا الْعَقَبَةُ (12)"));
        albaladExes.add(new AlbaladEx("وأيُّ شيء أعلمك: ما مشقة الآخرة، وما يعين على تجاوزها؟"));
        albaladExes.add(new AlbaladEx("فَكُّ رَقَبَةٍ (13)"));
        albaladExes.add(new AlbaladEx("إنه عتق رقبة مؤمنة من أسر الرِّق."));
        albaladExes.add(new AlbaladEx("أَوْ إِطْعَامٌ فِي يَوْمٍ ذِي مَسْغَبَةٍ (14)"));
        albaladExes.add(new AlbaladEx("أو إطعام في يوم ذي مجاعة شديدة."));
        albaladExes.add(new AlbaladEx("يَتِيمًا ذَا مَقْرَبَةٍ (15)"));
        albaladExes.add(new AlbaladEx("يتيمًا -مات أبوه وهو صغير- من ذوي القرابة يجتمع فيه فضل الصدقة وصلة الرحم."));
        albaladExes.add(new AlbaladEx("أَوْ مِسْكِينًا ذَا مَتْرَبَةٍ (16)"));
        albaladExes.add(new AlbaladEx("أو فقيرًا معدمًا لا شيء عنده."));
        albaladExes.add(new AlbaladEx("ثُمَّ كَانَ مِنَ الَّذِينَ آمَنُوا وَتَوَاصَوْا بِالصَّبْرِ وَتَوَاصَوْا بِالْمَرْحَمَةِ (17)"));
        albaladExes.add(new AlbaladEx("ثم كان مع فِعْل ما ذُكر من أعمال الخير من الذين أخلصوا الإيمان لله، وأوصى بعضهم بعضًا بالصبر على طاعة الله وعن معاصيه، وتواصوا بالرحمة بالخلق."));
        albaladExes.add(new AlbaladEx("أُولَئِكَ أَصْحَابُ الْمَيْمَنَةِ (18)"));
        albaladExes.add(new AlbaladEx("الذين فعلوا هذه الأفعال، هم أصحاب اليمين، الذين يؤخذ بهم يوم القيامة ذات اليمين إلى الجنة."));
        albaladExes.add(new AlbaladEx("وَالَّذِينَ كَفَرُوا بِآيَاتِنَا هُمْ أَصْحَابُ الْمَشْأَمَةِ (19)"));
        albaladExes.add(new AlbaladEx("والذين كفروا بالقرآن هم الذين يؤخذ بهم يوم القيامة ذات الشمال إلى النار."));
        albaladExes.add(new AlbaladEx("عَلَيْهِمْ نَارٌ مُؤْصَدَةٌ (20)"));
        albaladExes.add(new AlbaladEx("جزاؤهم جهنم مطبَقةٌ مغلقة عليهم."));




        quran_explanation_90_adapter = new quran_explanation_90_adapter(albaladExes ,QuranExplanation_90Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_90);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_90Activity.this));
        recyclerView.setAdapter(quran_explanation_90_adapter);


    }

}