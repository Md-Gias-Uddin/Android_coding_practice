package com.example.mymediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton playButton,pauseButton,nextButton,previousButton;
    private ImageView imageView;
    private MediaPlayer mediaPlayer;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playButton = (ImageButton) findViewById(R.id.playId);
        pauseButton = (ImageButton) findViewById(R.id.pauseId);
        nextButton = (ImageButton) findViewById(R.id.nextId);
        previousButton = (ImageButton) findViewById(R.id.previousId);

        imageView = (ImageView) findViewById(R.id.imageViewId);
         mediaPlayer = MediaPlayer.create(this,R.raw.media_islamic);

        playButton.setOnClickListener(this);
        pauseButton.setOnClickListener(this);
        nextButton.setOnClickListener(this);
        previousButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.playId)
        {
            if(mediaPlayer!=null)
            {
                mediaPlayer.start();
                Toast.makeText(this," play is clicked ",Toast.LENGTH_SHORT).show();
            }
        }
//        else if(v.getId()==R.id.nextId)
//        {
//            if(mediaPlayer!=null)
//            {
//                mediaPlayer;
//                Toast.makeText(this," next is clicked ",Toast.LENGTH_SHORT).show();
//            }
//        }
        else if(v.getId()==R.id.pauseId)
        {
            if(mediaPlayer!=null)
            {
                mediaPlayer.pause();
                int duration = mediaPlayer.getDuration()/1000;
                Toast.makeText(this," pause is clicked "+duration/60,Toast.LENGTH_SHORT).show();
            }
        }
//        else if(v.getId()==R.id.previousId)
//        {
//            if(mediaPlayer!=null)
//            {
//                mediaPlayer
//                Toast.makeText(this," previous is clicked ",Toast.LENGTH_SHORT).show();
//            }
//        }
   }

    @Override
    protected void onDestroy() {
        if(mediaPlayer!=null && mediaPlayer.isPlaying())
        {
            mediaPlayer.stop();
            mediaPlayer.release();;
            mediaPlayer = null;
        }
        super.onDestroy();
    }
}
