package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_93Activity extends AppCompatActivity {

    ArrayList<AldohaEx> aldohaExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_93_adapter quran_explanation_93_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_93);



        aldohaExes.add(new AldohaEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        aldohaExes.add(new AldohaEx("وَالضُّحَى (1)"));
        aldohaExes.add(new AldohaEx("أقسم الله بوقت الضحى، والمراد به النهار كله."));
        aldohaExes.add(new AldohaEx("وَاللَّيْلِ إِذَا سَجَى (2)"));
        aldohaExes.add(new AldohaEx("وبالليل إذا سكن بالخلق واشتد ظلامه. ويقسم الله بما يشاء من مخلوقاته، أما المخلوق فلا يجوز له أن يقسم بغير خالقه، فإن القسم بغير الله شرك."));
        aldohaExes.add(new AldohaEx("مَا وَدَّعَكَ رَبُّكَ وَمَا قَلَى (3)"));
        aldohaExes.add(new AldohaEx("ما تركك -أيها النبي- ربك، وما أبغضك بإبطاء الوحي عنك."));
        aldohaExes.add(new AldohaEx("وَلَلْآخِرَةُ خَيْرٌ لَكَ مِنَ الْأُولَى (4)"));
        aldohaExes.add(new AldohaEx("ولَلدَّار الآخرة خير لك من دار الدنيا."));
        aldohaExes.add(new AldohaEx("وَلَسَوْفَ يُعْطِيكَ رَبُّكَ فَتَرْضَى (5)"));
        aldohaExes.add(new AldohaEx("ولسوف يعطيك ربك -أيها النبي- مِن أنواع الإنعام في الآخرة، فترضى بذلك."));
        aldohaExes.add(new AldohaEx("أَلَمْ يَجِدْكَ يَتِيمًا فَآوَى (6)"));
        aldohaExes.add(new AldohaEx("ألم يَجِدْك من قبلُ يتيمًا مات أبوك وأنت حمل في بطن أمك، فآواك ورعاك؟"));
        aldohaExes.add(new AldohaEx("وَوَجَدَكَ ضَالًّا فَهَدَى (7)"));
        aldohaExes.add(new AldohaEx("ووجدك لا تدري ما الكتاب ولا الإيمان، فعلَّمك ما لم تكن تعلم، ووفقك لأحسن الأعمال؟"));
        aldohaExes.add(new AldohaEx("وَوَجَدَكَ عَائِلًا فَأَغْنَى (8)"));
        aldohaExes.add(new AldohaEx("ووجدك فقيرًا، فساق إليك رزقك، وأغنى نفسك بالقناعة والصبر؟"));
        aldohaExes.add(new AldohaEx("فَأَمَّا الْيَتِيمَ فَلَا تَقْهَرْ (9)"));
        aldohaExes.add(new AldohaEx("فأما اليتيم فلا تُسِئْ معاملته."));
        aldohaExes.add(new AldohaEx("وَأَمَّا السَّائِلَ فَلَا تَنْهَرْ (10)"));
        aldohaExes.add(new AldohaEx("وأما السائل فلا تزجره، بل أطعمه، واقض حاجته."));
        aldohaExes.add(new AldohaEx("وَأَمَّا بِنِعْمَةِ رَبِّكَ فَحَدِّثْ (11)"));
        aldohaExes.add(new AldohaEx("وأما بنعمة ربك التي أسبغها عليك فتحدث بها."));



        quran_explanation_93_adapter = new quran_explanation_93_adapter(aldohaExes ,QuranExplanation_93Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_93);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_93Activity.this));
        recyclerView.setAdapter(quran_explanation_93_adapter);


    }

}