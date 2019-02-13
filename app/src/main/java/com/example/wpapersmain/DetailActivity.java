package com.example.wpapersmain;

import android.app.WallpaperManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;

public class DetailActivity extends AppCompatActivity {

    //define an ImageView
    ImageView newImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //ActionBAR
        ActionBar actionBar = getSupportActionBar();

        //Initialize This imageView
        newImageView = (ImageView) findViewById(R.id.dImageIv);
//        Get and show data
        Intent intent = getIntent();
        byte mBytes[] = getIntent().getByteArrayExtra("iMAGE");
        //Decode byte array to Bitmap
        Bitmap bitmap = BitmapFactory.decodeByteArray(mBytes,0,mBytes.length);

        //Set Title to ActionBar
        actionBar.setTitle("SetterArea");
        newImageView.setImageBitmap(bitmap);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.setter,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
        public boolean onOptionsItemSelected(MenuItem item) {

        int item_id =item.getItemId();
        if (item_id == R.id.setwap){
            WallpaperManager wallpaperManager = WallpaperManager.getInstance(getApplicationContext());
            try {
                wallpaperManager.setResource(+R.drawable.img16);
            } catch (IOException e) {
                e.printStackTrace();
            }
            Toast.makeText(getApplicationContext(), "WallPapper set!!", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
