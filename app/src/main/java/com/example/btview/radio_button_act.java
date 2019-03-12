package com.example.btview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.security.acl.Group;

public class radio_button_act extends AppCompatActivity {

    private RadioGroup inrg1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button_act);

        inrg1 = findViewById(R.id.rg_2);//先找到组
        inrg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {//设置监听
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rdbt = findViewById(checkedId);
                Toast.makeText(radio_button_act.this,rdbt.getText(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
