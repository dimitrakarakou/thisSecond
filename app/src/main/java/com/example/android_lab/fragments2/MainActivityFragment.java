package com.example.android_lab.fragments2;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    //Constructor, Δομητής
    public MainActivityFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {



        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        ListView lv = (ListView) rootView.findViewById(R.id.listView);

        String []array = {"Enotita 1", "Enotita 2", "Enotita 3", "Enotita 4", "Enotita 5", "Enotita 6"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, array);

        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                        SecondFragment secondfrag = new SecondFragment();


                        Bundle addInfo = new Bundle();
                        addInfo.putString("message", "Hello from 1rst fragment \n \n Hello Again");
                        secondfrag.setArguments(addInfo);
                        getFragmentManager().beginTransaction().replace(R.id.fragment, secondfrag).commit();


                }
            }
        });


        return rootView;
    }
}
