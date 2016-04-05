package com.zuowen.magic.myapplication.view;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.zuowen.magic.myapplication.R;
import com.zuowen.magic.myapplication.ViewCallback;

/**
 * Created by worm on 2016/3/25.
 */
public class ListView implements View {
    private android.widget.ListView listview;
    private android.view.View view;
    public ViewCallback<Integer> selectCallback;
    @Override
    public void init(LayoutInflater inflater, ViewGroup container) {
      view = inflater.inflate(R.layout.list, container, false);
        listview=(android.widget.ListView)  view.findViewById(R.id.listview);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, android.view.View view, int position, long id) {
                if(selectCallback!=null){
                    selectCallback.execute(position);
                }
            }
        });
    }

    @Override
    public android.view.View getView() {
        return null;
    }

   public void setListAdapter(ListAdapter adapter) {
       listview.setAdapter(adapter);
    }


    public void selectCallback(ViewCallback<Integer> selectCallback) {

    }
}
