package com.example.ian.valentinesdaygif.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.ian.valentinesdaygif.R;
import com.example.ian.valentinesdaygif.controller.Loader;

public class ListActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {

    protected static final String EXTRA_KEYWORD = "extra_keyword";

    private Loader mLoader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        mLoader = new Loader(this, null);
        mLoader.setRecyclerView((RecyclerView) findViewById(R.id.recyclerview));
        mLoader.load(null);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_list, menu);
        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchItem);
        searchView.setOnQueryTextListener(this);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        return false;
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        if (TextUtils.isEmpty(query)) {
            Toast.makeText(this, getString(R.string.hint_keyword_empty), Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(this, SearchActivity.class);
            intent.putExtra(EXTRA_KEYWORD, query);
            startActivity(intent);
        }
        return true;
    }

}
