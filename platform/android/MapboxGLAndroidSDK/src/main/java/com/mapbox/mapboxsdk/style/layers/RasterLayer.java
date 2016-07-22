// This file is generated. Edit android/platform/scripts/generate-style-code.js, then run `make android-style-code`.
package com.mapbox.mapboxsdk.style.layers;

/**
 * Raster Layer
 */
public class RasterLayer extends Layer {

    public RasterLayer(long nativePtr) {
        super(nativePtr);
    }

    public RasterLayer(String layerId, String sourceId) {
        initialize(layerId, sourceId);
    }

    protected native void initialize(String layerId, String sourceId);

    public void setSourceLayer(String sourceLayer) {
        nativeSetSourceLayer(sourceLayer);
    }

}
