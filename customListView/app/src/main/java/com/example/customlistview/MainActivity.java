package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String[] countryNames;
    private int[] flags={R.drawable.bangladesh,R.drawable.bb,R.drawable.cc,
            R.drawable.dd,R.drawable.ee,R.drawable.ff,
            R.drawable.gg, R.drawable.hh,R.drawable.ii,R.drawable.jj};
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listViewId);
        countryNames = getResources().getStringArray(R.array.country_Names);
       CustomAdapter adapter = new CustomAdapter(this,countryNames,flags);
       listView.setAdapter(adapter);
       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               String value = countryNames[position];
               if(position == 0) {

                   Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                   startActivity(intent);
               }
           }
       });
    }
}
