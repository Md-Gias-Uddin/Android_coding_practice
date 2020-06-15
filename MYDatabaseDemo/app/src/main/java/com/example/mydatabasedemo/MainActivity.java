package com.example.mydatabasedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    MydatabaseHelper mydatabaseHelper;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mydatabaseHelper = new MydatabaseHelper(this);
        SQLiteDatabase sqLiteDatabase = mydatabaseHelper.getWritableDatabase();
    }
}
