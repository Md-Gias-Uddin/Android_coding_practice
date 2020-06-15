package com.example.countyprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    private TextView textView;
    private ImageView imageView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = (TextView) findViewById(R.id.ac2Text_id);
        imageView = (ImageView) findViewById(R.id.img_id_ac2);
        Bundle bundle = getIntent().getExtras();


        if(bundle!=null)
        {
            String value = bundle.getString("tag");

            if(value.equals("Bangladesh"))
            {
                imageView.setImageResource(R.drawable.a);
                textView.setText(R.string.about_bd_text);
            }

            if(value.equals("Pakistan"))
            {
                imageView.setImageResource(R.drawable.b);
                textView.setText(R.string.about_pak_text);
            }

            if(value.equals("Afghanistan"))
            {
                imageView.setImageResource(R.drawable.c);
                textView.setText(R.string.about_afg_text);
            }
        }
    }
}
