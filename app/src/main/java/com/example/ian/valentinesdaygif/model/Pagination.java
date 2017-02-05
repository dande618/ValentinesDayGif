package com.example.ian.valentinesdaygif.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pagination {

    @SerializedName("total_count")
    @Expose
    public Integer totalCount;
    @SerializedName("count")
    @Expose
    public Integer count;
    @SerializedName("offset")
    @Expose
    public Integer offset;

}
