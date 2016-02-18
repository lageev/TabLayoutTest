package com.geekv.tablayout01.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.geekv.tablayout01.News;
import com.geekv.tablayout01.R;

import java.util.List;

/**
 * Created by hfl12 on 2016/2/11.
 */
public class MyAdapter extends BaseAdapter {
    Context context;
    List<News> list;
    LayoutInflater inflater;
    public MyAdapter(Context context,List<News> news){
        super();
        this.context = context;
        this.list=news;
        inflater = (LayoutInflater)
                context.getSystemService(
                        Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh = null;
        if(convertView == null){
            convertView = inflater.inflate(R.layout.item01, parent,false);
            vh = new ViewHolder();
            vh.tv_t = (TextView) convertView.findViewById(R.id.tv_title);
            vh.iv = (ImageView) convertView.findViewById(R.id.iv_news);
            vh.tv_c= (TextView) convertView.findViewById(R.id.tv_content);
            convertView.setTag(vh);
        }else{
            vh = (ViewHolder) convertView.getTag();
        }
        News news= (News) getItem(position);
        vh.iv.setImageResource(news.getView());
        vh.tv_t.setText(news.getTitle());
        vh.tv_c.setText(news.getContent());

        return convertView;
    }
    private class ViewHolder{
        //item的布局
        ImageView iv;
        TextView tv_t;
        TextView tv_c;
    }
}
