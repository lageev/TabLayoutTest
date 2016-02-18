package com.geekv.tablayout01;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.geekv.tablayout01.adapter.MyAdapter;

/**
 * Created by hfl12 on 2016/1/27.
 */

public class Find_hotCollectionFragment extends Fragment {
    private ListView lsv;
    private MyAdapter adapter;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.a, null);
        initView(view);
        return view;
}

    private void initView(View view) {
        lsv= (ListView) view.findViewById(R.id.lsv);
        adapter=new MyAdapter(getActivity(),
                Util.getList());
        lsv.setAdapter(adapter);
    }
}
