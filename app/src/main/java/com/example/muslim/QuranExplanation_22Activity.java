package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_22Activity extends AppCompatActivity {

    ArrayList<AlhagEx> alhagExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_22_adapter quran_explanation_22_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_22);

        alhagExes.add(new AlhagEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alhagExes.add(new AlhagEx("يَاأَيُّهَا النَّاسُ اتَّقُوا رَبَّكُمْ إِنَّ زَلْزَلَةَ السَّاعَةِ شَيْءٌ عَظِيمٌ (1)"));
        alhagExes.add(new AlhagEx("يا أيها الناس احذروا عقاب الله بامتثال أوامره واجتناب نواهيه، إن ما يحدث عند قيام الساعة من أهوال وحركة شديدة للأرض، تتصدع منها كل جوانبها، شيء عظيم، لا يُقْدر قدره ولا يُبْلغ كنهه، ولا يعلم كيفيَّته إلا رب العالمين."));
        alhagExes.add(new AlhagEx("يَوْمَ تَرَوْنَهَا تَذْهَلُ كُلُّ مُرْضِعَةٍ عَمَّا أَرْضَعَتْ وَتَضَعُ كُلُّ ذَاتِ حَمْلٍ حَمْلَهَا وَتَرَى النَّاسَ سُكَارَى وَمَا هُمْ بِسُكَارَى وَلَكِنَّ عَذَابَ اللَّهِ شَدِيدٌ (2)"));
        alhagExes.add(new AlhagEx("يوم ترون قيام الساعة تنسى الوالدةُ رضيعَها الذي ألقمته ثديها؛ لِمَا نزل بها من الكرب، وتُسْقط الحامل حملها من الرعب، وتغيب عقول الناس، فهم كالسكارى من شدة الهول والفزع، وليسوا بسكارى من الخمر، ولكن شدة العذاب أفقدتهم عقولهم وإدراكهم."));
        alhagExes.add(new AlhagEx("وَمِنَ النَّاسِ مَنْ يُجَادِلُ فِي اللَّهِ بِغَيْرِ عِلْمٍ وَيَتَّبِعُ كُلَّ شَيْطَانٍ مَرِيدٍ (3)"));
        alhagExes.add(new AlhagEx("وبعض رؤوس الكفر من الناس يخاصمون ويشككون في قدرة الله على البعث; جهلا منهم بحقيقة هذه القدرة، واتباعًا لأئمة الضلال من كل شيطان متمرد على الله ورسله."));
        alhagExes.add(new AlhagEx("كُتِبَ عَلَيْهِ أَنَّهُ مَنْ تَوَلَّاهُ فَأَنَّهُ يُضِلُّهُ وَيَهْدِيهِ إِلَى عَذَابِ السَّعِيرِ (4)"));
        alhagExes.add(new AlhagEx("قضى الله وقدَّر على هذا الشيطان أنه يُضِل كل من اتبعه، ولا يهديه إلى الحق، بل يسوقه إلى عذاب جهنم الموقدة جزاء اتباعه إياه."));
        alhagExes.add(new AlhagEx("يَاأَيُّهَا النَّاسُ إِنْ كُنْتُمْ فِي رَيْبٍ مِنَ الْبَعْثِ فَإِنَّا خَلَقْنَاكُمْ مِنْ تُرَابٍ ثُمَّ مِنْ نُطْفَةٍ ثُمَّ مِنْ عَلَقَةٍ ثُمَّ مِنْ مُضْغَةٍ مُخَلَّقَةٍ وَغَيْرِ مُخَلَّقَةٍ لِنُبَيِّنَ لَكُمْ وَنُقِرُّ فِي الْأَرْحَامِ مَا نَشَاءُ إِلَى أَجَلٍ مُسَمًّى ثُمَّ نُخْرِجُكُمْ طِفْلًا ثُمَّ لِتَبْلُغُوا أَشُدَّكُمْ وَمِنْكُمْ مَنْ يُتَوَفَّى وَمِنْكُمْ مَنْ يُرَدُّ إِلَى أَرْذَلِ الْعُمُرِ لِكَيْلَا يَعْلَمَ مِنْ بَعْدِ عِلْمٍ شَيْئًا وَتَرَى الْأَرْضَ هَامِدَةً فَإِذَا أَنْزَلْنَا عَلَيْهَا الْمَاءَ اهْتَزَّتْ وَرَبَتْ وَأَنْبَتَتْ مِنْ كُلِّ زَوْجٍ بَهِيجٍ (5)"));
        alhagExes.add(new AlhagEx("يا أيها الناس إن كنتم في شك من أن الله يُحيي الموتى فإنَّا خلقنا أباكم آدم من تراب، ثم تناسلت ذريته من نطفة، هي المنيُّ يقذفه الرجل في رحم المرأة، فيتحول بقدرة الله إلى علقة، وهي الدم الأحمر الغليظ، ثم إلى مضغة، وهي قطعة لحم صغيرة قَدْر ما يُمْضَغ، فتكون تارة مخلَّقة، أي تامة الخلق تنتهي إلى خروح الجنين حيًا، وغير تامة الخلق تارة أخرى، فتسقط لغير تمام؛ لنبيِّن لكم تمام قدرتنا بتصريف أطوار الخلق، ونبقي في الأرحام ما نشاء، وهو المخلَّق إلى وقت ولادته، وتكتمل الأطوار بولادة الأجنَّة أطفالا صغارًا تكبَرُ حتى تبلغ الأشد، وهو وقت الشباب والقوة واكتمال العقل، وبعض الأطفال قد يموت قبل ذلك، وبعضهم يكبَرُ حتى يبلغ سن الهرم وضَعْف العقل; فلا يعلم هذا المعمَّر شيئًا مما كان يعلمه قبل ذلك. وترى الأرض يابسةً ميتة لا نبات فيها، فإذا أنزلنا عليها الماء تحركت بالنبات تتفتح عنه، وارتفعت وزادت لارتوائها، وأنبتت من كل نوع من أنواع النبات الحسن الذي يَسُرُّ الناظرين."));
        alhagExes.add(new AlhagEx("ذَلِكَ بِأَنَّ اللَّهَ هُوَ الْحَقُّ وَأَنَّهُ يُحْيِ الْمَوْتَى وَأَنَّهُ عَلَى كُلِّ شَيْءٍ قَدِيرٌ (6)"));
        alhagExes.add(new AlhagEx("ذلك المذكور مما تقدَّم من آيات قدرة الله تعالى، فيه دلالة قاطعة على أن الله سبحانه وتعالى هو الرب المعبود بحق، الذي لا تنبغي العبادة إلا له، وهو يُحيي الموتى، وهو قادر على كل شيء."));
        alhagExes.add(new AlhagEx("وَأَنَّ السَّاعَةَ آتِيَةٌ لَا رَيْبَ فِيهَا وَأَنَّ اللَّهَ يَبْعَثُ مَنْ فِي الْقُبُورِ (7)"));
        alhagExes.add(new AlhagEx("وأن ساعة البعث آتية، لا شك في ذلك، وأن الله يبعث الموتى مِن قبورهم لحسابهم وجزائهم."));
        alhagExes.add(new AlhagEx("وَمِنَ النَّاسِ مَنْ يُجَادِلُ فِي اللَّهِ بِغَيْرِ عِلْمٍ وَلَا هُدًى وَلَا كِتَابٍ مُنِيرٍ (8)"));
        alhagExes.add(new AlhagEx("ومن الكفار مَن يجادل بالباطل في الله وتوحيده واختياره رسوله صلى الله عليه وسلم وإنزاله القرآن، وذلك الجدال بغير علم، ولا بيان، ولا كتاب من الله فيه برهان وحجة واضحة."));
        alhagExes.add(new AlhagEx("ثَانِيَ عِطْفِهِ لِيُضِلَّ عَنْ سَبِيلِ اللَّهِ لَهُ فِي الدُّنْيَا خِزْيٌ وَنُذِيقُهُ يَوْمَ الْقِيَامَةِ عَذَابَ الْحَرِيقِ (9)"));
        alhagExes.add(new AlhagEx("لاويًا عنقه في تكبر، معرضًا عن الحق؛ ليصد غيره عن الدخول في دين الله، فسوف يلقى خزيًا في الدنيا باندحاره وافتضاح أمره، ونحرقه يوم القيامة بالنار."));
        alhagExes.add(new AlhagEx("ذَلِكَ بِمَا قَدَّمَتْ يَدَاكَ وَأَنَّ اللَّهَ لَيْسَ بِظَلَّامٍ لِلْعَبِيدِ (10)"));
        alhagExes.add(new AlhagEx("ويقال له: ذلك العذاب بسبب ما فَعَلْتَ من المعاصي واكتسبت من الآثام، والله لا يعذب أحدًا بغير ذنب."));
        alhagExes.add(new AlhagEx("وَمِنَ النَّاسِ مَنْ يَعْبُدُ اللَّهَ عَلَى حَرْفٍ فَإِنْ أَصَابَهُ خَيْرٌ اطْمَأَنَّ بِهِ وَإِنْ أَصَابَتْهُ فِتْنَةٌ انْقَلَبَ عَلَى وَجْهِهِ خَسِرَ الدُّنْيَا وَالْآخِرَةَ ذَلِكَ هُوَ الْخُسْرَانُ الْمُبِينُ (11)"));
        alhagExes.add(new AlhagEx("ومن الناس مَن يدخل في الإسلام على ضعف وشكٍّ، فيعبد الله على تردد، كالذي يقف على طرف جبل أو حائط لا يتماسك في وقفته، ويربط إيمانه بدنياه، فإن عاش في صحة وسَعَة استمر على عبادته، وإن حصل له ابتلاء بمكروه وشدة عزا شؤم ذلك إلى دينه، فرجع عنه كمن ينقلب على وجهه بعد استقامة، فهو بذلك قد خسر الدنيا."));
        alhagExes.add(new AlhagEx("يَدْعُو مِنْ دُونِ اللَّهِ مَا لَا يَضُرُّهُ وَمَا لَا يَنْفَعُهُ ذَلِكَ هُوَ الضَّلَالُ الْبَعِيدُ (12)"));
        alhagExes.add(new AlhagEx("إذ لا يغيِّر كفرُه ما قُدِّر له في دنياه، وخسر الآخرة بدخوله النار، وذلك خسران بيِّن واضح."));
        alhagExes.add(new AlhagEx("يَدْعُو لَمَنْ ضَرُّهُ أَقْرَبُ مِنْ نَفْعِهِ لَبِئْسَ الْمَوْلَى وَلَبِئْسَ الْعَشِيرُ (13)"));
        alhagExes.add(new AlhagEx("يعبد ذلك الخاسر من دون الله ما لا يضره إن تركه، ولا ينفعه إذا عبده، ذلك هو الضلال البعيد عن الحق. يدعو مَن ضررُه المحقق أقرب من نفعه، قبح ذلك المعبود نصيرًا، وقبح عشيرًا."));
        alhagExes.add(new AlhagEx("إِنَّ اللَّهَ يُدْخِلُ الَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ جَنَّاتٍ تَجْرِي مِنْ تَحْتِهَا الْأَنْهَارُ إِنَّ اللَّهَ يَفْعَلُ مَا يُرِيدُ (14)"));
        alhagExes.add(new AlhagEx("إن الله يدخل الذين آمنوا بالله ورسوله، وثبتوا على ذلك، وعملوا الصالحات، جنات تجري من تحت قصورها وأشجارها الأنهار، إن الله يفعل ما يريد من ثواب أهل طاعته تفضلا وعقاب أهل معصيته عدلا."));
        alhagExes.add(new AlhagEx("مَنْ كَانَ يَظُنُّ أَنْ لَنْ يَنْصُرَهُ اللَّهُ فِي الدُّنْيَا وَالْآخِرَةِ فَلْيَمْدُدْ بِسَبَبٍ إِلَى السَّمَاءِ ثُمَّ لْيَقْطَعْ فَلْيَنْظُرْ هَلْ يُذْهِبَنَّ كَيْدُهُ مَا يَغِيظُ (15)"));
        alhagExes.add(new AlhagEx("من كان يعتقد أن الله تعالى لن يؤيد رسوله محمدًا بالنصر في الدنيا بإظهار دينه، وفي الآخرة بإعلاء درجته، وعذابِ مَن كذَّبه، فلْيَمدُدْ حبلا إلى سقف بيته وليخنق به نفسه، ثم ليقطع ذلك الحبل، ثم لينظر: هل يُذْهِبنَّ ذلك ما يجد في نفسه من الغيظ؟ فإن الله تعالى ناصرٌ نبيه محمدًا صلى الله عليه وسلم لا محالة."));
        alhagExes.add(new AlhagEx("وَكَذَلِكَ أَنْزَلْنَاهُ آيَاتٍ بَيِّنَاتٍ وَأَنَّ اللَّهَ يَهْدِي مَنْ يُرِيدُ (16)"));
        alhagExes.add(new AlhagEx("وكما أقام الله الحجة من دلائل قدرته على الكافرين بالبعث أنزل القرآن، آياته واضحة في لفظها ومعناها، يهدي بها الله مَن أراد هدايته؛ لأنه لا هادي سواه."));
        alhagExes.add(new AlhagEx("إِنَّ الَّذِينَ آمَنُوا وَالَّذِينَ هَادُوا وَالصَّابِئِينَ وَالنَّصَارَى وَالْمَجُوسَ وَالَّذِينَ أَشْرَكُوا إِنَّ اللَّهَ يَفْصِلُ بَيْنَهُمْ يَوْمَ الْقِيَامَةِ إِنَّ اللَّهَ عَلَى كُلِّ شَيْءٍ شَهِيدٌ (17)"));
        alhagExes.add(new AlhagEx("إن الذين آمنوا بالله ورسوله محمدٍ صلى الله عليه وسلم واليهود والصابئين وهم: (قوم باقون على فطرتهم ولا دين مقرر لهم يتبعونه) والنصارى والمجوس (وهم عبدة النار) والذين أشركوا وهم: عبدة الأوثان، إنَّ الله يفصل بينهم جميعًا يوم القيامة فيدخل المؤمنين الجنة، ويدخل الكافرين النار، إن الله على كل شيء شهيد، شهد أعمال العباد كلَّها، وأحصاها وحفظها، وسيجازي كلا بما يستحق جزاء وفاقًا للأعمال التي عملوها."));
        alhagExes.add(new AlhagEx("أَلَمْ تَرَ أَنَّ اللَّهَ يَسْجُدُ لَهُ مَنْ فِي السَّمَاوَاتِ وَمَنْ فِي الْأَرْضِ وَالشَّمْسُ وَالْقَمَرُ وَالنُّجُومُ وَالْجِبَالُ وَالشَّجَرُ وَالدَّوَابُّ وَكَثِيرٌ مِنَ النَّاسِ وَكَثِيرٌ حَقَّ عَلَيْهِ الْعَذَابُ وَمَنْ يُهِنِ اللَّهُ فَمَا لَهُ مِنْ مُكْرِمٍ إِنَّ اللَّهَ يَفْعَلُ مَا يَشَاءُ (18)"));
        alhagExes.add(new AlhagEx("ألم تعلم- أيها الرسول- أن الله سبحانه يسجد له خاضعًا منقادًا مَن في السموات من الملائكة ومَن في الأرض من المخلوقات والشمس والقمر والنجوم والجبال والشجر والدواب؟ ولله يسجد طاعة واختيارًا كثير من الناس، وهم المؤمنون، وكثير من الناس حق عليه العذاب فهو مهين، وأيُّ إنسان يهنه الله فليس له أحد يكرمه. إن الله يفعل في خلقه ما يشاء وَفْقَ حكمته."));
        alhagExes.add(new AlhagEx("هَذَانِ خَصْمَانِ اخْتَصَمُوا فِي رَبِّهِمْ فَالَّذِينَ كَفَرُوا قُطِّعَتْ لَهُمْ ثِيَابٌ مِنْ نَارٍ يُصَبُّ مِنْ فَوْقِ رُءُوسِهِمُ الْحَمِيمُ (19)"));
        alhagExes.add(new AlhagEx("هذان فريقان اختلفوا في ربهم: أهل الإيمان وأهل الكفر، كل يدَّعي أنه محقٌّ، فالذين كفروا يحيط بهم العذاب في هيئة ثياب جُعلت لهم من نار يَلْبَسونها، فتشوي أجسادهم، ويُصبُّ على رؤوسهم الماء المتناهي في حره."));
        alhagExes.add(new AlhagEx("يُصْهَرُ بِهِ مَا فِي بُطُونِهِمْ وَالْجُلُودُ (20)"));
        alhagExes.add(new AlhagEx("ويَنزِل إلى أجوافهم فيذيب ما فيها، حتى ينفُذ إلى جلودهم فيشويها فتسقط"));
        alhagExes.add(new AlhagEx("وَلَهُمْ مَقَامِعُ مِنْ حَدِيدٍ (21)"));
        alhagExes.add(new AlhagEx("وتضربهم الملائكة على رؤوسهم بمطارق من حديد."));
        alhagExes.add(new AlhagEx("كُلَّمَا أَرَادُوا أَنْ يَخْرُجُوا مِنْهَا مِنْ غَمٍّ أُعِيدُوا فِيهَا وَذُوقُوا عَذَابَ الْحَرِيقِ (22)"));
        alhagExes.add(new AlhagEx("كلما حاولوا الخروج من النار -لشدة غمِّهم وكربهم- أعيدوا للعذاب فيها، وقيل لهم: ذوقوا عذاب النار المحرق."));
        alhagExes.add(new AlhagEx("إِنَّ اللَّهَ يُدْخِلُ الَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ جَنَّاتٍ تَجْرِي مِنْ تَحْتِهَا الْأَنْهَارُ يُحَلَّوْنَ فِيهَا مِنْ أَسَاوِرَ مِنْ ذَهَبٍ وَلُؤْلُؤًا وَلِبَاسُهُمْ فِيهَا حَرِيرٌ (23)"));
        alhagExes.add(new AlhagEx("إن الله تعالى يدخل أهل الإيمان والعمل الصالح جنات نعيمها دائم، تجري مِن تحت قصورها وأشجارها الأنهار، يُزَيَّنون فيها بأساور الذهب وباللؤلؤ، ولباسهم المعتاد في الجنة الحرير رجالا ونساءً."));
        alhagExes.add(new AlhagEx("وَهُدُوا إِلَى الطَّيِّبِ مِنَ الْقَوْلِ وَهُدُوا إِلَى صِرَاطِ الْحَمِيدِ (24)"));
        alhagExes.add(new AlhagEx("لقد هداهم الله في الدنيا إلى طيب القول: من كلمة التوحيد وحَمْد الله والثناء عليه، وفي الآخرة إلى حمده على حسن العاقبة، كما هداهم من قبل إلى طريق الإسلام المحمود الموصل إلى الجنة."));
        alhagExes.add(new AlhagEx("إِنَّ الَّذِينَ كَفَرُوا وَيَصُدُّونَ عَنْ سَبِيلِ اللَّهِ وَالْمَسْجِدِ الْحَرَامِ الَّذِي جَعَلْنَاهُ لِلنَّاسِ سَوَاءً الْعَاكِفُ فِيهِ وَالْبَادِ وَمَنْ يُرِدْ فِيهِ بِإِلْحَادٍ بِظُلْمٍ نُذِقْهُ مِنْ عَذَابٍ أَلِيمٍ (25)"));
        alhagExes.add(new AlhagEx("إن الذين كفروا بالله، وكذبوا بما جاءهم به محمد صلى الله عليه وسلم، ويمنعون غيرهم من الدخول في دين الله، ويصدون رسول الله صلى الله عليه وسلم والمؤمنين في عام «الحديبية» عن المسجد الحرام، الذي جعلناه لجميع المؤمنين، سواء المقيم فيه والقادم إليه، لهم عذاب أليم موجع، ومن يرد في المسجد الحرام الميْلَ عن الحق ظلمًا فيَعْصِ الله فيه، نُذِقْه مِن عذاب أليم موجع."));
        alhagExes.add(new AlhagEx("وَإِذْ بَوَّأْنَا لِإِبْرَاهِيمَ مَكَانَ الْبَيْتِ أَنْ لَا تُشْرِكْ بِي شَيْئًا وَطَهِّرْ بَيْتِيَ لِلطَّائِفِينَ وَالْقَائِمِينَ وَالرُّكَّعِ السُّجُودِ (26)"));
        alhagExes.add(new AlhagEx("واذكر -أيها النبي- إذ بَيَّنا لإبراهيم -عليه السلام- مكان البيت، وهيَّأناه له وقد كان غير معروف، وأمرناه ببنائه على تقوى من الله وتوحيده وتطهيره من الكفر والبدع والنجاسات؛ ليكون رحابًا للطائفين به، والقائمين المصلين عنده."));
        alhagExes.add(new AlhagEx("وَأَذِّنْ فِي النَّاسِ بِالْحَجِّ يَأْتُوكَ رِجَالًا وَعَلَى كُلِّ ضَامِرٍ يَأْتِينَ مِنْ كُلِّ فَجٍّ عَمِيقٍ (27)"));
        alhagExes.add(new AlhagEx("وأعلِمْ -يا إبراهيم- الناس بوجوب الحج عليهم يأتوك على مختلف أحوالهم مشاةً وركبانًا على كل ضامر من الإبل، وهو: (الخفيف اللحم من السَّيْر والأعمال لا من الهُزال) ، يأتين من كل طريق بعيد."));
        alhagExes.add(new AlhagEx("لِيَشْهَدُوا مَنَافِعَ لَهُمْ وَيَذْكُرُوا اسْمَ اللَّهِ فِي أَيَّامٍ مَعْلُومَاتٍ عَلَى مَا رَزَقَهُمْ مِنْ بَهِيمَةِ الْأَنْعَامِ فَكُلُوا مِنْهَا وَأَطْعِمُوا الْبَائِسَ الْفَقِيرَ (28)"));
        alhagExes.add(new AlhagEx("ليحضروا منافع لهم من: مغفرة ذنوبهم، وثواب أداء نسكهم وطاعتهم، وتكَسُّبِهم في تجاراتهم، وغير ذلك؛ وليذكروا اسم الله على ذَبْح ما يتقربون به من الإبل والبقر والغنم في أيام معيَّنة هي: عاشر ذي الحجة وثلاثة أيام بعده; شكرًا لله على نعمه، وهم مأمورون أن يأكلوا مِن هذه الذبائح استحبابًا، ويُطعموا منها الفقير الذي اشتد فقره."));
        alhagExes.add(new AlhagEx("ثُمَّ لْيَقْضُوا تَفَثَهُمْ وَلْيُوفُوا نُذُورَهُمْ وَلْيَطَّوَّفُوا بِالْبَيْتِ الْعَتِيقِ (29)"));
        alhagExes.add(new AlhagEx("ثم ليكمل الحجاج ما بقي عليهم من النُّسُك، بإحلالهم وخروجهم من إحرامهم، وذلك بإزالة ما تراكم مِن وسخ في أبدانهم، وقص أظفارهم، وحلق شعرهم، وليوفوا بما أوجبوه على أنفسهم من الحج والعمرة والهدايا، وليطوفوا بالبيت العتيق القديم، الذي أعتقه الله مِن تسلُّط الجبارين عليه، وهو الكعبة."));
        alhagExes.add(new AlhagEx("ذَلِكَ وَمَنْ يُعَظِّمْ حُرُمَاتِ اللَّهِ فَهُوَ خَيْرٌ لَهُ عِنْدَ رَبِّهِ وَأُحِلَّتْ لَكُمُ الْأَنْعَامُ إِلَّا مَا يُتْلَى عَلَيْكُمْ فَاجْتَنِبُوا الرِّجْسَ مِنَ الْأَوْثَانِ وَاجْتَنِبُوا قَوْلَ الزُّورِ (30)"));
        alhagExes.add(new AlhagEx("ذلك الذي أمر الله به مِن قضاء التفث والوفاء بالنذور والطواف بالبيت، هو ما أوجبه الله عليكم فعظِّموه، ومن يعظم حرمات الله، ومنها مناسكه بأدائها كاملة خالصة لله، فهو خير له في الدنيا والآخرة. وأحلَّ الله لكم أَكْلَ الأنعام إلا ما حرَّمه فيما يتلى عليكم في القرآن من الميتة وغيرها فاجتنبوه، وفي ذلك إبطال ما كانت العرب تحرِّمه من بعض الأنعام، وابتعِدوا عن القذارة التي هي الأوثان، وعن الكذب الذي هو الافتراء على الله."));
        alhagExes.add(new AlhagEx("حُنَفَاءَ لِلَّهِ غَيْرَ مُشْرِكِينَ بِهِ وَمَنْ يُشْرِكْ بِاللَّهِ فَكَأَنَّمَا خَرَّ مِنَ السَّمَاءِ فَتَخْطَفُهُ الطَّيْرُ أَوْ تَهْوِي بِهِ الرِّيحُ فِي مَكَانٍ سَحِيقٍ (31)"));
        alhagExes.add(new AlhagEx("مستقيمين لله على إخلاص العمل له، مقبلين عليه بعبادته وحده وإفراده بالطاعة، معرضين عما سواه بنبذ الشرك، فإنَّه من يشرك بالله شيئًا، فمثله -في بُعْده عن الهدى، وفي هلاكه وسقوطه من رفيع الإيمان إلى حضيض الكفر، وتخطُّف الشياطين له من كل جانب- كمثل مَن سقط من السماء: فإما أن تخطفه الطير فتقطع أعضاءه، وإما أن تأخذه عاصفة شديدة من الريح، فتقذفه في مكان بعيد أشد البعد."));
        alhagExes.add(new AlhagEx("ذَلِكَ وَمَنْ يُعَظِّمْ شَعَائِرَ اللَّهِ فَإِنَّهَا مِنْ تَقْوَى الْقُلُوبِ (32)"));
        alhagExes.add(new AlhagEx("ذلك ما أمر الله به مِن توحيده وإخلاص العبادة له. ومن يمتثل أمر الله ويُعَظِّم معالم الدين، ومنها أعمال الحج وأماكنه، والذبائح التي تُذْبَح فيه، وذلك باستحسانها واستسمانها، فهذا التعظيم مِن أفعال أصحاب القلوب المتصفة بتقوى الله وخشيته."));
        alhagExes.add(new AlhagEx("لَكُمْ فِيهَا مَنَافِعُ إِلَى أَجَلٍ مُسَمًّى ثُمَّ مَحِلُّهَا إِلَى الْبَيْتِ الْعَتِيقِ (33)"));
        alhagExes.add(new AlhagEx("لكم في هذه الهدايا منافع تنتفعون بها من الصوف واللبن والركوب، وغير ذلك مما لا يضرها إلى وقت ذبحها عند البيت العتيق، وهو الحرم كله."));
        alhagExes.add(new AlhagEx("وَلِكُلِّ أُمَّةٍ جَعَلْنَا مَنْسَكًا لِيَذْكُرُوا اسْمَ اللَّهِ عَلَى مَا رَزَقَهُمْ مِنْ بَهِيمَةِ الْأَنْعَامِ فَإِلَهُكُمْ إِلَهٌ وَاحِدٌ فَلَهُ أَسْلِمُوا وَبَشِّرِ الْمُخْبِتِينَ (34)"));
        alhagExes.add(new AlhagEx("ولكل جماعة مؤمنة سلفت، جعلنا لها مناسك مِنَ الذبح وإراقة الدماء؛ وذلك ليذكروا اسم الله تعالى عند ذبح ما رزقهم مِن هذه الأنعام ويشكروا له. فإلهكم -أيها الناس- إله واحد هو الله فانقادوا لأمره وأمر رسوله. وبشِّر -أيها النبي- المتواضعين الخاضعين لربهم بخيرَي الدنيا والآخرة."));
        alhagExes.add(new AlhagEx("الَّذِينَ إِذَا ذُكِرَ اللَّهُ وَجِلَتْ قُلُوبُهُمْ وَالصَّابِرِينَ عَلَى مَا أَصَابَهُمْ وَالْمُقِيمِي الصَّلَاةِ وَمِمَّا رَزَقْنَاهُمْ يُنْفِقُونَ (35)"));
        alhagExes.add(new AlhagEx("هؤلاء المتواضعون الخاشعون مِن صفاتهم أنهم إذا ذُكِر الله وحده خافوا عقابه، وحَذِروا مخالفته، وإذا أصابهم بأس وشدة صبروا على ذلك مؤملين الثواب من الله عز وجل، وأدَّوْا الصلاة تامة، وهم مع ذلك ينفقون مما رزقهم الله في الواجب عليهم مِن زكاة ونفقة عيال، ومَن وَجَبَتْ عليهم نفقته، وفي سبيل الله، والنفقات المستحبة."));
        alhagExes.add(new AlhagEx("وَالْبُدْنَ جَعَلْنَاهَا لَكُمْ مِنْ شَعَائِرِ اللَّهِ لَكُمْ فِيهَا خَيْرٌ فَاذْكُرُوا اسْمَ اللَّهِ عَلَيْهَا صَوَافَّ فَإِذَا وَجَبَتْ جُنُوبُهَا فَكُلُوا مِنْهَا وَأَطْعِمُوا الْقَانِعَ وَالْمُعْتَرَّ كَذَلِكَ سَخَّرْنَاهَا لَكُمْ لَعَلَّكُمْ تَشْكُرُونَ (36)"));
        alhagExes.add(new AlhagEx("وجعلنا لكم نَحْرَ البُدْن من شعائر الدين وأعلامه؛ لتتقربوا بها إلى الله، لكم فيها -أيها المتقربون- خير في منافعها من الأكل والصدقة والثواب والأجر، فقولوا عند ذبحها: بسم الله. وتُنْحَر الإبل واقفة قد صُفَّتْ ثلاث من قوائمها وقُيِّدت الرابعة، فإذا سقطت على الأرض جنوبها فقد حلَّ أكلها، فليأكل منها مقربوها تعبدًا ويُطْعِمُوا منها القانع -وهو الفقير الذي لم يسأل تعففًا- والمعترَّ الذي يسأل لحاجته، هكذا سخَّر الله البُدْن لكم، لعلكم تشكرون الله على تسخيرها لكم."));
        alhagExes.add(new AlhagEx("لَنْ يَنَالَ اللَّهَ لُحُومُهَا وَلَا دِمَاؤُهَا وَلَكِنْ يَنَالُهُ التَّقْوَى مِنْكُمْ كَذَلِكَ سَخَّرَهَا لَكُمْ لِتُكَبِّرُوا اللَّهَ عَلَى مَا هَدَاكُمْ وَبَشِّرِ الْمُحْسِنِينَ (37)"));
        alhagExes.add(new AlhagEx("لن ينال اللهَ مِن لحوم هذه الذبائح ولا من دمائها شيء، ولكن يناله الإخلاص فيها، وأن يكون القصد بها وجه الله وحده، كذلك ذللها لكم -أيها المتقربون-؛ لتعظموا الله، وتشكروا له على ما هداكم من الحق، فإنه أهلٌ لذلك. وبشِّر -أيها النبي- المحسنين بعبادة الله وحده والمحسنين إلى خلقه بكل خير وفلاح."));
        alhagExes.add(new AlhagEx("إِنَّ اللَّهَ يُدَافِعُ عَنِ الَّذِينَ آمَنُوا إِنَّ اللَّهَ لَا يُحِبُّ كُلَّ خَوَّانٍ كَفُورٍ (38)"));
        alhagExes.add(new AlhagEx("إن الله تعالى يدفع عن المؤمنين عدوان الكفار، وكيد الأشرار; لأنه عز وجل لا يحب كل خوَّان لأمانة ربه، جحود لنعمته."));
        alhagExes.add(new AlhagEx("أُذِنَ لِلَّذِينَ يُقَاتَلُونَ بِأَنَّهُمْ ظُلِمُوا وَإِنَّ اللَّهَ عَلَى نَصْرِهِمْ لَقَدِيرٌ (39)"));
        alhagExes.add(new AlhagEx("كان المسلمون في أول أمرهم ممنوعين من قتال الكفار، مأمورين بالصبر على أذاهم، فلما بلغ أذى المشركين مداه وخرج النبي صلى الله عليه وسلم من «مكة» مهاجرًا إلى «المدينة» ، وأصبح للإسلام قوة أَذِنَ الله للمسلمين في القتال؛ بسبب ما وقع عليهم من الظلم والعدوان، وإن الله تعالى قادر على نصرهم وإذلال عدوِّهم."));
        alhagExes.add(new AlhagEx("الَّذِينَ أُخْرِجُوا مِنْ دِيَارِهِمْ بِغَيْرِ حَقٍّ إِلَّا أَنْ يَقُولُوا رَبُّنَا اللَّهُ وَلَوْلَا دَفْعُ اللَّهِ النَّاسَ بَعْضَهُمْ بِبَعْضٍ لَهُدِّمَتْ صَوَامِعُ وَبِيَعٌ وَصَلَوَاتٌ وَمَسَاجِدُ يُذْكَرُ فِيهَا اسْمُ اللَّهِ كَثِيرًا وَلَيَنْصُرَنَّ اللَّهُ مَنْ يَنْصُرُهُ إِنَّ اللَّهَ لَقَوِيٌّ عَزِيزٌ (40)"));
        alhagExes.add(new AlhagEx("الذين أُلجئوا إلى الخروج من ديارهم، لا لشيء فعلوه إلا لأنهم أسلموا وقالوا: ربنا الله وحده. ولولا ما شرعه الله من دَفْع الظلم الذي ينتفع به جميع أهل الأديان المنزلة، ورد الباطل بالقتال المأذون فيه لَهُزِم الحقُّ في كل أمة ولخربت الأرض، وهُدِّمت فيها أماكن العبادة من صوامع الرهبان، وكنائس النصارى، ومعابد اليهود، ومساجد المسلمين التي يصلُّون فيها، ويذكرون اسم الله فيها كثيرًا. ومن اجتهد في نصرة دين الله، فإن الله ناصره على عدوه. إن الله لَقوي لا يغالَب، عزيز لا يرام، قد قهر الخلائق وأخذ بنواصيهم."));
        alhagExes.add(new AlhagEx("الَّذِينَ إِنْ مَكَّنَّاهُمْ فِي الْأَرْضِ أَقَامُوا الصَّلَاةَ وَآتَوُا الزَّكَاةَ وَأَمَرُوا بِالْمَعْرُوفِ وَنَهَوْا عَنِ الْمُنْكَرِ وَلِلَّهِ عَاقِبَةُ الْأُمُورِ (41)"));
        alhagExes.add(new AlhagEx("الذين وعدناهم بنصرنا هم الذين إنْ مكَّنَّاهم في الأرض، واستخلفناهم فيها بإظهارهم على عدوهم، أقاموا الصلاة بأدائها في أوقاتها بحدودها، وأخرجوا زكاة أموالهم إلى أهلها، وأمروا بكل ما أمر الله به مِن حقوقه وحقوق عباده، ونَهَوْا عن كل ما نهى الله عنه ورسوله. ولله وحده مصير الأمور كلها، والعاقبة للتقوى."));
        alhagExes.add(new AlhagEx("وَإِنْ يُكَذِّبُوكَ فَقَدْ كَذَّبَتْ قَبْلَهُمْ قَوْمُ نُوحٍ وَعَادٌ وَثَمُودُ (42)"));
        alhagExes.add(new AlhagEx("وإن يكذبك قومك -أيها الرسول- فقد سبقهم في تكذيب رسلهم قوم نوح، وعاد، وثمود"));
        alhagExes.add(new AlhagEx("وَقَوْمُ إِبْرَاهِيمَ وَقَوْمُ لُوطٍ (43)"));
        alhagExes.add(new AlhagEx("وقوم إبراهيم، وقوم لوط."));
        alhagExes.add(new AlhagEx("وَأَصْحَابُ مَدْيَنَ وَكُذِّبَ مُوسَى فَأَمْلَيْتُ لِلْكَافِرِينَ ثُمَّ أَخَذْتُهُمْ فَكَيْفَ كَانَ نَكِيرِ (44)"));
        alhagExes.add(new AlhagEx("وأصحاب «مدين» الذين كذبوا شعيبًا، وكذَّب فرعون وقومه موسى، فلم أعاجل هذه الأمم بالعقوبة، بل أمهلتها، ثم أخذتُ كلا منهم بالعذاب، فكيف كان إنكاري عليهم كفرهم وتكذيبهم، وتبديل ما كان بهم مِن نعمة بالعذاب والهلاك؟"));
        alhagExes.add(new AlhagEx("فَكَأَيِّنْ مِنْ قَرْيَةٍ أَهْلَكْنَاهَا وَهِيَ ظَالِمَةٌ فَهِيَ خَاوِيَةٌ عَلَى عُرُوشِهَا وَبِئْرٍ مُعَطَّلَةٍ وَقَصْرٍ مَشِيدٍ (45)"));
        alhagExes.add(new AlhagEx("فكثيرًا من القرى الظالمة بكفرها أهلكنا أهلها، فديارهم مهدَّمة خَلَتْ مِن سكانها، وآبارها لا يُستقى منها، وقصورها العالية المزخرفة لم تدفع عن أهلها سوء العذاب."));
        alhagExes.add(new AlhagEx("أَفَلَمْ يَسِيرُوا فِي الْأَرْضِ فَتَكُونَ لَهُمْ قُلُوبٌ يَعْقِلُونَ بِهَا أَوْ آذَانٌ يَسْمَعُونَ بِهَا فَإِنَّهَا لَا تَعْمَى الْأَبْصَارُ وَلَكِنْ تَعْمَى الْقُلُوبُ الَّتِي فِي الصُّدُورِ (46)"));
        alhagExes.add(new AlhagEx("أفلم يَسِر المكذبون من قريش في الأرض ليشاهدوا آثار المهلكين، فيتفكروا بعقولهم، فيعتبروا، ويسمعوا أخبارهم سماع تدبُّر فيتعظوا؟ فإن العمى ليس عمى البصر، وإنما العمى المُهْلِك هو عمى البصيرة عن إدراك الحق والاعتبار."));
        alhagExes.add(new AlhagEx("وَيَسْتَعْجِلُونَكَ بِالْعَذَابِ وَلَنْ يُخْلِفَ اللَّهُ وَعْدَهُ وَإِنَّ يَوْمًا عِنْدَ رَبِّكَ كَأَلْفِ سَنَةٍ مِمَّا تَعُدُّونَ (47)"));
        alhagExes.add(new AlhagEx("ويستعجلك- أيها الرسول- كفار قريش -لشدة جهلهم- بالعذاب الذي أنذرتهم به لمَّا أصروا على الكفر، ولن يخلف الله ما وعدهم به من العذاب فلا بدَّ من وقوعه، وقد عجَّل لهم في الدينا ذلك في يوم «بدر» . وإن يومًا من الأيام عند الله -وهو يوم القيامة- كألف سنة مما تَعُدُّون من سني الدنيا."));
        alhagExes.add(new AlhagEx("وَكَأَيِّنْ مِنْ قَرْيَةٍ أَمْلَيْتُ لَهَا وَهِيَ ظَالِمَةٌ ثُمَّ أَخَذْتُهَا وَإِلَيَّ الْمَصِيرُ (48)"));
        alhagExes.add(new AlhagEx("وكثير من القرى كانت ظالمة بإصرار أهلها على الكفر، فأمهلتهم ولم أعاجلهم بالعقوبة فاغتروا، ثم أخَذْتُهم بعذابي في الدنيا، وإليَّ مرجعهم بعد هلاكهم، فأعذبهم بما يستحقون."));
        alhagExes.add(new AlhagEx("قُلْ يَاأَيُّهَا النَّاسُ إِنَّمَا أَنَا لَكُمْ نَذِيرٌ مُبِينٌ (49)"));
        alhagExes.add(new AlhagEx("قل - أيها الرسول -: يا أيها الناس ما أنا إلا منذر لكم مبلِّغ عن الله رسالته."));
        alhagExes.add(new AlhagEx("فَالَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ لَهُمْ مَغْفِرَةٌ وَرِزْقٌ كَرِيمٌ (50)"));
        alhagExes.add(new AlhagEx("فالذين آمنوا بالله ورسوله، واستقر ذلك في قلوبهم، وعملوا الأعمال الصالحة، لهم عند الله عفو عن ذنوبهم ومغفرة يستر بها ما صدر عنهم من معصية، ورزق حسن لا ينقطع وهو الجنة."));
        alhagExes.add(new AlhagEx("وَالَّذِينَ سَعَوْا فِي آيَاتِنَا مُعَاجِزِينَ أُولَئِكَ أَصْحَابُ الْجَحِيمِ (51)"));
        alhagExes.add(new AlhagEx("والذين اجتهدوا في الكيد لإبطال آيات القرآن بالتكذيب مشاقين مغالبين، أولئك هم أهل النار الموقدة، يدخلونها ويبقون فيها أبدًا."));
        alhagExes.add(new AlhagEx("وَمَا أَرْسَلْنَا مِنْ قَبْلِكَ مِنْ رَسُولٍ وَلَا نَبِيٍّ إِلَّا إِذَا تَمَنَّى أَلْقَى الشَّيْطَانُ فِي أُمْنِيَّتِهِ فَيَنْسَخُ اللَّهُ مَا يُلْقِي الشَّيْطَانُ ثُمَّ يُحْكِمُ اللَّهُ آيَاتِهِ وَاللَّهُ عَلِيمٌ حَكِيمٌ (52)"));
        alhagExes.add(new AlhagEx("وما أرسلنا من قبلك - أيها الرسول - من رسول ولا نبي إلا إذا قرأ كتاب الله ألقى الشيطان في قراءته الوساوس والشبهات؛ ليصدَّ الناس عن اتباع ما يقرؤه ويتلوه، لكن الله يبطل كيد الشيطان، فيزيل وساوسه، ويثبت آياته الواضحات. والله عليم بما كان ويكون، لا تخفى عليه خافية، حكيم في تقديره وأمره."));
        alhagExes.add(new AlhagEx("لِيَجْعَلَ مَا يُلْقِي الشَّيْطَانُ فِتْنَةً لِلَّذِينَ فِي قُلُوبِهِمْ مَرَضٌ وَالْقَاسِيَةِ قُلُوبُهُمْ وَإِنَّ الظَّالِمِينَ لَفِي شِقَاقٍ بَعِيدٍ (53)"));
        alhagExes.add(new AlhagEx("وما كان هذا الفعل مِنَ الشيطان إلا ليجعله الله اختبارًا للذين في قلوبهم شك ونفاق، ولقساة القلوب من المشركين الذين لا يؤثِّرُ فيهم زجر. وإن الظالمين مِن هؤلاء وأولئك في عداوة شديدة لله ورسوله وخلافٍ للحق بعيد عن الصواب."));
        alhagExes.add(new AlhagEx("وَلِيَعْلَمَ الَّذِينَ أُوتُوا الْعِلْمَ أَنَّهُ الْحَقُّ مِنْ رَبِّكَ فَيُؤْمِنُوا بِهِ فَتُخْبِتَ لَهُ قُلُوبُهُمْ وَإِنَّ اللَّهَ لَهَادِ الَّذِينَ آمَنُوا إِلَى صِرَاطٍ مُسْتَقِيمٍ (54)"));
        alhagExes.add(new AlhagEx("وليعلم أهل العلم الذين يفرقون بعلمهم بين الحق والباطل أن القرآن الكريم هو الحق النازل من عند الله عليك أيها الرسول، لا شبهة فيه، ولا سبيل للشيطان إليه، فيزداد به إيمانهم، وتخضع له قلوبهم. وإن الله لهادي الذين آمنوا به وبرسوله إلى طريق الحق الواضح، وهو الإسلام ينقذهم به من الضلال."));
        alhagExes.add(new AlhagEx("وَلَا يَزَالُ الَّذِينَ كَفَرُوا فِي مِرْيَةٍ مِنْهُ حَتَّى تَأْتِيَهُمُ السَّاعَةُ بَغْتَةً أَوْ يَأْتِيَهُمْ عَذَابُ يَوْمٍ عَقِيمٍ (55)"));
        alhagExes.add(new AlhagEx("ولا يزال الكافرون المكذبون في شك مما جئتهم به من القرآن إلى أن تأتيهم الساعة فجأة، وهم على تكذيبهم، أو يأتيهم عذاب يوم لا خير فيه، وهو يوم القيامة."));
        alhagExes.add(new AlhagEx("الْمُلْكُ يَوْمَئِذٍ لِلَّهِ يَحْكُمُ بَيْنَهُمْ فَالَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ فِي جَنَّاتِ النَّعِيمِ (56)"));
        alhagExes.add(new AlhagEx("المُلك والسلطان في هذا اليوم لله وحده، وهو سبحانه يقضي بين المؤمنين والكافرين. فالذين آمنوا بالله ورسوله وعملوا الأعمال الصالحة، لهم النعيم الدائم في الجنات."));
        alhagExes.add(new AlhagEx("وَالَّذِينَ كَفَرُوا وَكَذَّبُوا بِآيَاتِنَا فَأُولَئِكَ لَهُمْ عَذَابٌ مُهِينٌ (57)"));
        alhagExes.add(new AlhagEx("والذين جحدوا وحدانية الله وكذبوا رسوله وأنكروا آيات القرآن، فأولئك لهم عذاب يخزيهم ويهينهم في جهنم."));
        alhagExes.add(new AlhagEx("وَالَّذِينَ هَاجَرُوا فِي سَبِيلِ اللَّهِ ثُمَّ قُتِلُوا أَوْ مَاتُوا لَيَرْزُقَنَّهُمُ اللَّهُ رِزْقًا حَسَنًا وَإِنَّ اللَّهَ لَهُوَ خَيْرُ الرَّازِقِينَ (58)"));
        alhagExes.add(new AlhagEx("والذين خرجوا من ديارهم طلبًا لرضا الله، ونصرة لدينه، من قُتل منهم وهو يجاهد الكفار، ومن مات منهم مِن غير قتال، لَيرزقَنَّهم الله الجنة ونعيمها الذي لا ينقطع ولا يزول، وإن الله سبحانه وتعالى لهو خير الرازقين."));
        alhagExes.add(new AlhagEx("لَيُدْخِلَنَّهُمْ مُدْخَلًا يَرْضَوْنَهُ وَإِنَّ اللَّهَ لَعَلِيمٌ حَلِيمٌ (59)"));
        alhagExes.add(new AlhagEx("ليُدخلنَّهم الله المُدْخل الذي يحبونه وهو الجنة. وإن الله لَعليم بمن يخرج في سبيله، ومن يخرج طلبًا للدنيا، حليم عمن عصاه، فلا يعاجلهم بالعقوبة."));
        alhagExes.add(new AlhagEx("ذَلِكَ وَمَنْ عَاقَبَ بِمِثْلِ مَا عُوقِبَ بِهِ ثُمَّ بُغِيَ عَلَيْهِ لَيَنْصُرَنَّهُ اللَّهُ إِنَّ اللَّهَ لَعَفُوٌّ غَفُورٌ (60)"));
        alhagExes.add(new AlhagEx("ذلك الأمر الذي قصصنا عليك من إدخال المهاجرين الجنة، ومن اعتُدِي عليه وظُلم فقد أُذِن له أن يقابل الجاني بمثل فعلته، ولا حرج عليه، فإذا عاد الجاني إلى إيذائه وبغى، فإن الله ينصر المظلوم المعتدى عليه; إذ لا يجوز أن يُعْتَدى عليه بسبب انتصافه لنفسه. إن الله لعفوٌ غفور، يعفو عن المذنبين فلا يعاجلهم بالعقوبة، ويغفر ذنوبهم."));
        alhagExes.add(new AlhagEx("ذَلِكَ بِأَنَّ اللَّهَ يُولِجُ اللَّيْلَ فِي النَّهَارِ وَيُولِجُ النَّهَارَ فِي اللَّيْلِ وَأَنَّ اللَّهَ سَمِيعٌ بَصِيرٌ (61)"));
        alhagExes.add(new AlhagEx("ذلك الذي شرع لكم تلك الأحكام العادلة هو الحق، وهو القادر على ما يشاء، ومِن قدرته أنه يدخل ما ينقص من ساعات الليل في ساعات النهار، ويدخل ما انتقص من ساعات النهار في ساعات الليل، وأن الله سميع لكل صوت، بصير بكل فعل، لا يخفى عليه شيء."));
        alhagExes.add(new AlhagEx("ذَلِكَ بِأَنَّ اللَّهَ هُوَ الْحَقُّ وَأَنَّ مَا يَدْعُونَ مِنْ دُونِهِ هُوَ الْبَاطِلُ وَأَنَّ اللَّهَ هُوَ الْعَلِيُّ الْكَبِيرُ (62)"));
        alhagExes.add(new AlhagEx("ذلك بأن الله هو الإله الحق الذي لا تنبغي العبادة إلا له، وأن ما يعبده المشركون من دونه من الأصنام والأنداد هو الباطل الذي لا ينفع ولا يضرُّ، وأن الله هو العليُّ على خلقه ذاتًا وقدرًا وقهرًا، المتعالي عن الأشباه والأنداد، الكبير في ذاته وأسمائه فهو أكبر من كلِّ شيء."));
        alhagExes.add(new AlhagEx("أَلَمْ تَرَ أَنَّ اللَّهَ أَنْزَلَ مِنَ السَّمَاءِ مَاءً فَتُصْبِحُ الْأَرْضُ مُخْضَرَّةً إِنَّ اللَّهَ لَطِيفٌ خَبِيرٌ (63)"));
        alhagExes.add(new AlhagEx("ألم ترَ -أيها الرسول- أن الله أنزل من السماء مطرًا، فتصبح الأرض مخضرة بما ينبت فيها من النبات؟ إن الله لطيف بعباده باستخراج النبات من الأرض بذلك الماء، خبير بمصالحهم."));
        alhagExes.add(new AlhagEx("لَهُ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ وَإِنَّ اللَّهَ لَهُوَ الْغَنِيُّ الْحَمِيدُ (64)"));
        alhagExes.add(new AlhagEx("لله سبحانه وتعالى ما في السموات والأرض خلقًا وملكًا وعبودية، كلٌّ محتاج إلى تدبيره وإفضاله. وإن الله لهو الغني الذي لا يحتاج إلى شيء، المحمود في كل حال."));
        alhagExes.add(new AlhagEx("أَلَمْ تَرَ أَنَّ اللَّهَ سَخَّرَ لَكُمْ مَا فِي الْأَرْضِ وَالْفُلْكَ تَجْرِي فِي الْبَحْرِ بِأَمْرِهِ وَيُمْسِكُ السَّمَاءَ أَنْ تَقَعَ عَلَى الْأَرْضِ إِلَّا بِإِذْنِهِ إِنَّ اللَّهَ بِالنَّاسِ لَرَءُوفٌ رَحِيمٌ (65)"));
        alhagExes.add(new AlhagEx("ألم تر أن الله تعالى ذلَّل لكم ما في الأرض من الدواب والبهائم والزروع والثمار والجماد لركوبكم وطعامكم وكل منافعكم، كما ذلَّل لكم السفن تجري في البحر بقدرته وأمره فتحملكم مع أمتعتكم إلى حيث تشاؤون من البلاد والأماكن، وهو الذي يمسك السماء فيحفظها؛ حتى لا تقع على الأرض فيهلك مَن عليها إلا بإذنه سبحانه بذلك؟ إن الله ليرحم الناس رحمة واسعة في عاجلهم وآجلهم ومن رحمته به ما سخره لهم من هذه الأشياء وغيرها؛ تفضلا منه عليهم."));
        alhagExes.add(new AlhagEx("وَهُوَ الَّذِي أَحْيَاكُمْ ثُمَّ يُمِيتُكُمْ ثُمَّ يُحْيِيكُمْ إِنَّ الْإِنْسَانَ لَكَفُورٌ (66)"));
        alhagExes.add(new AlhagEx("وهو الله تعالى الذي أحياكم بأن أوجدكم من العدم، ثم يميتكم عند انقضاء أعماركم، ثم يحييكم بالبعث لمحاسبتكم على أعمالكم. إن الإنسان لَجحود لما ظهر من الآيات الدالة على قدرة الله ووحدانيته."));
        alhagExes.add(new AlhagEx("لِكُلِّ أُمَّةٍ جَعَلْنَا مَنْسَكًا هُمْ نَاسِكُوهُ فَلَا يُنَازِعُنَّكَ فِي الْأَمْرِ وَادْعُ إِلَى رَبِّكَ إِنَّكَ لَعَلَى هُدًى مُسْتَقِيمٍ (67)"));
        alhagExes.add(new AlhagEx("لكل أمة من الأمم الماضية جعلنا شريعة وعبادة أمرناهم بها، فهم عاملون بها، فلا ينازعنك -أيها الرسول- مشركو قريش في شريعتك، وما أمرك الله به في المناسك وأنواع العبادات كلها، وادع إلى توحيد ربك وإخلاص العبادة له واتباع أمره، إنك لعلى دين قويم، لا اعوجاج فيه."));
        alhagExes.add(new AlhagEx("وَإِنْ جَادَلُوكَ فَقُلِ اللَّهُ أَعْلَمُ بِمَا تَعْمَلُونَ (68)"));
        alhagExes.add(new AlhagEx("وإن أصرُّوا على مجادلتك بالباطل فيما تدعوهم إليه فلا تجادلهم، بل قل لهم: الله أعلم بما تعملونه من الكفر والتكذيب، فهم معاندون مكابرون."));
        alhagExes.add(new AlhagEx("اللَّهُ يَحْكُمُ بَيْنَكُمْ يَوْمَ الْقِيَامَةِ فِيمَا كُنْتُمْ فِيهِ تَخْتَلِفُونَ (69)"));
        alhagExes.add(new AlhagEx("الله تعالى يحكم بين المسلمين والكافرين يوم القيامة في أمر اختلافهم في الدين. وفي هذه الآية أدب حسن في الرد على مَن جادل تعنتًا واستكبارًا."));
        alhagExes.add(new AlhagEx("أَلَمْ تَعْلَمْ أَنَّ اللَّهَ يَعْلَمُ مَا فِي السَّمَاءِ وَالْأَرْضِ إِنَّ ذَلِكَ فِي كِتَابٍ إِنَّ ذَلِكَ عَلَى اللَّهِ يَسِيرٌ (70)"));
        alhagExes.add(new AlhagEx("ألم تعلم -أيها الرسول- أن الله يعلم ما في السماء والأرض علماً كاملا قد أثبته في اللوح المحفوظ؟ إن ذلك العلم أمر سهل على الله، الذي لا يعجزه شيء."));
        alhagExes.add(new AlhagEx("وَيَعْبُدُونَ مِنْ دُونِ اللَّهِ مَا لَمْ يُنَزِّلْ بِهِ سُلْطَانًا وَمَا لَيْسَ لَهُمْ بِهِ عِلْمٌ وَمَا لِلظَّالِمِينَ مِنْ نَصِيرٍ (71)"));
        alhagExes.add(new AlhagEx("ويصر كفار قريش على الشرك بالله مع ظهور بطلان ما هم عليه، فهم يعبدون آلهة، لم يَنْزِل في كتاب مِن كتب الله برهان بأنها تصلح للعبادة، ولا علم لهم فيما اختلقوه، وافتروه على الله، وإنما هو أمر اتبعوا فيه آباءَهم بلا دليل. فإذا جاء وقت الحساب في الآخرة فليس للمشركين ناصر ينصرهم، أو يدفع عنهم العذاب."));
        alhagExes.add(new AlhagEx("وَإِذَا تُتْلَى عَلَيْهِمْ آيَاتُنَا بَيِّنَاتٍ تَعْرِفُ فِي وُجُوهِ الَّذِينَ كَفَرُوا الْمُنْكَرَ يَكَادُونَ يَسْطُونَ بِالَّذِينَ يَتْلُونَ عَلَيْهِمْ آيَاتِنَا قُلْ أَفَأُنَبِّئُكُمْ بِشَرٍّ مِنْ ذَلِكُمُ النَّارُ وَعَدَهَا اللَّهُ الَّذِينَ كَفَرُوا وَبِئْسَ الْمَصِيرُ (72)"));
        alhagExes.add(new AlhagEx("وإذا تتلى آيات القرآن الواضحة على هؤلاء المشركين ترى الكراهة ظاهرة على وجوههم، يكادون يبطشون بالمؤمنين الذين يدعونهم إلى الله تعالى، ويتلون عليهم آياته. قل لهم -أيها الرسول-: أفلا أخبركم بما هو أشد كراهة إليكم من سماع الحق ورؤية الداعين إليه؟ النار أعدَّها الله للكافرين في الآخرة، وبئس المكان الذي يصيرون إليه."));
        alhagExes.add(new AlhagEx("يَاأَيُّهَا النَّاسُ ضُرِبَ مَثَلٌ فَاسْتَمِعُوا لَهُ إِنَّ الَّذِينَ تَدْعُونَ مِنْ دُونِ اللَّهِ لَنْ يَخْلُقُوا ذُبَابًا وَلَوِ اجْتَمَعُوا لَهُ وَإِنْ يَسْلُبْهُمُ الذُّبَابُ شَيْئًا لَا يَسْتَنْقِذُوهُ مِنْهُ ضَعُفَ الطَّالِبُ وَالْمَطْلُوبُ (73)"));
        alhagExes.add(new AlhagEx("يا أيها الناس ضُرِب مثل فاستمعوا له وتدبروه: إن الأصنام والأنداد التي تعبدونها من دون الله لن تقدر مجتمعة على خَلْق ذبابة واحدة، فكيف بخلق ما هو أكبر؟ ولا تقدر أن تستخلص ما يسلبه الذباب منها، فهل بعد ذلك مِن عَجْز؟ فهما ضعيفان معًا: ضَعُفَ الطالب الذي هو المعبود من دون الله أن يستنقذ ما أخذه الذباب منه، وضَعُفَ المطلوب الذي هو الذباب، فكيف تُتَّخذ هذه الأصنام والأنداد آلهة، وهي بهذا الهوان؟"));
        alhagExes.add(new AlhagEx("مَا قَدَرُوا اللَّهَ حَقَّ قَدْرِهِ إِنَّ اللَّهَ لَقَوِيٌّ عَزِيزٌ (74)"));
        alhagExes.add(new AlhagEx("هؤلاء المشركون لم يعظِّموا الله حق تعظيمه، إذ جعلوا له شركاء، وهو القوي الذي خلق كل شيء، العزيز الذي لا يغالَب."));
        alhagExes.add(new AlhagEx("اللَّهُ يَصْطَفِي مِنَ الْمَلَائِكَةِ رُسُلًا وَمِنَ النَّاسِ إِنَّ اللَّهَ سَمِيعٌ بَصِيرٌ (75)"));
        alhagExes.add(new AlhagEx("الله سبحانه وتعالى يختار من الملائكة رسلا إلى أنبيائه، ويختار من الناس رسلا لتبليغ رسالاته إلى الخلق، إن الله سميع لأقوال عباده، بصير بجميع الأشياء، وبمن يختاره للرسالة مِن خلقه."));
        alhagExes.add(new AlhagEx("يَعْلَمُ مَا بَيْنَ أَيْدِيهِمْ وَمَا خَلْفَهُمْ وَإِلَى اللَّهِ تُرْجَعُ الْأُمُورُ (76)"));
        alhagExes.add(new AlhagEx("وهو سبحانه يعلم ما بين أيدي ملائكته ورسله من قبل أن يخلقهم، ويعلم ما هو كائن بعد فنائهم. وإلى الله وحده ترجع الأمور."));
        alhagExes.add(new AlhagEx("يَاأَيُّهَا الَّذِينَ آمَنُوا ارْكَعُوا وَاسْجُدُوا وَاعْبُدُوا رَبَّكُمْ وَافْعَلُوا الْخَيْرَ لَعَلَّكُمْ تُفْلِحُونَ (77)"));
        alhagExes.add(new AlhagEx("يا أيها الذين آمنوا بالله ورسوله محمد صلى الله عليه وسلم اركعوا واسجدوا في صلاتكم، واعبدوا ربكم وحده لا شريك له، وافعلوا الخير; لتفلحوا."));
        alhagExes.add(new AlhagEx("وَجَاهِدُوا فِي اللَّهِ حَقَّ جِهَادِهِ هُوَ اجْتَبَاكُمْ وَمَا جَعَلَ عَلَيْكُمْ فِي الدِّينِ مِنْ حَرَجٍ مِلَّةَ أَبِيكُمْ إِبْرَاهِيمَ هُوَ سَمَّاكُمُ الْمُسْلِمِينَ مِنْ قَبْلُ وَفِي هَذَا لِيَكُونَ الرَّسُولُ شَهِيدًا عَلَيْكُمْ وَتَكُونُوا شُهَدَاءَ عَلَى النَّاسِ فَأَقِيمُوا الصَّلَاةَ وَآتُوا الزَّكَاةَ وَاعْتَصِمُوا بِاللَّهِ هُوَ مَوْلَاكُمْ فَنِعْمَ الْمَوْلَى وَنِعْمَ النَّصِيرُ (78)"));
        alhagExes.add(new AlhagEx("وجاهدوا أنفسكم، وقوموا قيامًا تامًّا بأمر الله، وادعوا الخلق إلى سبيله، وجاهدوا بأموالكم وألسنتكم وأنفسكم، مخلصين فيه النية لله عز وجل، مسلمين له قلوبكم وجوارحكم، هو اصطفاكم لحمل هذا الدين، وقد منَّ عليكم بأن جعل شريعتكم سمحة، ليس فيها تضييق ولا تشديد في تكاليفها وأحكامها، كما كان في بعض الأمم قبلكم، هذه الملة السمحة هي ملة أبيكم إبراهيم، وقد سَمَّاكم الله المسلمين مِن قبلُ في الكتب المنزلة السابقة، وفي هذا القرآن، وقد اختصَّكم بهذا الاختيار ; ليكون خاتم الرسل محمد صلى الله عليه وسلم شاهدًا عليكم بأنه بلَّغكم رسالة ربه، وتكونوا شهداء على الأمم أن رسلهم قد بلَّغتهم بما أخبركم الله به في كتابه، فعليكم أن تعرفوا لهذه النعمة قدرها، فتشكروها، وتحافظوا على معالم دين الله بأداء الصلاة بأركانها وشروطها، وإخراج الزكاة المفروضة، وأن تلجؤوا إلى الله سبحانه وتعالى، وتتوكلوا عليه، فهو نِعْمَ المولى لمن تولاه، ونعم النصير لمن استنصره."));



        quran_explanation_22_adapter = new quran_explanation_22_adapter(alhagExes ,QuranExplanation_22Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_22);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_22Activity.this));
        recyclerView.setAdapter(quran_explanation_22_adapter);


    }

}