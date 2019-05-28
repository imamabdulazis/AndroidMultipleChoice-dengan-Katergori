package com.imamabdulazis.quiz.DBHelper;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.imamabdulazis.quiz.model.Kategori;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

import java.util.ArrayList;
import java.util.List;

public class DBHelper extends SQLiteAssetHelper {
    private static  final String DB_NAME="EDMTQuiz2019.db";
    private static final int DB_VER=1;
    private static DBHelper instance;

    public static  synchronized DBHelper getInstance(Context context){
        if (instance==null)
            instance=new DBHelper(context);
        return instance;
    }


    public DBHelper(Context context){
        super(context,DB_NAME,null,DB_VER);
    }

    public List<Kategori> getAllCategory(){
        SQLiteDatabase db= instance.getWritableDatabase();
        Cursor cursor=db.rawQuery("Select * From Category",null);
        List<Kategori> categories=new ArrayList<>();
        if (cursor.moveToFirst()){
            while (!cursor.isAfterLast()){
                Kategori kategori =new Kategori(cursor.getInt(cursor.getColumnIndex("ID")),
                cursor.getString(cursor.getColumnIndex("Name")),
                cursor.getString(cursor.getColumnIndex("Image")));
                categories.add(kategori);
                cursor.moveToNext();
            }
        }cursor.close();
        db.close();
        return categories;
    }
}
