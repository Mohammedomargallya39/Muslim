package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_98Activity extends AppCompatActivity {

    ArrayList<AlbaienahEx> albaienahExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_98_adapter quran_explanation_98_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_98);



        albaienahExes.add(new AlbaienahEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        albaienahExes.add(new AlbaienahEx("لَمْ يَكُنِ الَّذِينَ كَفَرُوا مِنْ أَهْلِ الْكِتَابِ وَالْمُشْرِكِينَ مُنْفَكِّينَ حَتَّى تَأْتِيَهُمُ الْبَيِّنَةُ (1)"));
        albaienahExes.add(new AlbaienahEx("لم يكن الذين كفروا من اليهود والنصارى والمشركين تاركين كفرهم حتى تأتيهم العلامة التي وُعِدوا بها في الكتب السابقة."));
        albaienahExes.add(new AlbaienahEx("رَسُولٌ مِنَ اللَّهِ يَتْلُو صُحُفًا مُطَهَّرَةً (2)"));
        albaienahExes.add(new AlbaienahEx("وهي رسول الله محمد صلى الله عليه وسلم، يتلو قرآنًا في صحف مطهرة."));
        albaienahExes.add(new AlbaienahEx("فِيهَا كُتُبٌ قَيِّمَةٌ (3)"));
        albaienahExes.add(new AlbaienahEx("في تلك الصحف أخبار صادقة وأوامر عادلة، تهدي إلى الحق وإلى صراط مستقيم."));
        albaienahExes.add(new AlbaienahEx("وَمَا تَفَرَّقَ الَّذِينَ أُوتُوا الْكِتَابَ إِلَّا مِنْ بَعْدِ مَا جَاءَتْهُمُ الْبَيِّنَةُ (4)"));
        albaienahExes.add(new AlbaienahEx("وما اختلف الذين أوتوا الكتاب من اليهود والنصارى في كون محمد صلى الله عليه وسلم رسولا حقًا؛ لما يجدونه من نعته في كتابهم، إلا مِن بعد ما تبينوا أنه النبي الذي وُعِدوا به في التوراة والإنجيل، فكانوا مجتمعين على صحة نبوته، فلما بُعِث تفرقوا: فمنهم من آمن به، ومنهم من جحد نبوته بغياً وحسداً."));
        albaienahExes.add(new AlbaienahEx("وَمَا أُمِرُوا إِلَّا لِيَعْبُدُوا اللَّهَ مُخْلِصِينَ لَهُ الدِّينَ حُنَفَاءَ وَيُقِيمُوا الصَّلَاةَ وَيُؤْتُوا الزَّكَاةَ وَذَلِكَ دِينُ الْقَيِّمَةِ (5)"));
        albaienahExes.add(new AlbaienahEx("وما أمروا في سائر الشرائع إلا ليعبدوا الله وحده قاصدين بعبادتهم وجهه، مائلين عن الشرك إلى الإيمان، ويقيموا الصلاة، ويُؤَدُّوا الزكاة، وذلك هو دين الاستقامة، وهو الإسلام."));
        albaienahExes.add(new AlbaienahEx("إِنَّ الَّذِينَ كَفَرُوا مِنْ أَهْلِ الْكِتَابِ وَالْمُشْرِكِينَ فِي نَارِ جَهَنَّمَ خَالِدِينَ فِيهَا أُولَئِكَ هُمْ شَرُّ الْبَرِيَّةِ (6)"));
        albaienahExes.add(new AlbaienahEx("إن الذين كفروا من اليهود والنصارى والمشركين عقابهم نار جهنم خالدين فيها، أولئك هم أشد الخليقة شرا."));
        albaienahExes.add(new AlbaienahEx("إِنَّ الَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ أُولَئِكَ هُمْ خَيْرُ الْبَرِيَّةِ (7)"));
        albaienahExes.add(new AlbaienahEx("إن الذين صَدَّقوا الله واتبعوا رسوله وعملوا الصالحات، أولئك هم خير الخلق."));
        albaienahExes.add(new AlbaienahEx("جَزَاؤُهُمْ عِنْدَ رَبِّهِمْ جَنَّاتُ عَدْنٍ تَجْرِي مِنْ تَحْتِهَا الْأَنْهَارُ خَالِدِينَ فِيهَا أَبَدًا رَضِيَ اللَّهُ عَنْهُمْ وَرَضُوا عَنْهُ ذَلِكَ لِمَنْ خَشِيَ رَبَّهُ (8)"));
        albaienahExes.add(new AlbaienahEx("جزاؤهم عند ربهم يوم القيامة جنات إقامة واستقرار في منتهى الحسن، تجري من تحت قصورها الأنهار، خالدين فيها أبدًا، رضي الله عنهم فقبل أعمالهم الصالحة، ورضوا عنه بما أعدَّ لهم من أنواع الكرامات، ذلك الجزاء الحسن لمن خاف الله واجتنب معاصيه."));


        quran_explanation_98_adapter = new quran_explanation_98_adapter(albaienahExes ,QuranExplanation_98Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_98);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_98Activity.this));
        recyclerView.setAdapter(quran_explanation_98_adapter);


    }

}