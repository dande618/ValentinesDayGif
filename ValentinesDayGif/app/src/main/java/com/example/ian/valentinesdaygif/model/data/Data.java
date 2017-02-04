
package com.example.ian.valentinesdaygif.model.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Data {

    private List<Datum> data = null;
    private Meta meta;
    private Pagination pagination;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
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

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
