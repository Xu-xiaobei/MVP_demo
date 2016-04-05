package com.zuowen.magic.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.zuowen.magic.myapplication.view.View;

/**
 * Created by worm on 2016/3/24.
 */
public  abstract  class BasePresenterAdapter<V extends View> extends BaseAdapter {

    public V vu;
    private V vuClass;
    @Override
    public android.view.View getView(int position, android.view.View convertView, ViewGroup parent) {
        if(convertView==null){
            //获取填充布局
            LayoutInflater inflater = (LayoutInflater)parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            try {
                vu= (V) getVuClass().newInstance();
                //初始化view
                vu.init(inflater,parent);
                //获取当前view
                convertView= vu.getView();
                convertView.setTag(vu);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }else{
           vu= (V) convertView.getTag();
        }
        if(convertView!=null){
            //绑定数据
            onBindListItemVu(position);
        }
        return convertView;
    }

    public abstract void onBindListItemVu(int position);


    public abstract Class<V> getVuClass();
}
