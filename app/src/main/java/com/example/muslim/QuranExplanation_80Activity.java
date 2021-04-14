package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_80Activity extends AppCompatActivity {

    ArrayList<AbasaEx> abasaExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_80_adapter quran_explanation_80_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_80);

        abasaExes.add(new AbasaEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        abasaExes.add(new AbasaEx("عَبَسَ وَتَوَلَّى (1)"));
        abasaExes.add(new AbasaEx("ظهر التغير والعبوس في وجه الرسول صلى الله عليه وسلم."));
        abasaExes.add(new AbasaEx("أَنْ جَاءَهُ الْأَعْمَى (2)"));
        abasaExes.add(new AbasaEx("وأعرض لأجل أن الأعمى عبد الله بن أم مكتوم جاءه مسترشدا، وكان الرسول صلى الله عليه وسلم منشغلا بدعوة كبار قريش إلى الإسلام."));
        abasaExes.add(new AbasaEx("وَمَا يُدْرِيكَ لَعَلَّهُ يَزَّكَّى (3)"));
        abasaExes.add(new AbasaEx("وأيُّ شيء يجعلك عالمًا بحقيقة أمره؟ لعله بسؤاله تزكو نفسه وتطهر."));
        abasaExes.add(new AbasaEx("أَوْ يَذَّكَّرُ فَتَنْفَعَهُ الذِّكْرَى (4)"));
        abasaExes.add(new AbasaEx("أو يحصل له المزيد من الاعتبار والازدجار."));
        abasaExes.add(new AbasaEx("أَمَّا مَنِ اسْتَغْنَى (5)"));
        abasaExes.add(new AbasaEx("أما مَن استغنى عن هديك."));
        abasaExes.add(new AbasaEx("فَأَنْتَ لَهُ تَصَدَّى (6)"));
        abasaExes.add(new AbasaEx("فأنت تتعرض له وتصغي لكلامه."));
        abasaExes.add(new AbasaEx("وَمَا عَلَيْكَ أَلَّا يَزَّكَّى (7)"));
        abasaExes.add(new AbasaEx("وأي شيء عليك ألا يتطهر من كفره؟"));
        abasaExes.add(new AbasaEx("وَأَمَّا مَنْ جَاءَكَ يَسْعَى (8)"));
        abasaExes.add(new AbasaEx("وأمَّا من كان حريصا على لقائك."));
        abasaExes.add(new AbasaEx("وَهُوَ يَخْشَى (9)"));
        abasaExes.add(new AbasaEx("وهو يخشى الله من التقصير في الاسترشاد."));
        abasaExes.add(new AbasaEx("فَأَنْتَ عَنْهُ تَلَهَّى (10)"));
        abasaExes.add(new AbasaEx("فأنت عنه تتشاغل."));
        abasaExes.add(new AbasaEx("كَلَّا إِنَّهَا تَذْكِرَةٌ (11)"));
        abasaExes.add(new AbasaEx("ليس الأمر كما فعلت -أيها الرسول-، إن هذه السورة موعظة لك ولكل من شاء الاتعاظ."));
        abasaExes.add(new AbasaEx("فَمَنْ شَاءَ ذَكَرَهُ (12)"));
        abasaExes.add(new AbasaEx("فمن شاء ذكر الله وَأْتَمَّ بوحيه. هذا الوحي."));
        abasaExes.add(new AbasaEx("فِي صُحُفٍ مُكَرَّمَةٍ (13)"));
        abasaExes.add(new AbasaEx("و القرآن في صحف معظمة، موقرة."));
        abasaExes.add(new AbasaEx("مَرْفُوعَةٍ مُطَهَّرَةٍ (14)"));
        abasaExes.add(new AbasaEx("عالية القدر مطهرة من الدنس والزيادة والنقص."));
        abasaExes.add(new AbasaEx("بِأَيْدِي سَفَرَةٍ (15)"));
        abasaExes.add(new AbasaEx("بأيدي ملائكة كتبة، سفراء بين الله وخلقه."));
        abasaExes.add(new AbasaEx("كِرَامٍ بَرَرَةٍ (16)"));
        abasaExes.add(new AbasaEx("كرام الخلق، أخلاقهم وأفعالهم بارة طاهرة."));
        abasaExes.add(new AbasaEx("قُتِلَ الْإِنْسَانُ مَا أَكْفَرَهُ (17)"));
        abasaExes.add(new AbasaEx("لُعِنَ الإنسان الكافر وعُذِّب، ما أشدَّ كفره بربه!!"));
        abasaExes.add(new AbasaEx("مِنْ أَيِّ شَيْءٍ خَلَقَهُ (18)"));
        abasaExes.add(new AbasaEx("ألم ير مِن أيِّ شيء خلقه الله أول مرة؟"));
        abasaExes.add(new AbasaEx("مِنْ نُطْفَةٍ خَلَقَهُ فَقَدَّرَهُ (19)"));
        abasaExes.add(new AbasaEx("خلقه الله من ماء قليل -وهو المَنِيُّ- فقدَّره أطوارا."));
        abasaExes.add(new AbasaEx("ثُمَّ السَّبِيلَ يَسَّرَهُ (20)"));
        abasaExes.add(new AbasaEx("ثم بين له طريق الخير والشر."));
        abasaExes.add(new AbasaEx("ثُمَّ أَمَاتَهُ فَأَقْبَرَهُ (21)"));
        abasaExes.add(new AbasaEx("ثم أماته فجعل له مكانًا يُقبر فيه."));
        abasaExes.add(new AbasaEx("ثُمَّ إِذَا شَاءَ أَنْشَرَهُ (22)"));
        abasaExes.add(new AbasaEx("ثم إذا شاء سبحانه أحياه، وبعثه بعد موته للحساب والجزاء."));
        abasaExes.add(new AbasaEx("كَلَّا لَمَّا يَقْضِ مَا أَمَرَهُ (23)"));
        abasaExes.add(new AbasaEx("ليس الأمر كما يقول الكافر ويفعل، فلم يُؤَدِّ ما أمره الله به من الإيمان والعمل بطاعته."));
        abasaExes.add(new AbasaEx("فَلْيَنْظُرِ الْإِنْسَانُ إِلَى طَعَامِهِ (24)"));
        abasaExes.add(new AbasaEx("فليتدبر الإنسان: كيف خلق الله طعامه الذي هو قوام حياته؟"));
        abasaExes.add(new AbasaEx("أَنَّا صَبَبْنَا الْمَاءَ صَبًّا (25)"));
        abasaExes.add(new AbasaEx("بأنَّا صببنا الماء على الأرض صَبًّا."));
        abasaExes.add(new AbasaEx("ثُمَّ شَقَقْنَا الْأَرْضَ شَقًّا (26)"));
        abasaExes.add(new AbasaEx("ثم شققناها بما أخرجنا منها من نبات شتى."));
        abasaExes.add(new AbasaEx("فَأَنْبَتْنَا فِيهَا حَبًّا (27)"));
        abasaExes.add(new AbasaEx("فأنبتنا فيها حبًا."));
        abasaExes.add(new AbasaEx("وَعِنَبًا وَقَضْبًا (28)"));
        abasaExes.add(new AbasaEx("وعنبًا وعلفًا للدواب."));
        abasaExes.add(new AbasaEx("وَزَيْتُونًا وَنَخْلًا (29)"));
        abasaExes.add(new AbasaEx("وزيتونًا ونخلا."));
        abasaExes.add(new AbasaEx("وَحَدَائِقَ غُلْبًا (30)"));
        abasaExes.add(new AbasaEx("وحدائق عظيمة الأشجار."));
        abasaExes.add(new AbasaEx("وَفَاكِهَةً وَأَبًّا (31)"));
        abasaExes.add(new AbasaEx("وثمارًا وكلأ."));
        abasaExes.add(new AbasaEx("مَتَاعًا لَكُمْ وَلِأَنْعَامِكُمْ (32)"));
        abasaExes.add(new AbasaEx("تَنْعَمون بها أنتم وأنعامكم."));
        abasaExes.add(new AbasaEx("فَإِذَا جَاءَتِ الصَّاخَّةُ (33)"));
        abasaExes.add(new AbasaEx("فإذا جاءت صيحة البعث يوم القيامة التي تصمُّ مِن هولها الأسماع."));
        abasaExes.add(new AbasaEx("يَوْمَ يَفِرُّ الْمَرْءُ مِنْ أَخِيهِ (34)"));
        abasaExes.add(new AbasaEx("يوم يفرُّ المرء لهول ذلك اليوم من أخيه."));
        abasaExes.add(new AbasaEx("وَأُمِّهِ وَأَبِيهِ (35)"));
        abasaExes.add(new AbasaEx("وأمه وأبيه."));
        abasaExes.add(new AbasaEx("وَصَاحِبَتِهِ وَبَنِيهِ (36)"));
        abasaExes.add(new AbasaEx("وزوجه وبنيه."));
        abasaExes.add(new AbasaEx("لِكُلِّ امْرِئٍ مِنْهُمْ يَوْمَئِذٍ شَأْنٌ يُغْنِيهِ (37)"));
        abasaExes.add(new AbasaEx("لكل واحد منهم يومئذٍ أمر يشغله ويمنعه من الانشغال بغيره."));
        abasaExes.add(new AbasaEx("وُجُوهٌ يَوْمَئِذٍ مُسْفِرَةٌ (38)"));
        abasaExes.add(new AbasaEx("وجوه أهل النعيم في ذلك اليوم مستنيرة."));
        abasaExes.add(new AbasaEx("ضَاحِكَةٌ مُسْتَبْشِرَةٌ (39)"));
        abasaExes.add(new AbasaEx("مسرورة فرحة."));
        abasaExes.add(new AbasaEx("وَوُجُوهٌ يَوْمَئِذٍ عَلَيْهَا غَبَرَةٌ (40)"));
        abasaExes.add(new AbasaEx("ووجوه أهل الجحيم مظلمة مسودَّة."));
        abasaExes.add(new AbasaEx("تَرْهَقُهَا قَتَرَةٌ (41)"));
        abasaExes.add(new AbasaEx("تغشاها ذلَّة."));
        abasaExes.add(new AbasaEx("أُولَئِكَ هُمُ الْكَفَرَةُ الْفَجَرَةُ (42)"));
        abasaExes.add(new AbasaEx("أولئك الموصوفون بهذا الوصف هم الذين كفروا بنعم الله وكذَّبوا بآياته، وتجرؤوا على محارمه بالفجور والطغيان."));


        quran_explanation_80_adapter = new quran_explanation_80_adapter(abasaExes ,QuranExplanation_80Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_80);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_80Activity.this));
        recyclerView.setAdapter(quran_explanation_80_adapter);


    }

}