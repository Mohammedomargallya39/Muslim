package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonQuran , buttonHades , buttonBooks , buttonShows , buttonSounds ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonQuran = findViewById(R.id.main_btn_quran);
        buttonHades = findViewById(R.id.main_btn_hades);
        buttonBooks = findViewById(R.id.main_btn_books);
        buttonShows = findViewById(R.id.main_btn_shows);
        buttonSounds = findViewById(R.id.main_btn_sounds);


        buttonQuran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , QuranActivity.class);
                startActivity(intent);
            }
        });

        buttonHades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , HadethActivity.class);
                startActivity(intent);
            }
        });

        buttonBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , BooksActivity.class);
                startActivity(intent);
            }
        });

        buttonShows.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , ShowsActivity.class);
                startActivity(intent);
            }
        });
        buttonSounds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicked_btn("https://htiedu-my.sharepoint.com/:f:/g/personal/42018183_hti_edu_eg/Ej0SEuy7W4BOvXkJXVc_EWYBmCwhrCaw7W28qkCUdSV2_g?e=a3DPeh");
            }
        });





    }


    public void clicked_btn(String url)
    {


        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);


    }

}