package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_50Activity extends AppCompatActivity {

    ArrayList<QafEx> qafExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_50_adapter quran_explanation_50_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_50);

        qafExes.add(new QafEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        qafExes.add(new QafEx("ق وَالْقُرْآنِ الْمَجِيدِ (1)"));
        qafExes.add(new QafEx("{ق} سبق الكلام على الحروف المقطَّعة في أول سورة البقرة.\n" +
                "أقسم الله تعالى بالقرآن الكريم ذي المجد والشرف.\n"));
        qafExes.add(new QafEx("بَلْ عَجِبُوا أَنْ جَاءَهُمْ مُنْذِرٌ مِنْهُمْ فَقَالَ الْكَافِرُونَ هَذَا شَيْءٌ عَجِيبٌ (2)"));
        qafExes.add(new QafEx("بل عجب المكذبون للرسول صلى الله عليه وسلم أن جاءهم منذر منهم ينذرهم عقاب الله، فقال الكافرون بالله ورسوله: هذا شيء مستغرب يتعجب منه."));
        qafExes.add(new QafEx("أَإِذَا مِتْنَا وَكُنَّا تُرَابًا ذَلِكَ رَجْعٌ بَعِيدٌ (3)"));
        qafExes.add(new QafEx("أإذا متنا وصِرْنا ترابًا، كيف يمكن الرجوع بعد ذلك إلى ما كنا عليه؟ ذلك رجع بعيد الوقوع."));
        qafExes.add(new QafEx("قَدْ عَلِمْنَا مَا تَنْقُصُ الْأَرْضُ مِنْهُمْ وَعِنْدَنَا كِتَابٌ حَفِيظٌ (4)"));
        qafExes.add(new QafEx("قد علمنا ما تنقص الأرض وتُفني من أجسامهم، وعندنا كتاب محفوظ من التغيير والتبديل، بكل ما يجري عليهم في حياتهم وبعد مماتهم."));
        qafExes.add(new QafEx("بَلْ كَذَّبُوا بِالْحَقِّ لَمَّا جَاءَهُمْ فَهُمْ فِي أَمْرٍ مَرِيجٍ (5)"));
        qafExes.add(new QafEx("بل كذَّب هؤلاء المشركون بالقرآن حين جاءهم، فهم في أمر مضطرب مختلط، لا يثبتون على شيء، ولا يستقر لهم قرار."));
        qafExes.add(new QafEx("أَفَلَمْ يَنْظُرُوا إِلَى السَّمَاءِ فَوْقَهُمْ كَيْفَ بَنَيْنَاهَا وَزَيَّنَّاهَا وَمَا لَهَا مِنْ فُرُوجٍ (6)"));
        qafExes.add(new QafEx("أغَفَلوا حين كفروا بالبعث، فلم ينظروا إلى السماء فوقهم، كيف بنيناها مستوية الأرجاء، ثابتة البناء، وزيناها بالنجوم، وما لها من شقوق وفتوق، فهي سليمة من التفاوت والعيوب؟"));
        qafExes.add(new QafEx("وَالْأَرْضَ مَدَدْنَاهَا وَأَلْقَيْنَا فِيهَا رَوَاسِيَ وَأَنْبَتْنَا فِيهَا مِنْ كُلِّ زَوْجٍ بَهِيجٍ (7)"));
        qafExes.add(new QafEx("والأرض وسَّعْناها وفرشناها، وجعلنا فيها جبالا ثوابت; لئلا تميل بأهلها، وأنبتنا فيها من كل نوع حسن المنظر نافع، يَسُرُّ ويبهج الناظر إليه."));
        qafExes.add(new QafEx("تَبْصِرَةً وَذِكْرَى لِكُلِّ عَبْدٍ مُنِيبٍ (8)"));
        qafExes.add(new QafEx("خلق الله السموات والأرض وما فيهما من الآيات العظيمة عبرة يُتبصر بها مِن عمى الجهل، وذكرى لكل عبد خاضع خائف وَجِل، رجَّاع إلى الله عز وجل."));
        qafExes.add(new QafEx("وَنَزَّلْنَا مِنَ السَّمَاءِ مَاءً مُبَارَكًا فَأَنْبَتْنَا بِهِ جَنَّاتٍ وَحَبَّ الْحَصِيدِ (9)"));
        qafExes.add(new QafEx("ونزَّلنا من السماء مطرًا كثير المنافع، فأنبتنا به بساتين كثيرة الأشجار، وحب الزرع المحصود."));
        qafExes.add(new QafEx("وَالنَّخْلَ بَاسِقَاتٍ لَهَا طَلْعٌ نَضِيدٌ (10)"));
        qafExes.add(new QafEx("وأنبتنا النخل طِوالا لها طلع متراكب بعضه فوق بعضٍ."));
        qafExes.add(new QafEx("رِزْقًا لِلْعِبَادِ وَأَحْيَيْنَا بِهِ بَلْدَةً مَيْتًا كَذَلِكَ الْخُرُوجُ (11)"));
        qafExes.add(new QafEx("أنبتنا ذلك رزقًا للعباد يقتاتون به حسب حاجاتهم، وأحيينا بهذا الماء الذي أنزلناه من السماء بلدة قد أجدبت وقحطت، فلا زرع فيها ولا نبات، كما أحيينا بذلك الماء الأرض الميتة نخرجكم يوم القيامة أحياء بعد الموت."));
        qafExes.add(new QafEx("كَذَّبَتْ قَبْلَهُمْ قَوْمُ نُوحٍ وَأَصْحَابُ الرَّسِّ وَثَمُودُ (12)"));
        qafExes.add(new QafEx("كذَّبت قبل هؤلاء المشركين من قريش قومُ نوح وأصحاب البئر وثمود."));
        qafExes.add(new QafEx("وَعَادٌ وَفِرْعَوْنُ وَإِخْوَانُ لُوطٍ (13)"));
        qafExes.add(new QafEx("وعاد وفرعون وقوم لوط."));
        qafExes.add(new QafEx("وَأَصْحَابُ الْأَيْكَةِ وَقَوْمُ تُبَّعٍ كُلٌّ كَذَّبَ الرُّسُلَ فَحَقَّ وَعِيدِ (14)"));
        qafExes.add(new QafEx("وأصحاب الأيكة قومُ شعيب، وقوم تُبَّع الحِمْيَري، كل هؤلاء الأقوام كذَّبوا رسلهم، فحق عليهم الوعيد الذي توعدهم الله به على كفرهم."));
        qafExes.add(new QafEx("أَفَعَيِينَا بِالْخَلْقِ الْأَوَّلِ بَلْ هُمْ فِي لَبْسٍ مِنْ خَلْقٍ جَدِيدٍ (15)"));
        qafExes.add(new QafEx("أفَعَجَزْنا عن ابتداع الخلق الأول الذي خلقناه ولم يكن شيئًا، فنعجز عن إعادتهم خلقًا جديدًا بعد فنائهم؟ لا يعجزنا ذلك، بل نحن عليه قادرون، ولكنهم في حَيْرة وشك من أمر البعث والنشور."));
        qafExes.add(new QafEx("وَلَقَدْ خَلَقْنَا الْإِنْسَانَ وَنَعْلَمُ مَا تُوَسْوِسُ بِهِ نَفْسُهُ وَنَحْنُ أَقْرَبُ إِلَيْهِ مِنْ حَبْلِ الْوَرِيدِ (16)"));
        qafExes.add(new QafEx("ولقد خلقنا الإنسان، ونعلم ما تُحَدِّث به نفسه، ونحن أقرب إليه من حبل الوريد وهو عِرْق في العنق متصل بالقلب."));
        qafExes.add(new QafEx("إِذْ يَتَلَقَّى الْمُتَلَقِّيَانِ عَنِ الْيَمِينِ وَعَنِ الشِّمَالِ قَعِيدٌ (17)"));
        qafExes.add(new QafEx("حين يكتب المَلَكان المترصدان عن يمينه وعن شماله أعماله. فالذي عن اليمين يكتب الحسنات، والذي عن الشمال يكتب السيئات."));
        qafExes.add(new QafEx("مَا يَلْفِظُ مِنْ قَوْلٍ إِلَّا لَدَيْهِ رَقِيبٌ عَتِيدٌ (18)"));
        qafExes.add(new QafEx("ما يلفظ من قول فيتكلم به إلا لديه مَلَك يرقب قوله، ويكتبه، وهو مَلَك حاضر مُعَدٌّ لذلك."));
        qafExes.add(new QafEx("وَجَاءَتْ سَكْرَةُ الْمَوْتِ بِالْحَقِّ ذَلِكَ مَا كُنْتَ مِنْهُ تَحِيدُ (19)"));
        qafExes.add(new QafEx("وجاءت شدة الموت وغَمْرته بالحق الذي لا مردَّ له ولا مناص، ذلك ما كنت منه -أيها الإنسان - تهرب وتروغ."));
        qafExes.add(new QafEx("وَنُفِخَ فِي الصُّورِ ذَلِكَ يَوْمُ الْوَعِيدِ (20)"));
        qafExes.add(new QafEx("ونُفخ في «القرن» نفخة البعث الثانية، ذلك النفخ في يوم وقوع الوعيد الذي توعَّد الله به الكفار."));
        qafExes.add(new QafEx("وَجَاءَتْ كُلُّ نَفْسٍ مَعَهَا سَائِقٌ وَشَهِيدٌ (21)"));
        qafExes.add(new QafEx("وجاءت كل نفس معها مَلَكان، أحدهما يسوقها إلى المحشر، والآخر يشهد عليها بما عملت في الدنيا من خير وشر."));
        qafExes.add(new QafEx("لَقَدْ كُنْتَ فِي غَفْلَةٍ مِنْ هَذَا فَكَشَفْنَا عَنْكَ غِطَاءَكَ فَبَصَرُكَ الْيَوْمَ حَدِيدٌ (22)"));
        qafExes.add(new QafEx("لقد كنت في غفلة من هذا الذي عاينت اليوم أيها الإنسان، فكشفنا عنك غطاءك الذي غطَّى قلبك، فزالت الغفلة عنك، فبصرك اليوم فيما تشهد قوي شديد."));
        qafExes.add(new QafEx("وَقَالَ قَرِينُهُ هَذَا مَا لَدَيَّ عَتِيدٌ (23)"));
        qafExes.add(new QafEx("وقال المَلَك الكاتب الشهيد عليه: هذا ما عندي من ديوان عمله، وهو لديَّ مُعَدٌّ محفوظ حاضر."));
        qafExes.add(new QafEx("أَلْقِيَا فِي جَهَنَّمَ كُلَّ كَفَّارٍ عَنِيدٍ (24)"));
        qafExes.add(new QafEx("يقول الله للمَلَكين السائق والشهيد بعد أن يفصل بين الخلائق: ألقيا في جهنم كل جاحد أن الله هو الإلهُ الحقُّ، كثيرِ الكفر والتكذيب معاند للحق."));
        qafExes.add(new QafEx("مَنَّاعٍ لِلْخَيْرِ مُعْتَدٍ مُرِيبٍ (25)"));
        qafExes.add(new QafEx("منَّاع لأداء ما عليه من الحقوق في ماله، مُعْتدٍ على عباد الله وعلى حدوده، شاكٍّ في وعده ووعيده."));
        qafExes.add(new QafEx("الَّذِي جَعَلَ مَعَ اللَّهِ إِلَهًا آخَرَ فَأَلْقِيَاهُ فِي الْعَذَابِ الشَّدِيدِ (26)"));
        qafExes.add(new QafEx("الذي أشرك بالله، فعبد معه معبودًا آخر مِن خلقه، فألقياه في عذاب جهنم الشديد."));
        qafExes.add(new QafEx("قَالَ قَرِينُهُ رَبَّنَا مَا أَطْغَيْتُهُ وَلَكِنْ كَانَ فِي ضَلَالٍ بَعِيدٍ (27)"));
        qafExes.add(new QafEx("قال شيطانه الذي كان معه في الدنيا: ربنا ما أضللته، ولكن كان في طريق بعيد عن سبيل الهدى."));
        qafExes.add(new QafEx("قَالَ لَا تَخْتَصِمُوا لَدَيَّ وَقَدْ قَدَّمْتُ إِلَيْكُمْ بِالْوَعِيدِ (28)"));
        qafExes.add(new QafEx("قال الله تعالى: لا تختصموا لديَّ اليوم في موقف الجزاء والحساب; إذ لا فائدة من ذلك، وقد قَدَّمْتُ إليكم في الدنيا بالوعيد لمن كفر بي وعصاني."));
        qafExes.add(new QafEx("مَا يُبَدَّلُ الْقَوْلُ لَدَيَّ وَمَا أَنَا بِظَلَّامٍ لِلْعَبِيدِ (29)"));
        qafExes.add(new QafEx("ما يُغيَّر القول لديَّ، ولست أعذِّب أحدًا بذنب أحد، فلا أعذِّب أحدًا إلا بذنبه بعد قيام الحجة عليه."));
        qafExes.add(new QafEx("يَوْمَ نَقُولُ لِجَهَنَّمَ هَلِ امْتَلَأْتِ وَتَقُولُ هَلْ مِنْ مَزِيدٍ (30)"));
        qafExes.add(new QafEx("اذكر -أيها الرسول- لقومك يوم نقول لجهنم يوم القيامة: هل امتلأت؟ وتقول جهنم: هل من زيادة من الجن والإنس؟ فيضع الرب -جل جلاله- قدمه فيها، فينزوي بعضها على بعض، وتقول: قط، قط، أي: حسبي، قد امتلأت ليس فيَّ مزيد."));
        qafExes.add(new QafEx("وَأُزْلِفَتِ الْجَنَّةُ لِلْمُتَّقِينَ غَيْرَ بَعِيدٍ (31)"));
        qafExes.add(new QafEx("وقُرِّبت الجنة للمتقين مكانًا غير بعيد منهم، فهم يشاهدونها زيادة في المسرَّة لهم."));
        qafExes.add(new QafEx("هَذَا مَا تُوعَدُونَ لِكُلِّ أَوَّابٍ حَفِيظٍ (32)"));
        qafExes.add(new QafEx("يقال لهم: هذا الذي كنتم توعدون به -أيها المتقون- لكل تائب مِن ذنوبه، حافظ لكل ما قَرَّبه إلى ربه، من الفرائض والطاعات."));
        qafExes.add(new QafEx("مَنْ خَشِيَ الرَّحْمَنَ بِالْغَيْبِ وَجَاءَ بِقَلْبٍ مُنِيبٍ (33)"));
        qafExes.add(new QafEx("مَن خاف الله في الدنيا ولقيه يوم القيامة بقلب تائب من ذنوبه."));
        qafExes.add(new QafEx("ادْخُلُوهَا بِسَلَامٍ ذَلِكَ يَوْمُ الْخُلُودِ (34)"));
        qafExes.add(new QafEx("ويقال لهؤلاء المؤمنين: ادخلوا الجنة دخولا مقرونًا بالسلامة من الآفات والشرور، مأمونًا فيه جميع المكاره، ذلك هو يوم الخلود بلا انقطاع."));
        qafExes.add(new QafEx("لَهُمْ مَا يَشَاءُونَ فِيهَا وَلَدَيْنَا مَزِيدٌ (35)"));
        qafExes.add(new QafEx("لهؤلاء المؤمنين في الجنة ما يريدون، ولدينا على ما أعطيناهم زيادة نعيم، أعظَمُه النظر إلى وجه الله الكريم."));
        qafExes.add(new QafEx("وَكَمْ أَهْلَكْنَا قَبْلَهُمْ مِنْ قَرْنٍ هُمْ أَشَدُّ مِنْهُمْ بَطْشًا فَنَقَّبُوا فِي الْبِلَادِ هَلْ مِنْ مَحِيصٍ (36)"));
        qafExes.add(new QafEx("وأهلكنا قبل هؤلاء المشركين من قريش أممًا كثيرة، كانوا أشد منهم قوة وسطوة، فطوَّفوا في البلاد وسلكوا كل طريق؛ طلبا للهرب من الهلاك، هل من مهرب من عذاب الله حين جاءهم؟"));
        qafExes.add(new QafEx("إِنَّ فِي ذَلِكَ لَذِكْرَى لِمَنْ كَانَ لَهُ قَلْبٌ أَوْ أَلْقَى السَّمْعَ وَهُوَ شَهِيدٌ (37)"));
        qafExes.add(new QafEx("إن في إهلاك القرون الماضية لعبرة لمن كان له قلب يعقل به، أو أصغى السمع، وهو حاضر بقلبه، غير غافل ولا ساهٍ."));
        qafExes.add(new QafEx("وَلَقَدْ خَلَقْنَا السَّمَاوَاتِ وَالْأَرْضَ وَمَا بَيْنَهُمَا فِي سِتَّةِ أَيَّامٍ وَمَا مَسَّنَا مِنْ لُغُوبٍ (38)"));
        qafExes.add(new QafEx("ولقد خلقنا السموات السبع والأرض وما بينهما من أصناف المخلوقات في ستة أيام، وما أصابنا من ذلك الخلق تعب ولا نَصَب. وفي هذه القدرة العظيمة دليل على قدرته -سبحانه- على إحياء الموتى من باب أولى."));
        qafExes.add(new QafEx("فَاصْبِرْ عَلَى مَا يَقُولُونَ وَسَبِّحْ بِحَمْدِ رَبِّكَ قَبْلَ طُلُوعِ الشَّمْسِ وَقَبْلَ الْغُرُوبِ (39)"));
        qafExes.add(new QafEx("فاصبر -أيها الرسول- على ما يقوله المكذبون، فإن الله لهم بالمرصاد، وصلِّ لربك حامدًا له صلاة الصبح قبل طلوع الشمس وصلاة العصر قبل الغروب."));
        qafExes.add(new QafEx("وَمِنَ اللَّيْلِ فَسَبِّحْهُ وَأَدْبَارَ السُّجُودِ (40)"));
        qafExes.add(new QafEx("وصلِّ من الليل، وسبِّحْ بحمد ربك عقب الصلوات."));
        qafExes.add(new QafEx("وَاسْتَمِعْ يَوْمَ يُنَادِ الْمُنَادِ مِنْ مَكَانٍ قَرِيبٍ (41)"));
        qafExes.add(new QafEx("واستمع -أيها الرسول- يوم ينادي المَلَك بنفخه في «القرن» من مكان قريب."));
        qafExes.add(new QafEx("يَوْمَ يَسْمَعُونَ الصَّيْحَةَ بِالْحَقِّ ذَلِكَ يَوْمُ الْخُرُوجِ (42)"));
        qafExes.add(new QafEx("يوم يسمعون صيحة البعث بالحق الذي لا شك فيه ولا امتراء، ذلك يوم خروج أهل القبور من قبورهم."));
        qafExes.add(new QafEx("إِنَّا نَحْنُ نُحْيِي وَنُمِيتُ وَإِلَيْنَا الْمَصِيرُ (43)"));
        qafExes.add(new QafEx("إنَّا نحن نحيي الخلق ونميتهم في الدنيا، وإلينا مصيرهم جميعًا يوم القيامة للحساب والجزاء."));
        qafExes.add(new QafEx("يَوْمَ تَشَقَّقُ الْأَرْضُ عَنْهُمْ سِرَاعًا ذَلِكَ حَشْرٌ عَلَيْنَا يَسِيرٌ (44)"));
        qafExes.add(new QafEx("يوم تتصدع الأرض عن الموتى المقبورين بها، فيخرجون مسرعين إلى الداعي، ذلك الجمع في موقف الحساب علينا سهل يسير."));
        qafExes.add(new QafEx("نَحْنُ أَعْلَمُ بِمَا يَقُولُونَ وَمَا أَنْتَ عَلَيْهِمْ بِجَبَّارٍ فَذَكِّرْ بِالْقُرْآنِ مَنْ يَخَافُ وَعِيدِ (45)"));
        qafExes.add(new QafEx("نحن أعلم بما يقول هؤلاء المشركون مِن افتراء على الله وتكذيب بآياته، وما أنت -أيها الرسول- عليهم بمسلَّط; لتجبرهم على الإسلام، وإنما بُعِثْتَ مبلِّغًا، فذكِّر بالقرآن من يخشى وعيدي; لأن مَن لا يخاف الوعيد لا يذَّكر."));



        quran_explanation_50_adapter = new quran_explanation_50_adapter(qafExes ,QuranExplanation_50Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_50);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_50Activity.this));
        recyclerView.setAdapter(quran_explanation_50_adapter);


    }

}