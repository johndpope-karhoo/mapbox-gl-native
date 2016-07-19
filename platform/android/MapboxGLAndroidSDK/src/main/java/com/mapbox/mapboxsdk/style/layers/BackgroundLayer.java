// This file is generated. Edit android/platform/scripts/generate-style-code.js, then run `make android-style-code`.
package com.mapbox.mapboxsdk.style.layers;

/**
 * Background Layer
 */
public class BackgroundLayer extends Layer {

    public BackgroundLayer(long nativePtr) {
        super(nativePtr);
    }

    public BackgroundLayer(String layerId) {
        initialize(layerId);
    }

    protected native void initialize(String layerId);

}
