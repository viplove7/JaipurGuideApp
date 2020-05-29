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
public class Festival extends Fragment {


    public Festival() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_item, container, false);

        ArrayList<Tourist> tourists=new ArrayList<>();

        tourists.add(new Tourist(R.drawable.elephant,getString(R.string.descr5),getString(R.string.name1),getString(R.string.jaipur)));
        tourists.add(new Tourist(R.drawable.teej,getString(R.string.descr6),getString(R.string.name2),getString(R.string.jaipur)));
        tourists.add(new Tourist(R.drawable.kite,getString(R.string.descr7),getString(R.string.name3),getString(R.string.jaipur)));
        tourists.add(new Tourist(R.drawable.jlf,getString(R.string.descr8),getString(R.string.name4),getString(R.string.jaipur)));
        tourists.add(new Tourist(R.drawable.film,getString(R.string.descr9),getString(R.string.name5),getString(R.string.jaipur)));



        JaipurAdapter adapter=new JaipurAdapter(getActivity(),tourists);
        ListView listView=(ListView)rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
