package com.example.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText titletxt,msgtext;
    private Button saveBtn,loadBtn;
    private TextView textView;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titletxt = (EditText) findViewById(R.id.titleId);
        msgtext = (EditText) findViewById(R.id.msgId);
        saveBtn = (Button) findViewById(R.id.saveBtnId);
        loadBtn = (Button) findViewById(R.id.loadBtnId);
        textView = (TextView) findViewById(R.id.textViewId);
        saveBtn.setOnClickListener(this);
        loadBtn.setOnClickListener(this);

    }




    String d = "1";
    String d1 = "2";
    public void onClick(View v) {


        if(v.getId()==R.id.saveBtnId)
        {
            d = d+"1";
            d1= d1+"1";
            String title = titletxt.getText().toString();
            String msg = msgtext.getText().toString();

            if(title.equals("") && msg.equals(""))
            {
                Toast.makeText(getApplicationContext(),"Enter some data",Toast.LENGTH_SHORT).show();
            }
            else
            {
                SharedPreferences sharedPreferences = getSharedPreferences("diary", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(d,title);
                editor.putString(d1,msg);
                editor.commit();
                Toast.makeText(getApplicationContext(),"Data Stored",Toast.LENGTH_SHORT).show();
            }


        }
        else if(v.getId()==R.id.loadBtnId)
        {
            SharedPreferences sharedPreferences = getSharedPreferences("diary", Context.MODE_PRIVATE);
            if(sharedPreferences.contains(d) && sharedPreferences.contains(d1))
            {
                String title = sharedPreferences.getString(d,"data not found");
                String msg = sharedPreferences.getString(d1,"data not found");

                textView.setText(title+"\n"+msg+"\n\n");

            }

        }
    }
}
