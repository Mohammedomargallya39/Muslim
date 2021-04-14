package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_55Activity extends AppCompatActivity {

    ArrayList<AlrahmanEx> alrahmanExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_55_adapter quran_explanation_55_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_55);

        alrahmanExes.add(new AlrahmanEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alrahmanExes.add(new AlrahmanEx("الرَّحْمَنُ (1)"));
        alrahmanExes.add(new AlrahmanEx("الرحمن."));
        alrahmanExes.add(new AlrahmanEx("عَلَّمَ الْقُرْآنَ (2)"));
        alrahmanExes.add(new AlrahmanEx("علَّم الإنسان القرآن؛ بتيسير تلاوته وحفظه وفهم معانيه."));
        alrahmanExes.add(new AlrahmanEx("خَلَقَ الْإِنْسَانَ (3)"));
        alrahmanExes.add(new AlrahmanEx("خلق الإنسان."));
        alrahmanExes.add(new AlrahmanEx("عَلَّمَهُ الْبَيَانَ (4)"));
        alrahmanExes.add(new AlrahmanEx("علَّمه البيان عمَّا في نفسه تمييزًا له عن غيره."));
        alrahmanExes.add(new AlrahmanEx("الشَّمْسُ وَالْقَمَرُ بِحُسْبَانٍ (5)"));
        alrahmanExes.add(new AlrahmanEx("الشمس والقمر يجريان متعاقبَين بحساب متقن، لا يختلف ولا يضطرب."));
        alrahmanExes.add(new AlrahmanEx("وَالنَّجْمُ وَالشَّجَرُ يَسْجُدَانِ (6)"));
        alrahmanExes.add(new AlrahmanEx("والنجوم التي في السماء أو النبات الذي ينجم ويطلع من الأرض ولا ساق له، وأشجار الأرض التي لها ساق، تعرف ربها وتسجد له، وتنقاد لما سخرَّها له مِن مصالح عباده ومنافعهم."));
        alrahmanExes.add(new AlrahmanEx("وَالسَّمَاءَ رَفَعَهَا وَوَضَعَ الْمِيزَانَ (7)"));
        alrahmanExes.add(new AlrahmanEx("والسماء رفعها فوق الأرض، ووضع في الأرض العدل الذي أمر به وشرعه لعباده."));
        alrahmanExes.add(new AlrahmanEx("أَلَّا تَطْغَوْا فِي الْمِيزَانِ (8)"));
        alrahmanExes.add(new AlrahmanEx("لئلا تعتدوا وتخونوا مَن وَزَنتم له."));
        alrahmanExes.add(new AlrahmanEx("وَأَقِيمُوا الْوَزْنَ بِالْقِسْطِ وَلَا تُخْسِرُوا الْمِيزَانَ (9)"));
        alrahmanExes.add(new AlrahmanEx("وأقيموا الوزن بالعدل، ولا تُنْقِصوا الميزان إذا وَزَنتم للناس."));
        alrahmanExes.add(new AlrahmanEx("وَالْأَرْضَ وَضَعَهَا لِلْأَنَامِ (10)"));
        alrahmanExes.add(new AlrahmanEx("والأرض وضعها ومهَّدها؛ ليستقر عليها الخلق."));
        alrahmanExes.add(new AlrahmanEx("فِيهَا فَاكِهَةٌ وَالنَّخْلُ ذَاتُ الْأَكْمَامِ (11)"));
        alrahmanExes.add(new AlrahmanEx("فيها فاكهة النخل ذات الأوعية التي يكون منها الثمر."));
        alrahmanExes.add(new AlrahmanEx("وَالْحَبُّ ذُو الْعَصْفِ وَالرَّيْحَانُ (12)"));
        alrahmanExes.add(new AlrahmanEx("وفيها الحب ذو القشر؛ رزقًا لكم ولأنعامكم، وفيها كل نبت طيب الرائحة."));
        alrahmanExes.add(new AlrahmanEx("فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ (13)"));
        alrahmanExes.add(new AlrahmanEx("فبأي نِعَم ربكما الدينية والدنيوية -يا معشر الجن والإنس- تكذِّبان؟ وما أحسن جواب الجن حين تلا عليهم النبي صلى الله عليه وسلم هذه السورة، فكلما مر بهذه الآية، قالوا: «ولا بشيء من آلائك ربَّنا نكذب، فلك الحمد» ، وهكذا ينبغي للعبد إذا تليت عليه نعم الله وآلاؤه، أن يُقرَّ بها، ويشكر الله ويحمده عليها."));
        alrahmanExes.add(new AlrahmanEx("خَلَقَ الْإِنْسَانَ مِنْ صَلْصَالٍ كَالْفَخَّارِ (14)"));
        alrahmanExes.add(new AlrahmanEx("خلق أبا الإنسان، وهو آدم من طين يابس كالفَخَّار."));
        alrahmanExes.add(new AlrahmanEx("وَخَلَقَ الْجَانَّ مِنْ مَارِجٍ مِنْ نَارٍ (15)"));
        alrahmanExes.add(new AlrahmanEx("وخلق إبليس، وهو من الجن من لهب النار المختلط بعضه ببعض."));
        alrahmanExes.add(new AlrahmanEx("فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ (16)"));
        alrahmanExes.add(new AlrahmanEx("فبأي نِعَم ربكما -يا معشر الإنس والجن- تكذِّبان؟"));
        alrahmanExes.add(new AlrahmanEx("رَبُّ الْمَشْرِقَيْنِ وَرَبُّ الْمَغْرِبَيْنِ (17)"));
        alrahmanExes.add(new AlrahmanEx("هو سبحانه وتعالى ربُّ مشرقَي الشمس في الشتاء والصيف، ورب مغربَيها فيهما، فالجميع تحت تدبيره وربوبيته."));
        alrahmanExes.add(new AlrahmanEx("فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ (18)"));
        alrahmanExes.add(new AlrahmanEx("فبأي نِعَم ربكما -أيها الثقلان- تكذِّبان؟"));
        alrahmanExes.add(new AlrahmanEx("مَرَجَ الْبَحْرَيْنِ يَلْتَقِيَانِ (19)"));
        alrahmanExes.add(new AlrahmanEx("خلط الله ماء البحرين -العذب والملح- متلاقيين."));
        alrahmanExes.add(new AlrahmanEx("بَيْنَهُمَا بَرْزَخٌ لَا يَبْغِيَانِ (20)"));
        alrahmanExes.add(new AlrahmanEx("لا فاصل بينهما في مرأى العين، ومع ذلك بينهما حاجز، فلا يطغى أحدهما على الآخر، ويذهب بخصائصه، بل يبقى العذب عذبًا، والملح ملحًا مع تلاقيهما."));
        alrahmanExes.add(new AlrahmanEx("فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ (21)"));
        alrahmanExes.add(new AlrahmanEx("فبأي نِعَم ربكما -أيها الثقلان- تكذِّبان؟"));
        alrahmanExes.add(new AlrahmanEx("يَخْرُجُ مِنْهُمَا اللُّؤْلُؤُ وَالْمَرْجَانُ (22)"));
        alrahmanExes.add(new AlrahmanEx("يخرج من البحرين بقدرة الله اللؤلؤ والمَرْجان."));
        alrahmanExes.add(new AlrahmanEx("فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ (23)"));
        alrahmanExes.add(new AlrahmanEx("فبأي نِعَم ربكما -أيها الثقلان- تكذِّبان؟"));
        alrahmanExes.add(new AlrahmanEx("وَلَهُ الْجَوَارِ الْمُنْشَآتُ فِي الْبَحْرِ كَالْأَعْلَامِ (24)"));
        alrahmanExes.add(new AlrahmanEx("وله تعالى ملك تسخير السفن الضخمة التي تجري في البحر بمنافع الناس، رافعة سواريها وأشرعتها كالجبال."));
        alrahmanExes.add(new AlrahmanEx("فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ (25)"));
        alrahmanExes.add(new AlrahmanEx("فبأي نِعَم ربكما -أيها الثقلان- تكذِّبان؟"));
        alrahmanExes.add(new AlrahmanEx("كُلُّ مَنْ عَلَيْهَا فَانٍ (26)"));
        alrahmanExes.add(new AlrahmanEx("كل مَن على وجه الأرض مِن الخلق هالك."));
        alrahmanExes.add(new AlrahmanEx("وَيَبْقَى وَجْهُ رَبِّكَ ذُو الْجَلَالِ وَالْإِكْرَامِ (27)"));
        alrahmanExes.add(new AlrahmanEx("ويبقى وجه ربك ذو العظمة والكبرياء والفضل والجود. وفي الآية إثبات صفة الوجه لله تعالى بما يليق به سبحانه، دون تشبيه ولا تكييف."));
        alrahmanExes.add(new AlrahmanEx("فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ (28)"));
        alrahmanExes.add(new AlrahmanEx("فبأي نِعَم ربكما -أيها الثقلان- تكذِّبان؟"));
        alrahmanExes.add(new AlrahmanEx("يَسْأَلُهُ مَنْ فِي السَّمَاوَاتِ وَالْأَرْضِ كُلَّ يَوْمٍ هُوَ فِي شَأْنٍ (29)"));
        alrahmanExes.add(new AlrahmanEx("يسأله مَن في السموات والأرض حاجاتهم، فلا غنى لأحد منهم عنه سبحانه. كل يوم هو في شأن: يُعِزُّ ويُذِلُّ، ويعطي ويَمْنع."));
        alrahmanExes.add(new AlrahmanEx("فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ (30)"));
        alrahmanExes.add(new AlrahmanEx("فبأي نِعَم ربكما -أيها الثقلان- تكذِّبان؟"));
        alrahmanExes.add(new AlrahmanEx("سَنَفْرُغُ لَكُمْ أَيُّهَ الثَّقَلَانِ (31)"));
        alrahmanExes.add(new AlrahmanEx("سنفرُغ لحسابكم ومجازاتكم بأعمالكما التي عملتموهما في الدنيا، أيها الثقلان -الإنس والجن-، فنعاقب أهل المعاصي، ونُثيب أهل الطاعة."));
        alrahmanExes.add(new AlrahmanEx("فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ (32)"));
        alrahmanExes.add(new AlrahmanEx("فبأيِّ نِعَم ربكما -أيها الثقلان- تكذِّبان؟"));
        alrahmanExes.add(new AlrahmanEx("يَامَعْشَرَ الْجِنِّ وَالْإِنْسِ إِنِ اسْتَطَعْتُمْ أَنْ تَنْفُذُوا مِنْ أَقْطَارِ السَّمَاوَاتِ وَالْأَرْضِ فَانْفُذُوا لَا تَنْفُذُونَ إِلَّا بِسُلْطَانٍ (33)"));
        alrahmanExes.add(new AlrahmanEx("يا معشر الجن والإنس، إن قَدَرْتم على النفاذ من أمر الله وحكمه هاربين من أطراف السموات والأرض فافعلوا، ولستم قادرين على ذلك إلا بقوة وحجة، وأمر من الله تعالى، وأنَّى لكم ذلك، وأنتم لا تملكون لأنفسكم نفعًا ولا ضرًا؟ ."));
        alrahmanExes.add(new AlrahmanEx("فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ (34)"));
        alrahmanExes.add(new AlrahmanEx("فبأي نِعَم ربكما -أيها الثقلان- تكذِّبان؟"));
        alrahmanExes.add(new AlrahmanEx("يُرْسَلُ عَلَيْكُمَا شُوَاظٌ مِنْ نَارٍ وَنُحَاسٌ فَلَا تَنْتَصِرَانِ (35)"));
        alrahmanExes.add(new AlrahmanEx("يُرْسَل عليكم لهب من نار، ونحاس مذاب يُصَبُّ على رؤوسكم، فلا ينصر بعضكم بعضًا يا معشر الجن والإنس."));
        alrahmanExes.add(new AlrahmanEx("فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ (36)"));
        alrahmanExes.add(new AlrahmanEx("فبأي نِعَم ربكما -أيها الثقلان- تكذِّبان؟"));
        alrahmanExes.add(new AlrahmanEx("فَإِذَا انْشَقَّتِ السَّمَاءُ فَكَانَتْ وَرْدَةً كَالدِّهَانِ (37)"));
        alrahmanExes.add(new AlrahmanEx("فإذا انشقت السماء وتفطرت يوم القيامة، فكانت حمراء كلون الورد، وكالزيت المغلي والرصاص المذاب؛ من شدة الأمر وهول يوم القيامة."));
        alrahmanExes.add(new AlrahmanEx("فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ (38)"));
        alrahmanExes.add(new AlrahmanEx("فبأي نِعَم ربكما -أيها الثقلان- تكذِّبان؟"));
        alrahmanExes.add(new AlrahmanEx("فَيَوْمَئِذٍ لَا يُسْأَلُ عَنْ ذَنْبِهِ إِنْسٌ وَلَا جَانٌّ (39)"));
        alrahmanExes.add(new AlrahmanEx("ففي ذلك اليوم لا تسأل الملائكة المجرمين من الإنس والجن عن ذنوبهم."));
        alrahmanExes.add(new AlrahmanEx("فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ (40)"));
        alrahmanExes.add(new AlrahmanEx("فبأي نِعَم ربكما -أيها الثقلان- تكذِّبان؟"));
        alrahmanExes.add(new AlrahmanEx("يُعْرَفُ الْمُجْرِمُونَ بِسِيمَاهُمْ فَيُؤْخَذُ بِالنَّوَاصِي وَالْأَقْدَامِ (41)"));
        alrahmanExes.add(new AlrahmanEx("تَعرِف الملائكة المجرمين بعلاماتهم، فتأخذهم بمقدمة رؤوسهم وبأقدامهم، فترميهم في النار."));
        alrahmanExes.add(new AlrahmanEx("فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ (42)"));
        alrahmanExes.add(new AlrahmanEx("فبأي نِعَم ربكما -أيها الثقلان- تكذِّبان؟"));
        alrahmanExes.add(new AlrahmanEx("هَذِهِ جَهَنَّمُ الَّتِي يُكَذِّبُ بِهَا الْمُجْرِمُونَ (43)"));
        alrahmanExes.add(new AlrahmanEx("يقال لهؤلاء المجرمين -توبيخًا وتحقيرًا لهم-: هذه جهنم التي يكذِّب بها المجرمون في الدنيا."));
        alrahmanExes.add(new AlrahmanEx("يَطُوفُونَ بَيْنَهَا وَبَيْنَ حَمِيمٍ آنٍ (44)"));
        alrahmanExes.add(new AlrahmanEx("تارة يُعذَّبون في الجحيم، وتارة يُسقون من الحميم، وهو شراب بلغ منتهى الحرارة، يقطِّع الأمعاء والأحشاء."));
        alrahmanExes.add(new AlrahmanEx("فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ (45)"));
        alrahmanExes.add(new AlrahmanEx("فبأي نِعَم ربكما -أيها الثقلان- تكذِّبان؟"));
        alrahmanExes.add(new AlrahmanEx("وَلِمَنْ خَافَ مَقَامَ رَبِّهِ جَنَّتَانِ (46)"));
        alrahmanExes.add(new AlrahmanEx("ولمن اتقى الله من عباده من الإنس والجن، فخاف مقامه بين يديه، فأطاعه، وترك معاصيه، جنتان."));
        alrahmanExes.add(new AlrahmanEx("فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ (47)"));
        alrahmanExes.add(new AlrahmanEx("فبأي نِعَم ربكما -أيها الثقلان- تكذِّبان؟"));
        alrahmanExes.add(new AlrahmanEx("ذَوَاتَا أَفْنَانٍ (48)"));
        alrahmanExes.add(new AlrahmanEx("الجنتان ذواتا أغصان نضرة من الفواكه والثمار."));
        alrahmanExes.add(new AlrahmanEx("فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ (49)"));
        alrahmanExes.add(new AlrahmanEx("فبأي نِعَم ربكما -أيها الثقلان- تكذِّبان؟"));
        alrahmanExes.add(new AlrahmanEx("فِيهِمَا عَيْنَانِ تَجْرِيَانِ (50)"));
        alrahmanExes.add(new AlrahmanEx("في هاتين الجنتين عينان من الماء تجريان خلالهما."));
        alrahmanExes.add(new AlrahmanEx("فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ (51)"));
        alrahmanExes.add(new AlrahmanEx("فبأي نِعَم ربكما -أيها الثقلان- تكذِّبان؟"));
        alrahmanExes.add(new AlrahmanEx("فِيهِمَا مِنْ كُلِّ فَاكِهَةٍ زَوْجَانِ (52)"));
        alrahmanExes.add(new AlrahmanEx("في هاتين الجنتين من كل نوع من الفواكه صنفان."));
        alrahmanExes.add(new AlrahmanEx("فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ (53)"));
        alrahmanExes.add(new AlrahmanEx("فبأي نِعَم ربكما -أيها الثقلان- تكذِّبان؟"));
        alrahmanExes.add(new AlrahmanEx("مُتَّكِئِينَ عَلَى فُرُشٍ بَطَائِنُهَا مِنْ إِسْتَبْرَقٍ وَجَنَى الْجَنَّتَيْنِ دَانٍ (54)"));
        alrahmanExes.add(new AlrahmanEx("وللذين خافوا مقام ربهم جنتان يتنعمون فيهما، متكئين على فرش مبطَّنة من غليظ الديباج، وثمر الجنتين قريب إليهم."));
        alrahmanExes.add(new AlrahmanEx("فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ (55)"));
        alrahmanExes.add(new AlrahmanEx("فبأي نِعَم ربكما -أيها الثقلان- تكذِّبان؟"));
        alrahmanExes.add(new AlrahmanEx("فِيهِنَّ قَاصِرَاتُ الطَّرْفِ لَمْ يَطْمِثْهُنَّ إِنْسٌ قَبْلَهُمْ وَلَا جَانٌّ (56)"));
        alrahmanExes.add(new AlrahmanEx("في هذه الفرش زوجات قاصرات أبصارهن على أزواجهن، لا ينظرن إلى غيرهم متعلقات بهم، لم يطأهن إنس قبلهم ولا جان."));
        alrahmanExes.add(new AlrahmanEx("فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ (57)"));
        alrahmanExes.add(new AlrahmanEx("فبأي نِعَم ربكما -أيها الثقلان- تكذِّبان؟"));
        alrahmanExes.add(new AlrahmanEx("كَأَنَّهُنَّ الْيَاقُوتُ وَالْمَرْجَانُ (58)"));
        alrahmanExes.add(new AlrahmanEx("كأن هؤلاء الزوجاتِ من الحور الياقوتُ والمَرْجانُ في صفائهن وجمالهن."));
        alrahmanExes.add(new AlrahmanEx("فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ (59)"));
        alrahmanExes.add(new AlrahmanEx("فبأي نِعَم ربكما -أيها الثقلان- تكذِّبان؟"));
        alrahmanExes.add(new AlrahmanEx("هَلْ جَزَاءُ الْإِحْسَانِ إِلَّا الْإِحْسَانُ (60)"));
        alrahmanExes.add(new AlrahmanEx("هل جزاء مَن أحسن بعمله في الدنيا إلا الإحسان إليه بالجنة في الآخرة؟"));
        alrahmanExes.add(new AlrahmanEx("فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ (61)"));
        alrahmanExes.add(new AlrahmanEx("فبأي نِعَم ربكما -أيها الثقلان- تكذِّبان؟"));
        alrahmanExes.add(new AlrahmanEx("وَمِنْ دُونِهِمَا جَنَّتَانِ (62)"));
        alrahmanExes.add(new AlrahmanEx("ومن دون الجنتين السابقتين جنتان أخريان."));
        alrahmanExes.add(new AlrahmanEx("فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ (63)"));
        alrahmanExes.add(new AlrahmanEx("فبأي نِعَم ربكما -أيها الثقلان- تكذِّبان؟"));
        alrahmanExes.add(new AlrahmanEx("مُدْهَامَّتَانِ (64)"));
        alrahmanExes.add(new AlrahmanEx("هاتان الجنتان خضراوان، قد اشتدَّت خضرتهما حتى مالت إلى السواد."));
        alrahmanExes.add(new AlrahmanEx("فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ (65)"));
        alrahmanExes.add(new AlrahmanEx("فبأي نِعَم ربكما -أيها الثقلان- تكذِّبان؟"));
        alrahmanExes.add(new AlrahmanEx("فِيهِمَا عَيْنَانِ نَضَّاخَتَانِ (66)"));
        alrahmanExes.add(new AlrahmanEx("فيهما عينان فوَّارتان بالماء لا تنقطعان."));
        alrahmanExes.add(new AlrahmanEx("فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ (67)"));
        alrahmanExes.add(new AlrahmanEx("فبأي نِعَم ربكما -أيها الثقلان- تكذِّبان؟"));
        alrahmanExes.add(new AlrahmanEx("فِيهِمَا فَاكِهَةٌ وَنَخْلٌ وَرُمَّانٌ (68)"));
        alrahmanExes.add(new AlrahmanEx("في هاتين الجنتين أنواع الفواكه ونخل ورمان."));
        alrahmanExes.add(new AlrahmanEx("فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ (69)"));
        alrahmanExes.add(new AlrahmanEx("فبأي نِعَم ربكما -أيها الثقلان- تكذِّبان؟"));
        alrahmanExes.add(new AlrahmanEx("فِيهِنَّ خَيْرَاتٌ حِسَانٌ (70)"));
        alrahmanExes.add(new AlrahmanEx("في هذه الجنان الأربع زوجات طيبات الأخلاق حسان الوجوه."));
        alrahmanExes.add(new AlrahmanEx("فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ (71)"));
        alrahmanExes.add(new AlrahmanEx("فبأي نِعَم ربكما -أيها الثقلان- تكذِّبان؟"));
        alrahmanExes.add(new AlrahmanEx("حُورٌ مَقْصُورَاتٌ فِي الْخِيَامِ (72)"));
        alrahmanExes.add(new AlrahmanEx("حور مستورات مصونات في الخيام."));
        alrahmanExes.add(new AlrahmanEx("فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ (73)"));
        alrahmanExes.add(new AlrahmanEx("فبأي نِعَم ربكما -أيها الثقلان- تكذِّبان؟"));
        alrahmanExes.add(new AlrahmanEx("لَمْ يَطْمِثْهُنَّ إِنْسٌ قَبْلَهُمْ وَلَا جَانٌّ (74)"));
        alrahmanExes.add(new AlrahmanEx("لم يطأ هؤلاء الحور إنس قبل أزواجهن ولا جان."));
        alrahmanExes.add(new AlrahmanEx("فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ (75)"));
        alrahmanExes.add(new AlrahmanEx("فبأي نِعَم ربكما -أيها الثقلان- تكذِّبان؟"));
        alrahmanExes.add(new AlrahmanEx("مُتَّكِئِينَ عَلَى رَفْرَفٍ خُضْرٍ وَعَبْقَرِيٍّ حِسَانٍ (76)"));
        alrahmanExes.add(new AlrahmanEx("متكئين على وسائد ذوات أغطية خضر وفرش بديعة فائقة الصنع في غاية الحسن."));
        alrahmanExes.add(new AlrahmanEx("فَبِأَيِّ آلَاءِ رَبِّكُمَا تُكَذِّبَانِ (77)"));
        alrahmanExes.add(new AlrahmanEx("فبأي نِعَم ربكما -أيها الثقلان- تكذِّبان؟"));
        alrahmanExes.add(new AlrahmanEx("تَبَارَكَ اسْمُ رَبِّكَ ذِي الْجَلَالِ وَالْإِكْرَامِ (78)"));
        alrahmanExes.add(new AlrahmanEx("تكاثرت بركة اسم ربك وكثر خيره، ذي الجلال الباهر، والمجد الكامل، والإكرام لأوليائه."));


        quran_explanation_55_adapter = new quran_explanation_55_adapter(alrahmanExes ,QuranExplanation_55Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_55);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_55Activity.this));
        recyclerView.setAdapter(quran_explanation_55_adapter);


    }

}