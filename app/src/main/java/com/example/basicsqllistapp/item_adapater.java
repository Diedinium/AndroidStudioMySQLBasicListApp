package com.example.basicsqllistapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class item_adapater extends BaseAdapter {

    LayoutInflater mInflator;
    Map<String, String> map;
    List<String> title;
    List<String> date;

    public item_adapater(Context c, Map m) {
        mInflator = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        map = m;
        title = new ArrayList<String>(map.keySet());
        date = new ArrayList<String>(map.keySet());
    }

    @Override
    public int getCount() {
        return map.size();
    }

    @Override
    public Object getItem(int position) {
        return title.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = mInflator.inflate(R.layout.item_layout, null);
        TextView titleTextView = v.findViewById(R.id.titleTextView);
        TextView dateTextView = v.findViewById(R.id.dateTextView);

        titleTextView.setText(title.get(position));
        dateTextView.setText(date.get(position));

        return v;
    }
}
