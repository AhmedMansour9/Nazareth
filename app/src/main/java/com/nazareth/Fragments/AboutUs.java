package com.nazareth.Fragments;


import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nazareth.NavigationDrawer;
import com.nazareth.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AboutUs extends Fragment {


    public AboutUs() {
        // Required empty public constructor
    }
    View view;
    @BindView(R.id.toolbar)
    Toolbar toolbar;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_about_us, container, false);
        ButterKnife.bind(this,view);
        NavigationDrawer navigationDrawer=new NavigationDrawer(getActivity());
        navigationDrawer.Navigation(toolbar);


        return view;
    }

}
