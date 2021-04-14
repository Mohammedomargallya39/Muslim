package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_51Activity extends AppCompatActivity {

    ArrayList<AlzoriatEx> alzoriatExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_51_adapter quran_explanation_51_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_51);

        alzoriatExes.add(new AlzoriatEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alzoriatExes.add(new AlzoriatEx("وَالذَّارِيَاتِ ذَرْوًا (1)"));
        alzoriatExes.add(new AlzoriatEx("أقسم الله تعالى بالرياح المثيرات للتراب."));
        alzoriatExes.add(new AlzoriatEx("فَالْحَامِلَاتِ وِقْرًا (2)"));
        alzoriatExes.add(new AlzoriatEx("فالسحب الحاملات ثقلا عظيمًا من الماء."));
        alzoriatExes.add(new AlzoriatEx("فَالْجَارِيَاتِ يُسْرًا (3)"));
        alzoriatExes.add(new AlzoriatEx("فالسفن التي تجري في البحار جريًا ذا يسر وسهولة."));
        alzoriatExes.add(new AlzoriatEx("فَالْمُقَسِّمَاتِ أَمْرًا (4)"));
        alzoriatExes.add(new AlzoriatEx("فالملائكة التي تُقَسِّم أمر الله في خلقه."));
        alzoriatExes.add(new AlzoriatEx("إِنَّمَا تُوعَدُونَ لَصَادِقٌ (5)"));
        alzoriatExes.add(new AlzoriatEx("إن الذي توعدون به -أيها الناس- من البعث والحساب لكائن حق يقين."));
        alzoriatExes.add(new AlzoriatEx("وَإِنَّ الدِّينَ لَوَاقِعٌ (6)"));
        alzoriatExes.add(new AlzoriatEx("وإن الحساب والثواب على الأعمال لكائن لا محالة."));
        alzoriatExes.add(new AlzoriatEx("وَالسَّمَاءِ ذَاتِ الْحُبُكِ (7)"));
        alzoriatExes.add(new AlzoriatEx("وأقسم الله تعالى بالسماء ذات الخَلْق الحسن."));
        alzoriatExes.add(new AlzoriatEx("إِنَّكُمْ لَفِي قَوْلٍ مُخْتَلِفٍ (8)"));
        alzoriatExes.add(new AlzoriatEx("إنكم -أيها المكذبون- لفي قول مضطرب في هذا القرآن، وفي الرسول صلى الله عليه وسلم."));
        alzoriatExes.add(new AlzoriatEx("يُؤْفَكُ عَنْهُ مَنْ أُفِكَ (9)"));
        alzoriatExes.add(new AlzoriatEx("يُصرف عن القرآن والرسول صلى الله عليه وسلم مَن صُرف عن الإيمان بهما؛ لإعراضه عن أدلة الله وبراهينه اليقينية فلم يوفَّق إلى الخير."));
        alzoriatExes.add(new AlzoriatEx("قُتِلَ الْخَرَّاصُونَ (10)"));
        alzoriatExes.add(new AlzoriatEx("لُعِن الكذابون الظانون غير الحق."));
        alzoriatExes.add(new AlzoriatEx("الَّذِينَ هُمْ فِي غَمْرَةٍ سَاهُونَ (11)"));
        alzoriatExes.add(new AlzoriatEx("الذين هم في لُجَّة من الكفر والضلالة غافلون متمادون."));
        alzoriatExes.add(new AlzoriatEx("يَسْأَلُونَ أَيَّانَ يَوْمُ الدِّينِ (12)"));
        alzoriatExes.add(new AlzoriatEx("يسأل هؤلاء الكذابون سؤال استبعاد وتكذيب: متى يوم الحساب والجزاء؟"));
        alzoriatExes.add(new AlzoriatEx("يَوْمَ هُمْ عَلَى النَّارِ يُفْتَنُونَ (13)"));
        alzoriatExes.add(new AlzoriatEx("يوم الجزاء، يوم يُعذَّبون بالإحراق بالنار."));
        alzoriatExes.add(new AlzoriatEx("ذُوقُوا فِتْنَتَكُمْ هَذَا الَّذِي كُنْتُمْ بِهِ تَسْتَعْجِلُونَ (14)"));
        alzoriatExes.add(new AlzoriatEx("ويقال لهم: ذوقوا عذابكم الذي كنتم به تستعجلون في الدنيا."));
        alzoriatExes.add(new AlzoriatEx("إِنَّ الْمُتَّقِينَ فِي جَنَّاتٍ وَعُيُونٍ (15)"));
        alzoriatExes.add(new AlzoriatEx("إن الذين اتقوا الله في جنات عظيمة، وعيون ماء جارية."));
        alzoriatExes.add(new AlzoriatEx("آخِذِينَ مَا آتَاهُمْ رَبُّهُمْ إِنَّهُمْ كَانُوا قَبْلَ ذَلِكَ مُحْسِنِينَ (16)"));
        alzoriatExes.add(new AlzoriatEx("أعطاهم الله جميع مُناهم من أصناف النعيم، فأخذوا ذلك راضين به، فَرِحة به نفوسهم، إنهم كانوا قبل ذلك النعيم محسنين في الدنيا بأعمالهم الصالحة."));
        alzoriatExes.add(new AlzoriatEx("كَانُوا قَلِيلًا مِنَ اللَّيْلِ مَا يَهْجَعُونَ (17)"));
        alzoriatExes.add(new AlzoriatEx("كان هؤلاء المحسنون قليلا من الليل ما ينامون، يُصَلُّون لربهم قانتين له."));
        alzoriatExes.add(new AlzoriatEx("وَبِالْأَسْحَارِ هُمْ يَسْتَغْفِرُونَ (18)"));
        alzoriatExes.add(new AlzoriatEx("وفي أواخر الليل قبيل الفجر يستغفرون الله من ذنوبهم."));
        alzoriatExes.add(new AlzoriatEx("وَفِي أَمْوَالِهِمْ حَقٌّ لِلسَّائِلِ وَالْمَحْرُومِ (19)"));
        alzoriatExes.add(new AlzoriatEx("وفي أموالهم حق واجب ومستحب للمحتاجين الذين يسألون الناس، والذين لا يسألونهم حياء."));
        alzoriatExes.add(new AlzoriatEx("وَفِي الْأَرْضِ آيَاتٌ لِلْمُوقِنِينَ (20)"));
        alzoriatExes.add(new AlzoriatEx("وفي الأرض عبر ودلائل واضحة على قدرة خالقها لأهل اليقين بأن الله هو الإله الحق وحده لا شريك له، والمصدِّقين لرسوله صلى الله عليه وسلم."));
        alzoriatExes.add(new AlzoriatEx("وَفِي أَنْفُسِكُمْ أَفَلَا تُبْصِرُونَ (21)"));
        alzoriatExes.add(new AlzoriatEx("وفي خلق أنفسكم دلائل على قدرة الله تعالى، وعبر تدلكم على وحدانية خالقكم، وأنه لا إله لكم يستحق العبادة سواه، أغَفَلتم عنها، فلا تبصرون ذلك، فتعتبرون به؟"));
        alzoriatExes.add(new AlzoriatEx("وَفِي السَّمَاءِ رِزْقُكُمْ وَمَا تُوعَدُونَ (22)"));
        alzoriatExes.add(new AlzoriatEx("وفي السماء رزقكم وما توعدون من الخير والشر والثواب والعقاب، وغير ذلك كله مكتوب مقدَّر."));
        alzoriatExes.add(new AlzoriatEx("فَوَرَبِّ السَّمَاءِ وَالْأَرْضِ إِنَّهُ لَحَقٌّ مِثْلَ مَا أَنَّكُمْ تَنْطِقُونَ (23)"));
        alzoriatExes.add(new AlzoriatEx("أقسم الله تعالى بنفسه الكريمة أنَّ ما وعدكم به حق، فلا تَشُكُّوا فيه كما لا تَشُكُّون في نطقكم."));
        alzoriatExes.add(new AlzoriatEx("هَلْ أَتَاكَ حَدِيثُ ضَيْفِ إِبْرَاهِيمَ الْمُكْرَمِينَ (24)"));
        alzoriatExes.add(new AlzoriatEx("هل أتاك -أيها الرسول- حديث ضيف إبراهيم الذين أكرمهم -وكانوا من الملائكة الكرام- ."));
        alzoriatExes.add(new AlzoriatEx("إِذْ دَخَلُوا عَلَيْهِ فَقَالُوا سَلَامًا قَالَ سَلَامٌ قَوْمٌ مُنْكَرُونَ (25)"));
        alzoriatExes.add(new AlzoriatEx("حين دخلوا عليه في بيته، فحيَّوه قائلين له: سلامًا، فردَّ عليهم التحية قائلا سلام عليكم، أنتم قوم غرباء لا نعرفكم."));
        alzoriatExes.add(new AlzoriatEx("فَرَاغَ إِلَى أَهْلِهِ فَجَاءَ بِعِجْلٍ سَمِينٍ (26)"));
        alzoriatExes.add(new AlzoriatEx("فعَدَلَ ومال خفية إلى أهله، فعمد إلى عجل سمين فذبحه، وشواه بالنار."));
        alzoriatExes.add(new AlzoriatEx("فَقَرَّبَهُ إِلَيْهِمْ قَالَ أَلَا تَأْكُلُونَ (27)"));
        alzoriatExes.add(new AlzoriatEx("ثم وضعه أمامهم، وتلَّطف في دعوتهم إلى الطعام قائلا ألا تأكلون؟"));
        alzoriatExes.add(new AlzoriatEx("فَأَوْجَسَ مِنْهُمْ خِيفَةً قَالُوا لَا تَخَفْ وَبَشَّرُوهُ بِغُلَامٍ عَلِيمٍ (28)"));
        alzoriatExes.add(new AlzoriatEx("فلما رآهم لا يأكلون أحسَّ في نفسه خوفًا منهم، قالوا له: لا تَخَفْ إنا رسل الله، وبشروه بأن زوجته «سَارَةَ» ستلد له ولدًا، سيكون من أهل العلم بالله وبدينه، وهو إسحاق عليه السلام."));
        alzoriatExes.add(new AlzoriatEx("فَأَقْبَلَتِ امْرَأَتُهُ فِي صَرَّةٍ فَصَكَّتْ وَجْهَهَا وَقَالَتْ عَجُوزٌ عَقِيمٌ (29)"));
        alzoriatExes.add(new AlzoriatEx("فلما سمعت زوجة إبراهيم مقالة هؤلاء الملائكة بالبشارة أقبلت نحوهم في صيحة، فلطمت وجهها تعجبًا من هذا الأمر، وقالت: كيف ألد وأنا عجوز عقيم لا ألد؟"));
        alzoriatExes.add(new AlzoriatEx("قَالُوا كَذَلِكِ قَالَ رَبُّكِ إِنَّهُ هُوَ الْحَكِيمُ الْعَلِيمُ (30)"));
        alzoriatExes.add(new AlzoriatEx("قالت لها ملائكة الله: هكذا قال ربك كما أخبرناك، وهو القادر على ذلك، فلا عجب من قدرته. إنه سبحانه وتعالى هو الحكيم الذي يضع الأشياء مواضعها، العليم بمصالح عباده."));
        alzoriatExes.add(new AlzoriatEx("قَالَ فَمَا خَطْبُكُمْ أَيُّهَا الْمُرْسَلُونَ (31)"));
        alzoriatExes.add(new AlzoriatEx("قال إبراهيم عليه السلام، لملائكة الله: ما شأنكم وفيم أُرسلتم؟"));
        alzoriatExes.add(new AlzoriatEx("قَالُوا إِنَّا أُرْسِلْنَا إِلَى قَوْمٍ مُجْرِمِينَ (32)"));
        alzoriatExes.add(new AlzoriatEx("قالوا: إن الله أرسلنا إلى قوم قد أجرموا لكفرهم بالله."));
        alzoriatExes.add(new AlzoriatEx("لِنُرْسِلَ عَلَيْهِمْ حِجَارَةً مِنْ طِينٍ (33)"));
        alzoriatExes.add(new AlzoriatEx("لنهلكهم بحجارة من طين متحجِّر."));
        alzoriatExes.add(new AlzoriatEx("مُسَوَّمَةً عِنْدَ رَبِّكَ لِلْمُسْرِفِينَ (34)"));
        alzoriatExes.add(new AlzoriatEx("معلَّمة عند ربك لهؤلاء المتجاوزين الحدَّ في الفجور والعصيان."));
        alzoriatExes.add(new AlzoriatEx("فَأَخْرَجْنَا مَنْ كَانَ فِيهَا مِنَ الْمُؤْمِنِينَ (35)"));
        alzoriatExes.add(new AlzoriatEx("فأخرجنا مَن كان في قرية قوم لوط من أهل الإيمان."));
        alzoriatExes.add(new AlzoriatEx("فَمَا وَجَدْنَا فِيهَا غَيْرَ بَيْتٍ مِنَ الْمُسْلِمِينَ (36)"));
        alzoriatExes.add(new AlzoriatEx("فما وجدنا في تلك القرية غير بيت من المسلمين، وهو بيت لوط عليه السلام."));
        alzoriatExes.add(new AlzoriatEx("وَتَرَكْنَا فِيهَا آيَةً لِلَّذِينَ يَخَافُونَ الْعَذَابَ الْأَلِيمَ (37)"));
        alzoriatExes.add(new AlzoriatEx("وتركنا في القرية المذكورة أثرًا من العذاب باقيًا علامة على قدرة الله تعالى وانتقامه من الكفرة، وذلك عبرة لمن يخافون عذاب الله المؤلم الموجع."));
        alzoriatExes.add(new AlzoriatEx("وَفِي مُوسَى إِذْ أَرْسَلْنَاهُ إِلَى فِرْعَوْنَ بِسُلْطَانٍ مُبِينٍ (38)"));
        alzoriatExes.add(new AlzoriatEx("وفي إرسالنا موسى إلى فرعون وملئه بالآيات والمعجزات الظاهرة آية للذين يخافون العذاب الأليم."));
        alzoriatExes.add(new AlzoriatEx("فَتَوَلَّى بِرُكْنِهِ وَقَالَ سَاحِرٌ أَوْ مَجْنُونٌ (39)"));
        alzoriatExes.add(new AlzoriatEx("فأعْرَضَ فرعون مغترًّا بقوته وجانبه، وقال عن موسى: إنه ساحر أو مجنون."));
        alzoriatExes.add(new AlzoriatEx("فَأَخَذْنَاهُ وَجُنُودَهُ فَنَبَذْنَاهُمْ فِي الْيَمِّ وَهُوَ مُلِيمٌ (40)"));
        alzoriatExes.add(new AlzoriatEx("فأخذنا فرعون وجنوده، فطرحناهم في البحر، وهو آتٍ ما يلام عليه; بسبب كفره وجحوده وفجوره."));
        alzoriatExes.add(new AlzoriatEx("وَفِي عَادٍ إِذْ أَرْسَلْنَا عَلَيْهِمُ الرِّيحَ الْعَقِيمَ (41)"));
        alzoriatExes.add(new AlzoriatEx("وفي شأن عاد وإهلاكهم آيات وعبر لمن تأمل، إذ أرسلنا عليهم الريح التي لا بركة فيها ولا تأتي بخير."));
        alzoriatExes.add(new AlzoriatEx("مَا تَذَرُ مِنْ شَيْءٍ أَتَتْ عَلَيْهِ إِلَّا جَعَلَتْهُ كَالرَّمِيمِ (42)"));
        alzoriatExes.add(new AlzoriatEx("ما تَدَعُ شيئًا مرَّت عليه إلا صيَّرته كالشيء البالي."));
        alzoriatExes.add(new AlzoriatEx("وَفِي ثَمُودَ إِذْ قِيلَ لَهُمْ تَمَتَّعُوا حَتَّى حِينٍ (43)"));
        alzoriatExes.add(new AlzoriatEx("وفي شأن ثمود وإهلاكهم آيات وعبر، إذ قيل لهم -والقائل نبيهم صالح عليه السلام-: تمتعوا في داركم ثلاثة أيام حتى تنتهي آجالكم."));
        alzoriatExes.add(new AlzoriatEx("فَعَتَوْا عَنْ أَمْرِ رَبِّهِمْ فَأَخَذَتْهُمُ الصَّاعِقَةُ وَهُمْ يَنْظُرُونَ (44)"));
        alzoriatExes.add(new AlzoriatEx("فعصوا أمر ربهم، فأخذتهم صاعقة العذاب، وهم ينظرون إلى عقوبتهم بأعينهم."));
        alzoriatExes.add(new AlzoriatEx("فَمَا اسْتَطَاعُوا مِنْ قِيَامٍ وَمَا كَانُوا مُنْتَصِرِينَ (45)"));
        alzoriatExes.add(new AlzoriatEx("فما أمكنهم الهرب ولا النهوض مما هم فيه من العذاب، وما كانوا منتصرين لأنفسهم."));
        alzoriatExes.add(new AlzoriatEx("وَقَوْمَ نُوحٍ مِنْ قَبْلُ إِنَّهُمْ كَانُوا قَوْمًا فَاسِقِينَ (46)"));
        alzoriatExes.add(new AlzoriatEx("وأهلكنا قوم نوح من قبل هؤلاء، إنهم كانوا قومًا مخالفين لأمر الله، خارجين عن طاعته."));
        alzoriatExes.add(new AlzoriatEx("وَالسَّمَاءَ بَنَيْنَاهَا بِأَيْدٍ وَإِنَّا لَمُوسِعُونَ (47)"));
        alzoriatExes.add(new AlzoriatEx("والسماء خلقناها وأتقناها، وجعلناها سَقْفًا للأرض بقوة وقدرة عظيمة، وإنا لموسعون لأرجائها وأنحائها."));
        alzoriatExes.add(new AlzoriatEx("وَالْأَرْضَ فَرَشْنَاهَا فَنِعْمَ الْمَاهِدُونَ (48)"));
        alzoriatExes.add(new AlzoriatEx("والأرض جعناها فراشًا للخلق للاستقرار عليها، فنعم الماهدون نحن."));
        alzoriatExes.add(new AlzoriatEx("وَمِنْ كُلِّ شَيْءٍ خَلَقْنَا زَوْجَيْنِ لَعَلَّكُمْ تَذَكَّرُونَ (49)"));
        alzoriatExes.add(new AlzoriatEx("ومن كل شيء من أجناس الموجودات خلقنا نوعين مختلفين; لكي تتذكروا قدرة الله، وتعتبروا."));
        alzoriatExes.add(new AlzoriatEx("فَفِرُّوا إِلَى اللَّهِ إِنِّي لَكُمْ مِنْهُ نَذِيرٌ مُبِينٌ (50)"));
        alzoriatExes.add(new AlzoriatEx("ففروا -أيها الناس- من عقاب الله إلى رحمته بالإيمان به وبرسوله، واتباع أمره والعمل بطاعته، إني لكم نذير بيِّن الإنذار. وكان رسول الله صلى الله عليه وسلم إذا حزبه أمر، فزع إلى الصلاة، وهذا فرار إلى الله."));
        alzoriatExes.add(new AlzoriatEx("وَلَا تَجْعَلُوا مَعَ اللَّهِ إِلَهًا آخَرَ إِنِّي لَكُمْ مِنْهُ نَذِيرٌ مُبِينٌ (51)"));
        alzoriatExes.add(new AlzoriatEx("ولا تجعلوا مع الله معبودًا آخر، إني لكم من الله نذير بيِّن الإنذار."));
        alzoriatExes.add(new AlzoriatEx("كَذَلِكَ مَا أَتَى الَّذِينَ مِنْ قَبْلِهِمْ مِنْ رَسُولٍ إِلَّا قَالُوا سَاحِرٌ أَوْ مَجْنُونٌ (52)"));
        alzoriatExes.add(new AlzoriatEx("كما كذبت قريش نبيَّها محمدًا صلى الله عليه وسلم، وقالوا: هو شاعر أو ساحر أو مجنون، فعلت الأمم المكذبة رسلها من قبل قريش، فأحلَّ الله بهم نقمته."));
        alzoriatExes.add(new AlzoriatEx("أَتَوَاصَوْا بِهِ بَلْ هُمْ قَوْمٌ طَاغُونَ (53)"));
        alzoriatExes.add(new AlzoriatEx("أتواصى الأولون والآخرون بالتكذيب بالرسول حين قالوا ذلك جميعًا؟ بل هم قوم طغاة تشابهت قلوبهم وأعمالهم بالكفر والطغيان، فقال متأخروهم ذلك، كما قاله متقدموهم."));
        alzoriatExes.add(new AlzoriatEx("فَتَوَلَّ عَنْهُمْ فَمَا أَنْتَ بِمَلُومٍ (54)"));
        alzoriatExes.add(new AlzoriatEx("فأعرضْ -أيها الرسول- عن المشركين حتى يأتيك فيهم أمر الله، فما أنت بملوم من أحد، فقد بلَّغت ما أُرسلت به."));
        alzoriatExes.add(new AlzoriatEx("وَذَكِّرْ فَإِنَّ الذِّكْرَى تَنْفَعُ الْمُؤْمِنِينَ (55)"));
        alzoriatExes.add(new AlzoriatEx("ومع إعراضك -أيها الرسول- عنهم، وعدم الالتفات إلى تخذيلهم، داوم على الدعوة إلى الله، وعلى وعظ من أُرسلتَ إليهم; فإن التذكير والموعظة ينتفع بهما أهل القلوب المؤمنة، وفيهما إقامة الحجة على المعرضين."));
        alzoriatExes.add(new AlzoriatEx("وَمَا خَلَقْتُ الْجِنَّ وَالْإِنْسَ إِلَّا لِيَعْبُدُونِ (56)"));
        alzoriatExes.add(new AlzoriatEx("وما خلقت الجن والإنس وبعثت جميع الرسل إلا لغاية سامية، هي عبادتي وحدي دون مَن سواي."));
        alzoriatExes.add(new AlzoriatEx("مَا أُرِيدُ مِنْهُمْ مِنْ رِزْقٍ وَمَا أُرِيدُ أَنْ يُطْعِمُونِ (57)"));
        alzoriatExes.add(new AlzoriatEx("ما أريد منهم من رزق وما أريد أن يطعمون، فأنا الرزاق المعطي. فهو سبحانه غير محتاج إلى الخلق، بل هم الفقراء إليه في جميع أحوالهم، فهو خالقهم ورازقهم والغني عنهم."));
        alzoriatExes.add(new AlzoriatEx("إِنَّ اللَّهَ هُوَ الرَّزَّاقُ ذُو الْقُوَّةِ الْمَتِينُ (58)"));
        alzoriatExes.add(new AlzoriatEx("إن الله وحده هو الرزاق لخلقه، المتكفل بأقواتهم، ذو القوة المتين، لا يُقْهَر ولا يغالَب، فله القدرة والقوة كلها."));
        alzoriatExes.add(new AlzoriatEx("فَإِنَّ لِلَّذِينَ ظَلَمُوا ذَنُوبًا مِثْلَ ذَنُوبِ أَصْحَابِهِمْ فَلَا يَسْتَعْجِلُونِ (59)"));
        alzoriatExes.add(new AlzoriatEx("فإن للذين ظلموا بتكذيبهم الرسول محمدًا صلى الله عليه وسلم نصيبًا من عذاب الله نازلا بهم مثل نصيب أصحابهم الذين مضَوْا من قبلهم، فلا يستعجلون بالعذاب، فهو آتيهم لا محالة."));
        alzoriatExes.add(new AlzoriatEx("فَوَيْلٌ لِلَّذِينَ كَفَرُوا مِنْ يَوْمِهِمُ الَّذِي يُوعَدُونَ (60)"));
        alzoriatExes.add(new AlzoriatEx("فهلاك وشقاء للذين كفروا بالله ورسوله من يومهم الذي يوعدون فيه بنزول العذاب بهم، وهو يوم القيامة."));



        quran_explanation_51_adapter = new quran_explanation_51_adapter(alzoriatExes ,QuranExplanation_51Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_51);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_51Activity.this));
        recyclerView.setAdapter(quran_explanation_51_adapter);


    }

}