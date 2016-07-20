package com.mapbox.mapboxsdk.style.sources;

import android.support.annotation.Keep;

public abstract class Source {
    private final String id;
    @Keep
    private final String type;
    @Keep
    private final Object value;

    protected Source(String id, String type, Object value) {
        this.id = id;
        this.type = type;
        this.value = value;
    }

    public String getId() {
        return id;
    }
}
