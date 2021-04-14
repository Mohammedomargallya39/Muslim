package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_70Activity extends AppCompatActivity {

    ArrayList<AlmaaregEx> almaaregExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_70_adapter quran_explanation_70_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_70);

        almaaregExes.add(new AlmaaregEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        almaaregExes.add(new AlmaaregEx("سَأَلَ سَائِلٌ بِعَذَابٍ وَاقِعٍ (1)"));
        almaaregExes.add(new AlmaaregEx("دعا داع من المشركين على نفسه وقومه بنزول العذاب عليهم، وهو واقع بهم يوم القيامة لا محالة."));
        almaaregExes.add(new AlmaaregEx("لِلْكَافِرِينَ لَيْسَ لَهُ دَافِعٌ (2)"));
        almaaregExes.add(new AlmaaregEx("ليس له مانع يمنعه"));
        almaaregExes.add(new AlmaaregEx("مِنَ اللَّهِ ذِي الْمَعَارِجِ (3)"));
        almaaregExes.add(new AlmaaregEx("من الله ذي العلو والجلال."));
        almaaregExes.add(new AlmaaregEx("تَعْرُجُ الْمَلَائِكَةُ وَالرُّوحُ إِلَيْهِ فِي يَوْمٍ كَانَ مِقْدَارُهُ خَمْسِينَ أَلْفَ سَنَةٍ (4)"));
        almaaregExes.add(new AlmaaregEx("تصعد الملائكة وجبريل إليه تعالى في يوم كان مقداره خمسين ألف سنة من سني الدنيا، وهو على المؤمن مثل صلاة مكتوبة."));
        almaaregExes.add(new AlmaaregEx("فَاصْبِرْ صَبْرًا جَمِيلًا (5)"));
        almaaregExes.add(new AlmaaregEx("فاصبر -أيها الرسول- على استهزائهم واستعجالهم العذاب، صبرًا لا جزع فيه، ولا شكوى منه لغير الله."));
        almaaregExes.add(new AlmaaregEx("إِنَّهُمْ يَرَوْنَهُ بَعِيدًا (6)"));
        almaaregExes.add(new AlmaaregEx("إن الكافرين يستبعدون العذاب ويرونه غير واقع."));
        almaaregExes.add(new AlmaaregEx("وَنَرَاهُ قَرِيبًا (7)"));
        almaaregExes.add(new AlmaaregEx("ونحن نراه واقعًا قريبًا لا محالة."));
        almaaregExes.add(new AlmaaregEx("يَوْمَ تَكُونُ السَّمَاءُ كَالْمُهْلِ (8)"));
        almaaregExes.add(new AlmaaregEx("يوم تكون السماء سائلة مثل حُثالة الزيت."));
        almaaregExes.add(new AlmaaregEx("وَتَكُونُ الْجِبَالُ كَالْعِهْنِ (9)"));
        almaaregExes.add(new AlmaaregEx("وتكون الجبال كالصوف المصبوغ المنفوش الذي ذَرَتْه الريح."));
        almaaregExes.add(new AlmaaregEx("وَلَا يَسْأَلُ حَمِيمٌ حَمِيمًا (10)"));
        almaaregExes.add(new AlmaaregEx("ولا يسأل قريب قريبه عن شأنه؛ لأن كل واحدٍ منهما مشغول بنفسه."));
        almaaregExes.add(new AlmaaregEx("يُبَصَّرُونَهُمْ يَوَدُّ الْمُجْرِمُ لَوْ يَفْتَدِي مِنْ عَذَابِ يَوْمِئِذٍ بِبَنِيهِ (11)"));
        almaaregExes.add(new AlmaaregEx("يرونهم ويعرفونهم، ولا يستطيع أحد أن ينفع أحدًا. يتمنى الكافر لو يفدي نفسه من عذاب يوم القيامة بأبنائه."));
        almaaregExes.add(new AlmaaregEx("وَصَاحِبَتِهِ وَأَخِيهِ (12)"));
        almaaregExes.add(new AlmaaregEx("وزوجه وأخيه."));
        almaaregExes.add(new AlmaaregEx("وَفَصِيلَتِهِ الَّتِي تُؤْوِيهِ (13)"));
        almaaregExes.add(new AlmaaregEx("وعشيرته التي تضمه وينتمي إليها في القرابة."));
        almaaregExes.add(new AlmaaregEx("وَمَنْ فِي الْأَرْضِ جَمِيعًا ثُمَّ يُنْجِيهِ (14)"));
        almaaregExes.add(new AlmaaregEx("وبجميع مَن في الأرض مِنَ البشر وغيرهم، ثم ينجو من عذاب الله."));
        almaaregExes.add(new AlmaaregEx("كَلَّا إِنَّهَا لَظَى (15)"));
        almaaregExes.add(new AlmaaregEx("ليس الأمر كما تتمناه -أيها الكافر- من الافتداء، إنها جهنم تتلظى نارها وتلتهب."));
        almaaregExes.add(new AlmaaregEx("نَزَّاعَةً لِلشَّوَى (16)"));
        almaaregExes.add(new AlmaaregEx("تنزع بشدة حرها جلدة الرأس وسائر أطراف البدن."));
        almaaregExes.add(new AlmaaregEx("تَدْعُو مَنْ أَدْبَرَ وَتَوَلَّى (17)"));
        almaaregExes.add(new AlmaaregEx("تنادي مَن أعرض عن الحق في الدنيا، وترك طاعة الله ورسوله."));
        almaaregExes.add(new AlmaaregEx("وَجَمَعَ فَأَوْعَى (18)"));
        almaaregExes.add(new AlmaaregEx("وجمع المال، فوضعه في خزائنه، ولم يؤدِّ حق الله فيه."));
        almaaregExes.add(new AlmaaregEx("إِنَّ الْإِنْسَانَ خُلِقَ هَلُوعًا (19)"));
        almaaregExes.add(new AlmaaregEx("إن الإنسان جُبِلَ على الجزع وشدة الحرص."));
        almaaregExes.add(new AlmaaregEx("إِذَا مَسَّهُ الشَّرُّ جَزُوعًا (20)"));
        almaaregExes.add(new AlmaaregEx("إذا أصابه المكروه والعسر فهو كثير الجزع والأسى."));
        almaaregExes.add(new AlmaaregEx("وَإِذَا مَسَّهُ الْخَيْرُ مَنُوعًا (21)."));
        almaaregExes.add(new AlmaaregEx("وإذا أصابه الخير واليسر فهو كثير المنع والإمساك."));
        almaaregExes.add(new AlmaaregEx("إِلَّا الْمُصَلِّينَ (22)"));
        almaaregExes.add(new AlmaaregEx("إلا المقيمين للصلاة."));
        almaaregExes.add(new AlmaaregEx("الَّذِينَ هُمْ عَلَى صَلَاتِهِمْ دَائِمُونَ (23)."));
        almaaregExes.add(new AlmaaregEx("الذين يحافظون على أدائها في جميع الأوقات، ولا يَشْغَلهم عنها شاغل."));
        almaaregExes.add(new AlmaaregEx("وَالَّذِينَ فِي أَمْوَالِهِمْ حَقٌّ مَعْلُومٌ (24)"));
        almaaregExes.add(new AlmaaregEx("والذين في أموالهم نصيب معيَّن فرضه الله عليهم."));
        almaaregExes.add(new AlmaaregEx("لِلسَّائِلِ وَالْمَحْرُومِ (25)"));
        almaaregExes.add(new AlmaaregEx("وهو الزكاة لمن يسألهم المعونة، ولمن يتعفف عن سؤالها."));
        almaaregExes.add(new AlmaaregEx("وَالَّذِينَ يُصَدِّقُونَ بِيَوْمِ الدِّينِ (26)"));
        almaaregExes.add(new AlmaaregEx("والذين يؤمنون بيوم الحساب والجزاء فيستعدون له بالأعمال الصالحة."));
        almaaregExes.add(new AlmaaregEx("وَالَّذِينَ هُمْ مِنْ عَذَابِ رَبِّهِمْ مُشْفِقُونَ (27)"));
        almaaregExes.add(new AlmaaregEx("والذين هم خائفون من عذاب الله."));
        almaaregExes.add(new AlmaaregEx("إِنَّ عَذَابَ رَبِّهِمْ غَيْرُ مَأْمُونٍ (28)"));
        almaaregExes.add(new AlmaaregEx("إن عذاب ربهم لا ينبغي أن يأمنه أحد."));
        almaaregExes.add(new AlmaaregEx("وَالَّذِينَ هُمْ لِفُرُوجِهِمْ حَافِظُونَ (29)"));
        almaaregExes.add(new AlmaaregEx("والذين هم حافظون لفروجهم عن كل ما حرَّم الله عليهم."));
        almaaregExes.add(new AlmaaregEx("إِلَّا عَلَى أَزْوَاجِهِمْ أَوْ مَا مَلَكَتْ أَيْمَانُهُمْ فَإِنَّهُمْ غَيْرُ مَلُومِينَ (30)"));
        almaaregExes.add(new AlmaaregEx("إلا على أزواجهم وإمائهم، فإنهم غير مؤاخذين."));
        almaaregExes.add(new AlmaaregEx("فَمَنِ ابْتَغَى وَرَاءَ ذَلِكَ فَأُولَئِكَ هُمُ الْعَادُونَ (31)"));
        almaaregExes.add(new AlmaaregEx("فمن طلب لقضاء شهوته غير الزوجات والمملوكات، فأولئك هم المتجاوزون الحلال إلى الحرام."));
        almaaregExes.add(new AlmaaregEx("وَالَّذِينَ هُمْ لِأَمَانَاتِهِمْ وَعَهْدِهِمْ رَاعُونَ (32)"));
        almaaregExes.add(new AlmaaregEx("والذين هم حافظون لأمانات الله، وأمانات العباد، وحافظون لعهودهم مع الله تعالى ومع العباد."));
        almaaregExes.add(new AlmaaregEx("وَالَّذِينَ هُمْ بِشَهَادَاتِهِمْ قَائِمُونَ (33)"));
        almaaregExes.add(new AlmaaregEx("والذين يؤدُّون شهاداتهم بالحق دون تغيير أو كتمان."));
        almaaregExes.add(new AlmaaregEx("وَالَّذِينَ هُمْ عَلَى صَلَاتِهِمْ يُحَافِظُونَ (34)"));
        almaaregExes.add(new AlmaaregEx("والذين يحافظون على أداء الصلاة ولا يخلُّون بشيء من واجباتها."));
        almaaregExes.add(new AlmaaregEx("أُولَئِكَ فِي جَنَّاتٍ مُكْرَمُونَ (35)"));
        almaaregExes.add(new AlmaaregEx("أولئك المتصفون بتلك الأوصاف الجليلة مستقرُّون في جنات النعيم، مكرمون فيها بكل أنواع التكريم."));
        almaaregExes.add(new AlmaaregEx("فَمَالِ الَّذِينَ كَفَرُوا قِبَلَكَ مُهْطِعِينَ (36)"));
        almaaregExes.add(new AlmaaregEx("فأيُّ دافع دفع هؤلاء الكفرة إلى أن يسيروا نحوك -أيها الرسول- مسرعين، وقد مدُّوا أعناقهم إليك مقبلين بأبصارهم عليك."));
        almaaregExes.add(new AlmaaregEx("عَنِ الْيَمِينِ وَعَنِ الشِّمَالِ عِزِينَ (37)"));
        almaaregExes.add(new AlmaaregEx("يتجمعون عن يمينك وعن شمالك حلقًا متعددة وجماعات متفرقة يتحدثون ويتعجبون؟"));
        almaaregExes.add(new AlmaaregEx("أَيَطْمَعُ كُلُّ امْرِئٍ مِنْهُمْ أَنْ يُدْخَلَ جَنَّةَ نَعِيمٍ (38)"));
        almaaregExes.add(new AlmaaregEx("أيطمع كل واحد من هؤلاء الكفار أن يدخله الله جنة النعيم الدائم؟ ليس الأمر كما يطمعون، فإنهم لا يدخلونها أبدًا."));
        almaaregExes.add(new AlmaaregEx("كَلَّا إِنَّا خَلَقْنَاهُمْ مِمَّا يَعْلَمُونَ (39)"));
        almaaregExes.add(new AlmaaregEx("إنَّا خلقناهم مما يعلمون مِن ماء مهين كغيرهم، فلم يؤمنوا، فمن أين يتشرفون بدخول جنة النعيم؟"));
        almaaregExes.add(new AlmaaregEx("فَلَا أُقْسِمُ بِرَبِّ الْمَشَارِقِ وَالْمَغَارِبِ إِنَّا لَقَادِرُونَ (40)"));
        almaaregExes.add(new AlmaaregEx("أقسم تعالى بنفسه، وهو رب المشارق والمغارب للشمس والقمر وسائر الكواكب؛ لما فيها من الآيات الباهرة الدالة على البعث، إنا لقادرون قدرة تامة."));
        almaaregExes.add(new AlmaaregEx("عَلَى أَنْ نُبَدِّلَ خَيْرًا مِنْهُمْ وَمَا نَحْنُ بِمَسْبُوقِينَ (41)"));
        almaaregExes.add(new AlmaaregEx("على أن نستبدل بهم قومًا أفضل منهم وأطوع لله، وما أحد يسبقنا ويفوتنا ويعجزنا إذا أردنا أن نأتي بقوم آخرين خير منهم."));
        almaaregExes.add(new AlmaaregEx("فَذَرْهُمْ يَخُوضُوا وَيَلْعَبُوا حَتَّى يُلَاقُوا يَوْمَهُمُ الَّذِي يُوعَدُونَ (42)"));
        almaaregExes.add(new AlmaaregEx("لكن سبق في علمنا ومشيئتنا تأخير عقوبة هؤلاء الكفار، وعدم تبديلهم بقوم آخرين، فاتركهم يخوضوا في باطلهم، ويلعبوا في دنياهم حتى يلاقوا يوم القيامة الذي يوعدون فيه بالعذاب."));
        almaaregExes.add(new AlmaaregEx("يَوْمَ يَخْرُجُونَ مِنَ الْأَجْدَاثِ سِرَاعًا كَأَنَّهُمْ إِلَى نُصُبٍ يُوفِضُونَ (43)"));
        almaaregExes.add(new AlmaaregEx("يوم يخرجون من القبور مسرعين، كما كانوا في الدنيا يذهبون إلى آلهتهم التي اختلقوها للعبادة مِن دون الله، يهرولون ويسرعون."));
        almaaregExes.add(new AlmaaregEx("خَاشِعَةً أَبْصَارُهُمْ تَرْهَقُهُمْ ذِلَّةٌ ذَلِكَ الْيَوْمُ الَّذِي كَانُوا يُوعَدُونَ (44)"));
        almaaregExes.add(new AlmaaregEx("ذليلة أبصارهم منكسرة إلى الأرض، تغشاهم الحقارة والمهانة، ذلك هو اليوم الذي وعدوا به في الدنيا، وكانوا به يهزؤون ويُكَذِّبون."));





        quran_explanation_70_adapter = new quran_explanation_70_adapter(almaaregExes ,QuranExplanation_70Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_70);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_70Activity.this));
        recyclerView.setAdapter(quran_explanation_70_adapter);


    }

}