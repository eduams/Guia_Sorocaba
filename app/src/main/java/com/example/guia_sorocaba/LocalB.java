package com.example.guia_sorocaba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LocalB extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local_b);

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openLink("https://www.google.com.br/maps/place/Parque+das+%C3%81guas+%22Maria+Barbosa+Silva%22/@-23.4729242,-47.4489701,17.83z/data=!4m10!1m2!2m1!1sparque+das+%C3%A1guas!3m6!1s0x94cf5ff803606b31:0xb0bec34df5cd8aff!8m2!3d-23.4714477!4d-47.4468849!15sChFwYXJxdWUgZGFzIMOhZ3Vhc5IBBHBhcmvgAQA!16s%2Fg%2F1pv21g_cd?entry=ttu");
            }
        });


        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openLink("https://turismo.sorocaba.sp.gov.br/visite/parque-das-aguas/");
            }
        });


        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                dialTel("(15) 3227-1173");
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