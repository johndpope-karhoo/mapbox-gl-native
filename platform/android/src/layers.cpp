#include "layers.hpp"

#include <mbgl/style/layers/background_layer.hpp>

#include "background_layer.hpp"

namespace mbgl {
namespace android {

Layer* initializeLayerPeer(mbgl::Map& map, mbgl::style::Layer& coreLayer) {
    Layer* layer;
    if (coreLayer.is<mbgl::style::BackgroundLayer>()) {
        layer = new BackgroundLayer(map, *coreLayer.as<mbgl::style::BackgroundLayer>());
        //XXX other cases
    } else {
        //layer = new Layer(map, coreLayer);
        throw new std::runtime_error("Layer type not implemented");
    }

    return layer;
}

jni::jobject* createJavaLayerPeer(jni::JNIEnv& env, mbgl::Map& map, mbgl::style::Layer& coreLayer) {
    std::unique_ptr<Layer> peerLayer = std::unique_ptr<Layer>(initializeLayerPeer(map, coreLayer));
    jni::jobject* result = peerLayer->createJavaPeer(env);
    peerLayer.release();

    return result;
}

void registerNativeLayers(jni::JNIEnv& env) {
    BackgroundLayer::registerNative(env);
}

}
}