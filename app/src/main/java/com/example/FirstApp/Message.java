package com.example.FirstApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Message extends AppCompatActivity {

    private Button Message_Mine;
    private Button Message_Square;
    private Button Message_Search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        //我的
        Message_Mine=findViewById(R.id.message_mine);
        Message_Mine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转至我的界面
                Intent intent=new Intent(Message.this,Mine.class);
                startActivity(intent);
            }
        });

        //搜索
        Message_Search=findViewById(R.id.message_search);
        Message_Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转至搜索界面
                Intent intent=new Intent(Message.this,Search.class);
                startActivity(intent);
            }
        });

        //广场
        Message_Square=findViewById(R.id.message_square);
        Message_Square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转至广场界面
                Intent intent=new Intent(Message.this,PubilcSquare.class);
                startActivity(intent);
            }
        });
    }
}
