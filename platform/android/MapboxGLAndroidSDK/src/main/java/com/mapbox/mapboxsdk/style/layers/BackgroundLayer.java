package com.mapbox.mapboxsdk.style.layers;

import android.util.Log;

/**
 * Base class for the different Layer types
 */
public class BackgroundLayer extends Layer {

    public BackgroundLayer(long nativePtr) {
        super(nativePtr);
    }

    public BackgroundLayer() {
        super();
    }
}
