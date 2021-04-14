package com.example.muslim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BooksActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonMogezatAlqoran , buttonEhyaaOlomAlden , buttonEsterdadOmar , buttonAlesraaAndAlmerag , buttonAltouba,

    buttonAltareqElaAlqoran , buttonAlfathAleslamyLeMisr , buttonSeratKhatamAlnabyen , buttonSefatAlsafwa , buttonFattnySalah ,

    buttonQesasAlsahabah , buttonAlshama2elAlmohamadya , buttonKemyaaAlsalah , buttonLeanakAllah , buttonQesasAlanbiaa ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);

        buttonMogezatAlqoran = findViewById(R.id.mogezat_alqoran_btn);
        buttonEhyaaOlomAlden = findViewById(R.id.ehyaa_olom_alden_btn);
        buttonEsterdadOmar = findViewById(R.id.omar_back_btn);
        buttonAlesraaAndAlmerag = findViewById(R.id.alesraa_and_almerag_btn);
        buttonAltouba = findViewById(R.id.altouba_btn);
        buttonAltareqElaAlqoran = findViewById(R.id.way_to_qoran_btn);
        buttonAlfathAleslamyLeMisr = findViewById(R.id.alfath_aleslamy_to_misr_btn);
        buttonSeratKhatamAlnabyen = findViewById(R.id.mohammed_story_btn);
        buttonSefatAlsafwa = findViewById(R.id.sefat_alsafwa_btn);
        buttonFattnySalah = findViewById(R.id.fattny_salah_btn);
        buttonQesasAlsahabah = findViewById(R.id.qesas_alsahaba_alsalehen_btn);
        buttonAlshama2elAlmohamadya = findViewById(R.id.alshmael_almohamadya_btn);
        buttonKemyaaAlsalah = findViewById(R.id.pray_chimistry_btn);
        buttonLeanakAllah = findViewById(R.id.because_you_allah_btn);
        buttonQesasAlanbiaa = findViewById(R.id.qesas_alanbiaa_btn);

        buttonMogezatAlqoran.setOnClickListener(this);
        buttonEhyaaOlomAlden.setOnClickListener(this);
        buttonEsterdadOmar.setOnClickListener(this);
        buttonAlesraaAndAlmerag.setOnClickListener(this);
        buttonAltouba.setOnClickListener(this);
        buttonAltareqElaAlqoran.setOnClickListener(this);
        buttonAlfathAleslamyLeMisr .setOnClickListener(this);
        buttonSeratKhatamAlnabyen.setOnClickListener(this);
        buttonSefatAlsafwa.setOnClickListener(this);
        buttonFattnySalah.setOnClickListener(this);
        buttonQesasAlsahabah.setOnClickListener(this);
        buttonAlshama2elAlmohamadya.setOnClickListener(this);
        buttonKemyaaAlsalah.setOnClickListener(this);
        buttonLeanakAllah.setOnClickListener(this);
        buttonQesasAlanbiaa.setOnClickListener(this);






    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.mogezat_alqoran_btn :

                clicked_btn("https://htiedu-my.sharepoint.com/:f:/g/personal/42018183_hti_edu_eg/Eg4iLw2TleZBhGxY8fETtw8Bht5LGaPvZkHNNzBFRvzQ8A?e=LI3zFm");

                break;

            case R.id.ehyaa_olom_alden_btn :

                clicked_btn("https://htiedu-my.sharepoint.com/:f:/g/personal/42018183_hti_edu_eg/ErxAI86z2bNOnpV5Pozk8bcBcdHmm-laO2cXor8z38Dpmw?e=lcUMdw");

                break;

            case R.id.omar_back_btn :

                clicked_btn("https://htiedu-my.sharepoint.com/:f:/g/personal/42018183_hti_edu_eg/EpJjnBcXuTdIq7hJcu2BZXwBZ3fUvvxs_Slul4GbnBjkag?e=L1r9uC");

                break;


            case R.id.alesraa_and_almerag_btn :

                clicked_btn("https://htiedu-my.sharepoint.com/:f:/g/personal/42018183_hti_edu_eg/Eo55EJhyYSxBoBdHZG3SH9UBX2XlUs1aCcaRMpwYO7UsYA?e=3Yc6WX");

                break;

            case R.id.altouba_btn :

                clicked_btn("https://htiedu-my.sharepoint.com/:f:/g/personal/42018183_hti_edu_eg/EurysGLzbFhIqS3CziSWqJYBTJTCnwWZsRwGHEZsFwDK4w?e=lyFLMv");

                break;

            case R.id.way_to_qoran_btn :

                clicked_btn("https://htiedu-my.sharepoint.com/:f:/g/personal/42018183_hti_edu_eg/EllLHdn7rf1HmyzAnScPLOYBqKcW8nQZ15-AKenZR878CA?e=Y0V09e");

                break;

            case R.id.alfath_aleslamy_to_misr_btn :

                clicked_btn("https://htiedu-my.sharepoint.com/:f:/g/personal/42018183_hti_edu_eg/Ej8iy4WLx5NDpjckZA5lFcYB6454RmnNBHskL-5fO8uhFQ?e=G0nlLI");

                break;


            case R.id.mohammed_story_btn :

                clicked_btn("https://htiedu-my.sharepoint.com/:f:/g/personal/42018183_hti_edu_eg/ErZzTrjSN6tAppjQ7rbDUZYBsn2R29GPKzyxFNpxv1skFw?e=IqWGDp");

                break;


            case R.id.sefat_alsafwa_btn :

                clicked_btn("https://htiedu-my.sharepoint.com/:f:/g/personal/42018183_hti_edu_eg/EnJ3i58cd_FJpqnVt65xGc8B6t31nBOz5dNDgvas_n-WJg?e=0tsioL");

                break;


            case R.id.fattny_salah_btn :

                clicked_btn("https://htiedu-my.sharepoint.com/:f:/g/personal/42018183_hti_edu_eg/Eov1c6GRFU5HlusnWRDXtqwB0tGf4r5uDxnARL_17E715w?e=WjgQXk");

                break;


            case R.id.qesas_alsahaba_alsalehen_btn :

                clicked_btn("https://htiedu-my.sharepoint.com/:f:/g/personal/42018183_hti_edu_eg/EnDb3rPdt4NNvBdq23UdvsABBgdaCMvupMB78RGMN1FBDg?e=qquxc8");

                break;


            case R.id.alshmael_almohamadya_btn :

                clicked_btn("https://htiedu-my.sharepoint.com/:f:/g/personal/42018183_hti_edu_eg/EqrK60wp5xhKpOjqo3pdUPgBYWZPwH7Tsa78BPwwO0ybHg?e=QYFHSE");

                break;


            case R.id.pray_chimistry_btn :

                clicked_btn("https://htiedu-my.sharepoint.com/:f:/g/personal/42018183_hti_edu_eg/EnUJdLVqypRKq0SXtirdAZEB2L4M0X9YPFMGCn9RZr0GhA?e=XoYa5o");

                break;


            case R.id.because_you_allah_btn :

                clicked_btn("https://htiedu-my.sharepoint.com/:f:/g/personal/42018183_hti_edu_eg/Ek5v4uAaQxBHqtUiM6lSh-0B32XqY2ABOwVKNOOiuxyhYg?e=QTfrBR");

                break;



            case R.id.qesas_alanbiaa_btn :

                clicked_btn("https://htiedu-my.sharepoint.com/:f:/g/personal/42018183_hti_edu_eg/EkFRGPAxOQZPgPDt-9ScKJ4BVRoyWzhvBeqer9E-FckYxw?e=AQNHfh");

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