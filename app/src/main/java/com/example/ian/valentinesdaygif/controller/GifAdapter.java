package com.example.ian.valentinesdaygif.controller;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ian.valentinesdaygif.Logger;
import com.example.ian.valentinesdaygif.R;
import com.example.ian.valentinesdaygif.activity.OriginalActivity;
import com.example.ian.valentinesdaygif.model.GifInfo;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;
import java.util.Collection;

public class GifAdapter extends RecyclerView.Adapter<GifAdapter.GifViewHolder> {

    private Context mContext;
    private ArrayList<GifInfo> mGifInfoList = new ArrayList<GifInfo>();

    public GifAdapter(Context context) {
        mContext = context;
    }

    @Override
    public int getItemCount() {
        return mGifInfoList.size();
    }

    @Override
    public GifViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_layout, parent, false);
        return new GifViewHolder(view);
    }

    @Override
    public void onBindViewHolder(GifViewHolder holder, int position) {
        GifInfo gifInfo = mGifInfoList.get(position);
        if (null != gifInfo.images && null != gifInfo.images.fixedWidthSmall
                && null != gifInfo.images.fixedWidth.url) {
            Logger.d("onBindViewHolder setImageURI " + gifInfo.images.fixedWidthSmall.url);
            DraweeController controller = Fresco.newDraweeControllerBuilder()
                    .setAutoPlayAnimations(true)
                    .setUri(Uri.parse(gifInfo.images.fixedWidthSmall.url))
                    .build();
            holder.simpleDraweeView.setController(controller);
            holder.simpleDraweeView.setAspectRatio(
                    Float.valueOf(gifInfo.images.fixedWidthSmall.width) / Integer.valueOf(gifInfo.images.fixedWidthSmall.height));
            holder.simpleDraweeView.setOnClickListener(holder);
        } else {
            Logger.d("onBindViewHolder url null");
        }
    }

    public class GifViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        SimpleDraweeView simpleDraweeView;

        public GifViewHolder(View itemView) {
            super(itemView);
            simpleDraweeView = (SimpleDraweeView) itemView.findViewById(R.id.simpledraweeview);
        }

        @Override
        public void onClick(View view) {
            GifInfo info = mGifInfoList.get(getAdapterPosition());
            Intent intent = new Intent(mContext, OriginalActivity.class);
            intent.putExtra(OriginalActivity.EXTRA_URL_ORIGINAL, info.images.original.url);
            intent.putExtra(OriginalActivity.EXTRA_ASPECT_RATIO, Float.valueOf(info.images.original.width) /
                    Integer.valueOf(info.images.original.height));
            intent.putExtra(OriginalActivity.EXTRA_URL_SHORT, info.bitlyGifUrl);
            mContext.startActivity(intent);
        }
    }

    public void addAll(Collection<GifInfo> newGifInfos) {
        int size = mGifInfoList.size();
        mGifInfoList.addAll(newGifInfos);
        notifyItemRangeChanged(size, mGifInfoList.size());
    }
}

