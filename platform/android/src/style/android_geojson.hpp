#pragma once

#include "value.hpp"

#include <mapbox/geojson.hpp>
#include <mbgl/style/conversion.hpp>
#include <mbgl/style/conversion/geojson.hpp>
#include <mbgl/util/rapidjson.hpp>
#include <mbgl/platform/log.hpp>
#include <jni/jni.hpp>

#include <sstream>
#include <string>

namespace mbgl {
namespace style {
namespace conversion {

template <>
Result<GeoJSON> convertGeoJSON(const mbgl::android::Value& value) {
    if (!value.isString()) {
        return Error { "JSON data must be a string" };
    }

    rapidjson::GenericDocument<rapidjson::UTF8<>, rapidjson::CrtAllocator> d;
    d.Parse(value.toString().c_str());

    if (d.HasParseError()) {
        std::stringstream message;
        message << d.GetErrorOffset() << " - " << rapidjson::GetParseError_En(d.GetParseError());

        return Error { message.str() };
    }

    conversion::Result<GeoJSON> geoJSON = conversion::convertGeoJSON<JSValue>(d);
    if (!geoJSON) {
        return Error { geoJSON.error().message };
    }

    return geoJSON;
}

} // namespace conversion
} // namespace style
} // namespace mbgl