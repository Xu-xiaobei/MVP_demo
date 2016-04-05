package com.zuowen.magic.myapplication.view;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.zuowen.magic.myapplication.R;

/**
 * 主要实现当前的view
 * Created by worm on 2016/3/18.
 */
public class MainView implements View {

    public android.view.View view;
    public TextView tv;
    private FrameLayout content;
    /**
     *初始化View
     * @param inflater
     * @param container
     */
    @Override
    public void init(LayoutInflater inflater, ViewGroup container) {
       view= inflater.inflate(R.layout.activity_main,container,false);
        content=(FrameLayout) view.findViewById(R.id.content);


    }
 public int getContentId(){
     return  content.getId();
 }
    /**
     * 返回view
     * @return
     */

    @Override
    public android.view.View getView() {
        return view;
    }
}
