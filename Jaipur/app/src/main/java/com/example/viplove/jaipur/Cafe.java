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
public class Cafe extends Fragment {


    public Cafe() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_item, container, false);

        ArrayList<Tourist> tourists=new ArrayList<>();

        tourists.add(new Tourist(R.drawable.nibs,getString(R.string.nibs1),getString(R.string.Nibs),getString(R.string.Malviya)));
        tourists.add(new Tourist(R.drawable.loft18, getString(R.string.descr1),getString(R.string.Loft18),getString(R.string.Raja)));
        tourists.add(new Tourist(R.drawable.kalei,getString(R.string.descr2),getString(R.string.Kaleidoscope),getString(R.string.C)));
        tourists.add(new Tourist(R.drawable.brownsugar,getString(R.string.descr3),getString(R.string.Brown),getString(R.string.Malviya)));
        tourists.add(new Tourist(R.drawable.kafka,getString(R.string.descr4),getString(R.string.Kafka),getString(R.string.tonk)));





        JaipurAdapter adapter=new JaipurAdapter(getActivity(),tourists);
        ListView listView=(ListView)rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
