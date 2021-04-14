package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_73Activity extends AppCompatActivity {

    ArrayList<AlmozamelEx> almozamelExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_73_adapter quran_explanation_73_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_73);

        almozamelExes.add(new AlmozamelEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        almozamelExes.add(new AlmozamelEx("يَاأَيُّهَا الْمُزَّمِّلُ (1)"));
        almozamelExes.add(new AlmozamelEx("يا أيها المتغطي بثيابه."));
        almozamelExes.add(new AlmozamelEx("قُمِ اللَّيْلَ إِلَّا قَلِيلًا (2)"));
        almozamelExes.add(new AlmozamelEx("قم للصلاة في الليل إلا يسيرًا منه."));
        almozamelExes.add(new AlmozamelEx("نِصْفَهُ أَوِ انْقُصْ مِنْهُ قَلِيلًا (3)"));
        almozamelExes.add(new AlmozamelEx("قم نصف الليل أو انقص من النصف قليلا حتى تَصِلَ إلى الثلث."));
        almozamelExes.add(new AlmozamelEx("أَوْ زِدْ عَلَيْهِ وَرَتِّلِ الْقُرْآنَ تَرْتِيلًا (4)"));
        almozamelExes.add(new AlmozamelEx("أو زد على النصف حتى تصل إلى الثلثين، واقرأ القرآن بتُؤَدَة وتمهُّلٍ مبيِّنًا الحروف والوقوف."));
        almozamelExes.add(new AlmozamelEx("إِنَّا سَنُلْقِي عَلَيْكَ قَوْلًا ثَقِيلًا (5)"));
        almozamelExes.add(new AlmozamelEx("إنا سننزل عليك -أيها النبي- قرآنًا عظيمًا مشتملا على الأوامر والنواهي والأحكام الشرعية."));
        almozamelExes.add(new AlmozamelEx("إِنَّ نَاشِئَةَ اللَّيْلِ هِيَ أَشَدُّ وَطْئًا وَأَقْوَمُ قِيلًا (6)"));
        almozamelExes.add(new AlmozamelEx("إن العبادة التي تنشأ في جوف الليل هي أشد تأثيرًا في القلب، وأبين قولا لفراغ القلب مِن مشاغل الدنيا."));
        almozamelExes.add(new AlmozamelEx("إِنَّ لَكَ فِي النَّهَارِ سَبْحًا طَوِيلًا (7)"));
        almozamelExes.add(new AlmozamelEx("إن لك في النهار تصرفًا وتقلبًا في مصالحك، واشتغالا واسعًا بأمور الرسالة، ففرِّغْ نفسك ليلا لعبادة ربك."));
        almozamelExes.add(new AlmozamelEx("وَاذْكُرِ اسْمَ رَبِّكَ وَتَبَتَّلْ إِلَيْهِ تَبْتِيلًا (8)"));
        almozamelExes.add(new AlmozamelEx("واذكر -أيها النبي- اسم ربك، فادعه به، وانقطع إليه انقطاعًا تامًا في عبادتك، وتوكل عليه."));
        almozamelExes.add(new AlmozamelEx("رَبُّ الْمَشْرِقِ وَالْمَغْرِبِ لَا إِلَهَ إِلَّا هُوَ فَاتَّخِذْهُ وَكِيلًا (9)"));
        almozamelExes.add(new AlmozamelEx("هو مالك المشرق والمغرب لا معبود بحق إلا هو، فاعتمد عليه، وفوِّض أمورك إليه."));
        almozamelExes.add(new AlmozamelEx("وَاصْبِرْ عَلَى مَا يَقُولُونَ وَاهْجُرْهُمْ هَجْرًا جَمِيلًا (10)"));
        almozamelExes.add(new AlmozamelEx("واصبر على ما يقوله المشركون فيك وفي دينك، وخالفهم في أفعالهم الباطلة، مع الإعراض عنهم، وترك الانتقام منهم."));
        almozamelExes.add(new AlmozamelEx("وَذَرْنِي وَالْمُكَذِّبِينَ أُولِي النَّعْمَةِ وَمَهِّلْهُمْ قَلِيلًا (11)"));
        almozamelExes.add(new AlmozamelEx("دعني -أيها الرسول- وهؤلاء المكذبين بآياتي أصحاب النعيم والترف في الدنيا، ومهِّلهم زمنًا قليلا بتأخير العذاب عنهم حتى يبلغ الكتاب أجله بعذابهم."));
        almozamelExes.add(new AlmozamelEx("إِنَّ لَدَيْنَا أَنْكَالًا وَجَحِيمًا (12)"));
        almozamelExes.add(new AlmozamelEx("إن لهم عندنا في الآخرة قيودًا ثقيلة ونارًا مستعرة يُحرقون بها."));
        almozamelExes.add(new AlmozamelEx("وَطَعَامًا ذَا غُصَّةٍ وَعَذَابًا أَلِيمًا (13)"));
        almozamelExes.add(new AlmozamelEx("وطعامًا كريهًا ينشَب في الحلوق لا يستساغ، وعذابًا موجعًا."));
        almozamelExes.add(new AlmozamelEx("يَوْمَ تَرْجُفُ الْأَرْضُ وَالْجِبَالُ وَكَانَتِ الْجِبَالُ كَثِيبًا مَهِيلًا (14)"));
        almozamelExes.add(new AlmozamelEx("يوم تضطرب الأرض والجبال وتتزلزل حتى تصير الجبال تَلا من الرمل سائلا متناثرًا، بعد أن كانت صُلبة جامدة."));
        almozamelExes.add(new AlmozamelEx("إِنَّا أَرْسَلْنَا إِلَيْكُمْ رَسُولًا شَاهِدًا عَلَيْكُمْ كَمَا أَرْسَلْنَا إِلَى فِرْعَوْنَ رَسُولًا (15)"));
        almozamelExes.add(new AlmozamelEx("إنا أرسلنا إليكم -يا أهل «مكة» - محمدًا رسولا شاهدًا عليكم بما صدر منكم من الكفر والعصيان، كما أرسلنا موسى رسولا إلى الطاغية فرعون."));
        almozamelExes.add(new AlmozamelEx("فَعَصَى فِرْعَوْنُ الرَّسُولَ فَأَخَذْنَاهُ أَخْذًا وَبِيلًا (16)"));
        almozamelExes.add(new AlmozamelEx("فكذَّب فرعون بموسى، ولم يؤمن برسالته، وعصى أمره، فأهلكناه إهلاكًا شديدًا.\n" +
                "وفي هذا تحذير من معصية الرسول محمد صلى الله عليه وسلم؛ خشية أن يصيب العاصي مثل ما أصاب فرعون وقومه.\n"));
        almozamelExes.add(new AlmozamelEx("فَكَيْفَ تَتَّقُونَ إِنْ كَفَرْتُمْ يَوْمًا يَجْعَلُ الْوِلْدَانَ شِيبًا (17)"));
        almozamelExes.add(new AlmozamelEx("فكيف تَقُون أنفسكم -إن كفرتم- عذاب يوم القيامة الذي يشيب فيه الولدان الصغار; مِن شدة هوله وكربه؟"));
        almozamelExes.add(new AlmozamelEx("السَّمَاءُ مُنْفَطِرٌ بِهِ كَانَ وَعْدُهُ مَفْعُولًا (18)"));
        almozamelExes.add(new AlmozamelEx("السماء متصدعة في ذلك اليوم; لشدة هوله، كان وعد الله تعالى بمجيء ذلك اليوم واقعًا لا محالة."));
        almozamelExes.add(new AlmozamelEx("إِنَّ هَذِهِ تَذْكِرَةٌ فَمَنْ شَاءَ اتَّخَذَ إِلَى رَبِّهِ سَبِيلًا (19)"));
        almozamelExes.add(new AlmozamelEx("إن هذه الآيات المخوفة التي فيها القوارع والزواجر عظة وعبرة للناس، فمن أراد الاتعاظ والانتفاع بها اتخذ الطاعة والتقوى طريقًا توصله إلى رضوان ربه الذي خلقه وربَّاه."));
        almozamelExes.add(new AlmozamelEx("إِنَّ رَبَّكَ يَعْلَمُ أَنَّكَ تَقُومُ أَدْنَى مِنْ ثُلُثَيِ اللَّيْلِ وَنِصْفَهُ وَثُلُثَهُ وَطَائِفَةٌ مِنَ الَّذِينَ مَعَكَ وَاللَّهُ يُقَدِّرُ اللَّيْلَ وَالنَّهَارَ عَلِمَ أَنْ لَنْ تُحْصُوهُ فَتَابَ عَلَيْكُمْ فَاقْرَءُوا مَا تَيَسَّرَ مِنَ الْقُرْآنِ عَلِمَ أَنْ سَيَكُونُ مِنْكُمْ مَرْضَى وَآخَرُونَ يَضْرِبُونَ فِي الْأَرْضِ يَبْتَغُونَ مِنْ فَضْلِ اللَّهِ وَآخَرُونَ يُقَاتِلُونَ فِي سَبِيلِ اللَّهِ فَاقْرَءُوا مَا تَيَسَّرَ مِنْهُ وَأَقِيمُوا الصَّلَاةَ وَآتُوا الزَّكَاةَ وَأَقْرِضُوا اللَّهَ قَرْضًا حَسَنًا وَمَا تُقَدِّمُوا لِأَنْفُسِكُمْ مِنْ خَيْرٍ تَجِدُوهُ عِنْدَ اللَّهِ هُوَ خَيْرًا وَأَعْظَمَ أَجْرًا وَاسْتَغْفِرُوا اللَّهَ إِنَّ اللَّهَ غَفُورٌ رَحِيمٌ (20)"));
        almozamelExes.add(new AlmozamelEx("إن ربك -أيها النبي- يعلم أنك تقوم للتهجد من الليل أقل من ثلثيه حينًا، وتقوم نصفه حينًا، وتقوم ثلثه حينًا آخر، ويقوم معك طائفة من أصحابك. والله وحده هو الذي يقدِّر الليل والنهار، ويعلم مقاديرهما، وما يمضي ويبقى منهما، علم الله أنه لا يمكنكم قيام الليل كله، فخفَّف عليكم، فاقرؤوا في الصلاة بالليل ما تيسر لكم قراءته من القرآن، علم الله أنه سيوجد فيكم مَن يُعجزه المرض عن قيام الليل، ويوجد قوم آخرون يتنقَّلون في الأرض للتجارة والعمل يطلبون من رزق الله الحلال، وقوم آخرون يجاهدون في سبيل الله؛ لإعلاء كلمته ونشر دينه، فاقرؤوا في صلاتكم ما تيسَّر لكم من القرآن، وواظبوا على فرائض الصلاة، وأعطوا الزكاة الواجبة عليكم، وتصدَّقوا في وجوه البر والإحسان مِن أموالكم؛ ابتغاء وجه الله، وما تفعلوا مِن وجوه البر والخير وعمل الطاعات، تلقَوا أجره وثوابه عند الله يوم القيامة خيرًا مما قدَّمتم في الدنيا، وأعظم منه ثوابًا، واطلبوا مغفرة الله في جميع أحوالكم، إن الله غفور لكم، رحيم بكم."));


        quran_explanation_73_adapter = new quran_explanation_73_adapter(almozamelExes ,QuranExplanation_73Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_73);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_73Activity.this));
        recyclerView.setAdapter(quran_explanation_73_adapter);


    }

}