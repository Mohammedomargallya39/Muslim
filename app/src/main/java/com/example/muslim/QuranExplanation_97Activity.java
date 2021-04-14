package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_97Activity extends AppCompatActivity {

    ArrayList<AlqadrEx> alqadrExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_97_adapter quran_explanation_97_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_97);
        alqadrExes.add(new AlqadrEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));

        alqadrExes.add(new AlqadrEx("إِنَّا أَنْزَلْنَاهُ فِي لَيْلَةِ الْقَدْرِ (1)"));
        alqadrExes.add(new AlqadrEx("إنا أنزلنا القرآن في ليلة الشرف والفضل، وهي إحدى ليالي شهر رمضان."));
        alqadrExes.add(new AlqadrEx("وَمَا أَدْرَاكَ مَا لَيْلَةُ الْقَدْرِ (2)"));
        alqadrExes.add(new AlqadrEx("وما أدراك -أيها النبي- ما ليلة القدر والشرف؟"));
        alqadrExes.add(new AlqadrEx("لَيْلَةُ الْقَدْرِ خَيْرٌ مِنْ أَلْفِ شَهْرٍ (3)"));
        alqadrExes.add(new AlqadrEx("ليلة القدر ليلة مباركة، العمل الصالح فيها خير من عمل ألف شهر ليس فيها ليلة قدر."));
        alqadrExes.add(new AlqadrEx("تَنَزَّلُ الْمَلَائِكَةُ وَالرُّوحُ فِيهَا بِإِذْنِ رَبِّهِمْ مِنْ كُلِّ أَمْرٍ (4)"));
        alqadrExes.add(new AlqadrEx("يكثر نزول الملائكة وجبريل عليه السلام فيها، بإذن ربهم من كل أمر قضاه في تلك السنة."));
        alqadrExes.add(new AlqadrEx("سَلَامٌ هِيَ حَتَّى مَطْلَعِ الْفَجْرِ (5)"));
        alqadrExes.add(new AlqadrEx("هي أمن كلها، لا شرَّ فيها إلى مطلع الفجر."));


        quran_explanation_97_adapter = new quran_explanation_97_adapter(alqadrExes ,QuranExplanation_97Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_97);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_97Activity.this));
        recyclerView.setAdapter(quran_explanation_97_adapter);


    }

}