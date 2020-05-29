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
public class Food extends Fragment {


    public Food() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_item, container, false);

        ArrayList<Tourist> tourists=new ArrayList<>();

        tourists.add(new Tourist(R.drawable.dalbati,getString(R.string.descr10),getString(R.string.name6),getString(R.string.jaipur)));
        tourists.add(new Tourist(R.drawable.kachori,getString(R.string.descr11),getString(R.string.name7),getString(R.string.jaipur)));
        tourists.add(new Tourist(R.drawable.kadhi,getString(R.string.descr12),getString(R.string.name8),getString(R.string.jaipur)));
        tourists.add(new Tourist(R.drawable.bajra,getString(R.string.descr13),getString(R.string.name9),getString(R.string.jaipur)));
        tourists.add(new Tourist(R.drawable.moong,getString(R.string.descr14),getString(R.string.name10),getString(R.string.jaipur)));



        JaipurAdapter adapter=new JaipurAdapter(getActivity(),tourists);
        ListView listView=(ListView)rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
