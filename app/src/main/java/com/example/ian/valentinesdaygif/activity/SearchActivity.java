package com.example.ian.valentinesdaygif.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.example.ian.valentinesdaygif.R;
import com.example.ian.valentinesdaygif.controller.Loader;

public class SearchActivity extends AppCompatActivity {

    private Loader mLoader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        CharSequence keyword = getIntent().getCharSequenceExtra(ListActivity.EXTRA_KEYWORD);
        setTitle(keyword);

        if (null != keyword) {
            mLoader = new Loader(this, keyword.toString().replaceAll(" ", "+").toLowerCase());
            mLoader.setRecyclerView((RecyclerView) findViewById(R.id.recyclerview));
            mLoader.load(new Loader.OnFinishListener() {
                @Override
                public void onFinish(boolean found) {
                    if (!found) {

                    }
                }
            });
        }
    }

}