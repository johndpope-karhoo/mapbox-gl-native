package com.mapbox.mapboxsdk.style;

/**
 * Created by ivo on 21/07/16.
 */
public interface Filterable {

    void setFilter(Filter.Statement filter);

    void setFilter(Object[] rawFilter);

}
