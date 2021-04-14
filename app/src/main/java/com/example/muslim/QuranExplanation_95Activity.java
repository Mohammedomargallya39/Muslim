package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_95Activity extends AppCompatActivity {

    ArrayList<AltenEx> altenExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_95_adapter quran_explanation_95_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_95);


        altenExes.add(new AltenEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        altenExes.add(new AltenEx("وَالتِّينِ وَالزَّيْتُونِ (1)"));
        altenExes.add(new AltenEx("أَقْسم الله بالتين والزيتون، وهما من الثمار المشهورة."));
        altenExes.add(new AltenEx("وَطُورِ سِينِينَ (2)"));
        altenExes.add(new AltenEx("وأقسم بجبل «طور سيناء» الذي كلَّم الله عليه موسى تكليمًا."));
        altenExes.add(new AltenEx("وَهَذَا الْبَلَدِ الْأَمِينِ (3)"));
        altenExes.add(new AltenEx("وأقسم بهذا البلد الأمين من كل خوف وهي «مكة» مهبط الوحي."));
        altenExes.add(new AltenEx("لَقَدْ خَلَقْنَا الْإِنْسَانَ فِي أَحْسَنِ تَقْوِيمٍ (4)"));
        altenExes.add(new AltenEx("لقد خلقنا الإنسان في أحسن صورة."));
        altenExes.add(new AltenEx("ثُمَّ رَدَدْنَاهُ أَسْفَلَ سَافِلِينَ (5)"));
        altenExes.add(new AltenEx("ثم رددناه إلى النار إن لم يطع الله، ويتبع الرسل."));
        altenExes.add(new AltenEx("إِلَّا الَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ فَلَهُمْ أَجْرٌ غَيْرُ مَمْنُونٍ (6)"));
        altenExes.add(new AltenEx("لكن الذين آمنوا وعملوا الأعمال الصالحة لهم أجر عظيم غير مقطوع ولا منقوص."));
        altenExes.add(new AltenEx("فَمَا يُكَذِّبُكَ بَعْدُ بِالدِّينِ (7)"));
        altenExes.add(new AltenEx("أيُّ شيء يحملك -أيها الإنسان- على أن تكذِّب بالبعث والجزاء مع وضوح الأدلة على قدرة الله تعالى على ذلك؟"));
        altenExes.add(new AltenEx("أَلَيْسَ اللَّهُ بِأَحْكَمِ الْحَاكِمِينَ (8)"));
        altenExes.add(new AltenEx("أليس الله الذي جعل هذا اليوم للفصل بين الناس بأحكم الحاكمين في كل ما خلق؟ بلى. فهل يُترك الخلق سدى لا يؤمرون ولا يُنهون، ولا يثابون ولا يعاقبون؟ لا يصحُّ ذلك ولا يكون."));




        quran_explanation_95_adapter = new quran_explanation_95_adapter(altenExes ,QuranExplanation_95Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_95);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_95Activity.this));
        recyclerView.setAdapter(quran_explanation_95_adapter);


    }

}