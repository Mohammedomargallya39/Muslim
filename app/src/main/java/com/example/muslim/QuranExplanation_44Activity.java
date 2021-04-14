package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_44Activity extends AppCompatActivity {

    ArrayList<AldokhanEx> aldokhanExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_44_adapter quran_explanation_44_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_44);

        aldokhanExes.add(new AldokhanEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيم"));
        aldokhanExes.add(new AldokhanEx("حم (1)"));
        aldokhanExes.add(new AldokhanEx("{حم} سبق الكلام على الحروف المقطَّعة في أول سورة البقرة."));
        aldokhanExes.add(new AldokhanEx("وَالْكِتَابِ الْمُبِينِ (2)"));
        aldokhanExes.add(new AldokhanEx("أقسم الله تعالى بالقرآن الواضح لفظًا ومعنى."));
        aldokhanExes.add(new AldokhanEx("إِنَّا أَنْزَلْنَاهُ فِي لَيْلَةٍ مُبَارَكَةٍ إِنَّا كُنَّا مُنْذِرِينَ (3)"));
        aldokhanExes.add(new AldokhanEx("إنا أنزلناه في ليلة القدر المباركة كثيرة الخيرات، وهي في رمضان. إنا كنا منذرين الناس بما ينفعهم ويضرهم، وذلك بإرسال الرسل وإنزال الكتب؛ لتقوم حجة الله على عباده."));
        aldokhanExes.add(new AldokhanEx("فِيهَا يُفْرَقُ كُلُّ أَمْرٍ حَكِيمٍ (4)"));
        aldokhanExes.add(new AldokhanEx("فيها يُقضى ويُفصل من اللوح المحفوظ إلى الكتبة من الملائكة كلُّ أمر محكم من الآجال والأرزاق في تلك السنة، وغير ذلك مما يكون فيها إلى آخرها، لا يبدَّل ولا يغيَّر. هذا الأمر الحكيم أمر مِن عندنا، فجميع ما يكون ويقدره الله تعالى وما يوحيه فبأمره وإذنه وعلمه. إنا كنا مرسلين إلى الناس الرسل محمدًا ومن قبله؛ رحمة من ربك -أيها الرسول- بالمرسل إليهم. إنه هو السميع يسمع جميع الأصوات، العليم بجميع أمور خلقه الظاهرة والباطنة."));
        aldokhanExes.add(new AldokhanEx("رَبِّ السَّمَاوَاتِ وَالْأَرْضِ وَمَا بَيْنَهُمَا إِنْ كُنْتُمْ مُوقِنِينَ (7)"));
        aldokhanExes.add(new AldokhanEx("خالق السموات والأرض وما بينهما من الأشياء كلها، إن كنتم موقنين بذلك فاعلموا أن رب المخلوقات هو إلهها الحق."));
        aldokhanExes.add(new AldokhanEx("لَا إِلَهَ إِلَّا هُوَ يُحْيِي وَيُمِيتُ رَبُّكُمْ وَرَبُّ آبَائِكُمُ الْأَوَّلِينَ (8)"));
        aldokhanExes.add(new AldokhanEx("لا إله يستحق العبادة إلا هو وحده لا شريك له، يحيي ويميت، ربكم ورب آبائكم الأولين، فاعبدوه دون آلهتكم التي لا تقدر على ضر ولا نفع."));
        aldokhanExes.add(new AldokhanEx("بَلْ هُمْ فِي شَكٍّ يَلْعَبُونَ (9)"));
        aldokhanExes.add(new AldokhanEx("بل هؤلاء المشركون في شك من الحق، فهم يلهون ويلعبون، ولا يصدقون به."));
        aldokhanExes.add(new AldokhanEx("فَارْتَقِبْ يَوْمَ تَأْتِي السَّمَاءُ بِدُخَانٍ مُبِينٍ (10)"));
        aldokhanExes.add(new AldokhanEx("فانتظر -أيها الرسول- بهؤلاء المشركين يوم تأتي السماء بدخان مبين واضح يعمُّ الناس."));
        aldokhanExes.add(new AldokhanEx("يَغْشَى النَّاسَ هَذَا عَذَابٌ أَلِيمٌ (11)"));
        aldokhanExes.add(new AldokhanEx("ويقال لهم: هذا عذاب مؤلم موجع."));
        aldokhanExes.add(new AldokhanEx("رَبَّنَا اكْشِفْ عَنَّا الْعَذَابَ إِنَّا مُؤْمِنُونَ (12)"));
        aldokhanExes.add(new AldokhanEx("ثم يقولون سائلين رفعه وكشفه عنهم: ربنا اكشف عنا العذاب، فإن كشفته عنا فإنا مؤمنون بك. وقد تحقق ذلك، فلم يؤمنوا كما وعدوا."));
        aldokhanExes.add(new AldokhanEx("أَنَّى لَهُمُ الذِّكْرَى وَقَدْ جَاءَهُمْ رَسُولٌ مُبِينٌ (13)"));
        aldokhanExes.add(new AldokhanEx("كيف يكون لهم التذكر والاتعاظ بعد نزول العذاب بهم، وقد جاءهم رسول مبين، وهو محمد عليه الصلاة والسلام."));
        aldokhanExes.add(new AldokhanEx("ثُمَّ تَوَلَّوْا عَنْهُ وَقَالُوا مُعَلَّمٌ مَجْنُونٌ (14)"));
        aldokhanExes.add(new AldokhanEx("ثم أعرضوا عنه وقالوا: علَّمه بشر أو الكهنة أو الشياطين، هو مجنون وليس برسول؟"));
        aldokhanExes.add(new AldokhanEx("إِنَّا كَاشِفُو الْعَذَابِ قَلِيلًا إِنَّكُمْ عَائِدُونَ (15)"));
        aldokhanExes.add(new AldokhanEx("سنرفع عنكم العذاب قليلا، وسترون أنكم تعودون إلى ما كنتم فيه من الكفر والضلال والتكذيب، وأننا سنعاقبكم على ذلك."));
        aldokhanExes.add(new AldokhanEx("يَوْمَ نَبْطِشُ الْبَطْشَةَ الْكُبْرَى إِنَّا مُنْتَقِمُونَ (16)"));
        aldokhanExes.add(new AldokhanEx("يوم نعذب جميع الكفار العذاب الأكبر يوم القيامة وهو يوم انتقامنا منهم."));
        aldokhanExes.add(new AldokhanEx("وَلَقَدْ فَتَنَّا قَبْلَهُمْ قَوْمَ فِرْعَوْنَ وَجَاءَهُمْ رَسُولٌ كَرِيمٌ (17)"));
        aldokhanExes.add(new AldokhanEx("ولقد اختبرنا وابتلينا قبل هؤلاء المشركين قوم فرعون، وجاءهم رسول كريم، وهو موسى عليه السلام، فكذبوه فهلكوا، فهكذا نفعل بأعدائك أيها الرسول، إن لم يؤمنوا."));
        aldokhanExes.add(new AldokhanEx("أَنْ أَدُّوا إِلَيَّ عِبَادَ اللَّهِ إِنِّي لَكُمْ رَسُولٌ أَمِينٌ (18)"));
        aldokhanExes.add(new AldokhanEx("وقال لهم موسى: أن سلِّموا إليَّ عباد الله من بني إسرائيل وأرسلوهم معي؛ ليعبدوا الله وحده لا شريك له، إني لكم رسول أمين على وحيه ورسالته."));
        aldokhanExes.add(new AldokhanEx("وَأَنْ لَا تَعْلُوا عَلَى اللَّهِ إِنِّي آتِيكُمْ بِسُلْطَانٍ مُبِينٍ (19)"));
        aldokhanExes.add(new AldokhanEx("وألا تتكبروا على الله بتكذيب رسله، إني آتيكم ببرهان واضح على صدق رسالتي."));
        aldokhanExes.add(new AldokhanEx("وَإِنِّي عُذْتُ بِرَبِّي وَرَبِّكُمْ أَنْ تَرْجُمُونِ (20)"));
        aldokhanExes.add(new AldokhanEx("وإني استجرت بالله ربي وربكم أن تقتلوني رجمًا بالحجارة."));
        aldokhanExes.add(new AldokhanEx("وَإِنْ لَمْ تُؤْمِنُوا لِي فَاعْتَزِلُونِ (21)"));
        aldokhanExes.add(new AldokhanEx("وإن لم تصدقوني على ما جئتكم به فخلُّوا سبيلي، وكفُّوا عن أذاي."));
        aldokhanExes.add(new AldokhanEx("فَدَعَا رَبَّهُ أَنَّ هَؤُلَاءِ قَوْمٌ مُجْرِمُونَ (22)"));
        aldokhanExes.add(new AldokhanEx("فدعا موسى ربه -حين كذبه فرعون وقومه ولم يؤمنوا به- قائلا إن هؤلاء قوم مشركون بالله كافرون."));
        aldokhanExes.add(new AldokhanEx("فَأَسْرِ بِعِبَادِي لَيْلًا إِنَّكُمْ مُتَّبَعُونَ (23)"));
        aldokhanExes.add(new AldokhanEx("فأَسْر -يا موسى- بعبادي -الذين صَدَّقوك، وآمنوا بك، واتبعوك، دون الذين كذبوك منهم- ليلا إنكم متبعون من فرعون وجنوده فتنجون، ويغرق فرعون وجنوده."));
        aldokhanExes.add(new AldokhanEx("وَاتْرُكِ الْبَحْرَ رَهْوًا إِنَّهُمْ جُنْدٌ مُغْرَقُونَ (24)"));
        aldokhanExes.add(new AldokhanEx("واترك البحر كما هو على حالته التي كان عليها حين سلكته، ساكنًا غير مضطرب، إن فرعون وجنوده مغرقون في البحر."));
        aldokhanExes.add(new AldokhanEx("كَمْ تَرَكُوا مِنْ جَنَّاتٍ وَعُيُونٍ (25)"));
        aldokhanExes.add(new AldokhanEx("كم ترك فرعون وقومه بعد مهلكهم وإغراق الله إياهم من بساتين وجنات ناضرة، وعيون من الماء جارية."));
        aldokhanExes.add(new AldokhanEx("وَزُرُوعٍ وَمَقَامٍ كَرِيمٍ (26)"));
        aldokhanExes.add(new AldokhanEx("وزروع ومنازل جميلة."));
        aldokhanExes.add(new AldokhanEx("وَنَعْمَةٍ كَانُوا فِيهَا فَاكِهِينَ (27)"));
        aldokhanExes.add(new AldokhanEx("وعيشة كانوا فيها متنعمين مترفين."));
        aldokhanExes.add(new AldokhanEx("كَذَلِكَ وَأَوْرَثْنَاهَا قَوْمًا آخَرِينَ (28)"));
        aldokhanExes.add(new AldokhanEx("مثل ذلك العقاب يعاقب الله مَن كذَّب وبدَّل نعمة الله كفرًا، وأورثنا تلك النعم من بعد فرعون وقومه قومًا آخرين خلفوهم من بني إسرائيل."));
        aldokhanExes.add(new AldokhanEx("فَمَا بَكَتْ عَلَيْهِمُ السَّمَاءُ وَالْأَرْضُ وَمَا كَانُوا مُنْظَرِينَ (29)"));
        aldokhanExes.add(new AldokhanEx("فما بكت السماء والأرض حزنًا على فرعون وقومه، وما كانوا مؤخَّرين عن العقوبة التي حلَّت بهم."));
        aldokhanExes.add(new AldokhanEx("وَلَقَدْ نَجَّيْنَا بَنِي إِسْرَائِيلَ مِنَ الْعَذَابِ الْمُهِينِ (30)"));
        aldokhanExes.add(new AldokhanEx("ولقد نجَّينا بني إسرائيل من العذاب المُذلِّ لهم بقتل أبنائهم واستخدام نسائهم."));
        aldokhanExes.add(new AldokhanEx("مِنْ فِرْعَوْنَ إِنَّهُ كَانَ عَالِيًا مِنَ الْمُسْرِفِينَ (31)"));
        aldokhanExes.add(new AldokhanEx("من فرعون، إنه كان جبارًا من المشركين، مسرفًا في العلو والتكبر على عباد الله."));
        aldokhanExes.add(new AldokhanEx("وَلَقَدِ اخْتَرْنَاهُمْ عَلَى عِلْمٍ عَلَى الْعَالَمِينَ (32)"));
        aldokhanExes.add(new AldokhanEx("ولقد اصطفينا بني إسرائيل على عِلْم منا بهم على عالمي زمانهم."));
        aldokhanExes.add(new AldokhanEx("وَآتَيْنَاهُمْ مِنَ الْآيَاتِ مَا فِيهِ بَلَاءٌ مُبِينٌ (33)"));
        aldokhanExes.add(new AldokhanEx("وآتيناهم من المعجزات على يد موسى ما فيه ابتلاؤهم واختبارهم؛ رخاء وشدة."));
        aldokhanExes.add(new AldokhanEx("إِنَّ هَؤُلَاءِ لَيَقُولُونَ (34)"));
        aldokhanExes.add(new AldokhanEx("إن هؤلاء المشركين مِن قومك -أيها الرسول- ليقولون:"));
        aldokhanExes.add(new AldokhanEx("إِنْ هِيَ إِلَّا مَوْتَتُنَا الْأُولَى وَمَا نَحْنُ بِمُنْشَرِينَ (35)"));
        aldokhanExes.add(new AldokhanEx("ما هي إلا موتتنا التي نموتها، وهي الموتة الأولى والأخيرة، وما نحن بعد مماتنا بمبعوثين للحساب والثواب والعقاب."));
        aldokhanExes.add(new AldokhanEx("فَأْتُوا بِآبَائِنَا إِنْ كُنْتُمْ صَادِقِينَ (36)"));
        aldokhanExes.add(new AldokhanEx("ويقولون أيضًا: فَأْتِ -يا محمد أنت ومَن معك- بآبائنا الذين قد ماتوا، إن كنتم صادقين في أن الله يبعث مَن في القبور أحياء."));
        aldokhanExes.add(new AldokhanEx("أَهُمْ خَيْرٌ أَمْ قَوْمُ تُبَّعٍ وَالَّذِينَ مِنْ قَبْلِهِمْ أَهْلَكْنَاهُمْ إِنَّهُمْ كَانُوا مُجْرِمِينَ (37)"));
        aldokhanExes.add(new AldokhanEx("أهؤلاء المشركون خير أم قوم تُبَّع الحِمْيَري والذين مِن قبلهم من الأمم الكافرة بربها؟ أهلكناهم لإجرامهم وكفرهم، ليس هؤلاء المشركون بخير مِن أولئكم فنصفح عنهم، ولا نهلكهم، وهم بالله كافرون."));
        aldokhanExes.add(new AldokhanEx("وَمَا خَلَقْنَا السَّمَاوَاتِ وَالْأَرْضَ وَمَا بَيْنَهُمَا لَاعِبِينَ (38)"));
        aldokhanExes.add(new AldokhanEx("وما خلقنا السموات والأرض وبينهما لعبًا."));
        aldokhanExes.add(new AldokhanEx("مَا خَلَقْنَاهُمَا إِلَّا بِالْحَقِّ وَلَكِنَّ أَكْثَرَهُمْ لَا يَعْلَمُونَ (39)"));
        aldokhanExes.add(new AldokhanEx("ما خلقناهما إلا بالحق الذي هو سنة الله في خَلْقِه وتدبيرُه، ولكن أكثر هؤلاء المشركين لا يعلمون ذلك، فلهذا لم يتفكروا فيهما; لأنهم لا يرجون ثوابًا ولا يخافون عقابًا."));
        aldokhanExes.add(new AldokhanEx("إِنَّ يَوْمَ الْفَصْلِ مِيقَاتُهُمْ أَجْمَعِينَ (40)"));
        aldokhanExes.add(new AldokhanEx("إن يوم القضاء بين الخلق بما قدَّموا في دنياهم من خير أو شر هو ميقاتهم أجمعين."));
        aldokhanExes.add(new AldokhanEx("يَوْمَ لَا يُغْنِي مَوْلًى عَنْ مَوْلًى شَيْئًا وَلَا هُمْ يُنْصَرُونَ (41)"));
        aldokhanExes.add(new AldokhanEx("يوم لا يدفع صاحب عن صاحبه شيئًا، ولا ينصر بعضهم بعضًا."));
        aldokhanExes.add(new AldokhanEx("إِلَّا مَنْ رَحِمَ اللَّهُ إِنَّهُ هُوَ الْعَزِيزُ الرَّحِيمُ (42)"));
        aldokhanExes.add(new AldokhanEx("إلا مَن رحم الله من المؤمنين، فإنه قد يشفع له عند ربه بعد إذن الله له. إن الله هو العزيز في انتقامه مِن أعدائه، الرحيم بأوليائه وأهل طاعته."));
        aldokhanExes.add(new AldokhanEx("إِنَّ شَجَرَتَ الزَّقُّومِ (43)"));
        aldokhanExes.add(new AldokhanEx("إن شجرة الزقوم التي تخرج في أصل الجحيم."));
        aldokhanExes.add(new AldokhanEx("طَعَامُ الْأَثِيمِ (44)"));
        aldokhanExes.add(new AldokhanEx("ثمرها طعام صاحب الآثام الكثيرة، وأكبر الآثام الشرك بالله."));
        aldokhanExes.add(new AldokhanEx("كَالْمُهْلِ يَغْلِي فِي الْبُطُونِ (45)"));
        aldokhanExes.add(new AldokhanEx("ثمر شجرة الزقوم كالمَعْدِن المذاب يغلي في بطون المشركين."));
        aldokhanExes.add(new AldokhanEx("كَغَلْيِ الْحَمِيمِ (46)"));
        aldokhanExes.add(new AldokhanEx("كغلي الماء الذي بلغ الغاية في الحرارة."));
        aldokhanExes.add(new AldokhanEx("خُذُوهُ فَاعْتِلُوهُ إِلَى سَوَاءِ الْجَحِيمِ (47)"));
        aldokhanExes.add(new AldokhanEx("خذوا هذا الأثيم الفاجر فادفعوه، وسوقوه بعنف إلى وسط الجحيم يوم القيامة."));
        aldokhanExes.add(new AldokhanEx("ثُمَّ صُبُّوا فَوْقَ رَأْسِهِ مِنْ عَذَابِ الْحَمِيمِ (48)"));
        aldokhanExes.add(new AldokhanEx("ثم صبُّوا فوق رأس هذا الأثيم الماء الذي تناهت شدة حرارته، فلا يفارقه العذاب."));
        aldokhanExes.add(new AldokhanEx("ذُقْ إِنَّكَ أَنْتَ الْعَزِيزُ الْكَرِيمُ (49)"));
        aldokhanExes.add(new AldokhanEx("يقال لهذا الأثيم الشقيِّ -على وجه التهكُّم والتوبيخ-: ذق هذا العذاب الذي تعذَّب به اليوم، إنك أنت العزيز في قومك، الكريم عليهم."));
        aldokhanExes.add(new AldokhanEx("إِنَّ هَذَا مَا كُنْتُمْ بِهِ تَمْتَرُونَ (50)"));
        aldokhanExes.add(new AldokhanEx("إن هذا العذاب الذي تعذَّبون به اليوم هو العذاب الذي كنتم تشكُّون فيه في الدنيا، ولا توقنون به."));
        aldokhanExes.add(new AldokhanEx("إِنَّ الْمُتَّقِينَ فِي مَقَامٍ أَمِينٍ (51)"));
        aldokhanExes.add(new AldokhanEx("إن الذين اتقوا الله بامتثال أوامره، واجتناب نواهيه في الدنيا في موضع إقامة في الآخرة آمنين من الآفات والأحزان وغير ذلك."));
        aldokhanExes.add(new AldokhanEx("فِي جَنَّاتٍ وَعُيُونٍ (52)"));
        aldokhanExes.add(new AldokhanEx("في جنات وعيون جارية."));
        aldokhanExes.add(new AldokhanEx("يَلْبَسُونَ مِنْ سُنْدُسٍ وَإِسْتَبْرَقٍ مُتَقَابِلِينَ (53)"));
        aldokhanExes.add(new AldokhanEx("يَلْبَسون ما رَقَّ من الديباج وما غَلُظَ منه، يقابل بعضهم بعضًا بالوجوه، ولا ينظر بعضهم في قفا بعض، يدور بهم مجلسهم حيث داروا."));
        aldokhanExes.add(new AldokhanEx("كَذَلِكَ وَزَوَّجْنَاهُمْ بِحُورٍ عِينٍ (54)"));
        aldokhanExes.add(new AldokhanEx("كما أعطينا هؤلاء المتقين في الآخرة من الكرامة بإدخالهم الجنات وإلباسهم فيها السندس والإستبرق، كذلك أكرمناهم بأن زوَّجناهم بالحسان من النساء واسعات الأعين جميلاتها."));
        aldokhanExes.add(new AldokhanEx("يَدْعُونَ فِيهَا بِكُلِّ فَاكِهَةٍ آمِنِينَ (55)"));
        aldokhanExes.add(new AldokhanEx("يطلب هؤلاء المتقون في الجنة كل نوع من فواكه الجنة اشتهوه، آمنين من انقطاع ذلك عنهم وفنائه."));
        aldokhanExes.add(new AldokhanEx("لَا يَذُوقُونَ فِيهَا الْمَوْتَ إِلَّا الْمَوْتَةَ الْأُولَى وَوَقَاهُمْ عَذَابَ الْجَحِيمِ (56)"));
        aldokhanExes.add(new AldokhanEx("لا يذوق هؤلاء المتقون في الجنة الموت بعد الموتة الأولى التي ذاقوها في الدنيا، ووقى الله هؤلاء المتقين عذاب الجحيم."));
        aldokhanExes.add(new AldokhanEx("فَضْلًا مِنْ رَبِّكَ ذَلِكَ هُوَ الْفَوْزُ الْعَظِيمُ (57)"));
        aldokhanExes.add(new AldokhanEx("تفضلا وإحسانًا منه سبحانه وتعالى، هذا الذي أعطيناه المتقين في الآخرة من الكرامات هو الفوز العظيم الذي لا فوز بعده."));
        aldokhanExes.add(new AldokhanEx("فَإِنَّمَا يَسَّرْنَاهُ بِلِسَانِكَ لَعَلَّهُمْ يَتَذَكَّرُونَ (58)"));
        aldokhanExes.add(new AldokhanEx("فإنما سهَّلنا لفظ القرآن ومعناه بلغتك أيها الرسول; لعلهم يتعظون وينزجرون."));
        aldokhanExes.add(new AldokhanEx("فَارْتَقِبْ إِنَّهُمْ مُرْتَقِبُونَ (59)"));
        aldokhanExes.add(new AldokhanEx("فانتظر -أيها الرسول- ما وعدتك من النصر على هؤلاء المشركين بالله، وما يحلُّ بهم من العقاب، إنهم منتظرون موتك وقهرك، سيعلمون لمن تكون النصرة والظَّفَر وعلو الكلمة في الدنيا والآخرة، إنها لك -أيها الرسول- ولمن اتبعك من المؤمنين."));




        quran_explanation_44_adapter = new quran_explanation_44_adapter(aldokhanExes ,QuranExplanation_44Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_44);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_44Activity.this));
        recyclerView.setAdapter(quran_explanation_44_adapter);


    }

}