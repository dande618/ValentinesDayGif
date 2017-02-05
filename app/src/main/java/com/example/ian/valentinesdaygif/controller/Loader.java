package com.example.ian.valentinesdaygif.controller;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.example.ian.valentinesdaygif.GifApplication;
import com.example.ian.valentinesdaygif.Logger;
import com.example.ian.valentinesdaygif.model.data.Datum;
import com.google.gson.Gson;


public class Loader {
    private Context mContext;
    private RecyclerView mRecyclerView;
    private GifAdapter mAdapter;

    public Loader(Context context) {
        mContext = context;
        mAdapter = new GifAdapter(mContext);
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        mRecyclerView = recyclerView;
        mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        mRecyclerView.setAdapter(mAdapter);
    }

    public void load() {
        Logger.d("load start");
        String url = "http://api.giphy.com/v1/gifs/search?q=funny+cat&api_key=dc6zaTOxFJmzC&limit=3&offset=0";
        StringRequest jsObjRequest = new StringRequest
                (Request.Method.GET, url, new Response.Listener<String>() {

                    @Override
                    public void onResponse(String response) {
                        Gson gson = new Gson();
                        Datum result = gson.fromJson(response, Datum.class);
                        mAdapter.addAll(result.getGifInfoList());
                        Logger.d("onResponse size: " + result.getGifInfoList().size());
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(mContext, "LOAD ERROR", Toast.LENGTH_SHORT).show();
                        Logger.e("", error);
                    }
                });
        GifApplication.getRequestQueue().add(jsObjRequest);
    }
}
