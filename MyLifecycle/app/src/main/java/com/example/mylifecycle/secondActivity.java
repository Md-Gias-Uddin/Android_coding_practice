package com.example.mylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {
    //private TextView textView;
    private Button button;
    private EditText editText;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //textView = (TextView) findViewById(R.id.Second_ac_txt_id);
        button = (Button) findViewById(R.id.button_Txt_Id);
        editText = (EditText) findViewById(R.id.ac2_editText_Id) ;

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string = editText.getText().toString();
                Intent intent2 = new Intent(secondActivity.this,MainActivity.class);
                intent2.putExtra("key",string);
                setResult(1,intent2);
                finish();
            }
        });

//        //data get from main activity
//        Bundle bundle = getIntent().getExtras();
//        if(bundle!=null)
//        {
//            String value = bundle.getString("tag");
//            textView.setText(value);
//        }
    }
}
