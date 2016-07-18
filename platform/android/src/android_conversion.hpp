#pragma once

#include "value.hpp"

#include <mbgl/platform/log.hpp>
#include <mbgl/style/conversion.hpp>
#include <mbgl/util/feature.hpp>
#include <mbgl/util/optional.hpp>

#include <jni/jni.hpp>

namespace mbgl {
namespace style {
namespace conversion {


//XXX
#pragma GCC diagnostic ignored "-Wunused-parameter"

inline bool isUndefined(const mbgl::android::Value& value) {
    mbgl::Log::Debug(mbgl::Event::Android, "isUndefined");
    return value.isNull();
}

inline bool isArray(const mbgl::android::Value& value) {
    mbgl::Log::Debug(mbgl::Event::Android, "isArray");
    return value.isArray();
}

inline bool isObject(const mbgl::android::Value& value) {
    mbgl::Log::Debug(mbgl::Event::Android, "isObject");
    return value.isObject();
}

inline std::size_t arrayLength(const mbgl::android::Value& value) {
    mbgl::Log::Debug(mbgl::Event::Android, "arrayLength");
    //TODO
    return 0;
}

inline mbgl::android::Value arrayMember(const mbgl::android::Value& value, std::size_t i) {
    mbgl::Log::Debug(mbgl::Event::Android, "arrayMember");
    //TODO
    mbgl::android::Value newVal(value.jenv, nullptr);
    return newVal;
}

inline optional<mbgl::android::Value> objectMember(const mbgl::android::Value& value, const char* key) {
    mbgl::Log::Debug(mbgl::Event::Android, "objectMember");
    //TODO
    return {};
}

template <class Fn>
optional<Error> eachMember(const mbgl::android::Value& value, Fn&& fn) {
    mbgl::Log::Debug(mbgl::Event::Android, "eachMember");
    //TODO
    return {};
}

inline optional<bool> toBool(const mbgl::android::Value& value) {
    mbgl::Log::Debug(mbgl::Event::Android, "toBool");
    if (value.isBool()) {
        return value.toBool();
    } else {
        return {};
    }
}

inline optional<float> toNumber(const mbgl::android::Value& value) {
    mbgl::Log::Debug(mbgl::Event::Android, "toNumber");
    if (value.isNumber()) {
        return value.toNumber();
    } else {
        return {};
    }
}

inline optional<std::string> toString(const mbgl::android::Value& value) {
    mbgl::Log::Debug(mbgl::Event::Android, "toString");
    if (value.isString()) {
        return value.toString();
    } else {
        return {};
    }
}

inline optional<Value> toValue(const mbgl::android::Value& value) {
    mbgl::Log::Debug(mbgl::Event::Android, "toValue");
    if (value.isBool()) {
        return { value.toBool() };
    } else if (value.isString()) {
        return { value.toString() };
    } else if (value.isNumber()) {
       return { value.toNumber() };
    } else {
        return {};
    }
}

} // namespace conversion
} // namespace style
} // namespace mbgl