package com.example.btview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private Button bt1;
    private Button bt2;
    private Button bt3;
    private Button bt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 = findViewById(R.id.bt_1);
        bt2 = findViewById(R.id.bt_2);
        bt3 = findViewById(R.id.bt_3);
        bt4 = findViewById(R.id.bt_4);

        setListeners();

    }

    private void setListeners(){
        OnClick onClick = new OnClick();
        bt1.setOnClickListener(onClick);
        bt2.setOnClickListener(onClick);
        bt3.setOnClickListener(onClick);
        bt4.setOnClickListener(onClick);
    }

    private class OnClick implements View.OnClickListener{
        Intent intent = null;
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.bt_1:
                    intent = new Intent(MainActivity.this,text_v.class);
                    break;
                case R.id.bt_2:
                    intent = new Intent(MainActivity.this,Button_act.class);
                    break;
                case R.id.bt_3:
                    intent = new Intent(MainActivity.this,EditView_act.class);
                    break;
                case R.id.bt_4:
                    intent = new Intent(MainActivity.this, radio_button_act.class);
                    break;
            }
            startActivity(intent);
        }
    }
}
