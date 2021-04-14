package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuranActivity extends AppCompatActivity {
Button buttonText , buttonSound , buttonExplanation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran);

        buttonText = findViewById(R.id.quran_text_btn_quran);
        buttonSound = findViewById(R.id.quran_sound_btn_quran);
        buttonExplanation = findViewById(R.id.quran_explanation_btn_quran);

        buttonText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(QuranActivity.this , QuranTextActivity.class);
                startActivity(intent);

            }
        });




        buttonSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(QuranActivity.this , QuranSoundActivity.class);
                startActivity(intent);

            }
        });



        buttonExplanation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(QuranActivity.this , QuranExplanationActivity.class);
                startActivity(intent);

            }
        });



    }
}