package com.example.FirstApp.DBUtils;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.icu.text.SimpleDateFormat;
import android.os.Build;
import android.os.Environment;

import androidx.annotation.RequiresApi;

import com.example.FirstApp.beans.*;

import java.io.File;
import java.util.Date;


public class Utils {
    public static boolean Insert(SQLiteDatabase db, people p){
        String SQL="INSERT INTO user(name,passwd,sex)values("+p.getName()+","+p.getPwd()+","+p.getSex()+")";
        try{
            db.execSQL(SQL);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
    // 删除
    public static boolean DeleteByname(SQLiteDatabase db,people p) {
        String SQL = "DELETE FROM user WHERE name=" + p.getName();
        try {
            db.execSQL(SQL);
            return true;
        }catch (Exception e){
            return false;
        }
    }
    // 登录验证
    public  static boolean verify(SQLiteDatabase db, String name,String passwd){
        String S="SELECT * FROM user";
        Cursor cursor=db.rawQuery(S,null);
        if(cursor!=null&&cursor.getCount()>0){
            String uname=cursor.getString(1);
            String pwd=cursor.getString(2);
            System.out.println(uname+" "+pwd);
            if(uname.equals(name)&&passwd.equals(pwd))return true;
        }
        return false;
    }



    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void videoRename(File recAudioFile) {
        String path = Environment.getExternalStorageDirectory()
                .getAbsolutePath()+ "/mahc/video/"+ "0" + "/";
        String fileName = new SimpleDateFormat("yyyyMMddHHmmss")
                .format(new Date()) + ".3gp";
        File out = new File(path);
        if (!out.exists()) {
            out.mkdirs();
        }
        out = new File(path, fileName);
        if (recAudioFile.exists())
            recAudioFile.renameTo(out);
    }

    /**
     * 用以计时操作的相关方法
     * @param num
     * @return
     */
    public static String format(int num){
        String s = num + "";
        if (s.length() == 1) {
            s = "0" + s;
        }
        return s;
    }

}
