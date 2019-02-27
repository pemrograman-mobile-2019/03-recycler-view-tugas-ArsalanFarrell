package com.akohfarrell.recyclerviewtugas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initImageBitmaps();
    }

    private void initImageBitmaps() {

        mImageUrls.add("https://images.pexels.com/photos/614810/pexels-photo-614810.jpeg");
        mNames.add("Christopher McCain");

        mImageUrls.add("https://images.pexels.com/photos/762020/pexels-photo-762020.jpeg");
        mNames.add("Lauren Smith");

        mImageUrls.add("https://images.pexels.com/photos/1124724/pexels-photo-1124724.jpeg");
        mNames.add("Rachel Clementine");

        mImageUrls.add("https://images.pexels.com/photos/756453/pexels-photo-756453.jpeg");
        mNames.add("Samantha Brown");

        mImageUrls.add("https://images.pexels.com/photos/1130626/pexels-photo-1130626.jpeg");
        mNames.add("Catherine Hernandez");

        mImageUrls.add("https://images.pexels.com/photos/1468379/pexels-photo-1468379.jpeg");
        mNames.add("Jessica Lee");

        mImageUrls.add("https://images.pexels.com/photos/1649094/pexels-photo-1649094.jpeg");
        mNames.add("Maria Williams");

        mImageUrls.add("https://images.pexels.com/photos/774909/pexels-photo-774909.jpeg");
        mNames.add("Susan Young");

        mImageUrls.add("https://images.pexels.com/photos/415829/pexels-photo-415829.jpeg");
        mNames.add("Yui Adams");

        initRecyclerView();
    }

    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(mNames, mImageUrls, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
