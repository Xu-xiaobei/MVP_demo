package com.zuowen.magic.myapplication.fragment;

import com.zuowen.magic.myapplication.ViewCallback;
import com.zuowen.magic.myapplication.adapter.ListAdapter;
import com.zuowen.magic.myapplication.view.ListView;

/**
 * Created by worm on 2016/3/24.
 */
public class ListFragment extends BasePresenterFragment<ListView>{


   ListAdapter adapter= new ListAdapter();

   ViewCallback<Integer> selectCallback= new ViewCallback<Integer>() {
       @Override
       public void execute(Integer result) {

       }
   };

    @Override
    public void onBindVu() {
        super.onBindVu();
        vu.setListAdapter(adapter);
        vu.selectCallback(selectCallback);
    }

    @Override
    public Class<ListView> getVuClass() {
        return ListView.class;
    }

    /**
     * 实例化当前对象
     * @return
     */
    public static ListFragment newInstance(){
        return  new ListFragment();
    }
}
