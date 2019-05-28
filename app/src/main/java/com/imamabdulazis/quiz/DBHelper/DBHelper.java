package com.imamabdulazis.quiz.DBHelper;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.imamabdulazis.quiz.model.Kategori;
import com.imamabdulazis.quiz.model.Pertanyaan;
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

    public List<Pertanyaan> getPertanyaanByID(int kategori){
        SQLiteDatabase db= instance.getWritableDatabase();
        Cursor cursor=db.rawQuery(String.format("Select * From Question WHERE CategoryID=$id ORDER BY RANDOM() LIMIT 30",kategori),null);
        List<Pertanyaan> pertanyaans=new ArrayList<>();
        if (cursor.moveToFirst()){
            while (!cursor.isAfterLast()){
                Pertanyaan pertanyaan=new Pertanyaan(cursor.getInt(cursor.getColumnIndex("ID")),
                        cursor.getString(cursor.getColumnIndex("QuestionText")),
                        cursor.getString(cursor.getColumnIndex("QuestionImage")),
                        cursor.getString(cursor.getColumnIndex("AnswerA")),
                        cursor.getString(cursor.getColumnIndex("AnswerB")),
                        cursor.getString(cursor.getColumnIndex("AnswerC")),
                        cursor.getString(cursor.getColumnIndex("AnswerD")),
                        cursor.getString(cursor.getColumnIndex("CorrectAnswer")),
                        cursor.getInt(cursor.getColumnIndex("IsImageQuestion")),
                        cursor.getInt(cursor.getColumnIndex("CategoryID")));
                pertanyaans.add(pertanyaan);
                cursor.moveToNext();
            }
        }cursor.close();
        db.close();
        return pertanyaans;
    }
}
