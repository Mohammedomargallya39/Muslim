package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_103Activity extends AppCompatActivity {

    ArrayList<AlaserEx> alaserExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_103_adapter quran_explanation_103_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_103);

        alaserExes.add(new AlaserEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alaserExes.add(new AlaserEx("وَالْعَصْرِ (1)"));
        alaserExes.add(new AlaserEx("أقسم الله بالدهر؛ لما فيه من عجائب قدرة الله الدالة على عظمته."));
        alaserExes.add(new AlaserEx("إِنَّ الْإِنْسَانَ لَفِي خُسْرٍ (2)"));
        alaserExes.add(new AlaserEx("على أن بني آدم لفي هلكة ونقصان. ولا يجوز للعبد أن يقسم إلا بالله، فإن القسم بغير الله شرك."));
        alaserExes.add(new AlaserEx("إِلَّا الَّذِينَ آمَنُوا وَعَمِلُوا الصَّالِحَاتِ وَتَوَاصَوْا بِالْحَقِّ وَتَوَاصَوْا بِالصَّبْرِ (3)"));
        alaserExes.add(new AlaserEx("إلا الذين آمنوا بالله وعملوا عملا صالحًا، وأوصى بعضهم بعضًا بالاستمساك بالحق، والعمل بطاعة الله، والصبر على ذلك."));


        quran_explanation_103_adapter = new quran_explanation_103_adapter(alaserExes ,QuranExplanation_103Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_103);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_103Activity.this));
        recyclerView.setAdapter(quran_explanation_103_adapter);


    }

}