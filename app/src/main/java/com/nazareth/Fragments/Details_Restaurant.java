package com.nazareth.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nazareth.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Details_Restaurant extends Fragment {


    public Details_Restaurant() {
        // Required empty public constructor
    }

    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_details__restaurant, container, false);


        return view;
    }

}
