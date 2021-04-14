package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_91Activity extends AppCompatActivity {

    ArrayList<AlshamsEx> alshamsExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_91_adapter quran_explanation_91_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_91);
        alshamsExes.add(new AlshamsEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));

        alshamsExes.add(new AlshamsEx("وَالشَّمْسِ وَضُحَاهَا (1)"));
        alshamsExes.add(new AlshamsEx("أقسم الله بالشمس ونهارها وإشراقها ضحى."));
        alshamsExes.add(new AlshamsEx("وَالْقَمَرِ إِذَا تَلَاهَا (2)"));
        alshamsExes.add(new AlshamsEx("وبالقمر إذا تبعها في الطلوع والأفول."));
        alshamsExes.add(new AlshamsEx("وَالنَّهَارِ إِذَا جَلَّاهَا (3)"));
        alshamsExes.add(new AlshamsEx("وبالنهار إذا جلَّى الظلمة وكشفها."));
        alshamsExes.add(new AlshamsEx("وَاللَّيْلِ إِذَا يَغْشَاهَا (4)"));
        alshamsExes.add(new AlshamsEx("وبالليل عندما يغطي الأرض فيكون ما عليها مظلمًا."));
        alshamsExes.add(new AlshamsEx("وَالسَّمَاءِ وَمَا بَنَاهَا (5)"));
        alshamsExes.add(new AlshamsEx("وبالسماء وبنائها المحكم."));
        alshamsExes.add(new AlshamsEx("وَالْأَرْضِ وَمَا طَحَاهَا (6)"));
        alshamsExes.add(new AlshamsEx("وبالأرض وبَسْطها."));
        alshamsExes.add(new AlshamsEx("وَنَفْسٍ وَمَا سَوَّاهَا (7)"));
        alshamsExes.add(new AlshamsEx("وبكل نفس وإكمال الله خلقها لأداء مهمتها."));
        alshamsExes.add(new AlshamsEx("فَأَلْهَمَهَا فُجُورَهَا وَتَقْوَاهَا (8)"));
        alshamsExes.add(new AlshamsEx("فبيَّن لها طريق الشر وطريق الخير."));
        alshamsExes.add(new AlshamsEx("قَدْ أَفْلَحَ مَنْ زَكَّاهَا (9)"));
        alshamsExes.add(new AlshamsEx("قد فاز مَن طهَّرها ونمَّاها بالخير."));
        alshamsExes.add(new AlshamsEx("وَقَدْ خَابَ مَنْ دَسَّاهَا (10)"));
        alshamsExes.add(new AlshamsEx("وقد خسر مَن أخفى نفسه في المعاصي."));
        alshamsExes.add(new AlshamsEx("كَذَّبَتْ ثَمُودُ بِطَغْوَاهَا (11)"));
        alshamsExes.add(new AlshamsEx("كذَّبت ثمود نبيها ببلوغها الغاية في العصيان."));
        alshamsExes.add(new AlshamsEx("إِذِ انْبَعَثَ أَشْقَاهَا (12)"));
        alshamsExes.add(new AlshamsEx("إذ نهض أكثر القبيلة شقاوة لعقر الناقة."));
        alshamsExes.add(new AlshamsEx("فَقَالَ لَهُمْ رَسُولُ اللَّهِ نَاقَةَ اللَّهِ وَسُقْيَاهَا (13)"));
        alshamsExes.add(new AlshamsEx("فقال لهم رسول الله صالح عليه السلام: احذروا أن تمسوا الناقة بسوء؛ فإنها آية أرسلها الله إليكم، تدل على صدق نبيكم، واحذروا أن تعتدوا على سقيها، فإن لها شِرْب يوم ولكم شِرْب يوم معلوم."));
        alshamsExes.add(new AlshamsEx("فَكَذَّبُوهُ فَعَقَرُوهَا فَدَمْدَمَ عَلَيْهِمْ رَبُّهُمْ بِذَنْبِهِمْ فَسَوَّاهَا (14)"));
        alshamsExes.add(new AlshamsEx("فشق عليهم ذلك، فكذبوه فيما توعَّدهم به فنحروها، فأطبق عليهم ربهم العقوبة بجرمهم، فجعلها عليهم على السواء فلم يُفْلِت منهم أحد."));
        alshamsExes.add(new AlshamsEx("وَلَا يَخَافُ عُقْبَاهَا (15)"));
        alshamsExes.add(new AlshamsEx("ولا يخاف -جلت قدرته- تبعة ما أنزله بهم من شديد العقاب."));


        quran_explanation_91_adapter = new quran_explanation_91_adapter(alshamsExes ,QuranExplanation_91Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_91);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_91Activity.this));
        recyclerView.setAdapter(quran_explanation_91_adapter);


    }

}