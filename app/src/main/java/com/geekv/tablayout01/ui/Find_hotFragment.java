package com.geekv.tablayout01.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
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
public class Find_hotFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.b, null);
        initView(view);
        return view;
    }

    private void initView(View view) {
        ListView listView= (ListView) view.findViewById(R.id.rclv);
        MyAdapter adapter = new MyAdapter(getActivity(),
                Util.getList());
        listView.setAdapter(adapter);

        }
    }