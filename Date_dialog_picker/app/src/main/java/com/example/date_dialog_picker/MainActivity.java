package com.example.date_dialog_picker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    private TextView selectdatetext;
    private Button selectDateButton;
    private DatePickerDialog datePickerDialog;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        selectDateButton = (Button) findViewById(R.id.selectdateButtonId);
        selectdatetext = (TextView) findViewById(R.id.dateTxtViewId);

        selectDateButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        DatePicker datePicker = new DatePicker(this);
        int currentYear = datePicker.getYear();
        int currentMonth = datePicker.getMonth();
        int currentDay = datePicker.getDayOfMonth();


        datePickerDialog=new DatePickerDialog(this,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        selectdatetext.setText(dayOfMonth+"/"+(month+1)+"/"+year);
                    }
                },currentYear,currentMonth,currentDay);
        datePickerDialog.show();
    }
}
