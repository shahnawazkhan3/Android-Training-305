package com.zaaviyah.apha_sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by pakistan laptop on 2/24/2018.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    private static  final String DADABASE_NAME= "shah.db";
    private  static final String TABLE_NAME="shah";



     public DatabaseHelper(Context context){
        super(context,DADABASE_NAME,null,1);

         SQLiteDatabase sqLiteDatabase =this.getWritableDatabase();
     }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE " +TABLE_NAME +
                " (ID INTEGER PRIMARY KEY AUTOINCREMENT ," +
                " NAME TEXT ," +
                " MOBILE_NUMBER INTEGER ," +
                "EMAIL TEXT)");
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("if exit"+TABLE_NAME);
        onCreate(db);

    }
}
