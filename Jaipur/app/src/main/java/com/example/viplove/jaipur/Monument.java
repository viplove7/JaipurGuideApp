package com.example.viplove.jaipur;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Monument extends Fragment {


    public Monument() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_item, container, false);

        ArrayList<Tourist> tourists=new ArrayList<>();

        tourists.add(new Tourist(R.drawable.hawa,getString(R.string.descr15),getString(R.string.name11),getString(R.string.location1)));
        tourists.add(new Tourist(R.drawable.albert,getString(R.string.descr16),getString(R.string.name12),getString(R.string.location2)));
        tourists.add(new Tourist(R.drawable.naha,getString(R.string.descr17),getString(R.string.name13),getString(R.string.location3)));
        tourists.add(new Tourist(R.drawable.jai,getString(R.string.descr18),getString(R.string.name14),getString(R.string.location4)));
        tourists.add(new Tourist(R.drawable.stepwell,getString(R.string.descr19),getString(R.string.name15),getString(R.string.location5)));



        JaipurAdapter adapter=new JaipurAdapter(getActivity(),tourists);
        ListView listView=(ListView)rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
