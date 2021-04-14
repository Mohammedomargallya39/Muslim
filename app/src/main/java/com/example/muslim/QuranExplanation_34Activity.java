package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_34Activity extends AppCompatActivity {

    ArrayList<SabaaEx> sabaaExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_34_adapter quran_explanation_34_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_34);

        sabaaExes.add(new SabaaEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        sabaaExes.add(new SabaaEx("الْحَمْدُ لِلَّهِ الَّذِي لَهُ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ وَلَهُ الْحَمْدُ فِي الْآخِرَةِ وَهُوَ الْحَكِيمُ الْخَبِيرُ (1)"));
        sabaaExes.add(new SabaaEx("الثناء على الله بصفاته التي كلُّها أوصاف كمال، وبنعمه الظاهرة والباطنة، الدينية والدنيوية، الذي له ملك ما في السموات وما في الأرض، وله الثناء التام في الآخرة، وهو الحكيم في فعله، الخبير بشؤون خلقه."));
        sabaaExes.add(new SabaaEx("يَعْلَمُ مَا يَلِجُ فِي الْأَرْضِ وَمَا يَخْرُجُ مِنْهَا وَمَا يَنْزِلُ مِنَ السَّمَاءِ وَمَا يَعْرُجُ فِيهَا وَهُوَ الرَّحِيمُ الْغَفُورُ (2)"));
        sabaaExes.add(new SabaaEx("يعلم كل ما يدخل في الأرض من قطرات الماء، وما يخرج منها من النبات والمعادن والمياه، وما ينزل من السماء من الأمطار والملائكة والكتب، وما يصعد إليها من الملائكة وأفعال الخلق. وهو الرحيم بعباده فلا يعاجل عصاتهم بالعقوبة، الغفور لذنوب التائبين إليه المتوكلين عليه."));
        sabaaExes.add(new SabaaEx("وَقَالَ الَّذِينَ كَفَرُوا لَا تَأْتِينَا السَّاعَةُ قُلْ بَلَى وَرَبِّي لَتَأْتِيَنَّكُمْ عَالِمِ الْغَيْبِ لَا يَعْزُبُ عَنْهُ مِثْقَالُ ذَرَّةٍ فِي السَّمَاوَاتِ وَلَا فِي الْأَرْضِ وَلَا أَصْغَرُ مِنْ ذَلِكَ وَلَا أَكْبَرُ إِلَّا فِي كِتَابٍ مُبِينٍ (3)"));
        sabaaExes.add(new SabaaEx("وقال الكافرون المنكرون للبعث: لا تأتينا القيامة، قل لهم -أيها الرسول-: بلى وربي لتأتينَّكم، ولكن لا يعلم وقت مجيئها أحد سوى الله علام الغيوب، الذي لا يغيب عنه وزن نملة صغيرة في السموات والأرض، ولا أصغر من ذلك ولا أكبر إلا هو مسطور في كتاب واضح، وهو اللوح المحفوظ."));
        sabaaExes.add(new SabaaEx("لِيَجْزِيَ الَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ أُولَئِكَ لَهُمْ مَغْفِرَةٌ وَرِزْقٌ كَرِيمٌ (4)"));
        sabaaExes.add(new SabaaEx("ليثيب الذين صدَّقوا بالله، واتَّبَعوا رسوله، وعملوا الصالحات. أولئك لهم مغفرة لذنوبهم ورزق كريم، وهو الجنة."));
        sabaaExes.add(new SabaaEx("وَالَّذِينَ سَعَوْا فِي آيَاتِنَا مُعَاجِزِينَ أُولَئِكَ لَهُمْ عَذَابٌ مِنْ رِجْزٍ أَلِيمٌ (5)"));
        sabaaExes.add(new SabaaEx("والذين سعوا في الصدِّ عن سبيل الله وتكذيب رسله وإبطال آياتنا مشاقين الله مغالبين أمره، أولئك لهم أسوأ العذاب وأشده ألمًا."));
        sabaaExes.add(new SabaaEx("وَيَرَى الَّذِينَ أُوتُوا الْعِلْمَ الَّذِي أُنْزِلَ إِلَيْكَ مِنْ رَبِّكَ هُوَ الْحَقَّ وَيَهْدِي إِلَى صِرَاطِ الْعَزِيزِ الْحَمِيدِ (6)"));
        sabaaExes.add(new SabaaEx("ويعلم الذين أُعطوا العلم أن القرآن الذي أُنزل إليك من ربك هو الحق، ويرشد إلى طريق الله، العزيز الذي لا يغالَب ولا يمانع، بل قهر كل شيء وغلبه، المحمود في أقواله وأفعاله وشرعه."));
        sabaaExes.add(new SabaaEx("وَقَالَ الَّذِينَ كَفَرُوا هَلْ نَدُلُّكُمْ عَلَى رَجُلٍ يُنَبِّئُكُمْ إِذَا مُزِّقْتُمْ كُلَّ مُمَزَّقٍ إِنَّكُمْ لَفِي خَلْقٍ جَدِيدٍ (7)"));
        sabaaExes.add(new SabaaEx("وقال الذين كفروا بعضهم لبعض استهزاء: هل ندلكم على رجل (يريدون محمدًا صلى الله عليه وسلم) يخبركم أنكم إذا متم وتفرقت أجسامكم كل تفرُّق، إنكم ستُحيون وتُبعثون من قبوركم؟ قالوا ذلك مِن فرط إنكارهم."));
        sabaaExes.add(new SabaaEx("أَفْتَرَى عَلَى اللَّهِ كَذِبًا أَمْ بِهِ جِنَّةٌ بَلِ الَّذِينَ لَا يُؤْمِنُونَ بِالْآخِرَةِ فِي الْعَذَابِ وَالضَّلَالِ الْبَعِيدِ (8)"));
        sabaaExes.add(new SabaaEx("هذا الرجل أختلق على الله كذبًا أم به جنون، فهو يتكلم بما لا يدري؟ ليس الأمر كما قال الكفار، بل محمد أصدق الصادقين. والذين لا يصدقون بالبعث ولا يعملون من أجله في العذاب الدائم في الآخرة، والضلال البعيد عن الصواب في الدنيا."));
        sabaaExes.add(new SabaaEx("أَفَلَمْ يَرَوْا إِلَى مَا بَيْنَ أَيْدِيهِمْ وَمَا خَلْفَهُمْ مِنَ السَّمَاءِ وَالْأَرْضِ إِنْ نَشَأْ نَخْسِفْ بِهِمُ الْأَرْضَ أَوْ نُسْقِطْ عَلَيْهِمْ كِسَفًا مِنَ السَّمَاءِ إِنَّ فِي ذَلِكَ لَآيَةً لِكُلِّ عَبْدٍ مُنِيبٍ (9)"));
        sabaaExes.add(new SabaaEx("أفلم ير هؤلاء الكفار الذين لا يؤمنون بالآخرة عظيم قدرة الله فيما بين أيديهم وما خلفهم من السماء والأرض مما يبهر العقول، وأنهما قد أحاطتا بهم؟ إن نشأ نخسف بهم الأرض، كما فعلنا بقارون، أو ننزل عليهم قطعًا من العذاب، كما فعلنا بقوم شعيب، فقد أمطرت السماء عليهم نارًا فأحرقتهم. إن في ذلك الذي ذكرنا من قدرتنا لَدلالة ظاهرة لكل عبد راجع إلى ربه بالتوبة، ومقر له بتوحيده، ومخلص له في العبادة."));
        sabaaExes.add(new SabaaEx("وَلَقَدْ آتَيْنَا دَاوُودَ مِنَّا فَضْلًا يَاجِبَالُ أَوِّبِي مَعَهُ وَالطَّيْرَ وَأَلَنَّا لَهُ الْحَدِيدَ (10)"));
        sabaaExes.add(new SabaaEx("ولقد آتينا داود نبوة، وكتابًا وعلمًا، وقلنا للجبال والطير: سبِّحي معه، وألنَّا له الحديد، فكان كالعجين يتصرف فيه كيف يشاء."));
        sabaaExes.add(new SabaaEx("أَنِ اعْمَلْ سَابِغَاتٍ وَقَدِّرْ فِي السَّرْدِ وَاعْمَلُوا صَالِحًا إِنِّي بِمَا تَعْمَلُونَ بَصِيرٌ (11)"));
        sabaaExes.add(new SabaaEx("أن اعمل دروعًا تامات واسعات وقدِّر المسامير في حِلَق الدروع، فلا تعمل الحلقة صغيرة فتَضْعُف، فلا تقوى الدروع على الدفاع، ولا تجعلها كبيرة فتثقُل على لابسها، واعمل يا داود أنت وأهلك بطاعة الله، إني بما تعملون بصير لا يخفى عليَّ شيء منها."));
        sabaaExes.add(new SabaaEx("وَلِسُلَيْمَانَ الرِّيحَ غُدُوُّهَا شَهْرٌ وَرَوَاحُهَا شَهْرٌ وَأَسَلْنَا لَهُ عَيْنَ الْقِطْرِ وَمِنَ الْجِنِّ مَنْ يَعْمَلُ بَيْنَ يَدَيْهِ بِإِذْنِ رَبِّهِ وَمَنْ يَزِغْ مِنْهُمْ عَنْ أَمْرِنَا نُذِقْهُ مِنْ عَذَابِ السَّعِيرِ (12)"));
        sabaaExes.add(new SabaaEx("وسخَّرنا لسليمان الريح تجري من أول النهار إلى انتصافه مسيرة شهر، ومن منتصف النهار إلى الليل مسيرة شهر بالسير المعتاد، وأسلنا له النحاس كما يسيل الماء، يعمل به ما يشاء، وسخَّرنا له من الجن من يعمل بين يديه بإذن ربه، ومن يعدل منهم عن أمرنا الذي أمرناه به من طاعة سليمان نذقه من عذاب النار المستعرة."));
        sabaaExes.add(new SabaaEx("يَعْمَلُونَ لَهُ مَا يَشَاءُ مِنْ مَحَارِيبَ وَتَمَاثِيلَ وَجِفَانٍ كَالْجَوَابِ وَقُدُورٍ رَاسِيَاتٍ اعْمَلُوا آلَ دَاوُودَ شُكْرًا وَقَلِيلٌ مِنْ عِبَادِيَ الشَّكُورُ (13)"));
        sabaaExes.add(new SabaaEx("يعمل الجن لسليمان ما يشاء من مساجد للعبادة، وصور من نحاس وزجاج، وقِصَاع كبيرة كالأحواض التي يجتمع فيها الماء، وقدور ثابتات لا تتحرك من أماكنها لعظمهن، وقلنا يا آل داود: اعملوا شكرًا لله على ما أعطاكم، وذلك بطاعته وامتثال أمره، وقليل من عبادي من يشكر الله كثيرًا، وكان داود وآله من القليل."));
        sabaaExes.add(new SabaaEx("فَلَمَّا قَضَيْنَا عَلَيْهِ الْمَوْتَ مَا دَلَّهُمْ عَلَى مَوْتِهِ إِلَّا دَابَّةُ الْأَرْضِ تَأْكُلُ مِنْسَأَتَهُ فَلَمَّا خَرَّ تَبَيَّنَتِ الْجِنُّ أَنْ لَوْ كَانُوا يَعْلَمُونَ الْغَيْبَ مَا لَبِثُوا فِي الْعَذَابِ الْمُهِينِ (14)"));
        sabaaExes.add(new SabaaEx("فلما قضينا على سليمان بالموت ما دلَّ الجن على موته إلا الأرَضَةُ تأكل عصاه التي كان متكئًا عليها، فوقع سليمان على الأرض، عند ذلك علمت الجن أنهم لو كانوا يعلمون الغيب ما أقاموا في العذاب المذلِّ والعمل الشاق لسليمان؛ ظنا منهم أنه من الأحياء. وفي الآية إبطال لاعتقاد بعض الناس أن الجن يعلمون الغيب; إذ لو كانوا يعلمون الغيب لعلموا وفاة سليمان عليه السلام، ولما أقاموا في العذاب المهين."));
        sabaaExes.add(new SabaaEx("لَقَدْ كَانَ لِسَبَإٍ فِي مَسْكَنِهِمْ آيَةٌ جَنَّتَانِ عَنْ يَمِينٍ وَشِمَالٍ كُلُوا مِنْ رِزْقِ رَبِّكُمْ وَاشْكُرُوا لَهُ بَلْدَةٌ طَيِّبَةٌ وَرَبٌّ غَفُورٌ (15)"));
        sabaaExes.add(new SabaaEx("لقد كان لقبيلة سبأ بـ «اليمن» في مسكنهم دلالة على قدرتنا: بستانان عن يمين وشمال، كلوا من رزق ربكم، واشكروا له نعمه عليكم; فإن بلدتكم كريمة التربة حسنة الهواء، وربكم غفور لكم."));
        sabaaExes.add(new SabaaEx("فَأَعْرَضُوا فَأَرْسَلْنَا عَلَيْهِمْ سَيْلَ الْعَرِمِ وَبَدَّلْنَاهُمْ بِجَنَّتَيْهِمْ جَنَّتَيْنِ ذَوَاتَيْ أُكُلٍ خَمْطٍ وَأَثْلٍ وَشَيْءٍ مِنْ سِدْرٍ قَلِيلٍ (16)"));
        sabaaExes.add(new SabaaEx("فأعرضوا عن أمر الله وشكره وكذبوا الرسل، فأرسلنا عليهم السيل الجارف الشديد الذي خرَّب السد وأغرق البساتين، وبدَّلناهم بجنتيهم المثمرتين جنتين ذواتَيْ أكل خمط، وهو الثمر المر الكريه الطعم، وأثْل وهو شجر شبيه بالطَّرْفاء لا ثمر له، وقليل من شجر النَّبْق كثير الشوك."));
        sabaaExes.add(new SabaaEx("ذَلِكَ جَزَيْنَاهُمْ بِمَا كَفَرُوا وَهَلْ نُجَازِي إِلَّا الْكَفُورَ (17)"));
        sabaaExes.add(new SabaaEx("ذلك التبديل من خير إلى شر بسبب كفرهم، وعدم شكرهم نِعَمَ الله، وما نعاقب بهذا العقاب الشديد إلا الجَحود المبالغ في الكفر، يجازى بفعله مثلا بمثل."));
        sabaaExes.add(new SabaaEx("وَجَعَلْنَا بَيْنَهُمْ وَبَيْنَ الْقُرَى الَّتِي بَارَكْنَا فِيهَا قُرًى ظَاهِرَةً وَقَدَّرْنَا فِيهَا السَّيْرَ سِيرُوا فِيهَا لَيَالِيَ وَأَيَّامًا آمِنِينَ (18)"));
        sabaaExes.add(new SabaaEx("وجعلنا بين أهل «سبأ» -وهم «باليمن» - والقرى التي باركنا فيها -وهي «الشام» - مُدنًا متصلة يُرى بعضها من بعض، وجعلنا السير فيها سيرًا مقدَّرًا من منزل إلى منزل لا مشقة فيه، وقلنا لهم: سيروا في تلك القرى في أيِّ وقت شئتم من ليل أو نهار، آمنين لا تخافون عدوًّا، ولا جوعًا ولا عطشًا."));
        sabaaExes.add(new SabaaEx("فَقَالُوا رَبَّنَا بَاعِدْ بَيْنَ أَسْفَارِنَا وَظَلَمُوا أَنْفُسَهُمْ فَجَعَلْنَاهُمْ أَحَادِيثَ وَمَزَّقْنَاهُمْ كُلَّ مُمَزَّقٍ إِنَّ فِي ذَلِكَ لَآيَاتٍ لِكُلِّ صَبَّارٍ شَكُورٍ (19)"));
        sabaaExes.add(new SabaaEx("فبطغيانهم ملُّوا الراحة والأمن ورغد العيش، وقالوا: ربنا اجعل قُرانا متباعدة; ليبعد سفرنا بينها، فلا نجد قرى عامرة في طريقنا، وظلموا أنفسهم بكفرهم فأهلكناهم، وجعلناهم عبرًا وأحاديث لمن يأتي بعدهم، وفَرَّقناهم كل تفريق وخربت بلادهم، إن فيما حل «بسبأ» لَعبرة لكل صبَّار على المكاره والشدائد، شكور لنعم الله تعالى."));
        sabaaExes.add(new SabaaEx("وَلَقَدْ صَدَّقَ عَلَيْهِمْ إِبْلِيسُ ظَنَّهُ فَاتَّبَعُوهُ إِلَّا فَرِيقًا مِنَ الْمُؤْمِنِينَ (20)"));
        sabaaExes.add(new SabaaEx("ولقد ظن إبليس ظنًا غير يقين أنه سيضل بني آدم، وأنهم سيطيعونه في معصية الله، فصدَّق ظنه عليهم، فأطاعوه وعصوا ربهم إلا فريقًا من المؤمنين بالله، فإنهم ثبتوا على طاعة الله."));
        sabaaExes.add(new SabaaEx("وَمَا كَانَ لَهُ عَلَيْهِمْ مِنْ سُلْطَانٍ إِلَّا لِنَعْلَمَ مَنْ يُؤْمِنُ بِالْآخِرَةِ مِمَّنْ هُوَ مِنْهَا فِي شَكٍّ وَرَبُّكَ عَلَى كُلِّ شَيْءٍ حَفِيظٌ (21)"));
        sabaaExes.add(new SabaaEx("وما كان لإبليس على هؤلاء الكفار مِن قهر على الكفر، ولكن حكمة الله اقتضت تسويله لبني آدم; ليظهر ما علمه سبحانه في الأزل؛ لنميز مَن يصدِّق بالبعث والثواب والعقاب ممن هو في شك من ذلك. وربك على كل شيء حفيظ، يحفظه ويجازي عليه."));
        sabaaExes.add(new SabaaEx("قُلِ ادْعُوا الَّذِينَ زَعَمْتُمْ مِنْ دُونِ اللَّهِ لَا يَمْلِكُونَ مِثْقَالَ ذَرَّةٍ فِي السَّمَاوَاتِ وَلَا فِي الْأَرْضِ وَمَا لَهُمْ فِيهِمَا مِنْ شِرْكٍ وَمَا لَهُ مِنْهُمْ مِنْ ظَهِيرٍ (22)"));
        sabaaExes.add(new SabaaEx("قل -أيها الرسول- للمشركين: ادعوا الذين زعمتموهم شركاء لله فعبدتموهم من دونه من الأصنام والملائكة والبشر، واقصدوهم في حوائجكم، فإنهم لن يجيبوكم، فهم لا يملكون وزن نملة صغيرة في السموات ولا في الأرض، وليس لهم شِرْكة فيهما، وليس لله من هؤلاء المشركين معين على خلق شيء، بل الله -سبحانه وتعالى- هو المتفرد بالإيجاد، فهو الذي يُعْبَدُ وحده، ولا يستحق العبادة أحد سواه."));
        sabaaExes.add(new SabaaEx("وَلَا تَنْفَعُ الشَّفَاعَةُ عِنْدَهُ إِلَّا لِمَنْ أَذِنَ لَهُ حَتَّى إِذَا فُزِّعَ عَنْ قُلُوبِهِمْ قَالُوا مَاذَا قَالَ رَبُّكُمْ قَالُوا الْحَقَّ وَهُوَ الْعَلِيُّ الْكَبِيرُ (23)"));
        sabaaExes.add(new SabaaEx("ولا تنفع شفاعة الشافع عند الله تعالى إلا لمن أذن له. ومن عظمته وجلاله عز وجل أنه إذا تكلم سبحانه بالوحي فسمع أهل السماوات كلامه أُرعدوا من الهيبة، حتى يلحقهم مثل الغشي، فإذا زال الفزع عن قلوبهم سأل بعضهم بعضًا: ماذا قال ربكم؟ قالت الملائكة: قال الحق، وهو العليُّ بذاته وقهره وعلوِّ قدْره، الكبير على كل شيء."));
        sabaaExes.add(new SabaaEx("قُلْ مَنْ يَرْزُقُكُمْ مِنَ السَّمَاوَاتِ وَالْأَرْضِ قُلِ اللَّهُ وَإِنَّا أَوْ إِيَّاكُمْ لَعَلَى هُدًى أَوْ فِي ضَلَالٍ مُبِينٍ (24)"));
        sabaaExes.add(new SabaaEx("قل -أيها الرسول- للمشركين: مَن يرزقكم من السماوات بالمطر، ومن الأرض بالنبات والمعادن وغير ذلك؟ فإنهم لا بدَّ أن يُقِرُّوا بأنه الله، وإن لم يُقِرُّوا بذلك فقل لهم: الله هو الرزاق، وإنَّ أحد الفريقين منا ومنكم لعلى هدى متمكن منه، أو في ضلال بيِّن منغمس فيه."));
        sabaaExes.add(new SabaaEx("قُلْ لَا تُسْأَلُونَ عَمَّا أَجْرَمْنَا وَلَا نُسْأَلُ عَمَّا تَعْمَلُونَ (25)"));
        sabaaExes.add(new SabaaEx("قل: لا تُسألون عن ذنوبنا، ولا نُسأل عن أعمالكم; لأننا بريئون منكم ومِن كفركم."));
        sabaaExes.add(new SabaaEx("قُلْ يَجْمَعُ بَيْنَنَا رَبُّنَا ثُمَّ يَفْتَحُ بَيْنَنَا بِالْحَقِّ وَهُوَ الْفَتَّاحُ الْعَلِيمُ (26)"));
        sabaaExes.add(new SabaaEx("قل: ربنا يجمع بيننا وبينكم يوم القيامة، ثم يقضي بيننا بالعدل، وهو الفتَّاح الحاكم بين خلقه، العليم بما ينبغي أن يُقْضى به، وبأحوال خلقه، لا تخفى عليه خافية."));
        sabaaExes.add(new SabaaEx("قُلْ أَرُونِيَ الَّذِينَ أَلْحَقْتُمْ بِهِ شُرَكَاءَ كَلَّا بَلْ هُوَ اللَّهُ الْعَزِيزُ الْحَكِيمُ (27)"));
        sabaaExes.add(new SabaaEx("قل: أروني بالحجة والدليل الذين ألحقتموهم بالله وجعلتموهم شركاء له في العبادة، هل خلقوا شيئًا؟ ليس الأمر كما وصفوا، بل هو المعبود بحق الذي لا شريك له، العزيز في انتقامه ممن أشرك به، الحكيم في أقواله وأفعاله وتدبير أمور خلقه."));
        sabaaExes.add(new SabaaEx("وَمَا أَرْسَلْنَاكَ إِلَّا كَافَّةً لِلنَّاسِ بَشِيرًا وَنَذِيرًا وَلَكِنَّ أَكْثَرَ النَّاسِ لَا يَعْلَمُونَ (28)"));
        sabaaExes.add(new SabaaEx("وما أرسلناك -أيها الرسول- إلا للناس أجمعين مبشرًا بثواب الله، ومنذرًا عقابه، ولكن أكثر الناس لا يعلمون الحق، فهم معرضون عنه."));
        sabaaExes.add(new SabaaEx("وَيَقُولُونَ مَتَى هَذَا الْوَعْدُ إِنْ كُنْتُمْ صَادِقِينَ (29)"));
        sabaaExes.add(new SabaaEx("ويقول هؤلاء المشركون مستهزئين: متى هذا الوعد الذي تَعِدوننا أن يجمعنا الله فيه، ثم يقضي بيننا، إن كنتم صادقين فيما تعدوننا به؟"));
        sabaaExes.add(new SabaaEx("قُلْ لَكُمْ مِيعَادُ يَوْمٍ لَا تَسْتَأْخِرُونَ عَنْهُ سَاعَةً وَلَا تَسْتَقْدِمُونَ (30)"));
        sabaaExes.add(new SabaaEx("قل لهم -أيها الرسول-: لكم ميعاد هو آتيكم لا محالة، وهو ميعاد يوم القيامة، لا تستأخرون عنه ساعة للتوبة، ولا تستقدمون ساعةً قبله للعذاب. فاحذروا ذلك اليوم، وأَعِدُّوا له عدته."));
        sabaaExes.add(new SabaaEx("وَقَالَ الَّذِينَ كَفَرُوا لَنْ نُؤْمِنَ بِهَذَا الْقُرْآنِ وَلَا بِالَّذِي بَيْنَ يَدَيْهِ وَلَوْ تَرَى إِذِ الظَّالِمُونَ مَوْقُوفُونَ عِنْدَ رَبِّهِمْ يَرْجِعُ بَعْضُهُمْ إِلَى بَعْضٍ الْقَوْلَ يَقُولُ الَّذِينَ اسْتُضْعِفُوا لِلَّذِينَ اسْتَكْبَرُوا لَوْلَا أَنْتُمْ لَكُنَّا مُؤْمِنِينَ (31)"));
        sabaaExes.add(new SabaaEx("وقال الذين كفروا: لن نصدِّق بهذا القرآن ولا بالذي تَقَدَّمَه من التوراة والإنجيل والزبور، فقد كذَّبوا بجميع كتب الله. ولو ترى -أيها الرسول- إذ الظالمون محبوسون عند ربهم للحساب، يتراجعون الكلام فيما بينهم، كل يُلْقي بالعتاب على الآخر، لرأيت شيئًا فظيعاً، يقول المستضعفون للذين استكبروا -وهم القادة والرؤساء الضالون المضلون-: لولا أنتم أضللتمونا عن الهدى لكنا مؤمنين بالله ورسوله."));
        sabaaExes.add(new SabaaEx("قَالَ الَّذِينَ اسْتَكْبَرُوا لِلَّذِينَ اسْتُضْعِفُوا أَنَحْنُ صَدَدْنَاكُمْ عَنِ الْهُدَى بَعْدَ إِذْ جَاءَكُمْ بَلْ كُنْتُمْ مُجْرِمِينَ (32)"));
        sabaaExes.add(new SabaaEx("قال الرؤساء للذين استُضعِفوا: أنحن منعناكم من الهدى بعد إذ جاءكم؟ بل كنتم مجرمين إذ دخلتم في الكفر بإرادتكم مختارين."));
        sabaaExes.add(new SabaaEx("وَقَالَ الَّذِينَ اسْتُضْعِفُوا لِلَّذِينَ اسْتَكْبَرُوا بَلْ مَكْرُ اللَّيْلِ وَالنَّهَارِ إِذْ تَأْمُرُونَنَا أَنْ نَكْفُرَ بِاللَّهِ وَنَجْعَلَ لَهُ أَنْدَادًا وَأَسَرُّوا النَّدَامَةَ لَمَّا رَأَوُا الْعَذَابَ وَجَعَلْنَا الْأَغْلَالَ فِي أَعْنَاقِ الَّذِينَ كَفَرُوا هَلْ يُجْزَوْنَ إِلَّا مَا كَانُوا يَعْمَلُونَ (33)"));
        sabaaExes.add(new SabaaEx("وقال المستضعفون لرؤسائهم في الضلال: بل تدبيركم الشر لنا في الليل والنهار هو الذي أوقعنا في التهلكة، فكنتم تطلبون منا أن نكفر بالله، ونجعل له شركاء في العبادة، وأسرَّ كُلٌّ من الفريقين الحسرة حين رأوا العذاب الذي أُعدَّ لهم، وجعلنا الأغلال في أعناق الذين كفروا، لا يعاقَبون بهذا العقاب إلا بسبب كفرهم بالله وعملهم السيئات في الدنيا. وفي الآية تحذير شديد من متابعة دعاة الضلال وأئمة الطغيان."));
        sabaaExes.add(new SabaaEx("وَمَا أَرْسَلْنَا فِي قَرْيَةٍ مِنْ نَذِيرٍ إِلَّا قَالَ مُتْرَفُوهَا إِنَّا بِمَا أُرْسِلْتُمْ بِهِ كَافِرُونَ (34)"));
        sabaaExes.add(new SabaaEx("وما أرسلنا في قرية من رسول يدعو الى توحيد الله وإفراده بالعبادة، إلا قال المنغمسون في اللذات والشهوات من أهلها: إنَّا بالذي جئتم به -أيها الرسل- جاحدون."));
        sabaaExes.add(new SabaaEx("وَقَالُوا نَحْنُ أَكْثَرُ أَمْوَالًا وَأَوْلَادًا وَمَا نَحْنُ بِمُعَذَّبِينَ (35)"));
        sabaaExes.add(new SabaaEx("وقالوا: نحن أكثر منكم أموالا وأولادًا، والله لم يعطنا هذه النعم إلا لرضاه عنا، وما نحن بمعذَّبين في الدنيا ولا في الآخرة."));
        sabaaExes.add(new SabaaEx("قُلْ إِنَّ رَبِّي يَبْسُطُ الرِّزْقَ لِمَنْ يَشَاءُ وَيَقْدِرُ وَلَكِنَّ أَكْثَرَ النَّاسِ لَا يَعْلَمُونَ (36)"));
        sabaaExes.add(new SabaaEx("قل لهم -أيها الرسول-: إن ربي يوسِّع الرزق في الدنيا لمن يشاء مِن عباده، ويضيِّق على مَن يشاء، لا لمحبة ولا لبغض، ولكن يفعل ذلك اختبارًا، ولكن أكثر الناس لا يعلمون أن ذلك اختبار لعباده؛ لأنهم لا يتأملون."));
        sabaaExes.add(new SabaaEx("وَمَا أَمْوَالُكُمْ وَلَا أَوْلَادُكُمْ بِالَّتِي تُقَرِّبُكُمْ عِنْدَنَا زُلْفَى إِلَّا مَنْ آمَنَ وَعَمِلَ صَالِحًا فَأُولَئِكَ لَهُمْ جَزَاءُ الضِّعْفِ بِمَا عَمِلُوا وَهُمْ فِي الْغُرُفَاتِ آمِنُونَ (37)"));
        sabaaExes.add(new SabaaEx("وليست أموالكم ولا أولادكم بالتي تقربكم عندنا قربى، وترفع درجاتكم، لكن مَن آمن بالله وعمل صالحًا فهؤلاء لهم ثواب الضعف من الحسنات، فالحسنة بعشر أمثالها إلى ما يشاء الله من الزيادة، وهم في أعالي الجنة آمنون من العذاب والموت والأحزان."));
        sabaaExes.add(new SabaaEx("وَالَّذِينَ يَسْعَوْنَ فِي آيَاتِنَا مُعَاجِزِينَ أُولَئِكَ فِي الْعَذَابِ مُحْضَرُونَ (38)"));
        sabaaExes.add(new SabaaEx("والذين يسعون في إبطال حججنا، ويصدون عن سبيل الله مشاقين مغالبين، هؤلاء في عذاب جهنم يوم القيامة، تحضرهم الزبانية، فلا يخرجون منها."));
        sabaaExes.add(new SabaaEx("قُلْ إِنَّ رَبِّي يَبْسُطُ الرِّزْقَ لِمَنْ يَشَاءُ مِنْ عِبَادِهِ وَيَقْدِرُ لَهُ وَمَا أَنْفَقْتُمْ مِنْ شَيْءٍ فَهُوَ يُخْلِفُهُ وَهُوَ خَيْرُ الرَّازِقِينَ (39)"));
        sabaaExes.add(new SabaaEx("قل -أيها الرسول- لهؤلاء المغترين بالأموال والأولاد: إن ربي يوسِّع الرزق على مَن يشاء من عباده، ويضيِّقه على مَن يشاء؛ لحكمة يعلمها، ومهما أَعْطَيتم من شيء فيما أمركم به فهو يعوضه لكم في الدنيا بالبدل، وفي الآخرة بالثواب، وهو -سبحانه- خير الرازقين، فاطلبوا الرزق منه وحده، واسعَوا في الأسباب التي أمركم بها."));
        sabaaExes.add(new SabaaEx("وَيَوْمَ يَحْشُرُهُمْ جَمِيعًا ثُمَّ يَقُولُ لِلْمَلَائِكَةِ أَهَؤُلَاءِ إِيَّاكُمْ كَانُوا يَعْبُدُونَ (40)"));
        sabaaExes.add(new SabaaEx("واذكر -أيها الرسول- يوم يحشر الله المشركين والمعبودين من دونه من الملائكة، ثم يقول للملائكة على وجه التوبيخ لمن عبدهم: أهؤلاء إياكم كانوا يعبدون مِن دوننا؟"));
        sabaaExes.add(new SabaaEx("قَالُوا سُبْحَانَكَ أَنْتَ وَلِيُّنَا مِنْ دُونِهِمْ بَلْ كَانُوا يَعْبُدُونَ الْجِنَّ أَكْثَرُهُمْ بِهِمْ مُؤْمِنُونَ (41)"));
        sabaaExes.add(new SabaaEx("قالت الملائكة: ننزهك يا ألله عن أن يكون لك شريك في العبادة، أنت وليُّنا الذي نطيعه ونعبده وحده، بل كان هؤلاء يعبدون الشياطين، أكثرهم بهم مصدقون ومطيعون."));
        sabaaExes.add(new SabaaEx("فَالْيَوْمَ لَا يَمْلِكُ بَعْضُكُمْ لِبَعْضٍ نَفْعًا وَلَا ضَرًّا وَنَقُولُ لِلَّذِينَ ظَلَمُوا ذُوقُوا عَذَابَ النَّارِ الَّتِي كُنْتُمْ بِهَا تُكَذِّبُونَ (42)"));
        sabaaExes.add(new SabaaEx("ففي يوم الحشر لا يملك المعبودون للعابدين نفعًا ولا ضرًّا، ونقول للذين ظلموا أنفسهم بالشرك والمعاصي: ذوقوا عذاب النار التي كنتم بها تكذبون."));
        sabaaExes.add(new SabaaEx("وَإِذَا تُتْلَى عَلَيْهِمْ آيَاتُنَا بَيِّنَاتٍ قَالُوا مَا هَذَا إِلَّا رَجُلٌ يُرِيدُ أَنْ يَصُدَّكُمْ عَمَّا كَانَ يَعْبُدُ آبَاؤُكُمْ وَقَالُوا مَا هَذَا إِلَّا إِفْكٌ مُفْتَرًى وَقَالَ الَّذِينَ كَفَرُوا لِلْحَقِّ لَمَّا جَاءَهُمْ إِنْ هَذَا إِلَّا سِحْرٌ مُبِينٌ (43)"));
        sabaaExes.add(new SabaaEx("وإذا تتلى على كفار «مكة» آيات الله واضحات قالوا: ما محمد إلا رجل يرغب أن يمنعكم عن عبادة الآلهة التي كان يعبدها آباؤكم، وقالوا: ما هذا القرآن الذي تتلوه علينا -يا محمد- إلا كذب مختلق، جئتَ به من عند نفسك، وليس مِن عند الله، وقال الكفار عن القرآن لما جاءهم: ما هذا إلا سحر واضح."));
        sabaaExes.add(new SabaaEx("وَمَا آتَيْنَاهُمْ مِنْ كُتُبٍ يَدْرُسُونَهَا وَمَا أَرْسَلْنَا إِلَيْهِمْ قَبْلَكَ مِنْ نَذِيرٍ (44)"));
        sabaaExes.add(new SabaaEx("وما أنزلنا على الكفار مِن كُتُب يقرؤونها قبل القرآن فتدلهم على ما يزعمون من أن ما جاءهم به محمد سحر، وما أرسلنا إليهم قبلك -أيها الرسول- من رسول ينذرهم بأسنا."));
        sabaaExes.add(new SabaaEx("وَكَذَّبَ الَّذِينَ مِنْ قَبْلِهِمْ وَمَا بَلَغُوا مِعْشَارَ مَا آتَيْنَاهُمْ فَكَذَّبُوا رُسُلِي فَكَيْفَ كَانَ نَكِيرِ (45)"));
        sabaaExes.add(new SabaaEx("وكذَّب الذين من قبلهم كعاد وثمود رسلنا، وما بلغ أهل «مكة» عُشرَ ما آتينا الأمم السابقة من القوة، وكثرة المال، وطول العمر وغير ذلك من النعم، فكذبوا رسلي فيما جاؤوهم به فأهلكناهم، فانظر -أيها الرسول- كيف كان إنكاري عليهم وعقوبتي إياهم؟"));
        sabaaExes.add(new SabaaEx("قُلْ إِنَّمَا أَعِظُكُمْ بِوَاحِدَةٍ أَنْ تَقُومُوا لِلَّهِ مَثْنَى وَفُرَادَى ثُمَّ تَتَفَكَّرُوا مَا بِصَاحِبِكُمْ مِنْ جِنَّةٍ إِنْ هُوَ إِلَّا نَذِيرٌ لَكُمْ بَيْنَ يَدَيْ عَذَابٍ شَدِيدٍ (46)"));
        sabaaExes.add(new SabaaEx("قل -أيها الرسول- لهؤلاء المكذبين المعاندين: إنما أنصح لكم بخصلة واحدة أن تنهضوا في طاعة الله اثنين اثنين وواحدًا واحدًا، ثم تتفكروا في حال صاحبكم رسول الله صلى الله عليه وسلم وفيما نسب إليه، فما به من جنون، وما هو إلا مخوِّف لكم، ونذير من عذاب جهنم قبل أن تقاسوا حرها."));
        sabaaExes.add(new SabaaEx("قُلْ مَا سَأَلْتُكُمْ مِنْ أَجْرٍ فَهُوَ لَكُمْ إِنْ أَجْرِيَ إِلَّا عَلَى اللَّهِ وَهُوَ عَلَى كُلِّ شَيْءٍ شَهِيدٌ (47)"));
        sabaaExes.add(new SabaaEx("قل -أيها الرسول- للكفار: ما سألتكم على الخير الذي جئتكم به من أجر فهو لكم، ما أجري الذي أنتظره إلا على الله المطَّلِع على أعمالي وأعمالكم، لا يخفى عليه شيء فهو يجازي الجميع، كلٌّ بما يستحقه."));
        sabaaExes.add(new SabaaEx("قُلْ إِنَّ رَبِّي يَقْذِفُ بِالْحَقِّ عَلَّامُ الْغُيُوبِ (48)"));
        sabaaExes.add(new SabaaEx("قل -أيها الرسول- لمن أنكر التوحيد ورسالة الإسلام: إن ربي يقذف الباطل بحجج من الحق، فيفضحه ويهلكه، والله علام الغيوب، لا يخفى عليه شيء في الأرض ولا في السماء."));
        sabaaExes.add(new SabaaEx("قُلْ جَاءَ الْحَقُّ وَمَا يُبْدِئُ الْبَاطِلُ وَمَا يُعِيدُ (49)"));
        sabaaExes.add(new SabaaEx("قل -أيها الرسول-: جاء الحق والشرع العظيم من الله، وذهب الباطل واضمحلَّ سلطانه، فلم يبق للباطل شيء يبدؤه ويعيده."));
        sabaaExes.add(new SabaaEx("قُلْ إِنْ ضَلَلْتُ فَإِنَّمَا أَضِلُّ عَلَى نَفْسِي وَإِنِ اهْتَدَيْتُ فَبِمَا يُوحِي إِلَيَّ رَبِّي إِنَّهُ سَمِيعٌ قَرِيبٌ (50)"));
        sabaaExes.add(new SabaaEx("قل: إن مِلْت عن الحق فإثم ضلالي على نفسي، وإن استقمت عليه فبوحي الله الذي يوحيه إليَّ، إن ربي سميع لما أقول لكم، قريب ممن دعاه وسأله."));
        sabaaExes.add(new SabaaEx("وَلَوْ تَرَى إِذْ فَزِعُوا فَلَا فَوْتَ وَأُخِذُوا مِنْ مَكَانٍ قَرِيبٍ (51)"));
        sabaaExes.add(new SabaaEx("ولو ترى -أيها الرسول- إذ فَزِعَ الكفار حين معاينتهم عذاب الله، لرأيت أمرًا عظيمًا، فلا نجاة لهم ولا مهرب، وأُخذوا إلى النار من موضع قريب التناول."));
        sabaaExes.add(new SabaaEx("وَقَالُوا آمَنَّا بِهِ وَأَنَّى لَهُمُ التَّنَاوُشُ مِنْ مَكَانٍ بَعِيدٍ (52)"));
        sabaaExes.add(new SabaaEx("وقال الكفار -عندما رأوا العذاب في الآخرة-: آمنا بالله وكتبه ورسله، وكيف لهم تناول الإيمان في الآخرة ووصولهم له من مكان بعيد؟ قد حيل بينهم وبينه، فمكانه الدنيا، وقد كفروا فيها."));
        sabaaExes.add(new SabaaEx("وَقَدْ كَفَرُوا بِهِ مِنْ قَبْلُ وَيَقْذِفُونَ بِالْغَيْبِ مِنْ مَكَانٍ بَعِيدٍ (53)"));
        sabaaExes.add(new SabaaEx("وقد كفروا بالحق في الدنيا، وكذبوا الرسل، ويرمون بالظن من جهة بعيدة عن إصابة الحق، ليس لهم فيها مستند لظنهم الباطل، فلا سبيل لإصابتهم الحق، كما لا سبيل للرامي إلى إصابة الغرض من مكان بعيد."));
        sabaaExes.add(new SabaaEx("وَحِيلَ بَيْنَهُمْ وَبَيْنَ مَا يَشْتَهُونَ كَمَا فُعِلَ بِأَشْيَاعِهِمْ مِنْ قَبْلُ إِنَّهُمْ كَانُوا فِي شَكٍّ مُرِيبٍ (54)"));
        sabaaExes.add(new SabaaEx("وحيل بين الكفار وما يشتهون من التوبة والعودة إلى الدنيا ليؤمنوا، كما فعل الله بأمثالهم من كفرة الأمم السابقة، إنهم كانوا في الدنيا في شَكٍّ من أمر الرسل والبعث والحساب، مُحْدِث للريبة والقلق، فلذلك لم يؤمنوا."));


        quran_explanation_34_adapter = new quran_explanation_34_adapter(sabaaExes ,QuranExplanation_34Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_34);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_34Activity.this));
        recyclerView.setAdapter(quran_explanation_34_adapter);


    }

}