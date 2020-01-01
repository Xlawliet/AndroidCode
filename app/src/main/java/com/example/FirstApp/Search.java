package com.example.FirstApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Search extends AppCompatActivity {

    private Button Search_Mine;
    private Button Search_Square;
    private Button Search_Message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        //我的
        Search_Mine=findViewById(R.id.Search_mine);
        Search_Mine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转至我的界面
                Intent intent=new Intent(Search.this,Mine.class);
                startActivity(intent);
            }
        });

        //广场
        Search_Square=findViewById(R.id.Search_square);
        Search_Square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转至广场界面
                Intent intent=new Intent(Search.this,PubilcSquare.class);
                startActivity(intent);
            }
        });

        //消息
        Search_Message=findViewById(R.id.Search_message);
        Search_Message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转至消息界面
                Intent intent=new Intent(Search.this,Message.class);
                startActivity(intent);
            }
        });
    }
}
