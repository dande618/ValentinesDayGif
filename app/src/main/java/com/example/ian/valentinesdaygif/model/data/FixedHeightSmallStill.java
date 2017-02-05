
package com.example.ian.valentinesdaygif.model.data;

import java.util.HashMap;
import java.util.Map;

public class FixedHeightSmallStill {

    private String url;
    private String width;
    private String height;
    private String size;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
