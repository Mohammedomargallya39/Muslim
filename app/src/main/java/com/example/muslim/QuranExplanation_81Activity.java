package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_81Activity extends AppCompatActivity {

    ArrayList<AltakwerEx> altakwerExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_81_adapter quran_explanation_81_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_81);

        altakwerExes.add(new AltakwerEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        altakwerExes.add(new AltakwerEx("إِذَا الشَّمْسُ كُوِّرَتْ (1)"));
        altakwerExes.add(new AltakwerEx("إذا الشمس لُفَّت وذهب ضَوْءُها."));
        altakwerExes.add(new AltakwerEx("وَإِذَا النُّجُومُ انْكَدَرَتْ (2)"));
        altakwerExes.add(new AltakwerEx("وإذا النجوم تناثرت، فذهب نورها."));
        altakwerExes.add(new AltakwerEx("وَإِذَا الْجِبَالُ سُيِّرَتْ (3)"));
        altakwerExes.add(new AltakwerEx("وإذا الجبال سيِّرت عن وجه الأرض فصارت هباءً منبثًا."));
        altakwerExes.add(new AltakwerEx("وَإِذَا الْعِشَارُ عُطِّلَتْ (4)"));
        altakwerExes.add(new AltakwerEx("وإذا النوق الحوامل تُركت وأهملت."));
        altakwerExes.add(new AltakwerEx("وَإِذَا الْوُحُوشُ حُشِرَتْ (5)"));
        altakwerExes.add(new AltakwerEx("وإذا الحيوانات الوحشية جُمعت واختلطت؛ ليقتصَّ الله من بعضها لبعض."));
        altakwerExes.add(new AltakwerEx("وَإِذَا الْبِحَارُ سُجِّرَتْ (6)"));
        altakwerExes.add(new AltakwerEx("وإذا البحار أوقدت، فصارت على عِظَمها نارًا تتوقد."));
        altakwerExes.add(new AltakwerEx("وَإِذَا النُّفُوسُ زُوِّجَتْ (7)"));
        altakwerExes.add(new AltakwerEx("وإذا النفوس قُرنت بأمثالها ونظائرها."));
        altakwerExes.add(new AltakwerEx("وَإِذَا الْمَوْءُودَةُ سُئِلَتْ (8)"));
        altakwerExes.add(new AltakwerEx("وإذا الطفلة المدفونة حية سُئلت يوم القيامة سؤالَ تطييب لها وتبكيت لوائدها:"));
        altakwerExes.add(new AltakwerEx("بِأَيِّ ذَنْبٍ قُتِلَتْ (9)"));
        altakwerExes.add(new AltakwerEx("بأيِّ ذنب كان دفنها؟"));
        altakwerExes.add(new AltakwerEx("وَإِذَا الصُّحُفُ نُشِرَتْ (10)"));
        altakwerExes.add(new AltakwerEx("وإذا صحف الأعمال عُرضت."));
        altakwerExes.add(new AltakwerEx("وَإِذَا السَّمَاءُ كُشِطَتْ (11)"));
        altakwerExes.add(new AltakwerEx("وإذا السماء قُلعت وأزيلت من مكانها."));
        altakwerExes.add(new AltakwerEx("وَإِذَا الْجَحِيمُ سُعِّرَتْ (12)"));
        altakwerExes.add(new AltakwerEx("وإذا النار أوقدت فأضرِمت."));
        altakwerExes.add(new AltakwerEx("وَإِذَا الْجَنَّةُ أُزْلِفَتْ (13)"));
        altakwerExes.add(new AltakwerEx("وإذا الجنة دار النعيم قُرِّبت من أهلها المتقين."));
        altakwerExes.add(new AltakwerEx("عَلِمَتْ نَفْسٌ مَا أَحْضَرَتْ (14)"));
        altakwerExes.add(new AltakwerEx("إذا وقع ذلك، تيقنتْ ووجدتْ كلُّ نفس ما قدَّمت من خير أو شر."));
        altakwerExes.add(new AltakwerEx("فَلَا أُقْسِمُ بِالْخُنَّسِ (15)"));
        altakwerExes.add(new AltakwerEx("أقسم الله تعالى بالنجوم المختفية أنوارها نهارًا."));
        altakwerExes.add(new AltakwerEx("الْجَوَارِ الْكُنَّسِ (16)"));
        altakwerExes.add(new AltakwerEx("الجارية والمستترة في أبراجها."));
        altakwerExes.add(new AltakwerEx("وَاللَّيْلِ إِذَا عَسْعَسَ (17)"));
        altakwerExes.add(new AltakwerEx("والليل إذا أقبل بظلامه."));
        altakwerExes.add(new AltakwerEx("وَالصُّبْحِ إِذَا تَنَفَّسَ (18)"));
        altakwerExes.add(new AltakwerEx("والصبح إذا ظهر ضياؤه."));
        altakwerExes.add(new AltakwerEx("إِنَّهُ لَقَوْلُ رَسُولٍ كَرِيمٍ (19)"));
        altakwerExes.add(new AltakwerEx("إن القرآن لَتبليغ رسول كريم -هو جبريل عليه السلام-."));
        altakwerExes.add(new AltakwerEx("ذِي قُوَّةٍ عِنْدَ ذِي الْعَرْشِ مَكِينٍ (20)"));
        altakwerExes.add(new AltakwerEx("ذِي قوة في تنفيذ ما يؤمر به، صاحبِ مكانة رفيعة عند الله."));
        altakwerExes.add(new AltakwerEx("مُطَاعٍ ثَمَّ أَمِينٍ (21)"));
        altakwerExes.add(new AltakwerEx("تطيعه الملائكة، مؤتمن على الوحي الذي ينزل به."));
        altakwerExes.add(new AltakwerEx("وَمَا صَاحِبُكُمْ بِمَجْنُونٍ (22)"));
        altakwerExes.add(new AltakwerEx("وما محمد الذي تعرفونه بمجنون."));
        altakwerExes.add(new AltakwerEx("وَلَقَدْ رَآهُ بِالْأُفُقِ الْمُبِينِ (23)"));
        altakwerExes.add(new AltakwerEx("ولقد رأى محمد صلى الله عليه وسلم جبريل الذي يأتيه بالرسالة على صورته الحقيقية التي خلقه الله عليها في الأفق العظيم من ناحية المشرق بـ «مكة» ، وهي الرؤية الأولى الواقعة بـ «غار حراء» ."));
        altakwerExes.add(new AltakwerEx("وَمَا هُوَ عَلَى الْغَيْبِ بِضَنِينٍ (24)"));
        altakwerExes.add(new AltakwerEx("وما محمد صلى الله عليه وسلم ببخيل في تبليغ الوحي."));
        altakwerExes.add(new AltakwerEx("وَمَا هُوَ بِقَوْلِ شَيْطَانٍ رَجِيمٍ (25)"));
        altakwerExes.add(new AltakwerEx("وما هذا القرآن بقول شيطان رجيم، مطرود من رحمة الله، ولكنه كلام الله ووحيه."));
        altakwerExes.add(new AltakwerEx("فَأَيْنَ تَذْهَبُونَ (26)"));
        altakwerExes.add(new AltakwerEx("فأين تذهب بكم عقولكم في التكذيب بالقرآن بعد هذه الحجج القاطعة؟"));
        altakwerExes.add(new AltakwerEx("إِنْ هُوَ إِلَّا ذِكْرٌ لِلْعَالَمِينَ (27)"));
        altakwerExes.add(new AltakwerEx("ما هو إلا موعظة من الله لجميع الناس"));
        altakwerExes.add(new AltakwerEx("لِمَنْ شَاءَ مِنْكُمْ أَنْ يَسْتَقِيمَ (28)"));
        altakwerExes.add(new AltakwerEx("لمن شاء منكم أن يستقيم على الحق والإيمان."));
        altakwerExes.add(new AltakwerEx("وَمَا تَشَاءُونَ إِلَّا أَنْ يَشَاءَ اللَّهُ رَبُّ الْعَالَمِينَ (29)"));
        altakwerExes.add(new AltakwerEx("وما تشاؤون الاستقامة، ولا تقدرون على ذلك، إلا بمشيئة الله رب الخلائق أجمعين."));

        quran_explanation_81_adapter = new quran_explanation_81_adapter(altakwerExes ,QuranExplanation_81Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_81);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_81Activity.this));
        recyclerView.setAdapter(quran_explanation_81_adapter);


    }

}