package com.example.guia_sorocaba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openLocalA();
            }
        });
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openLocalB();
            }
        });
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openLocalC();
            }
        });
    }

    public void openLocalA(){
        Intent intent = new Intent(this, LocalA.class);
        startActivity(intent);
    }

    public void openLocalB(){
        Intent intent = new Intent(this, LocalB.class);
        startActivity(intent);
    }


    public void openLocalC(){
        Intent intent = new Intent(this, LocalC.class);
        startActivity(intent);
    }

}