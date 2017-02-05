
package com.example.ian.valentinesdaygif.model.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

public class GifInfo {

    @SerializedName("type")
    @Expose
    public String type;
    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("slug")
    @Expose
    public String slug;
    @SerializedName("url")
    @Expose
    public String url;
    @SerializedName("bitly_gif_url")
    @Expose
    public String bitlyGifUrl;
    @SerializedName("bitly_url")
    @Expose
    public String bitlyUrl;
    @SerializedName("embed_url")
    @Expose
    public String embedUrl;
    @SerializedName("username")
    @Expose
    public String username;
    @SerializedName("source")
    @Expose
    public String source;
    @SerializedName("rating")
    @Expose
    public String rating;
    @SerializedName("content_url")
    @Expose
    public String contentUrl;
    @SerializedName("source_tld")
    @Expose
    public String sourceTld;
    @SerializedName("source_post_url")
    @Expose
    public String sourcePostUrl;
    @SerializedName("is_indexable")
    @Expose
    public Integer isIndexable;
    @SerializedName("import_datetime")
    @Expose
    public String importDatetime;
    @SerializedName("trending_datetime")
    @Expose
    public String trendingDatetime;
    @SerializedName("images")
    @Expose
    public Images images;

}
