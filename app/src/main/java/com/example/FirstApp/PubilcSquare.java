package com.example.FirstApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PubilcSquare extends AppCompatActivity {

    private Button Square_Mine;
    private Button Square_Message;
    private Button Square_Search;
    private Button Square_camera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pubilc_square);
        //我的
        Square_Mine=findViewById(R.id.square_main);
        Square_Mine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转至我的界面
                Intent intent=new Intent(PubilcSquare.this,Mine.class);
                startActivity(intent);
            }
        });

        //消息
        Square_Message=findViewById(R.id.square_message);
        Square_Message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转至消息界面
                Intent intent=new Intent(PubilcSquare.this,Message.class);
                startActivity(intent);
            }
        });

        //搜索
        Square_Search=findViewById(R.id.Square_search);
        Square_Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转至搜索界面
                Intent intent=new Intent(PubilcSquare.this,Search.class);
                startActivity(intent);
            }
        });

        //搜索
        Square_camera=findViewById(R.id.camera);
        Square_camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转至搜索界面
                Intent intent=new Intent(PubilcSquare.this,PhotoTest.class);
                startActivity(intent);
            }
        });

    }
}
