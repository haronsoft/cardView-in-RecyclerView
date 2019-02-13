package com.example.wpapersmain;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView)findViewById(R.id.recycleview);
        //Set RecyclerView properties
       // mRecyclerView.setLayoutManager(new LinearLayoutManager(this)); //Linear layout
       mRecyclerView.setLayoutManager(new GridLayoutManager(this,2));//Grid Layout
       // mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,2));

        myAdapter = new MyAdapter(this,getPlayers());
        mRecyclerView.setAdapter(myAdapter);

    }
    //Add models to arrayList
    private ArrayList<Model> getPlayers(){
        ArrayList<Model> models = new ArrayList<>();

        //add some images from drwable folder
        Model p = new Model();
        p.setTitle("MainCharaceter");
        p.setDescription("This is where description goes");
        p.setImg(R.drawable.img5);
        models.add(p);

        p = new Model();
        p.setTitle("MainCharaceter");
        p.setDescription("This is where description goes");
        p.setImg(R.drawable.img8);
        models.add(p);

        p = new Model();
        p.setTitle("Laptops");
        p.setDescription("This is where description goes");
        p.setImg(R.drawable.img9);
        models.add(p);

        p = new Model();
        p.setTitle("Animations");
        p.setDescription("This is where description goes");
        p.setImg(R.drawable.img10);
        models.add(p);

        p = new Model();
        p.setTitle("Cartons");
        p.setDescription("This is where description goes");
        p.setImg(R.drawable.img11);
        models.add(p);

        p = new Model();
        p.setTitle("Players");
        p.setDescription("This is where description goes");
        p.setImg(R.drawable.img12);
        models.add(p);

        p = new Model();
        p.setTitle("Movies");
        p.setDescription("This is where description goes");
        p.setImg(R.drawable.img13);
        models.add(p);

        p = new Model();
        p.setTitle("Love");
        p.setDescription("This is where description goes");
        p.setImg(R.drawable.img14);
        models.add(p);

        p = new Model();
        p.setTitle("Programming");
        p.setDescription("This is where description goes");
        p.setImg(R.drawable.img15);
        models.add(p);

        p = new Model();
        p.setTitle("Natural");
        p.setDescription("This is where description goes");
        p.setImg(R.drawable.img16);
        models.add(p);

        p = new Model();
        p.setTitle("New staffs");
        p.setDescription("This is where description goes");
        p.setImg(R.drawable.img17);
        models.add(p);

        p = new Model();
        p.setTitle("New staffs");
        p.setDescription("This is where description goes");
        p.setImg(R.drawable.img18);
        models.add(p);

        p = new Model();
        p.setTitle("New staffs");
        p.setDescription("This is where description goes");
        p.setImg(R.drawable.img19);
        models.add(p);

        p = new Model();
        p.setTitle("New staffs");
        p.setDescription("This is where description goes");
        p.setImg(R.drawable.img20);
        models.add(p);

        p = new Model();
        p.setTitle("New staffs");
        p.setDescription("This is where description goes");
        p.setImg(R.drawable.img21);
        models.add(p);

        p = new Model();
        p.setTitle("New staffs");
        p.setDescription("This is where description goes");
        p.setImg(R.drawable.img22);
        models.add(p);

        p = new Model();
        p.setTitle("New staffs");
        p.setDescription("This is where description goes");
        p.setImg(R.drawable.img23);
        models.add(p);

        p = new Model();
        p.setTitle("New staffs");
        p.setDescription("This is where description goes");
        p.setImg(R.drawable.img24);
        models.add(p);

        p = new Model();
        p.setTitle("New staffs");
        p.setDescription("This is where description goes");
        p.setImg(R.drawable.img25);
        models.add(p);

        p = new Model();
        p.setTitle("New staffs");
        p.setDescription("This is where description goes");
        p.setImg(R.drawable.img26);
        models.add(p);

        p = new Model();
        p.setTitle("New staffs");
        p.setDescription("This is where description goes");
        p.setImg(R.drawable.img27);
        models.add(p);

        p = new Model();
        p.setTitle("New staffs");
        p.setDescription("This is where description goes");
        p.setImg(R.drawable.img28);
        models.add(p);

        p = new Model();
        p.setTitle("New staffs");
        p.setDescription("This is where description goes");
        p.setImg(R.drawable.img29);
        models.add(p);

        p = new Model();
        p.setTitle("New staffs");
        p.setDescription("This is where description goes");
        p.setImg(R.drawable.img30);
        models.add(p);

        p = new Model();
        p.setTitle("New staffs");
        p.setDescription("This is where description goes");
        p.setImg(R.drawable.img31);
        models.add(p);

        p = new Model();
        p.setTitle("New staffs");
        p.setDescription("This is where description goes");
        p.setImg(R.drawable.img14);
        models.add(p);
        return  models;
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());
        builder.setMessage("Do you want to exit");
        builder.setCancelable(true);
        builder.setIcon(R.drawable.img28);
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
        super.onBackPressed();
    }
}
