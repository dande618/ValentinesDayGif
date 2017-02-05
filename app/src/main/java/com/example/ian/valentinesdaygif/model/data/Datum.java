
package com.example.ian.valentinesdaygif.model.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Datum {

    private List<GifInfo> data = null;
    private Meta meta;
    private Pagination pagination;

    public List<GifInfo> getGifInfoList() {
        return data;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

}
