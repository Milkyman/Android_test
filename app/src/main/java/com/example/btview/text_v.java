package com.example.btview;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class text_v extends AppCompatActivity {

    private TextView tv4;
    private TextView tv5;
    private TextView tv6;
    private Button bt_bk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_v);

        tv4 = findViewById(R.id.tx_4);
        tv4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        tv4.getPaint().setAntiAlias(true);//去除锯齿

        tv5 = findViewById(R.id.tx_5);
        tv5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);

        tv6 = findViewById(R.id.tx_6);
        tv6.setSelected(true);

        bt_bk = findViewById(R.id.bt_bk);
        bt_bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(text_v.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }


}
