// This file is generated. Edit android/platform/scripts/generate-style-code.js, then run `make android-style-code`.
package com.mapbox.mapboxsdk.style.layers;

/**
 * Fill Layer
 */
public class FillLayer extends Layer {

    public FillLayer(long nativePtr) {
        super(nativePtr);
    }

    public FillLayer(String layerId, String sourceId) {
        initialize(layerId, sourceId);
    }

    protected native void initialize(String layerId, String sourceId);

}
