package com.example.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class EarthquakeAdapter extends ArrayAdapter {

    public EarthquakeAdapter(Context context , List<Earthquake> earthquakes){
        super(context , 0 , earthquakes);
    }
    @Override
    public View getView(int position , View converView , ViewGroup parent){

        View listItemView = converView;

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item , parent , false);
        }
        Earthquake currentEarthQuake = (Earthquake) getItem(position);

        TextView magnitudeView = (TextView) listItemView.findViewById(R.id.magnitude);
        magnitudeView.setText(currentEarthQuake.getMagnitude());

        TextView locationView = (TextView) listItemView.findViewById(R.id.location);
        locationView.setText(currentEarthQuake.getLocation());

        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        dateView.setText(currentEarthQuake.getDate());

        return listItemView;

    }



}
