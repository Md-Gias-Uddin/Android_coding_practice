package com.example.myshareapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class feedBackActivity extends AppCompatActivity implements View.OnClickListener {

    private Button submitButton,clearButton;
    private EditText nameText,emailText,msgText;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_back);

        submitButton = (Button) findViewById(R.id.submitButtonId);
        clearButton = (Button) findViewById(R.id.clearButtonId);

        //Edit Text
        nameText = (EditText) findViewById(R.id.editTextNameId);
        emailText = (EditText) findViewById(R.id.editTextEmailId);
        msgText = (EditText) findViewById(R.id.editTextMsgId);
        clearButton.setOnClickListener(this);
        submitButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        try {


            if(v.getId()==R.id.submitButtonId)
            { Toast.makeText(getApplicationContext(), "Exception: ", Toast.LENGTH_SHORT).show();
                String name = nameText.getText().toString();
                String message = msgText.getText().toString();
                String email = emailText.getText().toString();
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/email");

                intent.putExtra(Intent.EXTRA_EMAIL,new String[] {"mdgiasu.cu@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT,"Feedback From App");
                intent.putExtra(Intent.EXTRA_TEXT,"Name: "+name+"\n"+"Email: "+email+"\nMessage: "+message);

                startActivity(intent.createChooser(intent,"Feedback With"));
            }
            else if(v.getId() == R.id.clearButtonId)
            {
                nameText.setText("");
                msgText.setText("");
                emailText.setText("");
            }
        }catch (Exception e)
        {
            Toast.makeText(getApplicationContext(), "Exception: "+e, Toast.LENGTH_SHORT).show();
        }
    }
}
