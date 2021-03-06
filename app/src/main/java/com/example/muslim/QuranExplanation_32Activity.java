package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_32Activity extends AppCompatActivity {

    ArrayList<AlsagdaEx> alsagdaExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_32_adapter quran_explanation_32_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_32);

        alsagdaExes.add(new AlsagdaEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alsagdaExes.add(new AlsagdaEx("الم (1)"));
        alsagdaExes.add(new AlsagdaEx("(الم) سبق الكلام على الحروف المقطَّعة في أول سورة البقرة."));
        alsagdaExes.add(new AlsagdaEx("تَنْزِيلُ الْكِتَابِ لَا رَيْبَ فِيهِ مِنْ رَبِّ الْعَالَمِينَ (2)"));
        alsagdaExes.add(new AlsagdaEx("هذا القرآن الذي جاء به محمد صلى الله عليه وسلم لا شك أنه منزل من عند الله، رب الخلائق أجمعين."));
        alsagdaExes.add(new AlsagdaEx("أَمْ يَقُولُونَ افْتَرَاهُ بَلْ هُوَ الْحَقُّ مِنْ رَبِّكَ لِتُنْذِرَ قَوْمًا مَا أَتَاهُمْ مِنْ نَذِيرٍ مِنْ قَبْلِكَ لَعَلَّهُمْ يَهْتَدُونَ (3)"));
        alsagdaExes.add(new AlsagdaEx("بل أيقول المشركون: اختلق محمد صلى الله عليه وسلم القرآن؟ كذَبوا، بل هو الحق الثابت المنزل عليك -أيها الرسول- من ربك; لتنذر به أناسًا لم يأتهم نذير من قبلك، لعلهم يهتدون، فيعرفوا الحق ويؤمنوا به ويؤثروه، ويؤمنوا بك."));
        alsagdaExes.add(new AlsagdaEx("اللَّهُ الَّذِي خَلَقَ السَّمَاوَاتِ وَالْأَرْضَ وَمَا بَيْنَهُمَا فِي سِتَّةِ أَيَّامٍ ثُمَّ اسْتَوَى عَلَى الْعَرْشِ مَا لَكُمْ مِنْ دُونِهِ مِنْ وَلِيٍّ وَلَا شَفِيعٍ أَفَلَا تَتَذَكَّرُونَ (4)"));
        alsagdaExes.add(new AlsagdaEx("الله الذي خلق السموات والأرض وما بينهما في ستة أيام لحكمة يعلمها، وهو قادر أن يخلقها بكلمة «كن» فتكون، ثم استوى سبحانه وتعالى -أي علا وارتفع- على عرشه استواء يليق بجلاله، لا يكيَّف، ولا يشبَّه باستواء المخلوقين. ليس لكم -أيها الناس- من وليٍّ يلي أموركم، أو شفيع يشفع لكم عند الله؛ لتنجوا من عذابه، أفلا تتعظون وتتفكرون -أيها الناس-، فتُفردوا الله بالألوهية وتُخلصوا له العبادة؟"));
        alsagdaExes.add(new AlsagdaEx("يُدَبِّرُ الْأَمْرَ مِنَ السَّمَاءِ إِلَى الْأَرْضِ ثُمَّ يَعْرُجُ إِلَيْهِ فِي يَوْمٍ كَانَ مِقْدَارُهُ أَلْفَ سَنَةٍ مِمَّا تَعُدُّونَ (5)"));
        alsagdaExes.add(new AlsagdaEx("يدبر الله تعالى أَمْر المخلوقات من السماء إلى الأرض، ثم يصعد ذلك الأمر والتدبير إلى الله في يوم مقداره ألف سنة من أيام الدنيا التي تعدُّونها."));
        alsagdaExes.add(new AlsagdaEx("ذَلِكَ عَالِمُ الْغَيْبِ وَالشَّهَادَةِ الْعَزِيزُ الرَّحِيمُ (6)"));
        alsagdaExes.add(new AlsagdaEx("ذلك الخالق المدبِّر لشؤون العالمين، عالم بكل ما يغيب عن الأبصار، مما تُكِنُّه الصدور وتخفيه النفوس، وعالم بما شاهدته الأبصار، وهو القويُّ الظاهر الذي لا يغالَب، الرحيم بعباده المؤمنين."));
        alsagdaExes.add(new AlsagdaEx("الَّذِي أَحْسَنَ كُلَّ شَيْءٍ خَلَقَهُ وَبَدَأَ خَلْقَ الْإِنْسَانِ مِنْ طِينٍ (7)"));
        alsagdaExes.add(new AlsagdaEx("الله الذي أحكم خلق كل شيء، وبدأ خَلْقَ الإنسان، وهو آدم عليه السلام من طين."));
        alsagdaExes.add(new AlsagdaEx("ثُمَّ جَعَلَ نَسْلَهُ مِنْ سُلَالَةٍ مِنْ مَاءٍ مَهِينٍ (8)"));
        alsagdaExes.add(new AlsagdaEx("ثم جعل ذرية آدم متناسلة من نطفة ضعيفة رقيقة مهينة."));
        alsagdaExes.add(new AlsagdaEx("ثُمَّ سَوَّاهُ وَنَفَخَ فِيهِ مِنْ رُوحِهِ وَجَعَلَ لَكُمُ السَّمْعَ وَالْأَبْصَارَ وَالْأَفْئِدَةَ قَلِيلًا مَا تَشْكُرُونَ (9)"));
        alsagdaExes.add(new AlsagdaEx("ثم أتم خلق الإنسان وأبدعه، وأحسن خلقته، ونفخ فيه مِن روحه بإرسال الملك له؛ لينفخ فيه الروح، وجعل لكم -أيها الناس- نعمة السمع والأبصار يُميَّز بها بين الأصوات والألوان والذوات والأشخاص، ونعمة العقل يُميَّز بها بين الخير والشر والنافع والضار. قليلا ما تشكرون ربكم على ما أنعم به عليكم."));
        alsagdaExes.add(new AlsagdaEx("وَقَالُوا أَإِذَا ضَلَلْنَا فِي الْأَرْضِ أَإِنَّا لَفِي خَلْقٍ جَدِيدٍ بَلْ هُمْ بِلِقَاءِ رَبِّهِمْ كَافِرُونَ (10)"));
        alsagdaExes.add(new AlsagdaEx("وقال المشركون بالله المكذبون بالبعث: أإذا صارت لحومنا وعظامنا ترابًا في الأرض أنُبعَث خلقًا جديدًا؟ يستبعدون ذلك غير طالبين الوصول إلى الحق، وإنما هو منهم ظلم وعناد؛ لأنهم بلقاء ربهم -يوم القيامة- كافرون."));
        alsagdaExes.add(new AlsagdaEx("قُلْ يَتَوَفَّاكُمْ مَلَكُ الْمَوْتِ الَّذِي وُكِّلَ بِكُمْ ثُمَّ إِلَى رَبِّكُمْ تُرْجَعُونَ (11)"));
        alsagdaExes.add(new AlsagdaEx("قل -أيها الرسول- لهؤلاء المشركين: يتوفاكم ملك الموت الذي وُكِّل بكم، فيقبض أرواحكم إذا انتهت آجالكم، ولن تتأخروا لحظة واحدة، ثم تُردُّون إلى ربكم، فيجازيكم على جميع أعمالكم: إن خيرًا فخير وإن شرًا فشر."));
        alsagdaExes.add(new AlsagdaEx("وَلَوْ تَرَى إِذِ الْمُجْرِمُونَ نَاكِسُو رُءُوسِهِمْ عِنْدَ رَبِّهِمْ رَبَّنَا أَبْصَرْنَا وَسَمِعْنَا فَارْجِعْنَا نَعْمَلْ صَالِحًا إِنَّا مُوقِنُونَ (12)"));
        alsagdaExes.add(new AlsagdaEx("ولو ترى -أيها المخاطب- إذ المجرمون الذين أنكروا البعث قد خفضوا رؤوسهم عند ربهم من الخزي والعار قائلين: ربنا أبصرنا قبائحنا، وسمعنا منك تصديق ما كانت رسلك تأمرنا به في الدنيا، وقد تُبْنا إليك، فارجعنا إلى الدنيا لنعمل فيها بطاعتك، إنا قد أيقنَّا الآن ما كنا به في الدنيا مكذبين من وحدانيتك، وأنك تبعث من في القبور. ولو رأيت -أيها الخاطب- ذلك كله، لرأيت أمرًا عظيمًا، وخطبًا جسيمًا."));
        alsagdaExes.add(new AlsagdaEx("وَلَوْ شِئْنَا لَآتَيْنَا كُلَّ نَفْسٍ هُدَاهَا وَلَكِنْ حَقَّ الْقَوْلُ مِنِّي لَأَمْلَأَنَّ جَهَنَّمَ مِنَ الْجِنَّةِ وَالنَّاسِ أَجْمَعِينَ (13)"));
        alsagdaExes.add(new AlsagdaEx("ولو شئنا لآتينا هؤلاء المشركين بالله رشدهم وتوفيقهم للإيمان، ولكن حق القول مني ووجب لأملأنَّ جهنم من أهل الكفر والمعاصي، من صنفي الجِنِّ والإنس أجمعين؛ وذلك لاختيارهم الضلالة على الهدى."));
        alsagdaExes.add(new AlsagdaEx("فَذُوقُوا بِمَا نَسِيتُمْ لِقَاءَ يَوْمِكُمْ هَذَا إِنَّا نَسِينَاكُمْ وَذُوقُوا عَذَابَ الْخُلْدِ بِمَا كُنْتُمْ تَعْمَلُونَ (14)"));
        alsagdaExes.add(new AlsagdaEx("يقال لهؤلاء المشركين -عند دخولهم النار على سبيل التوبيخ-: فذوقوا العذاب؛ بسبب غفلتكم عن الآخرة وانغماسكم في لذائذ الدنيا، إنا تركناكم اليوم في العذاب، وذوقوا عذاب جهنم الذي لا ينقطع؛ بما كنتم تعملون في الدنيا من الكفر بالله ومعاصيه."));
        alsagdaExes.add(new AlsagdaEx("إِنَّمَا يُؤْمِنُ بِآيَاتِنَا الَّذِينَ إِذَا ذُكِّرُوا بِهَا خَرُّوا سُجَّدًا وَسَبَّحُوا بِحَمْدِ رَبِّهِمْ وَهُمْ لَا يَسْتَكْبِرُونَ (15)"));
        alsagdaExes.add(new AlsagdaEx("إنما يصدق بآيات القرآن ويعمل بها الذين إذا وُعِظوا بها أو تُليت عليهم سجدوا لربهم خاشعين مطيعين، وسبَّحوا الله في سجودهم بحمده، وهم لا يستكبرون عن السجود والتسبيح له، وعبادته وحده لا شريك له."));
        alsagdaExes.add(new AlsagdaEx("تَتَجَافَى جُنُوبُهُمْ عَنِ الْمَضَاجِعِ يَدْعُونَ رَبَّهُمْ خَوْفًا وَطَمَعًا وَمِمَّا رَزَقْنَاهُمْ يُنْفِقُونَ (16)"));
        alsagdaExes.add(new AlsagdaEx("ترتفع جنوب هؤلاء الذين يؤمنون بآيات الله عن فراش النوم، يتهجدون لربهم في صلاة الليل، يدعون ربهم خوفًا من العذاب وطمعًا في الثواب، ومما رزقناهم ينفقون في طاعة الله وفي سبيله."));
        alsagdaExes.add(new AlsagdaEx("فَلَا تَعْلَمُ نَفْسٌ مَا أُخْفِيَ لَهُمْ مِنْ قُرَّةِ أَعْيُنٍ جَزَاءً بِمَا كَانُوا يَعْمَلُونَ (17)"));
        alsagdaExes.add(new AlsagdaEx("فلا تعلم نفس ما ادَّخر الله لهؤلاء المؤمنين مما تَقَرُّ به العين، وينشرح له الصدر؛ جزاء لهم على أعمالهم الصالحة."));
        alsagdaExes.add(new AlsagdaEx("أَفَمَنْ كَانَ مُؤْمِنًا كَمَنْ كَانَ فَاسِقًا لَا يَسْتَوُونَ (18)"));
        alsagdaExes.add(new AlsagdaEx("أفمن كان مطيعًا لله ورسوله مصدقًا بوعده ووعيده، مثل من كفر بالله ورسله وكذب باليوم الآخر؟ لا يستوون عند الله."));
        alsagdaExes.add(new AlsagdaEx("أَمَّا الَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ فَلَهُمْ جَنَّاتُ الْمَأْوَى نُزُلًا بِمَا كَانُوا يَعْمَلُونَ (19)"));
        alsagdaExes.add(new AlsagdaEx("أما الذين آمنوا بالله وعملوا بما أُمِروا به فجزاؤهم جنات يأوون إليها، ويقيمون في نعيمها ضيافة لهم؛ جزاءً لهم بما كانوا يعملون في الدنيا بطاعته."));
        alsagdaExes.add(new AlsagdaEx("وَأَمَّا الَّذِينَ فَسَقُوا فَمَأْوَاهُمُ النَّارُ كُلَّمَا أَرَادُوا أَنْ يَخْرُجُوا مِنْهَا أُعِيدُوا فِيهَا وَقِيلَ لَهُمْ ذُوقُوا عَذَابَ النَّارِ الَّذِي كُنْتُمْ بِهِ تُكَذِّبُونَ (20)"));
        alsagdaExes.add(new AlsagdaEx("وأما الذين خرجوا عن طاعة الله وعملوا بمعاصيه فمستقرهم جهنم، كلما أرادوا أن يخرجوا منها أعيدوا فيها، وقيل لهم -توبيخاً وتقريعاً-: ذوقوا عذاب النار الذي كنتم به تكذبون في الدنيا."));
        alsagdaExes.add(new AlsagdaEx("وَلَنُذِيقَنَّهُمْ مِنَ الْعَذَابِ الْأَدْنَى دُونَ الْعَذَابِ الْأَكْبَرِ لَعَلَّهُمْ يَرْجِعُونَ (21)"));
        alsagdaExes.add(new AlsagdaEx("ولنذيقن هؤلاء الفاسقين المكذبين من العذاب الأدنى من البلاء والمحن والمصائب في الدنيا قبل العذاب الأكبر يوم القيامة، حيث يُعذَّبون في نار جهنم؛ لعلهم يرجعون ويتوبون من ذنوبهم."));
        alsagdaExes.add(new AlsagdaEx("وَمَنْ أَظْلَمُ مِمَّنْ ذُكِّرَ بِآيَاتِ رَبِّهِ ثُمَّ أَعْرَضَ عَنْهَا إِنَّا مِنَ الْمُجْرِمِينَ مُنْتَقِمُونَ (22)"));
        alsagdaExes.add(new AlsagdaEx("ولا أحد أشد ظلمًا لنفسه ممن وعظ بدلائل الله، ثم أعرض عن ذلك كله، فلم يتعظ بمواعظه، ولكنه استكبر عنها، إنا من المجرمين الذين أعرضوا عن آيات الله وحججه، ولم ينتفعوا بها، منتقمون."));
        alsagdaExes.add(new AlsagdaEx("وَلَقَدْ آتَيْنَا مُوسَى الْكِتَابَ فَلَا تَكُنْ فِي مِرْيَةٍ مِنْ لِقَائِهِ وَجَعَلْنَاهُ هُدًى لِبَنِي إِسْرَائِيلَ (23)"));
        alsagdaExes.add(new AlsagdaEx("ولقد آتينا موسى التوراة كما آتيناك -أيها الرسول- القرآن، فلا تكن في شك من لقاء موسى ليلة الإسراء والمعراج، وجعلنا التوراة هداية لبني إسرائيل، تدعوهم إلى الحق وإلى طريق مستقيم."));
        alsagdaExes.add(new AlsagdaEx("وَجَعَلْنَا مِنْهُمْ أَئِمَّةً يَهْدُونَ بِأَمْرِنَا لَمَّا صَبَرُوا وَكَانُوا بِآيَاتِنَا يُوقِنُونَ (24)"));
        alsagdaExes.add(new AlsagdaEx("وجعلنا من بني إسرائيل هداة ودعاة إلى الخير، يأتمُّ بهم الناس، ويدعونهم إلى التوحيد وعبادة الله وحده وطاعته، وإنما نالوا هذه الدرجة العالية حين صبروا على أوامر الله، وترك زواجره، والدعوة إليه، وتحمُّل الأذى في سبيله، وكانوا بآيات الله وحججه مصدقين على وجه اليقين."));
        alsagdaExes.add(new AlsagdaEx("إِنَّ رَبَّكَ هُوَ يَفْصِلُ بَيْنَهُمْ يَوْمَ الْقِيَامَةِ فِيمَا كَانُوا فِيهِ يَخْتَلِفُونَ (25)"));
        alsagdaExes.add(new AlsagdaEx("إن ربك -أيها الرسول- يقضي بين المؤمنين والكافرين من بني إسرائيل وغيرهم يوم القيامة بالعدل فيما اختلفوا فيه من أمور الدين، ويجازي كل إنسان بعمله بإدخال أهلِ الجنةِ الجنةَ وأهلِ النارِ النارَ."));
        alsagdaExes.add(new AlsagdaEx("أَوَلَمْ يَهْدِ لَهُمْ كَمْ أَهْلَكْنَا مِنْ قَبْلِهِمْ مِنَ الْقُرُونِ يَمْشُونَ فِي مَسَاكِنِهِمْ إِنَّ فِي ذَلِكَ لَآيَاتٍ أَفَلَا يَسْمَعُونَ (26)"));
        alsagdaExes.add(new AlsagdaEx("أو لم يتبين لهؤلاء المكذبين للرسول: كم أهلكنا من قبلهم من الأمم السابقة يمشون في مساكنهم، فيشاهدونها عِيانًا كقوم هود وصالح ولوط؟ إن في ذلك لآيات وعظات يُستدَلُّ بها على صدق الرسل التي جاءتهم، وبطلان ما هم عليه من الشرك، أفلا يسمع هؤلاء المكذبون بالرسل مواعظ الله وحججه، فينتفعون بها؟"));
        alsagdaExes.add(new AlsagdaEx("أَوَلَمْ يَرَوْا أَنَّا نَسُوقُ الْمَاءَ إِلَى الْأَرْضِ الْجُرُزِ فَنُخْرِجُ بِهِ زَرْعًا تَأْكُلُ مِنْهُ أَنْعَامُهُمْ وَأَنْفُسُهُمْ أَفَلَا يُبْصِرُونَ (27)"));
        alsagdaExes.add(new AlsagdaEx("أو لم ير المكذبون بالبعث بعد الموت أننا نسوق الماء إلى الأرض اليابسة الغليظة التي لا نبات فيها، فنخرج به زرعًا مختلفًا ألوانه تأكل منه أنعامهم، وتتغذى به أبدانهم فيعيشون به؟ أفلا يرون هذه النعم بأعينهم، فيعلموا أن الله الذي فعل ذلك قادر على إحياء الأموات ونَشْرهم من قبورهم؟"));
        alsagdaExes.add(new AlsagdaEx("وَيَقُولُونَ مَتَى هَذَا الْفَتْحُ إِنْ كُنْتُمْ صَادِقِينَ (28)"));
        alsagdaExes.add(new AlsagdaEx("يستعجل هؤلاء المشركون بالله العذاب، فيقولون: متى هذا الحكم الذي يقضي بيننا وبينكم بتعذيبنا على زعمكم إن كنتم صادقين في دعواكم؟"));
        alsagdaExes.add(new AlsagdaEx("قُلْ يَوْمَ الْفَتْحِ لَا يَنْفَعُ الَّذِينَ كَفَرُوا إِيمَانُهُمْ وَلَا هُمْ يُنْظَرُونَ (29)"));
        alsagdaExes.add(new AlsagdaEx("قل لهم -أيها الرسول-: يوم القضاء الذي يقع فيه عقابكم، وتعاينون فيه الموت لا ينفع الكفار إيمانهم، ولا هم يؤخرون للتوبة والمراجعة."));
        alsagdaExes.add(new AlsagdaEx("فَأَعْرِضْ عَنْهُمْ وَانْتَظِرْ إِنَّهُمْ مُنْتَظِرُونَ (30)"));
        alsagdaExes.add(new AlsagdaEx("فأعرض -أيها الرسول- عن هؤلاء المشركين، ولا تبال بتكذيبهم، وانتظر ما الله صانع بهم، إنهم منتظرون ومتربصون بكم دوائر السوء، فسيخزيهم الله ويذلهم، وينصرك عليهم. وقد فعل فله الحمد والمنة."));





        quran_explanation_32_adapter = new quran_explanation_32_adapter(alsagdaExes ,QuranExplanation_32Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_32);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_32Activity.this));
        recyclerView.setAdapter(quran_explanation_32_adapter);


    }

}