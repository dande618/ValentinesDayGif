package com.example.ian.valentinesdaygif.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ian.valentinesdaygif.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mButtonStart;
    private Button mButtonMore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonStart = (Button) findViewById(R.id.button_start);
        mButtonMore = (Button) findViewById(R.id.button_more);

        mButtonStart.setOnClickListener(this);
        mButtonMore.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == mButtonStart) {
            startActivity(new Intent(this, ListActivity.class));
        } else if (view == mButtonMore) {
            startActivity(new Intent(this, MoreActivity.class));
        }
    }
}
