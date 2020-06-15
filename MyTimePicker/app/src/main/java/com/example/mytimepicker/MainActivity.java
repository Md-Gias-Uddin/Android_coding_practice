package com.example.mytimepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    private TextView currentTextTime;
    private Button selectTimeButton;
    private TimePicker timePicker;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currentTextTime = (TextView) findViewById(R.id.currentTimeTxtID);
        selectTimeButton = (Button) findViewById(R.id.selectTimeButtonId);
        timePicker = (TimePicker) findViewById(R.id.TimepickerId);
        timePicker.setIs24HourView(true);
        //currentTextdate.setText("Current Date: "+currenDate());
        selectTimeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //currentTextTime.setText("Current Date: "+ currentTime());
                String string = timePicker.getCurrentHour()+":"+timePicker.getCurrentMinute();
                currentTextTime.setText("Current Time: "+string);
            }
        });
    }
//    String currentTime(){
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(timePicker.getCurrentHour()+":");
//        stringBuilder.append(timePicker.getCurrentMinute());
//
//        return stringBuilder.toString();
//    }

}
