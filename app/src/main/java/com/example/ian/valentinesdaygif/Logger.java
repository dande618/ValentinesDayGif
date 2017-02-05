package com.example.ian.valentinesdaygif;

import android.util.Log;

public class Logger {
    private static final String TAG = "GifViewer";
    private static final boolean DEBUG = true;

    public static void d(Object obj) {
        if (DEBUG)
            Log.d(TAG, "" + obj);
    }

    public static void e(Object obj, Throwable throwable) {
        if (DEBUG)
            Log.e(TAG, "" + obj, throwable);
    }
}
