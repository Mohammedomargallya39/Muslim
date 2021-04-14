package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_48Activity extends AppCompatActivity {

    ArrayList<AlfathEx> alfathExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_48_adapter quran_explanation_48_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_48);

        alfathExes.add(new AlfathEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيم"));
        alfathExes.add(new AlfathEx("إِنَّا فَتَحْنَا لَكَ فَتْحًا مُبِينًا (1)"));
        alfathExes.add(new AlfathEx("إنا فتحنا لك -أيها الرسول- فتحًا مبينًا، يظهر الله فيه دينك، وينصرك على عدوك، وهو هدنة «الحديبية» التي أمن الناس بسببها بعضهم بعضًا، فاتسعت دائرة الدعوة لدين الله، وتمكن من يريد الوقوف على حقيقة الإسلام مِن معرفته، فدخل الناس تلك المدة في دين الله أفواجًا؛ ولذلك سمَّاه الله فتحًا مبينًا، أي ظاهرًا جليًّا."));
        alfathExes.add(new AlfathEx("لِيَغْفِرَ لَكَ اللَّهُ مَا تَقَدَّمَ مِنْ ذَنْبِكَ وَمَا تَأَخَّرَ وَيُتِمَّ نِعْمَتَهُ عَلَيْكَ وَيَهْدِيَكَ صِرَاطًا مُسْتَقِيمًا (2)"));
        alfathExes.add(new AlfathEx("فتحنا لك ذلك الفتح، ويسَّرناه لك؛ ليغفر الله لك ما تقدم من ذنبك وما تأخر؛ بسبب ما حصل من هذا الفتح من الطاعات الكثيرة وبما تحملته من المشقات، ويتم نعمته عليك بإظهار دينك ونصرك على أعدائك، ويرشدك طريقًا مستقيمًا من الدين لا عوج فيه."));
        alfathExes.add(new AlfathEx("وَيَنْصُرَكَ اللَّهُ نَصْرًا عَزِيزًا (3)"));
        alfathExes.add(new AlfathEx("وينصرك الله نصرًا قويًّا لا يَضْعُف فيه الإسلام."));
        alfathExes.add(new AlfathEx("هُوَ الَّذِي أَنْزَلَ السَّكِينَةَ فِي قُلُوبِ الْمُؤْمِنِينَ لِيَزْدَادُوا إِيمَانًا مَعَ إِيمَانِهِمْ وَلِلَّهِ جُنُودُ السَّمَاوَاتِ وَالْأَرْضِ وَكَانَ اللَّهُ عَلِيمًا حَكِيمًا (4)"));
        alfathExes.add(new AlfathEx("هو الله الذي أنزل الطمأنينة في قلوب المؤمنين بالله ورسوله يوم «الحديبية» فسكنت، ورسخ اليقين فيها؛ ليزدادوا تصديقًا لله واتباعًا لرسوله مع تصديقهم واتباعهم. ولله سبحانه وتعالى جنود السموات والأرض ينصر بهم عباده المؤمنين. وكان الله عليمًا بمصالح خلقه، حكيمًا في تدبيره وصنعه."));
        alfathExes.add(new AlfathEx("لِيُدْخِلَ الْمُؤْمِنِينَ وَالْمُؤْمِنَاتِ جَنَّاتٍ تَجْرِي مِنْ تَحْتِهَا الْأَنْهَارُ خَالِدِينَ فِيهَا وَيُكَفِّرَ عَنْهُمْ سَيِّئَاتِهِمْ وَكَانَ ذَلِكَ عِنْدَ اللَّهِ فَوْزًا عَظِيمًا (5)"));
        alfathExes.add(new AlfathEx("ليدخل الله المؤمنين والمؤمنات جنات تجري مِن تحت أشجارها وقصورها الأنهار، ماكثين فيها أبدًا، ويمحو عنهم سيِّئ ما عملوا، فلا يعاقبهم عليه، وكان ذلك الجزاء عند الله نجاة من كل غم، وظَفَرًا بكل مطلوب."));
        alfathExes.add(new AlfathEx("وَيُعَذِّبَ الْمُنَافِقِينَ وَالْمُنَافِقَاتِ وَالْمُشْرِكِينَ وَالْمُشْرِكَاتِ الظَّانِّينَ بِاللَّهِ ظَنَّ السَّوْءِ عَلَيْهِمْ دَائِرَةُ السَّوْءِ وَغَضِبَ اللَّهُ عَلَيْهِمْ وَلَعَنَهُمْ وَأَعَدَّ لَهُمْ جَهَنَّمَ وَسَاءَتْ مَصِيرًا (6)"));
        alfathExes.add(new AlfathEx("ويعذب الله المنافقين والمنافقات والمشركين والمشركات الذين يظنون ظنًا سيئًا بالله أنه لن ينصر نبيه والمؤمنين معه على أعدائهم، ولن يُظهر دينه، فعلى هؤلاء تدور دائرة العذاب وكل ما يسوءهم، وغضب الله عليهم، وطردهم من رحمته، وأعدَّ لهم نار جهنم، وساءت منزلا يصيرون إليه."));
        alfathExes.add(new AlfathEx("وَلِلَّهِ جُنُودُ السَّمَاوَاتِ وَالْأَرْضِ وَكَانَ اللَّهُ عَزِيزًا حَكِيمًا (7)"));
        alfathExes.add(new AlfathEx("ولله سبحانه وتعالى جنود السموات والأرض يؤيد بهم عباده المؤمنين. وكان الله عزيزًا على خلقه، حكيمًا في تدبير أمورهم."));
        alfathExes.add(new AlfathEx("إِنَّا أَرْسَلْنَاكَ شَاهِدًا وَمُبَشِّرًا وَنَذِيرًا (8)"));
        alfathExes.add(new AlfathEx("إنا أرسلناك -أيها الرسول- شاهدًا على أمتك بالبلاغ، مبينًا لهم ما أرسلناك به إليهم، ومبشرًا لمن أطاعك بالجنة، ونذيرًا لمن عصاك بالعقاب العاجل والآجل."));
        alfathExes.add(new AlfathEx("لِتُؤْمِنُوا بِاللَّهِ وَرَسُولِهِ وَتُعَزِّرُوهُ وَتُوَقِّرُوهُ وَتُسَبِّحُوهُ بُكْرَةً وَأَصِيلًا (9)"));
        alfathExes.add(new AlfathEx("لتؤمنوا بالله ورسوله، وتنصروا الله بنصر دينه، وتعظموا الله، وتسبحوه أول النهار وآخره."));
        alfathExes.add(new AlfathEx("إِنَّ الَّذِينَ يُبَايِعُونَكَ إِنَّمَا يُبَايِعُونَ اللَّهَ يَدُ اللَّهِ فَوْقَ أَيْدِيهِمْ فَمَنْ نَكَثَ فَإِنَّمَا يَنْكُثُ عَلَى نَفْسِهِ وَمَنْ أَوْفَى بِمَا عَاهَدَ عَلَيْهُ اللَّهَ فَسَيُؤْتِيهِ أَجْرًا عَظِيمًا (10)"));
        alfathExes.add(new AlfathEx("إن الذين يبايعونك -أيها النبي- بـ «الحديبية» على القتال إنما يبايعون الله، ويعقدون العقد معه ابتغاء جنته ورضوانه، يد الله فوق أيديهم، فهو معهم يسمع أقوالهم، ويرى مكانهم، ويعلم ضمائرهم وظواهرهم، فمن نقض بيعته فإنما يعود وبال ذلك على نفسه، ومن أوفى بما عاهد الله عليه من الصبر عند لقاء العدو في سبيل الله ونصرة نبيه محمد صلى الله عليه وسلم، فسيعطيه الله ثوابًا جزيلا وهو الجنة. وفي الآية إثبات صفة اليد لله تعالى بما يليق به سبحانه، دون تشبيه ولا تكييف."));
        alfathExes.add(new AlfathEx("سَيَقُولُ لَكَ الْمُخَلَّفُونَ مِنَ الْأَعْرَابِ شَغَلَتْنَا أَمْوَالُنَا وَأَهْلُونَا فَاسْتَغْفِرْ لَنَا يَقُولُونَ بِأَلْسِنَتِهِمْ مَا لَيْسَ فِي قُلُوبِهِمْ قُلْ فَمَنْ يَمْلِكُ لَكُمْ مِنَ اللَّهِ شَيْئًا إِنْ أَرَادَ بِكُمْ ضَرًّا أَوْ أَرَادَ بِكُمْ نَفْعًا بَلْ كَانَ اللَّهُ بِمَا تَعْمَلُونَ خَبِيرًا (11)"));
        alfathExes.add(new AlfathEx("سيقول لك -أيها النبي- الذين تخلَّفوا من الأعراب عن الخروج معك إلى «مكة» إذا عاتبتهم: شغلتنا أموالنا وأهلونا، فاسأل ربك أن يغفر لنا تخلُّفنا، يقولون ذلك بألسنتهم، ولا حقيقة له في قلوبهم، قل لهم: فمن يملك لكم من الله شيئًا إن أراد بكم شرًا أو خيرًا؟ ليس الأمر كما ظن هؤلاء المنافقون أن الله لا يعلم ما انطوت عليه بواطنهم من النفاق، بل إنه سبحانه كان بما يعملون خبيرًا، لا يخفى عليه شيء من أعمال خلقه."));
        alfathExes.add(new AlfathEx("بَلْ ظَنَنْتُمْ أَنْ لَنْ يَنْقَلِبَ الرَّسُولُ وَالْمُؤْمِنُونَ إِلَى أَهْلِيهِمْ أَبَدًا وَزُيِّنَ ذَلِكَ فِي قُلُوبِكُمْ وَظَنَنْتُمْ ظَنَّ السَّوْءِ وَكُنْتُمْ قَوْمًا بُورًا (12)"));
        alfathExes.add(new AlfathEx("وليس الأمر كما زعمتم من انشغالكم بالأموال والأهل، بل إنكم ظننتم أن رسول الله صلى الله عليه وسلم ومن معه من أصحابه سيَهْلكون، ولا يَرْجعون إليكم أبدًا، وحسَّن الشيطان ذلك في قلوبكم، وظننتم ظنًا سيئًا أن الله لن ينصر نبيه محمدًا صلى الله عليه وسلم وأصحابه على أعدائهم، وكنتم قومًا هَلْكى لا خير فيكم."));
        alfathExes.add(new AlfathEx("وَمَنْ لَمْ يُؤْمِنْ بِاللَّهِ وَرَسُولِهِ فَإِنَّا أَعْتَدْنَا لِلْكَافِرِينَ سَعِيرًا (13)"));
        alfathExes.add(new AlfathEx("ومن لم يصدِّق بالله وبما جاء به رسوله صلى الله عليه وسلم ويعمل بشرعه، فإنه كافر مستحق للعقاب، فإنا أعددنا للكافرين عذاب السعير في النار."));
        alfathExes.add(new AlfathEx("وَلِلَّهِ مُلْكُ السَّمَاوَاتِ وَالْأَرْضِ يَغْفِرُ لِمَنْ يَشَاءُ وَيُعَذِّبُ مَنْ يَشَاءُ وَكَانَ اللَّهُ غَفُورًا رَحِيمًا (14)"));
        alfathExes.add(new AlfathEx("ولله ملك السموات والأرض وما فيهما، يتجاوز برحمته عمن يشاء فيستر ذنبه، ويعذِّب بعدله من يشاء. وكان الله سبحانه وتعالى غفورًا لمن تاب إليه، رحيمًا به."));
        alfathExes.add(new AlfathEx("سَيَقُولُ الْمُخَلَّفُونَ إِذَا انْطَلَقْتُمْ إِلَى مَغَانِمَ لِتَأْخُذُوهَا ذَرُونَا نَتَّبِعْكُمْ يُرِيدُونَ أَنْ يُبَدِّلُوا كَلَامَ اللَّهِ قُلْ لَنْ تَتَّبِعُونَا كَذَلِكُمْ قَالَ اللَّهُ مِنْ قَبْلُ فَسَيَقُولُونَ بَلْ تَحْسُدُونَنَا بَلْ كَانُوا لَا يَفْقَهُونَ إِلَّا قَلِيلًا (15)"));
        alfathExes.add(new AlfathEx("سيقول المخلَّفون، إذا انطلقت -أيها النبي- أنت وأصحابك إلى غنائم «خيبر» التي وعدكم الله بها، اتركونا نذهب معكم إلى «خيبر» ، يريدون أن يغيِّروا بذلك وعد الله لكم. قل لهم: لن تخرجوا معنا إلى «خيبر» ؛ لأن الله تعالى قال لنا من قبل رجوعنا إلى «المدينة» : إن غنائم «خيبر» هي لمن شهد «الحديبية» معنا، فسيقولون: ليس الأمر كما تقولون، إن الله لم يأمركم بهذا، إنكم تمنعوننا من الخروج معكم حسدًا منكم؛ لئلا نصيب معكم الغنيمة، وليس الأمر كما زعموا، بل كانوا لا يفقهون عن الله ما لهم وما عليهم من أمر الدين إلا يسيرًا."));
        alfathExes.add(new AlfathEx("قُلْ لِلْمُخَلَّفِينَ مِنَ الْأَعْرَابِ سَتُدْعَوْنَ إِلَى قَوْمٍ أُولِي بَأْسٍ شَدِيدٍ تُقَاتِلُونَهُمْ أَوْ يُسْلِمُونَ فَإِنْ تُطِيعُوا يُؤْتِكُمُ اللَّهُ أَجْرًا حَسَنًا وَإِنْ تَتَوَلَّوْا كَمَا تَوَلَّيْتُمْ مِنْ قَبْلُ يُعَذِّبْكُمْ عَذَابًا أَلِيمًا (16)"));
        alfathExes.add(new AlfathEx("قل للذين تخلَّفوا من الأعراب -وهم البدو- عن القتال: ستُدْعون إلى قتال قوم أصحاب بأس شديد في القتال، تقاتلونهم أو يسلمون من غير قتال، فإن تطيعوا الله فيما دعاكم إليه مِن قتال هؤلاء القوم يؤتكم الجنة، وإن تعصوه كما فعلتم حين تخلفتم عن السير مع رسول الله صلى الله عليه وسلم إلى «مكة» ، يعذبكم عذابًا موجعًا."));
        alfathExes.add(new AlfathEx("لَيْسَ عَلَى الْأَعْمَى حَرَجٌ وَلَا عَلَى الْأَعْرَجِ حَرَجٌ وَلَا عَلَى الْمَرِيضِ حَرَجٌ وَمَنْ يُطِعِ اللَّهَ وَرَسُولَهُ يُدْخِلْهُ جَنَّاتٍ تَجْرِي مِنْ تَحْتِهَا الْأَنْهَارُ وَمَنْ يَتَوَلَّ يُعَذِّبْهُ عَذَابًا أَلِيمًا (17)"));
        alfathExes.add(new AlfathEx("ليس على الأعمى منكم -أيها الناس- إثم، ولا على الأعرج إثم، ولا على المريض إثم، في أن يتخلَّفوا عن الجهاد مع المؤمنين؛ لعدم استطاعتهم. ومن يطع الله ورسوله يدخله جنات تجري مِن تحت قصورها وأشجارها الأنهار، ومن يعص الله ورسوله، فيتخلَّف عن الجهاد مع المؤمنين، يعذبه عذابًا مؤلمًا موجعًا."));
        alfathExes.add(new AlfathEx("لَقَدْ رَضِيَ اللَّهُ عَنِ الْمُؤْمِنِينَ إِذْ يُبَايِعُونَكَ تَحْتَ الشَّجَرَةِ فَعَلِمَ مَا فِي قُلُوبِهِمْ فَأَنْزَلَ السَّكِينَةَ عَلَيْهِمْ وَأَثَابَهُمْ فَتْحًا قَرِيبًا (18)"));
        alfathExes.add(new AlfathEx("لقد رضي الله عن المؤمنين حين بايعوك -أيها النبي- تحت الشجرة -وهذه هي بيعة الرضوان في «الحديبية» - فعلم الله ما في قلوب هؤلاء المؤمنين من الإيمان والصدق والوفاء، فأنزل الله الطمأنينة عليهم وثبَّت قلوبهم، وعوَّضهم عمَّا فاتهم بصلح «الحديبية» فتحًا قريبًا، وهو فتح «خيبر»."));
        alfathExes.add(new AlfathEx("وَمَغَانِمَ كَثِيرَةً يَأْخُذُونَهَا وَكَانَ اللَّهُ عَزِيزًا حَكِيمًا (19)"));
        alfathExes.add(new AlfathEx("ومغانم كثيرة تأخذونها من أموال يهود «خيبر» . وكان الله عزيزًا في انتقامه من أعدائه، حكيمًا في تدبير أمور خلقه."));
        alfathExes.add(new AlfathEx("وَعَدَكُمُ اللَّهُ مَغَانِمَ كَثِيرَةً تَأْخُذُونَهَا فَعَجَّلَ لَكُمْ هَذِهِ وَكَفَّ أَيْدِيَ النَّاسِ عَنْكُمْ وَلِتَكُونَ آيَةً لِلْمُؤْمِنِينَ وَيَهْدِيَكُمْ صِرَاطًا مُسْتَقِيمًا (20)"));
        alfathExes.add(new AlfathEx("وعدكم الله مغانم كثيرة تأخذونها في أوقاتها التي قدَّرها الله لكم فعجَّل لكم غنائم «خيبر» ، وكفَّ أيدي الناس عنكم، فلم ينلكم سوء مما كان أعداؤكم أضمروه لكم من المحاربة والقتال، ومن أن ينالوا ممن تركتموهم وراءكم في «المدينة» ، ولتكون هزيمتهم وسلامتكم وغنيمتكم علامة تعتبرون بها، وتستدلون على أن الله حافظكم وناصركم، ويرشدكم طريقا مستقيما لا اعوجاج فيه."));
        alfathExes.add(new AlfathEx("وَأُخْرَى لَمْ تَقْدِرُوا عَلَيْهَا قَدْ أَحَاطَ اللَّهُ بِهَا وَكَانَ اللَّهُ عَلَى كُلِّ شَيْءٍ قَدِيرًا (21)"));
        alfathExes.add(new AlfathEx("وقد وعدكم الله غنيمة أخرى لم تقدروا عليها، الله سبحانه وتعالى قادر عليها، وهي تحت تدبيره وملكه، وقد وعدكموها، ولا بد مِن وقوع ما وعد به. وكان الله على كل شيء قديرًا لا يعجزه شيء."));
        alfathExes.add(new AlfathEx("وَلَوْ قَاتَلَكُمُ الَّذِينَ كَفَرُوا لَوَلَّوُا الْأَدْبَارَ ثُمَّ لَا يَجِدُونَ وَلِيًّا وَلَا نَصِيرًا (22)"));
        alfathExes.add(new AlfathEx("ولو قاتلكم كفار قريش بـ «مكة» لانهزموا عنكم وولوكم ظهورهم، كما يفعل المنهزم في القتال، ثم لا يجدون لهم من دون الله وليًا يواليهم على حربكم، ولا نصيرًا يعينهم على قتالكم."));
        alfathExes.add(new AlfathEx("سُنَّةَ اللَّهِ الَّتِي قَدْ خَلَتْ مِنْ قَبْلُ وَلَنْ تَجِدَ لِسُنَّةِ اللَّهِ تَبْدِيلًا (23)"));
        alfathExes.add(new AlfathEx("سنة الله التي سنَّها في خلقه من قبل بنصر جنده وهزيمة أعدائه، ولن تجد -أيها النبي- لسنة الله تغييرًا."));
        alfathExes.add(new AlfathEx("وَهُوَ الَّذِي كَفَّ أَيْدِيَهُمْ عَنْكُمْ وَأَيْدِيَكُمْ عَنْهُمْ بِبَطْنِ مَكَّةَ مِنْ بَعْدِ أَنْ أَظْفَرَكُمْ عَلَيْهِمْ وَكَانَ اللَّهُ بِمَا تَعْمَلُونَ بَصِيرًا (24)"));
        alfathExes.add(new AlfathEx("وهو الذي كفَّ أيدي المشركين عنكم، وأيديكم عنهم ببطن «مكة» من بعد ما قَدَرْتم عليهم، فصاروا تحت سلطانكم وهؤلاء المشركون هم الذين خرجوا على عسكر رسول الله صلى الله عليه وسلم بـ «الحديبية» ، فأمسكهم المسلمون ثم تركوهم ولم يقتلوهم، وكانوا نحو ثمانين رجلا وكان الله بأعمالكم بصيرًا، لا تخفى عليه خافية."));
        alfathExes.add(new AlfathEx("هُمُ الَّذِينَ كَفَرُوا وَصَدُّوكُمْ عَنِ الْمَسْجِدِ الْحَرَامِ وَالْهَدْيَ مَعْكُوفًا أَنْ يَبْلُغَ مَحِلَّهُ وَلَوْلَا رِجَالٌ مُؤْمِنُونَ وَنِسَاءٌ مُؤْمِنَاتٌ لَمْ تَعْلَمُوهُمْ أَنْ تَطَئُوهُمْ فَتُصِيبَكُمْ مِنْهُمْ مَعَرَّةٌ بِغَيْرِ عِلْمٍ لِيُدْخِلَ اللَّهُ فِي رَحْمَتِهِ مَنْ يَشَاءُ لَوْ تَزَيَّلُوا لَعَذَّبْنَا الَّذِينَ كَفَرُوا مِنْهُمْ عَذَابًا أَلِيمًا (25)"));
        alfathExes.add(new AlfathEx("كفار قريش هم الذين جحدوا توحيد الله، وصدُّوكم يوم «الحديبية» عن دخول المسجد الحرام، ومنعوا الهدي، وحبسوه أن يبلغ محل نحره، وهو الحرم. ولولا رجال مؤمنون مستضعفون ونساء مؤمنات بين أظهر هؤلاء الكافرين بـ «مكة» ، يكتمون إيمانهم خيفة على أنفسهم لم تعرفوهم؛ خشية أن تطؤوهم بجيشكم فتقتلوهم، فيصيبكم بذلك القتل إثم وعيب وغرامة بغير علم، لكنَّا سلَّطناكم عليهم؛ ليدخل الله في رحمته من يشاء فيَمُنَّ عليهم بالإيمان بعد الكفر، لو تميَّز هؤلاء المؤمنون والمؤمنات عن مشركي «مكة» وخرجوا من بينهم، لعذَّبنا الذين كفروا وكذَّبوا منهم عذابًا مؤلمًا موجعًا."));
        alfathExes.add(new AlfathEx("إِذْ جَعَلَ الَّذِينَ كَفَرُوا فِي قُلُوبِهِمُ الْحَمِيَّةَ حَمِيَّةَ الْجَاهِلِيَّةِ فَأَنْزَلَ اللَّهُ سَكِينَتَهُ عَلَى رَسُولِهِ وَعَلَى الْمُؤْمِنِينَ وَأَلْزَمَهُمْ كَلِمَةَ التَّقْوَى وَكَانُوا أَحَقَّ بِهَا وَأَهْلَهَا وَكَانَ اللَّهُ بِكُلِّ شَيْءٍ عَلِيمًا (26)"));
        alfathExes.add(new AlfathEx("إذ جعل الذين كفروا في قلوبهم الأنَفَة أنَفَة الجاهلية؛ لئلا يقروا برسالة محمد صلى الله عليه وسلم، ومن ذلك امتناعهم أن يكتبوا في صلح «الحديبية» «بسم الله الرحمن الرحيم» وأبوا أن يكتبوا «هذا ما قاضى عليه محمد رسول الله» ، فأنزل الله الطمأنينة على رسوله وعلى المؤمنين معه، وألزمهم قول «لا إله إلا الله» التي هي رأس كل تقوى، وكان الرسول صلى الله عليه وسلم والمؤمنون معه أحق بكلمة التقوى من المشركين، وكانوا كذلك أهل هذه الكلمة دون المشركين. وكان الله بكل شيء عليمًا لا يخفى عليه شيء."));
        alfathExes.add(new AlfathEx("لَقَدْ صَدَقَ اللَّهُ رَسُولَهُ الرُّؤْيَا بِالْحَقِّ لَتَدْخُلُنَّ الْمَسْجِدَ الْحَرَامَ إِنْ شَاءَ اللَّهُ آمِنِينَ مُحَلِّقِينَ رُءُوسَكُمْ وَمُقَصِّرِينَ لَا تَخَافُونَ فَعَلِمَ مَا لَمْ تَعْلَمُوا فَجَعَلَ مِنْ دُونِ ذَلِكَ فَتْحًا قَرِيبًا (27)"));
        alfathExes.add(new AlfathEx("لقد صدق الله رسوله محمدًا - صلى الله عليه وسلم - رؤياه التي أراها إياه بالحق أنه يدخل هو وأصحابه بيت الله الحرام آمنين، لا تخافون أهل الشرك، محلِّقين رؤوسكم ومقصِّرين، فعلم الله من الخير والمصلحة -في صرفكم عن «مكة» عامكم ذلك ودخولكم إليها فيما بعد- ما لم تعلموا أنتم، فجعل مِن دون دخولكم «مكة» الذي وعدتم به، فتحًا قريبًا، وهو هدنة «الحديبية» وفتح «خيبر» ."));
        alfathExes.add(new AlfathEx("هُوَ الَّذِي أَرْسَلَ رَسُولَهُ بِالْهُدَى وَدِينِ الْحَقِّ لِيُظْهِرَهُ عَلَى الدِّينِ كُلِّهِ وَكَفَى بِاللَّهِ شَهِيدًا (28)"));
        alfathExes.add(new AlfathEx("هو الذي أرسل رسوله محمدًا صلى الله عليه وسلم، بالبيان الواضح ودين الإسلام؛ ليُعْليه على الملل كلها، وحسبك -أيها الرسول- بالله شاهدًا على أنه ناصرك ومظهر دينك على كل دين."));
        alfathExes.add(new AlfathEx("مُحَمَّدٌ رَسُولُ اللَّهِ وَالَّذِينَ مَعَهُ أَشِدَّاءُ عَلَى الْكُفَّارِ رُحَمَاءُ بَيْنَهُمْ تَرَاهُمْ رُكَّعًا سُجَّدًا يَبْتَغُونَ فَضْلًا مِنَ اللَّهِ وَرِضْوَانًا سِيمَاهُمْ فِي وُجُوهِهِمْ مِنْ أَثَرِ السُّجُودِ ذَلِكَ مَثَلُهُمْ فِي التَّوْرَاةِ وَمَثَلُهُمْ فِي الْإِنْجِيلِ كَزَرْعٍ أَخْرَجَ شَطْأَهُ فَآزَرَهُ فَاسْتَغْلَظَ فَاسْتَوَى عَلَى سُوقِهِ يُعْجِبُ الزُّرَّاعَ لِيَغِيظَ بِهِمُ الْكُفَّارَ وَعَدَ اللَّهُ الَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ مِنْهُمْ مَغْفِرَةً وَأَجْرًا عَظِيمًا (29)"));
        alfathExes.add(new AlfathEx("محمد رسول الله، والذين معه على دينه أشداء على الكفار، رحماء فيما بينهم، تراهم ركعًا سُجَّدًا لله في صلاتهم، يرجون ربهم أن يتفضل عليهم، فيدخلهم الجنة، ويرضى عنهم، علامة طاعتهم لله ظاهرة في وجوههم من أثر السجود والعبادة، هذه صفتهم في التوراة. وصفتهم في الإنجيل كصفة زرع أخرج ساقه وفرعه، ثم تكاثرت فروعه بعد ذلك، وشدت الزرع، فقوي واستوى قائمًا على سيقانه جميلا منظره، يعجب الزُّرَّاع؛ ليَغِيظ بهؤلاء المؤمنين في كثرتهم وجمال منظرهم الكفار. وفي هذا دليل على كفر من أبغض الصحابة -رضي الله عنهم-; لأن من غاظه الله بالصحابة، فقد وُجد في حقه موجِب ذاك، وهو الكفر. وعد الله الذين آمنوا منهم بالله ورسوله وعملوا ما أمرهم الله به، واجتنبوا ما نهاهم عنه، مغفرة لذنوبهم، وثوابًا جزيلا لا ينقطع، وهو الجنة. ووعد الله حق مصدَّق لا يُخْلَف، وكل من اقتفى أثر الصحابة رضي الله عنهم فهو في حكمهم في استحقاق المغفرة والأجر العظيم، ولهم الفضل والسبق والكمال الذي لا يلحقهم فيه أحد من هذه الأمة، رضي الله عنهم وأرضاهم."));



        quran_explanation_48_adapter = new quran_explanation_48_adapter(alfathExes ,QuranExplanation_48Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_48);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_48Activity.this));
        recyclerView.setAdapter(quran_explanation_48_adapter);


    }

}