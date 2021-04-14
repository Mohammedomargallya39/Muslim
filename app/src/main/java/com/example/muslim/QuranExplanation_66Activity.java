package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_66Activity extends AppCompatActivity {

    ArrayList<AltahremEx> altahremExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_66_adapter quran_explanation_66_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_66);

        altahremExes.add(new AltahremEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        altahremExes.add(new AltahremEx("يَاأَيُّهَا النَّبِيُّ لِمَ تُحَرِّمُ مَا أَحَلَّ اللَّهُ لَكَ تَبْتَغِي مَرْضَاتَ أَزْوَاجِكَ وَاللَّهُ غَفُورٌ رَحِيمٌ (1)"));
        altahremExes.add(new AltahremEx("يا أيها النبي لِمَ تمنع نفسك عن الحلال الذي أحله الله لك، تبتغي إرضاء زوجاتك؟ والله غفور لك، رحيم بك."));
        altahremExes.add(new AltahremEx("قَدْ فَرَضَ اللَّهُ لَكُمْ تَحِلَّةَ أَيْمَانِكُمْ وَاللَّهُ مَوْلَاكُمْ وَهُوَ الْعَلِيمُ الْحَكِيمُ (2)"));
        altahremExes.add(new AltahremEx("قد شرع الله لكم -أيها المؤمنون- تحليل أيمانكم بأداء الكفارة عنها، وهي: إطعام عشرة مساكين، أو كسوتهم، أو تحرير رقبة، فمن لم يجد فصيام ثلاثة أيام. والله ناصركم ومتولي أموركم، وهو العليم بما يصلحكم فيشرعه لكم، الحكيم في أقواله وأفعاله."));
        altahremExes.add(new AltahremEx("وَإِذْ أَسَرَّ النَّبِيُّ إِلَى بَعْضِ أَزْوَاجِهِ حَدِيثًا فَلَمَّا نَبَّأَتْ بِهِ وَأَظْهَرَهُ اللَّهُ عَلَيْهِ عَرَّفَ بَعْضَهُ وَأَعْرَضَ عَنْ بَعْضٍ فَلَمَّا نَبَّأَهَا بِهِ قَالَتْ مَنْ أَنْبَأَكَ هَذَا قَالَ نَبَّأَنِيَ الْعَلِيمُ الْخَبِيرُ (3)"));
        altahremExes.add(new AltahremEx("وإذ أسرَّ النبي إلى زوجته حفصة -رضي الله عنها- حديثا، فلما أخبرت به عائشة رضي الله عنها، وأطلعه الله على إفشائها سرَّه، أعلم حفصة بعض ما أخبرت به، وأعرض عن إعلامها بعضه تكرما، فلما أخبرها بما أفشت من الحديث، قالت: مَن أخبرك بهذا؟ قال: أخبرني به الله العليم الخبير، الذي لا تخفى عليه خافية."));
        altahremExes.add(new AltahremEx("إِنْ تَتُوبَا إِلَى اللَّهِ فَقَدْ صَغَتْ قُلُوبُكُمَا وَإِنْ تَظَاهَرَا عَلَيْهِ فَإِنَّ اللَّهَ هُوَ مَوْلَاهُ وَجِبْرِيلُ وَصَالِحُ الْمُؤْمِنِينَ وَالْمَلَائِكَةُ بَعْدَ ذَلِكَ ظَهِيرٌ (4)"));
        altahremExes.add(new AltahremEx("إن ترجعا -يا حفصة وعائشة- إلى الله فقد وُجد منكما ما يوجب التوبة حيث مالت قلوبكما إلى محبة ما كرهه رسول الله صلى الله عليه وسلم، من إفشاء سرِّه، وإن تتعاونا عليه بما يسوءه، فإن الله وليه وناصره، وجبريل وصالح المؤمنين، والملائكة بعد نصرة الله أعوان له ونصراء على مَن يؤذيه ويعاديه."));
        altahremExes.add(new AltahremEx("عَسَى رَبُّهُ إِنْ طَلَّقَكُنَّ أَنْ يُبْدِلَهُ أَزْوَاجًا خَيْرًا مِنْكُنَّ مُسْلِمَاتٍ مُؤْمِنَاتٍ قَانِتَاتٍ تَائِبَاتٍ عَابِدَاتٍ سَائِحَاتٍ ثَيِّبَاتٍ وَأَبْكَارًا (5)"));
        altahremExes.add(new AltahremEx("عسى ربُّه إن طلقكنَّ -أيتها الزوجات- أن يزوِّجه بدلا منكن زوجات خاضعات لله بالطاعة، مؤمنات بالله ورسوله، مطيعات لله، راجعات إلى ما يحبه الله مِن طاعته، كثيرات العبادة له، صائمات، منهنَّ الثيِّبات، ومنهن الأبكار."));
        altahremExes.add(new AltahremEx("يَاأَيُّهَا الَّذِينَ آمَنُوا قُوا أَنْفُسَكُمْ وَأَهْلِيكُمْ نَارًا وَقُودُهَا النَّاسُ وَالْحِجَارَةُ عَلَيْهَا مَلَائِكَةٌ غِلَاظٌ شِدَادٌ لَا يَعْصُونَ اللَّهَ مَا أَمَرَهُمْ وَيَفْعَلُونَ مَا يُؤْمَرُونَ (6)"));
        altahremExes.add(new AltahremEx("يا أيها الذين صدَّقوا الله ورسوله وعملوا بشرعه، احفظوا أنفسكم بفعل ما أمركم الله به وترك ما نهاكم عنه، واحفظوا أهليكم بما تحفظون به أنفسكم من نار وقودها الناس والحجارة، يقوم على تعذيب أهلها ملائكة أقوياء قساة في معاملاتهم، لا يخالفون الله في أمره، وينفذون ما يؤمرون به."));
        altahremExes.add(new AltahremEx("يَاأَيُّهَا الَّذِينَ كَفَرُوا لَا تَعْتَذِرُوا الْيَوْمَ إِنَّمَا تُجْزَوْنَ مَا كُنْتُمْ تَعْمَلُونَ (7)"));
        altahremExes.add(new AltahremEx("ويقال للذين جحدوا أن الله هو الإله الحق وكفروا به عند إدخالهم النار: لا تلتمسوا المعاذير في هذا اليوم؛ إنما تعطون جزاء الذي كنتم تعملونه في الدنيا."));
        altahremExes.add(new AltahremEx("يَاأَيُّهَا الَّذِينَ آمَنُوا تُوبُوا إِلَى اللَّهِ تَوْبَةً نَصُوحًا عَسَى رَبُّكُمْ أَنْ يُكَفِّرَ عَنْكُمْ سَيِّئَاتِكُمْ وَيُدْخِلَكُمْ جَنَّاتٍ تَجْرِي مِنْ تَحْتِهَا الْأَنْهَارُ يَوْمَ لَا يُخْزِي اللَّهُ النَّبِيَّ وَالَّذِينَ آمَنُوا مَعَهُ نُورُهُمْ يَسْعَى بَيْنَ أَيْدِيهِمْ وَبِأَيْمَانِهِمْ يَقُولُونَ رَبَّنَا أَتْمِمْ لَنَا نُورَنَا وَاغْفِرْ لَنَا إِنَّكَ عَلَى كُلِّ شَيْءٍ قَدِيرٌ (8)"));
        altahremExes.add(new AltahremEx("يا أيها الذين صدَّقوا الله ورسوله وعملوا بشرعه، ارجعوا عن ذنوبكم إلى طاعة الله رجوعا لا معصية بعده، عسى ربكم أن يمحو عنكم سيئات أعمالكم، وأن يدخلكم جنات تجري من تحت قصورها الأنهار، يوم لا يخزي الله النبي والذين آمنوا معه، ولا يعذبهم، بل يُعلي شأنهم، نور هؤلاء يسير أمامهم وبأيمانهم حال مشيهم على الصِّراط بقدر أعمالهم، يقولون: ربنا أتمم لنا نورنا حتى نجوز الصراط، ونهتدي إلى الجنة، واعف عنَّا وتجاوز عن ذنوبنا واسترها علينا، إنك على كل شيء قدير."));
        altahremExes.add(new AltahremEx("يَاأَيُّهَا النَّبِيُّ جَاهِدِ الْكُفَّارَ وَالْمُنَافِقِينَ وَاغْلُظْ عَلَيْهِمْ وَمَأْوَاهُمْ جَهَنَّمُ وَبِئْسَ الْمَصِيرُ (9)"));
        altahremExes.add(new AltahremEx("يا أيها النبي جاهد الذين أظهروا الكفر وأعلنوه، وقاتلهم بالسيف، وجاهد الذين أبطنوا الكفر وأخفوه بالحجة وإقامة الحدود وشعائر الدين، واستعمل مع الفريقين الشدة والخشونة في جهادهما، ومسكنهم الذي يصيرون إليه في الآخرة جهنم، وقَبُح ذلك المرجع الذي يرجعون إليه."));
        altahremExes.add(new AltahremEx("ضَرَبَ اللَّهُ مَثَلًا لِلَّذِينَ كَفَرُوا امْرَأَتَ نُوحٍ وَامْرَأَتَ لُوطٍ كَانَتَا تَحْتَ عَبْدَيْنِ مِنْ عِبَادِنَا صَالِحَيْنِ فَخَانَتَاهُمَا فَلَمْ يُغْنِيَا عَنْهُمَا مِنَ اللَّهِ شَيْئًا وَقِيلَ ادْخُلَا النَّارَ مَعَ الدَّاخِلِينَ (10)"));
        altahremExes.add(new AltahremEx("ضرب الله مثلا لحال الكفرة -في مخالطتهم المسلمين وقربهم منهم ومعاشرتهم لهم، وأن ذلك لا ينفعهم لكفرهم بالله- بحال زوجة نبي الله نوح، وزوجة نبي الله لوط: حيث كانتا في عصمة عبدَين من عبادنا صالحين، فوقعت منهما الخيانة لهما في الدين، فقد كانتا كافرتين، فلم يدفع هذان الرسولان عن زوجتيهما من عذاب الله شيئًا، وقيل للزوجتين: ادخلا النار مع الداخلين فيها.\n" +
                "وفي ضرب هذا المثل دليل على أن القرب من الأنبياء، والصالحين، لا يفيد شيئاً مع العمل السيِّئ.\n"));
        altahremExes.add(new AltahremEx("وَضَرَبَ اللَّهُ مَثَلًا لِلَّذِينَ آمَنُوا امْرَأَتَ فِرْعَوْنَ إِذْ قَالَتْ رَبِّ ابْنِ لِي عِنْدَكَ بَيْتًا فِي الْجَنَّةِ وَنَجِّنِي مِنْ فِرْعَوْنَ وَعَمَلِهِ وَنَجِّنِي مِنَ الْقَوْمِ الظَّالِمِينَ (11)"));
        altahremExes.add(new AltahremEx("وضرب الله مثلا لحال المؤمنين -الذين صدَّقوا الله، وعبدوه وحده، وعملوا بشرعه، وأنهم لا تضرهم مخالطة الكافرين في معاملتهم- بحال زوجة فرعون التي كانت في عصمة أشد الكافرين بالله، وهي مؤمنة بالله، حين قالت: رب ابْنِ لي دارًا عندك في الجنة، وأنقذني من سلطان فرعون وفتنته، ومما يصدر عنه من أعمال الشر، وأنقذني من القوم التابعين له في الظلم والضلال، ومن عذابهم."));
        altahremExes.add(new AltahremEx("وَمَرْيَمَ ابْنَتَ عِمْرَانَ الَّتِي أَحْصَنَتْ فَرْجَهَا فَنَفَخْنَا فِيهِ مِنْ رُوحِنَا وَصَدَّقَتْ بِكَلِمَاتِ رَبِّهَا وَكُتُبِهِ وَكَانَتْ مِنَ الْقَانِتِينَ (12)"));
        altahremExes.add(new AltahremEx("وضرب الله مثلا للذين آمنوا مريم بنت عمران التي حفظت فرجها، وصانته عن الزنى، فأمر الله تعالى جبريل عليه السلام أن ينفخ في جيب قميصها، فوصلت النفخة إلى رحمها، فحملت بعيسى عليه السلام، وصدَّقت بكلمات ربها، وعملت بشرائعه التي شرعها لعباده، وكتبه المنزلة على رسله، وكانت من المطيعين له."));


        quran_explanation_66_adapter = new quran_explanation_66_adapter(altahremExes ,QuranExplanation_66Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_66);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_66Activity.this));
        recyclerView.setAdapter(quran_explanation_66_adapter);


    }

}