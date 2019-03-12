package com.example.btview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Button_act extends AppCompatActivity {

    private Button inbt1;
    private Button inbt2;
    private Button inbt3;
    private Button inbt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_act);

        inbt1 = findViewById(R.id.inbt_1);
        inbt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Button_act.this,"第一个按钮已被你点击",Toast.LENGTH_SHORT).show();
            }
        });
        inbt2 = findViewById(R.id.inbt_2);
        inbt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Button_act.this,"第二个按钮已被你点击",Toast.LENGTH_SHORT).show();
            }
        });
        inbt3 = findViewById(R.id.inbt_3);
        inbt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Button_act.this,"第三个按钮已被你点击",Toast.LENGTH_SHORT).show();
            }
        });
        inbt4 = findViewById(R.id.inbt_4);
        inbt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Button_act.this,"第四个按钮已被你点击",Toast.LENGTH_SHORT).show();
            }
        });


    }


}
