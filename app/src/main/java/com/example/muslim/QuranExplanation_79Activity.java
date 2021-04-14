package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_79Activity extends AppCompatActivity {

    ArrayList<AlnazeatEx> alnazeatExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_79_adapter quran_explanation_79_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_79);

        alnazeatExes.add(new AlnazeatEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alnazeatExes.add(new AlnazeatEx("وَالنَّازِعَاتِ غَرْقًا (1)"));
        alnazeatExes.add(new AlnazeatEx("أقسم الله تعالى بالملائكة التي تنزع أرواح الكفار نزعا شديدا."));
        alnazeatExes.add(new AlnazeatEx("وَالنَّاشِطَاتِ نَشْطًا (2)"));
        alnazeatExes.add(new AlnazeatEx("والملائكة التي تقبض أرواح المؤمنين بنشاط ورفق."));
        alnazeatExes.add(new AlnazeatEx("وَالسَّابِحَاتِ سَبْحًا (3)"));
        alnazeatExes.add(new AlnazeatEx("والملائكة التي تَسْبَح في نزولها من السماء وصعودها إليها."));
        alnazeatExes.add(new AlnazeatEx("فَالسَّابِقَاتِ سَبْقًا (4)"));
        alnazeatExes.add(new AlnazeatEx("فالملائكة التي تسبق وتسارع إلى تنفيذ أمر الله."));
        alnazeatExes.add(new AlnazeatEx("فَالْمُدَبِّرَاتِ أَمْرًا (5)"));
        alnazeatExes.add(new AlnazeatEx("فالملائكة المنفذات أمر ربها فيما أوكل إليها تدبيره من شؤون الكون -ولا يجوز للمخلوق أن يقسم بغير خالقه، فإن فعل فقد أشرك- لتُبعثَنَّ الخلائق وتُحَاسَب."));
        alnazeatExes.add(new AlnazeatEx("يَوْمَ تَرْجُفُ الرَّاجِفَةُ (6)"));
        alnazeatExes.add(new AlnazeatEx("يوم تضطرب الأرض بالنفخة الأولى نفخة الإماتة."));
        alnazeatExes.add(new AlnazeatEx("تَتْبَعُهَا الرَّادِفَةُ (7)"));
        alnazeatExes.add(new AlnazeatEx("تتبعها نفخة أخرى للإحياء."));
        alnazeatExes.add(new AlnazeatEx("قُلُوبٌ يَوْمَئِذٍ وَاجِفَةٌ (8)"));
        alnazeatExes.add(new AlnazeatEx("قلوب الكفار يومئذ مضطربة من شدة الخوف."));
        alnazeatExes.add(new AlnazeatEx("أَبْصَارُهَا خَاشِعَةٌ (9)"));
        alnazeatExes.add(new AlnazeatEx("أبصار أصحابها ذليلة من هول ما ترى."));
        alnazeatExes.add(new AlnazeatEx("يَقُولُونَ أَإِنَّا لَمَرْدُودُونَ فِي الْحَافِرَةِ (10)"));
        alnazeatExes.add(new AlnazeatEx("يقول هؤلاء المكذبون بالبعث: أنُرَدُّ بعد موتنا إلى ما كنا عليه أحياء في الأرض؟"));
        alnazeatExes.add(new AlnazeatEx("أَإِذَا كُنَّا عِظَامًا نَخِرَةً (11)"));
        alnazeatExes.add(new AlnazeatEx("أنردُّ وقد صرنا عظامًا بالية؟"));
        alnazeatExes.add(new AlnazeatEx("قَالُوا تِلْكَ إِذًا كَرَّةٌ خَاسِرَةٌ (12)"));
        alnazeatExes.add(new AlnazeatEx("قالوا: رجعتنا تلك ستكون إذًا خائبة كاذبة."));
        alnazeatExes.add(new AlnazeatEx("فَإِنَّمَا هِيَ زَجْرَةٌ وَاحِدَةٌ (13)"));
        alnazeatExes.add(new AlnazeatEx("فإنما هي نفخة واحدة."));
        alnazeatExes.add(new AlnazeatEx("فَإِذَا هُمْ بِالسَّاهِرَةِ (14)"));
        alnazeatExes.add(new AlnazeatEx("فإذا هم أحياء على وجه الأرض بعد أن كانوا في بطنها."));
        alnazeatExes.add(new AlnazeatEx("هَلْ أَتَاكَ حَدِيثُ مُوسَى (15)"));
        alnazeatExes.add(new AlnazeatEx("هل أتاك -أيها الرسول- خبر موسى؟ حين ناداه ربه بالوادي المطهَّر المبارك «طوى» ."));
        alnazeatExes.add(new AlnazeatEx("إِذْ نَادَاهُ رَبُّهُ بِالْوَادِ الْمُقَدَّسِ طُوًى (16)"));
        alnazeatExes.add(new AlnazeatEx("فقال له:"));
        alnazeatExes.add(new AlnazeatEx("اذْهَبْ إِلَى فِرْعَوْنَ إِنَّهُ طَغَى (17)"));
        alnazeatExes.add(new AlnazeatEx("اذهب إلى فرعون، إنه قد أفرط في العصيان."));
        alnazeatExes.add(new AlnazeatEx("فَقُلْ هَلْ لَكَ إِلَى أَنْ تَزَكَّى (18)"));
        alnazeatExes.add(new AlnazeatEx("فقل له: أتودُّ أن تطهِّر نفسك من النقائص وتحليها بالإيمان."));
        alnazeatExes.add(new AlnazeatEx("وَأَهْدِيَكَ إِلَى رَبِّكَ فَتَخْشَى (19)"));
        alnazeatExes.add(new AlnazeatEx("وأُرشدك إلى طاعة ربك، فتخشاه وتتقيه؟"));
        alnazeatExes.add(new AlnazeatEx("فَأَرَاهُ الْآيَةَ الْكُبْرَى (20)"));
        alnazeatExes.add(new AlnazeatEx("فأرى موسى فرعونَ العلامة العظمى: العصا واليد."));
        alnazeatExes.add(new AlnazeatEx("فَكَذَّبَ وَعَصَى (21)"));
        alnazeatExes.add(new AlnazeatEx("فكذب فرعون نبيَّ الله موسى عليه السلام، وعصى ربه عزَّ وجلَّ."));
        alnazeatExes.add(new AlnazeatEx("ثُمَّ أَدْبَرَ يَسْعَى (22)"));
        alnazeatExes.add(new AlnazeatEx("ثم ولَّى معرضًا عن الإيمان مجتهدًا في معارضة موسى."));
        alnazeatExes.add(new AlnazeatEx("فَحَشَرَ فَنَادَى (23)"));
        alnazeatExes.add(new AlnazeatEx("فجمع أهل مملكته وناداهم."));
        alnazeatExes.add(new AlnazeatEx("فَقَالَ أَنَا رَبُّكُمُ الْأَعْلَى (24)"));
        alnazeatExes.add(new AlnazeatEx("فقال: أنا ربكم الذي لا ربَّ فوقه."));
        alnazeatExes.add(new AlnazeatEx("فَأَخَذَهُ اللَّهُ نَكَالَ الْآخِرَةِ وَالْأُولَى (25)"));
        alnazeatExes.add(new AlnazeatEx("فانتقم الله منه بالعذاب في الدنيا والآخرة وجعله عبرة ونكالا لأمثاله من المتمردين ."));
        alnazeatExes.add(new AlnazeatEx("إِنَّ فِي ذَلِكَ لَعِبْرَةً لِمَنْ يَخْشَى (26)"));
        alnazeatExes.add(new AlnazeatEx("إن في فرعون وما نزل به من العذاب لموعظةً لمن يتعظ وينزجر."));
        alnazeatExes.add(new AlnazeatEx("أَأَنْتُمْ أَشَدُّ خَلْقًا أَمِ السَّمَاءُ بَنَاهَا (27)"));
        alnazeatExes.add(new AlnazeatEx("أبَعْثُكم -أيها الناس- بعد الموت أشد في تقديركم أم خلق السماء؟"));
        alnazeatExes.add(new AlnazeatEx("رَفَعَ سَمْكَهَا فَسَوَّاهَا (28)"));
        alnazeatExes.add(new AlnazeatEx("رفعها فوقكم كالبناء، وأعلى سقفها في الهواء لا تفاوت فيها ولا فطور."));
        alnazeatExes.add(new AlnazeatEx("وَأَغْطَشَ لَيْلَهَا وَأَخْرَجَ ضُحَاهَا (29)"));
        alnazeatExes.add(new AlnazeatEx("وأظلم ليلها بغروب شمسها، وأبرز نهارها بشروقها."));
        alnazeatExes.add(new AlnazeatEx("وَالْأَرْضَ بَعْدَ ذَلِكَ دَحَاهَا (30)"));
        alnazeatExes.add(new AlnazeatEx("والأرض بعد خلق السماء بسطها."));
        alnazeatExes.add(new AlnazeatEx("أَخْرَجَ مِنْهَا مَاءَهَا وَمَرْعَاهَا (31)"));
        alnazeatExes.add(new AlnazeatEx("وأودع فيها منافعها، وفجَّر فيها عيون الماء، وأنبت فيها ما يُرعى من النباتات."));
        alnazeatExes.add(new AlnazeatEx("وَالْجِبَالَ أَرْسَاهَا (32)"));
        alnazeatExes.add(new AlnazeatEx("وأثبت فيها الجبال أوتادًا لها."));
        alnazeatExes.add(new AlnazeatEx("مَتَاعًا لَكُمْ وَلِأَنْعَامِكُمْ (33)"));
        alnazeatExes.add(new AlnazeatEx("خلق سبحانه كل هذه النعم منفعة لكم ولأنعامكم.\n" +
                "إن إعادة خلقكم يوم القيامة أهون على الله من خلق هذه الأشياء، وكله على الله هين يسير.\n"));
        alnazeatExes.add(new AlnazeatEx("فَإِذَا جَاءَتِ الطَّامَّةُ الْكُبْرَى (34)"));
        alnazeatExes.add(new AlnazeatEx("فإذا جاءت القيامة الكبرى والشدة العظمى وهي النفخة الثانية."));
        alnazeatExes.add(new AlnazeatEx("يَوْمَ يَتَذَكَّرُ الْإِنْسَانُ مَا سَعَى (35)"));
        alnazeatExes.add(new AlnazeatEx("عندئذ يُعْرَض على الإنسان كل عمله من خير وشر، فيتذكره ويعترف به."));
        alnazeatExes.add(new AlnazeatEx("وَبُرِّزَتِ الْجَحِيمُ لِمَنْ يَرَى (36)"));
        alnazeatExes.add(new AlnazeatEx("وأُظهرت جهنم لكل مُبْصِر تُرى عِيانًا."));
        alnazeatExes.add(new AlnazeatEx("فَأَمَّا مَنْ طَغَى (37)"));
        alnazeatExes.add(new AlnazeatEx("فأمَّا مَن تمرد على أمر الله."));
        alnazeatExes.add(new AlnazeatEx("وَآثَرَ الْحَيَاةَ الدُّنْيَا (38)"));
        alnazeatExes.add(new AlnazeatEx("وفضل الحياة الدنيا على الآخرة."));
        alnazeatExes.add(new AlnazeatEx("فَإِنَّ الْجَحِيمَ هِيَ الْمَأْوَى (39)"));
        alnazeatExes.add(new AlnazeatEx("فإن مصيره إلى النار."));
        alnazeatExes.add(new AlnazeatEx("وَأَمَّا مَنْ خَافَ مَقَامَ رَبِّهِ وَنَهَى النَّفْسَ عَنِ الْهَوَى (40)"));
        alnazeatExes.add(new AlnazeatEx("وأمَّا مَنْ خاف القيام بين يدي الله للحساب، ونهى النفس عن الأهواء الفاسدة."));
        alnazeatExes.add(new AlnazeatEx("فَإِنَّ الْجَنَّةَ هِيَ الْمَأْوَى (41)"));
        alnazeatExes.add(new AlnazeatEx("فإن الجنة هي مسكنه."));
        alnazeatExes.add(new AlnazeatEx("يَسْأَلُونَكَ عَنِ السَّاعَةِ أَيَّانَ مُرْسَاهَا (42)"));
        alnazeatExes.add(new AlnazeatEx("يسألك المشركون أيها الرسول -استخفافاً- عن وقت حلول الساعة التي تتوعدهم بها."));
        alnazeatExes.add(new AlnazeatEx("فِيمَ أَنْتَ مِنْ ذِكْرَاهَا (43)"));
        alnazeatExes.add(new AlnazeatEx("لستَ في شيء مِن علمها."));
        alnazeatExes.add(new AlnazeatEx("إِلَى رَبِّكَ مُنْتَهَاهَا (44)"));
        alnazeatExes.add(new AlnazeatEx("بل مرد ذلك إلى الله عز وجل."));
        alnazeatExes.add(new AlnazeatEx("إِنَّمَا أَنْتَ مُنْذِرُ مَنْ يَخْشَاهَا (45)"));
        alnazeatExes.add(new AlnazeatEx("وإنما شأنك في أمر الساعة أن تحذر منها مَن يخافها."));
        alnazeatExes.add(new AlnazeatEx("كَأَنَّهُمْ يَوْمَ يَرَوْنَهَا لَمْ يَلْبَثُوا إِلَّا عَشِيَّةً أَوْ ضُحَاهَا (46)"));
        alnazeatExes.add(new AlnazeatEx("كأنهم يوم يرون قيام الساعة لم يلبثوا في الحياة الدنيا؛ لهول الساعة إلا ما بين الظهر إلى غروب الشمس، أو ما بين طلوع الشمس إلى نصف النهار."));

        quran_explanation_79_adapter = new quran_explanation_79_adapter(alnazeatExes ,QuranExplanation_79Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_79);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_79Activity.this));
        recyclerView.setAdapter(quran_explanation_79_adapter);


    }

}