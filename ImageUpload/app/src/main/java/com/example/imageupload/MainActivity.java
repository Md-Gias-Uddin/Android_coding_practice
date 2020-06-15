package com.example.imageupload;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private  ImageView anaconda_img,pho_img;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anaconda_img = findViewById(R.id.anaconda_img_Id);
        pho_img = findViewById(R.id.pho_img_id);
        anaconda_img.setOnClickListener(this);
        pho_img.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId()==(R.id.anaconda_img_Id)){
            LayoutInflater inflater = getLayoutInflater();
            View Custom_view = inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.custom_toast_layout_id));
            Toast toast = new Toast(MainActivity.this);
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);
            toast.setView(Custom_view);
            toast.show();
        }
        else if (v.getId()==(R.id.pho_img_id))
        {
            Toast.makeText(MainActivity.this,"pho image ",Toast.LENGTH_SHORT).show();
        }
    }
}
