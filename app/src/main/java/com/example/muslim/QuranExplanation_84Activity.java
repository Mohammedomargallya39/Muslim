package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_84Activity extends AppCompatActivity {

    ArrayList<AlenshqaqEx> alenshqaqExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_84_adapter quran_explanation_84_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_84);

        alenshqaqExes.add(new AlenshqaqEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alenshqaqExes.add(new AlenshqaqEx("إِذَا السَّمَاءُ انْشَقَّتْ (1)"));
        alenshqaqExes.add(new AlenshqaqEx("إذا السماء تصدَّعت، وتفطَّرت بالغمام يوم القيامة."));
        alenshqaqExes.add(new AlenshqaqEx("وَأَذِنَتْ لِرَبِّهَا وَحُقَّتْ (2)"));
        alenshqaqExes.add(new AlenshqaqEx("وأطاعت أمر ربها فيما أمرها به من الانشقاق، وحُقَّ لها أن تنقاد لأمره."));
        alenshqaqExes.add(new AlenshqaqEx("وَإِذَا الْأَرْضُ مُدَّتْ (3)"));
        alenshqaqExes.add(new AlenshqaqEx("وإذا الأرض بُسطت وَوُسِّعت، ودكت جبالها في ذلك اليوم."));
        alenshqaqExes.add(new AlenshqaqEx("وَأَلْقَتْ مَا فِيهَا وَتَخَلَّتْ (4)"));
        alenshqaqExes.add(new AlenshqaqEx("وقذفت ما في بطنها من الأموات، وتخلَّتْ عنهم."));
        alenshqaqExes.add(new AlenshqaqEx("وَأَذِنَتْ لِرَبِّهَا وَحُقَّتْ (5)"));
        alenshqaqExes.add(new AlenshqaqEx("وانقادت لربها فيما أمرها به، وحُقَّ لها أن تنقاد لأمره."));
        alenshqaqExes.add(new AlenshqaqEx("يَاأَيُّهَا الْإِنْسَانُ إِنَّكَ كَادِحٌ إِلَى رَبِّكَ كَدْحًا فَمُلَاقِيهِ (6)"));
        alenshqaqExes.add(new AlenshqaqEx("يا أيها الإنسان إنك ساعٍ إلى الله، وعامل أعمالا من خير أو شر، ثم تلاقي الله يوم القيامة، فيجازيك بعملك بفضله أو عدله. أن لن يرجع."));
        alenshqaqExes.add(new AlenshqaqEx("فَأَمَّا مَنْ أُوتِيَ كِتَابَهُ بِيَمِينِهِ (7)"));
        alenshqaqExes.add(new AlenshqaqEx("فأما من أعطي صحيفة أعماله بيمينه، وهو مؤمن بربه."));
        alenshqaqExes.add(new AlenshqaqEx("فَسَوْفَ يُحَاسَبُ حِسَابًا يَسِيرًا (8)"));
        alenshqaqExes.add(new AlenshqaqEx("فسوف يحاسب حسابًا سهلا."));
        alenshqaqExes.add(new AlenshqaqEx("وَيَنْقَلِبُ إِلَى أَهْلِهِ مَسْرُورًا (9)"));
        alenshqaqExes.add(new AlenshqaqEx("ويرجع إلى أهله في الجنة مسرورًا."));
        alenshqaqExes.add(new AlenshqaqEx("وَأَمَّا مَنْ أُوتِيَ كِتَابَهُ وَرَاءَ ظَهْرِهِ (10)"));
        alenshqaqExes.add(new AlenshqaqEx("وأمَّا مَن أُعطي صحيفة أعماله من وراء ظهره، وهو الكافر بالله."));
        alenshqaqExes.add(new AlenshqaqEx("فَسَوْفَ يَدْعُو ثُبُورًا (11)"));
        alenshqaqExes.add(new AlenshqaqEx("فسوف يدعو بالهلاك والثبور."));
        alenshqaqExes.add(new AlenshqaqEx("وَيَصْلَى سَعِيرًا (12)"));
        alenshqaqExes.add(new AlenshqaqEx("ويدخل النار مقاسيًا حرها."));
        alenshqaqExes.add(new AlenshqaqEx("إِنَّهُ كَانَ فِي أَهْلِهِ مَسْرُورًا (13)"));
        alenshqaqExes.add(new AlenshqaqEx("إنه كان في أهله في الدنيا مسرورًا مغرورًا، لا يفكر في العواقب."));
        alenshqaqExes.add(new AlenshqaqEx("إِنَّهُ ظَنَّ أَنْ لَنْ يَحُورَ (14)"));
        alenshqaqExes.add(new AlenshqaqEx("إنه ظنَّ أن لن يرجع إلى خالقه حيا للحساب."));
        alenshqaqExes.add(new AlenshqaqEx("بَلَى إِنَّ رَبَّهُ كَانَ بِهِ بَصِيرًا (15)"));
        alenshqaqExes.add(new AlenshqaqEx("بلى سيعيده الله كما بدأه ويجازيه على أعماله، إن ربه كان به بصيرًا عليمًا بحاله من يوم خلقه إلى أن بعثه."));
        alenshqaqExes.add(new AlenshqaqEx("فَلَا أُقْسِمُ بِالشَّفَقِ (16)"));
        alenshqaqExes.add(new AlenshqaqEx("أقسم الله تعالى باحمرار الأفق عند الغروب."));
        alenshqaqExes.add(new AlenshqaqEx("وَاللَّيْلِ وَمَا وَسَقَ (17)"));
        alenshqaqExes.add(new AlenshqaqEx("وبالليل وما جمع من الدواب والحشرات والهوام وغير ذلك."));
        alenshqaqExes.add(new AlenshqaqEx("وَالْقَمَرِ إِذَا اتَّسَقَ (18)"));
        alenshqaqExes.add(new AlenshqaqEx("وبالقمر إذا تكامل نوره."));
        alenshqaqExes.add(new AlenshqaqEx("لَتَرْكَبُنَّ طَبَقًا عَنْ طَبَقٍ (19)"));
        alenshqaqExes.add(new AlenshqaqEx("لتركبُنَّ -أيها الناس- أطوارا متعددة وأحوالا متباينة: من النطفة إلى العلقة إلى المضغة إلى نفخ الروح إلى الموت إلى البعث والنشور. ولا يجوز للمخلوق أن يقسم بغير الله، ولو فعل ذلك لأشرك."));
        alenshqaqExes.add(new AlenshqaqEx("فَمَا لَهُمْ لَا يُؤْمِنُونَ (20)"));
        alenshqaqExes.add(new AlenshqaqEx("فأيُّ شيء يمنعهم من الإيمان بالله واليوم الآخر بعد ما وُضِّحت لهم الآيات؟"));
        alenshqaqExes.add(new AlenshqaqEx("وَإِذَا قُرِئَ عَلَيْهِمُ الْقُرْآنُ لَا يَسْجُدُونَ (21)"));
        alenshqaqExes.add(new AlenshqaqEx("وما لهم إذا قرئ عليهم القرآن لا يسجدون لله، ولا يسلِّمُون بما جاء فيه؟"));
        alenshqaqExes.add(new AlenshqaqEx("بَلِ الَّذِينَ كَفَرُوا يُكَذِّبُونَ (22)"));
        alenshqaqExes.add(new AlenshqaqEx("إنما سجية الذين كفروا التكذيب ومخالفة الحق."));
        alenshqaqExes.add(new AlenshqaqEx("وَاللَّهُ أَعْلَمُ بِمَا يُوعُونَ (23)"));
        alenshqaqExes.add(new AlenshqaqEx("والله أعلم بما يكتمون في صدورهم من العناد مع علمهم بأن ما جاء به القرآن حق."));
        alenshqaqExes.add(new AlenshqaqEx("فَبَشِّرْهُمْ بِعَذَابٍ أَلِيمٍ (24)"));
        alenshqaqExes.add(new AlenshqaqEx("فبشرهم -أيها الرسول- بأن الله -عز وجل- قد أعدَّ لهم عذابًا موجعًا."));
        alenshqaqExes.add(new AlenshqaqEx("إِلَّا الَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ لَهُمْ أَجْرٌ غَيْرُ مَمْنُونٍ (25)"));
        alenshqaqExes.add(new AlenshqaqEx("لكن الذين آمنوا بالله ورسوله وأدَّوْا ما فرضه الله عليهم، لهم أجر في الآخرة غير مقطوع ولا منقوص."));


        quran_explanation_84_adapter = new quran_explanation_84_adapter(alenshqaqExes ,QuranExplanation_84Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_84);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_84Activity.this));
        recyclerView.setAdapter(quran_explanation_84_adapter);


    }

}