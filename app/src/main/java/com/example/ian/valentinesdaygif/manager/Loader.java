package com.example.ian.valentinesdaygif.manager;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.ian.valentinesdaygif.model.data.Data;
import com.google.gson.Gson;


public class Loader {
    private Context mContext;
    private RequestQueue mQueue;

    public Loader(Context context) {
        mContext = context;
        mQueue = Volley.newRequestQueue(mContext);
    }

    public void load() {
        Log.e("DK2017", "loading");
        String url = "http://api.giphy.com/v1/gifs/search?q=funny+cat&api_key=dc6zaTOxFJmzC&limit=8&offset=0";
        StringRequest jsObjRequest = new StringRequest
                (Request.Method.GET, url, new Response.Listener<String>() {

                    @Override
                    public void onResponse(String response) {
                        Gson gson = new Gson();
                        Data result = gson.fromJson(response, Data.class);
                        Log.e("DK2017", "" + result.getData().size());
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(mContext, "LOAD ERROR", Toast.LENGTH_SHORT).show();
                        Log.e("DK2017", "", error);
                    }
                });
        mQueue.add(jsObjRequest);
    }
}
