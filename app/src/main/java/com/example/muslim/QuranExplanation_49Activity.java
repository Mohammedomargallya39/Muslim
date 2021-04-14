package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_49Activity extends AppCompatActivity {

    ArrayList<AlhogratEx> alhogratExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_49_adapter quran_explanation_49_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_49);

        alhogratExes.add(new AlhogratEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيم"));
        alhogratExes.add(new AlhogratEx("يَاأَيُّهَا الَّذِينَ آمَنُوا لَا تُقَدِّمُوا بَيْنَ يَدَيِ اللَّهِ وَرَسُولِهِ وَاتَّقُوا اللَّهَ إِنَّ اللَّهَ سَمِيعٌ عَلِيمٌ (1)"));
        alhogratExes.add(new AlhogratEx("يا أيها الذين آمنوا بالله ورسوله لا تقضوا أمرًا دون أمر الله ورسوله من شرائع دينكم فتبتدعوا، وخافوا الله في قولكم وفعلكم أن يخالَف أمر الله ورسوله، إن الله سميع لأقوالكم، عليم بنياتكم وأفعالكم. وفي هذا تحذير للمؤمنين أن يبتدعوا في الدين، أو يشرعوا ما لم يأذن به الله."));
        alhogratExes.add(new AlhogratEx("يَاأَيُّهَا الَّذِينَ آمَنُوا لَا تَرْفَعُوا أَصْوَاتَكُمْ فَوْقَ صَوْتِ النَّبِيِّ وَلَا تَجْهَرُوا لَهُ بِالْقَوْلِ كَجَهْرِ بَعْضِكُمْ لِبَعْضٍ أَنْ تَحْبَطَ أَعْمَالُكُمْ وَأَنْتُمْ لَا تَشْعُرُونَ (2)"));
        alhogratExes.add(new AlhogratEx("يا أيها الذين صدَّقوا الله ورسوله وعملوا بشرعه، لا ترفعوا أصواتكم فوق صوت النبي عند مخاطبتكم له، ولا تجهروا بمناداته كما يجهر بعضكم لبعض، وميِّزوه في خطابه كما تميَّز عن غيره في اصطفائه لحمل رسالة ربه، ووجوب الإيمان به، ومحبته وطاعته والاقتداء به؛ خشية أن تبطل أعمالكم، وأنتم لا تشعرون، ولا تُحِسُّون بذلك."));
        alhogratExes.add(new AlhogratEx("إِنَّ الَّذِينَ يَغُضُّونَ أَصْوَاتَهُمْ عِنْدَ رَسُولِ اللَّهِ أُولَئِكَ الَّذِينَ امْتَحَنَ اللَّهُ قُلُوبَهُمْ لِلتَّقْوَى لَهُمْ مَغْفِرَةٌ وَأَجْرٌ عَظِيمٌ (3)"));
        alhogratExes.add(new AlhogratEx("إن الذين يَخْفِضون أصواتهم عند رسول الله أولئك الذين اختبر الله قلوبهم، وأخلصها لتقواه، لهم من الله مغفرة لذنوبهم وثواب جزيل، وهو الجنة."));
        alhogratExes.add(new AlhogratEx("إِنَّ الَّذِينَ يُنَادُونَكَ مِنْ وَرَاءِ الْحُجُرَاتِ أَكْثَرُهُمْ لَا يَعْقِلُونَ (4)"));
        alhogratExes.add(new AlhogratEx("إن الذين ينادونك -أيها النبي- من وراء حجراتك بصوت مرتفع، أكثرهم ليس لهم من العقل ما يحملهم على حسن الأدب مع رسول الله صلى الله عليه وسلَّم، وتوقيره."));
        alhogratExes.add(new AlhogratEx("وَلَوْ أَنَّهُمْ صَبَرُوا حَتَّى تَخْرُجَ إِلَيْهِمْ لَكَانَ خَيْرًا لَهُمْ وَاللَّهُ غَفُورٌ رَحِيمٌ (5)"));
        alhogratExes.add(new AlhogratEx("ولو أنهم صبروا حتى تخرج إليهم لكان خيرًا لهم عند الله; لأن الله قد أمرهم بتوقيرك، والله غفور لما صدر عنهم جهلا منهم من الذنوب والإخلال بالآداب، رحيم بهم حيث لم يعاجلهم بالعقوبة."));
        alhogratExes.add(new AlhogratEx("يَاأَيُّهَا الَّذِينَ آمَنُوا إِنْ جَاءَكُمْ فَاسِقٌ بِنَبَإٍ فَتَبَيَّنُوا أَنْ تُصِيبُوا قَوْمًا بِجَهَالَةٍ فَتُصْبِحُوا عَلَى مَا فَعَلْتُمْ نَادِمِينَ (6)"));
        alhogratExes.add(new AlhogratEx("يا أيها الذين صدَّقوا الله ورسوله وعملوا بشرعه، إن جاءكم فاسق بخبر فتثبَّتوا من خبره قبل تصديقه ونقله حتى تعرفوا صحته؛ خشية أن تصيبوا قومًا برآء بجناية منكم، فتندموا على ذلك."));
        alhogratExes.add(new AlhogratEx("وَاعْلَمُوا أَنَّ فِيكُمْ رَسُولَ اللَّهِ لَوْ يُطِيعُكُمْ فِي كَثِيرٍ مِنَ الْأَمْرِ لَعَنِتُّمْ وَلَكِنَّ اللَّهَ حَبَّبَ إِلَيْكُمُ الْإِيمَانَ وَزَيَّنَهُ فِي قُلُوبِكُمْ وَكَرَّهَ إِلَيْكُمُ الْكُفْرَ وَالْفُسُوقَ وَالْعِصْيَانَ أُولَئِكَ هُمُ الرَّاشِدُونَ (7)"));
        alhogratExes.add(new AlhogratEx("واعلموا أن بين أظهركم رسولَ الله فتأدبوا معه؛ فإنه أعلم منكم بما يصلح لكم، يريد بكم الخير، وقد تريدون لأنفسكم من الشر والمضرة ما لا يوافقكم الرسول عليه، لو يطيعكم في كثير من الأمر مما تختارونه لأدى ذلك إلى مشقتكم، ولكن الله حبب إليكم الإيمان وحسَّنه في قلوبكم، فآمنتم، وكرَّه إليكم الكفرَ بالله والخروجَ عن طاعته، ومعصيتَه، أولئك المتصفون بهذه الصفات هم الراشدون السالكون طريق الحق."));
        alhogratExes.add(new AlhogratEx("فَضْلًا مِنَ اللَّهِ وَنِعْمَةً وَاللَّهُ عَلِيمٌ حَكِيمٌ (8)"));
        alhogratExes.add(new AlhogratEx("وهذا الخير الذي حصل لهم فضل من الله عليهم ونعمة. والله عليم بمن يشكر نعمه، حكيم في تدبير أمور خلقه."));
        alhogratExes.add(new AlhogratEx("وَإِنْ طَائِفَتَانِ مِنَ الْمُؤْمِنِينَ اقْتَتَلُوا فَأَصْلِحُوا بَيْنَهُمَا فَإِنْ بَغَتْ إِحْدَاهُمَا عَلَى الْأُخْرَى فَقَاتِلُوا الَّتِي تَبْغِي حَتَّى تَفِيءَ إِلَى أَمْرِ اللَّهِ فَإِنْ فَاءَتْ فَأَصْلِحُوا بَيْنَهُمَا بِالْعَدْلِ وَأَقْسِطُوا إِنَّ اللَّهَ يُحِبُّ الْمُقْسِطِينَ (9)"));
        alhogratExes.add(new AlhogratEx("وإن طائفتان من أهل الإيمان اقتتلوا فأصلحوا -أيها المؤمنون- بينهما بدعوتهما إلى الاحتكام إلى كتاب الله وسنة رسوله صلى الله عليه وسلم، والرضا بحكمهما، فإن اعتدت إحدى الطائفتين وأبت الإجابة إلى ذلك، فقاتلوها حتى ترجع إلى حكم الله ورسوله، فإن رجعت فأصلحوا بينهما بالإنصاف، واعدلوا في حكمكم بأن لا تتجاوزوا في أحكامكم حكم الله وحكم رسوله، إن الله يحب العادلين في أحكامهم القاضين بين خلقه بالقسط. وفي الآية إثبات صفة المحبة لله على الحقيقة، كما يليق بجلاله سبحانه."));
        alhogratExes.add(new AlhogratEx("إِنَّمَا الْمُؤْمِنُونَ إِخْوَةٌ فَأَصْلِحُوا بَيْنَ أَخَوَيْكُمْ وَاتَّقُوا اللَّهَ لَعَلَّكُمْ تُرْحَمُونَ (10)"));
        alhogratExes.add(new AlhogratEx("إنما المؤمنون إخوة في الدين، فأصلحوا بين أخويكم إذا اقتتلا وخافوا الله في جميع أموركم؛ رجاء أن تُرحموا."));
        alhogratExes.add(new AlhogratEx("يَاأَيُّهَا الَّذِينَ آمَنُوا لَا يَسْخَرْ قَوْمٌ مِنْ قَوْمٍ عَسَى أَنْ يَكُونُوا خَيْرًا مِنْهُمْ وَلَا نِسَاءٌ مِنْ نِسَاءٍ عَسَى أَنْ يَكُنَّ خَيْرًا مِنْهُنَّ وَلَا تَلْمِزُوا أَنْفُسَكُمْ وَلَا تَنَابَزُوا بِالْأَلْقَابِ بِئْسَ الِاسْمُ الْفُسُوقُ بَعْدَ الْإِيمَانِ وَمَنْ لَمْ يَتُبْ فَأُولَئِكَ هُمُ الظَّالِمُونَ (11)"));
        alhogratExes.add(new AlhogratEx("يا أيها الذين صدَّقوا الله ورسوله وعملوا بشريعته لا يهزأ قوم مؤمنون من قوم مؤمنين؛ عسى أن يكون المهزوء به منهم خيرًا من الهازئين، ولا يهزأ نساء مؤمنات من نساء مؤمنات; عسى أن يكون المهزوء به منهنَّ خيرًا من الهازئات، ولا يَعِبْ بعضكم بعضًا، ولا يَدْعُ بعضكم بعضًا بما يكره من الألقاب، بئس الصفة والاسم الفسوق، وهو السخرية واللمز والتنابز بالألقاب، بعد ما دخلتم في الإسلام وعقلتموه، ومن لم يتب من هذه السخرية واللمز والتنابز والفسوق فأولئك هم الذين ظلموا أنفسهم بارتكاب هذه المناهي."));
        alhogratExes.add(new AlhogratEx("يَاأَيُّهَا الَّذِينَ آمَنُوا اجْتَنِبُوا كَثِيرًا مِنَ الظَّنِّ إِنَّ بَعْضَ الظَّنِّ إِثْمٌ وَلَا تَجَسَّسُوا وَلَا يَغْتَبْ بَعْضُكُمْ بَعْضًا أَيُحِبُّ أَحَدُكُمْ أَنْ يَأْكُلَ لَحْمَ أَخِيهِ مَيْتًا فَكَرِهْتُمُوهُ وَاتَّقُوا اللَّهَ إِنَّ اللَّهَ تَوَّابٌ رَحِيمٌ (12)"));
        alhogratExes.add(new AlhogratEx("يا أيها الذين صدَّقوا الله ورسوله وعملوا بشرعه اجتنبوا كثيرًا من ظن السوء بالمؤمنين; إن بعض ذلك الظن إثم، ولا تُفَتِّشوا عن عورات المسلمين، ولا يقل بعضكم في بعضٍ بظهر الغيب ما يكره. أيحب أحدكم أكل لحم أخيه وهو ميت؟ فأنتم تكرهون ذلك، فاكرهوا اغتيابه. وخافوا الله فيما أمركم به ونهاكم عنه. إن الله تواب على عباده المؤمنين، رحيم بهم."));
        alhogratExes.add(new AlhogratEx("يَاأَيُّهَا النَّاسُ إِنَّا خَلَقْنَاكُمْ مِنْ ذَكَرٍ وَأُنْثَى وَجَعَلْنَاكُمْ شُعُوبًا وَقَبَائِلَ لِتَعَارَفُوا إِنَّ أَكْرَمَكُمْ عِنْدَ اللَّهِ أَتْقَاكُمْ إِنَّ اللَّهَ عَلِيمٌ خَبِيرٌ (13)"));
        alhogratExes.add(new AlhogratEx("يا أيها الناس إنَّا خلقناكم من أب واحد هو آدم، وأُم واحدة هي حواء، فلا تفاضل بينكم في النسب، وجعلناكم بالتناسل شعوبًا وقبائل متعددة؛ ليعرف بعضكم بعضًا، إن أكرمكم عند الله أشدكم اتقاءً له. إن الله عليم بالمتقين، خبير بهم."));
        alhogratExes.add(new AlhogratEx("قَالَتِ الْأَعْرَابُ آمَنَّا قُلْ لَمْ تُؤْمِنُوا وَلَكِنْ قُولُوا أَسْلَمْنَا وَلَمَّا يَدْخُلِ الْإِيمَانُ فِي قُلُوبِكُمْ وَإِنْ تُطِيعُوا اللَّهَ وَرَسُولَهُ لَا يَلِتْكُمْ مِنْ أَعْمَالِكُمْ شَيْئًا إِنَّ اللَّهَ غَفُورٌ رَحِيمٌ (14)"));
        alhogratExes.add(new AlhogratEx("قالت الأعراب -وهم البدو-: آمنا بالله ورسوله إيمانًا كاملا قل لهم -أيها النبي-: لا تدَّعوا لأنفسكم الإيمان الكامل، ولكن قولوا: أسلمنا، ولم يدخل بعدُ الإيمان في قلوبكم، وإن تطيعوا الله ورسوله لا ينقصكم من ثواب أعمالكم شيئًا. إن الله غفور لمن تاب مِن ذنوبه، رحيم به. وفي الآية زجر لمن يُظهر الإيمان، ومتابعة السنة، وأعماله تشهد بخلاف ذلك."));
        alhogratExes.add(new AlhogratEx("إِنَّمَا الْمُؤْمِنُونَ الَّذِينَ آمَنُوا بِاللَّهِ وَرَسُولِهِ ثُمَّ لَمْ يَرْتَابُوا وَجَاهَدُوا بِأَمْوَالِهِمْ وَأَنْفُسِهِمْ فِي سَبِيلِ اللَّهِ أُولَئِكَ هُمُ الصَّادِقُونَ (15)"));
        alhogratExes.add(new AlhogratEx("إنما المؤمنون الذين صدَّقوا بالله وبرسوله وعملوا بشرعه، ثم لم يرتابوا في إيمانهم، وبذلوا نفائس أموالهم وأرواحهم في الجهاد في سبيل الله وطاعته ورضوانه، أولئك هم الصادقون في إيمانهم."));
        alhogratExes.add(new AlhogratEx("قُلْ أَتُعَلِّمُونَ اللَّهَ بِدِينِكُمْ وَاللَّهُ يَعْلَمُ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ وَاللَّهُ بِكُلِّ شَيْءٍ عَلِيمٌ (16)"));
        alhogratExes.add(new AlhogratEx("قل -أيها النبي- لهؤلاء الأعراب: أتُخَبِّرون الله بدينكم وبما في ضمائركم، والله يعلم ما في السموات وما في الأرض؟ والله بكل شيء عليم، لا يخفى عليه ما في قلوبكم من الإيمان أو الكفر، والبر أو الفجور."));
        alhogratExes.add(new AlhogratEx("يَمُنُّونَ عَلَيْكَ أَنْ أَسْلَمُوا قُلْ لَا تَمُنُّوا عَلَيَّ إِسْلَامَكُمْ بَلِ اللَّهُ يَمُنُّ عَلَيْكُمْ أَنْ هَدَاكُمْ لِلْإِيمَانِ إِنْ كُنْتُمْ صَادِقِينَ (17)"));
        alhogratExes.add(new AlhogratEx("يَمُنُّ هؤلاء الأعراب عليك -أيها النبي- بإسلامهم ومتابعتهم ونصرتهم لك، قل لهم: لا تَمُنُّوا عليَّ دخولكم في الإسلام ; فإنَّ نفع ذلك إنما يعود عليكم، ولله المنة عليكم فيه أنْ وفقكم للإيمان به وبرسوله، إن كنتم صادقين في إيمانكم."));
        alhogratExes.add(new AlhogratEx("إِنَّ اللَّهَ يَعْلَمُ غَيْبَ السَّمَاوَاتِ وَالْأَرْضِ وَاللَّهُ بَصِيرٌ بِمَا تَعْمَلُونَ (18)"));
        alhogratExes.add(new AlhogratEx("إن الله يعلم غيب السموات والأرض، لا يخفى عليه شيء من ذلك، والله بصير بأعمالكم وسيجازيكم عليها، إن خيرًا فخير، وإن شرًا فشر."));




        quran_explanation_49_adapter = new quran_explanation_49_adapter(alhogratExes ,QuranExplanation_49Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_49);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_49Activity.this));
        recyclerView.setAdapter(quran_explanation_49_adapter);


    }

}