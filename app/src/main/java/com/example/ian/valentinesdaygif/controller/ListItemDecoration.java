package com.example.ian.valentinesdaygif.controller;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;

public class ListItemDecoration extends RecyclerView.ItemDecoration {
    private int space;

    public ListItemDecoration(int space) {
        this.space = space;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        int position = parent.getChildAdapterPosition(view);

        outRect.left = space;
        outRect.right = space;
        outRect.bottom = space;

        if (position == 0) {
            outRect.top = 0;
        } else {
            StaggeredGridLayoutManager.LayoutParams lp = (StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
            if (lp.getSpanIndex() == 0) {
                outRect.right = 0;
            }
        }
    }
}