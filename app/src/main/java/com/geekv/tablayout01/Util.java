package com.geekv.tablayout01;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hfl12 on 2016/2/11.
 */
public class Util {
    public static List<News> getList() {
        News news=new News();
        news.setTitle("第一次使用安卓手机");
        news.setContent("haha还是水水水水哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈");
        news.setView(R.drawable.aa111);
        List<News> list = new ArrayList<>();
        list.add(news);
        list.add(news);
        list.add(news);
        list.add(news);
        list.add(news);
        list.add(news);
        list.add(news);
        list.add(news);
        list.add(news);
        list.add(news);
        list.add(news);
        list.add(news);
        list.add(news);
        return list;
    }
}
