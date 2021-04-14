package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuranExplanationActivity extends AppCompatActivity implements View.OnClickListener {


    Button buttonExplanation1, buttonExplanation2 ,buttonExplanation3 ,buttonExplanation4 ,buttonExplanation5 ,buttonExplanation6 ,buttonExplanation7 , buttonExplanation8 ,
            buttonExplanation9 ,buttonExplanation10 ,buttonExplanation11 ,buttonExplanation12 ,buttonExplanation13 ,buttonExplanation14 ,buttonExplanation15 ,buttonExplanation16 ,
            buttonExplanation17 ,buttonExplanation18 ,buttonExplanation19 ,buttonExplanation20 ,buttonExplanation21 ,buttonExplanation22 ,buttonExplanation23 ,buttonExplanation24 ,
            buttonExplanation25 ,   buttonExplanation26 ,   buttonExplanation27 ,   buttonExplanation28 ,   buttonExplanation29 ,   buttonExplanation30 ,   buttonExplanation31 ,
            buttonExplanation32 ,   buttonExplanation33 ,   buttonExplanation34 ,   buttonExplanation35 ,   buttonExplanation36 ,   buttonExplanation37 ,   buttonExplanation38 ,
            buttonExplanation39 ,   buttonExplanation40 ,   buttonExplanation41 ,   buttonExplanation42 ,   buttonExplanation43 ,   buttonExplanation44 ,   buttonExplanation45 ,
            buttonExplanation46 ,   buttonExplanation47 ,   buttonExplanation48 ,   buttonExplanation49 ,   buttonExplanation50 ,   buttonExplanation51 ,   buttonExplanation52 ,
            buttonExplanation53 , buttonExplanation54 ,buttonExplanation55 ,buttonExplanation56 ,buttonExplanation57 ,buttonExplanation58 ,buttonExplanation59 , buttonExplanation60 ,
            buttonExplanation61 ,buttonExplanation62 ,buttonExplanation63 ,buttonExplanation64 ,buttonExplanation65 ,buttonExplanation66 ,buttonExplanation67 ,buttonExplanation68 ,
            buttonExplanation69 ,buttonExplanation70 ,buttonExplanation71 ,buttonExplanation72 ,buttonExplanation73 ,buttonExplanation74 ,buttonExplanation75 ,buttonExplanation76 ,
            buttonExplanation77 ,   buttonExplanation78 ,   buttonExplanation79 ,   buttonExplanation80 ,   buttonExplanation81 ,   buttonExplanation82 ,   buttonExplanation83 ,
            buttonExplanation84 ,   buttonExplanation85 ,   buttonExplanation86 ,   buttonExplanation87 ,   buttonExplanation88 ,   buttonExplanation89 ,   buttonExplanation90 ,
            buttonExplanation91 ,   buttonExplanation92 ,   buttonExplanation93 ,   buttonExplanation94 ,   buttonExplanation95 ,   buttonExplanation96 ,   buttonExplanation97 ,
            buttonExplanation98 ,   buttonExplanation99 ,   buttonExplanation100 ,   buttonExplanation101 ,   buttonExplanation102 ,   buttonExplanation103 ,   buttonExplanation104 ,
            buttonExplanation105 ,   buttonExplanation106 ,   buttonExplanation107 ,   buttonExplanation108 ,   buttonExplanation109 ,   buttonExplanation110 ,   buttonExplanation111 ,
            buttonExplanation112 ,   buttonExplanation113 ,   buttonExplanation114  ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_explanation);


        buttonExplanation1 = findViewById(R.id.quran_explanation_btn_1);
        buttonExplanation2 = findViewById(R.id.quran_explanation_btn_2);
        buttonExplanation3 = findViewById(R.id.quran_explanation_btn_3);
        buttonExplanation4 = findViewById(R.id.quran_explanation_btn_4);
        buttonExplanation5 = findViewById(R.id.quran_explanation_btn_5);
        buttonExplanation6 = findViewById(R.id.quran_explanation_btn_6);
        buttonExplanation7 = findViewById(R.id.quran_explanation_btn_7);
        buttonExplanation8 = findViewById(R.id.quran_explanation_btn_8);
        buttonExplanation9 = findViewById(R.id.quran_explanation_btn_9);
        buttonExplanation10 = findViewById(R.id.quran_explanation_btn_10);
        buttonExplanation11 = findViewById(R.id.quran_explanation_btn_11);
        buttonExplanation12 = findViewById(R.id.quran_explanation_btn_12);
        buttonExplanation13 = findViewById(R.id.quran_explanation_btn_13);
        buttonExplanation14 = findViewById(R.id.quran_explanation_btn_14);
        buttonExplanation15 = findViewById(R.id.quran_explanation_btn_15);
        buttonExplanation16 = findViewById(R.id.quran_explanation_btn_16);
        buttonExplanation17 = findViewById(R.id.quran_explanation_btn_17);
        buttonExplanation18 = findViewById(R.id.quran_explanation_btn_18);
        buttonExplanation19 = findViewById(R.id.quran_explanation_btn_19);
        buttonExplanation20 = findViewById(R.id.quran_explanation_btn_20);
        buttonExplanation21 = findViewById(R.id.quran_explanation_btn_21);
        buttonExplanation22 = findViewById(R.id.quran_explanation_btn_22);
        buttonExplanation23 = findViewById(R.id.quran_explanation_btn_23);
        buttonExplanation24 = findViewById(R.id.quran_explanation_btn_24);
        buttonExplanation25 = findViewById(R.id.quran_explanation_btn_25);
        buttonExplanation26 = findViewById(R.id.quran_explanation_btn_26);
        buttonExplanation27 = findViewById(R.id.quran_explanation_btn_27);
        buttonExplanation28 = findViewById(R.id.quran_explanation_btn_28);
        buttonExplanation29 = findViewById(R.id.quran_explanation_btn_29);
        buttonExplanation30 = findViewById(R.id.quran_explanation_btn_30);
        buttonExplanation31 = findViewById(R.id.quran_explanation_btn_31);
        buttonExplanation32 = findViewById(R.id.quran_explanation_btn_32);
        buttonExplanation33 = findViewById(R.id.quran_explanation_btn_33);
        buttonExplanation34 = findViewById(R.id.quran_explanation_btn_34);
        buttonExplanation35 = findViewById(R.id.quran_explanation_btn_35);
        buttonExplanation36 = findViewById(R.id.quran_explanation_btn_36);
        buttonExplanation37 = findViewById(R.id.quran_explanation_btn_37);
        buttonExplanation38 = findViewById(R.id.quran_explanation_btn_38);
        buttonExplanation39 = findViewById(R.id.quran_explanation_btn_39);
        buttonExplanation40 = findViewById(R.id.quran_explanation_btn_40);
        buttonExplanation41 = findViewById(R.id.quran_explanation_btn_41);
        buttonExplanation42 = findViewById(R.id.quran_explanation_btn_42);
        buttonExplanation43 = findViewById(R.id.quran_explanation_btn_43);
        buttonExplanation44 = findViewById(R.id.quran_explanation_btn_44);
        buttonExplanation45 = findViewById(R.id.quran_explanation_btn_45);
        buttonExplanation46 = findViewById(R.id.quran_explanation_btn_46);
        buttonExplanation47 = findViewById(R.id.quran_explanation_btn_47);
        buttonExplanation48 = findViewById(R.id.quran_explanation_btn_48);
        buttonExplanation49 = findViewById(R.id.quran_explanation_btn_49);
        buttonExplanation50 = findViewById(R.id.quran_explanation_btn_50);
        buttonExplanation51 = findViewById(R.id.quran_explanation_btn_51);
        buttonExplanation52 = findViewById(R.id.quran_explanation_btn_52);
        buttonExplanation53 = findViewById(R.id.quran_explanation_btn_53);
        buttonExplanation54 = findViewById(R.id.quran_explanation_btn_54);
        buttonExplanation55 = findViewById(R.id.quran_explanation_btn_55);
        buttonExplanation56 = findViewById(R.id.quran_explanation_btn_56);
        buttonExplanation57 = findViewById(R.id.quran_explanation_btn_57);
        buttonExplanation58 = findViewById(R.id.quran_explanation_btn_58);
        buttonExplanation59 = findViewById(R.id.quran_explanation_btn_59);
        buttonExplanation60 = findViewById(R.id.quran_explanation_btn_60);
        buttonExplanation61 = findViewById(R.id.quran_explanation_btn_61);
        buttonExplanation62 = findViewById(R.id.quran_explanation_btn_62);
        buttonExplanation63 = findViewById(R.id.quran_explanation_btn_63);
        buttonExplanation64 = findViewById(R.id.quran_explanation_btn_64);
        buttonExplanation65 = findViewById(R.id.quran_explanation_btn_65);
        buttonExplanation66 = findViewById(R.id.quran_explanation_btn_66);
        buttonExplanation67 = findViewById(R.id.quran_explanation_btn_67);
        buttonExplanation68 = findViewById(R.id.quran_explanation_btn_68);
        buttonExplanation69 = findViewById(R.id.quran_explanation_btn_69);
        buttonExplanation70 = findViewById(R.id.quran_explanation_btn_70);
        buttonExplanation71 = findViewById(R.id.quran_explanation_btn_71);
        buttonExplanation72 = findViewById(R.id.quran_explanation_btn_72);
        buttonExplanation73 = findViewById(R.id.quran_explanation_btn_73);
        buttonExplanation74 = findViewById(R.id.quran_explanation_btn_74);
        buttonExplanation75 = findViewById(R.id.quran_explanation_btn_75);
        buttonExplanation76 = findViewById(R.id.quran_explanation_btn_76);
        buttonExplanation77 = findViewById(R.id.quran_explanation_btn_77);
        buttonExplanation78 = findViewById(R.id.quran_explanation_btn_78);
        buttonExplanation79 = findViewById(R.id.quran_explanation_btn_79);
        buttonExplanation80 = findViewById(R.id.quran_explanation_btn_80);
        buttonExplanation81 = findViewById(R.id.quran_explanation_btn_81);
        buttonExplanation82 = findViewById(R.id.quran_explanation_btn_82);
        buttonExplanation83 = findViewById(R.id.quran_explanation_btn_83);
        buttonExplanation84 = findViewById(R.id.quran_explanation_btn_84);
        buttonExplanation85 = findViewById(R.id.quran_explanation_btn_85);
        buttonExplanation86 = findViewById(R.id.quran_explanation_btn_86);
        buttonExplanation87 = findViewById(R.id.quran_explanation_btn_87);
        buttonExplanation88 = findViewById(R.id.quran_explanation_btn_88);
        buttonExplanation89 = findViewById(R.id.quran_explanation_btn_89);
        buttonExplanation90 = findViewById(R.id.quran_explanation_btn_90);
        buttonExplanation91 = findViewById(R.id.quran_explanation_btn_91);
        buttonExplanation92 = findViewById(R.id.quran_explanation_btn_92);
        buttonExplanation93 = findViewById(R.id.quran_explanation_btn_93);
        buttonExplanation94 = findViewById(R.id.quran_explanation_btn_94);
        buttonExplanation95 = findViewById(R.id.quran_explanation_btn_95);
        buttonExplanation96 = findViewById(R.id.quran_explanation_btn_96);
        buttonExplanation97 = findViewById(R.id.quran_explanation_btn_97);
        buttonExplanation98 = findViewById(R.id.quran_explanation_btn_98);
        buttonExplanation99 = findViewById(R.id.quran_explanation_btn_99);
        buttonExplanation100 = findViewById(R.id.quran_explanation_btn_100);
        buttonExplanation101 = findViewById(R.id.quran_explanation_btn_101);
        buttonExplanation102 = findViewById(R.id.quran_explanation_btn_102);
        buttonExplanation103 = findViewById(R.id.quran_explanation_btn_103);
        buttonExplanation104 = findViewById(R.id.quran_explanation_btn_104);
        buttonExplanation105 = findViewById(R.id.quran_explanation_btn_105);
        buttonExplanation106 = findViewById(R.id.quran_explanation_btn_106);
        buttonExplanation107 = findViewById(R.id.quran_explanation_btn_107);
        buttonExplanation108 = findViewById(R.id.quran_explanation_btn_108);
        buttonExplanation109 = findViewById(R.id.quran_explanation_btn_109);
        buttonExplanation110 = findViewById(R.id.quran_explanation_btn_110);
        buttonExplanation111 = findViewById(R.id.quran_explanation_btn_111);
        buttonExplanation112 = findViewById(R.id.quran_explanation_btn_112);
        buttonExplanation113 = findViewById(R.id.quran_explanation_btn_113);
        buttonExplanation114 = findViewById(R.id.quran_explanation_btn_114);


        buttonExplanation1.setOnClickListener(this);
        buttonExplanation2.setOnClickListener(this);
        buttonExplanation3.setOnClickListener(this);
        buttonExplanation4.setOnClickListener(this);
        buttonExplanation5.setOnClickListener(this);
        buttonExplanation6.setOnClickListener(this);
        buttonExplanation7.setOnClickListener(this);
        buttonExplanation8.setOnClickListener(this);
        buttonExplanation9.setOnClickListener(this);
        buttonExplanation10.setOnClickListener(this);
        buttonExplanation11.setOnClickListener(this);
        buttonExplanation12.setOnClickListener(this);
        buttonExplanation13.setOnClickListener(this);
        buttonExplanation14.setOnClickListener(this);
        buttonExplanation15.setOnClickListener(this);
        buttonExplanation16.setOnClickListener(this);
        buttonExplanation17.setOnClickListener(this);
        buttonExplanation18.setOnClickListener(this);
        buttonExplanation19.setOnClickListener(this);
        buttonExplanation20.setOnClickListener(this);
        buttonExplanation21.setOnClickListener(this);
        buttonExplanation22.setOnClickListener(this);
        buttonExplanation23.setOnClickListener(this);
        buttonExplanation24.setOnClickListener(this);
        buttonExplanation25.setOnClickListener(this);
        buttonExplanation26.setOnClickListener(this);
        buttonExplanation27.setOnClickListener(this);
        buttonExplanation28.setOnClickListener(this);
        buttonExplanation29.setOnClickListener(this);
        buttonExplanation30.setOnClickListener(this);
        buttonExplanation31.setOnClickListener(this);
        buttonExplanation32.setOnClickListener(this);
        buttonExplanation33.setOnClickListener(this);
        buttonExplanation34.setOnClickListener(this);
        buttonExplanation35.setOnClickListener(this);
        buttonExplanation36.setOnClickListener(this);
        buttonExplanation37.setOnClickListener(this);
        buttonExplanation38.setOnClickListener(this);
        buttonExplanation39.setOnClickListener(this);
        buttonExplanation40.setOnClickListener(this);
        buttonExplanation41.setOnClickListener(this);
        buttonExplanation42.setOnClickListener(this);
        buttonExplanation43.setOnClickListener(this);
        buttonExplanation44.setOnClickListener(this);
        buttonExplanation45.setOnClickListener(this);
        buttonExplanation46.setOnClickListener(this);
        buttonExplanation47.setOnClickListener(this);
        buttonExplanation48.setOnClickListener(this);
        buttonExplanation49.setOnClickListener(this);
        buttonExplanation50.setOnClickListener(this);
        buttonExplanation51.setOnClickListener(this);
        buttonExplanation52.setOnClickListener(this);
        buttonExplanation53.setOnClickListener(this);
        buttonExplanation54.setOnClickListener(this);
        buttonExplanation55.setOnClickListener(this);
        buttonExplanation56.setOnClickListener(this);
        buttonExplanation57.setOnClickListener(this);
        buttonExplanation58.setOnClickListener(this);
        buttonExplanation59.setOnClickListener(this);
        buttonExplanation60.setOnClickListener(this);
        buttonExplanation61.setOnClickListener(this);
        buttonExplanation62.setOnClickListener(this);
        buttonExplanation63.setOnClickListener(this);
        buttonExplanation64.setOnClickListener(this);
        buttonExplanation65.setOnClickListener(this);
        buttonExplanation66.setOnClickListener(this);
        buttonExplanation67.setOnClickListener(this);
        buttonExplanation68.setOnClickListener(this);
        buttonExplanation69.setOnClickListener(this);
        buttonExplanation70.setOnClickListener(this);
        buttonExplanation71.setOnClickListener(this);
        buttonExplanation72.setOnClickListener(this);
        buttonExplanation73.setOnClickListener(this);
        buttonExplanation74.setOnClickListener(this);
        buttonExplanation75.setOnClickListener(this);
        buttonExplanation76.setOnClickListener(this);
        buttonExplanation77.setOnClickListener(this);
        buttonExplanation78.setOnClickListener(this);
        buttonExplanation79.setOnClickListener(this);
        buttonExplanation80.setOnClickListener(this);
        buttonExplanation81.setOnClickListener(this);
        buttonExplanation82.setOnClickListener(this);
        buttonExplanation83.setOnClickListener(this);
        buttonExplanation84.setOnClickListener(this);
        buttonExplanation85.setOnClickListener(this);
        buttonExplanation86.setOnClickListener(this);
        buttonExplanation87.setOnClickListener(this);
        buttonExplanation88.setOnClickListener(this);
        buttonExplanation89.setOnClickListener(this);
        buttonExplanation90.setOnClickListener(this);
        buttonExplanation91.setOnClickListener(this);
        buttonExplanation92.setOnClickListener(this);
        buttonExplanation93.setOnClickListener(this);
        buttonExplanation94.setOnClickListener(this);
        buttonExplanation95.setOnClickListener(this);
        buttonExplanation96.setOnClickListener(this);
        buttonExplanation97.setOnClickListener(this);
        buttonExplanation98.setOnClickListener(this);
        buttonExplanation99.setOnClickListener(this);
        buttonExplanation100.setOnClickListener(this);
        buttonExplanation101.setOnClickListener(this);
        buttonExplanation102.setOnClickListener(this);
        buttonExplanation103.setOnClickListener(this);
        buttonExplanation104.setOnClickListener(this);
        buttonExplanation105.setOnClickListener(this);
        buttonExplanation106.setOnClickListener(this);
        buttonExplanation107.setOnClickListener(this);
        buttonExplanation108.setOnClickListener(this);
        buttonExplanation109.setOnClickListener(this);
        buttonExplanation110.setOnClickListener(this);
        buttonExplanation111.setOnClickListener(this);
        buttonExplanation112.setOnClickListener(this);
        buttonExplanation113.setOnClickListener(this);
        buttonExplanation114.setOnClickListener(this);





    }

    @Override
    public void onClick(View view) {



        switch (view.getId()){

            case R.id.quran_explanation_btn_1 :

                Intent intent1 = new Intent(QuranExplanationActivity.this , QuranExplanation_1Activity.class);
                startActivity(intent1);

                break;


            case R.id.quran_explanation_btn_2 :

                Intent intent2 = new Intent(QuranExplanationActivity.this , QuranExplanation_2Activity.class);
                startActivity(intent2);

                break;


            case R.id.quran_explanation_btn_3 :

                Intent intent3 = new Intent(QuranExplanationActivity.this , QuranExplanation_3Activity.class);
                startActivity(intent3);

                break;


            case R.id.quran_explanation_btn_4 :

                Intent intent4 = new Intent(QuranExplanationActivity.this , QuranExplanation_4Activity.class);
                startActivity(intent4);

                break;


            case R.id.quran_explanation_btn_5 :

                Intent intent5 = new Intent(QuranExplanationActivity.this , QuranExplanation_5Activity.class);
                startActivity(intent5);

                break;


            case R.id.quran_explanation_btn_6 :

                Intent intent6 = new Intent(QuranExplanationActivity.this , QuranExplanation_6Activity.class);
                startActivity(intent6);

                break;


            case R.id.quran_explanation_btn_7 :

                Intent intent7 = new Intent(QuranExplanationActivity.this , QuranExplanation_7Activity.class);
                startActivity(intent7);

                break;


            case R.id.quran_explanation_btn_8 :

                Intent intent8 = new Intent(QuranExplanationActivity.this , QuranExplanation_8Activity.class);
                startActivity(intent8);

                break;


            case R.id.quran_explanation_btn_9 :

                Intent intent9 = new Intent(QuranExplanationActivity.this , QuranExplanation_9Activity.class);
                startActivity(intent9);

                break;


            case R.id.quran_explanation_btn_10 :

                Intent intent10 = new Intent(QuranExplanationActivity.this , QuranExplanation_10Activity.class);
                startActivity(intent10);

                break;


            case R.id.quran_explanation_btn_11 :

                Intent intent11 = new Intent(QuranExplanationActivity.this , QuranExplanation_11Activity.class);
                startActivity(intent11);

                break;


            case R.id.quran_explanation_btn_12 :

                Intent intent12 = new Intent(QuranExplanationActivity.this , QuranExplanation_12Activity.class);
                startActivity(intent12);

                break;


            case R.id.quran_explanation_btn_13 :

                Intent intent13 = new Intent(QuranExplanationActivity.this , QuranExplanation_13Activity.class);
                startActivity(intent13);

                break;


            case R.id.quran_explanation_btn_14 :

                Intent intent14 = new Intent(QuranExplanationActivity.this , QuranExplanation_14Activity.class);
                startActivity(intent14);

                break;


            case R.id.quran_explanation_btn_15 :

                Intent intent15 = new Intent(QuranExplanationActivity.this , QuranExplanation_15Activity.class);
                startActivity(intent15);

                break;


            case R.id.quran_explanation_btn_16 :

                Intent intent16 = new Intent(QuranExplanationActivity.this , QuranExplanation_16Activity.class);
                startActivity(intent16);

                break;


            case R.id.quran_explanation_btn_17 :

                Intent intent17 = new Intent(QuranExplanationActivity.this , QuranExplanation_17Activity.class);
                startActivity(intent17);

                break;


            case R.id.quran_explanation_btn_18 :

                Intent intent18 = new Intent(QuranExplanationActivity.this , QuranExplanation_18Activity.class);
                startActivity(intent18);

                break;


            case R.id.quran_explanation_btn_19 :

                Intent intent19 = new Intent(QuranExplanationActivity.this , QuranExplanation_19Activity.class);
                startActivity(intent19);

                break;


            case R.id.quran_explanation_btn_20 :

                Intent intent20 = new Intent(QuranExplanationActivity.this , QuranExplanation_20Activity.class);
                startActivity(intent20);

                break;


            case R.id.quran_explanation_btn_21 :

                Intent intent21 = new Intent(QuranExplanationActivity.this , QuranExplanation_21Activity.class);
                startActivity(intent21);

                break;


            case R.id.quran_explanation_btn_22 :

                Intent intent22 = new Intent(QuranExplanationActivity.this , QuranExplanation_22Activity.class);
                startActivity(intent22);

                break;


            case R.id.quran_explanation_btn_23 :

                Intent intent23 = new Intent(QuranExplanationActivity.this , QuranExplanation_23Activity.class);
                startActivity(intent23);

                break;


            case R.id.quran_explanation_btn_24 :

                Intent intent24 = new Intent(QuranExplanationActivity.this , QuranExplanation_24Activity.class);
                startActivity(intent24);

                break;


            case R.id.quran_explanation_btn_25 :

                Intent intent25 = new Intent(QuranExplanationActivity.this , QuranExplanation_25Activity.class);
                startActivity(intent25);

                break;


            case R.id.quran_explanation_btn_26 :

                Intent intent26 = new Intent(QuranExplanationActivity.this , QuranExplanation_26Activity.class);
                startActivity(intent26);

                break;


            case R.id.quran_explanation_btn_27 :

                Intent intent27 = new Intent(QuranExplanationActivity.this , QuranExplanation_27Activity.class);
                startActivity(intent27);

                break;


            case R.id.quran_explanation_btn_28 :

                Intent intent28 = new Intent(QuranExplanationActivity.this , QuranExplanation_28Activity.class);
                startActivity(intent28);

                break;


            case R.id.quran_explanation_btn_29 :

                Intent intent29 = new Intent(QuranExplanationActivity.this , QuranExplanation_29Activity.class);
                startActivity(intent29);

                break;


            case R.id.quran_explanation_btn_30 :

                Intent intent30 = new Intent(QuranExplanationActivity.this , QuranExplanation_30Activity.class);
                startActivity(intent30);

                break;


            case R.id.quran_explanation_btn_31 :

                Intent intent31 = new Intent(QuranExplanationActivity.this , QuranExplanation_31Activity.class);
                startActivity(intent31);

                break;


            case R.id.quran_explanation_btn_32 :

                Intent intent32 = new Intent(QuranExplanationActivity.this , QuranExplanation_32Activity.class);
                startActivity(intent32);

                break;


            case R.id.quran_explanation_btn_33 :

                Intent intent33 = new Intent(QuranExplanationActivity.this , QuranExplanation_33Activity.class);
                startActivity(intent33);

                break;


            case R.id.quran_explanation_btn_34 :

                Intent intent34 = new Intent(QuranExplanationActivity.this , QuranExplanation_34Activity.class);
                startActivity(intent34);

                break;


            case R.id.quran_explanation_btn_35 :

                Intent intent35 = new Intent(QuranExplanationActivity.this , QuranExplanation_35Activity.class);
                startActivity(intent35);

                break;


            case R.id.quran_explanation_btn_36 :

                Intent intent36 = new Intent(QuranExplanationActivity.this , QuranExplanation_36Activity.class);
                startActivity(intent36);

                break;


            case R.id.quran_explanation_btn_37 :

                Intent intent37 = new Intent(QuranExplanationActivity.this , QuranExplanation_37Activity.class);
                startActivity(intent37);

                break;


            case R.id.quran_explanation_btn_38 :

                Intent intent38 = new Intent(QuranExplanationActivity.this , QuranExplanation_38Activity.class);
                startActivity(intent38);

                break;


            case R.id.quran_explanation_btn_39 :

                Intent intent39 = new Intent(QuranExplanationActivity.this , QuranExplanation_39Activity.class);
                startActivity(intent39);

                break;


            case R.id.quran_explanation_btn_40 :

                Intent intent40 = new Intent(QuranExplanationActivity.this , QuranExplanation_40Activity.class);
                startActivity(intent40);

                break;


            case R.id.quran_explanation_btn_41 :

                Intent intent41 = new Intent(QuranExplanationActivity.this , QuranExplanation_41Activity.class);
                startActivity(intent41);

                break;


            case R.id.quran_explanation_btn_42 :

                Intent intent42 = new Intent(QuranExplanationActivity.this , QuranExplanation_42Activity.class);
                startActivity(intent42);

                break;


            case R.id.quran_explanation_btn_43 :

                Intent intent43 = new Intent(QuranExplanationActivity.this , QuranExplanation_43Activity.class);
                startActivity(intent43);

                break;


            case R.id.quran_explanation_btn_44 :

                Intent intent44 = new Intent(QuranExplanationActivity.this , QuranExplanation_44Activity.class);
                startActivity(intent44);

                break;


            case R.id.quran_explanation_btn_45 :

                Intent intent45 = new Intent(QuranExplanationActivity.this , QuranExplanation_45Activity.class);
                startActivity(intent45);

                break;


            case R.id.quran_explanation_btn_46 :

                Intent intent46 = new Intent(QuranExplanationActivity.this , QuranExplanation_46Activity.class);
                startActivity(intent46);

                break;


            case R.id.quran_explanation_btn_47 :

                Intent intent47 = new Intent(QuranExplanationActivity.this , QuranExplanation_47Activity.class);
                startActivity(intent47);

                break;


            case R.id.quran_explanation_btn_48 :

                Intent intent48 = new Intent(QuranExplanationActivity.this , QuranExplanation_48Activity.class);
                startActivity(intent48);

                break;


            case R.id.quran_explanation_btn_49 :

                Intent intent49 = new Intent(QuranExplanationActivity.this , QuranExplanation_49Activity.class);
                startActivity(intent49);

                break;


            case R.id.quran_explanation_btn_50 :

                Intent intent50 = new Intent(QuranExplanationActivity.this , QuranExplanation_50Activity.class);
                startActivity(intent50);

                break;


            case R.id.quran_explanation_btn_51 :

                Intent intent51 = new Intent(QuranExplanationActivity.this , QuranExplanation_51Activity.class);
                startActivity(intent51);

                break;


            case R.id.quran_explanation_btn_52 :

                Intent intent52 = new Intent(QuranExplanationActivity.this , QuranExplanation_52Activity.class);
                startActivity(intent52);

                break;


            case R.id.quran_explanation_btn_53 :

                Intent intent53 = new Intent(QuranExplanationActivity.this , QuranExplanation_53Activity.class);
                startActivity(intent53);

                break;


            case R.id.quran_explanation_btn_54 :

                Intent intent54 = new Intent(QuranExplanationActivity.this , QuranExplanation_54Activity.class);
                startActivity(intent54);

                break;


            case R.id.quran_explanation_btn_55 :

                Intent intent55 = new Intent(QuranExplanationActivity.this , QuranExplanation_55Activity.class);
                startActivity(intent55);

                break;


            case R.id.quran_explanation_btn_56 :

                Intent intent56 = new Intent(QuranExplanationActivity.this , QuranExplanation_56Activity.class);
                startActivity(intent56);

                break;


            case R.id.quran_explanation_btn_57 :

                Intent intent57 = new Intent(QuranExplanationActivity.this , QuranExplanation_57Activity.class);
                startActivity(intent57);

                break;


            case R.id.quran_explanation_btn_58 :

                Intent intent58 = new Intent(QuranExplanationActivity.this , QuranExplanation_58Activity.class);
                startActivity(intent58);

                break;


            case R.id.quran_explanation_btn_59 :

                Intent intent59 = new Intent(QuranExplanationActivity.this , QuranExplanation_59Activity.class);
                startActivity(intent59);

                break;


            case R.id.quran_explanation_btn_60 :

                Intent intent60 = new Intent(QuranExplanationActivity.this , QuranExplanation_60Activity.class);
                startActivity(intent60);

                break;


            case R.id.quran_explanation_btn_61 :

                Intent intent61 = new Intent(QuranExplanationActivity.this , QuranExplanation_61Activity.class);
                startActivity(intent61);

                break;


            case R.id.quran_explanation_btn_62 :

                Intent intent62 = new Intent(QuranExplanationActivity.this , QuranExplanation_62Activity.class);
                startActivity(intent62);

                break;


            case R.id.quran_explanation_btn_63 :

                Intent intent63 = new Intent(QuranExplanationActivity.this , QuranExplanation_63Activity.class);
                startActivity(intent63);

                break;


            case R.id.quran_explanation_btn_64 :

                Intent intent64 = new Intent(QuranExplanationActivity.this , QuranExplanation_64Activity.class);
                startActivity(intent64);

                break;


            case R.id.quran_explanation_btn_65 :

                Intent intent65 = new Intent(QuranExplanationActivity.this , QuranExplanation_65Activity.class);
                startActivity(intent65);

                break;


            case R.id.quran_explanation_btn_66 :

                Intent intent66 = new Intent(QuranExplanationActivity.this , QuranExplanation_66Activity.class);
                startActivity(intent66);

                break;


            case R.id.quran_explanation_btn_67 :

                Intent intent67 = new Intent(QuranExplanationActivity.this , QuranExplanation_67Activity.class);
                startActivity(intent67);

                break;


            case R.id.quran_explanation_btn_68 :

                Intent intent68 = new Intent(QuranExplanationActivity.this , QuranExplanation_68Activity.class);
                startActivity(intent68);

                break;


            case R.id.quran_explanation_btn_69 :

                Intent intent69 = new Intent(QuranExplanationActivity.this , QuranExplanation_69Activity.class);
                startActivity(intent69);

                break;


            case R.id.quran_explanation_btn_70 :

                Intent intent70 = new Intent(QuranExplanationActivity.this , QuranExplanation_70Activity.class);
                startActivity(intent70);

                break;


            case R.id.quran_explanation_btn_71 :

                Intent intent71 = new Intent(QuranExplanationActivity.this , QuranExplanation_71Activity.class);
                startActivity(intent71);

                break;


            case R.id.quran_explanation_btn_72 :

                Intent intent72 = new Intent(QuranExplanationActivity.this , QuranExplanation_72Activity.class);
                startActivity(intent72);

                break;


            case R.id.quran_explanation_btn_73 :

                Intent intent73 = new Intent(QuranExplanationActivity.this , QuranExplanation_73Activity.class);
                startActivity(intent73);

                break;


            case R.id.quran_explanation_btn_74 :

                Intent intent74 = new Intent(QuranExplanationActivity.this , QuranExplanation_74Activity.class);
                startActivity(intent74);

                break;


            case R.id.quran_explanation_btn_75 :

                Intent intent75 = new Intent(QuranExplanationActivity.this , QuranExplanation_75Activity.class);
                startActivity(intent75);

                break;


            case R.id.quran_explanation_btn_76 :

                Intent intent76 = new Intent(QuranExplanationActivity.this , QuranExplanation_76Activity.class);
                startActivity(intent76);

                break;


            case R.id.quran_explanation_btn_77 :

                Intent intent77 = new Intent(QuranExplanationActivity.this , QuranExplanation_77Activity.class);
                startActivity(intent77);

                break;


            case R.id.quran_explanation_btn_78 :

                Intent intent78 = new Intent(QuranExplanationActivity.this , QuranExplanation_78Activity.class);
                startActivity(intent78);

                break;


            case R.id.quran_explanation_btn_79 :

                Intent intent79 = new Intent(QuranExplanationActivity.this , QuranExplanation_79Activity.class);
                startActivity(intent79);

                break;


            case R.id.quran_explanation_btn_80 :

                Intent intent80 = new Intent(QuranExplanationActivity.this , QuranExplanation_80Activity.class);
                startActivity(intent80);

                break;


            case R.id.quran_explanation_btn_81 :

                Intent intent81 = new Intent(QuranExplanationActivity.this , QuranExplanation_81Activity.class);
                startActivity(intent81);

                break;


            case R.id.quran_explanation_btn_82 :

                Intent intent82 = new Intent(QuranExplanationActivity.this , QuranExplanation_82Activity.class);
                startActivity(intent82);

                break;


            case R.id.quran_explanation_btn_83 :

                Intent intent83 = new Intent(QuranExplanationActivity.this , QuranExplanation_83Activity.class);
                startActivity(intent83);

                break;


            case R.id.quran_explanation_btn_84 :

                Intent intent84 = new Intent(QuranExplanationActivity.this , QuranExplanation_84Activity.class);
                startActivity(intent84);

                break;


            case R.id.quran_explanation_btn_85 :

                Intent intent85 = new Intent(QuranExplanationActivity.this , QuranExplanation_85Activity.class);
                startActivity(intent85);

                break;


            case R.id.quran_explanation_btn_86 :

                Intent intent86 = new Intent(QuranExplanationActivity.this , QuranExplanation_86Activity.class);
                startActivity(intent86);

                break;


            case R.id.quran_explanation_btn_87 :

                Intent intent87 = new Intent(QuranExplanationActivity.this , QuranExplanation_87Activity.class);
                startActivity(intent87);

                break;


            case R.id.quran_explanation_btn_88 :

                Intent intent88 = new Intent(QuranExplanationActivity.this , QuranExplanation_88Activity.class);
                startActivity(intent88);

                break;


            case R.id.quran_explanation_btn_89 :

                Intent intent89 = new Intent(QuranExplanationActivity.this , QuranExplanation_89Activity.class);
                startActivity(intent89);

                break;


            case R.id.quran_explanation_btn_90 :

                Intent intent90 = new Intent(QuranExplanationActivity.this , QuranExplanation_90Activity.class);
                startActivity(intent90);

                break;


            case R.id.quran_explanation_btn_91 :

                Intent intent91 = new Intent(QuranExplanationActivity.this , QuranExplanation_91Activity.class);
                startActivity(intent91);

                break;


            case R.id.quran_explanation_btn_92 :

                Intent intent92 = new Intent(QuranExplanationActivity.this , QuranExplanation_92Activity.class);
                startActivity(intent92);

                break;


            case R.id.quran_explanation_btn_93 :

                Intent intent93 = new Intent(QuranExplanationActivity.this , QuranExplanation_93Activity.class);
                startActivity(intent93);

                break;


            case R.id.quran_explanation_btn_94 :

                Intent intent94 = new Intent(QuranExplanationActivity.this , QuranExplanation_94Activity.class);
                startActivity(intent94);

                break;


            case R.id.quran_explanation_btn_95 :

                Intent intent95 = new Intent(QuranExplanationActivity.this , QuranExplanation_95Activity.class);
                startActivity(intent95);

                break;


            case R.id.quran_explanation_btn_96 :

                Intent intent96 = new Intent(QuranExplanationActivity.this , QuranExplanation_96Activity.class);
                startActivity(intent96);

                break;


            case R.id.quran_explanation_btn_97 :

                Intent intent97 = new Intent(QuranExplanationActivity.this , QuranExplanation_97Activity.class);
                startActivity(intent97);

                break;


            case R.id.quran_explanation_btn_98 :

                Intent intent98 = new Intent(QuranExplanationActivity.this , QuranExplanation_98Activity.class);
                startActivity(intent98);

                break;


            case R.id.quran_explanation_btn_99 :

                Intent intent99 = new Intent(QuranExplanationActivity.this , QuranExplanation_99Activity.class);
                startActivity(intent99);

                break;


            case R.id.quran_explanation_btn_100 :

                Intent intent100 = new Intent(QuranExplanationActivity.this , QuranExplanation_100Activity.class);
                startActivity(intent100);

                break;


            case R.id.quran_explanation_btn_101 :

                Intent intent101 = new Intent(QuranExplanationActivity.this , QuranExplanation_101Activity.class);
                startActivity(intent101);

                break;


            case R.id.quran_explanation_btn_102 :

                Intent intent102 = new Intent(QuranExplanationActivity.this , QuranExplanation_102Activity.class);
                startActivity(intent102);

                break;


            case R.id.quran_explanation_btn_103 :

                Intent intent103 = new Intent(QuranExplanationActivity.this , QuranExplanation_103Activity.class);
                startActivity(intent103);

                break;


            case R.id.quran_explanation_btn_104 :

                Intent intent104 = new Intent(QuranExplanationActivity.this , QuranExplanation_104Activity.class);
                startActivity(intent104);

                break;


            case R.id.quran_explanation_btn_105 :

                Intent intent105 = new Intent(QuranExplanationActivity.this , QuranExplanation_105Activity.class);
                startActivity(intent105);

                break;


            case R.id.quran_explanation_btn_106 :

                Intent intent106 = new Intent(QuranExplanationActivity.this , QuranExplanation_106Activity.class);
                startActivity(intent106);

                break;


            case R.id.quran_explanation_btn_107 :

                Intent intent107 = new Intent(QuranExplanationActivity.this , QuranExplanation_107Activity.class);
                startActivity(intent107);

                break;


            case R.id.quran_explanation_btn_108 :

                Intent intent108 = new Intent(QuranExplanationActivity.this , QuranExplanation_108Activity.class);
                startActivity(intent108);

                break;


            case R.id.quran_explanation_btn_109 :

                Intent intent109 = new Intent(QuranExplanationActivity.this , QuranExplanation_109Activity.class);
                startActivity(intent109);

                break;


            case R.id.quran_explanation_btn_110 :

                Intent intent110 = new Intent(QuranExplanationActivity.this , QuranExplanation_110Activity.class);
                startActivity(intent110);

                break;


            case R.id.quran_explanation_btn_111 :

                Intent intent111 = new Intent(QuranExplanationActivity.this , QuranExplanation_111Activity.class);
                startActivity(intent111);

                break;


            case R.id.quran_explanation_btn_112 :

                Intent intent112 = new Intent(QuranExplanationActivity.this , QuranExplanation_112Activity.class);
                startActivity(intent112);

                break;


            case R.id.quran_explanation_btn_113 :

                Intent intent113 = new Intent(QuranExplanationActivity.this , QuranExplanation_113Activity.class);
                startActivity(intent113);

                break;


            case R.id.quran_explanation_btn_114 :

                Intent intent114 = new Intent(QuranExplanationActivity.this , QuranExplanation_114Activity.class);
                startActivity(intent114);

                break;




        }


    }
}