package com.example.mygrid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;
    private String[] countryNames;
    private int[] flags={R.drawable.bangladesh,R.drawable.bb,R.drawable.cc,
            R.drawable.dd,R.drawable.ee,R.drawable.ff,
            R.drawable.gg, R.drawable.hh,R.drawable.ii,R.drawable.jj};
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.gridViewId);
        countryNames = getResources().getStringArray(R.array.country_Names);
        CustomAdapter adapter = new CustomAdapter(this,countryNames,flags);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = countryNames[position];
                Toast.makeText(MainActivity.this,value+position,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
