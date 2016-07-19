// This file is generated. Edit android/platform/scripts/generate-style-code.js, then run `make android-style-code`.
package com.mapbox.mapboxsdk.style.layers;

/**
 * Line Layer
 */
public class LineLayer extends Layer {

    public LineLayer(long nativePtr) {
        super(nativePtr);
    }

    public LineLayer(String layerId, String sourceId) {
        initialize(layerId, sourceId);
    }

    protected native void initialize(String layerId, String sourceId);

}
