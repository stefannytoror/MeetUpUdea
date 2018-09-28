package com.example.galonsogomez.meetupudea;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class ShowGroupEventsFragment extends Fragment {


    public ShowGroupEventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //Get data from Activity
        Bundle b = getActivity().getIntent().getExtras();

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_show_group_events, container, false);
        return view;
    }

}
