package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_27Activity extends AppCompatActivity {

    ArrayList<AlnamlEx> alnamlExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_27_adapter quran_explanation_27_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_27);

        alnamlExes.add(new AlnamlEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alnamlExes.add(new AlnamlEx("طس تِلْكَ آيَاتُ الْقُرْآنِ وَكِتَابٍ مُبِينٍ (1)"));
        alnamlExes.add(new AlnamlEx("(طس) سبق الكلام على الحروف المقطَّعة في أول سورة البقرة.\n" +
                "هذه آيات القرآن وهي آيات الكتاب العزيز بينة المعنى، واضحة الدلالة، على ما فيه من العلوم والحكم والشرائع. فالقرآن هو الكتاب، جمع الله له بين الاسمين.\n"));
        alnamlExes.add(new AlnamlEx("هُدًى وَبُشْرَى لِلْمُؤْمِنِينَ (2)"));
        alnamlExes.add(new AlnamlEx("وهي آيات ترشد إلى طريق الفوز في الدنيا والآخرة، وتبشر بحسن الثواب للمؤمنين الذين صَدَّقوا بها، واهتدَوْا بهديها."));
        alnamlExes.add(new AlnamlEx("الَّذِينَ يُقِيمُونَ الصَّلَاةَ وَيُؤْتُونَ الزَّكَاةَ وَهُمْ بِالْآخِرَةِ هُمْ يُوقِنُونَ (3)"));
        alnamlExes.add(new AlnamlEx("الذين يقيمون الصلوات الخمس كاملة الأركان، مستوفية الشروط، ويؤدون الزكاة المفروضة لمستحقيها، وهم يوقنون بالحياة الآخرة، وما فيها مِن ثواب وعقاب."));
        alnamlExes.add(new AlnamlEx("إِنَّ الَّذِينَ لَا يُؤْمِنُونَ بِالْآخِرَةِ زَيَّنَّا لَهُمْ أَعْمَالَهُمْ فَهُمْ يَعْمَهُونَ (4)"));
        alnamlExes.add(new AlnamlEx("إن الذين لا يُصَدِّقون بالدار الآخرة، ولا يعملون لها حسَّنَّا لهم أعمالهم السيئة، فرأوها حسنة، فهم يترددون فيها متحيِّرين."));
        alnamlExes.add(new AlnamlEx("أُولَئِكَ الَّذِينَ لَهُمْ سُوءُ الْعَذَابِ وَهُمْ فِي الْآخِرَةِ هُمُ الْأَخْسَرُونَ (5)"));
        alnamlExes.add(new AlnamlEx("أولئك الذين لهم العذاب السيِّئ في الدنيا قتلا وأَسْرًا وذُلا وهزيمةً، وهم في الآخرة أشد الناس خسرانًا."));
        alnamlExes.add(new AlnamlEx("وَإِنَّكَ لَتُلَقَّى الْقُرْآنَ مِنْ لَدُنْ حَكِيمٍ عَلِيمٍ (6)"));
        alnamlExes.add(new AlnamlEx("وإنك -أيها الرسول- لتتلقى القرآن من عند الله، الحكيم في خلقه وتدبيره الذي أحاط بكل شيء علمًا."));
        alnamlExes.add(new AlnamlEx("إِذْ قَالَ مُوسَى لِأَهْلِهِ إِنِّي آنَسْتُ نَارًا سَآتِيكُمْ مِنْهَا بِخَبَرٍ أَوْ آتِيكُمْ بِشِهَابٍ قَبَسٍ لَعَلَّكُمْ تَصْطَلُونَ (7)"));
        alnamlExes.add(new AlnamlEx("اذكر قصة موسى حين قال لأهله في مسيره من «مدين» إلى «مصر» : إني أبصَرْتُ نارًا سآتيكم منها بخبر يدلنا على الطريق، أو آتيكم بشعلة نار; كي تستدفئوا بها من البرد."));
        alnamlExes.add(new AlnamlEx("فَلَمَّا جَاءَهَا نُودِيَ أَنْ بُورِكَ مَنْ فِي النَّارِ وَمَنْ حَوْلَهَا وَسُبْحَانَ اللَّهِ رَبِّ الْعَالَمِينَ (8)"));
        alnamlExes.add(new AlnamlEx("فلما جاء موسى النارَ ناداه الله وأخبره أن هذا مكانٌ قدَّسه الله وباركه فجعله موضعًا لتكليم موسى وإرساله، وأن الله بارك مَن في النار ومَن حولها مِنَ الملائكة، وتنزيهًا لله رب الخلائق عما لا يليق به."));
        alnamlExes.add(new AlnamlEx("يَامُوسَى إِنَّهُ أَنَا اللَّهُ الْعَزِيزُ الْحَكِيمُ (9)"));
        alnamlExes.add(new AlnamlEx("يا موسى إنه أنا الله المستحق للعبادة وحدي، العزيز الغالب في انتقامي من أعدائي، الحكيم في تدبير خلقي."));
        alnamlExes.add(new AlnamlEx("وَأَلْقِ عَصَاكَ فَلَمَّا رَآهَا تَهْتَزُّ كَأَنَّهَا جَانٌّ وَلَّى مُدْبِرًا وَلَمْ يُعَقِّبْ يَامُوسَى لَا تَخَفْ إِنِّي لَا يَخَافُ لَدَيَّ الْمُرْسَلُونَ (10)"));
        alnamlExes.add(new AlnamlEx("وألق عصاك فألقاها فصارت حية، فلما رآها تتحرك في خفة تَحَرُّكَ الحية السريعة ولَّى هاربًا ولم يرجع إليها، فطمأنه الله بقوله: يا موسى لا تَخَفْ، إني لا يخاف لديَّ من أرسلتهم برسالتي."));
        alnamlExes.add(new AlnamlEx("إِلَّا مَنْ ظَلَمَ ثُمَّ بَدَّلَ حُسْنًا بَعْدَ سُوءٍ فَإِنِّي غَفُورٌ رَحِيمٌ (11)"));
        alnamlExes.add(new AlnamlEx("لكن مَن تجاوز الحدَّ بذنب، ثم تاب فبدَّل حُسْن التوبة بعد قبح الذنب، فإني غفور له رحيم به، فلا ييئس أحدٌ من رحمة الله ومغفرته."));
        alnamlExes.add(new AlnamlEx("وَأَدْخِلْ يَدَكَ فِي جَيْبِكَ تَخْرُجْ بَيْضَاءَ مِنْ غَيْرِ سُوءٍ فِي تِسْعِ آيَاتٍ إِلَى فِرْعَوْنَ وَقَوْمِهِ إِنَّهُمْ كَانُوا قَوْمًا فَاسِقِينَ (12)"));
        alnamlExes.add(new AlnamlEx("وأدخل يدك في فتحة قميصك المفتوحة إلى الصدر تخرج بيضاء كالثلج من غير بَرَص في جملة تسع معجزات، وهي مع اليد: العصا، والسنون، ونقص الثمرات، والطوفان، والجراد، والقُمَّل، والضفادع، والدم؛ لتأييدك في رسالتك إلى فرعون وقومه، إنهم كانوا قومًا خارجين عن أمر الله كافرين به."));
        alnamlExes.add(new AlnamlEx("فَلَمَّا جَاءَتْهُمْ آيَاتُنَا مُبْصِرَةً قَالُوا هَذَا سِحْرٌ مُبِينٌ (13)"));
        alnamlExes.add(new AlnamlEx("فلما جاءتهم هذه المعجزات ظاهرة بيِّنة يبصر بها مَن نظر إليها حقيقةَ ما دلت عليه، قالوا: هذا سحرٌ واضحٌ بيِّن."));
        alnamlExes.add(new AlnamlEx("وَجَحَدُوا بِهَا وَاسْتَيْقَنَتْهَا أَنْفُسُهُمْ ظُلْمًا وَعُلُوًّا فَانْظُرْ كَيْفَ كَانَ عَاقِبَةُ الْمُفْسِدِينَ (14)"));
        alnamlExes.add(new AlnamlEx("وكذَّبوا بالمعجزات التسع الواضحة الدلالة على صدق موسى في نبوته وصدق دعوته، وأنكروا بألسنتهم أن تكون من عند الله، وقد استيقنوها في قلوبهم اعتداءً على الحق وتكبرًا على الاعتراف به، فانظر -أيها الرسول- كيف كان مصير الذين كفروا بآيات الله وأفسدوا في الأرض، إذ أغرقهم الله في البحر؟ وفي ذلك عبرة لمن يعتبر."));
        alnamlExes.add(new AlnamlEx("وَلَقَدْ آتَيْنَا دَاوُودَ وَسُلَيْمَانَ عِلْمًا وَقَالَا الْحَمْدُ لِلَّهِ الَّذِي فَضَّلَنَا عَلَى كَثِيرٍ مِنْ عِبَادِهِ الْمُؤْمِنِينَ (15)"));
        alnamlExes.add(new AlnamlEx("ولقد آتينا داود وسليمان علمًا فعملا به، وقالا الحمد لله الذي فضَّلنا بهذا على كثير من عباده المؤمنين. وفي الآية دليل على شرف العلم، وارتفاع أهله."));
        alnamlExes.add(new AlnamlEx("وَوَرِثَ سُلَيْمَانُ دَاوُودَ وَقَالَ يَاأَيُّهَا النَّاسُ عُلِّمْنَا مَنْطِقَ الطَّيْرِ وَأُوتِينَا مِنْ كُلِّ شَيْءٍ إِنَّ هَذَا لَهُوَ الْفَضْلُ الْمُبِينُ (16)"));
        alnamlExes.add(new AlnamlEx("وورث سليمان أباه داود في النبوة والعلم والملك، وقال سليمان لقومه: يا أيها الناس عُلِّمنا وفُهِّمنا كلام الطير، وأُعطينا مِن كل شيء تدعو إليه الحاجة، إن هذا الذي أعطانا الله تعالى إياه لهو الفضل الواضح الذي يُمَيِّزنا على مَن سوانا."));
        alnamlExes.add(new AlnamlEx("وَحُشِرَ لِسُلَيْمَانَ جُنُودُهُ مِنَ الْجِنِّ وَالْإِنْسِ وَالطَّيْرِ فَهُمْ يُوزَعُونَ (17)"));
        alnamlExes.add(new AlnamlEx("وجُمِع لسليمان جنوده من الجن والإنس والطير في مسيرة لهم، فهم على كثرتهم لم يكونوا مهمَلين، بل كان على كل جنس من يَرُدُّ أولهم على آخرهم; كي يقفوا جميعًا منتظمين."));
        alnamlExes.add(new AlnamlEx("حَتَّى إِذَا أَتَوْا عَلَى وَادِ النَّمْلِ قَالَتْ نَمْلَةٌ يَاأَيُّهَا النَّمْلُ ادْخُلُوا مَسَاكِنَكُمْ لَا يَحْطِمَنَّكُمْ سُلَيْمَانُ وَجُنُودُهُ وَهُمْ لَا يَشْعُرُونَ (18)"));
        alnamlExes.add(new AlnamlEx("حتى إذا بلغوا وادي النمل قالت نملة: يا أيها النمل ادخلوا مساكنكم لا يهلكنَّكم سليمان وجنوده، وهم لا يعلمون بذلك."));
        alnamlExes.add(new AlnamlEx("فَتَبَسَّمَ ضَاحِكًا مِنْ قَوْلِهَا وَقَالَ رَبِّ أَوْزِعْنِي أَنْ أَشْكُرَ نِعْمَتَكَ الَّتِي أَنْعَمْتَ عَلَيَّ وَعَلَى وَالِدَيَّ وَأَنْ أَعْمَلَ صَالِحًا تَرْضَاهُ وَأَدْخِلْنِي بِرَحْمَتِكَ فِي عِبَادِكَ الصَّالِحِينَ (19)"));
        alnamlExes.add(new AlnamlEx("فتبسم ضاحكًا من قول هذه النملة لفهمها واهتدائها إلى تحذير النمل، واستشعر نعمة الله عليه، فتوجَّه إليه داعيًا: ربِّ ألْهِمْني، ووفقني، أن أشكر نعمتك التي أنعمت عليَّ وعلى والديَّ، وأن أعمل عملا صالحًا ترضاه مني، وأدخلني برحمتك في نعيم جنتك مع عبادك الصالحين الذين ارتضيت أعمالهم."));
        alnamlExes.add(new AlnamlEx("وَتَفَقَّدَ الطَّيْرَ فَقَالَ مَا لِيَ لَا أَرَى الْهُدْهُدَ أَمْ كَانَ مِنَ الْغَائِبِينَ (20)"));
        alnamlExes.add(new AlnamlEx("وتفقد سليمان حال الطير المسخرة له وحال ما غاب منها، وكان عنده هدهد متميز معروف فلم يجده، فقال: ما لي لا أرى الهدهد الذي أعهده؟ أسَتَره ساتر عني، أم أنه كان من الغائبين عني، فلم أره لغيبته؟"));
        alnamlExes.add(new AlnamlEx("لَأُعَذِّبَنَّهُ عَذَابًا شَدِيدًا أَوْ لَأَذْبَحَنَّهُ أَوْ لَيَأْتِيَنِّي بِسُلْطَانٍ مُبِينٍ (21)"));
        alnamlExes.add(new AlnamlEx("فلما ظهر أنه غائب قال: لأعذبنَّ هذا الهدهد عذابًا شديدًا لغيابه تأديبًا له، أو لأذبحنَّه عقوبة على ما فعل حيث أخلَّ بما سُخِّر له، أو ليأتينِّي بحجة ظاهرة، فيها عذر لغيبته."));
        alnamlExes.add(new AlnamlEx("فَمَكَثَ غَيْرَ بَعِيدٍ فَقَالَ أَحَطْتُ بِمَا لَمْ تُحِطْ بِهِ وَجِئْتُكَ مِنْ سَبَإٍ بِنَبَإٍ يَقِينٍ (22)"));
        alnamlExes.add(new AlnamlEx("فمكث الهدهد زمنًا غير بعيد ثم حضر فعاتبه سليمان على مغيبه وتخلُّفه، فقال له الهدهد: علمت ما لم تعلمه من الأمر على وجه الإحاطة، وجئتك من مدينة «سبأ» بـ «اليمن» بخبر خطير الشأن، وأنا على يقين منه."));
        alnamlExes.add(new AlnamlEx("إِنِّي وَجَدْتُ امْرَأَةً تَمْلِكُهُمْ وَأُوتِيَتْ مِنْ كُلِّ شَيْءٍ وَلَهَا عَرْشٌ عَظِيمٌ (23)"));
        alnamlExes.add(new AlnamlEx("إني وجدت امرأةً تحكم أهل «سبأ» ، وأوتيت من كل شيء من أسباب الدنيا، ولها سرير عظيم القدر، تجلس عليه لإدارة ملكها."));
        alnamlExes.add(new AlnamlEx("وَجَدْتُهَا وَقَوْمَهَا يَسْجُدُونَ لِلشَّمْسِ مِنْ دُونِ اللَّهِ وَزَيَّنَ لَهُمُ الشَّيْطَانُ أَعْمَالَهُمْ فَصَدَّهُمْ عَنِ السَّبِيلِ فَهُمْ لَا يَهْتَدُونَ (24)"));
        alnamlExes.add(new AlnamlEx("وجدتُها هي وقومها يعبدون الشمس معرضين عن عبادة الله، وحسَّن لهم الشيطان أعمالهم السيئة التي كانوا يعملونها، فصرفهم عن الإيمان بالله وتوحيده، فهم لا يهتدون إلى الله وتوحيده وعبادته وحده."));
        alnamlExes.add(new AlnamlEx("أَلَّا يَسْجُدُوا لِلَّهِ الَّذِي يُخْرِجُ الْخَبْءَ فِي السَّمَاوَاتِ وَالْأَرْضِ وَيَعْلَمُ مَا تُخْفُونَ وَمَا تُعْلِنُونَ (25)"));
        alnamlExes.add(new AlnamlEx("حسَّن لهم الشيطان ذلك; لئلا يسجدوا لله الذي يُخرج المخبوء المستور في السموات والأرض من المطر والنبات وغير ذلك، ويعلم ما تُسرُّون وما تظهرون."));
        alnamlExes.add(new AlnamlEx("اللَّهُ لَا إِلَهَ إِلَّا هُوَ رَبُّ الْعَرْشِ الْعَظِيمِ (26)"));
        alnamlExes.add(new AlnamlEx("الله الذي لا معبود يستحق العبادة سواه، رب العرش العظيم."));
        alnamlExes.add(new AlnamlEx("قَالَ سَنَنْظُرُ أَصَدَقْتَ أَمْ كُنْتَ مِنَ الْكَاذِبِينَ (27)"));
        alnamlExes.add(new AlnamlEx("قال سليمان للهدهد: سنتأمل فيما جئتنا به من الخبر أصدقت في ذلك أم كنت من الكاذبين فيه؟"));
        alnamlExes.add(new AlnamlEx("اذْهَبْ بِكِتَابِي هَذَا فَأَلْقِهْ إِلَيْهِمْ ثُمَّ تَوَلَّ عَنْهُمْ فَانْظُرْ مَاذَا يَرْجِعُونَ (28)"));
        alnamlExes.add(new AlnamlEx("اذهب بكتابي هذا إلى أهل «سبأ» فأعطهم إياه، ثم تنحَّ عنهم قريبًا منهم بحيث تسمع كلامهم، فتأمل ما يتردد بينهم من الكلام."));
        alnamlExes.add(new AlnamlEx("قَالَتْ يَاأَيُّهَا الْمَلَأُ إِنِّي أُلْقِيَ إِلَيَّ كِتَابٌ كَرِيمٌ (29)"));
        alnamlExes.add(new AlnamlEx("ذهب الهدهد وألقى الكتاب إلى الملكة فقرأته، فجمعت أشراف قومها، وسمعها تقول لهم: إني وصل إليَّ كتاب جليل المقدار من شخص عظيم الشأن."));
        alnamlExes.add(new AlnamlEx("إِنَّهُ مِنْ سُلَيْمَانَ وَإِنَّهُ بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ (30)"));
        alnamlExes.add(new AlnamlEx("ثم بيَّنت ما فيه فقالت: إنه من سليمان، وإنه مفتتح بـ «بسم الله الرحمن الرحيم»"));
        alnamlExes.add(new AlnamlEx("أَلَّا تَعْلُوا عَلَيَّ وَأْتُونِي مُسْلِمِينَ (31)"));
        alnamlExes.add(new AlnamlEx("ألا تتكبروا ولا تتعاظموا عما دعوتكم إليه، وأقْبِلوا إليَّ منقادين لله بالوحدانية والطاعة مسلمين له."));
        alnamlExes.add(new AlnamlEx("قَالَتْ يَاأَيُّهَا الْمَلَأُ أَفْتُونِي فِي أَمْرِي مَا كُنْتُ قَاطِعَةً أَمْرًا حَتَّى تَشْهَدُونِ (32)"));
        alnamlExes.add(new AlnamlEx("قالت: يا أيها الأشراف أشيروا عليَّ في هذا الأمر، ما كنت لأفصل في أمر إلا بمحضركم ومشورتكم."));
        alnamlExes.add(new AlnamlEx("قَالُوا نَحْنُ أُولُو قُوَّةٍ وَأُولُو بَأْسٍ شَدِيدٍ وَالْأَمْرُ إِلَيْكِ فَانْظُرِي مَاذَا تَأْمُرِينَ (33)"));
        alnamlExes.add(new AlnamlEx("قالوا مجيبين لها: نحن أصحاب قوة في العدد والعُدَّة وأصحاب النجدة والشجاعة في شدة الحرب، والأمر موكول إليكِ، وأنتِ صاحبة الرأي، فتأملي ماذا تأمريننا به؟ فنحن سامعون لأمرك مطيعون لك."));
        alnamlExes.add(new AlnamlEx("قَالَتْ إِنَّ الْمُلُوكَ إِذَا دَخَلُوا قَرْيَةً أَفْسَدُوهَا وَجَعَلُوا أَعِزَّةَ أَهْلِهَا أَذِلَّةً وَكَذَلِكَ يَفْعَلُونَ (34)"));
        alnamlExes.add(new AlnamlEx("قالت محذرةً لهم من مواجهة سليمان بالعداوة، ومبيِّنة لهم سوء مغبَّة القتال: إن الملوك إذا دخلوا بجيوشهم قريةً عنوةً وقهرًا خرَّبوها وصيَّروا أعزَّة أهلها أذلة، وقتلوا وأسروا، وهذه عادتهم المستمرة الثابتة لحمل الناس على أن يهابوهم."));
        alnamlExes.add(new AlnamlEx("وَإِنِّي مُرْسِلَةٌ إِلَيْهِمْ بِهَدِيَّةٍ فَنَاظِرَةٌ بِمَ يَرْجِعُ الْمُرْسَلُونَ (35)"));
        alnamlExes.add(new AlnamlEx("وإني مرسلة إلى سليمان وقومه بهديَّة مشتملة على نفائس الأموال أصانعه بها، ومنتظرة ما يرجع به الرسل."));
        alnamlExes.add(new AlnamlEx("فَلَمَّا جَاءَ سُلَيْمَانَ قَالَ أَتُمِدُّونَنِ بِمَالٍ فَمَا آتَانِيَ اللَّهُ خَيْرٌ مِمَّا آتَاكُمْ بَلْ أَنْتُمْ بِهَدِيَّتِكُمْ تَفْرَحُونَ (36)"));
        alnamlExes.add(new AlnamlEx("فلمَّا جاء رسول الملكة بالهديَّة إلى سليمان، قال مستنكرًا ذلك متحدثًا بأَنْعُمِ الله عليه: أتمدونني بمالٍ تَرْضيةً لي؟ فما أعطاني الله من النبوة والملك والأموال الكثيرة خير وأفضل مما أعطاكم، بل أنتم الذين تفرحون بالهدية التي تُهدى إليكم; لأنكم أهل مفاخرة بالدنيا ومكاثرة بها."));
        alnamlExes.add(new AlnamlEx("ارْجِعْ إِلَيْهِمْ فَلَنَأْتِيَنَّهُمْ بِجُنُودٍ لَا قِبَلَ لَهُمْ بِهَا وَلَنُخْرِجَنَّهُمْ مِنْهَا أَذِلَّةً وَهُمْ صَاغِرُونَ (37)"));
        alnamlExes.add(new AlnamlEx("وقال سليمان عليه السلام لرسول أهل «سبأ» : ارجع إليهم، فوالله لنأتينَّهم بجنود لا طاقة لهم بمقاومتها ومقابلتها، ولنخرجنَّهم مِن أرضهم أذلة وهم صاغرون مهانون، إن لم ينقادوا لدين الله وحده، ويتركوا عبادة من سواه."));
        alnamlExes.add(new AlnamlEx("قَالَ يَاأَيُّهَا الْمَلَأُ أَيُّكُمْ يَأْتِينِي بِعَرْشِهَا قَبْلَ أَنْ يَأْتُونِي مُسْلِمِينَ (38)"));
        alnamlExes.add(new AlnamlEx("قال سليمان مخاطبًا من سَخَّرهم الله له من الجن والإنس: أيُّكم يأتيني بسرير ملكها العظيم قبل أن يأتوني منقادين طائعين؟"));
        alnamlExes.add(new AlnamlEx("قَالَ عِفْرِيتٌ مِنَ الْجِنِّ أَنَا آتِيكَ بِهِ قَبْلَ أَنْ تَقُومَ مِنْ مَقَامِكَ وَإِنِّي عَلَيْهِ لَقَوِيٌّ أَمِينٌ (39)"));
        alnamlExes.add(new AlnamlEx("قال مارد قويٌّ شديد من الجن: أنا آتيك به قبل أن تقوم من مجلسك هذا الذي تجلس فيه للحكم بين الناس، وإني لقويٌّ على حَمْله، أمين على ما فيه، آتي به كما هو لا أُنقِص منه شيئًا ولا أبدله."));
        alnamlExes.add(new AlnamlEx("قَالَ الَّذِي عِنْدَهُ عِلْمٌ مِنَ الْكِتَابِ أَنَا آتِيكَ بِهِ قَبْلَ أَنْ يَرْتَدَّ إِلَيْكَ طَرْفُكَ فَلَمَّا رَآهُ مُسْتَقِرًّا عِنْدَهُ قَالَ هَذَا مِنْ فَضْلِ رَبِّي لِيَبْلُوَنِي أَأَشْكُرُ أَمْ أَكْفُرُ وَمَنْ شَكَرَ فَإِنَّمَا يَشْكُرُ لِنَفْسِهِ وَمَنْ كَفَرَ فَإِنَّ رَبِّي غَنِيٌّ كَرِيمٌ (40)"));
        alnamlExes.add(new AlnamlEx("قال الذي عنده علم من الكتاب: أنا آتيك بهذا العرش قبل ارتداد أجفانك إذا تحرَّكَتْ للنظر في شيء. فأذن له سليمان فدعا الله، فأتى بالعرش. فلما رآه سليمان حاضرًا لديه ثابتًا عنده قال: هذا مِن فضل ربي الذي خلقني وخلق الكون كله؛ ليختبرني: أأشكر بذلك اعترافًا بنعمته تعالى عليَّ أم أكفر بترك الشكر؟ ومن شكر لله على نعمه فإنَّ نَفْعَ ذلك يرجع إليه، ومن جحد النعمة وترك الشكر فإن ربي غني عن شكره، كريم يعم بخيره في الدنيا الشاكر والكافر، ثم يحاسبهم ويجازيهم في الآخرة."));
        alnamlExes.add(new AlnamlEx("قَالَ نَكِّرُوا لَهَا عَرْشَهَا نَنْظُرْ أَتَهْتَدِي أَمْ تَكُونُ مِنَ الَّذِينَ لَا يَهْتَدُونَ (41)"));
        alnamlExes.add(new AlnamlEx("قال سليمان لمن عنده: غيِّروا سرير ملكها الذي تجلس عليه إلى حال تنكره إذا رأته; لنرى أتهتدي إلى معرفته أم تكون من الذين لا يهتدون؟"));
        alnamlExes.add(new AlnamlEx("فَلَمَّا جَاءَتْ قِيلَ أَهَكَذَا عَرْشُكِ قَالَتْ كَأَنَّهُ هُوَ وَأُوتِينَا الْعِلْمَ مِنْ قَبْلِهَا وَكُنَّا مُسْلِمِينَ (42)"));
        alnamlExes.add(new AlnamlEx("فلما جاءت ملكة «سبأ» إلى سليمان في مجلسه قيل لها: أهكذا عرشك؟ قالت: إنه يشبهه. فظهر لسليمان أنها أصابت في جوابها، وقد علمت قدرة الله وصحة نبوة سليمان عليه السلام، فقال: وأوتينا العلم بالله وبقدرته مِن قبلها، وكنا منقادين لأمر الله متبعين لدين الاسلام."));
        alnamlExes.add(new AlnamlEx("وَصَدَّهَا مَا كَانَتْ تَعْبُدُ مِنْ دُونِ اللَّهِ إِنَّهَا كَانَتْ مِنْ قَوْمٍ كَافِرِينَ (43)"));
        alnamlExes.add(new AlnamlEx("ومَنَعَها عن عبادة الله وحده ما كانت تعبده مِن دون الله تعالى، إنها كانت كافرة ونشأت بين قوم كافرين، واستمرت على دينهم، وإلا فلها من الذكاء والفطنة ما تعرف به الحق من الباطل، ولكن العقائد الباطلة تُذهب بصيرة القلب."));
        alnamlExes.add(new AlnamlEx("قِيلَ لَهَا ادْخُلِي الصَّرْحَ فَلَمَّا رَأَتْهُ حَسِبَتْهُ لُجَّةً وَكَشَفَتْ عَنْ سَاقَيْهَا قَالَ إِنَّهُ صَرْحٌ مُمَرَّدٌ مِنْ قَوَارِيرَ قَالَتْ رَبِّ إِنِّي ظَلَمْتُ نَفْسِي وَأَسْلَمْتُ مَعَ سُلَيْمَانَ لِلَّهِ رَبِّ الْعَالَمِينَ (44)"));
        alnamlExes.add(new AlnamlEx("قيل لها: ادخلي القصر، وكان صحنه مِن زجاج تحته ماء، فلما رأته ظنته ماء تتردد أمواجه، وكشفت عن ساقيها لتخوض الماء، فقال لها سليمان: إنه صحن أملس من زجاج صاف والماء تحته. فأدركت عظمة ملك سليمان، وقالت: رب إني ظلمت نفسي بما كنت عليه من الشرك، وانقدتُ متابعة لسليمان داخلة في دين رب العالمين أجمعين."));
        alnamlExes.add(new AlnamlEx("وَلَقَدْ أَرْسَلْنَا إِلَى ثَمُودَ أَخَاهُمْ صَالِحًا أَنِ اعْبُدُوا اللَّهَ فَإِذَا هُمْ فَرِيقَانِ يَخْتَصِمُونَ (45)"));
        alnamlExes.add(new AlnamlEx("ولقد أرسلنا إلى ثمود أخاهم صالحًا: أن وحِّدوا الله، ولا تجعلوا معه إلهًا آخر، فلما أتاهم صالحٌ داعيًا إلى توحيد الله وعبادته وحده صار قومه فريقين: أحدهما مؤمن به، والآخر كافر بدعوته، وكل منهم يزعم أن الحق معه."));
        alnamlExes.add(new AlnamlEx("قَالَ يَاقَوْمِ لِمَ تَسْتَعْجِلُونَ بِالسَّيِّئَةِ قَبْلَ الْحَسَنَةِ لَوْلَا تَسْتَغْفِرُونَ اللَّهَ لَعَلَّكُمْ تُرْحَمُونَ (46)"));
        alnamlExes.add(new AlnamlEx("قال صالح للفريق الكافر: لِمَ تبادرون الكفر وعمل السيئات الذي يجلب لكم العذاب، وتؤخرون الإيمان وفِعْل الحسنات الذي يجلب لكم الثواب؟ هلا تطلبون المغفرة من الله ابتداء، وتتوبون إليه؛ رجاء أن ترحموا."));
        alnamlExes.add(new AlnamlEx("قَالُوا اطَّيَّرْنَا بِكَ وَبِمَنْ مَعَكَ قَالَ طَائِرُكُمْ عِنْدَ اللَّهِ بَلْ أَنْتُمْ قَوْمٌ تُفْتَنُونَ (47)"));
        alnamlExes.add(new AlnamlEx("قال قوم صالح له: تَشاءَمْنا بك وبمن معك ممن دخل في دينك، قال لهم صالح: ما أصابكم الله مِن خير أو شر فهو مقدِّره عليكم ومجازيكم به، بل أنتم قوم تُخْتَبرون بالسراء والضراء والخير والشر."));
        alnamlExes.add(new AlnamlEx("وَكَانَ فِي الْمَدِينَةِ تِسْعَةُ رَهْطٍ يُفْسِدُونَ فِي الْأَرْضِ وَلَا يُصْلِحُونَ (48)"));
        alnamlExes.add(new AlnamlEx("وكان في مدينة صالح -وهي «الحِجْر» الواقعة في شمال غرب جزيرة العرب- تسعة رجال، شأنهم الإفساد في الأرض، الذي لا يخالطه شيء من الصلاح."));
        alnamlExes.add(new AlnamlEx("قَالُوا تَقَاسَمُوا بِاللَّهِ لَنُبَيِّتَنَّهُ وَأَهْلَهُ ثُمَّ لَنَقُولَنَّ لِوَلِيِّهِ مَا شَهِدْنَا مَهْلِكَ أَهْلِهِ وَإِنَّا لَصَادِقُونَ (49)"));
        alnamlExes.add(new AlnamlEx("قال هؤلاء التسعة بعضهم لبعض: تقاسموا بالله بأن يحلف كل واحد للآخرين: لنأتينَّ صالحًا بغتة في الليل فنقتله ونقتل أهله، ثم لنقولَنَّ لوليِّ الدم مِن قرابته: ما حضرنا قتلهم، وإنا لصادقون فيما قلناه."));
        alnamlExes.add(new AlnamlEx("وَمَكَرُوا مَكْرًا وَمَكَرْنَا مَكْرًا وَهُمْ لَا يَشْعُرُونَ (50)"));
        alnamlExes.add(new AlnamlEx("ودبَّروا هذه الحيلة لإهلاك صالح وأهله مكرًا منهم، فنصرنا نبينا صالحًا عليه السلام، وأخذناهم بالعقوبة على غِرَّة، وهم لا يتوقعون كيدنا لهم جزاءً على كيدهم."));
        alnamlExes.add(new AlnamlEx("فَانْظُرْ كَيْفَ كَانَ عَاقِبَةُ مَكْرِهِمْ أَنَّا دَمَّرْنَاهُمْ وَقَوْمَهُمْ أَجْمَعِينَ (51)"));
        alnamlExes.add(new AlnamlEx("فانظر -أيها الرسول- نظرة اعتبار إلى عاقبة غَدْر هؤلاء الرهط بنبيهم صالح؟ أنا أهلكناهم وقومهم أجمعين."));
        alnamlExes.add(new AlnamlEx("فَتِلْكَ بُيُوتُهُمْ خَاوِيَةً بِمَا ظَلَمُوا إِنَّ فِي ذَلِكَ لَآيَةً لِقَوْمٍ يَعْلَمُونَ (52)"));
        alnamlExes.add(new AlnamlEx("فتلك مساكنهم خالية ليس فيها منهم أحد، أهلكهم الله; بسبب ظلمهم لأنفسهم بالشرك، وتكذيب نبيهم. إن في ذلك التدمير والإهلاك لَعظة لقوم يعلمون ما فعلناه بهم، وهذه سنتنا فيمن يكذب المرسلين."));
        alnamlExes.add(new AlnamlEx("وَأَنْجَيْنَا الَّذِينَ آمَنُوا وَكَانُوا يَتَّقُونَ (53)"));
        alnamlExes.add(new AlnamlEx("وأنجينا مما حلَّ بثمود من الهلاك صالحًا عليه السلام والمؤمنين به، الذين كانوا يتقون بإيمانهم عذاب الله."));
        alnamlExes.add(new AlnamlEx("وَلُوطًا إِذْ قَالَ لِقَوْمِهِ أَتَأْتُونَ الْفَاحِشَةَ وَأَنْتُمْ تُبْصِرُونَ (54)"));
        alnamlExes.add(new AlnamlEx("واذكر لوطًا إذ قال لقومه: أتأتون الفعلة المتناهية في القبح، وأنتم تعلمون قبحها؟"));
        alnamlExes.add(new AlnamlEx("أَئِنَّكُمْ لَتَأْتُونَ الرِّجَالَ شَهْوَةً مِنْ دُونِ النِّسَاءِ بَلْ أَنْتُمْ قَوْمٌ تَجْهَلُونَ (55)"));
        alnamlExes.add(new AlnamlEx("أإنكم لتأتون الرجال في أدبارهم للشهوة عوضًا عن النساء؟ بل أنتم قوم تجهلون حقَّ الله عليكم، فخالفتم بذلك أمره، وعَصَيْتُم رسوله بفعلتكم القبيحة التي لم يسبقكم بها أحد من العالمين."));
        alnamlExes.add(new AlnamlEx("فَمَا كَانَ جَوَابَ قَوْمِهِ إِلَّا أَنْ قَالُوا أَخْرِجُوا آلَ لُوطٍ مِنْ قَرْيَتِكُمْ إِنَّهُمْ أُنَاسٌ يَتَطَهَّرُونَ (56)"));
        alnamlExes.add(new AlnamlEx("فما كان لقوم لوط جواب له إلا قول بعضهم لبعض: أَخْرجوا آل لوط من قريتكم، إنهم أناس يتنزهون عن إتيان الذكران. قالوا لهم ذلك استهزاءً بهم."));
        alnamlExes.add(new AlnamlEx("فَأَنْجَيْنَاهُ وَأَهْلَهُ إِلَّا امْرَأَتَهُ قَدَّرْنَاهَا مِنَ الْغَابِرِينَ (57)"));
        alnamlExes.add(new AlnamlEx("فأنجينا لوطًا وأهله من العذاب الذي سيقع بقوم لوط، إلا امرأته قدَّرناها من الباقين في العذاب حتى تهلك مع الهالكين; لأنها كانت عونًا لقومها على أفعالهم القبيحة راضية بها."));
        alnamlExes.add(new AlnamlEx("وَأَمْطَرْنَا عَلَيْهِمْ مَطَرًا فَسَاءَ مَطَرُ الْمُنْذَرِينَ (58)"));
        alnamlExes.add(new AlnamlEx("وأمطرنا عليهم من السماء حجارة مِن طين مهلكة، فقَبُحَ مطر المنذَرين، الذين قامت عليهم الحجة."));
        alnamlExes.add(new AlnamlEx("قُلِ الْحَمْدُ لِلَّهِ وَسَلَامٌ عَلَى عِبَادِهِ الَّذِينَ اصْطَفَى آللَّهُ خَيْرٌ أَمَّا يُشْرِكُونَ (59)"));
        alnamlExes.add(new AlnamlEx("قل -أيها الرسول-: الثناء والشكر لله، وسلام منه، وأَمَنَةٌ على عباده الذين تخيرهم لرسالته، ثم اسأل مشركي قومك هل الله الذي يملك النفع والضر خير أو الذي يشركون من دونه، ممن لا يملك لنفسه ولا لغيره نفعًا ولا ضرًا؟"));
        alnamlExes.add(new AlnamlEx("أَمَّنْ خَلَقَ السَّمَاوَاتِ وَالْأَرْضَ وَأَنْزَلَ لَكُمْ مِنَ السَّمَاءِ مَاءً فَأَنْبَتْنَا بِهِ حَدَائِقَ ذَاتَ بَهْجَةٍ مَا كَانَ لَكُمْ أَنْ تُنْبِتُوا شَجَرَهَا أَإِلَهٌ مَعَ اللَّهِ بَلْ هُمْ قَوْمٌ يَعْدِلُونَ (60)"));
        alnamlExes.add(new AlnamlEx("واسألهم مَن خلق السموات والأرض، وأنزل لكم من السماء ماء، فأنبت به حدائق ذات منظر حسن؟ ما كان لكم أن تنبتوا شجرها، لولا أن الله أنزل عليكم الماء من السماء. إن عبادته سبحانه هي الحق، وعبادة ما سواه هي الباطل. أمعبود مع الله فعل هذه الأفعال حتى يُعبد معه ويُشرك به؟ بل هؤلاء المشركون قوم ينحرفون عن طريق الحق والإيمان، فيسوون بالله غيره في العبادة والتعظيم."));
        alnamlExes.add(new AlnamlEx("أَمَّنْ جَعَلَ الْأَرْضَ قَرَارًا وَجَعَلَ خِلَالَهَا أَنْهَارًا وَجَعَلَ لَهَا رَوَاسِيَ وَجَعَلَ بَيْنَ الْبَحْرَيْنِ حَاجِزًا أَإِلَهٌ مَعَ اللَّهِ بَلْ أَكْثَرُهُمْ لَا يَعْلَمُونَ (61)"));
        alnamlExes.add(new AlnamlEx("أعبادة ما تشركون بربكم خير أم الذي جعل لكم الأرض مستقرًا وجعل وسطها أنهارًا، وجعل لها الجبال ثوابت، وجعل بين البحرين العذب والملح حاجزًا حتى لا يُفسد أحدهما الآخر؟ أمعبود مع الله فَعَلَ ذلك حتى تشركوه معه في عبادتكم؟ بل أكثر هؤلاء المشركين لا يعلمون قَدْر عظمة الله، فهم يشركون به تقليدًا وظلمًا."));
        alnamlExes.add(new AlnamlEx("أَمَّنْ يُجِيبُ الْمُضْطَرَّ إِذَا دَعَاهُ وَيَكْشِفُ السُّوءَ وَيَجْعَلُكُمْ خُلَفَاءَ الْأَرْضِ أَإِلَهٌ مَعَ اللَّهِ قَلِيلًا مَا تَذَكَّرُونَ (62)"));
        alnamlExes.add(new AlnamlEx("أعبادة ما تشركون بالله خير أم الذي يجيب المكروب إذا دعاه، ويكشف السوء النازل به، ويجعلكم خلفاء لمن سبقكم في الأرض؟ أمعبود مع الله ينعم عليكم هذه النعم؟ قليلا ما تذكرون وتعتبرون، فلذلك أشركتم بالله غيره في عبادته."));
        alnamlExes.add(new AlnamlEx("أَمَّنْ يَهْدِيكُمْ فِي ظُلُمَاتِ الْبَرِّ وَالْبَحْرِ وَمَنْ يُرْسِلُ الرِّيَاحَ بُشْرًا بَيْنَ يَدَيْ رَحْمَتِهِ أَإِلَهٌ مَعَ اللَّهِ تَعَالَى اللَّهُ عَمَّا يُشْرِكُونَ (63)"));
        alnamlExes.add(new AlnamlEx("أعبادة ما تشركون بالله خير أم الذي يرشدكم في ظلمات البر والبحر إذا ضللتم فأظلمت عليكم السبل، والذي يرسل الرياح مبشرات بما يرحم به عباده مِن غيث يحيي موات الأرض؟ أمعبود مع الله يفعل بكم شيئًا من ذلك فتدعونه من دونه؟ تنزَّه الله وتقدَّس عما يشركون به غيره."));
        alnamlExes.add(new AlnamlEx("أَمَّنْ يَبْدَأُ الْخَلْقَ ثُمَّ يُعِيدُهُ وَمَنْ يَرْزُقُكُمْ مِنَ السَّمَاءِ وَالْأَرْضِ أَإِلَهٌ مَعَ اللَّهِ قُلْ هَاتُوا بُرْهَانَكُمْ إِنْ كُنْتُمْ صَادِقِينَ (64)"));
        alnamlExes.add(new AlnamlEx("واسألهم من الذي ينشئ الخلق ثم يفنيه إذا شاء، ثم يعيده، ومَن الذي يرزقكم من السماء بإنزال المطر، ومن الأرض بإنبات الزرع وغيره؟ أمعبود سوى الله يفعل ذلك؟ قل: هاتوا حجتكم إن كنتم صادقين في زعمكم أن لله تعالى شريكًا في ملكه وعبادته."));
        alnamlExes.add(new AlnamlEx("قُلْ لَا يَعْلَمُ مَنْ فِي السَّمَاوَاتِ وَالْأَرْضِ الْغَيْبَ إِلَّا اللَّهُ وَمَا يَشْعُرُونَ أَيَّانَ يُبْعَثُونَ (65)"));
        alnamlExes.add(new AlnamlEx("قل -أيها الرسول- لهم: لا يعلم أحد في السموات ولا في الأرض ما استأثر الله بعلمه من المغيَّبات، ولا يدرون متى هم مبعوثون مِن قبورهم عند قيام الساعة؟"));
        alnamlExes.add(new AlnamlEx("بَلِ ادَّارَكَ عِلْمُهُمْ فِي الْآخِرَةِ بَلْ هُمْ فِي شَكٍّ مِنْهَا بَلْ هُمْ مِنْهَا عَمُونَ (66)"));
        alnamlExes.add(new AlnamlEx("بل تكامل علمهم في الآخرة، فأيقنوا بالدار الآخرة، وما فيها مِن أهوال حين عاينوها، وقد كانوا في الدنيا في شك منها، بل عميت عنها بصائرهم."));
        alnamlExes.add(new AlnamlEx("وَقَالَ الَّذِينَ كَفَرُوا أَإِذَا كُنَّا تُرَابًا وَآبَاؤُنَا أَئِنَّا لَمُخْرَجُونَ (67)"));
        alnamlExes.add(new AlnamlEx("وقال الذين جحدوا وحدانية الله: أنحن وآباؤنا مبعوثون أحياء كهيئتنا من بعد مماتنا بعد أن صرنا ترابًا؟"));
        alnamlExes.add(new AlnamlEx("لَقَدْ وُعِدْنَا هَذَا نَحْنُ وَآبَاؤُنَا مِنْ قَبْلُ إِنْ هَذَا إِلَّا أَسَاطِيرُ الْأَوَّلِينَ (68)"));
        alnamlExes.add(new AlnamlEx("لقد وُعدنا هذا البعث نحن وآباؤنا مِن قبل، فلم نر لذلك حقيقة ولم نؤمن به، ما هذا الوعد إلا مما سطَّره الأولون من الأكاذيب في كتبهم وافتروه."));
        alnamlExes.add(new AlnamlEx("قُلْ سِيرُوا فِي الْأَرْضِ فَانْظُرُوا كَيْفَ كَانَ عَاقِبَةُ الْمُجْرِمِينَ (69)"));
        alnamlExes.add(new AlnamlEx("قل -أيها الرسول- لهؤلاء المكذبين: سيروا في الأرض، فانظروا إلى ديار مَن كان قبلكم من المجرمين، كيف كان عاقبة المكذبين للرسل؟ أهلكهم الله بتكذيبهم، والله فاعل بكم مثلهم إن لم تؤمنوا."));
        alnamlExes.add(new AlnamlEx("وَلَا تَحْزَنْ عَلَيْهِمْ وَلَا تَكُنْ فِي ضَيْقٍ مِمَّا يَمْكُرُونَ (70)"));
        alnamlExes.add(new AlnamlEx("ولا تحزن على إعراض المشركين عنك وتكذيبهم لك، ولا يَضِقْ صدرك مِن مكرهم بك، فإن الله ناصرك عليهم."));
        alnamlExes.add(new AlnamlEx("وَيَقُولُونَ مَتَى هَذَا الْوَعْدُ إِنْ كُنْتُمْ صَادِقِينَ (71)"));
        alnamlExes.add(new AlnamlEx("ويقول مشركو قومك -أيها الرسول-: متى يكون هذا الوعد بالعذاب الذي تَعِدُنا به أنت وأتباعك إن كنتم صادقين فيما تعدوننا به؟"));
        alnamlExes.add(new AlnamlEx("قُلْ عَسَى أَنْ يَكُونَ رَدِفَ لَكُمْ بَعْضُ الَّذِي تَسْتَعْجِلُونَ (72)"));
        alnamlExes.add(new AlnamlEx("قل لهم -أيها الرسول-: عسى أن يكون قد اقترب لكم بعض الذي تستعجلون من عذاب الله."));
        alnamlExes.add(new AlnamlEx("وَإِنَّ رَبَّكَ لَذُو فَضْلٍ عَلَى النَّاسِ وَلَكِنَّ أَكْثَرَهُمْ لَا يَشْكُرُونَ (73)"));
        alnamlExes.add(new AlnamlEx("وإنَّ ربك لذو فضل على الناس; بتركه معاجلتهم بالعقوبة على معصيتهم إياه وكفرهم به، ولكن أكثرهم لا يشكرون له على ذلك، فيؤمنوا به ويخلصوا له العبادة."));
        alnamlExes.add(new AlnamlEx("وَإِنَّ رَبَّكَ لَيَعْلَمُ مَا تُكِنُّ صُدُورُهُمْ وَمَا يُعْلِنُونَ (74)"));
        alnamlExes.add(new AlnamlEx("وإن ربك لَيعلم ما تخفيه صدور خلقه وما يظهرونه."));
        alnamlExes.add(new AlnamlEx("وَمَا مِنْ غَائِبَةٍ فِي السَّمَاءِ وَالْأَرْضِ إِلَّا فِي كِتَابٍ مُبِينٍ (75)"));
        alnamlExes.add(new AlnamlEx("وما مِن شيء غائب عن أبصار الخلق في السماء والأرض إلا في كتاب واضح عند الله. قد أحاط ذلك الكتاب بجميع ما كان وما يكون."));
        alnamlExes.add(new AlnamlEx("إِنَّ هَذَا الْقُرْآنَ يَقُصُّ عَلَى بَنِي إِسْرَائِيلَ أَكْثَرَ الَّذِي هُمْ فِيهِ يَخْتَلِفُونَ (76)"));
        alnamlExes.add(new AlnamlEx("إن هذا القرآن يقصُّ على بني إسرائيل الحق في أكثر الأشياء التي اختلفوا فيها."));
        alnamlExes.add(new AlnamlEx("وَإِنَّهُ لَهُدًى وَرَحْمَةٌ لِلْمُؤْمِنِينَ (77)"));
        alnamlExes.add(new AlnamlEx("وإن هذا القرآن لهداية من الضلال ورحمة من العذاب، لمن صدَّق به واهتدى بهداه."));
        alnamlExes.add(new AlnamlEx("إِنَّ رَبَّكَ يَقْضِي بَيْنَهُمْ بِحُكْمِهِ وَهُوَ الْعَزِيزُ الْعَلِيمُ (78)"));
        alnamlExes.add(new AlnamlEx("إن ربك يقضي بين المختلفين من بني إسرائيل وغيرهم بحكمه فيهم، فينتقم من المبطل، ويجازي المحسن. وهو العزيز الغالب، فلا يُرَدُّ قضاؤه، العليم، فلا يلتبس عليه حق بباطل."));
        alnamlExes.add(new AlnamlEx("فَتَوَكَّلْ عَلَى اللَّهِ إِنَّكَ عَلَى الْحَقِّ الْمُبِينِ (79)"));
        alnamlExes.add(new AlnamlEx("فاعتمد -أيها الرسول- في كل أمورك على الله، وثق به; فإنه كافيك، إنك على الحق الواضح الذي لا شك فيه."));
        alnamlExes.add(new AlnamlEx("إِنَّكَ لَا تُسْمِعُ الْمَوْتَى وَلَا تُسْمِعُ الصُّمَّ الدُّعَاءَ إِذَا وَلَّوْا مُدْبِرِينَ (80)"));
        alnamlExes.add(new AlnamlEx("إنك -أيها الرسول- لا تقدر أن تُسمع الحق مَن طبع الله على قلبه فأماته، ولا تُسمع دعوتك مَن أصمَّ الله سمعه عن سماع الحق عند إدبارهم معرضين عنك، فإن الأصم لا يسمع الدعاء إذا كان مقبلا، فكيف إذا كان معرضًا عنه موليًا مدبرًا؟"));
        alnamlExes.add(new AlnamlEx("وَمَا أَنْتَ بِهَادِي الْعُمْيِ عَنْ ضَلَالَتِهِمْ إِنْ تُسْمِعُ إِلَّا مَنْ يُؤْمِنُ بِآيَاتِنَا فَهُمْ مُسْلِمُونَ (81)"));
        alnamlExes.add(new AlnamlEx("وما أنت -أيها الرسول- بهادٍ عن الضلالة مَن أعماه الله عن الهدى والرشاد، ولا يمكنك أن تُسمع إلا مَن يصدِّق بآياتنا، فهم مسلمون مطيعون، مستجيبون لما دعوتهم إليه."));
        alnamlExes.add(new AlnamlEx("وَإِذَا وَقَعَ الْقَوْلُ عَلَيْهِمْ أَخْرَجْنَا لَهُمْ دَابَّةً مِنَ الْأَرْضِ تُكَلِّمُهُمْ أَنَّ النَّاسَ كَانُوا بِآيَاتِنَا لَا يُوقِنُونَ (82)"));
        alnamlExes.add(new AlnamlEx("وإذا وجب العذاب عليهم; لتماديهم في المعاصي والطغيان، وإعراضهم عن شرع الله وحكمه، حتى صاروا من شرار خلقه، أخرجنا لهم من الأرض في آخر الزمان علامة من علامات الساعة الكبرى، وهي «الدابة» ، تحدثهم أن الناس المنكرين للبعث كانوا بالقرآن ومحمد صلى الله عليه وسلم ودينه لا يصدقون ولا يعملون."));
        alnamlExes.add(new AlnamlEx("وَيَوْمَ نَحْشُرُ مِنْ كُلِّ أُمَّةٍ فَوْجًا مِمَّنْ يُكَذِّبُ بِآيَاتِنَا فَهُمْ يُوزَعُونَ (83)"));
        alnamlExes.add(new AlnamlEx("ويوم نجمع يوم الحشر من كل أمة جماعة، ممن يكذب بأدلتنا وحججنا، يُحْبَس أولهم على آخرهم; ليجتمعوا كلهم، ثم يساقون إلى الحساب."));
        alnamlExes.add(new AlnamlEx("حَتَّى إِذَا جَاءُوا قَالَ أَكَذَّبْتُمْ بِآيَاتِي وَلَمْ تُحِيطُوا بِهَا عِلْمًا أَمَّاذَا كُنْتُمْ تَعْمَلُونَ (84)"));
        alnamlExes.add(new AlnamlEx("حتى إذا جاء من كل أمة فوج ممن يكذب بآياتنا فاجتمعوا قال الله: أكذَّبْتم بآياتي التي أنزلتها على رسلي، وبالآيات التي أقمتها دلالة على توحيدي واستحقاقي وحدي للعبادة ولم تحيطوا علمًا ببطلانها، حتى تُعرضوا عنها وتُكَذِّبوا بها، أم أي شيء كنتم تعملون؟"));
        alnamlExes.add(new AlnamlEx("وَوَقَعَ الْقَوْلُ عَلَيْهِمْ بِمَا ظَلَمُوا فَهُمْ لَا يَنْطِقُونَ (85)"));
        alnamlExes.add(new AlnamlEx("وحقت عليهم كلمة العذاب بسبب ظلمهم وتكذيبهم، فهم لا ينطقون بحجة يدفعون بها عن أنفسهم ما حلَّ بهم من سوء العذاب."));
        alnamlExes.add(new AlnamlEx("أَلَمْ يَرَوْا أَنَّا جَعَلْنَا اللَّيْلَ لِيَسْكُنُوا فِيهِ وَالنَّهَارَ مُبْصِرًا إِنَّ فِي ذَلِكَ لَآيَاتٍ لِقَوْمٍ يُؤْمِنُونَ (86)"));
        alnamlExes.add(new AlnamlEx("ألم ير هؤلاء المكذبون بآياتنا أنا جعلنا الليل يستقرُّون فيه وينامون، والنهار يبصرون فيه للسعي في معاشهم؟ إن في تصريفهما لَدلالة لقوم يؤمنون بكمال قدرة الله ووحدانيَّته وعظيم نعمه."));
        alnamlExes.add(new AlnamlEx("وَيَوْمَ يُنْفَخُ فِي الصُّورِ فَفَزِعَ مَنْ فِي السَّمَاوَاتِ وَمَنْ فِي الْأَرْضِ إِلَّا مَنْ شَاءَ اللَّهُ وَكُلٌّ أَتَوْهُ دَاخِرِينَ (87)"));
        alnamlExes.add(new AlnamlEx("واذكر -أيها الرسول- يوم يَنفخ الملَك في «القرن» ففزع مَن في السموات ومَن في الأرض فزعًا شديدًا مِن هول النفخة، إلا مَنِ استثناه الله ممن أكرمه وحفظه من الفزع، وكل المخلوقات يأتون إلى ربهم صاغرين مطيعين."));
        alnamlExes.add(new AlnamlEx("وَتَرَى الْجِبَالَ تَحْسَبُهَا جَامِدَةً وَهِيَ تَمُرُّ مَرَّ السَّحَابِ صُنْعَ اللَّهِ الَّذِي أَتْقَنَ كُلَّ شَيْءٍ إِنَّهُ خَبِيرٌ بِمَا تَفْعَلُونَ (88)"));
        alnamlExes.add(new AlnamlEx("وترى الجبال تظنها واقفة مستقرة، وهي تسير سيرًا حثيثًا كسير السحاب الذي تسيِّره الرياح، وهذا مِن صنع الله الذي أحسن كل شيء خلقه وأتقنه. إن الله خبير بما تفعلون أيها الناس من خير وشر، وسيجازيهم على ذلك."));
        alnamlExes.add(new AlnamlEx("مَنْ جَاءَ بِالْحَسَنَةِ فَلَهُ خَيْرٌ مِنْهَا وَهُمْ مِنْ فَزَعٍ يَوْمَئِذٍ آمِنُونَ (89)"));
        alnamlExes.add(new AlnamlEx("من جاء بتوحيد الله والإيمان به وعبادته وحده، والأعمال الصالحة يوم القيامة، فله عند الله من الأجر العظيم ما هو خير منها وأفضل، وهو الجنة، وهم يوم الفزع الأكبر آمنون."));
        alnamlExes.add(new AlnamlEx("وَمَنْ جَاءَ بِالسَّيِّئَةِ فَكُبَّتْ وُجُوهُهُمْ فِي النَّارِ هَلْ تُجْزَوْنَ إِلَّا مَا كُنْتُمْ تَعْمَلُونَ (90)"));
        alnamlExes.add(new AlnamlEx("ومن جاء بالشرك والأعمال السيئة المنكرة، فجزاؤهم أن يكبَّهم الله على وجوههم في النار يوم القيامة، ويقال لهم توبيخًا: هل تجزون إلا ما كنتم تعملون في الدنيا؟"));
        alnamlExes.add(new AlnamlEx("إِنَّمَا أُمِرْتُ أَنْ أَعْبُدَ رَبَّ هَذِهِ الْبَلْدَةِ الَّذِي حَرَّمَهَا وَلَهُ كُلُّ شَيْءٍ وَأُمِرْتُ أَنْ أَكُونَ مِنَ الْمُسْلِمِينَ (91)"));
        alnamlExes.add(new AlnamlEx("قل -أيها الرسول- للناس: إنما أُمرت أن أعبد رب هذه البلدة، وهي «مكة» ، الذي حَرَّمها على خلقه أن يسفكوا فيها دمًا حرامًا، أو يظلموا فيها أحدًا، أو يصيدوا صيدها، أو يقطعوا شجرها، وله سبحانه كل شيء، وأُمرت أن أعبده وحده دون مَن سواه، وأُمرت أن أكون من المنقادين لأمره، المبادرين لطاعته."));
        alnamlExes.add(new AlnamlEx("وَأَنْ أَتْلُوَ الْقُرْآنَ فَمَنِ اهْتَدَى فَإِنَّمَا يَهْتَدِي لِنَفْسِهِ وَمَنْ ضَلَّ فَقُلْ إِنَّمَا أَنَا مِنَ الْمُنْذِرِينَ (92)"));
        alnamlExes.add(new AlnamlEx("وأن أتلو القرآن على الناس، فمن اهتدى بما فيه واتبع ما جئت به، فإنما خير ذلك وجزاؤه لنفسه، ومن ضلَّ عن الحق فقل -أيها الرسول-: إنما أنا نذير لكم من عذاب الله وعقابه إن لم تؤمنوا، فأنا واحد من الرسل الذين أنذروا قومهم، وليس بيدي من الهداية شيء."));
        alnamlExes.add(new AlnamlEx("وَقُلِ الْحَمْدُ لِلَّهِ سَيُرِيكُمْ آيَاتِهِ فَتَعْرِفُونَهَا وَمَا رَبُّكَ بِغَافِلٍ عَمَّا تَعْمَلُونَ (93)"));
        alnamlExes.add(new AlnamlEx("وقل -أيها الرسول-: الثناء الجميل لله، سيريكم آياته في أنفسكم وفي السماء والأرض، فتعرفونها معرفة تدلكم على الحق، وتبيِّن لكم الباطل، وما ربك بغافل عما تعملون، وسيجازيكم على ذلك."));

        quran_explanation_27_adapter = new quran_explanation_27_adapter(alnamlExes ,QuranExplanation_27Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_27);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_27Activity.this));
        recyclerView.setAdapter(quran_explanation_27_adapter);


    }

}