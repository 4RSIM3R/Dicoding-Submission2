package com.studio.suku.submission2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.MyViewHolder> {

    Context context;
    private ArrayList<Item> items;

    private ArrayList<Item> getItems(){
        return items;
    }

    public Context ItemAdapter(Context context){
        return this.context = context;
    }

    public void setPemains(ArrayList<Item> items){
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        Picasso.get().load(items.get(i).getPhoto());

    }

    @Override
    public int getItemCount() {
        return getItems().size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView img;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
