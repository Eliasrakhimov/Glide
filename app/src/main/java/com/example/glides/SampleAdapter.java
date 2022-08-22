package com.example.glides;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;


public class SampleAdapter extends RecyclerView.Adapter<SampleAdapter.AdapterHolder>{
    Context context;
    ArrayList<String> mStringArrayList;

    public SampleAdapter(Context context, ArrayList<String> mStringArrayList) {
        this.context = context;
        this.mStringArrayList = mStringArrayList;
    }

    @NonNull
    @Override
    public AdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.model, parent, false);
        return new AdapterHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterHolder holder, int position) {
        Glide.with(context).load(mStringArrayList.get(position))
                .skipMemoryCache(true)
                .into(holder.mImageView);
    }

    @Override
    public int getItemCount() {
        return mStringArrayList.size();
    }

    class AdapterHolder extends RecyclerView.ViewHolder {
       ImageView mImageView;
       public AdapterHolder(@NonNull View itemView) {
           super(itemView);
           mImageView = itemView.findViewById(R.id.images);
       }
   }
}
