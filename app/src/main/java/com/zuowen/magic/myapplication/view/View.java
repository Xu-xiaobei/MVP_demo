package com.zuowen.magic.myapplication.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by worm on 2016/3/18.
 */
public interface View {
    //初始化view
    public  void init(LayoutInflater inflater,ViewGroup container);
    //返回view对象
    public android.view.View getView();


}
