package com.example.ian.valentinesdaygif.activity;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.example.ian.valentinesdaygif.R;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.drawable.ProgressBarDrawable;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;

public class OriginalActivity extends AppCompatActivity {

    public static final String EXTRA_URL_ORIGINAL = "url_original";
    public static final String EXTRA_URL_SHORT = "url_short";
    public static final String EXTRA_ASPECT_RATIO = "aspect_ratio";

    private SimpleDraweeView mSimpleDraweeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_original);
        mSimpleDraweeView = (SimpleDraweeView) findViewById(R.id.simpledraweeview);
        String originalUrl = getIntent().getStringExtra(EXTRA_URL_ORIGINAL);
        String shortUrl = getIntent().getStringExtra(EXTRA_URL_SHORT);
        float aspectRatio = getIntent().getFloatExtra(EXTRA_ASPECT_RATIO, 1f);
        DraweeController controller = Fresco.newDraweeControllerBuilder()
                .setAutoPlayAnimations(true)
                .setUri(Uri.parse(originalUrl))
                .build();
        mSimpleDraweeView.setController(controller);
        mSimpleDraweeView.setAspectRatio(aspectRatio);
        GenericDraweeHierarchy hierarchy = mSimpleDraweeView.getHierarchy();
        hierarchy.setActualImageScaleType(ScalingUtils.ScaleType.FIT_CENTER);
        hierarchy.setProgressBarImage(new ProgressBarDrawable());
        mSimpleDraweeView.setAdjustViewBounds(true);
    }
}
