package com.example.android_lab.fragments2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {


    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_second, container, false);

        String message = getArguments().getString("message");
        String message2 = getArguments().getString("message2");

        TextView txt = (TextView)rootView.findViewById(R.id.text2Frag);
        txt.setText(message);

        TextView txtLarge = (TextView) rootView.findViewById(R.id.text2LargeFrag);
        txtLarge.setText(message2);


        return rootView;
    }

}
