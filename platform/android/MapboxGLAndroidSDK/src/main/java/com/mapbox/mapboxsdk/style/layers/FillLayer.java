// This file is generated. Edit android/platform/scripts/generate-style-code.js, then run `make android-style-code`.
package com.mapbox.mapboxsdk.style.layers;

import com.mapbox.mapboxsdk.style.Filter;
import com.mapbox.mapboxsdk.style.Filterable;

/**
 * Fill Layer
 */
public class FillLayer extends Layer implements Filterable {

    public FillLayer(long nativePtr) {
        super(nativePtr);
    }

    public FillLayer(String layerId, String sourceId) {
        initialize(layerId, sourceId);
    }

    protected native void initialize(String layerId, String sourceId);

    public void setSourceLayer(String sourceLayer) {
        nativeSetSourceLayer(sourceLayer);
    }

    @Override
    public void setFilter(Filter.Statement filter) {
        this.setFilter(filter.toArray());
    }

    @Override
    public void setFilter(Object[] filter) {
        nativeSetFilter(filter);
    }

}
