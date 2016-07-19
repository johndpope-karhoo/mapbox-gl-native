// This file is generated. Edit android/platform/scripts/generate-style-code.js, then run `make android-style-code`.
package com.mapbox.mapboxsdk.style.layers;

/**
 * Circle Layer
 */
public class CircleLayer extends Layer {

    public CircleLayer(long nativePtr) {
        super(nativePtr);
    }

    public CircleLayer(String layerId, String sourceId) {
        initialize(layerId, sourceId);
    }

    protected native void initialize(String layerId, String sourceId);

}
