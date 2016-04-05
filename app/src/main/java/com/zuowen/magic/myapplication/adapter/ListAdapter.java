package com.zuowen.magic.myapplication.adapter;

import com.zuowen.magic.myapplication.bean.Content;
import com.zuowen.magic.myapplication.view.ListItemView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by worm on 2016/3/25.
 */
public class ListAdapter extends BasePresenterAdapter <ListItemView>{

   List<String> titles= new ArrayList<String>(Content.VALUE_MAP.keySet());
    @Override
    public void onBindListItemVu(int position) {
        String title = titles.get(position);
        vu.setTitle(title);
    }

    @Override
    public Class<ListItemView> getVuClass() {
        return ListItemView.class;
    }

    @Override
    public int getCount() {
        return titles.size();
    }

    @Override
    public Object getItem(int position) {
        return titles.get(position);
    }

    public String getTitle(int postion) {
      return (String) getItem(postion);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}
