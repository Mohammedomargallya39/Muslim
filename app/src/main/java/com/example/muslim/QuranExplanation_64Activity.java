package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class QuranExplanation_64Activity extends AppCompatActivity {

    ArrayList<AltghabonEx> altghabonExes = new ArrayList<>();
    RecyclerView recyclerView;
    quran_explanation_64_adapter quran_explanation_64_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation_64);

        altghabonExes.add(new AltghabonEx("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ"));
        altghabonExes.add(new AltghabonEx("يُسَبِّحُ لِلَّهِ مَا فِي السَّمَاوَاتِ وَمَا فِي الْأَرْضِ لَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيرٌ (1)"));
        altghabonExes.add(new AltghabonEx("ينزِّه الله عما لا يليق به كل ما في السموات وما في الأرض، له سبحانه التصرف المطلق في كل شيء، وله الثناء الحسن الجميل، وهو على كل شيء قدير."));
        altghabonExes.add(new AltghabonEx("هُوَ الَّذِي خَلَقَكُمْ فَمِنْكُمْ كَافِرٌ وَمِنْكُمْ مُؤْمِنٌ وَاللَّهُ بِمَا تَعْمَلُونَ بَصِيرٌ (2)"));
        altghabonExes.add(new AltghabonEx("الله هو الذي أوجدكم من العدم، فبعضكم جاحد لألوهيته، وبعضكم مصدِّق به عامل بشرعه، وهو سبحانه بصير بأعمالكم لا يخفى عليه شيء منها، وسيجازيكم بها."));
        altghabonExes.add(new AltghabonEx("خَلَقَ السَّمَاوَاتِ وَالْأَرْضَ بِالْحَقِّ وَصَوَّرَكُمْ فَأَحْسَنَ صُوَرَكُمْ وَإِلَيْهِ الْمَصِيرُ (3)"));
        altghabonExes.add(new AltghabonEx("خلق الله السموات والأرض بالحكمة البالغة، وخلقكم في أحسن صورة، إليه المرجع يوم القيامة، فيجازي كلا بعمله."));
        altghabonExes.add(new AltghabonEx("يَعْلَمُ مَا فِي السَّمَاوَاتِ وَالْأَرْضِ وَيَعْلَمُ مَا تُسِرُّونَ وَمَا تُعْلِنُونَ وَاللَّهُ عَلِيمٌ بِذَاتِ الصُّدُورِ (4)"));
        altghabonExes.add(new AltghabonEx("يعلم سبحانه وتعالى كل ما في السموات والأرض، ويعلم ما تخفونه -أيها الناس- فيما بينكم وما تظهرونه. والله عليم بما تضمره الصدور وما تخفيه النفوس."));
        altghabonExes.add(new AltghabonEx("أَلَمْ يَأْتِكُمْ نَبَأُ الَّذِينَ كَفَرُوا مِنْ قَبْلُ فَذَاقُوا وَبَالَ أَمْرِهِمْ وَلَهُمْ عَذَابٌ أَلِيمٌ (5)"));
        altghabonExes.add(new AltghabonEx("ألم يأتكم -أيها المشركون- خبر الذين كفروا من الأمم الماضية قبلكم، إذ حلَّ بهم سوء عاقبة كفرهم وسوء أفعالهم في الدنيا، ولهم في الآخرة عذاب أليم موجع؟"));
        altghabonExes.add(new AltghabonEx("ذَلِكَ بِأَنَّهُ كَانَتْ تَأْتِيهِمْ رُسُلُهُمْ بِالْبَيِّنَاتِ فَقَالُوا أَبَشَرٌ يَهْدُونَنَا فَكَفَرُوا وَتَوَلَّوْا وَاسْتَغْنَى اللَّهُ وَاللَّهُ غَنِيٌّ حَمِيدٌ (6)"));
        altghabonExes.add(new AltghabonEx("ذلك الذي أصابهم في الدنيا، وما يصيبهم في الآخرة؛ بسبب أنهم كانت تأتيهم رسل الله بالآيات البينات والمعجزات الواضحات، فقالوا منكرين: أبشر مثلنا يرشدوننا؟ فكفروا بالله وجحدوا رسالة رسله، وأعرضوا عن الحق فلم يقبلوه. واستغنى الله، والله غني، له الغنى التام المطلق، حميد في أقواله وأفعاله وصفاته لا يبالي بهم، ولا يضره ضلالهم شيئًا."));
        altghabonExes.add(new AltghabonEx("زَعَمَ الَّذِينَ كَفَرُوا أَنْ لَنْ يُبْعَثُوا قُلْ بَلَى وَرَبِّي لَتُبْعَثُنَّ ثُمَّ لَتُنَبَّؤُنَّ بِمَا عَمِلْتُمْ وَذَلِكَ عَلَى اللَّهِ يَسِيرٌ (7)"));
        altghabonExes.add(new AltghabonEx("ادَّعى الذين كفروا بالله باطلا أنهم لن يُخْرَجوا من قبورهم بعد الموت، قل لهم -أيها الرسول-: بلى وربي لتُخْرَجُنَّ من قبوركم أحياء، ثم لتُخْبَرُنَّ بالذي عملتم في الدنيا، وذلك على الله يسير هيِّن."));
        altghabonExes.add(new AltghabonEx("فَآمِنُوا بِاللَّهِ وَرَسُولِهِ وَالنُّورِ الَّذِي أَنْزَلْنَا وَاللَّهُ بِمَا تَعْمَلُونَ خَبِيرٌ (8)"));
        altghabonExes.add(new AltghabonEx("فآمنوا بالله ورسوله -أيها المشركون- واهتدوا بالقرآن الذي أنزله على رسوله، والله بما تفعلون خبير لا يخفى عليه شيء من أعمالكم وأقوالكم، وهو مجازيكم عليها يوم القيامة."));
        altghabonExes.add(new AltghabonEx("يَوْمَ يَجْمَعُكُمْ لِيَوْمِ الْجَمْعِ ذَلِكَ يَوْمُ التَّغَابُنِ وَمَنْ يُؤْمِنْ بِاللَّهِ وَيَعْمَلْ صَالِحًا يُكَفِّرْ عَنْهُ سَيِّئَاتِهِ وَيُدْخِلْهُ جَنَّاتٍ تَجْرِي مِنْ تَحْتِهَا الْأَنْهَارُ خَالِدِينَ فِيهَا أَبَدًا ذَلِكَ الْفَوْزُ الْعَظِيمُ (9)"));
        altghabonExes.add(new AltghabonEx("اذكروا يوم الحشر الذي يحشر الله فيه الأولين والآخرين، ذلك اليوم الذي يظهر فيه الغُبْن والتفاوت بين الخلق، فيغبن المؤمنون الكفار والفاسقين: فأهل الإيمان يدخلون الجنة برحمة الله، وأهل الكفر يدخلون النار بعدل الله. ومن يؤمن بالله ويعمل بطاعته، يمح عنه ذنوبه، ويدخله جنات تجري من تحت قصورها الأنهار، خالدين فيها أبدًا، ذلك الخلود في الجنات هو الفوز العظيم الذي لا فوز بعده."));
        altghabonExes.add(new AltghabonEx("وَالَّذِينَ كَفَرُوا وَكَذَّبُوا بِآيَاتِنَا أُولَئِكَ أَصْحَابُ النَّارِ خَالِدِينَ فِيهَا وَبِئْسَ الْمَصِيرُ (10)"));
        altghabonExes.add(new AltghabonEx("والذين جحدوا أن الله هو الإله الحق وكذَّبوا بدلائل ربوبيته وبراهين ألوهيته التي أرسل بها رسله، أولئك أهل النار ماكثين فيها أبدًا، وساء المرجع الذي صاروا إليه، وهو جهنم."));
        altghabonExes.add(new AltghabonEx("مَا أَصَابَ مِنْ مُصِيبَةٍ إِلَّا بِإِذْنِ اللَّهِ وَمَنْ يُؤْمِنْ بِاللَّهِ يَهْدِ قَلْبَهُ وَاللَّهُ بِكُلِّ شَيْءٍ عَلِيمٌ (11)"));
        altghabonExes.add(new AltghabonEx("ما أصاب أحدًا شيءٌ من مكروه يَحُلُّ به إلا بإذن الله وقضائه وقدره. ومَن يؤمن بالله يهد قلبه للتسليم بأمره والرضا بقضائه، ويهده لأحسن الأقوال والأفعال والأحوال؛ لأن أصل الهداية للقلب، والجوارح تبع. والله بكل شيء عليم، لا يخفى عليه شيء من ذلك."));
        altghabonExes.add(new AltghabonEx("وَأَطِيعُوا اللَّهَ وَأَطِيعُوا الرَّسُولَ فَإِنْ تَوَلَّيْتُمْ فَإِنَّمَا عَلَى رَسُولِنَا الْبَلَاغُ الْمُبِينُ (12)"));
        altghabonExes.add(new AltghabonEx("وأطيعوا الله -أيها الناس- وانقادوا إليه فيما أمر به ونهى عنه، وأطيعوا الرسول صلى الله عليه وسلم، فيما بلَّغكم به عن ربه، فإن أعرضتم عن طاعة الله ورسوله، فليس على رسولنا ضرر في إعراضكم، وإنما عليه أن يبلغكم ما أرسل به بلاغًا واضح البيان."));
        altghabonExes.add(new AltghabonEx("اللَّهُ لَا إِلَهَ إِلَّا هُوَ وَعَلَى اللَّهِ فَلْيَتَوَكَّلِ الْمُؤْمِنُونَ (13)"));
        altghabonExes.add(new AltghabonEx("الله وحده لا معبود بحق سواه، وعلى الله فليعتمد المؤمنون بوحدانيته في كل أمورهم."));
        altghabonExes.add(new AltghabonEx("يَاأَيُّهَا الَّذِينَ آمَنُوا إِنَّ مِنْ أَزْوَاجِكُمْ وَأَوْلَادِكُمْ عَدُوًّا لَكُمْ فَاحْذَرُوهُمْ وَإِنْ تَعْفُوا وَتَصْفَحُوا وَتَغْفِرُوا فَإِنَّ اللَّهَ غَفُورٌ رَحِيمٌ (14)"));
        altghabonExes.add(new AltghabonEx("يا أيها الذين آمنوا بالله ورسوله، إنَّ مِن أزواجكم وأولادكم أعداء لكم يصدونكم عن سبيل الله، ويثبطونكم عن طاعته، فكونوا منهم على حذر، ولا تطيعوهم، وإن تتجاوزوا عن سيئاتهم وتعرضوا عنها، وتستروها عليهم، فإن الله غفور رحيم، يغفر لكم ذنوبكم؛ لأنه سبحانه عظيم الغفران واسع الرحمة."));
        altghabonExes.add(new AltghabonEx("إِنَّمَا أَمْوَالُكُمْ وَأَوْلَادُكُمْ فِتْنَةٌ وَاللَّهُ عِنْدَهُ أَجْرٌ عَظِيمٌ (15)"));
        altghabonExes.add(new AltghabonEx("ما أموالكم ولا أولادكم إلا بلاء واختبار لكم. والله عنده ثواب عظيم لمن آثر طاعته على طاعة غيره، وأدَّى حق الله في ماله."));
        altghabonExes.add(new AltghabonEx("فَاتَّقُوا اللَّهَ مَا اسْتَطَعْتُمْ وَاسْمَعُوا وَأَطِيعُوا وَأَنْفِقُوا خَيْرًا لِأَنْفُسِكُمْ وَمَنْ يُوقَ شُحَّ نَفْسِهِ فَأُولَئِكَ هُمُ الْمُفْلِحُونَ (16)"));
        altghabonExes.add(new AltghabonEx("فابذلوا -أيها المؤمنون- في تقوى الله جهدكم وطاقتكم، واسمعوا لرسول الله صلى الله عليه وسلم سماع تدبُّر وتفكر، وأطيعوا أوامره واجتنبوا نواهيه، وأنفقوا مما رزقكم الله يكن خيرًا لكم. ومن سَلِم من البخل ومَنْعِ الفضل من المال، فأولئك هم الظافرون بكل خير، الفائزون بكل مطلب."));
        altghabonExes.add(new AltghabonEx("إِنْ تُقْرِضُوا اللَّهَ قَرْضًا حَسَنًا يُضَاعِفْهُ لَكُمْ وَيَغْفِرْ لَكُمْ وَاللَّهُ شَكُورٌ حَلِيمٌ (17)"));
        altghabonExes.add(new AltghabonEx("إن تنفقوا أموالكم في سبيل الله بإخلاص وطيب نفس، يضاعف الله ثواب ما أنفقتم، ويغفر لكم ذنوبكم. والله شكور لأهل الإنفاق بحسن الجزاء على ما أنفقوا، حليم لا يعجل بالعقوبة على مَن عصاه."));
        altghabonExes.add(new AltghabonEx("عَالِمُ الْغَيْبِ وَالشَّهَادَةِ الْعَزِيزُ الْحَكِيمُ (18)"));
        altghabonExes.add(new AltghabonEx("وهو سبحانه العالم بكل ما غاب وما حضر، العزيز الذي لا يغالَب، الحكيم في أقواله وأفعاله."));


        quran_explanation_64_adapter = new quran_explanation_64_adapter(altghabonExes ,QuranExplanation_64Activity.this);

        recyclerView = findViewById(R.id.rv_explanation_64);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuranExplanation_64Activity.this));
        recyclerView.setAdapter(quran_explanation_64_adapter);


    }

}