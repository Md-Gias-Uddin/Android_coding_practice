package com.example.my_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    int[] images = {R.drawable.aa,R.drawable.bb,R.drawable.cc,
            R.drawable.dd,R.drawable.ee,R.drawable.ff,R.drawable.gg,
            R.drawable.hh,R.drawable.ii,R.drawable.jj,R.drawable.kk,R.drawable.ll};
    String[] name,desc;
    MyAdapter myAdapter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleViewId);

        name = getResources().getStringArray(R.array.country_Names);
        desc = getResources().getStringArray(R.array.country_desc);

        myAdapter = new MyAdapter(this,images,desc,name);
        recyclerView.setAdapter(myAdapter);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),2);
        recyclerView.setLayoutManager(gridLayoutManager);
    }
}
