package com.example.myapplicationspinnercustomized;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.ContentView;

public class customAdaptor extends BaseAdapter {


    int[] flags;
    String[] country_names,population;
    Context context;
    private LayoutInflater inflater;

    public customAdaptor(Context context, int[] flags, String[] country_names, String[] population) {
        this.flags = flags;
        this.country_names = country_names;
        this.population = population;
        this.context = context;
    }

    public int getCount() {
        return population.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        if(convertView==null)
        {
            LayoutInflater  inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
           convertView = inflater.inflate(R.layout.sample_view_layout,parent,false);
        }

        ImageView imageView = (ImageView) convertView.findViewById(R.id.country_pic_Id);
        TextView textView = (TextView) convertView.findViewById(R.id.firsTextVewId);
        TextView textView1 = (TextView) convertView.findViewById(R.id.subTextVewId);

        imageView.setImageResource(flags[position]);
        textView.setText(country_names[position]);
        textView1.setText(population[position]);
        return convertView;

    }
}
