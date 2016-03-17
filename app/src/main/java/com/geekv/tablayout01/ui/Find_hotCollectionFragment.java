package com.geekv.tablayout01.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.geekv.tablayout01.R;
import com.geekv.tablayout01.Util;
import com.geekv.tablayout01.adapter.MyAdapter;
import com.geekv.tablayout01.ui.BaseFragment;
import com.github.ksoichiro.android.observablescrollview.ObservableListView;
import com.github.ksoichiro.android.observablescrollview.ObservableScrollViewCallbacks;

/**
 * Created by hfl12 on 2016/1/27.
 */

public class Find_hotCollectionFragment extends Fragment {
    private MyAdapter adapter;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.a, null);
        initView(view);
        return view;
}

    private void initView(View view) {
        ListView lsv= (ListView)view.findViewById(R.id.rclv);
        lsv.setAdapter(new MyAdapter(getActivity(),Util.getList()));

    }
}
