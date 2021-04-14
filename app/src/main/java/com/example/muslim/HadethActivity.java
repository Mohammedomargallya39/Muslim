package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HadethActivity extends AppCompatActivity  implements View.OnClickListener{

    Button buttonHadethSound , buttonSahehBnKhozayma , buttonSahehBokhary , buttonSahehMuslim;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadeth);

        buttonHadethSound = findViewById(R.id.ahadeth_sound_btn);
        buttonSahehBnKhozayma = findViewById(R.id.ebn_khozayma_btn);
        buttonSahehBokhary = findViewById(R.id.bukhary_right_btn);
        buttonSahehMuslim = findViewById(R.id.muslim_right_btn);

        buttonHadethSound.setOnClickListener(this);
        buttonSahehBnKhozayma.setOnClickListener(this);
        buttonSahehBokhary.setOnClickListener(this);
        buttonSahehMuslim.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.ahadeth_sound_btn :

                clicked_btn("https://htiedu-my.sharepoint.com/:f:/g/personal/42018183_hti_edu_eg/EstLMJ8yWNxOpZNTTrZI0FwBRQdClEMGZSETvi7vmc8xxQ?e=WJlVbW");

                break;

            case R.id.ebn_khozayma_btn :

                clicked_btn("https://htiedu-my.sharepoint.com/:f:/g/personal/42018183_hti_edu_eg/Eoq3Je12d_BMkpHktmDTu8oBXbvLY8EOTm_W4BNoumNVvg?e=jOqQa6");

                break;

            case R.id.bukhary_right_btn :

                clicked_btn("https://htiedu-my.sharepoint.com/:f:/g/personal/42018183_hti_edu_eg/Elz5d3JNyTNJhHIfEk9qkYUB5STP8SR3CmUiYdyE1j9Fsg?e=YUwDmq");

                break;


            case R.id.muslim_right_btn :

                clicked_btn("https://htiedu-my.sharepoint.com/:f:/g/personal/42018183_hti_edu_eg/EmeuZBp621hFj5L97JJt84IB-drdp0hO8eaNSnbLCv51FQ?e=TPTKly");

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