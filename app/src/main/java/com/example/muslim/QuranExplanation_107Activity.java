package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_107Activity extends AppCompatActivity {

    ArrayList<AlmaaonEx> almaaonExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_107_adapter quran_explanation_107_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_107);

        almaaonExes.add(new AlmaaonEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيم"));
        almaaonExes.add(new AlmaaonEx("أَرَأَيْتَ الَّذِي يُكَذِّبُ بِالدِّينِ (1)"));
        almaaonExes.add(new AlmaaonEx("أرأيت حال ذلك الذي يكذِّب بالبعث والجزاء؟"));
        almaaonExes.add(new AlmaaonEx("فَذَلِكَ الَّذِي يَدُعُّ الْيَتِيمَ (2)"));
        almaaonExes.add(new AlmaaonEx("فذلك الذي يدفع اليتيم الذي مات أبوه وهو صغير بعنف وشدة عن حقه؛ لقساوة قلبه."));
        almaaonExes.add(new AlmaaonEx("وَلَا يَحُضُّ عَلَى طَعَامِ الْمِسْكِينِ (3)"));
        almaaonExes.add(new AlmaaonEx("ولا يحضُّ غيره على إطعام المحتاج الذي لا يملك ما يكفيه ويسد حاجته، فكيف له أن يطعمه بنفسه؟"));
        almaaonExes.add(new AlmaaonEx("فَوَيْلٌ لِلْمُصَلِّينَ (4)"));
        almaaonExes.add(new AlmaaonEx("فعذاب شديد للمصلين الذين هم عن صلاتهم لاهون."));
        almaaonExes.add(new AlmaaonEx("الَّذِينَ هُمْ عَنْ صَلَاتِهِمْ سَاهُونَ (5)"));
        almaaonExes.add(new AlmaaonEx("الذين هم عن صلاتهم لاهون، لا يقيمونها على وجهها، ولا يؤدونها في وقتها."));
        almaaonExes.add(new AlmaaonEx("الَّذِينَ هُمْ يُرَاءُونَ (6)"));
        almaaonExes.add(new AlmaaonEx("الذين هم يتظاهرون بأعمال الخير مراءاة للناس."));
        almaaonExes.add(new AlmaaonEx("وَيَمْنَعُونَ الْمَاعُونَ (7)"));
        almaaonExes.add(new AlmaaonEx("ويمنعون إعارة ما لا تضر إعارته من الآنية وغيرها، فلا هم أحسنوا عبادة ربهم، ولا هم أحسنوا إلى خلقه."));


        quran_explanation_107_adapter = new quran_explanation_107_adapter(almaaonExes ,QuranExplanation_107Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_107);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_107Activity.this));
        recyclerView.setAdapter(quran_explanation_107_adapter);


    }

}