package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuranSoundActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonFares , buttonElsodis , buttonElqatamy , buttonElmoaqly , buttonElmenshawy , buttonElhosary , buttonElafasy , buttonAbdelbaset ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_sound);


        buttonAbdelbaset = findViewById(R.id.quran_sound_btn_abdelbaset);
        buttonElafasy = findViewById(R.id.quran_sound_btn_elafasy);
        buttonElhosary = findViewById(R.id.quran_sound_btn_hosary);
        buttonElmenshawy = findViewById(R.id.quran_sound_btn_elmenshawy);
        buttonElmoaqly = findViewById(R.id.quran_sound_btn_maher);
        buttonElqatamy = findViewById(R.id.quran_sound_btn_elqatamy);
        buttonElsodis = findViewById(R.id.quran_sound_btn_elsodis);
        buttonFares = findViewById(R.id.quran_sound_btn_fares);


        buttonAbdelbaset.setOnClickListener(this);
        buttonElafasy.setOnClickListener(this);
        buttonElhosary .setOnClickListener(this);
        buttonElmenshawy.setOnClickListener(this);
        buttonElmoaqly.setOnClickListener(this);
        buttonElqatamy.setOnClickListener(this);
        buttonElsodis.setOnClickListener(this);
        buttonFares.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.quran_sound_btn_abdelbaset :

                clicked_btn("https://htiedu-my.sharepoint.com/:f:/g/personal/42018183_hti_edu_eg/En3985nv6ZFBn8yx2KiEYS8BMokaSikJBnCBOA5PpUSXpw");

                break;

            case R.id.quran_sound_btn_elafasy :

                clicked_btn("https://htiedu-my.sharepoint.com/:f:/g/personal/42018183_hti_edu_eg/ElE9qLhyYaBJvpBcFArvA0EB42zxUNo4RLJ8_vpIZrNPMQ?e=YgyAws");

                break;

            case R.id.quran_sound_btn_elmenshawy :

               clicked_btn("https://htiedu-my.sharepoint.com/:f:/g/personal/42018183_hti_edu_eg/EtmoEHh2w0lIp8go_o3MU9cBd3MUMdSITKEs_lkHQ93edg?e=URRkPq");

                break;


            case R.id.quran_sound_btn_elqatamy :

                clicked_btn("https://htiedu-my.sharepoint.com/:f:/g/personal/42018183_hti_edu_eg/EoHZQZrn95lDqkeQQFawPNIBe2VxyD_bbF_gNOJXFtiurg?e=p017gd");

                break;

            case R.id.quran_sound_btn_elsodis :


              clicked_btn("https://htiedu-my.sharepoint.com/:f:/g/personal/42018183_hti_edu_eg/EqYkGN4d2oVLg814tYj14NIBQ-xEdBOtT8YyXBGseo_WwA?e=ZhgS5a");

                break;


            case R.id.quran_sound_btn_fares :

               clicked_btn("https://htiedu-my.sharepoint.com/:f:/g/personal/42018183_hti_edu_eg/EmMW1GqYeYFAhxznjVY8puIBN2cmw4uVgpjTDisIPi40DA?e=hsfrAT");

                break;

            case R.id.quran_sound_btn_hosary :

                clicked_btn("https://htiedu-my.sharepoint.com/:f:/g/personal/42018183_hti_edu_eg/EliFqq6QmnNJll2yIKSiwbwBaRtqYfFqqd68tDqN4ByJfA?e=mqbeKh");

                break;


            case R.id.quran_sound_btn_maher :

                clicked_btn("https://htiedu-my.sharepoint.com/:f:/g/personal/42018183_hti_edu_eg/ElKkcRyLNQ9DvtRjag2tDiIBPLzOCv5-nSovCqAXiWtrNQ?e=fAYNDI");

                break;



        }




    }


    public void clicked_btn(String url)
    {


        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);


    }




}