package com.example.myzoomcontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;
import android.widget.ZoomControls;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private ZoomControls zoomControls;
    private VideoView videoView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageViewId);
        zoomControls = (ZoomControls) findViewById(R.id.zoomControlId);
        videoView = (VideoView) findViewById(R.id.videoViewId);


        zoomControls.setOnZoomInClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Zoom in",Toast.LENGTH_SHORT).show();
                float x = imageView.getScaleX();
                float y = imageView.getScaleY();
               imageView.setScaleX((float)x+1);
               imageView.setScaleY((float)y+1);
            }
        });
        zoomControls.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Zoom out",Toast.LENGTH_SHORT).show();
                float x = imageView.getScaleX();
                float y = imageView.getScaleY();
               imageView.setScaleX((float)x-1);
               imageView.setScaleY((float)y-1);
            }
        });

        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.anis);
        videoView.setVideoURI(uri);


        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        videoView.start();
    }
}