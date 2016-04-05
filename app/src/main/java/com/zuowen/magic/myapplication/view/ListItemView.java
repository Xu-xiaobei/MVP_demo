package com.zuowen.magic.myapplication.view;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zuowen.magic.myapplication.R;

/**
 * Created by worm on 2016/3/25.
 */
public class ListItemView implements View {
    public TextView textview;
    public android.view.View view;


    @Override
    public void init(LayoutInflater inflater, ViewGroup container) {
         view = inflater.inflate(R.layout.ipsum_list_item, container, false);
         textview = (TextView) view.findViewById(R.id.text);
    }

    @Override
    public android.view.View getView() {
        return view;
    }
    public void setTitle(String title) {
        textview.setText(title);

    }
}
