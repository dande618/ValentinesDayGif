package com.example.ian.valentinesdaygif.model.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FixedWidthStill {

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

}