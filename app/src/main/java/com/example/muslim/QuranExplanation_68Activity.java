package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_68Activity extends AppCompatActivity {

    ArrayList<AlqalamEx> alqalamExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_68_adapter quran_explanation_68_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_68);

        alqalamExes.add(new AlqalamEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alqalamExes.add(new AlqalamEx("ن وَالْقَلَمِ وَمَا يَسْطُرُونَ (1)"));
        alqalamExes.add(new AlqalamEx("{ن} سبق الكلام على الحروف المقطعة في أول سورة البقرة.\n" +
                "أقسم الله بالقلم الذي يكتب به الملائكة والناس، وبما يكتبون من الخير والنفع والعلوم."));
        alqalamExes.add(new AlqalamEx("مَا أَنْتَ بِنِعْمَةِ رَبِّكَ بِمَجْنُونٍ (2)"));
        alqalamExes.add(new AlqalamEx("ما أنت -أيها الرسول- بسبب نعمة الله عليك بالنبوة والرسالة بضعيف العقل، ولا سفيه الرأي."));
        alqalamExes.add(new AlqalamEx("وَإِنَّ لَكَ لَأَجْرًا غَيْرَ مَمْنُونٍ (3)"));
        alqalamExes.add(new AlqalamEx("وإن لك على ما تلقاه من شدائد على تبليغ الرسالة لَثوابًا عظيمًا غير منقوص ولا مقطوع."));
        alqalamExes.add(new AlqalamEx("وَإِنَّكَ لَعَلَى خُلُقٍ عَظِيمٍ (4)"));
        alqalamExes.add(new AlqalamEx("وإنك -أيها الرسول- لعلى خلق عظيم، وهو ما اشتمل عليه القرآن من مكارم الأخلاق؛ فقد كان امتثال القرآن سجية له يأتمر بأمره، وينتهي عما ينهى عنه."));
        alqalamExes.add(new AlqalamEx("فَسَتُبْصِرُ وَيُبْصِرُونَ (5)"));
        alqalamExes.add(new AlqalamEx("فعن قريب سترى -أيها الرسول-، ويرى الكافرون."));
        alqalamExes.add(new AlqalamEx("بِأَيِّكُمُ الْمَفْتُونُ (6)"));
        alqalamExes.add(new AlqalamEx("في أيكم الفتنة والجنون؟"));
        alqalamExes.add(new AlqalamEx("إِنَّ رَبَّكَ هُوَ أَعْلَمُ بِمَنْ ضَلَّ عَنْ سَبِيلِهِ وَهُوَ أَعْلَمُ بِالْمُهْتَدِينَ (7)"));
        alqalamExes.add(new AlqalamEx("إن ربك- سبحانه- هو أعلم بالشقي المنحرف عن دين الله وطريق الهدى، وهو أعلم بالتقي المهتدي إلى دين الحق."));
        alqalamExes.add(new AlqalamEx("فَلَا تُطِعِ الْمُكَذِّبِينَ (8)"));
        alqalamExes.add(new AlqalamEx("فاثبت على ما أنت عليه -أيها الرسول- من مخالفة المكذبين ولا تطعهم."));
        alqalamExes.add(new AlqalamEx("وَدُّوا لَوْ تُدْهِنُ فَيُدْهِنُونَ (9)"));
        alqalamExes.add(new AlqalamEx("تمنَّوا وأحبوا لو تلاينهم، وتصانعهم على بعض ما هم عليه، فيلينون لك."));
        alqalamExes.add(new AlqalamEx("وَلَا تُطِعْ كُلَّ حَلَّافٍ مَهِينٍ (10)"));
        alqalamExes.add(new AlqalamEx("ولا تطع -أيها الرسول- كلَّ إنسانٍ كثير الحلف كذاب حقير."));
        alqalamExes.add(new AlqalamEx("هَمَّازٍ مَشَّاءٍ بِنَمِيمٍ (11)"));
        alqalamExes.add(new AlqalamEx("مغتاب للناس، يمشي بينهم بالنميمة."));
        alqalamExes.add(new AlqalamEx("مَنَّاعٍ لِلْخَيْرِ مُعْتَدٍ أَثِيمٍ (12)"));
        alqalamExes.add(new AlqalamEx("وينقل حديث بعضهم إلى بعض على وجه الإفساد بينهم."));
        alqalamExes.add(new AlqalamEx("عُتُلٍّ بَعْدَ ذَلِكَ زَنِيمٍ (13)"));
        alqalamExes.add(new AlqalamEx("بخيل بالمال ضنين به عن الحق، شديد المنع للخير، متجاوز حدَّه في العدوان على الناس وتناول المحرمات، كثير الآثام، شديد في كفره، فاحش لئيم، منسوب إلى غير أبيه."));
        alqalamExes.add(new AlqalamEx("أَنْ كَانَ ذَا مَالٍ وَبَنِينَ (14)"));
        alqalamExes.add(new AlqalamEx("ومن أجل أنه كان صاحب مال وبنين طغى وتكبر عن الحق."));
        alqalamExes.add(new AlqalamEx("إِذَا تُتْلَى عَلَيْهِ آيَاتُنَا قَالَ أَسَاطِيرُ الْأَوَّلِينَ (15)"));
        alqalamExes.add(new AlqalamEx("فإذا قرأ عليه أحد آيات القرآن كذَّب بها، وقال: هذا أباطيل الأولين وخرافاتهم. وهذه الآيات وإن نزلت في بعض المشركين كالوليد بن المغيرة، إلا أن فيها تحذيرًا للمسلم من موافقة من اتصف بهذه الصفات الذميمة."));
        alqalamExes.add(new AlqalamEx("سَنَسِمُهُ عَلَى الْخُرْطُومِ (16)"));
        alqalamExes.add(new AlqalamEx("سنجعل على أنفه علامة لازمة لا تفارقه عقوبة له; ليكون مفتضحًا بها أمام الناس."));
        alqalamExes.add(new AlqalamEx("إِنَّا بَلَوْنَاهُمْ كَمَا بَلَوْنَا أَصْحَابَ الْجَنَّةِ إِذْ أَقْسَمُوا لَيَصْرِمُنَّهَا مُصْبِحِينَ (17)"));
        alqalamExes.add(new AlqalamEx("إنا اختبرنا أهل «مكة» بالجوع والقحط، كما اختبرنا أصحاب الحديقة حين حلفوا فيما بينهم، ليقطعُنَّ ثمار حديقتهم مبكِّرين في الصباح."));
        alqalamExes.add(new AlqalamEx("وَلَا يَسْتَثْنُونَ (18)"));
        alqalamExes.add(new AlqalamEx("فلا يَطْعَم منها غيرهم من المساكين ونحوهم، ولم يقولوا: إن شاء الله."));
        alqalamExes.add(new AlqalamEx("فَطَافَ عَلَيْهَا طَائِفٌ مِنْ رَبِّكَ وَهُمْ نَائِمُونَ (19)"));
        alqalamExes.add(new AlqalamEx("فأنزل الله عليها نارًا أحرقتها ليلا وهم نائمون."));
        alqalamExes.add(new AlqalamEx("فَأَصْبَحَتْ كَالصَّرِيمِ (20)"));
        alqalamExes.add(new AlqalamEx("فأصبحت محترقة سوداء كالليل المظلم."));
        alqalamExes.add(new AlqalamEx("فَتَنَادَوْا مُصْبِحِينَ (21)"));
        alqalamExes.add(new AlqalamEx("فنادى بعضهم بعضًا وقت الصباح:"));
        alqalamExes.add(new AlqalamEx("أَنِ اغْدُوا عَلَى حَرْثِكُمْ إِنْ كُنْتُمْ صَارِمِينَ (22)"));
        alqalamExes.add(new AlqalamEx("أن اذهبوا مبكرين إلى زرعكم، إن كنتم مصرِّين على قطع الثمار."));
        alqalamExes.add(new AlqalamEx("فَانْطَلَقُوا وَهُمْ يَتَخَافَتُونَ (23)"));
        alqalamExes.add(new AlqalamEx("فاندفعوا مسرعين، وهم يتسارُّون بالحديث فيما بينهم:"));
        alqalamExes.add(new AlqalamEx("أَنْ لَا يَدْخُلَنَّهَا الْيَوْمَ عَلَيْكُمْ مِسْكِينٌ (24)"));
        alqalamExes.add(new AlqalamEx("بأن لا تمكِّنوا اليوم أحدا من المساكين من دخول حديقتكم."));
        alqalamExes.add(new AlqalamEx("وَغَدَوْا عَلَى حَرْدٍ قَادِرِينَ (25)"));
        alqalamExes.add(new AlqalamEx("وساروا في أول النهار إلى حديقتهم على قصدهم السيِّئ في منع المساكين من ثمار الحديقة، وهم في غاية القدرة على تنفيذه في زعمهم."));
        alqalamExes.add(new AlqalamEx("فَلَمَّا رَأَوْهَا قَالُوا إِنَّا لَضَالُّونَ (26)"));
        alqalamExes.add(new AlqalamEx("فلما رأوا حديقتهم محترقة أنكروها، وقالوا: لقد أخطأنا الطريق إليها، فلما عرفوا أنها هي جنتهم."));
        alqalamExes.add(new AlqalamEx("بَلْ نَحْنُ مَحْرُومُونَ (27)"));
        alqalamExes.add(new AlqalamEx("قالوا: بل نحن محرومون خيرها; بسبب عزمنا على البخل ومنع المساكين."));
        alqalamExes.add(new AlqalamEx("قَالَ أَوْسَطُهُمْ أَلَمْ أَقُلْ لَكُمْ لَوْلَا تُسَبِّحُونَ (28)"));
        alqalamExes.add(new AlqalamEx("قال أعدلهم: ألم أقل لكم هلا تستثنون وتقولون: إن شاء الله؟"));
        alqalamExes.add(new AlqalamEx("قَالُوا سُبْحَانَ رَبِّنَا إِنَّا كُنَّا ظَالِمِينَ (29)"));
        alqalamExes.add(new AlqalamEx("قالوا بعد أن عادوا إلى رشدهم: تنزَّه الله ربنا عن الظلم فيما أصابنا، بل نحن كنا الظالمين لأنفسنا بترك الاستثناء وقصدنا السيِّئ."));
        alqalamExes.add(new AlqalamEx("فَأَقْبَلَ بَعْضُهُمْ عَلَى بَعْضٍ يَتَلَاوَمُونَ (30)"));
        alqalamExes.add(new AlqalamEx("فأقبل بعضهم على بعض، يلوم كل منهم الآخر على تركهم الاستثناء وعلى قصدهم السيِّئ."));
        alqalamExes.add(new AlqalamEx("قَالُوا يَاوَيْلَنَا إِنَّا كُنَّا طَاغِينَ (31)"));
        alqalamExes.add(new AlqalamEx("قالوا: يا ويلنا إنَّا كنا متجاوزين الحد في منعنا الفقراء ومخالفة أمر الله."));
        alqalamExes.add(new AlqalamEx("عَسَى رَبُّنَا أَنْ يُبْدِلَنَا خَيْرًا مِنْهَا إِنَّا إِلَى رَبِّنَا رَاغِبُونَ (32)"));
        alqalamExes.add(new AlqalamEx("سى ربنا أن يعطينا أفضل من حديقتنا; بسبب توبتنا واعترافنا بخطيئتنا. إنا إلى ربنا وحده راغبون، راجون العفو، طالبون الخير."));
        alqalamExes.add(new AlqalamEx("كَذَلِكَ الْعَذَابُ وَلَعَذَابُ الْآخِرَةِ أَكْبَرُ لَوْ كَانُوا يَعْلَمُونَ (33)"));
        alqalamExes.add(new AlqalamEx("مثل ذلك العقاب الذي عاقبنا به أهل الحديقة يكون عقابنا في الدنيا لكل مَن خالف أمر الله، وبخل بما آتاه الله من النعم فلم يؤدِّ حق الله فيها، ولَعذاب الآخرة أعظم وأشد مِن عذاب الدنيا، لو كانوا يعلمون لانزجروا عن كل سبب يوجب العقاب."));
        alqalamExes.add(new AlqalamEx("إِنَّ لِلْمُتَّقِينَ عِنْدَ رَبِّهِمْ جَنَّاتِ النَّعِيمِ (34)"));
        alqalamExes.add(new AlqalamEx("إن الذين اتقوا عقاب الله بفعل ما أمرهم به وتَرْك ما نهاهم عنه، لهم عند ربهم في الآخرة جنات فيها النعيم المقيم."));
        alqalamExes.add(new AlqalamEx("أَفَنَجْعَلُ الْمُسْلِمِينَ كَالْمُجْرِمِينَ (35)"));
        alqalamExes.add(new AlqalamEx("أفنجعل الخاضعين لله بالطاعة كالكافرين؟"));
        alqalamExes.add(new AlqalamEx("مَا لَكُمْ كَيْفَ تَحْكُمُونَ (36)"));
        alqalamExes.add(new AlqalamEx("ما لكم كيف حكمتم هذا الحكم الجائر، فساويتم بينهم في الثواب؟"));
        alqalamExes.add(new AlqalamEx("أَمْ لَكُمْ كِتَابٌ فِيهِ تَدْرُسُونَ (37)"));
        alqalamExes.add(new AlqalamEx("أم لكم كتاب منزل من السماء تجدون فيه المطيع كالعاصي، فأنتم تدرسون فيه ما تقولون؟"));
        alqalamExes.add(new AlqalamEx("إِنَّ لَكُمْ فِيهِ لَمَا تَخَيَّرُونَ (38)"));
        alqalamExes.add(new AlqalamEx("إن لكم في هذا الكتاب إذًا ما تشتهون، ليس لكم ذلك."));
        alqalamExes.add(new AlqalamEx("أَمْ لَكُمْ أَيْمَانٌ عَلَيْنَا بَالِغَةٌ إِلَى يَوْمِ الْقِيَامَةِ إِنَّ لَكُمْ لَمَا تَحْكُمُونَ (39)"));
        alqalamExes.add(new AlqalamEx("أم لكم عهود ومواثيق علينا في أنه سيحصل لكم ما تريدون وتشتهون؟"));
        alqalamExes.add(new AlqalamEx("سَلْهُمْ أَيُّهُمْ بِذَلِكَ زَعِيمٌ (40)"));
        alqalamExes.add(new AlqalamEx("سل المشركين -أيها الرسول-: أيهم بذلك الحكم كفيل وضامن بأن يكون له ذلك؟"));
        alqalamExes.add(new AlqalamEx("أَمْ لَهُمْ شُرَكَاءُ فَلْيَأْتُوا بِشُرَكَائِهِمْ إِنْ كَانُوا صَادِقِينَ (41)"));
        alqalamExes.add(new AlqalamEx("أم لهم آلهة تكفُل لهم ما يقولون، وتعينهم على إدراك ما طلبوا، فليأتوا بها إن كانوا صادقين في دعواهم؟"));
        alqalamExes.add(new AlqalamEx("يَوْمَ يُكْشَفُ عَنْ سَاقٍ وَيُدْعَوْنَ إِلَى السُّجُودِ فَلَا يَسْتَطِيعُونَ (42)"));
        alqalamExes.add(new AlqalamEx("يوم القيامة يشتد الأمر ويصعب هوله، ويأتي الله تعالى لفصل القضاء بين الخلائق، فيكشف عن ساقه الكريمة التي لا يشبهها شيء، قال صلى الله عليه وسلم: «يكشف ربنا عن ساقه، فيسجد له كل مؤمن ومؤمنة، ويبقى مَن كان يسجد في الدنيا؛ رياء وسمعة، فيذهب ليسجد، فيعود ظهره طبقًا واحدًا» رواه البخاري ومسلم."));
        alqalamExes.add(new AlqalamEx("خَاشِعَةً أَبْصَارُهُمْ تَرْهَقُهُمْ ذِلَّةٌ وَقَدْ كَانُوا يُدْعَوْنَ إِلَى السُّجُودِ وَهُمْ سَالِمُونَ (43)"));
        alqalamExes.add(new AlqalamEx("منكسرة أبصارهم لا يرفعونها، تغشاهم ذلة شديدة مِن عذاب الله، وقد كانوا في الدنيا يُدْعَون إلى الصلاة لله وعبادته، وهم أصحَّاء قادرون عليها فلا يسجدون; تعظُّمًا واستكبارًا."));
        alqalamExes.add(new AlqalamEx("فَذَرْنِي وَمَنْ يُكَذِّبُ بِهَذَا الْحَدِيثِ سَنَسْتَدْرِجُهُمْ مِنْ حَيْثُ لَا يَعْلَمُونَ (44)"));
        alqalamExes.add(new AlqalamEx("فذرني -أيها الرسول- ومَن يكذِّب بهذا القرآن، فإن عليَّ جزاءهم والانتقام منهم، سنمدهم بالأموال والأولاد والنعم؛ استدراجًا لهم من حيث لا يشعرون أنه سبب لإهلاكهم."));
        alqalamExes.add(new AlqalamEx("وَأُمْلِي لَهُمْ إِنَّ كَيْدِي مَتِينٌ (45)"));
        alqalamExes.add(new AlqalamEx("وأُمهلهم وأُطيل أعمارهم; ليزدادوا إثمًا. إن كيدي بأهل الكفر قويٌّ شديد."));
        alqalamExes.add(new AlqalamEx("أَمْ تَسْأَلُهُمْ أَجْرًا فَهُمْ مِنْ مَغْرَمٍ مُثْقَلُونَ (46)"));
        alqalamExes.add(new AlqalamEx("أم تسأل -أيها الرسول- هؤلاء المشركين أجرا دنيويا على تبليغ الرسالة فهم مِن غرامة ذلك مكلَّفون حِمْلا ثقيلا؟"));
        alqalamExes.add(new AlqalamEx("أَمْ عِنْدَهُمُ الْغَيْبُ فَهُمْ يَكْتُبُونَ (47)"));
        alqalamExes.add(new AlqalamEx("بل أعندهم علم الغيب، فهم يكتبون عنه ما يحكمون به لأنفسهم مِن أنهم أفضل منزلة عند الله مِن أهل الإيمان به؟"));
        alqalamExes.add(new AlqalamEx("فَاصْبِرْ لِحُكْمِ رَبِّكَ وَلَا تَكُنْ كَصَاحِبِ الْحُوتِ إِذْ نَادَى وَهُوَ مَكْظُومٌ (48)"));
        alqalamExes.add(new AlqalamEx("فاصبر -أيها الرسول- لما حكم به ربك وقضاه، ومن ذلك إمهالهم وتأخير نصرتك عليهم، ولا تكن كصاحب الحوت، وهو يونس -عليه السلام- في غضبه وعدم صبره على قومه، حين نادى ربه، وهو مملوء غمًّا طالبًا تعجيل العذاب لهم."));
        alqalamExes.add(new AlqalamEx("لَوْلَا أَنْ تَدَارَكَهُ نِعْمَةٌ مِنْ رَبِّهِ لَنُبِذَ بِالْعَرَاءِ وَهُوَ مَذْمُومٌ (49)"));
        alqalamExes.add(new AlqalamEx("لولا أن تداركه نعمة مِن ربه بتوفيقه للتوبة وقَبولها لَطُرِح مِن بطن الحوت بالأرض الفضاء المهلكة، وهو آتٍ بما يلام عليه."));
        alqalamExes.add(new AlqalamEx("فَاجْتَبَاهُ رَبُّهُ فَجَعَلَهُ مِنَ الصَّالِحِينَ (50)"));
        alqalamExes.add(new AlqalamEx("فاصطفاه ربه لرسالته، فجعله من الصالحين الذين صلحت نياتهم وأقوالهم وأعمالهم."));
        alqalamExes.add(new AlqalamEx("وَإِنْ يَكَادُ الَّذِينَ كَفَرُوا لَيُزْلِقُونَكَ بِأَبْصَارِهِمْ لَمَّا سَمِعُوا الذِّكْرَ وَيَقُولُونَ إِنَّهُ لَمَجْنُونٌ (51)"));
        alqalamExes.add(new AlqalamEx("وإن يكاد الكفار حين سمعوا القرآن ليصيبونك -أيها الرسول- بالعين؛ لبغضهم إياك، لولا وقاية الله وحمايته لك، ويقولون: -حسب أهوائهم- إنه لمجنون."));
        alqalamExes.add(new AlqalamEx("وَمَا هُوَ إِلَّا ذِكْرٌ لِلْعَالَمِينَ (52)"));
        alqalamExes.add(new AlqalamEx("وما القرآن إلا موعظة وتذكير للعالمين من الإنس والجن."));

        quran_explanation_68_adapter = new quran_explanation_68_adapter(alqalamExes ,QuranExplanation_68Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_68);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_68Activity.this));
        recyclerView.setAdapter(quran_explanation_68_adapter);


    }

}