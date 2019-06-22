package com.example.weather;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class adapter extends ArrayAdapter<mode> {
    public adapter( Context context, ArrayList<mode> arrayList) {

        super(context, 0, arrayList);
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        View listview=convertView;
        if(listview == null)
        {
            listview= LayoutInflater.from(getContext()).inflate(R.layout.item_listview,parent,false);

        }
        mode m=getItem(position);
        TextView textView_descripdle=listview.findViewById(R.id.weather);
        textView_descripdle.setText(m.getDescription());
        TextView speend=listview.findViewById(R.id.wind);
        speend.setText(m.getSpeend()+"");
        TextView snow=listview.findViewById(R.id.snow);
        snow.setText(m.getH()+"");





        return listview;
    }
}
