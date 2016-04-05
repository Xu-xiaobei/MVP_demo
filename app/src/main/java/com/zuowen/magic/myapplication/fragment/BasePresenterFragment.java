package com.zuowen.magic.myapplication.fragment;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.zuowen.magic.myapplication.view.View;

/**
 * Created by worm on 2016/3/24.
 */
@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public abstract class BasePresenterFragment<V extends View> extends Fragment {

    public V vu;


    /**
     * fragment初始化时候调用的方法
     *
     * @param savedInstanceState
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {


    }

    /**
     * 创建一个view
     *
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Override
    public android.view.View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        android.view.View view = null;
        try {
            vu = (V) getVuClass().newInstance();
            vu.init(inflater, container);
            onBindVu();
            view = vu.getView();

        } catch (Exception e) {
            e.printStackTrace();
        }


        return view;
    }

    @Override
    public void onDestroyView() {
        onDestroyVu();
        vu=null;
        super.onDestroyView();
    }

    private void onDestroyVu() {
    }

    /**
     * 绑定view
     */

    public void onBindVu() {
    }

    /**
     * 获取view对象
     * @return
     */
    public abstract Class<V> getVuClass();
}
