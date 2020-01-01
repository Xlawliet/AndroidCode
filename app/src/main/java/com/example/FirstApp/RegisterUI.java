package com.example.FirstApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import com.example.FirstApp.DBUtils.DBHelper;
import com.example.FirstApp.DBUtils.Utils;
import com.example.FirstApp.beans.people;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

import static java.lang.Thread.sleep;

public class RegisterUI extends AppCompatActivity {

    private Button Register_back;
    private Button Register_commit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_ui);
        Register_back=findViewById(R.id.Register_back);
        Register_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转至登录界面
                Intent intent=new Intent(RegisterUI.this,MainActivity.class);
                startActivity(intent);
            }
        });

        Register_commit=findViewById(R.id.Register_commit);
        Register_commit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                //跳转至登录界面

                DBHelper dbHelper=MainActivity.getDbHelper();
                SQLiteDatabase db=dbHelper.getWritableDatabase();
                EditText nameText=(EditText)findViewById(R.id.editText4); //name
                EditText pwdText=(EditText)findViewById(R.id.editText5);      //password
                //EditText rrpwd=(EditText)findViewById(R.id.rrpwd);       //
                //Button sex=(RadioButton)findViewById(R.id.);          //sex
//                if(!rrpwd.equals(rrpwd)){
//                    // 提示出错
//                }
                if(1==0)
                {
                    System.out.println("错误！");
                }
                else{
                    people p=new people();
                    p.setName(nameText.toString());
                    p.setPwd(pwdText.toString());
                    p.setSex("1");// 这里暂时赋值
                    Utils.Insert(db,p);

                    Toast.makeText(getApplicationContext(), "3秒后回到登录界面", Toast.LENGTH_LONG).show();
                    Timer timer=new Timer();//实例化Timer类
                    TimerTask timerTask=new TimerTask() {
                        @Override
                        public void run() {
                            Intent intent = new Intent(RegisterUI.this, MainActivity.class);
                            startActivity(intent);
                        }
                    };
                    timer.schedule(timerTask,3000);//三千毫秒
                }
            }});


    }


}
