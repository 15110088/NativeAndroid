package com.nativeandroid.mapmodule;

import androidx.annotation.NonNull;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

public class MapVIewCustom extends SimpleViewManager<mapv2> {
    @NonNull
    @Override
    public String getName() {
        return "MapArcgisViewAndroid";
    }

    @NonNull
    @Override
    protected mapv2 createViewInstance(@NonNull ThemedReactContext reactContext) {
        return new mapv2(reactContext);
    }
}
