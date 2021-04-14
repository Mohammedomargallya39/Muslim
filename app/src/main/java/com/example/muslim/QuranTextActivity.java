package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuranTextActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonText1 , buttonText2 ,buttonText3 ,buttonText4 ,buttonText5 ,buttonText6 ,buttonText7 , buttonText8 ,
            buttonText9 ,buttonText10 ,buttonText11 ,buttonText12 ,buttonText13 ,buttonText14 ,buttonText15 ,buttonText16 ,
            buttonText17 ,buttonText18 ,buttonText19 ,buttonText20 ,buttonText21 ,buttonText22 ,buttonText23 ,buttonText24 ,
            buttonText25 ,   buttonText26 ,   buttonText27 ,   buttonText28 ,   buttonText29 ,   buttonText30 ,   buttonText31 ,
            buttonText32 ,   buttonText33 ,   buttonText34 ,   buttonText35 ,   buttonText36 ,   buttonText37 ,   buttonText38 ,
            buttonText39 ,   buttonText40 ,   buttonText41 ,   buttonText42 ,   buttonText43 ,   buttonText44 ,   buttonText45 ,
            buttonText46 ,   buttonText47 ,   buttonText48 ,   buttonText49 ,   buttonText50 ,   buttonText51 ,   buttonText52 ,
            buttonText53 , buttonText54 ,buttonText55 ,buttonText56 ,buttonText57 ,buttonText58 ,buttonText59 , buttonText60 ,
            buttonText61 ,buttonText62 ,buttonText63 ,buttonText64 ,buttonText65 ,buttonText66 ,buttonText67 ,buttonText68 ,
            buttonText69 ,buttonText70 ,buttonText71 ,buttonText72 ,buttonText73 ,buttonText74 ,buttonText75 ,buttonText76 ,
            buttonText77 ,   buttonText78 ,   buttonText79 ,   buttonText80 ,   buttonText81 ,   buttonText82 ,   buttonText83 ,
            buttonText84 ,   buttonText85 ,   buttonText86 ,   buttonText87 ,   buttonText88 ,   buttonText89 ,   buttonText90 ,
            buttonText91 ,   buttonText92 ,   buttonText93 ,   buttonText94 ,   buttonText95 ,   buttonText96 ,   buttonText97 ,
            buttonText98 ,   buttonText99 ,   buttonText100 ,   buttonText101 ,   buttonText102 ,   buttonText103 ,   buttonText104 ,
            buttonText105 ,   buttonText106 ,   buttonText107 ,   buttonText108 ,   buttonText109 ,   buttonText110 ,   buttonText111 ,
            buttonText112 ,   buttonText113 ,   buttonText114  ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_text);

        buttonText1 = findViewById(R.id.quran_text_btn_1);
        buttonText2 = findViewById(R.id.quran_text_btn_2);
        buttonText3 = findViewById(R.id.quran_text_btn_3);
        buttonText4 = findViewById(R.id.quran_text_btn_4);
        buttonText5 = findViewById(R.id.quran_text_btn_5);
        buttonText6 = findViewById(R.id.quran_text_btn_6);
        buttonText7 = findViewById(R.id.quran_text_btn_7);
        buttonText8 = findViewById(R.id.quran_text_btn_8);
        buttonText9 = findViewById(R.id.quran_text_btn_9);
        buttonText10 = findViewById(R.id.quran_text_btn_10);
        buttonText11 = findViewById(R.id.quran_text_btn_11);
        buttonText12 = findViewById(R.id.quran_text_btn_12);
        buttonText13 = findViewById(R.id.quran_text_btn_13);
        buttonText14 = findViewById(R.id.quran_text_btn_14);
        buttonText15 = findViewById(R.id.quran_text_btn_15);
        buttonText16 = findViewById(R.id.quran_text_btn_16);
        buttonText17 = findViewById(R.id.quran_text_btn_17);
        buttonText18 = findViewById(R.id.quran_text_btn_18);
        buttonText19 = findViewById(R.id.quran_text_btn_19);
        buttonText20 = findViewById(R.id.quran_text_btn_20);
        buttonText21 = findViewById(R.id.quran_text_btn_21);
        buttonText22 = findViewById(R.id.quran_text_btn_22);
        buttonText23 = findViewById(R.id.quran_text_btn_23);
        buttonText24 = findViewById(R.id.quran_text_btn_24);
        buttonText25 = findViewById(R.id.quran_text_btn_25);
        buttonText26 = findViewById(R.id.quran_text_btn_26);
        buttonText27 = findViewById(R.id.quran_text_btn_27);
        buttonText28 = findViewById(R.id.quran_text_btn_28);
        buttonText29 = findViewById(R.id.quran_text_btn_29);
        buttonText30 = findViewById(R.id.quran_text_btn_30);
        buttonText31 = findViewById(R.id.quran_text_btn_31);
        buttonText32 = findViewById(R.id.quran_text_btn_32);
        buttonText33 = findViewById(R.id.quran_text_btn_33);
        buttonText34 = findViewById(R.id.quran_text_btn_34);
        buttonText35 = findViewById(R.id.quran_text_btn_35);
        buttonText36 = findViewById(R.id.quran_text_btn_36);
        buttonText37 = findViewById(R.id.quran_text_btn_37);
        buttonText38 = findViewById(R.id.quran_text_btn_38);
        buttonText39 = findViewById(R.id.quran_text_btn_39);
        buttonText40 = findViewById(R.id.quran_text_btn_40);
        buttonText41 = findViewById(R.id.quran_text_btn_41);
        buttonText42 = findViewById(R.id.quran_text_btn_42);
        buttonText43 = findViewById(R.id.quran_text_btn_43);
        buttonText44 = findViewById(R.id.quran_text_btn_44);
        buttonText45 = findViewById(R.id.quran_text_btn_45);
        buttonText46 = findViewById(R.id.quran_text_btn_46);
        buttonText47 = findViewById(R.id.quran_text_btn_47);
        buttonText48 = findViewById(R.id.quran_text_btn_48);
        buttonText49 = findViewById(R.id.quran_text_btn_49);
        buttonText50 = findViewById(R.id.quran_text_btn_50);
        buttonText51 = findViewById(R.id.quran_text_btn_51);
        buttonText52 = findViewById(R.id.quran_text_btn_52);
        buttonText53 = findViewById(R.id.quran_text_btn_53);
        buttonText54 = findViewById(R.id.quran_text_btn_54);
        buttonText55 = findViewById(R.id.quran_text_btn_55);
        buttonText56 = findViewById(R.id.quran_text_btn_56);
        buttonText57 = findViewById(R.id.quran_text_btn_57);
        buttonText58 = findViewById(R.id.quran_text_btn_58);
        buttonText59 = findViewById(R.id.quran_text_btn_59);
        buttonText60 = findViewById(R.id.quran_text_btn_60);
        buttonText61 = findViewById(R.id.quran_text_btn_61);
        buttonText62 = findViewById(R.id.quran_text_btn_62);
        buttonText63 = findViewById(R.id.quran_text_btn_63);
        buttonText64 = findViewById(R.id.quran_text_btn_64);
        buttonText65 = findViewById(R.id.quran_text_btn_65);
        buttonText66 = findViewById(R.id.quran_text_btn_66);
        buttonText67 = findViewById(R.id.quran_text_btn_67);
        buttonText68 = findViewById(R.id.quran_text_btn_68);
        buttonText69 = findViewById(R.id.quran_text_btn_69);
        buttonText70 = findViewById(R.id.quran_text_btn_70);
        buttonText71 = findViewById(R.id.quran_text_btn_71);
        buttonText72 = findViewById(R.id.quran_text_btn_72);
        buttonText73 = findViewById(R.id.quran_text_btn_73);
        buttonText74 = findViewById(R.id.quran_text_btn_74);
        buttonText75 = findViewById(R.id.quran_text_btn_75);
        buttonText76 = findViewById(R.id.quran_text_btn_76);
        buttonText77 = findViewById(R.id.quran_text_btn_77);
        buttonText78 = findViewById(R.id.quran_text_btn_78);
        buttonText79 = findViewById(R.id.quran_text_btn_79);
        buttonText80 = findViewById(R.id.quran_text_btn_80);
        buttonText81 = findViewById(R.id.quran_text_btn_81);
        buttonText82 = findViewById(R.id.quran_text_btn_82);
        buttonText83 = findViewById(R.id.quran_text_btn_83);
        buttonText84 = findViewById(R.id.quran_text_btn_84);
        buttonText85 = findViewById(R.id.quran_text_btn_85);
        buttonText86 = findViewById(R.id.quran_text_btn_86);
        buttonText87 = findViewById(R.id.quran_text_btn_87);
        buttonText88 = findViewById(R.id.quran_text_btn_88);
        buttonText89 = findViewById(R.id.quran_text_btn_89);
        buttonText90 = findViewById(R.id.quran_text_btn_90);
        buttonText91 = findViewById(R.id.quran_text_btn_91);
        buttonText92 = findViewById(R.id.quran_text_btn_92);
        buttonText93 = findViewById(R.id.quran_text_btn_93);
        buttonText94 = findViewById(R.id.quran_text_btn_94);
        buttonText95 = findViewById(R.id.quran_text_btn_95);
        buttonText96 = findViewById(R.id.quran_text_btn_96);
        buttonText97 = findViewById(R.id.quran_text_btn_97);
        buttonText98 = findViewById(R.id.quran_text_btn_98);
        buttonText99 = findViewById(R.id.quran_text_btn_99);
        buttonText100 = findViewById(R.id.quran_text_btn_100);
        buttonText101 = findViewById(R.id.quran_text_btn_101);
        buttonText102 = findViewById(R.id.quran_text_btn_102);
        buttonText103 = findViewById(R.id.quran_text_btn_103);
        buttonText104 = findViewById(R.id.quran_text_btn_104);
        buttonText105 = findViewById(R.id.quran_text_btn_105);
        buttonText106 = findViewById(R.id.quran_text_btn_106);
        buttonText107 = findViewById(R.id.quran_text_btn_107);
        buttonText108 = findViewById(R.id.quran_text_btn_108);
        buttonText109 = findViewById(R.id.quran_text_btn_109);
        buttonText110 = findViewById(R.id.quran_text_btn_110);
        buttonText111 = findViewById(R.id.quran_text_btn_111);
        buttonText112 = findViewById(R.id.quran_text_btn_112);
        buttonText113 = findViewById(R.id.quran_text_btn_113);
        buttonText114 = findViewById(R.id.quran_text_btn_114);


        buttonText1.setOnClickListener(this);
        buttonText2.setOnClickListener(this);
        buttonText3.setOnClickListener(this);
        buttonText4.setOnClickListener(this);
        buttonText5.setOnClickListener(this);
        buttonText6.setOnClickListener(this);
        buttonText7.setOnClickListener(this);
        buttonText8.setOnClickListener(this);
        buttonText9.setOnClickListener(this);
        buttonText10.setOnClickListener(this);
        buttonText11.setOnClickListener(this);
        buttonText12.setOnClickListener(this);
        buttonText13.setOnClickListener(this);
        buttonText14.setOnClickListener(this);
        buttonText15.setOnClickListener(this);
        buttonText16.setOnClickListener(this);
        buttonText17.setOnClickListener(this);
        buttonText18.setOnClickListener(this);
        buttonText19.setOnClickListener(this);
        buttonText20.setOnClickListener(this);
        buttonText21.setOnClickListener(this);
        buttonText22.setOnClickListener(this);
        buttonText23.setOnClickListener(this);
        buttonText24.setOnClickListener(this);
        buttonText25.setOnClickListener(this);
        buttonText26.setOnClickListener(this);
        buttonText27.setOnClickListener(this);
        buttonText28.setOnClickListener(this);
        buttonText29.setOnClickListener(this);
        buttonText30.setOnClickListener(this);
        buttonText31.setOnClickListener(this);
        buttonText32.setOnClickListener(this);
        buttonText33.setOnClickListener(this);
        buttonText34.setOnClickListener(this);
        buttonText35.setOnClickListener(this);
        buttonText36.setOnClickListener(this);
        buttonText37.setOnClickListener(this);
        buttonText38.setOnClickListener(this);
        buttonText39.setOnClickListener(this);
        buttonText40.setOnClickListener(this);
        buttonText41.setOnClickListener(this);
        buttonText42.setOnClickListener(this);
        buttonText43.setOnClickListener(this);
        buttonText44.setOnClickListener(this);
        buttonText45.setOnClickListener(this);
        buttonText46.setOnClickListener(this);
        buttonText47.setOnClickListener(this);
        buttonText48.setOnClickListener(this);
        buttonText49.setOnClickListener(this);
        buttonText50.setOnClickListener(this);
        buttonText51.setOnClickListener(this);
        buttonText52.setOnClickListener(this);
        buttonText53.setOnClickListener(this);
        buttonText54.setOnClickListener(this);
        buttonText55.setOnClickListener(this);
        buttonText56.setOnClickListener(this);
        buttonText57.setOnClickListener(this);
        buttonText58.setOnClickListener(this);
        buttonText59.setOnClickListener(this);
        buttonText60.setOnClickListener(this);
        buttonText61.setOnClickListener(this);
        buttonText62.setOnClickListener(this);
        buttonText63.setOnClickListener(this);
        buttonText64.setOnClickListener(this);
        buttonText65.setOnClickListener(this);
        buttonText66.setOnClickListener(this);
        buttonText67.setOnClickListener(this);
        buttonText68.setOnClickListener(this);
        buttonText69.setOnClickListener(this);
        buttonText70.setOnClickListener(this);
        buttonText71.setOnClickListener(this);
        buttonText72.setOnClickListener(this);
        buttonText73.setOnClickListener(this);
        buttonText74.setOnClickListener(this);
        buttonText75.setOnClickListener(this);
        buttonText76.setOnClickListener(this);
        buttonText77.setOnClickListener(this);
        buttonText78.setOnClickListener(this);
        buttonText79.setOnClickListener(this);
        buttonText80.setOnClickListener(this);
        buttonText81.setOnClickListener(this);
        buttonText82.setOnClickListener(this);
        buttonText83.setOnClickListener(this);
        buttonText84.setOnClickListener(this);
        buttonText85.setOnClickListener(this);
        buttonText86.setOnClickListener(this);
        buttonText87.setOnClickListener(this);
        buttonText88.setOnClickListener(this);
        buttonText89.setOnClickListener(this);
        buttonText90.setOnClickListener(this);
        buttonText91.setOnClickListener(this);
        buttonText92.setOnClickListener(this);
        buttonText93.setOnClickListener(this);
        buttonText94.setOnClickListener(this);
        buttonText95.setOnClickListener(this);
        buttonText96.setOnClickListener(this);
        buttonText97.setOnClickListener(this);
        buttonText98.setOnClickListener(this);
        buttonText99.setOnClickListener(this);
        buttonText100.setOnClickListener(this);
        buttonText101.setOnClickListener(this);
        buttonText102.setOnClickListener(this);
        buttonText103.setOnClickListener(this);
        buttonText104.setOnClickListener(this);
        buttonText105.setOnClickListener(this);
        buttonText106.setOnClickListener(this);
        buttonText107.setOnClickListener(this);
        buttonText108.setOnClickListener(this);
        buttonText109.setOnClickListener(this);
        buttonText110.setOnClickListener(this);
        buttonText111.setOnClickListener(this);
        buttonText112.setOnClickListener(this);
        buttonText113.setOnClickListener(this);
        buttonText114.setOnClickListener(this);





    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.quran_text_btn_1 :

                Intent intent1 = new Intent(QuranTextActivity.this , QuranText_1Activity.class);
                startActivity(intent1);

                break;


            case R.id.quran_text_btn_2 :

                Intent intent2 = new Intent(QuranTextActivity.this , QuranText_2Activity.class);
                startActivity(intent2);

                break;


            case R.id.quran_text_btn_3 :

                Intent intent3 = new Intent(QuranTextActivity.this , QuranText_3Activity.class);
                startActivity(intent3);

                break;


            case R.id.quran_text_btn_4 :

                Intent intent4 = new Intent(QuranTextActivity.this , QuranText_4Activity.class);
                startActivity(intent4);

                break;


            case R.id.quran_text_btn_5 :

                Intent intent5 = new Intent(QuranTextActivity.this , QuranText_5Activity.class);
                startActivity(intent5);

                break;


            case R.id.quran_text_btn_6 :

                Intent intent6 = new Intent(QuranTextActivity.this , QuranText_6Activity.class);
                startActivity(intent6);

                break;


            case R.id.quran_text_btn_7 :

                Intent intent7 = new Intent(QuranTextActivity.this , QuranText_7Activity.class);
                startActivity(intent7);

                break;


            case R.id.quran_text_btn_8 :

                Intent intent8 = new Intent(QuranTextActivity.this , QuranText_8Activity.class);
                startActivity(intent8);

                break;


            case R.id.quran_text_btn_9 :

                Intent intent9 = new Intent(QuranTextActivity.this , QuranText_9Activity.class);
                startActivity(intent9);

                break;


            case R.id.quran_text_btn_10 :

                Intent intent10 = new Intent(QuranTextActivity.this , QuranText_10Activity.class);
                startActivity(intent10);

                break;


            case R.id.quran_text_btn_11 :

                Intent intent11 = new Intent(QuranTextActivity.this , QuranText_11Activity.class);
                startActivity(intent11);

                break;


            case R.id.quran_text_btn_12 :

                Intent intent12 = new Intent(QuranTextActivity.this , QuranText_12Activity.class);
                startActivity(intent12);

                break;


            case R.id.quran_text_btn_13 :

                Intent intent13 = new Intent(QuranTextActivity.this , QuranText_13Activity.class);
                startActivity(intent13);

                break;


            case R.id.quran_text_btn_14 :

                Intent intent14 = new Intent(QuranTextActivity.this , QuranText_14Activity.class);
                startActivity(intent14);

                break;


            case R.id.quran_text_btn_15 :

                Intent intent15 = new Intent(QuranTextActivity.this , QuranText_15Activity.class);
                startActivity(intent15);

                break;


            case R.id.quran_text_btn_16 :

                Intent intent16 = new Intent(QuranTextActivity.this , QuranText_16Activity.class);
                startActivity(intent16);

                break;


            case R.id.quran_text_btn_17 :

                Intent intent17 = new Intent(QuranTextActivity.this , QuranText_17Activity.class);
                startActivity(intent17);

                break;


            case R.id.quran_text_btn_18 :

                Intent intent18 = new Intent(QuranTextActivity.this , QuranText_18Activity.class);
                startActivity(intent18);

                break;


            case R.id.quran_text_btn_19 :

                Intent intent19 = new Intent(QuranTextActivity.this , QuranText_19Activity.class);
                startActivity(intent19);

                break;


            case R.id.quran_text_btn_20 :

                Intent intent20 = new Intent(QuranTextActivity.this , QuranText_20Activity.class);
                startActivity(intent20);

                break;


            case R.id.quran_text_btn_21 :

                Intent intent21 = new Intent(QuranTextActivity.this , QuranText_21Activity.class);
                startActivity(intent21);

                break;


            case R.id.quran_text_btn_22 :

                Intent intent22 = new Intent(QuranTextActivity.this , QuranText_22Activity.class);
                startActivity(intent22);

                break;


            case R.id.quran_text_btn_23 :

                Intent intent23 = new Intent(QuranTextActivity.this , QuranText_23Activity.class);
                startActivity(intent23);

                break;


            case R.id.quran_text_btn_24 :

                Intent intent24 = new Intent(QuranTextActivity.this , QuranText_24Activity.class);
                startActivity(intent24);

                break;


            case R.id.quran_text_btn_25 :

                Intent intent25 = new Intent(QuranTextActivity.this , QuranText_25Activity.class);
                startActivity(intent25);

                break;


            case R.id.quran_text_btn_26 :

                Intent intent26 = new Intent(QuranTextActivity.this , QuranText_26Activity.class);
                startActivity(intent26);

                break;


            case R.id.quran_text_btn_27 :

                Intent intent27 = new Intent(QuranTextActivity.this , QuranText_27Activity.class);
                startActivity(intent27);

                break;


            case R.id.quran_text_btn_28 :

                Intent intent28 = new Intent(QuranTextActivity.this , QuranText_28Activity.class);
                startActivity(intent28);

                break;


            case R.id.quran_text_btn_29 :

                Intent intent29 = new Intent(QuranTextActivity.this , QuranText_29Activity.class);
                startActivity(intent29);

                break;


            case R.id.quran_text_btn_30 :

                Intent intent30 = new Intent(QuranTextActivity.this , QuranText_30Activity.class);
                startActivity(intent30);

                break;


            case R.id.quran_text_btn_31 :

                Intent intent31 = new Intent(QuranTextActivity.this , QuranText_31Activity.class);
                startActivity(intent31);

                break;


            case R.id.quran_text_btn_32 :

                Intent intent32 = new Intent(QuranTextActivity.this , QuranText_32Activity.class);
                startActivity(intent32);

                break;


            case R.id.quran_text_btn_33 :

                Intent intent33 = new Intent(QuranTextActivity.this , QuranText_33Activity.class);
                startActivity(intent33);

                break;


            case R.id.quran_text_btn_34 :

                Intent intent34 = new Intent(QuranTextActivity.this , QuranText_34Activity.class);
                startActivity(intent34);

                break;


            case R.id.quran_text_btn_35 :

                Intent intent35 = new Intent(QuranTextActivity.this , QuranText_35Activity.class);
                startActivity(intent35);

                break;


            case R.id.quran_text_btn_36 :

                Intent intent36 = new Intent(QuranTextActivity.this , QuranText_36Activity.class);
                startActivity(intent36);

                break;


            case R.id.quran_text_btn_37 :

                Intent intent37 = new Intent(QuranTextActivity.this , QuranText_37Activity.class);
                startActivity(intent37);

                break;


            case R.id.quran_text_btn_38 :

                Intent intent38 = new Intent(QuranTextActivity.this , QuranText_38Activity.class);
                startActivity(intent38);

                break;


            case R.id.quran_text_btn_39 :

                Intent intent39 = new Intent(QuranTextActivity.this , QuranText_39Activity.class);
                startActivity(intent39);

                break;


            case R.id.quran_text_btn_40 :

                Intent intent40 = new Intent(QuranTextActivity.this , QuranText_40Activity.class);
                startActivity(intent40);

                break;


            case R.id.quran_text_btn_41 :

                Intent intent41 = new Intent(QuranTextActivity.this , QuranText_41Activity.class);
                startActivity(intent41);

                break;


            case R.id.quran_text_btn_42 :

                Intent intent42 = new Intent(QuranTextActivity.this , QuranText_42Activity.class);
                startActivity(intent42);

                break;


            case R.id.quran_text_btn_43 :

                Intent intent43 = new Intent(QuranTextActivity.this , QuranText_43Activity.class);
                startActivity(intent43);

                break;


            case R.id.quran_text_btn_44 :

                Intent intent44 = new Intent(QuranTextActivity.this , QuranText_44Activity.class);
                startActivity(intent44);

                break;


            case R.id.quran_text_btn_45 :

                Intent intent45 = new Intent(QuranTextActivity.this , QuranText_45Activity.class);
                startActivity(intent45);

                break;


            case R.id.quran_text_btn_46 :

                Intent intent46 = new Intent(QuranTextActivity.this , QuranText_46Activity.class);
                startActivity(intent46);

                break;


            case R.id.quran_text_btn_47 :

                Intent intent47 = new Intent(QuranTextActivity.this , QuranText_47Activity.class);
                startActivity(intent47);

                break;


            case R.id.quran_text_btn_48 :

                Intent intent48 = new Intent(QuranTextActivity.this , QuranText_48Activity.class);
                startActivity(intent48);

                break;


            case R.id.quran_text_btn_49 :

                Intent intent49 = new Intent(QuranTextActivity.this , QuranText_49Activity.class);
                startActivity(intent49);

                break;


            case R.id.quran_text_btn_50 :

                Intent intent50 = new Intent(QuranTextActivity.this , QuranText_50Activity.class);
                startActivity(intent50);

                break;


            case R.id.quran_text_btn_51 :

                Intent intent51 = new Intent(QuranTextActivity.this , QuranText_51Activity.class);
                startActivity(intent51);

                break;


            case R.id.quran_text_btn_52 :

                Intent intent52 = new Intent(QuranTextActivity.this , QuranText_52Activity.class);
                startActivity(intent52);

                break;


            case R.id.quran_text_btn_53 :

                Intent intent53 = new Intent(QuranTextActivity.this , QuranText_53Activity.class);
                startActivity(intent53);

                break;


            case R.id.quran_text_btn_54 :

                Intent intent54 = new Intent(QuranTextActivity.this , QuranText_54Activity.class);
                startActivity(intent54);

                break;


            case R.id.quran_text_btn_55 :

                Intent intent55 = new Intent(QuranTextActivity.this , QuranText_55Activity.class);
                startActivity(intent55);

                break;


            case R.id.quran_text_btn_56 :

                Intent intent56 = new Intent(QuranTextActivity.this , QuranText_56Activity.class);
                startActivity(intent56);

                break;


            case R.id.quran_text_btn_57 :

                Intent intent57 = new Intent(QuranTextActivity.this , QuranText_57Activity.class);
                startActivity(intent57);

                break;


            case R.id.quran_text_btn_58 :

                Intent intent58 = new Intent(QuranTextActivity.this , QuranText_58Activity.class);
                startActivity(intent58);

                break;


            case R.id.quran_text_btn_59 :

                Intent intent59 = new Intent(QuranTextActivity.this , QuranText_59Activity.class);
                startActivity(intent59);

                break;


            case R.id.quran_text_btn_60 :

                Intent intent60 = new Intent(QuranTextActivity.this , QuranText_60Activity.class);
                startActivity(intent60);

                break;


            case R.id.quran_text_btn_61 :

                Intent intent61 = new Intent(QuranTextActivity.this , QuranText_61Activity.class);
                startActivity(intent61);

                break;


            case R.id.quran_text_btn_62 :

                Intent intent62 = new Intent(QuranTextActivity.this , QuranText_62Activity.class);
                startActivity(intent62);

                break;


            case R.id.quran_text_btn_63 :

                Intent intent63 = new Intent(QuranTextActivity.this , QuranText_63Activity.class);
                startActivity(intent63);

                break;


            case R.id.quran_text_btn_64 :

                Intent intent64 = new Intent(QuranTextActivity.this , QuranText_64Activity.class);
                startActivity(intent64);

                break;


            case R.id.quran_text_btn_65 :

                Intent intent65 = new Intent(QuranTextActivity.this , QuranText_65Activity.class);
                startActivity(intent65);

                break;


            case R.id.quran_text_btn_66 :

                Intent intent66 = new Intent(QuranTextActivity.this , QuranText_66Activity.class);
                startActivity(intent66);

                break;


            case R.id.quran_text_btn_67 :

                Intent intent67 = new Intent(QuranTextActivity.this , QuranText_67Activity.class);
                startActivity(intent67);

                break;


            case R.id.quran_text_btn_68 :

                Intent intent68 = new Intent(QuranTextActivity.this , QuranText_68Activity.class);
                startActivity(intent68);

                break;


            case R.id.quran_text_btn_69 :

                Intent intent69 = new Intent(QuranTextActivity.this , QuranText_69Activity.class);
                startActivity(intent69);

                break;


            case R.id.quran_text_btn_70 :

                Intent intent70 = new Intent(QuranTextActivity.this , QuranText_70Activity.class);
                startActivity(intent70);

                break;


            case R.id.quran_text_btn_71 :

                Intent intent71 = new Intent(QuranTextActivity.this , QuranText_71Activity.class);
                startActivity(intent71);

                break;


            case R.id.quran_text_btn_72 :

                Intent intent72 = new Intent(QuranTextActivity.this , QuranText_72Activity.class);
                startActivity(intent72);

                break;


            case R.id.quran_text_btn_73 :

                Intent intent73 = new Intent(QuranTextActivity.this , QuranText_73Activity.class);
                startActivity(intent73);

                break;


            case R.id.quran_text_btn_74 :

                Intent intent74 = new Intent(QuranTextActivity.this , QuranText_74Activity.class);
                startActivity(intent74);

                break;


            case R.id.quran_text_btn_75 :

                Intent intent75 = new Intent(QuranTextActivity.this , QuranText_75Activity.class);
                startActivity(intent75);

                break;


            case R.id.quran_text_btn_76 :

                Intent intent76 = new Intent(QuranTextActivity.this , QuranText_76Activity.class);
                startActivity(intent76);

                break;


            case R.id.quran_text_btn_77 :

                Intent intent77 = new Intent(QuranTextActivity.this , QuranText_77Activity.class);
                startActivity(intent77);

                break;


            case R.id.quran_text_btn_78 :

                Intent intent78 = new Intent(QuranTextActivity.this , QuranText_78Activity.class);
                startActivity(intent78);

                break;


            case R.id.quran_text_btn_79 :

                Intent intent79 = new Intent(QuranTextActivity.this , QuranText_79Activity.class);
                startActivity(intent79);

                break;


            case R.id.quran_text_btn_80 :

                Intent intent80 = new Intent(QuranTextActivity.this , QuranText_80Activity.class);
                startActivity(intent80);

                break;


            case R.id.quran_text_btn_81 :

                Intent intent81 = new Intent(QuranTextActivity.this , QuranText_81Activity.class);
                startActivity(intent81);

                break;


            case R.id.quran_text_btn_82 :

                Intent intent82 = new Intent(QuranTextActivity.this , QuranText_82Activity.class);
                startActivity(intent82);

                break;


            case R.id.quran_text_btn_83 :

                Intent intent83 = new Intent(QuranTextActivity.this , QuranText_83Activity.class);
                startActivity(intent83);

                break;


            case R.id.quran_text_btn_84 :

                Intent intent84 = new Intent(QuranTextActivity.this , QuranText_84Activity.class);
                startActivity(intent84);

                break;


            case R.id.quran_text_btn_85 :

                Intent intent85 = new Intent(QuranTextActivity.this , QuranText_85Activity.class);
                startActivity(intent85);

                break;


            case R.id.quran_text_btn_86 :

                Intent intent86 = new Intent(QuranTextActivity.this , QuranText_86Activity.class);
                startActivity(intent86);

                break;


            case R.id.quran_text_btn_87 :

                Intent intent87 = new Intent(QuranTextActivity.this , QuranText_87Activity.class);
                startActivity(intent87);

                break;


            case R.id.quran_text_btn_88 :

                Intent intent88 = new Intent(QuranTextActivity.this , QuranText_88Activity.class);
                startActivity(intent88);

                break;


            case R.id.quran_text_btn_89 :

                Intent intent89 = new Intent(QuranTextActivity.this , QuranText_89Activity.class);
                startActivity(intent89);

                break;


            case R.id.quran_text_btn_90 :

                Intent intent90 = new Intent(QuranTextActivity.this , QuranText_90Activity.class);
                startActivity(intent90);

                break;


            case R.id.quran_text_btn_91 :

                Intent intent91 = new Intent(QuranTextActivity.this , QuranText_91Activity.class);
                startActivity(intent91);

                break;


            case R.id.quran_text_btn_92 :

                Intent intent92 = new Intent(QuranTextActivity.this , QuranText_92Activity.class);
                startActivity(intent92);

                break;


            case R.id.quran_text_btn_93 :

                Intent intent93 = new Intent(QuranTextActivity.this , QuranText_93Activity.class);
                startActivity(intent93);

                break;


            case R.id.quran_text_btn_94 :

                Intent intent94 = new Intent(QuranTextActivity.this , QuranText_94Activity.class);
                startActivity(intent94);

                break;


            case R.id.quran_text_btn_95 :

                Intent intent95 = new Intent(QuranTextActivity.this , QuranText_95Activity.class);
                startActivity(intent95);

                break;


            case R.id.quran_text_btn_96 :

                Intent intent96 = new Intent(QuranTextActivity.this , QuranText_96Activity.class);
                startActivity(intent96);

                break;


            case R.id.quran_text_btn_97 :

                Intent intent97 = new Intent(QuranTextActivity.this , QuranText_97Activity.class);
                startActivity(intent97);

                break;


            case R.id.quran_text_btn_98 :

                Intent intent98 = new Intent(QuranTextActivity.this , QuranText_98Activity.class);
                startActivity(intent98);

                break;


            case R.id.quran_text_btn_99 :

                Intent intent99 = new Intent(QuranTextActivity.this , QuranText_99Activity.class);
                startActivity(intent99);

                break;


            case R.id.quran_text_btn_100 :

                Intent intent100 = new Intent(QuranTextActivity.this , QuranText_100Activity.class);
                startActivity(intent100);

                break;


            case R.id.quran_text_btn_101 :

                Intent intent101 = new Intent(QuranTextActivity.this , QuranText_101Activity.class);
                startActivity(intent101);

                break;


            case R.id.quran_text_btn_102 :

                Intent intent102 = new Intent(QuranTextActivity.this , QuranText_102Activity.class);
                startActivity(intent102);

                break;


            case R.id.quran_text_btn_103 :

                Intent intent103 = new Intent(QuranTextActivity.this , QuranText_103Activity.class);
                startActivity(intent103);

                break;


            case R.id.quran_text_btn_104 :

                Intent intent104 = new Intent(QuranTextActivity.this , QuranText_104Activity.class);
                startActivity(intent104);

                break;


            case R.id.quran_text_btn_105 :

                Intent intent105 = new Intent(QuranTextActivity.this , QuranText_105Activity.class);
                startActivity(intent105);

                break;


            case R.id.quran_text_btn_106 :

                Intent intent106 = new Intent(QuranTextActivity.this , QuranText_106Activity.class);
                startActivity(intent106);

                break;


            case R.id.quran_text_btn_107 :

                Intent intent107 = new Intent(QuranTextActivity.this , QuranText_107Activity.class);
                startActivity(intent107);

                break;


            case R.id.quran_text_btn_108 :

                Intent intent108 = new Intent(QuranTextActivity.this , QuranText_108Activity.class);
                startActivity(intent108);

                break;


            case R.id.quran_text_btn_109 :

                Intent intent109 = new Intent(QuranTextActivity.this , QuranText_109Activity.class);
                startActivity(intent109);

                break;


            case R.id.quran_text_btn_110 :

                Intent intent110 = new Intent(QuranTextActivity.this , QuranText_110Activity.class);
                startActivity(intent110);

                break;


            case R.id.quran_text_btn_111 :

                Intent intent111 = new Intent(QuranTextActivity.this , QuranText_111Activity.class);
                startActivity(intent111);

                break;


            case R.id.quran_text_btn_112 :

                Intent intent112 = new Intent(QuranTextActivity.this , QuranText_112Activity.class);
                startActivity(intent112);

                break;


            case R.id.quran_text_btn_113 :

                Intent intent113 = new Intent(QuranTextActivity.this , QuranText_113Activity.class);
                startActivity(intent113);

                break;


            case R.id.quran_text_btn_114 :

                Intent intent114 = new Intent(QuranTextActivity.this , QuranText_114Activity.class);
                startActivity(intent114);

                break;




        }


    }
}