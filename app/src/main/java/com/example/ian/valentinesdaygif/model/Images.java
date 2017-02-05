package com.example.ian.valentinesdaygif.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Images {

    @SerializedName("fixed_width")
    @Expose
    public FixedWidth fixedWidth;
    @SerializedName("fixed_width_still")
    @Expose
    public FixedWidthStill fixedWidthStill;
    @SerializedName("fixed_width_downsampled")
    @Expose
    public FixedWidthDownsampled fixedWidthDownsampled;
    @SerializedName("fixed_width_small")
    @Expose
    public FixedWidthSmall fixedWidthSmall;
    @SerializedName("fixed_width_small_still")
    @Expose
    public FixedWidthSmallStill fixedWidthSmallStill;
    @SerializedName("downsized")
    @Expose
    public Downsized downsized;
    @SerializedName("downsized_still")
    @Expose
    public DownsizedStill downsizedStill;
    @SerializedName("downsized_large")
    @Expose
    public DownsizedLarge downsizedLarge;
    @SerializedName("downsized_medium")
    @Expose
    public DownsizedMedium downsizedMedium;
    @SerializedName("original")
    @Expose
    public Original original;
    @SerializedName("original_still")
    @Expose
    public OriginalStill originalStill;

}