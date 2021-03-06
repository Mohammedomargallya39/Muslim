package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_63Activity extends AppCompatActivity {

    ArrayList<AlmonafeqonEx> almonafeqonExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_63_adapter quran_explanation_63_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_63);

        almonafeqonExes.add(new AlmonafeqonEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        almonafeqonExes.add(new AlmonafeqonEx("إِذَا جَاءَكَ الْمُنَافِقُونَ قَالُوا نَشْهَدُ إِنَّكَ لَرَسُولُ اللَّهِ وَاللَّهُ يَعْلَمُ إِنَّكَ لَرَسُولُهُ وَاللَّهُ يَشْهَدُ إِنَّ الْمُنَافِقِينَ لَكَاذِبُونَ (1)"));
        almonafeqonExes.add(new AlmonafeqonEx("إذا حضر مجلسك المنافقون -أيها الرسول- قالوا بألسنتهم، نشهد إنك لرسول الله، والله يعلم إنك لرسول الله، والله يشهد إن المنافقين لكاذبون فيما أظهروه من شهادتهم لك، وحلفوا عليه بألسنتهم، وأضمروا الكفر به."));
        almonafeqonExes.add(new AlmonafeqonEx("اتَّخَذُوا أَيْمَانَهُمْ جُنَّةً فَصَدُّوا عَنْ سَبِيلِ اللَّهِ إِنَّهُمْ سَاءَ مَا كَانُوا يَعْمَلُونَ (2)"));
        almonafeqonExes.add(new AlmonafeqonEx("إنما جعل المنافقون أيمانهم التي أقسموها سترة ووقاية لهم من المؤاخذة والعذاب، ومنعوا أنفسهم، ومنعوا الناس عن طريق الله المستقيم، إنهم بئس ما كانوا يعملون."));
        almonafeqonExes.add(new AlmonafeqonEx("ذَلِكَ بِأَنَّهُمْ آمَنُوا ثُمَّ كَفَرُوا فَطُبِعَ عَلَى قُلُوبِهِمْ فَهُمْ لَا يَفْقَهُونَ (3)"));
        almonafeqonExes.add(new AlmonafeqonEx("ذلك لأنهم آمنوا في الظاهر، ثم كفروا في الباطن، فختم الله على قلوبهم بسبب كفرهم، فهم لا يفهمون ما فيه صلاحهم."));
        almonafeqonExes.add(new AlmonafeqonEx("وَإِذَا رَأَيْتَهُمْ تُعْجِبُكَ أَجْسَامُهُمْ وَإِنْ يَقُولُوا تَسْمَعْ لِقَوْلِهِمْ كَأَنَّهُمْ خُشُبٌ مُسَنَّدَةٌ يَحْسَبُونَ كُلَّ صَيْحَةٍ عَلَيْهِمْ هُمُ الْعَدُوُّ فَاحْذَرْهُمْ قَاتَلَهُمُ اللَّهُ أَنَّى يُؤْفَكُونَ (4)"));
        almonafeqonExes.add(new AlmonafeqonEx("وإذا نظرت إلى هؤلاء المنافقين تعجبك هيئاتهم ومناظرهم، وإن يتحدثوا تسمع لحديثهم ; لفصاحة ألسنتهم، وهم لفراغ قلوبهم من الإيمان، وعقولهم من الفهم والعلم النافع كالأخشاب الملقاة على الحائط، التي لا حياة فيها، يظنون كل صوت عال واقعًا عليهم وضارًا بهم؛ لعلمهم بحقيقة حالهم، ولفرط جبنهم، والرعب الذي تمكَّن من قلوبهم، هم الأعداء الحقيقيون شديدو العداوة لك وللمؤمنين، فخذ حذرك منهم، أخزاهم الله وطردهم من رحمته، كيف ينصرفون عن الحق إلى ما هم فيه من النفاق والضلال؟"));
        almonafeqonExes.add(new AlmonafeqonEx("وَإِذَا قِيلَ لَهُمْ تَعَالَوْا يَسْتَغْفِرْ لَكُمْ رَسُولُ اللَّهِ لَوَّوْا رُءُوسَهُمْ وَرَأَيْتَهُمْ يَصُدُّونَ وَهُمْ مُسْتَكْبِرُونَ (5)"));
        almonafeqonExes.add(new AlmonafeqonEx("وإذا قيل لهؤلاء المنافقين: أقبلوا تائبين معتذرين عمَّا بدر منكم من سيِّئ القول وسفه الحديث، يستغفر لكم رسول الله ويسأل الله لكم المغفرة والعفو عن ذنوبكم، أمالوا رؤوسهم وحركوها استهزاءً واستكبارًا، وأبصرتهم -أيها الرسول- يعرضون عنك، وهم مستكبرون عن الامتثال لما طُلِب إليهم."));
        almonafeqonExes.add(new AlmonafeqonEx("سَوَاءٌ عَلَيْهِمْ أَسْتَغْفَرْتَ لَهُمْ أَمْ لَمْ تَسْتَغْفِرْ لَهُمْ لَنْ يَغْفِرَ اللَّهُ لَهُمْ إِنَّ اللَّهَ لَا يَهْدِي الْقَوْمَ الْفَاسِقِينَ (6)"));
        almonafeqonExes.add(new AlmonafeqonEx("سواء على هؤلاء المنافقين أطلبت لهم المغفرة من الله -أيها الرسول- أم لم تطلب لهم، إن الله لن يصفح عن ذنوبهم أبدًا ; لإصرارهم على الفسق ورسوخهم في الكفر. إن الله لا يوفِّق للإيمان القوم الكافرين به، الخارجين عن طاعته."));
        almonafeqonExes.add(new AlmonafeqonEx("هُمُ الَّذِينَ يَقُولُونَ لَا تُنْفِقُوا عَلَى مَنْ عِنْدَ رَسُولِ اللَّهِ حَتَّى يَنْفَضُّوا وَلِلَّهِ خَزَائِنُ السَّمَاوَاتِ وَالْأَرْضِ وَلَكِنَّ الْمُنَافِقِينَ لَا يَفْقَهُونَ (7)"));
        almonafeqonExes.add(new AlmonafeqonEx("هؤلاء المنافقون هم الذين يقولون لأهل «المدينة» : لا تنفقوا على أصحاب رسول الله من المهاجرين حتى يتفرقوا عنه. ولله وحده خزائن السموات والأرض وما فيهما من أرزاق، يعطيها من يشاء ويمنعها عمَّن يشاء، ولكن المنافقين لا يفهمون أن الرزق من عند الله؛ لجهلهم به سبحانه وتعالى."));
        almonafeqonExes.add(new AlmonafeqonEx("يَقُولُونَ لَئِنْ رَجَعْنَا إِلَى الْمَدِينَةِ لَيُخْرِجَنَّ الْأَعَزُّ مِنْهَا الْأَذَلَّ وَلِلَّهِ الْعِزَّةُ وَلِرَسُولِهِ وَلِلْمُؤْمِنِينَ وَلَكِنَّ الْمُنَافِقِينَ لَا يَعْلَمُونَ (8)"));
        almonafeqonExes.add(new AlmonafeqonEx("يقول هؤلاء المنافقون: لئن عُدْنا إلى «المدينة» ليخرجنَّ فريقنا الأعزُّ منها فريق المؤمنين الأذل، ولله تعالى العزة ولرسوله صلى الله عليه وسلم، وللمؤمنين بالله ورسوله لا لغيرهم، ولكن المنافقين لا يعلمون ذلك؛ لفرط جهلهم."));
        almonafeqonExes.add(new AlmonafeqonEx("يَاأَيُّهَا الَّذِينَ آمَنُوا لَا تُلْهِكُمْ أَمْوَالُكُمْ وَلَا أَوْلَادُكُمْ عَنْ ذِكْرِ اللَّهِ وَمَنْ يَفْعَلْ ذَلِكَ فَأُولَئِكَ هُمُ الْخَاسِرُونَ (9)"));
        almonafeqonExes.add(new AlmonafeqonEx("يا أيها الذين صدَّقوا الله ورسوله وعملوا بشرعه، لا تَشْغَلْكم أموالكم ولا أولادكم عن عبادة الله وطاعته، ومن تشغَله أمواله وأولاده عن ذلك، فأولئك هم المغبونون حظوظهم من كرامة الله ورحمته."));
        almonafeqonExes.add(new AlmonafeqonEx("وَأَنْفِقُوا مِنْ مَا رَزَقْنَاكُمْ مِنْ قَبْلِ أَنْ يَأْتِيَ أَحَدَكُمُ الْمَوْتُ فَيَقُولَ رَبِّ لَوْلَا أَخَّرْتَنِي إِلَى أَجَلٍ قَرِيبٍ فَأَصَّدَّقَ وَأَكُنْ مِنَ الصَّالِحِينَ (10)"));
        almonafeqonExes.add(new AlmonafeqonEx("وأنفقوا -أيها المؤمنون- بالله ورسوله بعض ما أعطيناكم في طرق الخير، مبادرين بذلك من قبل أن يجيء أحدكم الموت، ويرى دلائله وعلاماته، فيقول نادمًا: ربِّ هلا أمهلتني، وأجَّلت موتي إلى وقت قصير، فأتصدق من مالي، وأكن من الصالحين الأتقياء."));
        almonafeqonExes.add(new AlmonafeqonEx("وَلَنْ يُؤَخِّرَ اللَّهُ نَفْسًا إِذَا جَاءَ أَجَلُهَا وَاللَّهُ خَبِيرٌ بِمَا تَعْمَلُونَ (11)"));
        almonafeqonExes.add(new AlmonafeqonEx("ولن يؤخر الله نفسًا إذا جاء وقت موتها، وانقضى عمرها، والله سبحانه خبير بالذي تعملونه من خير وشر، وسيجازيكم على ذلك."));

        quran_explanation_63_adapter = new quran_explanation_63_adapter(almonafeqonExes ,QuranExplanation_63Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_63);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_63Activity.this));
        recyclerView.setAdapter(quran_explanation_63_adapter);


    }

}