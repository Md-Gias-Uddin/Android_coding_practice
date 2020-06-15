package com.example.myapplicationspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private Button button;
    private TextView textView;
    String[] countryNames;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinnerViewId);
        button = (Button) findViewById(R.id.printButtonId);
        textView = (TextView) findViewById(R.id.textViewId);

        countryNames = getResources().getStringArray(R.array.country_Names);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                R.layout.sample_view,R.id.sampleTextviewId,countryNames);
            spinner.setAdapter(adapter);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String name = spinner.getSelectedItem().toString();
                    textView.setText(name);
                }
            });


    }
}
