package com.example.countyprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    private Button bd_button,pak_button,afg_button;
    private Intent intent;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bd_button = (Button) findViewById(R.id.bd_Id);
        pak_button = (Button) findViewById(R.id.pak_Id);
        afg_button = (Button) findViewById(R.id.afg_Id);
        bd_button.setOnClickListener(this);
        pak_button.setOnClickListener(this);
        afg_button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {


        if(v.getId()==R.id.bd_Id)
        {
             intent = new Intent(MainActivity.this,secondActivity.class);
            intent.putExtra("tag","Bangladesh");
            startActivity(intent);
        }
        if(v.getId()==R.id.pak_Id)
        {
             intent = new Intent(MainActivity.this,secondActivity.class);
            intent.putExtra("tag","Pakistan");
            startActivity(intent);
        }
        if(v.getId()==R.id.afg_Id)
        {
             intent = new Intent(MainActivity.this,secondActivity.class);
            intent.putExtra("tag","Afghanistan");
            startActivity(intent);
        }

    }
}
