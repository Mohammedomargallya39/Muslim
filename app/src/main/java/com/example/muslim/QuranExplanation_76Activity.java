package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_76Activity extends AppCompatActivity {

    ArrayList<AlensanEx> alensanExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_76_adapter quran_explanation_76_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_76);

        alensanExes.add(new AlensanEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alensanExes.add(new AlensanEx("هَلْ أَتَى عَلَى الْإِنْسَانِ حِينٌ مِنَ الدَّهْرِ لَمْ يَكُنْ شَيْئًا مَذْكُورًا (1)"));
        alensanExes.add(new AlensanEx("قد مضى على الإنسان وقت طويل من الزمان قبل أن تُنفَخ فيه الروح، لم يكن شيئا يُذكر، ولا يُعرف له أثر."));
        alensanExes.add(new AlensanEx("إِنَّا خَلَقْنَا الْإِنْسَانَ مِنْ نُطْفَةٍ أَمْشَاجٍ نَبْتَلِيهِ فَجَعَلْنَاهُ سَمِيعًا بَصِيرًا (2)"));
        alensanExes.add(new AlensanEx("إنا خلقنا الإنسان من نطفة مختلطة من ماء الرجل وماء المرأة، نختبره بالتكاليف الشرعية فيما بعد، فجعلناه من أجل ذلك ذا سمع وذا بصر؛ ليسمع الآيات، ويرى الدلائل."));
        alensanExes.add(new AlensanEx("إِنَّا هَدَيْنَاهُ السَّبِيلَ إِمَّا شَاكِرًا وَإِمَّا كَفُورًا (3)"));
        alensanExes.add(new AlensanEx("إنا بينَّا له وعرَّفناه طريق الهدى والضلال والخير والشر; ليكون إما مؤمنًا شاكرًا، وإما كفورًا جاحدًا."));
        alensanExes.add(new AlensanEx("إِنَّا أَعْتَدْنَا لِلْكَافِرِينَ سَلَاسِلَ وَأَغْلَالًا وَسَعِيرًا (4)"));
        alensanExes.add(new AlensanEx("إنا أعتدنا للكافرين قيودًا من حديد تُشَدُّ بها أرجلهم، وأغلالا تُغلُّ بها أيديهم إلى أعناقهم، ونارًا يُحرقون بها."));
        alensanExes.add(new AlensanEx("إِنَّ الْأَبْرَارَ يَشْرَبُونَ مِنْ كَأْسٍ كَانَ مِزَاجُهَا كَافُورًا (5)"));
        alensanExes.add(new AlensanEx("إن أهل الطاعة والإخلاص الذين يؤدون حق الله، يشربون يوم القيامة مِن كأس فيها خمر ممزوجة بأحسن أنواع الطيب، وهو ماء الكافور."));
        alensanExes.add(new AlensanEx("عَيْنًا يَشْرَبُ بِهَا عِبَادُ اللَّهِ يُفَجِّرُونَهَا تَفْجِيرًا (6)"));
        alensanExes.add(new AlensanEx("هذا الشراب الذي مزج من الكافور هو عين يشرب منها عباد الله، يتصرفون فيها، ويُجْرونها حيث شاؤوا إجراءً سهلا."));
        alensanExes.add(new AlensanEx("يُوفُونَ بِالنَّذْرِ وَيَخَافُونَ يَوْمًا كَانَ شَرُّهُ مُسْتَطِيرًا (7)"));
        alensanExes.add(new AlensanEx("هؤلاء كانوا في الدنيا يوفون بما أوجبوا على أنفسهم من طاعة الله، ويخافون عقاب الله في يوم القيامة الذي يكون ضرره خطيرًا، وشره فاشيًا منتشرًا على الناس، إلا مَن رحم الله."));
        alensanExes.add(new AlensanEx("وَيُطْعِمُونَ الطَّعَامَ عَلَى حُبِّهِ مِسْكِينًا وَيَتِيمًا وَأَسِيرًا (8)"));
        alensanExes.add(new AlensanEx("ويُطْعِمون الطعام مع حبهم له وحاجتهم إليه، فقيرًا عاجزًا عن الكسب لا يملك ما يكفيه ويسد حاجته، وطفلا مات أبوه وهو دون سن البلوغ ولا مال له، وأسيرًا أُسر في الحرب من المشركين وغيرهم."));
        alensanExes.add(new AlensanEx("إِنَّمَا نُطْعِمُكُمْ لِوَجْهِ اللَّهِ لَا نُرِيدُ مِنْكُمْ جَزَاءً وَلَا شُكُورًا (9)"));
        alensanExes.add(new AlensanEx("ويقولون في أنفسهم: إنما نحسن إليكم ابتغاء مرضاة الله، وطلب ثوابه، لا نبتغي عوضًا ولا نقصد حمدًا ولا ثناءً منكم."));
        alensanExes.add(new AlensanEx("إِنَّا نَخَافُ مِنْ رَبِّنَا يَوْمًا عَبُوسًا قَمْطَرِيرًا (10)"));
        alensanExes.add(new AlensanEx("إنا نخاف من ربنا يومًا شديدًا تَعْبِس فيه الوجوه، وتتقطَّبُ الجباه مِن فظاعة أمره وشدة هوله."));
        alensanExes.add(new AlensanEx("فَوَقَاهُمُ اللَّهُ شَرَّ ذَلِكَ الْيَوْمِ وَلَقَّاهُمْ نَضْرَةً وَسُرُورًا (11)"));
        alensanExes.add(new AlensanEx("فوقاهم الله من شدائد ذلك اليوم، وأعطاهم حسنًا ونورًا في وجوههم، وبهجة وفرحًا في قلوبهم."));
        alensanExes.add(new AlensanEx("وَجَزَاهُمْ بِمَا صَبَرُوا جَنَّةً وَحَرِيرًا (12)"));
        alensanExes.add(new AlensanEx("وأثابهم بصبرهم في الدنيا على الطاعة جنة عظيمة يأكلون منها ما شاؤوا، ويَلْبَسون فيها الحرير الناعم."));
        alensanExes.add(new AlensanEx("مُتَّكِئِينَ فِيهَا عَلَى الْأَرَائِكِ لَا يَرَوْنَ فِيهَا شَمْسًا وَلَا زَمْهَرِيرًا (13)"));
        alensanExes.add(new AlensanEx("متكئين فيها على الأسرَّة المزينة بفاخر الثياب والستور، لا يرون فيها حر شمس ولا شدة برد."));
        alensanExes.add(new AlensanEx("وَدَانِيَةً عَلَيْهِمْ ظِلَالُهَا وَذُلِّلَتْ قُطُوفُهَا تَذْلِيلًا (14)"));
        alensanExes.add(new AlensanEx("وقريبة منهم أشجار الجنة مظللة عليهم، وسُهِّل لهم أَخْذُ ثمارها تسهيلا."));
        alensanExes.add(new AlensanEx("وَيُطَافُ عَلَيْهِمْ بِآنِيَةٍ مِنْ فِضَّةٍ وَأَكْوَابٍ كَانَتْ قَوَارِيرَا (15)"));
        alensanExes.add(new AlensanEx("ويدور عليهم الخدم بأواني الطعام الفضيَّة، وأكواب الشراب من الزجاج، زجاج من فضة."));
        alensanExes.add(new AlensanEx("قَوَارِيرَ مِنْ فِضَّةٍ قَدَّرُوهَا تَقْدِيرًا (16)"));
        alensanExes.add(new AlensanEx("قدَّرها السقاة على مقدار ما يشتهي الشاربون لا تزيد ولا تنقص."));
        alensanExes.add(new AlensanEx("وَيُسْقَوْنَ فِيهَا كَأْسًا كَانَ مِزَاجُهَا زَنْجَبِيلًا (17)"));
        alensanExes.add(new AlensanEx("ْقَى هؤلاء الأبرار في الجنة كأسًا مملوءة خمرًا مزجت بالزنجبيل."));
        alensanExes.add(new AlensanEx("عَيْنًا فِيهَا تُسَمَّى سَلْسَبِيلًا (18)"));
        alensanExes.add(new AlensanEx("يشربون مِن عينٍ في الجنة تسمى سلسبيلا؛ لسلامة شرابها وسهولة مساغه وطيبه."));
        alensanExes.add(new AlensanEx("وَيَطُوفُ عَلَيْهِمْ وِلْدَانٌ مُخَلَّدُونَ إِذَا رَأَيْتَهُمْ حَسِبْتَهُمْ لُؤْلُؤًا مَنْثُورًا (19)"));
        alensanExes.add(new AlensanEx("ويدور على هؤلاء الأبرار لخدمتهم غلمان دائمون على حالهم، إذا أبصرتهم ظننتهم -لحسنهم وصفاء ألوانهم وإشراق وجوههم- اللؤلؤ المفرَّق المضيء."));
        alensanExes.add(new AlensanEx("وَإِذَا رَأَيْتَ ثَمَّ رَأَيْتَ نَعِيمًا وَمُلْكًا كَبِيرًا (20)"));
        alensanExes.add(new AlensanEx("وإذا أبصرت أيَّ مكان في الجنة رأيت فيه نعيمًا لا يُدْركه الوصف، ومُلْكا عظيمًا واسعًا لا غاية له."));
        alensanExes.add(new AlensanEx("عَالِيَهُمْ ثِيَابُ سُنْدُسٍ خُضْرٌ وَإِسْتَبْرَقٌ وَحُلُّوا أَسَاوِرَ مِنْ فِضَّةٍ وَسَقَاهُمْ رَبُّهُمْ شَرَابًا طَهُورًا (21)"));
        alensanExes.add(new AlensanEx("يعلوهم ويجمل أبدانهم ثياب بطائنها من الحرير الرقيق الأخضر، وظاهرها من الحرير الغليظ، ويُحَلَّون من الحليِّ بأساور من الفضة، وسقاهم ربهم فوق ذلك النعيم شرابًا لا رجس فيه ولا دنس."));
        alensanExes.add(new AlensanEx("إِنَّ هَذَا كَانَ لَكُمْ جَزَاءً وَكَانَ سَعْيُكُمْ مَشْكُورًا (22)"));
        alensanExes.add(new AlensanEx("ويقال لهم: إن هذا أُعِدَّ لكم مقابل أعمالكم الصالحة، وكان عملكم في الدنيا عند الله مرضيًا مقبولا."));
        alensanExes.add(new AlensanEx("إِنَّا نَحْنُ نَزَّلْنَا عَلَيْكَ الْقُرْآنَ تَنْزِيلًا (23)"));
        alensanExes.add(new AlensanEx("إنا نحن نَزَّلْنا عليك -أيها الرسول- القرآن تنزيلا من عندنا؛ لتذكر الناس بما فيه من الوعد والوعيد والثواب والعقاب."));
        alensanExes.add(new AlensanEx("فَاصْبِرْ لِحُكْمِ رَبِّكَ وَلَا تُطِعْ مِنْهُمْ آثِمًا أَوْ كَفُورًا (24)"));
        alensanExes.add(new AlensanEx("فاصبر لحكم ربك القدري واقبله، ولحكمه الديني فامض عليه، ولا تطع من المشركين من كان منغمسًا في الشهوات أو مبالغًا في الكفر والضلال."));
        alensanExes.add(new AlensanEx("وَاذْكُرِ اسْمَ رَبِّكَ بُكْرَةً وَأَصِيلًا (25)"));
        alensanExes.add(new AlensanEx("وداوم على ذكر اسم ربك ودعائه في أول النهار وآخره."));
        alensanExes.add(new AlensanEx("وَمِنَ اللَّيْلِ فَاسْجُدْ لَهُ وَسَبِّحْهُ لَيْلًا طَوِيلًا (26)"));
        alensanExes.add(new AlensanEx("ومن الليل فاخضع لربك، وصَلِّ له، وتهجَّد له زمنًا طويلا فيه."));
        alensanExes.add(new AlensanEx("إِنَّ هَؤُلَاءِ يُحِبُّونَ الْعَاجِلَةَ وَيَذَرُونَ وَرَاءَهُمْ يَوْمًا ثَقِيلًا (27)"));
        alensanExes.add(new AlensanEx("إن هؤلاء المشركين يحبون الدنيا، وينشغلون بها، ويتركون خلف ظهورهم العمل للآخرة، ولما فيه نجاتهم في يوم عظيم الشدائد."));
        alensanExes.add(new AlensanEx("نَحْنُ خَلَقْنَاهُمْ وَشَدَدْنَا أَسْرَهُمْ وَإِذَا شِئْنَا بَدَّلْنَا أَمْثَالَهُمْ تَبْدِيلًا (28)"));
        alensanExes.add(new AlensanEx("نحن خلقناهم، وأحكمنا خلقهم، وإذا شئنا أهلكناهم، وجئنا بقوم مطيعين ممتثلين لأوامر ربهم."));
        alensanExes.add(new AlensanEx("إِنَّ هَذِهِ تَذْكِرَةٌ فَمَنْ شَاءَ اتَّخَذَ إِلَى رَبِّهِ سَبِيلًا (29)"));
        alensanExes.add(new AlensanEx("إن هذه السورة عظة للعالمين، فمن أراد الخير لنفسه في الدنيا والآخرة اتخذ بالإيمان والتقوى طريقًا يوصله إلى مغفرة الله ورضوانه."));
        alensanExes.add(new AlensanEx("وَمَا تَشَاءُونَ إِلَّا أَنْ يَشَاءَ اللَّهُ إِنَّ اللَّهَ كَانَ عَلِيمًا حَكِيمًا (30)"));
        alensanExes.add(new AlensanEx("وما تريدون أمرًا من الأمور إلا بتقدير الله ومشيئته. إن الله كان عليمًا بأحوال خلقه، حكيمًا في تدبيره وصنعه."));
        alensanExes.add(new AlensanEx("يُدْخِلُ مَنْ يَشَاءُ فِي رَحْمَتِهِ وَالظَّالِمِينَ أَعَدَّ لَهُمْ عَذَابًا أَلِيمًا (31)"));
        alensanExes.add(new AlensanEx("يُدْخل مَن يشاء مِن عباده في رحمته ورضوانه، وهم المؤمنون، وأعدَّ للظالمين المتجاوزين حدود الله عذابًا موجعًا."));


        quran_explanation_76_adapter = new quran_explanation_76_adapter(alensanExes ,QuranExplanation_76Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_76);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_76Activity.this));
        recyclerView.setAdapter(quran_explanation_76_adapter);


    }

}