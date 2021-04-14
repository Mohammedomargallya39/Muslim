package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_78Activity extends AppCompatActivity {

    ArrayList<AlnabaaEx> alnabaaExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_78_adapter quran_explanation_78_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_78);

        alnabaaExes.add(new AlnabaaEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alnabaaExes.add(new AlnabaaEx("عَمَّ يَتَسَاءَلُونَ (1)"));
        alnabaaExes.add(new AlnabaaEx("عن أيِّ شيء يسأل بعض كفار قريش بعضاً؟"));
        alnabaaExes.add(new AlnabaaEx("عَنِ النَّبَإِ الْعَظِيمِ (2)"));
        alnabaaExes.add(new AlnabaaEx("يتساءلون عن الخبر العظيم الشأن، وهو القرآن العظيم."));
        alnabaaExes.add(new AlnabaaEx("الَّذِي هُمْ فِيهِ مُخْتَلِفُونَ (3)"));
        alnabaaExes.add(new AlnabaaEx("الذي ينبئ عن البعث الذي شك فيه كفار قريش وكذَّبوا به."));
        alnabaaExes.add(new AlnabaaEx("كَلَّا سَيَعْلَمُونَ (4)"));
        alnabaaExes.add(new AlnabaaEx("ما الأمر كما يزعم هؤلاء المشركون، سيعلم هؤلاء المشركون عاقبة تكذيبهم، ويظهر لهم ما الله فاعل بهم يوم القيامة."));
        alnabaaExes.add(new AlnabaaEx("ثُمَّ كَلَّا سَيَعْلَمُونَ (5)"));
        alnabaaExes.add(new AlnabaaEx("ثم سيتأكد لهم ذلك، ويتأكد لهم صدق ما جاء به محمد صلى الله عليه وسلم، من القرآن والبعث.\n" +
                "وهذا تهديد ووعيد لهم.\n"));
        alnabaaExes.add(new AlnabaaEx("أَلَمْ نَجْعَلِ الْأَرْضَ مِهَادًا (6)"));
        alnabaaExes.add(new AlnabaaEx("ألم نجعل الأرض ممهدة لكم كالفراش؟"));
        alnabaaExes.add(new AlnabaaEx("وَالْجِبَالَ أَوْتَادًا (7)"));
        alnabaaExes.add(new AlnabaaEx("والجبال رواسي؛ كي لا تتحرك بكم الأرض؟"));
        alnabaaExes.add(new AlnabaaEx("وَخَلَقْنَاكُمْ أَزْوَاجًا (8)"));
        alnabaaExes.add(new AlnabaaEx("وخلقناكم أصنافا ذكرا وأنثى؟"));
        alnabaaExes.add(new AlnabaaEx("وَجَعَلْنَا نَوْمَكُمْ سُبَاتًا (9)"));
        alnabaaExes.add(new AlnabaaEx("وجعلنا نومكم راحة لأبدانكم، فيه تهدؤون وتسكنون؟"));
        alnabaaExes.add(new AlnabaaEx("وَجَعَلْنَا اللَّيْلَ لِبَاسًا (10)"));
        alnabaaExes.add(new AlnabaaEx("وجعلنا الليل لباسًا تَلْبَسكم ظلمته وتغشاكم، كما يستر الثوب لابسه؟"));
        alnabaaExes.add(new AlnabaaEx("وَجَعَلْنَا النَّهَارَ مَعَاشًا (11)"));
        alnabaaExes.add(new AlnabaaEx("وجعلنا النهار معاشا تنتشرون فيه لمعاشكم، وتسعَون فيه لمصالحكم؟"));
        alnabaaExes.add(new AlnabaaEx("وَبَنَيْنَا فَوْقَكُمْ سَبْعًا شِدَادًا (12)"));
        alnabaaExes.add(new AlnabaaEx("وبنينا فوقكم سبع سموات متينة البناء محكمة الخلق، لا صدوع لها ولا فطور؟"));
        alnabaaExes.add(new AlnabaaEx("وَجَعَلْنَا سِرَاجًا وَهَّاجًا (13)"));
        alnabaaExes.add(new AlnabaaEx("وجعلنا الشمس سراجًا وقَّادًا مضيئًا؟"));
        alnabaaExes.add(new AlnabaaEx("وَأَنْزَلْنَا مِنَ الْمُعْصِرَاتِ مَاءً ثَجَّاجًا (14)"));
        alnabaaExes.add(new AlnabaaEx("وأنزلنا من السحب الممطرة ماء منصَبّا بكثرة."));
        alnabaaExes.add(new AlnabaaEx("لِنُخْرِجَ بِهِ حَبًّا وَنَبَاتًا (15)"));
        alnabaaExes.add(new AlnabaaEx("رج به حبًا مما يقتات به الناس وحشائش مما تأكله الدَّواب."));
        alnabaaExes.add(new AlnabaaEx("وَجَنَّاتٍ أَلْفَافًا (16)"));
        alnabaaExes.add(new AlnabaaEx("وبساتين ملتفة بعضها ببعض لتشعُّب أغصانها؟"));
        alnabaaExes.add(new AlnabaaEx("إِنَّ يَوْمَ الْفَصْلِ كَانَ مِيقَاتًا (17)"));
        alnabaaExes.add(new AlnabaaEx("إن يوم الفصل بين الخلق، وهو يوم القيامة، كان وقتًا وميعادًا محددًا للأولين والآخرين."));
        alnabaaExes.add(new AlnabaaEx("يَوْمَ يُنْفَخُ فِي الصُّورِ فَتَأْتُونَ أَفْوَاجًا (18)"));
        alnabaaExes.add(new AlnabaaEx("يوم ينفخ المَلَك في «القرن» إيذانًا بالبعث فتأتون أممًا، كل أمة مع إمامهم."));
        alnabaaExes.add(new AlnabaaEx("وَفُتِحَتِ السَّمَاءُ فَكَانَتْ أَبْوَابًا (19)"));
        alnabaaExes.add(new AlnabaaEx("وفُتحت السماء، فكانت ذات أبواب كثيرة لنزول الملائكة."));
        alnabaaExes.add(new AlnabaaEx("وَسُيِّرَتِ الْجِبَالُ فَكَانَتْ سَرَابًا (20)"));
        alnabaaExes.add(new AlnabaaEx("ونسفت الجبال بعد ثبوتها، فكانت كالسراب."));
        alnabaaExes.add(new AlnabaaEx("إِنَّ جَهَنَّمَ كَانَتْ مِرْصَادًا (21)"));
        alnabaaExes.add(new AlnabaaEx("إن جهنم كانت يومئذ ترصد أهل الكفر الذين أُعِدَّت لهم."));
        alnabaaExes.add(new AlnabaaEx("لِلطَّاغِينَ مَآبًا (22)"));
        alnabaaExes.add(new AlnabaaEx("للكافرين مرجعًا."));
        alnabaaExes.add(new AlnabaaEx("لَابِثِينَ فِيهَا أَحْقَابًا (23)"));
        alnabaaExes.add(new AlnabaaEx("ماكثين فيها دهورًا متعاقبة لا تنقطع."));
        alnabaaExes.add(new AlnabaaEx("لَا يَذُوقُونَ فِيهَا بَرْدًا وَلَا شَرَابًا (24)"));
        alnabaaExes.add(new AlnabaaEx("لا يَطْعَمون فيها ما يُبْرد حرَّ السعير عنهم، ولا شرابًا يرويهم."));
        alnabaaExes.add(new AlnabaaEx("إِلَّا حَمِيمًا وَغَسَّاقًا (25)"));
        alnabaaExes.add(new AlnabaaEx("إلا ماءً حارًا، وصديد أهل النار."));
        alnabaaExes.add(new AlnabaaEx("جَزَاءً وِفَاقًا (26)"));
        alnabaaExes.add(new AlnabaaEx("يجازَون بذلك جزاء عادلا موافقًا لأعمالهم التي كانوا يعملونها في الدنيا."));
        alnabaaExes.add(new AlnabaaEx("إِنَّهُمْ كَانُوا لَا يَرْجُونَ حِسَابًا (27)"));
        alnabaaExes.add(new AlnabaaEx("إنهم كانوا لا يخافون يوم الحساب فلم يعملوا له."));
        alnabaaExes.add(new AlnabaaEx("وَكَذَّبُوا بِآيَاتِنَا كِذَّابًا (28)"));
        alnabaaExes.add(new AlnabaaEx("وكذَّبوا بما جاءتهم به الرسل تكذيبا."));
        alnabaaExes.add(new AlnabaaEx("وَكُلَّ شَيْءٍ أَحْصَيْنَاهُ كِتَابًا (29)"));
        alnabaaExes.add(new AlnabaaEx("وكلَّ شيء علمناه وكتبناه في اللوح المحفوظ."));
        alnabaaExes.add(new AlnabaaEx("فَذُوقُوا فَلَنْ نَزِيدَكُمْ إِلَّا عَذَابًا (30)"));
        alnabaaExes.add(new AlnabaaEx("فذوقوا -أيها الكافرون- جزاء أعمالكم، فلن نزيدكم إلا عذابًا فوق عذابكم."));
        alnabaaExes.add(new AlnabaaEx("إِنَّ لِلْمُتَّقِينَ مَفَازًا (31)"));
        alnabaaExes.add(new AlnabaaEx("إن للذين يخافون ربهم ويعملون صالحًا، فوزًا بدخولهم الجنة."));
        alnabaaExes.add(new AlnabaaEx("حَدَائِقَ وَأَعْنَابًا (32)"));
        alnabaaExes.add(new AlnabaaEx("إن لهم بساتين عظيمة وأعنابًا."));
        alnabaaExes.add(new AlnabaaEx("وَكَوَاعِبَ أَتْرَابًا (33)"));
        alnabaaExes.add(new AlnabaaEx("ولهم زوجات حديثات السن، نواهد مستويات في سن واحدة."));
        alnabaaExes.add(new AlnabaaEx("وَكَأْسًا دِهَاقًا (34)"));
        alnabaaExes.add(new AlnabaaEx("ولهم كأس مملوءة خمرًا."));
        alnabaaExes.add(new AlnabaaEx("لَا يَسْمَعُونَ فِيهَا لَغْوًا وَلَا كِذَّابًا (35)"));
        alnabaaExes.add(new AlnabaaEx("لا يسمعون في هذه الجنة باطلا من القول، ولا يكذب بعضهم بعضًا."));
        alnabaaExes.add(new AlnabaaEx("جَزَاءً مِنْ رَبِّكَ عَطَاءً حِسَابًا (36)"));
        alnabaaExes.add(new AlnabaaEx("لهم كل ذلك جزاء ومنَّة من الله وعطاءً كثيرًا كافيًا لهم."));
        alnabaaExes.add(new AlnabaaEx("رَبِّ السَّمَاوَاتِ وَالْأَرْضِ وَمَا بَيْنَهُمَا الرَّحْمَنِ لَا يَمْلِكُونَ مِنْهُ خِطَابًا (37)"));
        alnabaaExes.add(new AlnabaaEx("ربِّ السموات والأرض وما بينهما، رحمنِ الدنيا والآخرة، لا يملكون أن يسألوه إلا فيما أذن لهم فيه."));
        alnabaaExes.add(new AlnabaaEx("يَوْمَ يَقُومُ الرُّوحُ وَالْمَلَائِكَةُ صَفًّا لَا يَتَكَلَّمُونَ إِلَّا مَنْ أَذِنَ لَهُ الرَّحْمَنُ وَقَالَ صَوَابًا (38)"));
        alnabaaExes.add(new AlnabaaEx("يوم يقوم جبريل عليه السلام والملائكة مصطفِّين، لا يشفعون إلا لمن أذن له الرحمن في الشفاعة، وقال حقًا وسدادًا"));
        alnabaaExes.add(new AlnabaaEx("ذَلِكَ الْيَوْمُ الْحَقُّ فَمَنْ شَاءَ اتَّخَذَ إِلَى رَبِّهِ مَآبًا (39)"));
        alnabaaExes.add(new AlnabaaEx("ذلك اليوم الحق الذي لا ريب في وقوعه، فمن شاء النجاة مِن أهواله فليتخذ إلى ربه مرجعًا بالعمل الصالح."));
        alnabaaExes.add(new AlnabaaEx("إِنَّا أَنْذَرْنَاكُمْ عَذَابًا قَرِيبًا يَوْمَ يَنْظُرُ الْمَرْءُ مَا قَدَّمَتْ يَدَاهُ وَيَقُولُ الْكَافِرُ يَالَيْتَنِي كُنْتُ تُرَابًا (40)"));
        alnabaaExes.add(new AlnabaaEx("إنَّا حذَّرناكم عذاب يوم الآخرة القريب الذي يرى فيه كل امرئ ما عمل من خير أو اكتسب من إثم، ويقول الكافر من هول الحساب: يا ليتني كنت ترابًا فلم أُبعث."));


        quran_explanation_78_adapter = new quran_explanation_78_adapter(alnabaaExes ,QuranExplanation_78Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_78);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_78Activity.this));
        recyclerView.setAdapter(quran_explanation_78_adapter);


    }

}