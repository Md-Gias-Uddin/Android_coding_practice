package com.example.myshareapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;

public class ProgressBarActivity extends AppCompatActivity {

    private int progress;
    private ProgressBar progressBar;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);

        progressBar = (ProgressBar) findViewById(R.id.progressBarId);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();

            }

        });
        thread.start();

    }
    public void doWork(){

        for(progress=20;progress<=100;progress = progress+20){
            try {
                Thread.sleep(1000);//fill up howar jonno koto sec somoy nibe
                progressBar.setProgress(progress);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Intent intent = new Intent(ProgressBarActivity.this,MainActivity.class);
        startActivity(intent);
    }

    }

