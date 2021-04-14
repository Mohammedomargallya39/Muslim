package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_75Activity extends AppCompatActivity {

    ArrayList<AlqyamaEx> alqyamaExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_75_adapter quran_explanation_75_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_75);

        alqyamaExes.add(new AlqyamaEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alqyamaExes.add(new AlqyamaEx("لَا أُقْسِمُ بِيَوْمِ الْقِيَامَةِ (1)"));
        alqyamaExes.add(new AlqyamaEx("أقسم الله سبحانه بيوم الحساب والجزاء."));
        alqyamaExes.add(new AlqyamaEx("وَلَا أُقْسِمُ بِالنَّفْسِ اللَّوَّامَةِ (2)"));
        alqyamaExes.add(new AlqyamaEx("وأقسم بالنفس المؤمنة التقية التي تلوم صاحبها على ترك الطاعات وفِعْل الموبقات، أن الناس سيبعثون."));
        alqyamaExes.add(new AlqyamaEx("أَيَحْسَبُ الْإِنْسَانُ أَلَّنْ نَجْمَعَ عِظَامَهُ (3)"));
        alqyamaExes.add(new AlqyamaEx("أيظنُّ هذا الإنسان الكافر أن لن نقدر على جَمْع عظامه بعد تفرقها؟"));
        alqyamaExes.add(new AlqyamaEx("بَلَى قَادِرِينَ عَلَى أَنْ نُسَوِّيَ بَنَانَهُ (4)"));
        alqyamaExes.add(new AlqyamaEx("بلى سنجمعها، قادرين على أن نجعل أصابعه أو أنامله -بعد جمعها وتأليفها- خَلْقًا سويًّا، كما كانت قبل الموت."));
        alqyamaExes.add(new AlqyamaEx("بَلْ يُرِيدُ الْإِنْسَانُ لِيَفْجُرَ أَمَامَهُ (5)"));
        alqyamaExes.add(new AlqyamaEx("بل ينكر الإنسان البعث، يريد أن يبقى على الفجور فيما يستقبل من أيام عمره."));
        alqyamaExes.add(new AlqyamaEx("يَسْأَلُ أَيَّانَ يَوْمُ الْقِيَامَةِ (6)"));
        alqyamaExes.add(new AlqyamaEx("يسأل هذا الكافر مستبعدًا قيام الساعة: متى يكون يوم القيامة؟"));
        alqyamaExes.add(new AlqyamaEx("فَإِذَا بَرِقَ الْبَصَرُ (7)"));
        alqyamaExes.add(new AlqyamaEx("فإذا تحيَّر البصر ودُهش فزعًا مما رأى من أهوال يوم القيامة."));
        alqyamaExes.add(new AlqyamaEx("وَخَسَفَ الْقَمَرُ (8)"));
        alqyamaExes.add(new AlqyamaEx("وذهب نور القمر."));
        alqyamaExes.add(new AlqyamaEx("وَجُمِعَ الشَّمْسُ وَالْقَمَرُ (9)"));
        alqyamaExes.add(new AlqyamaEx("وجُمِع بين الشمس والقمر في ذهاب الضوء، فلا ضوء لواحد منهما."));
        alqyamaExes.add(new AlqyamaEx("يَقُولُ الْإِنْسَانُ يَوْمَئِذٍ أَيْنَ الْمَفَرُّ (10)"));
        alqyamaExes.add(new AlqyamaEx("يقول الإنسان وقتها: أين المهرب من العذاب؟"));
        alqyamaExes.add(new AlqyamaEx("كَلَّا لَا وَزَرَ (11)"));
        alqyamaExes.add(new AlqyamaEx("ليس الأمر كما تتمناه -أيها الإنسان- مِن طلب الفرار، لا ملجأ لك ولا منجى."));
        alqyamaExes.add(new AlqyamaEx("إِلَى رَبِّكَ يَوْمَئِذٍ الْمُسْتَقَرُّ (12)"));
        alqyamaExes.add(new AlqyamaEx("إلى الله وحده مصير الخلائق يوم القيامة ومستقرهم، فيجازي كلا بما يستحق."));
        alqyamaExes.add(new AlqyamaEx("يُنَبَّأُ الْإِنْسَانُ يَوْمَئِذٍ بِمَا قَدَّمَ وَأَخَّرَ (13)"));
        alqyamaExes.add(new AlqyamaEx("يُخَبَّر الإنسان في ذلك اليوم بجميع أعماله: من خير وشر، ما قدَّمه منها في حياته وما أخَّره."));
        alqyamaExes.add(new AlqyamaEx("بَلِ الْإِنْسَانُ عَلَى نَفْسِهِ بَصِيرَةٌ (14)"));
        alqyamaExes.add(new AlqyamaEx("بل الإنسان حجة واضحة على نفسه تلزمه بما فعل أو ترك."));
        alqyamaExes.add(new AlqyamaEx("وَلَوْ أَلْقَى مَعَاذِيرَهُ (15)"));
        alqyamaExes.add(new AlqyamaEx("ولو جاء بكل معذرة يعتذر بها عن إجرامه، فإنه لا ينفعه ذلك."));
        alqyamaExes.add(new AlqyamaEx("لَا تُحَرِّكْ بِهِ لِسَانَكَ لِتَعْجَلَ بِهِ (16)"));
        alqyamaExes.add(new AlqyamaEx("لا تحرك -أيها النبي- بالقرآن لسانك حين نزول الوحي؛ لأجل أن تتعجل بحفظه، مخافة أن يتفلَّت منك."));
        alqyamaExes.add(new AlqyamaEx("إِنَّ عَلَيْنَا جَمْعَهُ وَقُرْآنَهُ (17)"));
        alqyamaExes.add(new AlqyamaEx("إن علينا جَمْعه في صدرك، ثم أن تقرأه بلسانك متى شئت."));
        alqyamaExes.add(new AlqyamaEx("فَإِذَا قَرَأْنَاهُ فَاتَّبِعْ قُرْآنَهُ (18)"));
        alqyamaExes.add(new AlqyamaEx("فإذا قرأه عليك رسولنا جبريل فاستمِعْ لقراءته وأنصت له، ثم اقرأه كما أقرأك إياه."));
        alqyamaExes.add(new AlqyamaEx("ثُمَّ إِنَّ عَلَيْنَا بَيَانَهُ (19)"));
        alqyamaExes.add(new AlqyamaEx("ثم إن علينا توضيح ما أشكل عليك فهمه من معانيه وأحكامه."));
        alqyamaExes.add(new AlqyamaEx("كَلَّا بَلْ تُحِبُّونَ الْعَاجِلَةَ (20)"));
        alqyamaExes.add(new AlqyamaEx("ليس الأمر كما زعمتم -يا معشر المشركين- أن لا بعث ولا جزاء، بل أنتم قوم تحبون الدنيا وزينتها."));
        alqyamaExes.add(new AlqyamaEx("وَتَذَرُونَ الْآخِرَةَ (21)"));
        alqyamaExes.add(new AlqyamaEx("وتتركون الآخرة ونعيمها."));
        alqyamaExes.add(new AlqyamaEx("وُجُوهٌ يَوْمَئِذٍ نَاضِرَةٌ (22)"));
        alqyamaExes.add(new AlqyamaEx("وجوه أهل السعادة يوم القيامة مشرقة حسنة ناعمة."));
        alqyamaExes.add(new AlqyamaEx("إِلَى رَبِّهَا نَاظِرَةٌ (23)"));
        alqyamaExes.add(new AlqyamaEx("ترى خالقها ومالك أمرها، فتتمتع بذلك."));
        alqyamaExes.add(new AlqyamaEx("وَوُجُوهٌ يَوْمَئِذٍ بَاسِرَةٌ (24)"));
        alqyamaExes.add(new AlqyamaEx("ووجوه الأشقياء يوم القيامة عابسة كالحة."));
        alqyamaExes.add(new AlqyamaEx("تَظُنُّ أَنْ يُفْعَلَ بِهَا فَاقِرَةٌ (25)"));
        alqyamaExes.add(new AlqyamaEx("تتوقع أن تنزل بها مصيبة عظيمة، تقصم فَقَار الظَّهْر."));
        alqyamaExes.add(new AlqyamaEx("كَلَّا إِذَا بَلَغَتِ التَّرَاقِيَ (26)"));
        alqyamaExes.add(new AlqyamaEx("حقًّا إذا وصلت الروح إلى أعالي الصدر."));
        alqyamaExes.add(new AlqyamaEx("وَقِيلَ مَنْ رَاقٍ (27)"));
        alqyamaExes.add(new AlqyamaEx("وقال بعض الحاضرين لبعض: هل مِن راق يَرْقيه ويَشْفيه مما هو فيه؟"));
        alqyamaExes.add(new AlqyamaEx("وَظَنَّ أَنَّهُ الْفِرَاقُ (28)"));
        alqyamaExes.add(new AlqyamaEx("وأيقن المحتضر أنَّ الذي نزل به هو فراق الدنيا؛ لمعاينته ملائكة الموت."));
        alqyamaExes.add(new AlqyamaEx("وَالْتَفَّتِ السَّاقُ بِالسَّاقِ (29)"));
        alqyamaExes.add(new AlqyamaEx("واتصلت شدة آخر الدنيا بشدة أول الآخرة."));
        alqyamaExes.add(new AlqyamaEx("إِلَى رَبِّكَ يَوْمَئِذٍ الْمَسَاقُ (30)"));
        alqyamaExes.add(new AlqyamaEx("إلى الله تعالى مساق العباد يوم القيامة: إما إلى الجنة وإما إلى النار."));
        alqyamaExes.add(new AlqyamaEx("فَلَا صَدَّقَ وَلَا صَلَّى (31)"));
        alqyamaExes.add(new AlqyamaEx("فلا آمن الكافر بالرسول والقرآن، ولا أدَّى لله تعالى فرائض الصلاة"));
        alqyamaExes.add(new AlqyamaEx("وَلَكِنْ كَذَّبَ وَتَوَلَّى (32)"));
        alqyamaExes.add(new AlqyamaEx("ولكن كذَّب بالقرآن، وأعرض عن الإيمان."));
        alqyamaExes.add(new AlqyamaEx("ثُمَّ ذَهَبَ إِلَى أَهْلِهِ يَتَمَطَّى (33)"));
        alqyamaExes.add(new AlqyamaEx("ثم مضى إلى أهله يتبختر مختالا في مشيته."));
        alqyamaExes.add(new AlqyamaEx("أَوْلَى لَكَ فَأَوْلَى (34)"));
        alqyamaExes.add(new AlqyamaEx("هلاك لك فهلاك."));
        alqyamaExes.add(new AlqyamaEx("ثُمَّ أَوْلَى لَكَ فَأَوْلَى (35)"));
        alqyamaExes.add(new AlqyamaEx("ثم هلاك لك فهلاك."));
        alqyamaExes.add(new AlqyamaEx("أَيَحْسَبُ الْإِنْسَانُ أَنْ يُتْرَكَ سُدًى (36)"));
        alqyamaExes.add(new AlqyamaEx("أيظنُّ هذا الإنسان المنكر للبعث أن يُترك هَمَلا لا يُؤمر ولا يُنْهى، ولا يحاسب ولا يعاقب؟"));
        alqyamaExes.add(new AlqyamaEx("أَلَمْ يَكُ نُطْفَةً مِنْ مَنِيٍّ يُمْنَى (37)"));
        alqyamaExes.add(new AlqyamaEx("ألم يك هذا الإنسان نطفة ضعيفة من ماء مهين يراق ويصب في الأرحام."));
        alqyamaExes.add(new AlqyamaEx("ثُمَّ كَانَ عَلَقَةً فَخَلَقَ فَسَوَّى (38)"));
        alqyamaExes.add(new AlqyamaEx("ثم صار قطعة من دم جامد، فخلقه الله بقدرته وسوَّى صورته في أحسن تقويم؟"));
        alqyamaExes.add(new AlqyamaEx("فَجَعَلَ مِنْهُ الزَّوْجَيْنِ الذَّكَرَ وَالْأُنْثَى (39)"));
        alqyamaExes.add(new AlqyamaEx("فجعل من هذا الإنسان الصنفين: الذكر والأنثى."));
        alqyamaExes.add(new AlqyamaEx("أَلَيْسَ ذَلِكَ بِقَادِرٍ عَلَى أَنْ يُحْيِيَ الْمَوْتَى (40)"));
        alqyamaExes.add(new AlqyamaEx("أليس ذلك الإله الخالق لهذه الأشياء بقادر على إعادة الخلق بعد فنائهم؟ بلى إنه -سبحانه وتعالى- لقادر على ذلك."));


        quran_explanation_75_adapter = new quran_explanation_75_adapter(alqyamaExes ,QuranExplanation_75Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_75);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_75Activity.this));
        recyclerView.setAdapter(quran_explanation_75_adapter);


    }

}