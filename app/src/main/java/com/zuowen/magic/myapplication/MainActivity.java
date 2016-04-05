package com.zuowen.magic.myapplication;


import android.annotation.TargetApi;
import android.os.Build;

import com.zuowen.magic.myapplication.base.BasePresenterActivity;
import com.zuowen.magic.myapplication.fragment.ListFragment;
import com.zuowen.magic.myapplication.view.MainView;


public class MainActivity extends BasePresenterActivity<MainView> {
    /**
     * 绑定数据
     */
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    protected void onBindVu() {
        super.onBindVu();
        //第一个参数表示替换内容的ID
        fm.beginTransaction().replace(vu.getContentId(), ListFragment.newInstance()).commit();
    }

    /**
     * 处理业务逻辑
     */
    @Override
    public void beforeOnPause() {
        super.beforeOnPause();
        bus.unregister(this);
    }
    /**
     * 处理业务逻辑
     */
    @Override
    public void afterOnResume() {
        super.afterOnResume();
        bus.registerSticky(this);
    }


    @Override
    protected Class<MainView> getVuClass() {
        return MainView.class;
    }
}
