package com.example.wpapersmain;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    //Views
    ImageView mImageView;
    TextView mTitleTv, mDescrTv;
    //clickListener
    ItemClickListener itemClickListener;

    public MyHolder(@NonNull View itemView) {
        super(itemView);

        this.mImageView = itemView.findViewById(R.id.modelImageIv);
        this.mTitleTv = itemView.findViewById(R.id.modelTitleTv);
        this.mDescrTv = itemView.findViewById(R.id.modelDescrTv);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
this.itemClickListener.onItemClick(v, getLayoutPosition());
    }

    public void setItemClickListener(ItemClickListener ic){
        this.itemClickListener = ic;
    }
}
