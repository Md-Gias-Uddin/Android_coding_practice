package com.example.cardviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    private Object CoordinatorLayout;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.btn_id);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btn_id)
        {Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show();
            Snackbar snackbar=Snackbar.make((View) CoordinatorLayout,"hello",Snackbar.LENGTH_SHORT);snackbar.show();
//            Intent intent =new Intent(MainActivity.this,BlankFragment2.class);
//            startActivity(intent);
        }
    }
}
