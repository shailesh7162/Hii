package com.example.shayri;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class emoji_Adapter extends BaseAdapter
{
    MainActivity3 mainActivity3;
    String[] colours;
    String type;

    public emoji_Adapter(MainActivity3 mainActivity3, String[] colours, String type) {
        this.mainActivity3=mainActivity3;
        this.colours=colours;
        this.type=type;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
