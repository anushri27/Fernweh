package com.example.anush.fernweh;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;

/**
 * Created by anush on 9/30/2017.
 */

public class MyDestinationFragment extends Fragment implements OnMapReadyCallback {

    GoogleMap nGoogleMap;
    MapView nMapView;
    View nView;

    View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.my_destinations, container, false);
        return  myView;
    }



    @Override
    public void onMapReady(GoogleMap googleMap) {

    }
}
