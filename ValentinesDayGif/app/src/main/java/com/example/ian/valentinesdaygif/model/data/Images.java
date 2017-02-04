
package com.example.ian.valentinesdaygif.model.data;

import java.util.HashMap;
import java.util.Map;

public class Images {

    private FixedHeight fixedHeight;
    private FixedHeightStill fixedHeightStill;
    private FixedHeightDownsampled fixedHeightDownsampled;
    private FixedWidth fixedWidth;
    private FixedWidthStill fixedWidthStill;
    private FixedWidthDownsampled fixedWidthDownsampled;
    private FixedHeightSmall fixedHeightSmall;
    private FixedHeightSmallStill fixedHeightSmallStill;
    private FixedWidthSmall fixedWidthSmall;
    private FixedWidthSmallStill fixedWidthSmallStill;
    private Downsized downsized;
    private DownsizedStill downsizedStill;
    private DownsizedLarge downsizedLarge;
    private DownsizedMedium downsizedMedium;
    private Original original;
    private OriginalStill originalStill;
    private Looping looping;
    private Preview preview;
    private DownsizedSmall downsizedSmall;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public FixedHeight getFixedHeight() {
        return fixedHeight;
    }

    public void setFixedHeight(FixedHeight fixedHeight) {
        this.fixedHeight = fixedHeight;
    }

    public FixedHeightStill getFixedHeightStill() {
        return fixedHeightStill;
    }

    public void setFixedHeightStill(FixedHeightStill fixedHeightStill) {
        this.fixedHeightStill = fixedHeightStill;
    }

    public FixedHeightDownsampled getFixedHeightDownsampled() {
        return fixedHeightDownsampled;
    }

    public void setFixedHeightDownsampled(FixedHeightDownsampled fixedHeightDownsampled) {
        this.fixedHeightDownsampled = fixedHeightDownsampled;
    }

    public FixedWidth getFixedWidth() {
        return fixedWidth;
    }

    public void setFixedWidth(FixedWidth fixedWidth) {
        this.fixedWidth = fixedWidth;
    }

    public FixedWidthStill getFixedWidthStill() {
        return fixedWidthStill;
    }

    public void setFixedWidthStill(FixedWidthStill fixedWidthStill) {
        this.fixedWidthStill = fixedWidthStill;
    }

    public FixedWidthDownsampled getFixedWidthDownsampled() {
        return fixedWidthDownsampled;
    }

    public void setFixedWidthDownsampled(FixedWidthDownsampled fixedWidthDownsampled) {
        this.fixedWidthDownsampled = fixedWidthDownsampled;
    }

    public FixedHeightSmall getFixedHeightSmall() {
        return fixedHeightSmall;
    }

    public void setFixedHeightSmall(FixedHeightSmall fixedHeightSmall) {
        this.fixedHeightSmall = fixedHeightSmall;
    }

    public FixedHeightSmallStill getFixedHeightSmallStill() {
        return fixedHeightSmallStill;
    }

    public void setFixedHeightSmallStill(FixedHeightSmallStill fixedHeightSmallStill) {
        this.fixedHeightSmallStill = fixedHeightSmallStill;
    }

    public FixedWidthSmall getFixedWidthSmall() {
        return fixedWidthSmall;
    }

    public void setFixedWidthSmall(FixedWidthSmall fixedWidthSmall) {
        this.fixedWidthSmall = fixedWidthSmall;
    }

    public FixedWidthSmallStill getFixedWidthSmallStill() {
        return fixedWidthSmallStill;
    }

    public void setFixedWidthSmallStill(FixedWidthSmallStill fixedWidthSmallStill) {
        this.fixedWidthSmallStill = fixedWidthSmallStill;
    }

    public Downsized getDownsized() {
        return downsized;
    }

    public void setDownsized(Downsized downsized) {
        this.downsized = downsized;
    }

    public DownsizedStill getDownsizedStill() {
        return downsizedStill;
    }

    public void setDownsizedStill(DownsizedStill downsizedStill) {
        this.downsizedStill = downsizedStill;
    }

    public DownsizedLarge getDownsizedLarge() {
        return downsizedLarge;
    }

    public void setDownsizedLarge(DownsizedLarge downsizedLarge) {
        this.downsizedLarge = downsizedLarge;
    }

    public DownsizedMedium getDownsizedMedium() {
        return downsizedMedium;
    }

    public void setDownsizedMedium(DownsizedMedium downsizedMedium) {
        this.downsizedMedium = downsizedMedium;
    }

    public Original getOriginal() {
        return original;
    }

    public void setOriginal(Original original) {
        this.original = original;
    }

    public OriginalStill getOriginalStill() {
        return originalStill;
    }

    public void setOriginalStill(OriginalStill originalStill) {
        this.originalStill = originalStill;
    }

    public Looping getLooping() {
        return looping;
    }

    public void setLooping(Looping looping) {
        this.looping = looping;
    }

    public Preview getPreview() {
        return preview;
    }

    public void setPreview(Preview preview) {
        this.preview = preview;
    }

    public DownsizedSmall getDownsizedSmall() {
        return downsizedSmall;
    }

    public void setDownsizedSmall(DownsizedSmall downsizedSmall) {
        this.downsizedSmall = downsizedSmall;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
