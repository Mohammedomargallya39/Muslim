package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_83Activity extends AppCompatActivity {

    ArrayList<AlmotafefenEx> almotafefenExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_83_adapter quran_explanation_83_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_83);

        almotafefenExes.add(new AlmotafefenEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        almotafefenExes.add(new AlmotafefenEx("وَيْلٌ لِلْمُطَفِّفِينَ (1)"));
        almotafefenExes.add(new AlmotafefenEx("عذابٌ شديد للذين يبخسون المكيال والميزان."));
        almotafefenExes.add(new AlmotafefenEx("الَّذِينَ إِذَا اكْتَالُوا عَلَى النَّاسِ يَسْتَوْفُونَ (2)"));
        almotafefenExes.add(new AlmotafefenEx("ين إذا اشتروا من الناس مكيلا أو موزونًا يوفون لأنفسهم."));
        almotafefenExes.add(new AlmotafefenEx("وَإِذَا كَالُوهُمْ أَوْ وَزَنُوهُمْ يُخْسِرُونَ (3)"));
        almotafefenExes.add(new AlmotafefenEx("وإذا باعوا الناس مكيلا أو موزونًا يُنْقصون في المكيال والميزان."));
        almotafefenExes.add(new AlmotafefenEx("أَلَا يَظُنُّ أُولَئِكَ أَنَّهُمْ مَبْعُوثُونَ (4)"));
        almotafefenExes.add(new AlmotafefenEx("فكيف بحال من يسرقهما ويختلسهما، ويبخس الناس أشياءهم؟ إنه أولى بالوعيد من مطففي المكيال والميزان. ألا يعتقد أولئك المطففون أن الله تعالى باعثهم ومحاسبهم على أعمالهم؟"));
        almotafefenExes.add(new AlmotafefenEx("لِيَوْمٍ عَظِيمٍ (5)"));
        almotafefenExes.add(new AlmotafefenEx("سيكون بعثهم في يوم عظيم الهول."));
        almotafefenExes.add(new AlmotafefenEx("يَوْمَ يَقُومُ النَّاسُ لِرَبِّ الْعَالَمِينَ (6)"));
        almotafefenExes.add(new AlmotafefenEx("يوم يقوم الناس بين يدي الله، فيحاسبهم على القليل والكثير، وهم فيه خاضعون لله رب العالمين."));
        almotafefenExes.add(new AlmotafefenEx("كَلَّا إِنَّ كِتَابَ الْفُجَّارِ لَفِي سِجِّينٍ (7)"));
        almotafefenExes.add(new AlmotafefenEx("حقا إن مصير الفُجَّار ومأواهم لفي ضيق."));
        almotafefenExes.add(new AlmotafefenEx("وَمَا أَدْرَاكَ مَا سِجِّينٌ (8)"));
        almotafefenExes.add(new AlmotafefenEx("وما أدراك ما هذا الضيق؟ إنه سجن مقيم وعذاب أليم."));
        almotafefenExes.add(new AlmotafefenEx("كِتَابٌ مَرْقُومٌ (9)"));
        almotafefenExes.add(new AlmotafefenEx("وهو ما كتب لهم المصير إليه، مكتوب مفروغ منه، لا يزاد فيه ولا يُنقص."));
        almotafefenExes.add(new AlmotafefenEx("وَيْلٌ يَوْمَئِذٍ لِلْمُكَذِّبِينَ (10)"));
        almotafefenExes.add(new AlmotafefenEx("عذاب شديد يومئذ للمكذبين."));
        almotafefenExes.add(new AlmotafefenEx("الَّذِينَ يُكَذِّبُونَ بِيَوْمِ الدِّينِ (11)"));
        almotafefenExes.add(new AlmotafefenEx("الذين يكذبون بوقوع يوم الجزاء."));
        almotafefenExes.add(new AlmotafefenEx("وَمَا يُكَذِّبُ بِهِ إِلَّا كُلُّ مُعْتَدٍ أَثِيمٍ (12)"));
        almotafefenExes.add(new AlmotafefenEx("وما يكذِّب به إلا كل ظالم كثير الإثم."));
        almotafefenExes.add(new AlmotafefenEx("إِذَا تُتْلَى عَلَيْهِ آيَاتُنَا قَالَ أَسَاطِيرُ الْأَوَّلِينَ (13)"));
        almotafefenExes.add(new AlmotafefenEx("إذا تتلى عليه آيات القرآن قال: هذه أباطيل الأولين."));
        almotafefenExes.add(new AlmotafefenEx("كَلَّا بَلْ رَانَ عَلَى قُلُوبِهِمْ مَا كَانُوا يَكْسِبُونَ (14)"));
        almotafefenExes.add(new AlmotafefenEx("ليس الأمر كما زعموا، بل هو كلام الله ووحيه إلى نبيه."));
        almotafefenExes.add(new AlmotafefenEx("كَلَّا إِنَّهُمْ عَنْ رَبِّهِمْ يَوْمَئِذٍ لَمَحْجُوبُونَ (15)"));
        almotafefenExes.add(new AlmotafefenEx("وإنما حجب قلوبهم عن التصديق به ما غشاها من كثرة ما يرتكبون من الذنوب. ليس الأمر كما زعم الكفار، بل إنهم يوم القيامة عن رؤية ربهم -جل وعلا- لمحجوبون. وفي هذه الآية دلالة على رؤية المؤمنين ربَّهم في الجنة."));
        almotafefenExes.add(new AlmotafefenEx("ثُمَّ إِنَّهُمْ لَصَالُو الْجَحِيمِ (16)"));
        almotafefenExes.add(new AlmotafefenEx("ثم إنهم لداخلو النار يقاسون حرها."));
        almotafefenExes.add(new AlmotafefenEx("ثُمَّ يُقَالُ هَذَا الَّذِي كُنْتُمْ بِهِ تُكَذِّبُونَ (17)"));
        almotafefenExes.add(new AlmotafefenEx("ثم يقال لهم: هذا الجزاء الذي كنتم به تكذبون."));
        almotafefenExes.add(new AlmotafefenEx("كَلَّا إِنَّ كِتَابَ الْأَبْرَارِ لَفِي عِلِّيِّينَ (18)"));
        almotafefenExes.add(new AlmotafefenEx("حقا إن كتاب الأبرار -وهم المتقون- لفي المراتب العالية في الجنة."));
        almotafefenExes.add(new AlmotafefenEx("وَمَا أَدْرَاكَ مَا عِلِّيُّونَ (19)"));
        almotafefenExes.add(new AlmotafefenEx("وما أدراك -أيها الرسول- ما هذه المراتب العالية؟"));
        almotafefenExes.add(new AlmotafefenEx("كِتَابٌ مَرْقُومٌ (20)"));
        almotafefenExes.add(new AlmotafefenEx("كتاب الأبرار مكتوب مفروغ منه، لا يزاد فيه ولا يُنقص."));
        almotafefenExes.add(new AlmotafefenEx("يَشْهَدُهُ الْمُقَرَّبُونَ (21)"));
        almotafefenExes.add(new AlmotafefenEx("يَطَّلِع عليه المقربون من ملائكة كل سماء."));
        almotafefenExes.add(new AlmotafefenEx("إِنَّ الْأَبْرَارَ لَفِي نَعِيمٍ (22)"));
        almotafefenExes.add(new AlmotafefenEx("إن أهل الصدق والطاعة لفي الجنة يتنعمون."));
        almotafefenExes.add(new AlmotafefenEx("عَلَى الْأَرَائِكِ يَنْظُرُونَ (23)"));
        almotafefenExes.add(new AlmotafefenEx("على الأسرَّة ينظرون إلى ربهم، وإلى ما أعدَّ لهم من خيرات."));
        almotafefenExes.add(new AlmotafefenEx("تَعْرِفُ فِي وُجُوهِهِمْ نَضْرَةَ النَّعِيمِ (24)"));
        almotafefenExes.add(new AlmotafefenEx("ترى في وجوههم بهجة النعيم."));
        almotafefenExes.add(new AlmotafefenEx("يُسْقَوْنَ مِنْ رَحِيقٍ مَخْتُومٍ (25)"));
        almotafefenExes.add(new AlmotafefenEx("يُسْقَون من خمر صافية محكم إناؤها."));
        almotafefenExes.add(new AlmotafefenEx("خِتَامُهُ مِسْكٌ وَفِي ذَلِكَ فَلْيَتَنَافَسِ الْمُتَنَافِسُونَ (26)"));
        almotafefenExes.add(new AlmotafefenEx("آخره رائحة مسك، وفي ذلك النعيم المقيم فليتسابق المتسابقون."));
        almotafefenExes.add(new AlmotafefenEx("وَمِزَاجُهُ مِنْ تَسْنِيمٍ (27)"));
        almotafefenExes.add(new AlmotafefenEx("ذا الشراب مزاجه وخلطه من عين في الجنة تُعْرَف لعلوها بـ «تسنيم»."));
        almotafefenExes.add(new AlmotafefenEx("عَيْنًا يَشْرَبُ بِهَا الْمُقَرَّبُونَ (28)"));
        almotafefenExes.add(new AlmotafefenEx("عين أعدت ; ليشرب منها المقربون، ويتلذذوا بها."));
        almotafefenExes.add(new AlmotafefenEx("إِنَّ الَّذِينَ أَجْرَمُوا كَانُوا مِنَ الَّذِينَ آمَنُوا يَضْحَكُونَ (29)"));
        almotafefenExes.add(new AlmotafefenEx("إن الذين أجرموا كانوا في الدنيا يستهزئون بالمؤمنين."));
        almotafefenExes.add(new AlmotafefenEx("وَإِذَا مَرُّوا بِهِمْ يَتَغَامَزُونَ (30)"));
        almotafefenExes.add(new AlmotafefenEx("وإذا مروا بهم يتغامزون سخرية بهم."));
        almotafefenExes.add(new AlmotafefenEx("وَإِذَا انْقَلَبُوا إِلَى أَهْلِهِمُ انْقَلَبُوا فَكِهِينَ (31)"));
        almotafefenExes.add(new AlmotafefenEx("وإذا رجع الذين أجرموا إلى أهلهم وذويهم تفكهوا معهم بالسخرية من المؤمنين."));
        almotafefenExes.add(new AlmotafefenEx("وَإِذَا رَأَوْهُمْ قَالُوا إِنَّ هَؤُلَاءِ لَضَالُّونَ (32)"));
        almotafefenExes.add(new AlmotafefenEx("وإذا رأى هؤلاء الكفار أصحاب محمد صلى الله عليه وسلم، وقد اتبعوا الهدى قالوا: إن هؤلاء لتائهون في اتباعهم محمدًا صلى الله عليه وسلم."));
        almotafefenExes.add(new AlmotafefenEx("وَمَا أُرْسِلُوا عَلَيْهِمْ حَافِظِينَ (33)"));
        almotafefenExes.add(new AlmotafefenEx("وما بُعث هؤلاء المجرمون رقباء على أصحاب محمد صلى الله عليه وسلم."));
        almotafefenExes.add(new AlmotafefenEx("فَالْيَوْمَ الَّذِينَ آمَنُوا مِنَ الْكُفَّارِ يَضْحَكُونَ (34)"));
        almotafefenExes.add(new AlmotafefenEx("فيوم القيامة يسخر الذين صدقوا الله ورسوله وعملوا بشرعه من الكفار، كما سخر الكافرون منهم في الدنيا."));
        almotafefenExes.add(new AlmotafefenEx("عَلَى الْأَرَائِكِ يَنْظُرُونَ (35)"));
        almotafefenExes.add(new AlmotafefenEx("على المجالس الفاخرة ينظر المؤمنون إلى ما أعطاهم الله من الكرامة والنعيم في الجنة، ومن أعظم ذلك النظر إلى وجه الله الكريم."));
        almotafefenExes.add(new AlmotafefenEx("هَلْ ثُوِّبَ الْكُفَّارُ مَا كَانُوا يَفْعَلُونَ (36)"));
        almotafefenExes.add(new AlmotafefenEx("هل جوزي الكفار من جنس أعمالهم، جزاءً وفاق ما كانوا يفعلونه في الدنيا من الشرور والآثام؟\n" +
                "نعم، سيُجْزونَ أوفى الجزاء وأعدله.\n"));


        quran_explanation_83_adapter = new quran_explanation_83_adapter(almotafefenExes ,QuranExplanation_83Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_83);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_83Activity.this));
        recyclerView.setAdapter(quran_explanation_83_adapter);


    }

}