package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShowsActivity extends AppCompatActivity implements View.OnClickListener{

    Button buttonAlshaarawy , buttonStories ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shows);

        buttonAlshaarawy = findViewById(R.id.alshaarawy_btn);
        buttonStories = findViewById(R.id.alqesas_fe_alqoran_btn);



        buttonAlshaarawy.setOnClickListener(this);
        buttonStories.setOnClickListener(this);


    }





    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.alshaarawy_btn :

                clicked_btn("https://htiedu-my.sharepoint.com/:f:/g/personal/42018183_hti_edu_eg/EophG4KSptxFq1kX-fLWtjsBnxSAriNEk9mJrOvqYO3t6g?e=jEiZsi");

                break;

            case R.id.alqesas_fe_alqoran_btn :

                clicked_btn("https://htiedu-my.sharepoint.com/:f:/g/personal/42018183_hti_edu_eg/EqnuGPgeB2tOvZor7tvZgZEB7zAUEav4vA9EeA8_s0HFAQ?e=fAX3zh");

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