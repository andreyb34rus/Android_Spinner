package com.example.spinner_with_pictures;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyCustomAdapter extends ArrayAdapter {

    private final LayoutInflater mInflater;
    private final Context mContext;
    private final int mResource;
    private String[] auto_list;
    private Integer[] auto_logo = {R.drawable.bmv, R.drawable.mersedes, R.drawable.audi, R.drawable.ford};

    public MyCustomAdapter(Context context, int textViewResourceId, String[] objects) {
        super(context, textViewResourceId, objects);
        auto_list = objects;
        mContext = context;
        mInflater = LayoutInflater.from(context);
        mResource = textViewResourceId;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {

        return getCustomView(position, convertView, parent);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        return getCustomView(position, convertView, parent);
    }

    public View getCustomView(int position, View convertView, ViewGroup parent) {

        View row =  mInflater.inflate(R.layout.row, parent, false);
        TextView label = row.findViewById(R.id.text_view);
        label.setText( auto_list[position]);

        ImageView icon = row.findViewById(R.id.image_view);
         icon.setImageResource(auto_logo[position]);
         return row;
    }
}

