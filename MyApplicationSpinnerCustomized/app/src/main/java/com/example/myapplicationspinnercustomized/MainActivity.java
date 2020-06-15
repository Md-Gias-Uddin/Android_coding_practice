package com.example.myapplicationspinnercustomized;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Spinner spinner;
    private String[] country_Names;
    private String[] population;
    int[] flags = {R.drawable.bangladesh,R.drawable.bb,R.drawable.cc,
            R.drawable.dd,R.drawable.ee,R.drawable.ff,
            R.drawable.gg, R.drawable.hh,R.drawable.ii,R.drawable.jj};

    private boolean isFirstSelected=true;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinnerId);
        country_Names = getResources().getStringArray(R.array.country_Names);
        population = getResources().getStringArray(R.array.population_array);

        customAdaptor adaptor = new customAdaptor(this,flags,country_Names,population);
        spinner.setAdapter(adaptor);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(isFirstSelected==true)
                {
                    isFirstSelected=false;
                }
                else
                Toast.makeText(getApplicationContext(),country_Names[position]+" is clicked",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
