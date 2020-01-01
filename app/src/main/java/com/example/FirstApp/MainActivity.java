package com.example.FirstApp;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

// 自定义类的导入
import com.example.FirstApp.DBUtils.*;
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private  static DBHelper dbHelper;
    public static DBHelper getDbHelper(){
        return dbHelper;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 基本页面跳转逻辑
        Button regis=findViewById(R.id.Main_register);
        regis.setOnClickListener(this);

        //登录
        Button login=findViewById(R.id.Main_login);
        login.setOnClickListener(this);
        // 数据库的创建或者加载
        dbHelper=new DBHelper(getApplicationContext());
        SQLiteDatabase db=dbHelper.getReadableDatabase();
    }


    @Override
    public void onClick(View v) {
        SQLiteDatabase db=dbHelper.getReadableDatabase();
        switch (v.getId()){
            case R.id.Main_register:
                startActivity(new Intent(MainActivity.this,RegisterUI.class));
                break;
            case R.id.Main_login:
                EditText nameText=(EditText)findViewById(R.id.editText9);  //name
                String name=nameText.toString();
                EditText pwdText=(EditText)findViewById(R.id.editText);  //password
                String pwd=pwdText.toString();
                System.out.println(name+" "+pwd);
                startActivity(new Intent(MainActivity.this,PubilcSquare.class));
                if(1==1)
                {
                    // 跳转到正确的页面
                    System.out.println("登录成功！");
                }
//                if(Utils.verify(db,name,pwd)){
//                    // 跳转到正确的页面
//                    System.out.println("登录成功！");
//                }
                /////heiheihei
                else
                {
                    System.out.println("登录错误！");
                }

        }
    }
}
