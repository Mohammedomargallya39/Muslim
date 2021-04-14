package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_94Activity extends AppCompatActivity {

    ArrayList<AlsharhEx> alsharhExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_94_adapter quran_explanation_94_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_94);


        alsharhExes.add(new AlsharhEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alsharhExes.add(new AlsharhEx("أَلَمْ نَشْرَحْ لَكَ صَدْرَكَ (1)"));
        alsharhExes.add(new AlsharhEx("ألم نوسع -أيها النبي- لك صدرك لشرائع الدين، والدعوة إلى الله، والاتصاف بمكارم الأخلاق."));
        alsharhExes.add(new AlsharhEx("وَوَضَعْنَا عَنْكَ وِزْرَكَ (2)"));
        alsharhExes.add(new AlsharhEx("وحططنا عنك بذلك حِمْلك."));
        alsharhExes.add(new AlsharhEx("الَّذِي أَنْقَضَ ظَهْرَكَ (3)"));
        alsharhExes.add(new AlsharhEx("الذي أثقل ظهرك."));
        alsharhExes.add(new AlsharhEx("وَرَفَعْنَا لَكَ ذِكْرَكَ (4)"));
        alsharhExes.add(new AlsharhEx("وجعلناك -بما أنعمنا عليك من المكارم- في منزلة رفيعة عالية؟"));
        alsharhExes.add(new AlsharhEx("فَإِنَّ مَعَ الْعُسْرِ يُسْرًا (5)"));
        alsharhExes.add(new AlsharhEx("فلا يَثْنِكَ أذى أعدائك عن نشر الرسالة؛ فإن مع الضيق فرجًا."));
        alsharhExes.add(new AlsharhEx("إِنَّ مَعَ الْعُسْرِ يُسْرًا (6)"));
        alsharhExes.add(new AlsharhEx("إن مع الضيق فرجًا."));
        alsharhExes.add(new AlsharhEx("فَإِذَا فَرَغْتَ فَانْصَبْ (7)"));
        alsharhExes.add(new AlsharhEx("فإذا فرغت من أمور الدنيا وأشغالها فَجِدَّ في العبادة."));
        alsharhExes.add(new AlsharhEx("وَإِلَى رَبِّكَ فَارْغَبْ (8)"));
        alsharhExes.add(new AlsharhEx("وإلى ربك وحده فارغب فيما عنده."));



        quran_explanation_94_adapter = new quran_explanation_94_adapter(alsharhExes ,QuranExplanation_94Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_94);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_94Activity.this));
        recyclerView.setAdapter(quran_explanation_94_adapter);


    }

}