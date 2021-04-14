package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_89Activity extends AppCompatActivity {

    ArrayList<AlfagrEx> alfagrExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_89_adapter quran_explanation_89_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_89);

        alfagrExes.add(new AlfagrEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alfagrExes.add(new AlfagrEx("وَالْفَجْرِ (1)"));
        alfagrExes.add(new AlfagrEx("أقسم الله سبحانه بوقت الفجر."));
        alfagrExes.add(new AlfagrEx("وَلَيَالٍ عَشْرٍ (2)"));
        alfagrExes.add(new AlfagrEx("والليالي العشر الأوَل من ذي الحجة وما شرفت به، وبكل شفع وفرد."));
        alfagrExes.add(new AlfagrEx("وَاللَّيْلِ إِذَا يَسْرِ (4)"));
        alfagrExes.add(new AlfagrEx("وبالليل إذا يَسْري بظلامه."));
        alfagrExes.add(new AlfagrEx("هَلْ فِي ذَلِكَ قَسَمٌ لِذِي حِجْرٍ (5)"));
        alfagrExes.add(new AlfagrEx("أليس في الأقسام المذكورة مَقْنَع لذي عقل؟"));
        alfagrExes.add(new AlfagrEx("أَلَمْ تَرَ كَيْفَ فَعَلَ رَبُّكَ بِعَادٍ (6)"));
        alfagrExes.add(new AlfagrEx("ألم تر -أيها الرسول- كيف فعل ربُّك بقوم عاد."));
        alfagrExes.add(new AlfagrEx("إِرَمَ ذَاتِ الْعِمَادِ (7)"));
        alfagrExes.add(new AlfagrEx("قبيلة إرم، ذات القوة والأبنية المرفوعة على الأعمدة."));
        alfagrExes.add(new AlfagrEx("الَّتِي لَمْ يُخْلَقْ مِثْلُهَا فِي الْبِلَادِ (8)"));
        alfagrExes.add(new AlfagrEx("التي لم يُخلق مثلها في البلاد في عِظَم الأجساد وقوة البأس؟"));
        alfagrExes.add(new AlfagrEx("وَثَمُودَ الَّذِينَ جَابُوا الصَّخْرَ بِالْوَادِ (9)"));
        alfagrExes.add(new AlfagrEx("وكيف فعل بثمود قوم صالح الذين قطعوا الصخر بالوادي واتخذوا منه بيوتًا؟"));
        alfagrExes.add(new AlfagrEx("وَفِرْعَوْنَ ذِي الْأَوْتَادِ (10)"));
        alfagrExes.add(new AlfagrEx("وكيف فعل بفرعون مَلِك «مصر» ، صاحب الجنود الذين ثبَّتوا مُلْكه، وقوَّوا له أمره؟"));
        alfagrExes.add(new AlfagrEx("الَّذِينَ طَغَوْا فِي الْبِلَادِ (11)"));
        alfagrExes.add(new AlfagrEx("هؤلاء الذين استبدُّوا، وظلموا في بلاد الله."));
        alfagrExes.add(new AlfagrEx("فَأَكْثَرُوا فِيهَا الْفَسَادَ (12)"));
        alfagrExes.add(new AlfagrEx("فأكثروا فيها بظلمهم الفساد."));
        alfagrExes.add(new AlfagrEx("فَصَبَّ عَلَيْهِمْ رَبُّكَ سَوْطَ عَذَابٍ (13)"));
        alfagrExes.add(new AlfagrEx("فصب عليهم ربُّك عذابا شديدا."));
        alfagrExes.add(new AlfagrEx("إِنَّ رَبَّكَ لَبِالْمِرْصَادِ (14)"));
        alfagrExes.add(new AlfagrEx("إنَّ ربك -أيها الرسول- لبالمرصاد لمن يعصيه، يمهله قليلا ثم يأخذه أخْذَ عزيز مقتدر."));
        alfagrExes.add(new AlfagrEx("فَأَمَّا الْإِنْسَانُ إِذَا مَا ابْتَلَاهُ رَبُّهُ فَأَكْرَمَهُ وَنَعَّمَهُ فَيَقُولُ رَبِّي أَكْرَمَنِ (15)"));
        alfagrExes.add(new AlfagrEx("فأما الإنسان إذا ما اختبره ربه بالنعمة، وبسط له رزقه، وجعله في أطيب عيش، فيظن أن ذلك لكرامته عند ربه، فيقول: ربي أكرمن."));
        alfagrExes.add(new AlfagrEx("وَأَمَّا إِذَا مَا ابْتَلَاهُ فَقَدَرَ عَلَيْهِ رِزْقَهُ فَيَقُولُ رَبِّي أَهَانَنِ (16)"));
        alfagrExes.add(new AlfagrEx("وأما إذا ما اختبره، فضيَّق عليه رزقه، فيظن أن ذلك لهوانه على الله، فيقول: ربي أهانن."));
        alfagrExes.add(new AlfagrEx("كَلَّا بَلْ لَا تُكْرِمُونَ الْيَتِيمَ (17)"));
        alfagrExes.add(new AlfagrEx("ليس الأمر كما يظن هذا الإنسان، بل الإكرام بطاعة الله، والإهانة بمعصيته، وأنتم لا تكرمون اليتيم الذي مات أبوه وهو صغير، ولا تحسنون معاملته."));
        alfagrExes.add(new AlfagrEx("وَلَا تَحَاضُّونَ عَلَى طَعَامِ الْمِسْكِينِ (18)"));
        alfagrExes.add(new AlfagrEx("لا يَحُثُّ بعضكم بعضًا على إطعام المحتاج الذي لا يملك ما يكفيه ويسد حاجته."));
        alfagrExes.add(new AlfagrEx("وَتَأْكُلُونَ التُّرَاثَ أَكْلًا لَمًّا (19)"));
        alfagrExes.add(new AlfagrEx("وتأكلون حقوق الآخرين في الميراث أكلا شديدًا."));
        alfagrExes.add(new AlfagrEx("وَتُحِبُّونَ الْمَالَ حُبًّا جَمًّا (20)"));
        alfagrExes.add(new AlfagrEx("وتحبون المال حبًا مفرطًا."));
        alfagrExes.add(new AlfagrEx("كَلَّا إِذَا دُكَّتِ الْأَرْضُ دَكًّا دَكًّا (21)"));
        alfagrExes.add(new AlfagrEx("ما هكذا ينبغي أن يكون حالكم. فإذا زلزلت الأرض وكَسَّر بعضُها بعضًا."));
        alfagrExes.add(new AlfagrEx("وَجَاءَ رَبُّكَ وَالْمَلَكُ صَفًّا صَفًّا (22)"));
        alfagrExes.add(new AlfagrEx("وجاء ربُّك لفصل القضاء بين خلقه، والملائكة صفوفًا صفوفًا."));
        alfagrExes.add(new AlfagrEx("وَجِيءَ يَوْمَئِذٍ بِجَهَنَّمَ يَوْمَئِذٍ يَتَذَكَّرُ الْإِنْسَانُ وَأَنَّى لَهُ الذِّكْرَى (23)"));
        alfagrExes.add(new AlfagrEx("وجيء في ذلك اليوم العظيم بجهنم، يومئذ يتعظ الكافر ويتوب، وكيف ينفعه الاتعاظ والتوبة، وقد فرَّط فيهما في الدنيا، وفات أوانهما؟"));
        alfagrExes.add(new AlfagrEx("يَقُولُ يَالَيْتَنِي قَدَّمْتُ لِحَيَاتِي (24)"));
        alfagrExes.add(new AlfagrEx("يقول: يا ليتني قدَّمتُ في الدنيا من الأعمال ما ينفعني لحياتي في الآخرة."));
        alfagrExes.add(new AlfagrEx("فَيَوْمَئِذٍ لَا يُعَذِّبُ عَذَابَهُ أَحَدٌ (25)"));
        alfagrExes.add(new AlfagrEx("ففي ذلك اليوم العصيب لا يستطيع أحدٌ ولا يقدر أن يُعذِّبَ مثل تعذيب الله من عصاه."));
        alfagrExes.add(new AlfagrEx("وَلَا يُوثِقُ وَثَاقَهُ أَحَدٌ (26)"));
        alfagrExes.add(new AlfagrEx("ولا يستطيع أحد أن يوثِقَ مثل وثاق الله، ولا يبلغ أحدٌ مبلغه في ذلك."));
        alfagrExes.add(new AlfagrEx("يَاأَيَّتُهَا النَّفْسُ الْمُطْمَئِنَّةُ (27)"));
        alfagrExes.add(new AlfagrEx("يا أيتها النفس المطمئنة إلى ذِكر الله والإيمان به، وبما أعدَّه من النعيم للمؤمنين."));
        alfagrExes.add(new AlfagrEx("ارْجِعِي إِلَى رَبِّكِ رَاضِيَةً مَرْضِيَّةً (28)"));
        alfagrExes.add(new AlfagrEx("ارجعي إلى ربك راضية بإكرام الله لك، والله سبحانه قد رضي عنك."));
        alfagrExes.add(new AlfagrEx("فَادْخُلِي فِي عِبَادِي (29)"));
        alfagrExes.add(new AlfagrEx("فادخلي في عداد عباد الله الصالحين."));
        alfagrExes.add(new AlfagrEx("وَادْخُلِي جَنَّتِي (30)"));
        alfagrExes.add(new AlfagrEx("وادخلي معهم جنتي."));


        quran_explanation_89_adapter = new quran_explanation_89_adapter(alfagrExes ,QuranExplanation_89Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_89);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_89Activity.this));
        recyclerView.setAdapter(quran_explanation_89_adapter);


    }

}