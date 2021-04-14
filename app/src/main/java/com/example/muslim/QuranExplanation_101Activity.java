package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_101Activity extends AppCompatActivity {

    ArrayList<AlqareaEx> alqareaExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_101_adapter quran_explanation_101_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_101);

        alqareaExes.add(new AlqareaEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيم"));
        alqareaExes.add(new AlqareaEx("الْقَارِعَةُ (1)"));
        alqareaExes.add(new AlqareaEx("الساعة التي تقرع قلوب الناس بأهوالها."));
        alqareaExes.add(new AlqareaEx("مَا الْقَارِعَةُ (2)"));
        alqareaExes.add(new AlqareaEx("أيُّ شيء هذه القارعة؟"));
        alqareaExes.add(new AlqareaEx("وَمَا أَدْرَاكَ مَا الْقَارِعَةُ (3)"));
        alqareaExes.add(new AlqareaEx("وأيُّ شيء أعلمك بها؟"));
        alqareaExes.add(new AlqareaEx("يَوْمَ يَكُونُ النَّاسُ كَالْفَرَاشِ الْمَبْثُوثِ (4)"));
        alqareaExes.add(new AlqareaEx("في ذلك اليوم يكون الناس في كثرتهم وتفرقهم وحركتهم كالفراش المنتشر، وهو الذي يتساقط في النار."));
        alqareaExes.add(new AlqareaEx("وَتَكُونُ الْجِبَالُ كَالْعِهْنِ الْمَنْفُوشِ (5)"));
        alqareaExes.add(new AlqareaEx("وتكون الجبال كالصوف متعدد الألوان الذي يُنْفَش باليد، فيصير هباء ويزول."));
        alqareaExes.add(new AlqareaEx("فَأَمَّا مَنْ ثَقُلَتْ مَوَازِينُهُ (6)"));
        alqareaExes.add(new AlqareaEx("فأما من رجحت موازين حسناته."));
        alqareaExes.add(new AlqareaEx("فَهُوَ فِي عِيشَةٍ رَاضِيَةٍ (7)"));
        alqareaExes.add(new AlqareaEx("فهو في حياة مرضية في الجنة."));
        alqareaExes.add(new AlqareaEx("وَأَمَّا مَنْ خَفَّتْ مَوَازِينُهُ (8)"));
        alqareaExes.add(new AlqareaEx("وأما من خفت موازين حسناته ورجحت موازين سيئاته."));
        alqareaExes.add(new AlqareaEx("فَأُمُّهُ هَاوِيَةٌ (9)"));
        alqareaExes.add(new AlqareaEx("فمأواه جهنم"));
        alqareaExes.add(new AlqareaEx("وَمَا أَدْرَاكَ مَا هِيَهْ (10)"));
        alqareaExes.add(new AlqareaEx("وما أدراك -أيها الرسول- ما هذه الهاوية؟"));
        alqareaExes.add(new AlqareaEx("نَارٌ حَامِيَةٌ (11)"));
        alqareaExes.add(new AlqareaEx("إنها نار قد حَمِيت من الوقود عليها."));


        quran_explanation_101_adapter = new quran_explanation_101_adapter(alqareaExes ,QuranExplanation_101Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_101);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_101Activity.this));
        recyclerView.setAdapter(quran_explanation_101_adapter);


    }

}