package com.example.my_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    int[] images;
    String[] desc,names;

    public MyAdapter(Context context, int[] images, String[] desc, String[] names) {
        this.context = context;
        this.images = images;
        this.desc = desc;
        this.names = names;
    }


    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.recycle_view,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.imageView.setImageResource(images[position]);
        holder.txtName.setText(names[position]);
        holder.txtDesc.setText(desc[position]);

    }

    @Override
    public int getItemCount() {

        return names.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txtName,txtDesc;
        ImageView imageView;
       public MyViewHolder(@NonNull View itemView) {
           super(itemView);

           txtName = itemView.findViewById(R.id.firstTextId);
           txtDesc = itemView.findViewById(R.id.secondTextId);
           imageView = itemView.findViewById(R.id.imageid);
       }
   }
}
