package com.example.mydatabasedemo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MydatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME ="student.db";
    private static final String TABLE_NAME ="studentInfo";
    private static final int VERSION_NUMBER = 2;
    private static final String ID = "_id";
    public static final  String NAME = "Name";
    public static final  String AGE = "Age";
    public static final  String GENDER = "Gender";
    private static final String CREATE_TABLE ="CREATE TABLE "+TABLE_NAME+ "("+ID+" INTEGER  PRIMARY KEY AUTOINCREMENT ," +
            ""+NAME+" VARCHAR(25),"+AGE+" VARCHAR(20),"+GENDER+" VARCHAR(20) );";
    private static final String DROP_TABLE = "DROP TABLE IF EXISTS "+TABLE_NAME;
    private Context context;

    public MydatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, VERSION_NUMBER);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try{
            db.execSQL(CREATE_TABLE);
            Toast.makeText(context,"Database Created",Toast.LENGTH_SHORT).show();
        }catch (Exception e)
        {
            Toast.makeText(context,"Exception"+e,Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        try{
            db.execSQL(DROP_TABLE);
            onCreate(db);
            Toast.makeText(context,"ON update",Toast.LENGTH_SHORT).show();
        }catch (Exception e)
        {
            Toast.makeText(context,"Exception"+e,Toast.LENGTH_SHORT).show();
        }

    }
}

