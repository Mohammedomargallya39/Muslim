package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_77Activity extends AppCompatActivity {

    ArrayList<AlmorsalatEx> almorsalatExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_77_adapter quran_explanation_77_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_77);

        almorsalatExes.add(new AlmorsalatEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        almorsalatExes.add(new AlmorsalatEx("وَالْمُرْسَلَاتِ عُرْفًا (1)"));
        almorsalatExes.add(new AlmorsalatEx("أقسم الله تعالى بالرياح حين تهب متتابعة يقفو بعضها بعضًا."));
        almorsalatExes.add(new AlmorsalatEx("فَالْعَاصِفَاتِ عَصْفًا (2)"));
        almorsalatExes.add(new AlmorsalatEx("وبالرياح الشديدة الهبوب المهلكة."));
        almorsalatExes.add(new AlmorsalatEx("وَالنَّاشِرَاتِ نَشْرًا (3)"));
        almorsalatExes.add(new AlmorsalatEx("وبالملائكة الموكلين بالسحب يسوقونها حيث شاء الله."));
        almorsalatExes.add(new AlmorsalatEx("فَالْفَارِقَاتِ فَرْقًا (4)"));
        almorsalatExes.add(new AlmorsalatEx("وبالملائكة التي تنزل من عند الله بما يفرق بين الحق والباطل والحلال والحرام."));
        almorsalatExes.add(new AlmorsalatEx("فَالْمُلْقِيَاتِ ذِكْرًا (5)"));
        almorsalatExes.add(new AlmorsalatEx("وبالملائكة التي تتلقى الوحي من عند الله وتنزل به على أنبيائه."));
        almorsalatExes.add(new AlmorsalatEx("عُذْرًا أَوْ نُذْرًا (6)"));
        almorsalatExes.add(new AlmorsalatEx("إعذارًا من الله إلى خلقه وإنذارًا منه إليهم ; لئلا يكون لهم حجة."));
        almorsalatExes.add(new AlmorsalatEx("إِنَّمَا تُوعَدُونَ لَوَاقِعٌ (7)"));
        almorsalatExes.add(new AlmorsalatEx("إن الذي توعدون به مِن أمر يوم القيامة وما فيه من حساب وجزاء لنازلٌ بكم لا محالة."));
        almorsalatExes.add(new AlmorsalatEx("فَإِذَا النُّجُومُ طُمِسَتْ (8)"));
        almorsalatExes.add(new AlmorsalatEx("فإذا النجوم طُمست وذهب ضياؤها."));
        almorsalatExes.add(new AlmorsalatEx("وَإِذَا السَّمَاءُ فُرِجَتْ (9)"));
        almorsalatExes.add(new AlmorsalatEx("وإذا السماء تصدَّعت."));
        almorsalatExes.add(new AlmorsalatEx("وَإِذَا الْجِبَالُ نُسِفَتْ (10)"));
        almorsalatExes.add(new AlmorsalatEx("وإذا الجبال تطايرت وتناثرت وصارت هباء تَذْروه الرياح."));
        almorsalatExes.add(new AlmorsalatEx("وَإِذَا الرُّسُلُ أُقِّتَتْ (11)"));
        almorsalatExes.add(new AlmorsalatEx("وإذا الرسل عُيِّن لهم وقت وأجل للفصل بينهم وبين الأمم."));
        almorsalatExes.add(new AlmorsalatEx("لِأَيِّ يَوْمٍ أُجِّلَتْ (12)"));
        almorsalatExes.add(new AlmorsalatEx("لأيِّ يوم عظيم أخِّرت الرسل؟"));
        almorsalatExes.add(new AlmorsalatEx("لِيَوْمِ الْفَصْلِ (13)"));
        almorsalatExes.add(new AlmorsalatEx("أخِّرت ليوم القضاء والفصل بين الخلائق."));
        almorsalatExes.add(new AlmorsalatEx("وَمَا أَدْرَاكَ مَا يَوْمُ الْفَصْلِ (14)"));
        almorsalatExes.add(new AlmorsalatEx("وما أعلمك -أيها الإنسان- أيُّ شيء هو يوم الفصل وشدته وهوله؟"));
        almorsalatExes.add(new AlmorsalatEx("هلاك عظيم في ذلك اليوم للمكذبين بهذا اليوم الموعود."));
        almorsalatExes.add(new AlmorsalatEx("أَلَمْ نُهْلِكِ الْأَوَّلِينَ (16)"));
        almorsalatExes.add(new AlmorsalatEx("ألم نهلك السابقين من الأمم الماضية; بتكذيبهم للرسل كقوم نوح وعاد وثمود؟"));
        almorsalatExes.add(new AlmorsalatEx("ثُمَّ نُتْبِعُهُمُ الْآخِرِينَ (17)"));
        almorsalatExes.add(new AlmorsalatEx("ثم نلحق بهم المتأخرين ممن كانوا مثلهم في التكذيب والعصيان."));
        almorsalatExes.add(new AlmorsalatEx("كَذَلِكَ نَفْعَلُ بِالْمُجْرِمِينَ (18)"));
        almorsalatExes.add(new AlmorsalatEx("مِثل ذلك الإهلاك الفظيع نفعل بهؤلاء المجرمين من كفار «مكة» ؛ لتكذيبهم الرسول صلى الله عليه وسلم."));
        almorsalatExes.add(new AlmorsalatEx("وَيْلٌ يَوْمَئِذٍ لِلْمُكَذِّبِينَ (19)"));
        almorsalatExes.add(new AlmorsalatEx("هلاك وعذاب شديد يوم القيامة لكل مكذِّب بأن الله هو الإله الحق وحده لا شريك له، والنبوةِ والبعث والحساب."));
        almorsalatExes.add(new AlmorsalatEx("أَلَمْ نَخْلُقْكُمْ مِنْ مَاءٍ مَهِينٍ (20)"));
        almorsalatExes.add(new AlmorsalatEx("ألم نخلقكم -يا معشر الكفار- من ماء ضعيف حقير وهو النطفة."));
        almorsalatExes.add(new AlmorsalatEx("فَجَعَلْنَاهُ فِي قَرَارٍ مَكِينٍ (21)"));
        almorsalatExes.add(new AlmorsalatEx("فجعلنا هذا الماء في مكان حصين، وهو رحم المرأة."));
        almorsalatExes.add(new AlmorsalatEx("إِلَى قَدَرٍ مَعْلُومٍ (22)"));
        almorsalatExes.add(new AlmorsalatEx("إلى وقت محدود ومعلوم عند الله تعالى؟"));
        almorsalatExes.add(new AlmorsalatEx("فَقَدَرْنَا فَنِعْمَ الْقَادِرُونَ (23)"));
        almorsalatExes.add(new AlmorsalatEx("فقدرنا على خلقه وتصويره وإخراجه، فنعم القادرون نحن."));
        almorsalatExes.add(new AlmorsalatEx("وَيْلٌ يَوْمَئِذٍ لِلْمُكَذِّبِينَ (24)"));
        almorsalatExes.add(new AlmorsalatEx("هلاك وعذاب شديد يوم القيامة للمكذبين بقدرتنا."));
        almorsalatExes.add(new AlmorsalatEx("أَلَمْ نَجْعَلِ الْأَرْضَ كِفَاتًا (25)"));
        almorsalatExes.add(new AlmorsalatEx("ألم نجعل هذه الأرض التي تعيشون عليها."));
        almorsalatExes.add(new AlmorsalatEx("أَحْيَاءً وَأَمْوَاتًا (26)"));
        almorsalatExes.add(new AlmorsalatEx("تضم على ظهرها أحياء لا يحصون، وفي بطنها أمواتًا لا يحصرون."));
        almorsalatExes.add(new AlmorsalatEx("وَجَعَلْنَا فِيهَا رَوَاسِيَ شَامِخَاتٍ وَأَسْقَيْنَاكُمْ مَاءً فُرَاتًا (27)"));
        almorsalatExes.add(new AlmorsalatEx("وجعلنا فيها جبالا ثوابت عاليات؛ لئلا تضطرب بكم، وأسقيناكم ماءً عذبًا سائغًا؟"));
        almorsalatExes.add(new AlmorsalatEx("وَيْلٌ يَوْمَئِذٍ لِلْمُكَذِّبِينَ (28)"));
        almorsalatExes.add(new AlmorsalatEx("هلاك ودمار يوم القيامة للمكذبين بهذه النعم."));
        almorsalatExes.add(new AlmorsalatEx("انْطَلِقُوا إِلَى مَا كُنْتُمْ بِهِ تُكَذِّبُونَ (29)"));
        almorsalatExes.add(new AlmorsalatEx("يقال للكافرين يوم القيامة: سيروا إلى عذاب جهنم الذي كنتم به تكذبون في الدنيا."));
        almorsalatExes.add(new AlmorsalatEx("انْطَلِقُوا إِلَى ظِلٍّ ذِي ثَلَاثِ شُعَبٍ (30)"));
        almorsalatExes.add(new AlmorsalatEx("سيروا، فاستظلوا بدخان جهنم الذي يتفرع منه ثلاث قطع."));
        almorsalatExes.add(new AlmorsalatEx("لَا ظَلِيلٍ وَلَا يُغْنِي مِنَ اللَّهَبِ (31)"));
        almorsalatExes.add(new AlmorsalatEx("لا يُظِل ذلك الظل من حر ذلك اليوم، ولا يدفع من حر اللهب شيئًا."));
        almorsalatExes.add(new AlmorsalatEx("إِنَّهَا تَرْمِي بِشَرَرٍ كَالْقَصْرِ (32)"));
        almorsalatExes.add(new AlmorsalatEx("إن جهنم تقذف من النار بشرر عظيم، كل شرارة منه كالبناء المشيد في العِظم والارتفاع."));
        almorsalatExes.add(new AlmorsalatEx("كَأَنَّهُ جِمَالَتٌ صُفْرٌ (33)"));
        almorsalatExes.add(new AlmorsalatEx("كأن شرر جهنم المتطاير منها إبل سود يميل لونها إلى الصُّفْرة."));
        almorsalatExes.add(new AlmorsalatEx("وَيْلٌ يَوْمَئِذٍ لِلْمُكَذِّبِينَ (34)"));
        almorsalatExes.add(new AlmorsalatEx("هلاك وعذاب شديد يوم القيامة للمكذبين بوعيد الله."));
        almorsalatExes.add(new AlmorsalatEx("هَذَا يَوْمُ لَا يَنْطِقُونَ (35)"));
        almorsalatExes.add(new AlmorsalatEx("هذا يوم القيامة الذي لا ينطق فيه المكذبون بكلام ينفعهم."));
        almorsalatExes.add(new AlmorsalatEx("وَلَا يُؤْذَنُ لَهُمْ فَيَعْتَذِرُونَ (36)"));
        almorsalatExes.add(new AlmorsalatEx("ولا يكون لهم إذن في الكلام فيعتذرون؛ لأنه لا عذر لهم."));
        almorsalatExes.add(new AlmorsalatEx("وَيْلٌ يَوْمَئِذٍ لِلْمُكَذِّبِينَ (37)"));
        almorsalatExes.add(new AlmorsalatEx("هلاك وعذاب شديد يومئذ للمكذبين بهذا اليوم وما فيه."));
        almorsalatExes.add(new AlmorsalatEx("هَذَا يَوْمُ الْفَصْلِ جَمَعْنَاكُمْ وَالْأَوَّلِينَ (38)"));
        almorsalatExes.add(new AlmorsalatEx("هذا يوم يفصل الله فيه بين الخلائق، ويتميز فيه الحق من الباطل، جمعناكم فيه -يا معشر كفار هذه الأمة- مع الكفار الأولين من الأمم الماضية."));
        almorsalatExes.add(new AlmorsalatEx("فَإِنْ كَانَ لَكُمْ كَيْدٌ فَكِيدُونِ (39)"));
        almorsalatExes.add(new AlmorsalatEx("فإن كان لكم حيلة في الخلاص من العذاب فاحتالوا، وأنقذوا أنفسكم مِن بطش الله وانتقامه."));
        almorsalatExes.add(new AlmorsalatEx("وَيْلٌ يَوْمَئِذٍ لِلْمُكَذِّبِينَ (40)"));
        almorsalatExes.add(new AlmorsalatEx("هلاك وعذاب شديد يوم القيامة للمكذبين بيوم القيامة."));
        almorsalatExes.add(new AlmorsalatEx("إِنَّ الْمُتَّقِينَ فِي ظِلَالٍ وَعُيُونٍ (41)"));
        almorsalatExes.add(new AlmorsalatEx("إن الذين خافوا ربهم في الدنيا، واتقوا عذابه بامتثال أوامره واجتناب نواهيه، هم يوم القيامة في ظلال الأشجار الوارفة وعيون الماء الجارية."));
        almorsalatExes.add(new AlmorsalatEx("وَفَوَاكِهَ مِمَّا يَشْتَهُونَ (42)"));
        almorsalatExes.add(new AlmorsalatEx("وفواكه كثيرة مما تشتهيه أنفسهم يتنعمون."));
        almorsalatExes.add(new AlmorsalatEx("كُلُوا وَاشْرَبُوا هَنِيئًا بِمَا كُنْتُمْ تَعْمَلُونَ (43)"));
        almorsalatExes.add(new AlmorsalatEx("يقال لهم: كلوا أكلا لذيذًا، واشربوا شربًا هنيئًا؛ بسبب ما قدمتم في الدنيا من صالح الأعمال."));
        almorsalatExes.add(new AlmorsalatEx("إِنَّا كَذَلِكَ نَجْزِي الْمُحْسِنِينَ (44)"));
        almorsalatExes.add(new AlmorsalatEx("إنا بمثل ذلك الجزاء العظيم نجزي أهل الإحسان في أعمالهم وطاعتهم لنا."));
        almorsalatExes.add(new AlmorsalatEx("وَيْلٌ يَوْمَئِذٍ لِلْمُكَذِّبِينَ (45)"));
        almorsalatExes.add(new AlmorsalatEx("هلاك وعذاب شديد يوم القيامة للمكذبين بيوم الجزاء والحساب وما فيه من النعيم والعذاب."));
        almorsalatExes.add(new AlmorsalatEx("كُلُوا وَتَمَتَّعُوا قَلِيلًا إِنَّكُمْ مُجْرِمُونَ (46)"));
        almorsalatExes.add(new AlmorsalatEx("ثم هدَّد الله الكافرين فقال: كلوا من لذائذ الدنيا، واستمتعوا بشهواتها الفانية زمنًا قليلا؛ إنكم مجرمون بإشراككم بالله."));
        almorsalatExes.add(new AlmorsalatEx("وَيْلٌ يَوْمَئِذٍ لِلْمُكَذِّبِينَ (47)"));
        almorsalatExes.add(new AlmorsalatEx("هلاك وعذاب شديد يوم القيامة للمكذبين بيوم الحساب والجزاء."));
        almorsalatExes.add(new AlmorsalatEx("وَإِذَا قِيلَ لَهُمُ ارْكَعُوا لَا يَرْكَعُونَ (48)"));
        almorsalatExes.add(new AlmorsalatEx("وإذا قيل لهؤلاء المشركين: صلُّوا لله، واخشعوا له، لا يخشعون ولا يصلُّون، بل يصرُّون على استكبارهم."));
        almorsalatExes.add(new AlmorsalatEx("وَيْلٌ يَوْمَئِذٍ لِلْمُكَذِّبِينَ (49)"));
        almorsalatExes.add(new AlmorsalatEx("هلاك وعذاب شديد يوم القيامة للمكذبين بآيات الله."));
        almorsalatExes.add(new AlmorsalatEx("فَبِأَيِّ حَدِيثٍ بَعْدَهُ يُؤْمِنُونَ (50)"));
        almorsalatExes.add(new AlmorsalatEx("إن لم يؤمنوا بهذا القرآن. فبأي كتاب وكلام بعده يؤمنون؟ وهو المبيِّن لكل شيء، الواضح في حكمه وأحكامه وأخباره، المعجز في ألفاظه ومعانيه."));


        quran_explanation_77_adapter = new quran_explanation_77_adapter(almorsalatExes ,QuranExplanation_77Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_77);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_77Activity.this));
        recyclerView.setAdapter(quran_explanation_77_adapter);


    }

}