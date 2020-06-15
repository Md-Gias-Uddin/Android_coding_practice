package com.example.edit_text;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText1,editText2;
    private Button addButton,subButton;
    private TextView resultTextView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.editText1_id);
        editText2 = (EditText) findViewById(R.id.editText2_id);
        addButton = (Button) findViewById(R.id.add_b_id);
        subButton = (Button) findViewById(R.id.sub_b_id);
        resultTextView = (TextView) findViewById(R.id.result_text_v_id);

        addButton.setOnClickListener(this);
        subButton.setOnClickListener(this);
    }


    public void onClick(View v) {
        try{
            String number1 = editText1.getText().toString();
            String number2 = editText2.getText().toString();

            double num1 = Double.parseDouble(number1);
            double num2 = Double.parseDouble(number2);


            if(v.getId()==R.id.add_b_id)
            {
                double sum = num1+num2;
                resultTextView.setText("result: "+sum);
            }
            else if(v.getId()==R.id.sub_b_id)
            {
                double sub = num1-num2;
                resultTextView.setText("result: "+sub);
            }
        }catch(Exception error){
            Toast.makeText(MainActivity.this,"Please Enter Numbers", Toast.LENGTH_SHORT).show();

        }

    }
}
