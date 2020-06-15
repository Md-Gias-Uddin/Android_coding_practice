package com.example.guessinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private TextView GuessTxt,resultText;
    private EditText editText;
    private Button Check;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GuessTxt = (TextView) findViewById(R.id.guessTxtId);
        resultText = (TextView) findViewById(R.id.result_text_view_id);
        editText = (EditText) findViewById(R.id.edit_text_id);
        Check = (Button) findViewById(R.id.Check_b_id);
        Check.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String number = editText.getText().toString();

        if(number.isEmpty())
        {
            errorMsg();
        }
        else
        {
            int num = Integer.parseInt(number);
            Random random = new Random();
            int randomNumber = random.nextInt(5)+1;

            if(num>5)
            {
                errorMsg();
            }


            else if(num == randomNumber)
            {
                resultText.setText("Congratz You Won .The R_number is  "+randomNumber);
            }
            else if(num!=randomNumber)
            {
                resultText.setText("Alas You Loss .The R_number is  "+randomNumber);
            }
        }



    }

    public void errorMsg() {
        editText.setError("Enter a valid number");
        editText.requestFocus();
        return;
    }
}
