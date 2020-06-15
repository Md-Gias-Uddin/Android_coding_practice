package com.example.myshareapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button dhakabutton;
    private MenuItem shareItem,feedBackItem,aboutItem,rateUsItem,settingItem;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shareItem = (MenuItem) findViewById(R.id.shareId);
        feedBackItem = (MenuItem) findViewById(R.id.feedbackId);
        aboutItem = (MenuItem) findViewById(R.id.rateUsId);
       settingItem = (MenuItem) findViewById(R.id.settingId);

       dhakabutton = (Button) findViewById(R.id.btnId);
       dhakabutton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(v.getId()==R.id.btnId)
               {
                   Intent intent = new Intent(MainActivity.this,DhakaDivisionActivity.class);
                   startActivity(intent);
               }
           }
       });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater =getMenuInflater();
        menuInflater.inflate(R.menu.menu_share,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected( MenuItem item) {

        if(item.getItemId()==R.id.shareId)
        {
            Intent intent =new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            String subject = "Programming App";
            String body = "Download this";

            intent.putExtra(Intent.EXTRA_SUBJECT,subject);
            intent.putExtra(Intent.EXTRA_TEXT,body);

            startActivity(Intent.createChooser(intent,"Share With"));

            //Toast.makeText(this,"yes",Toast.LENGTH_SHORT).show();
        }

        else if(item.getItemId() == R.id.feedbackId)
        {
            Intent intent = new Intent(MainActivity.this,feedBackActivity.class);
            startActivity(intent);
        }
        else if(item.getItemId() == R.id.rateUsId)
        {
            Intent intent = new Intent(MainActivity.this,rateUsActivity.class);
            startActivity(intent);
        }else if(item.getItemId() == R.id.aboutUsId)
        {
            Intent intent = new Intent(MainActivity.this,aboutUsActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }


}
