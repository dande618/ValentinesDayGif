package com.example.ian.valentinesdaygif;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.facebook.drawee.backends.pipeline.Fresco;

public class GifApplication extends Application {

    private static RequestQueue sQueue;

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
        sQueue = Volley.newRequestQueue(this);
    }

    public static RequestQueue getRequestQueue() {
        return sQueue;
    }
}
