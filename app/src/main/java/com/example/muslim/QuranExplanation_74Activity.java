package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_74Activity extends AppCompatActivity {

    ArrayList<AlmodatherEx> almodatherExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_74_adapter quran_explanation_74_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_74);

        almodatherExes.add(new AlmodatherEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        almodatherExes.add(new AlmodatherEx("يَاأَيُّهَا الْمُدَّثِّرُ (1)"));
        almodatherExes.add(new AlmodatherEx("يا أيها المتغطي بثيابه."));
        almodatherExes.add(new AlmodatherEx("قُمْ فَأَنْذِرْ (2)"));
        almodatherExes.add(new AlmodatherEx("قم مِن مضجعك، فحذِّر الناس من عذاب الله."));
        almodatherExes.add(new AlmodatherEx("وَرَبَّكَ فَكَبِّرْ (3)"));
        almodatherExes.add(new AlmodatherEx("وخُصَّ ربك وحده بالتعظيم والتوحيد والعبادة."));
        almodatherExes.add(new AlmodatherEx("وَثِيَابَكَ فَطَهِّرْ (4)"));
        almodatherExes.add(new AlmodatherEx("وَطَهِّر ثيابك من النجاسات؛ فإن طهارة الظاهر من تمام طهارة الباطن."));
        almodatherExes.add(new AlmodatherEx("وَالرُّجْزَ فَاهْجُرْ (5)"));
        almodatherExes.add(new AlmodatherEx("ودُمْ على هَجْر الأصنام والأوثان وأعمال الشرك كلها، فلا تقربها."));
        almodatherExes.add(new AlmodatherEx("وَلَا تَمْنُنْ تَسْتَكْثِرُ (6)"));
        almodatherExes.add(new AlmodatherEx("ولا تُعط العطيَّة؛ كي تلتمس أكثر منها."));
        almodatherExes.add(new AlmodatherEx("وَلِرَبِّكَ فَاصْبِرْ (7)"));
        almodatherExes.add(new AlmodatherEx("ولمرضاة ربك فاصبر على الأوامر والنواهي."));
        almodatherExes.add(new AlmodatherEx("فَإِذَا نُقِرَ فِي النَّاقُورِ (8)"));
        almodatherExes.add(new AlmodatherEx("فإذا نُفخ في «القرن» نفخة البعث والنشور."));
        almodatherExes.add(new AlmodatherEx("فَذَلِكَ يَوْمَئِذٍ يَوْمٌ عَسِيرٌ (9)"));
        almodatherExes.add(new AlmodatherEx("فذلك الوقت يومئذ شديد على الكافرين."));
        almodatherExes.add(new AlmodatherEx("عَلَى الْكَافِرِينَ غَيْرُ يَسِيرٍ (10)"));
        almodatherExes.add(new AlmodatherEx("غير سهل أن يخلصوا مما هم فيه من مناقشة الحساب وغيره من الأهوال."));
        almodatherExes.add(new AlmodatherEx("ذَرْنِي وَمَنْ خَلَقْتُ وَحِيدًا (11)"));
        almodatherExes.add(new AlmodatherEx("دعني -أيها الرسول- أنا والذي خلقته في بطن أمه وحيدًا فريدًا لا مال له ولا ولد."));
        almodatherExes.add(new AlmodatherEx("وَجَعَلْتُ لَهُ مَالًا مَمْدُودًا (12)"));
        almodatherExes.add(new AlmodatherEx("وجعلت له مالا مبسوطًا واسعًا."));
        almodatherExes.add(new AlmodatherEx("وَبَنِينَ شُهُودًا (13)"));
        almodatherExes.add(new AlmodatherEx("وأولادًا حضورًا معه في «مكة» لا يغيبون عنه."));
        almodatherExes.add(new AlmodatherEx("وَمَهَّدْتُ لَهُ تَمْهِيدًا (14)"));
        almodatherExes.add(new AlmodatherEx("ويسَّرت له سبل العيش تيسيرًا."));
        almodatherExes.add(new AlmodatherEx("ثُمَّ يَطْمَعُ أَنْ أَزِيدَ (15)"));
        almodatherExes.add(new AlmodatherEx("ثم يأمُل بعد هذا العطاء أن أزيد له في ماله وولده."));
        almodatherExes.add(new AlmodatherEx("كَلَّا إِنَّهُ كَانَ لِآيَاتِنَا عَنِيدًا (16)"));
        almodatherExes.add(new AlmodatherEx("وقد كفر بي. ليس الأمر كما يزعم هذا الفاجر الأثيم، لا أزيده على ذلك؛ إنه كان للقرآن وحجج الله على خلقه معاندًا مكذبًا."));
        almodatherExes.add(new AlmodatherEx("سَأُرْهِقُهُ صَعُودًا (17)"));
        almodatherExes.add(new AlmodatherEx("سأكلفه مشقة من العذاب والإرهاق لا راحة له منها. والمراد بهذا الوعيد الوليد بن المغيرة المعاند للحق المبارز لله ولرسوله بالمحاربة، وهذا جزاء كلِّ من عاند الحق ونابذه."));
        almodatherExes.add(new AlmodatherEx("إِنَّهُ فَكَّرَ وَقَدَّرَ (18)"));
        almodatherExes.add(new AlmodatherEx("إنه فكَّر في نفسه، وهيَّأ ما يقوله من الطعن في محمد - صلى الله عليه وسلم - والقرآن."));
        almodatherExes.add(new AlmodatherEx("فَقُتِلَ كَيْفَ قَدَّرَ (19)"));
        almodatherExes.add(new AlmodatherEx("فَلُعِن، واستحق بذلك الهلاك، كيف أعدَّ في نفسه هذا الطعن؟"));
        almodatherExes.add(new AlmodatherEx("ثُمَّ قُتِلَ كَيْفَ قَدَّرَ (20)"));
        almodatherExes.add(new AlmodatherEx("ثم لُعِن كذلك."));
        almodatherExes.add(new AlmodatherEx("ثُمَّ نَظَرَ (21)"));
        almodatherExes.add(new AlmodatherEx("ثم تأمَّل فيما قدَّر وهيَّأ من الطعن في القرآن."));
        almodatherExes.add(new AlmodatherEx("ثُمَّ عَبَسَ وَبَسَرَ (22)"));
        almodatherExes.add(new AlmodatherEx("ثم قطَّب وجهه، واشتدَّ في العبوس والكُلُوح لمَّا ضاقت عليه الحيل، ولم يجد مطعنًا يطعن به في القرآن."));
        almodatherExes.add(new AlmodatherEx("ثُمَّ أَدْبَرَ وَاسْتَكْبَرَ (23)"));
        almodatherExes.add(new AlmodatherEx("ولم يجد مطعنًا يطعن به في القرآن، ثم رجع معرضًا عن الحق، وتعاظم أن يعترف به."));
        almodatherExes.add(new AlmodatherEx("فَقَالَ إِنْ هَذَا إِلَّا سِحْرٌ يُؤْثَرُ (24)"));
        almodatherExes.add(new AlmodatherEx("فقال عن القرآن: ما هذا الذي يقوله محمد إلا سحر يُنْقل عن الأولين."));
        almodatherExes.add(new AlmodatherEx("إِنْ هَذَا إِلَّا قَوْلُ الْبَشَرِ (25)"));
        almodatherExes.add(new AlmodatherEx("ما هذا إلا كلام المخلوقين تعلَّمه محمد منهم، ثم ادَّعى أنه من عند الله."));
        almodatherExes.add(new AlmodatherEx("سَأُصْلِيهِ سَقَرَ (26)"));
        almodatherExes.add(new AlmodatherEx("سأدخله جهنم؛ كي يصلى حرَّها ويحترق بنارها."));
        almodatherExes.add(new AlmodatherEx("وَمَا أَدْرَاكَ مَا سَقَرُ (27)"));
        almodatherExes.add(new AlmodatherEx("وما أعلمك أيُّ شيء جهنم؟"));
        almodatherExes.add(new AlmodatherEx("لَا تُبْقِي وَلَا تَذَرُ (28)"));
        almodatherExes.add(new AlmodatherEx("لا تبقي لحمًا ولا تترك عظمًا إلا أحرقته."));
        almodatherExes.add(new AlmodatherEx("لَوَّاحَةٌ لِلْبَشَرِ (29)"));
        almodatherExes.add(new AlmodatherEx("مغيِّرة للبشرة، مسوِّدة للجلود، محرقة لها."));
        almodatherExes.add(new AlmodatherEx("عَلَيْهَا تِسْعَةَ عَشَرَ (30)"));
        almodatherExes.add(new AlmodatherEx("يلي أمرها ويتسلط على أهلها بالعذاب تسعة عشر ملكًا من الزبانية الأشداء."));
        almodatherExes.add(new AlmodatherEx("وَمَا جَعَلْنَا أَصْحَابَ النَّارِ إِلَّا مَلَائِكَةً وَمَا جَعَلْنَا عِدَّتَهُمْ إِلَّا فِتْنَةً لِلَّذِينَ كَفَرُوا لِيَسْتَيْقِنَ الَّذِينَ أُوتُوا الْكِتَابَ وَيَزْدَادَ الَّذِينَ آمَنُوا إِيمَانًا وَلَا يَرْتَابَ الَّذِينَ أُوتُوا الْكِتَابَ وَالْمُؤْمِنُونَ وَلِيَقُولَ الَّذِينَ فِي قُلُوبِهِمْ مَرَضٌ وَالْكَافِرُونَ مَاذَا أَرَادَ اللَّهُ بِهَذَا مَثَلًا كَذَلِكَ يُضِلُّ اللَّهُ مَنْ يَشَاءُ وَيَهْدِي مَنْ يَشَاءُ وَمَا يَعْلَمُ جُنُودَ رَبِّكَ إِلَّا هُوَ وَمَا هِيَ إِلَّا ذِكْرَى لِلْبَشَرِ (31)"));
        almodatherExes.add(new AlmodatherEx("وما جعلنا خزنة النار إلا من الملائكة الغلاظ، وما جعلنا ذلك العدد إلا اختبارًا للذين كفروا بالله؛ وليحصل اليقين للذين أُعطوا الكتاب من اليهود والنصارى بأنَّ ما جاء في القرآن عن خزنة جهنم إنما هو حق من الله تعالى، حيث وافق ذلك كتبهم، ويزداد المؤمنون تصديقًا بالله ورسوله وعملا بشرعه، ولا يشك في ذلك الذين أُعطوا الكتاب من اليهود والنصارى ولا المؤمنون بالله ورسوله؛ وليقول الذين في قلوبهم نفاق والكافرون: ما الذي أراده الله بهذا العدد المستغرب؟ بمثل ذلك الذي ذُكر يضلُّ الله من أراد إضلاله، ويهدي مَن أراد هدايته، وما يعلم عدد جنود ربك -ومنهم الملائكة- إلا الله وحده. وما النار إلا تذكرة وموعظة للناس."));
        almodatherExes.add(new AlmodatherEx("كَلَّا وَالْقَمَرِ (32)"));
        almodatherExes.add(new AlmodatherEx("ليس الأمر كما ذكروا من التكذيب للرسول فيما جاء به، أقسم الله سبحانه بالقمر."));
        almodatherExes.add(new AlmodatherEx("وَاللَّيْلِ إِذْ أَدْبَرَ (33)"));
        almodatherExes.add(new AlmodatherEx("وبالليل إذ ولى وذهب."));
        almodatherExes.add(new AlmodatherEx("وَالصُّبْحِ إِذَا أَسْفَرَ (34)"));
        almodatherExes.add(new AlmodatherEx("وبالصبح إذا أضاء وانكشف."));
        almodatherExes.add(new AlmodatherEx("إِنَّهَا لَإِحْدَى الْكُبَرِ (35)"));
        almodatherExes.add(new AlmodatherEx("إن النار لإحدى العظائم."));
        almodatherExes.add(new AlmodatherEx("نَذِيرًا لِلْبَشَرِ (36)"));
        almodatherExes.add(new AlmodatherEx("إنذارًا وتخويفًا للناس."));
        almodatherExes.add(new AlmodatherEx("لِمَنْ شَاءَ مِنْكُمْ أَنْ يَتَقَدَّمَ أَوْ يَتَأَخَّرَ (37)"));
        almodatherExes.add(new AlmodatherEx("لمن أراد منكم أن يتقرَّب إلى ربه بفعل الطاعات، أو يتأخر بفعل المعاصي."));
        almodatherExes.add(new AlmodatherEx("كُلُّ نَفْسٍ بِمَا كَسَبَتْ رَهِينَةٌ (38)"));
        almodatherExes.add(new AlmodatherEx("كل نفس بما كسبت من أعمال الشر والسوء محبوسة مرهونة بكسبها، لا تُفَكُّ حتى تؤدي ما عليها من الحقوق والعقوبات."));
        almodatherExes.add(new AlmodatherEx("إِلَّا أَصْحَابَ الْيَمِينِ (39)"));
        almodatherExes.add(new AlmodatherEx("إلا المسلمين المخلصين أصحاب اليمين الذين فكُّوا رقابهم بالطاعة."));
        almodatherExes.add(new AlmodatherEx(") فِي جَنَّاتٍ يَتَسَاءَلُونَ (40)"));
        almodatherExes.add(new AlmodatherEx("هم في جنات لا يُدْرَك وصفها."));
        almodatherExes.add(new AlmodatherEx("عَنِ الْمُجْرِمِينَ (41)"));
        almodatherExes.add(new AlmodatherEx("يسأل بعضهم بعضًا عن الكافرين الذين أجرموا في حق أنفسهم."));
        almodatherExes.add(new AlmodatherEx("مَا سَلَكَكُمْ فِي سَقَرَ (42)"));
        almodatherExes.add(new AlmodatherEx("ما الذي أدخلكم جهنم، وجعلكم تذوقون سعيرها؟"));
        almodatherExes.add(new AlmodatherEx("قَالُوا لَمْ نَكُ مِنَ الْمُصَلِّينَ (43)"));
        almodatherExes.add(new AlmodatherEx("قال المجرمون: لم نكن من المصلِّين في الدنيا."));
        almodatherExes.add(new AlmodatherEx("وَلَمْ نَكُ نُطْعِمُ الْمِسْكِينَ (44)"));
        almodatherExes.add(new AlmodatherEx("ولم نكن نتصدق ونحسن إلى الفقراء والمساكين."));
        almodatherExes.add(new AlmodatherEx("وَكُنَّا نَخُوضُ مَعَ الْخَائِضِينَ (45)"));
        almodatherExes.add(new AlmodatherEx("وكنا نتحدث بالباطل مع أهل الغَواية والضلالة."));
        almodatherExes.add(new AlmodatherEx("وَكُنَّا نُكَذِّبُ بِيَوْمِ الدِّينِ (46)"));
        almodatherExes.add(new AlmodatherEx("وكنا نكذب بيوم الحساب والجزاء."));
        almodatherExes.add(new AlmodatherEx("حَتَّى أَتَانَا الْيَقِينُ (47)"));
        almodatherExes.add(new AlmodatherEx("حتى جاءنا الموت، ونحن في تلك الضلالات والمنكرات."));
        almodatherExes.add(new AlmodatherEx("فَمَا تَنْفَعُهُمْ شَفَاعَةُ الشَّافِعِينَ (48)"));
        almodatherExes.add(new AlmodatherEx("فما تنفعهم شفاعة الشافعين جميعًا من الملائكة والنبيين وغيرهم; لأن الشفاعة إنما تكون لمن ارتضاه الله، وأذن لشفيعه أن يشفع له."));
        almodatherExes.add(new AlmodatherEx("فَمَا لَهُمْ عَنِ التَّذْكِرَةِ مُعْرِضِينَ (49)"));
        almodatherExes.add(new AlmodatherEx("فما لهؤلاء المشركين عن القرآن وما فيه من المواعظ منصرفين؟"));
        almodatherExes.add(new AlmodatherEx("كَأَنَّهُمْ حُمُرٌ مُسْتَنْفِرَةٌ (50)"));
        almodatherExes.add(new AlmodatherEx("كأنهم حمر وحشية شديدة النِّفار."));
        almodatherExes.add(new AlmodatherEx("فَرَّتْ مِنْ قَسْوَرَةٍ (51)"));
        almodatherExes.add(new AlmodatherEx("فرَّت من أسد كاسر."));
        almodatherExes.add(new AlmodatherEx("بَلْ يُرِيدُ كُلُّ امْرِئٍ مِنْهُمْ أَنْ يُؤْتَى صُحُفًا مُنَشَّرَةً (52)"));
        almodatherExes.add(new AlmodatherEx("بل يطمع كل واحد من هؤلاء المشركين أن يُنزل الله عليه كتابًا من السماء منشورًا، كما أنزل على محمد صلى الله عليه وسلم. ليس الأمر كما زعموا."));
        almodatherExes.add(new AlmodatherEx("كَلَّا بَلْ لَا يَخَافُونَ الْآخِرَةَ (53)"));
        almodatherExes.add(new AlmodatherEx("كَلَّا إِنَّهُ تَذْكِرَةٌ (54)"));
        almodatherExes.add(new AlmodatherEx("حقًّا أنَّ القرآن موعظة بليغة كافية لاتِّعاظهم."));
        almodatherExes.add(new AlmodatherEx("فَمَنْ شَاءَ ذَكَرَهُ (55)"));
        almodatherExes.add(new AlmodatherEx("فمن أراد الاتعاظ اتعظ بما فيه وانتفع بهداه."));
        almodatherExes.add(new AlmodatherEx("وَمَا يَذْكُرُونَ إِلَّا أَنْ يَشَاءَ اللَّهُ هُوَ أَهْلُ التَّقْوَى وَأَهْلُ الْمَغْفِرَةِ (56)"));
        almodatherExes.add(new AlmodatherEx("وما يتعظون به إلا أن يشاء الله لهم الهدى. هو سبحانه أهلٌ لأن يُتقى ويطاع، وأهلٌ لأن يغفر لمن آمن به وأطاعه."));

        quran_explanation_74_adapter = new quran_explanation_74_adapter(almodatherExes ,QuranExplanation_74Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_74);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_74Activity.this));
        recyclerView.setAdapter(quran_explanation_74_adapter);


    }

}