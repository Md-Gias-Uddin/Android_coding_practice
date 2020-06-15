package com.example.datapicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView currentTextdate;
    private Button selectdateButton;
    private DatePicker datepicker;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currentTextdate = (TextView) findViewById(R.id.currentDateTxtID);
        selectdateButton = (Button) findViewById(R.id.selcetDateButtonId);
        datepicker = (DatePicker) findViewById(R.id.datepickerId);
        //currentTextdate.setText("Current Date: "+currenDate());
        selectdateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentTextdate.setText("Current Date: "+ currenDate());
            }
        });
    }
    String currenDate(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(datepicker.getDayOfMonth()+"/");
        stringBuilder.append((datepicker.getMonth()+1)+"/");
        stringBuilder.append(datepicker.getYear()+"/");
        return stringBuilder.toString();
    }

}
