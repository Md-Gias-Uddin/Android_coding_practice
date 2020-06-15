package com.example.ratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView ratingText,seeBarText;
    private RatingBar rating_Bar;
    private SeekBar seekBar;
    private Switch w_switch;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            rating_Bar  = (RatingBar) findViewById(R.id.ratingBarId);
            ratingText = (TextView) findViewById(R.id.ratingTextViewId);
            seeBarText = (TextView) findViewById(R.id.seeBarTextViewId);
            seekBar = (SeekBar) findViewById(R.id.seeBarId);
            w_switch = (Switch) findViewById(R.id.switchId);

            seeBarText.setText("Volume "+seekBar.getProgress()+"/"+seekBar.getMax());

            rating_Bar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
                @Override
                public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                    ratingText.setText("value "+ rating);
                }
            });
            seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    seeBarText.setText("Volume "+progress+"/"+seekBar.getMax());
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {
                    Toast.makeText(MainActivity.this,"onStartTrackingTouch",Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {
                    Toast.makeText(MainActivity.this,"onStopTrackingTouch",Toast.LENGTH_SHORT).show();
                }
            });

            w_switch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if(isChecked){
                        Toast.makeText(MainActivity.this,"Wifi is on",Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,"Wifi is off",Toast.LENGTH_SHORT).show();
                    }
                }
            });
    }
}
