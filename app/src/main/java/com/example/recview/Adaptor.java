package com.example.recview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recview.model.Item;

import java.util.ArrayList;

public class Adaptor extends RecyclerView.Adapter<Adaptor.ViewHolder>{

    ArrayList<Item> items;

    public Adaptor(ArrayList<Item> items) {
        this.items = items;
    }


    @NonNull
    @Override
    public Adaptor.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adaptor.ViewHolder holder, int position) {

        holder.textViewName.setText(items.get(position).getName());
        holder.textViewDescription.setText(items.get(position).getDescription());
        holder.imageViewImage.setImageResource(items.get(position).getImageResource());



    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageViewImage;
        TextView textViewName;
        TextView textViewDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewImage = itemView.findViewById(R.id.ivImage);
            textViewName = itemView.findViewById(R.id.tvTitle);
            textViewDescription = itemView.findViewById(R.id.tvDescription);

        }
    }

}
