package com.example.ian.valentinesdaygif.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FixedWidth {

    @SerializedName("url")
    @Expose
    public String url;
    @SerializedName("width")
    @Expose
    public String width;
    @SerializedName("height")
    @Expose
    public String height;
    @SerializedName("size")
    @Expose
    public String size;
    @SerializedName("mp4")
    @Expose
    public String mp4;
    @SerializedName("mp4_size")
    @Expose
    public String mp4Size;
    @SerializedName("webp")
    @Expose
    public String webp;
    @SerializedName("webp_size")
    @Expose
    public String webpSize;

}