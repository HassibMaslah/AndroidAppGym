package com.example.hassi.myapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class MyAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Integer> idImage;
    private ArrayList<String> nameList;

    public MyAdapter(Context context, ArrayList<Integer> idImage, ArrayList<String> nameList) {
        this.context = context;
        this.idImage = idImage;
        this.nameList = nameList;
    }

    @Override
    public int getCount() {
        return nameList.size();
    }

    @Override
    public Object getItem(int i) {
        return nameList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null){
            view=View.inflate(context,R.layout.single_row,null);
        }
        ImageView images= (ImageView) view.findViewById(R.id.imageView);
        TextView text= (TextView) view.findViewById(R.id.textView);
        images.setImageResource(idImage.get(i));
        text.setText(nameList.get(i));
        return view;
    }
}
