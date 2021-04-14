package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_85Activity extends AppCompatActivity {

    ArrayList<AlborogEx> alborogExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_85_adapter quran_explanation_85_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_85);

        alborogExes.add(new AlborogEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alborogExes.add(new AlborogEx("وَالسَّمَاءِ ذَاتِ الْبُرُوجِ (1)"));
        alborogExes.add(new AlborogEx("أقسم الله تعالى بالسماء ذات المنازل التي تمر بها الشمس والقمر."));
        alborogExes.add(new AlborogEx("وَالْيَوْمِ الْمَوْعُودِ (2)"));
        alborogExes.add(new AlborogEx("بيوم القيامة الذي وعد الله الخلق أن يجمعهم فيه."));
        alborogExes.add(new AlborogEx("وَشَاهِدٍ وَمَشْهُودٍ (3)"));
        alborogExes.add(new AlborogEx("وشاهد يشهد، ومشهود يشهد عليه.ويقسم الله -سبحانه- بما يشاء من مخلوقاته، أما المخلوق فلا يجوز له أن يقسم بغير الله، فإن القسم بغير الله شرك -."));
        alborogExes.add(new AlborogEx("قُتِلَ أَصْحَابُ الْأُخْدُودِ (4)"));
        alborogExes.add(new AlborogEx("لُعن الذين شَقُّوا في الأرض شقًا عظيمًا؛ لتعذيب المؤمنين."));
        alborogExes.add(new AlborogEx("النَّارِ ذَاتِ الْوَقُودِ (5)"));
        alborogExes.add(new AlborogEx("وأوقدوا النار الشديدة ذات الوَقود."));
        alborogExes.add(new AlborogEx("إِذْ هُمْ عَلَيْهَا قُعُودٌ (6)"));
        alborogExes.add(new AlborogEx("إذ هم قعود على الأخدود ملازمون له."));
        alborogExes.add(new AlborogEx("وَهُمْ عَلَى مَا يَفْعَلُونَ بِالْمُؤْمِنِينَ شُهُودٌ (7)"));
        alborogExes.add(new AlborogEx("وهم على ما يفعلون بالمؤمنين من تنكيل وتعذيب حضورٌ."));
        alborogExes.add(new AlborogEx("وَمَا نَقَمُوا مِنْهُمْ إِلَّا أَنْ يُؤْمِنُوا بِاللَّهِ الْعَزِيزِ الْحَمِيدِ (8)"));
        alborogExes.add(new AlborogEx("وما أخذوهم بمثل هذا العقاب الشديد إلا أن كانوا مؤمنين بالله العزيز الذي لا يغالَب، الحميد في أقواله وأفعاله وأوصافه."));
        alborogExes.add(new AlborogEx("الَّذِي لَهُ مُلْكُ السَّمَاوَاتِ وَالْأَرْضِ وَاللَّهُ عَلَى كُلِّ شَيْءٍ شَهِيدٌ (9)"));
        alborogExes.add(new AlborogEx("الذي له ملك السماوات والأرض، وهو -سبحانه- على كل شيء شهيد، لا يخفى عليه شيء."));
        alborogExes.add(new AlborogEx("إِنَّ الَّذِينَ فَتَنُوا الْمُؤْمِنِينَ وَالْمُؤْمِنَاتِ ثُمَّ لَمْ يَتُوبُوا فَلَهُمْ عَذَابُ جَهَنَّمَ وَلَهُمْ عَذَابُ الْحَرِيقِ (10)"));
        alborogExes.add(new AlborogEx("إن الذين حرقوا المؤمنين والمؤمنات بالنار؛ ليصرفوهم عن دين الله، ثم لم يتوبوا، فلهم في الآخرة عذاب جهنم، ولهم العذاب الشديد المحرق."));
        alborogExes.add(new AlborogEx("إِنَّ الَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ لَهُمْ جَنَّاتٌ تَجْرِي مِنْ تَحْتِهَا الْأَنْهَارُ ذَلِكَ الْفَوْزُ الْكَبِيرُ (11)"));
        alborogExes.add(new AlborogEx("إن الذين صدَّقوا الله ورسوله وعملوا الأعمال الصالحات، لهم جنات تجري من تحت قصورها وأشجارها الأنهار، ذلك الفوز العظيم."));
        alborogExes.add(new AlborogEx("إِنَّ بَطْشَ رَبِّكَ لَشَدِيدٌ (12)"));
        alborogExes.add(new AlborogEx("إن انتقام ربك من أعدائه وعذابه لهم لَعظيم شديد."));
        alborogExes.add(new AlborogEx("إِنَّهُ هُوَ يُبْدِئُ وَيُعِيدُ (13)"));
        alborogExes.add(new AlborogEx("إنه هو يُبدئ الخلق ثم يعيده."));
        alborogExes.add(new AlborogEx("وَهُوَ الْغَفُورُ الْوَدُودُ (14)"));
        alborogExes.add(new AlborogEx("وهو الغفور لمن تاب، كثير المودة والمحبة لأوليائه."));
        alborogExes.add(new AlborogEx("ذُو الْعَرْشِ الْمَجِيدُ (15)"));
        alborogExes.add(new AlborogEx("صاحب العرشِ المجيدُ الذي بلغ المنتهى في الفضل والكرم."));
        alborogExes.add(new AlborogEx("فَعَّالٌ لِمَا يُرِيدُ (16)"));
        alborogExes.add(new AlborogEx("فَعَّال لما يريد، لا يمتنع عليه شيء يريده."));
        alborogExes.add(new AlborogEx("هَلْ أَتَاكَ حَدِيثُ الْجُنُودِ (17)"));
        alborogExes.add(new AlborogEx("هل بلغك -أيها الرسول- خبر الجموع الكافرة المكذبة لأنبيائها."));
        alborogExes.add(new AlborogEx("فِرْعَوْنَ وَثَمُودَ (18)"));
        alborogExes.add(new AlborogEx("فرعون وثمود، وما حلَّ بهم من العذاب والنكال، لم يعتبر القوم بذلك."));
        alborogExes.add(new AlborogEx("بَلِ الَّذِينَ كَفَرُوا فِي تَكْذِيبٍ (19)"));
        alborogExes.add(new AlborogEx("بل الذين كفروا في تكذيب متواصل كدأب مَن قبلهم."));
        alborogExes.add(new AlborogEx("وَاللَّهُ مِنْ وَرَائِهِمْ مُحِيطٌ (20)"));
        alborogExes.add(new AlborogEx("والله قد أحاط بهم علما وقدرة، لا يخفى عليه منهم ومن أعمالهم شيء."));
        alborogExes.add(new AlborogEx("بَلْ هُوَ قُرْآنٌ مَجِيدٌ (21)"));
        alborogExes.add(new AlborogEx("وليس القرآن كما زعم المكذبون المشركون بأنه شعر وسحر، فكذَّبوا به، بل هو قرآن عظيم كريم."));
        alborogExes.add(new AlborogEx("فِي لَوْحٍ مَحْفُوظٍ (22)"));
        alborogExes.add(new AlborogEx("في لوح محفوظ، لا يناله تبديل ولا تحريف."));

        quran_explanation_85_adapter = new quran_explanation_85_adapter(alborogExes ,QuranExplanation_85Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_85);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_85Activity.this));
        recyclerView.setAdapter(quran_explanation_85_adapter);


    }

}