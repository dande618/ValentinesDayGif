package com.example.ian.valentinesdaygif.controller;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.example.ian.valentinesdaygif.GifApplication;
import com.example.ian.valentinesdaygif.Logger;
import com.example.ian.valentinesdaygif.R;
import com.example.ian.valentinesdaygif.model.data.Datum;
import com.example.ian.valentinesdaygif.model.data.GifInfo;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import com.google.gson.Gson;

import java.util.List;


public class Loader {
    private Context mContext;
    private RecyclerView mRecyclerView;
    private GifAdapter mAdapter;
    private StaggeredGridLayoutManager mLayoutManager;

    private int mCurrentOffset = 0;
    private int mLimit = 8;
    private String mKeyword = "";
    private String mBaseUrl = "";

    private boolean mIsLoadingMore = false;

    public Loader(Context context) {
        mContext = context;
        mAdapter = new GifAdapter(mContext);
        mLimit = mContext.getResources().getInteger(R.integer.page_limit);
        mKeyword = mContext.getString(R.string.keyword);
        mBaseUrl = mContext.getString(R.string.base_url);
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        mRecyclerView = recyclerView;
        ListItemDecoration myItemDecorator = new ListItemDecoration(15);
        mRecyclerView.addItemDecoration(myItemDecorator);
        mLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.addOnScrollListener(new GifOnScrollListener());
    }

    private class GifOnScrollListener extends RecyclerView.OnScrollListener {
        @Override
        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            super.onScrolled(recyclerView, dx, dy);
            int[] lastVisibleItem = new int[2];
            ((StaggeredGridLayoutManager) mLayoutManager).findLastVisibleItemPositions(lastVisibleItem);
            int totalItemCount = mLayoutManager.getItemCount();
            Logger.d("onScrolled total:" + totalItemCount + " lastVisible:" + lastVisibleItem[1] + " dy:" + dy);
            if (lastVisibleItem[0] >= totalItemCount - 4 && dy >= 0) {
                if (mIsLoadingMore) {
                    Logger.d("ignore manually update!");
                } else {
                    load();
                }
            }
        }
    }

    public void load() {
        if (mIsLoadingMore) {
            Logger.d("loading more. exit.");
            return;
        }
        Logger.d("load start. limit:" + mLimit + " offset:" + mCurrentOffset);
        String url = String.format(mBaseUrl, mKeyword, mLimit, mCurrentOffset);
        StringRequest jsObjRequest = new StringRequest
                (Request.Method.GET, url, new Response.Listener<String>() {

                    @Override
                    public void onResponse(String response) {
                        Gson gson = new Gson();
                        Datum result = gson.fromJson(response, Datum.class);
                        int size = result.getGifInfoList().size();
                        mCurrentOffset += size;
                        if (0 == size) {
                            Toast.makeText(mContext, "No more gifs.", Toast.LENGTH_SHORT).show();
                        } else {
                            prefetch(result.getGifInfoList());
                            mAdapter.addAll(result.getGifInfoList());
                        }
                        Logger.d("onResponse size: " + result.getGifInfoList().size());
                        mIsLoadingMore = false;
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(mContext, "LOAD ERROR", Toast.LENGTH_SHORT).show();
                        mIsLoadingMore = false;
                        Logger.e("", error);
                    }
                });
        mIsLoadingMore = true;
        GifApplication.getRequestQueue().add(jsObjRequest);
    }

    private void prefetch(List<GifInfo> list) {
        for (GifInfo info : list) {
            ImageRequest request = ImageRequestBuilder.newBuilderWithSource(Uri.parse(info.images.fixedWidthSmall.url))
                    .setRequestPriority(Priority.LOW)
                    .setLocalThumbnailPreviewsEnabled(true)
                    .build();
            Fresco.getImagePipeline().prefetchToDiskCache(request, null);
        }
    }
}
