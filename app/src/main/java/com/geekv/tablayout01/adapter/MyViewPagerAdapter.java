package com.geekv.tablayout01.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.geekv.tablayout01.Find_hotCollectionFragment;
import com.geekv.tablayout01.Find_hotFragment;
import com.geekv.tablayout01.Find_hotMonthFragment;
import com.geekv.tablayout01.Find_hotRecommendFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hfl12 on 2016/1/28.
 */
 public class MyViewPagerAdapter extends FragmentPagerAdapter {
    List<Fragment> fragments;

    public MyViewPagerAdapter(FragmentManager fm) {
        super(fm);
        //初始化fragments
        fragments = new ArrayList<Fragment>();
        fragments.add(new Find_hotCollectionFragment());
        fragments.add(new Find_hotRecommendFragment());
        fragments.add(new Find_hotMonthFragment());
        fragments.add(new Find_hotFragment());
    }

    @Override
    public Fragment getItem(int arg0) {
        return fragments.get(arg0);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

}