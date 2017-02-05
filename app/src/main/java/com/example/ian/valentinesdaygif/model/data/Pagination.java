
package com.example.ian.valentinesdaygif.model.data;

import java.util.HashMap;
import java.util.Map;

public class Pagination {

    private Integer totalCount;
    private Integer count;
    private Integer offset;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
