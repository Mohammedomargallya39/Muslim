package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_1Activity extends AppCompatActivity {

    ArrayList<AlfatehaEx> alfatehaExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_1_adapter quran_explanation_1_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_1);

        alfatehaExes.add(new AlfatehaEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ (1)"));
        alfatehaExes.add(new AlfatehaEx("سورة الفاتحة سميت هذه السورة بالفاتحة; لأنه يفتتح بها القرآن العظيم، وتسمى المثاني; لأنها تقرأ في كل ركعة، ولها أسماء أخر.\n" +
                "أبتدئ قراءة القرآن باسم الله مستعينا به، (اللهِ) علم على الرب -تبارك وتعالى- المعبود بحق دون سواه، وهو أخص أسماء الله تعالى، ولا يسمى به غيره سبحانه.\n" +
                "(الرَّحْمَنِ) ذي الرحمة العامة الذي وسعت رحمته جميع الخلق، (الرَّحِيمِ) بالمؤمنين، وهما اسمان من أسمائه تعالى، يتضمنان إثبات صفة الرحمة لله تعالى كما يليق بجلاله.\n"));
        alfatehaExes.add(new AlfatehaEx("الْحَمْدُ لِلَّهِ رَبِّ الْعَالَمِينَ (2)"));
        alfatehaExes.add(new AlfatehaEx("الثناء على الله بصفاته التي كلُّها أوصاف كمال، وبنعمه الظاهرة والباطنة، الدينية والدنيوية، وفي ضمنه أَمْرٌ لعباده أن يحمدوه، فهو المستحق له وحده، وهو سبحانه المنشئ للخلق، القائم بأمورهم، المربي لجميع خلقه بنعمه، ولأوليائه بالإيمان والعمل الصالح."));
        alfatehaExes.add(new AlfatehaEx("الرَّحْمَنِ الرَّحِيمِ (3)"));
        alfatehaExes.add(new AlfatehaEx("(الرَّحْمَنِ) ذي الرحمة العامة الذي وسعت رحمته جميع الخلق، (الرَّحِيمِ) ، بالمؤمنين، وهما اسمان من أسماء الله تعالى."));
        alfatehaExes.add(new AlfatehaEx("مَالِكِ يَوْمِ الدِّينِ (4)"));
        alfatehaExes.add(new AlfatehaEx("وهو سبحانه وحده مالك يوم القيامة، وهو يوم الجزاء على الأعمال.\n" +
                "وفي قراءة المسلم لهذه الآية في كل ركعة من صلواته تذكير له باليوم الآخر، وحثٌّ له على الاستعداد بالعمل الصالح، والكف عن المعاصي والسيئات.\n"));
        alfatehaExes.add(new AlfatehaEx("إِيَّاكَ نَعْبُدُ وَإِيَّاكَ نَسْتَعِينُ (5)"));
        alfatehaExes.add(new AlfatehaEx("إنا نخصك وحدك بالعبادة، ونستعين بك وحدك في جميع أمورنا، فالأمر كله بيدك، لا يملك منه أحد مثقال ذرة.\n" +
                "وفي هذه الآية دليل على أن العبد لا يجوز له أن يصرف شيئًا من أنواع العبادة كالدعاء والاستغاثة والذبح والطواف إلا لله وحده، وفيها شفاء القلوب من داء التعلق بغير الله، ومن أمراض الرياء والعجب، والكبرياء.\n"));
        alfatehaExes.add(new AlfatehaEx("اهْدِنَا الصِّرَاطَ الْمُسْتَقِيمَ (6)"));
        alfatehaExes.add(new AlfatehaEx("دُلَّنا، وأرشدنا، ووفقنا إلى الطريق المستقيم، وثبتنا عليه حتى نلقاك، وهو الإسلام، الذي هو الطريق الواضح الموصل إلى رضوان الله وإلى جنته، الذي دلّ عليه خاتم رسله وأنبيائه محمد صلى الله عليه وسلم، فلا سبيل إلى سعادة العبد إلا بالاستقامة عليه."));
        alfatehaExes.add(new AlfatehaEx("صِرَاطَ الَّذِينَ أَنْعَمْتَ عَلَيْهِمْ غَيْرِ الْمَغْضُوبِ عَلَيْهِمْ وَلَا الضَّالِّينَ (7)"));
        alfatehaExes.add(new AlfatehaEx("طريق الذين أنعمت عليهم من النبيين والصدِّيقين والشهداء والصالحين، فهم أهل الهداية والاستقامة، ولا تجعلنا ممن سلك طريق المغضوب عليهم، الذين عرفوا الحق ولم يعملوا به، وهم اليهود، ومن كان على شاكلتهم، والضالين، وهم الذين لم يهتدوا عن جهل منهم، فضلوا الطريق، وهم النصارى، ومن اتبع سنتهم.\n" +
                "وفي هذا الدعاء شفاء لقلب المسلم من مرض الجحود والجهل والضلال، ودلالة على أن أعظم نعمة على الإطلاق هي نعمة الإسلام، فمن كان أعرف للحق وأتبع له، كان أولى بالصراط المستقيم، ولا ريب أن أصحاب رسول الله صلى الله عليه وسلم هم أولى الناس بذلك بعد الأنبياء عليهم السلام، فدلت الآية على فضلهم، وعظيم منزلتهم، رضي الله عنهم.\n" +
                "ويستحب للقارئ أن يقول في الصلاة بعد قراءة الفاتحة: (آمين) ، ومعناها: اللهم استجب، وليست آية من سورة الفاتحة باتفاق العلماء; ولهذا أجمعوا على عدم كتابتها في المصاحف.\n"));


        quran_explanation_1_adapter = new quran_explanation_1_adapter(alfatehaExes ,QuranExplanation_1Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_1);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_1Activity.this));
        recyclerView.setAdapter(quran_explanation_1_adapter);


    }

}