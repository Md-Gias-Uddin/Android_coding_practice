package com.example.mytextfont;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView1,textView2;
    private Typeface typeface1,typeface2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = (TextView) findViewById(R.id.textViewId1);
        textView2 = (TextView) findViewById(R.id.textViewId2);
        typeface1 = Typeface.createFromAsset(getAssets(),"font/PTC55F.ttf");
        typeface2 = Typeface.createFromAsset(getAssets(),"font/PTC75F.ttf");

        textView1.setTypeface(typeface1);
        textView2.setTypeface(typeface2);
    }
}
