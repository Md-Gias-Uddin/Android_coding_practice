package com.example.myshareapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class rateUsActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate_us);

        button = (Button) findViewById(R.id.rate_us_button_id);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()== R.id.rate_us_button_id)
        {
            Toast.makeText(this, "Thanks for Rating", Toast.LENGTH_SHORT).show();
        }
    }
}
