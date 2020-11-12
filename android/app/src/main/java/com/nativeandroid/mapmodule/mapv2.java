package com.nativeandroid.mapmodule;

import android.content.Context;
import android.widget.LinearLayout;

import com.esri.arcgisruntime.data.ServiceFeatureTable;
import com.esri.arcgisruntime.layers.FeatureLayer;
import com.esri.arcgisruntime.mapping.ArcGISMap;
import com.esri.arcgisruntime.mapping.Basemap;
import com.esri.arcgisruntime.mapping.view.LocationDisplay;
import com.esri.arcgisruntime.mapping.view.MapView;
import com.nativeandroid.R;

public class mapv2 extends LinearLayout {

    // Variable Arcgis
    private MapView mMapView;
    private ArcGISMap map;
    private ServiceFeatureTable mServiceFeatureTable;
    private FeatureLayer mFeatureLayer;
    private ServiceFeatureTable mServiceFeatureTableMauQH;
    private FeatureLayer mFeatureLayerMauQH;
    private LocationDisplay lDisplayManager;
    private LocationDisplay mLocationDisplay;
    Basemap.Type basemapType;
    //
    private Context context;

    public mapv2(Context context) {
        super(context);//ADD THIS
        this.context = context;
//        LinearLayout liner=new LinearLayout(this);
//        Button btn=new Button(this);
//        btn.setText("!2321");
//         this.setContentView(liner,new LinearLayout.LayoutParams(Constraints.LayoutParams.MATCH_PARENT,Constraints.LayoutParams.MATCH_PARENT));
//        liner.addView(btn);
        init();

    }

    public void init() {
        inflate(context, R.layout.activity_map, this);

        //setupMap();
    }
    private void setupMap() {
//        ArcGISRuntimeEnvironment.setLicense("runtimelite,1000,rud6806025350,none,1JPJD4SZ8Y4DRJE15232");
//        mMapView = findViewById(R.id.mapView);
//        if (mMapView != null) {
//            basemapType = Basemap.Type.OPEN_STREET_MAP;
//            double latitude =  10.890587;
//            double longitude = 106.922532;
//            int levelOfDetail = 11;
//            map = new ArcGISMap(basemapType, latitude, longitude, levelOfDetail);
//            // ArcGISMap map = new ArcGISMap(SpatialReference.create(3857));
//            // mMapView.setMap(map);
//        }
    }

}
