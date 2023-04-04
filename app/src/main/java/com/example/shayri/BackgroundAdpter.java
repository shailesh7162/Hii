package com.example.shayri;

import static com.example.shayri.Config.gradients;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class BackgroundAdpter extends BaseAdapter
{
    Context context;
    int gradiant[];


    public BackgroundAdpter(Context context, int[] gradients)
    {
        this.context=context;
        this.gradiant=gradients;
    }


    @Override
    public int getCount() {
        return gradiant.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        view= LayoutInflater.from(context).inflate(R.layout.grid_item_for_bottom,viewGroup,false);
        TextView textView = view.findViewById(R.id.item_for_bottom);
        textView.setBackgroundResource(gradiant[i]);
        return view;
    }
}
