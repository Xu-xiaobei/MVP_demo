package com.zuowen.magic.myapplication.base;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;

import com.zuowen.magic.myapplication.view.MainView;
import com.zuowen.magic.myapplication.view.View;

import de.greenrobot.event.EventBus;

/**
 * Created by worm on 2016/3/18.
 */
public abstract class BasePresenterActivity<V extends View> extends Activity {
    protected V vu;
    protected  FragmentManager fm;
    public   EventBus bus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            //获取到fragmentmanager
             fm = getFragmentManager();
            //获取到EventBus 主要作用用来解耦
            bus=EventBus.getDefault();

            vu= (V) getVuClass().newInstance();
            //初始化view
            vu.init(getLayoutInflater(),null);
            setContentView(vu.getView());
            //绑定数据
            onBindVu();
        } catch (Exception e) {
            e.printStackTrace();
        }



    }

    /**
     * 绑定数据
     */
    protected  void onBindVu(){

    }

    /**
     * 可编辑
     */
    @Override
    protected final void onResume() {
        afterOnResume();
        super.onResume();
    }

    public void afterOnResume() {
    }


    /**
     * 不可编辑
     */
    @Override
    protected final void onPause() {
        beforeOnPause();
        super.onPause();
    }

    public void beforeOnPause() {
    }


    /**
     * 返回当前的View的对象
     * @return
     */
    protected abstract Class<MainView> getVuClass();
}
