package com.example.viplove.jaipur;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class JaipurAdapter extends ArrayAdapter<Tourist> {


    private int[] colors = new int[]{0x30FF0000, 0x300000FF};
    public JaipurAdapter(Context context, ArrayList<Tourist> tourist){
        super(context,0,tourist);
    }
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.display_item, parent, false);

        }
       Tourist currenttourist=getItem(position);

        int colorPos = position % colors.length;
        listItemView.setBackgroundColor(colors[colorPos]);

        ImageView imageView=(ImageView)listItemView.findViewById(R.id.image);
        imageView.setImageResource(currenttourist.getImage());

        TextView name=(TextView)listItemView.findViewById(R.id.name);
        name.setText(currenttourist.getName());

        TextView location=(TextView)listItemView.findViewById(R.id.location);
        location.setText(currenttourist.getLocation());

        TextView description=(TextView)listItemView.findViewById(R.id.description);
        description.setText(currenttourist.getDescription());

        return listItemView;

    }
}
