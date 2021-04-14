package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_112Activity extends AppCompatActivity {

    ArrayList<AlekhlasEx> alekhlasExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_112_adapter quran_explanation_112_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_112);

        alekhlasExes.add(new AlekhlasEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        alekhlasExes.add(new AlekhlasEx("قُلْ هُوَ اللَّهُ أَحَدٌ (1)"));
        alekhlasExes.add(new AlekhlasEx("قل -أيها الرسول-: هو الله المتفرد بالألوهية والربوبية والأسماء والصفات، لا يشاركه أحد فيها."));
        alekhlasExes.add(new AlekhlasEx("اللَّهُ الصَّمَدُ (2)"));
        alekhlasExes.add(new AlekhlasEx("الله الذي كَمُل في صفات الشَّرَف والمجد والعظمة، الذي يقصده الخلائق في قضاء الحوائج والرغائب."));
        alekhlasExes.add(new AlekhlasEx("لَمْ يَلِدْ وَلَمْ يُولَدْ (3)"));
        alekhlasExes.add(new AlekhlasEx("ليس له ولد ولا والد ولا صاحبة."));
        alekhlasExes.add(new AlekhlasEx("وَلَمْ يَكُنْ لَهُ كُفُوًا أَحَدٌ (4)"));
        alekhlasExes.add(new AlekhlasEx("ولم يكن له مماثلا ولا مشابهًا أحد من خلقه، لا في أسمائه ولا في صفاته، ولا في أفعاله، تبارك وتعالى وتقدَّس."));


        quran_explanation_112_adapter = new quran_explanation_112_adapter(alekhlasExes ,QuranExplanation_112Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_112);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_112Activity.this));
        recyclerView.setAdapter(quran_explanation_112_adapter);


    }

}