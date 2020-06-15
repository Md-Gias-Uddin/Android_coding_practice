package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    private Button selectButton;
    private RadioGroup radioGroup;
    private TextView resultTxtView,ratingText;
    private RadioButton genderButton;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        selectButton = (Button) findViewById(R.id.SelectButtonId);
        radioGroup= (RadioGroup) findViewById(R.id.radioGroupId);
        resultTxtView= (TextView) findViewById(R.id.resultTextViewId);

        selectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectid = radioGroup.getCheckedRadioButtonId();
                genderButton =(RadioButton) findViewById(selectid);
                String value = genderButton.getText().toString();
                resultTxtView.setText("You are "+value);
            }

    });


    }
}
