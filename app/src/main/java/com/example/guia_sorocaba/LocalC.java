package com.example.guia_sorocaba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LocalC extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local_c);

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openLink("https://www.google.com.br/maps/place/Est%C3%A1dio+Municipal+de+Sorocaba+Walter+Ribeiro(CIC)/@-23.4903863,-47.4534833,17z/data=!3m1!4b1!4m6!3m5!1s0x94cf6002a62ed069:0x3edcfb7dcd8e91f4!8m2!3d-23.4903864!4d-47.4486124!16s%2Fm%2F0k0fr9j?entry=ttu");
            }
        });


        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openLink("https://ecsaobento.com.br/site/page.php?id=62");
            }
        });


        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                dialTel("(15) 3329 3507");
            }
        });
    }

    public void openMapsActivity(final String link){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(link));
        startActivity(intent);
    }
    private void openLink (final String link) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(link));
        startActivity(intent);
    }
    private void dialTel(final String telNumber) {
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", telNumber, null)));
    }

}