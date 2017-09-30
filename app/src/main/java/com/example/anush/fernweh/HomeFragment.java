package com.example.anush.fernweh;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by anush on 9/30/2017.
 */

public class HomeFragment extends Fragment {

    FragmentManager fragmentManager;
    Button goToAboutButton;

    View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.home_page, container, false);

        fragmentManager = getFragmentManager();



        return  myView;
    }
}
