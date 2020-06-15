package com.example.tourismspot;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button dha_button, ctg_button, cum_button, raj_button, mym_button, khul_button, sylh_button;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dha_button = (Button) findViewById(R.id.dh_button_id);
        ctg_button = (Button) findViewById(R.id.ctg_button_id);
        sylh_button = (Button) findViewById(R.id.syl_button_id);
        raj_button = (Button) findViewById(R.id.raj_button_id);
        cum_button = (Button) findViewById(R.id.cum_button_id);
        mym_button = (Button) findViewById(R.id.mym_button_id);
        khul_button = (Button) findViewById(R.id.khu_button_id);

        dha_button.setOnClickListener(this);
        ctg_button.setOnClickListener(this);
        sylh_button.setOnClickListener(this);
        raj_button.setOnClickListener(this);
        cum_button.setOnClickListener(this);
        mym_button.setOnClickListener(this);
        khul_button.setOnClickListener(this);
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_share, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.shareId) {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            String subject = "Programming App";
            String body = "Download this";

            intent.putExtra(Intent.EXTRA_SUBJECT, subject);
            intent.putExtra(Intent.EXTRA_TEXT, body);

            startActivity(Intent.createChooser(intent, "Share With"));

        }
        else if (item.getItemId() == R.id.feedbackId) {
            Intent intent = new Intent(MainActivity.this, feedBackActivity.class);
            startActivity(intent);
        }
        else if (item.getItemId() == R.id.rateUsId) {
            Intent intent = new Intent(MainActivity.this, rateUsActivity.class);
            startActivity(intent);
        }
        else if (item.getItemId() == R.id.aboutUsId) {
            Intent intent = new Intent(MainActivity.this, aboutUsActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }


    public void onClick(View v) {
        if (v.getId() == R.id.dh_button_id) {
            Intent intent = new Intent(MainActivity.this, DhakaDivisionActivity.class);
            startActivity(intent);
        }
        else if (v.getId() == R.id.ctg_button_id) {
            Intent intent = new Intent(MainActivity.this, DhakaDivisionActivity.class);
            startActivity(intent);
        }
        else if (v.getId() == R.id.raj_button_id) {
            Intent intent = new Intent(MainActivity.this, RajshahiDivisionActivity.class);
            startActivity(intent);
        }
        else if (v.getId() == R.id.khu_button_id) {
            Intent intent = new Intent(MainActivity.this, KhulnaDivisionActivity.class);
            startActivity(intent);
        }
        else if (v.getId() == R.id.mym_button_id) {
            Intent intent = new Intent(MainActivity.this, MymensinghDivisionActivity.class);
            startActivity(intent);
        }
        else if (v.getId() == R.id.cum_button_id) {
            Intent intent = new Intent(MainActivity.this, CumillaDivisionActivity.class);
            startActivity(intent);
        }
        else if (v.getId() == R.id.syl_button_id) {
            Intent intent = new Intent(MainActivity.this, SylhetDivisionActivity.class);
            startActivity(intent);
        }
    }

}