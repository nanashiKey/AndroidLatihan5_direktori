package com.ngopidev.project.androidlatihan5_direktori.helpers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * created by Irfan Assidiq on 2019-05-22
 * email : assidiq.irfan@gmail.com
 **/
public class BookHelper extends SQLiteOpenHelper {
    final static String NAMADB = "books.db";
    final static int VERSIDB = 1;

    public BookHelper(Context context){
        super(context, NAMADB, null, VERSIDB);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String queryCreate = "CREATE TABLE" +
                " samplebooks(_id integer primary key autoincrement," +
                " title text, author text);";
        sqLiteDatabase.execSQL(queryCreate);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String dropQuery = "DROP TABLE IF EXISTS samplebooks";
        sqLiteDatabase.execSQL(dropQuery);
        onCreate(sqLiteDatabase);
    }
}
