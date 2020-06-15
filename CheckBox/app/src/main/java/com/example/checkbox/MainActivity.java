package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    private CheckBox milkCheckBox,sugarCheckBox,waterCheckBox;
    private Button checkButton;
    private TextView resultTxtView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        milkCheckBox = (CheckBox) findViewById(R.id.milkCheckBoxId);
        sugarCheckBox = (CheckBox) findViewById(R.id.SugarCheckBoxId);
        waterCheckBox = (CheckBox) findViewById(R.id.WaterCheckBoxId);
        checkButton = (Button) findViewById(R.id.CheckButtonId);
        resultTxtView = (TextView) findViewById(R.id.resultTextViewId);

        checkButton.setOnClickListener(this);
        StringBuilder stringBuilder = new StringBuilder();

        if(milkCheckBox.isChecked())
        {
            String string = milkCheckBox.getText().toString();
            stringBuilder.append(string + " is checked");
        }
    }

    @Override
    public void onClick(View v) {
        StringBuilder stringBuilder = new StringBuilder();

        if(milkCheckBox.isChecked())
        {
            String string = milkCheckBox.getText().toString();
            stringBuilder.append(string + " is checked\n");
        }
        if(sugarCheckBox.isChecked())
        {
            String string = sugarCheckBox.getText().toString();
            stringBuilder.append(string + " is checked\n");
        }
        if(waterCheckBox.isChecked())
        {
            String string = waterCheckBox.getText().toString();
            stringBuilder.append(string + " is checked\n");
        }
        resultTxtView.setText(stringBuilder);
    }
}
