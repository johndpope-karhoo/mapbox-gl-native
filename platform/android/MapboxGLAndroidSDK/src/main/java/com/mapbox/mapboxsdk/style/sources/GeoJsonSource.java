package com.mapbox.mapboxsdk.style.sources;

import java.net.URL;

/**
 * Created by ivo on 20/07/16.
 */
public class GeoJsonSource extends Source {
    public static final String TYPE = "geojson";

    public GeoJsonSource(String id, String geoJson) {
        super(id, TYPE, geoJson);
    }

    public GeoJsonSource(String id, URL url) {
        super(id, TYPE, url.toExternalForm());
    }

}
