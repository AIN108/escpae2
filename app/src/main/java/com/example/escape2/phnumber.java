package com.example.escape2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class phnumber extends AppCompatActivity {
    private Button btn_1;
    private Button btn_2;
    private Button btn_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phnumber);

        btn_1=findViewById(R.id.btn_1);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (phnumber.this, seoul.class);
                startActivity(intent);
        btn_2=findViewById(R.id.btn_2);
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(phnumber.this,gyunggi.class);
                startActivity(intent1);
         btn_3=findViewById(R.id.btn_3);
         btn_3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent2 = new Intent(phnumber.this, incheon.class);
                 startActivity(intent2);
             }
         });
            }
        });
            }
        });

    }
}