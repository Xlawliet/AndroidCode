package com.example.FirstApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mine extends AppCompatActivity {

    private Button Mine_Message;
    private Button Mine_Square;
    private Button Mine_Search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine);

        //消息
        Mine_Message=findViewById(R.id.Mine_message);
        Mine_Message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转至消息界面
                Intent intent=new Intent(Mine.this,Message.class);
                startActivity(intent);
            }
        });

        //广场
        Mine_Square=findViewById(R.id.Mine_square);
        Mine_Square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转至广场界面
                Intent intent=new Intent(Mine.this,PubilcSquare.class);
                startActivity(intent);
            }
        });

        //搜索
        Mine_Search=findViewById(R.id.Mine_search);
        Mine_Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转至搜索界面
                Intent intent=new Intent(Mine.this,Search.class);
                startActivity(intent);
            }
        });
    }
}
