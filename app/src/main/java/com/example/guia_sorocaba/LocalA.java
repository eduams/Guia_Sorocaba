package com.example.guia_sorocaba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LocalA extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local_a);

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openLink("https://www.google.com.br/maps/place/Sesc+Sorocaba/@-23.5139964,-47.4637263,16.62z/data=!4m10!1m2!2m1!1ssesc!3m6!1s0x94c58a8fd6285a75:0xa45b8ef1532df178!8m2!3d-23.5135421!4d-47.4608628!15sCgRzZXNjIgOIAQGSARxzb2NpYWxfc2VydmljZXNfb3JnYW5pemF0aW9u4AEA!16s%2Fg%2F1tdfpchj?entry=ttu");
            }
        });


        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openLink("https://www.sescsp.org.br/");
            }
        });


        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                dialTel("(15) 3332-9933");
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