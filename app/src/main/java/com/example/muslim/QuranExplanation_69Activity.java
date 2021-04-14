package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_69Activity extends AppCompatActivity {

    ArrayList<AlhaqahEx> alhaqahExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_69_adapter quran_explanation_69_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_69);

        alhaqahExes.add(new AlhaqahEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alhaqahExes.add(new AlhaqahEx("الْحَاقَّةُ (1)"));
        alhaqahExes.add(new AlhaqahEx("القيامة الواقعة حقًّا التي يتحقق فيها الوعد والوعيد."));
        alhaqahExes.add(new AlhaqahEx("مَا الْحَاقَّةُ (2)"));
        alhaqahExes.add(new AlhaqahEx("ما القيامة الواقعة حقًّا في صفتها وحالها؟"));
        alhaqahExes.add(new AlhaqahEx("وَمَا أَدْرَاكَ مَا الْحَاقَّةُ (3)"));
        alhaqahExes.add(new AlhaqahEx("وأي شيء أدراك -أيها الرسول- وعَرَّفك حقيقة القيامة، وصَوَّر لك هولها وشدتها؟"));
        alhaqahExes.add(new AlhaqahEx("كَذَّبَتْ ثَمُودُ وَعَادٌ بِالْقَارِعَةِ (4)"));
        alhaqahExes.add(new AlhaqahEx("كذَّبت ثمود، وهم قوم صالح، وعاد، وهم قوم هود بالقيامة التي تقرع القلوب بأهوالها."));
        alhaqahExes.add(new AlhaqahEx("فَأَمَّا ثَمُودُ فَأُهْلِكُوا بِالطَّاغِيَةِ (5)"));
        alhaqahExes.add(new AlhaqahEx("فأما ثمود فأهلكوا بالصيحة العظيمة التي جاوزت الحد في شدتها."));
        alhaqahExes.add(new AlhaqahEx("وَأَمَّا عَادٌ فَأُهْلِكُوا بِرِيحٍ صَرْصَرٍ عَاتِيَةٍ (6)"));
        alhaqahExes.add(new AlhaqahEx("وأمَّا عاد فأُهلِكوا بريح باردة شديدة الهبوب."));
        alhaqahExes.add(new AlhaqahEx("سَخَّرَهَا عَلَيْهِمْ سَبْعَ لَيَالٍ وَثَمَانِيَةَ أَيَّامٍ حُسُومًا فَتَرَى الْقَوْمَ فِيهَا صَرْعَى كَأَنَّهُمْ أَعْجَازُ نَخْلٍ خَاوِيَةٍ (7)"));
        alhaqahExes.add(new AlhaqahEx("سلَّطها الله عليهم سبع ليال وثمانية أيام متتابعة، لا تَفْتُر ولا تنقطع، فترى القوم في تلك الليالي والأيام موتى كأنهم أصول نخل خَرِبة متآكلة الأجواف."));
        alhaqahExes.add(new AlhaqahEx("فَهَلْ تَرَى لَهُمْ مِنْ بَاقِيَةٍ (8)"));
        alhaqahExes.add(new AlhaqahEx("فهل ترى لهؤلاء القوم مِن نفس باقية دون هلاك؟"));
        alhaqahExes.add(new AlhaqahEx("وَجَاءَ فِرْعَوْنُ وَمَنْ قَبْلَهُ وَالْمُؤْتَفِكَاتُ بِالْخَاطِئَةِ (9)"));
        alhaqahExes.add(new AlhaqahEx("وجاء الطاغية فرعون، ومَن سبقه من الأمم التي كفرت برسلها، وأهل قرى قوم لوط الذين انقلبت بهم ديارهم بسبب الفعلة المنكرة من الكفر والشرك والفواحش."));
        alhaqahExes.add(new AlhaqahEx("فَعَصَوْا رَسُولَ رَبِّهِمْ فَأَخَذَهُمْ أَخْذَةً رَابِيَةً (10)"));
        alhaqahExes.add(new AlhaqahEx("فعصت كل أمة منهم رسول ربهم الذي أرسله إليهم، فأخذهم الله أخذة بالغة في الشدة."));
        alhaqahExes.add(new AlhaqahEx("إِنَّا لَمَّا طَغَى الْمَاءُ حَمَلْنَاكُمْ فِي الْجَارِيَةِ (11)"));
        alhaqahExes.add(new AlhaqahEx("إنَّا لما جاوز الماء حدَّه، حتى علا وارتفع فوق كل شيء، حملنا أصولكم مع نوح في السفينة التي تجري في الماء."));
        alhaqahExes.add(new AlhaqahEx("لِنَجْعَلَهَا لَكُمْ تَذْكِرَةً وَتَعِيَهَا أُذُنٌ وَاعِيَةٌ (12)"));
        alhaqahExes.add(new AlhaqahEx("لنجعل الواقعة التي كان فيها نجاة المؤمنين وإغراق الكافرين عبرة وعظة، وتحفظها كل أذن مِن شأنها أن تحفظ، وتعقل عن الله ما سمعت."));
        alhaqahExes.add(new AlhaqahEx("فَإِذَا نُفِخَ فِي الصُّورِ نَفْخَةٌ وَاحِدَةٌ (13)"));
        alhaqahExes.add(new AlhaqahEx("فإذا نفخ المَلَك في «القرن» نفخة واحدة، وهي النفخة الأولى التي يكون عندها هلاك العالم."));
        alhaqahExes.add(new AlhaqahEx("وَحُمِلَتِ الْأَرْضُ وَالْجِبَالُ فَدُكَّتَا دَكَّةً وَاحِدَةً (14)"));
        alhaqahExes.add(new AlhaqahEx("ورُفعت الأرض والجبال عن أماكنها فكُسِّرتا، ودُقَّتا دقة واحدة."));
        alhaqahExes.add(new AlhaqahEx("فَيَوْمَئِذٍ وَقَعَتِ الْوَاقِعَةُ (15)"));
        alhaqahExes.add(new AlhaqahEx("ففي ذلك الحين قامت القيامة."));
        alhaqahExes.add(new AlhaqahEx("وَانْشَقَّتِ السَّمَاءُ فَهِيَ يَوْمَئِذٍ وَاهِيَةٌ (16)"));
        alhaqahExes.add(new AlhaqahEx("وانصدعت السماء، فهي يومئذ ضعيفة مسترخية، لا تماسُك فيها ولا صلابة."));
        alhaqahExes.add(new AlhaqahEx("وَالْمَلَكُ عَلَى أَرْجَائِهَا وَيَحْمِلُ عَرْشَ رَبِّكَ فَوْقَهُمْ يَوْمَئِذٍ ثَمَانِيَةٌ (17)"));
        alhaqahExes.add(new AlhaqahEx("والملائكة على جوانبها وأطرافها، ويحمل عرش ربك فوقهم يوم القيامة ثمانية من الملائكة العظام."));
        alhaqahExes.add(new AlhaqahEx("يَوْمَئِذٍ تُعْرَضُونَ لَا تَخْفَى مِنْكُمْ خَافِيَةٌ (18)"));
        alhaqahExes.add(new AlhaqahEx("في ذلك اليوم تُعرضون على الله -أيها الناس- للحساب والجزاء، لا يخفى عليه شيء من أسراركم."));
        alhaqahExes.add(new AlhaqahEx("فَأَمَّا مَنْ أُوتِيَ كِتَابَهُ بِيَمِينِهِ فَيَقُولُ هَاؤُمُ اقْرَءُوا كِتَابِيَهْ (19)"));
        alhaqahExes.add(new AlhaqahEx("فأمَّا من أُعطي كتاب أعماله بيمينه، فيقول ابتهاجًا وسرورًا: خذوا اقرؤوا كتابي."));
        alhaqahExes.add(new AlhaqahEx("إِنِّي ظَنَنْتُ أَنِّي مُلَاقٍ حِسَابِيَهْ (20)"));
        alhaqahExes.add(new AlhaqahEx("إني أيقنت في الدنيا بأني سألقى جزائي يوم القيامة، فأعددت له العدة من الإيمان والعمل الصالح."));
        alhaqahExes.add(new AlhaqahEx("فَهُوَ فِي عِيشَةٍ رَاضِيَةٍ (21)"));
        alhaqahExes.add(new AlhaqahEx("فهو في عيشة هنيئة مرضية."));
        alhaqahExes.add(new AlhaqahEx("فِي جَنَّةٍ عَالِيَةٍ (22)"));
        alhaqahExes.add(new AlhaqahEx("في جنة مرتفعة المكان والدرجات."));
        alhaqahExes.add(new AlhaqahEx("قُطُوفُهَا دَانِيَةٌ (23)"));
        alhaqahExes.add(new AlhaqahEx("ثمارها قريبة يتناولها القائم والقاعد والمضطجع."));
        alhaqahExes.add(new AlhaqahEx("كُلُوا وَاشْرَبُوا هَنِيئًا بِمَا أَسْلَفْتُمْ فِي الْأَيَّامِ الْخَالِيَةِ (24)"));
        alhaqahExes.add(new AlhaqahEx("يقال لهم: كلوا أكلا واشربوا شربًا بعيدًا عن كل أذى، سالمين من كل مكروه؛ بسبب ما قدَّمتم من الأعمال الصالحة في أيام الدنيا الماضية."));
        alhaqahExes.add(new AlhaqahEx("وَأَمَّا مَنْ أُوتِيَ كِتَابَهُ بِشِمَالِهِ فَيَقُولُ يَالَيْتَنِي لَمْ أُوتَ كِتَابِيَهْ (25)"));
        alhaqahExes.add(new AlhaqahEx("وَأمَّا من أعطي كتاب أعماله بشماله، فيقول نادمًا متحسرًا: يا ليتني لم أُعط كتابي."));
        alhaqahExes.add(new AlhaqahEx("وَلَمْ أَدْرِ مَا حِسَابِيَهْ (26)"));
        alhaqahExes.add(new AlhaqahEx("ولم أعلم ما جزائي؟"));
        alhaqahExes.add(new AlhaqahEx("يَالَيْتَهَا كَانَتِ الْقَاضِيَةَ (27)"));
        alhaqahExes.add(new AlhaqahEx("يا ليت الموتة التي متُّها في الدنيا كانت القاطعة لأمري، ولم أُبعث بعدها."));
        alhaqahExes.add(new AlhaqahEx("مَا أَغْنَى عَنِّي مَالِيَهْ (28)"));
        alhaqahExes.add(new AlhaqahEx("ما نفعني مالي الذي جمعته في الدنيا."));
        alhaqahExes.add(new AlhaqahEx("هَلَكَ عَنِّي سُلْطَانِيَهْ (29)"));
        alhaqahExes.add(new AlhaqahEx("ذهبت عني حجتي، ولم يَعُدْ لي حجة أحتج بها."));
        alhaqahExes.add(new AlhaqahEx("خُذُوهُ فَغُلُّوهُ (30)"));
        alhaqahExes.add(new AlhaqahEx("يقال لخزنة جهنم: خذوا هذا المجرم الأثيم، فاجمعوا يديه إلى عنقه بالأغلال."));
        alhaqahExes.add(new AlhaqahEx("ثُمَّ الْجَحِيمَ صَلُّوهُ (31)"));
        alhaqahExes.add(new AlhaqahEx("ثم أدخلوه الجحيم ليقاسي حرها."));
        alhaqahExes.add(new AlhaqahEx("ثُمَّ فِي سِلْسِلَةٍ ذَرْعُهَا سَبْعُونَ ذِرَاعًا فَاسْلُكُوهُ (32)"));
        alhaqahExes.add(new AlhaqahEx("ثم في سلسلة من حديد طولها سبعون ذراعًا فأدخلوه فيها."));
        alhaqahExes.add(new AlhaqahEx("إِنَّهُ كَانَ لَا يُؤْمِنُ بِاللَّهِ الْعَظِيمِ (33)"));
        alhaqahExes.add(new AlhaqahEx("إنه كان لا يصدِّق بأن الله هو الإله الحق وحده لا شريك له، ولا يعمل بهديه."));
        alhaqahExes.add(new AlhaqahEx("وَلَا يَحُضُّ عَلَى طَعَامِ الْمِسْكِينِ (34)"));
        alhaqahExes.add(new AlhaqahEx("ولا يحث الناس في الدنيا على إطعام أهل الحاجة من المساكين وغيرهم."));
        alhaqahExes.add(new AlhaqahEx("فَلَيْسَ لَهُ الْيَوْمَ هَاهُنَا حَمِيمٌ (35)"));
        alhaqahExes.add(new AlhaqahEx("فليس لهذا الكافر يوم القيامة قريب يدفع عنه العذاب."));
        alhaqahExes.add(new AlhaqahEx("وَلَا طَعَامٌ إِلَّا مِنْ غِسْلِينٍ (36)"));
        alhaqahExes.add(new AlhaqahEx("وليس له طعام إلا مِن صديد أهل النار."));
        alhaqahExes.add(new AlhaqahEx("لَا يَأْكُلُهُ إِلَّا الْخَاطِئُونَ (37)"));
        alhaqahExes.add(new AlhaqahEx("لا يأكله إلا المذنبون المصرُّون على الكفر بالله."));
        alhaqahExes.add(new AlhaqahEx("فَلَا أُقْسِمُ بِمَا تُبْصِرُونَ (38)"));
        alhaqahExes.add(new AlhaqahEx("فلا أقسم بما تبصرون من المرئيات."));
        alhaqahExes.add(new AlhaqahEx("وَمَا لَا تُبْصِرُونَ (39)"));
        alhaqahExes.add(new AlhaqahEx("وما لا تبصرون مما غاب عنكم."));
        alhaqahExes.add(new AlhaqahEx("إِنَّهُ لَقَوْلُ رَسُولٍ كَرِيمٍ (40)"));
        alhaqahExes.add(new AlhaqahEx("إن القرآن لَكَلام الله، يتلوه رسول عظيم الشرف والفضل."));
        alhaqahExes.add(new AlhaqahEx("وَمَا هُوَ بِقَوْلِ شَاعِرٍ قَلِيلًا مَا تُؤْمِنُونَ (41)"));
        alhaqahExes.add(new AlhaqahEx("وليس بقول شاعر كما تزعمون، قليلا ما تؤمنون."));
        alhaqahExes.add(new AlhaqahEx("وَلَا بِقَوْلِ كَاهِنٍ قَلِيلًا مَا تَذَكَّرُونَ (42)"));
        alhaqahExes.add(new AlhaqahEx("وليس بسجع كسجع الكهان، قليلا ما يكون منكم تذكُّر وتأمُّل للفرق بينهما."));
        alhaqahExes.add(new AlhaqahEx("تَنْزِيلٌ مِنْ رَبِّ الْعَالَمِينَ (43)"));
        alhaqahExes.add(new AlhaqahEx("ولكنه كلام رب العالمين الذي أنزله على رسوله محمد صلى الله عليه وسلم."));
        alhaqahExes.add(new AlhaqahEx("وَلَوْ تَقَوَّلَ عَلَيْنَا بَعْضَ الْأَقَاوِيلِ (44)"));
        alhaqahExes.add(new AlhaqahEx("ولو ادَّعى محمد علينا شيئًا لم نقله."));
        alhaqahExes.add(new AlhaqahEx("لَأَخَذْنَا مِنْهُ بِالْيَمِينِ (45)"));
        alhaqahExes.add(new AlhaqahEx("لانتقمنا وأخذنا منه باليمين."));
        alhaqahExes.add(new AlhaqahEx("ثُمَّ لَقَطَعْنَا مِنْهُ الْوَتِينَ (46)"));
        alhaqahExes.add(new AlhaqahEx("ثم لقطعنا منه نياط قلبه."));
        alhaqahExes.add(new AlhaqahEx("فَمَا مِنْكُمْ مِنْ أَحَدٍ عَنْهُ حَاجِزِينَ (47)"));
        alhaqahExes.add(new AlhaqahEx("فلا يقدر أحد منكم أن يحجز عنه عقابنا."));
        alhaqahExes.add(new AlhaqahEx("وَإِنَّهُ لَتَذْكِرَةٌ لِلْمُتَّقِينَ (48)"));
        alhaqahExes.add(new AlhaqahEx("إن هذا القرآن لعظة للمتقين الذين يمتثلون أوامر الله ويجتنبون نواهيه."));
        alhaqahExes.add(new AlhaqahEx("وَإِنَّا لَنَعْلَمُ أَنَّ مِنْكُمْ مُكَذِّبِينَ (49)"));
        alhaqahExes.add(new AlhaqahEx("إنا لَنعلم أنَّ مِنكم مَن يكذِّب بهذا القرآن مع وضوح آياته."));
        alhaqahExes.add(new AlhaqahEx("وَإِنَّهُ لَحَسْرَةٌ عَلَى الْكَافِرِينَ (50)"));
        alhaqahExes.add(new AlhaqahEx("وإن التكذيب به لندامة عظيمة على الكافرين به حين يرون عذابهم ويرون نعيم المؤمنين به."));
        alhaqahExes.add(new AlhaqahEx("وَإِنَّهُ لَحَقُّ الْيَقِينِ (51)"));
        alhaqahExes.add(new AlhaqahEx("وإنه لحق ثابت ويقين لا شك فيه."));
        alhaqahExes.add(new AlhaqahEx("فَسَبِّحْ بِاسْمِ رَبِّكَ الْعَظِيمِ (52)"));
        alhaqahExes.add(new AlhaqahEx("فنزِّه الله سبحانه عما لا يليق بجلاله، واذكره باسمه العظيم."));

        quran_explanation_69_adapter = new quran_explanation_69_adapter(alhaqahExes ,QuranExplanation_69Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_69);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_69Activity.this));
        recyclerView.setAdapter(quran_explanation_69_adapter);


    }

}