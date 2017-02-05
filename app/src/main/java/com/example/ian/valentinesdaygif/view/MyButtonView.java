package com.example.ian.valentinesdaygif.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.TextView;

public class MyButtonView extends TextView implements ViewTreeObserver.OnGlobalLayoutListener {

    public MyButtonView(Context context, AttributeSet attrs) {
        super(context, attrs);
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override
    public void onGlobalLayout() {
        Drawable[] img = getCompoundDrawables();
        int minSize = (int) (Math.min(getMeasuredHeight(), getMeasuredHeight()) * 0.7f);
        img[1].setBounds(0, 0, minSize, minSize);
        setCompoundDrawables(null, img[1], null, null);
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN) {
            getViewTreeObserver().removeGlobalOnLayoutListener(this);
        } else {
            getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
