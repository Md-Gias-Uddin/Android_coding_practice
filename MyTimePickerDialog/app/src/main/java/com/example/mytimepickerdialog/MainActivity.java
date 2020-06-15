package com.example.mytimepickerdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView currentTextTime;
    private Button selectTimeButton;
    private TimePickerDialog timePickerDialog;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currentTextTime = (TextView) findViewById(R.id.currentTimeTxtID);
        selectTimeButton = (Button) findViewById(R.id.selectTimeButtonId);

        selectTimeButton.setOnClickListener(this);


        }

    @Override
    public void onClick(View v) {
        TimePicker timePicker = new TimePicker(this);
        int currentHour=timePicker.getCurrentHour();
        int currentMinutes = timePicker.getCurrentMinute();
        timePickerDialog = new TimePickerDialog(MainActivity.this,

                new TimePickerDialog.OnTimeSetListener() {


                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        currentTextTime.setText(hourOfDay + ":" + minute);
                    }
                },currentHour,currentMinutes,true);
        timePickerDialog.show();
}}
 