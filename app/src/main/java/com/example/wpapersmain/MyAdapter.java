package com.example.wpapersmain;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.WallpaperManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {

    public MyAdapter(Context c, ArrayList<Model> models) {
        this.c = c;
        this.models = models;
    }

    Context c;
    ArrayList<Model> models;
    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        //Convert xml to View Object
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.model,null);
        //View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.model,null);
        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyHolder myHolder, final int i) {
        //Binding data with our views
        myHolder.mTitleTv.setText(models.get(i).getTitle());
        myHolder.mDescrTv.setText(models.get(i).getDescription());
        myHolder.mImageView.setImageResource(models.get(i).getImg());

        //Animation goes in here
      Animation animation = AnimationUtils.loadAnimation(c,android.R.anim.slide_in_left);
        myHolder.itemView.startAnimation(animation);

        //handle ClickListeners TO ITEMS
        myHolder.setItemClickListener(new ItemClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onItemClick(View v, int pos) {
                //getDataFromItemClicked
                BitmapDrawable bitmapDrawable = (BitmapDrawable) myHolder.mImageView.getDrawable();
                //get BitmapFrom Drawable
                Bitmap bitmap = bitmapDrawable.getBitmap();
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                //Compress image to reduce RAM usage
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);
                //Convert To Byte Array
                byte[] bytes = stream.toByteArray();
                //Input data to the new INtent
                Intent intent = new Intent(c,DetailActivity.class);
                intent.putExtra("iMAGE", bytes);
                c.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
