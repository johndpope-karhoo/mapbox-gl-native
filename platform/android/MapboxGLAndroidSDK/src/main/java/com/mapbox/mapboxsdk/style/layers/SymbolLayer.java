// This file is generated. Edit android/platform/scripts/generate-style-code.js, then run `make android-style-code`.
package com.mapbox.mapboxsdk.style.layers;

/**
 * Symbol Layer
 */
public class SymbolLayer extends Layer {

    public SymbolLayer(long nativePtr) {
        super(nativePtr);
    }

    public SymbolLayer(String layerId, String sourceId) {
        initialize(layerId, sourceId);
    }

    protected native void initialize(String layerId, String sourceId);

}
