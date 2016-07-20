package com.mapbox.mapboxsdk.style.layers;

import android.util.Log;

/**
 * Base class for the different Layer types
 */
public abstract class Layer {

    private long nativePtr;

    public Layer(long nativePtr) {
        Log.i(Layer.class.getSimpleName(), "Native pointer constructor: " + nativePtr);
        this.nativePtr = nativePtr;
    }

    public Layer() {
        Log.i(Layer.class.getSimpleName(), "Default constructor");
    }

    @Override
    protected native void finalize() throws Throwable;

    public void setLayoutProperty(Property<?> property) {
        nativeSetLayoutProperty(property.name, property.value);
    }

    public void setPaintProperty(Property<?> property) {
        nativeSetPaintProperty(property.name, property.value);
    }

    public String getId() {
        return nativeGetId();
    }

    protected native String nativeGetId();

    protected native void nativeSetLayoutProperty(String name, Object value);

    protected native void nativeSetPaintProperty(String name, Object value);

    @Override
    public String toString() {
        return "Layer: " + getId();
    }

    public long getNativePtr() {
        return nativePtr;
    }
}
