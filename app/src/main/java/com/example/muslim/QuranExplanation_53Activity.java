package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_53Activity extends AppCompatActivity {

    ArrayList<AlnagmEx> alnagmExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_53_adapter quran_explanation_53_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_53);

        alnagmExes.add(new AlnagmEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alnagmExes.add(new AlnagmEx("وَالنَّجْمِ إِذَا هَوَى (1)"));
        alnagmExes.add(new AlnagmEx("أقسم الله تعالى بالنجوم إذا غابت."));
        alnagmExes.add(new AlnagmEx("مَا ضَلَّ صَاحِبُكُمْ وَمَا غَوَى (2)"));
        alnagmExes.add(new AlnagmEx("ما حاد محمد صلى الله عليه وسلم عن طريق الهداية والحق، وما خرج عن الرشاد، بل هو في غاية الاستقامة والاعتدال والسداد."));
        alnagmExes.add(new AlnagmEx("وَمَا يَنْطِقُ عَنِ الْهَوَى (3)"));
        alnagmExes.add(new AlnagmEx("وليس نطقه صادرًا عن هوى نفسه."));
        alnagmExes.add(new AlnagmEx("إِنْ هُوَ إِلَّا وَحْيٌ يُوحَى (4)"));
        alnagmExes.add(new AlnagmEx("ما القرآن وما السنة إلا وحي من الله إلى نبيه محمد صلى الله عليه وسلم."));
        alnagmExes.add(new AlnagmEx("عَلَّمَهُ شَدِيدُ الْقُوَى (5)"));
        alnagmExes.add(new AlnagmEx("علَّم محمدًا صلى الله عليه وسلم مَلَك شديد القوة."));
        alnagmExes.add(new AlnagmEx("ذُو مِرَّةٍ فَاسْتَوَى (6)"));
        alnagmExes.add(new AlnagmEx("ذو منظر حسن، وهو جبريل عليه السلام، الذي ظهر واستوى على صورته الحقيقية للرسول صلى الله عليه وسلم."));
        alnagmExes.add(new AlnagmEx("وَهُوَ بِالْأُفُقِ الْأَعْلَى (7)"));
        alnagmExes.add(new AlnagmEx("في الأفق الأعلى، وهو أفق الشمس عند مطلعها."));
        alnagmExes.add(new AlnagmEx("ثُمَّ دَنَا فَتَدَلَّى (8)"));
        alnagmExes.add(new AlnagmEx("ثم دنا جبريل من الرسول صلى الله عليه وسلم، فزاد في القرب."));
        alnagmExes.add(new AlnagmEx("فَكَانَ قَابَ قَوْسَيْنِ أَوْ أَدْنَى (9)"));
        alnagmExes.add(new AlnagmEx("فكان دنوُّه مقدار قوسين أو أقرب من ذلك."));
        alnagmExes.add(new AlnagmEx("فَأَوْحَى إِلَى عَبْدِهِ مَا أَوْحَى (10)"));
        alnagmExes.add(new AlnagmEx("وحى الله سبحانه وتعالى إلى عبده محمد صلى الله عليه وسلم ما أوحى بواسطة جبريل عليه السلام."));
        alnagmExes.add(new AlnagmEx("مَا كَذَبَ الْفُؤَادُ مَا رَأَى (11)"));
        alnagmExes.add(new AlnagmEx("ما كذب قلب محمد صلى الله عليه وسلم ما رآه بصره."));
        alnagmExes.add(new AlnagmEx("أَفَتُمَارُونَهُ عَلَى مَا يَرَى (12)"));
        alnagmExes.add(new AlnagmEx("أتُكذِّبون محمدًا صلى الله عليه وسلم، فتجادلونه على ما يراه ويشاهده من آيات ربه؟"));
        alnagmExes.add(new AlnagmEx("وَلَقَدْ رَآهُ نَزْلَةً أُخْرَى (13)"));
        alnagmExes.add(new AlnagmEx("ولقد رأى محمد صلى الله عليه وسلم جبريل على صورته الحقيقية مرة أخرى"));
        alnagmExes.add(new AlnagmEx("عِنْدَ سِدْرَةِ الْمُنْتَهَى (14)"));
        alnagmExes.add(new AlnagmEx("عند سدرة المنتهى -شجرة نَبْق- وهي في السماء السابعة، ينتهي إليها ما يُعْرَج به من الأرض، وينتهي إليها ما يُهْبَط به من فوقها."));
        alnagmExes.add(new AlnagmEx("عِنْدَهَا جَنَّةُ الْمَأْوَى (15)"));
        alnagmExes.add(new AlnagmEx("عندها جنة المأوى التي وُعِد بها المتقون."));
        alnagmExes.add(new AlnagmEx("إِذْ يَغْشَى السِّدْرَةَ مَا يَغْشَى (16)"));
        alnagmExes.add(new AlnagmEx("إذ يغشى السدرة من أمر الله شيء عظيم، لا يعلم وصفه إلا الله عز وجل. وكان النبي صلى الله عليه وسلم على صفة عظيمة من الثبات والطاعة."));
        alnagmExes.add(new AlnagmEx("مَا زَاغَ الْبَصَرُ وَمَا طَغَى (17)"));
        alnagmExes.add(new AlnagmEx("فما مال بصره يمينًا ولا شمالا ولا جاوز ما أُمِر برؤيته."));
        alnagmExes.add(new AlnagmEx("لَقَدْ رَأَى مِنْ آيَاتِ رَبِّهِ الْكُبْرَى (18)"));
        alnagmExes.add(new AlnagmEx("لقد رأى محمد صلى الله عليه وسلم ليلة المعراج من آيات ربه الكبرى الدالة على قدرة الله وعظمته من الجنة والنار وغير ذلك."));
        alnagmExes.add(new AlnagmEx("أَفَرَأَيْتُمُ اللَّاتَ وَالْعُزَّى (19)"));
        alnagmExes.add(new AlnagmEx("أفرأيتم -أيها المشركون- هذه الآلهة التي تعبدونها: اللات والعزَّى."));
        alnagmExes.add(new AlnagmEx("وَمَنَاةَ الثَّالِثَةَ الْأُخْرَى (20)"));
        alnagmExes.add(new AlnagmEx("ومناة الثالثة الأخرى، هل نفعت أو ضرَّت حتى تكون شركاء لله؟"));
        alnagmExes.add(new AlnagmEx("أَلَكُمُ الذَّكَرُ وَلَهُ الْأُنْثَى (21)"));
        alnagmExes.add(new AlnagmEx("أتجعلون لكم الذَّكر الذي ترضونه، وتجعلون لله بزعمكم الأنثى التي لا ترضونها لأنفسكم؟"));
        alnagmExes.add(new AlnagmEx("تِلْكَ إِذًا قِسْمَةٌ ضِيزَى (22)"));
        alnagmExes.add(new AlnagmEx("تلك إذًا قسمة جائرة."));
        alnagmExes.add(new AlnagmEx("إِنْ هِيَ إِلَّا أَسْمَاءٌ سَمَّيْتُمُوهَا أَنْتُمْ وَآبَاؤُكُمْ مَا أَنْزَلَ اللَّهُ بِهَا مِنْ سُلْطَانٍ إِنْ يَتَّبِعُونَ إِلَّا الظَّنَّ وَمَا تَهْوَى الْأَنْفُسُ وَلَقَدْ جَاءَهُمْ مِنْ رَبِّهِمُ الْهُدَى (23)"));
        alnagmExes.add(new AlnagmEx("ما هذه الأوثان إلا أسماء ليس لها من أوصاف الكمال شيء، إنما هي أسماء سميتموها أنتم وآباؤكم بمقتضى أهوائكم الباطلة، ما أنزل الله بها مِن حجة تصدق دعواكم فيها. ما يتبع هؤلاء المشركون إلا الظن، وهوى أنفسهم المنحرفة عن الفطرة السليمة، ولقد جاءهم من ربهم على لسان النبي صلى الله عليه وسلم، ما فيه هدايتهم، فما انتفعوا به."));
        alnagmExes.add(new AlnagmEx("أَمْ لِلْإِنْسَانِ مَا تَمَنَّى (24)"));
        alnagmExes.add(new AlnagmEx("ليس للإنسان ما تمناه من شفاعة هذه المعبودات أو غيرها مما تهواه نفسه."));
        alnagmExes.add(new AlnagmEx("فَلِلَّهِ الْآخِرَةُ وَالْأُولَى (25)"));
        alnagmExes.add(new AlnagmEx("فلله أمر الدنيا والآخرة."));
        alnagmExes.add(new AlnagmEx("وَكَمْ مِنْ مَلَكٍ فِي السَّمَاوَاتِ لَا تُغْنِي شَفَاعَتُهُمْ شَيْئًا إِلَّا مِنْ بَعْدِ أَنْ يَأْذَنَ اللَّهُ لِمَنْ يَشَاءُ وَيَرْضَى (26)"));
        alnagmExes.add(new AlnagmEx("وكثير من الملائكة في السموات مع علوِّ منزلتهم، لا تنفع شفاعتهم شيئًا إلا من بعد أن يأذن الله لهم بالشفاعة، ويرضى عن المشفوع له."));
        alnagmExes.add(new AlnagmEx("إِنَّ الَّذِينَ لَا يُؤْمِنُونَ بِالْآخِرَةِ لَيُسَمُّونَ الْمَلَائِكَةَ تَسْمِيَةَ الْأُنْثَى (27)"));
        alnagmExes.add(new AlnagmEx("إن الذين لا يصدِّقون بالحياة الآخرة من كفار العرب ولا يعملون لها ليسمُّون الملائكة تسمية الإناث؛ لاعتقادهم جهلا أن الملائكة إناث، وأنهم بنات الله."));
        alnagmExes.add(new AlnagmEx("وَمَا لَهُمْ بِهِ مِنْ عِلْمٍ إِنْ يَتَّبِعُونَ إِلَّا الظَّنَّ وَإِنَّ الظَّنَّ لَا يُغْنِي مِنَ الْحَقِّ شَيْئًا (28)"));
        alnagmExes.add(new AlnagmEx("وما لهم بذلك من علم صحيح يصدِّق ما قالوه، ما يتبعون إلا الظن الذي لا يجدي شيئًا، ولا يقوم أبدًا مقام الحق."));
        alnagmExes.add(new AlnagmEx("فَأَعْرِضْ عَنْ مَنْ تَوَلَّى عَنْ ذِكْرِنَا وَلَمْ يُرِدْ إِلَّا الْحَيَاةَ الدُّنْيَا (29)"));
        alnagmExes.add(new AlnagmEx("فأعْرِضْ عمَّن تولى عن ذكرنا، وهو القرآن، ولم يُرِدْ إلا الحياة الدنيا."));
        alnagmExes.add(new AlnagmEx("ذَلِكَ مَبْلَغُهُمْ مِنَ الْعِلْمِ إِنَّ رَبَّكَ هُوَ أَعْلَمُ بِمَنْ ضَلَّ عَنْ سَبِيلِهِ وَهُوَ أَعْلَمُ بِمَنِ اهْتَدَى (30)"));
        alnagmExes.add(new AlnagmEx("ذلك الذي هم عليه هو منتهى علمهم وغايتهم. إن ربك هو أعلم بمن حادَ عن طريق الهدى، وهو أعلم بمن اهتدى وسلك طريق الإسلام.\n" +
                "وفي هذا إنذار شديد للعصاة المعرضين عن العمل بكتاب الله، وسنة رسوله صلى الله عليه وسلم، المؤثرين لهوى النفس وحظوظ الدنيا على الآخرة.\n"));
        alnagmExes.add(new AlnagmEx("وَلِلَّهِ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ لِيَجْزِيَ الَّذِينَ أَسَاءُوا بِمَا عَمِلُوا وَيَجْزِيَ الَّذِينَ أَحْسَنُوا بِالْحُسْنَى (31)"));
        alnagmExes.add(new AlnagmEx("ولله سبحانه وتعالى ملك ما في السموات وما في الأرض؛ ليجزي الذين أساءوا بعقابهم على ما عملوا من السوء، ويجزي الذي أحسنوا بالجنة."));
        alnagmExes.add(new AlnagmEx("الَّذِينَ يَجْتَنِبُونَ كَبَائِرَ الْإِثْمِ وَالْفَوَاحِشَ إِلَّا اللَّمَمَ إِنَّ رَبَّكَ وَاسِعُ الْمَغْفِرَةِ هُوَ أَعْلَمُ بِكُمْ إِذْ أَنْشَأَكُمْ مِنَ الْأَرْضِ وَإِذْ أَنْتُمْ أَجِنَّةٌ فِي بُطُونِ أُمَّهَاتِكُمْ فَلَا تُزَكُّوا أَنْفُسَكُمْ هُوَ أَعْلَمُ بِمَنِ اتَّقَى (32)"));
        alnagmExes.add(new AlnagmEx("وهم الذين يبتعدون عن كبائر الذنوب والفواحش إلا اللمم، وهي الذنوب الصغار التي لا يُصِرُّ صاحبها عليها، أو يلمُّ بها العبد على وجه الندرة، فإن هذه مع الإتيان بالواجبات وترك المحرمات، يغفرها الله لهم ويسترها عليهم، إن ربك واسع المغفرة، هو أعلم بأحوالكم حين خلق أباكم آدم من تراب، وحين أنتم أجنَّة في بطون أمهاتكم، فلا تزكُّوا أنفسكم فتمدحوها وتَصِفُوها بالتقوى، هو أعلم بمن اتقى عقابه فاجتنب معاصيه من عباده."));
        alnagmExes.add(new AlnagmEx("أَفَرَأَيْتَ الَّذِي تَوَلَّى (33)"));
        alnagmExes.add(new AlnagmEx("أفرأيت -أيها الرسول- الذي أعرض عن طاعة الله."));
        alnagmExes.add(new AlnagmEx("وَأَعْطَى قَلِيلًا وَأَكْدَى (34)"));
        alnagmExes.add(new AlnagmEx("وأعطى قليلا مِن ماله، ثم توقف عن العطاء وقطع معروفه؟"));
        alnagmExes.add(new AlnagmEx("أَعِنْدَهُ عِلْمُ الْغَيْبِ فَهُوَ يَرَى (35)"));
        alnagmExes.add(new AlnagmEx("أعند هذا الذي قطع عطاءه علم الغيب أنه سينفَد ما في يده حتى أمسك معروفه، فهو يرى ذلك عِيانًا؟ ليس الأمر كذلك، وإنما أمسك عن الصدقة والمعروف والبر والصلة; بخلا وشُحًّا."));
        alnagmExes.add(new AlnagmEx("أَمْ لَمْ يُنَبَّأْ بِمَا فِي صُحُفِ مُوسَى (36)"));
        alnagmExes.add(new AlnagmEx("أم لم يُخَبَّر بما جاء في أسفار التوراة."));
        alnagmExes.add(new AlnagmEx("وَإِبْرَاهِيمَ الَّذِي وَفَّى (37)"));
        alnagmExes.add(new AlnagmEx("وصحف إبراهيم الذي وفَّى ما أُمر به وبلَّغه؟"));
        alnagmExes.add(new AlnagmEx("أَلَّا تَزِرُ وَازِرَةٌ وِزْرَ أُخْرَى (38)"));
        alnagmExes.add(new AlnagmEx("أنه لا تؤخذ نفس بمأثم غيرها، ووزرها لا يحمله عنها أحد."));
        alnagmExes.add(new AlnagmEx("وَأَنْ لَيْسَ لِلْإِنْسَانِ إِلَّا مَا سَعَى (39)"));
        alnagmExes.add(new AlnagmEx("وأنه لا يحصل للإنسان من الأجر إلا ما كسب هو لنفسه بسعيه."));
        alnagmExes.add(new AlnagmEx("وَأَنَّ سَعْيَهُ سَوْفَ يُرَى (40)"));
        alnagmExes.add(new AlnagmEx("وأن سعيه سوف يُرى في الآخرة، فيميَّز حَسَنه من سيئه؛ تشريفًا للمحسن وتوبيخًا للمسيء."));
        alnagmExes.add(new AlnagmEx("ثُمَّ يُجْزَاهُ الْجَزَاءَ الْأَوْفَى (41)"));
        alnagmExes.add(new AlnagmEx("ثم يُجزى الإنسان على سعيه الجزاء المستكمل لجميع عمله."));
        alnagmExes.add(new AlnagmEx("وَأَنَّ إِلَى رَبِّكَ الْمُنْتَهَى (42)"));
        alnagmExes.add(new AlnagmEx("وأنَّ إلى ربك -أيها الرسول- انتهاء جميع خلقه يوم القيامة."));
        alnagmExes.add(new AlnagmEx("وَأَنَّهُ هُوَ أَضْحَكَ وَأَبْكَى (43)"));
        alnagmExes.add(new AlnagmEx("وأنه سبحانه وتعالى أضحك مَن شاء في الدنيا بأن سرَّه، وأبكى من شاء بأن غَمَّه."));
        alnagmExes.add(new AlnagmEx("وَأَنَّهُ هُوَ أَمَاتَ وَأَحْيَا (44)"));
        alnagmExes.add(new AlnagmEx("وأنه سبحانه أمات مَن أراد موته مِن خلقه، وأحيا مَن أراد حياته منهم، فهو المتفرِّد سبحانه بالإحياء والإماتة."));
        alnagmExes.add(new AlnagmEx("وَأَنَّهُ خَلَقَ الزَّوْجَيْنِ الذَّكَرَ وَالْأُنْثَى (45)"));
        alnagmExes.add(new AlnagmEx("وأنه خلق الزوجين: الذكر والأنثى من الإنسان والحيوان."));
        alnagmExes.add(new AlnagmEx("مِنْ نُطْفَةٍ إِذَا تُمْنَى (46)"));
        alnagmExes.add(new AlnagmEx("من نطفة تُصَبُّ في الرحم."));
        alnagmExes.add(new AlnagmEx("وَأَنَّ عَلَيْهِ النَّشْأَةَ الْأُخْرَى (47)"));
        alnagmExes.add(new AlnagmEx("وأن على ربك -أيها الرسول- إعادة خلقهم بعد مماتهم، وهي النشأة الأخرى يوم القيامة."));
        alnagmExes.add(new AlnagmEx("وَأَنَّهُ هُوَ أَغْنَى وَأَقْنَى (48)"));
        alnagmExes.add(new AlnagmEx("وأنه هو أغنى مَن شاء مِن خلقه بالمال، وملَّكه لهم وأرضاهم به."));
        alnagmExes.add(new AlnagmEx("وَأَنَّهُ هُوَ رَبُّ الشِّعْرَى (49)"));
        alnagmExes.add(new AlnagmEx("وأنه سبحانه وتعالى هو رب الشِّعْرى، وهو نجم مضيء، كان بعض أهل الجاهلية يعبدونه من دون الله."));
        alnagmExes.add(new AlnagmEx("وَأَنَّهُ أَهْلَكَ عَادًا الْأُولَى (50)"));
        alnagmExes.add(new AlnagmEx("وأنه سبحانه وتعالى أهلك عادًا الأولى."));
        alnagmExes.add(new AlnagmEx("وَثَمُودَ فَمَا أَبْقَى (51)"));
        alnagmExes.add(new AlnagmEx("وأهلك ثمود، وهم قوم صالح، فلم يُبْقِ منهم أحدًا."));
        alnagmExes.add(new AlnagmEx("وَقَوْمَ نُوحٍ مِنْ قَبْلُ إِنَّهُمْ كَانُوا هُمْ أَظْلَمَ وَأَطْغَى (52)"));
        alnagmExes.add(new AlnagmEx("وأهلك قوم نوح قبلُ. هؤلاء كانوا أشد تمردًا وأعظم كفرًا من الذين جاؤوا من بعدهم."));
        alnagmExes.add(new AlnagmEx("وَالْمُؤْتَفِكَةَ أَهْوَى (53)"));
        alnagmExes.add(new AlnagmEx("ومدائن قوم لوط قلبها الله عليهم، وجعل عاليها سافلها."));
        alnagmExes.add(new AlnagmEx("فَغَشَّاهَا مَا غَشَّى (54)"));
        alnagmExes.add(new AlnagmEx("فألبسها ما ألبسها من الحجارة المتتابعة النازلة عليهم من السماء كالمطر."));
        alnagmExes.add(new AlnagmEx("فَبِأَيِّ آلَاءِ رَبِّكَ تَتَمَارَى (55)"));
        alnagmExes.add(new AlnagmEx("فبأيِّ نعم ربك عليك -أيها الإنسان المكذب- تَشُك؟"));
        alnagmExes.add(new AlnagmEx("هَذَا نَذِيرٌ مِنَ النُّذُرِ الْأُولَى (56)"));
        alnagmExes.add(new AlnagmEx("هذا محمد صلى الله عليه وسلم، نذير بالحق الذي أنذر به الأنبياء قبله، فليس ببدع من الرسل."));
        alnagmExes.add(new AlnagmEx("أَزِفَتِ الْآزِفَةُ (57)"));
        alnagmExes.add(new AlnagmEx("قربت القيامة ودنا وقتها."));
        alnagmExes.add(new AlnagmEx("لَيْسَ لَهَا مِنْ دُونِ اللَّهِ كَاشِفَةٌ (58)"));
        alnagmExes.add(new AlnagmEx("لا يدفعها إذًا من دون الله أحد، ولا يَطَّلِع على وقت وقوعها إلا الله."));
        alnagmExes.add(new AlnagmEx("أَفَمِنْ هَذَا الْحَدِيثِ تَعْجَبُونَ (59)"));
        alnagmExes.add(new AlnagmEx("أفمِن هذا القرآن تعجبون -أيها المشركون- من أن يكون صحيحًا."));
        alnagmExes.add(new AlnagmEx("وَتَضْحَكُونَ وَلَا تَبْكُونَ (60)"));
        alnagmExes.add(new AlnagmEx("وتضحكون منه سخرية واستهزاءً، ولا تبكون خوفًا من وعيده"));
        alnagmExes.add(new AlnagmEx("وَأَنْتُمْ سَامِدُونَ (61)"));
        alnagmExes.add(new AlnagmEx("وأنتم لاهون معرضون عنه؟"));
        alnagmExes.add(new AlnagmEx("فَاسْجُدُوا لِلَّهِ وَاعْبُدُوا (62)"));
        alnagmExes.add(new AlnagmEx("فاسجدوا لله وأخلصوا العبادة له وحده، وسلِّموا له أموركم."));

        quran_explanation_53_adapter = new quran_explanation_53_adapter(alnagmExes ,QuranExplanation_53Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_53);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_53Activity.this));
        recyclerView.setAdapter(quran_explanation_53_adapter);


    }

}