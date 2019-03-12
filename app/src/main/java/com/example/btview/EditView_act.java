package com.example.btview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class EditView_act extends AppCompatActivity {

    private Button mlog_bt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_view_act);

        mlog_bt = findViewById(R.id.log_bt);
        mlog_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(EditView_act.this,"不管你输没输内容，都算登陆成功，不为你跳转",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
