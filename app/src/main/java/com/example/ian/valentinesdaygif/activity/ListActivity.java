package com.example.ian.valentinesdaygif.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.example.ian.valentinesdaygif.R;
import com.example.ian.valentinesdaygif.manager.Loader;

public class ListActivity extends AppCompatActivity {

    private Loader mLoader;
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        mLoader = new Loader(this);
        mLoader.load();
    }
}
