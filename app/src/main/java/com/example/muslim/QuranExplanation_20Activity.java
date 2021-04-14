package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_20Activity extends AppCompatActivity {

    ArrayList<TahaEx> tahaExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_20_adapter quran_explanation_20_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_20);

        tahaExes.add(new TahaEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        tahaExes.add(new TahaEx("طه (1)"));
        tahaExes.add(new TahaEx("(طه) سبق الكلام على الحروف المقطَّعة في أول سورة البقرة."));
        tahaExes.add(new TahaEx("مَا أَنْزَلْنَا عَلَيْكَ الْقُرْآنَ لِتَشْقَى (2)"));
        tahaExes.add(new TahaEx("ما أنزلنا عليك - أيها الرسول - القرآن; لتشقى بما لا طاقة لك به من العمل."));
        tahaExes.add(new TahaEx("إِلَّا تَذْكِرَةً لِمَنْ يَخْشَى (3)"));
        tahaExes.add(new TahaEx("لكن أنزلناه موعظة; ليتذكر به مَن يخاف عقاب الله، فيتقيه بأداء الفرائض واجتناب المحارم."));
        tahaExes.add(new TahaEx("تَنْزِيلًا مِمَّنْ خَلَقَ الْأَرْضَ وَالسَّمَاوَاتِ الْعُلَى (4)"));
        tahaExes.add(new TahaEx("هذا القرآن تنزيل من الله الذي خلق الأرض والسموات العلى."));
        tahaExes.add(new TahaEx("الرَّحْمَنُ عَلَى الْعَرْشِ اسْتَوَى (5)"));
        tahaExes.add(new TahaEx("الرحمن على العرش استوى أي: علا وارتفع، استواء يليق بجلاله وعظمته."));
        tahaExes.add(new TahaEx("لَهُ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ وَمَا بَيْنَهُمَا وَمَا تَحْتَ الثَّرَى (6)"));
        tahaExes.add(new TahaEx("له ما في السموات وما في الأرض وما بينهما وما تحت الأرض، خَلْقًا ومُلْكًا وتدبيرًا."));
        tahaExes.add(new TahaEx("وَإِنْ تَجْهَرْ بِالْقَوْلِ فَإِنَّهُ يَعْلَمُ السِّرَّ وَأَخْفَى (7)"));
        tahaExes.add(new TahaEx("وإن تجهر - أيها الرسول - بالقول، فتعلنه أو تخفه، فإن الله لا يخفى عليه شيء، يعلم السر وما هو أخفى من السر مما تحدِّث به نفسك."));
        tahaExes.add(new TahaEx("اللَّهُ لَا إِلَهَ إِلَّا هُوَ لَهُ الْأَسْمَاءُ الْحُسْنَى (8)"));
        tahaExes.add(new TahaEx("الله الذي لا معبود بحق إلا هو، له وحده الأسماء الكاملة في الحسن."));
        tahaExes.add(new TahaEx("وَهَلْ أَتَاكَ حَدِيثُ مُوسَى (9)"));
        tahaExes.add(new TahaEx("وهل أتاك - أيها الرسول - خبر موسى بن عمران عليه السلام، وهو قادم من «مدين» إلى «مصر» ؟"));
        tahaExes.add(new TahaEx("إِذْ رَأَى نَارًا فَقَالَ لِأَهْلِهِ امْكُثُوا إِنِّي آنَسْتُ نَارًا لَعَلِّي آتِيكُمْ مِنْهَا بِقَبَسٍ أَوْ أَجِدُ عَلَى النَّارِ هُدًى (10)"));
        tahaExes.add(new TahaEx("حين رأى في الليل نارًا موقدة فقال لأهله: انتظروا لقد أبصرت نارًا، لعلي أجيئكم منها بشعلة تستدفئون بها، وتوقدون بها نارًا أخرى، أو أجد عندها هاديًا يدلنا على الطريق."));
        tahaExes.add(new TahaEx("فَلَمَّا أَتَاهَا نُودِيَ يَامُوسَى (11)"));
        tahaExes.add(new TahaEx("فلما أتى موسى تلك النار ناداه الله."));
        tahaExes.add(new TahaEx("إِنِّي أَنَا رَبُّكَ فَاخْلَعْ نَعْلَيْكَ إِنَّكَ بِالْوَادِ الْمُقَدَّسِ طُوًى (12)"));
        tahaExes.add(new TahaEx("يا موسى، إني أنا ربك فاخلع نعليك، إنك الآن بوادي «طوى» الذي باركته، وذلك استعدادًا لمناجاة ربه."));
        tahaExes.add(new TahaEx("وَأَنَا اخْتَرْتُكَ فَاسْتَمِعْ لِمَا يُوحَى (13)"));
        tahaExes.add(new TahaEx("وإني اخترتك يا موسى لرسالتي، فاستمع لما يوحى إليك مني."));
        tahaExes.add(new TahaEx("إِنَّنِي أَنَا اللَّهُ لَا إِلَهَ إِلَّا أَنَا فَاعْبُدْنِي وَأَقِمِ الصَّلَاةَ لِذِكْرِي (14)"));
        tahaExes.add(new TahaEx("إنني أنا الله لا معبود بحق إلا أنا، لا شريك لي، فاعبدني وحدي، وأقم الصلاة لتذكرني فيها."));
        tahaExes.add(new TahaEx("إِنَّ السَّاعَةَ آتِيَةٌ أَكَادُ أُخْفِيهَا لِتُجْزَى كُلُّ نَفْسٍ بِمَا تَسْعَى (15)"));
        tahaExes.add(new TahaEx("إن الساعة التي يُبعث فيها الناس آتية لا بد من وقوعها، أكاد أخفيها من نفسي، فكيف يعلمها أحد من المخلوقين; لكي تُجزى كل نفس بما عملت في الدنيا من خير أو شر."));
        tahaExes.add(new TahaEx("فَلَا يَصُدَّنَّكَ عَنْهَا مَنْ لَا يُؤْمِنُ بِهَا وَاتَّبَعَ هَوَاهُ فَتَرْدَى (16)"));
        tahaExes.add(new TahaEx("فلا يصرفنَّك - يا موسى - عن الإيمان بها والاستعداد لها مَن لا يصدق بوقوعها ولا يعمل لها، واتبع هوى نفسه، فكذَّب بها، فتهلك."));
        tahaExes.add(new TahaEx("وَمَا تِلْكَ بِيَمِينِكَ يَامُوسَى (17)"));
        tahaExes.add(new TahaEx("وما هذه التي في يمينك يا موسى؟"));
        tahaExes.add(new TahaEx("قَالَ هِيَ عَصَايَ أَتَوَكَّأُ عَلَيْهَا وَأَهُشُّ بِهَا عَلَى غَنَمِي وَلِيَ فِيهَا مَآرِبُ أُخْرَى (18)"));
        tahaExes.add(new TahaEx("قال موسى: هي عصاي أعتمد عليها في المشي، وأهزُّ بها الشجر; لترعى غنمي ما يتساقط من ورقه، ولي فيها منافع أخرى."));
        tahaExes.add(new TahaEx("قَالَ أَلْقِهَا يَامُوسَى (19)"));
        tahaExes.add(new TahaEx("قال الله لموسى: ألق عصاك."));
        tahaExes.add(new TahaEx("فَأَلْقَاهَا فَإِذَا هِيَ حَيَّةٌ تَسْعَى (20)"));
        tahaExes.add(new TahaEx("فألقاها موسى على الأرض، فانقلبت بإذن الله حية تسعى، فرأى موسى أمرًا عظيمًا وولى هاربًا."));
        tahaExes.add(new TahaEx("قَالَ خُذْهَا وَلَا تَخَفْ سَنُعِيدُهَا سِيرَتَهَا الْأُولَى (21)"));
        tahaExes.add(new TahaEx("قال الله لموسى: خذ الحية، ولا تَخَفْ منها، سوف نعيدها عصًا كما كانت في حالتها الأولى."));
        tahaExes.add(new TahaEx("وَاضْمُمْ يَدَكَ إِلَى جَنَاحِكَ تَخْرُجْ بَيْضَاءَ مِنْ غَيْرِ سُوءٍ آيَةً أُخْرَى (22)"));
        tahaExes.add(new TahaEx("واضمم يدك إلى جنبك تحت العَضُد تخرج بيضاء كالثلج من غير برص; لتكون لك علامة أخرى."));
        tahaExes.add(new TahaEx("لِنُرِيَكَ مِنْ آيَاتِنَا الْكُبْرَى (23)"));
        tahaExes.add(new TahaEx("فعلنا ذلك; لكي نريك - يا موسى - من أدلتنا الكبرى ما يدلُّ على قدرتنا، وعظيم سلطاننا، وصحة رسالتك."));
        tahaExes.add(new TahaEx("اذْهَبْ إِلَى فِرْعَوْنَ إِنَّهُ طَغَى (24)"));
        tahaExes.add(new TahaEx("اذهب - يا موسى - إلى فرعون; إنه قد تجاوز قدره وتمرَّد على ربه، فادعه إلى توحيد الله وعبادته."));
        tahaExes.add(new TahaEx("قَالَ رَبِّ اشْرَحْ لِي صَدْرِي (25)"));
        tahaExes.add(new TahaEx("قال موسى: رب وسِّع لي صدري."));
        tahaExes.add(new TahaEx("وَيَسِّرْ لِي أَمْرِي (26)"));
        tahaExes.add(new TahaEx("وسَهِّل لي أمري."));
        tahaExes.add(new TahaEx("وَاحْلُلْ عُقْدَةً مِنْ لِسَانِي (27)"));
        tahaExes.add(new TahaEx("وأطلق لساني بفصيح المنطق."));
        tahaExes.add(new TahaEx("يَفْقَهُوا قَوْلِي (28)"));
        tahaExes.add(new TahaEx("ليفهموا كلامي."));
        tahaExes.add(new TahaEx("وَاجْعَلْ لِي وَزِيرًا مِنْ أَهْلِي (29)"));
        tahaExes.add(new TahaEx("واجعل لي معينا من أهلي."));
        tahaExes.add(new TahaEx("هَارُونَ أَخِي (30)"));
        tahaExes.add(new TahaEx("هارون أخي."));
        tahaExes.add(new TahaEx("اشْدُدْ بِهِ أَزْرِي (31)"));
        tahaExes.add(new TahaEx("قَوِّني به وشدَّ به ظهري."));
        tahaExes.add(new TahaEx("وَأَشْرِكْهُ فِي أَمْرِي (32)"));
        tahaExes.add(new TahaEx("وأشركه معي في النبوة وتبليغ الرسالة."));
        tahaExes.add(new TahaEx("كَيْ نُسَبِّحَكَ كَثِيرًا (33)"));
        tahaExes.add(new TahaEx("كي ننزهك بالتسبيح كثيرًا."));
        tahaExes.add(new TahaEx("وَنَذْكُرَكَ كَثِيرًا (34)"));
        tahaExes.add(new TahaEx("ونذكرك كثيرا فنحمدك."));
        tahaExes.add(new TahaEx("إِنَّكَ كُنْتَ بِنَا بَصِيرًا (35)"));
        tahaExes.add(new TahaEx("إنك كنت بنا بصيرًا، لا يخفى عليك شيء من أفعالنا."));
        tahaExes.add(new TahaEx("قَالَ قَدْ أُوتِيتَ سُؤْلَكَ يَامُوسَى (36)"));
        tahaExes.add(new TahaEx("قال الله: قد أعطيتك كل ما سألت يا موسى."));
        tahaExes.add(new TahaEx("وَلَقَدْ مَنَنَّا عَلَيْكَ مَرَّةً أُخْرَى (37)"));
        tahaExes.add(new TahaEx("ولقد أنعمنا عليك - يا موسى - قبل هذه النعمة نعمة أخرى، حين كنت رضيعًا، فأنجيناك مِن بطش فرعون."));
        tahaExes.add(new TahaEx("إِذْ أَوْحَيْنَا إِلَى أُمِّكَ مَا يُوحَى (38)"));
        tahaExes.add(new TahaEx("وذلك حين ألهمْنا أمَّك."));
        tahaExes.add(new TahaEx("أَنِ اقْذِفِيهِ فِي التَّابُوتِ فَاقْذِفِيهِ فِي الْيَمِّ فَلْيُلْقِهِ الْيَمُّ بِالسَّاحِلِ يَأْخُذْهُ عَدُوٌّ لِي وَعَدُوٌّ لَهُ وَأَلْقَيْتُ عَلَيْكَ مَحَبَّةً مِنِّي وَلِتُصْنَعَ عَلَى عَيْنِي (39)"));
        tahaExes.add(new TahaEx("أن ضعي ابنك موسى بعد ولادته في التابوت، ثم اطرحيه في النيل، فسوف يلقيه النيل على الساحل، فيأخذه فرعون عدوي وعدوه. وألقيت عليك محبة مني فصرت بذلك محبوبًا بين العباد، ولِتربى على عيني وفي حفظي. وفي الآية إثبات صفة العين لله - سبحانه وتعالى - كما يليق بجلاله وكماله."));
        tahaExes.add(new TahaEx("إِذْ تَمْشِي أُخْتُكَ فَتَقُولُ هَلْ أَدُلُّكُمْ عَلَى مَنْ يَكْفُلُهُ فَرَجَعْنَاكَ إِلَى أُمِّكَ كَيْ تَقَرَّ عَيْنُهَا وَلَا تَحْزَنَ وَقَتَلْتَ نَفْسًا فَنَجَّيْنَاكَ مِنَ الْغَمِّ وَفَتَنَّاكَ فُتُونًا فَلَبِثْتَ سِنِينَ فِي أَهْلِ مَدْيَنَ ثُمَّ جِئْتَ عَلَى قَدَرٍ يَامُوسَى (40)"));
        tahaExes.add(new TahaEx("ومننَّا عليك حين تمشي أختك تتبعك ثم تقول لمن أخذوك: هل أدلكم على من يكفُله، ويرضعه لكم؟ فرددناك إلى أمِّك بعد ما صرتَ في أيدي فرعون؛ كي تطيب نفسها بسلامتك من الغرق والقتل، ولا تحزن على فَقْدك، وقتلت الرجل القبطي خطأ فنجيناك من غَمِّ فِعْلك وخوف القتل، وابتليناك ابتلاء، فخرجت خائفًا إلى أهل «مدين» ، فمكثت سنين فيهم، ثم جئت من «مدين» في الموعد الذي قدَّرناه لإرسالك مجيئًا موافقًا لقدر الله وإرادته، والأمر كله لله تبارك وتعالى."));
        tahaExes.add(new TahaEx("وَاصْطَنَعْتُكَ لِنَفْسِي (41)"));
        tahaExes.add(new TahaEx("وأنعمتُ عليك - يا موسى - هذه النعم اجتباء مني لك، واختيارًا لرسالتي، والبلاغ عني، والقيام بأمري ونهيي."));
        tahaExes.add(new TahaEx("اذْهَبْ أَنْتَ وَأَخُوكَ بِآيَاتِي وَلَا تَنِيَا فِي ذِكْرِي (42)"));
        tahaExes.add(new TahaEx("اذهب - يا موسى - أنت وأخوك هارون بآياتي الدالة على ألوهيتي وكمال قدرتي وصدق رسالتك، ولا تَضْعُفا عن مداومة ذكري."));
        tahaExes.add(new TahaEx("اذْهَبَا إِلَى فِرْعَوْنَ إِنَّهُ طَغَى (43)"));
        tahaExes.add(new TahaEx("اذهبا معًا إلى فرعون; إنه قد جاوز الحد في الكفر والظلم."));
        tahaExes.add(new TahaEx("فَقُولَا لَهُ قَوْلًا لَيِّنًا لَعَلَّهُ يَتَذَكَّرُ أَوْ يَخْشَى (44)"));
        tahaExes.add(new TahaEx("فقولا له قولا لطيفًا; لعله يتذكر أو يخاف ربه."));
        tahaExes.add(new TahaEx("قَالَا رَبَّنَا إِنَّنَا نَخَافُ أَنْ يَفْرُطَ عَلَيْنَا أَوْ أَنْ يَطْغَى (45)"));
        tahaExes.add(new TahaEx("قال موسى وهارون: ربنا إننا نخاف أن يعاجلنا بالعقوبة، أو أن يتمرد على الحق فلا يقبله."));
        tahaExes.add(new TahaEx("قَالَ لَا تَخَافَا إِنَّنِي مَعَكُمَا أَسْمَعُ وَأَرَى (46)"));
        tahaExes.add(new TahaEx("قال الله لموسى وهارون: لا تخافا من فرعون; فإنني معكما أسمع كلامكما وأرى أفعالكما."));
        tahaExes.add(new TahaEx("فَأْتِيَاهُ فَقُولَا إِنَّا رَسُولَا رَبِّكَ فَأَرْسِلْ مَعَنَا بَنِي إِسْرَائِيلَ وَلَا تُعَذِّبْهُمْ قَدْ جِئْنَاكَ بِآيَةٍ مِنْ رَبِّكَ وَالسَّلَامُ عَلَى مَنِ اتَّبَعَ الْهُدَى (47)"));
        tahaExes.add(new TahaEx("فاذهبا إليه وقولا له: إننا رسولان إليك من ربك أن أطلق بني إسرائيل، ولا تكلِّفهم ما لا يطيقون من الأعمال، قد أتيناك بدلالة معجزة من ربك تدل على صدقنا في دعوتنا، والسلامة من عذاب الله تعالى لمن اتبع هداه."));
        tahaExes.add(new TahaEx("إِنَّا قَدْ أُوحِيَ إِلَيْنَا أَنَّ الْعَذَابَ عَلَى مَنْ كَذَّبَ وَتَوَلَّى (48)"));
        tahaExes.add(new TahaEx("إن ربك قد أوحى إلينا أن عذابه على مَن كذَّب وأعرض عن دعوته وشريعته."));
        tahaExes.add(new TahaEx("قَالَ فَمَنْ رَبُّكُمَا يَامُوسَى (49)"));
        tahaExes.add(new TahaEx("قال فرعون لهما -على وجه الإنكار-: فمَن ربكما يا موسى؟"));
        tahaExes.add(new TahaEx("قَالَ رَبُّنَا الَّذِي أَعْطَى كُلَّ شَيْءٍ خَلْقَهُ ثُمَّ هَدَى (50)"));
        tahaExes.add(new TahaEx("قال له موسى: ربنا الذي أعطى كل شيء خَلْقَه اللائق به على حسن صنعه، ثم هدى كل مخلوق الهداية الكاملة إلى الانتفاع بما خلقه الله له."));
        tahaExes.add(new TahaEx("قَالَ فَمَا بَالُ الْقُرُونِ الْأُولَى (51)"));
        tahaExes.add(new TahaEx("قال فرعون لموسى -على وجه المغالطة والمشاغبة-: فما شأن الأمم السابقة؟ وما خبر القرون الماضية، فقد سبقونا إلى الإنكار والكفر؟"));
        tahaExes.add(new TahaEx("قَالَ عِلْمُهَا عِنْدَ رَبِّي فِي كِتَابٍ لَا يَضِلُّ رَبِّي وَلَا يَنْسَى (52)"));
        tahaExes.add(new TahaEx("قال موسى لفرعون: ما سألت عنه مما نحن بصدده، بل عِلْمُ تلك القرون فيما فَعَلَت من ذلك عند ربي في اللوح المحفوظ، ولا عِلْمَ لي به، لا يضل ربي في أفعاله وأحكامه، ولا ينسى شيئًا ممَّا علمه منها."));
        tahaExes.add(new TahaEx("الَّذِي جَعَلَ لَكُمُ الْأَرْضَ مَهْدًا وَسَلَكَ لَكُمْ فِيهَا سُبُلًا وَأَنْزَلَ مِنَ السَّمَاءِ مَاءً فَأَخْرَجْنَا بِهِ أَزْوَاجًا مِنْ نَبَاتٍ شَتَّى (53)"));
        tahaExes.add(new TahaEx("هو الذي جعل لكم الأرض ميسَّرة للانتفاع بها، وجعل لكم فيها طرقًا كثيرة، وأنزل من السماء مطرًا، فأخرج به أنواعًا مختلفة من النبات."));
        tahaExes.add(new TahaEx("كُلُوا وَارْعَوْا أَنْعَامَكُمْ إِنَّ فِي ذَلِكَ لَآيَاتٍ لِأُولِي النُّهَى (54)"));
        tahaExes.add(new TahaEx("كلوا - أيها الناس - من طيبات ما أنبتنا لكم، وارعوا حيواناتكم وبهائمكم. إن في كل ما ذُكر لَعلامات على قدرة الله، ودعوة لوحدانيته وإفراده بالعبادة، لذوي العقول السليمة."));
        tahaExes.add(new TahaEx("مِنْهَا خَلَقْنَاكُمْ وَفِيهَا نُعِيدُكُمْ وَمِنْهَا نُخْرِجُكُمْ تَارَةً أُخْرَى (55)"));
        tahaExes.add(new TahaEx("من الأرض خَلَقْناكم - أيها الناس -، وفيها نعيدكم بعد الموت، ومنها نخرجكم أحياء مرة أخرى للحساب والجزاء."));
        tahaExes.add(new TahaEx("وَلَقَدْ أَرَيْنَاهُ آيَاتِنَا كُلَّهَا فَكَذَّبَ وَأَبَى (56)"));
        tahaExes.add(new TahaEx("ولقد أرينا فرعون أدلتنا وحججنا جميعها، الدالة على ألوهيتنا وقدرتنا وصِدْقِ رسالة موسى فكذَّب بها، وامتنع عن قَبول الحق."));
        tahaExes.add(new TahaEx("قَالَ أَجِئْتَنَا لِتُخْرِجَنَا مِنْ أَرْضِنَا بِسِحْرِكَ يَامُوسَى (57)"));
        tahaExes.add(new TahaEx("قال فرعون: هل جئتنا - يا موسى - لتخرجنا من ديارنا بسحرك هذا؟"));
        tahaExes.add(new TahaEx("فَلَنَأْتِيَنَّكَ بِسِحْرٍ مِثْلِهِ فَاجْعَلْ بَيْنَنَا وَبَيْنَكَ مَوْعِدًا لَا نُخْلِفُهُ نَحْنُ وَلَا أَنْتَ مَكَانًا سُوًى (58)"));
        tahaExes.add(new TahaEx("فسوف نأتيك بسحر مثل سحرك، فاجعل بيننا وبينك موعدًا محددًا، لا نخلفه نحن ولا تخلفه أنت، في مكان مستوٍ معتدل بيننا وبينك."));
        tahaExes.add(new TahaEx("قَالَ مَوْعِدُكُمْ يَوْمُ الزِّينَةِ وَأَنْ يُحْشَرَ النَّاسُ ضُحًى (59)"));
        tahaExes.add(new TahaEx("قال موسى لفرعون: موعدكم للاجتماع يوم العيد، حين يتزيَّن الناس، ويجتمعون من كل فج وناحية وقت الضحى."));
        tahaExes.add(new TahaEx("فَتَوَلَّى فِرْعَوْنُ فَجَمَعَ كَيْدَهُ ثُمَّ أَتَى (60)"));
        tahaExes.add(new TahaEx("فأدبر فرعون معرضًا عما أتاه به موسى من الحق، فجمع سحرته، ثم جاء بعد ذلك لموعد الاجتماع."));
        tahaExes.add(new TahaEx("قَالَ لَهُمْ مُوسَى وَيْلَكُمْ لَا تَفْتَرُوا عَلَى اللَّهِ كَذِبًا فَيُسْحِتَكُمْ بِعَذَابٍ وَقَدْ خَابَ مَنِ افْتَرَى (61)"));
        tahaExes.add(new TahaEx("قال موسى لسحرة فرعون يعظهم: احذروا، لا تختلقوا على الله الكذب، فيستأصلكم بعذاب مِن عنده ويُبيدكم، وقد خسر من اختلق على الله كذبًا."));
        tahaExes.add(new TahaEx("فَتَنَازَعُوا أَمْرَهُمْ بَيْنَهُمْ وَأَسَرُّوا النَّجْوَى (62)"));
        tahaExes.add(new TahaEx("فتجاذب السحرة أمرهم بينهم وتحادثوا سرًا."));
        tahaExes.add(new TahaEx("قَالُوا إِنْ هَذَانِ لَسَاحِرَانِ يُرِيدَانِ أَنْ يُخْرِجَاكُمْ مِنْ أَرْضِكُمْ بِسِحْرِهِمَا وَيَذْهَبَا بِطَرِيقَتِكُمُ الْمُثْلَى (63)"));
        tahaExes.add(new TahaEx("قالوا: إن موسى وهارون ساحران يريدان أن يخرجاكم من بلادكم بسحرهما، ويذهبا بطريقة السحر العظيمة التي أنتم عليها."));
        tahaExes.add(new TahaEx("فَأَجْمِعُوا كَيْدَكُمْ ثُمَّ ائْتُوا صَفًّا وَقَدْ أَفْلَحَ الْيَوْمَ مَنِ اسْتَعْلَى (64)"));
        tahaExes.add(new TahaEx("فأحكموا كيدكم، واعزموا عليه من غير اختلاف بينكم، ثم ائتوا صفًا واحدًا، وألقوا ما في أيديكم مرة واحدة; لتَبْهَروا الأبصار، وتغلبوا سحر موسى وأخيه، وقد ظفر بحاجته اليوم مَن علا على صاحبه، فغلبه وقهره."));
        tahaExes.add(new TahaEx("قَالُوا يَامُوسَى إِمَّا أَنْ تُلْقِيَ وَإِمَّا أَنْ نَكُونَ أَوَّلَ مَنْ أَلْقَى (65)"));
        tahaExes.add(new TahaEx("قال السحرة: يا موسى إما أن تلقي عصاك أولا وإما أن نبدأ نحن فنلقي ما معنا."));
        tahaExes.add(new TahaEx("قَالَ بَلْ أَلْقُوا فَإِذَا حِبَالُهُمْ وَعِصِيُّهُمْ يُخَيَّلُ إِلَيْهِ مِنْ سِحْرِهِمْ أَنَّهَا تَسْعَى (66)"));
        tahaExes.add(new TahaEx("قال لهم موسى: بل ألقُوا أنتم ما معكم أولا فألقَوا حبالهم وعصيَّهم."));
        tahaExes.add(new TahaEx("فَأَوْجَسَ فِي نَفْسِهِ خِيفَةً مُوسَى (67)"));
        tahaExes.add(new TahaEx("فتخيل موسى مِن قوة سحرهم أنها حيات تسعى، فشعر موسى في نفسه بالخوف."));
        tahaExes.add(new TahaEx("قُلْنَا لَا تَخَفْ إِنَّكَ أَنْتَ الْأَعْلَى (68)"));
        tahaExes.add(new TahaEx("قال الله لموسى حينئذ: لا تَخَفْ من شيء، فإنك أنت الأعلى على هؤلاء السحرة وعلى فرعون وجنوده، وستغلبهم."));
        tahaExes.add(new TahaEx("وَأَلْقِ مَا فِي يَمِينِكَ تَلْقَفْ مَا صَنَعُوا إِنَّمَا صَنَعُوا كَيْدُ سَاحِرٍ وَلَا يُفْلِحُ السَّاحِرُ حَيْثُ أَتَى (69)"));
        tahaExes.add(new TahaEx("وألق عصاك التي في يمينك تبتلع حبالهم وعصيهم، فما عملوه أمامك ما هو إلا مكر ساحرٍ وتخييل سِحْرٍ، ولا يظفر الساحر بسحره أين كان."));
        tahaExes.add(new TahaEx("فَأُلْقِيَ السَّحَرَةُ سُجَّدًا قَالُوا آمَنَّا بِرَبِّ هَارُونَ وَمُوسَى (70)"));
        tahaExes.add(new TahaEx("فألقى موسى عصاه، فبلعت ما صنعوا، فظهر الحق وقامت الحجة عليهم. فألقى السحرة أنفسهم على الأرض ساجدين وقالوا: آمنا برب هارون وموسى، لو كان هذا سحرًا ما غُلِبْنا."));
        tahaExes.add(new TahaEx("قَالَ آمَنْتُمْ لَهُ قَبْلَ أَنْ آذَنَ لَكُمْ إِنَّهُ لَكَبِيرُكُمُ الَّذِي عَلَّمَكُمُ السِّحْرَ فَلَأُقَطِّعَنَّ أَيْدِيَكُمْ وَأَرْجُلَكُمْ مِنْ خِلَافٍ وَلَأُصَلِّبَنَّكُمْ فِي جُذُوعِ النَّخْلِ وَلَتَعْلَمُنَّ أَيُّنَا أَشَدُّ عَذَابًا وَأَبْقَى (71)"));
        tahaExes.add(new TahaEx("قال فرعون للسحرة: أصدَّقتم بموسى، واتبعتموه، وأقررتم له قبل أن آذن لكم بذلك؟ إن موسى لَعظيمكم الذي عَلَّمكم السحر; فلذلك تابعتموه، فلأقطعنَّ أيديكم وأرجلكم مخالفًا بينها، يدًا من جهة ورِجْلا من الجهة الأخرى، ولأصلبنَّكم - بربط أجسادكم - على جذوع النخل، ولتعلمنَّ أيها السحرة أينا: أنا أو رب موسى أشد عذابًا من الآخر، وأدوم له؟"));
        tahaExes.add(new TahaEx("قَالُوا لَنْ نُؤْثِرَكَ عَلَى مَا جَاءَنَا مِنَ الْبَيِّنَاتِ وَالَّذِي فَطَرَنَا فَاقْضِ مَا أَنْتَ قَاضٍ إِنَّمَا تَقْضِي هَذِهِ الْحَيَاةَ الدُّنْيَا (72)"));
        tahaExes.add(new TahaEx("قال السحرة لفرعون: لن نفضلك، فنطيعك، ونتبع دينك، على ما جاءنا به موسى من البينات الدالة على صدقه ووجوب متابعته وطاعة ربه، ولن نُفَضِّل ربوبيتك المزعومة على ربوبية اللهِ الذي خلقنا، فافعل ما أنت فاعل بنا، إنما سلطانك في هذه الحياة الدنيا، وما تفعله بنا، ما هو إلا عذاب منتهٍ بانتهائها."));
        tahaExes.add(new TahaEx("إِنَّا آمَنَّا بِرَبِّنَا لِيَغْفِرَ لَنَا خَطَايَانَا وَمَا أَكْرَهْتَنَا عَلَيْهِ مِنَ السِّحْرِ وَاللَّهُ خَيْرٌ وَأَبْقَى (73)"));
        tahaExes.add(new TahaEx("إنَّا آمنا بربنا وصدَّقْنا رسوله وعملنا بما جاء به; ليعفو ربُّنا عن ذنوبنا، وما أكرهتنا عليه مِن عمل السحر في معارضة موسى. والله خير لنا منك - يا فرعون - جزاء لمن أطاعه، وأبقى عذابًا لمن عصاه وخالف أمره."));
        tahaExes.add(new TahaEx("إِنَّهُ مَنْ يَأْتِ رَبَّهُ مُجْرِمًا فَإِنَّ لَهُ جَهَنَّمَ لَا يَمُوتُ فِيهَا وَلَا يَحْيَى (74)"));
        tahaExes.add(new TahaEx("إنه من يأت ربه كافرًا به فإن له نار جهنم يُعَذَّب بها، لا يموت فيها فيستريح، ولا يحيا حياة يتلذذ بها."));
        tahaExes.add(new TahaEx("وَمَنْ يَأْتِهِ مُؤْمِنًا قَدْ عَمِلَ الصَّالِحَاتِ فَأُولَئِكَ لَهُمُ الدَّرَجَاتُ الْعُلَى (75)"));
        tahaExes.add(new TahaEx("ومن يأت ربه مؤمنًا به قد عمل الأعمال الصالحة فله المنازل العالية في جنات الإقامة الدائمة."));
        tahaExes.add(new TahaEx("جَنَّاتُ عَدْنٍ تَجْرِي مِنْ تَحْتِهَا الْأَنْهَارُ خَالِدِينَ فِيهَا وَذَلِكَ جَزَاءُ مَنْ تَزَكَّى (76)"));
        tahaExes.add(new TahaEx("تجري من تحت أشجارها الأنهار ماكثين فيها أبدًا، وذلك النعيم المقيم ثواب من الله لمن طهَّر نفسه من الدنس والخبث والشرك، وعبد الله وحده فأطاعه واجتنب معاصيه، ولقي ربه لا يشرك بعبادته أحدًا من خلقه."));
        tahaExes.add(new TahaEx("وَلَقَدْ أَوْحَيْنَا إِلَى مُوسَى أَنْ أَسْرِ بِعِبَادِي فَاضْرِبْ لَهُمْ طَرِيقًا فِي الْبَحْرِ يَبَسًا لَا تَخَافُ دَرَكًا وَلَا تَخْشَى (77)"));
        tahaExes.add(new TahaEx("ولقد أوحينا إلى موسى: أن اخرُج ليلا بعبادي من بني إسرائيل من «مصر» ، فاتِّخِذْ لهم في البحر طريقًا يابسًا، لا تخاف من فرعون وجنوده أن يلحقوكم فيدركوكم، ولا تخشى في البحر غرقًا."));
        tahaExes.add(new TahaEx("فَأَتْبَعَهُمْ فِرْعَوْنُ بِجُنُودِهِ فَغَشِيَهُمْ مِنَ الْيَمِّ مَا غَشِيَهُمْ (78)"));
        tahaExes.add(new TahaEx("فأسرى موسى ببني إسرائيل، وعبر بهم طريقًا في البحر، فأتبعهم فرعون بجنوده، فغمرهم من الماء ما لا يعلم كنهه إلا الله، فغرقوا جميعًا ونجا موسى وقومه."));
        tahaExes.add(new TahaEx("وَأَضَلَّ فِرْعَوْنُ قَوْمَهُ وَمَا هَدَى (79)"));
        tahaExes.add(new TahaEx("وأضلَّ فرعون قومه بما زيَّنه لهم من الكفر والتكذيب، وما سلك بهم طريق الهداية."));
        tahaExes.add(new TahaEx("يَابَنِي إِسْرَائِيلَ قَدْ أَنْجَيْنَاكُمْ مِنْ عَدُوِّكُمْ وَوَاعَدْنَاكُمْ جَانِبَ الطُّورِ الْأَيْمَنَ وَنَزَّلْنَا عَلَيْكُمُ الْمَنَّ وَالسَّلْوَى (80)"));
        tahaExes.add(new TahaEx("يا بني إسرائيل اذكروا حين أنجيناكم مِن عدوكم فرعون، وجَعَلْنا موعدكم الجانب الأيمن من جبل الطور لإنزال التوراة عليكم، ونزلنا عليكم في التيه ما تأكلونه، مما يشبه الصَّمغ طعمه كالعسل، والطير الذي يشبه السُّمَانَى."));
        tahaExes.add(new TahaEx("كُلُوا مِنْ طَيِّبَاتِ مَا رَزَقْنَاكُمْ وَلَا تَطْغَوْا فِيهِ فَيَحِلَّ عَلَيْكُمْ غَضَبِي وَمَنْ يَحْلِلْ عَلَيْهِ غَضَبِي فَقَدْ هَوَى (81)"));
        tahaExes.add(new TahaEx("كلوا من رزقنا الطيب، ولا تعتدوا فيه بأن يظلم بعضكم بعضًا، فينزل بكم غضبي، ومَن ينزل به غضبي فقد هلك وخسر."));
        tahaExes.add(new TahaEx("وَإِنِّي لَغَفَّارٌ لِمَنْ تَابَ وَآمَنَ وَعَمِلَ صَالِحًا ثُمَّ اهْتَدَى (82)"));
        tahaExes.add(new TahaEx("وإني لَغفار لمن تاب من ذنبه وكفره، وآمن بي وعمل الأعمال الصالحة، ثم اهتدى إلى الحق واستقام عليه."));
        tahaExes.add(new TahaEx("وَمَا أَعْجَلَكَ عَنْ قَوْمِكَ يَامُوسَى (83)"));
        tahaExes.add(new TahaEx("وأيُّ شيء أعجلك عن قومك - يا موسى - فسبقتَهم إلى جانب الطور الأيمن، وخلَّفتَهم وراءك؟"));
        tahaExes.add(new TahaEx("قَالَ هُمْ أُولَاءِ عَلَى أَثَرِي وَعَجِلْتُ إِلَيْكَ رَبِّ لِتَرْضَى (84)"));
        tahaExes.add(new TahaEx("قال: إنهم خلفي سوف يلحقون بي، وسبقتُهم إليك - يا ربي - لتزداد عني رضا."));
        tahaExes.add(new TahaEx("قَالَ فَإِنَّا قَدْ فَتَنَّا قَوْمَكَ مِنْ بَعْدِكَ وَأَضَلَّهُمُ السَّامِرِيُّ (85)"));
        tahaExes.add(new TahaEx("قال الله لموسى: فإنا قد ابتلينا قومك بعد فراقك إياهم بعبادة العجل، وإن السامري قد أضلهم."));
        tahaExes.add(new TahaEx("فَرَجَعَ مُوسَى إِلَى قَوْمِهِ غَضْبَانَ أَسِفًا قَالَ يَاقَوْمِ أَلَمْ يَعِدْكُمْ رَبُّكُمْ وَعْدًا حَسَنًا أَفَطَالَ عَلَيْكُمُ الْعَهْدُ أَمْ أَرَدْتُمْ أَنْ يَحِلَّ عَلَيْكُمْ غَضَبٌ مِنْ رَبِّكُمْ فَأَخْلَفْتُمْ مَوْعِدِي (86)"));
        tahaExes.add(new TahaEx("فرجع موسى إلى قومه غضبان عليهم حزينًا، وقال لهم: يا قوم ألم يَعِدْكم ربكم وعدًا حسنًا بإنزال التوراة؟\n" +
                "أفطال عليكم العهد واستبطأتم الوعد، أم أردتم أن تفعلوا فعلا يحل عليكم بسببه غضب من ربكم، فأخلفتم موعدي وعبدتم العجل، وتركتم الالتزام بأوامري؟\n"));
        tahaExes.add(new TahaEx("قَالُوا مَا أَخْلَفْنَا مَوْعِدَكَ بِمَلْكِنَا وَلَكِنَّا حُمِّلْنَا أَوْزَارًا مِنْ زِينَةِ الْقَوْمِ فَقَذَفْنَاهَا فَكَذَلِكَ أَلْقَى السَّامِرِيُّ (87)"));
        tahaExes.add(new TahaEx("قالوا: يا موسى ما أخلفنا موعدك باختيارنا، ولكنَّا حُمِّلنا أثقالا مِن حليِّ قوم فرعون، فألقيناها في حفرة فيها نار بأمر السامري، فكذلك ألقى السامري ما كان معه من تربة حافر فرس جبريل عليه السلام."));
        tahaExes.add(new TahaEx("فَأَخْرَجَ لَهُمْ عِجْلًا جَسَدًا لَهُ خُوَارٌ فَقَالُوا هَذَا إِلَهُكُمْ وَإِلَهُ مُوسَى فَنَسِيَ (88)"));
        tahaExes.add(new TahaEx("فصنع السامري لبني إسرائيل من الذهب عجلا جسدًا يخور خوار البقر، فقال المفتونون به منهم للآخرين: هذا هو إلهكم وإله موسى، نسيه وغَفَل عنه."));
        tahaExes.add(new TahaEx("أَفَلَا يَرَوْنَ أَلَّا يَرْجِعُ إِلَيْهِمْ قَوْلًا وَلَا يَمْلِكُ لَهُمْ ضَرًّا وَلَا نَفْعًا (89)"));
        tahaExes.add(new TahaEx("أفلا يرى الذين عبدوا العجل أنه لا يكلمهم ابتداء، ولا يردُّ عليهم جوابًا، ولا يقدر على دفع ضرٍّ عنهم، ولا جلب نفع لهم؟"));
        tahaExes.add(new TahaEx("وَلَقَدْ قَالَ لَهُمْ هَارُونُ مِنْ قَبْلُ يَاقَوْمِ إِنَّمَا فُتِنْتُمْ بِهِ وَإِنَّ رَبَّكُمُ الرَّحْمَنُ فَاتَّبِعُونِي وَأَطِيعُوا أَمْرِي (90)"));
        tahaExes.add(new TahaEx("ولقد قال هارون لبني إسرائيل من قبل رجوع موسى إليهم: يا قوم إنما اختُبرتم بهذا العجل؛ ليظهر المؤمن منكم من الكافر، وإن ربكم الرحمن لا غيره فاتبعوني فيما أدعوكم إليه من عبادة الله، وأطيعوا أمري في اتباع شرعه."));
        tahaExes.add(new TahaEx("قَالُوا لَنْ نَبْرَحَ عَلَيْهِ عَاكِفِينَ حَتَّى يَرْجِعَ إِلَيْنَا مُوسَى (91)"));
        tahaExes.add(new TahaEx("قال عُبَّاد العجل منهم: لن نزال مقيمين على عبادة العجل حتى يرجع إلينا موسى."));
        tahaExes.add(new TahaEx("قَالَ يَاهَارُونُ مَا مَنَعَكَ إِذْ رَأَيْتَهُمْ ضَلُّوا (92)"));
        tahaExes.add(new TahaEx("قال موسى لأخيه هارون: أيُّ شيء منعك حين رأيتهم ضلُّوا عن دينهم أن لا تتبعني، فتلحق بي وتتركهم؟"));
        tahaExes.add(new TahaEx("أَلَّا تَتَّبِعَنِ أَفَعَصَيْتَ أَمْرِي (93)"));
        tahaExes.add(new TahaEx("أفعصيت أمري فيما أمرتك به من خلافتي والإصلاح بعدي؟"));
        tahaExes.add(new TahaEx("قَالَ يَبْنَؤُمَّ لَا تَأْخُذْ بِلِحْيَتِي وَلَا بِرَأْسِي إِنِّي خَشِيتُ أَنْ تَقُولَ فَرَّقْتَ بَيْنَ بَنِي إِسْرَائِيلَ وَلَمْ تَرْقُبْ قَوْلِي (94)"));
        tahaExes.add(new TahaEx("ثم أخذ موسى بلحية هارون ورأسه يجرُّه إليه، فقال له هارون: يا ابن أمي لا تمسك بلحيتي ولا بشعر رأسي، إني خفتُ - إن تركتهم ولحقت بك - أن تقول: فرَّقت بين بني إسرائيل، ولم تحفظ وصيتي بحسن رعايتهم."));
        tahaExes.add(new TahaEx("قَالَ فَمَا خَطْبُكَ يَاسَامِرِيُّ (95)"));
        tahaExes.add(new TahaEx("قال موسى للسامري: فما شأنك يا سامري؟ وما الذي دعاك إلى ما فعلته؟"));
        tahaExes.add(new TahaEx("قَالَ بَصُرْتُ بِمَا لَمْ يَبْصُرُوا بِهِ فَقَبَضْتُ قَبْضَةً مِنْ أَثَرِ الرَّسُولِ فَنَبَذْتُهَا وَكَذَلِكَ سَوَّلَتْ لِي نَفْسِي (96)"));
        tahaExes.add(new TahaEx("قال السامري: رأيت ما لم يروه - وهو جبريل عليه السلام - على فرس، وقت خروجهم من البحر وغرق فرعون وجنوده، فأخذتُ بكفي ترابا من أثر حافر فرس جبريل، فألقيته على الحليِّ الذي صنعت منه العجل، فكان عجلا جسدًا له خوار؛ بلاء وفتنة، وكذلك زيَّنت لي نفسي الأمَّارة بالسوء هذا الصنيع."));
        tahaExes.add(new TahaEx("قَالَ فَاذْهَبْ فَإِنَّ لَكَ فِي الْحَيَاةِ أَنْ تَقُولَ لَا مِسَاسَ وَإِنَّ لَكَ مَوْعِدًا لَنْ تُخْلَفَهُ وَانْظُرْ إِلَى إِلَهِكَ الَّذِي ظَلْتَ عَلَيْهِ عَاكِفًا لَنُحَرِّقَنَّهُ ثُمَّ لَنَنْسِفَنَّهُ فِي الْيَمِّ نَسْفًا (97)"));
        tahaExes.add(new TahaEx("قال موسى للسامري: فاذهب فإن عقوبتك في الحياة الدنيا أن تعيش منبوذًا تقول لكل أحد: لا أَمَسُّ ولا أُمَسُّ، وإن لك موعدا لعذابك وعقابك، لن يُخْلفك الله إياه، وسوف تلقاه، وانظر إلى معبودك الذي أقمت على عبادته لنُحرقنَّه بالنار، ثم لنُذرونَّه في البحر ذروا لتذهب به الريح؛ حتى لا يبقى منه أثر."));
        tahaExes.add(new TahaEx("إِنَّمَا إِلَهُكُمُ اللَّهُ الَّذِي لَا إِلَهَ إِلَّا هُوَ وَسِعَ كُلَّ شَيْءٍ عِلْمًا (98)"));
        tahaExes.add(new TahaEx("إنما إلهكم - أيها الناس - هو الله الذي لا معبود بحق إلا هو، وسع علمه كل شيء."));
        tahaExes.add(new TahaEx("كَذَلِكَ نَقُصُّ عَلَيْكَ مِنْ أَنْبَاءِ مَا قَدْ سَبَقَ وَقَدْ آتَيْنَاكَ مِنْ لَدُنَّا ذِكْرًا (99)"));
        tahaExes.add(new TahaEx("كما قصصنا عليك - أيها الرسول - أنباء موسى وفرعون وقومهما، نخبرك بأنباء السابقين لك. وقد آتيناك مِن عندنا هذا القرآن ذكرى لمن يتذكر."));
        tahaExes.add(new TahaEx("مَنْ أَعْرَضَ عَنْهُ فَإِنَّهُ يَحْمِلُ يَوْمَ الْقِيَامَةِ وِزْرًا (100)"));
        tahaExes.add(new TahaEx("من أعرض عن هذا القرآن، ولم يصدق به، ولم يعمل بما فيه، فإنه يأتي ربه يوم القيامة يحمل إثمًا عظيمًا."));
        tahaExes.add(new TahaEx("خَالِدِينَ فِيهِ وَسَاءَ لَهُمْ يَوْمَ الْقِيَامَةِ حِمْلًا (101)"));
        tahaExes.add(new TahaEx("خالدين في العذاب، وساءهم ذلك الحمل الثقيل من الآثام حيث أوردهم النار."));
        tahaExes.add(new TahaEx("يَوْمَ يُنْفَخُ فِي الصُّورِ وَنَحْشُرُ الْمُجْرِمِينَ يَوْمَئِذٍ زُرْقًا (102)"));
        tahaExes.add(new TahaEx("يوم يَنفُخ الملَكُ في «القرن» لصيحة البعث، ونسوق الكافرين ذلكم اليوم وهم زرق، تغيَّرت ألوانهم وعيونهم; من شدة الأحداث والأهوال."));
        tahaExes.add(new TahaEx("يَتَخَافَتُونَ بَيْنَهُمْ إِنْ لَبِثْتُمْ إِلَّا عَشْرًا (103)"));
        tahaExes.add(new TahaEx("يتهامسون بينهم، يقول بعضهم لبعض: ما لبثتم في الحياة الدنيا إلا عشرة أيام."));
        tahaExes.add(new TahaEx("نَحْنُ أَعْلَمُ بِمَا يَقُولُونَ إِذْ يَقُولُ أَمْثَلُهُمْ طَرِيقَةً إِنْ لَبِثْتُمْ إِلَّا يَوْمًا (104)"));
        tahaExes.add(new TahaEx("نحن أعلم بما يقولون ويُسِرُّون حين يقول أعلمهم وأوفاهم عقلا ما لبثتم إلا يومًا واحدًا; لقِصَر مدة الدنيا في أنفسهم يوم القيامة."));
        tahaExes.add(new TahaEx("وَيَسْأَلُونَكَ عَنِ الْجِبَالِ فَقُلْ يَنْسِفُهَا رَبِّي نَسْفًا (105)"));
        tahaExes.add(new TahaEx("ويسألك - أيها الرسول - قومك عن مصير الجبال يوم القيامة، فقل لهم: يزيلها ربِّي عن أماكنها فيجعلها هباء منبثًا."));
        tahaExes.add(new TahaEx("فَيَذَرُهَا قَاعًا صَفْصَفًا (106)"));
        tahaExes.add(new TahaEx("فيترك الأرض حينئذ منبسطة مستوية ملساء لا نبات فيها."));
        tahaExes.add(new TahaEx("لَا تَرَى فِيهَا عِوَجًا وَلَا أَمْتًا (107)"));
        tahaExes.add(new TahaEx("فيترك الأرض حينئذ منبسطة مستوية ملساء لا نبات فيها، لا يرى الناظر إليها مِن استوائها مَيْلا ولا ارتفاعًا ولا انخفاضًا."));
        tahaExes.add(new TahaEx("يَوْمَئِذٍ يَتَّبِعُونَ الدَّاعِيَ لَا عِوَجَ لَهُ وَخَشَعَتِ الْأَصْوَاتُ لِلرَّحْمَنِ فَلَا تَسْمَعُ إِلَّا هَمْسًا (108)"));
        tahaExes.add(new TahaEx("في ذلك اليوم يتبع الناس صوت الداعي إلى موقف القيامة، لا محيد عن دعوة الداعي; لأنها حق وصدق لجميع الخلق، وسكنت الأصوات خضوعًا للرحمن، فلا تسمع منها إلا صوتًا خفيًا."));
        tahaExes.add(new TahaEx("يَوْمَئِذٍ لَا تَنْفَعُ الشَّفَاعَةُ إِلَّا مَنْ أَذِنَ لَهُ الرَّحْمَنُ وَرَضِيَ لَهُ قَوْلًا (109)"));
        tahaExes.add(new TahaEx("في ذلك اليوم لا تنفع الشفاعة أحدًا من الخلق، إلا إذا أذن الرحمن للشافع، ورضي عن المشفوع له، ولا يكون ذلك إلا للمؤمن المخلص."));
        tahaExes.add(new TahaEx("يَعْلَمُ مَا بَيْنَ أَيْدِيهِمْ وَمَا خَلْفَهُمْ وَلَا يُحِيطُونَ بِهِ عِلْمًا (110)"));
        tahaExes.add(new TahaEx("يعلم الله ما بين أيدي الناس مِن أمر القيامة وما خلفهم من أمر الدنيا، ولا يحيط خلقه به علمًا سبحانه وتعالى."));
        tahaExes.add(new TahaEx("وَعَنَتِ الْوُجُوهُ لِلْحَيِّ الْقَيُّومِ وَقَدْ خَابَ مَنْ حَمَلَ ظُلْمًا (111)"));
        tahaExes.add(new TahaEx("وخضعت وجوه الخلائق، وذلَّت لخالقها، الذي له جميع معاني الحياة الكاملة كما يليق بجلاله الذي لا يموت، القائم على تدبير كلِّ شيء، المستغني عمَّن سواه. وقد خسر يوم القيامة مَن أشرك مع الله أحدًا من خلقه."));
        tahaExes.add(new TahaEx("وَمَنْ يَعْمَلْ مِنَ الصَّالِحَاتِ وَهُوَ مُؤْمِنٌ فَلَا يَخَافُ ظُلْمًا وَلَا هَضْمًا (112)"));
        tahaExes.add(new TahaEx("ومن يعمل صالحات الأعمال وهو مؤمن بربه، فلا يخاف ظلمًا بزيادة سيئاته، ولا هضمًا بنقص حسناته."));
        tahaExes.add(new TahaEx("وَكَذَلِكَ أَنْزَلْنَاهُ قُرْآنًا عَرَبِيًّا وَصَرَّفْنَا فِيهِ مِنَ الْوَعِيدِ لَعَلَّهُمْ يَتَّقُونَ أَوْ يُحْدِثُ لَهُمْ ذِكْرًا (113)"));
        tahaExes.add(new TahaEx("وكما رغَّبنا أهل الإيمان في صالحات الأعمال، وحذَّرنا أهل الكفر من المقام على معاصيهم وكفرهم بآياتنا، أنزلنا هذا القرآن باللسان العربي; ليفهموه، وفصَّلنا فيه أنواعًا من الوعيد; رجاء أن يتقوا ربهم، أو يُحدِث لهم هذا القرآن تذكرة، فيتعظوا، ويعتبروا."));
        tahaExes.add(new TahaEx("فَتَعَالَى اللَّهُ الْمَلِكُ الْحَقُّ وَلَا تَعْجَلْ بِالْقُرْآنِ مِنْ قَبْلِ أَنْ يُقْضَى إِلَيْكَ وَحْيُهُ وَقُلْ رَبِّ زِدْنِي عِلْمًا (114)"));
        tahaExes.add(new TahaEx("فتنزَّه الله - سبحانه - وارتفع، وتقدَّس عن كل نقص، الملك الذي قهر سلطانه كل ملك وجبار، المتصرف بكل شيء، الذي هو حق، ووعده حق، ووعيده حق، وكل شيء منه حق. ولا تعجل - أيها الرسول - بمسابقة جبريل في تَلَقِّي القرآن قبل أن يَفْرَغ منه، وقل: ربِّ زدني علمًا إلى ما علمتني."));
        tahaExes.add(new TahaEx("وَلَقَدْ عَهِدْنَا إِلَى آدَمَ مِنْ قَبْلُ فَنَسِيَ وَلَمْ نَجِدْ لَهُ عَزْمًا (115)"));
        tahaExes.add(new TahaEx("ولقد وصينا آدم مِن قَبلِ أن يأكل من الشجرة، ألا يأكل منها، وقلنا له: إن إبليس عدو لك ولزوجك، فلا يخرجنكما من الجنة، فتشقى أنت وزوجك في الدنيا، فوسوس إليه الشيطان فأطاعه، ونسي آدم الوصية، ولم نجد له قوة في العزم يحفظ بها ما أُمر به."));
        tahaExes.add(new TahaEx("وَإِذْ قُلْنَا لِلْمَلَائِكَةِ اسْجُدُوا لِآدَمَ فَسَجَدُوا إِلَّا إِبْلِيسَ أَبَى (116)"));
        tahaExes.add(new TahaEx("واذكر - أيها الرسول - إذ قلنا للملائكة: اسجدوا لآدم سجود تحية وإكرام، فأطاعوا، وسجدوا، لكن إبليس امتنع من السجود."));
        tahaExes.add(new TahaEx("فَقُلْنَا يَاآدَمُ إِنَّ هَذَا عَدُوٌّ لَكَ وَلِزَوْجِكَ فَلَا يُخْرِجَنَّكُمَا مِنَ الْجَنَّةِ فَتَشْقَى (117)"));
        tahaExes.add(new TahaEx("فقلنا: يا آدم إن إبليس هذا عدو لك ولزوجتك، فاحذرا منه، ولا تطيعاه بمعصيتي، فيخرجكما من الجنة، فتشقى إذا أُخرجت منها."));
        tahaExes.add(new TahaEx("إِنَّ لَكَ أَلَّا تَجُوعَ فِيهَا وَلَا تَعْرَى (118)"));
        tahaExes.add(new TahaEx("إن لك - يا آدم - في هذه الجنة أن تأكل فلا تجوع، وأن تَلْبَس فلا تَعْرى."));
        tahaExes.add(new TahaEx("وَأَنَّكَ لَا تَظْمَأُ فِيهَا وَلَا تَضْحَى (119)"));
        tahaExes.add(new TahaEx("وأن لك ألا تعطش في هذه الجنة ولا يصيبك حر الشمس."));
        tahaExes.add(new TahaEx("فَوَسْوَسَ إِلَيْهِ الشَّيْطَانُ قَالَ يَاآدَمُ هَلْ أَدُلُّكَ عَلَى شَجَرَةِ الْخُلْدِ وَمُلْكٍ لَا يَبْلَى (120)"));
        tahaExes.add(new TahaEx("فوسوس الشيطان لآدم وقال له: هل أدلك على شجرة، إن أكلت منها خُلِّدتَ فلم تمت، وملكت مُلْكًا لا ينقضي ولا ينقطع؟"));
        tahaExes.add(new TahaEx("فَأَكَلَا مِنْهَا فَبَدَتْ لَهُمَا سَوْآتُهُمَا وَطَفِقَا يَخْصِفَانِ عَلَيْهِمَا مِنْ وَرَقِ الْجَنَّةِ وَعَصَى آدَمُ رَبَّهُ فَغَوَى (121)"));
        tahaExes.add(new TahaEx("فأكل آدم وحواء من الشجرة التي نهاهما الله عنها، فانكشفت لهما عوراتهما، وكانت مستورةً عن أعينهما، فأخذا ينزعان من ورق أشجار الجنة ويلصقانه عليهما; ليسترا ما انكشف من عوراتهما، وخالف آدم أمر ربه، فغوى بالأكل من الشجرة التي نهاه الله عن الاقتراب منها."));
        tahaExes.add(new TahaEx("ثُمَّ اجْتَبَاهُ رَبُّهُ فَتَابَ عَلَيْهِ وَهَدَى (122)"));
        tahaExes.add(new TahaEx("ثم اصطفى الله آدم، وقرَّبه، وقَبِل توبته، وهداه رشده."));
        tahaExes.add(new TahaEx("قَالَ اهْبِطَا مِنْهَا جَمِيعًا بَعْضُكُمْ لِبَعْضٍ عَدُوٌّ فَإِمَّا يَأْتِيَنَّكُمْ مِنِّي هُدًى فَمَنِ اتَّبَعَ هُدَايَ فَلَا يَضِلُّ وَلَا يَشْقَى (123)"));
        tahaExes.add(new TahaEx("قال الله تعالى لآدم وحواء: اهبطا من الجنة إلى الأرض جميعًا مع إبليس، فأنتما وهو أعداء، فإن يأتكم مني هدى وبيان فمن اتبع هداي وبياني وعمل بهما فإنه يرشد في الدنيا، ويهتدي، ولا يشقى في الآخرة بعقاب الله."));
        tahaExes.add(new TahaEx("وَمَنْ أَعْرَضَ عَنْ ذِكْرِي فَإِنَّ لَهُ مَعِيشَةً ضَنْكًا وَنَحْشُرُهُ يَوْمَ الْقِيَامَةِ أَعْمَى (124)"));
        tahaExes.add(new TahaEx("ومن تولَّى عن ذكري الذي أذكِّره به فإن له في الحياة الأولى معيشة ضيِّقة شاقة -وإن ظهر أنه من أهل الفضل واليسار-، ويُضيَّق قبره عليه ويعذَّب فيه، ونحشره يوم القيامة أعمى عن الرؤية وعن الحجة."));
        tahaExes.add(new TahaEx("قَالَ رَبِّ لِمَ حَشَرْتَنِي أَعْمَى وَقَدْ كُنْتُ بَصِيرًا (125)"));
        tahaExes.add(new TahaEx("قال المعرِض عن ذكر الله: ربِّ لِمَ حَشَرْتني أعمى، وقد كنت بصيرًا في الدنيا؟"));
        tahaExes.add(new TahaEx("قَالَ كَذَلِكَ أَتَتْكَ آيَاتُنَا فَنَسِيتَهَا وَكَذَلِكَ الْيَوْمَ تُنْسَى (126)"));
        tahaExes.add(new TahaEx("قال الله تعالى له: حشرتك أعمى; لأنك أتتك آياتي البينات، فأعرضت عنها، ولم تؤمن بها، وكما تركتَها في الدنيا فكذلك اليوم تُترك في النار."));
        tahaExes.add(new TahaEx("وَكَذَلِكَ نَجْزِي مَنْ أَسْرَفَ وَلَمْ يُؤْمِنْ بِآيَاتِ رَبِّهِ وَلَعَذَابُ الْآخِرَةِ أَشَدُّ وَأَبْقَى (127)"));
        tahaExes.add(new TahaEx("وهكذا نعاقب مَن أسرف على نفسه فعصى ربه، ولم يؤمن بآياته بعقوبات في الدنيا، ولَعذاب الآخرة المعدُّ لهم أشد ألمًا وأدوم وأثبت; لأنه لا ينقطع ولا ينقضي."));
        tahaExes.add(new TahaEx("أَفَلَمْ يَهْدِ لَهُمْ كَمْ أَهْلَكْنَا قَبْلَهُمْ مِنَ الْقُرُونِ يَمْشُونَ فِي مَسَاكِنِهِمْ إِنَّ فِي ذَلِكَ لَآيَاتٍ لِأُولِي النُّهَى (128)"));
        tahaExes.add(new TahaEx("أفلم يدل قومك - أيها الرسول - على طريق الرشاد كثرة مَن أهلكنا من الأمم المكذبة قبلهم وهم يمشون في ديارهم، ويرون آثار هلاكهم؟ إن في كثرة تلك الأمم وآثار عذابهم لَعبرًا وعظاتٍ لأهل العقول الواعية."));
        tahaExes.add(new TahaEx("وَلَوْلَا كَلِمَةٌ سَبَقَتْ مِنْ رَبِّكَ لَكَانَ لِزَامًا وَأَجَلٌ مُسَمًّى (129)"));
        tahaExes.add(new TahaEx("ولولا كلمة سبقت من ربك وأجل مسمى عنده للازمهم الهلاك عاجلا، لأنهم يستحقونه؛ بسبب كفرهم."));
        tahaExes.add(new TahaEx("فَاصْبِرْ عَلَى مَا يَقُولُونَ وَسَبِّحْ بِحَمْدِ رَبِّكَ قَبْلَ طُلُوعِ الشَّمْسِ وَقَبْلَ غُرُوبِهَا وَمِنْ آنَاءِ اللَّيْلِ فَسَبِّحْ وَأَطْرَافَ النَّهَارِ لَعَلَّكَ تَرْضَى (130)"));
        tahaExes.add(new TahaEx("فاصبر - أيها الرسول - على ما يقوله المكذبون بك من أوصاف وأباطيل، وسبِّح بحمد ربك في صلاة الفجر قبل طلوع الشمس، وفي صلاة العصر قبل غروبها، وفي صلاة العشاء في ساعات الليل، وسبح بحمد ربك أطراف النهار في صلاة الظهر -إذ وقتها طرف النصف الأول والنصف الثاني من النهار- وفي صلاة المغرب ; كي تثاب على هذه الأعمال بما تَرْضى به."));
        tahaExes.add(new TahaEx("وَلَا تَمُدَّنَّ عَيْنَيْكَ إِلَى مَا مَتَّعْنَا بِهِ أَزْوَاجًا مِنْهُمْ زَهْرَةَ الْحَيَاةِ الدُّنْيَا لِنَفْتِنَهُمْ فِيهِ وَرِزْقُ رَبِّكَ خَيْرٌ وَأَبْقَى (131)"));
        tahaExes.add(new TahaEx("ولا تنظر إلى ما مَتَّعْنا به هؤلاء المشركين وأمثالهم من أنواع المتع، فإنها زينة زائلة في هذه الحياة الدنيا، متعناهم بها; لنبتليهم بها، ورزق ربك وثوابه خير لك مما متعناهم به وأدوم; حيث لا انقطاع له ولا نفاد."));
        tahaExes.add(new TahaEx("وَأْمُرْ أَهْلَكَ بِالصَّلَاةِ وَاصْطَبِرْ عَلَيْهَا لَا نَسْأَلُكَ رِزْقًا نَحْنُ نَرْزُقُكَ وَالْعَاقِبَةُ لِلتَّقْوَى (132)"));
        tahaExes.add(new TahaEx("وَأْمُرْ - أيها النبي - أهلك بالصلاة، واصطبر على أدائها، لا نسألك مالا، نحن نرزقك ونعطيك. والعاقبة الصالحة في الدنيا والآخرة لأهل التقوى."));
        tahaExes.add(new TahaEx("وَقَالُوا لَوْلَا يَأْتِينَا بِآيَةٍ مِنْ رَبِّهِ أَوَلَمْ تَأْتِهِمْ بَيِّنَةُ مَا فِي الصُّحُفِ الْأُولَى (133)"));
        tahaExes.add(new TahaEx("وقال مكذبوك - أيها الرسول -: هلا تأتينا بعلامة من ربك تدلُّ على صدقك، أو لم يأتهم هذا القرآن المصدق لما في الكتب السابقة من الحق؟"));
        tahaExes.add(new TahaEx("وَلَوْ أَنَّا أَهْلَكْنَاهُمْ بِعَذَابٍ مِنْ قَبْلِهِ لَقَالُوا رَبَّنَا لَوْلَا أَرْسَلْتَ إِلَيْنَا رَسُولًا فَنَتَّبِعَ آيَاتِكَ مِنْ قَبْلِ أَنْ نَذِلَّ وَنَخْزَى (134)"));
        tahaExes.add(new TahaEx("ولو أنَّا أهلكنا هؤلاء المكذبين بعذاب من قبل أن نرسل إليهم رسولا وننزل عليهم كتابًا لقالوا: ربنا هلا أرسلت إلينا رسولا من عندك، فنصدقه، ونتبع آياتك وشرعك، مِن قبل أن نَذلَّ ونَخزى بعذابك."));
        tahaExes.add(new TahaEx("قُلْ كُلٌّ مُتَرَبِّصٌ فَتَرَبَّصُوا فَسَتَعْلَمُونَ مَنْ أَصْحَابُ الصِّرَاطِ السَّوِيِّ وَمَنِ اهْتَدَى (135)"));
        tahaExes.add(new TahaEx("قل - أيها الرسول - لهؤلاء المشركين بالله: كل منا ومنكم منتظر دوائر الزمان، ولمن يكون النصر والفلاح، فانتظروا، فستعلمون: مَن أهل الطريق المستقيم، ومَن المهتدي للحق منا ومنكم؟"));

        quran_explanation_20_adapter = new quran_explanation_20_adapter(tahaExes ,QuranExplanation_20Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_20);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_20Activity.this));
        recyclerView.setAdapter(quran_explanation_20_adapter);


    }

}